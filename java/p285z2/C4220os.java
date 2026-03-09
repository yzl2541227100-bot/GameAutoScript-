package p285z2;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z2.os */
/* JADX INFO: loaded from: classes2.dex */
public final class C4220os {
    private static final int OooO = 25;
    private static final float OooO0OO = 0.42f;
    private static final float OooO0Oo = 0.8f;
    private static final int OooO0oO = 3;
    private static final int OooO0oo = 5;
    private static final int OooOO0 = 5;
    private static final int OooOO0O = 10;
    private static final int[] OooO00o = {0, 4, 1, 5};
    private static final int[] OooO0O0 = {6, 2, 7, 3};
    private static final int[] OooO0o0 = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] OooO0o = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private C4220os() {
    }

    private static void OooO00o(C3807dm[] c3807dmArr, C3807dm[] c3807dmArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            c3807dmArr[iArr[i]] = c3807dmArr2[i];
        }
    }

    public static C4257ps OooO0O0(C4398tl c4398tl, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        C3772co c3772coOooO0O0 = c4398tl.OooO0O0();
        List<C3807dm[]> listOooO0OO = OooO0OO(z, c3772coOooO0O0);
        if (listOooO0OO.isEmpty()) {
            c3772coOooO0O0 = c3772coOooO0O0.clone();
            c3772coOooO0O0.OooOOOo();
            listOooO0OO = OooO0OO(z, c3772coOooO0O0);
        }
        return new C4257ps(c3772coOooO0O0, listOooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r4.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r5 = (p285z2.C3807dm[]) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r5[1] == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r3 = (int) java.lang.Math.max(r3, r5[1].OooO0Oo());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r5[3] == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r3 = java.lang.Math.max(r3, (int) r5[3].OooO0Oo());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<p285z2.C3807dm[]> OooO0OO(boolean r8, p285z2.C3772co r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L8:
            r4 = 0
            r5 = 0
        La:
            int r6 = r9.OooO0oo()
            if (r3 >= r6) goto L78
            z2.dm[] r4 = OooO0o(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L52
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L52
            if (r5 == 0) goto L78
            java.util.Iterator r4 = r0.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            z2.dm[] r5 = (p285z2.C3807dm[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L3f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.OooO0Oo()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L3f:
            r7 = r5[r6]
            if (r7 == 0) goto L23
            r5 = r5[r6]
            float r5 = r5.OooO0Oo()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L23
        L4f:
            int r3 = r3 + 5
            goto L8
        L52:
            r0.add(r4)
            if (r8 == 0) goto L78
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L66
            r5 = r4[r3]
            float r5 = r5.OooO0OO()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L70
        L66:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.OooO0OO()
            int r5 = (int) r5
            r3 = r4[r3]
        L70:
            float r3 = r3.OooO0Oo()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto La
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4220os.OooO0OO(boolean, z2.co):java.util.List");
    }

    private static int[] OooO0Oo(C3772co c3772co, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (c3772co.OooO0o0(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z3 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (c3772co.OooO0o0(i, i2) != z3) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (OooO0oO(iArr2, iArr, OooO0Oo) < OooO0OO) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z3 = !z3;
            }
            i++;
        }
        if (i6 != length - 1 || OooO0oO(iArr2, iArr, OooO0Oo) >= OooO0OO) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    private static C3807dm[] OooO0o(C3772co c3772co, int i, int i2) {
        int iOooO0oo = c3772co.OooO0oo();
        int iOooOOO0 = c3772co.OooOOO0();
        C3807dm[] c3807dmArr = new C3807dm[8];
        OooO00o(c3807dmArr, OooO0o0(c3772co, iOooO0oo, iOooOOO0, i, i2, OooO0o0), OooO00o);
        if (c3807dmArr[4] != null) {
            i2 = (int) c3807dmArr[4].OooO0OO();
            i = (int) c3807dmArr[4].OooO0Oo();
        }
        OooO00o(c3807dmArr, OooO0o0(c3772co, iOooO0oo, iOooOOO0, i, i2, OooO0o), OooO0O0);
        return c3807dmArr;
    }

    private static C3807dm[] OooO0o0(C3772co c3772co, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        C3807dm[] c3807dmArr = new C3807dm[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i) {
                z = false;
                break;
            }
            int[] iArrOooO0Oo = OooO0Oo(c3772co, i4, i8, i2, false, iArr, iArr2);
            if (iArrOooO0Oo != null) {
                int i9 = i8;
                int[] iArr3 = iArrOooO0Oo;
                int i10 = i9;
                while (true) {
                    if (i10 <= 0) {
                        i7 = i10;
                        break;
                    }
                    int i11 = i10 - 1;
                    int[] iArrOooO0Oo2 = OooO0Oo(c3772co, i4, i11, i2, false, iArr, iArr2);
                    if (iArrOooO0Oo2 == null) {
                        i7 = i11 + 1;
                        break;
                    }
                    iArr3 = iArrOooO0Oo2;
                    i10 = i11;
                }
                float f = i7;
                c3807dmArr[0] = new C3807dm(iArr3[0], f);
                c3807dmArr[1] = new C3807dm(iArr3[1], f);
                i8 = i7;
                z = true;
            } else {
                i8 += 5;
            }
        }
        int i12 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) c3807dmArr[0].OooO0OO(), (int) c3807dmArr[1].OooO0OO()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 >= i) {
                    i5 = i14;
                    i6 = i13;
                    break;
                }
                i5 = i14;
                i6 = i13;
                int[] iArrOooO0Oo3 = OooO0Oo(c3772co, iArr4[0], i13, i2, false, iArr, iArr2);
                if (iArrOooO0Oo3 != null && Math.abs(iArr4[0] - iArrOooO0Oo3[0]) < 5 && Math.abs(iArr4[1] - iArrOooO0Oo3[1]) < 5) {
                    iArr4 = iArrOooO0Oo3;
                    i14 = 0;
                } else {
                    if (i5 > 25) {
                        break;
                    }
                    i14 = i5 + 1;
                }
                i13 = i6 + 1;
            }
            i12 = i6 - (i5 + 1);
            float f2 = i12;
            c3807dmArr[2] = new C3807dm(iArr4[0], f2);
            c3807dmArr[3] = new C3807dm(iArr4[1], f2);
        }
        if (i12 - i8 < 10) {
            Arrays.fill(c3807dmArr, (Object) null);
        }
        return c3807dmArr;
    }

    private static float OooO0oO(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
