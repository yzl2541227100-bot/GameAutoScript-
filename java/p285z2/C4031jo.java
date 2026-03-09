package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.jo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4031jo extends C3957ho {
    private static final int OooO = 3;
    private static final int OooOO0 = 8;
    private static final int OooOO0O = 7;
    private static final int OooOO0o = 40;
    private static final int OooOOO0 = 24;
    private C3772co OooO0oo;

    public C4031jo(AbstractC4509wl abstractC4509wl) {
        super(abstractC4509wl);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[PHI: r5
  0x009e: PHI (r5v3 int) = (r5v2 int), (r5v6 int), (r5v6 int) binds: [B:31:0x007b, B:33:0x007f, B:34:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[][] OooO(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 8
            int r3 = r21 + (-8)
            int r4 = r20 + (-8)
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class<int> r9 = int.class
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            r9 = 0
        L1c:
            if (r9 >= r1) goto Lb7
            int r10 = r9 << 3
            if (r10 <= r3) goto L23
            r10 = r3
        L23:
            r11 = 0
        L24:
            if (r11 >= r0) goto Lac
            int r12 = r11 << 3
            if (r12 <= r4) goto L2b
            r12 = r4
        L2b:
            int r13 = r10 * r20
            int r13 = r13 + r12
            r12 = 255(0xff, float:3.57E-43)
            r8 = 255(0xff, float:3.57E-43)
            r14 = 0
            r15 = 0
            r16 = 0
        L36:
            if (r14 >= r2) goto L74
            r7 = r16
            r5 = 0
        L3b:
            if (r5 >= r2) goto L4e
            int r16 = r13 + r5
            r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            if (r2 >= r8) goto L46
            r8 = r2
        L46:
            if (r2 <= r7) goto L49
            r7 = r2
        L49:
            int r5 = r5 + 1
            r2 = 8
            goto L3b
        L4e:
            int r2 = r7 - r8
            r5 = 24
            if (r2 <= r5) goto L6a
        L54:
            int r14 = r14 + 1
            int r13 = r13 + r20
            r2 = 8
            if (r14 >= r2) goto L6a
            r5 = 0
        L5d:
            if (r5 >= r2) goto L54
            int r16 = r13 + r5
            r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            int r5 = r5 + 1
            r2 = 8
            goto L5d
        L6a:
            r2 = 1
            int r14 = r14 + r2
            int r13 = r13 + r20
            r16 = r7
            r2 = 8
            r7 = 1
            goto L36
        L74:
            r2 = 1
            int r5 = r15 >> 6
            int r7 = r16 - r8
            r12 = 24
            if (r7 > r12) goto L9e
            int r5 = r8 / 2
            if (r9 <= 0) goto L9e
            if (r11 <= 0) goto L9e
            int r7 = r9 + (-1)
            r12 = r6[r7]
            r12 = r12[r11]
            r13 = r6[r9]
            int r14 = r11 + (-1)
            r13 = r13[r14]
            r15 = 2
            int r13 = r13 * 2
            int r12 = r12 + r13
            r7 = r6[r7]
            r7 = r7[r14]
            int r12 = r12 + r7
            int r7 = r12 / 4
            if (r8 >= r7) goto L9f
            r5 = r7
            goto L9f
        L9e:
            r15 = 2
        L9f:
            r7 = r6[r9]
            r7[r11] = r5
            int r11 = r11 + 1
            r2 = 8
            r5 = 2
            r7 = 1
            r8 = 0
            goto L24
        Lac:
            r2 = 1
            r15 = 2
            int r9 = r9 + 1
            r2 = 8
            r5 = 2
            r7 = 1
            r8 = 0
            goto L1c
        Lb7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4031jo.OooO(byte[], int, int, int, int):int[][]");
    }

    private static void OooOO0(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C3772co c3772co) {
        int i5 = i4 - 8;
        int i6 = i3 - 8;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 << 3;
            int i9 = i8 > i5 ? i5 : i8;
            int iOooOO0O = OooOO0O(i7, 2, i2 - 3);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 << 3;
                int i12 = i11 > i6 ? i6 : i11;
                int iOooOO0O2 = OooOO0O(i10, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[iOooOO0O + i14];
                    i13 += iArr2[iOooOO0O2 - 2] + iArr2[iOooOO0O2 - 1] + iArr2[iOooOO0O2] + iArr2[iOooOO0O2 + 1] + iArr2[iOooOO0O2 + 2];
                }
                OooOO0o(bArr, i12, i9, i13 / 25, i3, c3772co);
            }
        }
    }

    private static int OooOO0O(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static void OooOO0o(byte[] bArr, int i, int i2, int i3, int i4, C3772co c3772co) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    c3772co.OooOOo0(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // p285z2.C3957ho, p285z2.AbstractC4361sl
    public final AbstractC4361sl OooO00o(AbstractC4509wl abstractC4509wl) {
        return new C4031jo(abstractC4509wl);
    }

    @Override // p285z2.C3957ho, p285z2.AbstractC4361sl
    public final C3772co OooO0O0() throws NotFoundException {
        C3772co c3772coOooO0O0;
        C3772co c3772co = this.OooO0oo;
        if (c3772co != null) {
            return c3772co;
        }
        AbstractC4509wl abstractC4509wlOooO0o0 = OooO0o0();
        int iOooO0o0 = abstractC4509wlOooO0o0.OooO0o0();
        int iOooO0O0 = abstractC4509wlOooO0o0.OooO0O0();
        if (iOooO0o0 < 40 || iOooO0O0 < 40) {
            c3772coOooO0O0 = super.OooO0O0();
        } else {
            byte[] bArrOooO0OO = abstractC4509wlOooO0o0.OooO0OO();
            int i = iOooO0o0 >> 3;
            if ((iOooO0o0 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = iOooO0O0 >> 3;
            if ((iOooO0O0 & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] iArrOooO = OooO(bArrOooO0OO, i2, i4, iOooO0o0, iOooO0O0);
            c3772coOooO0O0 = new C3772co(iOooO0o0, iOooO0O0);
            OooOO0(bArrOooO0OO, i2, i4, iOooO0o0, iOooO0O0, iArrOooO, c3772coOooO0O0);
        }
        this.OooO0oo = c3772coOooO0O0;
        return this.OooO0oo;
    }
}
