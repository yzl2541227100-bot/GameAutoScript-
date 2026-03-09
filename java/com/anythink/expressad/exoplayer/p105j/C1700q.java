package com.anythink.expressad.exoplayer.p105j;

import com.anythink.expressad.exoplayer.p105j.InterfaceC1702s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1700q extends InterfaceC1702s.a {

    /* JADX INFO: renamed from: a */
    private final String f9475a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1684aa<? super InterfaceC1691h> f9476b;

    /* JADX INFO: renamed from: c */
    private final int f9477c;

    /* JADX INFO: renamed from: d */
    private final int f9478d;

    /* JADX INFO: renamed from: e */
    private final boolean f9479e;

    public C1700q(String str) {
        this(str, null);
    }

    public C1700q(String str, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa) {
        this(str, interfaceC1684aa, (byte) 0);
    }

    private C1700q(String str, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa, byte b) {
        this.f9475a = str;
        this.f9476b = interfaceC1684aa;
        this.f9477c = 8000;
        this.f9478d = 8000;
        this.f9479e = false;
    }

    /* JADX INFO: renamed from: b */
    private C1699p m7891b(InterfaceC1702s.f fVar) {
        return new C1699p(this.f9475a, null, this.f9476b, this.f9477c, this.f9478d, this.f9479e, fVar);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1702s mo7892a(InterfaceC1702s.f fVar) {
        return new C1699p(this.f9475a, null, this.f9476b, this.f9477c, this.f9478d, this.f9479e, fVar);
    }
}
