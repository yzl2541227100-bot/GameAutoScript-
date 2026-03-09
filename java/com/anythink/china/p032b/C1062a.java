package com.anythink.china.p032b;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.anythink.china.common.C1082d;
import com.anythink.china.p030a.C1052b;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1254s;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1355s;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.anythink.china.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1062a {

    /* JADX INFO: renamed from: a */
    private static String f2338a = "";

    /* JADX INFO: renamed from: b */
    private static String f2339b = "";

    /* JADX INFO: renamed from: c */
    private static String f2340c = "";

    /* JADX INFO: renamed from: d */
    private static String f2341d = "";

    /* JADX INFO: renamed from: e */
    private static String f2342e = "";

    /* JADX INFO: renamed from: f */
    private static String f2343f = "";

    /* JADX INFO: renamed from: g */
    private static String f2344g = "";

    /* JADX INFO: renamed from: h */
    private static String f2345h = "";

    /* JADX INFO: renamed from: i */
    private static String f2346i = "";

    /* JADX INFO: renamed from: j */
    private static String f2347j;

    /* JADX INFO: renamed from: k */
    private static boolean f2348k;

    /* JADX INFO: renamed from: l */
    private static String f2349l;

    /* JADX INFO: renamed from: m */
    private static List<C1254s> f2350m;

    /* JADX INFO: renamed from: a */
    public static String m1392a() {
        return C1175n.m2059a().m2141c("mac") ? "" : f2338a;
    }

    /* JADX INFO: renamed from: a */
    public static void m1393a(final Context context) {
        List<C1254s> list;
        C1254s c1254s;
        int i = Build.VERSION.SDK_INT;
        String strM1425a = "";
        String strM4239b = C1355s.m4239b(context, C1169h.f3065p, "oaid", "");
        f2340c = strM4239b;
        if (TextUtils.isEmpty(strM4239b) && !C1175n.m2059a().m2141c("oaid") && TextUtils.isEmpty(f2340c)) {
            C1052b.m1373a(context, new InterfaceC1033a() { // from class: com.anythink.china.b.a.1
                @Override // com.anythink.china.p030a.InterfaceC1033a
                /* JADX INFO: renamed from: a */
                public final void mo1322a() {
                }

                @Override // com.anythink.china.p030a.InterfaceC1033a
                /* JADX INFO: renamed from: a */
                public final void mo1323a(String str, boolean z) {
                    if (C1062a.m1394a(str)) {
                        return;
                    }
                    String unused = C1062a.f2340c = str;
                    C1355s.m4237a(context, C1169h.f3065p, "oaid", str);
                }
            });
        }
        if (!C1175n.m2059a().m2141c("mac")) {
            strM1425a = i < 23 ? C1065d.m1425a(context) : C1065d.m1424a();
        }
        f2338a = strM1425a;
        f2339b = m1402d(context);
        f2341d = C1341e.m4091r();
        String[] strArrM1413a = C1063b.m1413a(context);
        if (strArrM1413a != null && strArrM1413a.length == 2) {
            f2342e = strArrM1413a[0];
            f2343f = strArrM1413a[1];
        }
        f2344g = C1341e.m4089q();
        f2345h = C1063b.m1412a();
        f2346i = C1063b.m1414b();
        if (f2350m == null) {
            long jLongValue = C1355s.m4232a(context, C1169h.f3065p, "det_time", (Long) 0L).longValue();
            ArrayList arrayList = new ArrayList();
            f2350m = arrayList;
            arrayList.add(new C1254s(context, jLongValue, "vivo_ver", "com.bbk.appstore"));
            if (i >= 29) {
                list = f2350m;
                c1254s = new C1254s(context, jLongValue, "oppo_ver", "com.heytap.market");
            } else {
                list = f2350m;
                c1254s = new C1254s(context, jLongValue, "oppo_ver", "com.oppo.market");
            }
            list.add(c1254s);
            f2350m.add(new C1254s(context, jLongValue, "xiaomi_ver", "com.xiaomi.market"));
            C1355s.m4236a(context, C1169h.f3065p, "det_time", System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1394a(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    /* JADX INFO: renamed from: b */
    public static String m1395b() {
        return C1175n.m2059a().m2141c("oaid") ? "" : f2340c;
    }

    /* JADX INFO: renamed from: b */
    public static String m1396b(Context context) {
        m1402d(context);
        if (!TextUtils.isEmpty(f2339b)) {
            return f2339b;
        }
        String strM1399c = m1399c(context);
        return !TextUtils.isEmpty(strM1399c) ? strM1399c : "";
    }

    /* JADX INFO: renamed from: c */
    public static String m1398c() {
        return C1175n.m2059a().m2141c("wifi_name") ? "" : C1063b.m1416c(C1175n.m2059a().m2148f());
    }

    /* JADX INFO: renamed from: c */
    public static String m1399c(final Context context) {
        if (C1175n.m2059a().m2141c("oaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(f2340c)) {
            return f2340c;
        }
        String strM4239b = C1355s.m4239b(context, C1169h.f3065p, "oaid", "");
        f2340c = strM4239b;
        if (!TextUtils.isEmpty(strM4239b)) {
            return f2340c;
        }
        final Object obj = new Object();
        final boolean[] zArr = {false};
        C1052b.m1373a(context, new InterfaceC1033a() { // from class: com.anythink.china.b.a.2
            @Override // com.anythink.china.p030a.InterfaceC1033a
            /* JADX INFO: renamed from: a */
            public final void mo1322a() {
                zArr[0] = true;
                try {
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.anythink.china.p030a.InterfaceC1033a
            /* JADX INFO: renamed from: a */
            public final void mo1323a(String str, boolean z) {
                if (!C1062a.m1394a(str)) {
                    String unused = C1062a.f2340c = str;
                    C1355s.m4237a(context, C1169h.f3065p, "oaid", str);
                }
                try {
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                } catch (Throwable unused2) {
                }
                zArr[0] = true;
            }
        });
        if (!zArr[0]) {
            try {
                synchronized (obj) {
                    obj.wait(1500L);
                }
            } catch (Exception unused) {
            }
        }
        String str = f2340c;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1400c(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    /* JADX INFO: renamed from: d */
    public static String m1401d() {
        if (C1175n.m2059a().m2141c("imsi")) {
            return "";
        }
        if (f2349l == null) {
            f2349l = C1063b.m1415b(C1175n.m2059a().m2148f());
        }
        return f2349l;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m1402d(Context context) {
        if (C1175n.m2059a().m2141c("imei")) {
            return "";
        }
        if (!f2348k && TextUtils.isEmpty(f2339b) && C1082d.m1557a(context, C1082d.f2501a)) {
            f2339b = C1064c.m1419a(context);
            f2348k = true;
        }
        return f2339b;
    }

    /* JADX INFO: renamed from: e */
    public static String m1403e() {
        return f2341d;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized String m1404e(Context context) {
        String str = f2347j;
        if (str != null) {
            return str;
        }
        try {
            f2347j = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
        }
        if (f2347j == null) {
            f2347j = "";
        }
        return f2347j;
    }

    /* JADX INFO: renamed from: f */
    public static String m1405f() {
        return C1341e.m4098u(C1175n.m2059a().m2148f());
    }

    /* JADX INFO: renamed from: g */
    public static String m1406g() {
        return f2342e;
    }

    /* JADX INFO: renamed from: h */
    public static String m1407h() {
        return f2343f;
    }

    /* JADX INFO: renamed from: i */
    public static String m1408i() {
        return f2344g;
    }

    /* JADX INFO: renamed from: j */
    public static String m1409j() {
        return f2345h;
    }

    /* JADX INFO: renamed from: k */
    public static String m1410k() {
        return f2346i;
    }

    /* JADX INFO: renamed from: l */
    public static List<C1254s> m1411l() {
        return f2350m;
    }
}
