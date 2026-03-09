package com.anythink.expressad.exoplayer.p094e.p095a;

import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1553d {

    /* JADX INFO: renamed from: a */
    private static final int f8178a = 8192;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long[] f8179a;

        /* JADX INFO: renamed from: b */
        public final int[] f8180b;

        /* JADX INFO: renamed from: c */
        public final int f8181c;

        /* JADX INFO: renamed from: d */
        public final long[] f8182d;

        /* JADX INFO: renamed from: e */
        public final int[] f8183e;

        /* JADX INFO: renamed from: f */
        public final long f8184f;

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f8179a = jArr;
            this.f8180b = iArr;
            this.f8181c = i;
            this.f8182d = jArr2;
            this.f8183e = iArr2;
            this.f8184f = j;
        }

        public /* synthetic */ a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, byte b) {
            this(jArr, iArr, i, jArr2, iArr2, j);
        }
    }

    private C1553d() {
    }

    /* JADX INFO: renamed from: a */
    public static a m6861a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iM8049a = 0;
        for (int i3 : iArr) {
            iM8049a += C1717af.m8049a(i3, i2);
        }
        long[] jArr2 = new long[iM8049a];
        int[] iArr2 = new int[iM8049a];
        long[] jArr3 = new long[iM8049a];
        int[] iArr3 = new int[iM8049a];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                iArr2[i5] = i * iMin;
                iMax = Math.max(iMax, iArr2[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                j2 += (long) iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new a(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4), (byte) 0);
    }
}
