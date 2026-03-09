package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    public final vc0<? extends T>[] sources;
    public final Iterable<? extends vc0<? extends T>> sourcesIterable;

    public static final class AmbCoordinator<T> implements xc0 {
        public final wc0<? super T> downstream;
        public final AmbInnerSubscriber<T>[] subscribers;
        public final AtomicInteger winner = new AtomicInteger();

        public AmbCoordinator(wc0<? super T> wc0Var, int i) {
            this.downstream = wc0Var;
            this.subscribers = new AmbInnerSubscriber[i];
        }

        @Override // p285z2.xc0
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                int i = this.winner.get();
                if (i > 0) {
                    this.subscribers[i - 1].request(j);
                    return;
                }
                if (i == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j);
                    }
                }
            }
        }

        public void subscribe(vc0<? extends T>[] vc0VarArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerSubscriberArr[i] = new AmbInnerSubscriber<>(this, i2, this.downstream);
                i = i2;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.winner.get() == 0; i3++) {
                vc0VarArr[i3].subscribe(ambInnerSubscriberArr[i3]);
            }
        }

        public boolean win(int i) {
            int i2 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }
    }

    public static final class AmbInnerSubscriber<T> extends AtomicReference<xc0> implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -1185974347409665484L;
        public final wc0<? super T> downstream;
        public final int index;
        public final AtomicLong missedRequested = new AtomicLong();
        public final AmbCoordinator<T> parent;
        public boolean won;

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i, wc0<? super T> wc0Var) {
            this.parent = ambCoordinator;
            this.index = i;
            this.downstream = wc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (!this.won) {
                if (!this.parent.win(this.index)) {
                    get().cancel();
                    return;
                }
                this.won = true;
            }
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (!this.won) {
                if (!this.parent.win(this.index)) {
                    get().cancel();
                    RxJavaPlugins.onError(th);
                    return;
                }
                this.won = true;
            }
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (!this.won) {
                if (!this.parent.win(this.index)) {
                    get().cancel();
                    return;
                }
                this.won = true;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, xc0Var);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j);
        }
    }

    public FlowableAmb(vc0<? extends T>[] vc0VarArr, Iterable<? extends vc0<? extends T>> iterable) {
        this.sources = vc0VarArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        int length;
        vc0<? extends T>[] vc0VarArr = this.sources;
        if (vc0VarArr == null) {
            vc0VarArr = new vc0[8];
            try {
                length = 0;
                for (vc0<? extends T> vc0Var : this.sourcesIterable) {
                    if (vc0Var == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), wc0Var);
                        return;
                    }
                    if (length == vc0VarArr.length) {
                        vc0<? extends T>[] vc0VarArr2 = new vc0[(length >> 2) + length];
                        System.arraycopy(vc0VarArr, 0, vc0VarArr2, 0, length);
                        vc0VarArr = vc0VarArr2;
                    }
                    int i = length + 1;
                    vc0VarArr[length] = vc0Var;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, wc0Var);
                return;
            }
        } else {
            length = vc0VarArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(wc0Var);
        } else if (length == 1) {
            vc0VarArr[0].subscribe(wc0Var);
        } else {
            new AmbCoordinator(wc0Var, length).subscribe(vc0VarArr);
        }
    }
}
