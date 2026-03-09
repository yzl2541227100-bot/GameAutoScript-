package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, xc0, Disposable {
    private volatile boolean cancelled;
    private final wc0<? super T> downstream;
    private final AtomicLong missedRequested;

    /* JADX INFO: renamed from: qs */
    private QueueSubscription<T> f19519qs;
    private final AtomicReference<xc0> upstream;

    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // p285z2.wc0
        public void onComplete() {
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
        }

        @Override // p285z2.wc0
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public TestSubscriber(long j) {
        this(EmptySubscriber.INSTANCE, j);
    }

    public TestSubscriber(wc0<? super T> wc0Var) {
        this(wc0Var, Long.MAX_VALUE);
    }

    public TestSubscriber(wc0<? super T> wc0Var, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.downstream = wc0Var;
        this.upstream = new AtomicReference<>();
        this.missedRequested = new AtomicLong(j);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static <T> TestSubscriber<T> create(long j) {
        return new TestSubscriber<>(j);
    }

    public static <T> TestSubscriber<T> create(wc0<? super T> wc0Var) {
        return new TestSubscriber<>(wc0Var);
    }

    public static String fusionModeToString(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "SYNC";
        }
        if (i == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i + ")";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.f19519qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i) {
        int i2 = this.establishedFusionMode;
        if (i2 == i) {
            return this;
        }
        if (this.f19519qs == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i) + ", actual: " + fusionModeToString(i2));
    }

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.f19519qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // p285z2.xc0
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override // p285z2.wc0
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // p285z2.wc0
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
        } finally {
            this.done.countDown();
        }
    }

    @Override // p285z2.wc0
    public void onNext(T t) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t);
            if (t == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f19519qs.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.f19519qs.cancel();
                return;
            }
        }
    }

    public void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
    public void onSubscribe(xc0 xc0Var) {
        this.lastThread = Thread.currentThread();
        if (xc0Var == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!this.upstream.compareAndSet(null, xc0Var)) {
            xc0Var.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + xc0Var));
                return;
            }
            return;
        }
        int i = this.initialFusionMode;
        if (i != 0 && (xc0Var instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) xc0Var;
            this.f19519qs = queueSubscription;
            int iRequestFusion = queueSubscription.requestFusion(i);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f19519qs.poll();
                        if (tPoll == null) {
                            this.completions++;
                            return;
                        }
                        this.values.add(tPoll);
                    } catch (Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(xc0Var);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            xc0Var.request(andSet);
        }
        onStart();
    }

    @Override // p285z2.xc0
    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j);
    }

    public final TestSubscriber<T> requestMore(long j) {
        request(j);
        return this;
    }

    public final TestSubscriber<T> setInitialFusionMode(int i) {
        this.initialFusionMode = i;
        return this;
    }
}
