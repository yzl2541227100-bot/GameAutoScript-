package com.example.myapplication.ui.game.tabs

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.script.ScriptConfig
import com.example.myapplication.ui.game.*

private val marchTimes = listOf("5分钟", "10分钟", "15分钟", "20分钟", "30分钟")
private val gameCheckIntervals = listOf("5分钟", "10分钟", "20分钟")
private val reconnectWaits = listOf("10秒", "30秒", "1分钟", "2分钟")
private val switchIntervals = listOf("30分钟", "1小时", "2小时", "4小时", "8小时")
private val idleIntervals = listOf("1小时", "2小时", "4小时", "8小时")
private val idleBehaviors = listOf("无操作", "退出游戏", "切换账号", "串号", "挂断")
private val idleExitTimes = listOf("10分钟", "30分钟", "1小时", "2小时")
private val idlePriorities = listOf("挂断", "切换账号", "串号")
private val delayModes = listOf("快速", "慢速", "快速+随机")

@Composable
fun OtherTab(config: ScriptConfig, onConfigChange: (ScriptConfig) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        // ===== 同盟建筑 =====
        ConfigSectionHeader("同盟建筑")
        ConfigCheckbox("启用同盟建筑", config.allianceBuildEnabled, onCheckedChange = { onConfigChange(config.copy(allianceBuildEnabled = it)) })
        ConfigNumberInput("最低战力", config.allianceBuildForce, { onConfigChange(config.copy(allianceBuildForce = it)) })
        ConfigCheckbox("切换投石车", config.allianceBuildSwitchCatapult, onCheckedChange = { onConfigChange(config.copy(allianceBuildSwitchCatapult = it)) })
        ConfigSpinner("最大行军时间", config.allianceBuildMaxMarchTime, marchTimes, onSelected = { onConfigChange(config.copy(allianceBuildMaxMarchTime = it)) })
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("1队", config.allianceBuildTeam1, onCheckedChange = { onConfigChange(config.copy(allianceBuildTeam1 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("2队", config.allianceBuildTeam2, onCheckedChange = { onConfigChange(config.copy(allianceBuildTeam2 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("3队", config.allianceBuildTeam3, onCheckedChange = { onConfigChange(config.copy(allianceBuildTeam3 = it)) }, modifier = Modifier.weight(1f))
        }
        Row(Modifier.fillMaxWidth()) {
            ConfigCheckbox("4队", config.allianceBuildTeam4, onCheckedChange = { onConfigChange(config.copy(allianceBuildTeam4 = it)) }, modifier = Modifier.weight(1f))
            ConfigCheckbox("5队", config.allianceBuildTeam5, onCheckedChange = { onConfigChange(config.copy(allianceBuildTeam5 = it)) }, modifier = Modifier.weight(1f))
            Spacer(Modifier.weight(1f))
        }

        // ===== 游戏检测 =====
        ConfigSectionHeader("游戏检测")
        ConfigCheckbox("前台检测", config.gameCheckForeground, onCheckedChange = { onConfigChange(config.copy(gameCheckForeground = it)) })
        ConfigSpinner("检测间隔", config.gameCheckInterval, gameCheckIntervals, onSelected = { onConfigChange(config.copy(gameCheckInterval = it)) })
        ConfigCheckbox("保持游戏前台", config.gameKeepForeground, onCheckedChange = { onConfigChange(config.copy(gameKeepForeground = it)) })
        ConfigSpinner("重连等待", config.gameReconnectWait, reconnectWaits, onSelected = { onConfigChange(config.copy(gameReconnectWait = it)) })

        // ===== 换号 =====
        ConfigSectionHeader("换号设置")
        ConfigCheckbox("启用换号", config.switchAccountEnabled, onCheckedChange = { onConfigChange(config.copy(switchAccountEnabled = it)) })
        ConfigSpinner("换号间隔", config.switchAccountInterval, switchIntervals, onSelected = { onConfigChange(config.copy(switchAccountInterval = it)) })
        ConfigTextInput("账号列表", config.switchAccountList, { onConfigChange(config.copy(switchAccountList = it)) })

        // ===== 串号 =====
        ConfigSectionHeader("串号设置")
        ConfigCheckbox("启用串号", config.serialAccountEnabled, onCheckedChange = { onConfigChange(config.copy(serialAccountEnabled = it)) })
        ConfigSpinner("串号间隔", config.serialAccountInterval, switchIntervals, onSelected = { onConfigChange(config.copy(serialAccountInterval = it)) })
        ConfigTextInput("账号列表", config.serialAccountList, { onConfigChange(config.copy(serialAccountList = it)) })
        ConfigCheckbox("切换前重启游戏", config.serialRestartBefore, onCheckedChange = { onConfigChange(config.copy(serialRestartBefore = it)) })

        // ===== 挂断/挂飞 =====
        ConfigSectionHeader("挂断/挂飞")
        ConfigCheckbox("启用挂断", config.idleDisconnectEnabled, onCheckedChange = { onConfigChange(config.copy(idleDisconnectEnabled = it)) })
        ConfigSpinner("挂断间隔", config.idleDisconnectInterval, idleIntervals, onSelected = { onConfigChange(config.copy(idleDisconnectInterval = it)) })

        // ===== 界面设置 =====
        ConfigSectionHeader("界面设置")
        ConfigCheckbox("经典界面", config.classicUI, onCheckedChange = { onConfigChange(config.copy(classicUI = it)) })
        ConfigSpinner("空闲行为", config.idleAllDoneBehavior, idleBehaviors, onSelected = { onConfigChange(config.copy(idleAllDoneBehavior = it)) })
        ConfigSpinner("退出游戏时间", config.idleExitGameTime, idleExitTimes, onSelected = { onConfigChange(config.copy(idleExitGameTime = it)) })
        ConfigSpinner("优先操作", config.idlePriority, idlePriorities, onSelected = { onConfigChange(config.copy(idlePriority = it)) })

        // ===== 行为模拟 =====
        ConfigSectionHeader("行为模拟")
        ConfigNumberInput("点击偏移(像素)", config.behaviorClickOffset, { onConfigChange(config.copy(behaviorClickOffset = it)) })
        ConfigSpinner("延迟模式", config.behaviorDelayMode, delayModes, onSelected = { onConfigChange(config.copy(behaviorDelayMode = it)) })

        // ===== 多元星控 =====
        ConfigSectionHeader("多元星控")
        ConfigCheckbox("启用星控", config.starControlEnabled, onCheckedChange = { onConfigChange(config.copy(starControlEnabled = it)) })
        ConfigTextInput("设备名称", config.starControlDeviceName, { onConfigChange(config.copy(starControlDeviceName = it)) })
        ConfigTextInput("星控密码", config.starControlPassword, { onConfigChange(config.copy(starControlPassword = it)) })

        Spacer(Modifier.height(80.dp))
    }
}
