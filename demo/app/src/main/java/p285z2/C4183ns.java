package p285z2;

/* JADX INFO: renamed from: z2.ns */
/* JADX INFO: loaded from: classes2.dex */
public final class C4183ns {
    private final C4146ms OooO00o;
    private final int[] OooO0O0;

    public C4183ns(C4146ms c4146ms, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.OooO00o = c4146ms;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.OooO0O0 = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.OooO0O0 = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.OooO0O0 = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public final C4183ns OooO(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.OooO00o.OooO0o();
        }
        int length = this.OooO0O0.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.OooO00o.OooO(this.OooO0O0[i3], i2);
        }
        return new C4183ns(this.OooO00o, iArr);
    }

    public final C4183ns OooO00o(C4183ns c4183ns) {
        if (!this.OooO00o.equals(c4183ns.OooO00o)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (OooO0o()) {
            return c4183ns;
        }
        if (c4183ns.OooO0o()) {
            return this;
        }
        int[] iArr = this.OooO0O0;
        int[] iArr2 = c4183ns.OooO0O0;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = this.OooO00o.OooO00o(iArr2[i - length], iArr[i]);
        }
        return new C4183ns(this.OooO00o, iArr3);
    }

    public final int OooO0O0(int i) {
        if (i == 0) {
            return OooO0OO(0);
        }
        if (i == 1) {
            int iOooO00o = 0;
            for (int i2 : this.OooO0O0) {
                iOooO00o = this.OooO00o.OooO00o(iOooO00o, i2);
            }
            return iOooO00o;
        }
        int[] iArr = this.OooO0O0;
        int iOooO00o2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            C4146ms c4146ms = this.OooO00o;
            iOooO00o2 = c4146ms.OooO00o(c4146ms.OooO(i, iOooO00o2), this.OooO0O0[i3]);
        }
        return iOooO00o2;
    }

    public final int OooO0OO(int i) {
        return this.OooO0O0[(r0.length - 1) - i];
    }

    public final int[] OooO0Oo() {
        return this.OooO0O0;
    }

    public final boolean OooO0o() {
        return this.OooO0O0[0] == 0;
    }

    public final int OooO0o0() {
        return this.OooO0O0.length - 1;
    }

    public final C4183ns OooO0oO(int i) {
        if (i == 0) {
            return this.OooO00o.OooO0o();
        }
        if (i == 1) {
            return this;
        }
        int length = this.OooO0O0.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.OooO00o.OooO(this.OooO0O0[i2], i);
        }
        return new C4183ns(this.OooO00o, iArr);
    }

    public final C4183ns OooO0oo(C4183ns c4183ns) {
        if (!this.OooO00o.equals(c4183ns.OooO00o)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (OooO0o() || c4183ns.OooO0o()) {
            return this.OooO00o.OooO0o();
        }
        int[] iArr = this.OooO0O0;
        int length = iArr.length;
        int[] iArr2 = c4183ns.OooO0O0;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                C4146ms c4146ms = this.OooO00o;
                iArr3[i4] = c4146ms.OooO00o(iArr3[i4], c4146ms.OooO(i2, iArr2[i3]));
            }
        }
        return new C4183ns(this.OooO00o, iArr3);
    }

    public final C4183ns OooOO0() {
        int length = this.OooO0O0.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.OooO00o.OooOO0(0, this.OooO0O0[i]);
        }
        return new C4183ns(this.OooO00o, iArr);
    }

    public final C4183ns OooOO0O(C4183ns c4183ns) {
        if (this.OooO00o.equals(c4183ns.OooO00o)) {
            return c4183ns.OooO0o() ? this : OooO00o(c4183ns.OooOO0());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(OooO0o0() * 8);
        for (int iOooO0o0 = OooO0o0(); iOooO0o0 >= 0; iOooO0o0--) {
            int iOooO0OO = OooO0OO(iOooO0o0);
            if (iOooO0OO != 0) {
                if (iOooO0OO < 0) {
                    sb.append(" - ");
                    iOooO0OO = -iOooO0OO;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iOooO0o0 == 0 || iOooO0OO != 1) {
                    sb.append(iOooO0OO);
                }
                if (iOooO0o0 != 0) {
                    if (iOooO0o0 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iOooO0o0);
                    }
                }
            }
        }
        return sb.toString();
    }
}
