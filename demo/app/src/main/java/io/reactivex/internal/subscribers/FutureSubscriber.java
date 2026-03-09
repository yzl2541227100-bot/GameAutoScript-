package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, xc0 {
    public Throwable error;
    public final AtomicReference<xc0> upstream;
    public T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // p285z2.xc0
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        xc0 xc0Var;
        SubscriptionHelper subscriptionHelper;
        do {
            xc0Var = this.upstream.get();
            if (xc0Var == this || xc0Var == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!this.upstream.compareAndSet(xc0Var, subscriptionHelper));
        if (xc0Var != null) {
            xc0Var.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p285z2.wc0
    public void onComplete() {
        xc0 xc0Var;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            xc0Var = this.upstream.get();
            if (xc0Var == this || xc0Var == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!this.upstream.compareAndSet(xc0Var, this));
        countDown();
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        xc0 xc0Var;
        do {
            xc0Var = this.upstream.get();
            if (xc0Var == this || xc0Var == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!this.upstream.compareAndSet(xc0Var, this));
        countDown();
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        SubscriptionHelper.setOnce(this.upstream, xc0Var, Long.MAX_VALUE);
    }

    @Override // p285z2.xc0
    public void request(long j) {
    }
}
