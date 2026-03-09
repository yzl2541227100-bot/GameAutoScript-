package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean delayError;
    public final int prefetch;
    public final Scheduler scheduler;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public boolean outputFused;
        public final int prefetch;
        public long produced;
        public SimpleQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public int sourceMode;
        public xc0 upstream;
        public final Scheduler.Worker worker;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, boolean z, int i) {
            this.worker = worker;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
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

        public final boolean checkTerminated(boolean z, boolean z3, wc0<?> wc0Var) {
            Throwable th;
            if (this.cancelled) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (!this.delayError) {
                th = this.error;
                if (th != null) {
                    this.cancelled = true;
                    clear();
                    wc0Var.onError(th);
                } else {
                    if (!z3) {
                        return false;
                    }
                    this.cancelled = true;
                    wc0Var.onComplete();
                }
            } else {
                if (!z3) {
                    return false;
                }
                this.cancelled = true;
                th = this.error;
                if (th != null) {
                    wc0Var.onError(th);
                } else {
                    wc0Var.onComplete();
                }
            }
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // p285z2.wc0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            trySchedule();
        }

        @Override // p285z2.wc0
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        @Override // p285z2.wc0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                trySchedule();
                return;
            }
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            trySchedule();
        }

        @Override // p285z2.xc0
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                trySchedule();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public long consumed;
        public final ConditionalSubscriber<? super T> downstream;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (xc0Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        xc0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                xc0Var.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j = this.consumed + 1;
                if (j == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j);
                } else {
                    this.consumed = j;
                }
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z3 = tPoll == null;
                        if (checkTerminated(z, z3, conditionalSubscriber)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.limit) {
                            this.upstream.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == j3 && checkTerminated(this.done, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j;
                    this.consumed = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r10.cancelled = true;
            r0.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        
            if (r10.cancelled == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        
            if (r1.isEmpty() == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            r6 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        
            if (r5 != r6) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        
            r10.produced = r2;
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        
            if (r5 != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        
            r5 = r6;
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void runSync() {
            /*
                r10 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r10.downstream
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r10.queue
                long r2 = r10.produced
                r4 = 1
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r10.requested
                long r6 = r6.get()
            Le:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L41
                java.lang.Object r8 = r1.poll()     // Catch: java.lang.Throwable -> L32
                boolean r9 = r10.cancelled
                if (r9 == 0) goto L1b
                return
            L1b:
                if (r8 != 0) goto L28
            L1d:
                r10.cancelled = r4
                r0.onComplete()
            L22:
                io.reactivex.Scheduler$Worker r0 = r10.worker
                r0.dispose()
                return
            L28:
                boolean r8 = r0.tryOnNext(r8)
                if (r8 == 0) goto Le
                r8 = 1
                long r2 = r2 + r8
                goto Le
            L32:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r10.cancelled = r4
                z2.xc0 r2 = r10.upstream
                r2.cancel()
                r0.onError(r1)
                goto L22
            L41:
                boolean r6 = r10.cancelled
                if (r6 == 0) goto L46
                return
            L46:
                boolean r6 = r1.isEmpty()
                if (r6 == 0) goto L4d
                goto L1d
            L4d:
                int r6 = r10.get()
                if (r5 != r6) goto L5d
                r10.produced = r2
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L8
                return
            L5d:
                r5 = r6
                goto L8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableObserveOn.ObserveOnConditionalSubscriber.runSync():void");
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final wc0<? super T> downstream;

        public ObserveOnSubscriber(wc0<? super T> wc0Var, Scheduler.Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.downstream = wc0Var;
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (xc0Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        xc0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                xc0Var.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j);
                } else {
                    this.produced = j;
                }
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            wc0<? super T> wc0Var = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.requested.get();
                while (j != jAddAndGet) {
                    boolean z = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z3 = tPoll == null;
                        if (checkTerminated(z, z3, wc0Var)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        wc0Var.onNext(tPoll);
                        j++;
                        if (j == this.limit) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.requested.addAndGet(-j);
                            }
                            this.upstream.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        wc0Var.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && checkTerminated(this.done, simpleQueue.isEmpty(), wc0Var)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r10.cancelled = true;
            r0.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        
            if (r10.cancelled == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            if (r1.isEmpty() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        
            r6 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        
            if (r5 != r6) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        
            r10.produced = r2;
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            if (r5 != 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        
            r5 = r6;
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void runSync() {
            /*
                r10 = this;
                z2.wc0<? super T> r0 = r10.downstream
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r10.queue
                long r2 = r10.produced
                r4 = 1
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r10.requested
                long r6 = r6.get()
            Le:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L3e
                java.lang.Object r8 = r1.poll()     // Catch: java.lang.Throwable -> L2f
                boolean r9 = r10.cancelled
                if (r9 == 0) goto L1b
                return
            L1b:
                if (r8 != 0) goto L28
            L1d:
                r10.cancelled = r4
                r0.onComplete()
            L22:
                io.reactivex.Scheduler$Worker r0 = r10.worker
                r0.dispose()
                return
            L28:
                r0.onNext(r8)
                r8 = 1
                long r2 = r2 + r8
                goto Le
            L2f:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r10.cancelled = r4
                z2.xc0 r2 = r10.upstream
                r2.cancel()
                r0.onError(r1)
                goto L22
            L3e:
                boolean r6 = r10.cancelled
                if (r6 == 0) goto L43
                return
            L43:
                boolean r6 = r1.isEmpty()
                if (r6 == 0) goto L4a
                goto L1d
            L4a:
                int r6 = r10.get()
                if (r5 != r6) goto L5a
                r10.produced = r2
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L8
                return
            L5a:
                r5 = r6
                goto L8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableObserveOn.ObserveOnSubscriber.runSync():void");
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z, int i) {
        super(flowable);
        this.scheduler = scheduler;
        this.delayError = z;
        this.prefetch = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        Flowable<T> flowable;
        FlowableSubscriber<? super T> observeOnSubscriber;
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (wc0Var instanceof ConditionalSubscriber) {
            flowable = this.source;
            observeOnSubscriber = new ObserveOnConditionalSubscriber<>((ConditionalSubscriber) wc0Var, workerCreateWorker, this.delayError, this.prefetch);
        } else {
            flowable = this.source;
            observeOnSubscriber = new ObserveOnSubscriber<>(wc0Var, workerCreateWorker, this.delayError, this.prefetch);
        }
        flowable.subscribe((FlowableSubscriber) observeOnSubscriber);
    }
}
