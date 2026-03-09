package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends vc0<? extends R>> mapper;
    public final int prefetch;
    public final vc0<T> source;

    public FlowableConcatMapPublisher(vc0<T> vc0Var, Function<? super T, ? extends vc0<? extends R>> function, int i, ErrorMode errorMode) {
        this.source = vc0Var;
        this.mapper = function;
        this.prefetch = i;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, wc0Var, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(wc0Var, this.mapper, this.prefetch, this.errorMode));
    }
}
