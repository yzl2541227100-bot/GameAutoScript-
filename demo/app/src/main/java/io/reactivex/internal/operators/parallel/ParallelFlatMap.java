package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    public final boolean delayError;
    public final Function<? super T, ? extends vc0<? extends R>> mapper;
    public final int maxConcurrency;
    public final int prefetch;
    public final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends vc0<? extends R>> function, boolean z, int i, int i2) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z;
        this.maxConcurrency = i;
        this.prefetch = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(wc0<? super R>[] wc0VarArr) {
        if (validate(wc0VarArr)) {
            int length = wc0VarArr.length;
            wc0<? super T>[] wc0VarArr2 = new wc0[length];
            for (int i = 0; i < length; i++) {
                wc0VarArr2[i] = FlowableFlatMap.subscribe(wc0VarArr[i], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(wc0VarArr2);
        }
    }
}
