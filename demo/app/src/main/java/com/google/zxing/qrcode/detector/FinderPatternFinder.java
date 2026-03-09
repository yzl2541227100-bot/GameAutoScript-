package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p285z2.C3772co;
import p285z2.C3807dm;
import p285z2.C3999it;
import p285z2.C4036jt;
import p285z2.InterfaceC3844em;

/* JADX INFO: loaded from: classes2.dex */
public class FinderPatternFinder {
    private static final int OooO0o = 2;
    public static final int OooO0oO = 3;
    public static final int OooO0oo = 97;
    private final C3772co OooO00o;
    private final List<C3999it> OooO0O0;
    private boolean OooO0OO;
    private final int[] OooO0Oo;
    private final InterfaceC3844em OooO0o0;

    public static final class CenterComparator implements Serializable, Comparator<C3999it> {
        private final float average;

        private CenterComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public final int compare(C3999it c3999it, C3999it c3999it2) {
            int iCompare = Integer.compare(c3999it2.OooO0oo(), c3999it.OooO0oo());
            return iCompare == 0 ? Float.compare(Math.abs(c3999it.OooO() - this.average), Math.abs(c3999it2.OooO() - this.average)) : iCompare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<C3999it> {
        private final float average;

        private FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public final int compare(C3999it c3999it, C3999it c3999it2) {
            return Float.compare(Math.abs(c3999it2.OooO() - this.average), Math.abs(c3999it.OooO() - this.average));
        }
    }

    public FinderPatternFinder(C3772co c3772co) {
        this(c3772co, null);
    }

    public FinderPatternFinder(C3772co c3772co, InterfaceC3844em interfaceC3844em) {
        this.OooO00o = c3772co;
        this.OooO0O0 = new ArrayList();
        this.OooO0Oo = new int[5];
        this.OooO0o0 = interfaceC3844em;
    }

    public static boolean OooO(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    private static float OooO00o(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean OooO0OO(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrOooOO0 = OooOO0();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.OooO00o.OooO0o0(i2 - i6, i - i6)) {
            iArrOooOO0[2] = iArrOooOO0[2] + 1;
            i6++;
        }
        if (iArrOooOO0[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.OooO00o.OooO0o0(i2 - i6, i - i6)) {
            iArrOooOO0[1] = iArrOooOO0[1] + 1;
            i6++;
        }
        if (iArrOooOO0[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.OooO00o.OooO0o0(i2 - i6, i - i6)) {
            iArrOooOO0[0] = iArrOooOO0[0] + 1;
            i6++;
        }
        if (iArrOooOO0[0] == 0) {
            return false;
        }
        int iOooO0oo = this.OooO00o.OooO0oo();
        int iOooOOO0 = this.OooO00o.OooOOO0();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= iOooO0oo || (i5 = i2 + i7) >= iOooOOO0 || !this.OooO00o.OooO0o0(i5, i8)) {
                break;
            }
            iArrOooOO0[2] = iArrOooOO0[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= iOooO0oo || (i4 = i2 + i7) >= iOooOOO0 || this.OooO00o.OooO0o0(i4, i9)) {
                break;
            }
            iArrOooOO0[3] = iArrOooOO0[3] + 1;
            i7++;
        }
        if (iArrOooOO0[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= iOooO0oo || (i3 = i2 + i7) >= iOooOOO0 || !this.OooO00o.OooO0o0(i3, i10)) {
                break;
            }
            iArrOooOO0[4] = iArrOooOO0[4] + 1;
            i7++;
        }
        if (iArrOooOO0[4] == 0) {
            return false;
        }
        return OooO(iArrOooOO0);
    }

    private float OooO0Oo(int i, int i2, int i3, int i4) {
        C3772co c3772co = this.OooO00o;
        int iOooOOO0 = c3772co.OooOOO0();
        int[] iArrOooOO0 = OooOO0();
        int i5 = i;
        while (i5 >= 0 && c3772co.OooO0o0(i5, i2)) {
            iArrOooOO0[2] = iArrOooOO0[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !c3772co.OooO0o0(i5, i2) && iArrOooOO0[1] <= i3) {
            iArrOooOO0[1] = iArrOooOO0[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArrOooOO0[1] <= i3) {
            while (i5 >= 0 && c3772co.OooO0o0(i5, i2) && iArrOooOO0[0] <= i3) {
                iArrOooOO0[0] = iArrOooOO0[0] + 1;
                i5--;
            }
            if (iArrOooOO0[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < iOooOOO0 && c3772co.OooO0o0(i6, i2)) {
                iArrOooOO0[2] = iArrOooOO0[2] + 1;
                i6++;
            }
            if (i6 == iOooOOO0) {
                return Float.NaN;
            }
            while (i6 < iOooOOO0 && !c3772co.OooO0o0(i6, i2) && iArrOooOO0[3] < i3) {
                iArrOooOO0[3] = iArrOooOO0[3] + 1;
                i6++;
            }
            if (i6 != iOooOOO0 && iArrOooOO0[3] < i3) {
                while (i6 < iOooOOO0 && c3772co.OooO0o0(i6, i2) && iArrOooOO0[4] < i3) {
                    iArrOooOO0[4] = iArrOooOO0[4] + 1;
                    i6++;
                }
                if (iArrOooOO0[4] < i3 && Math.abs(((((iArrOooOO0[0] + iArrOooOO0[1]) + iArrOooOO0[2]) + iArrOooOO0[3]) + iArrOooOO0[4]) - i4) * 5 < i4 && OooO0oo(iArrOooOO0)) {
                    return OooO00o(iArrOooOO0, i6);
                }
            }
        }
        return Float.NaN;
    }

    private float OooO0o0(int i, int i2, int i3, int i4) {
        C3772co c3772co = this.OooO00o;
        int iOooO0oo = c3772co.OooO0oo();
        int[] iArrOooOO0 = OooOO0();
        int i5 = i;
        while (i5 >= 0 && c3772co.OooO0o0(i2, i5)) {
            iArrOooOO0[2] = iArrOooOO0[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !c3772co.OooO0o0(i2, i5) && iArrOooOO0[1] <= i3) {
            iArrOooOO0[1] = iArrOooOO0[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArrOooOO0[1] <= i3) {
            while (i5 >= 0 && c3772co.OooO0o0(i2, i5) && iArrOooOO0[0] <= i3) {
                iArrOooOO0[0] = iArrOooOO0[0] + 1;
                i5--;
            }
            if (iArrOooOO0[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < iOooO0oo && c3772co.OooO0o0(i2, i6)) {
                iArrOooOO0[2] = iArrOooOO0[2] + 1;
                i6++;
            }
            if (i6 == iOooO0oo) {
                return Float.NaN;
            }
            while (i6 < iOooO0oo && !c3772co.OooO0o0(i2, i6) && iArrOooOO0[3] < i3) {
                iArrOooOO0[3] = iArrOooOO0[3] + 1;
                i6++;
            }
            if (i6 != iOooO0oo && iArrOooOO0[3] < i3) {
                while (i6 < iOooO0oo && c3772co.OooO0o0(i2, i6) && iArrOooOO0[4] < i3) {
                    iArrOooOO0[4] = iArrOooOO0[4] + 1;
                    i6++;
                }
                if (iArrOooOO0[4] < i3 && Math.abs(((((iArrOooOO0[0] + iArrOooOO0[1]) + iArrOooOO0[2]) + iArrOooOO0[3]) + iArrOooOO0[4]) - i4) * 5 < i4 * 2 && OooO0oo(iArrOooOO0)) {
                    return OooO00o(iArrOooOO0, i6);
                }
            }
        }
        return Float.NaN;
    }

    private int OooO0oO() {
        if (this.OooO0O0.size() <= 1) {
            return 0;
        }
        C3999it c3999it = null;
        for (C3999it c3999it2 : this.OooO0O0) {
            if (c3999it2.OooO0oo() >= 2) {
                if (c3999it != null) {
                    this.OooO0OO = true;
                    return ((int) (Math.abs(c3999it.OooO0OO() - c3999it2.OooO0OO()) - Math.abs(c3999it.OooO0Oo() - c3999it2.OooO0Oo()))) / 2;
                }
                c3999it = c3999it2;
            }
        }
        return 0;
    }

    public static boolean OooO0oo(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    private int[] OooOO0() {
        OooO0O0(this.OooO0Oo);
        return this.OooO0Oo;
    }

    private boolean OooOOOO() {
        int size = this.OooO0O0.size();
        float fAbs = 0.0f;
        int i = 0;
        float fOooO = 0.0f;
        for (C3999it c3999it : this.OooO0O0) {
            if (c3999it.OooO0oo() >= 2) {
                i++;
                fOooO += c3999it.OooO();
            }
        }
        if (i < 3) {
            return false;
        }
        float f = fOooO / size;
        Iterator<C3999it> it = this.OooO0O0.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().OooO() - f);
        }
        return fAbs <= fOooO * 0.05f;
    }

    private C3999it[] OooOOOo() throws NotFoundException {
        int size = this.OooO0O0.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fOooO = 0.0f;
        if (size > 3) {
            Iterator<C3999it> it = this.OooO0O0.iterator();
            float f = 0.0f;
            float f2 = 0.0f;
            while (it.hasNext()) {
                float fOooO2 = it.next().OooO();
                f += fOooO2;
                f2 += fOooO2 * fOooO2;
            }
            float f3 = f / size;
            float fSqrt = (float) Math.sqrt((f2 / r0) - (f3 * f3));
            Collections.sort(this.OooO0O0, new FurthestFromAverageComparator(f3));
            float fMax = Math.max(0.2f * f3, fSqrt);
            int i = 0;
            while (i < this.OooO0O0.size() && this.OooO0O0.size() > 3) {
                if (Math.abs(this.OooO0O0.get(i).OooO() - f3) > fMax) {
                    this.OooO0O0.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (this.OooO0O0.size() > 3) {
            Iterator<C3999it> it2 = this.OooO0O0.iterator();
            while (it2.hasNext()) {
                fOooO += it2.next().OooO();
            }
            Collections.sort(this.OooO0O0, new CenterComparator(fOooO / this.OooO0O0.size()));
            List<C3999it> list = this.OooO0O0;
            list.subList(3, list.size()).clear();
        }
        return new C3999it[]{this.OooO0O0.get(0), this.OooO0O0.get(1), this.OooO0O0.get(2)};
    }

    public final void OooO0O0(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public final C4036jt OooO0o(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int iOooO0oo = this.OooO00o.OooO0oo();
        int iOooOOO0 = this.OooO00o.OooOOO0();
        int i = (iOooO0oo * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean zOooOOOO = false;
        while (i2 < iOooO0oo && !zOooOOOO) {
            OooO0O0(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < iOooOOO0) {
                if (this.OooO00o.OooO0o0(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (OooO0oo(iArr) && OooOOO0(iArr, i2, i3)) {
                    if (this.OooO0OO) {
                        zOooOOOO = OooOOOO();
                    } else {
                        int iOooO0oO = OooO0oO();
                        if (iOooO0oO > iArr[2]) {
                            i2 += (iOooO0oO - iArr[2]) - 2;
                            i3 = iOooOOO0 - 1;
                        }
                    }
                    OooO0O0(iArr);
                    i = 2;
                    i4 = 0;
                } else {
                    OooOOo0(iArr);
                    i4 = 3;
                }
                i3++;
            }
            if (OooO0oo(iArr) && OooOOO0(iArr, i2, iOooOOO0)) {
                i = iArr[0];
                if (this.OooO0OO) {
                    zOooOOOO = OooOOOO();
                }
            }
            i2 += i;
        }
        C3999it[] c3999itArrOooOOOo = OooOOOo();
        C3807dm.OooO0o0(c3999itArrOooOOOo);
        return new C4036jt(c3999itArrOooOOOo);
    }

    public final C3772co OooOO0O() {
        return this.OooO00o;
    }

    public final List<C3999it> OooOO0o() {
        return this.OooO0O0;
    }

    @Deprecated
    public final boolean OooOOO(int[] iArr, int i, int i2, boolean z) {
        return OooOOO0(iArr, i, i2);
    }

    public final boolean OooOOO0(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iOooO00o = (int) OooO00o(iArr, i2);
        float fOooO0o0 = OooO0o0(i, iOooO00o, iArr[2], i3);
        if (!Float.isNaN(fOooO0o0)) {
            int i4 = (int) fOooO0o0;
            float fOooO0Oo = OooO0Oo(iOooO00o, i4, iArr[2], i3);
            if (!Float.isNaN(fOooO0Oo) && OooO0OO(i4, (int) fOooO0Oo)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.OooO0O0.size()) {
                        break;
                    }
                    C3999it c3999it = this.OooO0O0.get(i5);
                    if (c3999it.OooO0o(f, fOooO0o0, fOooO0Oo)) {
                        this.OooO0O0.set(i5, c3999it.OooO0oO(fOooO0o0, fOooO0Oo, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C3999it c3999it2 = new C3999it(fOooO0Oo, fOooO0o0, f);
                    this.OooO0O0.add(c3999it2);
                    InterfaceC3844em interfaceC3844em = this.OooO0o0;
                    if (interfaceC3844em != null) {
                        interfaceC3844em.OooO00o(c3999it2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void OooOOo0(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
