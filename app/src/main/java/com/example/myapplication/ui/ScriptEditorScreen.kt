package com.example.myapplication.ui

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.components.ToolPageScaffold
import java.io.File

@Composable
fun ScriptEditorScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val scriptDir = remember { File(context.filesDir, "scripts").also { it.mkdirs() } }
    var fileName by remember { mutableStateOf("new_script.txt") }
    var code by remember { mutableStateOf("-- 脚本示例\n-- tap(x, y) 点击\n-- swipe(x1,y1,x2,y2,duration) 滑动\n-- delay(ms) 延时\n\ntap(500, 800)\ndelay(1000)\nswipe(200, 500, 800, 500, 300)\ndelay(500)\ntap(500, 800)\n") }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(
        title = "脚本编辑器",
        onBack = onBack,
        actions = {
            IconButton(onClick = {
                val file = File(scriptDir, fileName)
                file.writeText(code)
                message = "已保存: ${file.absolutePath}"
            }) { Icon(Icons.Outlined.Save, "保存") }
        }
    ) {
        Spacer(Modifier.height(4.dp))

        OutlinedTextField(
            value = fileName,
            onValueChange = { fileName = it },
            label = { Text("文件名") },
            modifier = Modifier.fillMaxWidth(), singleLine = true
        )

        Spacer(Modifier.height(4.dp))

        // 代码编辑区
        Card(
            modifier = Modifier.fillMaxWidth().heightIn(min = 300.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
            )
        ) {
            BasicTextField(
                value = code,
                onValueChange = { code = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .horizontalScroll(rememberScrollState()),
                textStyle = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 22.sp
                ),
                cursorBrush = SolidColor(MaterialTheme.colorScheme.primary)
            )
        }

        // 快捷插入
        Row(Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            listOf("tap(x,y)", "swipe(x1,y1,x2,y2,d)", "delay(ms)", "keyPress(code)",
                "sendText(\"\")", "for i=1,10 do\\nend").forEach { snippet ->
                AssistChip(
                    onClick = { code += "\n$snippet" },
                    label = { Text(snippet.take(16), style = MaterialTheme.typography.bodySmall) }
                )
            }
        }

        // 操作按钮
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            FilledTonalButton(onClick = {
                val file = File(scriptDir, fileName)
                if (file.exists()) {
                    code = file.readText()
                    message = "已加载: $fileName"
                } else message = "文件不存在"
            }, modifier = Modifier.weight(1f)) { Text("加载") }
            FilledTonalButton(onClick = {
                code = ""
                message = "已清空"
            }, modifier = Modifier.weight(1f)) { Text("清空") }
        }

        if (message.isNotEmpty()) {
            Text(message, color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(16.dp))
    }
}
