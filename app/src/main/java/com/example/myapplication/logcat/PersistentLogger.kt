package com.example.myapplication.logcat

import android.content.Context
import com.example.myapplication.entity.ScriptLog
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * 持久化日志管理器
 * 将脚本运行日志保存到文件，支持查询和清理
 */
object PersistentLogger {

    private const val LOG_DIR = "ScriptLogs"
    private const val MAX_LOG_FILES = 50

    /** 保存日志到文件 */
    fun saveLog(context: Context, name: String, content: String): ScriptLog {
        val dir = File(context.getExternalFilesDir(null), LOG_DIR)
        if (!dir.exists()) dir.mkdirs()

        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val fileName = "${name}_$timestamp.log"
        val file = File(dir, fileName)
        file.writeText(content)

        cleanOldLogs(dir)

        return ScriptLog(
            name = name,
            size = formatSize(file.length()),
            file = file
        )
    }

    /** 获取所有日志文件 */
    fun getLogList(context: Context): List<ScriptLog> {
        val dir = File(context.getExternalFilesDir(null), LOG_DIR)
        if (!dir.exists()) return emptyList()

        return dir.listFiles()
            ?.filter { it.isFile && it.extension == "log" }
            ?.sortedByDescending { it.lastModified() }
            ?.map { file ->
                ScriptLog(
                    name = file.nameWithoutExtension,
                    size = formatSize(file.length()),
                    file = file
                )
            } ?: emptyList()
    }

    /** 读取日志内容 */
    fun readLog(log: ScriptLog): String {
        return log.file?.readText() ?: ""
    }

    /** 删除日志 */
    fun deleteLog(log: ScriptLog): Boolean {
        return log.file?.delete() ?: false
    }

    /** 清除所有日志 */
    fun clearAll(context: Context) {
        val dir = File(context.getExternalFilesDir(null), LOG_DIR)
        dir.listFiles()?.forEach { it.delete() }
    }

    private fun cleanOldLogs(dir: File) {
        val files = dir.listFiles()?.sortedByDescending { it.lastModified() } ?: return
        if (files.size > MAX_LOG_FILES) {
            files.drop(MAX_LOG_FILES).forEach { it.delete() }
        }
    }

    private fun formatSize(bytes: Long): String = when {
        bytes < 1024 -> "${bytes}B"
        bytes < 1024 * 1024 -> "${bytes / 1024}KB"
        else -> "${"%.1f".format(bytes / 1024.0 / 1024.0)}MB"
    }
}
