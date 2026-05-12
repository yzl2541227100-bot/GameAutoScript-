package com.example.myapplication.engine

/**
 * 脚本状态回调接口（对齐次元助手 InterfaceC3988ii）
 *
 * 用于引擎向上层（悬浮窗/主界面）通知状态变化
 */
interface ScriptStateCallback {
    /** 引擎初始化完成 */
    fun onEngineReady()

    /** 脚本开始运行 */
    fun onScriptStart()

    /** 脚本停止 (code: 0=正常, 1=异常, 2=用户停止) */
    fun onScriptStop(code: Int, message: String)

    /** 脚本暂停 */
    fun onScriptPause()

    /** 脚本恢复 */
    fun onScriptResume()

    /** 脚本错误 */
    fun onScriptError(message: String)

    /** 心跳失败 (failures: 连续失败次数) */
    fun onHeartbeatFailed(failures: Int)

    /** 脚本自动重启 */
    fun onScriptRestart(attempt: Int)

    /** 日志消息 */
    fun onLogMessage(level: String, tag: String, message: String)
}

/**
 * 空实现，方便只覆盖需要的方法
 */
open class SimpleScriptStateCallback : ScriptStateCallback {
    override fun onEngineReady() {}
    override fun onScriptStart() {}
    override fun onScriptStop(code: Int, message: String) {}
    override fun onScriptPause() {}
    override fun onScriptResume() {}
    override fun onScriptError(message: String) {}
    override fun onHeartbeatFailed(failures: Int) {}
    override fun onScriptRestart(attempt: Int) {}
    override fun onLogMessage(level: String, tag: String, message: String) {}
}
