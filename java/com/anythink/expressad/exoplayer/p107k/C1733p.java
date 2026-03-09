package com.anythink.expressad.exoplayer.p107k;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1733p {

    /* JADX INFO: renamed from: b */
    public static final int f9761b = 255;

    /* JADX INFO: renamed from: d */
    private static final String f9763d = "NalUnitUtil";

    /* JADX INFO: renamed from: e */
    private static final int f9764e = 6;

    /* JADX INFO: renamed from: f */
    private static final int f9765f = 7;

    /* JADX INFO: renamed from: g */
    private static final int f9766g = 39;

    /* JADX INFO: renamed from: a */
    public static final byte[] f9760a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: c */
    public static final float[] f9762c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: h */
    private static final Object f9767h = new Object();

    /* JADX INFO: renamed from: i */
    private static int[] f9768i = new int[10];

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9769a;

        /* JADX INFO: renamed from: b */
        public final int f9770b;

        /* JADX INFO: renamed from: c */
        public final boolean f9771c;

        public a(int i, int i2, boolean z) {
            this.f9769a = i;
            this.f9770b = i2;
            this.f9771c = z;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f9772a;

        /* JADX INFO: renamed from: b */
        public final int f9773b;

        /* JADX INFO: renamed from: c */
        public final int f9774c;

        /* JADX INFO: renamed from: d */
        public final float f9775d;

        /* JADX INFO: renamed from: e */
        public final boolean f9776e;

        /* JADX INFO: renamed from: f */
        public final boolean f9777f;

        /* JADX INFO: renamed from: g */
        public final int f9778g;

        /* JADX INFO: renamed from: h */
        public final int f9779h;

        /* JADX INFO: renamed from: i */
        public final int f9780i;

        /* JADX INFO: renamed from: j */
        public final boolean f9781j;

        public b(int i, int i2, int i3, float f, boolean z, boolean z3, int i4, int i5, int i6, boolean z4) {
            this.f9772a = i;
            this.f9773b = i2;
            this.f9774c = i3;
            this.f9775d = f;
            this.f9776e = z;
            this.f9777f = z3;
            this.f9778g = i4;
            this.f9779h = i5;
            this.f9780i = i6;
            this.f9781j = z4;
        }
    }

    private C1733p() {
    }

    /* JADX INFO: renamed from: a */
    public static int m8215a(byte[] bArr, int i) {
        int i2;
        synchronized (f9767h) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    int[] iArr = f9768i;
                    if (iArr.length <= i4) {
                        f9768i = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f9768i[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f9768i[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0096, code lost:
    
        r8 = true;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m8216a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            com.anythink.expressad.exoplayer.p107k.C1711a.m8012b(r3)
            if (r0 != 0) goto Lf
            return r9
        Lf:
            r3 = 2
            if (r10 == 0) goto L40
            boolean r4 = r10[r1]
            if (r4 == 0) goto L1c
            m8220a(r10)
            int r8 = r8 + (-3)
            return r8
        L1c:
            if (r0 <= r2) goto L2b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L2b
            r4 = r7[r8]
            if (r4 != r2) goto L2b
            m8220a(r10)
            int r8 = r8 - r3
            return r8
        L2b:
            if (r0 <= r3) goto L40
            boolean r4 = r10[r3]
            if (r4 == 0) goto L40
            r4 = r7[r8]
            if (r4 != 0) goto L40
            int r4 = r8 + 1
            r4 = r7[r4]
            if (r4 != r2) goto L40
            m8220a(r10)
            int r8 = r8 - r2
            return r8
        L40:
            int r4 = r9 + (-1)
            int r8 = r8 + r3
        L43:
            if (r8 >= r4) goto L66
            r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 != 0) goto L63
            int r5 = r8 + (-2)
            r6 = r7[r5]
            if (r6 != 0) goto L61
            int r6 = r8 + (-1)
            r6 = r7[r6]
            if (r6 != 0) goto L61
            r6 = r7[r8]
            if (r6 != r2) goto L61
            if (r10 == 0) goto L60
            m8220a(r10)
        L60:
            return r5
        L61:
            int r8 = r8 + (-2)
        L63:
            int r8 = r8 + 3
            goto L43
        L66:
            if (r10 == 0) goto Lba
            if (r0 <= r3) goto L7d
            int r8 = r9 + (-3)
            r8 = r7[r8]
            if (r8 != 0) goto L7b
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto L7b
            r8 = r7[r4]
            if (r8 != r2) goto L7b
            goto L96
        L7b:
            r8 = 0
            goto L97
        L7d:
            if (r0 != r3) goto L8e
            boolean r8 = r10[r3]
            if (r8 == 0) goto L7b
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto L7b
            r8 = r7[r4]
            if (r8 != r2) goto L7b
            goto L96
        L8e:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L7b
            r8 = r7[r4]
            if (r8 != r2) goto L7b
        L96:
            r8 = 1
        L97:
            r10[r1] = r8
            if (r0 <= r2) goto La6
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto Lb0
            r8 = r7[r4]
            if (r8 != 0) goto Lb0
            goto Lae
        La6:
            boolean r8 = r10[r3]
            if (r8 == 0) goto Lb0
            r8 = r7[r4]
            if (r8 != 0) goto Lb0
        Lae:
            r8 = 1
            goto Lb1
        Lb0:
            r8 = 0
        Lb1:
            r10[r2] = r8
            r7 = r7[r4]
            if (r7 != 0) goto Lb8
            r1 = 1
        Lb8:
            r10[r3] = r1
        Lba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p107k.C1733p.m8216a(byte[], int, int, boolean[]):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.exoplayer.p107k.C1733p.b m8217a(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p107k.C1733p.m8217a(byte[], int, int):com.anythink.expressad.exoplayer.k.p$b");
    }

    /* JADX INFO: renamed from: a */
    private static void m8218a(C1737t c1737t, int i) {
        int iM8299d = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iM8299d != 0) {
                iM8299d = ((c1737t.m8299d() + i2) + 256) % 256;
            }
            if (iM8299d != 0) {
                i2 = iM8299d;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8219a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8220a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8221a(String str, byte b2) {
        return (C1732o.f9738h.equals(str) && (b2 & 31) == 6) || (C1732o.f9739i.equals(str) && ((b2 & 126) >> 1) == 39);
    }

    /* JADX INFO: renamed from: b */
    private static int m8222b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* JADX INFO: renamed from: b */
    private static a m8223b(byte[] bArr, int i, int i2) {
        C1737t c1737t = new C1737t(bArr, i, i2);
        c1737t.m8295a(8);
        int iM8298c = c1737t.m8298c();
        int iM8298c2 = c1737t.m8298c();
        c1737t.m8294a();
        return new a(iM8298c, iM8298c2, c1737t.m8297b());
    }

    /* JADX INFO: renamed from: c */
    private static int m8224c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX INFO: renamed from: c */
    private static int m8225c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
