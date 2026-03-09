package com.anythink.core.p047c;

import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.p047c.p048a.C1140d;
import com.anythink.core.p047c.p049b.C1144c;
import com.anythink.core.p072d.C1394d;
import com.anythink.core.p072d.C1396f;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C1141b {

    /* JADX INFO: renamed from: a */
    private static volatile C1141b f2856a;

    /* JADX INFO: renamed from: b */
    private final C1144c f2857b = new C1144c();

    private C1141b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1141b m1860a() {
        if (f2856a == null) {
            synchronized (C1141b.class) {
                if (f2856a == null) {
                    f2856a = new C1141b();
                }
            }
        }
        return f2856a;
    }

    /* JADX INFO: renamed from: a */
    public final C1140d m1861a(String str, C1396f c1396f, C1394d c1394d) {
        return this.f2857b.mo1870a(str, c1396f.m5097ao(), c1394d);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m1862a(String str) {
        return this.f2857b.mo1873a(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m1863a(String str, int i) {
        return this.f2857b.mo1874a(str, 4, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1864a(AbstractC1228au abstractC1228au, C1229av c1229av) {
        this.f2857b.mo1875a(abstractC1228au, c1229av);
    }

    /* JADX INFO: renamed from: a */
    public final void m1865a(String str, String str2, int i, C1229av c1229av) {
        this.f2857b.mo1876a(str, str2, i, c1229av);
    }

    /* JADX INFO: renamed from: b */
    public final void m1866b(String str) {
        this.f2857b.mo1877b(str);
    }
}
