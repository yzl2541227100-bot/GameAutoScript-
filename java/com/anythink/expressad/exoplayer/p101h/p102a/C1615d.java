package com.anythink.expressad.exoplayer.p101h.p102a;

import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p101h.AbstractC1647p;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1615d extends AbstractC1647p {

    /* JADX INFO: renamed from: c */
    private final C1612a f8693c;

    public C1615d(AbstractC1499ae abstractC1499ae, C1612a c1612a) {
        super(abstractC1499ae);
        C1711a.m8012b(abstractC1499ae.mo6370c() == 1);
        C1711a.m8012b(abstractC1499ae.mo6366b() == 1);
        this.f8693c = c1612a;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae.a mo6362a(int i, AbstractC1499ae.a aVar, boolean z) {
        this.f9004b.mo6362a(i, aVar, z);
        aVar.m6377a(aVar.f7360a, aVar.f7361b, aVar.f7362c, aVar.f7363d, aVar.m6381b(), this.f8693c);
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae.b mo6364a(int i, AbstractC1499ae.b bVar, boolean z, long j) {
        AbstractC1499ae.b bVarMo6364a = super.mo6364a(i, bVar, z, j);
        if (bVarMo6364a.f7374i == C1500b.f7455b) {
            bVarMo6364a.f7374i = this.f8693c.f8648k;
        }
        return bVarMo6364a;
    }
}
