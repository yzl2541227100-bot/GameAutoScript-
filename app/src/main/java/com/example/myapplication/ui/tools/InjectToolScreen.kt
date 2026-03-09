package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myapplication.inject.InjectManager
import com.example.myapplication.ui.components.InfoItem
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun InjectToolScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val injectManager = remember { InjectManager(context) }
    var message by remember { mutableStateOf("") }
    var targetPid by remember { mutableStateOf("") }

    ToolPageScaffold(title = "注入工具", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "设备架构", icon = Icons.Outlined.Memory) {
            InfoItem("当前架构", injectManager.getCurrentArch())
            InfoItem("支持架构", android.os.Build.SUPPORTED_ABIS.joinToString(", "))
        }

        SectionCard(title = "注入文件", icon = Icons.Outlined.FolderOpen) {
            Button(onClick = {
                val dir = injectManager.extractInjectFiles()
                message = if (dir != null) "文件已释放到: ${dir.absolutePath}" else "释放失败 (assets 中无注入文件)"
            }, modifier = Modifier.fillMaxWidth()) { Text("释放注入文件") }
        }

        SectionCard(title = "执行注入", icon = Icons.Outlined.Security) {
            OutlinedTextField(
                value = targetPid,
                onValueChange = { targetPid = it },
                label = { Text("目标 PID") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(12.dp))
            Button(onClick = {
                val pid = targetPid.toIntOrNull()
                if (pid != null) {
                    val ok = injectManager.executeInject(pid)
                    message = if (ok) "注入成功" else "注入失败 (需要 Root)"
                } else {
                    message = "请输入有效的 PID"
                }
            }, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                )
            ) { Text("执行注入 (需Root)") }
        }

        if (message.isNotEmpty()) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f)
                )
            ) {
                Text(message, modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium)
            }
        }
        Spacer(Modifier.height(16.dp))
    }
}
