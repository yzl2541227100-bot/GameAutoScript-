package com.anythink.core.common.p066o;

import android.util.Log;

/* JADX INFO: renamed from: com.anythink.core.common.o.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1342f {

    /* JADX INFO: renamed from: a */
    public static boolean f5274a;

    /* JADX INFO: renamed from: b */
    public static boolean f5275b;

    /* JADX INFO: renamed from: c */
    private static boolean f5276c;

    /* JADX INFO: renamed from: d */
    private static boolean f5277d;

    /* JADX INFO: renamed from: e */
    private static boolean f5278e;

    /* JADX INFO: renamed from: f */
    private static boolean f5279f;

    /* JADX INFO: renamed from: g */
    private static boolean f5280g;

    /* JADX INFO: renamed from: h */
    private static boolean f5281h;

    private C1342f() {
    }

    /* JADX INFO: renamed from: a */
    private static void m4109a(String str, String str2) {
        if (f5276c) {
            Log.v(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4110a(String str, String str2, Throwable th) {
        if (f5276c) {
            Log.v(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4111a(String str, String str2, Object... objArr) {
        if (f5277d) {
            try {
                Log.d(str, String.format(str2, objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4112a(String str, Throwable th) {
        if (f5279f) {
            Log.w(str, th);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m4113b(String str, String str2) {
        if (f5277d) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m4114b(String str, String str2, Throwable th) {
        if (f5277d) {
            Log.d(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m4115b(String str, String str2, Object... objArr) {
        if (f5280g) {
            try {
                Log.e(str, String.format(str2, objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m4116c(String str, String str2) {
        if (f5278e) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m4117c(String str, String str2, Throwable th) {
        if (f5278e) {
            Log.i(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m4118d(String str, String str2) {
        if (f5279f) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m4119d(String str, String str2, Throwable th) {
        if (f5279f) {
            Log.w(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m4120e(String str, String str2) {
        if (f5280g) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m4121e(String str, String str2, Throwable th) {
        if (f5280g) {
            Log.e(str, str2, th);
        }
        boolean z = f5281h;
    }

    /* JADX INFO: renamed from: f */
    private static void m4122f(String str, String str2) {
        if (f5278e) {
            int length = 2001 - str.length();
            while (str2.length() > length) {
                Log.d(str, str2.substring(0, length));
                str2 = str2.substring(length);
            }
            Log.d(str, str2);
        }
    }
}
