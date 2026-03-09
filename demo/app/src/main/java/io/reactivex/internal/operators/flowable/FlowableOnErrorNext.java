package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean allowFatal;
    public final Function<? super Throwable, ? extends vc0<? extends T>> nextSupplier;

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        public final boolean allowFatal;
        public boolean done;
        public final wc0<? super T> downstream;
        public final Function<? super Throwable, ? extends vc0<? extends T>> nextSupplier;
        public boolean once;
        public long produced;

        public OnErrorNextSubscriber(wc0<? super T> wc0Var, Function<? super Throwable, ? extends vc0<? extends T>> function, boolean z) {
            super(false);
            this.downstream = wc0Var;
            this.nextSupplier = function;
            this.allowFatal = z;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.once) {
                if (this.done) {
                    RxJavaPlugins.onError(th);
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.once = true;
            if (this.allowFatal && !(th instanceof Exception)) {
                this.downstream.onError(th);
                return;
            }
            try {
                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
                long j = this.produced;
                if (j != 0) {
                    produced(j);
                }
                vc0Var.subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (!this.once) {
                this.produced++;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            setSubscription(xc0Var);
        }
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends vc0<? extends T>> function, boolean z) {
        super(flowable);
        this.nextSupplier = function;
        this.allowFatal = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(wc0Var, this.nextSupplier, this.allowFatal);
        wc0Var.onSubscribe(onErrorNextSubscriber);
        this.source.subscribe((FlowableSubscriber) onErrorNextSubscriber);
    }
}
