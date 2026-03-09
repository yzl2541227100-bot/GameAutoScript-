package io.reactivex.internal.subscribers;

import com.anythink.expressad.exoplayer.C1500b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, xc0 {
    public static final long COMPLETE_MASK = Long.MIN_VALUE;
    public static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    public final wc0<? super R> downstream;
    public long produced;
    public xc0 upstream;
    public R value;

    public SinglePostCompleteSubscriber(wc0<? super R> wc0Var) {
        this.downstream = wc0Var;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            BackpressureHelper.produced(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(C1500b.f7455b);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public void onDrop(R r) {
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
            this.upstream = xc0Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p285z2.xc0
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C1500b.f7455b)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.addCap(j2, j)));
            this.upstream.request(j);
        }
    }
}
