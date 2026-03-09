package com.anythink.expressad.exoplayer.p101h;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1638g implements InterfaceC1657z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1657z[] f8871a;

    public C1638g(InterfaceC1657z[] interfaceC1657zArr) {
        this.f8871a = interfaceC1657zArr;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
        for (InterfaceC1657z interfaceC1657z : this.f8871a) {
            interfaceC1657z.mo7268a_(j);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        boolean zMo7272c;
        boolean z = false;
        do {
            long jMo7274e = mo7274e();
            if (jMo7274e == Long.MIN_VALUE) {
                break;
            }
            zMo7272c = false;
            for (InterfaceC1657z interfaceC1657z : this.f8871a) {
                long jMo7274e2 = interfaceC1657z.mo7274e();
                boolean z3 = jMo7274e2 != Long.MIN_VALUE && jMo7274e2 <= j;
                if (jMo7274e2 == jMo7274e || z3) {
                    zMo7272c |= interfaceC1657z.mo7272c(j);
                }
            }
            z |= zMo7272c;
        } while (zMo7272c);
        return z;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC1657z interfaceC1657z : this.f8871a) {
            long jMo7273d = interfaceC1657z.mo7273d();
            if (jMo7273d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo7273d);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC1657z interfaceC1657z : this.f8871a) {
            long jMo7274e = interfaceC1657z.mo7274e();
            if (jMo7274e != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo7274e);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
