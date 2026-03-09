package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.io */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3994io {
    private static AbstractC3994io OooO00o = new C3883fo();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO00o(p285z2.C3772co r9, float[] r10) throws com.google.zxing.NotFoundException {
        /*
            int r0 = r9.OooOOO0()
            int r9 = r9.OooO0oo()
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 1
        Lc:
            int r5 = r10.length
            r6 = 0
            r7 = -1
            if (r3 >= r5) goto L48
            if (r4 == 0) goto L48
            r4 = r10[r3]
            int r4 = (int) r4
            int r5 = r3 + 1
            r8 = r10[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L43
            if (r4 > r0) goto L43
            if (r8 < r7) goto L43
            if (r8 > r9) goto L43
            if (r4 != r7) goto L29
            r10[r3] = r6
        L27:
            r4 = 1
            goto L32
        L29:
            if (r4 != r0) goto L31
            int r4 = r0 + (-1)
            float r4 = (float) r4
            r10[r3] = r4
            goto L27
        L31:
            r4 = 0
        L32:
            if (r8 != r7) goto L38
            r10[r5] = r6
        L36:
            r4 = 1
            goto L40
        L38:
            if (r8 != r9) goto L40
            int r4 = r9 + (-1)
            float r4 = (float) r4
            r10[r5] = r4
            goto L36
        L40:
            int r3 = r3 + 2
            goto Lc
        L43:
            com.google.zxing.NotFoundException r9 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r9
        L48:
            int r3 = r10.length
            int r3 = r3 + (-2)
            r4 = 1
        L4c:
            if (r3 < 0) goto L85
            if (r4 == 0) goto L85
            r4 = r10[r3]
            int r4 = (int) r4
            int r5 = r3 + 1
            r8 = r10[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L80
            if (r4 > r0) goto L80
            if (r8 < r7) goto L80
            if (r8 > r9) goto L80
            if (r4 != r7) goto L66
            r10[r3] = r6
        L64:
            r4 = 1
            goto L6f
        L66:
            if (r4 != r0) goto L6e
            int r4 = r0 + (-1)
            float r4 = (float) r4
            r10[r3] = r4
            goto L64
        L6e:
            r4 = 0
        L6f:
            if (r8 != r7) goto L75
            r10[r5] = r6
        L73:
            r4 = 1
            goto L7d
        L75:
            if (r8 != r9) goto L7d
            int r4 = r9 + (-1)
            float r4 = (float) r4
            r10[r5] = r4
            goto L73
        L7d:
            int r3 = r3 + (-2)
            goto L4c
        L80:
            com.google.zxing.NotFoundException r9 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r9
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.AbstractC3994io.OooO00o(z2.co, float[]):void");
    }

    public static AbstractC3994io OooO0O0() {
        return OooO00o;
    }

    public static void OooO0o0(AbstractC3994io abstractC3994io) {
        OooO00o = abstractC3994io;
    }

    public abstract C3772co OooO0OO(C3772co c3772co, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    public abstract C3772co OooO0Oo(C3772co c3772co, int i, int i2, C4068ko c4068ko) throws NotFoundException;
}
