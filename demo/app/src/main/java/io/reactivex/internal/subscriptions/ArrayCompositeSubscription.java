package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<xc0> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        xc0 andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                xc0 xc0Var = get(i);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (xc0Var != subscriptionHelper && (andSet = getAndSet(i, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public xc0 replaceResource(int i, xc0 xc0Var) {
        xc0 xc0Var2;
        do {
            xc0Var2 = get(i);
            if (xc0Var2 == SubscriptionHelper.CANCELLED) {
                if (xc0Var == null) {
                    return null;
                }
                xc0Var.cancel();
                return null;
            }
        } while (!compareAndSet(i, xc0Var2, xc0Var));
        return xc0Var2;
    }

    public boolean setResource(int i, xc0 xc0Var) {
        xc0 xc0Var2;
        do {
            xc0Var2 = get(i);
            if (xc0Var2 == SubscriptionHelper.CANCELLED) {
                if (xc0Var == null) {
                    return false;
                }
                xc0Var.cancel();
                return false;
            }
        } while (!compareAndSet(i, xc0Var2, xc0Var));
        if (xc0Var2 == null) {
            return true;
        }
        xc0Var2.cancel();
        return true;
    }
}
