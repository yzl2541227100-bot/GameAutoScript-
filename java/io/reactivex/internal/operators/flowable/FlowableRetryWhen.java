package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function<? super Flowable<Throwable>, ? extends vc0<?>> handler;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RetryWhenSubscriber(wc0<? super T> wc0Var, FlowableProcessor<Throwable> flowableProcessor, xc0 xc0Var) {
            super(wc0Var, flowableProcessor, xc0Var);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            again(th);
        }
    }

    public FlowableRetryWhen(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends vc0<?>> function) {
        super(flowable);
        this.handler = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wc0Var);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            FlowableRepeatWhen.WhenReceiver whenReceiver = new FlowableRepeatWhen.WhenReceiver(this.source);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = retryWhenSubscriber;
            wc0Var.onSubscribe(retryWhenSubscriber);
            vc0Var.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }
}
