package com.anythink.expressad.exoplayer.p101h;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1497ac;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import java.io.IOException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1643l implements InterfaceC1649r, InterfaceC1649r.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1650s f8916a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1650s.a f8917b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1685b f8918c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1649r f8919d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1649r.a f8920e;

    /* JADX INFO: renamed from: f */
    private long f8921f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private a f8922g;

    /* JADX INFO: renamed from: h */
    private boolean f8923h;

    /* JADX INFO: renamed from: i */
    private long f8924i = C1500b.f7455b;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.l$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7238a(InterfaceC1650s.a aVar, IOException iOException);
    }

    public C1643l(InterfaceC1650s interfaceC1650s, InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        this.f8917b = aVar;
        this.f8918c = interfaceC1685b;
        this.f8916a = interfaceC1650s;
    }

    /* JADX INFO: renamed from: h */
    private void m7411h() {
        this.f8920e.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7261a(long j, C1497ac c1497ac) {
        return this.f8919d.mo7261a(j, c1497ac);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7262a(InterfaceC1664f[] interfaceC1664fArr, boolean[] zArr, InterfaceC1656y[] interfaceC1656yArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f8924i;
        if (j3 == C1500b.f7455b || j != 0) {
            j2 = j;
        } else {
            this.f8924i = C1500b.f7455b;
            j2 = j3;
        }
        return this.f8919d.mo7262a(interfaceC1664fArr, zArr, interfaceC1656yArr, zArr2, j2);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7263a() throws IOException {
        try {
            InterfaceC1649r interfaceC1649r = this.f8919d;
            if (interfaceC1649r != null) {
                interfaceC1649r.mo7263a();
            } else {
                this.f8916a.mo7286b();
            }
        } catch (IOException e) {
            a aVar = this.f8922g;
            if (aVar == null) {
                throw e;
            }
            if (this.f8923h) {
                return;
            }
            this.f8923h = true;
            aVar.mo7238a(this.f8917b, e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7264a(long j, boolean z) {
        this.f8919d.mo7264a(j, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m7412a(a aVar) {
        this.f8922g = aVar;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7265a(InterfaceC1649r.a aVar, long j) {
        this.f8920e = aVar;
        this.f8921f = j;
        InterfaceC1649r interfaceC1649r = this.f8919d;
        if (interfaceC1649r != null) {
            interfaceC1649r.mo7265a(this, j);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r.a
    /* JADX INFO: renamed from: a */
    public final void mo7363a(InterfaceC1649r interfaceC1649r) {
        this.f8920e.mo7363a((InterfaceC1649r) this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z.a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7364a(InterfaceC1657z interfaceC1657z) {
        this.f8920e.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
        this.f8919d.mo7268a_(j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final long mo7269b(long j) {
        return this.f8919d.mo7269b(j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final C1621af mo7270b() {
        return this.f8919d.mo7270b();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: c */
    public final long mo7271c() {
        return this.f8919d.mo7271c();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        InterfaceC1649r interfaceC1649r = this.f8919d;
        return interfaceC1649r != null && interfaceC1649r.mo7272c(j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        return this.f8919d.mo7273d();
    }

    /* JADX INFO: renamed from: d */
    public final void m7413d(long j) {
        if (this.f8921f != 0 || j == 0) {
            return;
        }
        this.f8924i = j;
        this.f8921f = j;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        return this.f8919d.mo7274e();
    }

    /* JADX INFO: renamed from: f */
    public final void m7414f() {
        InterfaceC1649r interfaceC1649rMo7225a = this.f8916a.mo7225a(this.f8917b, this.f8918c);
        this.f8919d = interfaceC1649rMo7225a;
        if (this.f8920e != null) {
            interfaceC1649rMo7225a.mo7265a(this, this.f8921f);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7415g() {
        InterfaceC1649r interfaceC1649r = this.f8919d;
        if (interfaceC1649r != null) {
            this.f8916a.mo7228a(interfaceC1649r);
        }
    }
}
