package com.iflytek.voiceads.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.anythink.china.common.C1082d;
import com.iflytek.voiceads.download.DownloadService;
import com.iflytek.voiceads.request.IFLYBrowser;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.i */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2991i {

    /* JADX INFO: renamed from: a */
    private static String[] f16468a = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", C1082d.f2501a, "android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.GET_TASKS", "android.permission.RECORD_AUDIO", C1082d.f2502b, "android.permission.REQUEST_INSTALL_PACKAGES"};

    /* JADX INFO: renamed from: a */
    private static void m13563a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!m13566a(context, str)) {
                C2989g.m13557b("IFLY_AD_SDK", str + " must be enabled in AndroidManifest.xml");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13564a(Context context) {
        m13563a(context, f16468a);
        return m13565a(context, (Class<?>) DownloadService.class) && m13567b(context, (Class<?>) IFLYBrowser.class);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13565a(Context context, Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        if (context.getPackageManager().resolveService(intent, 65536) != null) {
            return true;
        }
        C2989g.m13557b("IFLY_AD_SDK", "Can not found " + cls.toString() + ", please set it in AndroidManifest.xml");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13566a(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13567b(Context context, Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return true;
        }
        C2989g.m13557b("IFLY_AD_SDK", "Can not found " + cls.toString() + ", please set it in AndroidManifest.xml");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13568b(Context context, String str) {
        boolean zM13566a = false;
        try {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (Build.VERSION.SDK_INT < 23 || i < 23) {
                zM13566a = m13566a(context, str);
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                zM13566a = true;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "checkPermissionGrant:" + e.getMessage());
        }
        return zM13566a;
    }
}
