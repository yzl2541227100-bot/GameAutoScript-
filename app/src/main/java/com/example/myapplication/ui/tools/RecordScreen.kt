package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.record.ScriptRecorder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecordScreen(onBack: () -> Unit) {
    val recorder = remember { ScriptRecorder() }
    var state by remember { mutableStateOf(ScriptRecorder.State.IDLE) }
    var eventCount by remember { mutableIntStateOf(0) }
    var generatedScript by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("脚本录制") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 状态卡片
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = when (state) {
                        ScriptRecorder.State.RECORDING -> Color(0xFF4CAF50).copy(alpha = 0.1f)
                        else -> MaterialTheme.colorScheme.surfaceVariant
                    }
                )
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            when (state) {
                                ScriptRecorder.State.RECORDING -> Icons.Filled.FiberManualRecord
                                else -> Icons.Outlined.RadioButtonUnchecked
                            },
                            null,
                            tint = if (state == ScriptRecorder.State.RECORDING) Color.Red
                            else MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(Modifier.width(12.dp))
                        Column {
                            Text(
                                when (state) {
                                    ScriptRecorder.State.IDLE -> "就绪"
                                    ScriptRecorder.State.RECORDING -> "录制中..."
                                    ScriptRecorder.State.PAUSED -> "已暂停"
                                },
                                style = MaterialTheme.typography.titleMedium
                            )
                            Text(
                                "已录制 $eventCount 个事件",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }

            // 控制按钮
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                if (state == ScriptRecorder.State.IDLE) {
                    Button(
                        onClick = {
                            recorder.startRecord()
                            state = ScriptRecorder.State.RECORDING
                            eventCount = 0
                            generatedScript = ""
                        },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                    ) {
                        Icon(Icons.Filled.FiberManualRecord, null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text("开始录制")
                    }
                } else {
                    Button(
                        onClick = {
                            generatedScript = recorder.stopRecord()
                            state = ScriptRecorder.State.IDLE
                            eventCount = recorder.getEventCount()
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.Filled.Stop, null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text("停止")
                    }
                    OutlinedButton(
                        onClick = {
                            recorder.cancelRecord()
                            state = ScriptRecorder.State.IDLE
                            eventCount = 0
                        },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = MaterialTheme.colorScheme.error
                        )
                    ) {
                        Icon(Icons.Filled.Cancel, null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text("取消")
                    }
                }
            }

            // 生成的脚本
            if (generatedScript.isNotBlank()) {
                Card(
                    modifier = Modifier.fillMaxWidth().weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                    )
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text("生成的脚本", style = MaterialTheme.typography.labelMedium)
                        Spacer(Modifier.height(8.dp))
                        Text(
                            generatedScript,
                            fontFamily = FontFamily.Monospace,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            // 提示
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.3f)
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("使用说明", style = MaterialTheme.typography.labelMedium)
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "1. 点击「开始录制」后操作屏幕\n" +
                                "2. 触摸和按键操作会被记录\n" +
                                "3. 点击「停止」生成可回放脚本\n" +
                                "4. 需要 Root 或无障碍权限支持",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}
