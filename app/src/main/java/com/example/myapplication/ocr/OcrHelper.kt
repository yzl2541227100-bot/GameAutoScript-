package com.example.myapplication.ocr

import android.graphics.Bitmap
import android.graphics.Rect
import android.util.Log
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * OCR 工具类 - 基于 Google ML Kit 中文文字识别 (bundled)
 *
 * 核心功能:
 * - 截图 → 识别所有文字 + 坐标
 * - 查找指定文字并返回其屏幕坐标
 * - 判断屏幕上是否存在某段文字
 */
object OcrHelper {

    private const val TAG = "OcrHelper"

    /** 识别到的文字块 */
    data class OcrResult(
        val text: String,
        val bounds: Rect,       // 文字在图片中的边界框
        val centerX: Int,       // 中心X坐标
        val centerY: Int,       // 中心Y坐标
        val confidence: Float   // 置信度 (ML Kit 不直接提供，默认1.0)
    )

    private val recognizer by lazy {
        TextRecognition.getClient(ChineseTextRecognizerOptions.Builder().build())
    }

    /**
     * 识别图片中的所有文字
     * @return 所有识别到的文字块列表
     */
    suspend fun recognizeText(bitmap: Bitmap): List<OcrResult> {
        return suspendCancellableCoroutine { cont ->
            val image = InputImage.fromBitmap(bitmap, 0)
            recognizer.process(image)
                .addOnSuccessListener { visionText ->
                    val results = mutableListOf<OcrResult>()
                    for (block in visionText.textBlocks) {
                        for (line in block.lines) {
                            val bounds = line.boundingBox ?: continue
                            results.add(OcrResult(
                                text = line.text,
                                bounds = bounds,
                                centerX = bounds.centerX(),
                                centerY = bounds.centerY(),
                                confidence = 1.0f
                            ))
                            // 也添加每个元素(单词级别)
                            for (element in line.elements) {
                                val eBounds = element.boundingBox ?: continue
                                results.add(OcrResult(
                                    text = element.text,
                                    bounds = eBounds,
                                    centerX = eBounds.centerX(),
                                    centerY = eBounds.centerY(),
                                    confidence = 1.0f
                                ))
                            }
                        }
                    }
                    Log.d(TAG, "OCR识别完成: ${results.size}个文字块")
                    if (cont.isActive) cont.resume(results)
                }
                .addOnFailureListener { e ->
                    Log.e(TAG, "OCR识别失败", e)
                    if (cont.isActive) cont.resume(emptyList())
                }
        }
    }

    /**
     * 查找包含指定关键词的文字块
     * @param keyword 要查找的关键词 (支持部分匹配)
     * @return 匹配的文字块列表，按Y坐标排序
     */
    suspend fun findText(bitmap: Bitmap, keyword: String): List<OcrResult> {
        val all = recognizeText(bitmap)
        return all.filter { it.text.contains(keyword) }
            .sortedBy { it.centerY }
    }

    /**
     * 查找指定文字并返回其中心坐标
     * @return 第一个匹配的中心坐标 Pair(x, y)，未找到返回 null
     */
    suspend fun findTextPosition(bitmap: Bitmap, keyword: String): Pair<Int, Int>? {
        val results = findText(bitmap, keyword)
        return results.firstOrNull()?.let { Pair(it.centerX, it.centerY) }
    }

    /**
     * 判断屏幕上是否存在指定文字
     */
    suspend fun hasText(bitmap: Bitmap, keyword: String): Boolean {
        return findText(bitmap, keyword).isNotEmpty()
    }

    /**
     * 查找指定文字，返回其右侧的点击坐标
     * (用于点击文字右边的按钮，比如找到"孟获"后点击右边的"加入")
     * @param offsetX 向右偏移的像素数
     */
    suspend fun findTextRightSide(bitmap: Bitmap, keyword: String, offsetX: Int = 100): Pair<Int, Int>? {
        val results = findText(bitmap, keyword)
        val match = results.firstOrNull() ?: return null
        return Pair(match.bounds.right + offsetX, match.centerY)
    }

    /**
     * 获取所有识别文字的调试信息
     */
    suspend fun debugAllText(bitmap: Bitmap): String {
        val results = recognizeText(bitmap)
        val sb = StringBuilder()
        sb.appendLine("=== OCR结果 (${results.size}个) ===")
        for (r in results) {
            sb.appendLine("  \"${r.text}\" @ (${r.centerX},${r.centerY}) [${r.bounds}]")
        }
        return sb.toString()
    }
}
