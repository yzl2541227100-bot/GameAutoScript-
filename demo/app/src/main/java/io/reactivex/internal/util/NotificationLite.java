package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final Disposable upstream;

        public DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e */
        public final Throwable f19516e;

        public ErrorNotification(Throwable th) {
            this.f19516e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.equals(this.f19516e, ((ErrorNotification) obj).f19516e);
            }
            return false;
        }

        public int hashCode() {
            return this.f19516e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f19516e + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final xc0 upstream;

        public SubscriptionNotification(xc0 xc0Var) {
            this.upstream = xc0Var;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f19516e);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, wc0<? super T> wc0Var) {
        if (obj == COMPLETE) {
            wc0Var.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            wc0Var.onError(((ErrorNotification) obj).f19516e);
            return true;
        }
        wc0Var.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f19516e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, wc0<? super T> wc0Var) {
        if (obj == COMPLETE) {
            wc0Var.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            wc0Var.onError(((ErrorNotification) obj).f19516e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            wc0Var.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        wc0Var.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f19516e;
    }

    public static xc0 getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(xc0 xc0Var) {
        return new SubscriptionNotification(xc0Var);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
