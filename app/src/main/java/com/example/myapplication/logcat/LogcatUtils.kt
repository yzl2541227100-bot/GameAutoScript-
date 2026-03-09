package com.example.myapplication.logcat

import android.content.Context
import java.io.*
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.text.SimpleDateFormat
import java.util.*

/**
 * Logcat 日志工具 - 参考 LogcatUtils.java
 * 捕获和保存 logcat 日志到文件
 */
object LogcatUtils {

    private const val FILE_TYPE = "Logcat"
    private const val TAG_FILTER_FILE = "logcat_tag_filter.txt"
    private val CHARSET_UTF8: Charset = StandardCharsets.UTF_8

    /** 保存日志到文件 */
    fun saveLogToFile(context: Context, data: List<String>): File {
        val dir = context.getExternalFilesDir(FILE_TYPE)!!
        if (!dir.isDirectory) dir.delete()
        if (!dir.exists()) dir.mkdirs()

        val fileName = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date()) + ".txt"
        val file = File(dir, fileName)
        if (!file.isFile) file.delete()
        if (!file.exists()) file.createNewFile()

        BufferedWriter(OutputStreamWriter(FileOutputStream(file, false), CHARSET_UTF8)).use { writer ->
            for (line in data) {
                writer.write(line.replace("\n", "\r\n") + "\r\n\r\n")
            }
            writer.flush()
        }
        return file
    }

    /** 写入文件 (通用) */
    fun writeFile(fileDir: String, fileName: String, lines: List<String>, append: Boolean = false) {
        try {
            val dir = File(fileDir)
            if (!dir.isDirectory) dir.delete()
            if (!dir.exists()) dir.mkdirs()

            val file = File(dir, fileName)
            if (!file.isFile) file.delete()
            if (!file.exists()) file.createNewFile()

            FileWriter(file, append).use { fw ->
                for (line in lines) {
                    val content = line.replace("\n", "\r\n") + "\r\n\r\n"
                    if (content.isNotBlank()) {
                        fw.write(content)
                        fw.flush()
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /** 读取 tag 过滤器 */
    fun readTagFilter(context: Context): List<String> {
        val tags = mutableListOf<String>()
        val file = File(context.getExternalFilesDir(FILE_TYPE), TAG_FILTER_FILE)
        if (!file.exists() || !file.isFile) return tags

        BufferedReader(InputStreamReader(FileInputStream(file), CHARSET_UTF8)).use { reader ->
            var line = reader.readLine()
            while (line != null) {
                if (line.isNotBlank() && !tags.contains(line)) {
                    tags.add(line)
                }
                line = reader.readLine()
            }
        }
        return tags
    }

    /** 写入 tag 过滤器 */
    fun writeTagFilter(context: Context, tags: List<String>): File {
        val file = File(context.getExternalFilesDir(FILE_TYPE), TAG_FILTER_FILE)
        if (tags.isEmpty()) return file

        if (!file.isFile) file.delete()
        if (!file.exists()) file.createNewFile()

        BufferedWriter(OutputStreamWriter(FileOutputStream(file, false), CHARSET_UTF8)).use { writer ->
            for (tag in tags) {
                writer.write(tag + "\r\n")
            }
            writer.flush()
        }
        return file
    }

    /** 捕获当前 logcat */
    fun captureLogcat(tag: String? = null, lines: Int = 200): List<String> {
        val result = mutableListOf<String>()
        try {
            val cmd = buildList {
                add("logcat")
                add("-d")
                add("-t")
                add(lines.toString())
                if (tag != null) {
                    add("$tag:V")
                    add("*:S")
                }
            }
            val process = Runtime.getRuntime().exec(cmd.toTypedArray())
            BufferedReader(InputStreamReader(process.inputStream)).use { reader ->
                var line = reader.readLine()
                while (line != null) {
                    result.add(line)
                    line = reader.readLine()
                }
            }
            process.waitFor()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return result
    }

    /** 清除 logcat */
    fun clearLogcat() {
        try {
            Runtime.getRuntime().exec(arrayOf("logcat", "-c"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /** 计算 MD5 */
    fun computeMD5(input: String): String? {
        return try {
            val hash = MessageDigest.getInstance("MD5").digest(input.toByteArray(CHARSET_UTF8))
            val hex = StringBuilder(hash.size * 2)
            for (b in hash) {
                val v = b.toInt() and 0xFF
                if (v < 16) hex.append("0")
                hex.append(Integer.toHexString(v))
            }
            hex.toString()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
