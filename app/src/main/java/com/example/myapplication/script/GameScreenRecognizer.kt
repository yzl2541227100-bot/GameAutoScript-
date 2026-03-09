package com.example.myapplication.script

import android.graphics.Bitmap
import android.graphics.Color
import android.util.Log
import com.example.myapplication.ocr.OcrHelper

class GameScreenRecognizer(
    private val baseW: Int = 1280,
    private val baseH: Int = 720
) {

    enum class Screen {
        UNKNOWN,
        MAIN_CITY,
        WORLD_MAP,
        WAR_LIST,
        SEARCH_PANEL,
        TROOP_SELECT,
        MARCH_CONFIRM,
        DIALOG_POPUP,
        LOADING,
        LOGIN_PAGE,
    }

    companion object {
        private const val TAG = "ScreenRecognizer"
    }

    var screenWidth = 1280
    var screenHeight = 720

    fun sx(x: Int): Int = x * screenWidth / baseW
    fun sy(y: Int): Int = y * screenHeight / baseH

    var lastOcrResults: List<OcrHelper.OcrResult> = emptyList()
        private set

    suspend fun recognizeWithOcr(bitmap: Bitmap): Screen {
        screenWidth = bitmap.width
        screenHeight = bitmap.height
        if (isLoading(bitmap)) return Screen.LOADING
        if (isDialogPopup(bitmap)) return Screen.DIALOG_POPUP
        lastOcrResults = OcrHelper.recognizeText(bitmap)
        val allText = lastOcrResults.joinToString(" ") { it.text }
        Log.d(TAG, "OCR: $allText")
        return when {
            allText.contains("战争") -> Screen.WAR_LIST
            allText.contains("加入集结") || allText.contains("一键搭配") -> Screen.TROOP_SELECT
            allText.contains("采集令") || allText.contains("搜索资源") -> Screen.SEARCH_PANEL
            allText.contains("出征") -> Screen.MARCH_CONFIRM
            allText.contains("天下格") -> Screen.MAIN_CITY
            allText.contains("主城") && !allText.contains("战争") -> Screen.WORLD_MAP
            allText.contains("招募") && allText.contains("武将") -> {
                if (allText.contains("建造")) Screen.MAIN_CITY else Screen.WORLD_MAP
            }
            else -> Screen.UNKNOWN
        }
    }

    fun recognize(bitmap: Bitmap): Screen {
        screenWidth = bitmap.width
        screenHeight = bitmap.height
        if (isLoading(bitmap)) return Screen.LOADING
        if (isDialogPopup(bitmap)) return Screen.DIALOG_POPUP
        return Screen.UNKNOWN
    }

    private fun isDialogPopup(bmp: Bitmap): Boolean {
        val corners = listOf(Pair(20, 20), Pair(1260, 20), Pair(20, 700), Pair(1260, 700))
        var darkCount = 0
        for ((bx, by) in corners) {
            val p = pxSafe(bmp, sx(bx), sy(by))
            if (p != null && brightness(p) < 40) darkCount++
        }
        val center = pxSafe(bmp, sx(640), sy(360))
        return darkCount >= 4 && center != null && brightness(center) > 100
    }

    private fun isLoading(bmp: Bitmap): Boolean {
        val pts = listOf(
            Pair(200, 200), Pair(640, 200), Pair(1080, 200),
            Pair(200, 360), Pair(640, 360), Pair(1080, 360),
            Pair(200, 520), Pair(640, 520), Pair(1080, 520),
        )
        return pts.count { (bx, by) ->
            val p = pxSafe(bmp, sx(bx), sy(by))
            p != null && brightness(p) < 25
        } >= 8
    }

    private fun pxSafe(bmp: Bitmap, x: Int, y: Int): Int? {
        if (x < 0 || x >= bmp.width || y < 0 || y >= bmp.height) return null
        return bmp.getPixel(x, y)
    }

    private fun brightness(pixel: Int) =
        (Color.red(pixel) + Color.green(pixel) + Color.blue(pixel)) / 3
}