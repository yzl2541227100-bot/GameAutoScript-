package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiPredicate<? super Integer, ? super Throwable> predicate;

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final wc0<? super T> downstream;
        public final BiPredicate<? super Integer, ? super Throwable> predicate;
        public long produced;
        public int retries;

        /* JADX INFO: renamed from: sa */
        public final SubscriptionArbiter f19447sa;
        public final vc0<? extends T> source;

        public RetryBiSubscriber(wc0<? super T> wc0Var, BiPredicate<? super Integer, ? super Throwable> biPredicate, SubscriptionArbiter subscriptionArbiter, vc0<? extends T> vc0Var) {
            this.downstream = wc0Var;
            this.f19447sa = subscriptionArbiter;
            this.source = vc0Var;
            this.predicate = biPredicate;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (biPredicate.test(Integer.valueOf(i), th)) {
                    subscribeNext();
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            this.f19447sa.setSubscription(xc0Var);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f19447sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.f19447sa.produced(j);
                    }
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    public FlowableRetryBiPredicate(Flowable<T> flowable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(flowable);
        this.predicate = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        wc0Var.onSubscribe(subscriptionArbiter);
        new RetryBiSubscriber(wc0Var, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }
}
