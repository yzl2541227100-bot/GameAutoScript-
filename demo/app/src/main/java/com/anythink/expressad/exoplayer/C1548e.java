package com.anythink.expressad.exoplayer;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1743z;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1731n;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1548e implements InterfaceC1731n {

    /* JADX INFO: renamed from: a */
    private final C1743z f8027a;

    /* JADX INFO: renamed from: b */
    private final a f8028b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private InterfaceC1768y f8029c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private InterfaceC1731n f8030d;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6818a(C1765v c1765v);
    }

    public C1548e(a aVar, InterfaceC1720c interfaceC1720c) {
        this.f8028b = aVar;
        this.f8027a = new C1743z(interfaceC1720c);
    }

    /* JADX INFO: renamed from: f */
    private void m6810f() {
        this.f8027a.m8315a(this.f8030d.mo6566d());
        C1765v c1765vMo6567e = this.f8030d.mo6567e();
        if (c1765vMo6567e.equals(this.f8027a.mo6567e())) {
            return;
        }
        this.f8027a.mo6559a(c1765vMo6567e);
        this.f8028b.mo6818a(c1765vMo6567e);
    }

    /* JADX INFO: renamed from: g */
    private boolean m6811g() {
        InterfaceC1768y interfaceC1768y = this.f8029c;
        if (interfaceC1768y == null || interfaceC1768y.mo6569v()) {
            return false;
        }
        return this.f8029c.mo6568u() || !this.f8029c.mo6138g();
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: a */
    public final C1765v mo6559a(C1765v c1765v) {
        InterfaceC1731n interfaceC1731n = this.f8030d;
        if (interfaceC1731n != null) {
            c1765v = interfaceC1731n.mo6559a(c1765v);
        }
        this.f8027a.mo6559a(c1765v);
        this.f8028b.mo6818a(c1765v);
        return c1765v;
    }

    /* JADX INFO: renamed from: a */
    public final void m6812a() {
        this.f8027a.m8314a();
    }

    /* JADX INFO: renamed from: a */
    public final void m6813a(long j) {
        this.f8027a.m8315a(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m6814a(InterfaceC1768y interfaceC1768y) throws C1581g {
        InterfaceC1731n interfaceC1731n;
        InterfaceC1731n interfaceC1731nMo6136c = interfaceC1768y.mo6136c();
        if (interfaceC1731nMo6136c == null || interfaceC1731nMo6136c == (interfaceC1731n = this.f8030d)) {
            return;
        }
        if (interfaceC1731n != null) {
            throw C1581g.m7081a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f8030d = interfaceC1731nMo6136c;
        this.f8029c = interfaceC1768y;
        interfaceC1731nMo6136c.mo6559a(this.f8027a.mo6567e());
        m6810f();
    }

    /* JADX INFO: renamed from: b */
    public final void m6815b() {
        this.f8027a.m8316b();
    }

    /* JADX INFO: renamed from: b */
    public final void m6816b(InterfaceC1768y interfaceC1768y) {
        if (interfaceC1768y == this.f8029c) {
            this.f8030d = null;
            this.f8029c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m6817c() {
        if (!m6811g()) {
            return this.f8027a.mo6566d();
        }
        m6810f();
        return this.f8030d.mo6566d();
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: d */
    public final long mo6566d() {
        return m6811g() ? this.f8030d.mo6566d() : this.f8027a.mo6566d();
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: e */
    public final C1765v mo6567e() {
        InterfaceC1731n interfaceC1731n = this.f8030d;
        return interfaceC1731n != null ? interfaceC1731n.mo6567e() : this.f8027a.mo6567e();
    }
}
