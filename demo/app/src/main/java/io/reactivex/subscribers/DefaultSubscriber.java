package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    public xc0 upstream;

    public final void cancel() {
        xc0 xc0Var = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        xc0Var.cancel();
    }

    public void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public final void onSubscribe(xc0 xc0Var) {
        if (EndConsumerHelper.validate(this.upstream, xc0Var, getClass())) {
            this.upstream = xc0Var;
            onStart();
        }
    }

    public final void request(long j) {
        xc0 xc0Var = this.upstream;
        if (xc0Var != null) {
            xc0Var.request(j);
        }
    }
}
