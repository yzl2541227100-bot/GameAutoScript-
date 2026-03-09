package com.example.myapplication.script

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import com.example.myapplication.engine.ScriptAction
import com.example.myapplication.engine.ScriptEngine
import com.example.myapplication.ocr.OcrHelper
import com.example.myapplication.opencv.ImageMatcher
import com.example.myapplication.screencap.ScreenShoterV3
import com.example.myapplication.ui.ScriptLogger
import kotlinx.coroutines.delay
import kotlin.random.Random

/**
 * 游戏自动化脚本 - 偃武和平鸽助手
 * 横屏 1280×720 基准分辨率，运行时自动适配实际分辨率
 *
 * 识别策略:
 * - OCR (ML Kit) 用于文字识别（菜单文字、列表内容）
 * - OpenCV 模板匹配用于图标/按钮定位（需要模板图片）
 * - 百分比坐标作为兜底方案
 */
class GameScript(private val context: Context) {

    companion object {
        const val TAG = "GameScript"
        private const val BASE_W = 1280
        private const val BASE_H = 720
    }

    private val recognizer = GameScreenRecognizer(BASE_W, BASE_H)
    private val screenshoter = ScreenShoterV3.getInstance()
    private lateinit var config: ScriptConfig
    private lateinit var action: ScriptAction
    private lateinit var engine: ScriptEngine

    private var screenW = 1280
    private var screenH = 720
    private var lastRallyCheckTime = 0L
    private var lastDailyTime = 0L
    private var lastBuildCheckTime = 0L
    private var lastHuntTime = 0L
    private var lastTrainTime = 0L
    private var lastForgeTime = 0L
    private var lastGatherTime = 0L
    private var gatherPausedUntil = 0L
    private var loopCount = 0
    private var clickOffset = 5

    // ==================== 主入口 ====================

    suspend fun execute(scriptAction: ScriptAction, eng: ScriptEngine) {
        action = scriptAction
        engine = eng
        config = ScriptConfig.load(context)
        val dm = context.resources.displayMetrics
        screenW = maxOf(dm.widthPixels, dm.heightPixels)
        screenH = minOf(dm.widthPixels, dm.heightPixels)
        recognizer.screenWidth = screenW
        recognizer.screenHeight = screenH
        clickOffset = config.behaviorClickOffset

        action.setAccessibilityMode(true)
        ImageMatcher.init()
        log("脚本启动 分辨率=${screenW}x${screenH}")

        if (config.autoOpenGame) {
            log("打开游戏...")
            openGame()
            delay(8000)
        }

        // 首次截图校准实际尺寸
        val testBmp = takeScreenshot()
        if (testBmp != null) {
            screenW = testBmp.width
            screenH = testBmp.height
            recognizer.screenWidth = screenW
            recognizer.screenHeight = screenH
            log("实际截图尺寸: ${screenW}x${screenH}")
            testBmp.recycle()
        }

        // 主循环
        while (true) {
            engine.checkPausePoint()
            loopCount++
            log("=== 第 $loopCount 轮 ===")

            try {
                val bmp = takeScreenshot()
                if (bmp == null) { log("截图失败"); delay(3000); continue }
                screenW = bmp.width
                screenH = bmp.height
                recognizer.screenWidth = screenW
                recognizer.screenHeight = screenH

                val screen = recognizer.recognizeWithOcr(bmp)
                val ocrResults = recognizer.lastOcrResults
                bmp.recycle()
                log("识别: $screen")

                // 处理特殊界面
                if (handleSpecialScreen(screen)) { smartDelay(1000); continue }

                // 关闭空地弹窗
                if (hasOcrText(ocrResults, "空地") && hasOcrText(ocrResults, "所属同盟")) {
                    log("检测到空地信息弹窗，关闭")
                    tapBack()
                    smartDelay(1500)
                    continue
                }

                // 1. 加入集结 (优先)
                if (shouldRunRally()) {
                    val success = executeRallyJoin()
                    lastRallyCheckTime = now()
                    if (success) { smartDelay(2000); continue }
                }

                // 2. 日常任务
                if (shouldRun(lastDailyTime, 300_000)) {
                    executeDailyTasks()
                    lastDailyTime = now()
                }

                // 3. 开荒任务
                if (shouldRunBuild()) {
                    executePioneerTasks()
                    lastBuildCheckTime = now()
                }

                // 4. 采集
                if (config.gatherEnabled && now() > gatherPausedUntil) {
                    executeGatherTask()
                    lastGatherTime = now()
                }

            } catch (e: Exception) {
                log("异常: ${e.message}")
                Log.e(TAG, "Loop error", e)
            }
            smartDelay(3000)
        }
    }

    // ==================== 特殊界面处理 ====================

    private suspend fun handleSpecialScreen(screen: GameScreenRecognizer.Screen): Boolean {
        return when (screen) {
            GameScreenRecognizer.Screen.DIALOG_POPUP -> {
                log("弹窗，关闭")
                tapBack()
                smartDelay(1000)
                true
            }
            GameScreenRecognizer.Screen.LOADING -> {
                log("加载中...")
                smartDelay(3000)
                true
            }
            GameScreenRecognizer.Screen.LOGIN_PAGE -> {
                log("登录页")
                tapPercent(0.5, 0.7)
                smartDelay(5000)
                true
            }
            else -> false
        }
    }

    // ==================== OCR 辅助 ====================

    private fun hasOcrText(results: List<OcrHelper.OcrResult>, keyword: String): Boolean {
        return results.any { it.text.contains(keyword) }
    }

    private fun findOcrText(results: List<OcrHelper.OcrResult>, keyword: String): OcrHelper.OcrResult? {
        return results.find { it.text.contains(keyword) }
    }

    // ==================== 核心: 加入集结 ====================

    private suspend fun executeRallyJoin(): Boolean {
        if (!config.joinMengHuo && !config.joinBlackMountain) return false
        log(">>> 开始检查集结")

        // Step 1: 确保在世界地图
        if (!ensureWorldMap()) {
            log("无法进入世界地图，跳过集结")
            return false
        }
        smartDelay(1000)

        // Step 2: 打开战争列表
        // 左侧工具栏第5个图标(战争)，用百分比定位
        log("点击战争图标")
        tapPercent(0.03, 0.75)
        smartDelay(2500)

        // 验证是否进入战争列表
        var bmp = takeScreenshot()
        if (bmp != null) {
            val ocrResults = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val allText = ocrResults.joinToString(" ") { it.text }
            if (!allText.contains("战争") && !allText.contains("集结")) {
                log("未进入战争列表，尝试OCR找入口")
                bmp = takeScreenshot()
                if (bmp != null) {
                    val ocr2 = OcrHelper.recognizeText(bmp)
                    bmp.recycle()
                    val marchText = findOcrText(ocr2, "行军")
                    if (marchText != null) {
                        log("找到'行军'@(${marchText.centerX},${marchText.centerY})")
                        tapRaw(marchText.centerX, marchText.centerY - sy(30))
                        smartDelay(2500)
                    } else {
                        tapPercent(0.04, 0.72)
                        smartDelay(2500)
                    }
                }
            }
        }

        // Step 3: 扫描战争列表找目标
        val joined = scanAndJoinRally()
        if (joined) {
            log("成功加入集结")
        } else {
            log("未找到可加入的集结")
        }

        tapBack()
        smartDelay(1000)
        return joined
    }

    private suspend fun scanAndJoinRally(): Boolean {
        val maxScrolls = 5
        for (scroll in 0..maxScrolls) {
            val bmp = takeScreenshot() ?: continue
            val ocrResults = OcrHelper.recognizeText(bmp)
            val allText = ocrResults.joinToString(" ") { it.text }
            Log.d(TAG, "战争列表OCR[$scroll]: $allText")
            bmp.recycle()

            // 查找孟获
            if (config.joinMengHuo) {
                val mengHuo = ocrResults.find { it.text.contains("孟获") }
                if (mengHuo != null) {
                    log("找到孟获: \"${mengHuo.text}\" @(${mengHuo.centerX},${mengHuo.centerY})")
                    if (shouldJoinMengHuo(ocrResults, mengHuo)) {
                        val joinBtn = findJoinButtonForRow(ocrResults, mengHuo.centerY)
                        if (joinBtn != null) {
                            log("点击加入 @(${joinBtn.first},${joinBtn.second})")
                            tapRaw(joinBtn.first, joinBtn.second)
                        } else {
                            log("未找到加入按钮，点击孟获行右侧")
                            tapRaw(mengHuo.bounds.right + screenW / 10, mengHuo.centerY)
                        }
                        smartDelay(2000)
                        return selectTeamAndJoin()
                    }
                }
            }

            // 查找黑山
            if (config.joinBlackMountain) {
                val blackMtn = ocrResults.find { it.text.contains("黑山") }
                if (blackMtn != null) {
                    log("找到黑山: \"${blackMtn.text}\"")
                    val joinBtn = findJoinButtonForRow(ocrResults, blackMtn.centerY)
                    if (joinBtn != null) {
                        tapRaw(joinBtn.first, joinBtn.second)
                    } else {
                        tapRaw(blackMtn.bounds.right + screenW / 10, blackMtn.centerY)
                    }
                    smartDelay(2000)
                    return selectTeamAndJoin()
                }
            }

            // 未找到，滚动
            if (scroll < maxScrolls) {
                log("未找到目标，滚动列表(${scroll + 1}/$maxScrolls)")
                swipePercent(0.5, 0.7, 0.5, 0.3, 500)
                smartDelay(1500)
            }
        }
        return false
    }

    /** 判断孟获集结是否应该加入 (根据配置的类型过滤) */
    private fun shouldJoinMengHuo(ocrResults: List<OcrHelper.OcrResult>, mengHuo: OcrHelper.OcrResult): Boolean {
        val rowY = mengHuo.centerY
        val tolerance = sy(30)
        // 找同一行的所有文字
        val rowTexts = ocrResults.filter { kotlin.math.abs(it.centerY - rowY) < tolerance }
        val rowText = rowTexts.joinToString(" ") { it.text }

        return when (config.mengHuoType) {
            "普通" -> !rowText.contains("精英")
            "精英" -> rowText.contains("精英")
            else -> true // "普通+精英"
        }
    }

    /** 在同一行中查找"加入"按钮 */
    private fun findJoinButtonForRow(ocrResults: List<OcrHelper.OcrResult>, rowY: Int): Pair<Int, Int>? {
        val tolerance = sy(25)
        val joinBtn = ocrResults.find {
            it.text.contains("加入") && kotlin.math.abs(it.centerY - rowY) < tolerance
        }
        return joinBtn?.let { Pair(it.centerX, it.centerY) }
    }

    /** 选队并加入集结 */
    private suspend fun selectTeamAndJoin(): Boolean {
        smartDelay(1500)
        val bmp = takeScreenshot() ?: return false
        val ocrResults = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocrResults.joinToString(" ") { it.text }

        // 确认进入了部队选择界面
        if (!allText.contains("加入集结") && !allText.contains("一键搭配")) {
            log("未进入部队选择界面")
            return false
        }

        // 选择配置的队伍
        selectConfiguredTeam()
        smartDelay(1000)

        // 点击"加入集结"按钮
        val bmp2 = takeScreenshot() ?: return false
        val ocr2 = OcrHelper.recognizeText(bmp2)
        bmp2.recycle()
        val joinRally = ocr2.find { it.text.contains("加入集结") }
        if (joinRally != null) {
            log("点击加入集结 @(${joinRally.centerX},${joinRally.centerY})")
            tapRaw(joinRally.centerX, joinRally.centerY)
            smartDelay(2000)
            return true
        }

        // 兜底: 加入集结按钮通常在右下角
        log("OCR未找到加入集结按钮，用百分比点击")
        tapPercent(0.85, 0.9)
        smartDelay(2000)
        return true
    }

    /** 选择配置中启用的队伍 */
    private suspend fun selectConfiguredTeam() {
        // 队伍选择区域通常在界面中部，从左到右排列
        // 根据配置选择第一个启用的队伍
        val teams = listOf(
            config.rallyTeam1, config.rallyTeam2, config.rallyTeam3,
            config.rallyTeam4, config.rallyTeam5
        )
        val teamIndex = teams.indexOfFirst { it }
        if (teamIndex < 0) return

        // 队伍标签通常在屏幕上方，用OCR找"第X队"
        val bmp = takeScreenshot() ?: return
        val ocrResults = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val teamNames = listOf("第1队", "第2队", "第3队", "第4队", "第5队")
        val targetName = teamNames.getOrNull(teamIndex) ?: return
        val teamBtn = ocrResults.find { it.text.contains(targetName) || it.text.contains("${teamIndex + 1}队") }
        if (teamBtn != null) {
            log("选择$targetName @(${teamBtn.centerX},${teamBtn.centerY})")
            tapRaw(teamBtn.centerX, teamBtn.centerY)
        } else {
            // 兜底: 按百分比点击队伍位置
            val xPercent = 0.15 + teamIndex * 0.15
            tapPercent(xPercent, 0.15)
            log("用百分比选择队伍$targetName")
        }
    }

    // ==================== 日常任务 ====================

    private suspend fun executeDailyTasks() {
        log(">>> 执行日常任务")

        if (config.helpAlly) {
            log("帮助同盟")
            if (ensureMainCity()) {
                // 点击同盟按钮
                tapPercent(0.72, 0.96)
                smartDelay(2000)
                // 找"帮助"按钮
                val bmp = takeScreenshot()
                if (bmp != null) {
                    val ocr = OcrHelper.recognizeText(bmp)
                    bmp.recycle()
                    val helpBtn = findOcrText(ocr, "帮助")
                    if (helpBtn != null) {
                        tapRaw(helpBtn.centerX, helpBtn.centerY)
                        smartDelay(1500)
                    }
                }
                tapBack()
                smartDelay(1000)
            }
        }

        if (config.collectTribute) {
            log("收取贡品")
            if (ensureMainCity()) {
                // 贡品通常在主城界面有提示图标
                // 用OCR找"贡品"或"领取"
                val bmp = takeScreenshot()
                if (bmp != null) {
                    val ocr = OcrHelper.recognizeText(bmp)
                    bmp.recycle()
                    val tribute = findOcrText(ocr, "贡品") ?: findOcrText(ocr, "领取")
                    if (tribute != null) {
                        tapRaw(tribute.centerX, tribute.centerY)
                        smartDelay(2000)
                        tapBack()
                    }
                }
                smartDelay(1000)
            }
        }

        if (config.collectMail) {
            log("收取邮件")
            // 邮件图标通常在右上角
            tapPercent(0.95, 0.05)
            smartDelay(2000)
            val bmp = takeScreenshot()
            if (bmp != null) {
                val ocr = OcrHelper.recognizeText(bmp)
                bmp.recycle()
                val collectAll = findOcrText(ocr, "一键") ?: findOcrText(ocr, "全部")
                if (collectAll != null) {
                    tapRaw(collectAll.centerX, collectAll.centerY)
                    smartDelay(2000)
                }
            }
            tapBack()
            smartDelay(1000)
        }

        log("日常任务完成")
    }

    // ==================== 开荒任务 ====================

    private suspend fun executePioneerTasks() {
        if (!config.buildUpgradeEnabled && !config.techResearchEnabled && !config.recruitEnabled) return
        log(">>> 执行开荒任务")

        if (config.buildUpgradeEnabled) {
            log("建筑升级")
            executeBuildUpgrade()
        }

        if (config.techResearchEnabled) {
            log("技术研究")
            executeTechResearch()
        }

        if (config.recruitEnabled) {
            log("招兵")
            executeRecruit()
        }

        log("开荒任务完成")
    }

    private suspend fun executeBuildUpgrade() {
        if (!ensureMainCity()) return
        // 在主城中寻找可升级的建筑(通常有绿色箭头提示)
        // 目前用OCR找"升级"文字
        val bmp = takeScreenshot()
        if (bmp != null) {
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val upgrade = findOcrText(ocr, "升级")
            if (upgrade != null) {
                tapRaw(upgrade.centerX, upgrade.centerY)
                smartDelay(2000)
                // 确认升级
                val bmp2 = takeScreenshot()
                if (bmp2 != null) {
                    val ocr2 = OcrHelper.recognizeText(bmp2)
                    bmp2.recycle()
                    val confirm = findOcrText(ocr2, "升级") ?: findOcrText(ocr2, "确认")
                    if (confirm != null) {
                        tapRaw(confirm.centerX, confirm.centerY)
                        smartDelay(2000)
                    }
                }
            }
        }
        tapBack()
        smartDelay(1000)
    }

    private suspend fun executeTechResearch() {
        if (!ensureMainCity()) return
        // TODO: 进入科技界面进行研究
        log("技术研究 - 待完善")
    }

    private suspend fun executeRecruit() {
        if (!ensureMainCity()) return
        // TODO: 进入兵营招兵
        log("招兵 - 待完善")
    }

    // ==================== 采集任务 ====================

    private suspend fun executeGatherTask() {
        if (!config.gatherEnabled) return
        log(">>> 执行采集任务")

        if (!ensureWorldMap()) {
            log("无法进入世界地图")
            return
        }
        smartDelay(1000)

        // 打开搜索面板
        tapPercent(0.07, 0.75) // 搜索图标(左侧工具栏第1个)
        smartDelay(2000)

        val bmp = takeScreenshot()
        if (bmp != null) {
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val searchRes = findOcrText(ocr, "搜索资源") ?: findOcrText(ocr, "采集")
            if (searchRes != null) {
                tapRaw(searchRes.centerX, searchRes.centerY)
                smartDelay(2000)
                // 点击搜索/前往
                val bmp2 = takeScreenshot()
                if (bmp2 != null) {
                    val ocr2 = OcrHelper.recognizeText(bmp2)
                    bmp2.recycle()
                    val goBtn = findOcrText(ocr2, "前往") ?: findOcrText(ocr2, "搜索")
                    if (goBtn != null) {
                        tapRaw(goBtn.centerX, goBtn.centerY)
                        smartDelay(3000)
                    }
                }
            }
        }

        tapBack()
        smartDelay(1000)
        log("采集任务完成")
    }

    // ==================== 打野任务 ====================

    private suspend fun executeHuntTask() {
        if (!config.huntEnabled) return
        log(">>> 执行打野任务")
        // TODO: 实现打野逻辑
        log("打野 - 待完善")
    }

    // ==================== 练兵任务 ====================

    private suspend fun executeTrainTask() {
        if (!config.trainEnabled) return
        log(">>> 执行练兵任务")
        // TODO: 实现练兵逻辑
        log("练兵 - 待完善")
    }

    // ==================== 锻造任务 ====================

    private suspend fun executeForgeTask() {
        if (!config.forgeEnabled) return
        log(">>> 执行锻造任务")
        // TODO: 实现锻造逻辑
        log("锻造 - 待完善")
    }

    // ==================== 导航方法 ====================

    /** 确保在世界地图 */
    private suspend fun ensureWorldMap(): Boolean {
        for (attempt in 0..3) {
            val bmp = takeScreenshot() ?: return false
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val allText = ocr.joinToString(" ") { it.text }

            // 如果看到"主城"文字(左下角切换按钮)，说明当前在世界地图
            if (allText.contains("主城") && !allText.contains("建造")) {
                return true
            }

            // 如果看到"天下格"文字，说明当前在主城，需要切换
            val tianxia = findOcrText(ocr, "天下格")
            if (tianxia != null) {
                log("当前在主城，点击天下格切换到世界地图")
                tapRaw(tianxia.centerX, tianxia.centerY)
                smartDelay(3000)
                continue
            }

            // 如果在其他界面，先返回
            if (allText.contains("战争") || allText.contains("加入集结") || allText.contains("搜索")) {
                tapBack()
                smartDelay(1500)
                continue
            }

            // 兜底: 点击左下角切换按钮
            tapPercent(0.04, 0.97)
            smartDelay(3000)
        }
        return false
    }

    /** 确保在主城 */
    private suspend fun ensureMainCity(): Boolean {
        for (attempt in 0..3) {
            val bmp = takeScreenshot() ?: return false
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val allText = ocr.joinToString(" ") { it.text }

            // 如果看到"天下格"文字(左下角切换按钮)，说明当前在主城
            if (allText.contains("天下格")) {
                return true
            }

            // 如果看到"主城"文字，说明当前在世界地图，需要切换
            val mainCity = findOcrText(ocr, "主城")
            if (mainCity != null) {
                log("当前在世界地图，点击主城切换")
                tapRaw(mainCity.centerX, mainCity.centerY)
                smartDelay(3000)
                continue
            }

            // 如果在其他界面，先返回
            tapBack()
            smartDelay(1500)
        }
        return false
    }

    /** 返回上一级 */
    private suspend fun tapBack() {
        // 返回箭头通常在左上角
        tapPercent(0.025, 0.04)
        smartDelay(500)
    }

    /** 回到主城 */
    private suspend fun goHome() {
        ensureMainCity()
    }

    /** 回到世界地图 */
    private suspend fun goWorldMap() {
        ensureWorldMap()
    }

    // ==================== 底部栏快捷入口 ====================

    /** 点击武将 */
    private suspend fun tapWuJiang() {
        tapPercent(0.484, 0.965)
        smartDelay(1500)
    }

    /** 点击编队 */
    private suspend fun tapBianDui() {
        tapPercent(0.563, 0.965)
        smartDelay(1500)
    }

    /** 点击府库 */
    private suspend fun tapFuKu() {
        tapPercent(0.641, 0.965)
        smartDelay(1500)
    }

    /** 点击同盟 */
    private suspend fun tapTongMeng() {
        tapPercent(0.719, 0.965)
        smartDelay(1500)
    }

    /** 点击招募 */
    private suspend fun tapZhaoMu() {
        tapPercent(0.859, 0.965)
        smartDelay(1500)
    }

    // ==================== 截图与触控 ====================

    /** 截图 */
    private fun takeScreenshot(): Bitmap? {
        return try {
            screenshoter.obtainScreenShotBitmap()
        } catch (e: Exception) {
            Log.e(TAG, "截图异常", e)
            null
        }
    }

    /** 点击 (基于基准坐标，自动缩放) */
    private fun tap(baseX: Int, baseY: Int) {
        val x = sx(baseX).toFloat()
        val y = sy(baseY).toFloat()
        val rx = x + Random.nextInt(-clickOffset, clickOffset + 1)
        val ry = y + Random.nextInt(-clickOffset, clickOffset + 1)
        action.tap(rx, ry)
    }

    /** 点击 (原始像素坐标，不缩放) */
    private fun tapRaw(x: Int, y: Int) {
        val rx = x.toFloat() + Random.nextInt(-clickOffset, clickOffset + 1)
        val ry = y.toFloat() + Random.nextInt(-clickOffset, clickOffset + 1)
        action.tap(rx, ry)
    }

    /** 点击 (百分比坐标 0.0~1.0) */
    private fun tapPercent(xPct: Double, yPct: Double) {
        val x = (screenW * xPct).toInt()
        val y = (screenH * yPct).toInt()
        tapRaw(x, y)
    }

    /** 滑动 (基于基准坐标) */
    private fun swipe(x1: Int, y1: Int, x2: Int, y2: Int, duration: Int = 300) {
        action.swipe(
            sx(x1).toFloat(), sy(y1).toFloat(),
            sx(x2).toFloat(), sy(y2).toFloat(),
            duration
        )
    }

    /** 滑动 (百分比坐标) */
    private fun swipePercent(x1Pct: Double, y1Pct: Double, x2Pct: Double, y2Pct: Double, duration: Int = 300) {
        action.swipe(
            (screenW * x1Pct).toFloat(), (screenH * y1Pct).toFloat(),
            (screenW * x2Pct).toFloat(), (screenH * y2Pct).toFloat(),
            duration
        )
    }

    /** 基准坐标 → 实际坐标 X */
    private fun sx(x: Int): Int = x * screenW / BASE_W

    /** 基准坐标 → 实际坐标 Y */
    private fun sy(y: Int): Int = y * screenH / BASE_H

    // ==================== 工具方法 ====================

    /** 智能延迟 (根据配置的行为模式调整) */
    private suspend fun smartDelay(baseMs: Long) {
        val multiplier = when (config.behaviorDelayMode) {
            "极速" -> 0.5
            "快速" -> 0.8
            "正常" -> 1.0
            "慢速" -> 1.5
            else -> 1.0
        }
        val ms = (baseMs * multiplier).toLong()
        val jitter = Random.nextLong(0, maxOf(1, ms / 5))
        delay(ms + jitter)
    }

    /** 当前时间戳 */
    private fun now(): Long = System.currentTimeMillis()

    /** 是否应该执行 (基于上次执行时间和间隔) */
    private fun shouldRun(lastTime: Long, intervalMs: Long): Boolean {
        return now() - lastTime > intervalMs
    }

    /** 是否应该执行集结检查 */
    private fun shouldRunRally(): Boolean {
        if (!config.joinMengHuo && !config.joinBlackMountain) return false
        val interval = parseInterval(config.rallyFrequency)
        return now() - lastRallyCheckTime > interval
    }

    /** 是否应该执行建筑检查 */
    private fun shouldRunBuild(): Boolean {
        if (!config.buildUpgradeEnabled && !config.techResearchEnabled && !config.recruitEnabled) return false
        return now() - lastBuildCheckTime > 600_000 // 10分钟
    }

    /** 打开游戏 */
    private fun openGame() {
        val pkg = getGamePackage()
        action.runApp(pkg)
    }

    /** 获取游戏包名 */
    private fun getGamePackage(): String {
        return when (config.gameChannel) {
            "腾讯" -> "com.tencent.tmgp.ywcysg"
            "网易" -> "com.netease.ywcysg"
            "华为" -> "com.huawei.ywcysg"
            "OPPO" -> "com.oppo.ywcysg"
            "VIVO" -> "com.vivo.ywcysg"
            "小米" -> "com.xiaomi.ywcysg"
            "B站" -> "com.bilibili.ywcysg"
            else -> "com.tencent.tmgp.ywcysg"
        }
    }

    /** 解析时间间隔字符串 */
    private fun parseInterval(str: String): Long {
        val num = str.replace(Regex("[^0-9]"), "").toLongOrNull() ?: 3
        return when {
            str.contains("秒") -> num * 1000
            str.contains("小时") -> num * 3600_000
            else -> num * 60_000 // 默认分钟
        }
    }

    /** 日志 */
    private fun log(msg: String) {
        ScriptLogger.log("D", TAG, msg)
        Log.d(TAG, msg)
    }
}
