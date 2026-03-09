package com.example.myapplication.ui.tools

import android.os.Build
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myapplication.engine.ScriptAction
import com.example.myapplication.ui.components.InfoItem
import com.example.myapplication.ui.components.SectionCard
import com.example.myapplication.ui.components.ToolPageScaffold

@Composable
fun DeviceInfoScreen(action: ScriptAction?, onBack: () -> Unit) {
    val context = LocalContext.current
    val dm = context.resources.displayMetrics

    ToolPageScaffold(title = "设备信息", onBack = onBack) {
        Spacer(Modifier.height(4.dp))

        SectionCard(title = "基本信息", icon = Icons.Outlined.PhoneAndroid) {
            InfoItem("设备名称", action?.getDeviceName() ?: Build.MODEL)
            InfoItem("设备ID", action?.getDeviceId() ?: "N/A")
            InfoItem("品牌", Build.BRAND)
            InfoItem("型号", Build.MODEL)
            InfoItem("制造商", Build.MANUFACTURER)
        }

        SectionCard(title = "系统信息", icon = Icons.Outlined.Settings) {
            InfoItem("Android 版本", action?.getAndroidVersion() ?: Build.VERSION.RELEASE)
            InfoItem("SDK 版本", Build.VERSION.SDK_INT.toString())
            InfoItem("64位", if (action?.is64Bit() == true) "是" else "否")
            InfoItem("Root", if (action?.isRoot() == true) "是" else "否")
            InfoItem("ABI", Build.SUPPORTED_ABIS.joinToString(", "))
        }

        SectionCard(title = "屏幕信息", icon = Icons.Outlined.Smartphone) {
            InfoItem("分辨率", "${dm.widthPixels} × ${dm.heightPixels}")
            InfoItem("DPI", (action?.getDisplayDpi() ?: dm.densityDpi).toString())
            InfoItem("密度", dm.density.toString())
            InfoItem("旋转", "${action?.getScreenRotation() ?: 0} (0=竖屏)")
        }

        SectionCard(title = "存储信息", icon = Icons.Outlined.Storage) {
            InfoItem("SD卡路径", action?.getSdcardDir() ?: "N/A")
            InfoItem("应用路径", context.applicationInfo.sourceDir)
            InfoItem("数据路径", context.filesDir.absolutePath)
        }

        SectionCard(title = "网络信息", icon = Icons.Outlined.Wifi) {
            InfoItem("网络类型", action?.getNetType() ?: "unknown")
            InfoItem("VPN", if (action?.getVPNStatus() == true) "已连接" else "未连接")
        }

        Spacer(Modifier.height(16.dp))
    }
}
