package com.example.myapplication.entity

import java.io.File
import java.io.Serializable

/**
 * 脚本实体 - 参考 Script.java
 * 包含脚本的完整元数据和关联文件
 */
data class Script(
    var id: String = "",
    var name: String = "",
    var version: String = "",
    var appId: String = "",
    var selId: String = "",
    var description: String = "",
    var size: String = "",
    var changeFileList: Int = 0,
    var bestResolution: BestResolution? = null,
    var fileVersion: FileVersion? = null,
    // 关联文件 (对应 reference 的多文件结构)
    var atcFile: File? = null,    // 脚本主文件
    var cfgFile: File? = null,    // 配置文件
    var uiFile: File? = null,     // UI 定义文件
    var uipFile: File? = null,    // UI 属性文件
    var lcFile: File? = null,     // 逻辑控制文件
    var rtdFile: File? = null,    // 运行时数据文件
    var propFile: File? = null,   // 属性文件
    var infoFile: File? = null    // 信息文件
) : Serializable {

    companion object {
        const val SCRIPT_STATE_FREE = 0
        const val SCRIPT_STATE_LOAD = 1
        const val SCRIPT_STATE_RUNNING = 2
        const val SCRIPT_STATE_PAUSE = 3
        const val SCRIPT_STATE_PAUSE_BY_HEARTBEAT_ERR = 4
    }

    override fun toString(): String {
        return "Script(id='$id', name='$name', version='$version', appId='$appId')"
    }
}

/** 最佳分辨率 */
data class BestResolution(
    var width: Int = 0,
    var height: Int = 0
) : Serializable

/** 文件版本 */
data class FileVersion(
    var major: Int = 0,
    var minor: Int = 0,
    var patch: Int = 0
) : Serializable {
    override fun toString(): String = "$major.$minor.$patch"
}
