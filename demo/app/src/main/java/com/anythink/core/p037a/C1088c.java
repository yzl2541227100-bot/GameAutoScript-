package com.anythink.core.p037a;

import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;

/* JADX INFO: renamed from: com.anythink.core.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1088c {

    /* JADX INFO: renamed from: a */
    private static C1088c f2519a;

    /* JADX INFO: renamed from: b */
    private final String f2520b = "pacing_";

    /* JADX INFO: renamed from: a */
    public static C1088c m1577a() {
        if (f2519a == null) {
            f2519a = new C1088c();
        }
        return f2519a;
    }

    /* JADX INFO: renamed from: a */
    public static void m1578a(String str) {
        try {
            C1355s.m4236a(C1175n.m2059a().m2148f(), C1169h.f3065p, "pacing_".concat(String.valueOf(str)), System.currentTimeMillis());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1579a(String str, C1396f c1396f) {
        if (c1396f == null) {
            return true;
        }
        if (c1396f.m5096an() == -1) {
            return false;
        }
        long jLongValue = C1355s.m4232a(C1175n.m2059a().m2148f(), C1169h.f3065p, "pacing_".concat(String.valueOf(str)), (Long) 0L).longValue();
        if (System.currentTimeMillis() - jLongValue >= 0) {
            return System.currentTimeMillis() - jLongValue < c1396f.m5096an();
        }
        m1578a(str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m1580a(final String str, final String str2) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1355s.m4236a(C1175n.m2059a().m2148f(), C1169h.f3065p, "pacing_" + str + "_" + str2, System.currentTimeMillis());
                } catch (Exception unused) {
                }
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1581a(String str, C1229av c1229av) {
        if (c1229av == null) {
            return true;
        }
        if (c1229av.m2840t() == -1) {
            return false;
        }
        long jLongValue = C1355s.m4232a(C1175n.m2059a().m2148f(), C1169h.f3065p, "pacing_" + str + "_" + c1229av.m2842u(), (Long) 0L).longValue();
        if (System.currentTimeMillis() - jLongValue >= 0) {
            return System.currentTimeMillis() - jLongValue < c1229av.m2840t();
        }
        m1580a(str, c1229av.m2842u());
        return false;
    }
}
