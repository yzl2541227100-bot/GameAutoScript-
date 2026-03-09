package com.p188b.p189a.p190a.p192b;

import com.p188b.p189a.C2546aw;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.b.a.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2441d {

    /* JADX INFO: renamed from: a */
    private final Set<C2546aw> f15151a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized void m12543a(C2546aw c2546aw) {
        this.f15151a.add(c2546aw);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12544b(C2546aw c2546aw) {
        this.f15151a.remove(c2546aw);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m12545c(C2546aw c2546aw) {
        return this.f15151a.contains(c2546aw);
    }
}
