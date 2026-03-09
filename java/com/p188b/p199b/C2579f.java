package com.p188b.p199b;

import android.support.v4.media.session.PlaybackStateCompat;
import com.anythink.expressad.exoplayer.C1500b;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.io.EOFException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.b.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2579f implements InterfaceC2580g, InterfaceC2581h, Cloneable {

    /* JADX INFO: renamed from: c */
    private static final byte[] f15818c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a */
    public C2593t f15819a;

    /* JADX INFO: renamed from: b */
    public long f15820b;

    /* JADX INFO: renamed from: a */
    private String m12990a(long j, Charset charset) {
        C2574aa.m12985a(this.f15820b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        C2593t c2593t = this.f15819a;
        if (((long) c2593t.f15850b) + j > c2593t.f15851c) {
            return new String(mo13020e(j), charset);
        }
        String str = new String(c2593t.f15849a, c2593t.f15850b, (int) j, charset);
        int i = (int) (((long) c2593t.f15850b) + j);
        c2593t.f15850b = i;
        this.f15820b -= j;
        if (i == c2593t.f15851c) {
            this.f15819a = c2593t.m13078a();
            C2594u.m13082a(c2593t);
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    private void m12991c(byte[] bArr) throws EOFException {
        int iMin;
        int i = 0;
        while (i < bArr.length) {
            int length = bArr.length - i;
            C2574aa.m12985a(bArr.length, i, length);
            C2593t c2593t = this.f15819a;
            if (c2593t == null) {
                iMin = -1;
            } else {
                iMin = Math.min(length, c2593t.f15851c - c2593t.f15850b);
                System.arraycopy(c2593t.f15849a, c2593t.f15850b, bArr, i, iMin);
                int i2 = c2593t.f15850b + iMin;
                c2593t.f15850b = i2;
                this.f15820b -= (long) iMin;
                if (i2 == c2593t.f15851c) {
                    this.f15819a = c2593t.m13078a();
                    C2594u.m13082a(c2593t);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i += iMin;
        }
    }

    /* JADX INFO: renamed from: k */
    private String m12992k(long j) {
        return m12990a(j, C2574aa.f15811a);
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: a */
    public final long mo12993a(byte b) {
        return m12994a(b, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final long m12994a(byte b, long j) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C2593t c2593t = this.f15819a;
        if (c2593t == null) {
            return -1L;
        }
        long j3 = this.f15820b;
        if (j3 - j < j) {
            while (j3 > j) {
                c2593t = c2593t.f15855g;
                j3 -= (long) (c2593t.f15851c - c2593t.f15850b);
            }
        } else {
            while (true) {
                long j4 = ((long) (c2593t.f15851c - c2593t.f15850b)) + j2;
                if (j4 >= j) {
                    break;
                }
                c2593t = c2593t.f15854f;
                j2 = j4;
            }
            j3 = j2;
        }
        while (j3 < this.f15820b) {
            byte[] bArr = c2593t.f15849a;
            int i = c2593t.f15851c;
            for (int i2 = (int) ((((long) c2593t.f15850b) + j) - j3); i2 < i; i2++) {
                if (bArr[i2] == b) {
                    return ((long) (i2 - c2593t.f15850b)) + j3;
                }
            }
            j3 += (long) (c2593t.f15851c - c2593t.f15850b);
            c2593t = c2593t.f15854f;
            j = j3;
        }
        return -1L;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) {
        if (c2579f == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        long j2 = this.f15820b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c2579f.mo12633a_(this, j);
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final long m12995a(InterfaceC2597x interfaceC2597x) {
        if (interfaceC2597x == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long jMo12513a = interfaceC2597x.mo12513a(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jMo12513a == -1) {
                return j;
            }
            j += jMo12513a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2579f m12996a(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    i2 = (i >> 12) | 224;
                } else {
                    if (i > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    mo13028h((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                mo13028h(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            mo13028h(i3);
            i = (i & 63) | 128;
        }
        mo13028h(i);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2579f m12997a(C2579f c2579f, long j, long j2) {
        if (c2579f == null) {
            throw new IllegalArgumentException("out == null");
        }
        C2574aa.m12985a(this.f15820b, j, j2);
        if (j2 == 0) {
            return this;
        }
        c2579f.f15820b += j2;
        C2593t c2593t = this.f15819a;
        while (true) {
            int i = c2593t.f15851c;
            int i2 = c2593t.f15850b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c2593t = c2593t.f15854f;
        }
        while (j2 > 0) {
            C2593t c2593t2 = new C2593t(c2593t);
            int i3 = (int) (((long) c2593t2.f15850b) + j);
            c2593t2.f15850b = i3;
            c2593t2.f15851c = Math.min(i3 + ((int) j2), c2593t2.f15851c);
            C2593t c2593t3 = c2579f.f15819a;
            if (c2593t3 == null) {
                c2593t2.f15855g = c2593t2;
                c2593t2.f15854f = c2593t2;
                c2579f.f15819a = c2593t2;
            } else {
                c2593t3.f15855g.m13079a(c2593t2);
            }
            j2 -= (long) (c2593t2.f15851c - c2593t2.f15850b);
            c2593t = c2593t.f15854f;
            j = 0;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2579f m12998a(C2582i c2582i) {
        if (c2582i == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c2582i.mo13048a(this);
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: a */
    public final C2579f mo13008b(String str) {
        return m13000a(str, 0, str.length());
    }

    /* JADX INFO: renamed from: a */
    public final C2579f m13000a(String str, int i, int i2) {
        char cCharAt;
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C2593t c2593tM13019e = m13019e(1);
                byte[] bArr = c2593tM13019e.f15849a;
                int i4 = c2593tM13019e.f15851c - i;
                int iMin = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) cCharAt2;
                while (true) {
                    i = i5;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[i + i4] = (byte) cCharAt;
                }
                int i6 = c2593tM13019e.f15851c;
                int i7 = (i4 + i) - i6;
                c2593tM13019e.f15851c = i6 + i7;
                this.f15820b += (long) i7;
            } else {
                if (cCharAt2 < 2048) {
                    i3 = (cCharAt2 >> 6) | 192;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    mo13028h((cCharAt2 >> '\f') | 224);
                    i3 = ((cCharAt2 >> 6) & 63) | 128;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        mo13028h(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        mo13028h((i9 >> 18) | 240);
                        mo13028h(((i9 >> 12) & 63) | 128);
                        mo13028h(((i9 >> 6) & 63) | 128);
                        mo13028h((i9 & 63) | 128);
                        i += 2;
                    }
                }
                mo13028h(i3);
                mo13028h((cCharAt2 & '?') | 128);
                i++;
            }
        }
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: a */
    public final C2579f mo13009b(byte[] bArr) {
        if (bArr != null) {
            return mo13010b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: a */
    public final C2579f mo13010b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C2574aa.m12985a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2593t c2593tM13019e = m13019e(1);
            int iMin = Math.min(i3 - i, 8192 - c2593tM13019e.f15851c);
            System.arraycopy(bArr, i, c2593tM13019e.f15849a, c2593tM13019e.f15851c, iMin);
            i += iMin;
            c2593tM13019e.f15851c += iMin;
        }
        this.f15820b += j;
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return C2598y.f15860b;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: a */
    public final String mo13003a(Charset charset) {
        try {
            return m12990a(this.f15820b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: a */
    public final void mo13004a(long j) throws EOFException {
        if (this.f15820b < j) {
            throw new EOFException();
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) {
        C2593t c2593tM13081a;
        if (c2579f == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c2579f == this) {
            throw new IllegalArgumentException("source == this");
        }
        C2574aa.m12985a(c2579f.f15820b, 0L, j);
        while (j > 0) {
            C2593t c2593t = c2579f.f15819a;
            int i = c2593t.f15851c;
            int i2 = c2593t.f15850b;
            if (j < i - i2) {
                C2593t c2593t2 = this.f15819a;
                C2593t c2593t3 = c2593t2 != null ? c2593t2.f15855g : null;
                if (c2593t3 != null && c2593t3.f15853e) {
                    if ((((long) c2593t3.f15851c) + j) - ((long) (c2593t3.f15852d ? 0 : c2593t3.f15850b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        c2593t.m13080a(c2593t3, (int) j);
                        c2579f.f15820b -= j;
                        this.f15820b += j;
                        return;
                    }
                }
                int i3 = (int) j;
                if (i3 <= 0 || i3 > i - i2) {
                    throw new IllegalArgumentException();
                }
                if (i3 >= 1024) {
                    c2593tM13081a = new C2593t(c2593t);
                } else {
                    c2593tM13081a = C2594u.m13081a();
                    System.arraycopy(c2593t.f15849a, c2593t.f15850b, c2593tM13081a.f15849a, 0, i3);
                }
                c2593tM13081a.f15851c = c2593tM13081a.f15850b + i3;
                c2593t.f15850b += i3;
                c2593t.f15855g.m13079a(c2593tM13081a);
                c2579f.f15819a = c2593tM13081a;
            }
            C2593t c2593t4 = c2579f.f15819a;
            long j2 = c2593t4.f15851c - c2593t4.f15850b;
            c2579f.f15819a = c2593t4.m13078a();
            C2593t c2593t5 = this.f15819a;
            if (c2593t5 == null) {
                this.f15819a = c2593t4;
                c2593t4.f15855g = c2593t4;
                c2593t4.f15854f = c2593t4;
            } else {
                C2593t c2593tM13079a = c2593t5.f15855g.m13079a(c2593t4);
                C2593t c2593t6 = c2593tM13079a.f15855g;
                if (c2593t6 == c2593tM13079a) {
                    throw new IllegalStateException();
                }
                if (c2593t6.f15853e) {
                    int i4 = c2593tM13079a.f15851c - c2593tM13079a.f15850b;
                    if (i4 <= (8192 - c2593t6.f15851c) + (c2593t6.f15852d ? 0 : c2593t6.f15850b)) {
                        c2593tM13079a.m13080a(c2593t6, i4);
                        c2593tM13079a.m13078a();
                        C2594u.m13082a(c2593tM13079a);
                    }
                }
            }
            c2579f.f15820b -= j2;
            this.f15820b += j2;
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte m13005b(long j) {
        C2574aa.m12985a(this.f15820b, j, 1L);
        C2593t c2593t = this.f15819a;
        while (true) {
            int i = c2593t.f15851c;
            int i2 = c2593t.f15850b;
            long j2 = i - i2;
            if (j < j2) {
                return c2593t.f15849a[i2 + ((int) j)];
            }
            j -= j2;
            c2593t = c2593t.f15854f;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m13006b() {
        return this.f15820b;
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: b */
    public final C2579f mo13028h(int i) {
        C2593t c2593tM13019e = m13019e(1);
        byte[] bArr = c2593tM13019e.f15849a;
        int i2 = c2593tM13019e.f15851c;
        c2593tM13019e.f15851c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f15820b++;
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: b */
    public final boolean mo13011b(C2582i c2582i) {
        int iMo13056g = c2582i.mo13056g();
        if (iMo13056g < 0 || this.f15820b - 0 < iMo13056g || c2582i.mo13056g() - 0 < iMo13056g) {
            return false;
        }
        for (int i = 0; i < iMo13056g; i++) {
            if (m13005b(((long) i) + 0) != c2582i.mo13045a(i + 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p188b.p199b.InterfaceC2580g, com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: c */
    public final C2579f mo13012c() {
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: c */
    public final C2579f mo13026g(int i) {
        C2593t c2593tM13019e = m13019e(2);
        byte[] bArr = c2593tM13019e.f15849a;
        int i2 = c2593tM13019e.f15851c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        c2593tM13019e.f15851c = i3 + 1;
        this.f15820b += 2;
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: c */
    public final C2582i mo13014c(long j) {
        return new C2582i(mo13020e(j));
    }

    public final /* synthetic */ Object clone() {
        C2579f c2579f = new C2579f();
        if (this.f15820b == 0) {
            return c2579f;
        }
        C2593t c2593t = new C2593t(this.f15819a);
        c2579f.f15819a = c2593t;
        c2593t.f15855g = c2593t;
        c2593t.f15854f = c2593t;
        C2593t c2593t2 = this.f15819a;
        while (true) {
            c2593t2 = c2593t2.f15854f;
            if (c2593t2 == this.f15819a) {
                c2579f.f15820b = this.f15820b;
                return c2579f;
            }
            c2579f.f15819a.f15855g.m13079a(new C2593t(c2593t2));
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: d */
    public final C2579f mo13021f(int i) {
        C2593t c2593tM13019e = m13019e(4);
        byte[] bArr = c2593tM13019e.f15849a;
        int i2 = c2593tM13019e.f15851c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        c2593tM13019e.f15851c = i5 + 1;
        this.f15820b += 4;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001c  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m13016d(long r7) throws java.io.EOFException {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            long r2 = r7 - r0
            byte r4 = r6.m13005b(r2)
            r5 = 13
            if (r4 != r5) goto L1c
            java.lang.String r7 = r6.m12992k(r2)
            r0 = 2
        L18:
            r6.mo13023f(r0)
            return r7
        L1c:
            java.lang.String r7 = r6.m12992k(r7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p199b.C2579f.m13016d(long):java.lang.String");
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: d */
    public final boolean mo13017d() {
        return this.f15820b == 0;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: e */
    public final byte mo13018e() {
        long j = this.f15820b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C2593t c2593t = this.f15819a;
        int i = c2593t.f15850b;
        int i2 = c2593t.f15851c;
        int i3 = i + 1;
        byte b = c2593t.f15849a[i];
        this.f15820b = j - 1;
        if (i3 == i2) {
            this.f15819a = c2593t.m13078a();
            C2594u.m13082a(c2593t);
        } else {
            c2593t.f15850b = i3;
        }
        return b;
    }

    /* JADX INFO: renamed from: e */
    public final C2593t m13019e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2593t c2593t = this.f15819a;
        if (c2593t != null) {
            C2593t c2593t2 = c2593t.f15855g;
            return (c2593t2.f15851c + i > 8192 || !c2593t2.f15853e) ? c2593t2.m13079a(C2594u.m13081a()) : c2593t2;
        }
        C2593t c2593tM13081a = C2594u.m13081a();
        this.f15819a = c2593tM13081a;
        c2593tM13081a.f15855g = c2593tM13081a;
        c2593tM13081a.f15854f = c2593tM13081a;
        return c2593tM13081a;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: e */
    public final byte[] mo13020e(long j) throws EOFException {
        C2574aa.m12985a(this.f15820b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        m12991c(bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2579f)) {
            return false;
        }
        C2579f c2579f = (C2579f) obj;
        long j = this.f15820b;
        if (j != c2579f.f15820b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2593t c2593t = this.f15819a;
        C2593t c2593t2 = c2579f.f15819a;
        int i = c2593t.f15850b;
        int i2 = c2593t2.f15850b;
        while (j2 < this.f15820b) {
            long jMin = Math.min(c2593t.f15851c - i, c2593t2.f15851c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c2593t.f15849a[i] != c2593t2.f15849a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c2593t.f15851c) {
                c2593t = c2593t.f15854f;
                i = c2593t.f15850b;
            }
            if (i2 == c2593t2.f15851c) {
                c2593t2 = c2593t2.f15854f;
                i2 = c2593t2.f15850b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: f */
    public final short mo13022f() {
        long j = this.f15820b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f15820b);
        }
        C2593t c2593t = this.f15819a;
        int i = c2593t.f15850b;
        int i2 = c2593t.f15851c;
        if (i2 - i < 2) {
            return (short) (((mo13018e() & 255) << 8) | (mo13018e() & 255));
        }
        byte[] bArr = c2593t.f15849a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f15820b = j - 2;
        if (i4 == i2) {
            this.f15819a = c2593t.m13078a();
            C2594u.m13082a(c2593t);
        } else {
            c2593t.f15850b = i4;
        }
        return (short) i5;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: f */
    public final void mo13023f(long j) throws EOFException {
        while (j > 0) {
            if (this.f15819a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.f15851c - r0.f15850b);
            long j2 = iMin;
            this.f15820b -= j2;
            j -= j2;
            C2593t c2593t = this.f15819a;
            int i = c2593t.f15850b + iMin;
            c2593t.f15850b = i;
            if (i == c2593t.f15851c) {
                this.f15819a = c2593t.m13078a();
                C2594u.m13082a(c2593t);
            }
        }
    }

    @Override // com.p188b.p199b.InterfaceC2580g, com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final void flush() {
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: g */
    public final int mo13024g() {
        long j = this.f15820b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f15820b);
        }
        C2593t c2593t = this.f15819a;
        int i = c2593t.f15850b;
        int i2 = c2593t.f15851c;
        if (i2 - i < 4) {
            return ((mo13018e() & 255) << 24) | ((mo13018e() & 255) << 16) | ((mo13018e() & 255) << 8) | (mo13018e() & 255);
        }
        byte[] bArr = c2593t.f15849a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f15820b = j - 4;
        if (i8 == i2) {
            this.f15819a = c2593t.m13078a();
            C2594u.m13082a(c2593t);
        } else {
            c2593t.f15850b = i8;
        }
        return i9;
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: g */
    public final C2579f mo13033j(long j) {
        if (j == 0) {
            return mo13028h(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return mo13008b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < C1500b.f7492h ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= UMAmapConfig.AMAP_CACHE_WRITE_TIME) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C2593t c2593tM13019e = m13019e(i);
        byte[] bArr = c2593tM13019e.f15849a;
        int i2 = c2593tM13019e.f15851c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f15818c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c2593tM13019e.f15851c += i;
        this.f15820b += (long) i;
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: h */
    public final C2579f mo13031i(long j) {
        if (j == 0) {
            return mo13028h(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2593t c2593tM13019e = m13019e(iNumberOfTrailingZeros);
        byte[] bArr = c2593tM13019e.f15849a;
        int i = c2593tM13019e.f15851c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f15818c[(int) (15 & j)];
            j >>>= 4;
        }
        c2593tM13019e.f15851c += iNumberOfTrailingZeros;
        this.f15820b += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: h */
    public final short mo13029h() {
        return C2574aa.m12984a(mo13022f());
    }

    public final int hashCode() {
        C2593t c2593t = this.f15819a;
        if (c2593t == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2593t.f15851c;
            for (int i3 = c2593t.f15850b; i3 < i2; i3++) {
                i = (i * 31) + c2593t.f15849a[i3];
            }
            c2593t = c2593t.f15854f;
        } while (c2593t != this.f15819a);
        return i;
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: i */
    public final int mo13030i() {
        return C2574aa.m12983a(mo13024g());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009f A[EDGE_INSN: B:94:0x009f->B:88:0x009f BREAK  A[LOOP:0: B:55:0x000b->B:96:?], SYNTHETIC] */
    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo13032j() {
        /*
            r15 = this;
            long r0 = r15.f15820b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La6
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            com.b.b.t r6 = r15.f15819a
            byte[] r7 = r6.f15849a
            int r8 = r6.f15850b
            int r9 = r6.f15851c
        L13:
            if (r8 >= r9) goto L8b
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L6f
            r11 = 70
            if (r10 > r11) goto L6f
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            com.b.b.f r0 = new com.b.b.f
            r0.<init>()
            com.b.b.f r0 = r0.mo13031i(r4)
            com.b.b.f r0 = r0.mo13028h(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.m13035l()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            if (r0 == 0) goto L73
            r1 = 1
            goto L8b
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8b:
            if (r8 != r9) goto L97
            com.b.b.t r7 = r6.m13078a()
            r15.f15819a = r7
            com.p188b.p199b.C2594u.m13082a(r6)
            goto L99
        L97:
            r6.f15850b = r8
        L99:
            if (r1 != 0) goto L9f
            com.b.b.t r6 = r15.f15819a
            if (r6 != 0) goto Lb
        L9f:
            long r1 = r15.f15820b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f15820b = r1
            return r4
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p199b.C2579f.mo13032j():long");
    }

    /* JADX INFO: renamed from: k */
    public final C2582i m13034k() {
        return new C2582i(m13037n());
    }

    /* JADX INFO: renamed from: l */
    public final String m13035l() {
        try {
            return m12990a(this.f15820b, C2574aa.f15811a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: m */
    public final String mo13036m() throws EOFException {
        long jM12994a = m12994a((byte) 10, 0L);
        if (jM12994a != -1) {
            return m13016d(jM12994a);
        }
        C2579f c2579f = new C2579f();
        m12997a(c2579f, 0L, Math.min(32L, this.f15820b));
        throw new EOFException("\\n not found: size=" + this.f15820b + " content=" + c2579f.m13034k().mo13054e() + "…");
    }

    /* JADX INFO: renamed from: n */
    public final byte[] m13037n() {
        try {
            return mo13020e(this.f15820b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m13038o() {
        try {
            mo13023f(this.f15820b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ InterfaceC2580g mo13039p() {
        return this;
    }

    public final String toString() {
        long j = this.f15820b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? C2582i.f15822b : new C2595v(this, i)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f15820b);
    }
}
