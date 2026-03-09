package com.anythink.expressad.exoplayer.p101h.p103b;

import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p094e.C1563b;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1633j extends AbstractC1624a {

    /* JADX INFO: renamed from: k */
    private final int f8821k;

    /* JADX INFO: renamed from: l */
    private final C1753m f8822l;

    /* JADX INFO: renamed from: m */
    private volatile int f8823m;

    /* JADX INFO: renamed from: n */
    private volatile boolean f8824n;

    private C1633j(InterfaceC1691h interfaceC1691h, C1694k c1694k, C1753m c1753m, int i, Object obj, long j, long j2, long j3, int i2, C1753m c1753m2) {
        super(interfaceC1691h, c1694k, c1753m, i, obj, j, j2, C1500b.f7455b, j3);
        this.f8821k = i2;
        this.f8822l = c1753m2;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
    /* JADX INFO: renamed from: a */
    public final void mo7284a() {
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
    /* JADX INFO: renamed from: b */
    public final void mo7285b() {
        try {
            long jMo7742a = this.f8771i.mo7742a(this.f8764b.m7857a(this.f8823m));
            if (jMo7742a != -1) {
                jMo7742a += (long) this.f8823m;
            }
            C1563b c1563b = new C1563b(this.f8771i, this.f8823m, jMo7742a);
            C1625b c1625bM7304c = m7304c();
            c1625bM7304c.m7306a(0L);
            InterfaceC1574m interfaceC1574mMo7305a = c1625bM7304c.mo7305a(this.f8821k);
            interfaceC1574mMo7305a.mo6984a(this.f8822l);
            for (int iMo6981a = 0; iMo6981a != -1; iMo6981a = interfaceC1574mMo7305a.mo6981a(c1563b, Integer.MAX_VALUE, true)) {
                this.f8823m += iMo6981a;
            }
            interfaceC1574mMo7305a.mo6982a(this.f8769g, 1, this.f8823m, 0, null);
            C1717af.m8074a(this.f8771i);
            this.f8824n = true;
        } catch (Throwable th) {
            C1717af.m8074a(this.f8771i);
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1626c
    /* JADX INFO: renamed from: d */
    public final long mo7309d() {
        return this.f8823m;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1632i
    /* JADX INFO: renamed from: f */
    public final boolean mo7350f() {
        return this.f8824n;
    }
}
