package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public enum SubscriptionHelper implements xc0 {
    CANCELLED;

    public static boolean cancel(AtomicReference<xc0> atomicReference) {
        xc0 andSet;
        xc0 xc0Var = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (xc0Var == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<xc0> atomicReference, AtomicLong atomicLong, long j) {
        xc0 xc0Var = atomicReference.get();
        if (xc0Var != null) {
            xc0Var.request(j);
            return;
        }
        if (validate(j)) {
            BackpressureHelper.add(atomicLong, j);
            xc0 xc0Var2 = atomicReference.get();
            if (xc0Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    xc0Var2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<xc0> atomicReference, AtomicLong atomicLong, xc0 xc0Var) {
        if (!setOnce(atomicReference, xc0Var)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        xc0Var.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<xc0> atomicReference, xc0 xc0Var) {
        xc0 xc0Var2;
        do {
            xc0Var2 = atomicReference.get();
            if (xc0Var2 == CANCELLED) {
                if (xc0Var == null) {
                    return false;
                }
                xc0Var.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(xc0Var2, xc0Var));
        return true;
    }

    public static void reportMoreProduced(long j) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<xc0> atomicReference, xc0 xc0Var) {
        xc0 xc0Var2;
        do {
            xc0Var2 = atomicReference.get();
            if (xc0Var2 == CANCELLED) {
                if (xc0Var == null) {
                    return false;
                }
                xc0Var.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(xc0Var2, xc0Var));
        if (xc0Var2 == null) {
            return true;
        }
        xc0Var2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<xc0> atomicReference, xc0 xc0Var) {
        ObjectHelper.requireNonNull(xc0Var, "s is null");
        if (atomicReference.compareAndSet(null, xc0Var)) {
            return true;
        }
        xc0Var.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean setOnce(AtomicReference<xc0> atomicReference, xc0 xc0Var, long j) {
        if (!setOnce(atomicReference, xc0Var)) {
            return false;
        }
        xc0Var.request(j);
        return true;
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean validate(xc0 xc0Var, xc0 xc0Var2) {
        if (xc0Var2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (xc0Var == null) {
            return true;
        }
        xc0Var2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p285z2.xc0
    public void cancel() {
    }

    @Override // p285z2.xc0
    public void request(long j) {
    }
}
