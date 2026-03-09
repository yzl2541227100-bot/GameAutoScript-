package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    public final T defaultValue;
    public final boolean failOnEmpty;

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        public final T defaultValue;
        public boolean done;
        public final boolean failOnEmpty;
        public xc0 upstream;

        public SingleElementSubscriber(wc0<? super T> wc0Var, T t, boolean z) {
            super(wc0Var);
            this.defaultValue = t;
            this.failOnEmpty = z;
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
            T t = this.value;
            this.value = null;
            if (t == null) {
                t = this.defaultValue;
            }
            if (t != null) {
                complete(t);
            } else if (this.failOnEmpty) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
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
            if (this.value == null) {
                this.value = t;
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
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

    public FlowableSingle(Flowable<T> flowable, T t, boolean z) {
        super(flowable);
        this.defaultValue = t;
        this.failOnEmpty = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new SingleElementSubscriber(wc0Var, this.defaultValue, this.failOnEmpty));
    }
}
