package io.reactivex.internal.util;

import p285z2.wc0;

/* JADX INFO: loaded from: classes2.dex */
public interface QueueDrain<T, U> {
    boolean accept(wc0<? super U> wc0Var, T t);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i);

    long produced(long j);

    long requested();
}
