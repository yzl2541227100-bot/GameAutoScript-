package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2582i;
import p285z2.C3746bz;

/* JADX INFO: renamed from: com.b.a.a.e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2483c {

    /* JADX INFO: renamed from: a */
    public static final C2582i f15294a = C2582i.m13041a(":");

    /* JADX INFO: renamed from: b */
    public static final C2582i f15295b = C2582i.m13041a(C3746bz.OooO0o0);

    /* JADX INFO: renamed from: c */
    public static final C2582i f15296c = C2582i.m13041a(C3746bz.OooO0o);

    /* JADX INFO: renamed from: d */
    public static final C2582i f15297d = C2582i.m13041a(C3746bz.OooO0oO);

    /* JADX INFO: renamed from: e */
    public static final C2582i f15298e = C2582i.m13041a(C3746bz.OooO0oo);

    /* JADX INFO: renamed from: f */
    public static final C2582i f15299f = C2582i.m13041a(C3746bz.OooO);

    /* JADX INFO: renamed from: g */
    public final C2582i f15300g;

    /* JADX INFO: renamed from: h */
    public final C2582i f15301h;

    /* JADX INFO: renamed from: i */
    public final int f15302i;

    public C2483c(C2582i c2582i, C2582i c2582i2) {
        this.f15300g = c2582i;
        this.f15301h = c2582i2;
        this.f15302i = c2582i.mo13056g() + 32 + c2582i2.mo13056g();
    }

    public C2483c(C2582i c2582i, String str) {
        this(c2582i, C2582i.m13041a(str));
    }

    public C2483c(String str, String str2) {
        this(C2582i.m13041a(str), C2582i.m13041a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2483c) {
            C2483c c2483c = (C2483c) obj;
            if (this.f15300g.equals(c2483c.f15300g) && this.f15301h.equals(c2483c.f15301h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15300g.hashCode() + 527) * 31) + this.f15301h.hashCode();
    }

    public final String toString() {
        return C2446c.m12576a("%s: %s", this.f15300g.mo13047a(), this.f15301h.mo13047a());
    }
}
