package p285z2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jdeferred.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o40<D, F, P> implements Promise<D, F, P> {
    public D OooO0oO;
    public F OooO0oo;
    public final Logger OooO00o = LoggerFactory.getLogger(o40.class);
    public volatile Promise.State OooO0O0 = Promise.State.PENDING;
    public final List<w30<D>> OooO0OO = new CopyOnWriteArrayList();
    public final List<z30<F>> OooO0Oo = new CopyOnWriteArrayList();
    public final List<c40<P>> OooO0o0 = new CopyOnWriteArrayList();
    public final List<r30<D, F>> OooO0o = new CopyOnWriteArrayList();

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO(x30<D, D_OUT> x30Var) {
        return new s40(this, x30Var, null, null);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooO00o(c40<P> c40Var) {
        this.OooO0o0.add(c40Var);
        return this;
    }

    @Override // org.jdeferred.Promise
    public void OooO0O0(long j) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            while (OooOo00()) {
                if (j <= 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw e;
                    }
                } else {
                    wait(j - (System.currentTimeMillis() - jCurrentTimeMillis));
                }
                if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j) {
                    return;
                }
            }
        }
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0OO(y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var, e40<P, D_OUT, F_OUT, P_OUT> e40Var) {
        return new u40(this, y30Var, b40Var, e40Var);
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0Oo(y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var) {
        return new u40(this, y30Var, b40Var, null);
    }

    @Override // org.jdeferred.Promise
    public Promise.State OooO0o() {
        return this.OooO0O0;
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0o0(y30<D, D_OUT, F_OUT, P_OUT> y30Var) {
        return new u40(this, y30Var, null, null);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooO0oO(r30<D, F> r30Var) {
        synchronized (this) {
            if (OooOo00()) {
                this.OooO0o.add(r30Var);
            } else {
                OooOo(r30Var, this.OooO0O0, this.OooO0oO, this.OooO0oo);
            }
        }
        return this;
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooO0oo(w30<D> w30Var) {
        return OooOOO(w30Var);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOO0(z30<F> z30Var) {
        synchronized (this) {
            if (OooOOO0()) {
                OooOoo(z30Var, this.OooO0oo);
            } else {
                this.OooO0Oo.add(z30Var);
            }
        }
        return this;
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOOO(w30<D> w30Var) {
        synchronized (this) {
            if (OooOOo0()) {
                OooOoOO(w30Var, this.OooO0oO);
            } else {
                this.OooO0OO.add(w30Var);
            }
        }
        return this;
    }

    @Override // org.jdeferred.Promise
    public boolean OooOOO0() {
        return this.OooO0O0 == Promise.State.REJECTED;
    }

    @Override // org.jdeferred.Promise
    public void OooOOOO() throws InterruptedException {
        OooO0O0(-1L);
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOOOo(w30<D> w30Var, z30<F> z30Var) {
        OooOOO(w30Var);
        OooOO0(z30Var);
        return this;
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooOOo(x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var, d40<P, P_OUT> d40Var) {
        return new s40(this, x30Var, a40Var, d40Var);
    }

    @Override // org.jdeferred.Promise
    public boolean OooOOo0() {
        return this.OooO0O0 == Promise.State.RESOLVED;
    }

    @Override // org.jdeferred.Promise
    public Promise<D, F, P> OooOOoo(w30<D> w30Var, z30<F> z30Var, c40<P> c40Var) {
        OooOOO(w30Var);
        OooOO0(z30Var);
        OooO00o(c40Var);
        return this;
    }

    public void OooOo(r30<D, F> r30Var, Promise.State state, D d, F f) {
        r30Var.OooO0O0(state, d, f);
    }

    @Override // org.jdeferred.Promise
    public <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooOo0(x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var) {
        return new s40(this, x30Var, a40Var, null);
    }

    @Override // org.jdeferred.Promise
    public boolean OooOo00() {
        return this.OooO0O0 == Promise.State.PENDING;
    }

    public void OooOoO(D d) {
        Iterator<w30<D>> it = this.OooO0OO.iterator();
        while (it.hasNext()) {
            try {
                OooOoOO(it.next(), d);
            } catch (Exception e) {
                this.OooO00o.error("an uncaught exception occured in a DoneCallback", (Throwable) e);
            }
        }
        this.OooO0OO.clear();
    }

    public void OooOoO0(Promise.State state, D d, F f) {
        Iterator<r30<D, F>> it = this.OooO0o.iterator();
        while (it.hasNext()) {
            try {
                OooOo(it.next(), state, d, f);
            } catch (Exception e) {
                this.OooO00o.error("an uncaught exception occured in a AlwaysCallback", (Throwable) e);
            }
        }
        this.OooO0o.clear();
        synchronized (this) {
            notifyAll();
        }
    }

    public void OooOoOO(w30<D> w30Var, D d) {
        w30Var.OooO0O0(d);
    }

    public void OooOoo(z30<F> z30Var, F f) {
        z30Var.OooO0O0(f);
    }

    public void OooOoo0(F f) {
        Iterator<z30<F>> it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            try {
                OooOoo(it.next(), f);
            } catch (Exception e) {
                this.OooO00o.error("an uncaught exception occured in a FailCallback", (Throwable) e);
            }
        }
        this.OooO0Oo.clear();
    }

    public void OooOooO(P p) {
        Iterator<c40<P>> it = this.OooO0o0.iterator();
        while (it.hasNext()) {
            try {
                OooOooo(it.next(), p);
            } catch (Exception e) {
                this.OooO00o.error("an uncaught exception occured in a ProgressCallback", (Throwable) e);
            }
        }
    }

    public void OooOooo(c40<P> c40Var, P p) {
        c40Var.OooO0O0(p);
    }
}
