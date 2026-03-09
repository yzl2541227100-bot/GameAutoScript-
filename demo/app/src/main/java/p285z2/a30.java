package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class a30<T> extends g20<T> {
    private final p20<T> OoooOoO;

    public a30(p20<T> p20Var) {
        this.OoooOoO = p20Var;
    }

    @n20
    @Deprecated
    public static <T> p20<T> OooO0Oo(Class<T> cls) {
        return OooO0o(e30.OooO0o(cls));
    }

    @n20
    public static <T> p20<T> OooO0o(p20<T> p20Var) {
        return new a30(p20Var);
    }

    @n20
    public static <T> p20<T> OooO0o0(T t) {
        return OooO0o(d30.OooO0oo(t));
    }

    @n20
    public static <T> p20<T> OooO0oO(Class<T> cls) {
        return OooO0o(e30.OooO0o(cls));
    }

    @Override // p285z2.g20, p285z2.p20
    public void OooO00o(Object obj, l20 l20Var) {
        this.OoooOoO.OooO00o(obj, l20Var);
    }

    @Override // p285z2.p20
    public boolean OooO0O0(Object obj) {
        return this.OoooOoO.OooO0O0(obj);
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("is ").OooO0O0(this.OoooOoO);
    }
}
