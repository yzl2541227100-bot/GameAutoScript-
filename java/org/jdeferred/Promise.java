package org.jdeferred;

import p285z2.a40;
import p285z2.b40;
import p285z2.c40;
import p285z2.d40;
import p285z2.e40;
import p285z2.r30;
import p285z2.w30;
import p285z2.x30;
import p285z2.y30;
import p285z2.z30;

/* JADX INFO: loaded from: classes2.dex */
public interface Promise<D, F, P> {

    public enum State {
        PENDING,
        REJECTED,
        RESOLVED
    }

    <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO(x30<D, D_OUT> x30Var);

    Promise<D, F, P> OooO00o(c40<P> c40Var);

    void OooO0O0(long j) throws InterruptedException;

    <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0OO(y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var, e40<P, D_OUT, F_OUT, P_OUT> e40Var);

    <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0Oo(y30<D, D_OUT, F_OUT, P_OUT> y30Var, b40<F, D_OUT, F_OUT, P_OUT> b40Var);

    State OooO0o();

    <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooO0o0(y30<D, D_OUT, F_OUT, P_OUT> y30Var);

    Promise<D, F, P> OooO0oO(r30<D, F> r30Var);

    Promise<D, F, P> OooO0oo(w30<D> w30Var);

    Promise<D, F, P> OooOO0(z30<F> z30Var);

    Promise<D, F, P> OooOOO(w30<D> w30Var);

    boolean OooOOO0();

    void OooOOOO() throws InterruptedException;

    Promise<D, F, P> OooOOOo(w30<D> w30Var, z30<F> z30Var);

    <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooOOo(x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var, d40<P, P_OUT> d40Var);

    boolean OooOOo0();

    Promise<D, F, P> OooOOoo(w30<D> w30Var, z30<F> z30Var, c40<P> c40Var);

    <D_OUT, F_OUT, P_OUT> Promise<D_OUT, F_OUT, P_OUT> OooOo0(x30<D, D_OUT> x30Var, a40<F, F_OUT> a40Var);

    boolean OooOo00();
}
