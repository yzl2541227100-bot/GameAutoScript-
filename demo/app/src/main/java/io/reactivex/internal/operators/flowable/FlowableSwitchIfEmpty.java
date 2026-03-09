package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    public final vc0<? extends T> other;

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        public final wc0<? super T> downstream;
        public final vc0<? extends T> other;
        public boolean empty = true;
        public final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(wc0<? super T> wc0Var, vc0<? extends T> vc0Var) {
            this.downstream = wc0Var;
            this.other = vc0Var;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (!this.empty) {
                this.downstream.onComplete();
            } else {
                this.empty = false;
                this.other.subscribe(this);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            this.arbiter.setSubscription(xc0Var);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, vc0<? extends T> vc0Var) {
        super(flowable);
        this.other = vc0Var;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(wc0Var, this.other);
        wc0Var.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}
