package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p285z2.vc0;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final vc0<? extends T> other;
    public final Scheduler scheduler;
    public final long timeout;
    public final TimeUnit unit;

    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        public final SubscriptionArbiter arbiter;
        public final wc0<? super T> downstream;

        public FallbackSubscriber(wc0<? super T> wc0Var, SubscriptionArbiter subscriptionArbiter) {
            this.downstream = wc0Var;
            this.arbiter = subscriptionArbiter;
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            this.arbiter.setSubscription(xc0Var);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        public long consumed;
        public final wc0<? super T> downstream;
        public vc0<? extends T> fallback;
        public final AtomicLong index;
        public final SequentialDisposable task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<xc0> upstream;
        public final Scheduler.Worker worker;

        public TimeoutFallbackSubscriber(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler.Worker worker, vc0<? extends T> vc0Var) {
            super(true);
            this.downstream = wc0Var;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = vc0Var;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p285z2.xc0
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.setOnce(this.upstream, xc0Var)) {
                setSubscription(xc0Var);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    produced(j2);
                }
                vc0<? extends T> vc0Var = this.fallback;
                this.fallback = null;
                vc0Var.subscribe(new FallbackSubscriber(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j, this), this.timeout, this.unit));
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xc0, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        public final wc0<? super T> downstream;
        public final long timeout;
        public final TimeUnit unit;
        public final Scheduler.Worker worker;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicReference<xc0> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        public TimeoutSubscriber(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.downstream = wc0Var;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // p285z2.xc0
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, xc0Var);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j, this), this.timeout, this.unit));
        }
    }

    public interface TimeoutSupport {
        void onTimeout(long j);
    }

    public static final class TimeoutTask implements Runnable {
        public final long idx;
        public final TimeoutSupport parent;

        public TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.idx = j;
            this.parent = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onTimeout(this.idx);
        }
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, vc0<? extends T> vc0Var) {
        super(flowable);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = vc0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        FlowableSubscriber<? super T> flowableSubscriber;
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(wc0Var, this.timeout, this.unit, this.scheduler.createWorker());
            wc0Var.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startTimeout(0L);
            flowableSubscriber = timeoutSubscriber;
        } else {
            TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(wc0Var, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
            wc0Var.onSubscribe(timeoutFallbackSubscriber);
            timeoutFallbackSubscriber.startTimeout(0L);
            flowableSubscriber = timeoutFallbackSubscriber;
        }
        this.source.subscribe((FlowableSubscriber) flowableSubscriber);
    }
}
