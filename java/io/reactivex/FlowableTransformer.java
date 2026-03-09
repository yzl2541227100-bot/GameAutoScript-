package io.reactivex;

import io.reactivex.annotations.NonNull;
import p285z2.vc0;

/* JADX INFO: loaded from: classes2.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    vc0<Downstream> apply(@NonNull Flowable<Upstream> flowable);
}
