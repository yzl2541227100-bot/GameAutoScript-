package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingSubscriber<T> extends AtomicReference<xc0> implements FlowableSubscriber<T>, xc0 {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // p285z2.xc0
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // p285z2.wc0
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.setOnce(this, xc0Var)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // p285z2.xc0
    public void request(long j) {
        get().request(j);
    }
}
