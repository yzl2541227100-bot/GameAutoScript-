package com.example.myapplication.ui.game.tabs

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DescriptionTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        DescSection(Icons.Outlined.Description, "脚本说明") {
            Text("本脚本适用于三国SLG类策略游戏，支持自动采集、建筑升级、招兵、集结、预警等功能。", fontSize = 14.sp)
            Spacer(Modifier.height(8.dp))
            Text("请确保游戏分辨率为 720×1280 或 1080×1920 以获得最佳效果。", fontSize = 14.sp)
        }

        DescSection(Icons.Outlined.Info, "使用步骤") {
            val steps = listOf(
                "1. 在「功能设置」中配置需要的功能模块",
                "2. 选择游戏渠道，确保与实际安装的游戏一致",
                "3. 可保存当前配置为模板，方便切换",
                "4. 点击底部「启动浮窗」开启悬浮控制面板",
                "5. 切换到游戏界面，通过浮窗启动/暂停脚本",
                "6. 脚本运行中可随时通过浮窗停止"
            )
            steps.forEach { step ->
                Text(step, fontSize = 14.sp, modifier = Modifier.padding(vertical = 2.dp))
            }
        }

        DescSection(Icons.Outlined.Info, "功能说明") {
            val features = listOf(
                "一键设置" to "快速配置常用日常任务，选择游戏渠道和模板",
                "日常" to "采集、铜矿、集结、同盟资源矿等日常功能",
                "开荒" to "建筑升级、技术研究、招兵、驯马等发展功能",
                "其他" to "预警设置、同盟建筑、木牛流马切换等辅助功能"
            )
            features.forEach { (name, desc) ->
                Row(modifier = Modifier.padding(vertical = 3.dp)) {
                    Text("• ", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(name, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                    Text("：$desc", fontSize = 14.sp)
                }
            }
        }

        DescSection(Icons.Outlined.Warning, "注意事项") {
            val notes = listOf(
                "• 使用前请确保已开启无障碍服务权限",
                "• 悬浮窗权限需要手动授予",
                "• 建议在稳定的网络环境下使用",
                "• 脚本运行期间请勿手动操作游戏",
                "• 采集预警功能需要保持通知权限开启",
                "• 长时间挂机建议开启屏幕常亮"
            )
            notes.forEach { note ->
                Text(note, fontSize = 14.sp, modifier = Modifier.padding(vertical = 2.dp))
            }
        }

        Spacer(Modifier.height(80.dp))
    }
}

@Composable
private fun DescSection(
    icon: ImageVector,
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(icon, null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(22.dp))
                Spacer(Modifier.width(8.dp))
                Text(title, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
            }
            Spacer(Modifier.height(10.dp))
            content()
        }
    }
}
