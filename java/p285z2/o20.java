package p285z2;

import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o20<T, U> extends t20<T> {
    private static final o30 OooooOO = new o30("featureValueOf", 1, 0);
    private final p20<? super U> Ooooo00;
    private final String Ooooo0o;
    private final String OooooO0;

    public o20(p20<? super U> p20Var, String str, String str2) {
        super(OooooOO);
        this.Ooooo00 = p20Var;
        this.Ooooo0o = str;
        this.OooooO0 = str2;
    }

    @Override // p285z2.t20
    public boolean OooO0Oo(T t, l20 l20Var) {
        U uOooO0o0 = OooO0o0(t);
        if (this.Ooooo00.OooO0O0(uOooO0o0)) {
            return true;
        }
        l20Var.OooO0Oo(this.OooooO0).OooO0Oo(C4196o4.OooO00o.OooO0Oo);
        this.Ooooo00.OooO00o(uOooO0o0, l20Var);
        return false;
    }

    public abstract U OooO0o0(T t);

    @Override // p285z2.r20
    public final void describeTo(l20 l20Var) {
        l20Var.OooO0Oo(this.Ooooo0o).OooO0Oo(C4196o4.OooO00o.OooO0Oo).OooO0O0(this.Ooooo00);
    }
}
