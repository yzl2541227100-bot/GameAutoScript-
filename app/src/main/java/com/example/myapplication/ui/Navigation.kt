package com.example.myapplication.ui

/** 应用内导航路由 */
sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object TouchTest : Screen("tool/touch")
    data object ScreenCapture : Screen("tool/screenshot")
    data object QrTool : Screen("tool/qr")
    data object NetworkTool : Screen("tool/network")
    data object InputMethodTool : Screen("tool/ime")
    data object PluginManage : Screen("tool/plugin")
    data object InjectTool : Screen("tool/inject")
    data object FileManage : Screen("tool/file")
    data object AccessibilityTool : Screen("tool/accessibility")
    data object DeviceInfo : Screen("tool/device")
    data object MediaControl : Screen("tool/media")
    data object ScreenControl : Screen("tool/screen")
    data object ScriptEditor : Screen("script/editor")
    data object ScriptLog : Screen("script/log")
    data object Settings : Screen("settings")
}
