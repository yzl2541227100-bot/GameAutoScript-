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
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.engine.ScriptEngine
import com.example.myapplication.floating.FloatingWindowService
import com.example.myapplication.ipc.ScriptBroadcast
import com.example.myapplication.registration.SweepCodeActivity
import com.example.myapplication.script.GameScript
import com.example.myapplication.screencap.ScreenCaptureService
import com.example.myapplication.screencap.ScreenShoterV3
import com.example.myapplication.ui.ScriptEditorScreen
import com.example.myapplication.ui.ScriptLogScreen
import com.example.myapplication.ui.ScriptLogger
import com.example.myapplication.ui.SettingsScreen
import com.example.myapplication.ui.game.GameConfigScreen
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.tools.*

class MainActivity : ComponentActivity() {

    private var scriptEngine: ScriptEngine? = null
    private var gameScript: GameScript? = null

    // 权限状态
    private val permissionState = mutableStateOf(false)

    private val overlayPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        // 返回后刷新权限状态
        refreshPermissionCheck()
        if (Settings.canDrawOverlays(this)) {
            FloatingWindowService.start(this)
        }
    }

    private val accessibilitySettingsLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        refreshPermissionCheck()
    }

    private val batteryOptLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        refreshPermissionCheck()
    }

    private val writeSettingsLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        refreshPermissionCheck()
    }

    private val screenCaptureLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == android.app.Activity.RESULT_OK && result.data != null) {
            // MediaProjection 授权成功，通过前台服务初始化（Android 10+ 要求）
            ScreenCaptureService.start(this, result.resultCode, result.data!!)
            Toast.makeText(this, "截图权限已获取", Toast.LENGTH_SHORT).show()
            // 等一小会让服务启动并初始化 projection
            android.os.Handler(mainLooper).postDelayed({
                if (pendingScriptStart) {
                    pendingScriptStart = false
                    doStartGameScript()
                }
            }, 500)
        } else {
            Toast.makeText(this, "截图权限被拒绝，脚本无法运行", Toast.LENGTH_LONG).show()
            pendingScriptStart = false
        }
    }

    private var pendingScriptStart = false

    private val runtimePermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { results ->
        val allGranted = results.values.all { it }
        if (!allGranted) {
            Toast.makeText(this, "部分权限未授予，可能影响脚本功能", Toast.LENGTH_LONG).show()
        }
        refreshPermissionCheck()
    }

    private val commandReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            when (intent.getStringExtra(ScriptBroadcast.EXTRA_COMMAND)) {
                "start" -> startGameScript()
                "stop" -> scriptEngine?.stop()
                "pause" -> scriptEngine?.pause()
                "resume" -> scriptEngine?.resume()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        scriptEngine = ScriptEngine(this)
        gameScript = GameScript(this)

        val filter = IntentFilter(ScriptBroadcast.ACTION_COMMAND)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(commandReceiver, filter, RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(commandReceiver, filter)
        }

        // 启动时请求所有运行时权限
        requestAllRuntimePermissions()

        setContent {
            MyApplicationTheme {
                val allReady by permissionState
                if (!allReady) {
                    PermissionSetupScreen()
                } else {
                    AppNavigation()
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        refreshPermissionCheck()
    }

    // ==================== 权限请求 ====================

    private fun requestAllRuntimePermissions() {
        val perms = mutableListOf<String>()

        // 相机
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            perms.add(Manifest.permission.CAMERA)
        }

        // 存储 (Android 12 及以下)
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.S_V2) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
                perms.add(Manifest.permission.READ_EXTERNAL_STORAGE)
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
                perms.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            }
        }

        // 媒体 (Android 13+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_MEDIA_IMAGES)
                != PackageManager.PERMISSION_GRANTED) {
                perms.add(Manifest.permission.READ_MEDIA_IMAGES)
            }
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {
                perms.add(Manifest.permission.POST_NOTIFICATIONS)
            }
        }

        // 蓝牙 (Android 12+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT)
                != PackageManager.PERMISSION_GRANTED) {
                perms.add(Manifest.permission.BLUETOOTH_CONNECT)
            }
        }

        if (perms.isNotEmpty()) {
            runtimePermissionLauncher.launch(perms.toTypedArray())
        }

        refreshPermissionCheck()
    }

    private fun refreshPermissionCheck() {
        val overlay = Settings.canDrawOverlays(this)
        val accessibility = isAccessibilityEnabled()
        // 只要悬浮窗和无障碍都开了就放行进入主界面
        permissionState.value = overlay && accessibility
    }

    private fun isAccessibilityEnabled(): Boolean {
        val am = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val services = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        val myService = "$packageName/.accessibility.ScriptAccessibilityService"
        return services.any {
            it.resolveInfo.serviceInfo.let { si ->
                "${si.packageName}/${si.name}" == myService ||
                si.name == "com.example.myapplication.accessibility.ScriptAccessibilityService"
            }
        }
    }

    private fun isBatteryOptimizationIgnored(): Boolean {
        val pm = getSystemService(Context.POWER_SERVICE) as PowerManager
        return pm.isIgnoringBatteryOptimizations(packageName)
    }

    // ==================== 权限引导界面 ====================

    @Composable
    private fun PermissionSetupScreen() {
        val overlayOk = Settings.canDrawOverlays(this)
        val accessibilityOk = isAccessibilityEnabled()
        val batteryOk = isBatteryOptimizationIgnored()
        val writeSettingsOk = Settings.System.canWrite(this)

        Scaffold { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(40.dp))
                Icon(Icons.Filled.Security, contentDescription = null,
                    modifier = Modifier.size(64.dp),
                    tint = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.height(16.dp))
                Text("权限设置", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.height(8.dp))
                Text("脚本运行需要以下权限，请逐项开启",
                    fontSize = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                Spacer(Modifier.height(24.dp))

                // 1. 悬浮窗权限 (必须)
                PermissionItem(
                    icon = Icons.Filled.Layers,
                    title = "悬浮窗权限",
                    desc = "用于显示脚本控制悬浮窗",
                    granted = overlayOk,
                    required = true,
                    onClick = {
                        overlayPermissionLauncher.launch(
                            Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                                Uri.parse("package:$packageName"))
                        )
                    }
                )

                // 2. 无障碍服务 (必须)
                PermissionItem(
                    icon = Icons.Filled.Accessibility,
                    title = "无障碍服务",
                    desc = "用于模拟点击和手势操作",
                    granted = accessibilityOk,
                    required = true,
                    onClick = {
                        accessibilitySettingsLauncher.launch(
                            Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
                        )
                    }
                )

                // 3. 电池优化 (推荐)
                PermissionItem(
                    icon = Icons.Filled.BatteryChargingFull,
                    title = "忽略电池优化",
                    desc = "防止后台被系统杀死",
                    granted = batteryOk,
                    required = false,
                    onClick = {
                        try {
                            @Suppress("BatteryLife")
                            batteryOptLauncher.launch(
                                Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS,
                                    Uri.parse("package:$packageName"))
                            )
                        } catch (_: Exception) {
                            batteryOptLauncher.launch(
                                Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS)
                            )
                        }
                    }
                )

                // 4. 修改系统设置 (推荐)
                PermissionItem(
                    icon = Icons.Filled.Settings,
                    title = "修改系统设置",
                    desc = "用于调节亮度、锁屏时间等",
                    granted = writeSettingsOk,
                    required = false,
                    onClick = {
                        writeSettingsLauncher.launch(
                            Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS,
                                Uri.parse("package:$packageName"))
                        )
                    }
                )

                Spacer(Modifier.height(32.dp))

                // 进入主界面按钮
                Button(
                    onClick = { refreshPermissionCheck() },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    enabled = overlayOk && accessibilityOk
                ) {
                    Text(if (overlayOk && accessibilityOk) "进入主界面" else "请先开启必要权限")
                }

                if (!overlayOk || !accessibilityOk) {
                    Spacer(Modifier.height(8.dp))
                    TextButton(onClick = {
                        // 强制跳过 (功能可能受限)
                        permissionState.value = true
                    }) {
                        Text("跳过 (部分功能不可用)", fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }

                Spacer(Modifier.height(40.dp))
            }
        }
    }

    @Composable
    private fun PermissionItem(
        icon: ImageVector,
        title: String,
        desc: String,
        granted: Boolean,
        required: Boolean,
        onClick: () -> Unit
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
            colors = CardDefaults.cardColors(
                containerColor = if (granted)
                    MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f)
                else MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(icon, contentDescription = null, modifier = Modifier.size(32.dp),
                    tint = if (granted) MaterialTheme.colorScheme.primary
                    else MaterialTheme.colorScheme.onSurfaceVariant)
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(title, fontSize = 15.sp)
                        if (required) {
                            Spacer(Modifier.width(4.dp))
                            Text("必须", fontSize = 10.sp,
                                color = MaterialTheme.colorScheme.error)
                        }
                    }
                    Text(desc, fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                if (granted) {
                    Icon(Icons.Filled.CheckCircle, contentDescription = "已开启",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(24.dp))
                } else {
                    FilledTonalButton(onClick = onClick) {
                        Text("去开启", fontSize = 13.sp)
                    }
                }
            }
        }
    }

    // ==================== 主导航 ====================

    @Composable
    private fun AppNavigation() {
        val navController = rememberNavController()
        val engine = scriptEngine
        val action = engine?.action

        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                MainScreen(
                    onStartFloating = { startFloatingWindow() },
                    onStopFloating = { FloatingWindowService.stop(this@MainActivity) },
                    onStartScript = { startGameScript() },
                    onStopScript = { engine?.stop() },
                    onPauseScript = { engine?.pause() },
                    onResumeScript = { engine?.resume() },
                    onOpenBind = {
                        startActivity(Intent(this@MainActivity, SweepCodeActivity::class.java))
                    },
                    onNavigate = { route -> navController.navigate(route) },
                    getEngineState = { engine?.getState() ?: ScriptEngine.State.IDLE }
                )
            }

            composable("tool/touch") {
                TouchTestScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/screenshot") {
                ScreenCaptureScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/qr") {
                QrToolScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/network") {
                NetworkToolScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/ime") {
                InputMethodToolScreen(onBack = { navController.popBackStack() })
            }
            composable("tool/plugin") {
                PluginManageScreen(onBack = { navController.popBackStack() })
            }
            composable("tool/inject") {
                InjectToolScreen(onBack = { navController.popBackStack() })
            }
            composable("tool/file") {
                FileManageScreen(onBack = { navController.popBackStack() })
            }
            composable("tool/accessibility") {
                AccessibilityToolScreen(onBack = { navController.popBackStack() })
            }
            composable("tool/device") {
                DeviceInfoScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/media") {
                MediaControlScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/screen") {
                ScreenControlScreen(action = action, onBack = { navController.popBackStack() })
            }
            composable("tool/record") {
                RecordScreen(onBack = { navController.popBackStack() })
            }
            composable("tool/logcat") {
                LogcatScreen(onBack = { navController.popBackStack() })
            }
            composable("script/editor") {
                ScriptEditorScreen(onBack = { navController.popBackStack() })
            }
            composable("script/log") {
                ScriptLogScreen(onBack = { navController.popBackStack() })
            }
            composable("game/config") {
                GameConfigScreen(
                    onBack = { navController.popBackStack() },
                    onStartFloating = { startFloatingWindow() },
                    onRunScript = { startGameScript() },
                    onActivateCode = {
                        startActivity(Intent(this@MainActivity, SweepCodeActivity::class.java))
                    },
                    onNavigateSettings = { navController.navigate("settings") }
                )
            }
            composable("settings") {
                SettingsScreen(onBack = { navController.popBackStack() })
            }
        }
    }

    override fun onDestroy() {
        unregisterReceiver(commandReceiver)
        scriptEngine?.release()
        ScreenCaptureService.stop(this)
        super.onDestroy()
    }

    private fun startGameScript() {
        val gs = gameScript ?: return
        val eng = scriptEngine ?: return

        // 如果之前停止过，重置状态
        val currentState = eng.getState()
        if (currentState == ScriptEngine.State.STOPPED) {
            eng.resetState()
        }

        // 检查截图权限是否已获取
        if (!ScreenShoterV3.getInstance().isInited()) {
            Toast.makeText(this, "正在请求截图权限...", Toast.LENGTH_SHORT).show()
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

        eng.start {
            gs.execute(this, eng)
        }
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
                Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:$packageName"))
            )
        } else {
            FloatingWindowService.start(this)
        }
    }
}
