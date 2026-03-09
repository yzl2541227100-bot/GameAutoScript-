package com.anythink.expressad.exoplayer.p101h;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1654w {

    /* JADX INFO: renamed from: a */
    private static final int f9081a = 1000;

    /* JADX INFO: renamed from: j */
    private int f9090j;

    /* JADX INFO: renamed from: k */
    private int f9091k;

    /* JADX INFO: renamed from: l */
    private int f9092l;

    /* JADX INFO: renamed from: m */
    private int f9093m;

    /* JADX INFO: renamed from: r */
    private C1753m f9098r;

    /* JADX INFO: renamed from: s */
    private int f9099s;

    /* JADX INFO: renamed from: b */
    private int f9082b = 1000;

    /* JADX INFO: renamed from: c */
    private int[] f9083c = new int[1000];

    /* JADX INFO: renamed from: d */
    private long[] f9084d = new long[1000];

    /* JADX INFO: renamed from: g */
    private long[] f9087g = new long[1000];

    /* JADX INFO: renamed from: f */
    private int[] f9086f = new int[1000];

    /* JADX INFO: renamed from: e */
    private int[] f9085e = new int[1000];

    /* JADX INFO: renamed from: h */
    private InterfaceC1574m.a[] f9088h = new InterfaceC1574m.a[1000];

    /* JADX INFO: renamed from: i */
    private C1753m[] f9089i = new C1753m[1000];

    /* JADX INFO: renamed from: n */
    private long f9094n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: o */
    private long f9095o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    private boolean f9097q = true;

    /* JADX INFO: renamed from: p */
    private boolean f9096p = true;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.w$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f9100a;

        /* JADX INFO: renamed from: b */
        public long f9101b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1574m.a f9102c;
    }

    /* JADX INFO: renamed from: a */
    private int m7492a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f9087g[i] <= j; i4++) {
            if (!z || (this.f9086f[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f9082b) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m7493b(long j) {
        this.f9095o = Math.max(this.f9095o, j);
    }

    /* JADX INFO: renamed from: d */
    private long m7494d(int i) {
        this.f9094n = Math.max(this.f9094n, m7495e(i));
        int i2 = this.f9090j - i;
        this.f9090j = i2;
        this.f9091k += i;
        int i3 = this.f9092l + i;
        this.f9092l = i3;
        int i4 = this.f9082b;
        if (i3 >= i4) {
            this.f9092l = i3 - i4;
        }
        int i5 = this.f9093m - i;
        this.f9093m = i5;
        if (i5 < 0) {
            this.f9093m = 0;
        }
        if (i2 != 0) {
            return this.f9084d[this.f9092l];
        }
        int i6 = this.f9092l;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.f9084d[i7] + ((long) this.f9085e[i7]);
    }

    /* JADX INFO: renamed from: e */
    private long m7495e(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM7496f = m7496f(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f9087g[iM7496f]);
            if ((this.f9086f[iM7496f] & 1) != 0) {
                break;
            }
            iM7496f--;
            if (iM7496f == -1) {
                iM7496f = this.f9082b - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: f */
    private int m7496f(int i) {
        int i2 = this.f9092l + i;
        int i3 = this.f9082b;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m7497a(long j, boolean z) {
        int iM7496f = m7496f(this.f9093m);
        if (m7511f() && j >= this.f9087g[iM7496f] && (j <= this.f9095o || z)) {
            int iM7492a = m7492a(iM7496f, this.f9090j - this.f9093m, j, true);
            if (iM7492a == -1) {
                return -1;
            }
            this.f9093m += iM7492a;
            return iM7492a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m7498a(C1754n c1754n, C1527e c1527e, boolean z, boolean z3, C1753m c1753m, a aVar) {
        if (!m7511f()) {
            if (z3) {
                c1527e.m6638a(4);
                return -4;
            }
            C1753m c1753m2 = this.f9098r;
            if (c1753m2 == null || (!z && c1753m2 == c1753m)) {
                return -3;
            }
            c1754n.f9990a = c1753m2;
            return -5;
        }
        int iM7496f = m7496f(this.f9093m);
        if (!z && this.f9089i[iM7496f] == c1753m) {
            if (c1527e.m6661f()) {
                return -3;
            }
            c1527e.f7880f = this.f9087g[iM7496f];
            c1527e.m6638a(this.f9086f[iM7496f]);
            aVar.f9100a = this.f9085e[iM7496f];
            aVar.f9101b = this.f9084d[iM7496f];
            aVar.f9102c = this.f9088h[iM7496f];
            this.f9093m++;
            return -4;
        }
        c1754n.f9990a = this.f9089i[iM7496f];
        return -5;
    }

    /* JADX INFO: renamed from: a */
    public final long m7499a(int i) {
        int iM7505b = m7505b() - i;
        C1711a.m8010a(iM7505b >= 0 && iM7505b <= this.f9090j - this.f9093m);
        int i2 = this.f9090j - iM7505b;
        this.f9090j = i2;
        this.f9095o = Math.max(this.f9094n, m7495e(i2));
        int i3 = this.f9090j;
        if (i3 == 0) {
            return 0L;
        }
        int iM7496f = m7496f(i3 - 1);
        return this.f9084d[iM7496f] + ((long) this.f9085e[iM7496f]);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m7500a(long j, boolean z, boolean z3) {
        int i;
        int i2 = this.f9090j;
        if (i2 != 0) {
            long[] jArr = this.f9087g;
            int i3 = this.f9092l;
            if (j >= jArr[i3]) {
                if (z3 && (i = this.f9093m) != i2) {
                    i2 = i + 1;
                }
                int iM7492a = m7492a(i3, i2, j, z);
                if (iM7492a == -1) {
                    return -1L;
                }
                return m7494d(iM7492a);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public final void m7501a() {
        this.f9090j = 0;
        this.f9091k = 0;
        this.f9092l = 0;
        this.f9093m = 0;
        this.f9096p = true;
        this.f9094n = Long.MIN_VALUE;
        this.f9095o = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7502a(long j, int i, long j2, int i2, InterfaceC1574m.a aVar) {
        if (this.f9096p) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f9096p = false;
            }
        }
        C1711a.m8012b(!this.f9097q);
        m7493b(j);
        int iM7496f = m7496f(this.f9090j);
        this.f9087g[iM7496f] = j;
        long[] jArr = this.f9084d;
        jArr[iM7496f] = j2;
        this.f9085e[iM7496f] = i2;
        this.f9086f[iM7496f] = i;
        this.f9088h[iM7496f] = aVar;
        this.f9089i[iM7496f] = this.f9098r;
        this.f9083c[iM7496f] = this.f9099s;
        int i3 = this.f9090j + 1;
        this.f9090j = i3;
        int i4 = this.f9082b;
        if (i3 == i4) {
            int i5 = i4 + 1000;
            int[] iArr = new int[i5];
            long[] jArr2 = new long[i5];
            long[] jArr3 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            InterfaceC1574m.a[] aVarArr = new InterfaceC1574m.a[i5];
            C1753m[] c1753mArr = new C1753m[i5];
            int i6 = this.f9092l;
            int i7 = i4 - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i7);
            System.arraycopy(this.f9087g, this.f9092l, jArr3, 0, i7);
            System.arraycopy(this.f9086f, this.f9092l, iArr2, 0, i7);
            System.arraycopy(this.f9085e, this.f9092l, iArr3, 0, i7);
            System.arraycopy(this.f9088h, this.f9092l, aVarArr, 0, i7);
            System.arraycopy(this.f9089i, this.f9092l, c1753mArr, 0, i7);
            System.arraycopy(this.f9083c, this.f9092l, iArr, 0, i7);
            int i8 = this.f9092l;
            System.arraycopy(this.f9084d, 0, jArr2, i7, i8);
            System.arraycopy(this.f9087g, 0, jArr3, i7, i8);
            System.arraycopy(this.f9086f, 0, iArr2, i7, i8);
            System.arraycopy(this.f9085e, 0, iArr3, i7, i8);
            System.arraycopy(this.f9088h, 0, aVarArr, i7, i8);
            System.arraycopy(this.f9089i, 0, c1753mArr, i7, i8);
            System.arraycopy(this.f9083c, 0, iArr, i7, i8);
            this.f9084d = jArr2;
            this.f9087g = jArr3;
            this.f9086f = iArr2;
            this.f9085e = iArr3;
            this.f9088h = aVarArr;
            this.f9089i = c1753mArr;
            this.f9083c = iArr;
            this.f9092l = 0;
            this.f9090j = this.f9082b;
            this.f9082b = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m7503a(long j) {
        if (this.f9090j == 0) {
            return j > this.f9094n;
        }
        if (Math.max(this.f9094n, m7495e(this.f9093m)) >= j) {
            return false;
        }
        int i = this.f9090j;
        int iM7496f = m7496f(i - 1);
        while (i > this.f9093m && this.f9087g[iM7496f] >= j) {
            i--;
            iM7496f--;
            if (iM7496f == -1) {
                iM7496f = this.f9082b - 1;
            }
        }
        m7499a(this.f9091k + i);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m7504a(C1753m c1753m) {
        if (c1753m == null) {
            this.f9097q = true;
            return false;
        }
        this.f9097q = false;
        if (C1717af.m8085a(c1753m, this.f9098r)) {
            return false;
        }
        this.f9098r = c1753m;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m7505b() {
        return this.f9091k + this.f9090j;
    }

    /* JADX INFO: renamed from: b */
    public final void m7506b(int i) {
        this.f9099s = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m7507c() {
        return this.f9091k;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m7508c(int i) {
        boolean z;
        int i2 = this.f9091k;
        if (i2 > i || i > this.f9090j + i2) {
            z = false;
        } else {
            this.f9093m = i - i2;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final int m7509d() {
        return this.f9091k + this.f9093m;
    }

    /* JADX INFO: renamed from: e */
    public final int m7510e() {
        return m7511f() ? this.f9083c[m7496f(this.f9093m)] : this.f9099s;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m7511f() {
        return this.f9093m != this.f9090j;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized C1753m m7512g() {
        if (this.f9097q) {
            return null;
        }
        return this.f9098r;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized long m7513h() {
        return this.f9095o;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized long m7514i() {
        if (this.f9090j == 0) {
            return Long.MIN_VALUE;
        }
        return this.f9087g[this.f9092l];
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m7515j() {
        this.f9093m = 0;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized int m7516k() {
        int i;
        int i2 = this.f9090j;
        i = i2 - this.f9093m;
        this.f9093m = i2;
        return i;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized long m7517l() {
        int i = this.f9093m;
        if (i == 0) {
            return -1L;
        }
        return m7494d(i);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized long m7518m() {
        int i = this.f9090j;
        if (i == 0) {
            return -1L;
        }
        return m7494d(i);
    }
}
