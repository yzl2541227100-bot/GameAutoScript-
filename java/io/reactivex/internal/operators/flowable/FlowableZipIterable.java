package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableZipIterable<T, U, V> extends AbstractFlowableWithUpstream<T, V> {
    public final Iterable<U> other;
    public final BiFunction<? super T, ? super U, ? extends V> zipper;

    public static final class ZipIterableSubscriber<T, U, V> implements FlowableSubscriber<T>, xc0 {
        public boolean done;
        public final wc0<? super V> downstream;
        public final Iterator<U> iterator;
        public xc0 upstream;
        public final BiFunction<? super T, ? super U, ? extends V> zipper;

        public ZipIterableSubscriber(wc0<? super V> wc0Var, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = wc0Var;
            this.iterator = it;
            this.zipper = biFunction;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
        }

        public void error(Throwable th) {
            Exceptions.throwIfFatal(th);
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
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
            try {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.zipper.apply(t, ObjectHelper.requireNonNull(this.iterator.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.iterator.hasNext()) {
                            return;
                        }
                        this.done = true;
                        this.upstream.cancel();
                        this.downstream.onComplete();
                    } catch (Throwable th) {
                        error(th);
                    }
                } catch (Throwable th2) {
                    error(th2);
                }
            } catch (Throwable th3) {
                error(th3);
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
            this.upstream.request(j);
        }
    }

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.other = iterable;
        this.zipper = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super V> wc0Var) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.other.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.source.subscribe((FlowableSubscriber) new ZipIterableSubscriber(wc0Var, it, this.zipper));
                } else {
                    EmptySubscription.complete(wc0Var);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, wc0Var);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, wc0Var);
        }
    }
}
