package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimer extends Flowable<Long> {
    public final long delay;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements xc0, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final wc0<? super Long> downstream;
        public volatile boolean requested;

        public TimerSubscriber(wc0<? super Long> wc0Var) {
            this.downstream = wc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.requested) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Long> wc0Var) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(wc0Var);
        wc0Var.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.scheduler.scheduleDirect(timerSubscriber, this.delay, this.unit));
    }
}
