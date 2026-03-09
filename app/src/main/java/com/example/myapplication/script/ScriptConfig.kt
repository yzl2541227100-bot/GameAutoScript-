package com.example.myapplication.script

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * 脚本配置数据模型 - 对应偃武次元助手的功能设置
 * 所有配置项持久化到 SharedPreferences
 */
data class ScriptConfig(
    // ===== 一键设置 =====
    var gameChannel: String = "腾讯",
    var autoOpenGame: Boolean = true,
    var templateName: String = "点击选择模板",
    var myTemplate: String = "无",

    // ===== 日常相关 =====
    var helpAlly: Boolean = true,
    var techDonate: Boolean = false,
    var collectTribute: Boolean = true,
    var mainCityCollect: Boolean = false,
    var territoryCollect: Boolean = false,
    var landCollect: Boolean = false,
    var collectMail: Boolean = false,
    var allianceTask: Boolean = false,
    var fameReward: Boolean = false,

    // ===== 探索相关 =====
    var autoExplore: Boolean = true,
    var sendVisit: Boolean = true,

    // ===== 采集相关 =====
    var gatherEnabled: Boolean = true,
    var gatherStrategy: String = "优先高级(推荐)",
    var gatherFrequency: Int = 1,
    var gatherFarm: Boolean = true,
    var gatherWood: Boolean = true,
    var gatherStone: Boolean = true,
    var gatherIron: Boolean = false,
    var gatherLevelMin: String = "2级(5级)",
    var gatherLevelMax: String = "4级(7级)",
    var gatherSkipBelowStorage: Int = 15,
    var gatherSkipHighLevel: Boolean = false,
    var gatherSkipHighLevelValue: Int = 6,
    var gatherSkipAllyFront: Boolean = true,
    var gatherNightTerritoryOnly: Boolean = false,
    var gatherOptions_collectOrder: Boolean = true,
    var gatherOptions_recallOutpost: Boolean = false,
    var gatherTeam1Enabled: Boolean = true,
    var gatherTeam1Type: String = "木牛流马",
    var gatherTeam1AutoForce: Boolean = true,
    var gatherTeam1Force: Int = 0,
    var gatherTeam2Enabled: Boolean = true,
    var gatherTeam2Type: String = "木牛流马",
    var gatherTeam2AutoForce: Boolean = true,
    var gatherTeam2Force: Int = 0,
    var gatherTeam3Enabled: Boolean = true,
    var gatherTeam3Type: String = "木牛流马",
    var gatherTeam3AutoForce: Boolean = true,
    var gatherTeam3Force: Int = 0,
    var gatherTeam4Enabled: Boolean = true,
    var gatherTeam4Type: String = "木牛流马",
    var gatherTeam4AutoForce: Boolean = true,
    var gatherTeam4Force: Int = 0,
    var gatherTeam5Enabled: Boolean = true,
    var gatherTeam5Type: String = "木牛流马",
    var gatherTeam5AutoForce: Boolean = true,
    var gatherTeam5Force: Int = 0,

    // ===== 铜矿相关 =====
    var copperEnabled: Boolean = false,
    var copperLevelMin: String = "1级",
    var copperLevelMax: String = "2级",
    var copperTeam1: Boolean = true,
    var copperTeam2: Boolean = true,
    var copperTeam3: Boolean = true,
    var copperTeam4: Boolean = true,
    var copperTeam5: Boolean = true,
    var copperForce: Int = 30000,
    var copperTroopType: String = "一键搭配",
    var copperSkipBelow: Int = 300,

    // ===== 集结相关 =====
    var joinBlackMountain: Boolean = false,
    var blackMountainLevel: String = "1级及以上",
    var joinMengHuo: Boolean = false,
    var mengHuoType: String = "普通+精英",
    var rallyTeam1: Boolean = true,
    var rallyTeam2: Boolean = true,
    var rallyTeam3: Boolean = true,
    var rallyTeam4: Boolean = true,
    var rallyTeam5: Boolean = true,
    var rallyFrequency: String = "3分钟",
    var rallyMaxDistance: Int = 1500,
    var rallyForce: Int = 1000,
    var rallyReturnJoinNew: Boolean = false,

    // ===== 同盟资源矿 =====
    var allianceMineEnabled: Boolean = false,
    var allianceMineTeam: String = "第3队",
    var allianceMineMaxDistance: Int = 750,
    var allianceMineSwitchWoodOx: Boolean = true,
    var allianceMineForce: Int = 50000,

    // ===== 开荒 - 建筑升级 =====
    var buildUpgradeEnabled: Boolean = false,
    var buildTutorialMode: Boolean = false,
    var buildMaxLevel: String = "12级",
    var buildUseSpeed: Boolean = true,
    var buildUseResource: Boolean = true,
    var buildFarm: Boolean = false,
    var buildLumber: Boolean = false,
    var buildQuarry: Boolean = false,
    var buildIronWorks: Boolean = false,
    var buildBarracks: Boolean = false,
    var buildSchool: Boolean = false,
    var buildUniversity: Boolean = false,
    var buildBlacksmith: Boolean = false,
    var buildHospital: Boolean = false,
    var buildWarehouse: Boolean = false,
    var buildFourSquare: Boolean = false,
    var buildMilitaryHall: Boolean = false,
    var buildWall: Boolean = false,
    var buildTurret: Boolean = false,
    var buildCapitalHall: Boolean = false,
    var buildMarket: Boolean = false,

    // ===== 技术研究 =====
    var techResearchEnabled: Boolean = false,
    var techResearchLimit: String = "二级兵",
    var techUseSpeed: Boolean = false,
    var techUseResource: Boolean = false,

    // ===== 招兵相关 =====
    var recruitEnabled: Boolean = false,
    var recruitType: String = "二级兵",
    var recruitTarget: Int = 10000,
    var recruitUseSpeed: Boolean = false,
    var recruitPromote: Boolean = false,

    // ===== 配队相关 =====
    var autoRecruit: Boolean = false,
    var autoFormation: Boolean = false,

    // ===== 打野相关 =====
    var huntEnabled: Boolean = false,
    var huntTeamEnabled: Boolean = false,
    var huntTeamSelection: String = "第1队",
    var huntSingleEnabled: Boolean = false,
    var huntSingleTeam1: Boolean = true,
    var huntSingleTeam2: Boolean = false,
    var huntSingleTeam3: Boolean = false,
    var huntSingleTeam4: Boolean = false,
    var huntSingleTeam5: Boolean = false,
    var huntMarchMethod: String = "搜索行军",
    var huntForceThreshold: String = "50%",
    var huntLevel: String = "最高级",
    var huntFailDowngrade: Boolean = true,
    var huntTroopType: String = "精锐",
    var huntDailyReward: Boolean = true,
    var huntAutoHeal: Boolean = true,
    var huntUseSpeed: Boolean = false,

    // ===== 练兵相关 =====
    var trainEnabled: Boolean = false,
    var trainFrequency: String = "1小时",
    var trainTroopType: String = "精锐",
    var trainTroopClass: String = "自动",

    // ===== 锻造相关 =====
    var forgeEnabled: Boolean = false,
    var forgeMoveCity: Boolean = false,
    var forgePeaceShield: Boolean = false,
    var forgeResourceToken: Boolean = false,
    var forgeGunpowder: Boolean = false,
    var forgeResearchSpeed: Boolean = false,
    var forgeUseGoldRefresh: Boolean = false,

    // ===== 活动相关 =====
    var activityEnabled: Boolean = false,
    var activityAutoRecognize: Boolean = true,

    // ===== 使用道具 =====
    var useResourceBox: Boolean = false,
    var useStaminaPotion: Boolean = false,
    var usePeaceShieldAuto: Boolean = false,
    var usePeaceShieldThreshold: String = "4小时",
    var summonMengHuoEnabled: Boolean = false,
    var summonMengHuoFrequency: String = "1小时",
    var summonMengHuoType: String = "普通",
    var summonMengHuoTeam: String = "第1队",
    var summonMengHuoForce: Int = 50000,
    var summonMengHuoPriority: Boolean = false,

    // ===== 自动加盟 =====
    var autoJoinAlliance: Boolean = false,
    var autoJoinAllianceName: String = "",

    // ===== 驯马相关 =====
    var tameHorseEnabled: Boolean = false,
    var tameHorseType: String = "普通驯马",

    // ===== 预警相关 =====
    var alertGatherAttack: Boolean = true,
    var alertRecallTeam: Boolean = true,
    var alertPauseGather: Boolean = true,
    var alertPauseGatherTime: String = "2小时",
    var alertMainCityScout: Boolean = true,
    var alertMainCityScoutItem: String = "免战令(8小时)",
    var alertMainCityAttack: Boolean = true,
    var alertMainCityAttackItem: String = "免战令(8小时)",
    var alertWechatPush: Boolean = false,
    var alertWechatDeviceName: String = "",
    var alertWechatPassword: String = "",

    // ===== 其他 - 同盟建筑 =====
    var switchWoodOx: Boolean = true,
    var allianceBuildEnabled: Boolean = false,
    var allianceBuildForce: Int = 999999,
    var allianceBuildSwitchCatapult: Boolean = true,
    var allianceBuildMaxMarchTime: String = "10分钟",
    var allianceBuildTeam1: Boolean = false,
    var allianceBuildTeam2: Boolean = false,
    var allianceBuildTeam3: Boolean = true,
    var allianceBuildTeam4: Boolean = false,
    var allianceBuildTeam5: Boolean = false,

    // ===== 游戏检测 =====
    var gameCheckForeground: Boolean = true,
    var gameCheckInterval: String = "10分钟",
    var gameKeepForeground: Boolean = false,
    var gameReconnectWait: String = "30秒",

    // ===== 换号 =====
    var switchAccountEnabled: Boolean = false,
    var switchAccountInterval: String = "2小时",
    var switchAccountList: String = "",

    // ===== 串号 =====
    var serialAccountEnabled: Boolean = false,
    var serialAccountInterval: String = "2小时",
    var serialAccountList: String = "",
    var serialRestartBefore: Boolean = false,

    // ===== 挂断/挂飞 =====
    var idleDisconnectEnabled: Boolean = false,
    var idleDisconnectInterval: String = "4小时",

    // ===== 界面设置 =====
    var classicUI: Boolean = false,
    var idleAllDoneBehavior: String = "无操作",
    var idleExitGameTime: String = "30分钟",
    var idlePriority: String = "挂断",

    // ===== 行为模拟 =====
    var behaviorClickOffset: Int = 5,
    var behaviorDelayMode: String = "快速",

    // ===== 多元星控 =====
    var starControlEnabled: Boolean = false,
    var starControlDeviceName: String = "",
    var starControlPassword: String = ""
) {
    companion object {
        private const val PREF_NAME = "script_config"
        private const val KEY_CONFIG = "config_json"

        fun load(context: Context): ScriptConfig {
            val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            val json = prefs.getString(KEY_CONFIG, null) ?: return ScriptConfig()
            return try {
                Gson().fromJson(json, ScriptConfig::class.java) ?: ScriptConfig()
            } catch (e: Exception) {
                ScriptConfig()
            }
        }

        fun save(context: Context, config: ScriptConfig) {
            val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
            prefs.edit().putString(KEY_CONFIG, Gson().toJson(config)).apply()
        }
    }
}

/**
 * 模板管理
 */
data class ScriptTemplate(
    val name: String,
    val config: ScriptConfig
)

object TemplateManager {
    private const val PREF_NAME = "script_templates"
    private const val KEY_TEMPLATES = "templates_json"

    fun loadTemplates(context: Context): List<ScriptTemplate> {
        val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val json = prefs.getString(KEY_TEMPLATES, null) ?: return emptyList()
        return try {
            val type = object : TypeToken<List<ScriptTemplate>>() {}.type
            Gson().fromJson(json, type) ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    fun saveTemplate(context: Context, template: ScriptTemplate) {
        val list = loadTemplates(context).toMutableList()
        list.removeAll { it.name == template.name }
        list.add(0, template)
        val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        prefs.edit().putString(KEY_TEMPLATES, Gson().toJson(list)).apply()
    }

    fun deleteTemplate(context: Context, name: String) {
        val list = loadTemplates(context).toMutableList()
        list.removeAll { it.name == name }
        val prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        prefs.edit().putString(KEY_TEMPLATES, Gson().toJson(list)).apply()
    }
}
