package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    public final vc0<? extends T> publisher;

    public FlowableFromPublisher(vc0<? extends T> vc0Var) {
        this.publisher = vc0Var;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.publisher.subscribe(wc0Var);
    }
}
