package com.example.myapplication.engine

import android.app.Application

/**
 * JNI 桥接层 - 与 native libmqm.so 交互
 * 参考 ElfinNativeJni + MQLanguageStub + MQUipStub
 */
object NativeJni {

    private var isLoaded = false

    fun ensureLoaded() {
        if (!isLoaded) {
            try {
                System.loadLibrary("mqm")
                isLoaded = true
            } catch (_: UnsatisfiedLinkError) {}
        }
    }

    // ==================== ElfinNativeJni 对应方法 ====================

    /** 初始化基础参数 */
    external fun initBaseParam(context: Any, appPath: String, dataPath: String, arch: String): Int
    /** 获取加密字符串 */
    external fun getString(key: String): String
    /** 请求域名 */
    external fun requestDomain(type: Int): String
    /** 设置密钥 */
    external fun setKeys(publicKey: String, privateKey: String): Int
    /** 执行脚本命令 */
    external fun executeCommand(cmd: String, args: String): String
    /** 释放资源 */
    external fun release()

    // ==================== MQLanguageStub 对应方法 ====================

    /** 初始化引擎 */
    external fun enginInit()
    /** 初始化 Runner */
    external fun initRunner(app: Application, dir: String)
    /** 编译脚本 */
    external fun compile(script: String, dir: String, outDir: String, type: Int): Int
    /** 运行脚本 */
    external fun run(script: String, dir: String, outDir: String, type: Int, mode: Int, sid: Long, extra: String): Int
    /** 暂停 */
    external fun pause(): Int
    /** 恢复 */
    external fun resume(): Int
    /** 停止 */
    external fun stop(): Int
    /** 退出 */
    external fun quitApp()
    /** 设置本地目录 */
    external fun setLocalDir(dir1: String, dir2: String, dir3: String, dir4: String)
    /** 设置进程名 */
    external fun setProcess(name: String)
    /** 设置 SID */
    external fun setSid(sid: Long)
    /** 设置是否写日志到文件 */
    external fun setWriteLog2File(enable: Boolean)
    /** 设置是否使用无障碍 */
    external fun setIsAccessibility(enable: Boolean)
    /** 设置注册码 */
    external fun setRegCode(code: String)
    /** 设置心跳时间 */
    external fun setHeartBeatTime(interval: Int, timeout: Int)
    /** 发送悬浮窗事件 */
    external fun sendFloatEvent(data: ByteArray)
    /** 发送请求 */
    external fun request(data: String)
    /** 设置屏幕信息 */
    external fun setScreenInfo(width: Float, height: Float)

    // ==================== MQUipStub 对应方法 ====================

    /** 启动脚本循环 */
    external fun startLoop(script: String, sid: Long, dir: String, extra: String): Int
    /** 启动脚本循环 (字节数组) */
    external fun startLoopBytes(data: ByteArray, sid: Long): Int
    /** 停止脚本循环 */
    external fun stopLoop(): Boolean

    // ==================== MQAuxiliary 对应方法 ====================

    /** 初始化辅助模块 */
    external fun auxInit()
    /** 清除辅助模块 */
    external fun auxClear()
    /** 截屏 */
    external fun screenCap(outSize: IntArray): ByteArray
    /** 保持截屏 */
    external fun keepCapture(enable: Boolean)
    /** 颜色比较 */
    external fun compareColorEx(colorStr: String, similarity: Float): Int
    /** 多点找色 */
    external fun findMultiColor(
        x1: Int, y1: Int, x2: Int, y2: Int,
        firstColor: String, offsetColors: String,
        direction: Int, similarity: Float, result: IntArray
    ): Boolean
    /** 设置图像裁剪 */
    external fun setImageCrop(enable: Boolean, x: Int, y: Int, w: Int, h: Int)
    /** 设置屏幕旋转 */
    external fun setScreenRotation(rotation: Int)
    /** 设置屏幕缩放 */
    external fun setScreenScale(scaleX: Float, scaleY: Float)
    /** 等待按键 */
    external fun waitKey(): Int
}
