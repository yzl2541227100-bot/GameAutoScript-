package com.example.myapplication.script

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import com.example.myapplication.engine.ScriptEngine
import com.example.myapplication.engine.ScriptLogger
import com.example.myapplication.engine.ShellHelper
import com.example.myapplication.ocr.OcrHelper
import com.example.myapplication.opencv.ImageMatcher
import com.example.myapplication.screencap.ScreenShoterV3
import kotlinx.coroutines.delay
import kotlin.random.Random

/**
 * 游戏自动化脚本 - 偃武次元助手
 * 横屏 1280x720 基准分辨率，运行时自动适配实际分辨率
 *
 * 业务功能模块（对齐次元助手）：
 * 1. 加入集结（孟获/黑山）
 * 2. 日常任务（帮助同盟/收贡品/收邮件/同盟任务）
 * 3. 采集（多队派遣/资源筛选/回城检测）
 * 4. 开荒（建筑升级/技术研究/招兵）
 * 5. 打野（搜索行军/自动降级/治疗）
 * 6. 预警（被攻击自动免战/召回）
 * 7. 游戏检测（掉线重连/保持前台）
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
    private lateinit var engine: ScriptEngine

    private var screenW = 1280
    private var screenH = 720
    private var loopCount = 0
    private var clickOffset = 5

    // 各任务上次执行时间
    private var lastRallyCheckTime = 0L
    private var lastDailyTime = 0L
    private var lastBuildCheckTime = 0L
    private var lastGatherCheckTime = 0L
    private var lastHuntCheckTime = 0L
    private var lastAlertCheckTime = 0L
    private var lastGameCheckTime = 0L
    private var lastForgeCheckTime = 0L
    private var lastTrainCheckTime = 0L

    // 采集队伍状态 (true=空闲可派遣)
    private val gatherTeamIdle = BooleanArray(5) { true }

    // ==================== 主入口 ====================

    suspend fun execute(eng: ScriptEngine) {
        engine = eng
        config = ScriptConfig.load(context)
        val dm = context.resources.displayMetrics
        screenW = maxOf(dm.widthPixels, dm.heightPixels)
        screenH = minOf(dm.widthPixels, dm.heightPixels)
        recognizer.screenWidth = screenW
        recognizer.screenHeight = screenH
        clickOffset = config.behaviorClickOffset

        ImageMatcher.init()
        log("脚本启动 分辨率=${screenW}x${screenH}")

        if (config.autoOpenGame) {
            log("打开游戏...")
            ShellHelper.launchApp(getGamePackage())
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
                log("识别界面: $screen")

                // 处理特殊界面
                if (handleSpecialScreen(screen, ocrResults)) { smartDelay(1000); continue }

                // 预警检测（最高优先级）
                if (shouldRun(lastAlertCheckTime, 10_000)) {
                    if (checkAndHandleAlert(ocrResults)) {
                        lastAlertCheckTime = now()
                        smartDelay(2000)
                        continue
                    }
                    lastAlertCheckTime = now()
                }

                // 游戏前台检测
                if (shouldRun(lastGameCheckTime, parseInterval(config.gameCheckInterval))) {
                    checkGameForeground()
                    lastGameCheckTime = now()
                }

                // 1. 加入集结（优先级最高的主动任务）
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
                if (config.gatherEnabled && shouldRun(lastGatherCheckTime, 60_000)) {
                    executeGatherTask()
                    lastGatherCheckTime = now()
                }

                // 5. 打野
                if (config.huntEnabled && shouldRun(lastHuntCheckTime, 120_000)) {
                    executeHuntTask()
                    lastHuntCheckTime = now()
                }

                // 6. 铜矿
                if (config.copperEnabled && shouldRun(lastGatherCheckTime, 120_000)) {
                    executeCopperMine()
                }

                // 7. 同盟资源矿
                if (config.allianceMineEnabled && shouldRun(lastGatherCheckTime, 300_000)) {
                    executeAllianceMine()
                }

                // 8. 召唤孟获
                if (config.summonMengHuoEnabled && shouldRun(lastRallyCheckTime, parseInterval(config.summonMengHuoFrequency))) {
                    executeSummonMengHuo()
                }

                // 9. 同盟建筑
                if (config.allianceBuildEnabled && shouldRun(lastBuildCheckTime, 300_000)) {
                    executeAllianceBuild()
                }

                // 10. 锻造
                if (config.forgeEnabled && shouldRun(lastForgeCheckTime, 600_000)) {
                    executeForgeTask()
                    lastForgeCheckTime = now()
                }

                // 11. 练兵
                if (config.trainEnabled && shouldRun(lastTrainCheckTime, parseInterval(config.trainFrequency))) {
                    executeTrainTask()
                    lastTrainCheckTime = now()
                }

                // 12. 探索/访问
                if (config.autoExplore && shouldRun(lastDailyTime, 600_000)) {
                    executeExplore()
                }

                // 13. 驯马
                if (config.tameHorseEnabled && shouldRun(lastTrainCheckTime, 3600_000)) {
                    executeTameHorse()
                }

                // 14. 活动任务
                if (config.activityEnabled && shouldRun(lastDailyTime, 600_000)) {
                    executeActivityTask()
                }

            } catch (e: Exception) {
                log("异常: ${e.message}")
                Log.e(TAG, "Loop error", e)
            }
            smartDelay(3000)
        }
    }

    // ==================== 特殊界面处理 ====================

    private suspend fun handleSpecialScreen(screen: GameScreenRecognizer.Screen, ocrResults: List<OcrHelper.OcrResult>): Boolean {
        return when (screen) {
            GameScreenRecognizer.Screen.DIALOG_POPUP -> {
                log("弹窗，关闭")
                // 检查是否是重要弹窗（如被攻击提示）
                val allText = ocrResults.joinToString(" ") { it.text }
                if (allText.contains("被攻击") || allText.contains("侦察")) {
                    handleAttackAlert(ocrResults)
                } else {
                    tapBack()
                }
                smartDelay(1000); true
            }
            GameScreenRecognizer.Screen.LOADING -> {
                log("加载中..."); smartDelay(3000); true
            }
            GameScreenRecognizer.Screen.LOGIN_PAGE -> {
                log("登录页，点击进入")
                tapPercent(0.5, 0.7)
                smartDelay(5000); true
            }
            else -> {
                // 检查空地弹窗
                val allText = ocrResults.joinToString(" ") { it.text }
                if (allText.contains("空地") && allText.contains("所属同盟")) {
                    log("检测到空地信息弹窗，关闭")
                    tapBack()
                    smartDelay(1500)
                    true
                } else false
            }
        }
    }

    // ==================== 预警系统 ====================

    private suspend fun checkAndHandleAlert(ocrResults: List<OcrHelper.OcrResult>): Boolean {
        if (!config.alertGatherAttack && !config.alertMainCityAttack) return false
        val allText = ocrResults.joinToString(" ") { it.text }

        // 检测采集队伍被攻击
        if (config.alertGatherAttack && allText.contains("被攻击")) {
            log("⚠️ 检测到部队被攻击！")
            if (config.alertRecallTeam) {
                log("执行召回部队")
                recallAllTeams()
            }
            if (config.alertPauseGather) {
                log("暂停采集 ${config.alertPauseGatherTime}")
                lastGatherCheckTime = now() + parseInterval(config.alertPauseGatherTime)
            }
            return true
        }

        // 检测主城被侦察
        if (config.alertMainCityScout && allText.contains("侦察")) {
            log("⚠️ 主城被侦察！使用 ${config.alertMainCityScoutItem}")
            usePeaceShield()
            return true
        }

        // 检测主城被攻击
        if (config.alertMainCityAttack && (allText.contains("进攻") || allText.contains("攻城"))) {
            log("⚠️ 主城被攻击！使用 ${config.alertMainCityAttackItem}")
            usePeaceShield()
            return true
        }

        return false
    }

    private suspend fun handleAttackAlert(ocrResults: List<OcrHelper.OcrResult>) {
        log("处理攻击警报弹窗")
        if (config.alertRecallTeam) recallAllTeams()
        if (config.alertMainCityAttack) usePeaceShield()
        tapBack()
    }

    private suspend fun recallAllTeams() {
        log("召回所有部队")
        // 点击行军列表图标（右侧中间位置）
        tapPercent(0.97, 0.5)
        smartDelay(1500)

        // 逐个点击召回按钮
        for (i in 1..5) {
            val bmp = takeScreenshot() ?: break
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val recall = ocr.find { it.text.contains("召回") }
            if (recall != null) {
                tapRaw(recall.centerX, recall.centerY)
                smartDelay(1000)
            } else break
        }
        tapBack()
        smartDelay(1000)
    }

    private suspend fun usePeaceShield() {
        log("使用免战令")
        // 进入道具背包
        ensureMainCity()
        smartDelay(1000)
        // 点击背包图标
        tapPercent(0.92, 0.92)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val shield = ocr.find { it.text.contains("免战") }
        if (shield != null) {
            tapRaw(shield.centerX, shield.centerY)
            smartDelay(1000)
            // 点击使用
            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val useBtn = ocr2.find { it.text.contains("使用") }
            if (useBtn != null) {
                tapRaw(useBtn.centerX, useBtn.centerY)
                smartDelay(1000)
                // 确认
                val bmp3 = takeScreenshot() ?: return
                val ocr3 = OcrHelper.recognizeText(bmp3)
                bmp3.recycle()
                val confirm = ocr3.find { it.text.contains("确") }
                if (confirm != null) tapRaw(confirm.centerX, confirm.centerY)
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 核心: 加入集结 ====================

    /**
     * 加入集结流程（对齐次元助手）：
     * 1. 确保在世界地图
     * 2. 点击左下角"战争"图标进入集结列表
     * 3. OCR 扫描列表找"孟获"或"黑山"
     * 4. 点击目标行的"加入"按钮
     * 5. 在配队界面点击"一键搭配"或选择队伍
     * 6. 点击"加入集结"确认
     * 7. 如果没找到，向下滚动继续找
     */
    private suspend fun executeRallyJoin(): Boolean {
        if (!config.joinMengHuo && !config.joinBlackMountain) return false
        log(">>> 开始检查集结")

        // Step 1: 确保在世界地图
        if (!ensureWorldMap()) { log("无法进入世界地图"); return false }
        smartDelay(1000)

        // Step 2: 点击左下角战争/集结图标
        log("点击集结列表入口")
        tapPercent(0.03, 0.75)
        smartDelay(2500)

        // 确认进入了集结列表
        val checkBmp = takeScreenshot()
        if (checkBmp != null) {
            val checkOcr = OcrHelper.recognizeText(checkBmp)
            checkBmp.recycle()
            val allText = checkOcr.joinToString(" ") { it.text }
            if (!allText.contains("集结") && !allText.contains("战争")) {
                log("未进入集结列表，重试")
                tapPercent(0.03, 0.75)
                smartDelay(2500)
            }
        }

        // Step 3-7: 扫描并加入
        val joined = scanAndJoinRally()
        if (joined) log("✓ 成功加入集结") else log("未找到可加入的集结")

        // 返回世界地图
        tapBack()
        smartDelay(1000)
        return joined
    }

    private suspend fun scanAndJoinRally(): Boolean {
        val maxScrolls = 5
        for (scroll in 0..maxScrolls) {
            engine.checkPausePoint()
            val bmp = takeScreenshot() ?: continue
            val ocrResults = OcrHelper.recognizeText(bmp)
            bmp.recycle()

            // 查找孟获
            if (config.joinMengHuo) {
                val mengHuo = ocrResults.find { it.text.contains("孟获") }
                if (mengHuo != null) {
                    log("找到孟获集结: @(${mengHuo.centerX},${mengHuo.centerY})")
                    // 检查等级/类型是否匹配
                    if (checkRallyType(ocrResults, mengHuo.centerY, config.mengHuoType)) {
                        return clickJoinAndConfirm(ocrResults, mengHuo.centerY)
                    }
                }
            }

            // 查找黑山
            if (config.joinBlackMountain) {
                val blackMtn = ocrResults.find { it.text.contains("黑山") }
                if (blackMtn != null) {
                    log("找到黑山集结: @(${blackMtn.centerX},${blackMtn.centerY})")
                    return clickJoinAndConfirm(ocrResults, blackMtn.centerY)
                }
            }

            // 未找到，向下滚动
            if (scroll < maxScrolls) {
                log("未找到目标，滚动列表(${scroll + 1}/$maxScrolls)")
                swipePercent(0.5, 0.7, 0.5, 0.3, 500)
                smartDelay(1500)
            }
        }
        return false
    }

    /** 检查集结类型是否匹配配置 */
    private fun checkRallyType(ocrResults: List<OcrHelper.OcrResult>, rowY: Int, typeFilter: String): Boolean {
        if (typeFilter == "普通+精英") return true // 都加入
        val tolerance = sy(30)
        val rowTexts = ocrResults.filter { kotlin.math.abs(it.centerY - rowY) < tolerance }
        val rowText = rowTexts.joinToString(" ") { it.text }
        return when (typeFilter) {
            "仅普通" -> !rowText.contains("精英")
            "仅精英" -> rowText.contains("精英")
            else -> true
        }
    }

    /** 点击加入按钮并完成配队确认 */
    private suspend fun clickJoinAndConfirm(ocrResults: List<OcrHelper.OcrResult>, rowY: Int): Boolean {
        // 找到同一行的"加入"按钮
        val tolerance = sy(25)
        val joinBtn = ocrResults.find {
            it.text.contains("加入") && kotlin.math.abs(it.centerY - rowY) < tolerance
        }

        if (joinBtn != null) {
            log("点击加入按钮 @(${joinBtn.centerX},${joinBtn.centerY})")
            tapRaw(joinBtn.centerX, joinBtn.centerY)
        } else {
            // 兜底：点击该行右侧区域
            log("未找到加入按钮文字，点击行右侧")
            tapRaw((screenW * 0.85).toInt(), rowY)
        }
        smartDelay(2000)

        // 进入配队界面
        return confirmRallyJoin()
    }

    /** 在配队界面完成加入确认 */
    private suspend fun confirmRallyJoin(): Boolean {
        val bmp = takeScreenshot() ?: return false
        val ocrResults = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocrResults.joinToString(" ") { it.text }

        // 检查是否进入了配队界面
        if (!allText.contains("加入集结") && !allText.contains("一键搭配") && !allText.contains("出征")) {
            log("未进入配队界面")
            return false
        }

        // 点击"一键搭配"自动配队
        val autoMatch = ocrResults.find { it.text.contains("一键搭配") }
        if (autoMatch != null) {
            log("点击一键搭配")
            tapRaw(autoMatch.centerX, autoMatch.centerY)
            smartDelay(1500)
        }

        // 点击"加入集结"确认按钮
        smartDelay(500)
        val bmp2 = takeScreenshot() ?: return false
        val ocr2 = OcrHelper.recognizeText(bmp2)
        bmp2.recycle()

        val confirmBtn = ocr2.find { it.text.contains("加入集结") }
        if (confirmBtn != null) {
            log("点击加入集结确认")
            tapRaw(confirmBtn.centerX, confirmBtn.centerY)
            smartDelay(2000)
            return true
        }

        // 兜底：点击底部确认区域
        val marchBtn = ocr2.find { it.text.contains("出征") || it.text.contains("确") }
        if (marchBtn != null) {
            tapRaw(marchBtn.centerX, marchBtn.centerY)
            smartDelay(2000)
            return true
        }

        // 最后兜底：点击右下角
        tapPercent(0.85, 0.9)
        smartDelay(2000)
        return true
    }

    // ==================== 日常任务 ====================

    /**
     * 日常任务流程：
     * 1. 帮助同盟（点击同盟帮助按钮）
     * 2. 收取贡品（进入主城收取）
     * 3. 收取邮件
     * 4. 同盟捐献
     */
    private suspend fun executeDailyTasks() {
        log(">>> 执行日常任务")

        if (config.helpAlly) {
            executeHelpAlly()
        }

        if (config.collectTribute) {
            executeCollectTribute()
        }

        if (config.mainCityCollect || config.territoryCollect || config.landCollect) {
            executeMainCityCollect()
        }

        if (config.collectMail) {
            executeCollectMail()
        }

        if (config.techDonate) {
            executeTechDonate()
        }

        if (config.allianceTask) {
            executeAllianceTask()
        }

        if (config.fameReward) {
            executeFameReward()
        }

        log("日常任务完成")
    }

    /** 帮助同盟 */
    private suspend fun executeHelpAlly() {
        log("帮助同盟")
        if (!ensureMainCity()) return

        // 点击主城中的握手/帮助图标（通常在右侧）
        tapPercent(0.88, 0.45)
        smartDelay(1500)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val helpAll = ocr.find { it.text.contains("帮助") || it.text.contains("全部") }
        if (helpAll != null) {
            tapRaw(helpAll.centerX, helpAll.centerY)
            smartDelay(1000)
            log("✓ 帮助同盟完成")
        } else {
            log("未找到帮助按钮")
        }
        tapBack()
        smartDelay(1000)
    }

    /** 收取贡品 */
    private suspend fun executeCollectTribute() {
        log("收取贡品")
        if (!ensureMainCity()) return

        // 点击主城中的贡品/资源收取区域
        // 通常在主城中心偏下位置有收取按钮
        tapPercent(0.5, 0.6)
        smartDelay(1500)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val collect = ocr.find { it.text.contains("收取") || it.text.contains("领取") }
        if (collect != null) {
            tapRaw(collect.centerX, collect.centerY)
            smartDelay(1000)
            log("✓ 收取贡品完成")
        }
        tapBack()
        smartDelay(1000)
    }

    /** 收取邮件 */
    private suspend fun executeCollectMail() {
        log("收取邮件")
        // 点击邮件图标（通常在顶部右侧）
        tapPercent(0.95, 0.05)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("邮件") || allText.contains("收件")) {
            // 点击一键领取
            val collectAll = ocr.find { it.text.contains("一键") || it.text.contains("全部领取") }
            if (collectAll != null) {
                tapRaw(collectAll.centerX, collectAll.centerY)
                smartDelay(1500)
                // 确认
                val bmp2 = takeScreenshot() ?: return
                val ocr2 = OcrHelper.recognizeText(bmp2)
                bmp2.recycle()
                val confirm = ocr2.find { it.text.contains("确") }
                if (confirm != null) tapRaw(confirm.centerX, confirm.centerY)
                smartDelay(1000)
                log("✓ 邮件收取完成")
            }
        }
        tapBack()
        smartDelay(1000)
    }

    /** 同盟科技捐献 */
    private suspend fun executeTechDonate() {
        log("同盟科技捐献")
        // 点击同盟按钮
        tapPercent(0.78, 0.97)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val tech = ocr.find { it.text.contains("科技") }
        if (tech != null) {
            tapRaw(tech.centerX, tech.centerY)
            smartDelay(2000)
            // 点击捐献
            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val donate = ocr2.find { it.text.contains("捐献") || it.text.contains("捐赠") }
            if (donate != null) {
                tapRaw(donate.centerX, donate.centerY)
                smartDelay(1000)
                log("✓ 科技捐献完成")
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 采集任务 ====================

    /**
     * 采集流程（对齐次元助手）：
     * 1. 确保在世界地图
     * 2. 检查是否有空闲队伍
     * 3. 点击搜索按钮
     * 4. 选择资源类型和等级
     * 5. 点击搜索
     * 6. 点击资源点
     * 7. 点击采集
     * 8. 选择队伍并出征
     */
    private suspend fun executeGatherTask() {
        if (!config.gatherEnabled) return
        log(">>> 执行采集任务")

        if (!ensureWorldMap()) { log("无法进入世界地图"); return }
        smartDelay(1000)

        // 确定要采集的资源类型
        val resourceTypes = mutableListOf<String>()
        if (config.gatherFarm) resourceTypes.add("粮食")
        if (config.gatherWood) resourceTypes.add("木材")
        if (config.gatherStone) resourceTypes.add("石料")
        if (config.gatherIron) resourceTypes.add("铁矿")
        if (resourceTypes.isEmpty()) { log("未选择采集资源类型"); return }

        // 尝试派遣采集队伍
        for (resourceType in resourceTypes) {
            engine.checkPausePoint()
            log("搜索 $resourceType 资源点")

            // 点击搜索按钮（放大镜图标，通常在左下角）
            tapPercent(0.12, 0.92)
            smartDelay(2000)

            // 确认进入搜索面板
            val bmp = takeScreenshot() ?: continue
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val allText = ocr.joinToString(" ") { it.text }

            if (!allText.contains("搜索") && !allText.contains("资源")) {
                log("未进入搜索面板")
                tapBack()
                smartDelay(1000)
                continue
            }

            // 点击资源类型标签
            val resTab = ocr.find { it.text.contains(resourceType) }
            if (resTab != null) {
                tapRaw(resTab.centerX, resTab.centerY)
                smartDelay(1000)
            }

            // 点击搜索/前往按钮
            val bmp2 = takeScreenshot() ?: continue
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val searchBtn = ocr2.find { it.text.contains("搜索") || it.text.contains("前往") }
            if (searchBtn != null) {
                tapRaw(searchBtn.centerX, searchBtn.centerY)
                smartDelay(3000)
            } else {
                tapBack()
                continue
            }

            // 到达资源点附近，点击资源点
            tapPercent(0.5, 0.5) // 点击屏幕中心（搜索后会定位到资源点）
            smartDelay(1500)

            // 检查是否弹出资源点信息
            val bmp3 = takeScreenshot() ?: continue
            val ocr3 = OcrHelper.recognizeText(bmp3)
            bmp3.recycle()
            val gatherBtn = ocr3.find { it.text.contains("采集") }
            if (gatherBtn != null) {
                tapRaw(gatherBtn.centerX, gatherBtn.centerY)
                smartDelay(2000)

                // 配队并出征
                if (confirmMarchAndGo()) {
                    log("✓ 成功派遣采集 $resourceType")
                    smartDelay(2000)
                    continue
                }
            }

            tapBack()
            smartDelay(1000)
        }
        log("采集任务轮次完成")
    }

    /** 确认出征（采集/打野通用） */
    private suspend fun confirmMarchAndGo(): Boolean {
        val bmp = takeScreenshot() ?: return false
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        // 检查是否在配队界面
        if (!allText.contains("出征") && !allText.contains("一键搭配")) {
            return false
        }

        // 点击一键搭配
        val autoMatch = ocr.find { it.text.contains("一键搭配") }
        if (autoMatch != null) {
            tapRaw(autoMatch.centerX, autoMatch.centerY)
            smartDelay(1000)
        }

        // 点击出征
        val bmp2 = takeScreenshot() ?: return false
        val ocr2 = OcrHelper.recognizeText(bmp2)
        bmp2.recycle()
        val marchBtn = ocr2.find { it.text.contains("出征") }
        if (marchBtn != null) {
            tapRaw(marchBtn.centerX, marchBtn.centerY)
            smartDelay(1500)
            return true
        }

        return false
    }

    // ==================== 开荒任务 ====================

    /**
     * 开荒任务：建筑升级 / 技术研究 / 招兵
     */
    private suspend fun executePioneerTasks() {
        if (!config.buildUpgradeEnabled && !config.techResearchEnabled && !config.recruitEnabled) return
        log(">>> 执行开荒任务")

        if (config.buildUpgradeEnabled) {
            executeBuildUpgrade()
        }

        if (config.techResearchEnabled) {
            executeTechResearch()
        }

        if (config.recruitEnabled) {
            executeRecruit()
        }
    }

    /** 建筑升级 */
    private suspend fun executeBuildUpgrade() {
        log("建筑升级")
        if (!ensureMainCity()) return

        // 寻找可升级的建筑（有绿色箭头或升级提示）
        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 查找"升级"或"建造"按钮
        val upgrade = ocr.find { it.text.contains("升级") }
        if (upgrade != null) {
            tapRaw(upgrade.centerX, upgrade.centerY)
            smartDelay(2000)

            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()

            // 点击升级确认
            val confirmUpgrade = ocr2.find { it.text.contains("升级") && !it.text.contains("需要") }
            if (confirmUpgrade != null) {
                tapRaw(confirmUpgrade.centerX, confirmUpgrade.centerY)
                smartDelay(1500)

                // 如果配置了使用加速，检查是否需要
                if (config.buildUseSpeed) {
                    useSpeedUp()
                }
                log("✓ 建筑升级已启动")
            }
            tapBack()
        } else {
            log("未找到可升级建筑")
        }
        smartDelay(1000)
    }

    /** 技术研究 */
    private suspend fun executeTechResearch() {
        log("技术研究")
        if (!ensureMainCity()) return

        // 点击学院/研究所（通常在主城特定位置）
        tapPercent(0.35, 0.45)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("研究") || allText.contains("科技")) {
            // 找到可研究的项目
            val research = ocr.find { it.text.contains("研究") && !it.text.contains("中") }
            if (research != null) {
                tapRaw(research.centerX, research.centerY)
                smartDelay(2000)

                val bmp2 = takeScreenshot() ?: return
                val ocr2 = OcrHelper.recognizeText(bmp2)
                bmp2.recycle()
                val startBtn = ocr2.find { it.text.contains("研究") || it.text.contains("开始") }
                if (startBtn != null) {
                    tapRaw(startBtn.centerX, startBtn.centerY)
                    smartDelay(1500)
                    if (config.techUseSpeed) useSpeedUp()
                    log("✓ 技术研究已启动")
                }
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    /** 招兵 */
    private suspend fun executeRecruit() {
        log("招兵")
        if (!ensureMainCity()) return

        // 点击兵营
        tapPercent(0.6, 0.55)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("训练") || allText.contains("招募") || allText.contains("兵营")) {
            val train = ocr.find { it.text.contains("训练") || it.text.contains("招募") }
            if (train != null) {
                tapRaw(train.centerX, train.centerY)
                smartDelay(2000)

                // 点击训练/招募按钮
                val bmp2 = takeScreenshot() ?: return
                val ocr2 = OcrHelper.recognizeText(bmp2)
                bmp2.recycle()
                val startBtn = ocr2.find { it.text.contains("训练") || it.text.contains("招募") }
                if (startBtn != null) {
                    tapRaw(startBtn.centerX, startBtn.centerY)
                    smartDelay(1500)
                    if (config.recruitUseSpeed) useSpeedUp()
                    log("✓ 招兵已启动")
                }
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    /** 使用加速道具 */
    private suspend fun useSpeedUp() {
        smartDelay(1000)
        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val speedUp = ocr.find { it.text.contains("加速") || it.text.contains("免费") }
        if (speedUp != null) {
            tapRaw(speedUp.centerX, speedUp.centerY)
            smartDelay(1000)
            // 确认使用
            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val confirm = ocr2.find { it.text.contains("使用") || it.text.contains("确") }
            if (confirm != null) tapRaw(confirm.centerX, confirm.centerY)
            smartDelay(1000)
        }
    }

    // ==================== 打野任务 ====================

    /**
     * 打野流程：
     * 1. 确保在世界地图
     * 2. 搜索野怪
     * 3. 点击攻击
     * 4. 配队出征
     * 5. 检查伤兵并治疗
     */
    private suspend fun executeHuntTask() {
        if (!config.huntEnabled) return
        log(">>> 执行打野任务")

        if (!ensureWorldMap()) return
        smartDelay(1000)

        // 搜索野怪
        tapPercent(0.12, 0.92) // 搜索按钮
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 切换到野怪/怪物标签
        val monster = ocr.find { it.text.contains("野怪") || it.text.contains("怪物") || it.text.contains("蛮族") }
        if (monster != null) {
            tapRaw(monster.centerX, monster.centerY)
            smartDelay(1000)
        }

        // 点击搜索
        val bmp2 = takeScreenshot() ?: return
        val ocr2 = OcrHelper.recognizeText(bmp2)
        bmp2.recycle()
        val searchBtn = ocr2.find { it.text.contains("搜索") || it.text.contains("前往") }
        if (searchBtn != null) {
            tapRaw(searchBtn.centerX, searchBtn.centerY)
            smartDelay(3000)
        } else {
            tapBack()
            return
        }

        // 点击野怪
        tapPercent(0.5, 0.5)
        smartDelay(1500)

        // 点击攻击
        val bmp3 = takeScreenshot() ?: return
        val ocr3 = OcrHelper.recognizeText(bmp3)
        bmp3.recycle()
        val attackBtn = ocr3.find { it.text.contains("攻击") }
        if (attackBtn != null) {
            tapRaw(attackBtn.centerX, attackBtn.centerY)
            smartDelay(2000)

            if (confirmMarchAndGo()) {
                log("✓ 打野出征成功")
            }
        } else {
            log("未找到攻击按钮")
            tapBack()
        }

        // 自动治疗
        if (config.huntAutoHeal) {
            smartDelay(5000) // 等待战斗结束
            autoHealTroops()
        }

        smartDelay(1000)
    }

    /** 自动治疗伤兵 */
    private suspend fun autoHealTroops() {
        if (!ensureMainCity()) return

        // 点击医院
        tapPercent(0.7, 0.6)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("治疗") || allText.contains("医院")) {
            val heal = ocr.find { it.text.contains("治疗") }
            if (heal != null) {
                tapRaw(heal.centerX, heal.centerY)
                smartDelay(1500)
                log("✓ 治疗伤兵")
            }
        }
        tapBack()
        smartDelay(1000)
    }

    // ==================== 锻造任务 ====================

    private suspend fun executeForgeTask() {
        log(">>> 执行锻造任务")
        if (!ensureMainCity()) return

        // 点击铁匠铺
        tapPercent(0.4, 0.65)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("锻造") || allText.contains("铁匠")) {
            val forge = ocr.find { it.text.contains("锻造") }
            if (forge != null) {
                tapRaw(forge.centerX, forge.centerY)
                smartDelay(2000)
                // 选择锻造物品并确认
                val bmp2 = takeScreenshot() ?: return
                val ocr2 = OcrHelper.recognizeText(bmp2)
                bmp2.recycle()
                val startBtn = ocr2.find { it.text.contains("开始") || it.text.contains("锻造") }
                if (startBtn != null) {
                    tapRaw(startBtn.centerX, startBtn.centerY)
                    smartDelay(1500)
                    log("✓ 锻造已启动")
                }
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 练兵任务 ====================

    private suspend fun executeTrainTask() {
        log(">>> 执行练兵任务")
        if (!ensureMainCity()) return

        // 点击校场/练兵场
        tapPercent(0.55, 0.4)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("练兵") || allText.contains("校场") || allText.contains("演武")) {
            val train = ocr.find { it.text.contains("开始") || it.text.contains("练兵") }
            if (train != null) {
                tapRaw(train.centerX, train.centerY)
                smartDelay(1500)
                log("✓ 练兵已启动")
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 铜矿采集 ====================

    private suspend fun executeCopperMine() {
        if (!config.copperEnabled) return
        log(">>> 执行铜矿采集")

        if (!ensureWorldMap()) return
        smartDelay(1000)

        // 搜索铜矿
        tapPercent(0.12, 0.92)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 切换到铜矿标签
        val copper = ocr.find { it.text.contains("铜") || it.text.contains("矿") }
        if (copper != null) {
            tapRaw(copper.centerX, copper.centerY)
            smartDelay(1000)
        }

        // 搜索
        val bmp2 = takeScreenshot() ?: return
        val ocr2 = OcrHelper.recognizeText(bmp2)
        bmp2.recycle()
        val searchBtn = ocr2.find { it.text.contains("搜索") || it.text.contains("前往") }
        if (searchBtn != null) {
            tapRaw(searchBtn.centerX, searchBtn.centerY)
            smartDelay(3000)
        } else {
            tapBack(); return
        }

        // 点击铜矿
        tapPercent(0.5, 0.5)
        smartDelay(1500)

        // 检查铜矿信息并采集
        val bmp3 = takeScreenshot() ?: return
        val ocr3 = OcrHelper.recognizeText(bmp3)
        bmp3.recycle()
        val allText3 = ocr3.joinToString(" ") { it.text }

        // 检查铜矿储量是否低于阈值
        if (config.copperSkipBelow > 0) {
            val numMatch = Regex("(\\d+)").findAll(allText3)
            val amounts = numMatch.map { it.value.toIntOrNull() ?: 0 }.toList()
            if (amounts.any { it in 1 until config.copperSkipBelow }) {
                log("铜矿储量低于${config.copperSkipBelow}，跳过")
                tapBack()
                smartDelay(1000)
                return
            }
        }

        val gatherBtn = ocr3.find { it.text.contains("采集") || it.text.contains("开采") }
        if (gatherBtn != null) {
            tapRaw(gatherBtn.centerX, gatherBtn.centerY)
            smartDelay(2000)
            if (confirmMarchAndGo()) {
                log("✓ 铜矿采集出征成功")
            }
        } else {
            tapBack()
        }
        smartDelay(1000)
    }

    // ==================== 同盟资源矿 ====================

    private suspend fun executeAllianceMine() {
        if (!config.allianceMineEnabled) return
        log(">>> 执行同盟资源矿")

        if (!ensureWorldMap()) return
        smartDelay(1000)

        // 点击同盟领地/资源矿入口
        tapPercent(0.78, 0.97) // 同盟按钮
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 找到同盟资源矿/领地入口
        val mine = ocr.find { it.text.contains("资源矿") || it.text.contains("领地") }
        if (mine != null) {
            tapRaw(mine.centerX, mine.centerY)
            smartDelay(2000)

            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()

            // 点击采集/驻守
            val gatherBtn = ocr2.find { it.text.contains("采集") || it.text.contains("驻守") || it.text.contains("前往") }
            if (gatherBtn != null) {
                tapRaw(gatherBtn.centerX, gatherBtn.centerY)
                smartDelay(2000)
                if (confirmMarchAndGo()) {
                    log("✓ 同盟资源矿出征成功")
                }
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 召唤孟获 ====================

    private suspend fun executeSummonMengHuo() {
        if (!config.summonMengHuoEnabled) return
        log(">>> 执行召唤孟获")

        if (!ensureWorldMap()) return
        smartDelay(1000)

        // 打开道具/背包
        tapPercent(0.92, 0.92)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 找到召唤令/孟获令
        val summon = ocr.find { it.text.contains("召唤") || it.text.contains("孟获令") }
        if (summon != null) {
            tapRaw(summon.centerX, summon.centerY)
            smartDelay(1500)

            // 点击使用
            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val useBtn = ocr2.find { it.text.contains("使用") }
            if (useBtn != null) {
                tapRaw(useBtn.centerX, useBtn.centerY)
                smartDelay(2000)

                // 确认召唤
                val bmp3 = takeScreenshot() ?: return
                val ocr3 = OcrHelper.recognizeText(bmp3)
                bmp3.recycle()
                val confirm = ocr3.find { it.text.contains("确") || it.text.contains("召唤") }
                if (confirm != null) {
                    tapRaw(confirm.centerX, confirm.centerY)
                    smartDelay(3000)

                    // 召唤后自动攻击
                    val bmp4 = takeScreenshot() ?: return
                    val ocr4 = OcrHelper.recognizeText(bmp4)
                    bmp4.recycle()
                    val attackBtn = ocr4.find { it.text.contains("攻击") || it.text.contains("集结") }
                    if (attackBtn != null) {
                        tapRaw(attackBtn.centerX, attackBtn.centerY)
                        smartDelay(2000)
                        if (confirmMarchAndGo()) {
                            log("✓ 召唤孟获并出征成功")
                        }
                    }
                }
            }
        } else {
            log("未找到召唤令道具")
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 同盟建筑 ====================

    private suspend fun executeAllianceBuild() {
        if (!config.allianceBuildEnabled) return
        log(">>> 执行同盟建筑")

        if (!ensureWorldMap()) return
        smartDelay(1000)

        // 点击同盟按钮
        tapPercent(0.78, 0.97)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 找到同盟建筑入口
        val build = ocr.find { it.text.contains("建筑") || it.text.contains("建造") }
        if (build != null) {
            tapRaw(build.centerX, build.centerY)
            smartDelay(2000)

            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()

            // 找到可建造/帮助的建筑
            val helpBtn = ocr2.find { it.text.contains("帮助") || it.text.contains("建造") || it.text.contains("加速") }
            if (helpBtn != null) {
                tapRaw(helpBtn.centerX, helpBtn.centerY)
                smartDelay(2000)

                // 如果需要出征建造
                val bmp3 = takeScreenshot() ?: return
                val ocr3 = OcrHelper.recognizeText(bmp3)
                bmp3.recycle()
                val allText3 = ocr3.joinToString(" ") { it.text }

                if (allText3.contains("出征") || allText3.contains("一键搭配")) {
                    // 切换投石车（如果配置了）
                    if (config.allianceBuildSwitchCatapult) {
                        val catapult = ocr3.find { it.text.contains("投石") || it.text.contains("攻城") }
                        if (catapult != null) {
                            tapRaw(catapult.centerX, catapult.centerY)
                            smartDelay(1000)
                        }
                    }
                    if (confirmMarchAndGo()) {
                        log("✓ 同盟建筑出征成功")
                    }
                } else {
                    log("✓ 同盟建筑帮助完成")
                }
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 主城资源收取 ====================

    private suspend fun executeMainCityCollect() {
        log("主城资源收取")
        if (!ensureMainCity()) return

        // 收取主城产出（点击主城中心区域的资源气泡）
        if (config.mainCityCollect) {
            // 主城中通常有多个资源产出点，逐个点击
            val positions = listOf(
                Pair(0.3, 0.4), Pair(0.5, 0.35), Pair(0.7, 0.4),
                Pair(0.4, 0.55), Pair(0.6, 0.55)
            )
            for ((px, py) in positions) {
                tapPercent(px, py)
                smartDelay(800)
                // 检查是否弹出收取按钮
                val bmp = takeScreenshot() ?: continue
                val ocr = OcrHelper.recognizeText(bmp)
                bmp.recycle()
                val collect = ocr.find { it.text.contains("收取") || it.text.contains("领取") }
                if (collect != null) {
                    tapRaw(collect.centerX, collect.centerY)
                    smartDelay(500)
                }
            }
            log("✓ 主城资源收取完成")
        }

        // 领地收取
        if (config.territoryCollect) {
            log("领地资源收取")
            // 点击领地入口
            tapPercent(0.15, 0.97)
            smartDelay(2000)
            val bmp = takeScreenshot() ?: return
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val collectAll = ocr.find { it.text.contains("一键") || it.text.contains("收取") }
            if (collectAll != null) {
                tapRaw(collectAll.centerX, collectAll.centerY)
                smartDelay(1000)
                log("✓ 领地收取完成")
            }
            tapBack()
            smartDelay(1000)
        }

        // 封地收取
        if (config.landCollect) {
            log("封地资源收取")
            tapPercent(0.25, 0.97)
            smartDelay(2000)
            val bmp = takeScreenshot() ?: return
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val collectAll = ocr.find { it.text.contains("一键") || it.text.contains("收取") }
            if (collectAll != null) {
                tapRaw(collectAll.centerX, collectAll.centerY)
                smartDelay(1000)
                log("✓ 封地收取完成")
            }
            tapBack()
            smartDelay(1000)
        }
    }

    // ==================== 探索/访问 ====================

    private suspend fun executeExplore() {
        if (!config.autoExplore) return
        log(">>> 执行探索")

        if (!ensureWorldMap()) return
        smartDelay(1000)

        // 点击探索/冒险入口
        tapPercent(0.06, 0.55)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("探索") || allText.contains("冒险") || allText.contains("派遣")) {
            val explore = ocr.find { it.text.contains("探索") || it.text.contains("派遣") || it.text.contains("开始") }
            if (explore != null) {
                tapRaw(explore.centerX, explore.centerY)
                smartDelay(2000)
                log("✓ 探索派遣完成")
            }
        }

        // 访问好友
        if (config.sendVisit) {
            val visit = ocr.find { it.text.contains("访问") || it.text.contains("拜访") }
            if (visit != null) {
                tapRaw(visit.centerX, visit.centerY)
                smartDelay(2000)
                log("✓ 访问完成")
            }
        }

        tapBack()
        smartDelay(1000)
    }

    // ==================== 驯马 ====================

    private suspend fun executeTameHorse() {
        if (!config.tameHorseEnabled) return
        log(">>> 执行驯马")

        if (!ensureMainCity()) return
        smartDelay(1000)

        // 点击马厩/驯马场
        tapPercent(0.8, 0.45)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("驯马") || allText.contains("马厩") || allText.contains("马场")) {
            val tame = ocr.find { it.text.contains("驯马") || it.text.contains("开始") || it.text.contains("训练") }
            if (tame != null) {
                tapRaw(tame.centerX, tame.centerY)
                smartDelay(1500)
                // 确认
                val bmp2 = takeScreenshot() ?: return
                val ocr2 = OcrHelper.recognizeText(bmp2)
                bmp2.recycle()
                val confirm = ocr2.find { it.text.contains("确") || it.text.contains("开始") }
                if (confirm != null) {
                    tapRaw(confirm.centerX, confirm.centerY)
                    smartDelay(1000)
                    log("✓ 驯马已启动")
                }
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 换号/串号 ====================

    private suspend fun executeSwitchAccount() {
        if (!config.switchAccountEnabled) return
        log(">>> 执行换号")

        // 退出当前账号
        tapPercent(0.95, 0.05) // 设置入口
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val settings = ocr.find { it.text.contains("设置") || it.text.contains("账号") }
        if (settings != null) {
            tapRaw(settings.centerX, settings.centerY)
            smartDelay(2000)

            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val switchBtn = ocr2.find { it.text.contains("切换") || it.text.contains("退出") }
            if (switchBtn != null) {
                tapRaw(switchBtn.centerX, switchBtn.centerY)
                smartDelay(2000)
                // 确认退出
                val bmp3 = takeScreenshot() ?: return
                val ocr3 = OcrHelper.recognizeText(bmp3)
                bmp3.recycle()
                val confirm = ocr3.find { it.text.contains("确") }
                if (confirm != null) {
                    tapRaw(confirm.centerX, confirm.centerY)
                    smartDelay(5000)
                    log("✓ 已退出账号，等待重新登录")
                    // 等待登录页面出现
                    delay(10000)
                    // 点击登录
                    tapPercent(0.5, 0.7)
                    smartDelay(8000)
                }
            }
        }
    }

    // ==================== 活动任务 ====================

    private suspend fun executeActivityTask() {
        if (!config.activityEnabled) return
        log(">>> 执行活动任务")

        // 点击活动入口（通常在右上角）
        tapPercent(0.88, 0.08)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val allText = ocr.joinToString(" ") { it.text }

        if (allText.contains("活动") || allText.contains("奖励")) {
            // 领取可领取的奖励
            val reward = ocr.find { it.text.contains("领取") || it.text.contains("奖励") }
            if (reward != null) {
                tapRaw(reward.centerX, reward.centerY)
                smartDelay(1500)
                log("✓ 活动奖励领取")
            }
        }
        tapBack()
        smartDelay(1000)
    }

    // ==================== 名望奖励 ====================

    private suspend fun executeFameReward() {
        if (!config.fameReward) return
        log("收取名望奖励")

        // 点击名望/成就入口
        tapPercent(0.08, 0.08)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()
        val reward = ocr.find { it.text.contains("领取") || it.text.contains("奖励") || it.text.contains("名望") }
        if (reward != null) {
            tapRaw(reward.centerX, reward.centerY)
            smartDelay(1500)
            // 一键领取
            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val collectAll = ocr2.find { it.text.contains("一键") || it.text.contains("全部") }
            if (collectAll != null) {
                tapRaw(collectAll.centerX, collectAll.centerY)
                smartDelay(1000)
                log("✓ 名望奖励领取完成")
            }
        }
        tapBack()
        smartDelay(1000)
    }

    // ==================== 同盟任务 ====================

    private suspend fun executeAllianceTask() {
        if (!config.allianceTask) return
        log("执行同盟任务")

        // 点击同盟按钮
        tapPercent(0.78, 0.97)
        smartDelay(2000)

        val bmp = takeScreenshot() ?: return
        val ocr = OcrHelper.recognizeText(bmp)
        bmp.recycle()

        // 找到任务入口
        val task = ocr.find { it.text.contains("任务") }
        if (task != null) {
            tapRaw(task.centerX, task.centerY)
            smartDelay(2000)

            // 领取奖励
            val bmp2 = takeScreenshot() ?: return
            val ocr2 = OcrHelper.recognizeText(bmp2)
            bmp2.recycle()
            val reward = ocr2.find { it.text.contains("领取") || it.text.contains("完成") }
            if (reward != null) {
                tapRaw(reward.centerX, reward.centerY)
                smartDelay(1000)
                log("✓ 同盟任务奖励领取")
            }
        }
        tapBack()
        tapBack()
        smartDelay(1000)
    }

    // ==================== 游戏检测 ====================

    private suspend fun checkGameForeground() {
        if (!config.gameCheckForeground) return
        // 检查游戏是否在前台（通过截图判断）
        val bmp = takeScreenshot()
        if (bmp == null) {
            log("⚠️ 截图失败，可能游戏不在前台")
            log("尝试重新打开游戏...")
            ShellHelper.launchApp(getGamePackage())
            delay(parseInterval(config.gameReconnectWait))
            return
        }
        bmp.recycle()
    }

    // ==================== 导航方法 ====================

    private suspend fun ensureWorldMap(): Boolean {
        for (attempt in 0..3) {
            engine.checkPausePoint()
            val bmp = takeScreenshot() ?: return false
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val allText = ocr.joinToString(" ") { it.text }

            // 世界地图特征：有"主城"按钮但没有"建造"（建造是主城内的）
            if (allText.contains("主城") && !allText.contains("建造")) return true

            // 尝试点击"天下格"进入世界地图
            val tianxia = ocr.find { it.text.contains("天下格") || it.text.contains("世界") }
            if (tianxia != null) {
                tapRaw(tianxia.centerX, tianxia.centerY)
                smartDelay(3000); continue
            }

            // 兜底：点击左下角世界地图入口
            tapPercent(0.04, 0.97)
            smartDelay(3000)
        }
        return false
    }

    private suspend fun ensureMainCity(): Boolean {
        for (attempt in 0..3) {
            engine.checkPausePoint()
            val bmp = takeScreenshot() ?: return false
            val ocr = OcrHelper.recognizeText(bmp)
            bmp.recycle()
            val allText = ocr.joinToString(" ") { it.text }

            // 主城特征：有"天下格"按钮（说明当前在主城，可以点天下格去世界地图）
            if (allText.contains("天下格") || (allText.contains("建造") && allText.contains("升级"))) return true

            // 点击"主城"按钮回主城
            val mainCity = ocr.find { it.text.contains("主城") }
            if (mainCity != null) {
                tapRaw(mainCity.centerX, mainCity.centerY)
                smartDelay(3000); continue
            }

            // 兜底：按返回
            tapBack()
            smartDelay(1500)
        }
        return false
    }

    private suspend fun tapBack() {
        tapPercent(0.025, 0.04)
        smartDelay(500)
    }

    // ==================== 截图与触控 ====================

    private fun takeScreenshot(): Bitmap? {
        return try {
            screenshoter.obtainScreenShotBitmap()
        } catch (e: Exception) {
            ShellHelper.screencap()
        }
    }

    private fun tapRaw(x: Int, y: Int) {
        val rx = x.toFloat() + Random.nextInt(-clickOffset, clickOffset + 1)
        val ry = y.toFloat() + Random.nextInt(-clickOffset, clickOffset + 1)
        ShellHelper.tap(rx, ry)
    }

    private fun tapPercent(xPct: Double, yPct: Double) {
        tapRaw((screenW * xPct).toInt(), (screenH * yPct).toInt())
    }

    private fun swipePercent(x1: Double, y1: Double, x2: Double, y2: Double, duration: Int = 300) {
        ShellHelper.swipe(
            (screenW * x1).toFloat(), (screenH * y1).toFloat(),
            (screenW * x2).toFloat(), (screenH * y2).toFloat(), duration
        )
    }

    private fun sx(x: Int): Int = x * screenW / BASE_W
    private fun sy(y: Int): Int = y * screenH / BASE_H

    // ==================== 工具方法 ====================

    private suspend fun smartDelay(baseMs: Long) {
        val multiplier = when (config.behaviorDelayMode) {
            "极速" -> 0.5; "快速" -> 0.8; "慢速" -> 1.5; else -> 1.0
        }
        val ms = (baseMs * multiplier).toLong()
        delay(ms + Random.nextLong(0, maxOf(1, ms / 5)))
    }

    private fun now() = System.currentTimeMillis()
    private fun shouldRun(lastTime: Long, intervalMs: Long) = now() - lastTime > intervalMs

    private fun shouldRunRally(): Boolean {
        if (!config.joinMengHuo && !config.joinBlackMountain) return false
        val interval = parseInterval(config.rallyFrequency)
        return now() - lastRallyCheckTime > interval
    }

    private fun shouldRunBuild(): Boolean {
        if (!config.buildUpgradeEnabled && !config.techResearchEnabled && !config.recruitEnabled) return false
        return now() - lastBuildCheckTime > 600_000
    }

    private fun getGamePackage(): String = when (config.gameChannel) {
        "腾讯" -> "com.tencent.tmgp.ywcysg"
        "网易" -> "com.netease.ywcysg"
        else -> "com.tencent.tmgp.ywcysg"
    }

    private fun parseInterval(str: String): Long {
        val num = str.replace(Regex("[^0-9]"), "").toLongOrNull() ?: 3
        return when {
            str.contains("秒") -> num * 1000
            str.contains("小时") -> num * 3600_000
            else -> num * 60_000
        }
    }

    private fun log(msg: String) {
        ScriptLogger.log("D", TAG, msg)
        Log.d(TAG, msg)
    }
}
