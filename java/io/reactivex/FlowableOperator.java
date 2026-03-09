package io.reactivex;

import io.reactivex.annotations.NonNull;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public interface FlowableOperator<Downstream, Upstream> {
    @NonNull
    wc0<? super Upstream> apply(@NonNull wc0<? super Downstream> wc0Var) throws Exception;
}
