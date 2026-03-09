package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function<? super Flowable<Object>, ? extends vc0<?>> handler;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RepeatWhenSubscriber(wc0<? super T> wc0Var, FlowableProcessor<Object> flowableProcessor, xc0 xc0Var) {
            super(wc0Var, flowableProcessor, xc0Var);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            again(0);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, xc0 {
        private static final long serialVersionUID = 2827772011130406689L;
        public final vc0<T> source;
        public WhenSourceSubscriber<T, U> subscriber;
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        public WhenReceiver(vc0<T> vc0Var) {
            this.source = vc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, xc0Var);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }
    }

    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        public final wc0<? super T> downstream;
        public final FlowableProcessor<U> processor;
        private long produced;
        public final xc0 receiver;

        public WhenSourceSubscriber(wc0<? super T> wc0Var, FlowableProcessor<U> flowableProcessor, xc0 xc0Var) {
            super(false);
            this.downstream = wc0Var;
            this.processor = flowableProcessor;
            this.receiver = xc0Var;
        }

        public final void again(U u) {
            setSubscription(EmptySubscription.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.receiver.request(1L);
            this.processor.onNext(u);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p285z2.xc0
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        @Override // p285z2.wc0
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public final void onSubscribe(xc0 xc0Var) {
            setSubscription(xc0Var);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends vc0<?>> function) {
        super(flowable);
        this.handler = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wc0Var);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            wc0Var.onSubscribe(repeatWhenSubscriber);
            vc0Var.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }
}
