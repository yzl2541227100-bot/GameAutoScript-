package com.goldcoast.sdk.p206c;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C2743i {

    /* JADX INFO: renamed from: a */
    private static Class<?> f16013a;

    /* JADX INFO: renamed from: b */
    private static Method f16014b;

    /* JADX INFO: renamed from: c */
    private static Method f16015c;

    /* JADX INFO: renamed from: d */
    private static Method f16016d;

    /* JADX INFO: renamed from: e */
    private static Method f16017e;

    /* JADX INFO: renamed from: f */
    private static Method f16018f;

    /* JADX INFO: renamed from: g */
    private static Method f16019g;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            f16013a = cls;
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            f16014b = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = f16013a.getDeclaredMethod("get", String.class, String.class);
            f16015c = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = f16013a.getDeclaredMethod("getInt", String.class, Integer.TYPE);
            f16016d = declaredMethod3;
            declaredMethod3.setAccessible(true);
            Method declaredMethod4 = f16013a.getDeclaredMethod("getLong", String.class, Long.TYPE);
            f16017e = declaredMethod4;
            declaredMethod4.setAccessible(true);
            Method declaredMethod5 = f16013a.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            f16018f = declaredMethod5;
            declaredMethod5.setAccessible(true);
            Method declaredMethod6 = f16013a.getDeclaredMethod("set", String.class, String.class);
            f16019g = declaredMethod6;
            declaredMethod6.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m13183a(String str) {
        try {
            return (String) f16014b.invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
