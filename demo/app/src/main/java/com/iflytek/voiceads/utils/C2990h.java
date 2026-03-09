package com.iflytek.voiceads.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.FileReader;
import java.net.NetworkInterface;
import java.util.Collections;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.h */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2990h {

    /* JADX INFO: renamed from: a */
    private static String f16467a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r0 = r1.trim();
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m13558a() {
        /*
            java.lang.String r1 = ""
            java.lang.String r0 = ""
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "cat /sys/class/net/wlan0/address"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Exception -> L40
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L40
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L40
            r3.<init>(r2)     // Catch: java.lang.Exception -> L40
            java.io.LineNumberReader r2 = new java.io.LineNumberReader     // Catch: java.lang.Exception -> L40
            r2.<init>(r3)     // Catch: java.lang.Exception -> L40
        L1c:
            if (r1 == 0) goto L28
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L1c
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Exception -> L40
        L28:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3f
            java.lang.String r1 = "/sys/class/net/eth0/address"
            java.lang.String r1 = m13560a(r1)     // Catch: java.lang.Exception -> L5e
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Exception -> L5e
            r2 = 0
            r3 = 17
            java.lang.String r0 = r1.substring(r2, r3)     // Catch: java.lang.Exception -> L5e
        L3f:
            return r0
        L40:
            r1 = move-exception
            java.lang.String r2 = "IFLY_AD_SDK"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "mac error1:"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            com.iflytek.voiceads.utils.C2989g.m13557b(r2, r1)
            goto L28
        L5e:
            r1 = move-exception
            java.lang.String r2 = "IFLY_AD_SDK"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "mac error2:"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            com.iflytek.voiceads.utils.C2989g.m13557b(r2, r1)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.voiceads.utils.C2990h.m13558a():java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public static String m13559a(Context context) {
        if (!TextUtils.isEmpty(f16467a)) {
            return f16467a;
        }
        try {
            if (Build.VERSION.SDK_INT < 23) {
                f16467a = m13562b(context);
            } else if (Build.VERSION.SDK_INT < 24) {
                f16467a = m13558a();
            } else {
                f16467a = m13561b();
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getMac:" + e.getMessage());
        }
        return !TextUtils.isEmpty(f16467a) ? f16467a : "02:00:00:00:00:00";
    }

    /* JADX INFO: renamed from: a */
    public static String m13560a(String str) throws Exception {
        FileReader fileReader = new FileReader(str);
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[4096];
        for (int i = fileReader.read(cArr); i >= 0; i = fileReader.read(cArr)) {
            sb.append(cArr, 0, i);
        }
        String string = sb.toString();
        fileReader.close();
        return string;
    }

    /* JADX INFO: renamed from: b */
    private static String m13561b() {
        try {
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
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "mac error3:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m13562b(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
    }
}
