package com.example.myapplication

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Process
import android.util.Log
import com.example.myapplication.receiver.NetStateReceiver
import java.io.BufferedReader
import java.io.FileReader

/**
 * 应用入口 - 多进程架构
 * 进程: main / :enginfloat / :daemon / :remote
 */
class ScriptApp : Application() {

    companion object {
        const val TAG = "ScriptApp"
        const val CHANNEL_FLOATING = "floating_window"
        const val CHANNEL_DAEMON = "daemon_service"
        const val CHANNEL_SCRIPT = "script_running"

        lateinit var instance: ScriptApp
            private set

        /** 当前进程名 */
        var currentProcessName: String = ""
            private set

        /** 是否主进程 */
        val isMainProcess: Boolean
            get() = currentProcessName == instance.packageName
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        currentProcessName = resolveProcessName()
        Log.d(TAG, "onCreate in process: $currentProcessName")

        when {
            isMainProcess -> onMainProcessInit()
            currentProcessName.endsWith(":enginfloat") -> onFloatingProcessInit()
            currentProcessName.endsWith(":daemon") -> onDaemonProcessInit()
            currentProcessName.endsWith(":remote") -> onRemoteProcessInit()
        }
    }

    /** 主进程初始化 */
    private fun onMainProcessInit() {
        createNotificationChannels()
        // 注册网络状态监听
        NetStateReceiver.register(this)
        // 加载 native 库
        try {
            System.loadLibrary("mqm")
            Log.d(TAG, "Native lib loaded")
        } catch (e: UnsatisfiedLinkError) {
            Log.w(TAG, "Native lib not found, running without native support")
        }
    }

    /** 悬浮窗进程初始化 */
    private fun onFloatingProcessInit() {
        createNotificationChannels()
    }

    /** 守护进程初始化 */
    private fun onDaemonProcessInit() {
        createNotificationChannels()
    }

    /** 远程偏好进程初始化 */
    private fun onRemoteProcessInit() {
        // 轻量初始化
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val manager = getSystemService(NotificationManager::class.java)
            val channels = listOf(
                NotificationChannel(CHANNEL_FLOATING, "悬浮窗", NotificationManager.IMPORTANCE_LOW),
                NotificationChannel(CHANNEL_DAEMON, "守护服务", NotificationManager.IMPORTANCE_LOW),
                NotificationChannel(CHANNEL_SCRIPT, "脚本运行", NotificationManager.IMPORTANCE_LOW)
            )
            channels.forEach { manager.createNotificationChannel(it) }
        }
    }

    private fun resolveProcessName(): String {
        return try {
            BufferedReader(FileReader("/proc/${Process.myPid()}/cmdline")).use {
                it.readLine().trim { c -> c <= ' ' || c == '\u0000' }
            }
        } catch (e: Exception) {
            packageName
        }
    }
}
