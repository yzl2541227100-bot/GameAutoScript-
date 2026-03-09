package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableNever extends Flowable<Object> {
    public static final Flowable<Object> INSTANCE = new FlowableNever();

    private FlowableNever() {
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Object> wc0Var) {
        wc0Var.onSubscribe(EmptySubscription.INSTANCE);
    }
}
