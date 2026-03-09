package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Scheduler scheduler;

    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = 1015244841293359600L;
        public final wc0<? super T> downstream;
        public final Scheduler scheduler;
        public xc0 upstream;

        public final class Cancellation implements Runnable {
            public Cancellation() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeSubscriber.this.upstream.cancel();
            }
        }

        public UnsubscribeSubscriber(wc0<? super T> wc0Var, Scheduler scheduler) {
            this.downstream = wc0Var;
            this.scheduler = scheduler;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.scheduler.scheduleDirect(new Cancellation());
            }
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (get()) {
                return;
            }
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

    public FlowableUnsubscribeOn(Flowable<T> flowable, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new UnsubscribeSubscriber(wc0Var, this.scheduler));
    }
}
