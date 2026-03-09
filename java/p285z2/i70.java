package p285z2;

import org.junit.runner.manipulation.NoTestsRemainException;

/* JADX INFO: loaded from: classes2.dex */
public final class i70 extends x80 {
    private final x80 OooO00o;
    private final a90 OooO0O0;

    public i70(x80 x80Var, a90 a90Var) {
        this.OooO00o = x80Var;
        this.OooO0O0 = a90Var;
    }

    @Override // p285z2.x80
    public z80 OooO0oo() {
        try {
            z80 z80VarOooO0oo = this.OooO00o.OooO0oo();
            this.OooO0O0.OooO00o(z80VarOooO0oo);
            return z80VarOooO0oo;
        } catch (NoTestsRemainException unused) {
            return new l70(a90.class, new Exception(String.format("No tests found matching %s from %s", this.OooO0O0.OooO0O0(), this.OooO00o.toString())));
        }
    }
}
