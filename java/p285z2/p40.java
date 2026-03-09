package p285z2;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class p40 extends n40 {
    public static final boolean OooO0Oo = true;
    private final ExecutorService OooO0O0;
    private boolean OooO0OO;

    public p40() {
        this.OooO0OO = true;
        this.OooO0O0 = Executors.newCachedThreadPool();
    }

    public p40(ExecutorService executorService) {
        this.OooO0OO = true;
        this.OooO0O0 = executorService;
    }

    @Override // p285z2.n40
    public boolean OooOOOo() {
        return this.OooO0OO;
    }

    @Override // p285z2.n40
    public void OooOOo(Callable callable) {
        this.OooO0O0.submit(callable);
    }

    @Override // p285z2.n40
    public void OooOOo0(Runnable runnable) {
        this.OooO0O0.submit(runnable);
    }

    public boolean OooOOoo(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.OooO0O0.awaitTermination(j, timeUnit);
    }

    public void OooOo() {
        this.OooO0O0.shutdown();
    }

    public boolean OooOo0() {
        return this.OooO0O0.isShutdown();
    }

    public ExecutorService OooOo00() {
        return this.OooO0O0;
    }

    public boolean OooOo0O() {
        return this.OooO0O0.isTerminated();
    }

    public void OooOo0o(boolean z) {
        this.OooO0OO = z;
    }

    public List<Runnable> OooOoO0() {
        return this.OooO0O0.shutdownNow();
    }
}
