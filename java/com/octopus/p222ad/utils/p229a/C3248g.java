package com.octopus.p222ad.utils.p229a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.octopus.p222ad.ADBidEvent;
import p285z2.C4492w4;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C3248g {
    /* JADX INFO: renamed from: a */
    public static String m14937a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            C3247f.m14935a("System property invoke error: " + e);
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14938a() {
        if (!Build.MANUFACTURER.equalsIgnoreCase(ADBidEvent.HUAWEI)) {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase(ADBidEvent.HUAWEI) && !str.equalsIgnoreCase("HONOR")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14939a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14940b() {
        return !TextUtils.isEmpty(m14937a("ro.build.version.emui", ""));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14941c() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase("OPPO") && !str.equalsIgnoreCase("REALME") && TextUtils.isEmpty(m14937a("ro.build.version.opporom", ""))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14942d() {
        return Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.BRAND.equalsIgnoreCase("VIVO") || !TextUtils.isEmpty(m14937a("ro.vivo.os.version", ""));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14943e() {
        if (!Build.MANUFACTURER.equalsIgnoreCase(ADBidEvent.XIAOMI)) {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase(ADBidEvent.XIAOMI) && !str.equalsIgnoreCase("REDMI")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14944f() {
        return !TextUtils.isEmpty(m14937a("ro.miui.ui.version.name", ""));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14945g() {
        return Build.MANUFACTURER.equalsIgnoreCase("BLACKSHARK") || Build.BRAND.equalsIgnoreCase("BLACKSHARK");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14946h() {
        return Build.MANUFACTURER.equalsIgnoreCase("ONEPLUS") || Build.BRAND.equalsIgnoreCase("ONEPLUS");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14947i() {
        return Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG") || Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14948j() {
        return Build.MANUFACTURER.equalsIgnoreCase("MEIZU") || Build.BRAND.equalsIgnoreCase("MEIZU") || Build.DISPLAY.toUpperCase().contains(C4492w4.OooO0Oo);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m14949k() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("LENOVO")) {
            String str = Build.BRAND;
            if (!str.equalsIgnoreCase("LENOVO") && !str.equalsIgnoreCase("ZUK")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m14950l() {
        return Build.MANUFACTURER.equalsIgnoreCase("NUBIA") || Build.BRAND.equalsIgnoreCase("NUBIA");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m14951m() {
        return Build.MANUFACTURER.equalsIgnoreCase("ASUS") || Build.BRAND.equalsIgnoreCase("ASUS");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m14952n() {
        return Build.MANUFACTURER.equalsIgnoreCase("MOTOLORA") || Build.BRAND.equalsIgnoreCase("MOTOLORA");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14953o() {
        return !TextUtils.isEmpty(m14937a("ro.build.freeme.label", ""));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m14954p() {
        return m14937a("ro.odm.manufacturer", "").equalsIgnoreCase("PRIZE");
    }
}
