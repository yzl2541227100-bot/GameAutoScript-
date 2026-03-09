package com.anythink.china.common.p036c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.china.common.p033a.C1072e;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1344h;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.china.common.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C1080a {

    /* JADX INFO: renamed from: a */
    public static String f2499a = "a";

    /* JADX INFO: renamed from: a */
    public static String m1538a(Context context, File file) {
        if (context != null && file != null) {
            try {
                return context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1).packageName;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static void m1539a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m) throws Throwable {
        int i;
        if (TextUtils.equals(String.valueOf(c1248m.f4329j), "0") && !c1248m.f4334o) {
            if (!(abstractC1247l instanceof C1245j) || TextUtils.isEmpty(((C1245j) abstractC1247l).m3144a())) {
                String strM4134a = C1344h.m4134a(abstractC1247l);
                String strM3167F = abstractC1247l.m3167F();
                if (!TextUtils.isEmpty(strM3167F) && m1540a(context, strM3167F)) {
                    StringBuilder sb = new StringBuilder("readDownloadStatus, offerId: ");
                    sb.append(abstractC1247l.m3229t());
                    sb.append(", apk has installed");
                    abstractC1247l.m3212l(2);
                    return;
                }
                String strM1546a = C1081b.m1546a(strM4134a);
                if (new File(strM1546a + AbstractC1067a.f2406g).exists()) {
                    StringBuilder sb2 = new StringBuilder("readDownloadStatus, offerId: ");
                    sb2.append(abstractC1247l.m3229t());
                    sb2.append(", apk has download finished");
                    abstractC1247l.m3212l(5);
                    return;
                }
                File file = new File(strM1546a + ".log");
                File file2 = new File(strM1546a + AbstractC1067a.f2404e);
                if (!file.exists() || !file2.exists()) {
                    if (file.exists() || file2.exists()) {
                        StringBuilder sb3 = new StringBuilder("readDownloadStatus, offerId: ");
                        sb3.append(abstractC1247l.m3229t());
                        sb3.append(", apk download delete");
                        abstractC1247l.m3212l(8);
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder("readDownloadStatus, offerId: ");
                    sb4.append(abstractC1247l.m3229t());
                    sb4.append(", apk not downloaded 2");
                    abstractC1247l.m3212l(1);
                    return;
                }
                String strM1545a = C1081b.m1545a(file);
                if (TextUtils.isEmpty(strM1545a)) {
                    StringBuilder sb5 = new StringBuilder("readDownloadStatus, offerId: ");
                    sb5.append(abstractC1247l.m3229t());
                    sb5.append(", apk not downloaded 1");
                    abstractC1247l.m3212l(1);
                    return;
                }
                String[] strArrSplit = strM1545a.split("\\|");
                if (strArrSplit != null && strArrSplit.length == 3) {
                    String str = strArrSplit[0];
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[2];
                    try {
                        i = ((int) ((Long.parseLong(str) * 1.0f) / Long.parseLong(str2))) * 100;
                    } catch (Throwable unused) {
                        i = 0;
                    }
                    if (TextUtils.equals(str3, C1072e.a.FAIL.toString())) {
                        StringBuilder sb6 = new StringBuilder("readDownloadStatus, offerId: ");
                        sb6.append(abstractC1247l.m3229t());
                        sb6.append(", apk download failed, progress: ");
                        sb6.append(i);
                        abstractC1247l.m3212l(6);
                        return;
                    }
                    if (TextUtils.equals(str3, C1072e.a.PAUSE.toString())) {
                        StringBuilder sb7 = new StringBuilder("readDownloadStatus, offerId: ");
                        sb7.append(abstractC1247l.m3229t());
                        sb7.append(", apk download pause or stop, progress: ");
                        sb7.append(i);
                        abstractC1247l.m3212l(7);
                        return;
                    }
                    if (TextUtils.equals(str3, C1072e.a.LOADING.toString())) {
                        StringBuilder sb8 = new StringBuilder("readDownloadStatus, offerId: ");
                        sb8.append(abstractC1247l.m3229t());
                        sb8.append(", apk is downloading, progress: ");
                        sb8.append(i);
                        abstractC1247l.m3212l(4);
                        return;
                    }
                }
                StringBuilder sb9 = new StringBuilder("readDownloadStatus, offerId: ");
                sb9.append(abstractC1247l.m3229t());
                sb9.append(", unknown apk status");
                abstractC1247l.m3212l(0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1540a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m1541b(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
                context.startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1542b(Context context, File file) {
        if (context != null && file != null) {
            String strM1538a = m1538a(context, file);
            if (!TextUtils.isEmpty(strM1538a)) {
                return m1540a(context, strM1538a);
            }
        }
        return false;
    }
}
