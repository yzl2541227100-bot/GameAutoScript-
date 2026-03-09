package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class f30<T> extends g20<T> {
    private final p20<T> OoooOoO;

    public f30(p20<T> p20Var) {
        this.OoooOoO = p20Var;
    }

    @n20
    public static <T> p20<T> OooO0Oo(T t) {
        return OooO0o0(d30.OooO0oo(t));
    }

    @n20
    public static <T> p20<T> OooO0o0(p20<T> p20Var) {
        return new f30(p20Var);
    }

    @Override // p285z2.p20
    public boolean OooO0O0(Object obj) {
        return !this.OoooOoO.OooO0O0(obj);
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("not ").OooO0O0(this.OoooOoO);
    }
}
