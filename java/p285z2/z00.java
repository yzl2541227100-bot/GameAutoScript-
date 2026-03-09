package p285z2;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class z00 {
    public static final int OooO = 1024;
    public static final int OooO0oo = 8192;
    public final byte[] OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public boolean OooO0Oo;
    public z00 OooO0o;
    public boolean OooO0o0;
    public z00 OooO0oO;

    public z00() {
        this.OooO00o = new byte[8192];
        this.OooO0o0 = true;
        this.OooO0Oo = false;
    }

    public z00(byte[] bArr, int i, int i2, boolean z, boolean z3) {
        this.OooO00o = bArr;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO0Oo = z;
        this.OooO0o0 = z3;
    }

    public final void OooO00o() {
        z00 z00Var = this.OooO0oO;
        if (z00Var == this) {
            throw new IllegalStateException();
        }
        if (z00Var.OooO0o0) {
            int i = this.OooO0OO - this.OooO0O0;
            if (i > (8192 - z00Var.OooO0OO) + (z00Var.OooO0Oo ? 0 : z00Var.OooO0O0)) {
                return;
            }
            OooO0oO(z00Var, i);
            OooO0O0();
            a10.OooO00o(this);
        }
    }

    @Nullable
    public final z00 OooO0O0() {
        z00 z00Var = this.OooO0o;
        z00 z00Var2 = z00Var != this ? z00Var : null;
        z00 z00Var3 = this.OooO0oO;
        z00Var3.OooO0o = z00Var;
        this.OooO0o.OooO0oO = z00Var3;
        this.OooO0o = null;
        this.OooO0oO = null;
        return z00Var2;
    }

    public final z00 OooO0OO(z00 z00Var) {
        z00Var.OooO0oO = this;
        z00Var.OooO0o = this.OooO0o;
        this.OooO0o.OooO0oO = z00Var;
        this.OooO0o = z00Var;
        return z00Var;
    }

    public final z00 OooO0Oo() {
        this.OooO0Oo = true;
        return new z00(this.OooO00o, this.OooO0O0, this.OooO0OO, true, false);
    }

    public final z00 OooO0o() {
        return new z00((byte[]) this.OooO00o.clone(), this.OooO0O0, this.OooO0OO, false, true);
    }

    public final z00 OooO0o0(int i) {
        z00 z00VarOooO0O0;
        if (i <= 0 || i > this.OooO0OO - this.OooO0O0) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            z00VarOooO0O0 = OooO0Oo();
        } else {
            z00VarOooO0O0 = a10.OooO0O0();
            System.arraycopy(this.OooO00o, this.OooO0O0, z00VarOooO0O0.OooO00o, 0, i);
        }
        z00VarOooO0O0.OooO0OO = z00VarOooO0O0.OooO0O0 + i;
        this.OooO0O0 += i;
        this.OooO0oO.OooO0OO(z00VarOooO0O0);
        return z00VarOooO0O0;
    }

    public final void OooO0oO(z00 z00Var, int i) {
        if (!z00Var.OooO0o0) {
            throw new IllegalArgumentException();
        }
        int i2 = z00Var.OooO0OO;
        if (i2 + i > 8192) {
            if (z00Var.OooO0Oo) {
                throw new IllegalArgumentException();
            }
            int i3 = z00Var.OooO0O0;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = z00Var.OooO00o;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            z00Var.OooO0OO -= z00Var.OooO0O0;
            z00Var.OooO0O0 = 0;
        }
        System.arraycopy(this.OooO00o, this.OooO0O0, z00Var.OooO00o, z00Var.OooO0OO, i);
        z00Var.OooO0OO += i;
        this.OooO0O0 += i;
    }
}
