package p285z2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.jdeferred.DeferredManager;
import org.jdeferred.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n40 implements DeferredManager {
    public final Logger OooO00o = LoggerFactory.getLogger(n40.class);

    public class OooO00o<D> extends t30<D, Void> {
        public final /* synthetic */ Future Ooooo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(DeferredManager.StartPolicy startPolicy, Future future) {
            super(startPolicy);
            this.Ooooo00 = future;
        }

        @Override // java.util.concurrent.Callable
        public D call() throws Exception {
            try {
                return (D) this.Ooooo00.get();
            } catch (InterruptedException e) {
                throw e;
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof Exception) {
                    throw ((Exception) e2.getCause());
                }
                throw e2;
            }
        }
    }

    @Override // org.jdeferred.DeferredManager
    public <D, F, P> Promise<D, F, P> OooO(Promise<D, F, P> promise) {
        return promise;
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooO00o(Runnable... runnableArr) {
        OooOOOO(runnableArr);
        Promise[] promiseArr = new Promise[runnableArr.length];
        for (int i = 0; i < runnableArr.length; i++) {
            if (runnableArr[i] instanceof v30) {
                promiseArr[i] = OooOO0O((v30) runnableArr[i]);
            } else {
                promiseArr[i] = OooO0o(runnableArr[i]);
            }
        }
        return OooO0O0(promiseArr);
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooO0O0(Promise... promiseArr) {
        OooOOOO(promiseArr);
        return new v40(promiseArr).OooOO0o();
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooO0OO(v30<?>... v30VarArr) {
        OooOOOO(v30VarArr);
        Promise[] promiseArr = new Promise[v30VarArr.length];
        for (int i = 0; i < v30VarArr.length; i++) {
            promiseArr[i] = OooOO0O(v30VarArr[i]);
        }
        return OooO0O0(promiseArr);
    }

    @Override // org.jdeferred.DeferredManager
    public <D> Promise<D, Throwable, Void> OooO0Oo(Future<D> future) {
        return OooOOO(new OooO00o(DeferredManager.StartPolicy.AUTO, future));
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<Void, Throwable, Void> OooO0o(Runnable runnable) {
        return OooOO0(new u30(runnable));
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooO0o0(t30<?, ?>... t30VarArr) {
        OooOOOO(t30VarArr);
        Promise[] promiseArr = new Promise[t30VarArr.length];
        for (int i = 0; i < t30VarArr.length; i++) {
            promiseArr[i] = OooOOO(t30VarArr[i]);
        }
        return OooO0O0(promiseArr);
    }

    @Override // org.jdeferred.DeferredManager
    public <D> Promise<D, Throwable, Void> OooO0oO(Callable<D> callable) {
        return OooOO0(new u30(callable));
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooO0oo(u30<?, ?>... u30VarArr) {
        OooOOOO(u30VarArr);
        Promise[] promiseArr = new Promise[u30VarArr.length];
        for (int i = 0; i < u30VarArr.length; i++) {
            promiseArr[i] = OooOO0(u30VarArr[i]);
        }
        return OooO0O0(promiseArr);
    }

    @Override // org.jdeferred.DeferredManager
    public <D, P> Promise<D, Throwable, P> OooOO0(u30<D, P> u30Var) {
        if (u30Var.OooO00o() == DeferredManager.StartPolicy.AUTO || (u30Var.OooO00o() == DeferredManager.StartPolicy.DEFAULT && OooOOOo())) {
            OooOOo0(u30Var);
        }
        return u30Var.OooO0O0();
    }

    @Override // org.jdeferred.DeferredManager
    public <P> Promise<Void, Throwable, P> OooOO0O(v30<P> v30Var) {
        return OooOO0(new u30((v30) v30Var));
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooOO0o(Callable<?>... callableArr) {
        OooOOOO(callableArr);
        Promise[] promiseArr = new Promise[callableArr.length];
        for (int i = 0; i < callableArr.length; i++) {
            if (callableArr[i] instanceof t30) {
                promiseArr[i] = OooOOO((t30) callableArr[i]);
            } else {
                promiseArr[i] = OooO0oO(callableArr[i]);
            }
        }
        return OooO0O0(promiseArr);
    }

    @Override // org.jdeferred.DeferredManager
    public <D, P> Promise<D, Throwable, P> OooOOO(t30<D, P> t30Var) {
        return OooOO0(new u30<>((t30) t30Var));
    }

    @Override // org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooOOO0(Future<?>... futureArr) {
        OooOOOO(futureArr);
        Promise[] promiseArr = new Promise[futureArr.length];
        for (int i = 0; i < futureArr.length; i++) {
            promiseArr[i] = OooO0Oo(futureArr[i]);
        }
        return OooO0O0(promiseArr);
    }

    public void OooOOOO(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Arguments is null or its length is empty");
        }
    }

    public abstract boolean OooOOOo();

    public abstract void OooOOo(Callable callable);

    public abstract void OooOOo0(Runnable runnable);
}
