package com.anythink.core.common.p066o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cn.haorui.sdk.core.HRConfig;
import com.anythink.china.common.C1082d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1164c;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p055f.C1254s;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1392b;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.anythink.core.common.o.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1341e {

    /* JADX INFO: renamed from: E */
    private static String f5223E = null;

    /* JADX INFO: renamed from: F */
    private static String f5224F = null;

    /* JADX INFO: renamed from: G */
    private static String f5225G = null;

    /* JADX INFO: renamed from: H */
    private static String f5226H = null;

    /* JADX INFO: renamed from: I */
    private static String f5227I = null;

    /* JADX INFO: renamed from: J */
    private static String f5228J = null;

    /* JADX INFO: renamed from: K */
    private static String f5229K = null;

    /* JADX INFO: renamed from: L */
    private static String f5230L = null;

    /* JADX INFO: renamed from: M */
    private static String f5231M = null;

    /* JADX INFO: renamed from: N */
    private static String f5232N = null;

    /* JADX INFO: renamed from: O */
    private static String f5233O = null;

    /* JADX INFO: renamed from: P */
    private static String f5234P = null;

    /* JADX INFO: renamed from: Q */
    private static String f5235Q = null;

    /* JADX INFO: renamed from: R */
    private static String f5236R = null;

    /* JADX INFO: renamed from: S */
    private static String f5237S = null;

    /* JADX INFO: renamed from: T */
    private static String f5238T = null;

    /* JADX INFO: renamed from: U */
    private static String f5239U = null;

    /* JADX INFO: renamed from: V */
    private static String f5240V = null;

    /* JADX INFO: renamed from: W */
    private static String f5241W = null;

    /* JADX INFO: renamed from: X */
    private static String f5242X = null;

    /* JADX INFO: renamed from: a */
    public static String f5243a = null;

    /* JADX INFO: renamed from: b */
    public static String f5244b = null;

    /* JADX INFO: renamed from: d */
    public static List<C1254s> f5246d = null;

    /* JADX INFO: renamed from: e */
    public static String f5247e = null;

    /* JADX INFO: renamed from: f */
    public static final String f5248f = "unknown";

    /* JADX INFO: renamed from: g */
    private static String f5249g;

    /* JADX INFO: renamed from: h */
    private static String f5250h;

    /* JADX INFO: renamed from: k */
    private static String f5253k;

    /* JADX INFO: renamed from: l */
    private static boolean f5254l;

    /* JADX INFO: renamed from: m */
    private static int f5255m;

    /* JADX INFO: renamed from: n */
    private static boolean f5256n;

    /* JADX INFO: renamed from: o */
    private static String f5257o;

    /* JADX INFO: renamed from: i */
    private static final JSONObject f5251i = new JSONObject();

    /* JADX INFO: renamed from: j */
    private static String f5252j = null;

    /* JADX INFO: renamed from: c */
    public static String f5245c = "";

    /* JADX INFO: renamed from: p */
    private static volatile String f5258p = null;

    /* JADX INFO: renamed from: q */
    private static String f5259q = "";

    /* JADX INFO: renamed from: r */
    private static String f5260r = "";

    /* JADX INFO: renamed from: s */
    private static String f5261s = "";

    /* JADX INFO: renamed from: t */
    private static String f5262t = "";

    /* JADX INFO: renamed from: u */
    private static int f5263u = 0;

    /* JADX INFO: renamed from: v */
    private static String f5264v = "";

    /* JADX INFO: renamed from: w */
    private static String f5265w = "";

    /* JADX INFO: renamed from: x */
    private static String f5266x = null;

    /* JADX INFO: renamed from: y */
    private static String f5267y = "";

    /* JADX INFO: renamed from: z */
    private static String f5268z = "";

    /* JADX INFO: renamed from: A */
    private static int f5219A = -1;

    /* JADX INFO: renamed from: B */
    private static int f5220B = -1;

    /* JADX INFO: renamed from: C */
    private static int f5221C = -1;

    /* JADX INFO: renamed from: D */
    private static int f5222D = -1;

    /* JADX INFO: renamed from: com.anythink.core.common.o.e$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5269a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5270b;

        public AnonymousClass1(int i, String str) {
            i = i;
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C1341e.f5251i) {
                if (C1341e.f5251i.has(String.valueOf(i))) {
                    return;
                }
                try {
                    C1341e.f5251i.put(String.valueOf(i), str);
                    String unused = C1341e.f5252j = C1341e.f5251i.toString();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.o.e$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f5271a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f5272b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ExecutorService f5273c;

        public AnonymousClass2(Context context, String[] strArr, ExecutorService executorService) {
            context = context;
            strArr = strArr;
            executorService = executorService;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                    Class<?> cls2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                    strArr[0] = (String) cls2.getMethod("getId", new Class[0]).invoke(cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                } catch (Throwable unused) {
                    strArr[0] = new C1164c().m2022a(context).m2024a();
                }
            } catch (Exception unused2) {
            }
            if (!TextUtils.isEmpty(strArr[0]) && !C1341e.m4064e(strArr[0])) {
                C1341e.m4052a(strArr[0]);
            }
            try {
                synchronized (executorService) {
                    executorService.notifyAll();
                }
            } catch (Throwable unused3) {
            }
        }
    }

    private C1341e() {
    }

    /* JADX INFO: renamed from: A */
    private static int m4033A(Context context) {
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: A */
    public static String m4034A() {
        if (m4046I()) {
            return "";
        }
        if (f5235Q == null) {
            try {
                f5235Q = Build.VERSION.CODENAME;
            } catch (Throwable unused) {
                f5235Q = "";
            }
        }
        String str = f5235Q;
        if (str == null) {
            f5235Q = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5235Q;
    }

    /* JADX INFO: renamed from: B */
    private static int m4035B(Context context) {
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: renamed from: B */
    public static String m4036B() {
        if (m4046I()) {
            return "";
        }
        if (f5236R == null) {
            try {
                f5236R = Build.VERSION.INCREMENTAL;
            } catch (Throwable unused) {
                f5236R = "";
            }
        }
        String str = f5236R;
        if (str == null) {
            f5236R = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5236R;
    }

    /* JADX INFO: renamed from: C */
    private static int m4037C(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !C1345i.m4162a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return -2;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getNetworkType();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m4038C() {
        if (m4046I()) {
            return "";
        }
        if (f5237S == null) {
            try {
                f5237S = Build.SERIAL;
            } catch (Throwable unused) {
                f5237S = "";
            }
        }
        String str = f5237S;
        if (str == null) {
            f5237S = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5237S;
    }

    /* JADX INFO: renamed from: D */
    public static String m4039D() {
        if (m4046I()) {
            return "";
        }
        if (f5238T == null) {
            try {
                f5238T = Build.DISPLAY;
            } catch (Throwable unused) {
                f5238T = "";
            }
        }
        String str = f5238T;
        if (str == null) {
            f5238T = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5238T;
    }

    /* JADX INFO: renamed from: D */
    private static void m4040D(Context context) {
        if (f5246d == null) {
            long jLongValue = C1355s.m4232a(context, C1169h.f3065p, "det_hw_time", (Long) 0L).longValue();
            ArrayList arrayList = new ArrayList();
            f5246d = arrayList;
            arrayList.add(new C1254s(context, jLongValue, "hw_ver", "com.huawei.appmarket"));
            f5246d.add(new C1254s(context, jLongValue, "hw_hms_ver", "com.huawei.hwid"));
            f5246d.add(new C1254s(context, jLongValue, "honor_ver", "com.huawei.appmarket"));
            C1355s.m4236a(context, C1169h.f3065p, "det_hw_time", System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m4041E() {
        if (m4046I()) {
            return "";
        }
        if (f5239U == null) {
            try {
                f5239U = "1";
            } catch (Throwable unused) {
                f5239U = "";
            }
        }
        return f5239U;
    }

    /* JADX INFO: renamed from: E */
    private static boolean m4042E(Context context) {
        return !C1392b.m4845a(context).m4865b(C1175n.m2059a().m2165o()).m4750aq();
    }

    /* JADX INFO: renamed from: F */
    public static String m4043F() {
        if (m4046I()) {
            return "";
        }
        if (f5240V == null) {
            try {
                f5240V = Build.BOARD;
            } catch (Throwable unused) {
                f5240V = "";
            }
        }
        String str = f5240V;
        if (str == null) {
            f5240V = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5240V;
    }

    /* JADX INFO: renamed from: H */
    private static int m4045H() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: I */
    private static boolean m4046I() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        return !C1178q.m2182a(contextM2148f).m2189b() || m4042E(contextM2148f);
    }

    /* JADX INFO: renamed from: a */
    private static int m4047a(int i) {
        if (i == 20) {
            return 16;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
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
                return 13;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4048a() {
        if (C1175n.m2059a().m2141c("model")) {
            return "";
        }
        try {
            return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m4049a(Context context, String str) {
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.versionCode);
                return sb.toString();
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static void m4050a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.o.e.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f5269a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5270b;

            public AnonymousClass1(int i2, String str2) {
                i = i2;
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1341e.f5251i) {
                    if (C1341e.f5251i.has(String.valueOf(i))) {
                        return;
                    }
                    try {
                        C1341e.f5251i.put(String.valueOf(i), str);
                        String unused = C1341e.f5252j = C1341e.f5251i.toString();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }, 13, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m4051a(Context context) {
        try {
            m4059d();
            m4080l(context);
            m4076j(context);
            m4074i(context);
            m4068g(context);
            m4048a();
            m4054b();
            m4060d(context);
            m4065f();
            m4066f(context);
            m4057c();
            m4086o(context);
            if (C1345i.m4162a(C1082d.f2501a, context)) {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (C1345i.m4169b(simOperator) && simOperator.length() > 3) {
                    f5267y = simOperator.substring(0, 3);
                    f5268z = simOperator.substring(3, simOperator.length());
                }
            }
            if (f5246d == null) {
                long jLongValue = C1355s.m4232a(context, C1169h.f3065p, "det_hw_time", (Long) 0L).longValue();
                ArrayList arrayList = new ArrayList();
                f5246d = arrayList;
                arrayList.add(new C1254s(context, jLongValue, "hw_ver", "com.huawei.appmarket"));
                f5246d.add(new C1254s(context, jLongValue, "hw_hms_ver", "com.huawei.hwid"));
                f5246d.add(new C1254s(context, jLongValue, "honor_ver", "com.huawei.appmarket"));
                C1355s.m4236a(context, C1169h.f3065p, "det_hw_time", System.currentTimeMillis());
            }
            m4089q();
            m4091r();
            m4102w(context);
            m4104x(context);
            m4093s();
            m4096t();
            m4097u();
            m4099v();
            m4101w();
            m4103x();
            m4105y();
            m4107z();
            m4034A();
            m4036B();
            m4038C();
            m4039D();
            m4041E();
            m4043F();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4052a(String str) {
        f5250h = str;
        C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.f3068s, f5250h);
    }

    /* JADX INFO: renamed from: b */
    public static int m4053b(String str) {
        int i = f5222D;
        if (i != -1) {
            return i;
        }
        f5222D = 0;
        try {
            f5222D = ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(m4056c(str), new Object[0])).intValue();
        } catch (Throwable unused) {
        }
        return f5222D;
    }

    /* JADX INFO: renamed from: b */
    public static String m4054b() {
        if (C1175n.m2059a().m2141c("brand")) {
            return "";
        }
        try {
            return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m4055b(Context context) {
        if (C1175n.m2059a().m2141c("mcc")) {
            return "";
        }
        if (context == null) {
            C1175n.m2059a().m2148f();
        }
        try {
            return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : f5267y;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m4056c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, C1175n.m2059a().m2148f(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m4057c() {
        if (C1175n.m2059a().m2141c("timezone")) {
            return "";
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            try {
                if (TextUtils.isEmpty(f5265w)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    f5265w = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return f5265w;
        } catch (Exception unused2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m4058c(Context context) {
        if (C1175n.m2059a().m2141c("mnc")) {
            return "";
        }
        if (context == null) {
            C1175n.m2059a().m2148f();
        }
        try {
            return !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b() ? "" : f5268z;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m4059d() {
        if (C1175n.m2059a().m2141c("os_vc")) {
            return "";
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            if (TextUtils.isEmpty(f5260r)) {
                f5260r = String.valueOf(Build.VERSION.SDK_INT);
            }
            return f5260r;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m4060d(Context context) {
        if (C1175n.m2059a().m2141c("android_id")) {
            return "";
        }
        if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
            return "";
        }
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b != null) {
            if (context == null) {
                context = C1175n.m2059a().m2148f();
            }
            if (f5257o == null) {
                f5257o = C1355s.m4239b(context, C1169h.f3065p, C1169h.f3071v, "");
            }
            if (!TextUtils.isEmpty(f5257o)) {
                return f5257o;
            }
            String aid = iExHandlerM2132b.getAid(context);
            f5257o = aid;
            if (!TextUtils.isEmpty(aid)) {
                C1355s.m4237a(context, C1169h.f3065p, C1169h.f3071v, f5257o);
                return f5257o;
            }
        } else {
            f5257o = "";
        }
        return f5257o;
    }

    /* JADX INFO: renamed from: e */
    public static String m4062e() {
        if (C1175n.m2059a().m2141c("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f5259q)) {
            f5259q = Build.VERSION.RELEASE;
        }
        return f5259q;
    }

    /* JADX INFO: renamed from: e */
    public static String m4063e(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String strM4060d = m4060d(context);
            if (TextUtils.isEmpty(strM4060d)) {
                return "";
            }
            if (TextUtils.isEmpty(f5247e)) {
                f5247e = C1343g.m4125b(strM4060d);
            }
        } catch (Throwable unused) {
        }
        return f5247e;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m4064e(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    /* JADX INFO: renamed from: f */
    public static String m4065f() {
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            if (f5250h == null) {
                f5250h = C1355s.m4239b(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.f3068s, "");
            }
            return f5250h;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m4066f(Context context) {
        if (C1175n.m2059a().m2141c("language")) {
            return "";
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            if (!TextUtils.isEmpty(f5264v)) {
                return f5264v;
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            f5264v = language;
            return language;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m4067f(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    /* JADX INFO: renamed from: g */
    public static int m4068g(Context context) {
        if (C1175n.m2059a().m2141c("orient")) {
            return 0;
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        return context.getResources().getConfiguration().orientation == 2 ? 2 : 1;
    }

    /* JADX INFO: renamed from: g */
    public static String m4069g() {
        if (C1175n.m2059a().m2132b() == null) {
            return "";
        }
        try {
            return new BigDecimal((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000.0d).setScale(6, 4).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m4070g(String str) {
        return C1175n.m2059a().m2141c(str) || !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b();
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m4071h() {
        try {
            return new JSONObject(f5252j);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4072h(Context context) {
        return m4068g(context) == 2;
    }

    /* JADX INFO: renamed from: i */
    public static synchronized String m4073i() {
        if (C1175n.m2059a().m2141c("ua")) {
            return "";
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            if (!TextUtils.isEmpty(f5258p)) {
                return f5258p;
            }
            if (f5258p == null) {
                String strM4239b = C1355s.m4239b(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.f3055f, "");
                f5258p = strM4239b;
                if (!TextUtils.isEmpty(strM4239b)) {
                    return f5258p;
                }
            }
            String str = Build.VERSION.RELEASE;
            String strM4048a = m4048a();
            String str2 = Build.ID;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strM4048a) || TextUtils.isEmpty(str2)) {
                return "";
            }
            return "Mozilla/5.0 (Linux; Android " + str + "; " + strM4048a + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m4074i(Context context) {
        if (C1175n.m2059a().m2141c("app_vc")) {
            return "";
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        if (f5263u != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f5263u);
            return sb.toString();
        }
        try {
            f5263u = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f5263u);
            return sb2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m4075j() {
        if (!TextUtils.isEmpty(f5245c)) {
            return f5245c;
        }
        String strM2101G = C1175n.m2059a().m2101G();
        if (!TextUtils.isEmpty(strM2101G)) {
            f5245c = strM2101G;
            return strM2101G;
        }
        String strM2101G2 = C1175n.m2059a().m2101G();
        if (TextUtils.isEmpty(strM2101G2)) {
            try {
                Class.forName("com.unity3d.player.UnityPlayer");
                strM2101G2 = "2";
            } catch (Throwable unused) {
                strM2101G2 = "1";
            }
            try {
                Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                strM2101G2 = "4";
            } catch (Throwable unused2) {
            }
        }
        f5245c = strM2101G2;
        return strM2101G2;
    }

    /* JADX INFO: renamed from: j */
    public static String m4076j(Context context) {
        if (C1175n.m2059a().m2141c("app_vn")) {
            return "";
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        try {
            if (!TextUtils.isEmpty(f5262t)) {
                return f5262t;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f5262t = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m4077k() {
        if (f5220B == -1) {
            if (TextUtils.isEmpty(m4079l())) {
                f5220B = 0;
            } else {
                try {
                    Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                    Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                    f5220B = 1;
                } catch (Throwable unused) {
                    f5220B = 0;
                }
            }
        }
        return f5220B;
    }

    /* JADX INFO: renamed from: k */
    public static String m4078k(Context context) {
        if (C1175n.m2059a().m2141c("screen")) {
            return "";
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append((context == null ? C1175n.m2059a().m2148f() : context).getResources().getDisplayMetrics().widthPixels);
            sb.append(Marker.ANY_MARKER);
            if (context == null) {
                context = C1175n.m2059a().m2148f();
            }
            sb.append(context.getResources().getDisplayMetrics().heightPixels);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m4079l() {
        Object obj;
        String strM2139c = C1175n.m2059a().m2139c();
        if (!TextUtils.isEmpty(strM2139c)) {
            return strM2139c;
        }
        try {
            Map<String, Object> mapM2159l = C1175n.m2059a().m2159l();
            if (mapM2159l == null || (obj = mapM2159l.get(ATAdConst.KEY.WECHAT_APPID)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m4080l(Context context) {
        if (C1175n.m2059a().m2141c("package_name")) {
            return "";
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        try {
            if (!TextUtils.isEmpty(f5261s)) {
                return f5261s;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f5261s = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m4081m() {
        int i = f5221C;
        if (i != -1) {
            return i;
        }
        f5221C = 0;
        try {
            f5221C = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return f5221C;
    }

    /* JADX INFO: renamed from: m */
    public static String m4082m(Context context) {
        if (C1175n.m2059a().m2141c("it_src")) {
            return "";
        }
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        try {
            if (!TextUtils.isEmpty(f5243a)) {
                return f5243a;
            }
            String installerPackageName = context.getPackageManager().getInstallerPackageName(m4080l(context));
            f5243a = installerPackageName;
            return installerPackageName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m4083n(Context context) {
        NetworkInfo activeNetworkInfo;
        if (C1175n.m2059a().m2141c("network_type")) {
            return "";
        }
        try {
            if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                return "";
            }
            if (context == null) {
                return HRConfig.GENDER_UNKNOWN;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || !C1345i.m4162a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return HRConfig.GENDER_UNKNOWN;
                }
                int i = 1;
                if (activeNetworkInfo.getType() == 1) {
                    return "-2";
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return HRConfig.GENDER_UNKNOWN;
                }
                int networkType = telephonyManager.getNetworkType();
                StringBuilder sb = new StringBuilder();
                if (networkType != 20) {
                    switch (networkType) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i = 3;
                            break;
                        case 13:
                            i = 13;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 16;
                }
                sb.append(i);
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return HRConfig.GENDER_UNKNOWN;
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static List<C1254s> m4084n() {
        return f5246d;
    }

    /* JADX INFO: renamed from: o */
    public static String m4085o() {
        if (C1175n.m2059a().m2141c("amazon_id") || !C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
            return "";
        }
        if (f5253k == null) {
            f5253k = C1355s.m4239b(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.f3069t, "");
        }
        if (TextUtils.isEmpty(f5253k) && !f5254l) {
            try {
                f5254l = true;
                String string = Settings.Secure.getString(C1175n.m2059a().m2148f().getContentResolver(), "advertising_id");
                f5253k = string;
                if (TextUtils.isEmpty(string)) {
                    f5253k = "";
                } else {
                    C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.f3069t, f5253k);
                }
            } catch (Throwable unused) {
            }
        }
        return f5253k;
    }

    /* JADX INFO: renamed from: o */
    public static String m4086o(Context context) {
        String str = f5266x;
        if (str != null) {
            if (str == null) {
                f5266x = "";
            }
            return f5266x;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
            f5266x = str2;
            if (str2 == null) {
                f5266x = "";
            }
            return f5266x;
        } catch (Exception unused) {
            f5266x = "";
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m4087p() {
        if (!C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
            return -1;
        }
        if (f5255m <= 0 && !f5256n) {
            try {
                f5256n = true;
                f5255m = Settings.Secure.getInt(C1175n.m2059a().m2148f().getContentResolver(), "limit_ad_tracking") != 0 ? 2 : 1;
            } catch (Throwable unused) {
                f5255m = -1;
            }
        }
        return f5255m;
    }

    /* JADX INFO: renamed from: p */
    public static String m4088p(Context context) {
        if (C1175n.m2059a().m2132b() == null) {
            return "";
        }
        if (TextUtils.isEmpty(f5244b)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            f5244b = String.valueOf(displayMetrics.density);
        }
        return f5244b;
    }

    /* JADX INFO: renamed from: q */
    public static String m4089q() {
        if (m4070g("cpu")) {
            return "";
        }
        if (f5223E == null) {
            f5223E = C1347k.m4180b();
        }
        return f5223E;
    }

    /* JADX INFO: renamed from: q */
    public static void m4090q(Context context) {
        String userAgentString;
        if (C1175n.m2059a().m2141c("ua")) {
            return;
        }
        try {
            if (C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
                if (TextUtils.isEmpty(f5258p)) {
                    f5258p = C1355s.m4239b(context, C1169h.f3065p, C1169h.f3055f, "");
                }
                String strM4239b = C1355s.m4239b(context, C1169h.f3065p, C1169h.f3056g, "");
                if (TextUtils.isEmpty(f5258p) || !Build.VERSION.RELEASE.equals(strM4239b)) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        TextUtils.isEmpty(f5258p);
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        userAgentString = WebSettings.getDefaultUserAgent(context);
                    } else {
                        WebView webView = new WebView(context);
                        C1344h.m4138a(webView);
                        userAgentString = webView.getSettings().getUserAgentString();
                    }
                    f5258p = userAgentString;
                    C1355s.m4237a(context, C1169h.f3065p, C1169h.f3055f, f5258p);
                    C1355s.m4237a(context, C1169h.f3065p, C1169h.f3056g, Build.VERSION.RELEASE);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static String m4091r() {
        if (m4070g("isroot")) {
            return "";
        }
        if (f5224F == null) {
            f5224F = C1347k.m4177a();
        }
        return f5224F;
    }

    /* JADX INFO: renamed from: r */
    public static synchronized void m4092r(Context context) {
        if (TextUtils.isEmpty(C1175n.m2059a().m2177x())) {
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            String uniqueId = iExHandlerM2132b != null ? iExHandlerM2132b.getUniqueId(context) : "";
            if (TextUtils.isEmpty(uniqueId)) {
                uniqueId = m4094s(context);
            }
            if (TextUtils.isEmpty(uniqueId) || Pattern.matches("^[0-]+$", uniqueId)) {
                uniqueId = m4060d(context);
            }
            if (TextUtils.isEmpty(uniqueId)) {
                uniqueId = UUID.randomUUID().toString();
            }
            C1175n.m2059a().m2160l(C1343g.m4123a(uniqueId));
            C1322e.m3915a("", "3", "", String.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m4093s() {
        if (m4070g(C1275c.f4669aF)) {
            return "";
        }
        if (f5227I == null) {
            f5227I = C1345i.m4158a() ? "1" : "0";
        }
        return f5227I;
    }

    /* JADX INFO: renamed from: s */
    public static synchronized String m4094s(Context context) {
        if (C1175n.m2059a().m2141c("gaid")) {
            return "";
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        String[] strArr = new String[1];
        executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: com.anythink.core.common.o.e.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f5271a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String[] f5272b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ExecutorService f5273c;

            public AnonymousClass2(Context context2, String[] strArr2, ExecutorService executorServiceNewFixedThreadPool2) {
                context = context2;
                strArr = strArr2;
                executorService = executorServiceNewFixedThreadPool2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                        Class<?> cls2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                        strArr[0] = (String) cls2.getMethod("getId", new Class[0]).invoke(cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                    } catch (Throwable unused) {
                        strArr[0] = new C1164c().m2022a(context).m2024a();
                    }
                } catch (Exception unused2) {
                }
                if (!TextUtils.isEmpty(strArr[0]) && !C1341e.m4064e(strArr[0])) {
                    C1341e.m4052a(strArr[0]);
                }
                try {
                    synchronized (executorService) {
                        executorService.notifyAll();
                    }
                } catch (Throwable unused3) {
                }
            }
        });
        try {
            synchronized (executorServiceNewFixedThreadPool2) {
                executorServiceNewFixedThreadPool2.wait(C1659a.f9130f);
            }
            executorServiceNewFixedThreadPool2.shutdown();
            if (strArr2[0] == null) {
                return "";
            }
            return strArr2[0];
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m4095t(Context context) {
        if (f5219A == -1) {
            f5219A = C1345i.m4160a(context, C1801a.f11045bC) ? 1 : 0;
        }
        return f5219A;
    }

    /* JADX INFO: renamed from: t */
    public static String m4096t() {
        if (m4046I()) {
            return "";
        }
        if (f5228J == null) {
            try {
                f5228J = Build.TYPE;
            } catch (Throwable unused) {
            }
        }
        String str = f5228J;
        if (str == null) {
            f5228J = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5228J;
    }

    /* JADX INFO: renamed from: u */
    public static String m4097u() {
        if (m4046I()) {
            return "";
        }
        if (TextUtils.isEmpty(f5229K)) {
            try {
                f5229K = Build.TAGS;
            } catch (Throwable unused) {
            }
        }
        String str = f5229K;
        if (str == null) {
            f5229K = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5229K;
    }

    /* JADX INFO: renamed from: u */
    public static String m4098u(Context context) {
        return m4070g("isagent") ? "" : C1347k.m4178a(context);
    }

    /* JADX INFO: renamed from: v */
    public static String m4099v() {
        if (m4046I()) {
            return "";
        }
        if (f5230L == null) {
            try {
                f5230L = Build.USER;
            } catch (Throwable unused) {
                f5230L = "";
            }
        }
        String str = f5230L;
        if (str == null) {
            f5230L = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5230L;
    }

    /* JADX INFO: renamed from: v */
    public static String m4100v(Context context) {
        return m4042E(context) ? "" : C1347k.m4182c(context);
    }

    /* JADX INFO: renamed from: w */
    public static String m4101w() {
        if (m4046I()) {
            return "";
        }
        if (f5231M == null) {
            try {
                f5231M = Build.RADIO;
            } catch (Throwable unused) {
                f5231M = "";
            }
        }
        String str = f5231M;
        if (str == null) {
            f5231M = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5231M;
    }

    /* JADX INFO: renamed from: w */
    public static String m4102w(Context context) {
        if (f5225G == null) {
            f5225G = C1347k.m4183d(context);
        }
        return f5225G;
    }

    /* JADX INFO: renamed from: x */
    public static String m4103x() {
        if (m4046I()) {
            return "";
        }
        if (f5232N == null) {
            try {
                f5232N = Build.BOOTLOADER;
            } catch (Throwable unused) {
                f5232N = "";
            }
        }
        String str = f5232N;
        if (str == null) {
            f5232N = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5232N;
    }

    /* JADX INFO: renamed from: x */
    public static String m4104x(Context context) {
        if (f5226H == null) {
            f5226H = C1347k.m4184e(context);
        }
        return f5226H;
    }

    /* JADX INFO: renamed from: y */
    public static String m4105y() {
        if (m4046I()) {
            return "";
        }
        if (f5233O == null) {
            try {
                f5233O = Build.HARDWARE;
            } catch (Throwable unused) {
                f5233O = "";
            }
        }
        String str = f5233O;
        if (str == null) {
            f5233O = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5233O;
    }

    /* JADX INFO: renamed from: y */
    public static String m4106y(Context context) {
        return C1347k.m4181b(context);
    }

    /* JADX INFO: renamed from: z */
    public static String m4107z() {
        if (m4046I()) {
            return "";
        }
        if (f5234P == null) {
            try {
                f5234P = Build.HOST;
            } catch (Throwable unused) {
                f5234P = "";
            }
        }
        String str = f5234P;
        if (str == null) {
            f5234P = "";
        } else if ("unknown".equals(str)) {
            return "";
        }
        return f5234P;
    }

    /* JADX INFO: renamed from: z */
    public static String m4108z(Context context) {
        return m4070g("battery") ? "" : C1347k.m4185f(context);
    }
}
