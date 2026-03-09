package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h20<T> {
    public static final OooO0OO<Object> OooO00o = new OooO0OO<>();

    public static final class OooO0O0<T> extends h20<T> {
        private final T OooO0O0;
        private final l20 OooO0OO;

        private OooO0O0(T t, l20 l20Var) {
            super();
            this.OooO0O0 = t;
            this.OooO0OO = l20Var;
        }

        @Override // p285z2.h20
        public <U> h20<U> OooO00o(OooO0o<? super T, U> oooO0o) {
            return oooO0o.OooO00o(this.OooO0O0, this.OooO0OO);
        }

        @Override // p285z2.h20
        public boolean OooO0Oo(p20<T> p20Var, String str) {
            if (p20Var.OooO0O0(this.OooO0O0)) {
                return true;
            }
            this.OooO0OO.OooO0Oo(str);
            p20Var.OooO00o(this.OooO0O0, this.OooO0OO);
            return false;
        }
    }

    public static final class OooO0OO<T> extends h20<T> {
        private OooO0OO() {
            super();
        }

        @Override // p285z2.h20
        public <U> h20<U> OooO00o(OooO0o<? super T, U> oooO0o) {
            return h20.OooO0o0();
        }

        @Override // p285z2.h20
        public boolean OooO0Oo(p20<T> p20Var, String str) {
            return false;
        }
    }

    public interface OooO0o<I, O> {
        h20<O> OooO00o(I i, l20 l20Var);
    }

    private h20() {
    }

    public static <T> h20<T> OooO0O0(T t, l20 l20Var) {
        return new OooO0O0(t, l20Var);
    }

    public static <T> h20<T> OooO0o0() {
        return OooO00o;
    }

    public abstract <U> h20<U> OooO00o(OooO0o<? super T, U> oooO0o);

    public final boolean OooO0OO(p20<T> p20Var) {
        return OooO0Oo(p20Var, "");
    }

    public abstract boolean OooO0Oo(p20<T> p20Var, String str);

    public final <U> h20<U> OooO0o(OooO0o<? super T, U> oooO0o) {
        return OooO00o(oooO0o);
    }
}
