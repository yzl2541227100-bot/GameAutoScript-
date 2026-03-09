package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3398t;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsConfig {
    public static boolean ACTIVITY_DURATION_OPEN = true;
    public static boolean CATCH_EXCEPTION = true;
    public static boolean FLAG_DPLUS = false;
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";

    /* JADX INFO: renamed from: a */
    public static double[] f18271a = null;

    /* JADX INFO: renamed from: b */
    private static String f18272b = null;

    /* JADX INFO: renamed from: c */
    private static String f18273c = null;

    /* JADX INFO: renamed from: d */
    private static String f18274d = null;

    /* JADX INFO: renamed from: e */
    private static int f18275e = 0;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    /* JADX INFO: renamed from: a */
    public static void m15390a(Context context, int i) {
        f18275e = i;
        C3398t.m15624a(context).m15626a(f18275e);
    }

    /* JADX INFO: renamed from: a */
    public static void m15391a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f18274d = str;
        C3398t.m15624a(context).m15627a(f18274d);
    }

    /* JADX INFO: renamed from: a */
    public static void m15392a(String str) {
        f18273c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static double[] getLocation() {
        return f18271a;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f18274d)) {
            f18274d = C3398t.m15624a(context).m15631c();
        }
        return f18274d;
    }

    public static int getVerticalType(Context context) {
        if (f18275e == 0) {
            f18275e = C3398t.m15624a(context).m15632d();
        }
        return f18275e;
    }
}
