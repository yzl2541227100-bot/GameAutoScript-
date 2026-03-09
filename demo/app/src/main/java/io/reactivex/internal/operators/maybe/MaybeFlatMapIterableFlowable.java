package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends Flowable<R> {
    public final Function<? super T, ? extends Iterable<? extends R>> mapper;
    public final MaybeSource<T> source;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        public volatile boolean cancelled;
        public final wc0<? super R> downstream;

        /* JADX INFO: renamed from: it */
        public volatile Iterator<? extends R> f19459it;
        public final Function<? super T, ? extends Iterable<? extends R>> mapper;
        public boolean outputFused;
        public final AtomicLong requested = new AtomicLong();
        public Disposable upstream;

        public FlatMapIterableObserver(wc0<? super R> wc0Var, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = wc0Var;
            this.mapper = function;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f19459it = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            wc0<? super R> wc0Var = this.downstream;
            Iterator<? extends R> it = this.f19459it;
            if (this.outputFused && it != null) {
                wc0Var.onNext(null);
                wc0Var.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j = this.requested.get();
                    if (j == Long.MAX_VALUE) {
                        fastPath(wc0Var, it);
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            wc0Var.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.cancelled) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    wc0Var.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                wc0Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            wc0Var.onError(th2);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.produced(this.requested, j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f19459it;
                }
            }
        }

        public void fastPath(wc0<? super R> wc0Var, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    wc0Var.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    if (!it.hasNext()) {
                        wc0Var.onComplete();
                        return;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    wc0Var.onError(th);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f19459it == null;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = this.mapper.apply(t).iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                } else {
                    this.f19459it = it;
                    drain();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f19459it;
            if (it == null) {
                return null;
            }
            R r = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f19459it = null;
            }
            return r;
        }

        @Override // p285z2.xc0
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public MaybeFlatMapIterableFlowable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super R> wc0Var) {
        this.source.subscribe(new FlatMapIterableObserver(wc0Var, this.mapper));
    }
}
