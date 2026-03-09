package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    public final vc0<B> boundary;
    public final Callable<U> bufferSupplier;

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        public final BufferExactBoundarySubscriber<T, U, B> parent;

        public BufferBoundarySubscriber(BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.parent = bufferExactBoundarySubscriber;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.parent.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(B b) {
            this.parent.next();
        }
    }

    public static final class BufferExactBoundarySubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, xc0, Disposable {
        public final vc0<B> boundary;
        public U buffer;
        public final Callable<U> bufferSupplier;
        public Disposable other;
        public xc0 upstream;

        public BufferExactBoundarySubscriber(wc0<? super U> wc0Var, Callable<U> callable, vc0<B> vc0Var) {
            super(wc0Var, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundary = vc0Var;
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
            this.other.dispose();
            this.upstream.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void next() {
            try {
                U u = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 == null) {
                        return;
                    }
                    this.buffer = u;
                    fastPathEmitMax(u2, false, this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
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
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    this.other = bufferBoundarySubscriber;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    xc0Var.request(Long.MAX_VALUE);
                    this.boundary.subscribe(bufferBoundarySubscriber);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    xc0Var.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }
    }

    public FlowableBufferExactBoundary(Flowable<T> flowable, vc0<B> vc0Var, Callable<U> callable) {
        super(flowable);
        this.boundary = vc0Var;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new BufferExactBoundarySubscriber(new SerializedSubscriber(wc0Var), this.bufferSupplier, this.boundary));
    }
}
