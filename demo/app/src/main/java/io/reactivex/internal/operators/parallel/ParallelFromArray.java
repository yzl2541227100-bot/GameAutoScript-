package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    public final vc0<T>[] sources;

    public ParallelFromArray(vc0<T>[] vc0VarArr) {
        this.sources = vc0VarArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(wc0<? super T>[] wc0VarArr) {
        if (validate(wc0VarArr)) {
            int length = wc0VarArr.length;
            for (int i = 0; i < length; i++) {
                this.sources[i].subscribe(wc0VarArr[i]);
            }
        }
    }
}
