package com.iflytek.voiceads.utils;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.ActivityChooserModel;
import java.util.List;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2984b {
    /* JADX INFO: renamed from: a */
    public static Rect m13531a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13532a(Context context) {
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return true;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName)) {
                return runningAppProcessInfo.importance != 100;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13533a(Context context, Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "deviceCanHandleIntent:" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13534a(Context context, View view) {
        Rect rectM13538c = m13538c(context);
        Rect rectM13531a = m13531a(view);
        int i = (int) (((double) (rectM13531a.bottom - rectM13531a.top)) * 0.3d);
        Rect rect = new Rect(rectM13538c.left, rectM13538c.top + i, rectM13538c.right, rectM13538c.bottom - i);
        return Rect.intersects(rect, rectM13531a) || rect.contains(rectM13531a);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13535a(Context context, String str) {
        try {
            if (context.getPackageManager().getPackageArchiveInfo(str, 1) != null) {
                C2989g.m13557b("IFLY_AD_SDK", "checkUninstallApk info not null");
                return true;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "checkUninstallApk error:" + e.getMessage());
        }
        C2989g.m13557b("IFLY_AD_SDK", "checkUninstallApk info is null");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13536a(String str) {
        return (TextUtils.isEmpty(str) || str.startsWith("http:") || str.startsWith("https:")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13537b(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    /* JADX INFO: renamed from: c */
    public static Rect m13538c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        return new Rect(0, 0, defaultDisplay.getWidth(), defaultDisplay.getHeight());
    }
}
