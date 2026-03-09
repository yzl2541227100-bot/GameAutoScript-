package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    public final int parallelism;
    public final int prefetch;
    public final vc0<? extends T> source;

    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final long[] emissions;
        public Throwable error;
        public int index;
        public final int limit;
        public final int prefetch;
        public int produced;
        public SimpleQueue<T> queue;
        public final AtomicLongArray requests;
        public int sourceMode;
        public final AtomicInteger subscriberCount = new AtomicInteger();
        public final wc0<? super T>[] subscribers;
        public xc0 upstream;

        public final class RailSubscription implements xc0 {

            /* JADX INFO: renamed from: j */
            public final int f19486j;

            /* JADX INFO: renamed from: m */
            public final int f19487m;

            public RailSubscription(int i, int i2) {
                this.f19486j = i;
                this.f19487m = i2;
            }

            @Override // p285z2.xc0
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f19486j + this.f19487m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i = this.f19487m;
                    parallelDispatcher.cancel(i + i);
                }
            }

            @Override // p285z2.xc0
            public void request(long j) {
                long j2;
                if (SubscriptionHelper.validate(j)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j2 = atomicLongArray.get(this.f19486j);
                        if (j2 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f19486j, j2, BackpressureHelper.addCap(j2, j)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f19487m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        public ParallelDispatcher(wc0<? super T>[] wc0VarArr, int i) {
            this.subscribers = wc0VarArr;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            int length = wc0VarArr.length;
            int i2 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i2, length);
            this.emissions = new long[length];
        }

        public void cancel(int i) {
            if (this.requests.decrementAndGet(i) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }

        public void drainAsync() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.queue;
            wc0<? super T>[] wc0VarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i = this.index;
            int i2 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (z && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = wc0VarArr.length;
                        while (i3 < length2) {
                            wc0VarArr[i3].onError(th);
                            i3++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z && zIsEmpty) {
                        int length3 = wc0VarArr.length;
                        while (i3 < length3) {
                            wc0VarArr[i3].onComplete();
                            i3++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j = atomicLongArray.get(i);
                        long j2 = jArr[i];
                        if (j == j2 || atomicLongArray.get(length + i) != 0) {
                            i4++;
                        } else {
                            try {
                                T tPoll = simpleQueue.poll();
                                if (tPoll != null) {
                                    wc0VarArr[i].onNext(tPoll);
                                    jArr[i] = j2 + 1;
                                    i2++;
                                    if (i2 == this.limit) {
                                        this.upstream.request(i2);
                                        i2 = 0;
                                    }
                                    i4 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = wc0VarArr.length;
                                while (i3 < length4) {
                                    wc0VarArr[i3].onError(th2);
                                    i3++;
                                }
                                return;
                            }
                        }
                        i++;
                        if (i == length) {
                            i = 0;
                        }
                        if (i4 == length) {
                        }
                    }
                    int i5 = get();
                    if (i5 == iAddAndGet) {
                        this.index = i;
                        this.produced = i2;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i5;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            wc0<? super T>[] wc0VarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i = this.index;
            int iAddAndGet = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = wc0VarArr.length;
                        while (i2 < length2) {
                            wc0VarArr[i2].onComplete();
                            i2++;
                        }
                        return;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i3++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = wc0VarArr.length;
                                while (i2 < length3) {
                                    wc0VarArr[i2].onComplete();
                                    i2++;
                                }
                                return;
                            }
                            wc0VarArr[i].onNext(tPoll);
                            jArr[i] = j2 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = wc0VarArr.length;
                            while (i2 < length4) {
                                wc0VarArr[i2].onError(th);
                                i2++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                    }
                    if (i3 == length) {
                        int i4 = get();
                        if (i4 == iAddAndGet) {
                            this.index = i;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i4;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
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
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (xc0Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        xc0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                xc0Var.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            wc0<? super T>[] wc0VarArr = this.subscribers;
            int length = wc0VarArr.length;
            int i = 0;
            while (i < length && !this.cancelled) {
                int i2 = i + 1;
                this.subscriberCount.lazySet(i2);
                wc0VarArr[i].onSubscribe(new RailSubscription(i, length));
                i = i2;
            }
        }
    }

    public ParallelFromPublisher(vc0<? extends T> vc0Var, int i, int i2) {
        this.source = vc0Var;
        this.parallelism = i;
        this.prefetch = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(wc0<? super T>[] wc0VarArr) {
        if (validate(wc0VarArr)) {
            this.source.subscribe(new ParallelDispatcher(wc0VarArr, this.prefetch));
        }
    }
}
