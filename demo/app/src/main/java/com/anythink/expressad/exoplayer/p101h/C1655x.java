package com.anythink.expressad.exoplayer.p101h;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1524b;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p101h.C1654w;
import com.anythink.expressad.exoplayer.p105j.C1669a;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1655x implements InterfaceC1574m {

    /* JADX INFO: renamed from: a */
    public static final int f9103a = -1;

    /* JADX INFO: renamed from: b */
    private static final int f9104b = 32;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1685b f9105c;

    /* JADX INFO: renamed from: d */
    private final int f9106d;

    /* JADX INFO: renamed from: e */
    private final C1654w f9107e;

    /* JADX INFO: renamed from: f */
    private final C1654w.a f9108f;

    /* JADX INFO: renamed from: g */
    private final C1736s f9109g;

    /* JADX INFO: renamed from: h */
    private a f9110h;

    /* JADX INFO: renamed from: i */
    private a f9111i;

    /* JADX INFO: renamed from: j */
    private a f9112j;

    /* JADX INFO: renamed from: k */
    private C1753m f9113k;

    /* JADX INFO: renamed from: l */
    private boolean f9114l;

    /* JADX INFO: renamed from: m */
    private C1753m f9115m;

    /* JADX INFO: renamed from: n */
    private long f9116n;

    /* JADX INFO: renamed from: o */
    private long f9117o;

    /* JADX INFO: renamed from: p */
    private boolean f9118p;

    /* JADX INFO: renamed from: q */
    private b f9119q;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.x$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f9120a;

        /* JADX INFO: renamed from: b */
        public final long f9121b;

        /* JADX INFO: renamed from: c */
        public boolean f9122c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public C1669a f9123d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public a f9124e;

        public a(long j, int i) {
            this.f9120a = j;
            this.f9121b = j + ((long) i);
        }

        /* JADX INFO: renamed from: a */
        public final int m7551a(long j) {
            return ((int) (j - this.f9120a)) + this.f9123d.f9273b;
        }

        /* JADX INFO: renamed from: a */
        public final a m7552a() {
            this.f9123d = null;
            a aVar = this.f9124e;
            this.f9124e = null;
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m7553a(C1669a c1669a, a aVar) {
            this.f9123d = c1669a;
            this.f9124e = aVar;
            this.f9122c = true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.x$b */
    public interface b {
        /* JADX INFO: renamed from: i */
        void mo7443i();
    }

    public C1655x(InterfaceC1685b interfaceC1685b) {
        this.f9105c = interfaceC1685b;
        int iMo7848d = interfaceC1685b.mo7848d();
        this.f9106d = iMo7848d;
        this.f9107e = new C1654w();
        this.f9108f = new C1654w.a();
        this.f9109g = new C1736s(32);
        a aVar = new a(0L, iMo7848d);
        this.f9110h = aVar;
        this.f9111i = aVar;
        this.f9112j = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m7519a(C1753m c1753m, long j) {
        if (c1753m == null) {
            return null;
        }
        if (j == 0) {
            return c1753m;
        }
        long j2 = c1753m.f9975l;
        return j2 != Long.MAX_VALUE ? c1753m.m8412a(j2 + j) : c1753m;
    }

    /* JADX INFO: renamed from: a */
    private void m7520a(long j, ByteBuffer byteBuffer, int i) {
        m7524b(j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (this.f9111i.f9121b - j));
            a aVar = this.f9111i;
            byteBuffer.put(aVar.f9123d.f9272a, aVar.m7551a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            a aVar2 = this.f9111i;
            if (j == aVar2.f9121b) {
                this.f9111i = aVar2.f9124e;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7521a(long j, byte[] bArr, int i) {
        m7524b(j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.f9111i.f9121b - j));
            a aVar = this.f9111i;
            System.arraycopy(aVar.f9123d.f9272a, aVar.m7551a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            a aVar2 = this.f9111i;
            if (j == aVar2.f9121b) {
                this.f9111i = aVar2.f9124e;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7522a(C1527e c1527e, C1654w.a aVar) {
        int iM8275e;
        long j = aVar.f9101b;
        this.f9109g.m8266a(1);
        m7521a(j, this.f9109g.f9792a, 1);
        long j2 = j + 1;
        byte b2 = this.f9109g.f9792a[0];
        boolean z = (b2 & 128) != 0;
        int i = b2 & 127;
        C1524b c1524b = c1527e.f7878d;
        if (c1524b.f7854a == null) {
            c1524b.f7854a = new byte[16];
        }
        m7521a(j2, c1524b.f7854a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            this.f9109g.m8266a(2);
            m7521a(j3, this.f9109g.f9792a, 2);
            j3 += 2;
            iM8275e = this.f9109g.m8275e();
        } else {
            iM8275e = 1;
        }
        C1524b c1524b2 = c1527e.f7878d;
        int[] iArr = c1524b2.f7857d;
        if (iArr == null || iArr.length < iM8275e) {
            iArr = new int[iM8275e];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c1524b2.f7858e;
        if (iArr3 == null || iArr3.length < iM8275e) {
            iArr3 = new int[iM8275e];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = iM8275e * 6;
            this.f9109g.m8266a(i2);
            m7521a(j3, this.f9109g.f9792a, i2);
            j3 += (long) i2;
            this.f9109g.m8272c(0);
            for (int i3 = 0; i3 < iM8275e; i3++) {
                iArr2[i3] = this.f9109g.m8275e();
                iArr4[i3] = this.f9109g.m8284m();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f9100a - ((int) (j3 - aVar.f9101b));
        }
        InterfaceC1574m.a aVar2 = aVar.f9102c;
        C1524b c1524b3 = c1527e.f7878d;
        c1524b3.m6647a(iM8275e, iArr2, iArr4, aVar2.f8391b, c1524b3.f7854a, aVar2.f8390a, aVar2.f8392c, aVar2.f8393d);
        long j4 = aVar.f9101b;
        int i4 = (int) (j3 - j4);
        aVar.f9101b = j4 + ((long) i4);
        aVar.f9100a -= i4;
    }

    /* JADX INFO: renamed from: a */
    private void m7523a(a aVar) {
        if (aVar.f9122c) {
            a aVar2 = this.f9112j;
            boolean z = aVar2.f9122c;
            int i = (z ? 1 : 0) + (((int) (aVar2.f9120a - aVar.f9120a)) / this.f9106d);
            C1669a[] c1669aArr = new C1669a[i];
            for (int i2 = 0; i2 < i; i2++) {
                c1669aArr[i2] = aVar.f9123d;
                aVar = aVar.m7552a();
            }
            this.f9105c.mo7845a(c1669aArr);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7524b(long j) {
        while (true) {
            a aVar = this.f9111i;
            if (j < aVar.f9121b) {
                return;
            } else {
                this.f9111i = aVar.f9124e;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7525c(int i) {
        this.f9107e.m7506b(i);
    }

    /* JADX INFO: renamed from: c */
    private void m7526c(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f9110h;
            if (j < aVar.f9121b) {
                break;
            }
            this.f9105c.mo7844a(aVar.f9123d);
            this.f9110h = this.f9110h.m7552a();
        }
        if (this.f9111i.f9120a < aVar.f9120a) {
            this.f9111i = aVar;
        }
    }

    /* JADX INFO: renamed from: d */
    private int m7527d(int i) {
        a aVar = this.f9112j;
        if (!aVar.f9122c) {
            aVar.m7553a(this.f9105c.mo7843a(), new a(this.f9112j.f9121b, this.f9106d));
        }
        return Math.min(i, (int) (this.f9112j.f9121b - this.f9117o));
    }

    /* JADX INFO: renamed from: e */
    private void m7528e(int i) {
        long j = this.f9117o + ((long) i);
        this.f9117o = j;
        a aVar = this.f9112j;
        if (j == aVar.f9121b) {
            this.f9112j = aVar.f9124e;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m7529l() {
        this.f9107e.m7501a();
        m7523a(this.f9110h);
        a aVar = new a(0L, this.f9106d);
        this.f9110h = aVar;
        this.f9111i = aVar;
        this.f9112j = aVar;
        this.f9117o = 0L;
        this.f9105c.mo7846b();
    }

    /* JADX INFO: renamed from: m */
    private void m7530m() {
        this.f9118p = true;
    }

    /* JADX INFO: renamed from: n */
    private int m7531n() {
        return this.f9107e.m7510e();
    }

    /* JADX INFO: renamed from: o */
    private void m7532o() {
        m7526c(this.f9107e.m7517l());
    }

    /* JADX INFO: renamed from: a */
    public final int m7533a(long j, boolean z) {
        return this.f9107e.m7497a(j, z);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final int mo6981a(InterfaceC1567f interfaceC1567f, int i, boolean z) throws EOFException {
        int iM7527d = m7527d(i);
        a aVar = this.f9112j;
        int iMo6965a = interfaceC1567f.mo6965a(aVar.f9123d.f9272a, aVar.m7551a(this.f9117o), iM7527d);
        if (iMo6965a != -1) {
            m7528e(iMo6965a);
            return iMo6965a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: a */
    public final int m7534a(C1754n c1754n, C1527e c1527e, boolean z, boolean z3, long j) {
        int iM8275e;
        int iM7498a = this.f9107e.m7498a(c1754n, c1527e, z, z3, this.f9113k, this.f9108f);
        if (iM7498a == -5) {
            this.f9113k = c1754n.f9990a;
            return -5;
        }
        if (iM7498a != -4) {
            if (iM7498a == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!c1527e.m6641c()) {
            if (c1527e.f7880f < j) {
                c1527e.m6639b(Integer.MIN_VALUE);
            }
            if (c1527e.m6662g()) {
                C1654w.a aVar = this.f9108f;
                long j2 = aVar.f9101b;
                this.f9109g.m8266a(1);
                m7521a(j2, this.f9109g.f9792a, 1);
                long j3 = j2 + 1;
                byte b2 = this.f9109g.f9792a[0];
                boolean z4 = (b2 & 128) != 0;
                int i = b2 & 127;
                C1524b c1524b = c1527e.f7878d;
                if (c1524b.f7854a == null) {
                    c1524b.f7854a = new byte[16];
                }
                m7521a(j3, c1524b.f7854a, i);
                long j4 = j3 + ((long) i);
                if (z4) {
                    this.f9109g.m8266a(2);
                    m7521a(j4, this.f9109g.f9792a, 2);
                    j4 += 2;
                    iM8275e = this.f9109g.m8275e();
                } else {
                    iM8275e = 1;
                }
                C1524b c1524b2 = c1527e.f7878d;
                int[] iArr = c1524b2.f7857d;
                if (iArr == null || iArr.length < iM8275e) {
                    iArr = new int[iM8275e];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = c1524b2.f7858e;
                if (iArr3 == null || iArr3.length < iM8275e) {
                    iArr3 = new int[iM8275e];
                }
                int[] iArr4 = iArr3;
                if (z4) {
                    int i2 = iM8275e * 6;
                    this.f9109g.m8266a(i2);
                    m7521a(j4, this.f9109g.f9792a, i2);
                    j4 += (long) i2;
                    this.f9109g.m8272c(0);
                    for (int i3 = 0; i3 < iM8275e; i3++) {
                        iArr2[i3] = this.f9109g.m8275e();
                        iArr4[i3] = this.f9109g.m8284m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = aVar.f9100a - ((int) (j4 - aVar.f9101b));
                }
                InterfaceC1574m.a aVar2 = aVar.f9102c;
                C1524b c1524b3 = c1527e.f7878d;
                c1524b3.m6647a(iM8275e, iArr2, iArr4, aVar2.f8391b, c1524b3.f7854a, aVar2.f8390a, aVar2.f8392c, aVar2.f8393d);
                long j5 = aVar.f9101b;
                int i4 = (int) (j4 - j5);
                aVar.f9101b = j5 + ((long) i4);
                aVar.f9100a -= i4;
            }
            c1527e.m6660d(this.f9108f.f9100a);
            C1654w.a aVar3 = this.f9108f;
            long j6 = aVar3.f9101b;
            ByteBuffer byteBuffer = c1527e.f7879e;
            int i5 = aVar3.f9100a;
            m7524b(j6);
            while (i5 > 0) {
                int iMin = Math.min(i5, (int) (this.f9111i.f9121b - j6));
                a aVar4 = this.f9111i;
                byteBuffer.put(aVar4.f9123d.f9272a, aVar4.m7551a(j6), iMin);
                i5 -= iMin;
                j6 += (long) iMin;
                a aVar5 = this.f9111i;
                if (j6 == aVar5.f9121b) {
                    this.f9111i = aVar5.f9124e;
                }
            }
        }
        return -4;
    }

    /* JADX INFO: renamed from: a */
    public final void m7535a() {
        this.f9107e.m7501a();
        m7523a(this.f9110h);
        a aVar = new a(0L, this.f9106d);
        this.f9110h = aVar;
        this.f9111i = aVar;
        this.f9112j = aVar;
        this.f9117o = 0L;
        this.f9105c.mo7846b();
    }

    /* JADX INFO: renamed from: a */
    public final void m7536a(int i) {
        long jM7499a = this.f9107e.m7499a(i);
        this.f9117o = jM7499a;
        if (jM7499a != 0) {
            a aVar = this.f9110h;
            if (jM7499a != aVar.f9120a) {
                while (this.f9117o > aVar.f9121b) {
                    aVar = aVar.f9124e;
                }
                a aVar2 = aVar.f9124e;
                m7523a(aVar2);
                a aVar3 = new a(aVar.f9121b, this.f9106d);
                aVar.f9124e = aVar3;
                if (this.f9117o == aVar.f9121b) {
                    aVar = aVar3;
                }
                this.f9112j = aVar;
                if (this.f9111i == aVar2) {
                    this.f9111i = aVar3;
                    return;
                }
                return;
            }
        }
        m7523a(this.f9110h);
        a aVar4 = new a(this.f9117o, this.f9106d);
        this.f9110h = aVar4;
        this.f9111i = aVar4;
        this.f9112j = aVar4;
    }

    /* JADX INFO: renamed from: a */
    public final void m7537a(long j) {
        if (this.f9116n != j) {
            this.f9116n = j;
            this.f9114l = true;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final void mo6982a(long j, int i, int i2, int i3, InterfaceC1574m.a aVar) {
        if (this.f9114l) {
            mo6984a(this.f9115m);
        }
        if (this.f9118p) {
            if ((i & 1) == 0 || !this.f9107e.m7503a(j)) {
                return;
            } else {
                this.f9118p = false;
            }
        }
        this.f9107e.m7502a(j + this.f9116n, i, (this.f9117o - ((long) i2)) - ((long) i3), i2, aVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m7538a(long j, boolean z, boolean z3) {
        m7526c(this.f9107e.m7500a(j, z, z3));
    }

    /* JADX INFO: renamed from: a */
    public final void m7539a(b bVar) {
        this.f9119q = bVar;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    public final void mo6983a(C1736s c1736s, int i) {
        while (i > 0) {
            int iM7527d = m7527d(i);
            a aVar = this.f9112j;
            c1736s.m8268a(aVar.f9123d.f9272a, aVar.m7551a(this.f9117o), iM7527d);
            i -= iM7527d;
            m7528e(iM7527d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x001d  */
    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1574m
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6984a(com.anythink.expressad.exoplayer.C1753m r8) {
        /*
            r7 = this;
            long r0 = r7.f9116n
            if (r8 != 0) goto L6
            r0 = 0
            goto L1e
        L6:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            long r2 = r8.f9975l
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1d
            long r2 = r2 + r0
            com.anythink.expressad.exoplayer.m r0 = r8.m8412a(r2)
            goto L1e
        L1d:
            r0 = r8
        L1e:
            com.anythink.expressad.exoplayer.h.w r1 = r7.f9107e
            boolean r0 = r1.m7504a(r0)
            r7.f9115m = r8
            r8 = 0
            r7.f9114l = r8
            com.anythink.expressad.exoplayer.h.x$b r8 = r7.f9119q
            if (r8 == 0) goto L32
            if (r0 == 0) goto L32
            r8.mo7443i()
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p101h.C1655x.mo6984a(com.anythink.expressad.exoplayer.m):void");
    }

    /* JADX INFO: renamed from: b */
    public final int m7540b() {
        return this.f9107e.m7505b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7541b(int i) {
        return this.f9107e.m7508c(i);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7542c() {
        return this.f9107e.m7511f();
    }

    /* JADX INFO: renamed from: d */
    public final int m7543d() {
        return this.f9107e.m7507c();
    }

    /* JADX INFO: renamed from: e */
    public final int m7544e() {
        return this.f9107e.m7509d();
    }

    /* JADX INFO: renamed from: f */
    public final C1753m m7545f() {
        return this.f9107e.m7512g();
    }

    /* JADX INFO: renamed from: g */
    public final long m7546g() {
        return this.f9107e.m7513h();
    }

    /* JADX INFO: renamed from: h */
    public final long m7547h() {
        return this.f9107e.m7514i();
    }

    /* JADX INFO: renamed from: i */
    public final void m7548i() {
        this.f9107e.m7515j();
        this.f9111i = this.f9110h;
    }

    /* JADX INFO: renamed from: j */
    public final void m7549j() {
        m7526c(this.f9107e.m7518m());
    }

    /* JADX INFO: renamed from: k */
    public final int m7550k() {
        return this.f9107e.m7516k();
    }
}
