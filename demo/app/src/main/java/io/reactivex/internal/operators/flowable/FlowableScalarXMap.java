package io.reactivex.internal.operators.flowable;

import android.Manifest;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p285z2.vc0;
import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        public final Function<? super T, ? extends vc0<? extends R>> mapper;
        public final T value;

        public ScalarXMapFlowable(T t, Function<? super T, ? extends vc0<? extends R>> function) {
            this.value = t;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(wc0<? super R> wc0Var) {
            try {
                vc0 vc0Var = (vc0) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (!(vc0Var instanceof Callable)) {
                    vc0Var.subscribe(wc0Var);
                    return;
                }
                try {
                    Object objCall = ((Callable) vc0Var).call();
                    if (objCall == null) {
                        EmptySubscription.complete(wc0Var);
                    } else {
                        wc0Var.onSubscribe(new ScalarSubscription(wc0Var, objCall));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, wc0Var);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, wc0Var);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t, Function<? super T, ? extends vc0<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(vc0<T> vc0Var, wc0<? super R> wc0Var, Function<? super T, ? extends vc0<? extends R>> function) {
        if (!(vc0Var instanceof Callable)) {
            return false;
        }
        try {
            Manifest manifest = (Object) ((Callable) vc0Var).call();
            if (manifest == null) {
                EmptySubscription.complete(wc0Var);
                return true;
            }
            vc0 vc0Var2 = (vc0) ObjectHelper.requireNonNull(function.apply(manifest), "The mapper returned a null Publisher");
            if (vc0Var2 instanceof Callable) {
                Object objCall = ((Callable) vc0Var2).call();
                if (objCall == null) {
                    EmptySubscription.complete(wc0Var);
                    return true;
                }
                wc0Var.onSubscribe(new ScalarSubscription(wc0Var, objCall));
            } else {
                vc0Var2.subscribe(wc0Var);
            }
            return true;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, wc0Var);
            return true;
        }
    }
}
