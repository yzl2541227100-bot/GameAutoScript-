package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.po */
/* JADX INFO: loaded from: classes2.dex */
public final class C4253po {
    private static final int OooO = 1;
    private static final int OooO0oo = 10;
    private final C3772co OooO00o;
    private final int OooO0O0;
    private final int OooO0OO;
    private final int OooO0Oo;
    private final int OooO0o;
    private final int OooO0o0;
    private final int OooO0oO;

    public C4253po(C3772co c3772co) throws NotFoundException {
        this(c3772co, 10, c3772co.OooOOO0() / 2, c3772co.OooO0oo() / 2);
    }

    public C4253po(C3772co c3772co, int i, int i2, int i3) throws NotFoundException {
        this.OooO00o = c3772co;
        int iOooO0oo = c3772co.OooO0oo();
        this.OooO0O0 = iOooO0oo;
        int iOooOOO0 = c3772co.OooOOO0();
        this.OooO0OO = iOooOOO0;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.OooO0Oo = i5;
        int i6 = i2 + i4;
        this.OooO0o0 = i6;
        int i7 = i3 - i4;
        this.OooO0oO = i7;
        int i8 = i3 + i4;
        this.OooO0o = i8;
        if (i7 < 0 || i5 < 0 || i8 >= iOooO0oo || i6 >= iOooOOO0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private C3807dm[] OooO00o(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4) {
        float fOooO0OO = c3807dm.OooO0OO();
        float fOooO0Oo = c3807dm.OooO0Oo();
        float fOooO0OO2 = c3807dm2.OooO0OO();
        float fOooO0Oo2 = c3807dm2.OooO0Oo();
        float fOooO0OO3 = c3807dm3.OooO0OO();
        float fOooO0Oo3 = c3807dm3.OooO0Oo();
        float fOooO0OO4 = c3807dm4.OooO0OO();
        float fOooO0Oo4 = c3807dm4.OooO0Oo();
        return fOooO0OO < ((float) this.OooO0OO) / 2.0f ? new C3807dm[]{new C3807dm(fOooO0OO4 - 1.0f, fOooO0Oo4 + 1.0f), new C3807dm(fOooO0OO2 + 1.0f, fOooO0Oo2 + 1.0f), new C3807dm(fOooO0OO3 - 1.0f, fOooO0Oo3 - 1.0f), new C3807dm(fOooO0OO + 1.0f, fOooO0Oo - 1.0f)} : new C3807dm[]{new C3807dm(fOooO0OO4 + 1.0f, fOooO0Oo4 + 1.0f), new C3807dm(fOooO0OO2 + 1.0f, fOooO0Oo2 - 1.0f), new C3807dm(fOooO0OO3 - 1.0f, fOooO0Oo3 + 1.0f), new C3807dm(fOooO0OO - 1.0f, fOooO0Oo - 1.0f)};
    }

    private boolean OooO0O0(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.OooO00o.OooO0o0(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.OooO00o.OooO0o0(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private C3807dm OooO0Oo(float f, float f2, float f3, float f4) {
        int iOooO0OO = C4142mo.OooO0OO(C4142mo.OooO00o(f, f2, f3, f4));
        float f5 = iOooO0OO;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iOooO0OO; i++) {
            float f8 = i;
            int iOooO0OO2 = C4142mo.OooO0OO((f8 * f6) + f);
            int iOooO0OO3 = C4142mo.OooO0OO((f8 * f7) + f2);
            if (this.OooO00o.OooO0o0(iOooO0OO2, iOooO0OO3)) {
                return new C3807dm(iOooO0OO2, iOooO0OO3);
            }
        }
        return null;
    }

    public final C3807dm[] OooO0OO() throws NotFoundException {
        int i = this.OooO0Oo;
        int i2 = this.OooO0o0;
        int i3 = this.OooO0oO;
        int i4 = this.OooO0o;
        boolean z = false;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (z3) {
            boolean zOooO0O0 = true;
            boolean z9 = false;
            while (true) {
                if ((!zOooO0O0 && z4) || i2 >= this.OooO0OO) {
                    break;
                }
                zOooO0O0 = OooO0O0(i3, i4, i2, false);
                if (zOooO0O0) {
                    i2++;
                    z4 = true;
                    z9 = true;
                } else if (!z4) {
                    i2++;
                }
            }
            if (i2 < this.OooO0OO) {
                boolean zOooO0O02 = true;
                while (true) {
                    if ((!zOooO0O02 && z5) || i4 >= this.OooO0O0) {
                        break;
                    }
                    zOooO0O02 = OooO0O0(i, i2, i4, true);
                    if (zOooO0O02) {
                        i4++;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i4++;
                    }
                }
                if (i4 < this.OooO0O0) {
                    boolean zOooO0O03 = true;
                    while (true) {
                        if ((!zOooO0O03 && z6) || i < 0) {
                            break;
                        }
                        zOooO0O03 = OooO0O0(i3, i4, i, false);
                        if (zOooO0O03) {
                            i--;
                            z6 = true;
                            z9 = true;
                        } else if (!z6) {
                            i--;
                        }
                    }
                    if (i >= 0) {
                        z3 = z9;
                        boolean zOooO0O04 = true;
                        while (true) {
                            if ((!zOooO0O04 && z8) || i3 < 0) {
                                break;
                            }
                            zOooO0O04 = OooO0O0(i, i2, i3, true);
                            if (zOooO0O04) {
                                i3--;
                                z3 = true;
                                z8 = true;
                            } else if (!z8) {
                                i3--;
                            }
                        }
                        if (i3 >= 0) {
                            if (z3) {
                                z7 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z7) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        C3807dm c3807dmOooO0Oo = null;
        C3807dm c3807dmOooO0Oo2 = null;
        for (int i6 = 1; c3807dmOooO0Oo2 == null && i6 < i5; i6++) {
            c3807dmOooO0Oo2 = OooO0Oo(i, i4 - i6, i + i6, i4);
        }
        if (c3807dmOooO0Oo2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        C3807dm c3807dmOooO0Oo3 = null;
        for (int i7 = 1; c3807dmOooO0Oo3 == null && i7 < i5; i7++) {
            c3807dmOooO0Oo3 = OooO0Oo(i, i3 + i7, i + i7, i3);
        }
        if (c3807dmOooO0Oo3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        C3807dm c3807dmOooO0Oo4 = null;
        for (int i8 = 1; c3807dmOooO0Oo4 == null && i8 < i5; i8++) {
            c3807dmOooO0Oo4 = OooO0Oo(i2, i3 + i8, i2 - i8, i3);
        }
        if (c3807dmOooO0Oo4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i9 = 1; c3807dmOooO0Oo == null && i9 < i5; i9++) {
            c3807dmOooO0Oo = OooO0Oo(i2, i4 - i9, i2 - i9, i4);
        }
        if (c3807dmOooO0Oo != null) {
            return OooO00o(c3807dmOooO0Oo, c3807dmOooO0Oo2, c3807dmOooO0Oo4, c3807dmOooO0Oo3);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
