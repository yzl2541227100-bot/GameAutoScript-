package com.anythink.core.common.p066o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.o.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1353q {

    /* JADX INFO: renamed from: a */
    private final PackageManager f5335a;

    /* JADX INFO: renamed from: com.anythink.core.common.o.q$a */
    public enum a {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public C1353q(Context context) {
        this.f5335a = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4218a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    return false;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance >= 200) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4219a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: c */
    private int m4220c(String str) {
        try {
            PackageInfo packageInfo = this.f5335a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    private String m4221d(String str) {
        try {
            PackageInfo packageInfo = this.f5335a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    private byte[] m4222e(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f5335a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new byte[0];
    }

    /* JADX INFO: renamed from: a */
    public final a m4223a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a.NOT_INSTALLED;
        }
        try {
            return this.f5335a.getApplicationInfo(str, 0).enabled ? a.ENABLED : a.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return a.NOT_INSTALLED;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m4224b(String str) {
        byte[] bArrM4222e = m4222e(str);
        if (bArrM4222e == null || bArrM4222e.length == 0) {
            return null;
        }
        return C1349m.m4199a(m4219a(bArrM4222e));
    }
}
