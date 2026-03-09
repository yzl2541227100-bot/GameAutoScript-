package p285z2;

import org.jdeferred.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class r40<D, F, P> implements Promise<D, F, P> {
    private final Promise<D, F, P> OooO00o;
    public final s30<D, F, P> OooO0O0;

    public r40(s30<D, F, P> s30Var) {
        this.OooO0O0 = s30Var;
        this.OooO00o = s30Var.OooOO0o();
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO(x30<D, D_OUT> x30Var) {
        return this.OooO00o.OooO(x30Var);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooO00o(c40<P> c40Var) {
        return this.OooO00o.OooO00o(c40Var);
    }

    @Override // org.jdeferred.Promise
    public void OooO0O0(long j) throws InterruptedException {
        this.OooO00o.OooO0O0(j);
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0OO(y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var, e40<P, D_OUT, F_OUT, P_OUT> e40Var) {
        return this.OooO00o.OooO0OO(y30Var, b40Var, e40Var);
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0Oo(y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var) {
        return this.OooO00o.OooO0Oo(y30Var, b40Var);
    }

    @Override // org.jdeferred.Promise
    public Promise.State OooO0o() {
        return this.OooO00o.OooO0o();
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0o0(y30<D, D_OUT, F_OUT, P_OUT> y30Var) {
        return this.OooO00o.OooO0o0(y30Var);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooO0oO(r30<D, F> r30Var) {
        return this.OooO00o.OooO0oO(r30Var);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooO0oo(w30<D> w30Var) {
        return this.OooO00o.OooO0oo(w30Var);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOO0(z30<F> z30Var) {
        return this.OooO00o.OooOO0(z30Var);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOOO(w30<D> w30Var) {
        return this.OooO00o.OooOOO(w30Var);
    }

    @Override // org.jdeferred.Promise
    public boolean OooOOO0() {
        return this.OooO00o.OooOOO0();
    }

    @Override // org.jdeferred.Promise
    public void OooOOOO() throws InterruptedException {
        this.OooO00o.OooOOOO();
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOOOo(w30<D> w30Var, z30<F> z30Var) {
        return this.OooO00o.OooOOOo(w30Var, z30Var);
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooOOo(x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var, d40<P, P_OUT> d40Var) {
        return this.OooO00o.OooOOo(x30Var, a40Var, d40Var);
    }

    @Override // org.jdeferred.Promise
    public boolean OooOOo0() {
        return this.OooO00o.OooOOo0();
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOOoo(w30<D> w30Var, z30<F> z30Var, c40<P> c40Var) {
        return this.OooO00o.OooOOoo(w30Var, z30Var, c40Var);
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooOo0(x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var) {
        return this.OooO00o.OooOo0(x30Var, a40Var);
    }

    @Override // org.jdeferred.Promise
    public boolean OooOo00() {
        return this.OooO00o.OooOo00();
    }
}
