package com.example.myapplication.ui.game.tabs

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.script.ScriptConfig
import com.example.myapplication.ui.game.*

private val troopTypes = listOf("木牛流马", "一键搭配", "步兵", "骑兵", "弓兵", "器械")
private val gatherLevels = listOf("1级(4级)", "2级(5级)", "3级(6级)", "4级(7级)", "5级(8级)")
private val gatherStrategies = listOf("优先高级(推荐)", "优先低级", "随机")
private val copperLevels = listOf("1级", "2级", "3级", "4级", "5级")
private val rallyFreqs = listOf("1分钟", "2分钟", "3分钟", "5分钟", "10分钟")
private val blackMtnLevels = listOf("1级及以上", "2级及以上", "3级及以上", "4级及以上", "5级及以上")
private val mengHuoTypes = listOf("普通+精英", "仅普通", "仅精英")
private val allianceTeams = listOf("第1队", "第2队", "第3队", "第4队", "第5队")

@Composable
fun DailyTab(config: ScriptConfig, onConfigChange: (ScriptConfig) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        // ===== 采集 =====
        ConfigSectionHeader("采集设置")
        ConfigCheckbox("启用采集", config.gatherEnabled, onCheckedChange = { onConfigChange(config.copy(gatherEnabled = it)) })
        ConfigSpinner("采集策略", config.gatherStrategy, gatherStrategies, onSelected = { onConfigChange(config.copy(gatherStrategy = it)) })
        ConfigNumberInput("采集频率", config.gatherFrequency, { onConfigChange(config.copy(gatherFrequency = it)) }, "次")

        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("粮", config.gatherFarm, onCheckedChange = { onConfigChange(config.copy(gatherFarm = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("木", config.gatherWood, onCheckedChange = { onConfigChange(config.copy(gatherWood = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("石", config.gatherStone, onCheckedChange = { onConfigChange(config.copy(gatherStone = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("铁", config.gatherIron, onCheckedChange = { onConfigChange(config.copy(gatherIron = it)) }, modifier = Modifier.weight(1f))
        }

        ConfigSpinner("最低等级", config.gatherLevelMin, gatherLevels, onSelected = { onConfigChange(config.copy(gatherLevelMin = it)) })
        ConfigSpinner("最高等级", config.gatherLevelMax, gatherLevels, onSelected = { onConfigChange(config.copy(gatherLevelMax = it)) })
        ConfigNumberInput("仓库低于跳过(%)", config.gatherSkipBelowStorage, { onConfigChange(config.copy(gatherSkipBelowStorage = it)) }, "%")
        ConfigCheckbox("跳过高等级", config.gatherSkipHighLevel, onCheckedChange = { onConfigChange(config.copy(gatherSkipHighLevel = it)) })
        ConfigCheckbox("优先盟友前线", config.gatherSkipAllyFront, onCheckedChange = { onConfigChange(config.copy(gatherSkipAllyFront = it)) })
        ConfigCheckbox("夜间仅领地采集", config.gatherNightTerritoryOnly, onCheckedChange = { onConfigChange(config.copy(gatherNightTerritoryOnly = it)) })
        ConfigCheckbox("按顺序采集", config.gatherOptions_collectOrder, onCheckedChange = { onConfigChange(config.copy(gatherOptions_collectOrder = it)) })
        ConfigCheckbox("召回前哨", config.gatherOptions_recallOutpost, onCheckedChange = { onConfigChange(config.copy(gatherOptions_recallOutpost = it)) })

        // 采集队伍
        ConfigSectionHeader("采集队伍")
        TeamRow("第1队", config.gatherTeam1Enabled, { onConfigChange(config.copy(gatherTeam1Enabled = it)) },
            config.gatherTeam1Type, troopTypes, { onConfigChange(config.copy(gatherTeam1Type = it)) },
            config.gatherTeam1AutoForce, { onConfigChange(config.copy(gatherTeam1AutoForce = it)) })
        TeamRow("第2队", config.gatherTeam2Enabled, { onConfigChange(config.copy(gatherTeam2Enabled = it)) },
            config.gatherTeam2Type, troopTypes, { onConfigChange(config.copy(gatherTeam2Type = it)) },
            config.gatherTeam2AutoForce, { onConfigChange(config.copy(gatherTeam2AutoForce = it)) })
        TeamRow("第3队", config.gatherTeam3Enabled, { onConfigChange(config.copy(gatherTeam3Enabled = it)) },
            config.gatherTeam3Type, troopTypes, { onConfigChange(config.copy(gatherTeam3Type = it)) },
            config.gatherTeam3AutoForce, { onConfigChange(config.copy(gatherTeam3AutoForce = it)) })
        TeamRow("第4队", config.gatherTeam4Enabled, { onConfigChange(config.copy(gatherTeam4Enabled = it)) },
            config.gatherTeam4Type, troopTypes, { onConfigChange(config.copy(gatherTeam4Type = it)) },
            config.gatherTeam4AutoForce, { onConfigChange(config.copy(gatherTeam4AutoForce = it)) })
        TeamRow("第5队", config.gatherTeam5Enabled, { onConfigChange(config.copy(gatherTeam5Enabled = it)) },
            config.gatherTeam5Type, troopTypes, { onConfigChange(config.copy(gatherTeam5Type = it)) },
            config.gatherTeam5AutoForce, { onConfigChange(config.copy(gatherTeam5AutoForce = it)) })

        // ===== 铜矿 =====
        ConfigSectionHeader("铜矿设置")
        ConfigCheckbox("启用铜矿", config.copperEnabled, onCheckedChange = { onConfigChange(config.copy(copperEnabled = it)) })
        ConfigSpinner("最低等级", config.copperLevelMin, copperLevels, onSelected = { onConfigChange(config.copy(copperLevelMin = it)) })
        ConfigSpinner("最高等级", config.copperLevelMax, copperLevels, onSelected = { onConfigChange(config.copy(copperLevelMax = it)) })
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("1队", config.copperTeam1, onCheckedChange = { onConfigChange(config.copy(copperTeam1 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("2队", config.copperTeam2, onCheckedChange = { onConfigChange(config.copy(copperTeam2 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("3队", config.copperTeam3, onCheckedChange = { onConfigChange(config.copy(copperTeam3 = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("4队", config.copperTeam4, onCheckedChange = { onConfigChange(config.copy(copperTeam4 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("5队", config.copperTeam5, onCheckedChange = { onConfigChange(config.copy(copperTeam5 = it)) }, modifier = Modifier.weight(1f))
            Spacer(Modifier.weight(1f))
        }
        ConfigNumberInput("最低战力", config.copperForce, { onConfigChange(config.copy(copperForce = it)) })
        ConfigSpinner("兵种类型", config.copperTroopType, troopTypes, onSelected = { onConfigChange(config.copy(copperTroopType = it)) })
        ConfigNumberInput("低于跳过", config.copperSkipBelow, { onConfigChange(config.copy(copperSkipBelow = it)) })

        // ===== 集结 =====
        ConfigSectionHeader("集结设置")
        ConfigCheckbox("加入黑山", config.joinBlackMountain, onCheckedChange = { onConfigChange(config.copy(joinBlackMountain = it)) })
        ConfigSpinner("黑山等级", config.blackMountainLevel, blackMtnLevels, onSelected = { onConfigChange(config.copy(blackMountainLevel = it)) })
        ConfigCheckbox("加入孟获", config.joinMengHuo, onCheckedChange = { onConfigChange(config.copy(joinMengHuo = it)) })
        ConfigSpinner("孟获类型", config.mengHuoType, mengHuoTypes, onSelected = { onConfigChange(config.copy(mengHuoType = it)) })
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("1队", config.rallyTeam1, onCheckedChange = { onConfigChange(config.copy(rallyTeam1 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("2队", config.rallyTeam2, onCheckedChange = { onConfigChange(config.copy(rallyTeam2 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("3队", config.rallyTeam3, onCheckedChange = { onConfigChange(config.copy(rallyTeam3 = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("4队", config.rallyTeam4, onCheckedChange = { onConfigChange(config.copy(rallyTeam4 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("5队", config.rallyTeam5, onCheckedChange = { onConfigChange(config.copy(rallyTeam5 = it)) }, modifier = Modifier.weight(1f))
            Spacer(Modifier.weight(1f))
        }
        ConfigSpinner("集结频率", config.rallyFrequency, rallyFreqs, onSelected = { onConfigChange(config.copy(rallyFrequency = it)) })
        ConfigNumberInput("最大距离", config.rallyMaxDistance, { onConfigChange(config.copy(rallyMaxDistance = it)) })
        ConfigNumberInput("最低战力", config.rallyForce, { onConfigChange(config.copy(rallyForce = it)) })
        ConfigCheckbox("返回后加入新集结", config.rallyReturnJoinNew, onCheckedChange = { onConfigChange(config.copy(rallyReturnJoinNew = it)) })

        // ===== 同盟资源矿 =====
        ConfigSectionHeader("同盟资源矿")
        ConfigCheckbox("启用同盟矿", config.allianceMineEnabled, onCheckedChange = { onConfigChange(config.copy(allianceMineEnabled = it)) })
        ConfigSpinner("使用队伍", config.allianceMineTeam, allianceTeams, onSelected = { onConfigChange(config.copy(allianceMineTeam = it)) })
        ConfigNumberInput("最大距离", config.allianceMineMaxDistance, { onConfigChange(config.copy(allianceMineMaxDistance = it)) })
        ConfigCheckbox("切换木牛流马", config.allianceMineSwitchWoodOx, onCheckedChange = { onConfigChange(config.copy(allianceMineSwitchWoodOx = it)) })
        ConfigNumberInput("最低战力", config.allianceMineForce, { onConfigChange(config.copy(allianceMineForce = it)) })

        // ===== 驯马 =====
        ConfigSectionHeader("驯马设置")
        ConfigCheckbox("启用驯马", config.tameHorseEnabled, onCheckedChange = { onConfigChange(config.copy(tameHorseEnabled = it)) })
        ConfigSpinner("驯马类型", config.tameHorseType, listOf("普通驯马", "专属驯马"), onSelected = { onConfigChange(config.copy(tameHorseType = it)) })

        // ===== 预警 =====
        ConfigSectionHeader("预警设置")
        ConfigCheckbox("采集被攻击预警", config.alertGatherAttack, onCheckedChange = { onConfigChange(config.copy(alertGatherAttack = it)) })
        ConfigCheckbox("召回部队", config.alertRecallTeam, onCheckedChange = { onConfigChange(config.copy(alertRecallTeam = it)) })
        ConfigCheckbox("暂停采集", config.alertPauseGather, onCheckedChange = { onConfigChange(config.copy(alertPauseGather = it)) })
        ConfigSpinner("暂停时间", config.alertPauseGatherTime, listOf("30分钟", "1小时", "2小时", "4小时", "8小时"), onSelected = { onConfigChange(config.copy(alertPauseGatherTime = it)) })
        ConfigCheckbox("主城被侦察预警", config.alertMainCityScout, onCheckedChange = { onConfigChange(config.copy(alertMainCityScout = it)) })
        ConfigCheckbox("主城被攻击预警", config.alertMainCityAttack, onCheckedChange = { onConfigChange(config.copy(alertMainCityAttack = it)) })

        // ===== 微信推送 =====
        ConfigSectionHeader("微信推送")
        ConfigCheckbox("启用微信推送", config.alertWechatPush, onCheckedChange = { onConfigChange(config.copy(alertWechatPush = it)) })
        ConfigTextInput("设备名称", config.alertWechatDeviceName, { onConfigChange(config.copy(alertWechatDeviceName = it)) })
        ConfigTextInput("推送密码", config.alertWechatPassword, { onConfigChange(config.copy(alertWechatPassword = it)) })

        Spacer(Modifier.height(80.dp))
    }
}
