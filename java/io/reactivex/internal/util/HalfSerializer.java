package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class HalfSerializer {
    private HalfSerializer() {
        throw new IllegalStateException("No instances!");
    }

    public static void onComplete(Observer<?> observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                observer.onError(thTerminate);
            } else {
                observer.onComplete();
            }
        }
    }

    public static void onComplete(wc0<?> wc0Var, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                wc0Var.onError(thTerminate);
            } else {
                wc0Var.onComplete();
            }
        }
    }

    public static void onError(Observer<?> observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            RxJavaPlugins.onError(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(atomicThrowable.terminate());
        }
    }

    public static void onError(wc0<?> wc0Var, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            RxJavaPlugins.onError(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            wc0Var.onError(atomicThrowable.terminate());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(Observer<? super T> observer, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    observer.onError(thTerminate);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(wc0<? super T> wc0Var, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            wc0Var.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    wc0Var.onError(thTerminate);
                } else {
                    wc0Var.onComplete();
                }
            }
        }
    }
}
