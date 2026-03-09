package com.p188b.p189a;

import com.p188b.p199b.C2582i;

/* JADX INFO: renamed from: com.b.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2557k {

    /* JADX INFO: renamed from: a */
    public final String f15635a;

    /* JADX INFO: renamed from: b */
    public final String f15636b;

    /* JADX INFO: renamed from: c */
    public final String f15637c;

    /* JADX INFO: renamed from: d */
    public final C2582i f15638d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2557k)) {
            return false;
        }
        C2557k c2557k = (C2557k) obj;
        return this.f15635a.equals(c2557k.f15635a) && this.f15637c.equals(c2557k.f15637c) && this.f15638d.equals(c2557k.f15638d);
    }

    public final int hashCode() {
        return ((((this.f15635a.hashCode() + 527) * 31) + this.f15637c.hashCode()) * 31) + this.f15638d.hashCode();
    }

    public final String toString() {
        return this.f15637c + this.f15638d.mo13051b();
    }
}
