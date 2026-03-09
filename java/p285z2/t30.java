package p285z2;

import java.util.concurrent.Callable;
import org.jdeferred.DeferredManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t30<D, P> implements Callable<D> {
    private final s30<D, Throwable, P> OoooOoO;
    private final DeferredManager.StartPolicy OoooOoo;

    public t30() {
        this.OoooOoO = new q40();
        this.OoooOoo = DeferredManager.StartPolicy.DEFAULT;
    }

    public t30(DeferredManager.StartPolicy startPolicy) {
        this.OoooOoO = new q40();
        this.OoooOoo = startPolicy;
    }

    public s30<D, Throwable, P> OooO00o() {
        return this.OoooOoO;
    }

    public DeferredManager.StartPolicy OooO0O0() {
        return this.OoooOoo;
    }

    public void OooO0OO(P p) {
        this.OoooOoO.OooOO0O(p);
    }
}
