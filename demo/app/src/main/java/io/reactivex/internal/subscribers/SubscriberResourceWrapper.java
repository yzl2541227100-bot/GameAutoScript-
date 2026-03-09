package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, xc0 {
    private static final long serialVersionUID = -8612022020200669122L;
    public final wc0<? super T> downstream;
    public final AtomicReference<xc0> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(wc0<? super T> wc0Var) {
        this.downstream = wc0Var;
    }

    @Override // p285z2.xc0
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // p285z2.wc0
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.setOnce(this.upstream, xc0Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p285z2.xc0
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
