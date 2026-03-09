package com.anythink.expressad.exoplayer.p101h.p103b;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1624a extends AbstractC1632i {

    /* JADX INFO: renamed from: a */
    public final long f8758a;

    /* JADX INFO: renamed from: k */
    private C1625b f8759k;

    /* JADX INFO: renamed from: l */
    private int[] f8760l;

    public AbstractC1624a(InterfaceC1691h interfaceC1691h, C1694k c1694k, C1753m c1753m, int i, Object obj, long j, long j2, long j3, long j4) {
        super(interfaceC1691h, c1694k, c1753m, i, obj, j, j2, j4);
        this.f8758a = j3;
    }

    /* JADX INFO: renamed from: a */
    public final int m7302a(int i) {
        return this.f8760l[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m7303a(C1625b c1625b) {
        this.f8759k = c1625b;
        this.f8760l = c1625b.m7307a();
    }

    /* JADX INFO: renamed from: c */
    public final C1625b m7304c() {
        return this.f8759k;
    }
}
