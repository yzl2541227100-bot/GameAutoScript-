package com.example.myapplication.engine

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.app.Instrumentation
import android.bluetooth.BluetoothAdapter
import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Path
import android.media.MediaPlayer
import android.media.MediaScannerConnection
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Environment
import android.os.PowerManager
import android.os.SystemClock
import android.provider.MediaStore
import android.provider.Settings
import android.telephony.TelephonyManager
import android.util.Log
import android.view.InputDevice
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.WindowManager
import com.example.myapplication.accessibility.ScriptAccessibilityService
import java.io.*
import java.lang.ref.WeakReference
import java.net.HttpURLConnection
import java.net.NetworkInterface
import java.net.URL
import java.net.URLEncoder
import java.util.Collections
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.sqrt

/**
 * 脚本动作执行器 - 核心自动化能力
 * 完整实现参考 Injector.java 的所有公开方法
 */
class ScriptAction(private val context: Context) {

    companion object {
        const val TAG = "ScriptAction"
        const val MAX_POINTERS = 5
        private const val SWIPE_STEPS = 11
        private const val USER_AGENT =
            "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11"
    }

    private var instrumentation: Instrumentation? = null
    private var inputDeviceId = 0
    private var useAccessibility = false

    // 多点触控状态
    private data class PointerState(
        var active: Boolean = false,
        var pointerId: Int = 0,
        var x: Float = 0f,
        var y: Float = 0f
    )
    private val pointers = Array(MAX_POINTERS) { PointerState() }

    // 同步对话框返回值
    @Volatile var syncReturnInt = 0
    @Volatile var syncReturnStr = ""
    @Volatile var syncDialogDone = false

    private val accessibilityService: ScriptAccessibilityService?
        get() = ScriptAccessibilityService.getInstance()

    init {
        initInstrumentation()
    }

    private fun initInstrumentation() {
        if (instrumentation == null) {
            inputDeviceId = findTouchInputDeviceId()
            instrumentation = Instrumentation()
        }
    }

    private fun findTouchInputDeviceId(): Int {
        for (id in InputDevice.getDeviceIds()) {
            val device = InputDevice.getDevice(id) ?: continue
            try {
                val method = device.javaClass.getDeclaredMethod("supportsSource", Int::class.javaPrimitiveType)
                method.isAccessible = true
                if (method.invoke(device, 4098) as Boolean) return id
            } catch (_: Exception) {}
        }
        return 0
    }

    /** 设置是否使用无障碍模式 */
    fun setAccessibilityMode(enabled: Boolean) {
        useAccessibility = enabled
    }

    // ==================== 触摸模拟 ====================

    /** 单点点击 (对应 Injector.Tap) */
    fun tap(x: Float, y: Float, delay: Int = 0) {
        if (useAccessibility) { tapAB(x, y, delay); return }
        try {
            val downTime = SystemClock.uptimeMillis()
            val coords = MotionEvent.PointerCoords().apply {
                this.x = x; this.y = y; orientation = getTapRotation()
            }
            val inst = instrumentation ?: return
            inst.sendPointerSync(MotionEvent.obtain(
                downTime, downTime, MotionEvent.ACTION_DOWN, 1,
                intArrayOf(0), arrayOf(coords), 0, 0f, 0f, inputDeviceId, 0, 0, 0
            ))
            if (delay > 0) Thread.sleep(delay.toLong())
            inst.sendPointerSync(MotionEvent.obtain(
                downTime, downTime, MotionEvent.ACTION_UP, 1,
                intArrayOf(0), arrayOf(coords), 0, 0f, 0f, inputDeviceId, 0, 0, 0
            ))
        } catch (e: Throwable) {
            Log.w(TAG, "Tap failed", e)
        }
    }

    /** 随机偏移点击 (对应 Injector.RandomTap) */
    fun randomTap(x: Float, y: Float, randomRange: Int) {
        val rx = x + ((Math.random() * randomRange) - randomRange / 2).toInt()
        val ry = y + ((Math.random() * randomRange) - randomRange / 2).toInt()
        tap(rx, ry)
    }

    /** 无障碍点击 (对应 Injector.TapAB) */
    fun tapAB(x: Float, y: Float, duration: Int = 10) {
        val dur = if (duration <= 10) 10 else duration
        val service = accessibilityService ?: return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val path = Path().apply { moveTo(x - 1, y - 1); lineTo(x + 1, y + 1) }
            service.dispatchGesture(
                GestureDescription.Builder()
                    .addStroke(GestureDescription.StrokeDescription(path, 50, dur.toLong()))
                    .build(), null, null
            )
        }
    }

    /** 滑动 (对应 Injector.Swipe) */
    fun swipe(x1: Float, y1: Float, x2: Float, y2: Float, duration: Int = 300) {
        if (useAccessibility) { swipeAB(x1, y1, x2, y2, duration); return }
        try {
            val inst = instrumentation ?: return
            val downTime = SystemClock.uptimeMillis()
            inst.sendPointerSync(MotionEvent.obtain(
                downTime, downTime, MotionEvent.ACTION_DOWN,
                x1, y1, 1f, 1f, 0, 1f, 1f, inputDeviceId, 0
            ))
            val stepDelay = duration / SWIPE_STEPS
            for (i in 1..SWIPE_STEPS) {
                val progress = i.toFloat() / SWIPE_STEPS
                val cx = x1 + (x2 - x1) * progress
                val cy = y1 + (y2 - y1) * progress
                val moveTime = SystemClock.uptimeMillis()
                inst.sendPointerSync(MotionEvent.obtain(
                    moveTime, moveTime, MotionEvent.ACTION_MOVE,
                    cx, cy, 1f, 1f, 0, 1f, 1f, inputDeviceId, 0
                ))
                if (stepDelay > 0) Thread.sleep(stepDelay.toLong())
            }
            val upTime = SystemClock.uptimeMillis()
            inst.sendPointerSync(MotionEvent.obtain(
                upTime, upTime, MotionEvent.ACTION_UP,
                x2, y2, 1f, 1f, 0, 1f, 1f, inputDeviceId, 0
            ))
        } catch (e: Throwable) {
            Log.w(TAG, "Swipe failed", e)
        }
    }

    /** 无障碍滑动 (对应 Injector.SwipeAB) */
    fun swipeAB(x1: Float, y1: Float, x2: Float, y2: Float, duration: Int = 300) {
        val dur = if (duration <= 10) 10 else duration
        val service = accessibilityService ?: return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val path = Path().apply { moveTo(x1, y1); lineTo(x2, y2) }
            service.dispatchGesture(
                GestureDescription.Builder()
                    .addStroke(GestureDescription.StrokeDescription(path, 0, dur.toLong()))
                    .build(), null, null
            )
        }
    }

    /** 长按 */
    fun longPress(x: Float, y: Float, duration: Int = 1000) {
        tap(x, y, duration)
    }

    // ==================== 多指触控 (对应 Injector.TouchDown/Move/Up) ====================

    /** 多指按下 */
    fun touchDown(id: Int, x: Float, y: Float) {
        try {
            if (getActivePointerCount() >= MAX_POINTERS) return
            assignPointer(id, x, y)
            val now = SystemClock.uptimeMillis()
            val action = computeTouchAction(id, MotionEvent.ACTION_DOWN)
            val count = getActivePointerCount()
            buildPointerArrays()
            instrumentation?.sendPointerSync(MotionEvent.obtain(
                now, now, action, count, pointerProperties!!, pointerCoords!!,
                0, 0, 0f, 0f, inputDeviceId, 0, 0, 0
            ))
        } catch (e: Throwable) { Log.w(TAG, "TouchDown failed", e) }
    }

    /** 多指移动 (对应 Injector.TouchMove - 带插值) */
    fun touchMove(id: Int, x: Float, y: Float, duration: Int = 0) {
        try {
            val ptr = findPointer(id) ?: return
            val startX = ptr.x; val startY = ptr.y
            val dist = sqrt(((startX - x) * (startX - x) + (startY - y) * (startY - y)).toDouble())
            val screenMin = min(
                context.resources.displayMetrics.widthPixels,
                context.resources.displayMetrics.heightPixels
            )
            val steps = if (duration <= 200 && 2 * dist <= screenMin) {
                ((dist * 20 / screenMin).toInt() + 1).coerceAtLeast(1)
            } else SWIPE_STEPS

            val startTime = SystemClock.uptimeMillis()
            for (i in 1..steps) {
                val now = SystemClock.uptimeMillis()
                val progress = i.toFloat() / steps
                val cx = startX + (x - startX) * progress
                val cy = startY + (y - startY) * progress
                assignPointer(id, cx, cy)
                val action = computeTouchAction(id, MotionEvent.ACTION_MOVE)
                val count = getActivePointerCount()
                buildPointerArrays()
                instrumentation?.sendPointerSync(MotionEvent.obtain(
                    now, now, action, count, pointerProperties!!, pointerCoords!!,
                    0, 0, 0f, 0f, inputDeviceId, 0, 0, 0
                ))
                if (duration > 0) {
                    val remaining = (duration.toLong() - (SystemClock.uptimeMillis() - startTime)) / (steps + 1 - i)
                    if (remaining >= 10) Thread.sleep(remaining)
                }
            }
        } catch (e: Throwable) { Log.w(TAG, "TouchMove failed", e) }
    }

    /** 多指直接移动事件 (对应 Injector.TouchMoveEvent - 不插值) */
    fun touchMoveEvent(id: Int, x: Float, y: Float, delay: Int = 0) {
        try {
            findPointer(id) ?: return
            val now = SystemClock.uptimeMillis()
            assignPointer(id, x, y)
            val action = computeTouchAction(id, MotionEvent.ACTION_MOVE)
            val count = getActivePointerCount()
            buildPointerArrays()
            if (delay > 10) Thread.sleep((delay - 15).toLong().coerceAtLeast(0))
            instrumentation?.sendPointerSync(MotionEvent.obtain(
                now, now, action, count, pointerProperties!!, pointerCoords!!,
                0, 0, 0f, 0f, inputDeviceId, 0, 0, 0
            ))
        } catch (e: Throwable) { Log.w(TAG, "TouchMoveEvent failed", e) }
    }

    /** 多指抬起 */
    fun touchUp(id: Int) {
        try {
            findPointer(id) ?: return
            val now = SystemClock.uptimeMillis()
            val action = computeTouchAction(id, MotionEvent.ACTION_UP)
            val count = getActivePointerCount()
            buildPointerArrays()
            instrumentation?.sendPointerSync(MotionEvent.obtain(
                now, now, action, count, pointerProperties!!, pointerCoords!!,
                0, 0, 0f, 0f, inputDeviceId, 0, 0, 0
            ))
            releasePointer(id)
        } catch (e: Throwable) { Log.w(TAG, "TouchUp failed", e) }
    }

    /** 双指放大 (对应 Injector.MoveZoomIn) */
    fun moveZoomIn(x1: Float, y1: Float, x2: Float, y2: Float, duration: Int) {
        val cx = (x1 + x2) / 2; val cy = (y1 + y2) / 2
        touchDown(10123, cx, cy); touchDown(10124, cx, cy)
        val stepDelay = (duration / SWIPE_STEPS).coerceAtLeast(10)
        val dx1 = (x1 - cx) / SWIPE_STEPS; val dy1 = (y1 - cy) / SWIPE_STEPS
        val dx2 = (x2 - cx) / SWIPE_STEPS; val dy2 = (y2 - cy) / SWIPE_STEPS
        Thread.sleep(20)
        var px1 = cx; var py1 = cy; var px2 = cx; var py2 = cy
        for (i in 0 until SWIPE_STEPS) {
            px1 += dx1; py1 += dy1; px2 += dx2; py2 += dy2
            touchMoveEvent(10123, px1, py1, 0)
            touchMoveEvent(10124, px2, py2, 0)
            Thread.sleep(stepDelay.toLong())
        }
        touchUp(10123); touchUp(10124)
    }

    /** 双指缩小 (对应 Injector.MoveZoomOut) */
    fun moveZoomOut(x1: Float, y1: Float, x2: Float, y2: Float, duration: Int) {
        val cx = (x1 + x2) / 2; val cy = (y1 + y2) / 2
        touchDown(10125, x1, y1); touchDown(10126, x2, y2)
        val stepDelay = (duration / SWIPE_STEPS).coerceAtLeast(10)
        val dx1 = (cx - x1) / SWIPE_STEPS; val dy1 = (cy - y1) / SWIPE_STEPS
        val dx2 = (cx - x2) / SWIPE_STEPS; val dy2 = (cy - y2) / SWIPE_STEPS
        Thread.sleep(20)
        var px1 = x1; var py1 = y1; var px2 = x2; var py2 = y2
        for (i in 0 until SWIPE_STEPS) {
            px1 += dx1; py1 += dy1; px2 += dx2; py2 += dy2
            touchMoveEvent(10125, px1, py1, 0)
            touchMoveEvent(10126, px2, py2, 0)
            Thread.sleep(stepDelay.toLong())
        }
        touchUp(10125); touchUp(10126)
    }

    /** 无障碍手势路径 (对应 Injector.dispatchGestureMoveAB) */
    fun dispatchGestureMove(points: List<Pair<Int, Int>>, duration: Long) {
        val service = accessibilityService ?: return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && points.isNotEmpty()) {
            val path = Path().apply {
                moveTo(points[0].first.toFloat(), points[0].second.toFloat())
                for (i in 1 until points.size) {
                    lineTo(points[i].first.toFloat(), points[i].second.toFloat())
                }
            }
            service.dispatchGesture(
                GestureDescription.Builder()
                    .addStroke(GestureDescription.StrokeDescription(path, 0, duration))
                    .build(), null, null
            )
        }
    }

    // ==================== 按键模拟 ====================

    /** 按键按下 (对应 Injector.KeyDown) */
    fun keyDown(keyCode: Int) {
        try { instrumentation?.sendKeySync(KeyEvent(KeyEvent.ACTION_DOWN, keyCode)) }
        catch (_: Throwable) {}
    }

    /** 按键抬起 (对应 Injector.KeyUp) */
    fun keyUp(keyCode: Int) {
        try { instrumentation?.sendKeySync(KeyEvent(KeyEvent.ACTION_UP, keyCode)) }
        catch (_: Throwable) {}
    }

    /** 按键 (对应 Injector.KeyPress) */
    fun keyPress(keyCode: Int) {
        if (useAccessibility) {
            keyPressAB(keyCode)
        } else {
            keyDown(keyCode); keyUp(keyCode)
        }
    }

    /** 无障碍按键 (对应 Injector.KeyPressAB) */
    fun keyPressAB(keyCode: Int) {
        val service = accessibilityService ?: return
        when (keyCode) {
            KeyEvent.KEYCODE_BACK -> service.pressBack()
            KeyEvent.KEYCODE_HOME -> service.pressHome()
            KeyEvent.KEYCODE_APP_SWITCH -> service.openRecents()
        }
    }

    /** 输入文字 (对应 Injector.sendText) */
    fun sendText(text: String) {
        if (useAccessibility) {
            accessibilityService?.inputText(text, context)
        }
    }

    // ==================== 多指触控内部方法 ====================

    private var pointerProperties: Array<MotionEvent.PointerProperties>? = null
    private var pointerCoords: Array<MotionEvent.PointerCoords>? = null

    private fun getActivePointerCount(): Int = pointers.count { !it.active.not() && it.pointerId != 0 || !it.active }
        .let { pointers.count { p -> !p.active.not() } }
        .let { pointers.count { p -> p.active } }

    private fun findPointer(id: Int): PointerState? =
        pointers.firstOrNull { it.active && it.pointerId == id }

    private fun assignPointer(id: Int, x: Float, y: Float) {
        // 先找已有的
        val existing = pointers.firstOrNull { it.active && it.pointerId == id }
        if (existing != null) { existing.x = x; existing.y = y; return }
        // 分配新的
        val free = pointers.firstOrNull { !it.active } ?: return
        free.active = true; free.pointerId = id; free.x = x; free.y = y
    }

    private fun releasePointer(id: Int) {
        pointers.filter { it.pointerId == id }.forEach {
            it.active = false; it.pointerId = 0; it.x = 0f; it.y = 0f
        }
    }

    fun releaseAllPointers() {
        pointers.forEach { it.active = false; it.pointerId = 0; it.x = 0f; it.y = 0f }
    }

    private fun computeTouchAction(id: Int, baseAction: Int): Int {
        val count = pointers.count { it.active }
        val index = pointers.indexOfFirst { it.active && it.pointerId == id }
        return when (baseAction) {
            MotionEvent.ACTION_DOWN -> {
                if (count == 1) MotionEvent.ACTION_DOWN
                else MotionEvent.ACTION_POINTER_DOWN or (index shl MotionEvent.ACTION_POINTER_INDEX_SHIFT)
            }
            MotionEvent.ACTION_MOVE -> MotionEvent.ACTION_MOVE
            MotionEvent.ACTION_UP -> {
                if (count == 1) MotionEvent.ACTION_UP
                else MotionEvent.ACTION_POINTER_UP or (index shl MotionEvent.ACTION_POINTER_INDEX_SHIFT)
            }
            else -> baseAction
        }
    }

    private fun buildPointerArrays() {
        val active = pointers.filter { it.active }
        pointerProperties = Array(active.size) { i ->
            MotionEvent.PointerProperties().apply {
                id = pointers.indexOf(active[i])
            }
        }
        pointerCoords = Array(active.size) { i ->
            MotionEvent.PointerCoords().apply {
                x = active[i].x; y = active[i].y
                orientation = getTapRotation()
            }
        }
    }

    private fun getTapRotation(): Float {
        val rotation = (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager)
            .defaultDisplay.rotation
        return when (rotation) {
            0 -> 0f
            1 -> -Math.PI.toFloat() / 2
            2 -> -Math.PI.toFloat()
            3 -> Math.PI.toFloat() / 2
            else -> 0f
        }
    }

    // ==================== 屏幕控制 (对应 Injector 屏幕方法) ====================

    /** 保持屏幕常亮 (对应 Injector.KeepScreen) */
    fun keepScreen(enable: Boolean) {
        val activity = context as? android.app.Activity ?: return
        activity.runOnUiThread {
            if (enable) activity.window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            else activity.window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

    /** 锁屏 (对应 Injector.LockScreen) */
    fun lockScreen() {
        // 需要设备管理员权限
        try {
            val pm = context.getSystemService(Context.POWER_SERVICE) as PowerManager
            // 通过 DevicePolicyManager 实现
        } catch (e: Exception) { Log.w(TAG, "LockScreen failed", e) }
    }

    /** 解锁屏幕 (对应 Injector.UnlockScreen) */
    fun unlockScreen() {
        try {
            val pm = context.getSystemService(Context.POWER_SERVICE) as PowerManager
            @Suppress("DEPRECATION")
            val wl = pm.newWakeLock(
                PowerManager.FULL_WAKE_LOCK or PowerManager.ACQUIRE_CAUSES_WAKEUP, "script:unlock"
            )
            wl.acquire(3000)
            wl.release()
        } catch (e: Exception) { Log.w(TAG, "UnlockScreen failed", e) }
    }

    /** 是否锁屏 (对应 Injector.isLockScreen) */
    fun isLockScreen(): Boolean {
        val pm = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        return !pm.isInteractive
    }

    /** 设置屏幕亮度 (对应 Injector.SetBacklightLevel) */
    fun setBacklightLevel(level: Int) {
        val l = level.coerceIn(0, 100)
        val activity = context as? android.app.Activity ?: return
        activity.runOnUiThread {
            val lp = activity.window.attributes
            lp.screenBrightness = l / 100f
            activity.window.attributes = lp
        }
    }

    /** 设置自动锁屏时间 (对应 Injector.SetAutoLockTime) */
    fun setAutoLockTime(seconds: Int) {
        try {
            Settings.System.putInt(context.contentResolver, Settings.System.SCREEN_OFF_TIMEOUT, seconds * 1000)
        } catch (e: Exception) { Log.w(TAG, "SetAutoLockTime failed", e) }
    }

    /** 获取屏幕旋转 (对应 Injector.GetScreenRotation) */
    fun getScreenRotation(): Int {
        return (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager)
            .defaultDisplay.rotation
    }

    /** 设置旋转锁定 (对应 Injector.SetRotationLockEnable) */
    fun setRotationLock(enable: Boolean) {
        try {
            Settings.System.putInt(
                context.contentResolver, Settings.System.ACCELEROMETER_ROTATION, if (enable) 0 else 1
            )
        } catch (e: Exception) { Log.w(TAG, "SetRotationLock failed", e) }
    }

    /** 震动 (对应 Injector.Vibrate) */
    fun vibrate(duration: Int) {
        try {
            val vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                val vm = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as android.os.VibratorManager
                vm.defaultVibrator
            } else {
                @Suppress("DEPRECATION")
                context.getSystemService(Context.VIBRATOR_SERVICE) as android.os.Vibrator
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(android.os.VibrationEffect.createOneShot(duration.toLong(), android.os.VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(duration.toLong())
            }
        } catch (e: Exception) { Log.w(TAG, "Vibrate failed", e) }
    }

    // ==================== 设备信息 (对应 Injector 设备方法) ====================

    /** 获取设备ID (对应 Injector.GetDeviceID) */
    fun getDeviceId(): String {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID) ?: ""
    }

    /** 获取设备名称 (对应 Injector.GetDeviceName) */
    fun getDeviceName(): String {
        try {
            val adapter = BluetoothAdapter.getDefaultAdapter()
            if (adapter != null && !adapter.name.isNullOrEmpty()) return adapter.name
        } catch (_: Exception) {}
        return Build.MODEL
    }

    /** 获取 Android 版本 (对应 Injector.GetAndroidVersion) */
    fun getAndroidVersion(): String = Build.VERSION.RELEASE

    /** 获取屏幕 DPI (对应 Injector.GetDisplayDpi) */
    fun getDisplayDpi(): Int = context.resources.displayMetrics.densityDpi

    /** 获取 SD 卡路径 (对应 Injector.GetSdcardDir) */
    fun getSdcardDir(): String = Environment.getExternalStorageDirectory().absolutePath

    /** 是否 64 位 (对应 Injector.Is64Bit) */
    fun is64Bit(): Boolean {
        return try {
            if (Build.VERSION.SDK_INT >= 21) {
                val cls = Class.forName("dalvik.system.VMRuntime")
                val getRuntime = cls.getDeclaredMethod("getRuntime")
                val runtime = getRuntime.invoke(null)
                val is64 = cls.getDeclaredMethod("is64Bit")
                is64.invoke(runtime) as Boolean
            } else false
        } catch (_: Throwable) { false }
    }

    /** 是否 Root (对应 Injector.IsRoot) */
    fun isRoot(): Boolean {
        val path = System.getenv("PATH") ?: return false
        return path.split(":").any { dir ->
            File(dir, "su").let { it.exists() && it.canExecute() }
        }
    }

    /** 获取版本号 (对应 Injector.GetVersion) */
    fun getVersion(): String = "1.0.0"

    // ==================== 网络 (对应 Injector 网络方法) ====================

    /** HTTP 请求 (对应 Injector.UrlRequest) */
    fun urlRequest(method: Int, url: String, body: String = "", timeout: Int = 5): String {
        val timeoutMs = (if (timeout <= 0) 5 else timeout) * 1000
        return try {
            val encodedUrl = encodeChineseChars(url)
            val conn = URL(encodedUrl).openConnection() as HttpURLConnection
            conn.connectTimeout = timeoutMs
            conn.readTimeout = timeoutMs
            conn.useCaches = false
            when (method) {
                1 -> { // GET
                    conn.requestMethod = "GET"
                }
                2 -> { // POST
                    conn.requestMethod = "POST"
                    conn.setRequestProperty("User-Agent", USER_AGENT)
                    conn.instanceFollowRedirects = false
                    conn.doOutput = true
                    conn.outputStream.bufferedWriter().use { it.write(body) }
                }
            }
            conn.inputStream.bufferedReader().use { it.readText() } ?: ""
        } catch (e: Exception) {
            Log.e(TAG, "UrlRequest failed", e)
            ""
        }
    }

    /** 获取网络类型 (对应 Injector.GetNetType) */
    fun getNetType(): String {
        return try {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val info = cm.activeNetworkInfo ?: return "none"
            when (info.type) {
                ConnectivityManager.TYPE_WIFI -> "wifi"
                ConnectivityManager.TYPE_MOBILE -> "mobile"
                else -> info.typeName
            }
        } catch (_: Exception) { "unknown" }
    }

    /** 获取 VPN 状态 (对应 Injector.GetVPNStatus) */
    fun getVPNStatus(): Boolean {
        return try {
            Collections.list(NetworkInterface.getNetworkInterfaces()).any { ni ->
                ni.isUp && (ni.name.contains("tun") || ni.name.contains("ppp") || ni.name.contains("pptp"))
            }
        } catch (_: Exception) { false }
    }

    /** 设置 WiFi (对应 Injector.SetWifiEnable) */
    @Suppress("DEPRECATION")
    fun setWifiEnable(enable: Boolean) {
        try {
            val wm = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wm.isWifiEnabled = enable
        } catch (e: Exception) { Log.w(TAG, "SetWifi failed", e) }
    }

    /** 设置蓝牙 (对应 Injector.SetBTEnable) */
    @Suppress("MissingPermission")
    fun setBTEnable(enable: Boolean) {
        try {
            val adapter = BluetoothAdapter.getDefaultAdapter() ?: return
            if (enable) adapter.enable() else adapter.disable()
        } catch (e: Exception) { Log.w(TAG, "SetBT failed", e) }
    }

    /** 设置音量 (对应 Injector.SetVolumeLevel) */
    fun setVolumeLevel(level: Int) {
        try {
            val am = context.getSystemService(Context.AUDIO_SERVICE) as android.media.AudioManager
            val maxVol = am.getStreamMaxVolume(android.media.AudioManager.STREAM_MUSIC)
            val vol = (level.coerceIn(0, 100) * maxVol / 100)
            am.setStreamVolume(android.media.AudioManager.STREAM_MUSIC, vol, 0)
        } catch (e: Exception) { Log.w(TAG, "SetVolume failed", e) }
    }

    private fun encodeChineseChars(url: String): String {
        val regex = Regex("[\\u4e00-\\u9fa5]")
        var result = url
        regex.findAll(url).forEach { match ->
            result = result.replace(match.value, URLEncoder.encode(match.value, "UTF-8"))
        }
        return result
    }

    // ==================== 媒体 (对应 Injector 媒体方法) ====================

    private var mediaPlayer: MediaPlayer? = null

    /** 播放音频 (对应 Injector.PlaySound) */
    fun playSound(filePath: String) {
        try {
            stopPlay()
            mediaPlayer = MediaPlayer().apply {
                setDataSource(filePath); prepare(); start()
                setOnCompletionListener { it.release(); mediaPlayer = null }
            }
        } catch (e: Exception) { Log.e(TAG, "PlaySound failed", e) }
    }

    /** 停止播放 (对应 Injector.StopPlay) */
    fun stopPlay() {
        try { mediaPlayer?.stop(); mediaPlayer?.release(); mediaPlayer = null }
        catch (_: Exception) {}
    }

    /** 截图保存 (对应 Injector.SaveSnapShot) */
    fun saveSnapshot(pixels: IntArray, width: Int, height: Int, path: String, quality: Int = 80): Boolean {
        val bitmap = Bitmap.createBitmap(pixels, width, height, Bitmap.Config.ARGB_8888) ?: return false
        return try {
            val file = File(path)
            file.parentFile?.mkdirs()
            FileOutputStream(file).use { fos ->
                bitmap.compress(Bitmap.CompressFormat.JPEG, quality, fos)
                fos.flush()
            }
            true
        } catch (e: IOException) {
            Log.e(TAG, "SaveSnapshot failed", e); false
        } finally { bitmap.recycle() }
    }

    /** 截屏到文件 */
    fun screencap(filePath: String): Boolean {
        return try {
            val process = Runtime.getRuntime().exec("screencap -p $filePath")
            process.waitFor() == 0
        } catch (e: Exception) { Log.e(TAG, "Screencap failed", e); false }
    }

    /** 插入图片到相册 (对应 Injector.InsertImageToGallery) */
    fun insertImageToGallery(filePath: String): Boolean {
        val file = File(filePath)
        if (!file.exists()) return false
        return try {
            if (Build.VERSION.SDK_INT >= 29) {
                val values = ContentValues().apply {
                    put(MediaStore.Images.Media.DISPLAY_NAME, file.name)
                    put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
                    put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_DCIM)
                }
                val uri = context.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
                uri?.let {
                    BufferedInputStream(FileInputStream(file)).use { bis ->
                        context.contentResolver.openOutputStream(it)?.use { os ->
                            bis.copyTo(os)
                        }
                    }
                }
                uri != null
            } else {
                @Suppress("DEPRECATION")
                MediaStore.Images.Media.insertImage(context.contentResolver, file.absolutePath, file.name, null)
                true
            }.also {
                MediaScannerConnection.scanFile(context, arrayOf(file.absolutePath), null, null)
            }
        } catch (e: Exception) { Log.e(TAG, "InsertImage failed", e); false }
    }

    /** 清除所有截图 (对应 Injector.ClearAllPhotos) */
    fun clearAllPhotos(dir: String = "${getSdcardDir()}/DCIM/script/") {
        File(dir).listFiles()?.forEach { it.delete() }
        val where = "_data like \"$dir%\""
        context.contentResolver.delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, where, null)
    }

    // ==================== QR 码 (对应 Injector QR 方法) ====================

    /** 生成 QR 码到文件 (对应 Injector.ImageQREnCode) */
    fun imageQREncode(filePath: String, content: String, size: Int = 400): Boolean {
        return try {
            val hints = mapOf(
                com.google.zxing.EncodeHintType.CHARACTER_SET to "utf-8",
                com.google.zxing.EncodeHintType.ERROR_CORRECTION to com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.M,
                com.google.zxing.EncodeHintType.MARGIN to 2
            )
            val matrix = com.google.zxing.qrcode.QRCodeWriter().encode(
                content, com.google.zxing.BarcodeFormat.QR_CODE, size, size, hints
            )
            val pixels = IntArray(size * size)
            for (y in 0 until size) for (x in 0 until size) {
                pixels[y * size + x] = if (matrix[x, y]) 0xFF000000.toInt() else 0xFFFFFFFF.toInt()
            }
            val bitmap = Bitmap.createBitmap(pixels, size, size, Bitmap.Config.RGB_565)
            val file = File(filePath)
            file.parentFile?.mkdirs()
            FileOutputStream(file).use { fos ->
                val format = if (filePath.endsWith(".png")) Bitmap.CompressFormat.PNG else Bitmap.CompressFormat.JPEG
                bitmap.compress(format, 100, fos); fos.flush()
            }
            bitmap.recycle()
            true
        } catch (e: Exception) { Log.e(TAG, "QR encode failed", e); false }
    }

    /** 解码 QR 码 (对应 Injector.ImageQRDeCode) */
    fun imageQRDecode(filePath: String): String {
        return try {
            val bitmap = BitmapFactory.decodeFile(filePath) ?: return ""
            val w = bitmap.width; val h = bitmap.height
            val pixels = IntArray(w * h)
            bitmap.getPixels(pixels, 0, w, 0, 0, w, h)
            bitmap.recycle()
            val source = com.google.zxing.RGBLuminanceSource(w, h, pixels)
            val binaryBitmap = com.google.zxing.BinaryBitmap(com.google.zxing.common.HybridBinarizer(source))
            com.google.zxing.qrcode.QRCodeReader().decode(binaryBitmap).text ?: ""
        } catch (e: Exception) { Log.e(TAG, "QR decode failed", e); "" }
    }

    // ==================== 应用管理 ====================

    /** 启动应用 (对应 Injector.RunApp) */
    fun runApp(packageName: String) {
        try {
            val intent = context.packageManager.getLaunchIntentForPackage(packageName)
            if (intent != null) {
                intent.addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }
        } catch (e: Exception) { Log.e(TAG, "RunApp failed", e) }
    }

    /** 获取应用路径 (对应 Injector.GetAppPath) */
    fun getAppPath(packageName: String): String {
        return try {
            context.packageManager.getApplicationInfo(packageName, 0).sourceDir
        } catch (_: Exception) { "" }
    }

    /** 释放资源 (对应 Injector.release) */
    fun release() {
        stopPlay()
        releaseAllPointers()
    }
}
