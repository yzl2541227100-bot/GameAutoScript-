package com.octopus.p222ad.utils.p258b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.octopus.p222ad.internal.utilities.SPUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.l */
/* JADX INFO: loaded from: classes2.dex */
public class C3261l {

    /* JADX INFO: renamed from: a */
    private static String f17909a = "SystemUtil";

    /* JADX INFO: renamed from: a */
    public static long m14998a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m14999a() {
        return (new File("/system/bin/su").exists() && m15001a("/system/bin/su")) ? "yes" : (new File("/system/xbin/su").exists() && m15001a("/system/xbin/su")) ? "yes" : "no";
    }

    /* JADX INFO: renamed from: a */
    public static String m15000a(Context context, String str) {
        try {
            PackageInfo packageInfoM15002b = m15002b(context, str);
            if (packageInfoM15002b == null) {
                return null;
            }
            return String.valueOf(packageInfoM15002b.versionCode);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m15001a(String str) {
        Process processExec = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("ls -l " + str);
                String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
                if (line != null && line.length() >= 4) {
                    char cCharAt = line.charAt(3);
                    if (cCharAt == 's' || cCharAt == 'x') {
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return true;
                    }
                }
                if (processExec == null) {
                    return false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (processExec == null) {
                    return false;
                }
            }
            processExec.destroy();
            return false;
        } catch (Throwable th) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static PackageInfo m15002b(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 128);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15003b() {
        try {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                return "";
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            return (statFs.getBlockCount() * blockSize) + "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15004b(Context context) {
        String string = SPUtils.getString(context, "codeList");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: c */
    public static long m15005c() {
        long jCurrentTimeMillis;
        Long lValueOf = 0L;
        switch (Calendar.getInstance().get(7)) {
            case 1:
            case 2:
            case 4:
            case 6:
                jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                break;
            case 3:
            case 5:
            case 7:
                jCurrentTimeMillis = System.currentTimeMillis();
                break;
            default:
                return lValueOf.longValue();
        }
        lValueOf = Long.valueOf(jCurrentTimeMillis);
        return lValueOf.longValue();
    }

    /* JADX INFO: renamed from: c */
    public static long m15006c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15007c(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || str == null || str.isEmpty()) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* JADX INFO: renamed from: d */
    public static String m15008d(Context context) {
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: e */
    public static String m15009e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m15010f(Context context) {
        String str;
        try {
            str = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        return TextUtils.isEmpty(str) ? m15008d(context) : str;
    }

    /* JADX INFO: renamed from: g */
    public static String m15011g(Context context) {
        return String.valueOf(context.getResources().getDisplayMetrics().widthPixels);
    }

    /* JADX INFO: renamed from: h */
    public static String m15012h(Context context) {
        return String.valueOf(context.getResources().getDisplayMetrics().heightPixels);
    }

    /* JADX INFO: renamed from: i */
    public static String m15013i(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? "2" : "1";
    }

    /* JADX INFO: renamed from: j */
    public static String m15014j(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (Build.VERSION.SDK_INT < 16) {
                return "";
            }
            return memoryInfo.totalMem + "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m15015k(Context context) {
        String strM15000a = m15000a(context, "com.huawei.appmarket");
        return strM15000a == null ? "" : strM15000a;
    }

    /* JADX INFO: renamed from: l */
    public static String m15016l(Context context) {
        String strM15000a = m15000a(context, "com.huawei.hwid");
        return strM15000a == null ? "" : strM15000a;
    }
}
