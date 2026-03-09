package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction<R, ? super T, R> accumulator;
    public final Callable<R> seedSupplier;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -1776795561228106469L;
        public final BiFunction<R, ? super T, R> accumulator;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final wc0<? super R> downstream;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final SimplePlainQueue<R> queue;
        public final AtomicLong requested;
        public xc0 upstream;
        public R value;

        public ScanSeedSubscriber(wc0<? super R> wc0Var, BiFunction<R, ? super T, R> biFunction, R r, int i) {
            this.downstream = wc0Var;
            this.accumulator = biFunction;
            this.value = r;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r);
            this.requested = new AtomicLong();
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            wc0<? super R> wc0Var = this.downstream;
            SimplePlainQueue<R> simplePlainQueue = this.queue;
            int i = this.limit;
            int i2 = this.consumed;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z = this.done;
                    if (z && (th = this.error) != null) {
                        simplePlainQueue.clear();
                        wc0Var.onError(th);
                        return;
                    }
                    R rPoll = simplePlainQueue.poll();
                    boolean z3 = rPoll == null;
                    if (z && z3) {
                        wc0Var.onComplete();
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    wc0Var.onNext(rPoll);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.upstream.request(i);
                        i2 = 0;
                    }
                }
                if (j2 == j && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        simplePlainQueue.clear();
                        wc0Var.onError(th2);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        wc0Var.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.requested, j2);
                }
                this.consumed = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

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
        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                R r = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
                this.value = r;
                this.queue.offer(r);
                drain();
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
                xc0Var.request(this.prefetch - 1);
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

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(wc0Var, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }
}
