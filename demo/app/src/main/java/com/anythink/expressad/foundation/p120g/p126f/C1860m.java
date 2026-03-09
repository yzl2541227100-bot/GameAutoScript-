package com.anythink.expressad.foundation.p120g.p126f;

import android.content.Context;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p120g.p126f.p130d.C1834b;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1860m {

    /* JADX INFO: renamed from: c */
    private static C1860m f11462c;

    /* JADX INFO: renamed from: a */
    private C1857j f11463a;

    /* JADX INFO: renamed from: b */
    private C1834b f11464b;

    private C1860m() {
    }

    /* JADX INFO: renamed from: a */
    public static C1834b m9637a() {
        C1834b c1834b;
        C1860m c1860m = f11462c;
        if (c1860m == null) {
            c1860m = new C1860m();
            f11462c = c1860m;
            if (c1860m.f11464b == null) {
                c1834b = new C1834b(m9640b());
            }
            return f11462c.f11464b;
        }
        C1834b c1834b2 = c1860m.f11464b;
        if (c1834b2 != null) {
            return c1834b2;
        }
        c1834b = new C1834b(m9640b());
        c1860m.f11464b = c1834b;
        return f11462c.f11464b;
    }

    /* JADX INFO: renamed from: a */
    public static void m9638a(Context context) {
        if (f11462c == null) {
            C1860m c1860m = new C1860m();
            f11462c = c1860m;
            c1860m.f11463a = new C1857j(context.getApplicationContext());
            f11462c.f11464b = new C1834b(m9640b());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9639a(AbstractC1856i abstractC1856i) {
        m9640b().m9631a(abstractC1856i);
    }

    /* JADX INFO: renamed from: b */
    private static C1857j m9640b() {
        C1857j c1857j;
        C1860m c1860m = f11462c;
        if (c1860m == null) {
            c1860m = new C1860m();
            f11462c = c1860m;
            if (c1860m.f11463a == null) {
                c1857j = new C1857j(C1175n.m2059a().m2148f());
            }
            return f11462c.f11463a;
        }
        C1857j c1857j2 = c1860m.f11463a;
        if (c1857j2 != null) {
            return c1857j2;
        }
        c1857j = new C1857j(C1175n.m2059a().m2148f());
        c1860m.f11463a = c1857j;
        return f11462c.f11463a;
    }

    /* JADX INFO: renamed from: c */
    private static void m9641c() {
        C1834b c1834b;
        C1860m c1860m = f11462c;
        if (c1860m == null || (c1834b = c1860m.f11464b) == null) {
            return;
        }
        c1834b.m9530a();
        f11462c.f11464b = null;
    }
}
