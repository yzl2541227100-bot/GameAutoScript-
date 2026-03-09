package com.example.myapplication.ipc

/**
 * IPC 接口定义 - 完整实现参考 reference 项目所有接口
 */

/** 基础脚本监听 (对应 BasicScriptListener) */
interface BasicScriptListener {
    fun onStartScript()
    fun onStopScript(code: Int, message: String)
    fun onPause()
    fun onResume()
    fun onScriptIsRunning()
}

/** 脚本监听 (对应 OnScriptListener) */
interface OnScriptListener : BasicScriptListener {
    fun onSetControlBarVisible(visible: Int)
    fun onUpdateControlBarPos(scale: Float, x: Int, y: Int)
}

/** 引擎启动回调 (对应 OnEngineStartCallback) */
interface OnEngineStartCallback {
    fun onEngineStart(code: Int)
}

/** 请求回调 (对应 OnRequestCallback) */
interface OnRequestCallback {
    fun onCallback(code: Int, data: String)
}

/** 脚本命令回调 (对应 OnMqScriptCallback) */
interface OnMqScriptCallback {
    fun callback(data: String)
}

/** 截图回调 (对应 OnScreenShotCallback) */
interface OnScreenShotCallback {
    fun onScreenShotDone(path: String, data: ByteArray)
    fun onScreenShotFailed(code: Int)
}

/** 特殊命令回调 (对应 OnSpecialMqCmdCallback) */
interface OnSpecialMqCmdCallback {
    fun doSpecialFunction(type: Int, data: String)
    fun getForegroundPackage(): String
    fun getRunningPackages(): String
    fun inputText(text: String)
    fun keyPress(keyCode: Int)
    fun killApp(packageName: String)
    fun launchApp(packageName: String)
}

/** 按键事件监听 (对应 OnKeyEventListener) */
interface OnKeyEventListener {
    fun onKeyEvent(keyCode: Int, action: Int): Boolean
}

/** Root 进度监听 (对应 RootProgressListener) */
interface RootProgressListener {
    fun onProgress(progress: Int, message: String)
}

/** 录制脚本回调 (对应 OnRecordScriptCallback) */
interface OnRecordScriptCallback {
    fun onOpenRecord()
    fun onStartRecord(mode: Int)
    fun onFinishRecord(script: String)
}

/** RPC 回调 (对应 OnRpcCallback) */
interface OnRpcCallback {
    fun onRpcReturn(result: Any?)
}

/** UI 元素回调 (对应 OnUiElementCallback, 继承 OnScreenShotCallback) */
interface OnUiElementCallback : OnScreenShotCallback {
    fun onUiElementBack(data: String)
}

/** 脚本状态观察者 (对应 ScriptStateObserver) */
interface ScriptStateObserver {
    fun onStartScript()
    fun onStopScript(code: Int, message: String)
    fun onScriptIsRunning()
}

/** 引擎状态观察者 (对应 EngineStateObserver) */
interface EngineStateObserver {
    fun onConnected(info: Any?)
    fun onCrash(error: Any?)
    fun onExit()
}

/** IPC 接收回调 (对应 OnIpcReceivedCallback) */
interface OnIpcReceivedCallback

/** 脚本消息回调 (对应 OnScriptMessageCallback) */
interface OnScriptMessageCallback {
    fun onDebugMessage(data: ByteArray)
    fun onTracePrint(message: String)
}

/** Root 申请回调 (对应 OnRootApplyCallback) */
interface OnRootApplyCallback {
    fun onObtained()
    fun onRefused()
}

/** 应用退出监听 (对应 AppQuitListener) */
interface AppQuitListener {
    fun onAppQuit()
}

/** 脚本命令 */
data class ScriptCommand(
    val action: String,
    val params: Map<String, String> = emptyMap()
) {
    companion object {
        const val ACTION_START = "start"
        const val ACTION_STOP = "stop"
        const val ACTION_PAUSE = "pause"
        const val ACTION_RESUME = "resume"
    }
}

/** 广播 Action 常量 */
object ScriptBroadcast {
    const val ACTION_COMMAND = "com.example.myapplication.SCRIPT_COMMAND"
    const val ACTION_STATE = "com.example.myapplication.SCRIPT_STATE"
    const val EXTRA_COMMAND = "command"
    const val EXTRA_STATE = "state"
}
