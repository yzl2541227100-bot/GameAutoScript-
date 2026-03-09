package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    public final vc0<? extends T> main;
    public final vc0<U> other;

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = 2259811067697317255L;
        public final wc0<? super T> downstream;
        public final vc0<? extends T> main;
        public final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        public final AtomicReference<xc0> upstream = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<xc0> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public OtherSubscriber() {
            }

            @Override // p285z2.wc0
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // p285z2.wc0
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // p285z2.wc0
            public void onNext(Object obj) {
                xc0 xc0Var = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (xc0Var != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    xc0Var.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
            public void onSubscribe(xc0 xc0Var) {
                if (SubscriptionHelper.setOnce(this, xc0Var)) {
                    xc0Var.request(Long.MAX_VALUE);
                }
            }
        }

        public MainSubscriber(wc0<? super T> wc0Var, vc0<? extends T> vc0Var) {
            this.downstream = wc0Var;
            this.main = vc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        public void next() {
            this.main.subscribe(this);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, xc0Var);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j);
            }
        }
    }

    public FlowableDelaySubscriptionOther(vc0<? extends T> vc0Var, vc0<U> vc0Var2) {
        this.main = vc0Var;
        this.other = vc0Var2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        MainSubscriber mainSubscriber = new MainSubscriber(wc0Var, this.main);
        wc0Var.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}
