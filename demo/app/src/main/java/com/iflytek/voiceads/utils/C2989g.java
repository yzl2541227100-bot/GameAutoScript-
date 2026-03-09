package com.iflytek.voiceads.utils;

import android.util.Log;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2989g {

    /* JADX INFO: renamed from: a */
    private static boolean f16466a = false;

    /* JADX INFO: renamed from: a */
    public static void m13555a(String str, String str2) {
        if (f16466a) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13556a(boolean z) {
        f16466a = z;
    }

    /* JADX INFO: renamed from: b */
    public static void m13557b(String str, String str2) {
        if (f16466a) {
            Log.e(str, str2);
            C2988f.m13552a(str2);
        }
    }
}
