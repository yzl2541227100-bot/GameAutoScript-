package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends vc0<? extends R>> mapper;
    public final int maxConcurrency;
    public final int prefetch;
    public final vc0<T> source;

    public FlowableConcatMapEagerPublisher(vc0<T> vc0Var, Function<? super T, ? extends vc0<? extends R>> function, int i, int i2, ErrorMode errorMode) {
        this.source = vc0Var;
        this.mapper = function;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(wc0Var, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
