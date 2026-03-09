package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DetachSubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public wc0<? super T> downstream;
        public xc0 upstream;

        public DetachSubscriber(wc0<? super T> wc0Var) {
            this.downstream = wc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            xc0 xc0Var = this.upstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            xc0Var.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            wc0<? super T> wc0Var = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            wc0Var.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            wc0<? super T> wc0Var = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            wc0Var.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }
    }

    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new DetachSubscriber(wc0Var));
    }
}
