package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromObservable<T> extends Completable {
    public final ObservableSource<T> observable;

    public static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: co */
        public final CompletableObserver f19428co;

        public CompletableFromObservableObserver(CompletableObserver completableObserver) {
            this.f19428co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f19428co.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f19428co.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f19428co.onSubscribe(disposable);
        }
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.observable = observableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.observable.subscribe(new CompletableFromObservableObserver(completableObserver));
    }
}
