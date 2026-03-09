package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    public final AtomicReference<xc0> upstream = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public final void onSubscribe(xc0 xc0Var) {
        if (EndConsumerHelper.setOnce(this.upstream, xc0Var, getClass())) {
            onStart();
        }
    }

    public final void request(long j) {
        this.upstream.get().request(j);
    }
}
