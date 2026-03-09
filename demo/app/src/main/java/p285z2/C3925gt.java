package p285z2;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z2.gt */
/* JADX INFO: loaded from: classes2.dex */
public final class C3925gt {
    private final InterfaceC3844em OooO;
    private final C3772co OooO00o;
    private final int OooO0OO;
    private final int OooO0Oo;
    private final int OooO0o;
    private final int OooO0o0;
    private final float OooO0oO;
    private final List<C3888ft> OooO0O0 = new ArrayList(5);
    private final int[] OooO0oo = new int[3];

    public C3925gt(C3772co c3772co, int i, int i2, int i3, int i4, float f, InterfaceC3844em interfaceC3844em) {
        this.OooO00o = c3772co;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        this.OooO0o0 = i3;
        this.OooO0o = i4;
        this.OooO0oO = f;
        this.OooO = interfaceC3844em;
    }

    private static float OooO00o(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float OooO0O0(int i, int i2, int i3, int i4) {
        C3772co c3772co = this.OooO00o;
        int iOooO0oo = c3772co.OooO0oo();
        int[] iArr = this.OooO0oo;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && c3772co.OooO0o0(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !c3772co.OooO0o0(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < iOooO0oo && c3772co.OooO0o0(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != iOooO0oo && iArr[1] <= i3) {
                while (i6 < iOooO0oo && !c3772co.OooO0o0(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && OooO0Oo(iArr)) {
                    return OooO00o(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    private boolean OooO0Oo(int[] iArr) {
        float f = this.OooO0oO;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    private C3888ft OooO0o0(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float fOooO00o = OooO00o(iArr, i2);
        float fOooO0O0 = OooO0O0(i, (int) fOooO00o, iArr[1] * 2, i3);
        if (Float.isNaN(fOooO0O0)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C3888ft c3888ft : this.OooO0O0) {
            if (c3888ft.OooO0o(f, fOooO0O0, fOooO00o)) {
                return c3888ft.OooO0oO(fOooO0O0, fOooO00o, f);
            }
        }
        C3888ft c3888ft2 = new C3888ft(fOooO00o, fOooO0O0, f);
        this.OooO0O0.add(c3888ft2);
        InterfaceC3844em interfaceC3844em = this.OooO;
        if (interfaceC3844em == null) {
            return null;
        }
        interfaceC3844em.OooO00o(c3888ft2);
        return null;
    }

    public final C3888ft OooO0OO() throws NotFoundException {
        C3888ft c3888ftOooO0o0;
        C3888ft c3888ftOooO0o02;
        int i = this.OooO0OO;
        int i2 = this.OooO0o;
        int i3 = this.OooO0o0 + i;
        int i4 = this.OooO0Oo + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.OooO00o.OooO0o0(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.OooO00o.OooO0o0(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else {
                    if (OooO0Oo(iArr) && (c3888ftOooO0o02 = OooO0o0(iArr, i6, i7)) != null) {
                        return c3888ftOooO0o02;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (OooO0Oo(iArr) && (c3888ftOooO0o0 = OooO0o0(iArr, i6, i3)) != null) {
                return c3888ftOooO0o0;
            }
        }
        if (this.OooO0O0.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.OooO0O0.get(0);
    }
}
