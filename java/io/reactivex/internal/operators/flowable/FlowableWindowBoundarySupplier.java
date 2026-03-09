package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    public final int capacityHint;
    public final Callable<? extends vc0<B>> other;

    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {
        public boolean done;
        public final WindowBoundaryMainSubscriber<T, B> parent;

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(B b) {
            if (this.done) {
                return;
            }
            this.done = true;
            dispose();
            this.parent.innerNext(this);
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, xc0, Runnable {
        public static final WindowBoundaryInnerSubscriber<Object, Object> BOUNDARY_DISPOSED = new WindowBoundaryInnerSubscriber<>(null);
        public static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        public final int capacityHint;
        public volatile boolean done;
        public final wc0<? super Flowable<T>> downstream;
        public long emitted;
        public final Callable<? extends vc0<B>> other;
        public xc0 upstream;
        public UnicastProcessor<T> window;
        public final AtomicReference<WindowBoundaryInnerSubscriber<T, B>> boundarySubscriber = new AtomicReference<>();
        public final AtomicInteger windows = new AtomicInteger(1);
        public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicBoolean stopWindows = new AtomicBoolean();
        public final AtomicLong requested = new AtomicLong();

        public WindowBoundaryMainSubscriber(wc0<? super Flowable<T>> wc0Var, int i, Callable<? extends vc0<B>> callable) {
            this.downstream = wc0Var;
            this.capacityHint = i;
            this.other = callable;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public void disposeBoundary() {
            AtomicReference<WindowBoundaryInnerSubscriber<T, B>> atomicReference = this.boundarySubscriber;
            WindowBoundaryInnerSubscriber<Object, Object> windowBoundaryInnerSubscriber = BOUNDARY_DISPOSED;
            WindowBoundaryInnerSubscriber<T, B> andSet = atomicReference.getAndSet((WindowBoundaryInnerSubscriber<T, B>) windowBoundaryInnerSubscriber);
            if (andSet == null || andSet == windowBoundaryInnerSubscriber) {
                return;
            }
            andSet.dispose();
        }

        public void drain() {
            MissingBackpressureException th;
            if (getAndIncrement() != 0) {
                return;
            }
            wc0<? super Flowable<T>> wc0Var = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            long j = this.emitted;
            int iAddAndGet = 1;
            while (this.windows.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.window;
                boolean z = this.done;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onError(thTerminate);
                    }
                    wc0Var.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z3 = objPoll == null;
                if (z && z3) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        wc0Var.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onError(thTerminate2);
                    }
                    wc0Var.onError(thTerminate2);
                    return;
                }
                if (z3) {
                    this.emitted = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != NEXT_WINDOW) {
                    unicastProcessor.onNext((T) objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        if (j != this.requested.get()) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.capacityHint, this);
                            this.window = unicastProcessorCreate;
                            this.windows.getAndIncrement();
                            try {
                                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null Publisher");
                                WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber = new WindowBoundaryInnerSubscriber<>(this);
                                if (this.boundarySubscriber.compareAndSet(null, windowBoundaryInnerSubscriber)) {
                                    vc0Var.subscribe(windowBoundaryInnerSubscriber);
                                    j++;
                                    wc0Var.onNext(unicastProcessorCreate);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Exceptions.throwIfFatal(th);
                                atomicThrowable.addThrowable(th);
                                this.done = true;
                            }
                        } else {
                            this.upstream.cancel();
                            disposeBoundary();
                            th = new MissingBackpressureException("Could not deliver a window due to lack of requests");
                        }
                        atomicThrowable.addThrowable(th);
                        this.done = true;
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }

        public void innerComplete() {
            this.upstream.cancel();
            this.done = true;
            drain();
        }

        public void innerError(Throwable th) {
            this.upstream.cancel();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext(WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber) {
            this.boundarySubscriber.compareAndSet(windowBoundaryInnerSubscriber, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            disposeBoundary();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            BackpressureHelper.add(this.requested, j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public FlowableWindowBoundarySupplier(Flowable<T> flowable, Callable<? extends vc0<B>> callable, int i) {
        super(flowable);
        this.other = callable;
        this.capacityHint = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Flowable<T>> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new WindowBoundaryMainSubscriber(wc0Var, this.capacityHint, this.other));
    }
}
