package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class h30<T> extends g20<T> {
    private final T OoooOoO;

    public h30(T t) {
        this.OoooOoO = t;
    }

    @n20
    public static <T> p20<T> OooO0Oo(T t) {
        return new h30(t);
    }

    @n20
    public static <T> p20<T> OooO0o0(T t) {
        return new h30(t);
    }

    @Override // p285z2.p20
    public boolean OooO0O0(Object obj) {
        return obj == this.OoooOoO;
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("sameInstance(").OooO0o0(this.OoooOoO).OooO0Oo(")");
    }
}
