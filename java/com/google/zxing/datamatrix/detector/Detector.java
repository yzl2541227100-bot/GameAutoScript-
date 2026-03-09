package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p284io.IOUtils;
import p285z2.AbstractC3994io;
import p285z2.C3772co;
import p285z2.C3807dm;
import p285z2.C3920go;
import p285z2.C4142mo;
import p285z2.C4253po;

/* JADX INFO: loaded from: classes2.dex */
public final class Detector {
    private final C3772co OooO00o;
    private final C4253po OooO0O0;

    public static final class OooO0O0 {
        private final C3807dm OooO00o;
        private final C3807dm OooO0O0;
        private final int OooO0OO;

        private OooO0O0(C3807dm c3807dm, C3807dm c3807dm2, int i) {
            this.OooO00o = c3807dm;
            this.OooO0O0 = c3807dm2;
            this.OooO0OO = i;
        }

        public final C3807dm OooO00o() {
            return this.OooO00o;
        }

        public final C3807dm OooO0O0() {
            return this.OooO0O0;
        }

        public final int OooO0OO() {
            return this.OooO0OO;
        }

        public final String toString() {
            return this.OooO00o + "/" + this.OooO0O0 + IOUtils.DIR_SEPARATOR_UNIX + this.OooO0OO;
        }
    }

    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<OooO0O0> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
            return oooO0O0.OooO0OO() - oooO0O02.OooO0OO();
        }
    }

    public Detector(C3772co c3772co) throws NotFoundException {
        this.OooO00o = c3772co;
        this.OooO0O0 = new C4253po(c3772co);
    }

    private C3807dm OooO00o(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4, int i) {
        float f = i;
        float fOooO0Oo = OooO0Oo(c3807dm, c3807dm2) / f;
        float fOooO0Oo2 = OooO0Oo(c3807dm3, c3807dm4);
        C3807dm c3807dm5 = new C3807dm(c3807dm4.OooO0OO() + (((c3807dm4.OooO0OO() - c3807dm3.OooO0OO()) / fOooO0Oo2) * fOooO0Oo), c3807dm4.OooO0Oo() + (fOooO0Oo * ((c3807dm4.OooO0Oo() - c3807dm3.OooO0Oo()) / fOooO0Oo2)));
        float fOooO0Oo3 = OooO0Oo(c3807dm, c3807dm3) / f;
        float fOooO0Oo4 = OooO0Oo(c3807dm2, c3807dm4);
        C3807dm c3807dm6 = new C3807dm(c3807dm4.OooO0OO() + (((c3807dm4.OooO0OO() - c3807dm2.OooO0OO()) / fOooO0Oo4) * fOooO0Oo3), c3807dm4.OooO0Oo() + (fOooO0Oo3 * ((c3807dm4.OooO0Oo() - c3807dm2.OooO0Oo()) / fOooO0Oo4)));
        if (OooO0o(c3807dm5)) {
            return (OooO0o(c3807dm6) && Math.abs(OooO0oo(c3807dm3, c3807dm5).OooO0OO() - OooO0oo(c3807dm2, c3807dm5).OooO0OO()) > Math.abs(OooO0oo(c3807dm3, c3807dm6).OooO0OO() - OooO0oo(c3807dm2, c3807dm6).OooO0OO())) ? c3807dm6 : c3807dm5;
        }
        if (OooO0o(c3807dm6)) {
            return c3807dm6;
        }
        return null;
    }

    private C3807dm OooO0O0(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4, int i, int i2) {
        float fOooO0Oo = OooO0Oo(c3807dm, c3807dm2) / i;
        float fOooO0Oo2 = OooO0Oo(c3807dm3, c3807dm4);
        C3807dm c3807dm5 = new C3807dm(c3807dm4.OooO0OO() + (((c3807dm4.OooO0OO() - c3807dm3.OooO0OO()) / fOooO0Oo2) * fOooO0Oo), c3807dm4.OooO0Oo() + (fOooO0Oo * ((c3807dm4.OooO0Oo() - c3807dm3.OooO0Oo()) / fOooO0Oo2)));
        float fOooO0Oo3 = OooO0Oo(c3807dm, c3807dm3) / i2;
        float fOooO0Oo4 = OooO0Oo(c3807dm2, c3807dm4);
        C3807dm c3807dm6 = new C3807dm(c3807dm4.OooO0OO() + (((c3807dm4.OooO0OO() - c3807dm2.OooO0OO()) / fOooO0Oo4) * fOooO0Oo3), c3807dm4.OooO0Oo() + (fOooO0Oo3 * ((c3807dm4.OooO0Oo() - c3807dm2.OooO0Oo()) / fOooO0Oo4)));
        if (OooO0o(c3807dm5)) {
            return (OooO0o(c3807dm6) && Math.abs(i - OooO0oo(c3807dm3, c3807dm5).OooO0OO()) + Math.abs(i2 - OooO0oo(c3807dm2, c3807dm5).OooO0OO()) > Math.abs(i - OooO0oo(c3807dm3, c3807dm6).OooO0OO()) + Math.abs(i2 - OooO0oo(c3807dm2, c3807dm6).OooO0OO())) ? c3807dm6 : c3807dm5;
        }
        if (OooO0o(c3807dm6)) {
            return c3807dm6;
        }
        return null;
    }

    private static int OooO0Oo(C3807dm c3807dm, C3807dm c3807dm2) {
        return C4142mo.OooO0OO(C3807dm.OooO0O0(c3807dm, c3807dm2));
    }

    private boolean OooO0o(C3807dm c3807dm) {
        return c3807dm.OooO0OO() >= 0.0f && c3807dm.OooO0OO() < ((float) this.OooO00o.OooOOO0()) && c3807dm.OooO0Oo() > 0.0f && c3807dm.OooO0Oo() < ((float) this.OooO00o.OooO0oo());
    }

    private static void OooO0o0(Map<C3807dm, Integer> map, C3807dm c3807dm) {
        Integer num = map.get(c3807dm);
        map.put(c3807dm, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private static C3772co OooO0oO(C3772co c3772co, C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return AbstractC3994io.OooO0O0().OooO0OO(c3772co, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, c3807dm.OooO0OO(), c3807dm.OooO0Oo(), c3807dm4.OooO0OO(), c3807dm4.OooO0Oo(), c3807dm3.OooO0OO(), c3807dm3.OooO0Oo(), c3807dm2.OooO0OO(), c3807dm2.OooO0Oo());
    }

    private OooO0O0 OooO0oo(C3807dm c3807dm, C3807dm c3807dm2) {
        int iOooO0OO = (int) c3807dm.OooO0OO();
        int iOooO0Oo = (int) c3807dm.OooO0Oo();
        int iOooO0OO2 = (int) c3807dm2.OooO0OO();
        int iOooO0Oo2 = (int) c3807dm2.OooO0Oo();
        int i = 0;
        boolean z = Math.abs(iOooO0Oo2 - iOooO0Oo) > Math.abs(iOooO0OO2 - iOooO0OO);
        if (z) {
            iOooO0Oo = iOooO0OO;
            iOooO0OO = iOooO0Oo;
            iOooO0Oo2 = iOooO0OO2;
            iOooO0OO2 = iOooO0Oo2;
        }
        int iAbs = Math.abs(iOooO0OO2 - iOooO0OO);
        int iAbs2 = Math.abs(iOooO0Oo2 - iOooO0Oo);
        int i2 = (-iAbs) / 2;
        int i3 = iOooO0Oo < iOooO0Oo2 ? 1 : -1;
        int i4 = iOooO0OO >= iOooO0OO2 ? -1 : 1;
        boolean zOooO0o0 = this.OooO00o.OooO0o0(z ? iOooO0Oo : iOooO0OO, z ? iOooO0OO : iOooO0Oo);
        while (iOooO0OO != iOooO0OO2) {
            boolean zOooO0o02 = this.OooO00o.OooO0o0(z ? iOooO0Oo : iOooO0OO, z ? iOooO0OO : iOooO0Oo);
            if (zOooO0o02 != zOooO0o0) {
                i++;
                zOooO0o0 = zOooO0o02;
            }
            i2 += iAbs2;
            if (i2 > 0) {
                if (iOooO0Oo == iOooO0Oo2) {
                    break;
                }
                iOooO0Oo += i3;
                i2 -= iAbs;
            }
            iOooO0OO += i4;
        }
        return new OooO0O0(c3807dm, c3807dm2, i);
    }

    public final C3920go OooO0OO() throws NotFoundException {
        C3807dm c3807dm;
        C3772co c3772coOooO0oO;
        C3807dm[] c3807dmArrOooO0OO = this.OooO0O0.OooO0OO();
        C3807dm c3807dm2 = c3807dmArrOooO0OO[0];
        C3807dm c3807dm3 = c3807dmArrOooO0OO[1];
        C3807dm c3807dm4 = c3807dmArrOooO0OO[2];
        C3807dm c3807dm5 = c3807dmArrOooO0OO[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(OooO0oo(c3807dm2, c3807dm3));
        arrayList.add(OooO0oo(c3807dm2, c3807dm4));
        arrayList.add(OooO0oo(c3807dm3, c3807dm5));
        arrayList.add(OooO0oo(c3807dm4, c3807dm5));
        C3807dm c3807dm6 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        OooO0O0 oooO0O0 = (OooO0O0) arrayList.get(0);
        OooO0O0 oooO0O02 = (OooO0O0) arrayList.get(1);
        HashMap map = new HashMap();
        OooO0o0(map, oooO0O0.OooO00o());
        OooO0o0(map, oooO0O0.OooO0O0());
        OooO0o0(map, oooO0O02.OooO00o());
        OooO0o0(map, oooO0O02.OooO0O0());
        C3807dm c3807dm7 = null;
        C3807dm c3807dm8 = null;
        for (Map.Entry entry : map.entrySet()) {
            C3807dm c3807dm9 = (C3807dm) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                c3807dm7 = c3807dm9;
            } else if (c3807dm6 == null) {
                c3807dm6 = c3807dm9;
            } else {
                c3807dm8 = c3807dm9;
            }
        }
        if (c3807dm6 == null || c3807dm7 == null || c3807dm8 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        C3807dm[] c3807dmArr = {c3807dm6, c3807dm7, c3807dm8};
        C3807dm.OooO0o0(c3807dmArr);
        C3807dm c3807dm10 = c3807dmArr[0];
        C3807dm c3807dm11 = c3807dmArr[1];
        C3807dm c3807dm12 = c3807dmArr[2];
        C3807dm c3807dm13 = !map.containsKey(c3807dm2) ? c3807dm2 : !map.containsKey(c3807dm3) ? c3807dm3 : !map.containsKey(c3807dm4) ? c3807dm4 : c3807dm5;
        int iOooO0OO = OooO0oo(c3807dm12, c3807dm13).OooO0OO();
        int iOooO0OO2 = OooO0oo(c3807dm10, c3807dm13).OooO0OO();
        if ((iOooO0OO & 1) == 1) {
            iOooO0OO++;
        }
        int i = iOooO0OO + 2;
        if ((iOooO0OO2 & 1) == 1) {
            iOooO0OO2++;
        }
        int i2 = iOooO0OO2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            c3807dm = c3807dm12;
            C3807dm c3807dmOooO0O0 = OooO0O0(c3807dm11, c3807dm10, c3807dm12, c3807dm13, i, i2);
            if (c3807dmOooO0O0 != null) {
                c3807dm13 = c3807dmOooO0O0;
            }
            int iOooO0OO3 = OooO0oo(c3807dm, c3807dm13).OooO0OO();
            int iOooO0OO4 = OooO0oo(c3807dm10, c3807dm13).OooO0OO();
            if ((iOooO0OO3 & 1) == 1) {
                iOooO0OO3++;
            }
            int i3 = iOooO0OO3;
            if ((iOooO0OO4 & 1) == 1) {
                iOooO0OO4++;
            }
            c3772coOooO0oO = OooO0oO(this.OooO00o, c3807dm, c3807dm11, c3807dm10, c3807dm13, i3, iOooO0OO4);
        } else {
            C3807dm c3807dmOooO00o = OooO00o(c3807dm11, c3807dm10, c3807dm12, c3807dm13, Math.min(i2, i));
            if (c3807dmOooO00o != null) {
                c3807dm13 = c3807dmOooO00o;
            }
            int iMax = Math.max(OooO0oo(c3807dm12, c3807dm13).OooO0OO(), OooO0oo(c3807dm10, c3807dm13).OooO0OO()) + 1;
            if ((iMax & 1) == 1) {
                iMax++;
            }
            int i4 = iMax;
            c3772coOooO0oO = OooO0oO(this.OooO00o, c3807dm12, c3807dm11, c3807dm10, c3807dm13, i4, i4);
            c3807dm = c3807dm12;
        }
        return new C3920go(c3772coOooO0oO, new C3807dm[]{c3807dm, c3807dm11, c3807dm10, c3807dm13});
    }
}
