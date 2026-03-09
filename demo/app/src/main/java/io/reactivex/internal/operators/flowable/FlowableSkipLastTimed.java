package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int bufferSize;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final long time;
    public final TimeUnit unit;

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final wc0<? super T> downstream;
        public Throwable error;
        public final SpscLinkedArrayQueue<Object> queue;
        public final AtomicLong requested = new AtomicLong();
        public final Scheduler scheduler;
        public final long time;
        public final TimeUnit unit;
        public xc0 upstream;

        public SkipLastTimedSubscriber(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
            this.downstream = wc0Var;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i);
            this.delayError = z;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z, boolean z3, wc0<? super T> wc0Var, boolean z4) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z4) {
                if (!z3) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    wc0Var.onError(th);
                } else {
                    wc0Var.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                wc0Var.onError(th2);
                return true;
            }
            if (!z3) {
                return false;
            }
            wc0Var.onComplete();
            return true;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            wc0<? super T> wc0Var = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j = this.time;
            int iAddAndGet = 1;
            do {
                long j2 = this.requested.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z3 = this.done;
                    Long l = (Long) spscLinkedArrayQueue.peek();
                    boolean z4 = l == null;
                    boolean z5 = (z4 || l.longValue() <= scheduler.now(timeUnit) - j) ? z4 : true;
                    if (checkTerminated(z3, z5, wc0Var, z)) {
                        return;
                    }
                    if (z5) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    wc0Var.onNext(spscLinkedArrayQueue.poll());
                    j3++;
                }
                if (j3 != 0) {
                    BackpressureHelper.produced(this.requested, j3);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t);
            drain();
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
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        super(flowable);
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(wc0Var, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
