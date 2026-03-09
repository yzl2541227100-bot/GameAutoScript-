package org.jdeferred;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p285z2.t30;
import p285z2.u30;
import p285z2.v30;
import p285z2.w40;
import p285z2.x40;
import p285z2.z40;

/* JADX INFO: loaded from: classes2.dex */
public interface DeferredManager {

    public enum StartPolicy {
        DEFAULT,
        AUTO,
        MANAUL
    }

    <D, F, P> Promise<D, F, P> OooO(Promise<D, F, P> promise);

    Promise<x40, z40, w40> OooO00o(Runnable... runnableArr);

    Promise<x40, z40, w40> OooO0O0(Promise... promiseArr);

    Promise<x40, z40, w40> OooO0OO(v30<?>... v30VarArr);

    <D> Promise<D, Throwable, Void> OooO0Oo(Future<D> future);

    Promise<Void, Throwable, Void> OooO0o(Runnable runnable);

    Promise<x40, z40, w40> OooO0o0(t30<?, ?>... t30VarArr);

    <D> Promise<D, Throwable, Void> OooO0oO(Callable<D> callable);

    Promise<x40, z40, w40> OooO0oo(u30<?, ?>... u30VarArr);

    <D, P> Promise<D, Throwable, P> OooOO0(u30<D, P> u30Var);

    <P> Promise<Void, Throwable, P> OooOO0O(v30<P> v30Var);

    Promise<x40, z40, w40> OooOO0o(Callable<?>... callableArr);

    <D, P> Promise<D, Throwable, P> OooOOO(t30<D, P> t30Var);

    Promise<x40, z40, w40> OooOOO0(Future<?>... futureArr);
}
