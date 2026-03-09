package com.example.myapplication.ui.game.tabs

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.script.ScriptConfig
import com.example.myapplication.ui.game.*

@Composable
fun QuickSetTab(
    config: ScriptConfig,
    onConfigChange: (ScriptConfig) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        ConfigSectionHeader("游戏渠道")
        ConfigSpinner(
            label = "游戏渠道",
            selected = config.gameChannel,
            options = listOf("腾讯", "网易", "官方", "4399", "雷电", "MUMU", "华为", "荣耀", "小米", "VIVO", "OPPO", "B站"),
            onSelected = { onConfigChange(config.copy(gameChannel = it)) }
        )

        ConfigCheckbox(
            label = "自动打开游戏",
            checked = config.autoOpenGame,
            onCheckedChange = { onConfigChange(config.copy(autoOpenGame = it)) }
        )

        ConfigSectionHeader("模板管理")
        ConfigSpinner(
            label = "选择模板",
            selected = config.templateName,
            options = listOf("点击选择模板", "日常模板", "采集模板", "开荒模板"),
            onSelected = { onConfigChange(config.copy(templateName = it)) }
        )
        ConfigSpinner(
            label = "我的模板",
            selected = config.myTemplate,
            options = listOf("无", "保存当前为模板"),
            onSelected = { onConfigChange(config.copy(myTemplate = it)) }
        )

        ConfigSectionHeader("日常任务")
        ConfigCheckbox("帮助盟友", config.helpAlly, onCheckedChange = { onConfigChange(config.copy(helpAlly = it)) })
        ConfigCheckbox("科技捐献", config.techDonate, onCheckedChange = { onConfigChange(config.copy(techDonate = it)) })
        ConfigCheckbox("收取贡品", config.collectTribute, onCheckedChange = { onConfigChange(config.copy(collectTribute = it)) })
        ConfigCheckbox("主城收集", config.mainCityCollect, onCheckedChange = { onConfigChange(config.copy(mainCityCollect = it)) })
        ConfigCheckbox("领地收集", config.territoryCollect, onCheckedChange = { onConfigChange(config.copy(territoryCollect = it)) })
        ConfigCheckbox("土地收集", config.landCollect, onCheckedChange = { onConfigChange(config.copy(landCollect = it)) })
        ConfigCheckbox("收取邮件", config.collectMail, onCheckedChange = { onConfigChange(config.copy(collectMail = it)) })
        ConfigCheckbox("同盟任务", config.allianceTask, onCheckedChange = { onConfigChange(config.copy(allianceTask = it)) })
        ConfigCheckbox("声望奖励", config.fameReward, onCheckedChange = { onConfigChange(config.copy(fameReward = it)) })

        ConfigSectionHeader("探索")
        ConfigCheckbox("自动探索", config.autoExplore, onCheckedChange = { onConfigChange(config.copy(autoExplore = it)) })
        ConfigCheckbox("派遣访问", config.sendVisit, onCheckedChange = { onConfigChange(config.copy(sendVisit = it)) })

        Spacer(Modifier.height(80.dp))
    }
}
