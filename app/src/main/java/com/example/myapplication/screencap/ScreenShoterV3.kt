package com.example.myapplication.screencap

import android.annotation.TargetApi
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import android.hardware.display.DisplayManager
import android.media.Image
import android.media.ImageReader
import android.media.projection.MediaProjection
import android.media.projection.MediaProjectionManager
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.view.WindowManager
import java.nio.ByteBuffer

/**
 * MediaProjection 截图器 - 参考 ScreenShoterV3.java
 * 通过 VirtualDisplay + ImageReader 实现高效截图
 */
@TargetApi(21)
class ScreenShoterV3 private constructor() {

    companion object {
        private const val TAG = "ScreenShoterV3"

        @Volatile
        private var instance: ScreenShoterV3? = null

        fun getInstance(): ScreenShoterV3 {
            return instance ?: synchronized(this) {
                instance ?: ScreenShoterV3().also { instance = it }
            }
        }
    }

    private var context: Context? = null
    private var resultIntent: Intent? = null
    private var projection: MediaProjection? = null
    private var imageReader: ImageReader? = null
    private var virtualDisplay: android.hardware.display.VirtualDisplay? = null
    private var handlerThread: HandlerThread? = null
    private var handler: Handler? = null

    private var screenWidth = 0
    private var screenHeight = 0
    private var screenDensity = 0
    private var rotation = 0

    private var isInited = false
    private var isCapturing = false

    @Volatile
    private var imageReady = false
    private var lastBitmap: Bitmap? = null
    private var lastImageData: ScreenShotImage? = null

    private val lock = Any()

    /** 初始化 (由 ForScreenShotActivity 回调) */
    fun init(context: Context, resultIntent: Intent) {
        if (isInited) return
        isInited = true
        this.context = context.applicationContext
        this.resultIntent = resultIntent
        this.screenDensity = android.content.res.Resources.getSystem().displayMetrics.densityDpi
    }

    fun init(context: Context, resultIntent: Intent, projection: MediaProjection) {
        if (isInited) return
        isInited = true
        this.context = context.applicationContext
        this.resultIntent = resultIntent
        this.screenDensity = android.content.res.Resources.getSystem().displayMetrics.densityDpi
        this.projection = projection
    }

    fun isInited(): Boolean = isInited

    /** 更新屏幕尺寸 */
    fun updateScreenSize() {
        if (!isInited) return
        imageReady = false
        val ctx = context ?: return
        val wm = ctx.getSystemService(Context.WINDOW_SERVICE) as? WindowManager ?: return
        val display = wm.defaultDisplay
        val metrics = android.util.DisplayMetrics()
        display.getRealMetrics(metrics)
        rotation = display.rotation
        val w = metrics.widthPixels
        val h = metrics.heightPixels
        if (screenWidth == w && screenHeight == h) return
        screenWidth = w
        screenHeight = h
    }

    /** 启动截图 */
    private fun startCapture() {
        releaseCapture() // 只释放 display/reader，保留 projection
        updateScreenSize()

        val ctx = context ?: return
        // 如果 projection 已经由 ScreenCaptureService 传入，直接使用；否则尝试自行获取（低版本兼容）
        if (projection == null && resultIntent != null) {
            val mgr = ctx.getSystemService(Context.MEDIA_PROJECTION_SERVICE) as? MediaProjectionManager
            projection = mgr?.getMediaProjection(-1, resultIntent!!)
        }
        if (projection == null) {
            Log.e(TAG, "No MediaProjection available")
            return
        }

        handlerThread = HandlerThread("imageReaderHandler").also { it.start() }
        handler = Handler(handlerThread!!.looper)

        imageReader = ImageReader.newInstance(screenWidth, screenHeight, android.graphics.PixelFormat.RGBA_8888, 3)
        virtualDisplay = projection?.createVirtualDisplay(
            "screen-mirror",
            screenWidth, screenHeight, screenDensity,
            DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR,
            imageReader!!.surface, null, null
        )

        isCapturing = true
        // 持续监听，每次有新帧就更新 lastBitmap
        imageReader?.setOnImageAvailableListener({ reader ->
            val image = reader.acquireLatestImage() ?: return@setOnImageAvailableListener
            try {
                val bmp = imageToBitmap(image)
                if (bmp != null) {
                    // 回收旧的 lastBitmap（如果不同对象）
                    val old = lastBitmap
                    lastBitmap = bmp
                    if (old != null && old !== bmp && !old.isRecycled) {
                        old.recycle()
                    }
                    imageReady = true
                }
            } catch (e: Exception) {
                // imageToBitmap 内部已 close image
            }
        }, handler)
    }

    /** 获取截图 (返回 Bitmap) — 每次返回最新帧的拷贝 */
    fun obtainScreenShotBitmap(cropTop: Int = 0, cropBottom: Int = 0): Bitmap? {
        if (!imageReady || virtualDisplay == null) {
            synchronized(lock) {
                startCapture()
                // 等待第一帧
                var tries = 0
                while (!imageReady && tries++ < 100) {
                    try { Thread.sleep(20) } catch (_: InterruptedException) {}
                }
            }
        } else {
            // VirtualDisplay 已在运行，等一小段时间让最新帧刷新
            try { Thread.sleep(50) } catch (_: InterruptedException) {}
        }

        val bmp = lastBitmap ?: return null
        return try {
            if (bmp.isRecycled) null
            else bmp.copy(bmp.config ?: Bitmap.Config.ARGB_8888, false)
        } catch (e: Exception) {
            Log.e(TAG, "Copy bitmap failed", e)
            null
        }
    }

    /** 获取截图 (返回原始数据) */
    fun obtainScreenShotImage(): ScreenShotImage? {
        if (!imageReady || virtualDisplay == null) {
            synchronized(lock) {
                startCapture()
                var tries = 0
                while (!imageReady && tries++ < 100) {
                    try { Thread.sleep(20) } catch (_: InterruptedException) {}
                }
            }
        } else {
            try { Thread.sleep(50) } catch (_: InterruptedException) {}
        }
        return lastImageData
    }

    /** Image -> Bitmap */
    private fun imageToBitmap(image: Image, cropTop: Int = 0, cropBottom: Int = 0): Bitmap? {
        return try {
            val width = image.width
            val height = image.height
            val planes = image.planes
            val buffer = planes[0].buffer
            val pixelStride = planes[0].pixelStride
            val rowStride = planes[0].rowStride
            val rowPadding = (rowStride - pixelStride * width) / pixelStride

            val bmp = Bitmap.createBitmap(width + rowPadding, height, Bitmap.Config.ARGB_8888)
            bmp.copyPixelsFromBuffer(buffer)

            // 不旋转: 游戏是横屏的，保持原始方向
            // 如果有 rowPadding 导致宽度多余，裁剪掉
            val result = if (rowPadding > 0 && width > 0) {
                val cropped = Bitmap.createBitmap(bmp, 0, 0, width, height)
                bmp.recycle()
                cropped
            } else bmp

            // 裁剪
            if (cropTop != 0 || cropBottom != 0) {
                val w = result.width
                val h = result.height
                val cropped = Bitmap.createBitmap(result, 0, cropTop, w, h - cropTop * 2)
                result.recycle()
                cropped
            } else result
        } catch (e: Exception) {
            null
        } finally {
            image.close()
        }
    }

    /** Image -> ScreenShotImage (原始数据) */
    private fun extractImageData(image: Image): ScreenShotImage? {
        return try {
            val planes = image.planes
            val buffer = planes[0].buffer
            val data = ByteArray(buffer.capacity())
            buffer.get(data)

            ScreenShotImage(
                width = image.width,
                height = image.height,
                rotation = rotation,
                rowStride = planes[0].rowStride,
                pixelStride = planes[0].pixelStride,
                data = data
            )
        } catch (e: Exception) {
            null
        } finally {
            image.close()
        }
    }

    /** 释放截图资源（保留 projection） */
    private fun releaseCapture() {
        imageReady = false
        isCapturing = false
        screenWidth = 0
        screenHeight = 0
        rotation = 0

        synchronized(lock) {
            imageReader?.setOnImageAvailableListener(null, null)
            handlerThread?.quit()
            handlerThread = null
            handler?.removeCallbacksAndMessages(null)
            handler = null
            virtualDisplay?.release()
            virtualDisplay = null
            imageReader?.close()
            imageReader = null
            lastBitmap?.let { if (!it.isRecycled) it.recycle() }
            lastBitmap = null
            lastImageData = null
        }
    }

    /** 释放资源 */
    fun recycle() {
        imageReady = false
        isCapturing = false
        isInited = false
        screenWidth = 0
        screenHeight = 0
        rotation = 0

        synchronized(lock) {
            handlerThread?.quit()
            handlerThread = null
            handler?.removeCallbacksAndMessages(null)
            handler = null
            projection?.stop()
            projection = null
            virtualDisplay?.release()
            virtualDisplay = null
            imageReader?.close()
            imageReader = null
        }
    }
}
