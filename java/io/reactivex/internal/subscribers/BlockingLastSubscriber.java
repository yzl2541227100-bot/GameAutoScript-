package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // p285z2.wc0
    public void onError(Throwable th) {
        this.value = null;
        this.error = th;
        countDown();
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        this.value = t;
    }
}
