package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableAny<T> extends AbstractFlowableWithUpstream<T, Boolean> {
    public final Predicate<? super T> predicate;

    public static final class AnySubscriber<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2311252482644620661L;
        public boolean done;
        public final Predicate<? super T> predicate;
        public xc0 upstream;

        public AnySubscriber(wc0<? super Boolean> wc0Var, Predicate<? super T> predicate) {
            super(wc0Var);
            this.predicate = predicate;
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
            complete(Boolean.FALSE);
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
                if (this.predicate.test(t)) {
                    this.done = true;
                    this.upstream.cancel();
                    complete(Boolean.TRUE);
                }
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

    public FlowableAny(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Boolean> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new AnySubscriber(wc0Var, this.predicate));
    }
}
