package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.C3489e;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.t */
/* JADX INFO: loaded from: classes2.dex */
public class C3469t {

    /* JADX INFO: renamed from: a */
    public static final String f18908a = "UM_PROBE_DATA";

    /* JADX INFO: renamed from: b */
    public static final String f18909b = "_dsk_s";

    /* JADX INFO: renamed from: c */
    public static final String f18910c = "_thm_z";

    /* JADX INFO: renamed from: d */
    public static final String f18911d = "_gdf_r";

    /* JADX INFO: renamed from: e */
    private static Object f18912e = new Object();

    /* JADX INFO: renamed from: a */
    public static String m16028a() {
        boolean zM16031a;
        try {
            zM16031a = m16031a("ls /sys/class/thermal", "thermal_zone");
        } catch (IOException unused) {
            zM16031a = false;
        }
        return zM16031a ? "thermal_zone" : "unknown";
    }

    /* JADX INFO: renamed from: a */
    public static String m16029a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18908a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f18912e) {
                jSONObject.put(f18909b, sharedPreferences.getString(f18909b, ""));
                jSONObject.put(f18910c, sharedPreferences.getString(f18910c, ""));
                jSONObject.put(f18911d, sharedPreferences.getString(f18911d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            C3454e.m15904a(context, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16031a(String str, String str2) throws IOException {
        boolean z;
        Process processExec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                z = false;
                break;
            }
            if (line.contains(str2)) {
                z = true;
                break;
            }
        }
        try {
            processExec.waitFor();
        } catch (InterruptedException unused) {
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static String m16032b() {
        boolean zM16031a;
        try {
            zM16031a = m16031a("ls /", "goldfish");
        } catch (IOException unused) {
            zM16031a = false;
        }
        return zM16031a ? "goldfish" : "unknown";
    }

    /* JADX INFO: renamed from: b */
    public static void m16033b(final Context context) {
        if (m16036c(context)) {
            return;
        }
        final String[] strArr = {"unknown", "unknown", "unknown"};
        new Thread() { // from class: com.umeng.commonsdk.proguard.t.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                strArr[0] = C3469t.m16035c();
                strArr[1] = C3469t.m16028a();
                strArr[2] = C3469t.m16032b();
                C3489e.m16338c("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                C3469t.m16034b(context, strArr);
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m16034b(Context context, String[] strArr) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f18908a, 0)) == null) {
            return;
        }
        synchronized (f18912e) {
            sharedPreferences.edit().putString(f18909b, strArr[0]).putString(f18910c, strArr[1]).putString(f18911d, strArr[2]).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m16035c() {
        BufferedReader bufferedReader;
        String str = "unknown";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/diskstats"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.contains("mmcblk")) {
                        str = "mmcblk";
                        break;
                    }
                    if (line.contains("sda")) {
                        str = "sda";
                        break;
                    }
                    if (line.contains("mtd")) {
                        str = "mtd";
                        break;
                    }
                } catch (Exception unused) {
                    bufferedReader2 = bufferedReader;
                    bufferedReader = bufferedReader2;
                }
            }
        } catch (Exception unused2) {
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Throwable unused3) {
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16036c(Context context) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f18908a, 0)) == null || TextUtils.isEmpty(sharedPreferences.getString(f18909b, ""))) ? false : true;
    }
}
