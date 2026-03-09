package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun FileManageScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val scriptDir = remember { File(context.filesDir, "scripts") }
    var files by remember { mutableStateOf(listFiles(scriptDir)) }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "文件管理", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "脚本目录", icon = Icons.Outlined.FolderOpen) {
            Text("路径: ${scriptDir.absolutePath}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant)
            Spacer(Modifier.height(8.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    if (!scriptDir.exists()) scriptDir.mkdirs()
                    files = listFiles(scriptDir)
                    message = "已刷新，共 ${files.size} 个文件"
                }, modifier = Modifier.weight(1f)) { Text("刷新") }
                FilledTonalButton(onClick = {
                    if (!scriptDir.exists()) scriptDir.mkdirs()
                    val demo = File(scriptDir, "demo.txt")
                    demo.writeText("-- 示例脚本\n-- 在此编写自动化逻辑\ntap(500, 800)\ndelay(1000)\nswipe(200, 500, 800, 500, 300)")
                    files = listFiles(scriptDir)
                    message = "已创建示例脚本"
                }, modifier = Modifier.weight(1f)) { Text("创建示例") }
            }
        }

        SectionCard(title = "文件列表 (${files.size})", icon = Icons.Outlined.Description) {
            if (files.isEmpty()) {
                Text("暂无脚本文件", color = MaterialTheme.colorScheme.onSurfaceVariant)
            } else {
                files.forEach { file ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 3.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f)
                        )
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                if (file.isDirectory) Icons.Outlined.Folder
                                else Icons.Outlined.Description,
                                null, tint = MaterialTheme.colorScheme.primary
                            )
                            Spacer(Modifier.width(12.dp))
                            Column(Modifier.weight(1f)) {
                                Text(file.name, fontWeight = FontWeight.Medium,
                                    style = MaterialTheme.typography.bodyMedium)
                                val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
                                Text("${formatSize(file.length())} · ${sdf.format(Date(file.lastModified()))}",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                            IconButton(onClick = {
                                file.delete()
                                files = listFiles(scriptDir)
                                message = "已删除: ${file.name}"
                            }) {
                                Icon(Icons.Outlined.Delete, "删除",
                                    tint = MaterialTheme.colorScheme.error,
                                    modifier = Modifier.size(20.dp))
                            }
                        }
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

private fun listFiles(dir: File): List<File> {
    if (!dir.exists()) return emptyList()
    return dir.listFiles()?.sortedByDescending { it.lastModified() } ?: emptyList()
}

private fun formatSize(bytes: Long): String = when {
    bytes < 1024 -> "${bytes}B"
    bytes < 1024 * 1024 -> "${bytes / 1024}KB"
    else -> "${bytes / (1024 * 1024)}MB"
}
