package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements xc0 {
    private static final long serialVersionUID = -2189523197179400958L;
    public xc0 actual;
    public final boolean cancelOnReplace;
    public volatile boolean cancelled;
    public long requested;
    public boolean unbounded;
    public final AtomicReference<xc0> missedSubscription = new AtomicReference<>();
    public final AtomicLong missedRequested = new AtomicLong();
    public final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    public final void drainLoop() {
        int iAddAndGet = 1;
        xc0 xc0Var = null;
        long jAddCap = 0;
        do {
            xc0 andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            xc0 xc0Var2 = this.actual;
            if (this.cancelled) {
                if (xc0Var2 != null) {
                    xc0Var2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jAddCap2 = this.requested;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = BackpressureHelper.addCap(jAddCap2, andSet2);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet3;
                        if (jAddCap2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.requested = jAddCap2;
                }
                if (andSet != null) {
                    if (xc0Var2 != null && this.cancelOnReplace) {
                        xc0Var2.cancel();
                    }
                    this.actual = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = BackpressureHelper.addCap(jAddCap, jAddCap2);
                        xc0Var = andSet;
                    }
                } else if (xc0Var2 != null && andSet2 != 0) {
                    jAddCap = BackpressureHelper.addCap(jAddCap, andSet2);
                    xc0Var = xc0Var2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            xc0Var.request(jAddCap);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j);
            drain();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                SubscriptionHelper.reportMoreProduced(j3);
                j3 = 0;
            }
            this.requested = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // p285z2.xc0
    public final void request(long j) {
        if (!SubscriptionHelper.validate(j) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedRequested, j);
            drain();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long jAddCap = BackpressureHelper.addCap(j2, j);
            this.requested = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        xc0 xc0Var = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (xc0Var != null) {
            xc0Var.request(j);
        }
    }

    public final void setSubscription(xc0 xc0Var) {
        if (this.cancelled) {
            xc0Var.cancel();
            return;
        }
        ObjectHelper.requireNonNull(xc0Var, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            xc0 andSet = this.missedSubscription.getAndSet(xc0Var);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        xc0 xc0Var2 = this.actual;
        if (xc0Var2 != null && this.cancelOnReplace) {
            xc0Var2.cancel();
        }
        this.actual = xc0Var;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j != 0) {
            xc0Var.request(j);
        }
    }
}
