package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.C1735r;
import com.anythink.expressad.foundation.p138h.C1879m;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1513m {

    /* JADX INFO: renamed from: a */
    private static final int f7708a = 2147385345;

    /* JADX INFO: renamed from: b */
    private static final int f7709b = 536864768;

    /* JADX INFO: renamed from: c */
    private static final int f7710c = -25230976;

    /* JADX INFO: renamed from: d */
    private static final int f7711d = -14745368;

    /* JADX INFO: renamed from: e */
    private static final byte f7712e = 127;

    /* JADX INFO: renamed from: f */
    private static final byte f7713f = 31;

    /* JADX INFO: renamed from: g */
    private static final byte f7714g = -2;

    /* JADX INFO: renamed from: h */
    private static final byte f7715h = -1;

    /* JADX INFO: renamed from: i */
    private static final int[] f7716i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: j */
    private static final int[] f7717j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: k */
    private static final int[] f7718k = {64, 112, 128, 192, 224, 256, 384, C1879m.a.f11569a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private C1513m() {
    }

    /* JADX INFO: renamed from: a */
    public static int m6536a(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        int iPosition = byteBuffer.position();
        byte b = byteBuffer.get(iPosition);
        if (b != -2) {
            if (b == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                i4 = iPosition + 7;
            } else if (b != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                i2 = iPosition + 5;
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                i4 = iPosition + 6;
            }
            i3 = byteBuffer.get(i4) & 60;
            return (((i3 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        i2 = iPosition + 4;
        i3 = byteBuffer.get(i2) & 252;
        return (((i3 >> 2) | i) + 1) * 32;
    }

    /* JADX INFO: renamed from: a */
    private static int m6537a(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX INFO: renamed from: a */
    private static C1753m m6538a(byte[] bArr, String str, String str2, C1536e c1536e) {
        C1735r c1735r;
        if (bArr[0] == 127) {
            c1735r = new C1735r(bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            if (bArrCopyOf[0] == -2 || bArrCopyOf[0] == -1) {
                for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                    byte b = bArrCopyOf[i];
                    int i2 = i + 1;
                    bArrCopyOf[i] = bArrCopyOf[i2];
                    bArrCopyOf[i2] = b;
                }
            }
            c1735r = new C1735r(bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                C1735r c1735r2 = new C1735r(bArrCopyOf);
                while (c1735r2.m8235a() >= 16) {
                    c1735r2.m8239b(2);
                    c1735r.m8242d(c1735r2.m8240c(14));
                }
            }
            c1735r.m8237a(bArrCopyOf, bArrCopyOf.length);
        }
        c1735r.m8239b(60);
        int i3 = f7716i[c1735r.m8240c(6)];
        int i4 = f7717j[c1735r.m8240c(4)];
        int iM8240c = c1735r.m8240c(5);
        int[] iArr = f7718k;
        int i5 = iM8240c >= iArr.length ? -1 : (iArr[iM8240c] * 1000) / 2;
        c1735r.m8239b(10);
        return C1753m.m8395a(str, C1732o.f9696D, null, i5, i3 + (c1735r.m8240c(2) > 0 ? 1 : 0), i4, null, c1536e, str2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6539a(int i) {
        return i == f7708a || i == f7710c || i == f7709b || i == f7711d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m6540b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.C1513m.m6540b(byte[]):int");
    }

    /* JADX INFO: renamed from: c */
    private static C1735r m6541c(byte[] bArr) {
        if (bArr[0] == 127) {
            return new C1735r(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (bArrCopyOf[0] == -2 || bArrCopyOf[0] == -1) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b;
            }
        }
        C1735r c1735r = new C1735r(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C1735r c1735r2 = new C1735r(bArrCopyOf);
            while (c1735r2.m8235a() >= 16) {
                c1735r2.m8239b(2);
                c1735r.m8242d(c1735r2.m8240c(14));
            }
        }
        c1735r.m8237a(bArrCopyOf, bArrCopyOf.length);
        return c1735r;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m6542d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
