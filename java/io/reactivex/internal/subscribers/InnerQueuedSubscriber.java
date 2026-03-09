package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<xc0> implements FlowableSubscriber<T>, xc0 {
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final InnerQueuedSubscriberSupport<T> parent;
    public final int prefetch;
    public long produced;
    public volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // p285z2.xc0
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // p285z2.wc0
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.setOnce(this, xc0Var)) {
            if (xc0Var instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(xc0Var, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(xc0Var, this.prefetch);
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // p285z2.xc0
    public void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 < this.limit) {
                this.produced = j2;
            } else {
                this.produced = 0L;
                get().request(j2);
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j != this.limit) {
                this.produced = j;
            } else {
                this.produced = 0L;
                get().request(j);
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}
