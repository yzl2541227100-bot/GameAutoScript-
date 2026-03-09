package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
    private static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final wc0<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<xc0> upstream = new AtomicReference<>();
    public final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(wc0<? super T> wc0Var) {
        this.downstream = wc0Var;
    }

    @Override // p285z2.xc0
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // p285z2.wc0
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th, this, this.error);
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        HalfSerializer.onNext(this.downstream, t, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, xc0Var);
        } else {
            xc0Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p285z2.xc0
    public void request(long j) {
        if (j > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
    }
}
