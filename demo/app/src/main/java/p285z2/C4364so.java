package p285z2;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: renamed from: z2.so */
/* JADX INFO: loaded from: classes2.dex */
public final class C4364so {
    private final C4290qo OooO00o;

    public C4364so(C4290qo c4290qo) {
        this.OooO00o = c4290qo;
    }

    private int[] OooO0O0(C4327ro c4327ro) throws ReedSolomonException {
        int iOooO0o = c4327ro.OooO0o();
        int i = 0;
        if (iOooO0o == 1) {
            return new int[]{c4327ro.OooO0Oo(1)};
        }
        int[] iArr = new int[iOooO0o];
        for (int i2 = 1; i2 < this.OooO00o.OooO0o() && i < iOooO0o; i2++) {
            if (c4327ro.OooO0OO(i2) == 0) {
                iArr[i] = this.OooO00o.OooO0oo(i2);
                i++;
            }
        }
        if (i == iOooO0o) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] OooO0OO(C4327ro c4327ro, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iOooO0oo = this.OooO00o.OooO0oo(iArr[i]);
            int iOooOO0 = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iOooOO02 = this.OooO00o.OooOO0(iArr[i2], iOooO0oo);
                    iOooOO0 = this.OooO00o.OooOO0(iOooOO0, (iOooOO02 & 1) == 0 ? iOooOO02 | 1 : iOooOO02 & (-2));
                }
            }
            iArr2[i] = this.OooO00o.OooOO0(c4327ro.OooO0OO(iOooO0oo), this.OooO00o.OooO0oo(iOooOO0));
            if (this.OooO00o.OooO0Oo() != 0) {
                iArr2[i] = this.OooO00o.OooOO0(iArr2[i], iOooO0oo);
            }
        }
        return iArr2;
    }

    private C4327ro[] OooO0Oo(C4327ro c4327ro, C4327ro c4327ro2, int i) throws ReedSolomonException {
        if (c4327ro.OooO0o() < c4327ro2.OooO0o()) {
            c4327ro2 = c4327ro;
            c4327ro = c4327ro2;
        }
        C4327ro c4327roOooO0oO = this.OooO00o.OooO0oO();
        C4327ro c4327roOooO0o0 = this.OooO00o.OooO0o0();
        do {
            C4327ro c4327ro3 = c4327ro2;
            c4327ro2 = c4327ro;
            c4327ro = c4327ro3;
            C4327ro c4327ro4 = c4327roOooO0o0;
            C4327ro c4327ro5 = c4327roOooO0oO;
            c4327roOooO0oO = c4327ro4;
            if (c4327ro.OooO0o() < i / 2) {
                int iOooO0Oo = c4327roOooO0oO.OooO0Oo(0);
                if (iOooO0Oo == 0) {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                }
                int iOooO0oo = this.OooO00o.OooO0oo(iOooO0Oo);
                return new C4327ro[]{c4327roOooO0oO.OooO0oo(iOooO0oo), c4327ro.OooO0oo(iOooO0oo)};
            }
            if (c4327ro.OooO0oO()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            C4327ro c4327roOooO0oO2 = this.OooO00o.OooO0oO();
            int iOooO0oo2 = this.OooO00o.OooO0oo(c4327ro.OooO0Oo(c4327ro.OooO0o()));
            while (c4327ro2.OooO0o() >= c4327ro.OooO0o() && !c4327ro2.OooO0oO()) {
                int iOooO0o = c4327ro2.OooO0o() - c4327ro.OooO0o();
                int iOooOO0 = this.OooO00o.OooOO0(c4327ro2.OooO0Oo(c4327ro2.OooO0o()), iOooO0oo2);
                c4327roOooO0oO2 = c4327roOooO0oO2.OooO00o(this.OooO00o.OooO0O0(iOooO0o, iOooOO0));
                c4327ro2 = c4327ro2.OooO00o(c4327ro.OooOO0(iOooO0o, iOooOO0));
            }
            c4327roOooO0o0 = c4327roOooO0oO2.OooO(c4327roOooO0oO).OooO00o(c4327ro5);
        } while (c4327ro2.OooO0o() < c4327ro.OooO0o());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public final void OooO00o(int[] iArr, int i) throws ReedSolomonException {
        C4327ro c4327ro = new C4327ro(this.OooO00o, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C4290qo c4290qo = this.OooO00o;
            int iOooO0OO = c4327ro.OooO0OO(c4290qo.OooO0OO(c4290qo.OooO0Oo() + i2));
            iArr2[(i - 1) - i2] = iOooO0OO;
            if (iOooO0OO != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C4327ro[] c4327roArrOooO0Oo = OooO0Oo(this.OooO00o.OooO0O0(i, 1), new C4327ro(this.OooO00o, iArr2), i);
        C4327ro c4327ro2 = c4327roArrOooO0Oo[0];
        C4327ro c4327ro3 = c4327roArrOooO0Oo[1];
        int[] iArrOooO0O0 = OooO0O0(c4327ro2);
        int[] iArrOooO0OO = OooO0OO(c4327ro3, iArrOooO0O0);
        for (int i3 = 0; i3 < iArrOooO0O0.length; i3++) {
            int length = (iArr.length - 1) - this.OooO00o.OooO(iArrOooO0O0[i3]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = C4290qo.OooO00o(iArr[length], iArrOooO0OO[i3]);
        }
    }
}
