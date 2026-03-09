package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {
    public final Function<? super Open, ? extends vc0<? extends Close>> bufferClose;
    public final vc0<? extends Open> bufferOpen;
    public final Callable<U> bufferSupplier;

    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -8466418554264089604L;
        public final Function<? super Open, ? extends vc0<? extends Close>> bufferClose;
        public final vc0<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final wc0<? super C> downstream;
        public long emitted;
        public long index;
        public final SpscLinkedArrayQueue<C> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        public final CompositeDisposable subscribers = new CompositeDisposable();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public Map<Long, C> buffers = new LinkedHashMap();
        public final AtomicThrowable errors = new AtomicThrowable();

        public static final class BufferOpenSubscriber<Open> extends AtomicReference<xc0> implements FlowableSubscriber<Open>, Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            public final BufferBoundarySubscriber<?, ?, Open, ?> parent;

            public BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.parent = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get() == SubscriptionHelper.CANCELLED;
            }

            @Override // p285z2.wc0
            public void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.openComplete(this);
            }

            @Override // p285z2.wc0
            public void onError(Throwable th) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.boundaryError(this, th);
            }

            @Override // p285z2.wc0
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
            public void onSubscribe(xc0 xc0Var) {
                SubscriptionHelper.setOnce(this, xc0Var, Long.MAX_VALUE);
            }
        }

        public BufferBoundarySubscriber(wc0<? super C> wc0Var, vc0<? extends Open> vc0Var, Function<? super Open, ? extends vc0<? extends Close>> function, Callable<C> callable) {
            this.downstream = wc0Var;
            this.bufferSupplier = callable;
            this.bufferOpen = vc0Var;
            this.bufferClose = function;
        }

        public void boundaryError(Disposable disposable, Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.subscribers.delete(disposable);
            onError(th);
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (SubscriptionHelper.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        public void close(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j) {
            boolean z;
            this.subscribers.delete(bufferCloseSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                this.queue.offer(map.remove(Long.valueOf(j)));
                if (z) {
                    this.done = true;
                }
                drain();
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j = this.emitted;
            wc0<? super C> wc0Var = this.downstream;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            loop0: do {
                long j2 = this.requested.get();
                while (j != j2) {
                    if (!this.cancelled) {
                        boolean z = this.done;
                        if (z && this.errors.get() != null) {
                            break loop0;
                        }
                        C cPoll = spscLinkedArrayQueue.poll();
                        boolean z3 = cPoll == null;
                        if (z && z3) {
                            wc0Var.onComplete();
                            return;
                        } else {
                            if (z3) {
                                break;
                            }
                            wc0Var.onNext(cPoll);
                            j++;
                        }
                    } else {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                }
                if (j == j2) {
                    if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        if (this.errors.get() != null) {
                            spscLinkedArrayQueue.clear();
                            wc0Var.onError(this.errors.terminate());
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            wc0Var.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.queue.offer(it.next());
                }
                this.buffers = null;
                this.done = true;
                drain();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.setOnce(this.upstream, xc0Var)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.subscribers.add(bufferOpenSubscriber);
                this.bufferOpen.subscribe(bufferOpenSubscriber);
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        public void open(Open open) {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.bufferClose.apply(open), "The bufferClose returned a null Publisher");
                long j = this.index;
                this.index = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j), (C) collection);
                    BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(this, j);
                    this.subscribers.add(bufferCloseSubscriber);
                    vc0Var.subscribe(bufferCloseSubscriber);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                SubscriptionHelper.cancel(this.upstream);
                onError(th);
            }
        }

        public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.subscribers.delete(bufferOpenSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }
    }

    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<xc0> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final BufferBoundarySubscriber<T, C, ?, ?> parent;

        public BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j) {
            this.parent = bufferBoundarySubscriber;
            this.index = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            xc0 xc0Var = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            xc0 xc0Var = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var == subscriptionHelper) {
                RxJavaPlugins.onError(th);
            } else {
                lazySet(subscriptionHelper);
                this.parent.boundaryError(this, th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
            xc0 xc0Var = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var != subscriptionHelper) {
                lazySet(subscriptionHelper);
                xc0Var.cancel();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.setOnce(this, xc0Var, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary(Flowable<T> flowable, vc0<? extends Open> vc0Var, Function<? super Open, ? extends vc0<? extends Close>> function, Callable<U> callable) {
        super(flowable);
        this.bufferOpen = vc0Var;
        this.bufferClose = function;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(wc0Var, this.bufferOpen, this.bufferClose, this.bufferSupplier);
        wc0Var.onSubscribe(bufferBoundarySubscriber);
        this.source.subscribe((FlowableSubscriber) bufferBoundarySubscriber);
    }
}
