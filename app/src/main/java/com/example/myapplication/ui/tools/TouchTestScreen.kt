package com.example.myapplication.ui.tools

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.ScriptAction
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun TouchTestScreen(action: ScriptAction?, onBack: () -> Unit) {
    var tapX by remember { mutableFloatStateOf(500f) }
    var tapY by remember { mutableFloatStateOf(800f) }
    var swipeX1 by remember { mutableFloatStateOf(200f) }
    var swipeY1 by remember { mutableFloatStateOf(500f) }
    var swipeX2 by remember { mutableFloatStateOf(800f) }
    var swipeY2 by remember { mutableFloatStateOf(500f) }
    var duration by remember { mutableFloatStateOf(300f) }
    var lastTapPoint by remember { mutableStateOf<Offset?>(null) }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "触摸模拟", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        // 触摸测试画布
        SectionCard(title = "触摸测试区域", icon = Icons.Outlined.TouchApp) {
            Card(
                modifier = Modifier.fillMaxWidth().height(200.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize().pointerInput(Unit) {
                        detectTapGestures { offset ->
                            lastTapPoint = offset
                            tapX = offset.x; tapY = offset.y
                            message = "点击坐标: (${offset.x.toInt()}, ${offset.y.toInt()})"
                        }
                    },
                    contentAlignment = Alignment.Center
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        lastTapPoint?.let { pt ->
                            drawCircle(Color(0xFF1565C0), 20f, pt)
                            drawCircle(Color(0xFF1565C0).copy(alpha = 0.3f), 40f, pt)
                        }
                    }
                    if (lastTapPoint == null) {
                        Text("点击此区域测试", color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
            if (message.isNotEmpty()) {
                Spacer(Modifier.height(8.dp))
                Text(message, style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.primary)
            }
        }

        // 单点点击
        SectionCard(title = "单点点击", icon = Icons.Outlined.Adjust) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = tapX.toInt().toString(),
                    onValueChange = { tapX = it.toFloatOrNull() ?: tapX },
                    label = { Text("X") },
                    modifier = Modifier.weight(1f), singleLine = true
                )
                OutlinedTextField(
                    value = tapY.toInt().toString(),
                    onValueChange = { tapY = it.toFloatOrNull() ?: tapY },
                    label = { Text("Y") },
                    modifier = Modifier.weight(1f), singleLine = true
                )
            }
            Spacer(Modifier.height(8.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    action?.tap(tapX, tapY)
                    message = "执行点击 ($tapX, $tapY)"
                }, modifier = Modifier.weight(1f)) { Text("点击") }
                FilledTonalButton(onClick = {
                    action?.randomTap(tapX, tapY, 20)
                    message = "执行随机点击"
                }, modifier = Modifier.weight(1f)) { Text("随机点击") }
                FilledTonalButton(onClick = {
                    action?.longPress(tapX, tapY, 1000)
                    message = "执行长按"
                }, modifier = Modifier.weight(1f)) { Text("长按") }
            }
        }

        // 滑动
        SectionCard(title = "滑动操作", icon = Icons.Outlined.OpenWith) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = swipeX1.toInt().toString(),
                    onValueChange = { swipeX1 = it.toFloatOrNull() ?: swipeX1 },
                    label = { Text("起X") },
                    modifier = Modifier.weight(1f), singleLine = true
                )
                OutlinedTextField(
                    value = swipeY1.toInt().toString(),
                    onValueChange = { swipeY1 = it.toFloatOrNull() ?: swipeY1 },
                    label = { Text("起Y") },
                    modifier = Modifier.weight(1f), singleLine = true
                )
            }
            Spacer(Modifier.height(4.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = swipeX2.toInt().toString(),
                    onValueChange = { swipeX2 = it.toFloatOrNull() ?: swipeX2 },
                    label = { Text("终X") },
                    modifier = Modifier.weight(1f), singleLine = true
                )
                OutlinedTextField(
                    value = swipeY2.toInt().toString(),
                    onValueChange = { swipeY2 = it.toFloatOrNull() ?: swipeY2 },
                    label = { Text("终Y") },
                    modifier = Modifier.weight(1f), singleLine = true
                )
            }
            Spacer(Modifier.height(4.dp))
            Text("持续时间: ${duration.toInt()}ms")
            Slider(value = duration, onValueChange = { duration = it },
                valueRange = 50f..2000f)
            Button(onClick = {
                action?.swipe(swipeX1, swipeY1, swipeX2, swipeY2, duration.toInt())
                message = "执行滑动"
            }, modifier = Modifier.fillMaxWidth()) { Text("执行滑动") }
        }

        // 双指缩放
        SectionCard(title = "双指缩放", icon = Icons.Outlined.ZoomOutMap) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    action?.moveZoomIn(200f, 600f, 800f, 600f, 500)
                    message = "执行放大"
                }, modifier = Modifier.weight(1f)) { Text("放大") }
                FilledTonalButton(onClick = {
                    action?.moveZoomOut(200f, 600f, 800f, 600f, 500)
                    message = "执行缩小"
                }, modifier = Modifier.weight(1f)) { Text("缩小") }
            }
        }

        Spacer(Modifier.height(16.dp))
    }
}
