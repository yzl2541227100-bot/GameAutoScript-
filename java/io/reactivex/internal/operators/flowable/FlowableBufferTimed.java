package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    public final Callable<U> bufferSupplier;
    public final int maxSize;
    public final boolean restartTimerOnMaxSize;
    public final Scheduler scheduler;
    public final long timeskip;
    public final long timespan;
    public final TimeUnit unit;

    public static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements xc0, Runnable, Disposable {
        public U buffer;
        public final Callable<U> bufferSupplier;
        public long consumerIndex;
        public final int maxSize;
        public long producerIndex;
        public final boolean restartTimerOnMaxSize;
        public Disposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public xc0 upstream;

        /* JADX INFO: renamed from: w */
        public final Scheduler.Worker f19430w;

        public BufferExactBoundedSubscriber(wc0<? super U> wc0Var, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(wc0Var, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.maxSize = i;
            this.restartTimerOnMaxSize = z;
            this.f19430w = worker;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(wc0 wc0Var, Object obj) {
            return accept((wc0<? super Collection>) wc0Var, (Collection) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(wc0<? super U> wc0Var, U u) {
            wc0Var.onNext(u);
            return true;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            synchronized (this) {
                this.buffer = null;
            }
            this.upstream.cancel();
            this.f19430w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f19430w.isDisposed();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.buffer;
                this.buffer = null;
            }
            this.queue.offer(u);
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
            }
            this.f19430w.dispose();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.f19430w.dispose();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.maxSize) {
                    return;
                }
                this.buffer = null;
                this.producerIndex++;
                if (this.restartTimerOnMaxSize) {
                    this.timer.dispose();
                }
                fastPathOrderedEmitMax(u, false, this);
                try {
                    U u2 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    synchronized (this) {
                        this.buffer = u2;
                        this.consumerIndex++;
                    }
                    if (this.restartTimerOnMaxSize) {
                        Scheduler.Worker worker = this.f19430w;
                        long j = this.timespan;
                        this.timer = worker.schedulePeriodically(this, j, j, this.unit);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f19430w;
                    long j = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j, j, this.unit);
                    xc0Var.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f19430w.dispose();
                    xc0Var.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u;
                        fastPathOrderedEmitMax(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    public static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements xc0, Runnable, Disposable {
        public U buffer;
        public final Callable<U> bufferSupplier;
        public final Scheduler scheduler;
        public final AtomicReference<Disposable> timer;
        public final long timespan;
        public final TimeUnit unit;
        public xc0 upstream;

        public BufferExactUnboundedSubscriber(wc0<? super U> wc0Var, Callable<U> callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(wc0Var, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
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
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                U u = this.buffer;
                if (u == null) {
                    return;
                }
                this.buffer = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                }
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    xc0Var.request(Long.MAX_VALUE);
                    Scheduler scheduler = this.scheduler;
                    long j = this.timespan;
                    Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.unit);
                    if (this.timer.compareAndSet(null, disposableSchedulePeriodicallyDirect)) {
                        return;
                    }
                    disposableSchedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
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
    }

    public static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements xc0, Runnable {
        public final Callable<U> bufferSupplier;
        public final List<U> buffers;
        public final long timeskip;
        public final long timespan;
        public final TimeUnit unit;
        public xc0 upstream;

        /* JADX INFO: renamed from: w */
        public final Scheduler.Worker f19431w;

        /* JADX WARN: Field signature parse error: buffer
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:161)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:37)
         */
        public final class RemoveFromBuffer implements Runnable {
            private final Collection buffer;

            /* JADX WARN: Failed to parse method signature: (TU)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TU)V at position 2 ('U'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:336)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
             */
            public RemoveFromBuffer(Collection collection) {
                this.buffer = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.fastPathOrderedEmitMax(this.buffer, false, bufferSkipBoundedSubscriber.f19431w);
            }
        }

        public BufferSkipBoundedSubscriber(wc0<? super U> wc0Var, Callable<U> callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(wc0Var, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.f19431w = worker;
            this.buffers = new LinkedList();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public /* bridge */ /* synthetic */ boolean accept(wc0 wc0Var, Object obj) {
            return accept((wc0<? super Collection>) wc0Var, (Collection) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(wc0<? super U> wc0Var, U u) {
            wc0Var.onNext(u);
            return true;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.f19431w.dispose();
            clear();
        }

        public void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.buffers);
                this.buffers.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((U) ((Collection) it.next()));
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f19431w, this);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.done = true;
            this.f19431w.dispose();
            clear();
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            synchronized (this) {
                Iterator<U> it = this.buffers.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.buffers.add((U) collection);
                    this.downstream.onSubscribe(this);
                    xc0Var.request(Long.MAX_VALUE);
                    Scheduler.Worker worker = this.f19431w;
                    long j = this.timeskip;
                    worker.schedulePeriodically(this, j, j, this.unit);
                    this.f19431w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f19431w.dispose();
                    xc0Var.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.buffers.add((U) collection);
                    this.f19431w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i, boolean z) {
        super(flowable);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i;
        this.restartTimerOnMaxSize = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super U> wc0Var) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new BufferExactUnboundedSubscriber(new SerializedSubscriber(wc0Var), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        long j = this.timespan;
        long j2 = this.timeskip;
        Flowable<T> flowable = this.source;
        if (j == j2) {
            flowable.subscribe((FlowableSubscriber) new BufferExactBoundedSubscriber(new SerializedSubscriber(wc0Var), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, workerCreateWorker));
        } else {
            flowable.subscribe((FlowableSubscriber) new BufferSkipBoundedSubscriber(new SerializedSubscriber(wc0Var), this.bufferSupplier, this.timespan, this.timeskip, this.unit, workerCreateWorker));
        }
    }
}
