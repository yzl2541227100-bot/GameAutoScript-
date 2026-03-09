package com.anythink.core.common.p055f;

import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p038b.p042d.C1109b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.f.ar */
/* JADX INFO: loaded from: classes.dex */
public final class C1225ar {

    /* JADX INFO: renamed from: a */
    private String f3884a;

    /* JADX INFO: renamed from: b */
    private List<C1234b> f3885b;

    public C1225ar(String str, List<C1234b> list) {
        this.f3884a = str;
        this.f3885b = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m2634a() {
        return this.f3884a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2635a(int i) {
        List<C1234b> list = this.f3885b;
        if (list != null) {
            Iterator<C1234b> it = list.iterator();
            while (it.hasNext()) {
                it.next().m2904d().getUnitGroupInfo().f4006n = i;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2636a(C1234b c1234b) {
        List<C1234b> list = this.f3885b;
        if (list != null) {
            list.remove(c1234b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m2637b() {
        List<C1234b> list = this.f3885b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C1234b m2638c() {
        List<C1234b> list = this.f3885b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f3885b.get(0);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m2639d() {
        List<C1234b> list = this.f3885b;
        C1234b c1234b = (list == null || list.size() <= 0) ? null : this.f3885b.get(0);
        if (c1234b != null) {
            return c1234b.m2899a();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized double m2640e() {
        List<C1234b> list = this.f3885b;
        C1234b c1234b = (list == null || list.size() <= 0) ? null : this.f3885b.get(0);
        if (c1234b != null) {
            return C1344h.m4129a(c1234b.m2904d().getUnitGroupInfo());
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized long m2641f() {
        List<C1234b> list = this.f3885b;
        C1234b c1234b = (list == null || list.size() <= 0) ? null : this.f3885b.get(0);
        if (c1234b != null) {
            return c1234b.m2900b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2642g() {
        List<C1234b> list = this.f3885b;
        if (list == null) {
            return;
        }
        for (C1234b c1234b : list) {
            if (c1234b != null) {
                C1109b.m1670a(c1234b, true);
                c1234b.m2912l();
            }
        }
    }
}
