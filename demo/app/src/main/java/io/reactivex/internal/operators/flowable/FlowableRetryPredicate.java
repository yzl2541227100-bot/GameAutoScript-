package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long count;
    public final Predicate<? super Throwable> predicate;

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final wc0<? super T> downstream;
        public final Predicate<? super Throwable> predicate;
        public long produced;
        public long remaining;

        /* JADX INFO: renamed from: sa */
        public final SubscriptionArbiter f19448sa;
        public final vc0<? extends T> source;

        public RetrySubscriber(wc0<? super T> wc0Var, long j, Predicate<? super Throwable> predicate, SubscriptionArbiter subscriptionArbiter, vc0<? extends T> vc0Var) {
            this.downstream = wc0Var;
            this.f19448sa = subscriptionArbiter;
            this.source = vc0Var;
            this.predicate = predicate;
            this.remaining = j;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (this.predicate.test(th)) {
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
            this.f19448sa.setSubscription(xc0Var);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f19448sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.f19448sa.produced(j);
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

    public FlowableRetryPredicate(Flowable<T> flowable, long j, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.predicate = predicate;
        this.count = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        wc0Var.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(wc0Var, this.count, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }
}
