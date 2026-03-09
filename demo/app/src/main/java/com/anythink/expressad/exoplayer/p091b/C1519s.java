package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1519s {

    /* JADX INFO: renamed from: a */
    private static final int f7797a = 65;

    /* JADX INFO: renamed from: b */
    private static final int f7798b = 400;

    /* JADX INFO: renamed from: c */
    private static final int f7799c = 4000;

    /* JADX INFO: renamed from: d */
    private final int f7800d;

    /* JADX INFO: renamed from: e */
    private final int f7801e;

    /* JADX INFO: renamed from: f */
    private final float f7802f;

    /* JADX INFO: renamed from: g */
    private final float f7803g;

    /* JADX INFO: renamed from: h */
    private final float f7804h;

    /* JADX INFO: renamed from: i */
    private final int f7805i;

    /* JADX INFO: renamed from: j */
    private final int f7806j;

    /* JADX INFO: renamed from: k */
    private final int f7807k;

    /* JADX INFO: renamed from: l */
    private final short[] f7808l;

    /* JADX INFO: renamed from: m */
    private short[] f7809m;

    /* JADX INFO: renamed from: n */
    private int f7810n;

    /* JADX INFO: renamed from: o */
    private short[] f7811o;

    /* JADX INFO: renamed from: p */
    private int f7812p;

    /* JADX INFO: renamed from: q */
    private short[] f7813q;

    /* JADX INFO: renamed from: r */
    private int f7814r;

    /* JADX INFO: renamed from: s */
    private int f7815s;

    /* JADX INFO: renamed from: t */
    private int f7816t;

    /* JADX INFO: renamed from: u */
    private int f7817u;

    /* JADX INFO: renamed from: v */
    private int f7818v;

    /* JADX INFO: renamed from: w */
    private int f7819w;

    /* JADX INFO: renamed from: x */
    private int f7820x;

    /* JADX INFO: renamed from: y */
    private int f7821y;

    public C1519s(int i, int i2, float f, float f2, int i3) {
        this.f7800d = i;
        this.f7801e = i2;
        this.f7802f = f;
        this.f7803g = f2;
        this.f7804h = i / i3;
        this.f7805i = i / f7798b;
        int i4 = i / 65;
        this.f7806j = i4;
        int i5 = i4 * 2;
        this.f7807k = i5;
        this.f7808l = new short[i5];
        this.f7809m = new short[i5 * i2];
        this.f7811o = new short[i5 * i2];
        this.f7813q = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: a */
    private int m6604a(short[] sArr, int i) {
        int iM6606a;
        int i2 = this.f7800d;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.f7801e == 1 && i3 == 1) {
            iM6606a = m6606a(sArr, i, this.f7805i, this.f7806j);
        } else {
            m6618c(sArr, i, i3);
            int iM6606a2 = m6606a(this.f7808l, 0, this.f7805i / i3, this.f7806j / i3);
            if (i3 != 1) {
                int i4 = iM6606a2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f7805i;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f7806j;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f7801e == 1) {
                    iM6606a = m6606a(sArr, i, i6, i7);
                } else {
                    m6618c(sArr, i, 1);
                    iM6606a = m6606a(this.f7808l, 0, i6, i7);
                }
            } else {
                iM6606a = iM6606a2;
            }
        }
        int i10 = this.f7820x;
        int i11 = i10 != 0 && this.f7818v != 0 && this.f7821y <= i10 * 3 && i10 * 2 > this.f7819w * 3 ? this.f7818v : iM6606a;
        this.f7819w = i10;
        this.f7818v = iM6606a;
        return i11;
    }

    /* JADX INFO: renamed from: a */
    private int m6605a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f7817u = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrM6612a = m6612a(this.f7811o, this.f7812p, i3);
        this.f7811o = sArrM6612a;
        m6610a(i3, this.f7801e, sArrM6612a, this.f7812p, sArr, i, sArr, i + i2);
        this.f7812p += i3;
        return i3;
    }

    /* JADX INFO: renamed from: a */
    private int m6606a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f7801e;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i5 * i2) {
                i7 = i2;
                i5 = iAbs;
            }
            if (iAbs * i6 > i8 * i2) {
                i6 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f7820x = i5 / i7;
        this.f7821y = i8 / i6;
        return i7;
    }

    /* JADX INFO: renamed from: a */
    private void m6607a(float f) {
        int iM6606a;
        int i;
        int i2;
        int i3 = this.f7810n;
        if (i3 < this.f7807k) {
            return;
        }
        int i4 = 0;
        do {
            int i5 = this.f7817u;
            if (i5 > 0) {
                int iMin = Math.min(this.f7807k, i5);
                m6616b(this.f7809m, i4, iMin);
                this.f7817u -= iMin;
                i4 += iMin;
            } else {
                short[] sArr = this.f7809m;
                int i6 = this.f7800d;
                int i7 = i6 > 4000 ? i6 / 4000 : 1;
                if (this.f7801e == 1 && i7 == 1) {
                    iM6606a = m6606a(sArr, i4, this.f7805i, this.f7806j);
                } else {
                    m6618c(sArr, i4, i7);
                    int iM6606a2 = m6606a(this.f7808l, 0, this.f7805i / i7, this.f7806j / i7);
                    if (i7 != 1) {
                        int i8 = iM6606a2 * i7;
                        int i9 = i7 * 4;
                        int i10 = i8 - i9;
                        int i11 = i8 + i9;
                        int i12 = this.f7805i;
                        if (i10 < i12) {
                            i10 = i12;
                        }
                        int i13 = this.f7806j;
                        if (i11 > i13) {
                            i11 = i13;
                        }
                        if (this.f7801e == 1) {
                            iM6606a = m6606a(sArr, i4, i10, i11);
                        } else {
                            m6618c(sArr, i4, 1);
                            iM6606a = m6606a(this.f7808l, 0, i10, i11);
                        }
                    } else {
                        iM6606a = iM6606a2;
                    }
                }
                int i14 = this.f7820x;
                int i15 = i14 != 0 && this.f7818v != 0 && this.f7821y <= i14 * 3 && i14 * 2 > this.f7819w * 3 ? this.f7818v : iM6606a;
                this.f7819w = i14;
                this.f7818v = iM6606a;
                if (f > 1.0d) {
                    short[] sArr2 = this.f7809m;
                    if (f >= 2.0f) {
                        i2 = (int) (i15 / (f - 1.0f));
                    } else {
                        this.f7817u = (int) ((i15 * (2.0f - f)) / (f - 1.0f));
                        i2 = i15;
                    }
                    short[] sArrM6612a = m6612a(this.f7811o, this.f7812p, i2);
                    this.f7811o = sArrM6612a;
                    m6610a(i2, this.f7801e, sArrM6612a, this.f7812p, sArr2, i4, sArr2, i4 + i15);
                    this.f7812p += i2;
                    i4 += i15 + i2;
                } else {
                    short[] sArr3 = this.f7809m;
                    if (f < 0.5f) {
                        i = (int) ((i15 * f) / (1.0f - f));
                    } else {
                        this.f7817u = (int) ((i15 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                        i = i15;
                    }
                    int i16 = i15 + i;
                    short[] sArrM6612a2 = m6612a(this.f7811o, this.f7812p, i16);
                    this.f7811o = sArrM6612a2;
                    int i17 = this.f7801e;
                    System.arraycopy(sArr3, i4 * i17, sArrM6612a2, this.f7812p * i17, i17 * i15);
                    m6610a(i, this.f7801e, this.f7811o, this.f7812p + i15, sArr3, i4 + i15, sArr3, i4);
                    this.f7812p += i16;
                    i4 += i;
                }
            }
        } while (this.f7807k + i4 <= i3);
        int i18 = this.f7810n - i4;
        short[] sArr4 = this.f7809m;
        int i19 = this.f7801e;
        System.arraycopy(sArr4, i4 * i19, sArr4, 0, i19 * i18);
        this.f7810n = i18;
    }

    /* JADX INFO: renamed from: a */
    private void m6608a(float f, int i) {
        int i2;
        int i3;
        int i4;
        if (this.f7812p == i) {
            return;
        }
        int i5 = this.f7800d;
        int i6 = (int) (i5 / f);
        while (true) {
            if (i6 <= 16384 && i5 <= 16384) {
                break;
            }
            i6 /= 2;
            i5 /= 2;
        }
        int i7 = this.f7812p - i;
        short[] sArrM6612a = m6612a(this.f7813q, this.f7814r, i7);
        this.f7813q = sArrM6612a;
        short[] sArr = this.f7811o;
        int i8 = this.f7801e;
        System.arraycopy(sArr, i * i8, sArrM6612a, this.f7814r * i8, i8 * i7);
        this.f7812p = i;
        this.f7814r += i7;
        int i9 = 0;
        while (true) {
            i2 = this.f7814r;
            if (i9 >= i2 - 1) {
                break;
            }
            while (true) {
                i3 = this.f7815s;
                int i10 = (i3 + 1) * i6;
                i4 = this.f7816t;
                if (i10 <= i4 * i5) {
                    break;
                }
                this.f7811o = m6612a(this.f7811o, this.f7812p, 1);
                int i11 = 0;
                while (true) {
                    int i12 = this.f7801e;
                    if (i11 < i12) {
                        short[] sArr2 = this.f7811o;
                        int i13 = (this.f7812p * i12) + i11;
                        short[] sArr3 = this.f7813q;
                        int i14 = (i9 * i12) + i11;
                        short s = sArr3[i14];
                        short s2 = sArr3[i14 + i12];
                        int i15 = this.f7816t * i5;
                        int i16 = this.f7815s;
                        int i17 = i16 * i6;
                        int i18 = (i16 + 1) * i6;
                        int i19 = i18 - i15;
                        int i20 = i18 - i17;
                        sArr2[i13] = (short) (((s * i19) + ((i20 - i19) * s2)) / i20);
                        i11++;
                    }
                }
                this.f7816t++;
                this.f7812p++;
            }
            int i21 = i3 + 1;
            this.f7815s = i21;
            if (i21 == i5) {
                this.f7815s = 0;
                C1711a.m8012b(i4 == i6);
                this.f7816t = 0;
            }
            i9++;
        }
        int i22 = i2 - 1;
        if (i22 != 0) {
            short[] sArr4 = this.f7813q;
            int i23 = this.f7801e;
            System.arraycopy(sArr4, i22 * i23, sArr4, 0, (i2 - i22) * i23);
            this.f7814r -= i22;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6609a(int i) {
        int i2 = this.f7810n - i;
        short[] sArr = this.f7809m;
        int i3 = this.f7801e;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f7810n = i2;
    }

    /* JADX INFO: renamed from: a */
    private static void m6610a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m6611a(int i, int i2) {
        return i != 0 && this.f7818v != 0 && i2 <= i * 3 && i * 2 > this.f7819w * 3;
    }

    /* JADX INFO: renamed from: a */
    private short[] m6612a(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f7801e;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: b */
    private int m6613b(int i) {
        int iMin = Math.min(this.f7807k, this.f7817u);
        m6616b(this.f7809m, i, iMin);
        this.f7817u -= iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    private int m6614b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f7817u = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrM6612a = m6612a(this.f7811o, this.f7812p, i4);
        this.f7811o = sArrM6612a;
        int i5 = this.f7801e;
        System.arraycopy(sArr, i * i5, sArrM6612a, this.f7812p * i5, i5 * i2);
        m6610a(i3, this.f7801e, this.f7811o, this.f7812p + i2, sArr, i + i2, sArr, i);
        this.f7812p += i4;
        return i3;
    }

    /* JADX INFO: renamed from: b */
    private short m6615b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f7801e];
        int i4 = this.f7816t * i2;
        int i5 = this.f7815s;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* JADX INFO: renamed from: b */
    private void m6616b(short[] sArr, int i, int i2) {
        short[] sArrM6612a = m6612a(this.f7811o, this.f7812p, i2);
        this.f7811o = sArrM6612a;
        int i3 = this.f7801e;
        System.arraycopy(sArr, i * i3, sArrM6612a, this.f7812p * i3, i3 * i2);
        this.f7812p += i2;
    }

    /* JADX INFO: renamed from: c */
    private void m6617c(int i) {
        int i2 = this.f7812p - i;
        short[] sArrM6612a = m6612a(this.f7813q, this.f7814r, i2);
        this.f7813q = sArrM6612a;
        short[] sArr = this.f7811o;
        int i3 = this.f7801e;
        System.arraycopy(sArr, i * i3, sArrM6612a, this.f7814r * i3, i3 * i2);
        this.f7812p = i;
        this.f7814r += i2;
    }

    /* JADX INFO: renamed from: c */
    private void m6618c(short[] sArr, int i, int i2) {
        int i3 = this.f7807k / i2;
        int i4 = this.f7801e;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f7808l[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6619d() {
        int i = this.f7812p;
        float f = this.f7802f;
        float f2 = this.f7803g;
        float f3 = f / f2;
        float f4 = this.f7804h * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m6607a(f3);
        } else {
            m6616b(this.f7809m, 0, this.f7810n);
            this.f7810n = 0;
        }
        if (f4 != 1.0f) {
            m6608a(f4, i);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6620d(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f7813q;
        int i2 = this.f7801e;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f7814r - i) * i2);
        this.f7814r -= i;
    }

    /* JADX INFO: renamed from: a */
    public final void m6621a() {
        int i;
        int i2 = this.f7810n;
        float f = this.f7802f;
        float f2 = this.f7803g;
        int i3 = this.f7812p + ((int) ((((i2 / (f / f2)) + this.f7814r) / (this.f7804h * f2)) + 0.5f));
        this.f7809m = m6612a(this.f7809m, i2, (this.f7807k * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f7807k;
            int i5 = this.f7801e;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f7809m[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f7810n += i * 2;
        m6619d();
        if (this.f7812p > i3) {
            this.f7812p = i3;
        }
        this.f7810n = 0;
        this.f7817u = 0;
        this.f7814r = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m6622a(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f7801e;
        int i2 = iRemaining / i;
        short[] sArrM6612a = m6612a(this.f7809m, this.f7810n, i2);
        this.f7809m = sArrM6612a;
        shortBuffer.get(sArrM6612a, this.f7810n * this.f7801e, ((i * i2) * 2) / 2);
        this.f7810n += i2;
        m6619d();
    }

    /* JADX INFO: renamed from: b */
    public final void m6623b() {
        this.f7810n = 0;
        this.f7812p = 0;
        this.f7814r = 0;
        this.f7815s = 0;
        this.f7816t = 0;
        this.f7817u = 0;
        this.f7818v = 0;
        this.f7819w = 0;
        this.f7820x = 0;
        this.f7821y = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m6624b(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f7801e, this.f7812p);
        shortBuffer.put(this.f7811o, 0, this.f7801e * iMin);
        int i = this.f7812p - iMin;
        this.f7812p = i;
        short[] sArr = this.f7811o;
        int i2 = this.f7801e;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    /* JADX INFO: renamed from: c */
    public final int m6625c() {
        return this.f7812p;
    }
}
