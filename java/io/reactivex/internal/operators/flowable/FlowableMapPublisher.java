package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    public final Function<? super T, ? extends U> mapper;
    public final vc0<T> source;

    public FlowableMapPublisher(vc0<T> vc0Var, Function<? super T, ? extends U> function) {
        this.source = vc0Var;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        this.source.subscribe(new FlowableMap.MapSubscriber(wc0Var, this.mapper));
    }
}
