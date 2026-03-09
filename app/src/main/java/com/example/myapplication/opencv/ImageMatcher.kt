package com.example.myapplication.opencv

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import org.opencv.android.OpenCVLoader
import org.opencv.android.Utils
import org.opencv.core.Core
import org.opencv.core.CvType
import org.opencv.core.Mat
import org.opencv.core.Point
import org.opencv.imgproc.Imgproc

/**
 * OpenCV 模板匹配工具类
 * 用于在截图中查找游戏按钮/图标的位置
 *
 * 使用方式:
 * 1. 将模板图片放入 assets/templates/ 目录
 * 2. 调用 findImage() 查找模板在截图中的位置
 * 3. 调用 hasImage() 判断截图中是否存在某个模板
 */
object ImageMatcher {

    private const val TAG = "ImageMatcher"
    private var initialized = false

    // 模板缓存 (避免重复加载)
    private val templateCache = mutableMapOf<String, Mat>()

    /** 初始化 OpenCV */
    fun init(): Boolean {
        if (initialized) return true
        initialized = OpenCVLoader.initLocal()
        if (!initialized) {
            Log.e(TAG, "OpenCV 初始化失败")
        } else {
            Log.d(TAG, "OpenCV 初始化成功")
        }
        return initialized
    }

    /**
     * 在截图中查找模板图片的位置
     * @param screenshot 截图 Bitmap
     * @param template 模板 Bitmap
     * @param threshold 匹配阈值 (0.0~1.0)，越高越严格，推荐 0.8
     * @return 匹配到的中心坐标 Pair(x, y)，未找到返回 null
     */
    fun findImage(screenshot: Bitmap, template: Bitmap, threshold: Double = 0.8): Pair<Int, Int>? {
        if (!init()) return null
        try {
            val srcMat = bitmapToMat(screenshot)
            val tplMat = bitmapToMat(template)
            if (tplMat.cols() > srcMat.cols() || tplMat.rows() > srcMat.rows()) {
                srcMat.release(); tplMat.release()
                return null
            }
            val result = Mat()
            Imgproc.matchTemplate(srcMat, tplMat, result, Imgproc.TM_CCOEFF_NORMED)
            val mmr = Core.minMaxLoc(result)
            result.release()

            return if (mmr.maxVal >= threshold) {
                val x = (mmr.maxLoc.x + tplMat.cols() / 2.0).toInt()
                val y = (mmr.maxLoc.y + tplMat.rows() / 2.0).toInt()
                Log.d(TAG, "匹配成功: ($x,$y) 置信度=${mmr.maxVal}")
                srcMat.release(); tplMat.release()
                Pair(x, y)
            } else {
                Log.d(TAG, "未匹配: 最高置信度=${mmr.maxVal} < $threshold")
                srcMat.release(); tplMat.release()
                null
            }
        } catch (e: Exception) {
            Log.e(TAG, "findImage 异常", e)
            return null
        }
    }

    /**
     * 在截图中查找所有匹配位置
     * @return 所有匹配的中心坐标列表
     */
    fun findAllImages(screenshot: Bitmap, template: Bitmap, threshold: Double = 0.8): List<Pair<Int, Int>> {
        if (!init()) return emptyList()
        try {
            val srcMat = bitmapToMat(screenshot)
            val tplMat = bitmapToMat(template)
            if (tplMat.cols() > srcMat.cols() || tplMat.rows() > srcMat.rows()) {
                srcMat.release(); tplMat.release()
                return emptyList()
            }
            val result = Mat()
            Imgproc.matchTemplate(srcMat, tplMat, result, Imgproc.TM_CCOEFF_NORMED)

            val matches = mutableListOf<Pair<Int, Int>>()
            val tw = tplMat.cols(); val th = tplMat.rows()
            for (y in 0 until result.rows()) {
                for (x in 0 until result.cols()) {
                    if (result.get(y, x)[0] >= threshold) {
                        val cx = x + tw / 2; val cy = y + th / 2
                        // 去重: 如果已有相近的点则跳过
                        if (matches.none { kotlin.math.abs(it.first - cx) < tw / 2 && kotlin.math.abs(it.second - cy) < th / 2 }) {
                            matches.add(Pair(cx, cy))
                        }
                    }
                }
            }
            srcMat.release(); tplMat.release(); result.release()
            return matches
        } catch (e: Exception) {
            Log.e(TAG, "findAllImages 异常", e)
            return emptyList()
        }
    }

    /**
     * 判断截图中是否存在模板图片
     */
    fun hasImage(screenshot: Bitmap, template: Bitmap, threshold: Double = 0.8): Boolean {
        return findImage(screenshot, template, threshold) != null
    }

    /**
     * 从 assets 加载模板图片
     * @param context Context
     * @param name 模板文件名 (在 assets/templates/ 下)
     */
    fun loadTemplate(context: Context, name: String): Bitmap? {
        return try {
            context.assets.open("templates/$name").use {
                BitmapFactory.decodeStream(it)
            }
        } catch (e: Exception) {
            Log.e(TAG, "加载模板失败: $name", e)
            null
        }
    }

    /**
     * 从 assets 加载模板并缓存为 Mat
     */
    fun loadTemplateMat(context: Context, name: String): Mat? {
        templateCache[name]?.let { return it }
        val bmp = loadTemplate(context, name) ?: return null
        val mat = bitmapToMat(bmp)
        bmp.recycle()
        templateCache[name] = mat
        return mat
    }

    /** 在截图中查找 assets 模板 */
    fun findTemplate(context: Context, screenshot: Bitmap, templateName: String, threshold: Double = 0.8): Pair<Int, Int>? {
        val tpl = loadTemplate(context, templateName) ?: return null
        val result = findImage(screenshot, tpl, threshold)
        tpl.recycle()
        return result
    }

    /** 判断截图中是否存在 assets 模板 */
    fun hasTemplate(context: Context, screenshot: Bitmap, templateName: String, threshold: Double = 0.8): Boolean {
        return findTemplate(context, screenshot, templateName, threshold) != null
    }

    private fun bitmapToMat(bitmap: Bitmap): Mat {
        val mat = Mat(bitmap.height, bitmap.width, CvType.CV_8UC4)
        Utils.bitmapToMat(bitmap, mat)
        // 转为 BGR (OpenCV 默认)
        val bgr = Mat()
        Imgproc.cvtColor(mat, bgr, Imgproc.COLOR_RGBA2BGR)
        mat.release()
        return bgr
    }

    /** 释放所有缓存 */
    fun release() {
        templateCache.values.forEach { it.release() }
        templateCache.clear()
    }
}
