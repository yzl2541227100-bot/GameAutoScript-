package com.example.myapplication.ui

import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.layout.*
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
fun SettingsScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    var useAccessibility by remember { mutableStateOf(false) }
    var writeLog by remember { mutableStateOf(false) }
    var autoStart by remember { mutableStateOf(false) }

    ToolPageScaffold(title = "设置", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "运行模式", icon = Icons.Outlined.Tune) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column(Modifier.weight(1f)) {
                    Text("无障碍模式")
                    Text("使用无障碍服务执行操作", style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Switch(checked = useAccessibility, onCheckedChange = { useAccessibility = it })
            }
            HorizontalDivider(Modifier.padding(vertical = 8.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column(Modifier.weight(1f)) {
                    Text("写入日志文件")
                    Text("将运行日志保存到文件", style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Switch(checked = writeLog, onCheckedChange = { writeLog = it })
            }
            HorizontalDivider(Modifier.padding(vertical = 8.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column(Modifier.weight(1f)) {
                    Text("开机自启")
                    Text("开机后自动启动守护服务", style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Switch(checked = autoStart, onCheckedChange = { autoStart = it })
            }
        }

        SectionCard(title = "权限管理", icon = Icons.Outlined.Security) {
            Button(onClick = {
                context.startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                })
            }, modifier = Modifier.fillMaxWidth()) { Text("无障碍服务设置") }
            Spacer(Modifier.height(4.dp))
            FilledTonalButton(onClick = {
                context.startActivity(Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                })
            }, modifier = Modifier.fillMaxWidth()) { Text("悬浮窗权限") }
            Spacer(Modifier.height(4.dp))
            FilledTonalButton(onClick = {
                context.startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                })
            }, modifier = Modifier.fillMaxWidth()) { Text("输入法设置") }
        }

        SectionCard(title = "服务状态", icon = Icons.Outlined.Info) {
            InfoItem("无障碍服务", if (ScriptAccessibilityService.isRunning()) "已启用" else "未启用")
            InfoItem("应用版本", "1.0.0")
        }

        Spacer(Modifier.height(16.dp))
    }
}
