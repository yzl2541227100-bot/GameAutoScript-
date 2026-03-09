package com.p188b.p189a.p190a.p193c;

import com.p188b.p189a.AbstractC2544au;
import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2531ah;
import com.p188b.p199b.InterfaceC2581h;

/* JADX INFO: renamed from: com.b.a.a.c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2455i extends AbstractC2544au {

    /* JADX INFO: renamed from: a */
    private final C2524aa f15204a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2581h f15205b;

    public C2455i(C2524aa c2524aa, InterfaceC2581h interfaceC2581h) {
        this.f15204a = c2524aa;
        this.f15205b = interfaceC2581h;
    }

    @Override // com.p188b.p189a.AbstractC2544au
    /* JADX INFO: renamed from: a */
    public final C2531ah mo12617a() {
        String strM12789a = this.f15204a.m12789a("Content-Type");
        if (strM12789a != null) {
            return C2531ah.m12833a(strM12789a);
        }
        return null;
    }

    @Override // com.p188b.p189a.AbstractC2544au
    /* JADX INFO: renamed from: b */
    public final long mo12618b() {
        return C2452f.m12604a(this.f15204a);
    }

    @Override // com.p188b.p189a.AbstractC2544au
    /* JADX INFO: renamed from: c */
    public final InterfaceC2581h mo12619c() {
        return this.f15205b;
    }
}
