package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiFunction<T, T, T> accumulator;

    public static final class ScanSubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public final BiFunction<T, T, T> accumulator;
        public boolean done;
        public final wc0<? super T> downstream;
        public xc0 upstream;
        public T value;

        public ScanSubscriber(wc0<? super T> wc0Var, BiFunction<T, T, T> biFunction) {
            this.downstream = wc0Var;
            this.accumulator = biFunction;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            wc0<? super T> wc0Var = this.downstream;
            T t2 = this.value;
            if (t2 != null) {
                try {
                    t = (T) ObjectHelper.requireNonNull(this.accumulator.apply(t2, t), "The value returned by the accumulator is null");
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                    return;
                }
            }
            this.value = t;
            wc0Var.onNext(t);
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
            this.upstream.request(j);
        }
    }

    public FlowableScan(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new ScanSubscriber(wc0Var, this.accumulator));
    }
}
