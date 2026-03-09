package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {
    public final Function<? super T, ? extends vc0<U>> debounceSelector;

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, xc0 {
        private static final long serialVersionUID = 6725975399620862591L;
        public final Function<? super T, ? extends vc0<U>> debounceSelector;
        public final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        public boolean done;
        public final wc0<? super T> downstream;
        public volatile long index;
        public xc0 upstream;

        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            public boolean done;
            public final long index;
            public final AtomicBoolean once = new AtomicBoolean();
            public final DebounceSubscriber<T, U> parent;
            public final T value;

            public DebounceInnerSubscriber(DebounceSubscriber<T, U> debounceSubscriber, long j, T t) {
                this.parent = debounceSubscriber;
                this.index = j;
                this.value = t;
            }

            public void emit() {
                if (this.once.compareAndSet(false, true)) {
                    this.parent.emit(this.index, this.value);
                }
            }

            @Override // p285z2.wc0
            public void onComplete() {
                if (this.done) {
                    return;
                }
                this.done = true;
                emit();
            }

            @Override // p285z2.wc0
            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaPlugins.onError(th);
                } else {
                    this.done = true;
                    this.parent.onError(th);
                }
            }

            @Override // p285z2.wc0
            public void onNext(U u) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cancel();
                emit();
            }
        }

        public DebounceSubscriber(wc0<? super T> wc0Var, Function<? super T, ? extends vc0<U>> function) {
            this.downstream = wc0Var;
            this.debounceSelector = function;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.debouncer);
        }

        public void emit(long j, T t) {
            if (j == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    BackpressureHelper.produced(this, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            Disposable disposable = this.debouncer.get();
            if (DisposableHelper.isDisposed(disposable)) {
                return;
            }
            ((DebounceInnerSubscriber) disposable).emit();
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.index + 1;
            this.index = j;
            Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.debounceSelector.apply(t), "The publisher supplied is null");
                DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j, t);
                if (this.debouncer.compareAndSet(disposable, debounceInnerSubscriber)) {
                    vc0Var.subscribe(debounceInnerSubscriber);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
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

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends vc0<U>> function) {
        super(flowable);
        this.debounceSelector = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new DebounceSubscriber(new SerializedSubscriber(wc0Var), this.debounceSelector));
    }
}
