package com.anythink.expressad.exoplayer.p107k;

import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1765v;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1743z implements InterfaceC1731n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1720c f9822a;

    /* JADX INFO: renamed from: b */
    private boolean f9823b;

    /* JADX INFO: renamed from: c */
    private long f9824c;

    /* JADX INFO: renamed from: d */
    private long f9825d;

    /* JADX INFO: renamed from: e */
    private C1765v f9826e = C1765v.f10069a;

    public C1743z(InterfaceC1720c interfaceC1720c) {
        this.f9822a = interfaceC1720c;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: a */
    public final C1765v mo6559a(C1765v c1765v) {
        if (this.f9823b) {
            m8315a(mo6566d());
        }
        this.f9826e = c1765v;
        return c1765v;
    }

    /* JADX INFO: renamed from: a */
    public final void m8314a() {
        if (this.f9823b) {
            return;
        }
        this.f9825d = this.f9822a.mo8014a();
        this.f9823b = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m8315a(long j) {
        this.f9824c = j;
        if (this.f9823b) {
            this.f9825d = this.f9822a.mo8014a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8316b() {
        if (this.f9823b) {
            m8315a(mo6566d());
            this.f9823b = false;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: d */
    public final long mo6566d() {
        long j = this.f9824c;
        if (!this.f9823b) {
            return j;
        }
        long jMo8014a = this.f9822a.mo8014a() - this.f9825d;
        C1765v c1765v = this.f9826e;
        return j + (c1765v.f10070b == 1.0f ? C1500b.m6397b(jMo8014a) : c1765v.m8506a(jMo8014a));
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: e */
    public final C1765v mo6567e() {
        return this.f9826e;
    }
}
