package com.example.myapplication

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.engine.ScriptEngine

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onStartFloating: () -> Unit,
    onStopFloating: () -> Unit,
    onStartScript: () -> Unit,
    onStopScript: () -> Unit,
    onPauseScript: () -> Unit,
    onResumeScript: () -> Unit,
    onOpenBind: () -> Unit,
    onNavigate: (String) -> Unit = {},
    getEngineState: () -> ScriptEngine.State
) {
    var engineState by remember { mutableStateOf(ScriptEngine.State.IDLE) }
    var selectedTab by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            engineState = getEngineState()
            kotlinx.coroutines.delay(500)
        }
    }

    Scaffold(
        topBar = {
            LargeTopAppBar(
                title = {
                    Column {
                        Text("自动化脚本", fontWeight = FontWeight.Bold)
                        Text(
                            text = "v1.0.0",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                actions = {
                    IconButton(onClick = { onNavigate("settings") }) {
                        Icon(Icons.Outlined.Settings, "设置")
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(Icons.Filled.PlayArrow, "控制") },
                    label = { Text("控制") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(Icons.Filled.Build, "工具") },
                    label = { Text("工具") }
                )
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(Icons.Filled.Info, "关于") },
                    label = { Text("关于") }
                )
            }
        }
    ) { padding ->
        when (selectedTab) {
            0 -> ControlTab(
                padding = padding,
                engineState = engineState,
                onStartScript = onStartScript,
                onStopScript = onStopScript,
                onPauseScript = onPauseScript,
                onResumeScript = onResumeScript,
                onStartFloating = onStartFloating,
                onStopFloating = onStopFloating,
                onOpenBind = onOpenBind,
                onNavigate = onNavigate
            )
            1 -> ToolsTab(padding = padding, onNavigate = onNavigate)
            2 -> AboutTab(padding = padding)
        }
    }
}

@Composable
private fun ControlTab(
    padding: PaddingValues,
    engineState: ScriptEngine.State,
    onStartScript: () -> Unit,
    onStopScript: () -> Unit,
    onPauseScript: () -> Unit,
    onResumeScript: () -> Unit,
    onStartFloating: () -> Unit,
    onStopFloating: () -> Unit,
    onOpenBind: () -> Unit,
    onNavigate: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier.height(4.dp))

        // 状态指示器
        StatusCard(engineState)

        // 脚本控制
        ScriptControlCard(engineState, onStartScript, onStopScript, onPauseScript, onResumeScript)

        // 脚本编辑 & 日志
        ActionCard(
            title = "脚本管理",
            subtitle = "编辑脚本 / 查看运行日志",
            icon = Icons.Outlined.Code
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                FilledTonalButton(
                    onClick = { onNavigate("script/editor") },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(Icons.Filled.Edit, null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("编辑器")
                }
                OutlinedButton(
                    onClick = { onNavigate("script/log") },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(Icons.Filled.List, null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("日志")
                }
            }
        }

        // 悬浮窗
        ActionCard(
            title = "悬浮窗控制",
            subtitle = "独立进程悬浮控制面板",
            icon = Icons.Outlined.Layers
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                FilledTonalButton(
                    onClick = onStartFloating,
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(Icons.Filled.Visibility, null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("显示")
                }
                OutlinedButton(
                    onClick = onStopFloating,
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(Icons.Filled.VisibilityOff, null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text("关闭")
                }
            }
        }

        // 设备管理
        ActionCard(
            title = "设备管理",
            subtitle = "注册码绑定与设备信息",
            icon = Icons.Outlined.PhoneAndroid
        ) {
            FilledTonalButton(
                onClick = onOpenBind,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(Icons.Filled.QrCode, null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(8.dp))
                Text("设备绑定 / 注册码")
            }
        }

        // 游戏脚本配置入口
        ActionCard(
            title = "游戏脚本配置",
            subtitle = "SLG策略游戏专用脚本设置",
            icon = Icons.Outlined.SportsEsports
        ) {
            Button(
                onClick = { onNavigate("game/config") },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1976D2)
                )
            ) {
                Icon(Icons.Filled.Gamepad, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text("进入游戏配置", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Composable
private fun StatusCard(state: ScriptEngine.State) {
    val (statusColor, statusText, statusIcon) = when (state) {
        ScriptEngine.State.IDLE -> Triple(
            MaterialTheme.colorScheme.surfaceVariant,
            "空闲",
            Icons.Outlined.RadioButtonUnchecked
        )
        ScriptEngine.State.RUNNING -> Triple(
            Color(0xFF4CAF50),
            "运行中",
            Icons.Filled.PlayCircle
        )
        ScriptEngine.State.PAUSED -> Triple(
            Color(0xFFFFC107),
            "已暂停",
            Icons.Filled.PauseCircle
        )
        ScriptEngine.State.STOPPED -> Triple(
            Color(0xFFF44336),
            "已停止",
            Icons.Filled.StopCircle
        )
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f)
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(statusColor.copy(alpha = 0.8f), statusColor.copy(alpha = 0.2f))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    statusIcon, null,
                    tint = if (state == ScriptEngine.State.IDLE) MaterialTheme.colorScheme.onSurfaceVariant
                    else Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }
            Spacer(Modifier.width(16.dp))
            Column {
                Text("引擎状态", style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant)
                Text(statusText, style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Composable
private fun ScriptControlCard(
    state: ScriptEngine.State,
    onStart: () -> Unit,
    onStop: () -> Unit,
    onPause: () -> Unit,
    onResume: () -> Unit
) {
    ActionCard(
        title = "脚本控制",
        subtitle = "启动、暂停、恢复、停止脚本",
        icon = Icons.Outlined.Code
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // 运行/继续按钮
            if (state == ScriptEngine.State.PAUSED) {
                Button(
                    onClick = onResume,
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                ) {
                    Icon(Icons.Filled.PlayArrow, null, modifier = Modifier.size(20.dp))
                    Spacer(Modifier.width(4.dp))
                    Text("继续")
                }
            } else {
                Button(
                    onClick = onStart,
                    modifier = Modifier.weight(1f),
                    enabled = state != ScriptEngine.State.RUNNING
                ) {
                    Icon(Icons.Filled.PlayArrow, null, modifier = Modifier.size(20.dp))
                    Spacer(Modifier.width(4.dp))
                    Text("运行")
                }
            }

            // 暂停按钮
            FilledTonalButton(
                onClick = onPause,
                modifier = Modifier.weight(1f),
                enabled = state == ScriptEngine.State.RUNNING
            ) {
                Icon(Icons.Filled.Pause, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(4.dp))
                Text("暂停")
            }

            // 停止按钮
            OutlinedButton(
                onClick = onStop,
                modifier = Modifier.weight(1f),
                enabled = state == ScriptEngine.State.RUNNING || state == ScriptEngine.State.PAUSED,
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colorScheme.error
                )
            ) {
                Icon(Icons.Filled.Stop, null, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(4.dp))
                Text("停止")
            }
        }
    }
}

@Composable
private fun ActionCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    icon, null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
                    Text(subtitle, style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
            Spacer(Modifier.height(16.dp))
            content()
        }
    }
}

@Composable
private fun ToolsTab(padding: PaddingValues, onNavigate: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Spacer(modifier = Modifier.height(4.dp))

        Text("工具箱", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        Text("常用自动化工具", style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant)

        Spacer(modifier = Modifier.height(4.dp))

        // 工具网格
        data class ToolItem(val icon: ImageVector, val title: String, val desc: String, val route: String)
        val tools = listOf(
            ToolItem(Icons.Outlined.TouchApp, "触摸模拟", "点击/滑动/多指", "tool/touch"),
            ToolItem(Icons.Outlined.Screenshot, "截图工具", "屏幕截图/OCR", "tool/screenshot"),
            ToolItem(Icons.Outlined.FiberManualRecord, "脚本录制", "录制/回放操作", "tool/record"),
            ToolItem(Icons.Outlined.QrCode, "二维码", "生成/识别QR码", "tool/qr"),
            ToolItem(Icons.Outlined.Wifi, "网络工具", "HTTP请求/网络状态", "tool/network"),
            ToolItem(Icons.Outlined.Keyboard, "输入法", "脚本输入法控制", "tool/ime"),
            ToolItem(Icons.Outlined.Extension, "插件管理", "加载/卸载插件", "tool/plugin"),
            ToolItem(Icons.Outlined.Security, "注入工具", "多架构注入管理", "tool/inject"),
            ToolItem(Icons.Outlined.Storage, "文件管理", "脚本文件管理", "tool/file"),
            ToolItem(Icons.Outlined.Accessibility, "无障碍", "无障碍服务控制", "tool/accessibility"),
            ToolItem(Icons.Outlined.PhoneAndroid, "设备信息", "设备/系统信息", "tool/device"),
            ToolItem(Icons.Outlined.VolumeUp, "媒体控制", "音量/播放控制", "tool/media"),
            ToolItem(Icons.Outlined.Brightness6, "屏幕控制", "亮度/旋转/常亮", "tool/screen"),
            ToolItem(Icons.Outlined.BugReport, "Logcat", "系统日志捕获", "tool/logcat")
        )

        tools.chunked(2).forEach { row ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                row.forEach { tool ->
                    ToolCard(
                        icon = tool.icon,
                        title = tool.title,
                        description = tool.desc,
                        onClick = { onNavigate(tool.route) },
                        modifier = Modifier.weight(1f)
                    )
                }
                if (row.size == 1) Spacer(Modifier.weight(1f))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ToolCard(
    icon: ImageVector,
    title: String,
    description: String,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Icon(
                icon, null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(28.dp)
            )
            Spacer(Modifier.height(12.dp))
            Text(title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.SemiBold)
            Text(description, style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant, lineHeight = 16.sp)
        }
    }
}

@Composable
private fun AboutTab(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier.height(4.dp))

        Text("关于", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("自动化脚本引擎", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(8.dp))
                Text("版本 1.0.0", style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant)
                Spacer(Modifier.height(16.dp))
                HorizontalDivider()
                Spacer(Modifier.height(16.dp))

                InfoRow("架构", "多进程 (main / enginfloat / daemon / remote)")
                InfoRow("引擎", "Native JNI + Kotlin Coroutines")
                InfoRow("触摸", "Instrumentation + Accessibility fallback")
                InfoRow("多指", "最多 5 指同时触控")
                InfoRow("插件", "动态 APK 加载 (DexClassLoader)")
                InfoRow("输入法", "自定义 IME 服务")
                InfoRow("UI", "Jetpack Compose + Material3")
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.3f)
            )
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("功能模块", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.height(12.dp))
                val modules = listOf(
                    "脚本引擎" to "录制执行、Native JNI、中文 DSL",
                    "悬浮窗" to "独立进程控制面板",
                    "脚本录制" to "触摸/按键操作录制回放",
                    "MediaProjection" to "高效截图 (VirtualDisplay)",
                    "注入机制" to "多架构 (arm64/armv7/x86)",
                    "自定义输入法" to "脚本文字输入自动化",
                    "设备绑定" to "扫码/注册码绑定解绑",
                    "插件框架" to "动态加载插件 APK",
                    "守护进程" to "后台保活服务",
                    "RPC 调用" to "跨进程方法调用",
                    "网络监听" to "实时网络状态变化",
                    "Logcat" to "系统日志捕获保存"
                )
                modules.forEach { (name, desc) ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.primary)
                        )
                        Spacer(Modifier.width(12.dp))
                        Column {
                            Text(name, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Medium)
                            Text(desc, style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(
            label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.width(60.dp)
        )
        Text(value, style = MaterialTheme.typography.bodyMedium)
    }
}
