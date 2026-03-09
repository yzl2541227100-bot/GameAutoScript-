package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    public final int bufferSize;
    public final Function<? super B, ? extends vc0<V>> close;
    public final vc0<B> open;

    public static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {
        public boolean done;
        public final WindowBoundaryMainSubscriber<T, ?, V> parent;

        /* JADX INFO: renamed from: w */
        public final UnicastProcessor<T> f19455w;

        public OperatorWindowBoundaryCloseSubscriber(WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, UnicastProcessor<T> unicastProcessor) {
            this.parent = windowBoundaryMainSubscriber;
            this.f19455w = unicastProcessor;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.close(this);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.error(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(V v) {
            cancel();
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {
        public final WindowBoundaryMainSubscriber<T, B, ?> parent;

        public OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.parent.error(th);
        }

        @Override // p285z2.wc0
        public void onNext(B b) {
            this.parent.open(b);
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements xc0 {
        public final AtomicReference<Disposable> boundary;
        public final int bufferSize;
        public final Function<? super B, ? extends vc0<V>> close;
        public final vc0<B> open;
        public final CompositeDisposable resources;
        public xc0 upstream;
        public final AtomicLong windows;

        /* JADX INFO: renamed from: ws */
        public final List<UnicastProcessor<T>> f19456ws;

        public WindowBoundaryMainSubscriber(wc0<? super Flowable<T>> wc0Var, vc0<B> vc0Var, Function<? super B, ? extends vc0<V>> function, int i) {
            super(wc0Var, new MpscLinkedQueue());
            this.boundary = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.windows = atomicLong;
            this.open = vc0Var;
            this.close = function;
            this.bufferSize = i;
            this.resources = new CompositeDisposable();
            this.f19456ws = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(wc0<? super Flowable<T>> wc0Var, Object obj) {
            return false;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void close(OperatorWindowBoundaryCloseSubscriber<T, V> operatorWindowBoundaryCloseSubscriber) {
            this.resources.delete(operatorWindowBoundaryCloseSubscriber);
            this.queue.offer((U) new WindowOperation(operatorWindowBoundaryCloseSubscriber.f19455w, null));
            if (enter()) {
                drainLoop();
            }
        }

        public void dispose() {
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            MissingBackpressureException th;
            SimpleQueue simpleQueue = this.queue;
            wc0<? super V> wc0Var = this.downstream;
            List<UnicastProcessor<T>> list = this.f19456ws;
            int iLeave = 1;
            while (true) {
                boolean z = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z3 = objPoll == null;
                if (z && z3) {
                    dispose();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z3) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) objPoll;
                    UnicastProcessor<T> unicastProcessor = windowOperation.f19457w;
                    if (unicastProcessor != null) {
                        if (list.remove(unicastProcessor)) {
                            windowOperation.f19457w.onComplete();
                            if (this.windows.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.cancelled) {
                        UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                        long jRequested = requested();
                        if (jRequested != 0) {
                            list.add(unicastProcessorCreate);
                            wc0Var.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The publisher supplied is null");
                                OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new OperatorWindowBoundaryCloseSubscriber(this, unicastProcessorCreate);
                                if (this.resources.add(operatorWindowBoundaryCloseSubscriber)) {
                                    this.windows.getAndIncrement();
                                    vc0Var.subscribe(operatorWindowBoundaryCloseSubscriber);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                this.cancelled = true;
                                wc0Var.onError(th);
                            }
                        } else {
                            this.cancelled = true;
                            th = new MissingBackpressureException("Could not deliver new window due to lack of requests");
                        }
                        wc0Var.onError(th);
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it = this.f19456ws.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                if (this.boundary.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                    this.windows.getAndIncrement();
                    xc0Var.request(Long.MAX_VALUE);
                    this.open.subscribe(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void open(B b) {
            this.queue.offer((U) new WindowOperation(null, b));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }
    }

    public static final class WindowOperation<T, B> {
        public final B open;

        /* JADX INFO: renamed from: w */
        public final UnicastProcessor<T> f19457w;

        public WindowOperation(UnicastProcessor<T> unicastProcessor, B b) {
            this.f19457w = unicastProcessor;
            this.open = b;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, vc0<B> vc0Var, Function<? super B, ? extends vc0<V>> function, int i) {
        super(flowable);
        this.open = vc0Var;
        this.close = function;
        this.bufferSize = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Flowable<T>> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new WindowBoundaryMainSubscriber(new SerializedSubscriber(wc0Var), this.open, this.close, this.bufferSize));
    }
}
