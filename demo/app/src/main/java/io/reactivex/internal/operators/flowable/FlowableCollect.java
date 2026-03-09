package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCollect<T, U> extends AbstractFlowableWithUpstream<T, U> {
    public final BiConsumer<? super U, ? super T> collector;
    public final Callable<? extends U> initialSupplier;

    public static final class CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        public final BiConsumer<? super U, ? super T> collector;
        public boolean done;

        /* JADX INFO: renamed from: u */
        public final U f19432u;
        public xc0 upstream;

        public CollectSubscriber(wc0<? super U> wc0Var, U u, BiConsumer<? super U, ? super T> biConsumer) {
            super(wc0Var);
            this.collector = biConsumer;
            this.f19432u = u;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            complete(this.f19432u);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.collector.accept(this.f19432u, t);
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

    public FlowableCollect(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(flowable);
        this.initialSupplier = callable;
        this.collector = biConsumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        try {
            this.source.subscribe((FlowableSubscriber) new CollectSubscriber(wc0Var, ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initial value supplied is null"), this.collector));
        } catch (Throwable th) {
            EmptySubscription.error(th, wc0Var);
        }
    }
}
