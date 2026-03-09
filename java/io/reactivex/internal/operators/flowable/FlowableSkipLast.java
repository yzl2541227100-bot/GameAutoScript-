package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSkipLast<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int skip;

    public static final class SkipLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -3807491841935125653L;
        public final wc0<? super T> downstream;
        public final int skip;
        public xc0 upstream;

        public SkipLastSubscriber(wc0<? super T> wc0Var, int i) {
            super(i);
            this.downstream = wc0Var;
            this.skip = i;
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
            if (this.skip == size()) {
                this.downstream.onNext(poll());
            } else {
                this.upstream.request(1L);
            }
            offer(t);
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

    public FlowableSkipLast(Flowable<T> flowable, int i) {
        super(flowable);
        this.skip = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new SkipLastSubscriber(wc0Var, this.skip));
    }
}
