package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {
    public final Consumer<? super T> onAfterNext;
    public final Action onAfterTerminated;
    public final Action onCancel;
    public final Action onComplete;
    public final Consumer<? super Throwable> onError;
    public final Consumer<? super T> onNext;
    public final LongConsumer onRequest;
    public final Consumer<? super xc0> onSubscribe;
    public final ParallelFlowable<T> source;

    public static final class ParallelPeekSubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public boolean done;
        public final wc0<? super T> downstream;
        public final ParallelPeek<T> parent;
        public xc0 upstream;

        public ParallelPeekSubscriber(wc0<? super T> wc0Var, ParallelPeek<T> parallelPeek) {
            this.downstream = wc0Var;
            this.parent = parallelPeek;
        }

        @Override // p285z2.xc0
        public void cancel() {
            try {
                this.parent.onCancel.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            try {
                this.parent.onComplete.run();
                this.downstream.onComplete();
                try {
                    this.parent.onAfterTerminated.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            try {
                this.parent.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(th, th2);
            }
            this.downstream.onError(th);
            try {
                this.parent.onAfterTerminated.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.parent.onNext.accept(t);
                this.downstream.onNext(t);
                try {
                    this.parent.onAfterNext.accept(t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                try {
                    this.parent.onSubscribe.accept(xc0Var);
                    this.downstream.onSubscribe(this);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    xc0Var.cancel();
                    this.downstream.onSubscribe(EmptySubscription.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            try {
                this.parent.onRequest.accept(j);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.request(j);
        }
    }

    public ParallelPeek(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Consumer<? super xc0> consumer4, LongConsumer longConsumer, Action action3) {
        this.source = parallelFlowable;
        this.onNext = (Consumer) ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.onAfterNext = (Consumer) ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.onError = (Consumer) ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.onComplete = (Action) ObjectHelper.requireNonNull(action, "onComplete is null");
        this.onAfterTerminated = (Action) ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.onSubscribe = (Consumer) ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.onRequest = (LongConsumer) ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.onCancel = (Action) ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(wc0<? super T>[] wc0VarArr) {
        if (validate(wc0VarArr)) {
            int length = wc0VarArr.length;
            wc0<? super T>[] wc0VarArr2 = new wc0[length];
            for (int i = 0; i < length; i++) {
                wc0VarArr2[i] = new ParallelPeekSubscriber(wc0VarArr[i], this);
            }
            this.source.subscribe(wc0VarArr2);
        }
    }
}
