package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final int bufferSize;
    public final boolean delayErrors;
    public final Function<? super T, ? extends vc0<? extends R>> mapper;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<xc0> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long index;
        public final SwitchMapSubscriber<T, R> parent;
        public volatile SimpleQueue<R> queue;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !switchMapSubscriber.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.cancel();
            }
            this.done = true;
            switchMapSubscriber.drain();
        }

        @Override // p285z2.wc0
        public void onNext(R r) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode != 0 || this.queue.offer(r)) {
                    switchMapSubscriber.drain();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.setOnce(this, xc0Var)) {
                if (xc0Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        xc0Var.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                xc0Var.request(this.bufferSize);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, xc0 {
        public static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final wc0<? super R> downstream;
        public final Function<? super T, ? extends vc0<? extends R>> mapper;
        public volatile long unique;
        public xc0 upstream;
        public final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicThrowable error = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        public SwitchMapSubscriber(wc0<? super R> wc0Var, Function<? super T, ? extends vc0<? extends R>> function, int i, boolean z) {
            this.downstream = wc0Var;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        public void disposeInner() {
            SwitchMapInnerSubscriber<T, R> andSet;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber2 = CANCELLED;
            if (switchMapInnerSubscriber == switchMapInnerSubscriber2 || (andSet = this.active.getAndSet((SwitchMapInnerSubscriber<T, R>) switchMapInnerSubscriber2)) == switchMapInnerSubscriber2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
        
            r17.active.compareAndSet(r6, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instruction units count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.drain():void");
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
            if (this.done || !this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.done) {
                return;
            }
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.cancel();
            }
            try {
                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.mapper.apply(t), "The publisher returned is null");
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber<>(this, j, this.bufferSize);
                do {
                    switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber == CANCELLED) {
                        return;
                    }
                } while (!this.active.compareAndSet(switchMapInnerSubscriber, switchMapInnerSubscriber3));
                vc0Var.subscribe(switchMapInnerSubscriber3);
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
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends vc0<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, wc0Var, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(wc0Var, this.mapper, this.bufferSize, this.delayErrors));
    }
}
