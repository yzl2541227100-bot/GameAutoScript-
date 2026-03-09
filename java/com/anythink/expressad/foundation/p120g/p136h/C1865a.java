package com.anythink.expressad.foundation.p120g.p136h;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1865a {

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor f11484a;

    /* JADX INFO: renamed from: b */
    private static ThreadPoolExecutor f11485b;

    /* JADX INFO: renamed from: c */
    private static ThreadPoolExecutor f11486c;

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m9657a() {
        if (f11484a == null) {
            f11484a = new ThreadPoolExecutor(5, 10, 15L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.h.a.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                    threadNewThread.setName("CommonThreadPool");
                    return threadNewThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f11484a;
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m9658b() {
        if (f11486c == null) {
            f11486c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.h.a.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                    threadNewThread.setName("NwtThreadPool");
                    return threadNewThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f11486c;
    }

    /* JADX INFO: renamed from: c */
    private static ThreadPoolExecutor m9659c() {
        if (f11485b == null) {
            f11485b = new ThreadPoolExecutor(5, 200, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.h.a.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(@NonNull Runnable runnable) {
                    Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                    threadNewThread.setName("ReportThreadPool");
                    return threadNewThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f11485b;
    }
}
