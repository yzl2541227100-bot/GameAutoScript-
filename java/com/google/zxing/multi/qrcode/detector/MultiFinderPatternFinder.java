package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p285z2.C3772co;
import p285z2.C3807dm;
import p285z2.C3999it;
import p285z2.C4036jt;
import p285z2.InterfaceC3844em;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final C4036jt[] OooO = new C4036jt[0];
    private static final float OooOO0 = 180.0f;
    private static final float OooOO0O = 9.0f;
    private static final float OooOO0o = 0.05f;
    private static final float OooOOO0 = 0.5f;

    public static final class ModuleSizeComparator implements Serializable, Comparator<C3999it> {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(C3999it c3999it, C3999it c3999it2) {
            double dOooO = c3999it2.OooO() - c3999it.OooO();
            if (dOooO < 0.0d) {
                return -1;
            }
            return dOooO > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(C3772co c3772co) {
        super(c3772co);
    }

    public MultiFinderPatternFinder(C3772co c3772co, InterfaceC3844em interfaceC3844em) {
        super(c3772co, interfaceC3844em);
    }

    private C3999it[][] OooOOoo() throws NotFoundException {
        List<C3999it> listOooOO0o = OooOO0o();
        int size = listOooOO0o.size();
        int i = 3;
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        char c = 0;
        if (size == 3) {
            return new C3999it[][]{new C3999it[]{listOooOO0o.get(0), listOooOO0o.get(1), listOooOO0o.get(2)}};
        }
        Collections.sort(listOooOO0o, new ModuleSizeComparator());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size - 2) {
            C3999it c3999it = listOooOO0o.get(i2);
            if (c3999it != null) {
                int i3 = i2 + 1;
                while (i3 < size - 1) {
                    C3999it c3999it2 = listOooOO0o.get(i3);
                    if (c3999it2 != null) {
                        float fOooO = (c3999it.OooO() - c3999it2.OooO()) / Math.min(c3999it.OooO(), c3999it2.OooO());
                        float fAbs = Math.abs(c3999it.OooO() - c3999it2.OooO());
                        float f = OooOO0o;
                        float f2 = 0.5f;
                        if (fAbs <= 0.5f || fOooO < OooOO0o) {
                            int i4 = i3 + 1;
                            while (i4 < size) {
                                C3999it c3999it3 = listOooOO0o.get(i4);
                                if (c3999it3 != null) {
                                    float fOooO2 = (c3999it2.OooO() - c3999it3.OooO()) / Math.min(c3999it2.OooO(), c3999it3.OooO());
                                    if (Math.abs(c3999it2.OooO() - c3999it3.OooO()) <= f2 || fOooO2 < f) {
                                        C3999it[] c3999itArr = new C3999it[i];
                                        c3999itArr[c] = c3999it;
                                        c3999itArr[1] = c3999it2;
                                        c3999itArr[2] = c3999it3;
                                        C3807dm.OooO0o0(c3999itArr);
                                        C4036jt c4036jt = new C4036jt(c3999itArr);
                                        float fOooO0O0 = C3807dm.OooO0O0(c4036jt.OooO0O0(), c4036jt.OooO00o());
                                        float fOooO0O02 = C3807dm.OooO0O0(c4036jt.OooO0OO(), c4036jt.OooO00o());
                                        float fOooO0O03 = C3807dm.OooO0O0(c4036jt.OooO0O0(), c4036jt.OooO0OO());
                                        float fOooO3 = (fOooO0O0 + fOooO0O03) / (c3999it.OooO() * 2.0f);
                                        if (fOooO3 <= OooOO0 && fOooO3 >= OooOO0O && Math.abs((fOooO0O0 - fOooO0O03) / Math.min(fOooO0O0, fOooO0O03)) < 0.1f) {
                                            float fSqrt = (float) Math.sqrt((fOooO0O0 * fOooO0O0) + (fOooO0O03 * fOooO0O03));
                                            if (Math.abs((fOooO0O02 - fSqrt) / Math.min(fOooO0O02, fSqrt)) < 0.1f) {
                                                arrayList.add(c3999itArr);
                                            }
                                        }
                                    }
                                }
                                i4++;
                                i = 3;
                                c = 0;
                                f = OooOO0o;
                                f2 = 0.5f;
                            }
                        }
                    }
                    i3++;
                    i = 3;
                    c = 0;
                }
            }
            i2++;
            i = 3;
            c = 0;
        }
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (C3999it[][]) arrayList.toArray(new C3999it[arrayList.size()][]);
    }

    public final C4036jt[] OooOOo(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        C3772co c3772coOooOO0O = OooOO0O();
        int iOooO0oo = c3772coOooOO0O.OooO0oo();
        int iOooOOO0 = c3772coOooOO0O.OooOOO0();
        int i = (iOooO0oo * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < iOooO0oo; i2 += i) {
            OooO0O0(iArr);
            int i3 = 0;
            for (int i4 = 0; i4 < iOooOOO0; i4++) {
                if (c3772coOooOO0O.OooO0o0(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else if (i3 != 4) {
                    i3++;
                    iArr[i3] = iArr[i3] + 1;
                } else if (FinderPatternFinder.OooO0oo(iArr) && OooOOO0(iArr, i2, i4)) {
                    OooO0O0(iArr);
                    i3 = 0;
                } else {
                    OooOOo0(iArr);
                    i3 = 3;
                }
            }
            if (FinderPatternFinder.OooO0oo(iArr)) {
                OooOOO0(iArr, i2, iOooOOO0);
            }
        }
        C3999it[][] c3999itArrOooOOoo = OooOOoo();
        ArrayList arrayList = new ArrayList();
        for (C3999it[] c3999itArr : c3999itArrOooOOoo) {
            C3807dm.OooO0o0(c3999itArr);
            arrayList.add(new C4036jt(c3999itArr));
        }
        return arrayList.isEmpty() ? OooO : (C4036jt[]) arrayList.toArray(new C4036jt[arrayList.size()]);
    }
}
