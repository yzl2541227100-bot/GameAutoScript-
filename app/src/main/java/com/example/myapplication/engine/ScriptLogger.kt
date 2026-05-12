package com.example.myapplication.engine

import android.content.Context
import android.os.Environment
import android.util.Log
import java.io.File
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue

/**
 * 日志管理器（对齐次元助手 C3688ae）
 *
 * 功能：
 * - 内存日志队列（供 UI 展示）
 * - 文件日志持久化（自动轮转，保留最近3个文件）
 * - 线程安全
 */
object ScriptLogger {

    private const val TAG = "ScriptLogger"
    private const val MAX_MEMORY_LOGS = 500
    private const val MAX_LOG_FILES = 3
    private const val LOG_DIR_NAME = "ScriptLogs"

    data class LogEntry(
        val level: String,
        val tag: String,
        val message: String,
        val time: Long = System.currentTimeMillis()
    ) {
        fun format(): String {
            val sdf = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault())
            return "[${sdf.format(Date(time))}][$level][$tag] $message"
        }
    }

    private val memoryLogs = ConcurrentLinkedQueue<LogEntry>()
    private var logDir: File? = null
    private var currentLogFile: File? = null
    private var fileWriter: FileWriter? = null
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.getDefault())
    private val timeFormat = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault())

    /** 初始化日志目录 */
    fun init(context: Context) {
        try {
            logDir = File(context.getExternalFilesDir(null), LOG_DIR_NAME)
            logDir!!.mkdirs()
            rotateLogFiles()
            createNewLogFile()
            Log.d(TAG, "Logger initialized: ${currentLogFile?.absolutePath}")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to init logger", e)
        }
    }

    /** 写入日志 */
    fun log(level: String, tag: String, message: String) {
        val entry = LogEntry(level, tag, message)

        // 内存队列
        memoryLogs.add(entry)
        while (memoryLogs.size > MAX_MEMORY_LOGS) {
            memoryLogs.poll()
        }

        // 文件写入
        writeToFile(entry)
    }

    /** 获取内存中的日志列表 */
    fun getLogs(): List<LogEntry> = memoryLogs.toList()

    /** 获取最近 N 条日志 */
    fun getRecentLogs(count: Int): List<LogEntry> {
        val list = memoryLogs.toList()
        return if (list.size <= count) list else list.subList(list.size - count, list.size)
    }

    /** 清空内存日志 */
    fun clear() {
        memoryLogs.clear()
    }

    /** 关闭文件写入 */
    fun close() {
        try {
            fileWriter?.flush()
            fileWriter?.close()
            fileWriter = null
        } catch (_: Exception) {}
    }

    /** 获取日志文件目录 */
    fun getLogDir(): File? = logDir

    /** 获取所有日志文件 */
    fun getLogFiles(): List<File> {
        return logDir?.listFiles()?.filter { it.extension == "log" }
            ?.sortedByDescending { it.lastModified() } ?: emptyList()
    }

    private fun writeToFile(entry: LogEntry) {
        try {
            val writer = fileWriter ?: return
            writer.append(entry.format())
            writer.append("\n")
            writer.flush()
        } catch (e: Exception) {
            // 静默失败，不影响主流程
        }
    }

    private fun createNewLogFile() {
        try {
            val fileName = "script_${dateFormat.format(Date())}.log"
            currentLogFile = File(logDir, fileName)
            fileWriter = FileWriter(currentLogFile, true)
            fileWriter?.append("=== Script Log Started: ${Date()} ===\n")
            fileWriter?.flush()
        } catch (e: Exception) {
            Log.e(TAG, "Failed to create log file", e)
        }
    }

    /** 日志文件轮转：保留最近 MAX_LOG_FILES 个文件 */
    private fun rotateLogFiles() {
        try {
            val files = logDir?.listFiles()?.filter { it.extension == "log" }
                ?.sortedByDescending { it.lastModified() } ?: return
            if (files.size >= MAX_LOG_FILES) {
                for (i in MAX_LOG_FILES - 1 until files.size) {
                    files[i].delete()
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to rotate logs", e)
        }
    }
}
