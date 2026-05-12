package com.example.myapplication.engine

import android.content.Context
import android.util.Log
import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicReference

/**
 * 脚本引擎 - 精简版
 * 只负责脚本生命周期管理：start/stop/pause/resume
 */
class ScriptEngine(private val context: Context) {

    companion object {
        const val TAG = "ScriptEngine"
    }

    enum class State { IDLE, RUNNING, PAUSED, STOPPED }

    private val state = AtomicReference(State.IDLE)
    private var engineJob: Job? = null
    private val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    fun getState(): State = state.get()
    fun isRunning(): Boolean = state.get() == State.RUNNING

    fun resetState() {
        if (state.get() == State.STOPPED) {
            state.set(State.IDLE)
        }
    }

    /** 启动脚本 */
    fun start(scriptBlock: suspend () -> Unit) {
        val current = state.get()
        if (current == State.RUNNING) return
        if (current == State.STOPPED) state.set(State.IDLE)

        state.set(State.RUNNING)
        Log.d(TAG, "Script starting")

        engineJob = scope.launch {
            try {
                scriptBlock()
                state.set(State.IDLE)
                Log.d(TAG, "Script completed")
            } catch (e: CancellationException) {
                state.set(State.STOPPED)
                Log.d(TAG, "Script cancelled")
            } catch (e: Exception) {
                state.set(State.IDLE)
                Log.e(TAG, "Script error", e)
            }
        }
    }

    fun stop() {
        engineJob?.cancel()
        engineJob = null
        state.set(State.STOPPED)
        Log.d(TAG, "Script stopped")
    }

    /**
     * 对齐按键精灵 onStopScript 回调：停止后重置为 IDLE 状态
     * 按键精灵中 OooOoO0() 将状态设为 1 (IDLE)
     */
    fun stopAndReset() {
        engineJob?.cancel()
        engineJob = null
        state.set(State.IDLE)
        Log.d(TAG, "Script stopped and reset to IDLE")
    }

    fun pause() {
        if (state.compareAndSet(State.RUNNING, State.PAUSED)) {
            Log.d(TAG, "Script paused")
        }
    }

    fun resume() {
        if (state.compareAndSet(State.PAUSED, State.RUNNING)) {
            Log.d(TAG, "Script resumed")
        }
    }

    /** 在脚本循环中调用，检查暂停/停止 */
    suspend fun checkPausePoint() {
        while (state.get() == State.PAUSED) {
            delay(100)
        }
        if (state.get() == State.STOPPED) {
            throw CancellationException("Script stopped")
        }
    }

    fun release() {
        stop()
        scope.cancel()
    }
}
