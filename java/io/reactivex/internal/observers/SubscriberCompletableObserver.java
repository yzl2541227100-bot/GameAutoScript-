package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, xc0 {
    public final wc0<? super T> subscriber;
    public Disposable upstream;

    public SubscriberCompletableObserver(wc0<? super T> wc0Var) {
        this.subscriber = wc0Var;
    }

    @Override // p285z2.xc0
    public void cancel() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.subscriber.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }

    @Override // p285z2.xc0
    public void request(long j) {
    }
}
