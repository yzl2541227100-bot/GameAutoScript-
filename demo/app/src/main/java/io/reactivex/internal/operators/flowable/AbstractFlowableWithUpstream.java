package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import p285z2.vc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> implements HasUpstreamPublisher<T> {
    public final Flowable<T> source;

    public AbstractFlowableWithUpstream(Flowable<T> flowable) {
        this.source = (Flowable) ObjectHelper.requireNonNull(flowable, "source is null");
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final vc0<T> source() {
        return this.source;
    }
}
