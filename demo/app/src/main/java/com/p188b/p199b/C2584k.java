package com.p188b.p199b;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2584k extends C2598y {

    /* JADX INFO: renamed from: a */
    private C2598y f15827a;

    public C2584k(C2598y c2598y) {
        if (c2598y == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15827a = c2598y;
    }

    /* JADX INFO: renamed from: a */
    public final C2584k m13058a(C2598y c2598y) {
        if (c2598y == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15827a = c2598y;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2598y m13059a() {
        return this.f15827a;
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: a */
    public final C2598y mo13060a(long j) {
        return this.f15827a.mo13060a(j);
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: a */
    public final C2598y mo13061a(long j, TimeUnit timeUnit) {
        return this.f15827a.mo13061a(j, timeUnit);
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: b_ */
    public final long mo13062b_() {
        return this.f15827a.mo13062b_();
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: c_ */
    public final boolean mo13063c_() {
        return this.f15827a.mo13063c_();
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: d */
    public final long mo13064d() {
        return this.f15827a.mo13064d();
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: d_ */
    public final C2598y mo13065d_() {
        return this.f15827a.mo13065d_();
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: e_ */
    public final C2598y mo13066e_() {
        return this.f15827a.mo13066e_();
    }

    @Override // com.p188b.p199b.C2598y
    /* JADX INFO: renamed from: f_ */
    public final void mo13067f_() throws InterruptedIOException {
        this.f15827a.mo13067f_();
    }
}
