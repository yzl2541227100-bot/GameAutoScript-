package com.anythink.expressad.exoplayer.p107k;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1736s {

    /* JADX INFO: renamed from: a */
    public byte[] f9792a;

    /* JADX INFO: renamed from: b */
    private int f9793b;

    /* JADX INFO: renamed from: c */
    private int f9794c;

    public C1736s() {
    }

    public C1736s(int i) {
        this.f9792a = new byte[i];
        this.f9794c = i;
    }

    public C1736s(byte[] bArr) {
        this.f9792a = bArr;
        this.f9794c = bArr.length;
    }

    public C1736s(byte[] bArr, int i) {
        this.f9792a = bArr;
        this.f9794c = i;
    }

    /* JADX INFO: renamed from: A */
    private int m8245A() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.f9793b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f9793b = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: B */
    private long m8246B() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        this.f9793b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        this.f9793b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        this.f9793b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        this.f9793b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        this.f9793b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        this.f9793b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f9793b = i8 + 1;
        return j7 | ((((long) bArr[i8]) & 255) << 56);
    }

    /* JADX INFO: renamed from: C */
    private int m8247C() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.f9793b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f9793b = i6 + 1;
        int i8 = ((bArr[i6] & 255) << 24) | i7;
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i8)));
    }

    /* JADX INFO: renamed from: D */
    private float m8248D() {
        return Float.intBitsToFloat(m8280i());
    }

    /* JADX INFO: renamed from: E */
    private double m8249E() {
        return Double.longBitsToDouble(m8281j());
    }

    /* JADX INFO: renamed from: F */
    private String m8250F() {
        if (m8265a() == 0) {
            return null;
        }
        int i = this.f9793b;
        while (i < this.f9794c && !C1717af.m8082a((int) this.f9792a[i])) {
            i++;
        }
        int i2 = this.f9793b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f9792a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f9793b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f9792a;
        int i3 = this.f9793b;
        String strM8069a = C1717af.m8069a(bArr2, i3, i - i3);
        this.f9793b = i;
        int i4 = this.f9794c;
        if (i == i4) {
            return strM8069a;
        }
        byte[] bArr3 = this.f9792a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f9793b = i5;
            if (i5 == i4) {
                return strM8069a;
            }
        }
        int i6 = this.f9793b;
        if (bArr3[i6] == 10) {
            this.f9793b = i6 + 1;
        }
        return strM8069a;
    }

    /* JADX INFO: renamed from: G */
    private long m8251G() {
        int i;
        int i2;
        long j = this.f9792a[this.f9793b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j)));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f9792a[this.f9793b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j)));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f9793b += i2;
        return j;
    }

    /* JADX INFO: renamed from: a */
    private String m8252a(Charset charset) {
        String str = new String(this.f9792a, this.f9793b, 4, charset);
        this.f9793b += 4;
        return str;
    }

    /* JADX INFO: renamed from: a */
    private void m8253a(C1735r c1735r, int i) {
        m8268a(c1735r.f9788a, 0, i);
        c1735r.m8236a(0);
    }

    /* JADX INFO: renamed from: a */
    private void m8254a(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f9792a, this.f9793b, i);
        this.f9793b += i;
    }

    /* JADX INFO: renamed from: q */
    private void m8255q() {
        this.f9793b = 0;
        this.f9794c = 0;
    }

    /* JADX INFO: renamed from: r */
    private int m8256r() {
        byte[] bArr = this.f9792a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: s */
    private int m8257s() {
        return this.f9792a[this.f9793b] & 255;
    }

    /* JADX INFO: renamed from: t */
    private char m8258t() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: u */
    private int m8259u() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = bArr[i] & 255;
        this.f9793b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: v */
    private short m8260v() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = bArr[i] & 255;
        this.f9793b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: w */
    private int m8261w() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.f9793b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: x */
    private int m8262x() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.f9793b = i4 + 1;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    /* JADX INFO: renamed from: y */
    private int m8263y() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.f9793b = i4 + 1;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    /* JADX INFO: renamed from: z */
    private long m8264z() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        this.f9793b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        this.f9793b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f9793b = i4 + 1;
        return j3 | ((((long) bArr[i4]) & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    public final int m8265a() {
        return this.f9794c - this.f9793b;
    }

    /* JADX INFO: renamed from: a */
    public final void m8266a(int i) {
        byte[] bArr = this.f9792a;
        if ((bArr == null ? 0 : bArr.length) < i) {
            bArr = new byte[i];
        }
        m8267a(bArr, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m8267a(byte[] bArr, int i) {
        this.f9792a = bArr;
        this.f9794c = i;
        this.f9793b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m8268a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f9792a, this.f9793b, bArr, i, i2);
        this.f9793b += i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m8269b() {
        return this.f9794c;
    }

    /* JADX INFO: renamed from: b */
    public final void m8270b(int i) {
        C1711a.m8010a(i >= 0 && i <= this.f9792a.length);
        this.f9794c = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m8271c() {
        return this.f9793b;
    }

    /* JADX INFO: renamed from: c */
    public final void m8272c(int i) {
        C1711a.m8010a(i >= 0 && i <= this.f9794c);
        this.f9793b = i;
    }

    /* JADX INFO: renamed from: d */
    public final int m8273d() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        this.f9793b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: d */
    public final void m8274d(int i) {
        m8272c(this.f9793b + i);
    }

    /* JADX INFO: renamed from: e */
    public final int m8275e() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f9793b = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: e */
    public final String m8276e(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f9793b;
        int i3 = (i2 + i) - 1;
        String strM8069a = C1717af.m8069a(this.f9792a, i2, (i3 >= this.f9794c || this.f9792a[i3] != 0) ? i : i - 1);
        this.f9793b += i;
        return strM8069a;
    }

    /* JADX INFO: renamed from: f */
    public final short m8277f() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f9793b = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: g */
    public final int m8278g() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.f9793b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: h */
    public final long m8279h() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i2 + 1;
        this.f9793b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i3 + 1;
        this.f9793b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f9793b = i4 + 1;
        return j3 | (((long) bArr[i4]) & 255);
    }

    /* JADX INFO: renamed from: i */
    public final int m8280i() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.f9793b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f9793b = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: j */
    public final long m8281j() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i2 + 1;
        this.f9793b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i3 + 1;
        this.f9793b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i4 + 1;
        this.f9793b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i5 + 1;
        this.f9793b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        this.f9793b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i7 + 1;
        this.f9793b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f9793b = i8 + 1;
        return j7 | (((long) bArr[i8]) & 255);
    }

    /* JADX INFO: renamed from: k */
    public final int m8282k() {
        byte[] bArr = this.f9792a;
        int i = this.f9793b;
        int i2 = i + 1;
        this.f9793b = i2;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = i2 + 1;
        this.f9793b = i4;
        int i5 = (bArr[i2] & 255) | i3;
        this.f9793b = i4 + 2;
        return i5;
    }

    /* JADX INFO: renamed from: l */
    public final int m8283l() {
        return (m8273d() << 21) | (m8273d() << 14) | (m8273d() << 7) | m8273d();
    }

    /* JADX INFO: renamed from: m */
    public final int m8284m() {
        int iM8280i = m8280i();
        if (iM8280i >= 0) {
            return iM8280i;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(iM8280i)));
    }

    /* JADX INFO: renamed from: n */
    public final long m8285n() {
        long jM8281j = m8281j();
        if (jM8281j >= 0) {
            return jM8281j;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(jM8281j)));
    }

    /* JADX INFO: renamed from: o */
    public final String m8286o() {
        String str = new String(this.f9792a, this.f9793b, 4, Charset.forName("UTF-8"));
        this.f9793b += 4;
        return str;
    }

    /* JADX INFO: renamed from: p */
    public final String m8287p() {
        if (m8265a() == 0) {
            return null;
        }
        int i = this.f9793b;
        while (i < this.f9794c && this.f9792a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f9792a;
        int i2 = this.f9793b;
        String strM8069a = C1717af.m8069a(bArr, i2, i - i2);
        this.f9793b = i;
        if (i < this.f9794c) {
            this.f9793b = i + 1;
        }
        return strM8069a;
    }
}
