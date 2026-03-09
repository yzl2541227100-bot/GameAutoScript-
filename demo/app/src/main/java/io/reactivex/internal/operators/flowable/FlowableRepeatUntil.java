package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BooleanSupplier until;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final wc0<? super T> downstream;
        public long produced;

        /* JADX INFO: renamed from: sa */
        public final SubscriptionArbiter f19445sa;
        public final vc0<? extends T> source;
        public final BooleanSupplier stop;

        public RepeatSubscriber(wc0<? super T> wc0Var, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, vc0<? extends T> vc0Var) {
            this.downstream = wc0Var;
            this.f19445sa = subscriptionArbiter;
            this.source = vc0Var;
            this.stop = booleanSupplier;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            this.f19445sa.setSubscription(xc0Var);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f19445sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.f19445sa.produced(j);
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

    public FlowableRepeatUntil(Flowable<T> flowable, BooleanSupplier booleanSupplier) {
        super(flowable);
        this.until = booleanSupplier;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        wc0Var.onSubscribe(subscriptionArbiter);
        new RepeatSubscriber(wc0Var, this.until, subscriptionArbiter, this.source).subscribeNext();
    }
}
