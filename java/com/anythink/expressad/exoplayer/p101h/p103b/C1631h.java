package com.anythink.expressad.exoplayer.p101h.p103b;

import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p094e.C1563b;
import com.anythink.expressad.exoplayer.p094e.C1571j;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1566e;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1631h extends AbstractC1624a {

    /* JADX INFO: renamed from: k */
    private final int f8814k;

    /* JADX INFO: renamed from: l */
    private final long f8815l;

    /* JADX INFO: renamed from: m */
    private final C1627d f8816m;

    /* JADX INFO: renamed from: n */
    private volatile int f8817n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f8818o;

    /* JADX INFO: renamed from: p */
    private volatile boolean f8819p;

    private C1631h(InterfaceC1691h interfaceC1691h, C1694k c1694k, C1753m c1753m, int i, Object obj, long j, long j2, long j3, long j4, int i2, long j5, C1627d c1627d) {
        super(interfaceC1691h, c1694k, c1753m, i, obj, j, j2, j3, j4);
        this.f8814k = i2;
        this.f8815l = j5;
        this.f8816m = c1627d;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
    /* JADX INFO: renamed from: a */
    public final void mo7284a() {
        this.f8818o = true;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
    /* JADX INFO: renamed from: b */
    public final void mo7285b() {
        C1694k c1694kM7857a = this.f8764b.m7857a(this.f8817n);
        try {
            InterfaceC1691h interfaceC1691h = this.f8771i;
            C1563b c1563b = new C1563b(interfaceC1691h, c1694kM7857a.f9397e, interfaceC1691h.mo7742a(c1694kM7857a));
            if (this.f8817n == 0) {
                C1625b c1625bM7304c = m7304c();
                c1625bM7304c.m7306a(this.f8815l);
                C1627d c1627d = this.f8816m;
                long j = this.f8758a;
                c1627d.m7312a(c1625bM7304c, j == C1500b.f7455b ? 0L : j - this.f8815l);
            }
            try {
                InterfaceC1566e interfaceC1566e = this.f8816m.f8772a;
                int iMo6896a = 0;
                while (iMo6896a == 0 && !this.f8818o) {
                    iMo6896a = interfaceC1566e.mo6896a(c1563b, (C1571j) null);
                }
                C1711a.m8012b(iMo6896a != 1);
                C1717af.m8074a(this.f8771i);
                this.f8819p = true;
            } finally {
                this.f8817n = (int) (c1563b.mo6972c() - this.f8764b.f9397e);
            }
        } catch (Throwable th) {
            C1717af.m8074a(this.f8771i);
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1626c
    /* JADX INFO: renamed from: d */
    public final long mo7309d() {
        return this.f8817n;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1632i
    /* JADX INFO: renamed from: e */
    public final long mo7349e() {
        return this.f8820j + ((long) this.f8814k);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1632i
    /* JADX INFO: renamed from: f */
    public final boolean mo7350f() {
        return this.f8819p;
    }
}
