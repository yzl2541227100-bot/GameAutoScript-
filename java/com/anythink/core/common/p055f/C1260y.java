package com.anythink.core.common.p055f;

import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.p038b.p042d.C1108a;

/* JADX INFO: renamed from: com.anythink.core.common.f.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1260y {

    /* JADX INFO: renamed from: a */
    public double f4496a;

    /* JADX INFO: renamed from: b */
    private int f4497b;

    /* JADX INFO: renamed from: c */
    private C1243h f4498c;

    /* JADX INFO: renamed from: d */
    private boolean f4499d;

    /* JADX INFO: renamed from: e */
    private double f4500e;

    /* JADX INFO: renamed from: f */
    private String f4501f;

    /* JADX INFO: renamed from: g */
    private int f4502g;

    /* JADX INFO: renamed from: h */
    private double f4503h;

    /* JADX INFO: renamed from: i */
    private String f4504i;

    /* JADX INFO: renamed from: j */
    private String f4505j;

    public C1260y(int i, C1229av c1229av, C1243h c1243h) {
        this.f4497b = i;
        this.f4499d = c1229av.m2732Z();
        this.f4500e = C1108a.m1663b(c1229av);
        if (c1243h != null) {
            C1243h c1243hM3045V = c1243h.m3045V();
            this.f4498c = c1243hM3045V;
            C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
        }
        this.f4501f = "0";
        if (c1229av != null) {
            int iM2826m = c1229av.m2826m();
            this.f4501f = iM2826m != 2 ? (iM2826m == 5 || iM2826m == 6) ? "3" : "1" : "2";
            this.f4502g = c1229av.m2743aA();
        }
    }

    public C1260y(int i, C1229av c1229av, C1243h c1243h, double d) {
        this(i, c1229av, c1243h);
        this.f4496a = d;
    }

    /* JADX INFO: renamed from: a */
    private void m3453a(C1229av c1229av) {
        this.f4501f = "0";
        if (c1229av == null) {
            return;
        }
        int iM2826m = c1229av.m2826m();
        this.f4501f = iM2826m != 2 ? (iM2826m == 5 || iM2826m == 6) ? "3" : "1" : "2";
        this.f4502g = c1229av.m2743aA();
    }

    /* JADX INFO: renamed from: u */
    private int m3454u() {
        C1243h c1243h = this.f4498c;
        if (c1243h != null) {
            return c1243h.m3096i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final double m3455a() {
        return this.f4503h;
    }

    /* JADX INFO: renamed from: a */
    public final void m3456a(double d, String str, String str2) {
        this.f4503h = d;
        this.f4504i = str;
        this.f4505j = str2;
    }

    /* JADX INFO: renamed from: b */
    public final String m3457b() {
        return this.f4504i;
    }

    /* JADX INFO: renamed from: c */
    public final String m3458c() {
        return this.f4505j;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3459d() {
        return this.f4499d;
    }

    /* JADX INFO: renamed from: e */
    public final double m3460e() {
        return this.f4496a;
    }

    /* JADX INFO: renamed from: f */
    public final int m3461f() {
        return this.f4497b;
    }

    /* JADX INFO: renamed from: g */
    public final String m3462g() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? c1243h.m2678ai() : "";
    }

    /* JADX INFO: renamed from: h */
    public final String m3463h() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? String.valueOf(c1243h.m3040Q()) : "";
    }

    /* JADX INFO: renamed from: i */
    public final String m3464i() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? String.valueOf(c1243h.m2675af()) : "";
    }

    /* JADX INFO: renamed from: j */
    public final String m3465j() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? c1243h.m2677ah() : "";
    }

    /* JADX INFO: renamed from: k */
    public final int m3466k() {
        C1243h c1243h = this.f4498c;
        if (c1243h != null) {
            return c1243h.m3039P();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final String m3467l() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? c1243h.m3026F() : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m3468m() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? c1243h.m2676ag() : "";
    }

    /* JADX INFO: renamed from: n */
    public final String m3469n() {
        C1243h c1243h = this.f4498c;
        if (c1243h != null) {
            return c1243h.m2679aj();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final String m3470o() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? c1243h.m2670aa() : "";
    }

    /* JADX INFO: renamed from: p */
    public final String m3471p() {
        C1243h c1243h = this.f4498c;
        return c1243h != null ? c1243h.m2671ab() : "";
    }

    /* JADX INFO: renamed from: q */
    public final double m3472q() {
        return this.f4500e;
    }

    /* JADX INFO: renamed from: r */
    public final String m3473r() {
        return this.f4501f;
    }

    /* JADX INFO: renamed from: s */
    public final int m3474s() {
        return this.f4502g;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3475t() {
        return this.f4502g == 1;
    }
}
