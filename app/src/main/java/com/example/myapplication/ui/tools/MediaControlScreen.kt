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
fun MediaControlScreen(action: ScriptAction?, onBack: () -> Unit) {
    var volume by remember { mutableFloatStateOf(50f) }
    var soundPath by remember { mutableStateOf("") }
    var vibrateDuration by remember { mutableFloatStateOf(200f) }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "媒体控制", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "音量控制", icon = Icons.Outlined.VolumeUp) {
            Text("音量: ${volume.toInt()}%")
            Slider(value = volume, onValueChange = { volume = it }, valueRange = 0f..100f)
            Button(onClick = {
                action?.setVolumeLevel(volume.toInt())
                message = "音量已设置为 ${volume.toInt()}%"
            }, modifier = Modifier.fillMaxWidth()) { Text("设置音量") }
        }

        SectionCard(title = "音频播放", icon = Icons.Outlined.MusicNote) {
            OutlinedTextField(
                value = soundPath,
                onValueChange = { soundPath = it },
                label = { Text("音频文件路径") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(12.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    if (soundPath.isNotBlank()) {
                        action?.playSound(soundPath)
                        message = "播放中..."
                    }
                }, modifier = Modifier.weight(1f)) { Text("播放") }
                OutlinedButton(onClick = {
                    action?.stopPlay()
                    message = "已停止"
                }, modifier = Modifier.weight(1f)) { Text("停止") }
            }
        }

        SectionCard(title = "震动", icon = Icons.Outlined.Vibration) {
            Text("持续时间: ${vibrateDuration.toInt()}ms")
            Slider(value = vibrateDuration, onValueChange = { vibrateDuration = it },
                valueRange = 50f..2000f)
            Button(onClick = {
                action?.vibrate(vibrateDuration.toInt())
                message = "震动 ${vibrateDuration.toInt()}ms"
            }, modifier = Modifier.fillMaxWidth()) { Text("震动") }
        }

        if (message.isNotEmpty()) {
            Text(message, color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(16.dp))
    }
}
