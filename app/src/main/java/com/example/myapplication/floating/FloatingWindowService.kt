package com.example.myapplication.floating

import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.os.Build
import android.os.IBinder
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.core.app.NotificationCompat
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.ScriptApp

/**
 * 悬浮窗服务 - 运行在 :enginfloat 独立进程
 * 提供悬浮控制面板，用于启停脚本
 */
class FloatingWindowService : Service() {

    companion object {
        const val TAG = "FloatingWindowService"
        const val NOTIFICATION_ID = 1001

        const val ACTION_SHOW = "action_show"
        const val ACTION_HIDE = "action_hide"
        const val ACTION_TOGGLE = "action_toggle"

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

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Service created in process :enginfloat")
        startForeground(NOTIFICATION_ID, createNotification())
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_HIDE -> hideFloatingWindow()
            ACTION_TOGGLE -> {
                if (isShowing) hideFloatingWindow() else showFloatingWindow()
            }
            else -> showFloatingWindow()
        }
        return START_STICKY
    }

    override fun onDestroy() {
        hideFloatingWindow()
        super.onDestroy()
    }

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
            y = 200
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

    /** 创建悬浮控制面板视图 */
    private fun createFloatingView(): View {
        // 使用代码创建简单的控制面板
        val container = FrameLayout(this).apply {
            setBackgroundColor(0xCC333333.toInt())
            setPadding(16, 16, 16, 16)
        }

        val layout = android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
        }

        // 播放/暂停按钮
        val btnPlay = android.widget.Button(this).apply {
            text = "▶ 运行"
            textSize = 12f
            setOnClickListener {
                text = if (text == "▶ 运行") "⏸ 暂停" else "▶ 运行"
                sendScriptCommand(if (text == "⏸ 暂停") "start" else "pause")
            }
        }

        // 停止按钮
        val btnStop = android.widget.Button(this).apply {
            text = "⏹ 停止"
            textSize = 12f
            setOnClickListener { sendScriptCommand("stop") }
        }

        // 关闭悬浮窗按钮
        val btnClose = android.widget.Button(this).apply {
            text = "✕ 关闭"
            textSize = 12f
            setOnClickListener { hideFloatingWindow() }
        }

        layout.addView(btnPlay)
        layout.addView(btnStop)
        layout.addView(btnClose)
        container.addView(layout)
        return container
    }

    /** 设置拖拽 */
    private fun setupDrag(view: View, params: WindowManager.LayoutParams) {
        var initialX = 0
        var initialY = 0
        var initialTouchX = 0f
        var initialTouchY = 0f

        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    initialX = params.x
                    initialY = params.y
                    initialTouchX = event.rawX
                    initialTouchY = event.rawY
                    true
                }
                MotionEvent.ACTION_MOVE -> {
                    params.x = initialX + (event.rawX - initialTouchX).toInt()
                    params.y = initialY + (event.rawY - initialTouchY).toInt()
                    windowManager?.updateViewLayout(view, params)
                    true
                }
                else -> false
            }
        }
    }

    /** 发送脚本控制命令到主进程 */
    private fun sendScriptCommand(command: String) {
        val intent = Intent("com.example.myapplication.SCRIPT_COMMAND").apply {
            putExtra("command", command)
            setPackage(packageName)
        }
        sendBroadcast(intent)
    }

    private fun createNotification(): Notification {
        val pendingIntent = PendingIntent.getActivity(
            this, 0,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_IMMUTABLE
        )
        return NotificationCompat.Builder(this, ScriptApp.CHANNEL_FLOATING)
            .setContentTitle("脚本悬浮窗")
            .setContentText("悬浮控制面板运行中")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentIntent(pendingIntent)
            .setOngoing(true)
            .build()
    }
}
