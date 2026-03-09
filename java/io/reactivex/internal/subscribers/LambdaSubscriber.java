package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class LambdaSubscriber<T> extends AtomicReference<xc0> implements FlowableSubscriber<T>, xc0, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    public final Action onComplete;
    public final Consumer<? super Throwable> onError;
    public final Consumer<? super T> onNext;
    public final Consumer<? super xc0> onSubscribe;

    public LambdaSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super xc0> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onSubscribe = consumer3;
    }

    @Override // p285z2.xc0
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // p285z2.wc0
    public void onComplete() {
        xc0 xc0Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (xc0Var != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        xc0 xc0Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (xc0Var == subscriptionHelper) {
            RxJavaPlugins.onError(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(new CompositeException(th, th2));
        }
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.setOnce(this, xc0Var)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                xc0Var.cancel();
                onError(th);
            }
        }
    }

    @Override // p285z2.xc0
    public void request(long j) {
        get().request(j);
    }
}
