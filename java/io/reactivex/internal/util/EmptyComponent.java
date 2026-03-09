package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public enum EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, xc0, Disposable {
    INSTANCE;

    public static <T> Observer<T> asObserver() {
        return INSTANCE;
    }

    public static <T> wc0<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // p285z2.xc0
    public void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // p285z2.wc0
    public void onComplete() {
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        RxJavaPlugins.onError(th);
    }

    @Override // p285z2.wc0
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        xc0Var.cancel();
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(Object obj) {
    }

    @Override // p285z2.xc0
    public void request(long j) {
    }
}
