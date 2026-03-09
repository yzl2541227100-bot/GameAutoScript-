package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final boolean delayErrors;
    public final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    public final int maxConcurrency;

    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = 8600231336733376951L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final wc0<? super R> downstream;
        public final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        public final int maxConcurrency;
        public xc0 upstream;
        public final AtomicLong requested = new AtomicLong();
        public final CompositeDisposable set = new CompositeDisposable();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicInteger active = new AtomicInteger(1);
        public final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                FlatMapSingleSubscriber.this.innerError(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                FlatMapSingleSubscriber.this.innerSuccess(this, r);
            }
        }

        public FlatMapSingleSubscriber(wc0<? super R> wc0Var, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
            this.downstream = wc0Var;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        public void clear() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r2 = r17.errors.terminate();
            clear();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        
            if (r10 != r6) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        
            if (r17.cancelled == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
        
            clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        
            if (r17.delayErrors != false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        
            if (r17.errors.get() == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
        
            if (r2.get() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
        
            if (r7 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
        
            if (r7.isEmpty() == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a8, code lost:
        
            if (r6 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00aa, code lost:
        
            if (r12 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ac, code lost:
        
            r2 = r17.errors.terminate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
        
            if (r2 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
        
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00bb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00be, code lost:
        
            if (r10 == 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00c0, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.produced(r17.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
        
            if (r17.maxConcurrency == Integer.MAX_VALUE) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00cc, code lost:
        
            r17.upstream.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
        
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainLoop() {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.drainLoop():void");
        }

        public SpscLinkedArrayQueue<R> getOrCreateQueue() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.queue.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            } while (!this.queue.compareAndSet(null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        public void innerError(FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber<T, R>.InnerObserver r6, R r7) {
            /*
                r5 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r5.set
                r0.delete(r6)
                int r6 = r5.get()
                if (r6 != 0) goto L7a
                r6 = 0
                r0 = 1
                boolean r1 = r5.compareAndSet(r6, r0)
                if (r1 == 0) goto L7a
                java.util.concurrent.atomic.AtomicInteger r1 = r5.active
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r6 = 1
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                long r0 = r0.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L67
                z2.wc0<? super R> r0 = r5.downstream
                r0.onNext(r7)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r7 = r5.queue
                java.lang.Object r7 = r7.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r7 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r7
                if (r6 == 0) goto L53
                if (r7 == 0) goto L3f
                boolean r6 = r7.isEmpty()
                if (r6 == 0) goto L53
            L3f:
                io.reactivex.internal.util.AtomicThrowable r6 = r5.errors
                java.lang.Throwable r6 = r6.terminate()
                if (r6 == 0) goto L4d
                z2.wc0<? super R> r7 = r5.downstream
                r7.onError(r6)
                goto L52
            L4d:
                z2.wc0<? super R> r6 = r5.downstream
                r6.onComplete()
            L52:
                return
            L53:
                java.util.concurrent.atomic.AtomicLong r6 = r5.requested
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r6, r0)
                int r6 = r5.maxConcurrency
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r7) goto L70
                z2.xc0 r6 = r5.upstream
                r6.request(r0)
                goto L70
            L67:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r6 = r5.getOrCreateQueue()
                monitor-enter(r6)
                r6.offer(r7)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L77
            L70:
                int r6 = r5.decrementAndGet()
                if (r6 != 0) goto L8f
                return
            L77:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L77
                throw r7
            L7a:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r6 = r5.getOrCreateQueue()
                monitor-enter(r6)
                r6.offer(r7)     // Catch: java.lang.Throwable -> L93
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L93
                java.util.concurrent.atomic.AtomicInteger r6 = r5.active
                r6.decrementAndGet()
                int r6 = r5.getAndIncrement()
                if (r6 == 0) goto L8f
                return
            L8f:
                r5.drainLoop()
                return
            L93:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L93
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber$InnerObserver, java.lang.Object):void");
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.add(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                xc0Var.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
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

    public FlowableFlatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new FlatMapSingleSubscriber(wc0Var, this.mapper, this.delayErrors, this.maxConcurrency));
    }
}
