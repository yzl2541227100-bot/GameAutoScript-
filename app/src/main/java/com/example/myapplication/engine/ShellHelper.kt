package com.example.myapplication.engine

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import java.io.File

/**
 * Shell 命令封装 - 模拟器环境下的触控/截图工具
 * 通过 shell 命令实现，模拟器有 root 权限可直接使用
 */
object ShellHelper {

    private const val TAG = "ShellHelper"

    /** 点击 */
    fun tap(x: Float, y: Float) {
        exec("input tap ${x.toInt()} ${y.toInt()}")
    }

    /** 滑动 */
    fun swipe(x1: Float, y1: Float, x2: Float, y2: Float, duration: Int = 300) {
        exec("input swipe ${x1.toInt()} ${y1.toInt()} ${x2.toInt()} ${y2.toInt()} $duration")
    }

    /** 长按 */
    fun longPress(x: Float, y: Float, duration: Int = 1000) {
        exec("input swipe ${x.toInt()} ${y.toInt()} ${x.toInt()} ${y.toInt()} $duration")
    }

    /** 按键 */
    fun keyPress(keyCode: Int) {
        exec("input keyevent $keyCode")
    }

    /** 返回键 */
    fun pressBack() = keyPress(4)

    /** Home键 */
    fun pressHome() = keyPress(3)

    /** 输入文字 */
    fun inputText(text: String) {
        exec("input text ${text.replace(" ", "%s")}")
    }

    /** 启动应用 */
    fun launchApp(packageName: String) {
        exec("monkey -p $packageName -c android.intent.category.LAUNCHER 1")
    }

    /** 截图到文件并返回Bitmap */
    fun screencap(path: String = "/sdcard/screen.png"): Bitmap? {
        return try {
            val process = Runtime.getRuntime().exec(arrayOf("sh", "-c", "screencap -p $path"))
            process.waitFor()
            val file = File(path)
            if (file.exists()) BitmapFactory.decodeFile(path) else null
        } catch (e: Exception) {
            Log.e(TAG, "screencap failed", e)
            null
        }
    }

    private fun exec(cmd: String) {
        try {
            val process = Runtime.getRuntime().exec(arrayOf("sh", "-c", cmd))
            process.waitFor()
        } catch (e: Exception) {
            Log.e(TAG, "exec failed: $cmd", e)
        }
    }
}
