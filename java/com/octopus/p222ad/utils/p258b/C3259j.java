package com.octopus.p222ad.utils.p258b;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3259j {

    /* JADX INFO: renamed from: a */
    private static final int f17903a;

    /* JADX INFO: renamed from: b */
    private static final int f17904b;

    /* JADX INFO: renamed from: c */
    private static final LinkedBlockingQueue<Runnable> f17905c;

    /* JADX INFO: renamed from: d */
    private static final LinkedBlockingQueue<Runnable> f17906d;

    /* JADX INFO: renamed from: e */
    private static final ArrayBlockingQueue<Runnable> f17907e;

    /* JADX INFO: renamed from: f */
    private static final LinkedBlockingQueue<Runnable> f17908f;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f17903a = iAvailableProcessors;
        f17904b = Math.max((iAvailableProcessors / 2) + 1, 4);
        f17905c = new LinkedBlockingQueue<>();
        f17906d = new LinkedBlockingQueue<>();
        f17907e = new ArrayBlockingQueue<>(50);
        f17908f = new LinkedBlockingQueue<>();
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m14992a() {
        return new ThreadPoolExecutor(2, f17904b, 5L, TimeUnit.SECONDS, f17905c, new ThreadFactoryC3258i(5, "Octopus-adsdk-adrequest-thread-"), m14996e());
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m14993b() {
        return new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, f17906d, new ThreadFactoryC3258i(5, "Octopus-adsdk-heartbeat-thread-"), m14996e());
    }

    /* JADX INFO: renamed from: c */
    public static ThreadPoolExecutor m14994c() {
        return new ThreadPoolExecutor(2, 6, 20L, TimeUnit.SECONDS, f17907e, new ThreadFactoryC3258i(5, "Octopus-adsdk-file-log-upload-thread-"), m14996e());
    }

    /* JADX INFO: renamed from: d */
    public static ThreadPoolExecutor m14995d() {
        return new ThreadPoolExecutor(2, f17904b, 20L, TimeUnit.SECONDS, f17908f, new ThreadFactoryC3258i(5, "afIt-"), m14996e());
    }

    /* JADX INFO: renamed from: e */
    public static RejectedExecutionHandler m14996e() {
        return new RejectedExecutionHandler() { // from class: com.octopus.ad.utils.b.j.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }
}
