package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    public final int prefetch;
    public final Flowable<T> source;

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final wc0<? super R> downstream;
        public long emitted;
        public final ErrorMode errorMode;
        public R item;
        public final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        public final int prefetch;
        public final SimplePlainQueue<T> queue;
        public volatile int state;
        public xc0 upstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final ConcatMapSingleSubscriber<?, R> parent;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.parent = concatMapSingleSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.parent.innerSuccess(r);
            }
        }

        public ConcatMapSingleSubscriber(wc0<? super R> wc0Var, Function<? super T, ? extends SingleSource<? extends R>> function, int i, ErrorMode errorMode) {
            this.downstream = wc0Var;
            this.mapper = function;
            this.prefetch = i;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i);
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            r2.clear();
            r15.item = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                z2.wc0<? super R> r0 = r15.downstream
                io.reactivex.internal.util.ErrorMode r1 = r15.errorMode
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r2 = r15.queue
                io.reactivex.internal.util.AtomicThrowable r3 = r15.errors
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                int r5 = r15.prefetch
                int r6 = r5 >> 1
                int r5 = r5 - r6
                r6 = 1
                r7 = 1
            L18:
                boolean r8 = r15.cancelled
                r9 = 0
                if (r8 == 0) goto L24
                r2.clear()
                r15.item = r9
                goto Lb9
            L24:
                int r8 = r15.state
                java.lang.Object r10 = r3.get()
                if (r10 == 0) goto L43
                io.reactivex.internal.util.ErrorMode r10 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r1 == r10) goto L36
                io.reactivex.internal.util.ErrorMode r10 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r1 != r10) goto L43
                if (r8 != 0) goto L43
            L36:
                r2.clear()
                r15.item = r9
            L3b:
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L43:
                r10 = 0
                if (r8 != 0) goto L9c
                boolean r8 = r15.done
                java.lang.Object r9 = r2.poll()
                if (r9 != 0) goto L50
                r11 = 1
                goto L51
            L50:
                r11 = 0
            L51:
                if (r8 == 0) goto L63
                if (r11 == 0) goto L63
                java.lang.Throwable r1 = r3.terminate()
                if (r1 != 0) goto L5f
                r0.onComplete()
                goto L62
            L5f:
                r0.onError(r1)
            L62:
                return
            L63:
                if (r11 == 0) goto L66
                goto Lb9
            L66:
                int r8 = r15.consumed
                int r8 = r8 + r6
                if (r8 != r5) goto L74
                r15.consumed = r10
                z2.xc0 r8 = r15.upstream
                long r10 = (long) r5
                r8.request(r10)
                goto L76
            L74:
                r15.consumed = r8
            L76:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r8 = r15.mapper     // Catch: java.lang.Throwable -> L8c
                java.lang.Object r8 = r8.apply(r9)     // Catch: java.lang.Throwable -> L8c
                java.lang.String r9 = "The mapper returned a null SingleSource"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r9)     // Catch: java.lang.Throwable -> L8c
                io.reactivex.SingleSource r8 = (io.reactivex.SingleSource) r8     // Catch: java.lang.Throwable -> L8c
                r15.state = r6
                io.reactivex.internal.operators.mixed.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver<R> r9 = r15.inner
                r8.subscribe(r9)
                goto Lb9
            L8c:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                z2.xc0 r4 = r15.upstream
                r4.cancel()
                r2.clear()
                r3.addThrowable(r1)
                goto L3b
            L9c:
                r11 = 2
                if (r8 != r11) goto Lb9
                long r11 = r15.emitted
                long r13 = r4.get()
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 == 0) goto Lb9
                R r8 = r15.item
                r15.item = r9
                r0.onNext(r8)
                r8 = 1
                long r11 = r11 + r8
                r15.emitted = r11
                r15.state = r10
                goto L18
            Lb9:
                int r7 = -r7
                int r7 = r15.addAndGet(r7)
                if (r7 != 0) goto L18
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber.drain():void");
        }

        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r) {
            this.item = r;
            this.state = 2;
            drain();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.queue.offer(t)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(this.prefetch);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapSingleSubscriber(wc0Var, this.mapper, this.prefetch, this.errorMode));
    }
}
