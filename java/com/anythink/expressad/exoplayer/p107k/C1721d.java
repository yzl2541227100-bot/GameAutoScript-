package com.anythink.expressad.exoplayer.p107k;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1721d {

    /* JADX INFO: renamed from: b */
    private static final int f9645b = 15;

    /* JADX INFO: renamed from: d */
    private static final int f9647d = -1;

    /* JADX INFO: renamed from: f */
    private static final int f9649f = 2;

    /* JADX INFO: renamed from: g */
    private static final int f9650g = 5;

    /* JADX INFO: renamed from: h */
    private static final int f9651h = 22;

    /* JADX INFO: renamed from: i */
    private static final int f9652i = 29;

    /* JADX INFO: renamed from: j */
    private static final int f9653j = 31;

    /* JADX INFO: renamed from: a */
    private static final byte[] f9644a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: c */
    private static final int[] f9646c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: e */
    private static final int[] f9648e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private C1721d() {
    }

    /* JADX INFO: renamed from: a */
    private static int m8139a(byte[] bArr, int i) {
        int length = bArr.length - f9644a.length;
        while (i <= length) {
            if (m8146b(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static Pair<Integer, Integer> m8140a(C1735r c1735r) {
        int iM8145b = m8145b(c1735r);
        int iM8149c = m8149c(c1735r);
        int iM8240c = c1735r.m8240c(4);
        if (iM8145b == 5 || iM8145b == 29) {
            iM8149c = m8149c(c1735r);
            if (m8145b(c1735r) == 22) {
                iM8240c = c1735r.m8240c(4);
            }
        }
        int i = f9648e[iM8240c];
        C1711a.m8010a(i != -1);
        return Pair.create(Integer.valueOf(iM8149c), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public static Pair<Integer, Integer> m8141a(byte[] bArr) {
        C1735r c1735r = new C1735r(bArr);
        int iM8145b = m8145b(c1735r);
        int iM8149c = m8149c(c1735r);
        int iM8240c = c1735r.m8240c(4);
        if (iM8145b == 5 || iM8145b == 29) {
            iM8149c = m8149c(c1735r);
            if (m8145b(c1735r) == 22) {
                iM8240c = c1735r.m8240c(4);
            }
        }
        int i = f9648e[iM8240c];
        C1711a.m8010a(i != -1);
        return Pair.create(Integer.valueOf(iM8149c), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    private static void m8142a(C1735r c1735r, int i, int i2) {
        c1735r.m8239b(1);
        if (c1735r.m8243d()) {
            c1735r.m8239b(14);
        }
        boolean zM8243d = c1735r.m8243d();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            c1735r.m8239b(3);
        }
        if (zM8243d) {
            if (i == 22) {
                c1735r.m8239b(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                c1735r.m8239b(3);
            }
            c1735r.m8239b(1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m8143a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int[] iArr = f9646c;
            if (i3 >= iArr.length) {
                break;
            }
            if (i == iArr[i3]) {
                i4 = i3;
            }
            i3++;
        }
        int i5 = 0;
        int i6 = -1;
        while (true) {
            int[] iArr2 = f9648e;
            if (i5 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i5]) {
                i6 = i5;
            }
            i5++;
        }
        if (i != -1 && i6 != -1) {
            return new byte[]{(byte) (((i4 >> 1) & 7) | 16), (byte) (((i4 << 7) & 128) | ((i6 << 3) & 120))};
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m8144a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f9644a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    private static int m8145b(C1735r c1735r) {
        int iM8240c = c1735r.m8240c(5);
        return iM8240c == 31 ? c1735r.m8240c(6) + 32 : iM8240c;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m8146b(byte[] bArr, int i) {
        if (bArr.length - i <= f9644a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f9644a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m8147b(int i, int i2) {
        return new byte[]{(byte) (((i >> 1) & 7) | 16), (byte) (((i << 7) & 128) | ((i2 << 3) & 120))};
    }

    /* JADX INFO: renamed from: b */
    private static byte[][] m8148b(byte[] bArr) {
        if (!m8146b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM8139a = 0;
        do {
            arrayList.add(Integer.valueOf(iM8139a));
            iM8139a = m8139a(bArr, iM8139a + f9644a.length);
        } while (iM8139a != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    private static int m8149c(C1735r c1735r) {
        int iM8240c = c1735r.m8240c(4);
        if (iM8240c == 15) {
            return c1735r.m8240c(24);
        }
        C1711a.m8010a(iM8240c < 13);
        return f9646c[iM8240c];
    }
}
