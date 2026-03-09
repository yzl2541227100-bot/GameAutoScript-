package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u20<T> extends g20<T> {
    private static final o30 OoooOoo = new o30("matchesSafely", 1, 0);
    private final Class<?> OoooOoO;

    public u20() {
        this(OoooOoo);
    }

    public u20(Class<?> cls) {
        this.OoooOoO = cls;
    }

    public u20(o30 o30Var) {
        this.OoooOoO = o30Var.OooO0OO(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p285z2.g20, p285z2.p20
    public final void OooO00o(Object obj, l20 l20Var) {
        if (obj == 0) {
            super.OooO00o(obj, l20Var);
        } else if (this.OoooOoO.isInstance(obj)) {
            OooO0Oo(obj, l20Var);
        } else {
            l20Var.OooO0Oo("was a ").OooO0Oo(obj.getClass().getName()).OooO0Oo(" (").OooO0o0(obj).OooO0Oo(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p285z2.p20
    public final boolean OooO0O0(Object obj) {
        return obj != 0 && this.OoooOoO.isInstance(obj) && OooO0o0(obj);
    }

    public void OooO0Oo(T t, l20 l20Var) {
        super.OooO00o(t, l20Var);
    }

    public abstract boolean OooO0o0(T t);
}
