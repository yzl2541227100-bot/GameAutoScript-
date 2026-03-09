package com.example.myapplication.ui.tools

import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myapplication.accessibility.ScriptAccessibilityService
import com.example.myapplication.ui.components.InfoItem
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun AccessibilityToolScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    var isRunning by remember { mutableStateOf(ScriptAccessibilityService.isRunning()) }
    var findText by remember { mutableStateOf("") }
    var findResult by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "无障碍服务", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "服务状态", icon = Icons.Outlined.Accessibility) {
            InfoItem("无障碍服务", if (isRunning) "已启用" else "未启用")
            Spacer(Modifier.height(8.dp))
            Button(onClick = {
                context.startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                })
            }, modifier = Modifier.fillMaxWidth()) {
                Text(if (isRunning) "管理无障碍服务" else "开启无障碍服务")
            }
            Spacer(Modifier.height(4.dp))
            FilledTonalButton(onClick = {
                isRunning = ScriptAccessibilityService.isRunning()
                message = "状态: ${if (isRunning) "已启用" else "未启用"}"
            }, modifier = Modifier.fillMaxWidth()) { Text("刷新状态") }
        }

        SectionCard(title = "节点查找", icon = Icons.Outlined.Search) {
            OutlinedTextField(
                value = findText,
                onValueChange = { findText = it },
                label = { Text("查找文本") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(12.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    val service = ScriptAccessibilityService.getInstance()
                    if (service != null && findText.isNotBlank()) {
                        val nodes = service.findNodesByText(findText)
                        findResult = if (nodes.isEmpty()) "未找到节点"
                        else nodes.joinToString("\n") { n ->
                            val rect = android.graphics.Rect()
                            n.getBoundsInScreen(rect)
                            "${n.className} [${rect.left},${rect.top},${rect.right},${rect.bottom}] clickable=${n.isClickable}"
                        }
                    } else {
                        findResult = "无障碍服务未启用"
                    }
                }, modifier = Modifier.weight(1f), enabled = isRunning) { Text("按文本查找") }
            }
            if (findResult.isNotEmpty()) {
                Spacer(Modifier.height(8.dp))
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f)
                    )
                ) {
                    SelectionContainer {
                        Text(findResult, modifier = Modifier.padding(12.dp),
                            style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }

        SectionCard(title = "全局操作", icon = Icons.Outlined.TouchApp) {
            val service = ScriptAccessibilityService.getInstance()
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                FilledTonalButton(onClick = { service?.pressBack() },
                    modifier = Modifier.weight(1f), enabled = isRunning) { Text("返回") }
                FilledTonalButton(onClick = { service?.pressHome() },
                    modifier = Modifier.weight(1f), enabled = isRunning) { Text("主页") }
                FilledTonalButton(onClick = { service?.openRecents() },
                    modifier = Modifier.weight(1f), enabled = isRunning) { Text("最近") }
            }
            Spacer(Modifier.height(4.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                FilledTonalButton(onClick = { service?.openNotifications() },
                    modifier = Modifier.weight(1f), enabled = isRunning) { Text("通知栏") }
                FilledTonalButton(onClick = { service?.openQuickSettings() },
                    modifier = Modifier.weight(1f), enabled = isRunning) { Text("快捷设置") }
            }
        }

        if (message.isNotEmpty()) {
            Text(message, color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(16.dp))
    }
}
