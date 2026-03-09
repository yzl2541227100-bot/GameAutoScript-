package p285z2;

import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m30 extends u20<String> {
    public final String Ooooo00;

    public m30(String str) {
        this.Ooooo00 = str;
    }

    public abstract String OooO();

    @Override // p285z2.u20
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public void OooO0Oo(String str, l20 l20Var) {
        l20Var.OooO0Oo("was \"").OooO0Oo(str).OooO0Oo("\"");
    }

    public abstract boolean OooO0oO(String str);

    @Override // p285z2.u20
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public boolean OooO0o0(String str) {
        return OooO0oO(str);
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("a string ").OooO0Oo(OooO()).OooO0Oo(C4196o4.OooO00o.OooO0Oo).OooO0o0(this.Ooooo00);
    }
}
