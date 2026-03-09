package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.anythink.expressad.C1404a;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1881o {

    /* JADX INFO: renamed from: a */
    public static boolean f11581a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f11582b = true;

    /* JADX INFO: renamed from: c */
    public static boolean f11583c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f11584d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f11585e = true;

    /* JADX INFO: renamed from: f */
    public static boolean f11586f = false;

    /* JADX INFO: renamed from: g */
    public static boolean f11587g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f11588h = false;

    /* JADX INFO: renamed from: i */
    private static final String f11589i = "anythink_";

    static {
        if (C1404a.f6209a) {
            return;
        }
        f11581a = false;
        f11582b = false;
        f11583c = false;
        f11584d = false;
        f11585e = false;
        f11586f = false;
        f11587g = false;
        f11588h = false;
    }

    private C1881o() {
    }

    /* JADX INFO: renamed from: a */
    private static String m9758a(String str) {
        return !TextUtils.isEmpty(str) ? f11589i.concat(String.valueOf(str)) : str;
    }

    /* JADX INFO: renamed from: a */
    private static void m9759a(Context context, String str) {
        if (f11586f) {
            Toast.makeText(context, str, 1).show();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m9760a(String str, String str2) {
        if (!f11581a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(m9758a(str), str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m9761a(String str, String str2, Throwable th) {
        if (!f11581a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(m9758a(str), str2, th);
    }

    /* JADX INFO: renamed from: a */
    private static void m9762a(String str, Throwable th) {
        if (!f11584d || th == null) {
            return;
        }
        Log.w(m9758a(str), th);
    }

    /* JADX INFO: renamed from: b */
    private static void m9763b(String str, String str2) {
        if (!f11582b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(m9758a(str), str2);
    }

    /* JADX INFO: renamed from: b */
    private static void m9764b(String str, String str2, Throwable th) {
        if (!f11582b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(m9758a(str), str2, th);
    }

    /* JADX INFO: renamed from: c */
    private static void m9765c(String str, String str2) {
        if (!f11583c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(m9758a(str), str2);
    }

    /* JADX INFO: renamed from: c */
    private static void m9766c(String str, String str2, Throwable th) {
        if (!f11583c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(m9758a(str), str2, th);
    }

    /* JADX INFO: renamed from: d */
    private static void m9767d(String str, String str2) {
        if (!f11584d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(m9758a(str), str2);
    }

    /* JADX INFO: renamed from: d */
    private static void m9768d(String str, String str2, Throwable th) {
        if (!f11584d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(m9758a(str), str2, th);
    }

    /* JADX INFO: renamed from: e */
    private static void m9769e(String str, String str2) {
        if (!f11585e || str2 == null) {
            return;
        }
        Log.e(m9758a(str), str2);
    }

    /* JADX INFO: renamed from: e */
    private static void m9770e(String str, String str2, Throwable th) {
        if (!f11585e || str2 == null) {
            return;
        }
        Log.e(m9758a(str), str2, th);
    }
}
