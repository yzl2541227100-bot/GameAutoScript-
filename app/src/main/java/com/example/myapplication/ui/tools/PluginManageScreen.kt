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
import com.example.myapplication.plugin.PluginManager
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun PluginManageScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val pluginManager = remember { PluginManager.getInstance(context) }
    var plugins by remember { mutableStateOf(pluginManager.getLoadedPlugins()) }
    var message by remember { mutableStateOf("") }

    ToolPageScaffold(title = "插件管理", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "已加载插件", icon = Icons.Outlined.Extension) {
            if (plugins.isEmpty()) {
                Text("暂无已加载的插件", color = MaterialTheme.colorScheme.onSurfaceVariant,
                    style = MaterialTheme.typography.bodyMedium)
            } else {
                plugins.forEach { plugin ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                        )
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Outlined.Extension, null,
                                tint = MaterialTheme.colorScheme.primary)
                            Spacer(Modifier.width(12.dp))
                            Column(Modifier.weight(1f)) {
                                Text(plugin.name, fontWeight = FontWeight.Medium)
                                Text(plugin.path, style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                            IconButton(onClick = {
                                pluginManager.unloadPlugin(plugin.name)
                                plugins = pluginManager.getLoadedPlugins()
                                message = "已卸载: ${plugin.name}"
                            }) {
                                Icon(Icons.Outlined.Delete, "卸载",
                                    tint = MaterialTheme.colorScheme.error)
                            }
                        }
                    }
                }
            }
        }

        SectionCard(title = "操作", icon = Icons.Outlined.Settings) {
            Button(onClick = {
                plugins = pluginManager.getLoadedPlugins()
                message = "已刷新，共 ${plugins.size} 个插件"
            }, modifier = Modifier.fillMaxWidth()) { Text("刷新列表") }
            Spacer(Modifier.height(4.dp))
            Text("提示: 将插件 APK 放入应用 plugins 目录后加载",
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
