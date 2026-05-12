package com.example.myapplication

import android.Manifest
import android.accessibilityservice.AccessibilityServiceInfo
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PowerManager
import android.provider.Settings
import android.view.accessibility.AccessibilityManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.engine.ScriptEngine
import com.example.myapplication.floating.FloatingWindowService
import com.example.myapplication.script.GameScript
import com.example.myapplication.screencap.ScreenCaptureService
import com.example.myapplication.screencap.ScreenShoterV3
import com.example.myapplication.ui.SettingsScreen
import com.example.myapplication.ui.game.GameConfigScreen
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    private var scriptEngine: ScriptEngine? = null
    private var gameScript: GameScript? = null
    private val permissionState = mutableStateOf(false)
    private var pendingScriptStart = false

    /** 接收悬浮窗发来的"请求启动脚本"广播（需要截图权限时） */
    private val floatingStartReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            startGameScript()
        }
    }

    private val overlayPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        refreshPermissionCheck()
        if (Settings.canDrawOverlays(this)) FloatingWindowService.start(this)
    }

    private val accessibilitySettingsLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { refreshPermissionCheck() }

    private val screenCaptureLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == android.app.Activity.RESULT_OK && result.data != null) {
            ScreenCaptureService.start(this, result.resultCode, result.data!!)
            Toast.makeText(this, "截图权限已获取", Toast.LENGTH_SHORT).show()
            android.os.Handler(mainLooper).postDelayed({
                if (pendingScriptStart) { pendingScriptStart = false; doStartGameScript() }
            }, 500)
        } else {
            Toast.makeText(this, "截图权限被拒绝", Toast.LENGTH_LONG).show()
            pendingScriptStart = false
        }
    }

    private val runtimePermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { refreshPermissionCheck() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        scriptEngine = ScriptEngine(this)
        gameScript = GameScript(this)
        requestAllRuntimePermissions()

        // 注册悬浮窗请求启动脚本的广播
        val filter = IntentFilter(FloatingWindowService.BROADCAST_REQUEST_START)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(floatingStartReceiver, filter, RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(floatingStartReceiver, filter)
        }

        setContent {
            MyApplicationTheme {
                val allReady by permissionState
                if (!allReady) PermissionSetupScreen()
                else AppNavigation()
            }
        }
    }

    override fun onResume() { super.onResume(); refreshPermissionCheck() }

    override fun onDestroy() {
        scriptEngine?.release()
        ScreenCaptureService.stop(this)
        try { unregisterReceiver(floatingStartReceiver) } catch (_: Exception) {}
        super.onDestroy()
    }

    // ==================== 权限 ====================

    private fun requestAllRuntimePermissions() {
        val perms = mutableListOf<String>()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) perms.add(Manifest.permission.POST_NOTIFICATIONS)
        }
        if (perms.isNotEmpty()) runtimePermissionLauncher.launch(perms.toTypedArray())
        refreshPermissionCheck()
    }

    private fun refreshPermissionCheck() {
        val overlay = Settings.canDrawOverlays(this)
        val accessibility = isAccessibilityEnabled()
        permissionState.value = overlay && accessibility
    }

    private fun isAccessibilityEnabled(): Boolean {
        val am = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val services = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        return services.any {
            it.resolveInfo.serviceInfo.name == "com.example.myapplication.accessibility.ScriptAccessibilityService"
        }
    }

    // ==================== 权限引导界面 ====================

    @Composable
    private fun PermissionSetupScreen() {
        val overlayOk = Settings.canDrawOverlays(this)
        val accessibilityOk = isAccessibilityEnabled()

        Scaffold { padding ->
            Column(
                modifier = Modifier.fillMaxSize().padding(padding)
                    .verticalScroll(rememberScrollState()).padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(40.dp))
                Icon(Icons.Filled.Security, null, Modifier.size(64.dp), MaterialTheme.colorScheme.primary)
                Spacer(Modifier.height(16.dp))
                Text("权限设置", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.height(24.dp))

                PermissionItem("悬浮窗权限", Icons.Filled.Layers, overlayOk) {
                    overlayPermissionLauncher.launch(
                        Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
                    )
                }
                PermissionItem("无障碍服务", Icons.Filled.Accessibility, accessibilityOk) {
                    accessibilitySettingsLauncher.launch(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
                }

                Spacer(Modifier.height(32.dp))
                Button(
                    onClick = { refreshPermissionCheck() },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    enabled = overlayOk && accessibilityOk
                ) { Text(if (overlayOk && accessibilityOk) "进入主界面" else "请先开启必要权限") }

                TextButton(onClick = { permissionState.value = true }) {
                    Text("跳过", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
        }
    }

    @Composable
    private fun PermissionItem(title: String, icon: ImageVector, granted: Boolean, onClick: () -> Unit) {
        Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Row(Modifier.fillMaxWidth().padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(icon, null, Modifier.size(32.dp),
                    if (granted) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant)
                Spacer(Modifier.width(12.dp))
                Text(title, modifier = Modifier.weight(1f))
                if (granted) Icon(Icons.Filled.CheckCircle, null, tint = MaterialTheme.colorScheme.primary)
                else FilledTonalButton(onClick = onClick) { Text("去开启") }
            }
        }
    }

    // ==================== 导航 ====================

    @Composable
    private fun AppNavigation() {
        val navController = rememberNavController()

        // APP 启动后自动显示悬浮窗
        LaunchedEffect(Unit) {
            startFloatingWindow()
        }

        NavHost(navController = navController, startDestination = "game/config") {
            composable("game/config") {
                GameConfigScreen(
                    onRunScript = { startGameScript() },
                    onActivateCode = {},
                    onNavigateSettings = { navController.navigate("settings") }
                )
            }
            composable("settings") {
                SettingsScreen(onBack = { navController.popBackStack() })
            }
        }
    }

    // ==================== 脚本控制 ====================

    private fun startGameScript() {
        val gs = gameScript ?: return
        val eng = scriptEngine ?: return
        if (eng.getState() == ScriptEngine.State.STOPPED) eng.resetState()

        if (!ScreenShoterV3.getInstance().isInited()) {
            pendingScriptStart = true
            requestScreenCapturePermission()
            return
        }
        doStartGameScript()
    }

    private fun doStartGameScript() {
        val gs = gameScript ?: return
        val eng = scriptEngine ?: return
        Toast.makeText(this, "脚本启动中...", Toast.LENGTH_SHORT).show()
        eng.start { gs.execute(eng) }
    }

    private fun requestScreenCapturePermission() {
        try {
            val mgr = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as android.media.projection.MediaProjectionManager
            screenCaptureLauncher.launch(mgr.createScreenCaptureIntent())
        } catch (e: Exception) {
            Toast.makeText(this, "无法请求截图权限: ${e.message}", Toast.LENGTH_LONG).show()
            pendingScriptStart = false
        }
    }

    private fun startFloatingWindow() {
        if (!Settings.canDrawOverlays(this)) {
            overlayPermissionLauncher.launch(
                Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
            )
        } else FloatingWindowService.start(this)
    }
}
