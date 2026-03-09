package com.example.myapplication.accessibility

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.accessibilityservice.GestureDescription
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.graphics.Path
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.view.accessibility.AccessibilityWindowInfo
import androidx.annotation.RequiresApi
import java.lang.ref.WeakReference

/**
 * 无障碍服务 - 完整实现参考 Cservice.java
 * 提供手势模拟、节点查找、文字输入等能力
 */
class ScriptAccessibilityService : AccessibilityService() {

    companion object {
        const val TAG = "ScriptA11yService"
        private var instanceRef: WeakReference<ScriptAccessibilityService>? = null

        fun getInstance(): ScriptAccessibilityService? = instanceRef?.get()
        fun isRunning(): Boolean = instanceRef?.get() != null
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        instanceRef = WeakReference(this)
        serviceInfo = serviceInfo.apply {
            eventTypes = AccessibilityEvent.TYPES_ALL_MASK
            feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC
            flags = flags or
                    AccessibilityServiceInfo.FLAG_REQUEST_TOUCH_EXPLORATION_MODE or
                    AccessibilityServiceInfo.FLAG_RETRIEVE_INTERACTIVE_WINDOWS
            notificationTimeout = 100
        }
        Log.d(TAG, "Accessibility service connected")
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() { instanceRef = null }
    override fun onDestroy() { instanceRef = null; super.onDestroy() }

    override fun onKeyEvent(keyEvent: KeyEvent): Boolean {
        return super.onKeyEvent(keyEvent)
    }

    // ==================== 全局操作 ====================

    fun pressBack() { performGlobalAction(GLOBAL_ACTION_BACK) }
    fun pressHome() { performGlobalAction(GLOBAL_ACTION_HOME) }
    fun openRecents() { performGlobalAction(GLOBAL_ACTION_RECENTS) }
    fun openNotifications() { performGlobalAction(GLOBAL_ACTION_NOTIFICATIONS) }
    fun openQuickSettings() { performGlobalAction(GLOBAL_ACTION_QUICK_SETTINGS) }

    // ==================== 手势 (对应 Cservice 手势方法) ====================

    /** 点击 (对应 Cservice.OooO0Oo) */
    @RequiresApi(Build.VERSION_CODES.N)
    fun gestureClick(x: Int, y: Int, duration: Int = 100) {
        val path = Path().apply { moveTo((x - 1).toFloat(), (y - 1).toFloat()); lineTo((x + 1).toFloat(), (y + 1).toFloat()) }
        dispatchGesture(
            GestureDescription.Builder()
                .addStroke(GestureDescription.StrokeDescription(path, 50, duration.toLong()))
                .build(), null, null
        )
    }

    /** 长按 (对应 Cservice.OooO0o) */
    @RequiresApi(Build.VERSION_CODES.N)
    fun gestureLongPress(x: Int, y: Int) {
        val path = Path().apply {
            moveTo((x - 1).toFloat(), (y - 1).toFloat())
            lineTo(x.toFloat(), (y - 1).toFloat())
            lineTo(x.toFloat(), y.toFloat())
            lineTo((x - 1).toFloat(), y.toFloat())
        }
        dispatchGesture(
            GestureDescription.Builder()
                .addStroke(GestureDescription.StrokeDescription(path, 0, 1000))
                .build(), null, null
        )
    }

    /** 滑动 (对应 Cservice.OooO0O0) */
    @RequiresApi(Build.VERSION_CODES.N)
    fun gestureSwipe(x1: Int, y1: Int, x2: Int, y2: Int, duration: Int) {
        val path = Path().apply { moveTo(x1.toFloat(), y1.toFloat()); lineTo(x2.toFloat(), y2.toFloat()) }
        gesturePath(path, duration.toLong())
    }

    /** 路径手势 (对应 Cservice.OooO0oO) */
    @RequiresApi(Build.VERSION_CODES.N)
    fun gesturePath(path: Path, duration: Long) {
        dispatchGesture(
            GestureDescription.Builder()
                .addStroke(GestureDescription.StrokeDescription(path, 0, duration))
                .build(), null, null
        )
    }

    // ==================== 节点查找 (对应 Cservice 节点方法) ====================

    /** 通过文本查找节点 */
    fun findNodesByText(text: String): List<AccessibilityNodeInfo> {
        val root = rootInActiveWindow ?: return emptyList()
        val nodes = root.findAccessibilityNodeInfosByText(text)
        return nodes ?: emptyList()
    }

    /** 通过 ID 查找节点 */
    fun findNodesById(viewId: String): List<AccessibilityNodeInfo> {
        val root = rootInActiveWindow ?: return emptyList()
        val nodes = root.findAccessibilityNodeInfosByViewId(viewId)
        return nodes ?: emptyList()
    }

    /** 点击节点 (对应 Cservice.OooO0OO - 递归查找可点击父节点) */
    fun clickNode(node: AccessibilityNodeInfo): Boolean {
        if (node.isClickable) {
            node.performAction(AccessibilityNodeInfo.ACTION_CLICK)
            return true
        }
        val parent = node.parent ?: return false
        val result = clickNode(parent)
        parent.recycle()
        return result
    }

    /** 通过手势点击节点 (对应 Cservice.OooO0o0) */
    @RequiresApi(Build.VERSION_CODES.N)
    fun gestureClickNode(node: AccessibilityNodeInfo) {
        val rect = Rect()
        node.getBoundsInScreen(rect)
        gestureClick(rect.centerX(), rect.centerY())
    }

    /** 获取所有窗口根节点 (对应 Cservice.OooOOO0) */
    fun getAllWindowRoots(): List<AccessibilityNodeInfo> {
        val roots = mutableListOf<AccessibilityNodeInfo>()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            windows.forEach { window ->
                window.root?.let { roots.add(it) }
            }
        } else {
            rootInActiveWindow?.let { roots.add(it) }
        }
        return roots
    }

    /** 输入文字 (对应 Cservice.OooOOO - 通过剪贴板粘贴) */
    fun inputText(text: String, context: Context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) return
        val roots = getAllWindowRoots()
        for (root in roots) {
            if (inputTextToFocusedNode(root, text, context)) break
        }
    }

    private fun inputTextToFocusedNode(node: AccessibilityNodeInfo, text: String, context: Context): Boolean {
        if (node.childCount == 0) {
            if (node.isFocused && node.className?.toString() == "android.widget.EditText") {
                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                clipboard.setPrimaryClip(ClipData.newPlainText("paste", text))
                node.performAction(AccessibilityNodeInfo.ACTION_FOCUS)
                node.performAction(AccessibilityNodeInfo.ACTION_PASTE)
                return true
            }
            return false
        }
        for (i in 0 until node.childCount) {
            val child = node.getChild(i) ?: continue
            if (inputTextToFocusedNode(child, text, context)) return true
        }
        return false
    }

    /** 按键模拟 (对应 Cservice.OooOOOo) */
    fun keyAction(keyCode: Int, context: Context) {
        when (keyCode) {
            KeyEvent.KEYCODE_BACK -> performGlobalAction(GLOBAL_ACTION_BACK)
            KeyEvent.KEYCODE_HOME -> performGlobalAction(GLOBAL_ACTION_HOME)
            KeyEvent.KEYCODE_POWER -> performGlobalAction(GLOBAL_ACTION_LOCK_SCREEN)
            else -> {
                // 通过输入法模拟其他按键
            }
        }
    }

    /** 递归查找满足条件的节点 */
    fun findNodes(
        root: AccessibilityNodeInfo? = rootInActiveWindow,
        predicate: (AccessibilityNodeInfo) -> Boolean
    ): List<AccessibilityNodeInfo> {
        val result = mutableListOf<AccessibilityNodeInfo>()
        if (root == null) return result
        for (i in 0 until root.childCount) {
            val child = root.getChild(i) ?: continue
            if (predicate(child)) {
                result.add(child)
            } else {
                result.addAll(findNodes(child, predicate))
                child.recycle()
            }
        }
        return result
    }
}
