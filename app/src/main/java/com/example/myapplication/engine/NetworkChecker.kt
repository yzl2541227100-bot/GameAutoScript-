package com.example.myapplication.engine

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Build
import android.util.Log

/**
 * 网络连接检测器（对齐次元助手 C4381t4）
 *
 * 功能：
 * - 检查当前网络是否可用
 * - 监听网络状态变化
 * - 提供网络状态回调
 */
object NetworkChecker {

    private const val TAG = "NetworkChecker"

    @Volatile
    var isNetworkAvailable = true
        private set

    private var networkCallback: ConnectivityManager.NetworkCallback? = null
    private var onNetworkLost: (() -> Unit)? = null
    private var onNetworkAvailable: (() -> Unit)? = null

    /** 检查网络是否可用 */
    fun isConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = cm.activeNetwork ?: return false
            val caps = cm.getNetworkCapabilities(network) ?: return false
            caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) &&
                    caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED)
        } else {
            @Suppress("DEPRECATION")
            cm.activeNetworkInfo?.isConnected == true
        }
    }

    /** 注册网络状态监听 */
    fun startMonitoring(context: Context) {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        networkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                Log.d(TAG, "Network available")
                isNetworkAvailable = true
                onNetworkAvailable?.invoke()
                ScriptLogger.log("I", TAG, "网络已连接")
            }

            override fun onLost(network: Network) {
                Log.w(TAG, "Network lost")
                isNetworkAvailable = false
                onNetworkLost?.invoke()
                ScriptLogger.log("W", TAG, "网络已断开")
            }

            override fun onUnavailable() {
                Log.w(TAG, "Network unavailable")
                isNetworkAvailable = false
            }
        }

        val request = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()

        try {
            cm.registerNetworkCallback(request, networkCallback!!)
            isNetworkAvailable = isConnected(context)
            Log.d(TAG, "Network monitoring started, connected=$isNetworkAvailable")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to register network callback", e)
        }
    }

    /** 停止网络监听 */
    fun stopMonitoring(context: Context) {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        networkCallback?.let {
            try { cm.unregisterNetworkCallback(it) } catch (_: Exception) {}
        }
        networkCallback = null
    }

    /** 设置网络丢失回调 */
    fun setOnNetworkLost(callback: () -> Unit) {
        onNetworkLost = callback
    }

    /** 设置网络恢复回调 */
    fun setOnNetworkAvailable(callback: () -> Unit) {
        onNetworkAvailable = callback
    }
}
