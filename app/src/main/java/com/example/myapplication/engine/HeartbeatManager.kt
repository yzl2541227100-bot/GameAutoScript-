package com.example.myapplication.engine

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log

/**
 * 心跳保活管理器（对齐次元助手心跳机制）
 *
 * 功能：
 * - 定期检测脚本引擎是否存活
 * - 检测脚本是否卡死（长时间无响应）
 * - 超时后自动重启脚本
 * - 记录心跳日志
 */
class HeartbeatManager(
    private val context: Context,
    private val engine: ScriptEngine
) {

    companion object {
        private const val TAG = "HeartbeatManager"
        /** 心跳检测间隔 (ms) */
        private const val HEARTBEAT_INTERVAL = 30_000L
        /** 脚本无响应超时 (ms) - 超过此时间认为脚本卡死 */
        private const val SCRIPT_TIMEOUT = 120_000L
        /** 最大连续失败次数 */
        private const val MAX_FAILURES = 3
    }

    private val handler = Handler(Looper.getMainLooper())
    private var isRunning = false
    private var lastHeartbeatTime = 0L
    private var consecutiveFailures = 0
    private var onScriptDead: (() -> Unit)? = null
    private var onHeartbeatFailed: ((Int) -> Unit)? = null

    /** 脚本最后活跃时间（由脚本主循环更新） */
    @Volatile
    var lastScriptActiveTime = 0L
        private set

    /** 脚本主循环中调用，报告存活 */
    fun reportAlive() {
        lastScriptActiveTime = System.currentTimeMillis()
        consecutiveFailures = 0
    }

    /** 设置脚本死亡回调 */
    fun setOnScriptDead(callback: () -> Unit) {
        onScriptDead = callback
    }

    /** 设置心跳失败回调 */
    fun setOnHeartbeatFailed(callback: (Int) -> Unit) {
        onHeartbeatFailed = callback
    }

    /** 启动心跳检测 */
    fun start() {
        if (isRunning) return
        isRunning = true
        lastScriptActiveTime = System.currentTimeMillis()
        lastHeartbeatTime = System.currentTimeMillis()
        consecutiveFailures = 0
        handler.postDelayed(heartbeatRunnable, HEARTBEAT_INTERVAL)
        Log.d(TAG, "Heartbeat started")
        ScriptLogger.log("I", TAG, "心跳检测已启动")
    }

    /** 停止心跳检测 */
    fun stop() {
        isRunning = false
        handler.removeCallbacks(heartbeatRunnable)
        consecutiveFailures = 0
        Log.d(TAG, "Heartbeat stopped")
        ScriptLogger.log("I", TAG, "心跳检测已停止")
    }

    /** 心跳检测逻辑 */
    private val heartbeatRunnable = object : Runnable {
        override fun run() {
            if (!isRunning) return

            val now = System.currentTimeMillis()
            lastHeartbeatTime = now

            when (engine.getState()) {
                ScriptEngine.State.RUNNING -> {
                    // 检查脚本是否超时无响应
                    val elapsed = now - lastScriptActiveTime
                    if (elapsed > SCRIPT_TIMEOUT) {
                        consecutiveFailures++
                        Log.w(TAG, "Script timeout! elapsed=${elapsed}ms, failures=$consecutiveFailures")
                        ScriptLogger.log("W", TAG, "脚本无响应 ${elapsed / 1000}秒，连续失败$consecutiveFailures 次")
                        onHeartbeatFailed?.invoke(consecutiveFailures)

                        if (consecutiveFailures >= MAX_FAILURES) {
                            Log.e(TAG, "Script dead! Triggering restart...")
                            ScriptLogger.log("E", TAG, "脚本判定死亡，触发自动重启")
                            onScriptDead?.invoke()
                            return // 不再继续心跳
                        }
                    } else {
                        // 正常心跳
                        if (consecutiveFailures > 0) {
                            consecutiveFailures = 0
                            ScriptLogger.log("I", TAG, "脚本恢复响应")
                        }
                    }
                }
                ScriptEngine.State.PAUSED -> {
                    // 暂停状态不检测超时，但重置活跃时间
                    lastScriptActiveTime = now
                }
                ScriptEngine.State.IDLE, ScriptEngine.State.STOPPED -> {
                    // 脚本未运行，停止心跳
                    stop()
                    return
                }
            }

            // 继续下一次心跳
            handler.postDelayed(this, HEARTBEAT_INTERVAL)
        }
    }

    fun isActive(): Boolean = isRunning
    fun getConsecutiveFailures(): Int = consecutiveFailures
}
