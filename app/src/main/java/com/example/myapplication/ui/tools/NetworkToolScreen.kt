package com.example.myapplication.ui.tools

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.ScriptAction
import com.example.myapplication.ui.components.InfoItem
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun NetworkToolScreen(action: ScriptAction?, onBack: () -> Unit) {
    var url by remember { mutableStateOf("https://httpbin.org/get") }
    var postBody by remember { mutableStateOf("") }
    var response by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    val netType = remember { action?.getNetType() ?: "unknown" }
    val vpnStatus = remember { action?.getVPNStatus() ?: false }

    ToolPageScaffold(title = "网络工具", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "网络状态", icon = Icons.Outlined.Wifi) {
            InfoItem("网络类型", netType)
            InfoItem("VPN 状态", if (vpnStatus) "已连接" else "未连接")
        }

        SectionCard(title = "HTTP 请求", icon = Icons.Outlined.Language) {
            OutlinedTextField(
                value = url,
                onValueChange = { url = it },
                label = { Text("URL") },
                modifier = Modifier.fillMaxWidth(), singleLine = true
            )
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = postBody,
                onValueChange = { postBody = it },
                label = { Text("POST Body (留空为GET)") },
                modifier = Modifier.fillMaxWidth(),
                minLines = 2, maxLines = 4
            )
            Spacer(Modifier.height(12.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = {
                    isLoading = true
                    scope.launch {
                        response = withContext(Dispatchers.IO) {
                            action?.urlRequest(1, url, timeout = 10) ?: "action is null"
                        }
                        isLoading = false
                    }
                }, modifier = Modifier.weight(1f), enabled = !isLoading) { Text("GET") }
                FilledTonalButton(onClick = {
                    isLoading = true
                    scope.launch {
                        response = withContext(Dispatchers.IO) {
                            action?.urlRequest(2, url, postBody, 10) ?: "action is null"
                        }
                        isLoading = false
                    }
                }, modifier = Modifier.weight(1f), enabled = !isLoading) { Text("POST") }
            }
            if (isLoading) {
                Spacer(Modifier.height(8.dp))
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
            }
        }

        if (response.isNotEmpty()) {
            SectionCard(title = "响应结果") {
                SelectionContainer {
                    Text(
                        response.take(2000),
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }

        Spacer(Modifier.height(16.dp))
    }
}
