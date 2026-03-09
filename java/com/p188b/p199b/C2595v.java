package com.p188b.p199b;

import java.util.Arrays;

/* JADX INFO: renamed from: com.b.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2595v extends C2582i {

    /* JADX INFO: renamed from: f */
    public final transient byte[][] f15858f;

    /* JADX INFO: renamed from: g */
    public final transient int[] f15859g;

    public C2595v(C2579f c2579f, int i) {
        super(null);
        C2574aa.m12985a(c2579f.f15820b, 0L, i);
        C2593t c2593t = c2579f.f15819a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c2593t.f15851c;
            int i6 = c2593t.f15850b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c2593t = c2593t.f15854f;
        }
        this.f15858f = new byte[i4][];
        this.f15859g = new int[i4 * 2];
        C2593t c2593t2 = c2579f.f15819a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f15858f;
            bArr[i7] = c2593t2.f15849a;
            int i8 = c2593t2.f15851c;
            int i9 = c2593t2.f15850b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f15859g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c2593t2.f15852d = true;
            i7++;
            c2593t2 = c2593t2.f15854f;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m13083b(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f15859g, 0, this.f15858f.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* JADX INFO: renamed from: i */
    private C2582i m13084i() {
        return new C2582i(mo13057h());
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: a */
    public final byte mo13045a(int i) {
        C2574aa.m12985a(this.f15859g[this.f15858f.length - 1], i, 1L);
        int iM13083b = m13083b(i);
        int i2 = iM13083b == 0 ? 0 : this.f15859g[iM13083b - 1];
        int[] iArr = this.f15859g;
        byte[][] bArr = this.f15858f;
        return bArr[iM13083b][(i - i2) + iArr[bArr.length + iM13083b]];
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: a */
    public final C2582i mo13046a(int i, int i2) {
        return m13084i().mo13046a(i, i2);
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: a */
    public final String mo13047a() {
        return m13084i().mo13047a();
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: a */
    public final void mo13048a(C2579f c2579f) {
        int length = this.f15858f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f15859g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C2593t c2593t = new C2593t(this.f15858f[i], i3, (i3 + i4) - i2);
            C2593t c2593t2 = c2579f.f15819a;
            if (c2593t2 == null) {
                c2593t.f15855g = c2593t;
                c2593t.f15854f = c2593t;
                c2579f.f15819a = c2593t;
            } else {
                c2593t2.f15855g.m13079a(c2593t);
            }
            i++;
            i2 = i4;
        }
        c2579f.f15820b += (long) i2;
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: a */
    public final boolean mo13049a(int i, C2582i c2582i, int i2, int i3) {
        if (mo13056g() - i3 < 0) {
            return false;
        }
        int iM13083b = m13083b(0);
        while (i3 > 0) {
            int i4 = iM13083b == 0 ? 0 : this.f15859g[iM13083b - 1];
            int iMin = Math.min(i3, ((this.f15859g[iM13083b] - i4) + i4) - i);
            int[] iArr = this.f15859g;
            byte[][] bArr = this.f15858f;
            if (!c2582i.mo13050a(i2, bArr[iM13083b], (i - i4) + iArr[bArr.length + iM13083b], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM13083b++;
        }
        return true;
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: a */
    public final boolean mo13050a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo13056g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iM13083b = m13083b(i);
        while (i3 > 0) {
            int i4 = iM13083b == 0 ? 0 : this.f15859g[iM13083b - 1];
            int iMin = Math.min(i3, ((this.f15859g[iM13083b] - i4) + i4) - i);
            int[] iArr = this.f15859g;
            byte[][] bArr2 = this.f15858f;
            if (!C2574aa.m12987a(bArr2[iM13083b], (i - i4) + iArr[bArr2.length + iM13083b], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM13083b++;
        }
        return true;
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: b */
    public final String mo13051b() {
        return m13084i().mo13051b();
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: c */
    public final C2582i mo13052c() {
        return m13084i().mo13052c();
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: d */
    public final C2582i mo13053d() {
        return m13084i().mo13053d();
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: e */
    public final String mo13054e() {
        return m13084i().mo13054e();
    }

    @Override // com.p188b.p199b.C2582i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2582i) {
            C2582i c2582i = (C2582i) obj;
            if (c2582i.mo13056g() == mo13056g() && mo13049a(0, c2582i, 0, mo13056g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: f */
    public final C2582i mo13055f() {
        return m13084i().mo13055f();
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: g */
    public final int mo13056g() {
        return this.f15859g[this.f15858f.length - 1];
    }

    @Override // com.p188b.p199b.C2582i
    /* JADX INFO: renamed from: h */
    public final byte[] mo13057h() {
        int[] iArr = this.f15859g;
        byte[][] bArr = this.f15858f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f15859g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f15858f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.p188b.p199b.C2582i
    public final int hashCode() {
        int i = this.f15824d;
        if (i != 0) {
            return i;
        }
        int length = this.f15858f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f15858f[i2];
            int[] iArr = this.f15859g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f15824d = i4;
        return i4;
    }

    @Override // com.p188b.p199b.C2582i
    public final String toString() {
        return m13084i().toString();
    }
}
