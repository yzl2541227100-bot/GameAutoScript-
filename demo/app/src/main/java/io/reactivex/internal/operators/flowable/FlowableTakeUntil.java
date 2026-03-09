package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTakeUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    public final vc0<? extends U> other;

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -4945480365982832967L;
        public final wc0<? super T> downstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public final TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        public final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<xc0> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public OtherSubscriber() {
            }

            @Override // p285z2.wc0
            public void onComplete() {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                HalfSerializer.onComplete(takeUntilMainSubscriber.downstream, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // p285z2.wc0
            public void onError(Throwable th) {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                HalfSerializer.onError(takeUntilMainSubscriber.downstream, th, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // p285z2.wc0
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
            public void onSubscribe(xc0 xc0Var) {
                SubscriptionHelper.setOnce(this, xc0Var, Long.MAX_VALUE);
            }
        }

        public TakeUntilMainSubscriber(wc0<? super T> wc0Var) {
            this.downstream = wc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            HalfSerializer.onNext(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, xc0Var);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }
    }

    public FlowableTakeUntil(Flowable<T> flowable, vc0<? extends U> vc0Var) {
        super(flowable);
        this.other = vc0Var;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(wc0Var);
        wc0Var.onSubscribe(takeUntilMainSubscriber);
        this.other.subscribe(takeUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber) takeUntilMainSubscriber);
    }
}
