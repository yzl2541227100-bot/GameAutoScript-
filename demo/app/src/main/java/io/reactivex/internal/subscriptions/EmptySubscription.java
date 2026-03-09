package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public static void complete(wc0<?> wc0Var) {
        wc0Var.onSubscribe(INSTANCE);
        wc0Var.onComplete();
    }

    public static void error(Throwable th, wc0<?> wc0Var) {
        wc0Var.onSubscribe(INSTANCE);
        wc0Var.onError(th);
    }

    @Override // p285z2.xc0
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    @Override // p285z2.xc0
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
