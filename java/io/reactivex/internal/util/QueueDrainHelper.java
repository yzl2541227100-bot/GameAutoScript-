package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class QueueDrainHelper {
    public static final long COMPLETED_MASK = Long.MIN_VALUE;
    public static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z3, Observer<?> observer, boolean z4, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z4) {
            if (!z3) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z3, wc0<?> wc0Var, boolean z4, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z4) {
            if (!z3) {
                return false;
            }
            Throwable thError = queueDrain.error();
            if (thError != null) {
                wc0Var.onError(thError);
            } else {
                wc0Var.onComplete();
            }
            return true;
        }
        Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            wc0Var.onError(thError2);
            return true;
        }
        if (!z3) {
            return false;
        }
        wc0Var.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i) {
        return i < 0 ? new SpscLinkedArrayQueue(-i) : new SpscArrayQueue(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        r1 = r15.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0038, code lost:
    
        if (r1 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> r11, io.reactivex.Observer<? super U> r12, boolean r13, io.reactivex.disposables.Disposable r14, io.reactivex.internal.util.ObservableQueueDrain<T, U> r15) {
        /*
            r0 = 1
            r1 = 1
        L2:
            boolean r2 = r15.done()
            boolean r3 = r11.isEmpty()
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r8 = r15
            boolean r2 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L16
            return
        L16:
            boolean r3 = r15.done()
            java.lang.Object r2 = r11.poll()
            if (r2 != 0) goto L22
            r10 = 1
            goto L24
        L22:
            r4 = 0
            r10 = 0
        L24:
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r11
            r8 = r14
            r9 = r15
            boolean r3 = checkTerminated(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L31
            return
        L31:
            if (r10 == 0) goto L3b
            int r1 = -r1
            int r1 = r15.leave(r1)
            if (r1 != 0) goto L2
            return
        L3b:
            r15.accept(r12, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.Observer, boolean, io.reactivex.disposables.Disposable, io.reactivex.internal.util.ObservableQueueDrain):void");
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, wc0<? super U> wc0Var, boolean z, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z3 = tPoll == null;
            if (checkTerminated(zDone, z3, wc0Var, z, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z3) {
                iLeave = queueDrain.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = queueDrain.requested();
                if (jRequested == 0) {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    wc0Var.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain.accept(wc0Var, tPoll) && jRequested != Long.MAX_VALUE) {
                    queueDrain.produced(1L);
                }
            }
        }
    }

    public static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(wc0<? super T> wc0Var, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            wc0Var.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), wc0Var, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        if (j != 0) {
            postCompleteDrain(j2, wc0Var, queue, atomicLong, booleanSupplier);
        }
    }

    public static <T> boolean postCompleteDrain(long j, wc0<? super T> wc0Var, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    wc0Var.onComplete();
                    return true;
                }
                wc0Var.onNext(tPoll);
                j2++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    wc0Var.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j = jAddAndGet;
                    j2 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j, wc0<? super T> wc0Var, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, BackpressureHelper.addCap(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(j | Long.MIN_VALUE, wc0Var, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static void request(xc0 xc0Var, int i) {
        xc0Var.request(i < 0 ? Long.MAX_VALUE : i);
    }
}
