package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends vc0<? extends R>> mapper;
    public final int prefetch;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 */
    public static /* synthetic */ class C35331 {
        public static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            $SwitchMap$io$reactivex$internal$util$ErrorMode = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$internal$util$ErrorMode[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, xc0 {
        private static final long serialVersionUID = -3511336836796789179L;
        public volatile boolean active;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final int limit;
        public final Function<? super T, ? extends vc0<? extends R>> mapper;
        public final int prefetch;
        public SimpleQueue<T> queue;
        public int sourceMode;
        public xc0 upstream;
        public final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        public final AtomicThrowable errors = new AtomicThrowable();

        public BaseConcatMapSubscriber(Function<? super T, ? extends vc0<? extends R>> function, int i) {
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public abstract void drain();

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // p285z2.wc0
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public final void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public final void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (xc0Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        xc0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                xc0Var.request(this.prefetch);
            }
        }

        public abstract void subscribeActual();
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        public final wc0<? super R> downstream;
        public final boolean veryEnd;

        public ConcatMapDelayed(wc0<? super R> wc0Var, Function<? super T, ? extends vc0<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.downstream = wc0Var;
            this.veryEnd = z;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        if (!z || this.veryEnd || this.errors.get() == null) {
                            try {
                                T tPoll = this.queue.poll();
                                boolean z3 = tPoll == null;
                                if (z && z3) {
                                    Throwable thTerminate = this.errors.terminate();
                                    if (thTerminate != null) {
                                        this.downstream.onError(thTerminate);
                                        return;
                                    } else {
                                        this.downstream.onComplete();
                                        return;
                                    }
                                }
                                if (!z3) {
                                    vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (vc0Var instanceof Callable) {
                                        Object objCall = ((Callable) vc0Var).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (this.inner.isUnbounded()) {
                                            this.downstream.onNext(objCall);
                                        } else {
                                            this.active = true;
                                            ConcatMapInner<R> concatMapInner = this.inner;
                                            concatMapInner.setSubscription(new WeakScalarSubscription(objCall, concatMapInner));
                                        }
                                    } else {
                                        this.active = true;
                                        vc0Var.subscribe(this.inner);
                                    }
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.upstream.cancel();
                                this.errors.addThrowable(th);
                            }
                        }
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.veryEnd) {
                this.upstream.cancel();
                this.done = true;
            }
            this.active = false;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        public final wc0<? super R> downstream;
        public final AtomicInteger wip;

        public ConcatMapImmediate(wc0<? super R> wc0Var, Function<? super T, ? extends vc0<? extends R>> function, int i) {
            super(function, i);
            this.downstream = wc0Var;
            this.wip = new AtomicInteger();
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z3 = tPoll == null;
                            if (z && z3) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z3) {
                                try {
                                    vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (vc0Var instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) vc0Var).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.inner.isUnbounded()) {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.setSubscription(new WeakScalarSubscription(objCall, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.downstream.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.downstream.onError(this.errors.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        vc0Var.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.inner.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        public final ConcatMapSupport<R> parent;
        public long produced;

        public ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.parent.innerComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.parent.innerError(th);
        }

        @Override // p285z2.wc0
        public void onNext(R r) {
            this.produced++;
            this.parent.innerNext(r);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            setSubscription(xc0Var);
        }
    }

    public interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t);
    }

    public static final class WeakScalarSubscription<T> implements xc0 {
        public final wc0<? super T> downstream;
        public boolean once;
        public final T value;

        public WeakScalarSubscription(T t, wc0<? super T> wc0Var) {
            this.value = t;
            this.downstream = wc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (j <= 0 || this.once) {
                return;
            }
            this.once = true;
            wc0<? super T> wc0Var = this.downstream;
            wc0Var.onNext(this.value);
            wc0Var.onComplete();
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends vc0<? extends R>> function, int i, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i;
        this.errorMode = errorMode;
    }

    public static <T, R> wc0<T> subscribe(wc0<? super R> wc0Var, Function<? super T, ? extends vc0<? extends R>> function, int i, ErrorMode errorMode) {
        int i2 = C35331.$SwitchMap$io$reactivex$internal$util$ErrorMode[errorMode.ordinal()];
        return i2 != 1 ? i2 != 2 ? new ConcatMapImmediate(wc0Var, function, i) : new ConcatMapDelayed(wc0Var, function, i, true) : new ConcatMapDelayed(wc0Var, function, i, false);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, wc0Var, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(wc0Var, this.mapper, this.prefetch, this.errorMode));
    }
}
