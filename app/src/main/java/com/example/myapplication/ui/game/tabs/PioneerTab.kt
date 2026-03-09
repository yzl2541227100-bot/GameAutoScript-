package com.example.myapplication.ui.game.tabs

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.script.ScriptConfig
import com.example.myapplication.ui.game.*

private val buildLevels = listOf("5级", "8级", "10级", "12级", "15级", "18级", "20级", "25级")
private val techLimits = listOf("一级兵", "二级兵", "三级兵", "四级兵", "五级兵")
private val recruitTypes = listOf("一级兵", "二级兵", "三级兵", "四级兵", "五级兵")
private val horseTypes = listOf("普通驯马", "专属驯马")
private val teamSelections = listOf("第1队", "第2队", "第3队", "第4队", "第5队")
private val huntMarchMethods = listOf("搜索行军", "坐标行军", "随机行军")
private val huntForceThresholds = listOf("25%", "50%", "99%")
private val huntLevels = listOf("1级", "5级", "10级", "15级", "20级", "25级", "30级", "40级", "50级", "最高级")
private val huntTroopTypes = listOf("精锐", "普通")
private val trainFreqs = listOf("30秒", "1分钟", "5分钟", "10分钟", "30分钟", "1小时", "天")
private val trainTroopTypes = listOf("精锐", "普通")
private val trainTroopClasses = listOf("自动", "骑兵", "步兵", "枪兵", "弓兵")
private val summonFreqs = listOf("30分钟", "1小时", "2小时", "4小时")
private val summonTypes = listOf("普通", "精英")
private val peaceShieldThresholds = listOf("1小时", "2小时", "4小时", "8小时")

@Composable
fun PioneerTab(config: ScriptConfig, onConfigChange: (ScriptConfig) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        // ===== 建筑升级 =====
        ConfigSectionHeader("建筑升级")
        ConfigCheckbox("启用建筑升级", config.buildUpgradeEnabled, onCheckedChange = { onConfigChange(config.copy(buildUpgradeEnabled = it)) })
        ConfigCheckbox("新手引导模式", config.buildTutorialMode, onCheckedChange = { onConfigChange(config.copy(buildTutorialMode = it)) })
        ConfigSpinner("最高等级", config.buildMaxLevel, buildLevels, onSelected = { onConfigChange(config.copy(buildMaxLevel = it)) })
        ConfigCheckbox("使用加速", config.buildUseSpeed, onCheckedChange = { onConfigChange(config.copy(buildUseSpeed = it)) })
        ConfigCheckbox("使用资源", config.buildUseResource, onCheckedChange = { onConfigChange(config.copy(buildUseResource = it)) })

        ConfigSectionHeader("建筑类型")
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("农田", config.buildFarm, onCheckedChange = { onConfigChange(config.copy(buildFarm = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("伐木场", config.buildLumber, onCheckedChange = { onConfigChange(config.copy(buildLumber = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("采石场", config.buildQuarry, onCheckedChange = { onConfigChange(config.copy(buildQuarry = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("炼铁厂", config.buildIronWorks, onCheckedChange = { onConfigChange(config.copy(buildIronWorks = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("兵营", config.buildBarracks, onCheckedChange = { onConfigChange(config.copy(buildBarracks = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("学院", config.buildSchool, onCheckedChange = { onConfigChange(config.copy(buildSchool = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("太学", config.buildUniversity, onCheckedChange = { onConfigChange(config.copy(buildUniversity = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("铁匠铺", config.buildBlacksmith, onCheckedChange = { onConfigChange(config.copy(buildBlacksmith = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("医馆", config.buildHospital, onCheckedChange = { onConfigChange(config.copy(buildHospital = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("仓库", config.buildWarehouse, onCheckedChange = { onConfigChange(config.copy(buildWarehouse = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("四方馆", config.buildFourSquare, onCheckedChange = { onConfigChange(config.copy(buildFourSquare = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("演武厅", config.buildMilitaryHall, onCheckedChange = { onConfigChange(config.copy(buildMilitaryHall = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("城墙", config.buildWall, onCheckedChange = { onConfigChange(config.copy(buildWall = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("箭塔", config.buildTurret, onCheckedChange = { onConfigChange(config.copy(buildTurret = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("主城", config.buildCapitalHall, onCheckedChange = { onConfigChange(config.copy(buildCapitalHall = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("市场", config.buildMarket, onCheckedChange = { onConfigChange(config.copy(buildMarket = it)) }, modifier = Modifier.weight(1f))
        }

        // ===== 技术研究 =====
        ConfigSectionHeader("技术研究")
        ConfigCheckbox("启用技术研究", config.techResearchEnabled, onCheckedChange = { onConfigChange(config.copy(techResearchEnabled = it)) })
        ConfigSpinner("研究上限", config.techResearchLimit, techLimits, onSelected = { onConfigChange(config.copy(techResearchLimit = it)) })
        ConfigCheckbox("使用加速", config.techUseSpeed, onCheckedChange = { onConfigChange(config.copy(techUseSpeed = it)) })
        ConfigCheckbox("使用资源", config.techUseResource, onCheckedChange = { onConfigChange(config.copy(techUseResource = it)) })

        // ===== 招兵 =====
        ConfigSectionHeader("招兵设置")
        ConfigCheckbox("启用招兵", config.recruitEnabled, onCheckedChange = { onConfigChange(config.copy(recruitEnabled = it)) })
        ConfigSpinner("兵种类型", config.recruitType, recruitTypes, onSelected = { onConfigChange(config.copy(recruitType = it)) })
        ConfigNumberInput("目标数量", config.recruitTarget, { onConfigChange(config.copy(recruitTarget = it)) })
        ConfigCheckbox("使用加速", config.recruitUseSpeed, onCheckedChange = { onConfigChange(config.copy(recruitUseSpeed = it)) })
        ConfigCheckbox("自动晋升", config.recruitPromote, onCheckedChange = { onConfigChange(config.copy(recruitPromote = it)) })

        // ===== 配队 =====
        ConfigSectionHeader("配队设置")
        ConfigCheckbox("自动招兵", config.autoRecruit, onCheckedChange = { onConfigChange(config.copy(autoRecruit = it)) })
        ConfigCheckbox("自动配队", config.autoFormation, onCheckedChange = { onConfigChange(config.copy(autoFormation = it)) })

        // ===== 打野 =====
        ConfigSectionHeader("打野设置")
        ConfigCheckbox("启用打野", config.huntEnabled, onCheckedChange = { onConfigChange(config.copy(huntEnabled = it)) })
        ConfigCheckbox("队伍打野", config.huntTeamEnabled, onCheckedChange = { onConfigChange(config.copy(huntTeamEnabled = it)) })
        ConfigSpinner("队伍选择", config.huntTeamSelection, teamSelections, onSelected = { onConfigChange(config.copy(huntTeamSelection = it)) })
        ConfigCheckbox("单队打野", config.huntSingleEnabled, onCheckedChange = { onConfigChange(config.copy(huntSingleEnabled = it)) })
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("1队", config.huntSingleTeam1, onCheckedChange = { onConfigChange(config.copy(huntSingleTeam1 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("2队", config.huntSingleTeam2, onCheckedChange = { onConfigChange(config.copy(huntSingleTeam2 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("3队", config.huntSingleTeam3, onCheckedChange = { onConfigChange(config.copy(huntSingleTeam3 = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("4队", config.huntSingleTeam4, onCheckedChange = { onConfigChange(config.copy(huntSingleTeam4 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("5队", config.huntSingleTeam5, onCheckedChange = { onConfigChange(config.copy(huntSingleTeam5 = it)) }, modifier = Modifier.weight(1f))
            Spacer(Modifier.weight(1f))
        }
        ConfigSpinner("行军方式", config.huntMarchMethod, huntMarchMethods, onSelected = { onConfigChange(config.copy(huntMarchMethod = it)) })
        ConfigSpinner("兵力阈值", config.huntForceThreshold, huntForceThresholds, onSelected = { onConfigChange(config.copy(huntForceThreshold = it)) })
        ConfigSpinner("打野等级", config.huntLevel, huntLevels, onSelected = { onConfigChange(config.copy(huntLevel = it)) })
        ConfigCheckbox("失败降级", config.huntFailDowngrade, onCheckedChange = { onConfigChange(config.copy(huntFailDowngrade = it)) })
        ConfigSpinner("兵种类型", config.huntTroopType, huntTroopTypes, onSelected = { onConfigChange(config.copy(huntTroopType = it)) })
        ConfigCheckbox("每日奖励", config.huntDailyReward, onCheckedChange = { onConfigChange(config.copy(huntDailyReward = it)) })
        ConfigCheckbox("自动治疗", config.huntAutoHeal, onCheckedChange = { onConfigChange(config.copy(huntAutoHeal = it)) })
        ConfigCheckbox("使用加速", config.huntUseSpeed, onCheckedChange = { onConfigChange(config.copy(huntUseSpeed = it)) })

        // ===== 练兵 =====
        ConfigSectionHeader("练兵设置")
        ConfigCheckbox("启用练兵", config.trainEnabled, onCheckedChange = { onConfigChange(config.copy(trainEnabled = it)) })
        ConfigSpinner("练兵频率", config.trainFrequency, trainFreqs, onSelected = { onConfigChange(config.copy(trainFrequency = it)) })
        ConfigSpinner("兵种类型", config.trainTroopType, trainTroopTypes, onSelected = { onConfigChange(config.copy(trainTroopType = it)) })
        ConfigSpinner("兵种分类", config.trainTroopClass, trainTroopClasses, onSelected = { onConfigChange(config.copy(trainTroopClass = it)) })

        // ===== 锻造 =====
        ConfigSectionHeader("锻造设置")
        ConfigCheckbox("启用锻造", config.forgeEnabled, onCheckedChange = { onConfigChange(config.copy(forgeEnabled = it)) })
        ConfigCheckbox("迁城令", config.forgeMoveCity, onCheckedChange = { onConfigChange(config.copy(forgeMoveCity = it)) })
        ConfigCheckbox("免战令", config.forgePeaceShield, onCheckedChange = { onConfigChange(config.copy(forgePeaceShield = it)) })
        ConfigCheckbox("资源令", config.forgeResourceToken, onCheckedChange = { onConfigChange(config.copy(forgeResourceToken = it)) })
        ConfigCheckbox("火药", config.forgeGunpowder, onCheckedChange = { onConfigChange(config.copy(forgeGunpowder = it)) })
        ConfigCheckbox("研究加速", config.forgeResearchSpeed, onCheckedChange = { onConfigChange(config.copy(forgeResearchSpeed = it)) })
        ConfigCheckbox("使用金币刷新", config.forgeUseGoldRefresh, onCheckedChange = { onConfigChange(config.copy(forgeUseGoldRefresh = it)) })

        // ===== 活动 =====
        ConfigSectionHeader("活动设置")
        ConfigCheckbox("启用活动", config.activityEnabled, onCheckedChange = { onConfigChange(config.copy(activityEnabled = it)) })
        ConfigCheckbox("自动识别领取", config.activityAutoRecognize, onCheckedChange = { onConfigChange(config.copy(activityAutoRecognize = it)) })

        // ===== 使用道具 =====
        ConfigSectionHeader("使用道具")
        ConfigCheckbox("资源箱", config.useResourceBox, onCheckedChange = { onConfigChange(config.copy(useResourceBox = it)) })
        ConfigCheckbox("体力药水", config.useStaminaPotion, onCheckedChange = { onConfigChange(config.copy(useStaminaPotion = it)) })
        ConfigCheckbox("自动免战令", config.usePeaceShieldAuto, onCheckedChange = { onConfigChange(config.copy(usePeaceShieldAuto = it)) })
        ConfigSpinner("免战阈值", config.usePeaceShieldThreshold, peaceShieldThresholds, onSelected = { onConfigChange(config.copy(usePeaceShieldThreshold = it)) })
        ConfigCheckbox("召唤孟获", config.summonMengHuoEnabled, onCheckedChange = { onConfigChange(config.copy(summonMengHuoEnabled = it)) })
        ConfigSpinner("召唤频率", config.summonMengHuoFrequency, summonFreqs, onSelected = { onConfigChange(config.copy(summonMengHuoFrequency = it)) })
        ConfigSpinner("召唤类型", config.summonMengHuoType, summonTypes, onSelected = { onConfigChange(config.copy(summonMengHuoType = it)) })
        ConfigSpinner("召唤队伍", config.summonMengHuoTeam, teamSelections, onSelected = { onConfigChange(config.copy(summonMengHuoTeam = it)) })
        ConfigNumberInput("召唤兵力", config.summonMengHuoForce, { onConfigChange(config.copy(summonMengHuoForce = it)) })
        ConfigCheckbox("优先于其他任务", config.summonMengHuoPriority, onCheckedChange = { onConfigChange(config.copy(summonMengHuoPriority = it)) })

        // ===== 自动加盟 =====
        ConfigSectionHeader("自动加盟")
        ConfigCheckbox("启用自动加盟", config.autoJoinAlliance, onCheckedChange = { onConfigChange(config.copy(autoJoinAlliance = it)) })
        ConfigTextInput("联盟名称", config.autoJoinAllianceName, { onConfigChange(config.copy(autoJoinAllianceName = it)) })

        Spacer(Modifier.height(80.dp))
    }
}
