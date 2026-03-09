package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class q20 {
    public static <T> void OooO00o(T t, p20<? super T> p20Var) {
        OooO0O0("", t, p20Var);
    }

    public static <T> void OooO0O0(String str, T t, p20<? super T> p20Var) {
        if (p20Var.OooO0O0(t)) {
            return;
        }
        s20 s20Var = new s20();
        s20Var.OooO0Oo(str).OooO0Oo("\nExpected: ").OooO0O0(p20Var).OooO0Oo("\n     but: ");
        p20Var.OooO00o(t, s20Var);
        throw new AssertionError(s20Var.toString());
    }

    public static void OooO0OO(String str, boolean z) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
