package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {
    public final MaybeSource<? extends T>[] sources;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, xc0 {
        private static final long serialVersionUID = 3520831347801429610L;
        public final wc0<? super T> downstream;
        public int index;
        public long produced;
        public final MaybeSource<? extends T>[] sources;
        public final AtomicLong requested = new AtomicLong();
        public final SequentialDisposable disposables = new SequentialDisposable();
        public final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);
        public final AtomicThrowable errors = new AtomicThrowable();

        public ConcatMaybeObserver(wc0<? super T> wc0Var, MaybeSource<? extends T>[] maybeSourceArr) {
            this.downstream = wc0Var;
            this.sources = maybeSourceArr;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.disposables.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.current;
            wc0<? super T> wc0Var = this.downstream;
            SequentialDisposable sequentialDisposable = this.disposables;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j = this.produced;
                        if (j != this.requested.get()) {
                            this.produced = j + 1;
                            atomicReference.lazySet(null);
                            wc0Var.onNext(obj);
                        } else {
                            z = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z && !sequentialDisposable.isDisposed()) {
                        int i = this.index;
                        MaybeSource<? extends T>[] maybeSourceArr = this.sources;
                        if (i == maybeSourceArr.length) {
                            if (this.errors.get() != null) {
                                wc0Var.onError(this.errors.terminate());
                                return;
                            } else {
                                wc0Var.onComplete();
                                return;
                            }
                        }
                        this.index = i + 1;
                        maybeSourceArr[i].subscribe(this);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.current.lazySet(NotificationLite.COMPLETE);
            if (this.errors.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.disposables.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.current.lazySet(t);
            drain();
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }
    }

    public MaybeConcatArrayDelayError(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(wc0Var, this.sources);
        wc0Var.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.drain();
    }
}
