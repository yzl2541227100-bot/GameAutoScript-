package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
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
fun QrToolScreen(action: ScriptAction?, onBack: () -> Unit) {
    var encodeText by remember { mutableStateOf("") }
    var encodePath by remember { mutableStateOf("/sdcard/DCIM/script/qr.png") }
    var decodePath by remember { mutableStateOf("") }
    var decodeResult by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "二维码工具", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "生成二维码", icon = Icons.Outlined.QrCode) {
            OutlinedTextField(
                value = encodeText,
                onValueChange = { encodeText = it },
                label = { Text("内容") },
                modifier = Modifier.fillMaxWidth(),
                minLines = 2, maxLines = 4
            )
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = encodePath,
                onValueChange = { encodePath = it },
                label = { Text("保存路径") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(12.dp))
            Button(onClick = {
                if (encodeText.isNotBlank()) {
                    val ok = action?.imageQREncode(encodePath, encodeText) ?: false
                    message = if (ok) "二维码已生成: $encodePath" else "生成失败"
                }
            }, modifier = Modifier.fillMaxWidth()) { Text("生成") }
        }

        SectionCard(title = "识别二维码", icon = Icons.Outlined.QrCodeScanner) {
            OutlinedTextField(
                value = decodePath,
                onValueChange = { decodePath = it },
                label = { Text("图片路径") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(12.dp))
            Button(onClick = {
                if (decodePath.isNotBlank()) {
                    decodeResult = action?.imageQRDecode(decodePath) ?: ""
                    message = if (decodeResult.isNotEmpty()) "识别成功" else "识别失败"
                }
            }, modifier = Modifier.fillMaxWidth()) { Text("识别") }
            if (decodeResult.isNotEmpty()) {
                Spacer(Modifier.height(8.dp))
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f)
                    )
                ) {
                    Column(Modifier.padding(12.dp)) {
                        Text("识别结果:", style = MaterialTheme.typography.labelMedium)
                        Spacer(Modifier.height(4.dp))
                        SelectionContainer { Text(decodeResult) }
                    }
                }
            }
        }

        if (message.isNotEmpty()) {
            Text(message, color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(16.dp))
    }
}
