package com.example.myapplication.engine

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast

/**
 * 脚本自动重启助手（对齐次元助手 RestartScriptHelper）
 *
 * 功能：
 * - 脚本崩溃/卡死后自动重启
 * - 可配置最大重启次数
 * - 重启间隔递增（避免频繁重启）
 * - 记录重启日志
 */
class ScriptRestartHelper(
    private val context: Context,
    private val engine: ScriptEngine
) {

    companion object {
        private const val TAG = "ScriptRestartHelper"
        /** 最大自动重启次数 */
        private const val MAX_RESTART_COUNT = 5
        /** 基础重启延迟 (ms) */
        private const val BASE_RESTART_DELAY = 3000L
        /** 重启延迟递增因子 */
        private const val DELAY_MULTIPLIER = 1.5
    }

    private val handler = Handler(Looper.getMainLooper())
    private var restartCount = 0
    private var isEnabled = true
    private var scriptBlock: (suspend () -> Unit)? = null
    private var lastRestartTime = 0L

    /** 设置要重启的脚本块 */
    fun setScriptBlock(block: suspend () -> Unit) {
        scriptBlock = block
    }

    /** 重置重启计数（脚本正常运行一段时间后调用） */
    fun resetCount() {
        if (restartCount > 0) {
            Log.d(TAG, "Restart count reset (was $restartCount)")
            ScriptLogger.log("I", TAG, "重启计数已重置")
        }
        restartCount = 0
    }

    /** 是否还能重启 */
    fun canRestart(): Boolean = isEnabled && restartCount < MAX_RESTART_COUNT

    /** 请求重启脚本 */
    fun requestRestart(reason: String) {
        if (!canRestart()) {
            Log.w(TAG, "Cannot restart: enabled=$isEnabled, count=$restartCount/$MAX_RESTART_COUNT")
            ScriptLogger.log("W", TAG, "无法重启：已达最大重启次数($MAX_RESTART_COUNT)")
            handler.post {
                Toast.makeText(context, "脚本多次重启失败，请手动检查", Toast.LENGTH_LONG).show()
            }
            return
        }

        restartCount++
        val delay = (BASE_RESTART_DELAY * Math.pow(DELAY_MULTIPLIER, (restartCount - 1).toDouble())).toLong()

        Log.d(TAG, "Scheduling restart #$restartCount in ${delay}ms, reason: $reason")
        ScriptLogger.log("W", TAG, "计划第${restartCount}次重启（${delay / 1000}秒后），原因：$reason")

        handler.postDelayed({
            doRestart()
        }, delay)
    }

    /** 执行重启 */
    private fun doRestart() {
        val block = scriptBlock
        if (block == null) {
            Log.e(TAG, "No script block set, cannot restart")
            return
        }

        if (engine.getState() == ScriptEngine.State.RUNNING) {
            Log.d(TAG, "Engine already running, skip restart")
            return
        }

        Log.d(TAG, "Restarting script (attempt #$restartCount)")
        ScriptLogger.log("I", TAG, "正在重启脚本（第${restartCount}次）...")
        lastRestartTime = System.currentTimeMillis()

        // 确保引擎状态正确
        if (engine.getState() == ScriptEngine.State.STOPPED) {
            engine.resetState()
        }

        engine.start(block)

        handler.post {
            Toast.makeText(context, "脚本自动重启（第${restartCount}次）", Toast.LENGTH_SHORT).show()
        }
    }

    /** 禁用自动重启 */
    fun disable() {
        isEnabled = false
        handler.removeCallbacksAndMessages(null)
    }

    /** 启用自动重启 */
    fun enable() {
        isEnabled = true
    }

    /** 获取重启次数 */
    fun getRestartCount(): Int = restartCount

    /** 获取上次重启时间 */
    fun getLastRestartTime(): Long = lastRestartTime
}
