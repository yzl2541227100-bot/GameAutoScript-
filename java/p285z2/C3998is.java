package p285z2;

/* JADX INFO: renamed from: z2.is */
/* JADX INFO: loaded from: classes2.dex */
public final class C3998is extends C3961hs {
    private final boolean OooO0Oo;

    public C3998is(C3850es c3850es, boolean z) {
        super(c3850es);
        this.OooO0Oo = z;
    }

    private void OooO0oo(C3776cs c3776cs) {
        C3850es c3850esOooO00o = OooO00o();
        C3807dm c3807dmOooO0oo = this.OooO0Oo ? c3850esOooO00o.OooO0oo() : c3850esOooO00o.OooO();
        C3807dm c3807dmOooO0O0 = this.OooO0Oo ? c3850esOooO00o.OooO0O0() : c3850esOooO00o.OooO0OO();
        int iOooO0o0 = OooO0o0((int) c3807dmOooO0O0.OooO0Oo());
        C3887fs[] c3887fsArrOooO0Oo = OooO0Oo();
        int iOooO0OO = -1;
        int i = 0;
        int iMax = 1;
        for (int iOooO0o02 = OooO0o0((int) c3807dmOooO0oo.OooO0Oo()); iOooO0o02 < iOooO0o0; iOooO0o02++) {
            if (c3887fsArrOooO0Oo[iOooO0o02] != null) {
                C3887fs c3887fs = c3887fsArrOooO0Oo[iOooO0o02];
                c3887fs.OooOO0();
                int iOooO0OO2 = c3887fs.OooO0OO() - iOooO0OO;
                if (iOooO0OO2 == 0) {
                    i++;
                } else {
                    if (iOooO0OO2 == 1) {
                        iMax = Math.max(iMax, i);
                    } else if (c3887fs.OooO0OO() >= c3776cs.OooO0OO()) {
                        c3887fsArrOooO0Oo[iOooO0o02] = null;
                    }
                    iOooO0OO = c3887fs.OooO0OO();
                    i = 1;
                }
            }
        }
    }

    private void OooOO0o(C3887fs[] c3887fsArr, C3776cs c3776cs) {
        for (int i = 0; i < c3887fsArr.length; i++) {
            C3887fs c3887fs = c3887fsArr[i];
            if (c3887fsArr[i] != null) {
                int iOooO0o0 = c3887fs.OooO0o0() % 30;
                int iOooO0OO = c3887fs.OooO0OO();
                if (iOooO0OO > c3776cs.OooO0OO()) {
                    c3887fsArr[i] = null;
                } else {
                    if (!this.OooO0Oo) {
                        iOooO0OO += 2;
                    }
                    int i2 = iOooO0OO % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && iOooO0o0 + 1 != c3776cs.OooO00o()) {
                                c3887fsArr[i] = null;
                            }
                        } else if (iOooO0o0 / 3 != c3776cs.OooO0O0() || iOooO0o0 % 3 != c3776cs.OooO0Oo()) {
                            c3887fsArr[i] = null;
                        }
                    } else if ((iOooO0o0 * 3) + 1 != c3776cs.OooO0o0()) {
                        c3887fsArr[i] = null;
                    }
                }
            }
        }
    }

    private void OooOOO0() {
        for (C3887fs c3887fs : OooO0Oo()) {
            if (c3887fs != null) {
                c3887fs.OooOO0();
            }
        }
    }

    public final C3776cs OooO() {
        C3887fs[] c3887fsArrOooO0Oo = OooO0Oo();
        C3813ds c3813ds = new C3813ds();
        C3813ds c3813ds2 = new C3813ds();
        C3813ds c3813ds3 = new C3813ds();
        C3813ds c3813ds4 = new C3813ds();
        for (C3887fs c3887fs : c3887fsArrOooO0Oo) {
            if (c3887fs != null) {
                c3887fs.OooOO0();
                int iOooO0o0 = c3887fs.OooO0o0() % 30;
                int iOooO0OO = c3887fs.OooO0OO();
                if (!this.OooO0Oo) {
                    iOooO0OO += 2;
                }
                int i = iOooO0OO % 3;
                if (i == 0) {
                    c3813ds2.OooO0OO((iOooO0o0 * 3) + 1);
                } else if (i == 1) {
                    c3813ds4.OooO0OO(iOooO0o0 / 3);
                    c3813ds3.OooO0OO(iOooO0o0 % 3);
                } else if (i == 2) {
                    c3813ds.OooO0OO(iOooO0o0 + 1);
                }
            }
        }
        if (c3813ds.OooO0O0().length == 0 || c3813ds2.OooO0O0().length == 0 || c3813ds3.OooO0O0().length == 0 || c3813ds4.OooO0O0().length == 0 || c3813ds.OooO0O0()[0] <= 0 || c3813ds2.OooO0O0()[0] + c3813ds3.OooO0O0()[0] < 3 || c3813ds2.OooO0O0()[0] + c3813ds3.OooO0O0()[0] > 90) {
            return null;
        }
        C3776cs c3776cs = new C3776cs(c3813ds.OooO0O0()[0], c3813ds2.OooO0O0()[0], c3813ds3.OooO0O0()[0], c3813ds4.OooO0O0()[0]);
        OooOO0o(c3887fsArrOooO0Oo, c3776cs);
        return c3776cs;
    }

    public final void OooO0oO(C3776cs c3776cs) {
        C3887fs[] c3887fsArrOooO0Oo = OooO0Oo();
        OooOOO0();
        OooOO0o(c3887fsArrOooO0Oo, c3776cs);
        C3850es c3850esOooO00o = OooO00o();
        C3807dm c3807dmOooO0oo = this.OooO0Oo ? c3850esOooO00o.OooO0oo() : c3850esOooO00o.OooO();
        C3807dm c3807dmOooO0O0 = this.OooO0Oo ? c3850esOooO00o.OooO0O0() : c3850esOooO00o.OooO0OO();
        int iOooO0o0 = OooO0o0((int) c3807dmOooO0oo.OooO0Oo());
        int iOooO0o02 = OooO0o0((int) c3807dmOooO0O0.OooO0Oo());
        int iOooO0OO = -1;
        int i = 0;
        int iMax = 1;
        while (iOooO0o0 < iOooO0o02) {
            if (c3887fsArrOooO0Oo[iOooO0o0] != null) {
                C3887fs c3887fs = c3887fsArrOooO0Oo[iOooO0o0];
                int iOooO0OO2 = c3887fs.OooO0OO() - iOooO0OO;
                if (iOooO0OO2 == 0) {
                    i++;
                } else {
                    if (iOooO0OO2 == 1) {
                        iMax = Math.max(iMax, i);
                    } else if (iOooO0OO2 < 0 || c3887fs.OooO0OO() >= c3776cs.OooO0OO() || iOooO0OO2 > iOooO0o0) {
                        c3887fsArrOooO0Oo[iOooO0o0] = null;
                    } else {
                        if (iMax > 2) {
                            iOooO0OO2 *= iMax - 2;
                        }
                        boolean z = iOooO0OO2 >= iOooO0o0;
                        for (int i2 = 1; i2 <= iOooO0OO2 && !z; i2++) {
                            z = c3887fsArrOooO0Oo[iOooO0o0 - i2] != null;
                        }
                        if (z) {
                            c3887fsArrOooO0Oo[iOooO0o0] = null;
                        }
                    }
                    iOooO0OO = c3887fs.OooO0OO();
                    i = 1;
                }
            }
            iOooO0o0++;
        }
    }

    public final int[] OooOO0() {
        int iOooO0OO;
        C3776cs c3776csOooO = OooO();
        if (c3776csOooO == null) {
            return null;
        }
        OooO0oo(c3776csOooO);
        int iOooO0OO2 = c3776csOooO.OooO0OO();
        int[] iArr = new int[iOooO0OO2];
        for (C3887fs c3887fs : OooO0Oo()) {
            if (c3887fs != null && (iOooO0OO = c3887fs.OooO0OO()) < iOooO0OO2) {
                iArr[iOooO0OO] = iArr[iOooO0OO] + 1;
            }
        }
        return iArr;
    }

    public final boolean OooOO0O() {
        return this.OooO0Oo;
    }

    @Override // p285z2.C3961hs
    public final String toString() {
        return "IsLeft: " + this.OooO0Oo + '\n' + super.toString();
    }
}
