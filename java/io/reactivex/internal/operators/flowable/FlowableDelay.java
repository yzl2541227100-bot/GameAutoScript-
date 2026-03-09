package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p285z2.wc0;
import p285z2.xc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long delay;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, xc0 {
        public final long delay;
        public final boolean delayError;
        public final wc0<? super T> downstream;
        public final TimeUnit unit;
        public xc0 upstream;

        /* JADX INFO: renamed from: w */
        public final Scheduler.Worker f19434w;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f19434w.dispose();
                }
            }
        }

        public final class OnError implements Runnable {

            /* JADX INFO: renamed from: t */
            private final Throwable f19435t;

            public OnError(Throwable th) {
                this.f19435t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f19435t);
                } finally {
                    DelaySubscriber.this.f19434w.dispose();
                }
            }
        }

        /* JADX WARN: Field signature parse error: t
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TT at position 1 ('T'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:161)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:37)
         */
        public final class OnNext implements Runnable {

            /* JADX INFO: renamed from: t */
            private final Object f19436t;

            /* JADX WARN: Failed to parse method signature: (TT)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TT)V at position 2 ('T'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:336)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
             */
            public OnNext(Object obj) {
                this.f19436t = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext((Object) this.f19436t);
            }
        }

        public DelaySubscriber(wc0<? super T> wc0Var, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.downstream = wc0Var;
            this.delay = j;
            this.unit = timeUnit;
            this.f19434w = worker;
            this.delayError = z;
        }

        @Override // p285z2.xc0
        public void cancel() {
            this.upstream.cancel();
            this.f19434w.dispose();
        }

        @Override // p285z2.wc0
        public void onComplete() {
            this.f19434w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // p285z2.wc0
        public void onError(Throwable th) {
            this.f19434w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // p285z2.wc0
        public void onNext(T t) {
            this.f19434w.schedule(new OnNext(t), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p285z2.wc0
        public void onSubscribe(xc0 xc0Var) {
            if (SubscriptionHelper.validate(this.upstream, xc0Var)) {
                this.upstream = xc0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p285z2.xc0
        public void request(long j) {
            this.upstream.request(j);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(wc0<? super T> wc0Var) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? wc0Var : new SerializedSubscriber(wc0Var), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
