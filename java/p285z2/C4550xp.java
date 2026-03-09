package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.xp */
/* JADX INFO: loaded from: classes2.dex */
public final class C4550xp extends AbstractC4107lq {
    private static final int OooO = 97;
    public static final int[][] OooO00o = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final float OooO0O0 = 0.25f;
    private static final float OooO0OO = 0.7f;
    private static final int OooO0Oo = 98;
    private static final int OooO0o = 100;
    private static final int OooO0o0 = 99;
    private static final int OooO0oO = 101;
    private static final int OooO0oo = 102;
    private static final int OooOO0 = 96;
    private static final int OooOO0O = 101;
    private static final int OooOO0o = 100;
    private static final int OooOOO = 104;
    private static final int OooOOO0 = 103;
    private static final int OooOOOO = 105;
    private static final int OooOOOo = 106;

    private static int[] OooO(C3735bo c3735bo) throws NotFoundException {
        int iOooOOO0 = c3735bo.OooOOO0();
        int iOooOO0O = c3735bo.OooOO0O(0);
        int[] iArr = new int[6];
        int i = iOooOO0O;
        boolean z = false;
        int i2 = 0;
        while (iOooOO0O < iOooOOO0) {
            if (c3735bo.OooO0oo(iOooOO0O) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 == 5) {
                    float f = 0.25f;
                    int i3 = -1;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float fOooO0o0 = AbstractC4107lq.OooO0o0(iArr, OooO00o[i4], OooO0OO);
                        if (fOooO0o0 < f) {
                            i3 = i4;
                            f = fOooO0o0;
                        }
                    }
                    if (i3 >= 0 && c3735bo.OooOOOO(Math.max(0, i - ((iOooOO0O - i) / 2)), i, false)) {
                        return new int[]{i, iOooOO0O, i3};
                    }
                    i += iArr[0] + iArr[1];
                    int i5 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr[i2] = 1;
                z = !z;
            }
            iOooOO0O++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int OooO0oo(C3735bo c3735bo, int[] iArr, int i) throws NotFoundException {
        AbstractC4107lq.OooO0o(c3735bo, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = OooO00o;
            if (i3 >= iArr2.length) {
                break;
            }
            float fOooO0o0 = AbstractC4107lq.OooO0o0(iArr, iArr2[i3], OooO0OO);
            if (fOooO0o0 < f) {
                i2 = i3;
                f = fOooO0o0;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        if (r9 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0106, code lost:
    
        if (r9 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0 A[PHI: r17
  0x00c0: PHI (r17v16 boolean) = (r17v6 boolean), (r17v19 boolean) binds: [B:74:0x00f9, B:49:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[PHI: r17
  0x00c5: PHI (r17v15 boolean) = (r17v6 boolean), (r17v19 boolean) binds: [B:74:0x00f9, B:49:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d A[PHI: r17
  0x010d: PHI (r17v10 boolean) = (r17v6 boolean), (r17v19 boolean) binds: [B:70:0x00ef, B:45:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117 A[PHI: r17
  0x0117: PHI (r17v8 boolean) = (r17v6 boolean), (r17v19 boolean) binds: [B:69:0x00ed, B:44:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p285z2.AbstractC4107lq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p285z2.C3770cm OooO0OO(int r25, p285z2.C3735bo r26, java.util.Map<com.google.zxing.DecodeHintType, ?> r27) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4550xp.OooO0OO(int, z2.bo, java.util.Map):z2.cm");
    }
}
