package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
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
public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    public final vc0<U> other;

    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, xc0 {
        private static final long serialVersionUID = -6270983465606289181L;
        public final wc0<? super T> downstream;
        public volatile boolean gate;
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();
        public final SkipUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        public final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<xc0> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public OtherSubscriber() {
            }

            @Override // p285z2.wc0
            public void onComplete() {
                SkipUntilMainSubscriber.this.gate = true;
            }

            @Override // p285z2.wc0
            public void onError(Throwable th) {
                SubscriptionHelper.cancel(SkipUntilMainSubscriber.this.upstream);
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                HalfSerializer.onError(skipUntilMainSubscriber.downstream, th, skipUntilMainSubscriber, skipUntilMainSubscriber.error);
            }

            @Override // p285z2.wc0
            public void onNext(Object obj) {
                SkipUntilMainSubscriber.this.gate = true;
                get().cancel();
            }

            @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
            public void onSubscribe(xc0 xc0Var) {
                SubscriptionHelper.setOnce(this, xc0Var, Long.MAX_VALUE);
            }
        }

        public SkipUntilMainSubscriber(wc0<? super T> wc0Var) {
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
            if (tryOnNext(t)) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, xc0Var);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            if (!this.gate) {
                return false;
            }
            HalfSerializer.onNext(this.downstream, t, this, this.error);
            return true;
        }
    }

    public FlowableSkipUntil(Flowable<T> flowable, vc0<U> vc0Var) {
        super(flowable);
        this.other = vc0Var;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SkipUntilMainSubscriber skipUntilMainSubscriber = new SkipUntilMainSubscriber(wc0Var);
        wc0Var.onSubscribe(skipUntilMainSubscriber);
        this.other.subscribe(skipUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber) skipUntilMainSubscriber);
    }
}
