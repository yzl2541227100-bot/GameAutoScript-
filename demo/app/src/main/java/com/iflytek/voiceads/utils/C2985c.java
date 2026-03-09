package com.iflytek.voiceads.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2985c {
    /* JADX INFO: renamed from: a */
    public static long m13539a(Context context, String str) {
        return m13540a(context).getLong(str, 0L);
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m13540a(Context context) {
        return context.getSharedPreferences("IFLY_AD_SHARED", 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m13541a(Context context, String str, long j) {
        m13540a(context).edit().putLong(str, j).apply();
    }

    /* JADX INFO: renamed from: a */
    public static void m13542a(Context context, String str, String str2) {
        m13540a(context).edit().putString(str, str2).apply();
    }

    /* JADX INFO: renamed from: a */
    public static void m13543a(Context context, String str, boolean z) {
        m13540a(context).edit().putBoolean(str, z).apply();
    }

    /* JADX INFO: renamed from: b */
    public static String m13544b(Context context, String str) {
        return m13540a(context).getString(str, "");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13545c(Context context, String str) {
        return m13540a(context).getBoolean(str, false);
    }
}
