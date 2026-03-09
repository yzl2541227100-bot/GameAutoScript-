package p285z2;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: z2.n1 */
/* JADX INFO: loaded from: classes.dex */
public class C4156n1<R> implements InterfaceFutureC4045k1<R>, InterfaceC4193o1<R> {
    private static final OooO00o Ooooooo = new OooO00o();
    private final int OoooOoO;
    private final int OoooOoo;
    private final boolean Ooooo00;
    private final OooO00o Ooooo0o;

    @Nullable
    private R OooooO0;

    @Nullable
    private InterfaceC4082l1 OooooOO;
    private boolean OooooOo;
    private boolean Oooooo;
    private boolean Oooooo0;

    @Nullable
    private GlideException OoooooO;

    /* JADX INFO: renamed from: z2.n1$OooO00o */
    @VisibleForTesting
    public static class OooO00o {
        public void OooO00o(Object obj) {
            obj.notifyAll();
        }

        public void OooO0O0(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public C4156n1(int i, int i2) {
        this(i, i2, true, Ooooooo);
    }

    public C4156n1(int i, int i2, boolean z, OooO00o oooO00o) {
        this.OoooOoO = i;
        this.OoooOoo = i2;
        this.Ooooo00 = z;
        this.Ooooo0o = oooO00o;
    }

    private synchronized R OooO0OO(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.Ooooo00 && !isDone()) {
            C4379t2.OooO00o();
        }
        if (this.OooooOo) {
            throw new CancellationException();
        }
        if (this.Oooooo) {
            throw new ExecutionException(this.OoooooO);
        }
        if (this.Oooooo0) {
            return this.OooooO0;
        }
        if (l == null) {
            this.Ooooo0o.OooO0O0(this, 0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                this.Ooooo0o.OooO0O0(this, jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.Oooooo) {
            throw new ExecutionException(this.OoooooO);
        }
        if (this.OooooOo) {
            throw new CancellationException();
        }
        if (!this.Oooooo0) {
            throw new TimeoutException();
        }
        return this.OooooO0;
    }

    @Override // p285z2.InterfaceC4193o1
    public synchronized boolean OooO00o(@Nullable GlideException glideException, Object obj, Target<R> target, boolean z) {
        this.Oooooo = true;
        this.OoooooO = glideException;
        this.Ooooo0o.OooO00o(this);
        return false;
    }

    @Override // p285z2.InterfaceC4193o1
    public synchronized boolean OooO0O0(R r, Object obj, Target<R> target, DataSource dataSource, boolean z) {
        this.Oooooo0 = true;
        this.OooooO0 = r;
        this.Ooooo0o.OooO00o(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        InterfaceC4082l1 interfaceC4082l1;
        if (isDone()) {
            return false;
        }
        this.OooooOo = true;
        this.Ooooo0o.OooO00o(this);
        if (z && (interfaceC4082l1 = this.OooooOO) != null) {
            interfaceC4082l1.clear();
            this.OooooOO = null;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return OooO0OO(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return OooO0OO(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public synchronized InterfaceC4082l1 getRequest() {
        return this.OooooOO;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.OoooOoO, this.OoooOoo);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.OooooOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.OooooOo     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.Oooooo0     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.Oooooo     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4156n1.isDone():boolean");
    }

    @Override // p285z2.InterfaceC4229p0
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(@NonNull R r, @Nullable InterfaceC4526x1<? super R> interfaceC4526x1) {
    }

    @Override // p285z2.InterfaceC4229p0
    public void onStart() {
    }

    @Override // p285z2.InterfaceC4229p0
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(@Nullable InterfaceC4082l1 interfaceC4082l1) {
        this.OooooOO = interfaceC4082l1;
    }
}
