package com.example.myapplication.plugin

import android.content.Context
import android.content.res.AssetManager
import android.util.Log
import dalvik.system.DexClassLoader
import java.io.File
import java.io.FileOutputStream

/**
 * 插件管理器 - 动态加载插件 APK
 * 参考 VirtualAPK 思路，简化实现
 */
class PluginManager private constructor(private val context: Context) {

    companion object {
        const val TAG = "PluginManager"
        private const val PLUGIN_DIR = "plugins"

        @Volatile
        private var instance: PluginManager? = null

        fun getInstance(context: Context): PluginManager {
            return instance ?: synchronized(this) {
                instance ?: PluginManager(context.applicationContext).also { instance = it }
            }
        }
    }

    data class PluginInfo(
        val name: String,
        val path: String,
        val classLoader: ClassLoader,
        val assetManager: AssetManager? = null
    )

    private val loadedPlugins = mutableMapOf<String, PluginInfo>()

    /** 获取插件目录 */
    private fun getPluginDir(): File {
        val dir = File(context.filesDir, PLUGIN_DIR)
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    /** 从 assets 释放插件 APK */
    fun extractPluginFromAssets(assetName: String): File? {
        val targetFile = File(getPluginDir(), assetName)
        if (targetFile.exists()) return targetFile

        return try {
            context.assets.open(assetName).use { input ->
                FileOutputStream(targetFile).use { output ->
                    input.copyTo(output)
                }
            }
            Log.d(TAG, "Extracted plugin: ${targetFile.absolutePath}")
            targetFile
        } catch (e: Exception) {
            Log.e(TAG, "Extract plugin failed: $assetName", e)
            null
        }
    }

    /** 加载插件 APK */
    fun loadPlugin(pluginFile: File, pluginName: String): Boolean {
        if (loadedPlugins.containsKey(pluginName)) {
            Log.w(TAG, "Plugin already loaded: $pluginName")
            return true
        }

        return try {
            val dexDir = File(context.codeCacheDir, "plugin_dex")
            if (!dexDir.exists()) dexDir.mkdirs()

            val classLoader = DexClassLoader(
                pluginFile.absolutePath,
                dexDir.absolutePath,
                null,
                context.classLoader
            )

            val info = PluginInfo(
                name = pluginName,
                path = pluginFile.absolutePath,
                classLoader = classLoader
            )
            loadedPlugins[pluginName] = info
            Log.d(TAG, "Plugin loaded: $pluginName")
            true
        } catch (e: Exception) {
            Log.e(TAG, "Load plugin failed: $pluginName", e)
            false
        }
    }

    /** 从插件中加载类 */
    fun loadClass(pluginName: String, className: String): Class<*>? {
        val plugin = loadedPlugins[pluginName] ?: return null
        return try {
            plugin.classLoader.loadClass(className)
        } catch (e: ClassNotFoundException) {
            Log.e(TAG, "Class not found in plugin $pluginName: $className", e)
            null
        }
    }

    /** 卸载插件 */
    fun unloadPlugin(pluginName: String) {
        loadedPlugins.remove(pluginName)
        Log.d(TAG, "Plugin unloaded: $pluginName")
    }

    /** 获取已加载插件列表 */
    fun getLoadedPlugins(): List<PluginInfo> = loadedPlugins.values.toList()
}
