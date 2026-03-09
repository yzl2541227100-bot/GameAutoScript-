package p285z2;

import org.jdeferred.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class s40<D, F, P, D_OUT, F_OUT, P_OUT> extends q40<D_OUT, F_OUT, P_OUT> implements Promise<D_OUT, F_OUT, P_OUT> {
    private final x30<D, D_OUT> OooO;
    private final a40<F, F_OUT> OooOO0;
    private final d40<P, P_OUT> OooOO0O;
    public static final OooO0o OooOO0o = new OooO0o();
    public static final OooO OooOOO0 = new OooO();
    public static final OooOO0 OooOOO = new OooOO0();

    public static final class OooO<F> implements a40<F, F> {
        @Override // p285z2.a40
        public F OooO00o(F f) {
            return f;
        }
    }

    public class OooO00o implements c40<P> {
        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p285z2.c40
        public void OooO0O0(P p) {
            s40 s40Var = s40.this;
            s40Var.OooOO0O(s40Var.OooOO0O.OooO00o(p));
        }
    }

    public class OooO0O0 implements z30<F> {
        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p285z2.z30
        public void OooO0O0(F f) {
            s40 s40Var = s40.this;
            s40Var.OooOo0o(s40Var.OooOO0.OooO00o(f));
        }
    }

    public class OooO0OO implements w30<D> {
        public OooO0OO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p285z2.w30
        public void OooO0O0(D d) {
            s40 s40Var = s40.this;
            s40Var.OooOo0O(s40Var.OooO.OooO00o(d));
        }
    }

    public static final class OooO0o<D> implements x30<D, D> {
        @Override // p285z2.x30
        public D OooO00o(D d) {
            return d;
        }
    }

    public static final class OooOO0<P> implements d40<P, P> {
        @Override // p285z2.d40
        public P OooO00o(P p) {
            return p;
        }
    }

    public s40(Promise<D, F, P> promise, x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var, d40<P, P_OUT> d40Var) {
        this.OooO = x30Var == null ? OooOO0o : x30Var;
        this.OooOO0 = a40Var == null ? OooOOO0 : a40Var;
        this.OooOO0O = d40Var == null ? OooOOO : d40Var;
        promise.OooOOO(new OooO0OO()).OooOO0(new OooO0O0()).OooO00o(new OooO00o());
    }
}
