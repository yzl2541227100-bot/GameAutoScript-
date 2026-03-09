package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long limit;

    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -5636543848937116287L;
        public boolean done;
        public final wc0<? super T> downstream;
        public final long limit;
        public long remaining;
        public xc0 upstream;

        public TakeSubscriber(wc0<? super T> wc0Var, long j) {
            this.downstream = wc0Var;
            this.limit = j;
            this.remaining = j;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.remaining;
            long j2 = j - 1;
            this.remaining = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.downstream.onNext(t);
                if (z) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (this.limit != 0) {
                    this.downstream.onSubscribe(this);
                    return;
                }
                xc0Var.cancel();
                this.done = true;
                EmptySubscription.complete(this.downstream);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (get() || !compareAndSet(false, true) || j < this.limit) {
                    this.upstream.request(j);
                } else {
                    this.upstream.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j) {
        super(flowable);
        this.limit = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(wc0Var, this.limit));
    }
}
