package p285z2;

import org.jdeferred.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class u40<D, F, P, D_OUT, F_OUT, P_OUT> extends q40<D_OUT, F_OUT, P_OUT> implements Promise<D_OUT, F_OUT, P_OUT> {

    public class OooO implements z30<F_OUT> {
        public OooO() {
        }

        @Override // p285z2.z30
        public void OooO0O0(F_OUT f_out) {
            u40.this.OooOo0o(f_out);
        }
    }

    public class OooO00o implements c40<P> {
        public final /* synthetic */ e40 OooO00o;

        public OooO00o(e40 e40Var) {
            this.OooO00o = e40Var;
        }

        @Override // p285z2.c40
        public void OooO0O0(P p) {
            e40 e40Var = this.OooO00o;
            if (e40Var != null) {
                u40.this.Oooo000(e40Var.OooO00o(p));
            } else {
                u40.this.OooOO0O(p);
            }
        }
    }

    public class OooO0O0 implements z30<F> {
        public final /* synthetic */ b40 OooO00o;

        public OooO0O0(b40 b40Var) {
            this.OooO00o = b40Var;
        }

        @Override // p285z2.z30
        public void OooO0O0(F f) {
            b40 b40Var = this.OooO00o;
            if (b40Var != null) {
                u40.this.Oooo000(b40Var.OooO00o(f));
            } else {
                u40.this.OooOo0o(f);
            }
        }
    }

    public class OooO0OO implements w30<D> {
        public final /* synthetic */ y30 OooO00o;

        public OooO0OO(y30 y30Var) {
            this.OooO00o = y30Var;
        }

        @Override // p285z2.w30
        public void OooO0O0(D d) {
            y30 y30Var = this.OooO00o;
            if (y30Var != null) {
                u40.this.Oooo000(y30Var.OooO00o(d));
            } else {
                u40.this.OooOo0O(d);
            }
        }
    }

    public class OooO0o implements c40<P_OUT> {
        public OooO0o() {
        }

        @Override // p285z2.c40
        public void OooO0O0(P_OUT p_out) {
            u40.this.OooOO0O(p_out);
        }
    }

    public class OooOO0 implements w30<D_OUT> {
        public OooOO0() {
        }

        @Override // p285z2.w30
        public void OooO0O0(D_OUT d_out) {
            u40.this.OooOo0O(d_out);
        }
    }

    public u40(Promise<D, F, P> promise, y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var, e40<P, D_OUT, F_OUT, P_OUT> e40Var) {
        promise.OooOOO(new OooO0OO(y30Var)).OooOO0(new OooO0O0(b40Var)).OooO00o(new OooO00o(e40Var));
    }

    public Promise<D_OUT, F_OUT, P_OUT> Oooo000(Promise<D_OUT, F_OUT, P_OUT> promise) {
        promise.OooOOO(new OooOO0()).OooOO0(new OooO()).OooO00o(new OooO0o());
        return promise;
    }
}
