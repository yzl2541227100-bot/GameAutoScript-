package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    public final Iterable<? extends T> source;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;

        /* JADX INFO: renamed from: it */
        public Iterator<? extends T> f19440it;
        public boolean once;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.f19440it = it;
        }

        @Override // p285z2.xc0
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f19440it = null;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f19440it;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<? extends T> it = this.f19440it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.f19440it.next(), "Iterator.next() returned a null value");
        }

        @Override // p285z2.xc0
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        public abstract void slowPath(long j);
    }

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final ConditionalSubscriber<? super T> downstream;

        public IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            T next;
            Iterator<? extends T> it = this.f19440it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    next = it.next();
                } catch (Throwable th) {
                    th = th;
                    Exceptions.throwIfFatal(th);
                }
                if (this.cancelled) {
                    return;
                }
                if (next == null) {
                    th = new NullPointerException("Iterator.next() returned a null value");
                    conditionalSubscriber.onError(th);
                    return;
                }
                conditionalSubscriber.tryOnNext(next);
                if (this.cancelled) {
                    return;
                }
                if (!it.hasNext()) {
                    if (this.cancelled) {
                        return;
                    }
                    conditionalSubscriber.onComplete();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void slowPath(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f19440it
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1 = r8.downstream
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L48
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L43
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
            L22:
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.tryOnNext(r6)
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L3c
                r1.onComplete()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                goto L22
            L48:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorConditionalSubscription.slowPath(long):void");
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final wc0<? super T> downstream;

        public IteratorSubscription(wc0<? super T> wc0Var, Iterator<? extends T> it) {
            super(it);
            this.downstream = wc0Var;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            T next;
            Iterator<? extends T> it = this.f19440it;
            wc0<? super T> wc0Var = this.downstream;
            while (!this.cancelled) {
                try {
                    next = it.next();
                } catch (Throwable th) {
                    th = th;
                    Exceptions.throwIfFatal(th);
                }
                if (this.cancelled) {
                    return;
                }
                if (next == null) {
                    th = new NullPointerException("Iterator.next() returned a null value");
                    wc0Var.onError(th);
                    return;
                }
                wc0Var.onNext(next);
                if (this.cancelled) {
                    return;
                }
                if (!it.hasNext()) {
                    if (this.cancelled) {
                        return;
                    }
                    wc0Var.onComplete();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void slowPath(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f19440it
                z2.wc0<? super T> r1 = r8.downstream
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L45
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L40
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
            L22:
                r1.onError(r9)
                return
            L26:
                r1.onNext(r6)
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L3b
                r1.onComplete()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                goto L22
            L45:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorSubscription.slowPath(long):void");
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public static <T> void subscribe(wc0<? super T> wc0Var, Iterator<? extends T> it) {
        try {
            if (it.hasNext()) {
                wc0Var.onSubscribe(wc0Var instanceof ConditionalSubscriber ? new IteratorConditionalSubscription((ConditionalSubscriber) wc0Var, it) : new IteratorSubscription(wc0Var, it));
            } else {
                EmptySubscription.complete(wc0Var);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        try {
            subscribe(wc0Var, this.source.iterator());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
        }
    }
}
