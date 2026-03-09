package com.example.myapplication.ui.tools

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.logcat.LogcatUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogcatScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var logs by remember { mutableStateOf<List<String>>(emptyList()) }
    var tagFilter by remember { mutableStateOf("") }
    var isSaving by remember { mutableStateOf(false) }
    var saveResult by remember { mutableStateOf("") }

    fun refresh() {
        scope.launch {
            logs = withContext(Dispatchers.IO) {
                LogcatUtils.captureLogcat(
                    tag = tagFilter.ifBlank { null },
                    lines = 300
                )
            }
        }
    }

    LaunchedEffect(Unit) { refresh() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Logcat 日志") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                },
                actions = {
                    IconButton(onClick = { refresh() }) {
                        Icon(Icons.Outlined.Refresh, "刷新")
                    }
                    IconButton(onClick = {
                        isSaving = true
                        scope.launch {
                            try {
                                val file = withContext(Dispatchers.IO) {
                                    LogcatUtils.saveLogToFile(context, logs)
                                }
                                saveResult = "已保存: ${file.name}"
                            } catch (e: Exception) {
                                saveResult = "保存失败: ${e.message}"
                            }
                            isSaving = false
                        }
                    }) {
                        Icon(Icons.Outlined.Save, "保存")
                    }
                    IconButton(onClick = {
                        scope.launch {
                            withContext(Dispatchers.IO) { LogcatUtils.clearLogcat() }
                            logs = emptyList()
                        }
                    }) {
                        Icon(Icons.Outlined.Delete, "清除")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // Tag 过滤
            OutlinedTextField(
                value = tagFilter,
                onValueChange = { tagFilter = it },
                label = { Text("Tag 过滤 (留空显示全部)") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                singleLine = true,
                trailingIcon = {
                    IconButton(onClick = { refresh() }) {
                        Icon(Icons.Outlined.Search, "搜索")
                    }
                }
            )

            if (saveResult.isNotBlank()) {
                Text(
                    saveResult,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            // 日志列表
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(horizontal = 8.dp),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                items(logs) { line ->
                    val color = when {
                        line.contains(" E ") || line.contains(" E/") -> Color(0xFFEF5350)
                        line.contains(" W ") || line.contains(" W/") -> Color(0xFFFFA726)
                        line.contains(" I ") || line.contains(" I/") -> Color(0xFF66BB6A)
                        line.contains(" D ") || line.contains(" D/") -> Color(0xFF42A5F5)
                        else -> MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    }
                    Text(
                        line,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 4.dp, vertical = 1.dp)
                            .horizontalScroll(rememberScrollState()),
                        fontFamily = FontFamily.Monospace,
                        fontSize = 10.sp,
                        color = color,
                        maxLines = 2
                    )
                }
            }
        }
    }
}
