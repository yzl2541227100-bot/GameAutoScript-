package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class z20<T> extends t20<Iterable<T>> {
    private final p20<? super T> Ooooo00;

    public z20(p20<? super T> p20Var) {
        this.Ooooo00 = p20Var;
    }

    @n20
    public static <U> p20<Iterable<U>> OooO0o0(p20<U> p20Var) {
        return new z20(p20Var);
    }

    @Override // p285z2.t20
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public boolean OooO0Oo(Iterable<T> iterable, l20 l20Var) {
        for (T t : iterable) {
            if (!this.Ooooo00.OooO0O0(t)) {
                l20Var.OooO0Oo("an item ");
                this.Ooooo00.OooO00o(t, l20Var);
                return false;
            }
        }
        return true;
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("every item is ").OooO0O0(this.Ooooo00);
    }
}
