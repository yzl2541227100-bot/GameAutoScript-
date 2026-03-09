package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableToList<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    public final Callable<U> collectionSupplier;

    public static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -8134157938864266736L;
        public xc0 upstream;

        /* JADX WARN: Multi-variable type inference failed */
        public ToListSubscriber(wc0<? super U> wc0Var, U u) {
            super(wc0Var);
            this.value = u;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            complete(this.value);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            Collection collection = (Collection) this.value;
            if (collection != null) {
                collection.add(t);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToList(Flowable<T> flowable, Callable<U> callable) {
        super(flowable);
        this.collectionSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        try {
            this.source.subscribe((FlowableSubscriber) new ToListSubscriber(wc0Var, (Collection) ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }
}
