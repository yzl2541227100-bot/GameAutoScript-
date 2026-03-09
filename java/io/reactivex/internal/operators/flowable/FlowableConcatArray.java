package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    public final boolean delayError;
    public final vc0<? extends T>[] sources;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        public final boolean delayError;
        public final wc0<? super T> downstream;
        public List<Throwable> errors;
        public int index;
        public long produced;
        public final vc0<? extends T>[] sources;
        public final AtomicInteger wip;

        public ConcatArraySubscriber(vc0<? extends T>[] vc0VarArr, boolean z, wc0<? super T> wc0Var) {
            super(false);
            this.downstream = wc0Var;
            this.sources = vc0VarArr;
            this.delayError = z;
            this.wip = new AtomicInteger();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                vc0<? extends T>[] vc0VarArr = this.sources;
                int length = vc0VarArr.length;
                int i = this.index;
                while (i != length) {
                    vc0<? extends T> vc0Var = vc0VarArr[i];
                    if (vc0Var == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.errors;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i) + 1);
                            this.errors = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i++;
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0L;
                            produced(j);
                        }
                        vc0Var.subscribe(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.errors;
                if (list == null) {
                    this.downstream.onComplete();
                } else if (list.size() == 1) {
                    this.downstream.onError(list.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list));
                }
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (!this.delayError) {
                this.downstream.onError(th);
                return;
            }
            List arrayList = this.errors;
            if (arrayList == null) {
                arrayList = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = arrayList;
            }
            arrayList.add(th);
            onComplete();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            setSubscription(xc0Var);
        }
    }

    public FlowableConcatArray(vc0<? extends T>[] vc0VarArr, boolean z) {
        this.sources = vc0VarArr;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, wc0Var);
        wc0Var.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
