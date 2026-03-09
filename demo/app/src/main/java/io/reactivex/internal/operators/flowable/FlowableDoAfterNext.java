package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Consumer<? super T> onAfterNext;

    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Consumer<? super T> onAfterNext;

        public DoAfterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer) {
            super(conditionalSubscriber);
            this.onAfterNext = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext((Object) t);
            if (this.sourceMode == 0) {
                try {
                    this.onAfterNext.accept(t);
                } catch (Throwable th) {
                    fail(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.f19496qs.poll();
            if (tPoll != null) {
                this.onAfterNext.accept(tPoll);
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            boolean zTryOnNext = this.downstream.tryOnNext((Object) t);
            try {
                this.onAfterNext.accept(t);
            } catch (Throwable th) {
                fail(th);
            }
            return zTryOnNext;
        }
    }

    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        public final Consumer<? super T> onAfterNext;

        public DoAfterSubscriber(wc0<? super T> wc0Var, Consumer<? super T> consumer) {
            super(wc0Var);
            this.onAfterNext = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            this.downstream.onNext((Object) t);
            if (this.sourceMode == 0) {
                try {
                    this.onAfterNext.accept(t);
                } catch (Throwable th) {
                    fail(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.f19497qs.poll();
            if (tPoll != null) {
                this.onAfterNext.accept(tPoll);
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public FlowableDoAfterNext(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.onAfterNext = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        Flowable<T> flowable;
        FlowableSubscriber<? super T> doAfterSubscriber;
        if (wc0Var instanceof ConditionalSubscriber) {
            flowable = this.source;
            doAfterSubscriber = new DoAfterConditionalSubscriber<>((ConditionalSubscriber) wc0Var, this.onAfterNext);
        } else {
            flowable = this.source;
            doAfterSubscriber = new DoAfterSubscriber<>(wc0Var, this.onAfterNext);
        }
        flowable.subscribe((FlowableSubscriber) doAfterSubscriber);
    }
}
