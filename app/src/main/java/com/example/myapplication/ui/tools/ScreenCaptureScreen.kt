package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.ScriptAction
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun ScreenCaptureScreen(action: ScriptAction?, onBack: () -> Unit) {
    var savePath by remember { mutableStateOf("/sdcard/DCIM/script/capture.png") }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "截图工具", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "屏幕截图", icon = Icons.Outlined.Screenshot) {
            OutlinedTextField(
                value = savePath,
                onValueChange = { savePath = it },
                label = { Text("保存路径") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(12.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    val ok = action?.screencap(savePath) ?: false
                    message = if (ok) "截图已保存: $savePath" else "截图失败"
                }, modifier = Modifier.weight(1f)) { Text("截图") }
                FilledTonalButton(onClick = {
                    val ok = action?.insertImageToGallery(savePath) ?: false
                    message = if (ok) "已插入相册" else "插入失败"
                }, modifier = Modifier.weight(1f)) { Text("存入相册") }
            }
        }

        SectionCard(title = "截图管理", icon = Icons.Outlined.FolderOpen) {
            Button(onClick = {
                action?.clearAllPhotos()
                message = "已清除所有截图"
            }, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                )
            ) { Text("清除所有截图") }
        }

        if (message.isNotEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
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
