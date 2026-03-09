package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        public MaterializeSubscriber(wc0<? super Notification<T>> wc0Var) {
            super(wc0Var);
        }

        @Override // p285z2.wc0
        public void onComplete() {
            complete(Notification.createOnComplete());
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        public void onDrop(Notification<T> notification) {
            if (notification.isOnError()) {
                RxJavaPlugins.onError(notification.getError());
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            complete(Notification.createOnError(th));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p285z2.wc0
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(Notification.createOnNext(t));
        }
    }

    public FlowableMaterialize(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super Notification<T>> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new MaterializeSubscriber(wc0Var));
    }
}
