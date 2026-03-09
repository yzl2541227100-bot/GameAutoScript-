package com.example.myapplication.inputmethod

import android.inputmethodservice.InputMethodService
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

/**
 * 自定义输入法服务 - 用于脚本中的文字输入自动化
 * 参考 InputKb: 简单 IME 服务
 */
class ScriptInputService : InputMethodService() {

    companion object {
        const val TAG = "ScriptInputService"
    }

    override fun onCreateInputView(): View {
        Log.d(TAG, "Input method created")
        // 最小化的输入法视图
        return LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 8, 16, 8)
            setBackgroundColor(0xFF424242.toInt())
            addView(TextView(this@ScriptInputService).apply {
                text = "脚本输入法已激活"
                setTextColor(0xFFFFFFFF.toInt())
                textSize = 14f
            })
        }
    }

    /** 通过脚本注入文字 */
    fun inputText(text: String) {
        currentInputConnection?.let { ic ->
            ic.commitText(text, 1)
            Log.d(TAG, "Input text: $text")
        }
    }

    /** 清除输入 */
    fun clearText(length: Int) {
        currentInputConnection?.let { ic ->
            ic.deleteSurroundingText(length, 0)
        }
    }

    /** 模拟按键 */
    fun sendKeyEvent(keyCode: Int) {
        currentInputConnection?.let { ic ->
            ic.sendKeyEvent(
                android.view.KeyEvent(android.view.KeyEvent.ACTION_DOWN, keyCode)
            )
            ic.sendKeyEvent(
                android.view.KeyEvent(android.view.KeyEvent.ACTION_UP, keyCode)
            )
        }
    }
}
