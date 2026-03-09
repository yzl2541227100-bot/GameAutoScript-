package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    public final Callable<? extends vc0<? extends T>> supplier;

    public FlowableDefer(Callable<? extends vc0<? extends T>> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        try {
            ((vc0) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(wc0Var);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }
}
