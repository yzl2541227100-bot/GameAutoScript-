package com.example.myapplication.registration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * 扫码绑定/注册码界面
 */
class SweepCodeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                SweepCodeScreen(
                    onBind = { code -> bindDevice(code) },
                    onUnbind = { unbindDevice() },
                    onBack = { finish() }
                )
            }
        }
    }

    private fun bindDevice(code: String): Boolean {
        // TODO: 实现设备绑定逻辑 - 与服务器通信验证注册码
        val prefs = getSharedPreferences("device_bind", MODE_PRIVATE)
        prefs.edit().putString("bind_code", code).putBoolean("is_bound", true).apply()
        return true
    }

    private fun unbindDevice(): Boolean {
        val prefs = getSharedPreferences("device_bind", MODE_PRIVATE)
        prefs.edit().clear().apply()
        return true
    }
}

@Composable
fun SweepCodeScreen(
    onBind: (String) -> Boolean,
    onUnbind: () -> Boolean,
    onBack: () -> Unit
) {
    var code by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }
    var isBound by remember { mutableStateOf(false) }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("设备绑定", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(32.dp))

            if (!isBound) {
                OutlinedTextField(
                    value = code,
                    onValueChange = { code = it },
                    label = { Text("注册码") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        if (code.isNotBlank()) {
                            val success = onBind(code)
                            message = if (success) {
                                isBound = true
                                "绑定成功"
                            } else "绑定失败"
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("绑定设备")
                }
            } else {
                Text("设备已绑定", style = MaterialTheme.typography.bodyLarge)

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        val success = onUnbind()
                        if (success) {
                            isBound = false
                            code = ""
                            message = "已解绑"
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.error
                    )
                ) {
                    Text("解绑设备")
                }
            }

            if (message.isNotEmpty()) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(message, color = MaterialTheme.colorScheme.primary)
            }

            Spacer(modifier = Modifier.height(24.dp))

            TextButton(onClick = onBack) {
                Text("返回")
            }
        }
    }
}
