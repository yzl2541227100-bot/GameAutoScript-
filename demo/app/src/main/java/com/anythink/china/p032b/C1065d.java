package com.anythink.china.p032b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: com.anythink.china.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1065d {
    /* JADX INFO: renamed from: a */
    public static String m1424a() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                for (byte b : hardwareAddress) {
                    sb.append(String.format("%02X:", Byte.valueOf(b)));
                }
                if (!TextUtils.isEmpty(sb)) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
            return "";
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m1425a(Context context) {
        WifiInfo connectionInfo;
        if (context == null) {
            return "";
        }
        try {
            connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        } catch (Throwable th) {
            th.printStackTrace();
            connectionInfo = null;
        }
        if (connectionInfo == null) {
            return null;
        }
        String macAddress = connectionInfo.getMacAddress();
        return !TextUtils.isEmpty(macAddress) ? macAddress.toUpperCase(Locale.ENGLISH) : macAddress;
    }

    /* JADX INFO: renamed from: b */
    private static String m1426b(Context context) {
        return C1175n.m2059a().m2141c("mac") ? "" : Build.VERSION.SDK_INT < 23 ? m1425a(context) : m1424a();
    }
}
