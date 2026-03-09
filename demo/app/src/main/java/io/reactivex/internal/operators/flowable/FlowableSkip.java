package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: n */
    public final long f19453n;

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public final wc0<? super T> downstream;
        public long remaining;
        public xc0 upstream;

        public SkipSubscriber(wc0<? super T> wc0Var, long j) {
            this.downstream = wc0Var;
            this.remaining = j;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
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
            long j = this.remaining;
            if (j != 0) {
                this.remaining = j - 1;
            } else {
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                long j = this.remaining;
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(j);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j) {
        super(flowable);
        this.f19453n = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new SkipSubscriber(wc0Var, this.f19453n));
    }
}
