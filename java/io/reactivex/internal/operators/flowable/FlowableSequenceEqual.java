package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {
    public final BiPredicate<? super T, ? super T> comparer;
    public final vc0<? extends T> first;
    public final int prefetch;
    public final vc0<? extends T> second;

    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        public final BiPredicate<? super T, ? super T> comparer;
        public final AtomicThrowable error;
        public final EqualSubscriber<T> first;
        public final EqualSubscriber<T> second;

        /* JADX INFO: renamed from: v1 */
        public T f19449v1;

        /* JADX INFO: renamed from: v2 */
        public T f19450v2;
        public final AtomicInteger wip;

        public EqualCoordinator(wc0<? super Boolean> wc0Var, int i, BiPredicate<? super T, ? super T> biPredicate) {
            super(wc0Var);
            this.comparer = biPredicate;
            this.wip = new AtomicInteger();
            this.first = new EqualSubscriber<>(this, i);
            this.second = new EqualSubscriber<>(this, i);
            this.error = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.first.cancel();
            this.second.cancel();
            if (this.wip.getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        public void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
            Boolean bool = Boolean.FALSE;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.first.queue;
                SimpleQueue<T> simpleQueue2 = this.second.queue;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (!isCancelled()) {
                        if (this.error.get() != null) {
                            cancelAndClear();
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                        boolean z = this.first.done;
                        T tPoll = this.f19449v1;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f19449v1 = tPoll;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                cancelAndClear();
                                this.error.addThrowable(th);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z3 = tPoll == null;
                        boolean z4 = this.second.done;
                        T tPoll2 = this.f19450v2;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.f19450v2 = tPoll2;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                cancelAndClear();
                                this.error.addThrowable(th2);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z5 = tPoll2 == null;
                        if (z && z4 && z3 && z5) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z && z4 && z3 != z5) {
                            cancelAndClear();
                            complete(bool);
                            return;
                        }
                        if (!z3 && !z5) {
                            try {
                                if (!this.comparer.test(tPoll, tPoll2)) {
                                    cancelAndClear();
                                    complete(bool);
                                    return;
                                } else {
                                    this.f19449v1 = null;
                                    this.f19450v2 = null;
                                    this.first.request();
                                    this.second.request();
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                cancelAndClear();
                                this.error.addThrowable(th3);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                    }
                    this.first.clear();
                    this.second.clear();
                    return;
                }
                if (isCancelled()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (this.error.get() != null) {
                    cancelAndClear();
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(Throwable th) {
            if (this.error.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void subscribe(vc0<? extends T> vc0Var, vc0<? extends T> vc0Var2) {
            vc0Var.subscribe(this.first);
            vc0Var2.subscribe(this.second);
        }
    }

    public interface EqualCoordinatorHelper {
        void drain();

        void innerError(Throwable th);
    }

    public static final class EqualSubscriber<T> extends AtomicReference<xc0> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        public volatile boolean done;
        public final int limit;
        public final EqualCoordinatorHelper parent;
        public final int prefetch;
        public long produced;
        public volatile SimpleQueue<T> queue;
        public int sourceMode;

        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper, int i) {
            this.parent = equalCoordinatorHelper;
            this.limit = i - (i >> 2);
            this.prefetch = i;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public void clear() {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                this.parent.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.setOnce(this, xc0Var)) {
                if (xc0Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) xc0Var;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        xc0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                xc0Var.request(this.prefetch);
            }
        }

        public void request() {
            if (this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j < this.limit) {
                    this.produced = j;
                } else {
                    this.produced = 0L;
                    get().request(j);
                }
            }
        }
    }

    public FlowableSequenceEqual(vc0<? extends T> vc0Var, vc0<? extends T> vc0Var2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.first = vc0Var;
        this.second = vc0Var2;
        this.comparer = biPredicate;
        this.prefetch = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Boolean> wc0Var) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(wc0Var, this.prefetch, this.comparer);
        wc0Var.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }
}
