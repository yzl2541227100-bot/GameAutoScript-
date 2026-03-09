package com.anythink.expressad.p086d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p111a.p112a.C1772a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1486b {

    /* JADX INFO: renamed from: a */
    public static final String f7227a = "b";

    /* JADX INFO: renamed from: b */
    public static final int f7228b = 500;

    /* JADX INFO: renamed from: c */
    public static final String f7229c = "anythink";

    /* JADX INFO: renamed from: d */
    private static volatile C1486b f7230d;

    /* JADX INFO: renamed from: e */
    private static HashMap<String, C1489c> f7231e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private static C1483a f7232f = null;

    private C1486b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1486b m6002a() {
        if (f7230d == null) {
            synchronized (C1486b.class) {
                if (f7230d == null) {
                    f7230d = new C1486b();
                }
            }
        }
        return f7230d;
    }

    /* JADX INFO: renamed from: a */
    public static C1489c m6003a(String str, String str2) {
        C1489c c1489cM6011c = m6011c(str, str2);
        return c1489cM6011c == null ? new C1489c() : c1489cM6011c;
    }

    /* JADX INFO: renamed from: a */
    public static String m6004a(String str) {
        return str == null ? "" : m6007b().m5944R();
    }

    /* JADX INFO: renamed from: a */
    private static void m6005a(Context context, String str) {
        try {
            Map<String, ?> all = context.getSharedPreferences(C1801a.f11149o, 0).getAll();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "_")) {
                    f7231e.put(str2, C1489c.m6067b((String) all.get(str2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6006a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        C1772a.m8536a().m8544a(str4, str3);
        f7231e.put(str4, C1489c.m6067b(str3));
    }

    /* JADX INFO: renamed from: b */
    public static C1483a m6007b() {
        if (f7232f == null) {
            f7232f = m6010c();
        }
        return f7232f;
    }

    /* JADX INFO: renamed from: b */
    public static C1489c m6008b(String str, String str2) {
        C1489c c1489cM6017g = m6017g(str, str2);
        return c1489cM6017g == null ? new C1489c() : c1489cM6017g;
    }

    /* JADX INFO: renamed from: b */
    public static String m6009b(String str) {
        return C1772a.m8536a().m8543a("ivreward_".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: c */
    public static C1483a m6010c() {
        C1483a c1483a = new C1483a();
        c1483a.m5927A();
        c1483a.m5928B();
        c1483a.m5982y();
        c1483a.m5983z();
        c1483a.m5980w();
        c1483a.m5978u();
        c1483a.m5970m();
        c1483a.m5952a("anythink");
        c1483a.m5967j();
        c1483a.m5973p();
        c1483a.m5972o();
        c1483a.m5976s();
        c1483a.m5960e();
        c1483a.m5958d();
        c1483a.m5962f();
        c1483a.m5964g();
        c1483a.m5965h();
        c1483a.m5966i();
        c1483a.m5955c();
        c1483a.m5957c(C1485b.f7170df);
        c1483a.m5951a(120);
        c1483a.m5941O();
        c1483a.m5940N();
        c1483a.m5951a(100);
        c1483a.m5943Q();
        c1483a.m5961e(C1801a.f11103cH);
        c1483a.m5959d(C1801a.f11105cJ);
        c1483a.m5956c(C1801a.f11104cI);
        c1483a.m5950a();
        c1483a.m5963f(C1801a.f11110cO);
        c1483a.m5954b(10);
        return c1483a;
    }

    /* JADX INFO: renamed from: c */
    public static C1489c m6011c(String str, String str2) {
        C1489c c1489cM6017g = m6017g(str, str2);
        if (c1489cM6017g != null && c1489cM6017g.m6106k() == 0) {
            c1489cM6017g.m6107l();
        }
        return c1489cM6017g;
    }

    /* JADX INFO: renamed from: c */
    public static void m6012c(String str) {
        C1772a.m8536a().m8545b("ivreward_".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: d */
    private static C1489c m6013d(String str) {
        C1489c c1489c = new C1489c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        c1489c.m6117v();
        c1489c.m6116u();
        c1489c.m6090a(str);
        c1489c.m6091a(arrayList);
        c1489c.m6094b(arrayList2);
        c1489c.m6111p();
        c1489c.m6113r();
        c1489c.m6112q();
        c1489c.m6110o();
        c1489c.m6109n();
        c1489c.m6105j();
        c1489c.m6107l();
        c1489c.m6096c(100);
        c1489c.m6098d(0);
        c1489c.m6103h();
        c1489c.m6099e();
        c1489c.m6095c();
        c1489c.m6118w();
        c1489c.m6119x();
        return c1489c;
    }

    /* JADX INFO: renamed from: d */
    public static C1489c m6014d(String str, String str2) {
        return m6017g(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m6015e(String str, String str2) {
        C1772a.m8536a().m8544a("ivreward_".concat(String.valueOf(str)), str2);
    }

    /* JADX INFO: renamed from: f */
    private static void m6016f(String str, String str2) {
        C1772a.m8536a().m8544a(str, str2);
        C1483a c1483aM5824b = C1483a.m5824b(str2);
        f7232f = c1483aM5824b;
        if (c1483aM5824b != null) {
            c1483aM5824b.m5933G();
        }
    }

    /* JADX INFO: renamed from: g */
    private static C1489c m6017g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = C1773a.m8548c().m8558f();
        }
        String str3 = str + "_" + str2;
        if (f7231e.containsKey(str3)) {
            return f7231e.get(str3);
        }
        return null;
    }
}
