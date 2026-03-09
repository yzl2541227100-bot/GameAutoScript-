package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        public long count;
        public xc0 upstream;

        public CountSubscriber(wc0<? super Long> wc0Var) {
            super(wc0Var);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            complete(Long.valueOf(this.count));
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
            this.count++;
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

    public FlowableCount(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Long> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new CountSubscriber(wc0Var));
    }
}
