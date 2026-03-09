package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean nonScheduledRequests;
    public final Scheduler scheduler;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, xc0, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final wc0<? super T> downstream;
        public final boolean nonScheduledRequests;
        public vc0<T> source;
        public final Scheduler.Worker worker;
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        public static final class Request implements Runnable {

            /* JADX INFO: renamed from: n */
            public final long f19454n;
            public final xc0 upstream;

            public Request(xc0 xc0Var, long j) {
                this.upstream = xc0Var;
                this.f19454n = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f19454n);
            }
        }

        public SubscribeOnSubscriber(wc0<? super T> wc0Var, Scheduler.Worker worker, vc0<T> vc0Var, boolean z) {
            this.downstream = wc0Var;
            this.worker = worker;
            this.source = vc0Var;
            this.nonScheduledRequests = !z;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.setOnce(this.upstream, xc0Var)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, xc0Var);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                xc0 xc0Var = this.upstream.get();
                if (xc0Var != null) {
                    requestUpstream(j, xc0Var);
                    return;
                }
                BackpressureHelper.add(this.requested, j);
                xc0 xc0Var2 = this.upstream.get();
                if (xc0Var2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, xc0Var2);
                    }
                }
            }
        }

        public void requestUpstream(long j, xc0 xc0Var) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                xc0Var.request(j);
            } else {
                this.worker.schedule(new Request(xc0Var, j));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            vc0<T> vc0Var = this.source;
            this.source = null;
            vc0Var.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(wc0Var, workerCreateWorker, this.source, this.nonScheduledRequests);
        wc0Var.onSubscribe(subscribeOnSubscriber);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }
}
