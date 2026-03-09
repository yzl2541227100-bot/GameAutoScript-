package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Action onFinally;

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        public final ConditionalSubscriber<? super T> downstream;
        public final Action onFinally;

        /* JADX INFO: renamed from: qs */
        public QueueSubscription<T> f19437qs;
        public boolean syncFused;
        public xc0 upstream;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.downstream = conditionalSubscriber;
            this.onFinally = action;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f19437qs.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f19437qs.isEmpty();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (xc0Var instanceof QueueSubscription) {
                    this.f19437qs = (QueueSubscription) xc0Var;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.f19437qs.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            QueueSubscription<T> queueSubscription = this.f19437qs;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            return this.downstream.tryOnNext(t);
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        public final wc0<? super T> downstream;
        public final Action onFinally;

        /* JADX INFO: renamed from: qs */
        public QueueSubscription<T> f19438qs;
        public boolean syncFused;
        public xc0 upstream;

        public DoFinallySubscriber(wc0<? super T> wc0Var, Action action) {
            this.downstream = wc0Var;
            this.onFinally = action;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f19438qs.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f19438qs.isEmpty();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                if (xc0Var instanceof QueueSubscription) {
                    this.f19438qs = (QueueSubscription) xc0Var;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.f19438qs.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            QueueSubscription<T> queueSubscription = this.f19438qs;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.onFinally = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        Flowable<T> flowable;
        FlowableSubscriber<? super T> doFinallySubscriber;
        if (wc0Var instanceof ConditionalSubscriber) {
            flowable = this.source;
            doFinallySubscriber = new DoFinallyConditionalSubscriber<>((ConditionalSubscriber) wc0Var, this.onFinally);
        } else {
            flowable = this.source;
            doFinallySubscriber = new DoFinallySubscriber<>(wc0Var, this.onFinally);
        }
        flowable.subscribe((FlowableSubscriber) doFinallySubscriber);
    }
}
