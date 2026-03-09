package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    public final vc0<? extends R> other;
    public final CompletableSource source;

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<xc0> implements FlowableSubscriber<R>, CompletableObserver, xc0 {
        private static final long serialVersionUID = -8948264376121066672L;
        public final wc0<? super R> downstream;
        public vc0<? extends R> other;
        public final AtomicLong requested = new AtomicLong();
        public Disposable upstream;

        public AndThenPublisherSubscriber(wc0<? super R> wc0Var, vc0<? extends R> vc0Var) {
            this.downstream = wc0Var;
            this.other = vc0Var;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            vc0<? extends R> vc0Var = this.other;
            if (vc0Var == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                vc0Var.subscribe(this);
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, xc0Var);
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.requested, j);
        }
    }

    public CompletableAndThenPublisher(CompletableSource completableSource, vc0<? extends R> vc0Var) {
        this.source = completableSource;
        this.other = vc0Var;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        this.source.subscribe(new AndThenPublisherSubscriber(wc0Var, this.other));
    }
}
