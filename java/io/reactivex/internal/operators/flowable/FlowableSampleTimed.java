package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean emitLast;
    public final long period;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        public SampleTimedEmitLast(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(wc0Var, j, timeUnit, scheduler);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(wc0Var, j, timeUnit, scheduler);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, xc0, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final wc0<? super T> downstream;
        public final long period;
        public final Scheduler scheduler;
        public final TimeUnit unit;
        public xc0 upstream;
        public final AtomicLong requested = new AtomicLong();
        public final SequentialDisposable timer = new SequentialDisposable();

        public SampleTimedSubscriber(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = wc0Var;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // p285z2.xc0
        public void cancel() {
            cancelTimer();
            this.upstream.cancel();
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        public abstract void complete();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // p285z2.wc0
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler = this.scheduler;
                long j = this.period;
                sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.unit));
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
            }
        }
    }

    public FlowableSampleTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.period = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        Flowable<T> flowable;
        FlowableSubscriber<? super T> sampleTimedNoLast;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wc0Var);
        if (this.emitLast) {
            flowable = this.source;
            sampleTimedNoLast = new SampleTimedEmitLast<>(serializedSubscriber, this.period, this.unit, this.scheduler);
        } else {
            flowable = this.source;
            sampleTimedNoLast = new SampleTimedNoLast<>(serializedSubscriber, this.period, this.unit, this.scheduler);
        }
        flowable.subscribe((FlowableSubscriber) sampleTimedNoLast);
    }
}
