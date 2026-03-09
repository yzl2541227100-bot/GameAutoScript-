package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {
    public boolean done;
    public final ConditionalSubscriber<? super R> downstream;

    /* JADX INFO: renamed from: qs */
    public QueueSubscription<T> f19496qs;
    public int sourceMode;
    public xc0 upstream;

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber) {
        this.downstream = conditionalSubscriber;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // p285z2.xc0
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f19496qs.clear();
    }

    public final void fail(Throwable th) {
        Exceptions.throwIfFatal(th);
        this.upstream.cancel();
        onError(th);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f19496qs.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p285z2.wc0
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public final void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
            this.upstream = xc0Var;
            if (xc0Var instanceof QueueSubscription) {
                this.f19496qs = (QueueSubscription) xc0Var;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // p285z2.xc0
    public void request(long j) {
        this.upstream.request(j);
    }

    public final int transitiveBoundaryFusion(int i) {
        QueueSubscription<T> queueSubscription = this.f19496qs;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }
}
