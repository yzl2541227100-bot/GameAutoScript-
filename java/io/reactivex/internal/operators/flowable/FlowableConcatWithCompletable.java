package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    public final CompletableSource other;

    public static final class ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, xc0 {
        private static final long serialVersionUID = -7346385463600070225L;
        public final wc0<? super T> downstream;
        public boolean inCompletable;
        public CompletableSource other;
        public xc0 upstream;

        public ConcatWithSubscriber(wc0<? super T> wc0Var, CompletableSource completableSource) {
            this.downstream = wc0Var;
            this.other = completableSource;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            CompletableSource completableSource = this.other;
            this.other = null;
            completableSource.subscribe(this);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }
    }

    public FlowableConcatWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new ConcatWithSubscriber(wc0Var, this.other));
    }
}
