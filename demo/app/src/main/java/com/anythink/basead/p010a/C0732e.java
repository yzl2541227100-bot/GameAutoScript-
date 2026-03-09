package com.anythink.basead.p010a;

import com.anythink.basead.p010a.p012b.C0723b;
import com.anythink.basead.p010a.p012b.C0724c;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1209ab;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.res.C1380d;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.basead.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0732e {

    /* JADX INFO: renamed from: a */
    public static final String f588a = "e";

    /* JADX INFO: renamed from: b */
    private static volatile C0732e f589b;

    private C0732e() {
    }

    /* JADX INFO: renamed from: a */
    public static C0732e m247a() {
        if (f589b == null) {
            synchronized (C0732e.class) {
                if (f589b == null) {
                    f589b = new C0732e();
                }
            }
        }
        return f589b;
    }

    /* JADX INFO: renamed from: a */
    public static String m248a(int i, String str) {
        return C1380d.m4520a(C1175n.m2059a().m2148f()).m4532c(i, C1343g.m4123a(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m249a(String str, AbstractC1247l abstractC1247l, C1248m c1248m, C0723b.b bVar) {
        m251a(str, false, abstractC1247l, c1248m, bVar);
    }

    /* JADX INFO: renamed from: a */
    private static void m250a(String str, List<C1261z> list, C1209ab c1209ab) {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1248m c1248m = new C1248m();
            c1248m.f4333n = c1209ab;
            m251a(str, true, list.get(i), c1248m, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m251a(String str, boolean z, AbstractC1247l abstractC1247l, C1248m c1248m, C0723b.b bVar) {
        new C0723b(str, z, abstractC1247l, c1248m).m186a(bVar);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m252a(C1261z c1261z, int i, AbstractC1249n abstractC1249n) {
        return C0724c.m196a(c1261z, i, abstractC1249n);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m253a(C1261z c1261z, C1248m c1248m) {
        return C0724c.m197a(c1261z, c1248m);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m254a(String str, InputStream inputStream) {
        if (str == null || inputStream == null) {
            return false;
        }
        return C1380d.m4520a(C1175n.m2059a().m2148f()).m4528a(1, C1343g.m4123a(str), inputStream);
    }

    /* JADX INFO: renamed from: b */
    private static FileInputStream m255b(int i, String str) {
        return C1380d.m4520a(C1175n.m2059a().m2148f()).m4522a(i, C1343g.m4123a(str));
    }
}
