package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    public final Scheduler scheduler;
    public final TimeUnit unit;

    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public final wc0<? super Timed<T>> downstream;
        public long lastTime;
        public final Scheduler scheduler;
        public final TimeUnit unit;
        public xc0 upstream;

        public TimeIntervalSubscriber(wc0<? super Timed<T>> wc0Var, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = wc0Var;
            this.scheduler = scheduler;
            this.unit = timeUnit;
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
            long jNow = this.scheduler.now(this.unit);
            long j = this.lastTime;
            this.lastTime = jNow;
            this.downstream.onNext(new Timed(t, jNow - j, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Timed<T>> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(wc0Var, this.unit, this.scheduler));
    }
}
