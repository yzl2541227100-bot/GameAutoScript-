package com.example.myapplication.record

import android.util.Log

/**
 * 脚本录制器 - 参考 InputUtility.java (native: GetInput/CloseInput/Cancel)
 * 录制用户触摸操作并生成可回放的脚本
 */
class ScriptRecorder {

    companion object {
        private const val TAG = "ScriptRecorder"

        init {
            try {
                System.loadLibrary("script-engine")
            } catch (e: UnsatisfiedLinkError) {
                Log.w(TAG, "Native library not available, using fallback")
            }
        }
    }

    enum class State { IDLE, RECORDING, PAUSED }

    private var state = State.IDLE
    private val recordedEvents = mutableListOf<RecordEvent>()
    private var startTime = 0L
    var callback: OnRecordCallback? = null

    /** 开始录制 */
    fun startRecord(mode: Int = 0) {
        if (state == State.RECORDING) return
        state = State.RECORDING
        startTime = System.currentTimeMillis()
        recordedEvents.clear()
        callback?.onStartRecord(mode)
        Log.d(TAG, "Recording started, mode=$mode")
        try {
            nativeStartRecord(mode)
        } catch (_: Exception) {}
    }

    /** 停止录制 */
    fun stopRecord(): String {
        if (state == State.IDLE) return ""
        state = State.IDLE
        try {
            nativeStopRecord()
        } catch (_: Exception) {}
        val script = generateScript()
        callback?.onFinishRecord(script)
        Log.d(TAG, "Recording stopped, ${recordedEvents.size} events")
        return script
    }

    /** 取消录制 */
    fun cancelRecord() {
        state = State.IDLE
        recordedEvents.clear()
        try {
            nativeCancelRecord()
        } catch (_: Exception) {}
        Log.d(TAG, "Recording cancelled")
    }

    /** 添加录制事件 (由 native 或 accessibility 回调) */
    fun addEvent(event: RecordEvent) {
        if (state != State.RECORDING) return
        recordedEvents.add(event)
    }

    /** 添加触摸事件 */
    fun addTouchEvent(action: Int, x: Float, y: Float) {
        val elapsed = System.currentTimeMillis() - startTime
        addEvent(RecordEvent(RecordEvent.TYPE_TOUCH, action, x, y, elapsed))
    }

    /** 添加按键事件 */
    fun addKeyEvent(keyCode: Int, action: Int) {
        val elapsed = System.currentTimeMillis() - startTime
        addEvent(RecordEvent(RecordEvent.TYPE_KEY, action, keyCode.toFloat(), 0f, elapsed))
    }

    /** 获取录制状态 */
    fun getState(): State = state
    fun isRecording(): Boolean = state == State.RECORDING
    fun getEventCount(): Int = recordedEvents.size

    /** 生成脚本代码 */
    private fun generateScript(): String {
        val sb = StringBuilder()
        sb.appendLine("// 录制脚本 - ${java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(java.util.Date())}")
        sb.appendLine("// 共 ${recordedEvents.size} 个事件")
        sb.appendLine()

        var lastTime = 0L
        for (event in recordedEvents) {
            val delay = event.timestamp - lastTime
            if (delay > 50) {
                sb.appendLine("delay(${delay})")
            }
            when (event.type) {
                RecordEvent.TYPE_TOUCH -> {
                    when (event.action) {
                        0 -> sb.appendLine("tap(${event.x.toInt()}, ${event.y.toInt()})")
                        1 -> {} // up, skip
                        2 -> sb.appendLine("// move(${event.x.toInt()}, ${event.y.toInt()})")
                    }
                }
                RecordEvent.TYPE_KEY -> {
                    sb.appendLine("keyPress(${event.x.toInt()})")
                }
            }
            lastTime = event.timestamp
        }
        return sb.toString()
    }

    // Native methods (对应 InputUtility.java)
    private external fun nativeStartRecord(mode: Int): Int
    private external fun nativeStopRecord()
    private external fun nativeCancelRecord()

    /** 录制回调 - 对应 OnRecordScriptCallback */
    interface OnRecordCallback {
        fun onOpenRecord()
        fun onStartRecord(mode: Int)
        fun onFinishRecord(script: String)
    }
}

/** 录制事件 */
data class RecordEvent(
    val type: Int,
    val action: Int,
    val x: Float,
    val y: Float,
    val timestamp: Long
) {
    companion object {
        const val TYPE_TOUCH = 0
        const val TYPE_KEY = 1
        const val TYPE_SWIPE = 2
    }
}
