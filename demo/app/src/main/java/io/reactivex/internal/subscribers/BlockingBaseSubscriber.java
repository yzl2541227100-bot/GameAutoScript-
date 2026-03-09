package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    public volatile boolean cancelled;
    public Throwable error;
    public xc0 upstream;
    public T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                xc0 xc0Var = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (xc0Var != null) {
                    xc0Var.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    @Override // p285z2.wc0
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public final void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
            this.upstream = xc0Var;
            if (this.cancelled) {
                return;
            }
            xc0Var.request(Long.MAX_VALUE);
            if (this.cancelled) {
                this.upstream = SubscriptionHelper.CANCELLED;
                xc0Var.cancel();
            }
        }
    }
}
