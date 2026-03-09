package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {
    public final vc0<U> other;

    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 706635022205076709L;
        public final MaybeObserver<? super T> downstream;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public static final class OtherSubscriber<T> implements FlowableSubscriber<Object>, Disposable {
        public final DelayMaybeObserver<T> main;
        public MaybeSource<T> source;
        public xc0 upstream;

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.main = new DelayMaybeObserver<>(maybeObserver);
            this.source = maybeSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.main);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.main.get());
        }

        @Override // p285z2.wc0
        public void onComplete() {
            xc0 xc0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var != subscriptionHelper) {
                this.upstream = subscriptionHelper;
                subscribeNext();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            xc0 xc0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var == subscriptionHelper) {
                RxJavaPlugins.onError(th);
            } else {
                this.upstream = subscriptionHelper;
                this.main.downstream.onError(th);
            }
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
            xc0 xc0Var = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (xc0Var != subscriptionHelper) {
                xc0Var.cancel();
                this.upstream = subscriptionHelper;
                subscribeNext();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.main.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }

        public void subscribeNext() {
            MaybeSource<T> maybeSource = this.source;
            this.source = null;
            maybeSource.subscribe(this.main);
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(MaybeSource<T> maybeSource, vc0<U> vc0Var) {
        super(maybeSource);
        this.other = vc0Var;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.other.subscribe(new OtherSubscriber(maybeObserver, this.source));
    }
}
