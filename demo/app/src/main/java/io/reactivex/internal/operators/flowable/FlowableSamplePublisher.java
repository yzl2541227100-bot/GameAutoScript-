package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {
    public final boolean emitLast;
    public final vc0<?> other;
    public final vc0<T> source;

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        public SampleMainEmitLast(wc0<? super T> wc0Var, vc0<?> vc0Var) {
            super(wc0Var, vc0Var);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public SampleMainNoLast(wc0<? super T> wc0Var, vc0<?> vc0Var) {
            super(wc0Var, vc0Var);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeMain() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeOther() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            emit();
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = -3517602651313910099L;
        public final wc0<? super T> downstream;
        public final vc0<?> sampler;
        public xc0 upstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<xc0> other = new AtomicReference<>();

        public SamplePublisherSubscriber(wc0<? super T> wc0Var, vc0<?> vc0Var) {
            this.downstream = wc0Var;
            this.sampler = vc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }

        public void complete() {
            this.upstream.cancel();
            completeOther();
        }

        public abstract void completeMain();

        public abstract void completeOther();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            completeMain();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SamplerSubscriber(this));
                    xc0Var.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
            }
        }

        public abstract void run();

        public void setOther(xc0 xc0Var) {
            SubscriptionHelper.setOnce(this.other, xc0Var, Long.MAX_VALUE);
        }
    }

    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        public final SamplePublisherSubscriber<T> parent;

        public SamplerSubscriber(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.parent = samplePublisherSubscriber;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.parent.complete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.parent.error(th);
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
            this.parent.run();
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            this.parent.setOther(xc0Var);
        }
    }

    public FlowableSamplePublisher(vc0<T> vc0Var, vc0<?> vc0Var2, boolean z) {
        this.source = vc0Var;
        this.other = vc0Var2;
        this.emitLast = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        vc0<T> vc0Var;
        wc0<? super T> sampleMainNoLast;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wc0Var);
        if (this.emitLast) {
            vc0Var = this.source;
            sampleMainNoLast = new SampleMainEmitLast<>(serializedSubscriber, this.other);
        } else {
            vc0Var = this.source;
            sampleMainNoLast = new SampleMainNoLast<>(serializedSubscriber, this.other);
        }
        vc0Var.subscribe(sampleMainNoLast);
    }
}
