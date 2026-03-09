package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import p285z2.vc0;

/* JADX INFO: loaded from: classes2.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, vc0<Object>> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, vc0<T>> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public vc0<Object> apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
