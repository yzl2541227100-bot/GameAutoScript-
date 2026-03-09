package com.octopus.p222ad;

import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.utilities.UserEnvInfo;
import com.octopus.p222ad.utils.p258b.C3256g;

/* JADX INFO: loaded from: classes2.dex */
public class Octopus {

    /* JADX INFO: renamed from: a */
    private static OctopusAdSdkController f16677a;

    /* JADX INFO: renamed from: b */
    private static boolean f16678b;

    public static OctopusAdSdkController getCustomController() {
        return f16677a;
    }

    public static int getLocationDecimalDigits() {
        return UserEnvInfo.getInstance().getLocationDecimalDigits();
    }

    public static boolean getLocationEnabled() {
        return UserEnvInfo.getInstance().locationEnabled;
    }

    public static String getOaid(Context context) {
        return C3256g.m14985a(context);
    }

    public static String getSdkVersion() {
        return "1.5.8.9";
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void init(Context context, String str) {
        C3120m.m14425a().m14429a(context, str);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void init(Context context, String str, OctopusAdSdkController octopusAdSdkController) {
        f16677a = octopusAdSdkController;
        C3120m.m14425a().m14429a(context, str);
        C3120m.m14425a().m14434b(str);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void init(Context context, String str, OctopusAdSdkController octopusAdSdkController, String str2) {
        f16677a = octopusAdSdkController;
        C3120m.m14425a().m14429a(context, str);
        if ("OctopusGroup".equals(str2)) {
            C3120m.m14425a().m14430a(str);
        } else {
            C3120m.m14425a().m14434b(str);
        }
    }

    public static boolean isHttpsEnabled() {
        return C3120m.m14425a().f17181a;
    }

    public static boolean isLimitPersonalAds() {
        return f16678b;
    }

    public static void logTagInfo(String str, boolean z) {
        C3120m.m14425a().m14431a(str, z);
    }

    public static void setAppMuted(boolean z) {
        C3120m.m14425a().m14432a(z);
    }

    public static void setAppVolume(float f) {
        C3120m.m14425a().m14428a(f);
    }

    public static void setIsDownloadDirect(boolean z) {
        C3120m.m14425a().m14435b(z);
    }

    public static void setLimitPersonalAds(boolean z) {
        f16678b = z;
    }

    public static void setLocationDecimalDigits(int i) {
        UserEnvInfo.getInstance().setLocationDecimalDigits(i);
    }

    public static void setLocationEnabled(boolean z) {
        UserEnvInfo.getInstance().locationEnabled = z;
    }

    public static void useHttps(boolean z) {
        C3120m.m14425a().f17181a = z;
    }
}
