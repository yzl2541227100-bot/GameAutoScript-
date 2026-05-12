package com.example.myapplication

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.util.Log
import com.example.myapplication.engine.NetworkChecker
import com.example.myapplication.engine.ScriptLogger

/**
 * 应用入口（对齐次元助手 AppContext）
 *
 * 职责：
 * - 创建通知渠道
 * - 初始化日志管理器
 * - 启动网络监听
 */
class ScriptApp : Application() {

    companion object {
        const val TAG = "ScriptApp"
        const val CHANNEL_FLOATING = "floating_window"
        const val CHANNEL_SCRIPT = "script_running"

        lateinit var instance: ScriptApp
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        createNotificationChannels()
        ScriptLogger.init(this)
        NetworkChecker.startMonitoring(this)
        Log.d(TAG, "App initialized")
        ScriptLogger.log("I", TAG, "应用启动")
    }

    override fun onTerminate() {
        NetworkChecker.stopMonitoring(this)
        ScriptLogger.close()
        super.onTerminate()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val manager = getSystemService(NotificationManager::class.java)
            listOf(
                NotificationChannel(CHANNEL_FLOATING, "悬浮窗", NotificationManager.IMPORTANCE_LOW),
                NotificationChannel(CHANNEL_SCRIPT, "脚本运行", NotificationManager.IMPORTANCE_LOW)
            ).forEach { manager.createNotificationChannel(it) }
        }
    }
}
