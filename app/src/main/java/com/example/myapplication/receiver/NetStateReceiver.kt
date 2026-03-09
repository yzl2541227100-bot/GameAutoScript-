package com.example.myapplication.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log

/**
 * 网络状态监听 - 参考 NetStateReceiver.java
 * 监听网络连接变化并通知观察者
 */
class NetStateReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "NetStateReceiver"
        private const val ACTION_CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE"

        @Volatile
        private var instance: BroadcastReceiver? = null
        private var isRegistered = false
        private var currentNetType = NetType.NONE
        private val observers = mutableListOf<NetStateObserver>()

        /** 注册监听 */
        fun register(context: Context) {
            if (isRegistered) return
            val receiver = getInstance()
            val filter = IntentFilter(ACTION_CONNECTIVITY_CHANGE)
            context.applicationContext.registerReceiver(receiver, filter)
            isRegistered = true
            Log.d(TAG, "Registered")
        }

        /** 注销监听 */
        fun unregister(context: Context) {
            if (!isRegistered) return
            try {
                context.applicationContext.unregisterReceiver(instance)
            } catch (e: Exception) {
                Log.w(TAG, "Unregister failed", e)
            }
            isRegistered = false
        }

        /** 获取当前网络类型 */
        fun getNetType(): NetType = currentNetType
        fun isConnected(): Boolean = currentNetType != NetType.NONE

        /** 添加/移除观察者 */
        fun addObserver(observer: NetStateObserver) {
            if (!observers.contains(observer)) observers.add(observer)
        }

        fun removeObserver(observer: NetStateObserver) {
            observers.remove(observer)
        }

        /** 手动触发检查 */
        fun checkNetState(context: Context) {
            val intent = Intent(ACTION_CONNECTIVITY_CHANGE)
            context.sendBroadcast(intent)
        }

        private fun getInstance(): BroadcastReceiver {
            return instance ?: synchronized(NetStateReceiver::class.java) {
                instance ?: NetStateReceiver().also { instance = it }
            }
        }

        private fun notifyObservers() {
            for (observer in observers.toList()) {
                try {
                    if (currentNetType == NetType.NONE) {
                        observer.onDisconnected()
                    } else {
                        observer.onConnected(currentNetType)
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "Observer callback error", e)
                }
            }
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != ACTION_CONNECTIVITY_CHANGE) return

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val newType = detectNetType(cm)

        if (newType != currentNetType) {
            Log.d(TAG, "Network changed: $currentNetType -> $newType")
            currentNetType = newType
            notifyObservers()
        }
    }

    private fun detectNetType(cm: ConnectivityManager): NetType {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = cm.activeNetwork ?: return NetType.NONE
            val caps = cm.getNetworkCapabilities(network) ?: return NetType.NONE
            return when {
                caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> NetType.WIFI
                caps.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> NetType.MOBILE
                caps.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> NetType.ETHERNET
                else -> NetType.OTHER
            }
        } else {
            @Suppress("DEPRECATION")
            val info = cm.activeNetworkInfo ?: return NetType.NONE
            @Suppress("DEPRECATION")
            if (!info.isConnected) return NetType.NONE
            @Suppress("DEPRECATION")
            return when (info.type) {
                ConnectivityManager.TYPE_WIFI -> NetType.WIFI
                ConnectivityManager.TYPE_MOBILE -> NetType.MOBILE
                ConnectivityManager.TYPE_ETHERNET -> NetType.ETHERNET
                else -> NetType.OTHER
            }
        }
    }

    /** 网络类型 */
    enum class NetType { NONE, WIFI, MOBILE, ETHERNET, OTHER }

    /** 网络状态观察者 */
    interface NetStateObserver {
        fun onConnected(type: NetType)
        fun onDisconnected()
    }
}
