package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    public final Future<? extends T> future;
    public final long timeout;
    public final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(wc0Var);
        wc0Var.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            T t = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t == null) {
                wc0Var.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            wc0Var.onError(th);
        }
    }
}
