package com.example.myapplication.floating

import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.graphics.PixelFormat
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.ScriptApp
import com.example.myapplication.engine.HeartbeatManager
import com.example.myapplication.engine.NetworkChecker
import com.example.myapplication.engine.PermissionChecker
import com.example.myapplication.engine.ScriptEngine
import com.example.myapplication.engine.ScriptLogger
import com.example.myapplication.engine.ScriptRestartHelper
import com.example.myapplication.script.GameScript
import com.example.myapplication.screencap.ScreenShoterV3

/**
 * 悬浮窗服务 - 横向展开式图标条（对齐按键精灵风格）
 *
 * 布局结构：
 *   [主图标(收起态)] ← 点击/拖拽
 *   [运行] [设置/停止] [信息] [退出] ← 展开态横向工具条
 *
 * 业务逻辑（对齐按键精灵源码）：
 * - 运行按钮：空闲→启动脚本，运行中→暂停，暂停中→恢复
 * - 设置/停止按钮：空闲时跳转主界面设置，运行/暂停时停止脚本
 * - 信息按钮：显示当前脚本状态 Toast
 * - 退出按钮：停止脚本 + 关闭悬浮窗 + 停止服务
 * - 防连点：1秒内不响应重复点击
 * - 自动收起：展开后 5 秒无操作自动收起
 */
class FloatingWindowService : Service() {

    companion object {
        const val TAG = "FloatingWindowService"
        const val NOTIFICATION_ID = 1001

        const val ACTION_SHOW = "action_show"
        const val ACTION_HIDE = "action_hide"
        const val ACTION_TOGGLE = "action_toggle"
        const val ACTION_UPDATE_STATE = "action_update_state"

        /** 广播：请求主界面启动脚本（需要截图权限时） */
        const val BROADCAST_REQUEST_START = "com.example.myapplication.FLOATING_REQUEST_START"
        /** 广播：脚本状态变化通知 */
        const val BROADCAST_STATE_CHANGED = "com.example.myapplication.SCRIPT_STATE_CHANGED"

        /** 防连点间隔 ms */
        private const val CLICK_INTERVAL = 1000L
        /** 自动收起延迟 ms */
        private const val AUTO_COLLAPSE_DELAY = 5000L

        fun start(context: Context) {
            val intent = Intent(context, FloatingWindowService::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(intent)
            } else {
                context.startService(intent)
            }
        }

        fun stop(context: Context) {
            context.stopService(Intent(context, FloatingWindowService::class.java))
        }
    }

    private var windowManager: WindowManager? = null
    private var floatingView: View? = null
    private var isShowing = false
    private var isExpanded = false

    // 引擎和脚本（同进程直接引用）
    private var scriptEngine: ScriptEngine? = null
    private var gameScript: GameScript? = null

    // 心跳 & 自动重启
    private var heartbeatManager: HeartbeatManager? = null
    private var restartHelper: ScriptRestartHelper? = null

    // UI 引用
    private var expandedBar: LinearLayout? = null
    private var btnRun: TextView? = null
    private var btnRunLabel: TextView? = null
    private var btnSetting: TextView? = null
    private var btnSettingLabel: TextView? = null
    private var btnCollapse: TextView? = null

    // 防连点
    private var lastClickTime = 0L

    // 自动收起
    private val handler = Handler(Looper.getMainLooper())
    private val autoCollapseRunnable = Runnable { collapseBar() }

    private val stateReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            updateUI()
        }
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "FloatingWindowService created")
        startForeground(NOTIFICATION_ID, createNotification())
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
        scriptEngine = ScriptEngine(this)
        gameScript = GameScript(this)

        // 初始化心跳管理器
        heartbeatManager = HeartbeatManager(this, scriptEngine!!).apply {
            setOnScriptDead {
                // 脚本卡死，触发自动重启
                Log.w(TAG, "Script dead detected, requesting restart")
                scriptEngine?.stopAndReset()
                restartHelper?.requestRestart("脚本无响应超时")
                updateUI()
            }
            setOnHeartbeatFailed { failures ->
                ScriptLogger.log("W", TAG, "心跳失败 #$failures")
            }
        }

        // 初始化自动重启助手
        restartHelper = ScriptRestartHelper(this, scriptEngine!!).apply {
            setScriptBlock { gameScript!!.execute(scriptEngine!!) }
        }

        val filter = IntentFilter(BROADCAST_STATE_CHANGED)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(stateReceiver, filter, RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(stateReceiver, filter)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_HIDE -> hideFloatingWindow()
            ACTION_TOGGLE -> {
                if (isShowing) hideFloatingWindow() else showFloatingWindow()
            }
            ACTION_UPDATE_STATE -> updateUI()
            else -> showFloatingWindow()
        }
        return START_STICKY
    }

    override fun onDestroy() {
        hideFloatingWindow()
        handler.removeCallbacks(autoCollapseRunnable)
        heartbeatManager?.stop()
        restartHelper?.disable()
        scriptEngine?.release()
        try { unregisterReceiver(stateReceiver) } catch (_: Exception) {}
        super.onDestroy()
    }

    // ==================== 悬浮窗显示/隐藏 ====================

    private fun showFloatingWindow() {
        if (isShowing) return

        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
            else
                @Suppress("DEPRECATION")
                WindowManager.LayoutParams.TYPE_PHONE,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.TOP or Gravity.START
            x = 0
            y = 300
        }

        floatingView = createFloatingView()
        setupDrag(floatingView!!, params)

        try {
            windowManager?.addView(floatingView, params)
            isShowing = true
        } catch (e: Exception) {
            Log.e(TAG, "Failed to add floating view", e)
        }
    }

    private fun hideFloatingWindow() {
        if (!isShowing) return
        try {
            floatingView?.let { windowManager?.removeView(it) }
        } catch (_: Exception) {}
        floatingView = null
        isShowing = false
    }

    // ==================== 创建横向展开式悬浮窗 ====================

    private fun createFloatingView(): View {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }

        // 收起状态的主图标（点击展开/收起）
        btnCollapse = createCircleButton("▶", COLOR_GREEN, 48).apply {
            setOnClickListener { onCollapseClicked() }
        }

        // 展开后的横向工具条
        expandedBar = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            val bg = GradientDrawable().apply {
                setColor(0xE6222222.toInt())
                cornerRadius = 26f
            }
            background = bg
            setPadding(dp(8), dp(6), dp(8), dp(6))
            visibility = View.GONE
        }

        // === 运行按钮（图标 + 文字） ===
        val runGroup = createButtonGroup("▶", "运行", COLOR_GREEN).also { (icon, label) ->
            btnRun = icon
            btnRunLabel = label
        }
        val runContainer = wrapButtonGroup(runGroup.first, runGroup.second) {
            onRunClicked()
        }

        // === 设置/停止按钮 ===
        val settingGroup = createButtonGroup("⚙", "设置", COLOR_BLUE).also { (icon, label) ->
            btnSetting = icon
            btnSettingLabel = label
        }
        val settingContainer = wrapButtonGroup(settingGroup.first, settingGroup.second) {
            onSettingClicked()
        }

        // === 信息按钮 ===
        val infoGroup = createButtonGroup("ℹ", "信息", COLOR_GRAY)
        val infoContainer = wrapButtonGroup(infoGroup.first, infoGroup.second) {
            onInfoClicked()
        }

        // === 退出按钮 ===
        val exitGroup = createButtonGroup("✕", "退出", COLOR_RED)
        val exitContainer = wrapButtonGroup(exitGroup.first, exitGroup.second) {
            onExitClicked()
        }

        expandedBar!!.addView(runContainer, marginLayoutParams(4))
        expandedBar!!.addView(settingContainer, marginLayoutParams(4))
        expandedBar!!.addView(infoContainer, marginLayoutParams(4))
        expandedBar!!.addView(exitContainer, marginLayoutParams(4))

        root.addView(btnCollapse)
        root.addView(expandedBar)

        updateUI()
        return root
    }

    /** 创建按钮组：圆形图标 + 下方文字标签 */
    private fun createButtonGroup(iconText: String, labelText: String, bgColor: Int): Pair<TextView, TextView> {
        val icon = createCircleButton(iconText, bgColor, 36)
        val label = TextView(this).apply {
            text = labelText
            textSize = 10f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }
        return Pair(icon, label)
    }

    /** 将图标和标签包装成一个可点击的竖向容器 */
    private fun wrapButtonGroup(icon: TextView, label: TextView, onClick: () -> Unit): LinearLayout {
        return LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            addView(icon)
            addView(label, LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply { topMargin = dp(2) })
            setOnClickListener { onClick() }
            // 让子 View 也能响应点击
            icon.setOnClickListener { onClick() }
            label.setOnClickListener { onClick() }
        }
    }

    /** 创建圆形文字按钮 */
    private fun createCircleButton(text: String, bgColor: Int, sizeDp: Int): TextView {
        val sizePx = dp(sizeDp)
        return TextView(this).apply {
            this.text = text
            textSize = sizeDp * 0.36f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            val bgDrawable = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(bgColor)
            }
            background = bgDrawable
            layoutParams = LinearLayout.LayoutParams(sizePx, sizePx)
        }
    }

    private fun marginLayoutParams(marginDp: Int): LinearLayout.LayoutParams {
        val px = dp(marginDp)
        return LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            setMargins(px, 0, px, 0)
        }
    }

    private fun dp(value: Int): Int = (value * resources.displayMetrics.density).toInt()

    // ==================== 展开/收起 ====================

    private fun onCollapseClicked() {
        if (isExpanded) {
            collapseBar()
        } else {
            expandBar()
        }
    }

    private fun expandBar() {
        isExpanded = true
        expandedBar?.visibility = View.VISIBLE
        btnCollapse?.text = "◀"
        resetAutoCollapse()
    }

    private fun collapseBar() {
        isExpanded = false
        expandedBar?.visibility = View.GONE
        btnCollapse?.text = "▶"
        handler.removeCallbacks(autoCollapseRunnable)
        // 收起时同步主图标颜色
        updateCollapseIconColor()
    }

    /** 重置自动收起计时器 */
    private fun resetAutoCollapse() {
        handler.removeCallbacks(autoCollapseRunnable)
        handler.postDelayed(autoCollapseRunnable, AUTO_COLLAPSE_DELAY)
    }

    // ==================== 按钮事件（对齐按键精灵业务逻辑） ====================

    /** 防连点检查 */
    private fun checkClickInterval(): Boolean {
        val now = System.currentTimeMillis()
        if (now - lastClickTime < CLICK_INTERVAL) return false
        lastClickTime = now
        return true
    }

    /**
     * 运行按钮逻辑（对齐按键精灵 ElfinFloatView.onClick → floatview_linearlayout_run）：
     * - IDLE/STOPPED → 检查是否已在运行，未运行则启动脚本
     * - RUNNING → 暂停脚本（调用 engine.pause，对应 C3951hi.OooO()）
     * - PAUSED → 恢复脚本（调用 engine.resume，对应 C3951hi.OooOo0o()）
     */
    private fun onRunClicked() {
        if (!checkClickInterval()) return
        resetAutoCollapse()

        val engine = scriptEngine ?: return
        when (engine.getState()) {
            ScriptEngine.State.RUNNING -> {
                // 对齐按键精灵：运行中点击 → 暂停
                engine.pause()
                updateUI()
                Toast.makeText(this, "脚本已暂停", Toast.LENGTH_SHORT).show()
            }
            ScriptEngine.State.PAUSED -> {
                // 对齐按键精灵：暂停中点击 → 恢复
                engine.resume()
                updateUI()
                Toast.makeText(this, "脚本继续运行", Toast.LENGTH_SHORT).show()
            }
            ScriptEngine.State.IDLE, ScriptEngine.State.STOPPED -> {
                if (!ScreenShoterV3.getInstance().isInited()) {
                    // 截图服务未就绪，通知主界面请求权限
                    val intent = Intent(BROADCAST_REQUEST_START).apply {
                        setPackage(packageName)
                    }
                    sendBroadcast(intent)
                    Toast.makeText(this, "请在主界面授权截图权限", Toast.LENGTH_SHORT).show()
                    return
                }
                startScript()
            }
        }
    }

    /**
     * 设置/停止按钮逻辑（对齐按键精灵 ElfinFloatView.onClick → floatview_linearlayout_setting）：
     * - 脚本运行中(state==2)或暂停中(state==3) → 停止脚本（调用 Oooo0o0() → C3951hi.OooOo0()）
     * - 脚本空闲(state==0/1) → 跳转主界面（设置）
     */
    private fun onSettingClicked() {
        if (!checkClickInterval()) return
        resetAutoCollapse()

        val engine = scriptEngine ?: return
        when (engine.getState()) {
            ScriptEngine.State.RUNNING, ScriptEngine.State.PAUSED -> {
                // 对齐按键精灵：运行中/暂停中 → 停止引擎
                // 按键精灵 onStopScript 回调将状态重置为 1(IDLE)，而非 4(STOPPED)
                heartbeatManager?.stop()
                restartHelper?.disable()
                engine.stopAndReset()
                updateUI()
                ScriptLogger.log("I", TAG, "用户停止脚本")
                Toast.makeText(this, "脚本停止运行！", Toast.LENGTH_SHORT).show()
            }
            else -> {
                // 对齐按键精灵：空闲 → 跳转设置
                // 如果脚本未在运行状态，提示（对齐 "脚本未在运行状态！"）
                val intent = Intent(this, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
                }
                startActivity(intent)
            }
        }
    }

    /** 信息按钮（对齐按键精灵 floatview_linearlayout_info）：显示当前引擎状态和脚本信息 */
    private fun onInfoClicked() {
        resetAutoCollapse()

        val state = scriptEngine?.getState() ?: ScriptEngine.State.IDLE
        val stateText = when (state) {
            ScriptEngine.State.IDLE -> "空闲（等待启动）"
            ScriptEngine.State.RUNNING -> "脚本正在运行中……"
            ScriptEngine.State.PAUSED -> "脚本已暂停"
            ScriptEngine.State.STOPPED -> "脚本停止运行！"
        }
        Toast.makeText(this, stateText, Toast.LENGTH_SHORT).show()
    }

    /** 退出按钮（对齐按键精灵 floatview_linearlayout_exit）：停止脚本 + 关闭悬浮窗 + 停止服务 */
    private fun onExitClicked() {
        if (!checkClickInterval()) return
        heartbeatManager?.stop()
        restartHelper?.disable()
        scriptEngine?.stopAndReset()
        hideFloatingWindow()
        stopSelf()
    }

    private fun startScript() {
        val engine = scriptEngine ?: return
        val gs = gameScript ?: return

        // 对齐按键精灵：如果已在运行，提示并返回
        if (engine.getState() == ScriptEngine.State.RUNNING) {
            Toast.makeText(this, "脚本正在运行中……", Toast.LENGTH_SHORT).show()
            return
        }

        // 权限检查
        val permStatus = PermissionChecker.checkAll(this, ScreenShoterV3.getInstance().isInited())
        if (!permStatus.allGranted) {
            val missing = PermissionChecker.getMissingPermissions(this, ScreenShoterV3.getInstance().isInited())
            Toast.makeText(this, "缺少权限: ${missing.joinToString()}", Toast.LENGTH_LONG).show()
            ScriptLogger.log("W", TAG, "启动失败，缺少权限: $missing")
            return
        }

        // 网络检查
        if (!NetworkChecker.isConnected(this)) {
            ScriptLogger.log("W", TAG, "网络不可用，脚本仍将启动（离线模式）")
        }

        if (engine.getState() == ScriptEngine.State.STOPPED) {
            engine.resetState()
        }

        // 启动脚本
        ScriptLogger.log("I", TAG, "脚本启动")
        engine.start { gs.execute(engine) }

        // 启动心跳检测
        heartbeatManager?.start()

        // 重置重启计数
        restartHelper?.resetCount()

        updateUI()
        Toast.makeText(this, "脚本启动", Toast.LENGTH_SHORT).show()
    }

    // ==================== UI 状态同步（对齐按键精灵状态机） ====================
    // 按键精灵状态值: 0=初始, 1=空闲, 2=运行中, 3=暂停, 4=停止
    // 对应本项目: IDLE=0/1, RUNNING=2, PAUSED=3, STOPPED=4

    private fun updateUI() {
        val state = scriptEngine?.getState() ?: ScriptEngine.State.IDLE

        // 运行按钮：根据状态切换图标和文字（对齐按键精灵 floatview_imageview_run_and_pause + id_tv_run_and_pause）
        when (state) {
            ScriptEngine.State.RUNNING -> {
                btnRun?.text = "⏸"
                btnRunLabel?.text = "暂停"
                setButtonColor(btnRun, COLOR_ORANGE)
            }
            ScriptEngine.State.PAUSED -> {
                btnRun?.text = "▶"
                btnRunLabel?.text = "继续"
                setButtonColor(btnRun, COLOR_YELLOW)
            }
            else -> {
                btnRun?.text = "▶"
                btnRunLabel?.text = "运行"
                setButtonColor(btnRun, COLOR_GREEN)
            }
        }

        // 设置/停止按钮（对齐按键精灵 floatview_imageview_setting + id_tv_setting_and_stop）：
        // 运行中/暂停中显示"停止"，空闲显示"设置"
        when (state) {
            ScriptEngine.State.RUNNING, ScriptEngine.State.PAUSED -> {
                btnSetting?.text = "⏹"
                btnSettingLabel?.text = "停止"
                setButtonColor(btnSetting, COLOR_RED)
            }
            else -> {
                btnSetting?.text = "⚙"
                btnSettingLabel?.text = "设置"
                setButtonColor(btnSetting, COLOR_BLUE)
            }
        }

        // 收起态主图标颜色同步
        updateCollapseIconColor()
    }

    /** 收起态主图标颜色反映当前状态 */
    private fun updateCollapseIconColor() {
        val state = scriptEngine?.getState() ?: ScriptEngine.State.IDLE
        val color = when (state) {
            ScriptEngine.State.RUNNING -> COLOR_ORANGE
            ScriptEngine.State.PAUSED -> COLOR_YELLOW
            else -> COLOR_GREEN
        }
        setButtonColor(btnCollapse, color)
    }

    private fun setButtonColor(view: View?, color: Int) {
        val bg = view?.background
        if (bg is GradientDrawable) {
            bg.setColor(color)
        }
    }

    // ==================== 拖拽（区分拖拽和点击） ====================

    private fun setupDrag(view: View, params: WindowManager.LayoutParams) {
        var initialX = 0
        var initialY = 0
        var initialTouchX = 0f
        var initialTouchY = 0f
        var isDragging = false
        val touchSlop = 10

        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    initialX = params.x
                    initialY = params.y
                    initialTouchX = event.rawX
                    initialTouchY = event.rawY
                    isDragging = false
                    true
                }
                MotionEvent.ACTION_MOVE -> {
                    val dx = (event.rawX - initialTouchX).toInt()
                    val dy = (event.rawY - initialTouchY).toInt()
                    if (Math.abs(dx) > touchSlop || Math.abs(dy) > touchSlop) {
                        isDragging = true
                    }
                    if (isDragging) {
                        params.x = initialX + dx
                        params.y = initialY + dy
                        windowManager?.updateViewLayout(view, params)
                    }
                    true
                }
                MotionEvent.ACTION_UP -> {
                    if (!isDragging) {
                        onCollapseClicked()
                    }
                    true
                }
                else -> false
            }
        }
    }

    // ==================== 通知 ====================

    private fun createNotification(): Notification {
        val pendingIntent = PendingIntent.getActivity(
            this, 0,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_IMMUTABLE
        )
        return NotificationCompat.Builder(this, ScriptApp.CHANNEL_FLOATING)
            .setContentTitle("脚本悬浮窗")
            .setContentText("横向控制条运行中")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentIntent(pendingIntent)
            .setOngoing(true)
            .build()
    }
}

// ==================== 颜色常量 ====================
private const val COLOR_GREEN = 0xFF4CAF50.toInt()
private const val COLOR_ORANGE = 0xFFFF9800.toInt()
private const val COLOR_YELLOW = 0xFFFFC107.toInt()
private const val COLOR_RED = 0xFFF44336.toInt()
private const val COLOR_BLUE = 0xFF2196F3.toInt()
private const val COLOR_GRAY = 0xFF757575.toInt()
