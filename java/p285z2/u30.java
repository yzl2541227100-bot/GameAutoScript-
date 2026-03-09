package p285z2;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.jdeferred.DeferredManager;
import org.jdeferred.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class u30<D, P> extends FutureTask<D> {
    public final s30<D, Throwable, P> OoooOoO;
    public final DeferredManager.StartPolicy OoooOoo;

    public u30(Runnable runnable) {
        super(runnable, null);
        this.OoooOoO = new q40();
        this.OoooOoo = DeferredManager.StartPolicy.DEFAULT;
    }

    public u30(Callable<D> callable) {
        super(callable);
        this.OoooOoO = new q40();
        this.OoooOoo = DeferredManager.StartPolicy.DEFAULT;
    }

    public u30(t30<D, P> t30Var) {
        super(t30Var);
        this.OoooOoO = t30Var.OooO00o();
        this.OoooOoo = t30Var.OooO0O0();
    }

    public u30(v30<P> v30Var) {
        super(v30Var, null);
        this.OoooOoO = v30Var.OooO00o();
        this.OoooOoo = v30Var.OooO0O0();
    }

    public DeferredManager.StartPolicy OooO00o() {
        return this.OoooOoo;
    }

    public Promise<D, Throwable, P> OooO0O0() {
        return this.OoooOoO.OooOO0o();
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        try {
            if (isCancelled()) {
                this.OoooOoO.OooOo0o(new CancellationException());
            }
            this.OoooOoO.OooOo0O(get());
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            this.OoooOoO.OooOo0o(e.getCause());
        }
    }
}
