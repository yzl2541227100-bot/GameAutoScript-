package com.example.myapplication.entity

import java.io.Serializable

/**
 * 脚本信息 - 用于列表展示和管理
 */
data class ScriptInfo(
    var id: String = "",
    var name: String = "",
    var description: String = "",
    var version: String = "",
    var author: String = "",
    var createTime: Long = 0,
    var updateTime: Long = 0,
    var filePath: String = "",
    var fileSize: Long = 0,
    var state: Int = Script.SCRIPT_STATE_FREE,
    var loopCount: Int = ScriptControlConstant.RUN_ONE_TIME,
    var loopInterval: Long = 0
) : Serializable
