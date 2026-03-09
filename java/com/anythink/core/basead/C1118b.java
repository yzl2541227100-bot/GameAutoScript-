package com.anythink.core.basead;

import android.content.Context;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1355s;

/* JADX INFO: renamed from: com.anythink.core.basead.b */
/* JADX INFO: loaded from: classes.dex */
public class C1118b {

    /* JADX INFO: renamed from: a */
    private static volatile C1118b f2738a;

    private C1118b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1118b m1736a() {
        if (f2738a == null) {
            synchronized (C1118b.class) {
                if (f2738a == null) {
                    f2738a = new C1118b();
                }
            }
        }
        return f2738a;
    }

    /* JADX INFO: renamed from: a */
    public static String m1737a(Context context, String str) {
        return C1355s.m4239b(context, C1169h.f3075z, str, "");
    }

    /* JADX INFO: renamed from: a */
    public static String m1738a(C1248m c1248m) {
        return c1248m == null ? "" : m1739a(c1248m.f4321b, c1248m.f4322c, c1248m.f4325f);
    }

    /* JADX INFO: renamed from: a */
    public static String m1739a(String str, String str2, int i) {
        return str + "_" + str2 + "_" + i;
    }

    /* JADX INFO: renamed from: a */
    public static void m1740a(Context context, String str, String str2) {
        C1355s.m4237a(context, C1169h.f3075z, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m1741b(Context context, String str) {
        C1355s.m4234a(context, C1169h.f3075z, str);
    }
}
