package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction<? super T, ? super U, ? extends R> combiner;
    public final vc0<? extends U> other;

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        private final WithLatestFromSubscriber<T, U, R> wlf;

        public FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.wlf = withLatestFromSubscriber;
        }

        @Override // p285z2.wc0
        public void onComplete() {
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.wlf.otherError(th);
        }

        @Override // p285z2.wc0
        public void onNext(U u) {
            this.wlf.lazySet(u);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (this.wlf.setOther(xc0Var)) {
                xc0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, xc0 {
        private static final long serialVersionUID = -312246233408980075L;
        public final BiFunction<? super T, ? super U, ? extends R> combiner;
        public final wc0<? super R> downstream;
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<xc0> other = new AtomicReference<>();

        public WithLatestFromSubscriber(wc0<? super R> wc0Var, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = wc0Var;
            this.combiner = biFunction;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, xc0Var);
        }

        public void otherError(Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public boolean setOther(xc0 xc0Var) {
            return SubscriptionHelper.setOnce(this.other, xc0Var);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.combiner.apply(t, u), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
            return false;
        }
    }

    public FlowableWithLatestFrom(Flowable<T> flowable, BiFunction<? super T, ? super U, ? extends R> biFunction, vc0<? extends U> vc0Var) {
        super(flowable);
        this.combiner = biFunction;
        this.other = vc0Var;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wc0Var);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.combiner);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.other.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }
}
