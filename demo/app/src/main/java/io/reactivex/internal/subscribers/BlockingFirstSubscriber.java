package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // p285z2.wc0
    public void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        } else {
            RxJavaPlugins.onError(th);
        }
        countDown();
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
            this.upstream.cancel();
            countDown();
        }
    }
}
