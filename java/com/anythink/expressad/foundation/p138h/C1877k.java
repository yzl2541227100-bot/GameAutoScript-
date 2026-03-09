package com.anythink.expressad.foundation.p138h;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.china.common.C1082d;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p136h.C1865a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.k */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public final class C1877k extends C1870d {

    /* JADX INFO: renamed from: a */
    private static final String f11540a = "SameDiTool";

    /* JADX INFO: renamed from: b */
    private static String f11541b = null;

    /* JADX INFO: renamed from: c */
    private static String f11542c = null;

    /* JADX INFO: renamed from: d */
    private static int f11543d = -1;

    /* JADX INFO: renamed from: e */
    private static int f11544e = -1;

    /* JADX INFO: renamed from: f */
    private static int f11545f = -1;

    /* JADX INFO: renamed from: g */
    private static String f11546g = "";

    /* JADX INFO: renamed from: h */
    private static String f11547h = "";

    /* JADX INFO: renamed from: i */
    private static String f11548i = "";

    /* JADX INFO: renamed from: j */
    private static String f11549j = "";

    /* JADX INFO: renamed from: k */
    private static int f11550k = 0;

    /* JADX INFO: renamed from: l */
    private static String f11551l = "";

    /* JADX INFO: renamed from: m */
    private static String f11552m = "";

    /* JADX INFO: renamed from: n */
    private static int f11553n = -1;

    /* JADX INFO: renamed from: o */
    private static String f11554o = "";

    /* JADX INFO: renamed from: p */
    private static int f11555p = 0;

    /* JADX INFO: renamed from: q */
    private static String f11556q = "";

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.k$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f11557a;

        public AnonymousClass1(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1870d.m9678a(context);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.k$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f11558a;

        public AnonymousClass2(Context context) {
            this.f11558a = context;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public final void run() {
            Context context;
            ConnectivityManager connectivityManager;
            try {
                if (C1175n.m2059a().m2141c("network_type")) {
                    return;
                }
                try {
                    if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() || (context = this.f11558a) == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                        return;
                    }
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = C1877k.f11545f = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = C1877k.f11545f = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f11558a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = C1877k.f11545f = 0;
                    } else {
                        int unused4 = C1877k.f11545f = C1877k.m9691a(telephonyManager.getNetworkType());
                    }
                } catch (Exception unused5) {
                }
            } catch (Throwable th) {
                th.getMessage();
                int unused6 = C1877k.f11545f = 0;
            }
        }
    }

    private C1877k() {
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static int m9690a() {
        try {
            Context contextM2148f = C1175n.m2059a().m2148f();
            if (C1175n.m2059a().m2141c("network_type")) {
                return f11545f;
            }
            try {
                if (C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() && contextM2148f != null) {
                    if (f11545f == -1) {
                        f11545f = 0;
                        return 0;
                    }
                    try {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(contextM2148f);
                        if (C1865a.m9658b().getActiveCount() <= 0) {
                            C1865a.m9658b().execute(anonymousClass2);
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    return f11545f;
                }
                return f11545f;
            } catch (Exception unused) {
                return f11545f;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            f11545f = 0;
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9691a(int i) {
        if (i == 20) {
            return 5;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9692a(Context context, int i) {
        TelephonyManager telephonyManager;
        if (i == 0 || i == 9) {
            return "";
        }
        try {
            return (!C1801a.f11065bW || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m9693a(String str, Context context) {
        try {
        } catch (Exception e) {
            e.getMessage();
        }
        if (!TextUtils.isEmpty(f11554o)) {
            return f11554o;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f11554o = context.getPackageManager().getInstallerPackageName(str);
            new StringBuilder("PKGSource:").append(f11554o);
        }
        return f11554o;
    }

    /* JADX INFO: renamed from: a */
    private static void m9694a(String str) {
        f11542c = C1876j.m9686a(str);
        f11541b = str;
    }

    /* JADX INFO: renamed from: b */
    public static int m9696b(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    /* JADX INFO: renamed from: b */
    public static String m9697b() {
        if (C1175n.m2059a().m2141c("model")) {
            return "";
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            return Build.MANUFACTURER + C4196o4.OooO00o.OooO0Oo + Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m9698c(Context context) {
        if (context == null) {
            return f11550k;
        }
        int i = f11550k;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f11550k = i2;
            return i2;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9699c() {
        if (C1175n.m2059a().m2141c("os_vc")) {
            return "";
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            if (TextUtils.isEmpty(f11547h)) {
                f11547h = String.valueOf(m9700d());
            }
            return f11547h;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m9700d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9701d(Context context) {
        if (context == null) {
            return f11549j;
        }
        try {
            if (!TextUtils.isEmpty(f11549j)) {
                return f11549j;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f11549j = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m9702e(Context context) {
        if (C1175n.m2059a().m2141c("screen")) {
            return 0;
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapM9707g = m9707g(context);
                return mapM9707g.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapM9707g.get("width")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m9703e() {
        Context contextM2148f;
        long jCurrentTimeMillis;
        long jM9716l;
        String str;
        String str2;
        String strM9668a = "";
        try {
            contextM2148f = C1175n.m2059a().m2148f();
            jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            jM9716l = m9716l();
            str = "app_tki_" + jCurrentTimeMillis + "_" + jM9716l;
            str2 = (String) C1888v.m9864b(contextM2148f, str, "");
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("1", "");
                jSONObject.put("2", String.valueOf(jM9716l));
                jSONObject.put("3", String.valueOf(jCurrentTimeMillis));
                jSONObject.put("4", "");
                jSONObject.put("5", "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            strM9668a = C1867a.m9668a(jSONObject.toString());
            C1888v.m9861a(contextM2148f, str, strM9668a);
        } catch (Exception e3) {
            e = e3;
            strM9668a = str2;
            e.printStackTrace();
        }
        return strM9668a;
    }

    /* JADX INFO: renamed from: f */
    public static int m9704f() {
        if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
            return 0;
        }
        if (f11543d <= 0) {
            try {
                Context contextM2148f = C1175n.m2059a().m2148f();
                long jLongValue = ((Long) C1888v.m9864b(contextM2148f, "TotalRamSize", 0L)).longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - jLongValue > 1800000 || f11543d == -1) {
                    f11543d = Long.valueOf((m9716l() / 1000) / 1000).intValue();
                    C1888v.m9861a(contextM2148f, "TotalRamSize", Long.valueOf(jCurrentTimeMillis));
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return f11543d;
    }

    /* JADX INFO: renamed from: f */
    public static int m9705f(Context context) {
        if (C1175n.m2059a().m2141c("screen")) {
            return 0;
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap mapM9707g = m9707g(context);
                return mapM9707g.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapM9707g.get("height")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m9706g() {
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return 0;
            }
            Context contextM2148f = C1175n.m2059a().m2148f();
            long j = 0;
            long jLongValue = ((Long) C1888v.m9864b(contextM2148f, "FreeRamSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f11544e == -1) {
                Context contextM2148f2 = C1175n.m2059a().m2148f();
                if (contextM2148f2 != null) {
                    ActivityManager activityManager = (ActivityManager) contextM2148f2.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                }
                f11544e = Long.valueOf((j / 1000) / 1000).intValue();
                C1888v.m9861a(contextM2148f, "FreeRamSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f11544e;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap m9707g(Context context) {
        HashMap map = new HashMap();
        if (context == null) {
            return map;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            map.put("height", Integer.valueOf(displayMetrics.heightPixels));
            map.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e) {
            e.getMessage();
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static String m9708h() {
        if (TextUtils.isEmpty(f11556q)) {
            if (Build.VERSION.SDK_INT >= 21) {
                f11556q = C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? Arrays.asList(Build.SUPPORTED_ABIS).toString() : "";
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : Build.CPU_ABI);
                arrayList.add(C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? Build.CPU_ABI2 : "");
                f11556q = arrayList.toString();
            }
        }
        return f11556q;
    }

    /* JADX INFO: renamed from: h */
    public static String m9709h(Context context) {
        if (context == null) {
            return f11548i;
        }
        try {
            if (!TextUtils.isEmpty(f11548i)) {
                return f11548i;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f11548i = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m9710i() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static void m9711i(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C1870d.m9678a(context);
            } else {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.expressad.foundation.h.k.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Context f11557a;

                    public AnonymousClass1(Context context2) {
                        context = context2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1870d.m9678a(context);
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private static UUID m9712j() {
        try {
            return UUID.randomUUID();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m9713j(Context context) {
        try {
            m9709h(context);
            m9701d(context);
            m9698c(context);
            m9696b(context);
            C1801a.f11066bX = C1886t.m9830a(C1082d.f2502b, context);
            C1801a.f11065bW = C1886t.m9830a("android.permission.ACCESS_NETWORK_STATE", context);
            m9715k(context);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m9714k() {
        return f11553n;
    }

    /* JADX INFO: renamed from: k */
    private static int m9715k(Context context) {
        if (context == null) {
            return f11555p;
        }
        if (f11555p == 0) {
            try {
                f11555p = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return f11555p;
    }

    /* JADX INFO: renamed from: l */
    private static long m9716l() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) contextM2148f.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: l */
    private static void m9717l(Context context) {
        try {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
            if (C1865a.m9658b().getActiveCount() <= 0) {
                C1865a.m9658b().execute(anonymousClass2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: m */
    private static long m9718m() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) contextM2148f.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* JADX INFO: renamed from: m */
    private static boolean m9719m(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null) {
            return false;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
        } catch (Exception e) {
            e.getMessage();
        }
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 6.0d;
    }

    /* JADX INFO: renamed from: n */
    private static String m9720n() {
        return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : Arrays.asList(Build.SUPPORTED_ABIS).toString();
    }

    /* JADX INFO: renamed from: o */
    private static String m9721o() {
        return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : Build.CPU_ABI;
    }

    /* JADX INFO: renamed from: p */
    private static String m9722p() {
        return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : Build.CPU_ABI2;
    }
}
