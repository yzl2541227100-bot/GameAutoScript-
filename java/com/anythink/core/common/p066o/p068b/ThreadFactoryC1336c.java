package com.anythink.core.common.p066o.p068b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.anythink.core.common.o.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1336c implements ThreadFactory {
    /* JADX INFO: renamed from: a */
    private static Thread m4011a(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(runnable);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(runnable);
    }
}
