package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableThrottleFirstTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Scheduler scheduler;
    public final long timeout;
    public final TimeUnit unit;

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xc0, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        public boolean done;
        public final wc0<? super T> downstream;
        public volatile boolean gate;
        public final long timeout;
        public final SequentialDisposable timer = new SequentialDisposable();
        public final TimeUnit unit;
        public xc0 upstream;
        public final Scheduler.Worker worker;

        public DebounceTimedSubscriber(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.downstream = wc0Var;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done || this.gate) {
                return;
            }
            this.gate = true;
            if (get() == 0) {
                this.done = true;
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.downstream.onNext(t);
                BackpressureHelper.produced(this, 1L);
                Disposable disposable = this.timer.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.timer.replace(this.worker.schedule(this, this.timeout, this.unit));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }
    }

    public FlowableThrottleFirstTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new DebounceTimedSubscriber(new SerializedSubscriber(wc0Var), this.timeout, this.unit, this.scheduler.createWorker()));
    }
}
