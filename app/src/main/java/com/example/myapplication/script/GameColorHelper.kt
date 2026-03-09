package com.example.myapplication.script

import android.graphics.Bitmap
import android.graphics.Color
import kotlin.math.abs

/**
 * 纯 Kotlin 实现的颜色比较工具
 * 替代 native 层的 compareColorEx / findMultiColor
 * 支持偃武游戏的屏幕识别需求
 */
object GameColorHelper {

    /**
     * 比较多个点的颜色是否匹配
     * @param bitmap 截图
     * @param colorDesc 颜色描述字符串，格式: "x1,y1,RRGGBB|x2,y2,RRGGBB|..."
     * @param similarity 相似度 0.0~1.0
     * @return 匹配的点数
     */
    fun compareColorEx(bitmap: Bitmap, colorDesc: String, similarity: Float = 0.9f): Int {
        if (colorDesc.isBlank()) return 0
        val points = colorDesc.split("|")
        var matched = 0
        for (point in points) {
            val parts = point.trim().split(",")
            if (parts.size < 3) continue
            val x = parts[0].trim().toIntOrNull() ?: continue
            val y = parts[1].trim().toIntOrNull() ?: continue
            val colorHex = parts[2].trim()
            if (x < 0 || x >= bitmap.width || y < 0 || y >= bitmap.height) continue
            val pixel = bitmap.getPixel(x, y)
            if (colorMatch(pixel, parseColor(colorHex), similarity)) matched++
        }
        return matched
    }

    /**
     * 检查所有颜色点是否都匹配
     */
    fun compareColorAll(bitmap: Bitmap, colorDesc: String, similarity: Float = 0.9f): Boolean {
        if (colorDesc.isBlank()) return false
        val points = colorDesc.split("|")
        for (point in points) {
            val parts = point.trim().split(",")
            if (parts.size < 3) continue
            val x = parts[0].trim().toIntOrNull() ?: continue
            val y = parts[1].trim().toIntOrNull() ?: continue
            val colorHex = parts[2].trim()
            if (x < 0 || x >= bitmap.width || y < 0 || y >= bitmap.height) return false
            val pixel = bitmap.getPixel(x, y)
            if (!colorMatch(pixel, parseColor(colorHex), similarity)) return false
        }
        return true
    }

    /**
     * 在指定区域内查找多点颜色匹配
     * @param bitmap 截图
     * @param left,top,right,bottom 搜索区域
     * @param firstColor 第一个颜色 "RRGGBB"
     * @param offsetColors 偏移颜色 "dx1|dy1|RRGGBB,dx2|dy2|RRGGBB,..."
     * @param similarity 相似度
     * @param result 输出找到的坐标 [x, y]
     * @return 是否找到
     */
    fun findMultiColor(
        bitmap: Bitmap,
        left: Int, top: Int, right: Int, bottom: Int,
        firstColor: String, offsetColors: String,
        similarity: Float = 0.9f, result: IntArray? = null
    ): Boolean {
        val fc = parseColor(firstColor)
        val offsets = parseOffsetColors(offsetColors)
        val l = left.coerceIn(0, bitmap.width - 1)
        val t = top.coerceIn(0, bitmap.height - 1)
        val r = right.coerceIn(0, bitmap.width - 1)
        val b = bottom.coerceIn(0, bitmap.height - 1)

        for (y in t..b) {
            for (x in l..r) {
                val pixel = bitmap.getPixel(x, y)
                if (!colorMatch(pixel, fc, similarity)) continue
                // 检查偏移点
                var allMatch = true
                for ((dx, dy, oc) in offsets) {
                    val nx = x + dx; val ny = y + dy
                    if (nx < 0 || nx >= bitmap.width || ny < 0 || ny >= bitmap.height) {
                        allMatch = false; break
                    }
                    if (!colorMatch(bitmap.getPixel(nx, ny), oc, similarity)) {
                        allMatch = false; break
                    }
                }
                if (allMatch) {
                    result?.let { if (it.size >= 2) { it[0] = x; it[1] = y } }
                    return true
                }
            }
        }
        return false
    }

    /**
     * 获取指定坐标的颜色
     */
    fun getPixelColor(bitmap: Bitmap, x: Int, y: Int): Int {
        if (x < 0 || x >= bitmap.width || y < 0 || y >= bitmap.height) return 0
        return bitmap.getPixel(x, y)
    }

    /**
     * 检查指定坐标颜色是否匹配
     */
    fun isColor(bitmap: Bitmap, x: Int, y: Int, colorHex: String, similarity: Float = 0.9f): Boolean {
        if (x < 0 || x >= bitmap.width || y < 0 || y >= bitmap.height) return false
        return colorMatch(bitmap.getPixel(x, y), parseColor(colorHex), similarity)
    }

    // ===== 内部方法 =====

    private fun colorMatch(pixel: Int, target: Int, similarity: Float): Boolean {
        val threshold = ((1.0f - similarity) * 255).toInt()
        val rDiff = abs(Color.red(pixel) - Color.red(target))
        val gDiff = abs(Color.green(pixel) - Color.green(target))
        val bDiff = abs(Color.blue(pixel) - Color.blue(target))
        return rDiff <= threshold && gDiff <= threshold && bDiff <= threshold
    }

    private fun parseColor(hex: String): Int {
        val clean = hex.removePrefix("#").removePrefix("0x")
        return try {
            val rgb = clean.toLong(16).toInt()
            Color.rgb((rgb shr 16) and 0xFF, (rgb shr 8) and 0xFF, rgb and 0xFF)
        } catch (_: Exception) { Color.BLACK }
    }

    private data class OffsetColor(val dx: Int, val dy: Int, val color: Int)

    private fun parseOffsetColors(desc: String): List<OffsetColor> {
        if (desc.isBlank()) return emptyList()
        return desc.split(",").mapNotNull { item ->
            val parts = item.trim().split("|")
            if (parts.size >= 3) {
                val dx = parts[0].trim().toIntOrNull() ?: return@mapNotNull null
                val dy = parts[1].trim().toIntOrNull() ?: return@mapNotNull null
                OffsetColor(dx, dy, parseColor(parts[2].trim()))
            } else null
        }
    }
}
