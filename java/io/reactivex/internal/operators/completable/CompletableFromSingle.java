package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromSingle<T> extends Completable {
    public final SingleSource<T> single;

    public static final class CompletableFromSingleObserver<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: co */
        public final CompletableObserver f19429co;

        public CompletableFromSingleObserver(CompletableObserver completableObserver) {
            this.f19429co = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f19429co.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f19429co.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f19429co.onComplete();
        }
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.single = singleSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.single.subscribe(new CompletableFromSingleObserver(completableObserver));
    }
}
