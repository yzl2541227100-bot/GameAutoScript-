package com.example.myapplication.engine

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

/**
 * 中文 DSL UI 配置解析
 * 支持脚本通过中文 DSL 定义 UI 界面（输入框、文字框、下拉框等）
 *
 * 示例 DSL JSON:
 * [
 *   {"类型":"输入框", "标题":"循环次数", "键名":"loop_count", "默认值":"10"},
 *   {"类型":"文字框", "标题":"说明", "内容":"请输入参数"},
 *   {"类型":"下拉框", "标题":"模式", "键名":"mode", "选项":["普通","快速"]},
 *   {"类型":"开关", "标题":"启用日志", "键名":"enable_log", "默认值":"true"}
 * ]
 */
object ScriptDsl {

    private val gson = Gson()

    /** DSL UI 元素 */
    data class UiElement(
        @SerializedName("类型") val type: String = "",
        @SerializedName("标题") val title: String = "",
        @SerializedName("键名") val key: String = "",
        @SerializedName("默认值") val defaultValue: String = "",
        @SerializedName("内容") val content: String = "",
        @SerializedName("选项") val options: List<String> = emptyList(),
        @SerializedName("提示") val hint: String = ""
    )

    /** UI 元素类型 */
    object Types {
        const val INPUT = "输入框"
        const val TEXT = "文字框"
        const val DROPDOWN = "下拉框"
        const val SWITCH = "开关"
        const val CHECKBOX = "复选框"
        const val NUMBER = "数字框"
    }

    /** 解析 DSL JSON 字符串 */
    fun parse(json: String): List<UiElement> {
        return try {
            val type = object : TypeToken<List<UiElement>>() {}.type
            gson.fromJson(json, type) ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    /** 将 UI 元素列表序列化为 JSON */
    fun toJson(elements: List<UiElement>): String {
        return gson.toJson(elements)
    }

    /** 从 UI 元素列表提取默认配置 */
    fun extractDefaults(elements: List<UiElement>): Map<String, String> {
        return elements
            .filter { it.key.isNotEmpty() }
            .associate { it.key to it.defaultValue }
    }
}
