package com.anythink.expressad.exoplayer;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1656y;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1731n;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492a implements InterfaceC1768y, InterfaceC1769z {

    /* JADX INFO: renamed from: n */
    private final int f7297n;

    /* JADX INFO: renamed from: o */
    private C1495aa f7298o;

    /* JADX INFO: renamed from: p */
    private int f7299p;

    /* JADX INFO: renamed from: q */
    private int f7300q;

    /* JADX INFO: renamed from: r */
    private InterfaceC1656y f7301r;

    /* JADX INFO: renamed from: s */
    private C1753m[] f7302s;

    /* JADX INFO: renamed from: t */
    private long f7303t;

    /* JADX INFO: renamed from: u */
    private boolean f7304u = true;

    /* JADX INFO: renamed from: v */
    private boolean f7305v;

    public AbstractC1492a(int i) {
        this.f7297n = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6121a(@Nullable InterfaceC1538g<?> interfaceC1538g, @Nullable C1536e c1536e) {
        if (c1536e == null) {
            return true;
        }
        if (interfaceC1538g == null) {
            return false;
        }
        return interfaceC1538g.mo6762a(c1536e);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y, com.anythink.expressad.exoplayer.InterfaceC1769z
    /* JADX INFO: renamed from: a */
    public final int mo6122a() {
        return this.f7297n;
    }

    /* JADX INFO: renamed from: a */
    public final int m6123a(C1754n c1754n, C1527e c1527e, boolean z) {
        int iMo7278a = this.f7301r.mo7278a(c1754n, c1527e, z);
        if (iMo7278a == -4) {
            if (c1527e.m6641c()) {
                this.f7304u = true;
                return this.f7305v ? -4 : -3;
            }
            c1527e.f7880f += this.f7303t;
        } else if (iMo7278a == -5) {
            C1753m c1753m = c1754n.f9990a;
            long j = c1753m.f9975l;
            if (j != Long.MAX_VALUE) {
                c1754n.f9990a = c1753m.m8412a(j + this.f7303t);
            }
        }
        return iMo7278a;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    public final void mo6124a(int i) {
        this.f7299p = i;
    }

    @Override // com.anythink.expressad.exoplayer.C1767x.b
    /* JADX INFO: renamed from: a */
    public void mo6125a(int i, Object obj) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    public final void mo6126a(long j) {
        this.f7305v = false;
        this.f7304u = false;
        mo6127a(j, false);
    }

    /* JADX INFO: renamed from: a */
    public void mo6127a(long j, boolean z) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    public final void mo6128a(C1495aa c1495aa, C1753m[] c1753mArr, InterfaceC1656y interfaceC1656y, long j, boolean z, long j2) {
        C1711a.m8012b(this.f7300q == 0);
        this.f7298o = c1495aa;
        this.f7300q = 1;
        mo6129a(z);
        mo6131a(c1753mArr, interfaceC1656y, j2);
        mo6127a(j, z);
    }

    /* JADX INFO: renamed from: a */
    public void mo6129a(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void mo6130a(C1753m[] c1753mArr, long j) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    public final void mo6131a(C1753m[] c1753mArr, InterfaceC1656y interfaceC1656y, long j) {
        C1711a.m8012b(!this.f7305v);
        this.f7301r = interfaceC1656y;
        this.f7304u = false;
        this.f7302s = c1753mArr;
        this.f7303t = j;
        mo6130a(c1753mArr, j);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a_ */
    public final int mo6132a_() {
        return this.f7300q;
    }

    /* JADX INFO: renamed from: b */
    public final int m6133b(long j) {
        return this.f7301r.mo7277a(j - this.f7303t);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: b */
    public final InterfaceC1769z mo6134b() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: b_ */
    public final void mo6135b_() {
        C1711a.m8012b(this.f7300q == 1);
        this.f7300q = 2;
        mo6145n();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: c */
    public InterfaceC1731n mo6136c() {
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: f */
    public final InterfaceC1656y mo6137f() {
        return this.f7301r;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: g */
    public final boolean mo6138g() {
        return this.f7304u;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: h */
    public final void mo6139h() {
        this.f7305v = true;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: i */
    public final boolean mo6140i() {
        return this.f7305v;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: j */
    public final void mo6141j() {
        this.f7301r.mo7281c();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: k */
    public final void mo6142k() {
        C1711a.m8012b(this.f7300q == 2);
        this.f7300q = 1;
        mo6146o();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: l */
    public final void mo6143l() {
        C1711a.m8012b(this.f7300q == 1);
        this.f7300q = 0;
        this.f7301r = null;
        this.f7302s = null;
        this.f7305v = false;
        mo6147p();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1769z
    /* JADX INFO: renamed from: m */
    public int mo6144m() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public void mo6145n() {
    }

    /* JADX INFO: renamed from: o */
    public void mo6146o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo6147p() {
    }

    /* JADX INFO: renamed from: q */
    public final C1753m[] m6148q() {
        return this.f7302s;
    }

    /* JADX INFO: renamed from: r */
    public final C1495aa m6149r() {
        return this.f7298o;
    }

    /* JADX INFO: renamed from: s */
    public final int m6150s() {
        return this.f7299p;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6151t() {
        return this.f7304u ? this.f7305v : this.f7301r.mo7280b();
    }
}
