package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.no */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C4179no {
    private static final int OooO0O0 = 32;
    private final C3772co OooO00o;

    public C4179no(C3772co c3772co) {
        this.OooO00o = c3772co;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0031 A[EDGE_INSN: B:70:0x0031->B:22:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:73:0x001c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067 A[EDGE_INSN: B:86:0x0067->B:47:0x0067 BREAK  A[LOOP:3: B:38:0x0053->B:91:0x0053], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] OooO00o(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r5 = this;
            int r0 = r8 + r9
            r1 = 2
            int r0 = r0 / r1
            r2 = r0
        L5:
            if (r2 < r8) goto L3a
            z2.co r3 = r5.OooO00o
            if (r10 == 0) goto L12
            boolean r3 = r3.OooO0o0(r2, r6)
            if (r3 == 0) goto L1b
            goto L18
        L12:
            boolean r3 = r3.OooO0o0(r6, r2)
            if (r3 == 0) goto L1b
        L18:
            int r2 = r2 + (-1)
            goto L5
        L1b:
            r3 = r2
        L1c:
            int r3 = r3 + (-1)
            if (r3 < r8) goto L31
            z2.co r4 = r5.OooO00o
            if (r10 == 0) goto L2b
            boolean r4 = r4.OooO0o0(r3, r6)
            if (r4 == 0) goto L1c
            goto L31
        L2b:
            boolean r4 = r4.OooO0o0(r6, r3)
            if (r4 == 0) goto L1c
        L31:
            int r4 = r2 - r3
            if (r3 < r8) goto L3a
            if (r4 <= r7) goto L38
            goto L3a
        L38:
            r2 = r3
            goto L5
        L3a:
            r8 = 1
            int r2 = r2 + r8
        L3c:
            if (r0 >= r9) goto L70
            z2.co r3 = r5.OooO00o
            if (r10 == 0) goto L49
            boolean r3 = r3.OooO0o0(r0, r6)
            if (r3 == 0) goto L52
            goto L4f
        L49:
            boolean r3 = r3.OooO0o0(r6, r0)
            if (r3 == 0) goto L52
        L4f:
            int r0 = r0 + 1
            goto L3c
        L52:
            r3 = r0
        L53:
            int r3 = r3 + r8
            if (r3 >= r9) goto L67
            z2.co r4 = r5.OooO00o
            if (r10 == 0) goto L61
            boolean r4 = r4.OooO0o0(r3, r6)
            if (r4 == 0) goto L53
            goto L67
        L61:
            boolean r4 = r4.OooO0o0(r6, r3)
            if (r4 == 0) goto L53
        L67:
            int r4 = r3 - r0
            if (r3 >= r9) goto L70
            if (r4 <= r7) goto L6e
            goto L70
        L6e:
            r0 = r3
            goto L3c
        L70:
            int r0 = r0 + (-1)
            if (r0 <= r2) goto L7c
            int[] r6 = new int[r1]
            r7 = 0
            r6[r7] = r2
            r6[r8] = r0
            return r6
        L7c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4179no.OooO00o(int, int, int, int, boolean):int[]");
    }

    private C3807dm OooO0OO(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws NotFoundException {
        boolean z;
        C4179no c4179no;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = null;
        int i14 = i;
        int i15 = i5;
        while (i15 < i8 && i15 >= i7 && i14 < i4 && i14 >= i3) {
            if (i2 == 0) {
                z = true;
                c4179no = this;
                i10 = i15;
                i11 = i9;
                i12 = i3;
                i13 = i4;
            } else {
                z = false;
                c4179no = this;
                i10 = i14;
                i11 = i9;
                i12 = i7;
                i13 = i8;
            }
            int[] iArrOooO00o = c4179no.OooO00o(i10, i11, i12, i13, z);
            if (iArrOooO00o == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i2 == 0) {
                    int i16 = i15 - i6;
                    if (iArr[0] >= i) {
                        return new C3807dm(iArr[1], i16);
                    }
                    if (iArr[1] > i) {
                        return new C3807dm(iArr[i6 > 0 ? (char) 0 : (char) 1], i16);
                    }
                    return new C3807dm(iArr[0], i16);
                }
                int i17 = i14 - i2;
                if (iArr[0] >= i5) {
                    return new C3807dm(i17, iArr[1]);
                }
                if (iArr[1] > i5) {
                    return new C3807dm(i17, iArr[i2 < 0 ? (char) 0 : (char) 1]);
                }
                return new C3807dm(i17, iArr[0]);
            }
            i15 += i6;
            i14 += i2;
            iArr = iArrOooO00o;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final C3807dm[] OooO0O0() throws NotFoundException {
        int iOooO0oo = this.OooO00o.OooO0oo();
        int iOooOOO0 = this.OooO00o.OooOOO0();
        int i = iOooO0oo / 2;
        int i2 = iOooOOO0 / 2;
        int iMax = Math.max(1, iOooO0oo / 256);
        int iMax2 = Math.max(1, iOooOOO0 / 256);
        int i3 = -iMax;
        int i4 = i2 / 2;
        int iOooO0Oo = ((int) OooO0OO(i2, 0, 0, iOooOOO0, i, i3, 0, iOooO0oo, i4).OooO0Oo()) - 1;
        int i5 = i / 2;
        C3807dm c3807dmOooO0OO = OooO0OO(i2, -iMax2, 0, iOooOOO0, i, 0, iOooO0Oo, iOooO0oo, i5);
        int iOooO0OO = ((int) c3807dmOooO0OO.OooO0OO()) - 1;
        C3807dm c3807dmOooO0OO2 = OooO0OO(i2, iMax2, iOooO0OO, iOooOOO0, i, 0, iOooO0Oo, iOooO0oo, i5);
        int iOooO0OO2 = ((int) c3807dmOooO0OO2.OooO0OO()) + 1;
        C3807dm c3807dmOooO0OO3 = OooO0OO(i2, 0, iOooO0OO, iOooO0OO2, i, iMax, iOooO0Oo, iOooO0oo, i4);
        return new C3807dm[]{OooO0OO(i2, 0, iOooO0OO, iOooO0OO2, i, i3, iOooO0Oo, ((int) c3807dmOooO0OO3.OooO0Oo()) + 1, i2 / 4), c3807dmOooO0OO, c3807dmOooO0OO2, c3807dmOooO0OO3};
    }
}
