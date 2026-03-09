package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public interface wc0<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(xc0 xc0Var);
}
