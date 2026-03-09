package p285z2;

import java.util.Formatter;

/* JADX INFO: renamed from: z2.gs */
/* JADX INFO: loaded from: classes2.dex */
public final class C3924gs {
    private static final int OooO0o0 = 2;
    private final C3776cs OooO00o;
    private final C3961hs[] OooO0O0;
    private C3850es OooO0OO;
    private final int OooO0Oo;

    public C3924gs(C3776cs c3776cs, C3850es c3850es) {
        this.OooO00o = c3776cs;
        int iOooO00o = c3776cs.OooO00o();
        this.OooO0Oo = iOooO00o;
        this.OooO0OO = c3850es;
        this.OooO0O0 = new C3961hs[iOooO00o + 2];
    }

    private int OooO() {
        C3961hs[] c3961hsArr = this.OooO0O0;
        int i = this.OooO0Oo;
        if (c3961hsArr[i + 1] == null) {
            return 0;
        }
        C3887fs[] c3887fsArrOooO0Oo = c3961hsArr[i + 1].OooO0Oo();
        int i2 = 0;
        for (int i3 = 0; i3 < c3887fsArrOooO0Oo.length; i3++) {
            if (c3887fsArrOooO0Oo[i3] != null) {
                int iOooO0OO = c3887fsArrOooO0Oo[i3].OooO0OO();
                int iOooO0OO2 = 0;
                for (int i4 = this.OooO0Oo + 1; i4 > 0 && iOooO0OO2 < 2; i4--) {
                    C3887fs c3887fs = this.OooO0O0[i4].OooO0Oo()[i3];
                    if (c3887fs != null) {
                        iOooO0OO2 = OooO0OO(iOooO0OO, iOooO0OO2, c3887fs);
                        if (!c3887fs.OooO0oO()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private void OooO00o(C3961hs c3961hs) {
        if (c3961hs != null) {
            ((C3998is) c3961hs).OooO0oO(this.OooO00o);
        }
    }

    private static boolean OooO0O0(C3887fs c3887fs, C3887fs c3887fs2) {
        if (c3887fs2 == null || !c3887fs2.OooO0oO() || c3887fs2.OooO00o() != c3887fs.OooO00o()) {
            return false;
        }
        c3887fs.OooO(c3887fs2.OooO0OO());
        return true;
    }

    private static int OooO0OO(int i, int i2, C3887fs c3887fs) {
        if (c3887fs == null || c3887fs.OooO0oO()) {
            return i2;
        }
        if (!c3887fs.OooO0oo(i)) {
            return i2 + 1;
        }
        c3887fs.OooO(i);
        return 0;
    }

    private int OooO0Oo() {
        int iOooO0o = OooO0o();
        if (iOooO0o == 0) {
            return 0;
        }
        for (int i = 1; i < this.OooO0Oo + 1; i++) {
            C3887fs[] c3887fsArrOooO0Oo = this.OooO0O0[i].OooO0Oo();
            for (int i2 = 0; i2 < c3887fsArrOooO0Oo.length; i2++) {
                if (c3887fsArrOooO0Oo[i2] != null && !c3887fsArrOooO0Oo[i2].OooO0oO()) {
                    OooO0o0(i, i2, c3887fsArrOooO0Oo);
                }
            }
        }
        return iOooO0o;
    }

    private int OooO0o() {
        OooO0oO();
        return OooO0oo() + OooO();
    }

    private void OooO0o0(int i, int i2, C3887fs[] c3887fsArr) {
        C3887fs c3887fs = c3887fsArr[i2];
        C3887fs[] c3887fsArrOooO0Oo = this.OooO0O0[i - 1].OooO0Oo();
        C3961hs[] c3961hsArr = this.OooO0O0;
        int i3 = i + 1;
        C3887fs[] c3887fsArrOooO0Oo2 = c3961hsArr[i3] != null ? c3961hsArr[i3].OooO0Oo() : c3887fsArrOooO0Oo;
        C3887fs[] c3887fsArr2 = new C3887fs[14];
        c3887fsArr2[2] = c3887fsArrOooO0Oo[i2];
        c3887fsArr2[3] = c3887fsArrOooO0Oo2[i2];
        if (i2 > 0) {
            int i4 = i2 - 1;
            c3887fsArr2[0] = c3887fsArr[i4];
            c3887fsArr2[4] = c3887fsArrOooO0Oo[i4];
            c3887fsArr2[5] = c3887fsArrOooO0Oo2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            c3887fsArr2[8] = c3887fsArr[i5];
            c3887fsArr2[10] = c3887fsArrOooO0Oo[i5];
            c3887fsArr2[11] = c3887fsArrOooO0Oo2[i5];
        }
        if (i2 < c3887fsArr.length - 1) {
            int i6 = i2 + 1;
            c3887fsArr2[1] = c3887fsArr[i6];
            c3887fsArr2[6] = c3887fsArrOooO0Oo[i6];
            c3887fsArr2[7] = c3887fsArrOooO0Oo2[i6];
        }
        if (i2 < c3887fsArr.length - 2) {
            int i7 = i2 + 2;
            c3887fsArr2[9] = c3887fsArr[i7];
            c3887fsArr2[12] = c3887fsArrOooO0Oo[i7];
            c3887fsArr2[13] = c3887fsArrOooO0Oo2[i7];
        }
        for (int i8 = 0; i8 < 14 && !OooO0O0(c3887fs, c3887fsArr2[i8]); i8++) {
        }
    }

    private void OooO0oO() {
        C3961hs[] c3961hsArr = this.OooO0O0;
        if (c3961hsArr[0] == null || c3961hsArr[this.OooO0Oo + 1] == null) {
            return;
        }
        C3887fs[] c3887fsArrOooO0Oo = c3961hsArr[0].OooO0Oo();
        C3887fs[] c3887fsArrOooO0Oo2 = this.OooO0O0[this.OooO0Oo + 1].OooO0Oo();
        for (int i = 0; i < c3887fsArrOooO0Oo.length; i++) {
            if (c3887fsArrOooO0Oo[i] != null && c3887fsArrOooO0Oo2[i] != null && c3887fsArrOooO0Oo[i].OooO0OO() == c3887fsArrOooO0Oo2[i].OooO0OO()) {
                for (int i2 = 1; i2 <= this.OooO0Oo; i2++) {
                    C3887fs c3887fs = this.OooO0O0[i2].OooO0Oo()[i];
                    if (c3887fs != null) {
                        c3887fs.OooO(c3887fsArrOooO0Oo[i].OooO0OO());
                        if (!c3887fs.OooO0oO()) {
                            this.OooO0O0[i2].OooO0Oo()[i] = null;
                        }
                    }
                }
            }
        }
    }

    private int OooO0oo() {
        C3961hs[] c3961hsArr = this.OooO0O0;
        if (c3961hsArr[0] == null) {
            return 0;
        }
        C3887fs[] c3887fsArrOooO0Oo = c3961hsArr[0].OooO0Oo();
        int i = 0;
        for (int i2 = 0; i2 < c3887fsArrOooO0Oo.length; i2++) {
            if (c3887fsArrOooO0Oo[i2] != null) {
                int iOooO0OO = c3887fsArrOooO0Oo[i2].OooO0OO();
                int iOooO0OO2 = 0;
                for (int i3 = 1; i3 < this.OooO0Oo + 1 && iOooO0OO2 < 2; i3++) {
                    C3887fs c3887fs = this.OooO0O0[i3].OooO0Oo()[i2];
                    if (c3887fs != null) {
                        iOooO0OO2 = OooO0OO(iOooO0OO, iOooO0OO2, c3887fs);
                        if (!c3887fs.OooO0oO()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public final int OooOO0() {
        return this.OooO0Oo;
    }

    public final int OooOO0O() {
        return this.OooO00o.OooO0O0();
    }

    public final int OooOO0o() {
        return this.OooO00o.OooO0OO();
    }

    public final C3961hs OooOOO(int i) {
        return this.OooO0O0[i];
    }

    public final C3850es OooOOO0() {
        return this.OooO0OO;
    }

    public final C3961hs[] OooOOOO() {
        OooO00o(this.OooO0O0[0]);
        OooO00o(this.OooO0O0[this.OooO0Oo + 1]);
        int i = C4589yr.OooO0O0;
        while (true) {
            int iOooO0Oo = OooO0Oo();
            if (iOooO0Oo <= 0 || iOooO0Oo >= i) {
                break;
            }
            i = iOooO0Oo;
        }
        return this.OooO0O0;
    }

    public final void OooOOOo(C3850es c3850es) {
        this.OooO0OO = c3850es;
    }

    public final void OooOOo0(int i, C3961hs c3961hs) {
        this.OooO0O0[i] = c3961hs;
    }

    public final String toString() {
        C3961hs[] c3961hsArr = this.OooO0O0;
        C3961hs c3961hs = c3961hsArr[0];
        if (c3961hs == null) {
            c3961hs = c3961hsArr[this.OooO0Oo + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c3961hs.OooO0Oo().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.OooO0Oo + 2; i2++) {
                    C3961hs[] c3961hsArr2 = this.OooO0O0;
                    if (c3961hsArr2[i2] == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C3887fs c3887fs = c3961hsArr2[i2].OooO0Oo()[i];
                        if (c3887fs == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c3887fs.OooO0OO()), Integer.valueOf(c3887fs.OooO0o0()));
                        }
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
