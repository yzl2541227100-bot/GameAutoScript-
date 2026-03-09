package io.reactivex.internal.operators.observable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p285z2.vc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFromPublisher<T> extends Observable<T> {
    public final vc0<? extends T> source;

    public static final class PublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final Observer<? super T> downstream;
        public xc0 upstream;

        public PublisherSubscriber(Observer<? super T> observer) {
            this.downstream = observer;
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
            this.downstream.onNext(t);
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

    public ObservableFromPublisher(vc0<? extends T> vc0Var) {
        this.source = vc0Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new PublisherSubscriber(observer));
    }
}
