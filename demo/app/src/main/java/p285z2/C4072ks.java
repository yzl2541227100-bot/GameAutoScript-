package p285z2;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* JADX INFO: renamed from: z2.ks */
/* JADX INFO: loaded from: classes2.dex */
public final class C4072ks {
    private static final int OooO00o = 2;
    private static final int OooO0O0 = 3;
    private static final int OooO0OO = 512;
    private static final C4109ls OooO0Oo = new C4109ls();

    private C4072ks() {
    }

    public static C3846eo OooO(C3772co c3772co, C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4, int i, int i2) throws NotFoundException, ChecksumException, FormatException {
        int i3;
        int i4;
        int i5;
        C3998is c3998isOooOOoo = null;
        C3998is c3998isOooOOoo2 = null;
        C3924gs c3924gsOooOo0O = null;
        C3850es c3850es = new C3850es(c3772co, c3807dm, c3807dm2, c3807dm3, c3807dm4);
        for (int i6 = 0; i6 < 2; i6++) {
            if (c3807dm != null) {
                c3998isOooOOoo = OooOOoo(c3772co, c3850es, c3807dm, true, i, i2);
            }
            if (c3807dm3 != null) {
                c3998isOooOOoo2 = OooOOoo(c3772co, c3850es, c3807dm3, false, i, i2);
            }
            c3924gsOooOo0O = OooOo0O(c3998isOooOOoo, c3998isOooOOoo2);
            if (c3924gsOooOo0O == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i6 != 0 || c3924gsOooOo0O.OooOOO0() == null || (c3924gsOooOo0O.OooOOO0().OooO0oO() >= c3850es.OooO0oO() && c3924gsOooOo0O.OooOOO0().OooO0o0() <= c3850es.OooO0o0())) {
                c3924gsOooOo0O.OooOOOo(c3850es);
                break;
            }
            c3850es = c3924gsOooOo0O.OooOOO0();
        }
        int iOooOO0 = c3924gsOooOo0O.OooOO0() + 1;
        c3924gsOooOo0O.OooOOo0(0, c3998isOooOOoo);
        c3924gsOooOo0O.OooOOo0(iOooOO0, c3998isOooOOoo2);
        boolean z = c3998isOooOOoo != null;
        int iMin = i;
        int iMax = i2;
        for (int i7 = 1; i7 <= iOooOO0; i7++) {
            int i8 = z ? i7 : iOooOO0 - i7;
            if (c3924gsOooOo0O.OooOOO(i8) == null) {
                C3961hs c3998is = (i8 == 0 || i8 == iOooOO0) ? new C3998is(c3850es, i8 == 0) : new C3961hs(c3850es);
                c3924gsOooOo0O.OooOOo0(i8, c3998is);
                int i9 = -1;
                int iOooO0oO = c3850es.OooO0oO();
                int i10 = -1;
                while (iOooO0oO <= c3850es.OooO0o0()) {
                    int iOooOo00 = OooOo00(c3924gsOooOo0O, i8, iOooO0oO, z);
                    if (iOooOo00 >= 0 && iOooOo00 <= c3850es.OooO0Oo()) {
                        i5 = iOooOo00;
                    } else if (i10 != i9) {
                        i5 = i10;
                    } else {
                        i3 = i10;
                        i4 = iOooO0oO;
                        i10 = i3;
                        iOooO0oO = i4 + 1;
                        i9 = -1;
                    }
                    i3 = i10;
                    int i11 = iOooO0oO;
                    C3887fs c3887fsOooOO0O = OooOO0O(c3772co, c3850es.OooO0o(), c3850es.OooO0Oo(), z, i5, i11, iMin, iMax);
                    i4 = i11;
                    if (c3887fsOooOO0O != null) {
                        c3998is.OooO0o(i4, c3887fsOooOO0O);
                        iMin = Math.min(iMin, c3887fsOooOO0O.OooO0o());
                        iMax = Math.max(iMax, c3887fsOooOO0O.OooO0o());
                        i10 = i5;
                    } else {
                        i10 = i3;
                    }
                    iOooO0oO = i4 + 1;
                    i9 = -1;
                }
            }
        }
        return OooO0oO(c3924gsOooOo0O);
    }

    private static C3850es OooO00o(C3998is c3998is) throws NotFoundException {
        int[] iArrOooOO0;
        if (c3998is == null || (iArrOooOO0 = c3998is.OooOO0()) == null) {
            return null;
        }
        int iOooOOOo = OooOOOo(iArrOooOO0);
        int i = 0;
        int i2 = 0;
        for (int i3 : iArrOooOO0) {
            i2 += iOooOOOo - i3;
            if (i3 > 0) {
                break;
            }
        }
        C3887fs[] c3887fsArrOooO0Oo = c3998is.OooO0Oo();
        for (int i4 = 0; i2 > 0 && c3887fsArrOooO0Oo[i4] == null; i4++) {
            i2--;
        }
        for (int length = iArrOooOO0.length - 1; length >= 0; length--) {
            i += iOooOOOo - iArrOooOO0[length];
            if (iArrOooOO0[length] > 0) {
                break;
            }
        }
        for (int length2 = c3887fsArrOooO0Oo.length - 1; i > 0 && c3887fsArrOooO0Oo[length2] == null; length2--) {
            i--;
        }
        return c3998is.OooO00o().OooO00o(i2, i, c3998is.OooOO0O());
    }

    private static void OooO0O0(C3924gs c3924gs, C3813ds[][] c3813dsArr) throws NotFoundException {
        C3813ds c3813ds = c3813dsArr[0][1];
        int[] iArrOooO0O0 = c3813ds.OooO0O0();
        int iOooOO0 = (c3924gs.OooOO0() * c3924gs.OooOO0o()) - OooOOo(c3924gs.OooOO0O());
        if (iArrOooO0O0.length != 0) {
            if (iArrOooO0O0[0] != iOooOO0) {
                c3813ds.OooO0OO(iOooOO0);
            }
        } else {
            if (iOooOO0 <= 0 || iOooOO0 > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            c3813ds.OooO0OO(iOooOO0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r0 = -r0;
        r8 = !r8;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int OooO0OO(p285z2.C3772co r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.OooO0o0(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4072ks.OooO0OO(z2.co, int, int, boolean, int, int):int");
    }

    private static boolean OooO0Oo(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    private static C3813ds[][] OooO0o(C3924gs c3924gs) {
        int iOooO0OO;
        C3813ds[][] c3813dsArr = (C3813ds[][]) Array.newInstance((Class<?>) C3813ds.class, c3924gs.OooOO0o(), c3924gs.OooOO0() + 2);
        for (int i = 0; i < c3813dsArr.length; i++) {
            for (int i2 = 0; i2 < c3813dsArr[i].length; i2++) {
                c3813dsArr[i][i2] = new C3813ds();
            }
        }
        int i3 = 0;
        for (C3961hs c3961hs : c3924gs.OooOOOO()) {
            if (c3961hs != null) {
                for (C3887fs c3887fs : c3961hs.OooO0Oo()) {
                    if (c3887fs != null && (iOooO0OO = c3887fs.OooO0OO()) >= 0 && iOooO0OO < c3813dsArr.length) {
                        c3813dsArr[iOooO0OO][i3].OooO0OO(c3887fs.OooO0o0());
                    }
                }
            }
            i3++;
        }
        return c3813dsArr;
    }

    private static int OooO0o0(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return OooO0Oo.OooO00o(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    private static C3846eo OooO0oO(C3924gs c3924gs) throws NotFoundException, ChecksumException, FormatException {
        C3813ds[][] c3813dsArrOooO0o = OooO0o(c3924gs);
        OooO0O0(c3924gs, c3813dsArrOooO0o);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c3924gs.OooOO0o() * c3924gs.OooOO0()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < c3924gs.OooOO0o(); i++) {
            int i2 = 0;
            while (i2 < c3924gs.OooOO0()) {
                int i3 = i2 + 1;
                int[] iArrOooO0O0 = c3813dsArrOooO0o[i][i3].OooO0O0();
                int iOooOO0 = (c3924gs.OooOO0() * i) + i2;
                if (iArrOooO0O0.length == 0) {
                    arrayList.add(Integer.valueOf(iOooOO0));
                } else if (iArrOooO0O0.length == 1) {
                    iArr[iOooOO0] = iArrOooO0O0[0];
                } else {
                    arrayList3.add(Integer.valueOf(iOooOO0));
                    arrayList2.add(iArrOooO0O0);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return OooO0oo(c3924gs.OooOO0O(), iArr, C4589yr.OooO0OO(arrayList), C4589yr.OooO0OO(arrayList3), iArr2);
    }

    private static C3846eo OooO0oo(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
            }
            try {
                return OooOO0(iArr, i, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (iArr5[i5] < iArr4[i5].length - 1) {
                        iArr5[i5] = iArr5[i5] + 1;
                        break;
                    }
                    iArr5[i5] = 0;
                    if (i5 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    i5++;
                }
                i2 = i3;
            }
        }
    }

    private static C3846eo OooOO0(int[] iArr, int i, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i2 = 1 << (i + 1);
        int iOooO0o0 = OooO0o0(iArr, iArr2, i2);
        OooOo(iArr, i2);
        C3846eo c3846eoOooO0O0 = DecodedBitStreamParser.OooO0O0(iArr, String.valueOf(i));
        c3846eoOooO0O0.OooOOO0(Integer.valueOf(iOooO0o0));
        c3846eoOooO0O0.OooOO0o(Integer.valueOf(iArr2.length));
        return c3846eoOooO0O0;
    }

    private static C3887fs OooOO0O(C3772co c3772co, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int iOooO0Oo;
        int iOooO0O0;
        int iOooO0OO = OooO0OO(c3772co, i, i2, z, i3, i4);
        int[] iArrOooOOo0 = OooOOo0(c3772co, i, i2, z, iOooO0OO, i4);
        if (iArrOooOOo0 == null) {
            return null;
        }
        int iOooO0Oo2 = C4142mo.OooO0Oo(iArrOooOOo0);
        if (z) {
            i7 = iOooO0OO + iOooO0Oo2;
        } else {
            for (int i8 = 0; i8 < iArrOooOOo0.length / 2; i8++) {
                int i9 = iArrOooOOo0[i8];
                iArrOooOOo0[i8] = iArrOooOOo0[(iArrOooOOo0.length - 1) - i8];
                iArrOooOOo0[(iArrOooOOo0.length - 1) - i8] = i9;
            }
            iOooO0OO -= iOooO0Oo2;
            i7 = iOooO0OO;
        }
        if (OooO0Oo(iOooO0Oo2, i5, i6) && (iOooO0O0 = C4589yr.OooO0O0((iOooO0Oo = C4035js.OooO0Oo(iArrOooOOo0)))) != -1) {
            return new C3887fs(iOooO0OO, i7, OooOOO(iOooO0Oo), iOooO0O0);
        }
        return null;
    }

    private static C3776cs OooOO0o(C3998is c3998is, C3998is c3998is2) {
        C3776cs c3776csOooO;
        C3776cs c3776csOooO2;
        if (c3998is == null || (c3776csOooO = c3998is.OooO()) == null) {
            if (c3998is2 == null) {
                return null;
            }
            return c3998is2.OooO();
        }
        if (c3998is2 == null || (c3776csOooO2 = c3998is2.OooO()) == null || c3776csOooO.OooO00o() == c3776csOooO2.OooO00o() || c3776csOooO.OooO0O0() == c3776csOooO2.OooO0O0() || c3776csOooO.OooO0OO() == c3776csOooO2.OooO0OO()) {
            return c3776csOooO;
        }
        return null;
    }

    private static int OooOOO(int i) {
        return OooOOOO(OooOOO0(i));
    }

    private static int[] OooOOO0(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static int OooOOOO(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int OooOOOo(int[] iArr) {
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        return iMax;
    }

    private static int OooOOo(int i) {
        return 2 << i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] OooOOo0(p285z2.C3772co r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.OooO0o0(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4072ks.OooOOo0(z2.co, int, int, boolean, int, int):int[]");
    }

    private static C3998is OooOOoo(C3772co c3772co, C3850es c3850es, C3807dm c3807dm, boolean z, int i, int i2) {
        C3998is c3998is = new C3998is(c3850es, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int iOooO0OO = (int) c3807dm.OooO0OO();
            for (int iOooO0Oo = (int) c3807dm.OooO0Oo(); iOooO0Oo <= c3850es.OooO0o0() && iOooO0Oo >= c3850es.OooO0oO(); iOooO0Oo += i4) {
                C3887fs c3887fsOooOO0O = OooOO0O(c3772co, 0, c3772co.OooOOO0(), z, iOooO0OO, iOooO0Oo, i, i2);
                if (c3887fsOooOO0O != null) {
                    c3998is.OooO0o(iOooO0Oo, c3887fsOooOO0O);
                    iOooO0OO = z ? c3887fsOooOO0O.OooO0Oo() : c3887fsOooOO0O.OooO0O0();
                }
            }
            i3++;
        }
        return c3998is;
    }

    private static void OooOo(int[] iArr, int i) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i2 == 0) {
            if (i >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i;
        }
    }

    private static boolean OooOo0(C3924gs c3924gs, int i) {
        return i >= 0 && i <= c3924gs.OooOO0() + 1;
    }

    private static int OooOo00(C3924gs c3924gs, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        C3887fs c3887fsOooO0O0 = OooOo0(c3924gs, i4) ? c3924gs.OooOOO(i4).OooO0O0(i2) : null;
        if (c3887fsOooO0O0 != null) {
            return z ? c3887fsOooO0O0.OooO0O0() : c3887fsOooO0O0.OooO0Oo();
        }
        C3887fs c3887fsOooO0OO = c3924gs.OooOOO(i).OooO0OO(i2);
        if (c3887fsOooO0OO != null) {
            return z ? c3887fsOooO0OO.OooO0Oo() : c3887fsOooO0OO.OooO0O0();
        }
        if (OooOo0(c3924gs, i4)) {
            c3887fsOooO0OO = c3924gs.OooOOO(i4).OooO0OO(i2);
        }
        if (c3887fsOooO0OO != null) {
            return z ? c3887fsOooO0OO.OooO0O0() : c3887fsOooO0OO.OooO0Oo();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!OooOo0(c3924gs, i)) {
                C3850es c3850esOooOOO0 = c3924gs.OooOOO0();
                return z ? c3850esOooOOO0.OooO0o() : c3850esOooOOO0.OooO0Oo();
            }
            for (C3887fs c3887fs : c3924gs.OooOOO(i).OooO0Oo()) {
                if (c3887fs != null) {
                    return (z ? c3887fs.OooO0O0() : c3887fs.OooO0Oo()) + (i3 * i5 * (c3887fs.OooO0O0() - c3887fs.OooO0Oo()));
                }
            }
            i5++;
        }
    }

    private static C3924gs OooOo0O(C3998is c3998is, C3998is c3998is2) throws NotFoundException {
        C3776cs c3776csOooOO0o;
        if ((c3998is == null && c3998is2 == null) || (c3776csOooOO0o = OooOO0o(c3998is, c3998is2)) == null) {
            return null;
        }
        return new C3924gs(c3776csOooOO0o, C3850es.OooOO0(OooO00o(c3998is), OooO00o(c3998is2)));
    }

    public static String OooOo0o(C3813ds[][] c3813dsArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < c3813dsArr.length; i++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i));
                for (int i2 = 0; i2 < c3813dsArr[i].length; i2++) {
                    C3813ds c3813ds = c3813dsArr[i][i2];
                    if (c3813ds.OooO0O0().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", Integer.valueOf(c3813ds.OooO0O0()[0]), c3813ds.OooO00o(c3813ds.OooO0O0()[0]));
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
