package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {
        public final wc0<? super T> downstream;
        public xc0 upstream;

        public IgnoreElementsSubscriber(wc0<? super T> wc0Var) {
            this.downstream = wc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
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
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return null;
        }

        @Override // p285z2.xc0
        public void request(long j) {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public FlowableIgnoreElements(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new IgnoreElementsSubscriber(wc0Var));
    }
}
