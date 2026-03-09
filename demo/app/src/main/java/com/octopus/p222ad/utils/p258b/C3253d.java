package com.octopus.p222ad.utils.p258b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.umeng.analytics.pro.C3381c;
import java.io.File;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3253d {

    /* JADX INFO: renamed from: a */
    public static final File f17891a = m14977b(C3902g6.OoooOO0);

    /* JADX INFO: renamed from: a */
    private static File m14972a() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return null;
        }
        File file = new File(Environment.getExternalStorageDirectory(), "Octopus");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: a */
    public static final File m14973a(Context context) {
        File fileM14976b = m14976b(context);
        if (fileM14976b == null) {
            return null;
        }
        File file = new File(fileM14976b.getPath() + "/Octopus/download/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: a */
    public static void m14974a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14975a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return context.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    /* JADX INFO: renamed from: b */
    public static File m14976b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                return context.getFilesDir();
            }
            File externalFilesDir = ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) ? context.getExternalFilesDir(null) : null;
            return externalFilesDir == null ? context.getFilesDir() : externalFilesDir;
        } catch (Exception unused) {
            return context.getFilesDir();
        }
    }

    /* JADX INFO: renamed from: b */
    private static File m14977b(String str) {
        File file = new File(m14972a(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static void m14978b(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
                context.startActivity(launchIntentForPackage);
            }
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, "启动失败:" + str, 1).show();
        }
    }

    /* JADX INFO: renamed from: c */
    public static File m14979c(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            File externalCacheDir = ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) ? context.getExternalCacheDir() : null;
            return externalCacheDir == null ? context.getCacheDir() : externalCacheDir;
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir;
        }
        String str = C3381c.f18416a + context.getPackageName() + "/cache/";
        HaoboLog.m14615w(HaoboLog.storageUtilsLogTag, "Can't define system cache directory! '" + str + "%s' will be used.");
        return new File(str);
    }
}
