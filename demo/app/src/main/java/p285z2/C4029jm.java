package p285z2;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: renamed from: z2.jm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4029jm {
    private static final int[] OooO0oO = {3808, 476, 2107, 1799};
    private final C3772co OooO00o;
    private boolean OooO0O0;
    private int OooO0OO;
    private int OooO0Oo;
    private int OooO0o;
    private int OooO0o0;

    /* JADX INFO: renamed from: z2.jm$OooO00o */
    public static final class OooO00o {
        private final int OooO00o;
        private final int OooO0O0;

        public OooO00o(int i, int i2) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        public final int OooO00o() {
            return this.OooO00o;
        }

        public final int OooO0O0() {
            return this.OooO0O0;
        }

        public final C3807dm OooO0OO() {
            return new C3807dm(OooO00o(), OooO0O0());
        }

        public final String toString() {
            return "<" + this.OooO00o + ' ' + this.OooO0O0 + '>';
        }
    }

    public C4029jm(C3772co c3772co) {
        this.OooO00o = c3772co;
    }

    private static int OooO(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C4364so(C4290qo.OooOO0O).OooO00o(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private static float OooO0OO(C3807dm c3807dm, C3807dm c3807dm2) {
        return C4142mo.OooO00o(c3807dm.OooO0OO(), c3807dm.OooO0Oo(), c3807dm2.OooO0OO(), c3807dm2.OooO0Oo());
    }

    private static float OooO0Oo(OooO00o oooO00o, OooO00o oooO00o2) {
        return C4142mo.OooO0O0(oooO00o.OooO00o(), oooO00o.OooO0O0(), oooO00o2.OooO00o(), oooO00o2.OooO0O0());
    }

    private void OooO0o(C3807dm[] c3807dmArr) throws NotFoundException {
        int i;
        long j;
        long j2;
        if (!OooOOOo(c3807dmArr[0]) || !OooOOOo(c3807dmArr[1]) || !OooOOOo(c3807dmArr[2]) || !OooOOOo(c3807dmArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i2 = this.OooO0o0 * 2;
        int[] iArr = {OooOOoo(c3807dmArr[0], c3807dmArr[1], i2), OooOOoo(c3807dmArr[1], c3807dmArr[2], i2), OooOOoo(c3807dmArr[2], c3807dmArr[3], i2), OooOOoo(c3807dmArr[3], c3807dmArr[0], i2)};
        this.OooO0o = OooOOO(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.OooO0o + i3) % 4];
            if (this.OooO0O0) {
                j = j3 << 7;
                j2 = (i4 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i4 >> 2) & 992) + ((i4 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int iOooO = OooO(j3, this.OooO0O0);
        if (this.OooO0O0) {
            this.OooO0OO = (iOooO >> 6) + 1;
            i = iOooO & 63;
        } else {
            this.OooO0OO = (iOooO >> 11) + 1;
            i = iOooO & 2047;
        }
        this.OooO0Oo = i + 1;
    }

    private static C3807dm[] OooO0o0(C3807dm[] c3807dmArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float fOooO0OO = c3807dmArr[0].OooO0OO() - c3807dmArr[2].OooO0OO();
        float fOooO0Oo = c3807dmArr[0].OooO0Oo() - c3807dmArr[2].OooO0Oo();
        float fOooO0OO2 = (c3807dmArr[0].OooO0OO() + c3807dmArr[2].OooO0OO()) / 2.0f;
        float fOooO0Oo2 = (c3807dmArr[0].OooO0Oo() + c3807dmArr[2].OooO0Oo()) / 2.0f;
        float f2 = fOooO0OO * f;
        float f3 = fOooO0Oo * f;
        C3807dm c3807dm = new C3807dm(fOooO0OO2 + f2, fOooO0Oo2 + f3);
        C3807dm c3807dm2 = new C3807dm(fOooO0OO2 - f2, fOooO0Oo2 - f3);
        float fOooO0OO3 = c3807dmArr[1].OooO0OO() - c3807dmArr[3].OooO0OO();
        float fOooO0Oo3 = c3807dmArr[1].OooO0Oo() - c3807dmArr[3].OooO0Oo();
        float fOooO0OO4 = (c3807dmArr[1].OooO0OO() + c3807dmArr[3].OooO0OO()) / 2.0f;
        float fOooO0Oo4 = (c3807dmArr[1].OooO0Oo() + c3807dmArr[3].OooO0Oo()) / 2.0f;
        float f4 = fOooO0OO3 * f;
        float f5 = f * fOooO0Oo3;
        return new C3807dm[]{c3807dm, new C3807dm(fOooO0OO4 + f4, fOooO0Oo4 + f5), c3807dm2, new C3807dm(fOooO0OO4 - f4, fOooO0Oo4 - f5)};
    }

    private C3807dm[] OooO0oO(OooO00o oooO00o) throws NotFoundException {
        this.OooO0o0 = 1;
        OooO00o oooO00o2 = oooO00o;
        OooO00o oooO00o3 = oooO00o2;
        OooO00o oooO00o4 = oooO00o3;
        OooO00o oooO00o5 = oooO00o4;
        boolean z = true;
        while (this.OooO0o0 < 9) {
            OooO00o oooO00oOooOO0O = OooOO0O(oooO00o2, z, 1, -1);
            OooO00o oooO00oOooOO0O2 = OooOO0O(oooO00o3, z, 1, 1);
            OooO00o oooO00oOooOO0O3 = OooOO0O(oooO00o4, z, -1, 1);
            OooO00o oooO00oOooOO0O4 = OooOO0O(oooO00o5, z, -1, -1);
            if (this.OooO0o0 > 2) {
                double dOooO0Oo = (OooO0Oo(oooO00oOooOO0O4, oooO00oOooOO0O) * this.OooO0o0) / (OooO0Oo(oooO00o5, oooO00o2) * (this.OooO0o0 + 2));
                if (dOooO0Oo < 0.75d || dOooO0Oo > 1.25d || !OooOOo0(oooO00oOooOO0O, oooO00oOooOO0O2, oooO00oOooOO0O3, oooO00oOooOO0O4)) {
                    break;
                }
            }
            z = !z;
            this.OooO0o0++;
            oooO00o5 = oooO00oOooOO0O4;
            oooO00o2 = oooO00oOooOO0O;
            oooO00o3 = oooO00oOooOO0O2;
            oooO00o4 = oooO00oOooOO0O3;
        }
        int i = this.OooO0o0;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.OooO0O0 = i == 5;
        C3807dm[] c3807dmArr = {new C3807dm(oooO00o2.OooO00o() + 0.5f, oooO00o2.OooO0O0() - 0.5f), new C3807dm(oooO00o3.OooO00o() + 0.5f, oooO00o3.OooO0O0() + 0.5f), new C3807dm(oooO00o4.OooO00o() - 0.5f, oooO00o4.OooO0O0() + 0.5f), new C3807dm(oooO00o5.OooO00o() - 0.5f, oooO00o5.OooO0O0() - 0.5f)};
        int i2 = this.OooO0o0;
        return OooO0o0(c3807dmArr, (i2 * 2) - 3, i2 * 2);
    }

    private int OooO0oo(OooO00o oooO00o, OooO00o oooO00o2) {
        float fOooO0Oo = OooO0Oo(oooO00o, oooO00o2);
        float fOooO00o = (oooO00o2.OooO00o() - oooO00o.OooO00o()) / fOooO0Oo;
        float fOooO0O0 = (oooO00o2.OooO0O0() - oooO00o.OooO0O0()) / fOooO0Oo;
        float fOooO00o2 = oooO00o.OooO00o();
        float fOooO0O02 = oooO00o.OooO0O0();
        boolean zOooO0o0 = this.OooO00o.OooO0o0(oooO00o.OooO00o(), oooO00o.OooO0O0());
        int iCeil = (int) Math.ceil(fOooO0Oo);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            fOooO00o2 += fOooO00o;
            fOooO0O02 += fOooO0O0;
            if (this.OooO00o.OooO0o0(C4142mo.OooO0OO(fOooO00o2), C4142mo.OooO0OO(fOooO0O02)) != zOooO0o0) {
                i++;
            }
        }
        float f = i / fOooO0Oo;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == zOooO0o0 ? 1 : -1;
        }
        return 0;
    }

    private int OooOO0() {
        if (this.OooO0O0) {
            return (this.OooO0OO * 4) + 11;
        }
        int i = this.OooO0OO;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    private OooO00o OooOO0O(OooO00o oooO00o, boolean z, int i, int i2) {
        int iOooO00o = oooO00o.OooO00o() + i;
        int iOooO0O0 = oooO00o.OooO0O0();
        while (true) {
            iOooO0O0 += i2;
            if (!OooOOOO(iOooO00o, iOooO0O0) || this.OooO00o.OooO0o0(iOooO00o, iOooO0O0) != z) {
                break;
            }
            iOooO00o += i;
        }
        int i3 = iOooO00o - i;
        int i4 = iOooO0O0 - i2;
        while (OooOOOO(i3, i4) && this.OooO00o.OooO0o0(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (OooOOOO(i5, i4) && this.OooO00o.OooO0o0(i5, i4) == z) {
            i4 += i2;
        }
        return new OooO00o(i5, i4 - i2);
    }

    private OooO00o OooOO0o() {
        C3807dm c3807dmOooO0OO;
        C3807dm c3807dm;
        C3807dm c3807dm2;
        C3807dm c3807dm3;
        C3807dm c3807dmOooO0OO2;
        C3807dm c3807dmOooO0OO3;
        C3807dm c3807dmOooO0OO4;
        C3807dm c3807dmOooO0OO5;
        try {
            C3807dm[] c3807dmArrOooO0OO = new C4253po(this.OooO00o).OooO0OO();
            c3807dm2 = c3807dmArrOooO0OO[0];
            c3807dm3 = c3807dmArrOooO0OO[1];
            c3807dm = c3807dmArrOooO0OO[2];
            c3807dmOooO0OO = c3807dmArrOooO0OO[3];
        } catch (NotFoundException unused) {
            int iOooOOO0 = this.OooO00o.OooOOO0() / 2;
            int iOooO0oo = this.OooO00o.OooO0oo() / 2;
            int i = iOooOOO0 + 7;
            int i2 = iOooO0oo - 7;
            C3807dm c3807dmOooO0OO6 = OooOO0O(new OooO00o(i, i2), false, 1, -1).OooO0OO();
            int i3 = iOooO0oo + 7;
            C3807dm c3807dmOooO0OO7 = OooOO0O(new OooO00o(i, i3), false, 1, 1).OooO0OO();
            int i4 = iOooOOO0 - 7;
            C3807dm c3807dmOooO0OO8 = OooOO0O(new OooO00o(i4, i3), false, -1, 1).OooO0OO();
            c3807dmOooO0OO = OooOO0O(new OooO00o(i4, i2), false, -1, -1).OooO0OO();
            c3807dm = c3807dmOooO0OO8;
            c3807dm2 = c3807dmOooO0OO6;
            c3807dm3 = c3807dmOooO0OO7;
        }
        int iOooO0OO = C4142mo.OooO0OO((((c3807dm2.OooO0OO() + c3807dmOooO0OO.OooO0OO()) + c3807dm3.OooO0OO()) + c3807dm.OooO0OO()) / 4.0f);
        int iOooO0OO2 = C4142mo.OooO0OO((((c3807dm2.OooO0Oo() + c3807dmOooO0OO.OooO0Oo()) + c3807dm3.OooO0Oo()) + c3807dm.OooO0Oo()) / 4.0f);
        try {
            C3807dm[] c3807dmArrOooO0OO2 = new C4253po(this.OooO00o, 15, iOooO0OO, iOooO0OO2).OooO0OO();
            c3807dmOooO0OO2 = c3807dmArrOooO0OO2[0];
            c3807dmOooO0OO3 = c3807dmArrOooO0OO2[1];
            c3807dmOooO0OO4 = c3807dmArrOooO0OO2[2];
            c3807dmOooO0OO5 = c3807dmArrOooO0OO2[3];
        } catch (NotFoundException unused2) {
            int i5 = iOooO0OO + 7;
            int i6 = iOooO0OO2 - 7;
            c3807dmOooO0OO2 = OooOO0O(new OooO00o(i5, i6), false, 1, -1).OooO0OO();
            int i7 = iOooO0OO2 + 7;
            c3807dmOooO0OO3 = OooOO0O(new OooO00o(i5, i7), false, 1, 1).OooO0OO();
            int i8 = iOooO0OO - 7;
            c3807dmOooO0OO4 = OooOO0O(new OooO00o(i8, i7), false, -1, 1).OooO0OO();
            c3807dmOooO0OO5 = OooOO0O(new OooO00o(i8, i6), false, -1, -1).OooO0OO();
        }
        return new OooO00o(C4142mo.OooO0OO((((c3807dmOooO0OO2.OooO0OO() + c3807dmOooO0OO5.OooO0OO()) + c3807dmOooO0OO3.OooO0OO()) + c3807dmOooO0OO4.OooO0OO()) / 4.0f), C4142mo.OooO0OO((((c3807dmOooO0OO2.OooO0Oo() + c3807dmOooO0OO5.OooO0Oo()) + c3807dmOooO0OO3.OooO0Oo()) + c3807dmOooO0OO4.OooO0Oo()) / 4.0f));
    }

    private static int OooOOO(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(OooO0oO[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private C3807dm[] OooOOO0(C3807dm[] c3807dmArr) {
        return OooO0o0(c3807dmArr, this.OooO0o0 * 2, OooOO0());
    }

    private boolean OooOOOO(int i, int i2) {
        return i >= 0 && i < this.OooO00o.OooOOO0() && i2 > 0 && i2 < this.OooO00o.OooO0oo();
    }

    private boolean OooOOOo(C3807dm c3807dm) {
        return OooOOOO(C4142mo.OooO0OO(c3807dm.OooO0OO()), C4142mo.OooO0OO(c3807dm.OooO0Oo()));
    }

    private C3772co OooOOo(C3772co c3772co, C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4) throws NotFoundException {
        AbstractC3994io abstractC3994ioOooO0O0 = AbstractC3994io.OooO0O0();
        int iOooOO0 = OooOO0();
        float f = iOooOO0 / 2.0f;
        int i = this.OooO0o0;
        float f2 = f - i;
        float f3 = f + i;
        return abstractC3994ioOooO0O0.OooO0OO(c3772co, iOooOO0, iOooOO0, f2, f2, f3, f2, f3, f3, f2, f3, c3807dm.OooO0OO(), c3807dm.OooO0Oo(), c3807dm2.OooO0OO(), c3807dm2.OooO0Oo(), c3807dm3.OooO0OO(), c3807dm3.OooO0Oo(), c3807dm4.OooO0OO(), c3807dm4.OooO0Oo());
    }

    private boolean OooOOo0(OooO00o oooO00o, OooO00o oooO00o2, OooO00o oooO00o3, OooO00o oooO00o4) {
        OooO00o oooO00o5 = new OooO00o(oooO00o.OooO00o() - 3, oooO00o.OooO0O0() + 3);
        OooO00o oooO00o6 = new OooO00o(oooO00o2.OooO00o() - 3, oooO00o2.OooO0O0() - 3);
        OooO00o oooO00o7 = new OooO00o(oooO00o3.OooO00o() + 3, oooO00o3.OooO0O0() - 3);
        OooO00o oooO00o8 = new OooO00o(oooO00o4.OooO00o() + 3, oooO00o4.OooO0O0() + 3);
        int iOooO0oo = OooO0oo(oooO00o8, oooO00o5);
        return iOooO0oo != 0 && OooO0oo(oooO00o5, oooO00o6) == iOooO0oo && OooO0oo(oooO00o6, oooO00o7) == iOooO0oo && OooO0oo(oooO00o7, oooO00o8) == iOooO0oo;
    }

    private int OooOOoo(C3807dm c3807dm, C3807dm c3807dm2, int i) {
        float fOooO0OO = OooO0OO(c3807dm, c3807dm2);
        float f = fOooO0OO / i;
        float fOooO0OO2 = c3807dm.OooO0OO();
        float fOooO0Oo = c3807dm.OooO0Oo();
        float fOooO0OO3 = ((c3807dm2.OooO0OO() - c3807dm.OooO0OO()) * f) / fOooO0OO;
        float fOooO0Oo2 = (f * (c3807dm2.OooO0Oo() - c3807dm.OooO0Oo())) / fOooO0OO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.OooO00o.OooO0o0(C4142mo.OooO0OO((f2 * fOooO0OO3) + fOooO0OO2), C4142mo.OooO0OO((f2 * fOooO0Oo2) + fOooO0Oo))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    public final C3918gm OooO00o() throws NotFoundException {
        return OooO0O0(false);
    }

    public final C3918gm OooO0O0(boolean z) throws NotFoundException {
        C3807dm[] c3807dmArrOooO0oO = OooO0oO(OooOO0o());
        if (z) {
            C3807dm c3807dm = c3807dmArrOooO0oO[0];
            c3807dmArrOooO0oO[0] = c3807dmArrOooO0oO[2];
            c3807dmArrOooO0oO[2] = c3807dm;
        }
        OooO0o(c3807dmArrOooO0oO);
        C3772co c3772co = this.OooO00o;
        int i = this.OooO0o;
        return new C3918gm(OooOOo(c3772co, c3807dmArrOooO0oO[i % 4], c3807dmArrOooO0oO[(i + 1) % 4], c3807dmArrOooO0oO[(i + 2) % 4], c3807dmArrOooO0oO[(i + 3) % 4]), OooOOO0(c3807dmArrOooO0oO), this.OooO0O0, this.OooO0Oo, this.OooO0OO);
    }
}
