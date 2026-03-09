package p285z2;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import org.jdeferred.DeferredManager;
import org.jdeferred.Promise;
import org.jdeferred.android.AndroidExecutionScope;

/* JADX INFO: loaded from: classes2.dex */
public class g40 extends p40 {
    private static Void[] OooO0o0 = new Void[0];

    public g40() {
    }

    public g40(ExecutorService executorService) {
        super(executorService);
    }

    @Override // p285z2.n40, org.jdeferred.DeferredManager
    public <D, F, P> Promise<D, F, P> OooO(Promise<D, F, P> promise) {
        return promise instanceof h40 ? promise : new h40(promise).OooOO0o();
    }

    @Override // p285z2.n40, org.jdeferred.DeferredManager
    public Promise<x40, z40, w40> OooO0O0(Promise... promiseArr) {
        return new h40(super.OooO0O0(promiseArr)).OooOO0o();
    }

    @Override // p285z2.n40, org.jdeferred.DeferredManager
    public <D, P> Promise<D, Throwable, P> OooOO0(u30<D, P> u30Var) {
        return (Promise<D, Throwable, P>) new h40(super.OooOO0(u30Var)).OooOO0o();
    }

    public <D, F, P> Promise<D, F, P> OooOoO(Promise<D, F, P> promise, AndroidExecutionScope androidExecutionScope) {
        return promise instanceof h40 ? promise : new h40(promise, androidExecutionScope).OooOO0o();
    }

    public Promise<x40, z40, w40> OooOoOO(AndroidExecutionScope androidExecutionScope, Promise... promiseArr) {
        return new h40(super.OooO0O0(promiseArr), androidExecutionScope).OooOO0o();
    }

    @SuppressLint({"NewApi"})
    public <Progress, Result> Promise<Result, Throwable, Progress> OooOoo(m40<Void, Progress, Result> m40Var) {
        if (m40Var.OooO0O0() == DeferredManager.StartPolicy.AUTO || (m40Var.OooO0O0() == DeferredManager.StartPolicy.DEFAULT && OooOOOo())) {
            if (Build.VERSION.SDK_INT >= 11) {
                m40Var.executeOnExecutor(OooOo00(), OooO0o0);
            } else {
                m40Var.execute(OooO0o0);
            }
        }
        return m40Var.OooO0Oo();
    }

    public Promise<x40, z40, w40> OooOoo0(AndroidExecutionScope androidExecutionScope, m40<Void, ?, ?>... m40VarArr) {
        OooOOOO(m40VarArr);
        Promise[] promiseArr = new Promise[m40VarArr.length];
        for (int i = 0; i < m40VarArr.length; i++) {
            promiseArr[i] = OooOoo(m40VarArr[i]);
        }
        return OooOoOO(androidExecutionScope, promiseArr);
    }

    public Promise<x40, z40, w40> OooOooO(m40<Void, ?, ?>... m40VarArr) {
        OooOOOO(m40VarArr);
        Promise[] promiseArr = new Promise[m40VarArr.length];
        for (int i = 0; i < m40VarArr.length; i++) {
            promiseArr[i] = OooOoo(m40VarArr[i]);
        }
        return OooO0O0(promiseArr);
    }
}
