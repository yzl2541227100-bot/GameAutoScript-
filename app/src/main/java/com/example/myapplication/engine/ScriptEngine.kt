package com.example.myapplication.engine

import android.content.Context
import android.util.Log
import com.example.myapplication.ipc.OnScriptListener
import com.example.myapplication.ipc.OnEngineStartCallback
import com.example.myapplication.ipc.OnRequestCallback
import com.example.myapplication.ipc.OnMqScriptCallback
import com.example.myapplication.ipc.OnSpecialMqCmdCallback
import com.example.myapplication.ipc.OnRecordScriptCallback
import com.example.myapplication.ipc.OnRpcCallback
import com.example.myapplication.ipc.ScriptStateObserver
import com.example.myapplication.ipc.EngineStateObserver
import com.example.myapplication.entity.ScriptControlConstant
import com.example.myapplication.record.ScriptRecorder
import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicReference

/**
 * 脚本引擎 - 完整生命周期管理
 * 参考 MqRunnerLite + MqBridge: start/stop/pause/resume + IPC 回调
 */
class ScriptEngine(private val context: Context) {

    companion object {
        const val TAG = "ScriptEngine"

        @Volatile
        private var instance: ScriptEngine? = null

        fun getInstance(context: Context): ScriptEngine {
            return instance ?: synchronized(this) {
                instance ?: ScriptEngine(context.applicationContext).also { instance = it }
            }
        }
    }

    enum class State { IDLE, RUNNING, PAUSED, STOPPED }

    private val state = AtomicReference(State.IDLE)
    private var engineJob: Job? = null
    private val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())
    val action = ScriptAction(context)

    // IPC 回调 (对应 MqRunnerLite 的各种回调)
    var scriptListener: OnScriptListener? = null
    var engineStartCallback: OnEngineStartCallback? = null
    var requestCallback: OnRequestCallback? = null
    var mqScriptCallback: OnMqScriptCallback? = null
    var specialCmdCallback: OnSpecialMqCmdCallback? = null
    var recordCallback: OnRecordScriptCallback? = null
    var rpcCallback: OnRpcCallback? = null
    var stateObserver: ScriptStateObserver? = null
    var engineObserver: EngineStateObserver? = null

    // 脚本录制器
    val recorder = ScriptRecorder()

    // 脚本控制参数 (对应 ScriptControlConstant)
    var loopCount: Int = ScriptControlConstant.RUN_ONE_TIME
    var loopInterval: Long = 0

    fun getState(): State = state.get()
    fun isScriptStarted(): Boolean = state.get() == State.RUNNING

    /** 重置状态为 IDLE (停止后重新运行前调用) */
    fun resetState() {
        if (state.get() == State.STOPPED) {
            state.set(State.IDLE)
        }
    }

    /** 初始化引擎 (对应 MqBridge.init) */
    fun init(
        appPath: String = context.applicationInfo.sourceDir,
        dataPath: String = context.filesDir.absolutePath,
        arch: String = android.os.Build.SUPPORTED_ABIS.firstOrNull() ?: "arm64-v8a"
    ) {
        try {
            NativeJni.ensureLoaded()
            NativeJni.initBaseParam(context, appPath, dataPath, arch)
            engineStartCallback?.onEngineStart(0)
            Log.d(TAG, "Engine initialized")
        } catch (e: Exception) {
            engineStartCallback?.onEngineStart(-1)
            Log.e(TAG, "Engine init failed", e)
        }
    }

    /** 启动脚本 (对应 MqRunnerLite.start) */
    fun start(scriptBlock: suspend ScriptAction.() -> Unit) {
        val current = state.get()
        if (current == State.RUNNING) {
            scriptListener?.onScriptIsRunning()
            stateObserver?.onScriptIsRunning()
            return
        }
        // 如果是 STOPPED 状态，先重置
        if (current == State.STOPPED) {
            state.set(State.IDLE)
        }
        state.set(State.RUNNING)
        scriptListener?.onStartScript()
        stateObserver?.onStartScript()
        Log.d(TAG, "Script starting from state=$current")

        engineJob = scope.launch {
            try {
                Log.d(TAG, "Script started, loopCount=$loopCount")
                val loops = if (loopCount == ScriptControlConstant.LOOP_FOREVER) Int.MAX_VALUE else loopCount
                for (i in 1..loops) {
                    checkPausePoint()
                    action.scriptBlock()
                    if (i < loops && loopInterval > 0) {
                        delay(loopInterval)
                    }
                }
                state.set(State.IDLE)
                scriptListener?.onStopScript(0, "完成")
                stateObserver?.onStopScript(0, "完成")
            } catch (e: CancellationException) {
                state.set(State.STOPPED)
                scriptListener?.onStopScript(1, "已停止")
                stateObserver?.onStopScript(1, "已停止")
            } catch (e: Exception) {
                state.set(State.IDLE)
                scriptListener?.onStopScript(-1, "异常: ${e.message}")
                stateObserver?.onStopScript(-1, "异常: ${e.message}")
                Log.e(TAG, "Script error", e)
            }
        }
    }

    /** 停止脚本 (对应 MqRunnerLite.stop) */
    fun stop() {
        engineJob?.cancel()
        engineJob = null
        state.set(State.STOPPED)
        scriptListener?.onStopScript(1, "已停止")
        stateObserver?.onStopScript(1, "已停止")
        Log.d(TAG, "Script stopped")
    }

    /** 暂停脚本 (对应 MqRunnerLite.pause) */
    fun pause() {
        if (state.compareAndSet(State.RUNNING, State.PAUSED)) {
            scriptListener?.onPause()
            Log.d(TAG, "Script paused")
        }
    }

    /** 恢复脚本 (对应 MqRunnerLite.resume) */
    fun resume() {
        if (state.compareAndSet(State.PAUSED, State.RUNNING)) {
            scriptListener?.onResume()
            Log.d(TAG, "Script resumed")
        }
    }

    /** 暂停检查点 - 在脚本循环中调用 */
    suspend fun checkPausePoint() {
        while (state.get() == State.PAUSED) {
            delay(100)
        }
        if (state.get() == State.STOPPED) {
            throw CancellationException("Script stopped")
        }
    }

    /** 发送请求 (对应 MqRunnerLite.OooO0oo) */
    fun sendRequest(data: String) {
        requestCallback?.onCallback(0, data)
    }

    /** 通知旋转状态 (对应 MqRunnerLite.notifyRotationStatus) */
    fun notifyRotationStatus() {
        // 通知 native 层屏幕旋转变化
    }

    /** 设置图像裁剪 (对应 MqRunnerLite.setImageCrop) */
    fun setImageCrop(enable: Boolean, x: Int, y: Int, width: Int, height: Int) {
        // 传递给 native 层
    }

    /** 退出引擎 (对应 MqBridge.exit) */
    fun exit() {
        stop()
        recorder.cancelRecord()
        try { NativeJni.release() } catch (_: Exception) {}
        engineObserver?.onExit()
    }

    /** 释放资源 */
    fun release() {
        exit()
        action.release()
        scope.cancel()
        instance = null
    }
}
