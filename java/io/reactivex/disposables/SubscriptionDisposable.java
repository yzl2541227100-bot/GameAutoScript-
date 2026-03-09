package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionDisposable extends ReferenceDisposable<xc0> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(xc0 xc0Var) {
        super(xc0Var);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull xc0 xc0Var) {
        xc0Var.cancel();
    }
}
