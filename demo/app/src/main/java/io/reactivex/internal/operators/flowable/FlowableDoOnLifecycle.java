package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Action onCancel;
    private final LongConsumer onRequest;
    private final Consumer<? super xc0> onSubscribe;

    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public final wc0<? super T> downstream;
        public final Action onCancel;
        public final LongConsumer onRequest;
        public final Consumer<? super xc0> onSubscribe;
        public xc0 upstream;

        public SubscriptionLambdaSubscriber(wc0<? super T> wc0Var, Consumer<? super xc0> consumer, LongConsumer longConsumer, Action action) {
            this.downstream = wc0Var;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }

        @Override // p285z2.xc0
        public void cancel() {
            xc0 xc0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var != subscriptionHelper) {
                this.upstream = subscriptionHelper;
                try {
                    this.onCancel.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
                xc0Var.cancel();
            }
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            try {
                this.onSubscribe.accept(xc0Var);
                if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                    this.upstream = xc0Var;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                xc0Var.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.downstream);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            try {
                this.onRequest.accept(j);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.request(j);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super xc0> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber(wc0Var, this.onSubscribe, this.onRequest, this.onCancel));
    }
}
