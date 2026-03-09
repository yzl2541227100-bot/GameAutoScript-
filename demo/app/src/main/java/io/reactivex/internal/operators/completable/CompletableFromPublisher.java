package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p285z2.vc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromPublisher<T> extends Completable {
    public final vc0<T> flowable;

    public static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final CompletableObserver downstream;
        public xc0 upstream;

        public FromPublisherSubscriber(CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
                xc0Var.request(Long.MAX_VALUE);
            }
        }
    }

    public CompletableFromPublisher(vc0<T> vc0Var) {
        this.flowable = vc0Var;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.flowable.subscribe(new FromPublisherSubscriber(completableObserver));
    }
}
