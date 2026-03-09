package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: n */
    public final long f19442n;

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = 2288246011222124525L;
        public final wc0<? super T> downstream;
        public long remaining;
        public xc0 upstream;

        public LimitSubscriber(wc0<? super T> wc0Var, long j) {
            this.downstream = wc0Var;
            this.remaining = j;
            lazySet(j);
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            long j = this.remaining;
            if (j > 0) {
                long j2 = j - 1;
                this.remaining = j2;
                this.downstream.onNext(t);
                if (j2 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                if (this.remaining == 0) {
                    xc0Var.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = xc0Var;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        j3 = j2 <= j ? j2 : j;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.upstream.request(j3);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j) {
        super(flowable);
        this.f19442n = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(wc0Var, this.f19442n));
    }
}
