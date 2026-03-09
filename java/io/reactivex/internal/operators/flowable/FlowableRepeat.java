package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long count;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final wc0<? super T> downstream;
        public long produced;
        public long remaining;

        /* JADX INFO: renamed from: sa */
        public final SubscriptionArbiter f19444sa;
        public final vc0<? extends T> source;

        public RepeatSubscriber(wc0<? super T> wc0Var, long j, SubscriptionArbiter subscriptionArbiter, vc0<? extends T> vc0Var) {
            this.downstream = wc0Var;
            this.f19444sa = subscriptionArbiter;
            this.source = vc0Var;
            this.remaining = j;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
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
            this.f19444sa.setSubscription(xc0Var);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f19444sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.f19444sa.produced(j);
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

    public FlowableRepeat(Flowable<T> flowable, long j) {
        super(flowable);
        this.count = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        wc0Var.onSubscribe(subscriptionArbiter);
        long j = this.count;
        new RepeatSubscriber(wc0Var, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).subscribeNext();
    }
}
