package p285z2;

import org.jdeferred.DeferredManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v30<P> implements Runnable {
    private final s30<Void, Throwable, P> OoooOoO;
    private final DeferredManager.StartPolicy OoooOoo;

    public v30() {
        this.OoooOoO = new q40();
        this.OoooOoo = DeferredManager.StartPolicy.DEFAULT;
    }

    public v30(DeferredManager.StartPolicy startPolicy) {
        this.OoooOoO = new q40();
        this.OoooOoo = startPolicy;
    }

    public s30<Void, Throwable, P> OooO00o() {
        return this.OoooOoO;
    }

    public DeferredManager.StartPolicy OooO0O0() {
        return this.OoooOoo;
    }

    public void OooO0OO(P p) {
        this.OoooOoO.OooOO0O(p);
    }
}
