package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    public final int prefetch;
    public final Scheduler scheduler;
    public final ParallelFlowable<? extends T> source;

    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, xc0, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final SpscArrayQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public xc0 upstream;
        public final Scheduler.Worker worker;

        public BaseRunOnSubscriber(int i, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i;
            this.queue = spscArrayQueue;
            this.limit = i - (i >> 2);
            this.worker = worker;
        }

        @Override // p285z2.xc0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // p285z2.wc0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // p285z2.wc0
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // p285z2.wc0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.queue.offer(t)) {
                schedule();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // p285z2.xc0
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                schedule();
            }
        }

        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        public final wc0<T>[] parents;
        public final wc0<? super T>[] subscribers;

        public MultiWorkerCallback(wc0<? super T>[] wc0VarArr, wc0<T>[] wc0VarArr2) {
            this.subscribers = wc0VarArr;
            this.parents = wc0VarArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i, this.subscribers, this.parents, worker);
        }
    }

    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final ConditionalSubscriber<? super T> downstream;

        public RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(this.prefetch);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:89:0x002f, code lost:
        
            r18.worker.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0034, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0046, code lost:
        
            r3.onComplete();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                int r1 = r0.consumed
                io.reactivex.internal.queue.SpscArrayQueue<T> r2 = r0.queue
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r3 = r0.downstream
                int r4 = r0.limit
                r5 = 1
                r6 = 1
            Lc:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L15:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L62
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r2.clear()
                return
            L21:
                boolean r14 = r0.done
                if (r14 == 0) goto L35
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L35
                r2.clear()
                r3.onError(r15)
            L2f:
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L35:
                java.lang.Object r15 = r2.poll()
                r16 = 0
                if (r15 != 0) goto L40
                r17 = 1
                goto L42
            L40:
                r17 = 0
            L42:
                if (r14 == 0) goto L4a
                if (r17 == 0) goto L4a
            L46:
                r3.onComplete()
                goto L2f
            L4a:
                if (r17 == 0) goto L4d
                goto L62
            L4d:
                boolean r13 = r3.tryOnNext(r15)
                if (r13 == 0) goto L56
                r13 = 1
                long r11 = r11 + r13
            L56:
                int r1 = r1 + 1
                if (r1 != r4) goto L15
                z2.xc0 r13 = r0.upstream
                long r14 = (long) r1
                r13.request(r14)
                r1 = 0
                goto L15
            L62:
                if (r13 != 0) goto L82
                boolean r13 = r0.cancelled
                if (r13 == 0) goto L6c
                r2.clear()
                return
            L6c:
                boolean r13 = r0.done
                if (r13 == 0) goto L82
                java.lang.Throwable r13 = r0.error
                if (r13 == 0) goto L7b
                r2.clear()
                r3.onError(r13)
                goto L2f
            L7b:
                boolean r13 = r2.isEmpty()
                if (r13 == 0) goto L82
                goto L46
            L82:
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 == 0) goto L95
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r13 == 0) goto L95
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r8 = -r11
                r7.addAndGet(r8)
            L95:
                int r7 = r18.get()
                if (r7 != r6) goto La5
                r0.consumed = r1
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto Lc
                return
            La5:
                r6 = r7
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelRunOn.RunOnConditionalSubscriber.run():void");
        }
    }

    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final wc0<? super T> downstream;

        public RunOnSubscriber(wc0<? super T> wc0Var, int i, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i, spscArrayQueue, worker);
            this.downstream = wc0Var;
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(this.prefetch);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x002f, code lost:
        
            r18.worker.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0034, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0046, code lost:
        
            r3.onComplete();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                int r1 = r0.consumed
                io.reactivex.internal.queue.SpscArrayQueue<T> r2 = r0.queue
                z2.wc0<? super T> r3 = r0.downstream
                int r4 = r0.limit
                r5 = 1
                r6 = 1
            Lc:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L15:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L5f
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r2.clear()
                return
            L21:
                boolean r14 = r0.done
                if (r14 == 0) goto L35
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L35
                r2.clear()
                r3.onError(r15)
            L2f:
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L35:
                java.lang.Object r15 = r2.poll()
                r16 = 0
                if (r15 != 0) goto L40
                r17 = 1
                goto L42
            L40:
                r17 = 0
            L42:
                if (r14 == 0) goto L4a
                if (r17 == 0) goto L4a
            L46:
                r3.onComplete()
                goto L2f
            L4a:
                if (r17 == 0) goto L4d
                goto L5f
            L4d:
                r3.onNext(r15)
                r13 = 1
                long r11 = r11 + r13
                int r1 = r1 + 1
                if (r1 != r4) goto L15
                z2.xc0 r13 = r0.upstream
                long r14 = (long) r1
                r13.request(r14)
                r1 = 0
                goto L15
            L5f:
                if (r13 != 0) goto L7f
                boolean r13 = r0.cancelled
                if (r13 == 0) goto L69
                r2.clear()
                return
            L69:
                boolean r13 = r0.done
                if (r13 == 0) goto L7f
                java.lang.Throwable r13 = r0.error
                if (r13 == 0) goto L78
                r2.clear()
                r3.onError(r13)
                goto L2f
            L78:
                boolean r13 = r2.isEmpty()
                if (r13 == 0) goto L7f
                goto L46
            L7f:
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 == 0) goto L92
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r13 == 0) goto L92
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r8 = -r11
                r7.addAndGet(r8)
            L92:
                int r7 = r18.get()
                if (r7 != r6) goto La2
                r0.consumed = r1
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto Lc
                return
            La2:
                r6 = r7
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelRunOn.RunOnSubscriber.run():void");
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i;
    }

    public void createSubscriber(int i, wc0<? super T>[] wc0VarArr, wc0<T>[] wc0VarArr2, Scheduler.Worker worker) {
        wc0<? super T> wc0Var = wc0VarArr[i];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (wc0Var instanceof ConditionalSubscriber) {
            wc0VarArr2[i] = new RunOnConditionalSubscriber((ConditionalSubscriber) wc0Var, this.prefetch, spscArrayQueue, worker);
        } else {
            wc0VarArr2[i] = new RunOnSubscriber(wc0Var, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(wc0<? super T>[] wc0VarArr) {
        if (validate(wc0VarArr)) {
            int length = wc0VarArr.length;
            wc0<T>[] wc0VarArr2 = new wc0[length];
            Object obj = this.scheduler;
            if (obj instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(wc0VarArr, wc0VarArr2));
            } else {
                for (int i = 0; i < length; i++) {
                    createSubscriber(i, wc0VarArr, wc0VarArr2, this.scheduler.createWorker());
                }
            }
            this.source.subscribe(wc0VarArr2);
        }
    }
}
