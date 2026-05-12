package com.example.myapplication.script

import android.graphics.Bitmap
import android.graphics.Color
import android.util.Log
import com.example.myapplication.ocr.OcrHelper

/**
 * 游戏界面识别器（对齐次元助手 MQAuxiliary.CompareColorEx 方案）
 *
 * 识别策略（按优先级）：
 * 1. 多点比色（毫秒级，最可靠）— 每个页面定义几个特征像素点
 * 2. OCR 文字识别（兜底）— 当比色无法确定时使用
 *
 * 使用方法：
 * - 在游戏中截图，用取色工具获取每个页面的特征点坐标和颜色
 * - 填入 screenSignatures 中
 * - 运行时自动按分辨率缩放坐标
 *
 * 坐标基准：1280×720（横屏）
 */
class GameScreenRecognizer(
    private val baseW: Int = 1280,
    private val baseH: Int = 720
) {

    enum class Screen {
        UNKNOWN,
        MAIN_CITY,          // 主城界面
        WORLD_MAP,          // 世界地图
        WAR_LIST,           // 集结/战争列表
        RALLY_DETAIL,       // 集结详情（配队界面）
        SEARCH_PANEL,       // 搜索面板
        TROOP_SELECT,       // 部队选择/配队
        MARCH_CONFIRM,      // 出征确认
        RESOURCE_INFO,      // 资源点信息弹窗
        BUILDING_INFO,      // 建筑信息界面
        TECH_PANEL,         // 科技/研究面板
        RECRUIT_PANEL,      // 招兵面板
        BACKPACK,           // 背包/道具
        MAIL_BOX,           // 邮件
        ALLIANCE_PANEL,     // 同盟面板
        DIALOG_POPUP,       // 通用弹窗（半透明遮罩）
        LOADING,            // 加载中（全黑）
        LOGIN_PAGE,         // 登录页
    }

    companion object {
        private const val TAG = "ScreenRecognizer"
    }

    var screenWidth = 1280
    var screenHeight = 720

    var lastOcrResults: List<OcrHelper.OcrResult> = emptyList()
        private set

    // ==================== 页面特征签名（多点比色数据） ====================
    // 格式: "x,y,RRGGBB|x,y,RRGGBB|..."  (基于 1280×720 基准坐标)
    //
    // ⚠️ 这些颜色值需要从实际游戏截图中取色获得！
    // 当前为示例值，需要你在游戏中截图后用取色工具替换为真实值。
    //
    // 取色方法：
    // 1. 在游戏中进入目标页面
    // 2. 截图保存
    // 3. 用画图/PS/取色工具获取特征点的 RGB 颜色
    // 4. 选择该页面独有的、不会变化的 UI 元素（如按钮背景、边框、图标固定色块）
    // 5. 每个页面至少3-5个特征点，越多越可靠

    private val screenSignatures = mapOf(
        // 主城：左下角有"天下格"按钮区域的特征色 + 右上角资源栏特征色
        Screen.MAIN_CITY to listOf(
            // TODO: 从实际截图取色替换
            // "50,690,2B5F2B|150,690,2B5F2B|1200,30,3D2B1A"
        ),

        // 世界地图：左下角有"主城"按钮 + 地图背景色
        Screen.WORLD_MAP to listOf(
            // TODO: 从实际截图取色替换
            // "50,690,1A3D1A|640,360,4A7A3A"
        ),

        // 集结/战争列表：列表背景色 + 标题栏特征
        Screen.WAR_LIST to listOf(
            // TODO: 从实际截图取色替换
        ),

        // 配队界面：底部"出征"/"加入集结"按钮区域特征色
        Screen.TROOP_SELECT to listOf(
            // TODO: 从实际截图取色替换
        ),

        // 搜索面板：搜索框背景 + 标签栏特征
        Screen.SEARCH_PANEL to listOf(
            // TODO: 从实际截图取色替换
        ),
    )

    // ==================== 主识别方法 ====================

    /**
     * 综合识别当前界面（比色优先 + OCR 兜底）
     */
    suspend fun recognizeWithOcr(bitmap: Bitmap): Screen {
        screenWidth = bitmap.width
        screenHeight = bitmap.height

        // Step 1: 快速检测特殊状态（纯像素判断，最快）
        if (isLoading(bitmap)) return Screen.LOADING
        if (isDialogPopup(bitmap)) return Screen.DIALOG_POPUP

        // Step 2: 多点比色识别（毫秒级）
        val colorResult = recognizeByColor(bitmap)
        if (colorResult != Screen.UNKNOWN) {
            Log.d(TAG, "比色识别: $colorResult")
            // 仍然做 OCR 以便后续任务使用文字信息
            lastOcrResults = OcrHelper.recognizeText(bitmap)
            return colorResult
        }

        // Step 3: OCR 文字识别（兜底，较慢但通用）
        lastOcrResults = OcrHelper.recognizeText(bitmap)
        val ocrResult = recognizeByOcr(lastOcrResults)
        Log.d(TAG, "OCR识别: $ocrResult")
        return ocrResult
    }

    /**
     * 仅用比色快速识别（不做 OCR，用于高频检测）
     */
    fun recognizeByColorOnly(bitmap: Bitmap): Screen {
        screenWidth = bitmap.width
        screenHeight = bitmap.height
        if (isLoading(bitmap)) return Screen.LOADING
        if (isDialogPopup(bitmap)) return Screen.DIALOG_POPUP
        return recognizeByColor(bitmap)
    }

    // ==================== 多点比色识别 ====================

    private fun recognizeByColor(bitmap: Bitmap): Screen {
        for ((screen, signatures) in screenSignatures) {
            if (signatures.isEmpty()) continue
            for (sig in signatures) {
                if (sig.isBlank()) continue
                if (matchColorSignature(bitmap, sig)) {
                    return screen
                }
            }
        }
        return Screen.UNKNOWN
    }

    /**
     * 检查一组颜色特征点是否全部匹配
     * @param colorDesc 格式: "x,y,RRGGBB|x,y,RRGGBB|..."（基于 baseW×baseH）
     */
    private fun matchColorSignature(bitmap: Bitmap, colorDesc: String, similarity: Float = 0.85f): Boolean {
        val points = colorDesc.split("|")
        if (points.isEmpty()) return false

        var matchCount = 0
        val totalPoints = points.size

        for (point in points) {
            val parts = point.trim().split(",")
            if (parts.size < 3) continue

            // 坐标按分辨率缩放
            val baseX = parts[0].trim().toIntOrNull() ?: continue
            val baseY = parts[1].trim().toIntOrNull() ?: continue
            val colorHex = parts[2].trim()

            val x = sx(baseX)
            val y = sy(baseY)

            if (x < 0 || x >= bitmap.width || y < 0 || y >= bitmap.height) continue

            val pixel = bitmap.getPixel(x, y)
            val target = parseColor(colorHex)

            if (colorMatch(pixel, target, similarity)) {
                matchCount++
            }
        }

        // 要求至少 80% 的点匹配（容忍个别点被遮挡）
        return matchCount >= (totalPoints * 0.8).toInt() && matchCount > 0
    }

    // ==================== OCR 文字识别（兜底） ====================

    private fun recognizeByOcr(ocrResults: List<OcrHelper.OcrResult>): Screen {
        val allText = ocrResults.joinToString(" ") { it.text }
        Log.d(TAG, "OCR文本: $allText")

        return when {
            // 配队/出征界面（最具体的先匹配）
            allText.contains("加入集结") && allText.contains("一键搭配") -> Screen.RALLY_DETAIL
            allText.contains("出征") && (allText.contains("一键搭配") || allText.contains("队伍")) -> Screen.TROOP_SELECT
            allText.contains("出征") && allText.contains("行军") -> Screen.MARCH_CONFIRM

            // 集结/战争列表
            allText.contains("战争") && (allText.contains("集结") || allText.contains("加入")) -> Screen.WAR_LIST

            // 搜索面板
            allText.contains("搜索") && (allText.contains("资源") || allText.contains("野怪") || allText.contains("蛮族")) -> Screen.SEARCH_PANEL

            // 资源点信息
            allText.contains("采集") && (allText.contains("储量") || allText.contains("等级")) -> Screen.RESOURCE_INFO

            // 建筑信息
            allText.contains("升级") && allText.contains("等级") -> Screen.BUILDING_INFO

            // 科技面板
            allText.contains("研究") && (allText.contains("科技") || allText.contains("学院")) -> Screen.TECH_PANEL

            // 招兵面板
            (allText.contains("训练") || allText.contains("招募")) && allText.contains("兵") -> Screen.RECRUIT_PANEL

            // 背包
            allText.contains("背包") || (allText.contains("道具") && allText.contains("使用")) -> Screen.BACKPACK

            // 邮件
            allText.contains("邮件") || allText.contains("收件箱") -> Screen.MAIL_BOX

            // 同盟面板
            allText.contains("同盟") && (allText.contains("科技") || allText.contains("成员") || allText.contains("任务")) -> Screen.ALLIANCE_PANEL

            // 主城（有"天下格"按钮说明在主城）
            allText.contains("天下格") -> Screen.MAIN_CITY
            allText.contains("建造") && allText.contains("升级") -> Screen.MAIN_CITY

            // 世界地图（有"主城"按钮说明在世界地图）
            allText.contains("主城") && !allText.contains("建造") -> Screen.WORLD_MAP

            // 登录页
            allText.contains("登录") || allText.contains("开始游戏") || allText.contains("进入游戏") -> Screen.LOGIN_PAGE

            else -> Screen.UNKNOWN
        }
    }

    // ==================== 特殊状态检测（纯像素） ====================

    /**
     * 检测是否为弹窗（四角暗 + 中心亮 = 半透明遮罩弹窗）
     */
    private fun isDialogPopup(bmp: Bitmap): Boolean {
        val corners = listOf(
            Pair(20, 20), Pair(1260, 20),
            Pair(20, 700), Pair(1260, 700)
        )
        var darkCount = 0
        for ((bx, by) in corners) {
            val p = pxSafe(bmp, sx(bx), sy(by))
            if (p != null && brightness(p) < 40) darkCount++
        }
        val center = pxSafe(bmp, sx(640), sy(360))
        return darkCount >= 3 && center != null && brightness(center) > 100
    }

    /**
     * 检测是否为加载中（大面积黑屏）
     */
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

    // ==================== 工具方法 ====================

    fun sx(x: Int): Int = x * screenWidth / baseW
    fun sy(y: Int): Int = y * screenHeight / baseH

    private fun pxSafe(bmp: Bitmap, x: Int, y: Int): Int? {
        if (x < 0 || x >= bmp.width || y < 0 || y >= bmp.height) return null
        return bmp.getPixel(x, y)
    }

    private fun brightness(pixel: Int) =
        (Color.red(pixel) + Color.green(pixel) + Color.blue(pixel)) / 3

    private fun colorMatch(pixel: Int, target: Int, similarity: Float): Boolean {
        val threshold = ((1.0f - similarity) * 255).toInt()
        val rDiff = kotlin.math.abs(Color.red(pixel) - Color.red(target))
        val gDiff = kotlin.math.abs(Color.green(pixel) - Color.green(target))
        val bDiff = kotlin.math.abs(Color.blue(pixel) - Color.blue(target))
        return rDiff <= threshold && gDiff <= threshold && bDiff <= threshold
    }

    private fun parseColor(hex: String): Int {
        val clean = hex.removePrefix("#").removePrefix("0x")
        return try {
            val rgb = clean.toLong(16).toInt()
            Color.rgb((rgb shr 16) and 0xFF, (rgb shr 8) and 0xFF, rgb and 0xFF)
        } catch (_: Exception) { Color.BLACK }
    }

    // ==================== 旧接口兼容 ====================

    fun recognize(bitmap: Bitmap): Screen {
        return recognizeByColorOnly(bitmap)
    }
}
