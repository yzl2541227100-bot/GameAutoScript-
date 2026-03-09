package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableIgnoreElementsCompletable<T> extends Completable implements FuseToFlowable<T> {
    public final Flowable<T> source;

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final CompletableObserver downstream;
        public xc0 upstream;

        public IgnoreElementsSubscriber(CompletableObserver completableObserver) {
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
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.upstream = SubscriptionHelper.CANCELLED;
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

    public FlowableIgnoreElementsCompletable(Flowable<T> flowable) {
        this.source = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableIgnoreElements(this.source));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe((FlowableSubscriber) new IgnoreElementsSubscriber(completableObserver));
    }
}
