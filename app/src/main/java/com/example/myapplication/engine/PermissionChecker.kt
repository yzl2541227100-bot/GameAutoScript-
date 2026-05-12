package com.example.myapplication.engine

import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Context
import android.provider.Settings
import android.view.accessibility.AccessibilityManager

/**
 * 权限状态检查器（对齐次元助手权限验证）
 *
 * 在脚本启动前验证所有必要权限
 */
object PermissionChecker {

    data class PermissionStatus(
        val overlay: Boolean,
        val accessibility: Boolean,
        val screenCapture: Boolean,
        val allGranted: Boolean
    )

    /** 检查所有必要权限 */
    fun checkAll(context: Context, screenCaptureReady: Boolean): PermissionStatus {
        val overlay = Settings.canDrawOverlays(context)
        val accessibility = isAccessibilityEnabled(context)
        return PermissionStatus(
            overlay = overlay,
            accessibility = accessibility,
            screenCapture = screenCaptureReady,
            allGranted = overlay && accessibility && screenCaptureReady
        )
    }

    /** 检查悬浮窗权限 */
    fun hasOverlayPermission(context: Context): Boolean {
        return Settings.canDrawOverlays(context)
    }

    /** 检查无障碍服务是否启用 */
    fun isAccessibilityEnabled(context: Context): Boolean {
        val am = context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val services = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        return services.any {
            it.resolveInfo.serviceInfo.name == "com.example.myapplication.accessibility.ScriptAccessibilityService"
        }
    }

    /** 获取缺失权限的描述 */
    fun getMissingPermissions(context: Context, screenCaptureReady: Boolean): List<String> {
        val missing = mutableListOf<String>()
        if (!Settings.canDrawOverlays(context)) missing.add("悬浮窗权限")
        if (!isAccessibilityEnabled(context)) missing.add("无障碍服务")
        if (!screenCaptureReady) missing.add("截图权限")
        return missing
    }
}
