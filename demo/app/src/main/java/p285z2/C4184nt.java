package p285z2;

/* JADX INFO: renamed from: z2.nt */
/* JADX INFO: loaded from: classes2.dex */
public final class C4184nt {
    private static final int OooO00o = 3;
    private static final int OooO0O0 = 3;
    private static final int OooO0OO = 40;
    private static final int OooO0Oo = 10;

    private C4184nt() {
    }

    public static int OooO00o(C4110lt c4110lt) {
        return OooO0O0(c4110lt, true) + OooO0O0(c4110lt, false);
    }

    private static int OooO0O0(C4110lt c4110lt, boolean z) {
        int iOooO0Oo = z ? c4110lt.OooO0Oo() : c4110lt.OooO0o0();
        int iOooO0o0 = z ? c4110lt.OooO0o0() : c4110lt.OooO0Oo();
        byte[][] bArrOooO0OO = c4110lt.OooO0OO();
        int i = 0;
        for (int i2 = 0; i2 < iOooO0Oo; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iOooO0o0; i4++) {
                byte b2 = z ? bArrOooO0OO[i2][i4] : bArrOooO0OO[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    public static int OooO0OO(C4110lt c4110lt) {
        byte[][] bArrOooO0OO = c4110lt.OooO0OO();
        int iOooO0o0 = c4110lt.OooO0o0();
        int iOooO0Oo = c4110lt.OooO0Oo();
        int i = 0;
        for (int i2 = 0; i2 < iOooO0Oo - 1; i2++) {
            byte[] bArr = bArrOooO0OO[i2];
            int i3 = 0;
            while (i3 < iOooO0o0 - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b == bArrOooO0OO[i5][i3] && b == bArrOooO0OO[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    public static int OooO0Oo(C4110lt c4110lt) {
        byte[][] bArrOooO0OO = c4110lt.OooO0OO();
        int iOooO0o0 = c4110lt.OooO0o0();
        int iOooO0Oo = c4110lt.OooO0Oo();
        int i = 0;
        for (int i2 = 0; i2 < iOooO0Oo; i2++) {
            for (int i3 = 0; i3 < iOooO0o0; i3++) {
                byte[] bArr = bArrOooO0OO[i2];
                int i4 = i3 + 6;
                if (i4 < iOooO0o0 && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (OooO0oO(bArr, i3 - 4, i3) || OooO0oO(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iOooO0Oo && bArrOooO0OO[i2][i3] == 1 && bArrOooO0OO[i2 + 1][i3] == 0 && bArrOooO0OO[i2 + 2][i3] == 1 && bArrOooO0OO[i2 + 3][i3] == 1 && bArrOooO0OO[i2 + 4][i3] == 1 && bArrOooO0OO[i2 + 5][i3] == 0 && bArrOooO0OO[i5][i3] == 1 && (OooO0oo(bArrOooO0OO, i3, i2 - 4, i2) || OooO0oo(bArrOooO0OO, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooO0o(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L3a;
                case 1: goto L3b;
                case 2: goto L37;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L26;
                case 6: goto L1d;
                case 7: goto L14;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L14:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L24
        L1d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L24:
            r1 = r1 & r0
            goto L3d
        L26:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L3d
        L2e:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L3a
        L33:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L3d
        L37:
            int r1 = r2 % 3
            goto L3d
        L3a:
            int r3 = r3 + r2
        L3b:
            r1 = r3 & 1
        L3d:
            if (r1 != 0) goto L40
            return r0
        L40:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4184nt.OooO0o(int, int, int):boolean");
    }

    public static int OooO0o0(C4110lt c4110lt) {
        byte[][] bArrOooO0OO = c4110lt.OooO0OO();
        int iOooO0o0 = c4110lt.OooO0o0();
        int iOooO0Oo = c4110lt.OooO0Oo();
        int i = 0;
        for (int i2 = 0; i2 < iOooO0Oo; i2++) {
            byte[] bArr = bArrOooO0OO[i2];
            for (int i3 = 0; i3 < iOooO0o0; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iOooO0Oo2 = c4110lt.OooO0Oo() * c4110lt.OooO0o0();
        return ((Math.abs((i << 1) - iOooO0Oo2) * 10) / iOooO0Oo2) * 10;
    }

    private static boolean OooO0oO(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean OooO0oo(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
