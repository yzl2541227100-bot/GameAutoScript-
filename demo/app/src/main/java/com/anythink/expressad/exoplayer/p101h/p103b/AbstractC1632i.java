package com.anythink.expressad.exoplayer.p101h.p103b;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1632i extends AbstractC1626c {

    /* JADX INFO: renamed from: j */
    public final long f8820j;

    public AbstractC1632i(InterfaceC1691h interfaceC1691h, C1694k c1694k, C1753m c1753m, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC1691h, c1694k, c1753m, i, obj, j, j2);
        C1711a.m8005a(c1753m);
        this.f8820j = j3;
    }

    /* JADX INFO: renamed from: e */
    public long mo7349e() {
        long j = this.f8820j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo7350f();
}
