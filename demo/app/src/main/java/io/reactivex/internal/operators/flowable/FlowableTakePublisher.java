package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    public final long limit;
    public final vc0<T> source;

    public FlowableTakePublisher(vc0<T> vc0Var, long j) {
        this.source = vc0Var;
        this.limit = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(wc0Var, this.limit));
    }
}
