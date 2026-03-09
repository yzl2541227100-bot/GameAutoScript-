package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    public final long delay;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    public static final class DelayObserver<T> implements Observer<T>, Disposable {
        public final long delay;
        public final boolean delayError;
        public final Observer<? super T> downstream;
        public final TimeUnit unit;
        public Disposable upstream;

        /* JADX INFO: renamed from: w */
        public final Scheduler.Worker f19467w;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onComplete();
                } finally {
                    DelayObserver.this.f19467w.dispose();
                }
            }
        }

        public final class OnError implements Runnable {
            private final Throwable throwable;

            public OnError(Throwable th) {
                this.throwable = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onError(this.throwable);
                } finally {
                    DelayObserver.this.f19467w.dispose();
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
            private final Object f19468t;

            /* JADX WARN: Failed to parse method signature: (TT)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TT)V at position 2 ('T'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:336)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
             */
            public OnNext(Object obj) {
                this.f19468t = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelayObserver.this.downstream.onNext((Object) this.f19468t);
            }
        }

        public DelayObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.downstream = observer;
            this.delay = j;
            this.unit = timeUnit;
            this.f19467w = worker;
            this.delayError = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.f19467w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f19467w.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f19467w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f19467w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f19467w.schedule(new OnNext(t), this.delay, this.unit);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DelayObserver(this.delayError ? observer : new SerializedObserver(observer), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
