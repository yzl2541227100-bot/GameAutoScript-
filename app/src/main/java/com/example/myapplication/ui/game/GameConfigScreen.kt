package com.example.myapplication.ui.game

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.script.ScriptConfig
import com.example.myapplication.ui.game.tabs.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameConfigScreen(
    onBack: () -> Unit,
    onStartFloating: () -> Unit,
    onRunScript: () -> Unit,
    onActivateCode: () -> Unit,
    onNavigateSettings: () -> Unit
) {
    val context = LocalContext.current
    var config by remember { mutableStateOf(ScriptConfig.load(context)) }

    // 自动保存
    LaunchedEffect(config) {
        ScriptConfig.save(context, config)
    }

    // 分辨率检测
    val dm = context.resources.displayMetrics
    val screenWidth = dm.widthPixels
    val screenHeight = dm.heightPixels
    val isSupported = (screenWidth == 720 && screenHeight == 1280) ||
            (screenWidth == 1080 && screenHeight == 1920) ||
            (screenWidth == 1280 && screenHeight == 720) ||
            (screenWidth == 1920 && screenHeight == 1080)

    // 主 Tab: 0=功能设置, 1=使用说明
    var mainTab by remember { mutableIntStateOf(0) }
    // 子 Tab: 0=一键设置, 1=日常, 2=开荒, 3=其他
    var subTab by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("游戏脚本配置", fontWeight = FontWeight.Bold)
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                },
                actions = {
                    IconButton(onClick = { /* 消息 */ }) {
                        Icon(Icons.Filled.ChatBubbleOutline, "消息")
                    }
                    IconButton(onClick = onNavigateSettings) {
                        Icon(Icons.Filled.Settings, "设置")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        bottomBar = {
            GameBottomBar(
                onStartFloating = onStartFloating,
                onRunScript = onRunScript,
                onActivateCode = onActivateCode
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // 分辨率警告
            if (!isSupported) {
                ResolutionWarningBanner(screenWidth, screenHeight)
            }

            // 主 Tab 栏: 功能设置 / 使用说明
            MainTabRow(mainTab) { mainTab = it }

            // 内容区
            when (mainTab) {
                0 -> {
                    // 子 Tab 栏
                    SubTabRow(subTab) { subTab = it }
                    // 子 Tab 内容
                    when (subTab) {
                        0 -> QuickSetTab(config) { config = it }
                        1 -> DailyTab(config) { config = it }
                        2 -> PioneerTab(config) { config = it }
                        3 -> OtherTab(config) { config = it }
                    }
                }
                1 -> DescriptionTab()
            }
        }
    }
}


@Composable
private fun ResolutionWarningBanner(width: Int, height: Int) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        shape = RoundedCornerShape(8.dp),
        color = Color(0xFFFFF3CD)
    ) {
        Text(
            text = "当前分辨率 ${width}×${height} 可能不受支持，建议使用 720×1280 或 1080×1920",
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            fontSize = 13.sp,
            color = Color(0xFF856404),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun MainTabRow(selected: Int, onSelect: (Int) -> Unit) {
    val titles = listOf("功能设置", "使用说明")
    TabRow(
        selectedTabIndex = selected,
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.primary
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                selected = selected == index,
                onClick = { onSelect(index) },
                text = {
                    Text(
                        title,
                        fontWeight = if (selected == index) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 15.sp
                    )
                }
            )
        }
    }
}

@Composable
private fun SubTabRow(selected: Int, onSelect: (Int) -> Unit) {
    val titles = listOf("一键设置", "日常", "开荒", "其他")
    ScrollableTabRow(
        selectedTabIndex = selected,
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.primary,
        edgePadding = 8.dp
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                selected = selected == index,
                onClick = { onSelect(index) },
                text = {
                    Text(
                        title,
                        fontSize = 14.sp,
                        fontWeight = if (selected == index) FontWeight.SemiBold else FontWeight.Normal
                    )
                }
            )
        }
    }
}

@Composable
private fun GameBottomBar(
    onStartFloating: () -> Unit,
    onRunScript: () -> Unit,
    onActivateCode: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shadowElevation = 8.dp,
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // 启动浮窗
            Button(
                onClick = onStartFloating,
                modifier = Modifier
                    .weight(1f)
                    .height(46.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("启动浮窗", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            }

            // 运行脚本
            Button(
                onClick = onRunScript,
                modifier = Modifier
                    .weight(1.5f)
                    .height(46.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4CAF50)
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("运行脚本", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
            }

            // 激活注册码
            OutlinedButton(
                onClick = onActivateCode,
                modifier = Modifier
                    .weight(1f)
                    .height(46.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("激活注册码", fontSize = 13.sp)
            }
        }
    }
}
