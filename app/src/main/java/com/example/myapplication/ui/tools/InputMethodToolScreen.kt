package com.example.myapplication.ui.tools

import android.content.Intent
import android.provider.Settings
import android.view.inputmethod.InputMethodManager
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun InputMethodToolScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    var sendTextValue by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "输入法控制", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "输入法设置", icon = Icons.Outlined.Keyboard) {
            Button(onClick = {
                context.startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                })
            }, modifier = Modifier.fillMaxWidth()) { Text("打开输入法设置") }
            Spacer(Modifier.height(8.dp))
            FilledTonalButton(onClick = {
                val imm = context.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showInputMethodPicker()
            }, modifier = Modifier.fillMaxWidth()) { Text("切换输入法") }
        }

        SectionCard(title = "文字输入", icon = Icons.Outlined.TextFields) {
            OutlinedTextField(
                value = sendTextValue,
                onValueChange = { sendTextValue = it },
                label = { Text("输入内容") },
                modifier = Modifier.fillMaxWidth(),
                minLines = 2, maxLines = 4
            )
            Spacer(Modifier.height(12.dp))
            Text("提示: 需先启用脚本输入法并聚焦到目标输入框",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant)
        }

        if (message.isNotEmpty()) {
            Text(message, color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(16.dp))
    }
}
