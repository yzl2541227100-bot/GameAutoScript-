package com.anythink.expressad.exoplayer.p101h;

import com.anythink.expressad.exoplayer.C1497ac;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1635d implements InterfaceC1649r, InterfaceC1649r.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r f8830a;

    /* JADX INFO: renamed from: b */
    public long f8831b;

    /* JADX INFO: renamed from: c */
    public long f8832c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1649r.a f8833d;

    /* JADX INFO: renamed from: e */
    private a[] f8834e = new a[0];

    /* JADX INFO: renamed from: f */
    private long f8835f;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.d$a */
    public final class a implements InterfaceC1656y {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1656y f8836a;

        /* JADX INFO: renamed from: c */
        private boolean f8838c;

        public a(InterfaceC1656y interfaceC1656y) {
            this.f8836a = interfaceC1656y;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7277a(long j) {
            if (C1635d.this.m7365f()) {
                return -3;
            }
            return this.f8836a.mo7277a(j);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7278a(C1754n c1754n, C1527e c1527e, boolean z) {
            if (C1635d.this.m7365f()) {
                return -3;
            }
            if (this.f8838c) {
                c1527e.m6638a(4);
                return -4;
            }
            int iMo7278a = this.f8836a.mo7278a(c1754n, c1527e, z);
            if (iMo7278a == -5) {
                C1753m c1753m = c1754n.f9990a;
                int i = c1753m.f9987x;
                if (i != 0 || c1753m.f9988y != 0) {
                    C1635d c1635d = C1635d.this;
                    if (c1635d.f8831b != 0) {
                        i = 0;
                    }
                    c1754n.f9990a = c1753m.m8411a(i, c1635d.f8832c == Long.MIN_VALUE ? c1753m.f9988y : 0);
                }
                return -5;
            }
            C1635d c1635d2 = C1635d.this;
            long j = c1635d2.f8832c;
            if (j == Long.MIN_VALUE || ((iMo7278a != -4 || c1527e.f7880f < j) && !(iMo7278a == -3 && c1635d2.mo7273d() == Long.MIN_VALUE))) {
                return iMo7278a;
            }
            c1527e.mo6637a();
            c1527e.m6638a(4);
            this.f8838c = true;
            return -4;
        }

        /* JADX INFO: renamed from: a */
        public final void m7366a() {
            this.f8838c = false;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: b */
        public final boolean mo7280b() {
            return !C1635d.this.m7365f() && this.f8836a.mo7280b();
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: c */
        public final void mo7281c() {
            this.f8836a.mo7281c();
        }
    }

    public C1635d(InterfaceC1649r interfaceC1649r, boolean z, long j, long j2) {
        this.f8830a = interfaceC1649r;
        this.f8835f = z ? j : C1500b.f7455b;
        this.f8831b = j;
        this.f8832c = j2;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7359a(long j, InterfaceC1664f[] interfaceC1664fArr) {
        if (j != 0) {
            for (InterfaceC1664f interfaceC1664f : interfaceC1664fArr) {
                if (interfaceC1664f != null && !C1732o.m8202a(interfaceC1664f.mo7586h().f9971h)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private C1497ac m7360b(long j, C1497ac c1497ac) {
        long jM8058a = C1717af.m8058a(c1497ac.f7333f, j - this.f8831b);
        long j2 = c1497ac.f7334g;
        long j3 = this.f8832c;
        long jM8058a2 = C1717af.m8058a(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jM8058a == c1497ac.f7333f && jM8058a2 == c1497ac.f7334g) ? c1497ac : new C1497ac(jM8058a, jM8058a2);
    }

    /* JADX INFO: renamed from: g */
    private void m7361g() {
        this.f8833d.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7261a(long j, C1497ac c1497ac) {
        long j2 = this.f8831b;
        if (j == j2) {
            return j2;
        }
        long jM8058a = C1717af.m8058a(c1497ac.f7333f, j - j2);
        long j3 = c1497ac.f7334g;
        long j4 = this.f8832c;
        long jM8058a2 = C1717af.m8058a(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jM8058a != c1497ac.f7333f || jM8058a2 != c1497ac.f7334g) {
            c1497ac = new C1497ac(jM8058a, jM8058a2);
        }
        return this.f8830a.mo7261a(j, c1497ac);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo7262a(com.anythink.expressad.exoplayer.p104i.InterfaceC1664f[] r16, boolean[] r17, com.anythink.expressad.exoplayer.p101h.InterfaceC1656y[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.anythink.expressad.exoplayer.h.d$a[] r1 = new com.anythink.expressad.exoplayer.p101h.C1635d.a[r1]
            r0.f8834e = r1
            int r1 = r9.length
            com.anythink.expressad.exoplayer.h.y[] r10 = new com.anythink.expressad.exoplayer.p101h.InterfaceC1656y[r1]
            r11 = 0
            r1 = 0
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L28
            com.anythink.expressad.exoplayer.h.d$a[] r2 = r0.f8834e
            r3 = r9[r1]
            com.anythink.expressad.exoplayer.h.d$a r3 = (com.anythink.expressad.exoplayer.p101h.C1635d.a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L23
            r2 = r2[r1]
            com.anythink.expressad.exoplayer.h.y r12 = r2.f8836a
        L23:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L28:
            com.anythink.expressad.exoplayer.h.r r1 = r0.f8830a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo7262a(r2, r3, r4, r5, r6)
            boolean r3 = r15.m7365f()
            r4 = 1
            if (r3 == 0) goto L68
            long r5 = r0.f8831b
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L68
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L63
            int r3 = r8.length
            r5 = 0
        L4c:
            if (r5 >= r3) goto L63
            r6 = r8[r5]
            if (r6 == 0) goto L60
            com.anythink.expressad.exoplayer.m r6 = r6.mo7586h()
            java.lang.String r6 = r6.f9971h
            boolean r6 = com.anythink.expressad.exoplayer.p107k.C1732o.m8202a(r6)
            if (r6 != 0) goto L60
            r3 = 1
            goto L64
        L60:
            int r5 = r5 + 1
            goto L4c
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L68
            r5 = r1
            goto L6d
        L68:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6d:
            r0.f8835f = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L87
            long r5 = r0.f8831b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L86
            long r5 = r0.f8832c
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L87
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L86
            goto L87
        L86:
            r4 = 0
        L87:
            com.anythink.expressad.exoplayer.p107k.C1711a.m8012b(r4)
        L8a:
            int r3 = r9.length
            if (r11 >= r3) goto Lb8
            r3 = r10[r11]
            if (r3 != 0) goto L96
            com.anythink.expressad.exoplayer.h.d$a[] r3 = r0.f8834e
            r3[r11] = r12
            goto Laf
        L96:
            r3 = r9[r11]
            if (r3 == 0) goto La4
            com.anythink.expressad.exoplayer.h.d$a[] r3 = r0.f8834e
            r3 = r3[r11]
            com.anythink.expressad.exoplayer.h.y r3 = r3.f8836a
            r4 = r10[r11]
            if (r3 == r4) goto Laf
        La4:
            com.anythink.expressad.exoplayer.h.d$a[] r3 = r0.f8834e
            com.anythink.expressad.exoplayer.h.d$a r4 = new com.anythink.expressad.exoplayer.h.d$a
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        Laf:
            com.anythink.expressad.exoplayer.h.d$a[] r3 = r0.f8834e
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L8a
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p101h.C1635d.mo7262a(com.anythink.expressad.exoplayer.i.f[], boolean[], com.anythink.expressad.exoplayer.h.y[], boolean[], long):long");
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7263a() {
        this.f8830a.mo7263a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7362a(long j, long j2) {
        this.f8831b = j;
        this.f8832c = j2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7264a(long j, boolean z) {
        this.f8830a.mo7264a(j, z);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7265a(InterfaceC1649r.a aVar, long j) {
        this.f8833d = aVar;
        this.f8830a.mo7265a(this, j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r.a
    /* JADX INFO: renamed from: a */
    public final void mo7363a(InterfaceC1649r interfaceC1649r) {
        this.f8833d.mo7363a((InterfaceC1649r) this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1657z.a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7364a(InterfaceC1657z interfaceC1657z) {
        this.f8833d.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
        this.f8830a.mo7268a_(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo7269b(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f8835f = r0
            com.anythink.expressad.exoplayer.h.d$a[] r0 = r6.f8834e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m7366a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.anythink.expressad.exoplayer.h.r r0 = r6.f8830a
            long r0 = r0.mo7269b(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f8831b
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f8832c
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.anythink.expressad.exoplayer.p107k.C1711a.m8012b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p101h.C1635d.mo7269b(long):long");
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final C1621af mo7270b() {
        return this.f8830a.mo7270b();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: c */
    public final long mo7271c() {
        if (m7365f()) {
            long j = this.f8835f;
            this.f8835f = C1500b.f7455b;
            long jMo7271c = mo7271c();
            return jMo7271c != C1500b.f7455b ? jMo7271c : j;
        }
        long jMo7271c2 = this.f8830a.mo7271c();
        if (jMo7271c2 == C1500b.f7455b) {
            return C1500b.f7455b;
        }
        boolean z = true;
        C1711a.m8012b(jMo7271c2 >= this.f8831b);
        long j2 = this.f8832c;
        if (j2 != Long.MIN_VALUE && jMo7271c2 > j2) {
            z = false;
        }
        C1711a.m8012b(z);
        return jMo7271c2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        return this.f8830a.mo7272c(j);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        long jMo7273d = this.f8830a.mo7273d();
        if (jMo7273d != Long.MIN_VALUE) {
            long j = this.f8832c;
            if (j == Long.MIN_VALUE || jMo7273d < j) {
                return jMo7273d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        long jMo7274e = this.f8830a.mo7274e();
        if (jMo7274e != Long.MIN_VALUE) {
            long j = this.f8832c;
            if (j == Long.MIN_VALUE || jMo7274e < j) {
                return jMo7274e;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7365f() {
        return this.f8835f != C1500b.f7455b;
    }
}
