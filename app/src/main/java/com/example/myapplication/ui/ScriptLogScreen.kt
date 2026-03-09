package com.example.myapplication.ui

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.components.ToolPageScaffold
import java.text.SimpleDateFormat
import java.util.*

data class LogEntry(val time: String, val level: String, val tag: String, val msg: String)

/** 全局日志收集器 */
object ScriptLogger {
    private val _logs = mutableListOf<LogEntry>()
    val logs: List<LogEntry> get() = _logs.toList()

    fun log(level: String, tag: String, msg: String) {
        val time = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date())
        _logs.add(LogEntry(time, level, tag, msg))
        if (_logs.size > 500) _logs.removeAt(0)
    }

    fun d(tag: String, msg: String) = log("D", tag, msg)
    fun i(tag: String, msg: String) = log("I", tag, msg)
    fun w(tag: String, msg: String) = log("W", tag, msg)
    fun e(tag: String, msg: String) = log("E", tag, msg)
    fun clear() = _logs.clear()
}

@Composable
fun ScriptLogScreen(onBack: () -> Unit) {
    var logs by remember { mutableStateOf(ScriptLogger.logs) }
    val listState = rememberLazyListState()

    Scaffold(
        topBar = {
            @OptIn(ExperimentalMaterial3Api::class)
            TopAppBar(
                title = { Text("运行日志") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                },
                actions = {
                    IconButton(onClick = { logs = ScriptLogger.logs }) {
                        Icon(Icons.Outlined.Refresh, "刷新")
                    }
                    IconButton(onClick = {
                        ScriptLogger.clear()
                        logs = emptyList()
                    }) {
                        Icon(Icons.Outlined.Delete, "清除")
                    }
                }
            )
        }
    ) { padding ->
        if (logs.isEmpty()) {
            Box(modifier = Modifier.fillMaxSize().padding(padding),
                contentAlignment = androidx.compose.ui.Alignment.Center) {
                Text("暂无日志", color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding).padding(horizontal = 8.dp),
                state = listState,
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                items(logs) { entry ->
                    val color = when (entry.level) {
                        "E" -> Color(0xFFEF5350)
                        "W" -> Color(0xFFFFA726)
                        "I" -> Color(0xFF66BB6A)
                        else -> MaterialTheme.colorScheme.onSurface
                    }
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(6.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                        )
                    ) {
                        Text(
                            "${entry.time} ${entry.level}/${entry.tag}: ${entry.msg}",
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                .horizontalScroll(rememberScrollState()),
                            fontFamily = FontFamily.Monospace,
                            fontSize = 12.sp,
                            color = color,
                            maxLines = 3
                        )
                    }
                }
            }
        }
    }
}
