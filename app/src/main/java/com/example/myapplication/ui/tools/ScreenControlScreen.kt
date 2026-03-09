package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.ScriptAction
import com.example.myapplication.ui.components.InfoItem
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun ScreenControlScreen(action: ScriptAction?, onBack: () -> Unit) {
    var brightness by remember { mutableFloatStateOf(50f) }
    var keepScreenOn by remember { mutableStateOf(false) }
    var rotationLock by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "屏幕控制", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "屏幕状态", icon = Icons.Outlined.Info) {
            InfoItem("锁屏状态", if (action?.isLockScreen() == true) "已锁屏" else "未锁屏")
            InfoItem("屏幕旋转", "${action?.getScreenRotation() ?: 0}")
        }

        SectionCard(title = "亮度控制", icon = Icons.Outlined.Brightness6) {
            Text("亮度: ${brightness.toInt()}%")
            Slider(value = brightness, onValueChange = { brightness = it }, valueRange = 0f..100f)
            Button(onClick = {
                action?.setBacklightLevel(brightness.toInt())
                message = "亮度已设置为 ${brightness.toInt()}%"
            }, modifier = Modifier.fillMaxWidth()) { Text("设置亮度") }
        }

        SectionCard(title = "屏幕常亮", icon = Icons.Outlined.LightMode) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("保持屏幕常亮")
                Switch(checked = keepScreenOn, onCheckedChange = {
                    keepScreenOn = it
                    action?.keepScreen(it)
                    message = if (it) "屏幕常亮已开启" else "屏幕常亮已关闭"
                })
            }
        }

        SectionCard(title = "旋转锁定", icon = Icons.Outlined.ScreenRotation) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("锁定屏幕旋转")
                Switch(checked = rotationLock, onCheckedChange = {
                    rotationLock = it
                    action?.setRotationLock(it)
                    message = if (it) "旋转已锁定" else "旋转已解锁"
                })
            }
        }

        SectionCard(title = "锁屏操作", icon = Icons.Outlined.Lock) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    action?.lockScreen()
                    message = "已锁屏"
                }, modifier = Modifier.weight(1f)) { Text("锁屏") }
                FilledTonalButton(onClick = {
                    action?.unlockScreen()
                    message = "已解锁"
                }, modifier = Modifier.weight(1f)) { Text("解锁") }
            }
        }

        if (message.isNotEmpty()) {
            Text(message, color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(16.dp))
    }
}
