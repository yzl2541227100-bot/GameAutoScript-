package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.vc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {
    public final BiFunction<R, ? super T, R> reducer;
    public final R seed;
    public final vc0<T> source;

    public static final class ReduceSeedObserver<T, R> implements FlowableSubscriber<T>, Disposable {
        public final SingleObserver<? super R> downstream;
        public final BiFunction<R, ? super T, R> reducer;
        public xc0 upstream;
        public R value;

        public ReduceSeedObserver(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r) {
            this.downstream = singleObserver;
            this.value = r;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            R r = this.value;
            if (r != null) {
                this.value = null;
                this.upstream = SubscriptionHelper.CANCELLED;
                this.downstream.onSuccess(r);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.value == null) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.value = null;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            R r = this.value;
            if (r != null) {
                try {
                    this.value = (R) ObjectHelper.requireNonNull(this.reducer.apply(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(vc0<T> vc0Var, R r, BiFunction<R, ? super T, R> biFunction) {
        this.source = vc0Var;
        this.seed = r;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }
}
