package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    public final int bufferSize;
    public final long maxSize;
    public final boolean restartTimerOnMaxSize;
    public final Scheduler scheduler;
    public final long timeskip;
    public final long timespan;
    public final TimeUnit unit;

    public static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements xc0 {
        public final int bufferSize;
        public long count;
        public final long maxSize;
        public long producerIndex;
        public final boolean restartTimerOnMaxSize;
        public final Scheduler scheduler;
        public volatile boolean terminated;
        public final SequentialDisposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public xc0 upstream;
        public UnicastProcessor<T> window;
        public final Scheduler.Worker worker;

        public static final class ConsumerIndexHolder implements Runnable {
            public final long index;
            public final WindowExactBoundedSubscriber<?> parent;

            public ConsumerIndexHolder(long j, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j;
                this.parent = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (windowExactBoundedSubscriber.cancelled) {
                    windowExactBoundedSubscriber.terminated = true;
                    windowExactBoundedSubscriber.dispose();
                } else {
                    windowExactBoundedSubscriber.queue.offer(this);
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }
        }

        public WindowExactBoundedSubscriber(wc0<? super Flowable<T>> wc0Var, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(wc0Var, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i;
            this.maxSize = j2;
            this.restartTimerOnMaxSize = z;
            this.worker = z ? scheduler.createWorker() : null;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            r17.window = null;
            r1.clear();
            r1 = r17.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            if (r1 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        
            ((io.reactivex.processors.UnicastProcessor) r3).onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        
            ((io.reactivex.processors.UnicastProcessor) r3).onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        
            dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainLoop() {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.drainLoop():void");
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor<T> unicastProcessor = this.window;
                unicastProcessor.onNext(t);
                long j = this.count + 1;
                if (j >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastProcessor.onComplete();
                    long jRequested = requested();
                    if (jRequested == 0) {
                        this.window = null;
                        this.upstream.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                    UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                    this.window = unicastProcessorCreate;
                    this.downstream.onNext(unicastProcessorCreate);
                    if (jRequested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        Scheduler.Worker worker = this.worker;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        long j2 = this.timespan;
                        this.timer.replace(worker.schedulePeriodically(consumerIndexHolder, j2, j2, this.unit));
                    }
                } else {
                    this.count = j;
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                wc0<? super V> wc0Var = this.downstream;
                wc0Var.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                this.window = unicastProcessorCreate;
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    xc0Var.cancel();
                    wc0Var.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                wc0Var.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                if (this.restartTimerOnMaxSize) {
                    Scheduler.Worker worker = this.worker;
                    long j = this.timespan;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j, j, this.unit);
                } else {
                    Scheduler scheduler = this.scheduler;
                    long j2 = this.timespan;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j2, j2, this.unit);
                }
                if (this.timer.replace(disposableSchedulePeriodicallyDirect)) {
                    xc0Var.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }
    }

    public static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements FlowableSubscriber<T>, xc0, Runnable {
        public static final Object NEXT = new Object();
        public final int bufferSize;
        public final Scheduler scheduler;
        public volatile boolean terminated;
        public final SequentialDisposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public xc0 upstream;
        public UnicastProcessor<T> window;

        public WindowExactUnboundedSubscriber(wc0<? super Flowable<T>> wc0Var, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(wc0Var, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.timer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r10.window = null;
            r0.clear();
            dispose();
            r0 = r10.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainLoop() {
            /*
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                z2.wc0<? super V> r1 = r10.downstream
                io.reactivex.processors.UnicastProcessor<T> r2 = r10.window
                r3 = 1
            L7:
                boolean r4 = r10.terminated
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r5 == 0) goto L2c
                if (r6 == 0) goto L18
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                if (r6 != r5) goto L2c
            L18:
                r10.window = r7
                r0.clear()
                r10.dispose()
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L28
                r2.onError(r0)
                goto L2b
            L28:
                r2.onComplete()
            L2b:
                return
            L2c:
                if (r6 != 0) goto L36
                int r3 = -r3
                int r3 = r10.leave(r3)
                if (r3 != 0) goto L7
                return
            L36:
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                if (r6 != r5) goto L83
                r2.onComplete()
                if (r4 != 0) goto L7d
                int r2 = r10.bufferSize
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                r10.window = r2
                long r4 = r10.requested()
                r8 = 0
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L63
                r1.onNext(r2)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L7
                r4 = 1
                r10.produced(r4)
                goto L7
            L63:
                r10.window = r7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                r0.clear()
                z2.xc0 r0 = r10.upstream
                r0.cancel()
                r10.dispose()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Could not deliver first window due to lack of requests."
                r0.<init>(r2)
                r1.onError(r0)
                return
            L7d:
                z2.xc0 r4 = r10.upstream
                r4.cancel()
                goto L7
            L83:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.drainLoop():void");
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                this.window.onNext(t);
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.window = UnicastProcessor.create(this.bufferSize);
                wc0<? super V> wc0Var = this.downstream;
                wc0Var.onSubscribe(this);
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    xc0Var.cancel();
                    wc0Var.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                wc0Var.onNext(this.window);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.cancelled) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler = this.scheduler;
                long j = this.timespan;
                if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.unit))) {
                    xc0Var.request(Long.MAX_VALUE);
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
                this.terminated = true;
                dispose();
            }
            this.queue.offer((U) NEXT);
            if (enter()) {
                drainLoop();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements xc0, Runnable {
        public final int bufferSize;
        public volatile boolean terminated;
        public final long timeskip;
        public final long timespan;
        public final TimeUnit unit;
        public xc0 upstream;
        public final List<UnicastProcessor<T>> windows;
        public final Scheduler.Worker worker;

        public final class Completion implements Runnable {
            private final UnicastProcessor<T> processor;

            public Completion(UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipSubscriber.this.complete(this.processor);
            }
        }

        public static final class SubjectWork<T> {
            public final boolean open;

            /* JADX INFO: renamed from: w */
            public final UnicastProcessor<T> f19458w;

            public SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z) {
                this.f19458w = unicastProcessor;
                this.open = z;
            }
        }

        public WindowSkipSubscriber(wc0<? super Flowable<T>> wc0Var, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(wc0Var, new MpscLinkedQueue());
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i;
            this.windows = new LinkedList();
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void complete(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer((U) new SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        public void dispose() {
            this.worker.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            wc0<? super V> wc0Var = this.downstream;
            List<UnicastProcessor<T>> list = this.windows;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z3 = objPoll == null;
                boolean z4 = objPoll instanceof SubjectWork;
                if (z && (z3 || z4)) {
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    dispose();
                    return;
                }
                if (z3) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z4) {
                    SubjectWork subjectWork = (SubjectWork) objPoll;
                    if (!subjectWork.open) {
                        list.remove(subjectWork.f19458w);
                        subjectWork.f19458w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    } else if (!this.cancelled) {
                        long jRequested = requested();
                        if (jRequested != 0) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                            list.add(unicastProcessorCreate);
                            wc0Var.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            this.worker.schedule(new Completion(unicastProcessorCreate), this.timespan, this.unit);
                        } else {
                            wc0Var.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.upstream.cancel();
            dispose();
            simpleQueue.clear();
            list.clear();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long jRequested = requested();
                if (jRequested == 0) {
                    xc0Var.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize);
                this.windows.add(unicastProcessorCreate);
                this.downstream.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.worker.schedule(new Completion(unicastProcessorCreate), this.timespan, this.unit);
                Scheduler.Worker worker = this.worker;
                long j = this.timeskip;
                worker.schedulePeriodically(this, j, j, this.unit);
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object subjectWork = new SubjectWork(UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer((U) subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(flowable);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j3;
        this.bufferSize = i;
        this.restartTimerOnMaxSize = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Flowable<T>> wc0Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wc0Var);
        long j = this.timespan;
        long j2 = this.timeskip;
        if (j != j2) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(serializedSubscriber, j, j2, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j3 = this.maxSize;
        if (j3 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new WindowExactUnboundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowExactBoundedSubscriber(serializedSubscriber, j, this.unit, this.scheduler, this.bufferSize, j3, this.restartTimerOnMaxSize));
        }
    }
}
