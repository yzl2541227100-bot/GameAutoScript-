package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    public boolean hasValue;
    public xc0 upstream;

    public DeferredScalarSubscriber(wc0<? super R> wc0Var) {
        super(wc0Var);
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
            this.upstream = xc0Var;
            this.downstream.onSubscribe(this);
            xc0Var.request(Long.MAX_VALUE);
        }
    }
}
