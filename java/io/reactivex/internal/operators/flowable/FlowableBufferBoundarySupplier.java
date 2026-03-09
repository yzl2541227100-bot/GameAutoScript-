package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    public final Callable<? extends vc0<B>> boundarySupplier;
    public final Callable<U> bufferSupplier;

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        public boolean once;
        public final BufferBoundarySupplierSubscriber<T, U, B> parent;

        public BufferBoundarySubscriber(BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber) {
            this.parent = bufferBoundarySupplierSubscriber;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.once) {
                return;
            }
            this.once = true;
            this.parent.next();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.once) {
                RxJavaPlugins.onError(th);
            } else {
                this.once = true;
                this.parent.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(B b) {
            if (this.once) {
                return;
            }
            this.once = true;
            cancel();
            this.parent.next();
        }
    }

    public static final class BufferBoundarySupplierSubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, xc0, Disposable {
        public final Callable<? extends vc0<B>> boundarySupplier;
        public U buffer;
        public final Callable<U> bufferSupplier;
        public final AtomicReference<Disposable> other;
        public xc0 upstream;

        public BufferBoundarySupplierSubscriber(wc0<? super U> wc0Var, Callable<U> callable, Callable<? extends vc0<B>> callable2) {
            super(wc0Var, new MpscLinkedQueue());
            this.other = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.boundarySupplier = callable2;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(wc0 wc0Var, Object obj) {
            return accept((wc0<? super Collection>) wc0Var, (Collection) obj);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(wc0<? super U> wc0Var, U u) {
            this.downstream.onNext((Object) u);
            return true;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeOther();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            disposeOther();
        }

        public void disposeOther() {
            DisposableHelper.dispose(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }

        public void next() {
            try {
                U u = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                try {
                    vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    if (DisposableHelper.replace(this.other, bufferBoundarySubscriber)) {
                        synchronized (this) {
                            U u2 = this.buffer;
                            if (u2 == null) {
                                return;
                            }
                            this.buffer = u;
                            vc0Var.subscribe(bufferBoundarySubscriber);
                            fastPathEmitMax(u2, false, this);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    this.upstream.cancel();
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                th = th2;
                Exceptions.throwIfFatal(th);
                cancel();
            }
        }

        @Override // p285z2.wc0
        public void onComplete() {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                this.buffer = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            cancel();
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                wc0<? super V> wc0Var = this.downstream;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    this.other.set(bufferBoundarySubscriber);
                    wc0Var.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    xc0Var.request(Long.MAX_VALUE);
                    vc0Var.subscribe(bufferBoundarySubscriber);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    xc0Var.cancel();
                    EmptySubscription.error(th, wc0Var);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }
    }

    public FlowableBufferBoundarySupplier(Flowable<T> flowable, Callable<? extends vc0<B>> callable, Callable<U> callable2) {
        super(flowable);
        this.boundarySupplier = callable;
        this.bufferSupplier = callable2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new BufferBoundarySupplierSubscriber(new SerializedSubscriber(wc0Var), this.bufferSupplier, this.boundarySupplier));
    }
}
