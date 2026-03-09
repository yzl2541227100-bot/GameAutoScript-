package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReduce<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiFunction<T, T, T> reducer;

    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4663883003264602070L;
        public final BiFunction<T, T, T> reducer;
        public xc0 upstream;

        public ReduceSubscriber(wc0<? super T> wc0Var, BiFunction<T, T, T> biFunction) {
            super(wc0Var);
            this.reducer = biFunction;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            xc0 xc0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var == subscriptionHelper) {
                return;
            }
            this.upstream = subscriptionHelper;
            T t = this.value;
            if (t != null) {
                complete(t);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            xc0 xc0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var == subscriptionHelper) {
                RxJavaPlugins.onError(th);
            } else {
                this.upstream = subscriptionHelper;
                this.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.upstream == SubscriptionHelper.CANCELLED) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                this.value = (T) ObjectHelper.requireNonNull(this.reducer.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
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

    public FlowableReduce(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new ReduceSubscriber(wc0Var, this.reducer));
    }
}
