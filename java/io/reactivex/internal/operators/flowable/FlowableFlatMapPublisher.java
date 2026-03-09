package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    public final int bufferSize;
    public final boolean delayErrors;
    public final Function<? super T, ? extends vc0<? extends U>> mapper;
    public final int maxConcurrency;
    public final vc0<T> source;

    public FlowableFlatMapPublisher(vc0<T> vc0Var, Function<? super T, ? extends vc0<? extends U>> function, boolean z, int i, int i2) {
        this.source = vc0Var;
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, wc0Var, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(wc0Var, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
