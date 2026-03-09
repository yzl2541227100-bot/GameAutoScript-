package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {
    public final Callable<R> initialSupplier;
    public final BiFunction<R, ? super T, R> reducer;
    public final ParallelFlowable<? extends T> source;

    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        public R accumulator;
        public boolean done;
        public final BiFunction<R, ? super T, R> reducer;

        public ParallelReduceSubscriber(wc0<? super R> wc0Var, R r, BiFunction<R, ? super T, R> biFunction) {
            super(wc0Var);
            this.accumulator = r;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            R r = this.accumulator;
            this.accumulator = null;
            complete(r);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.accumulator = null;
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.accumulator = (R) ObjectHelper.requireNonNull(this.reducer.apply(this.accumulator, t), "The reducer returned a null value");
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public ParallelReduce(ParallelFlowable<? extends T> parallelFlowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.source = parallelFlowable;
        this.initialSupplier = callable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public void reportError(wc0<?>[] wc0VarArr, Throwable th) {
        for (wc0<?> wc0Var : wc0VarArr) {
            EmptySubscription.error(th, wc0Var);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(wc0<? super R>[] wc0VarArr) {
        if (validate(wc0VarArr)) {
            int length = wc0VarArr.length;
            wc0<? super Object>[] wc0VarArr2 = new wc0[length];
            for (int i = 0; i < length; i++) {
                try {
                    wc0VarArr2[i] = new ParallelReduceSubscriber(wc0VarArr[i], ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.reducer);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    reportError(wc0VarArr, th);
                    return;
                }
            }
            this.source.subscribe(wc0VarArr2);
        }
    }
}
