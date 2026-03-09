package p285z2;

import p285z2.l20;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t20<T> extends g20<T> {
    private static final o30 OoooOoo = new o30("matchesSafely", 2, 0);
    private final Class<?> OoooOoO;

    public t20() {
        this(OoooOoo);
    }

    public t20(Class<?> cls) {
        this.OoooOoO = cls;
    }

    public t20(o30 o30Var) {
        this.OoooOoO = o30Var.OooO0OO(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p285z2.g20, p285z2.p20
    public final void OooO00o(Object obj, l20 l20Var) {
        if (obj == 0 || !this.OoooOoO.isInstance(obj)) {
            super.OooO00o(obj, l20Var);
        } else {
            OooO0Oo(obj, l20Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p285z2.p20
    public final boolean OooO0O0(Object obj) {
        return obj != 0 && this.OoooOoO.isInstance(obj) && OooO0Oo(obj, new l20.OooO00o());
    }

    public abstract boolean OooO0Oo(T t, l20 l20Var);
}
