package com.example.myapplication.inject

import android.content.Context
import android.os.Build
import android.util.Log
import java.io.File
import java.io.FileOutputStream

/**
 * 注入管理器 - 多架构注入文件管理
 * 从 assets 释放对应架构的注入文件到私有目录
 */
class InjectManager(private val context: Context) {

    companion object {
        const val TAG = "InjectManager"
        private const val INJECT_DIR = "inject"
    }

    /** 获取当前设备架构 */
    fun getCurrentArch(): String {
        val abis = Build.SUPPORTED_ABIS
        return when {
            abis.contains("arm64-v8a") -> "arm64-v8a"
            abis.contains("armeabi-v7a") -> "armeabi-v7a"
            abis.contains("x86") -> "x86"
            else -> abis.firstOrNull() ?: "armeabi-v7a"
        }
    }

    /** 释放注入文件到私有目录 */
    fun extractInjectFiles(): File? {
        val arch = getCurrentArch()
        val targetDir = File(context.filesDir, "$INJECT_DIR/$arch")
        if (!targetDir.exists()) targetDir.mkdirs()

        return try {
            val assetPath = "$INJECT_DIR/$arch"
            val files = context.assets.list(assetPath) ?: return null

            for (fileName in files) {
                val targetFile = File(targetDir, fileName)
                if (targetFile.exists()) continue

                context.assets.open("$assetPath/$fileName").use { input ->
                    FileOutputStream(targetFile).use { output ->
                        input.copyTo(output)
                    }
                }
                // 设置可执行权限
                targetFile.setExecutable(true, false)
                Log.d(TAG, "Extracted: ${targetFile.absolutePath}")
            }
            targetDir
        } catch (e: Exception) {
            Log.e(TAG, "Extract inject files failed", e)
            null
        }
    }

    /** 执行注入 (需要 root 权限) */
    fun executeInject(targetPid: Int): Boolean {
        val arch = getCurrentArch()
        val injectBin = File(context.filesDir, "$INJECT_DIR/$arch/inject")
        if (!injectBin.exists()) {
            Log.e(TAG, "Inject binary not found")
            return false
        }

        return try {
            val process = Runtime.getRuntime().exec(
                arrayOf("su", "-c", "${injectBin.absolutePath} $targetPid")
            )
            val exitCode = process.waitFor()
            Log.d(TAG, "Inject result: $exitCode")
            exitCode == 0
        } catch (e: Exception) {
            Log.e(TAG, "Inject failed", e)
            false
        }
    }

    /** 修改截图模式 (injectModifyCaptureMode) */
    fun modifyCaptureMode(enable: Boolean): Boolean {
        return try {
            val cmd = if (enable) "settings put system capture_mode 1"
                else "settings put system capture_mode 0"
            val process = Runtime.getRuntime().exec(arrayOf("su", "-c", cmd))
            process.waitFor() == 0
        } catch (e: Exception) {
            Log.e(TAG, "Modify capture mode failed", e)
            false
        }
    }
}
