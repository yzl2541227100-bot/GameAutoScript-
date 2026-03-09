package com.anythink.expressad.videocommon.p177a;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.videocommon.p181e.C2337a;
import com.anythink.expressad.videocommon.p181e.C2339c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C2315a {

    /* JADX INFO: renamed from: a */
    public static final int f14362a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f14363b = 2;

    /* JADX INFO: renamed from: c */
    private static final String f14364c = "com.anythink.expressad.videocommon.a.a";

    /* JADX INFO: renamed from: d */
    private static C2315a f14365d;

    private C2315a() {
        try {
            C1175n.m2059a().m2148f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2315a m11764a() {
        if (f14365d == null) {
            synchronized (C2315a.class) {
                if (f14365d == null) {
                    f14365d = new C2315a();
                }
            }
        }
        return f14365d;
    }

    /* JADX INFO: renamed from: a */
    public static List<C1781c> m11765a(List<C1781c> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            C2337a c2337aM12002b = C2339c.m11994a().m12002b();
            long jM11985c = c2337aM12002b != null ? c2337aM12002b.m11985c() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (list == null || list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (C1781c c1781c : list) {
                    if (c1781c != null) {
                        long jM8899o = c1781c.m8899o() * 1000;
                        long jM10153bg = jCurrentTimeMillis - c1781c.m10153bg();
                        if ((jM8899o > 0 && jM8899o >= jM10153bg) || (jM8899o <= 0 && jM11985c >= jM10153bg)) {
                            arrayList2.add(c1781c);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m11766a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11767a(C1781c c1781c) {
        try {
            C2337a c2337aM12002b = C2339c.m11994a().m12002b();
            long jM11985c = c2337aM12002b != null ? c2337aM12002b.m11985c() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1781c != null) {
                long jM8899o = c1781c.m8899o() * 1000;
                long jM10153bg = jCurrentTimeMillis - c1781c.m10153bg();
                if (jM8899o > 0 && jM8899o >= jM10153bg) {
                    return false;
                }
                if (jM8899o <= 0 && jM11985c >= jM10153bg) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m11768b() {
    }

    /* JADX INFO: renamed from: c */
    private static void m11769c() {
    }

    /* JADX INFO: renamed from: d */
    private static void m11770d() {
    }

    /* JADX INFO: renamed from: e */
    private static void m11771e() {
    }

    /* JADX INFO: renamed from: f */
    private static void m11772f() {
    }
}
