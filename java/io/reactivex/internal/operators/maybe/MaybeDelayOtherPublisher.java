package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {
    public final vc0<U> other;

    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {
        public final OtherSubscriber<T> other;
        public final vc0<U> otherSource;
        public Disposable upstream;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver, vc0<U> vc0Var) {
            this.other = new OtherSubscriber<>(maybeObserver);
            this.otherSource = vc0Var;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.other.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            subscribeNext();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.error = th;
            subscribeNext();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.other.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.value = t;
            subscribeNext();
        }

        public void subscribeNext() {
            this.otherSource.subscribe(this.other);
        }
    }

    public static final class OtherSubscriber<T> extends AtomicReference<xc0> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        public final MaybeObserver<? super T> downstream;
        public Throwable error;
        public T value;

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            Throwable th2 = this.error;
            if (th2 == null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onError(new CompositeException(th2, th));
            }
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
            xc0 xc0Var = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var != subscriptionHelper) {
                lazySet(subscriptionHelper);
                xc0Var.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.setOnce(this, xc0Var, Long.MAX_VALUE);
        }
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, vc0<U> vc0Var) {
        super(maybeSource);
        this.other = vc0Var;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new DelayMaybeObserver(maybeObserver, this.other));
    }
}
