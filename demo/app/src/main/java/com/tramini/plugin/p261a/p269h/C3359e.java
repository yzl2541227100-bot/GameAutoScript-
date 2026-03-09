package com.tramini.plugin.p261a.p269h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tramini.plugin.p261a.p263b.C3327c;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3359e {

    /* JADX INFO: renamed from: a */
    private static String f18221a = "";

    /* JADX INFO: renamed from: b */
    private static String f18222b = "";

    /* JADX INFO: renamed from: c */
    private static String f18223c = "";

    /* JADX INFO: renamed from: d */
    private static String f18224d = "";

    /* JADX INFO: renamed from: e */
    private static int f18225e;

    /* JADX INFO: renamed from: f */
    private static String f18226f;

    private C3359e() {
    }

    /* JADX INFO: renamed from: a */
    public static String m15305a() {
        if (C3327c.m15142a().m15158a("os_vc")) {
            return "";
        }
        if (TextUtils.isEmpty(f18222b)) {
            f18222b = String.valueOf(Build.VERSION.SDK_INT);
        }
        return f18222b;
    }

    /* JADX INFO: renamed from: a */
    public static String m15306a(Context context) {
        if (C3327c.m15142a().m15158a("app_vc")) {
            return "";
        }
        if (f18225e != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f18225e);
            return sb.toString();
        }
        try {
            f18225e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f18225e);
            return sb2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15307b() {
        if (C3327c.m15142a().m15158a("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f18221a)) {
            f18221a = Build.VERSION.RELEASE;
        }
        return f18221a;
    }

    /* JADX INFO: renamed from: b */
    public static String m15308b(Context context) {
        if (C3327c.m15142a().m15158a("app_vn")) {
            return "";
        }
        try {
            if (!TextUtils.isEmpty(f18224d)) {
                return f18224d;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f18224d = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m15309c() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: c */
    public static String m15310c(Context context) {
        if (C3327c.m15142a().m15158a("package_name")) {
            return "";
        }
        try {
            if (!TextUtils.isEmpty(f18223c)) {
                return f18223c;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f18223c = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
