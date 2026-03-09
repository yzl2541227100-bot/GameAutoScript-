package com.octopus.p222ad.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadUtils {

    /* JADX INFO: renamed from: a */
    private static final int f17803a;

    /* JADX INFO: renamed from: b */
    private static final int f17804b;

    /* JADX INFO: renamed from: c */
    private static final ThreadPoolExecutor f17805c;
    public static Handler mMainHandler;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f17803a = iAvailableProcessors;
        int iMax = Math.max(iAvailableProcessors, 5);
        f17804b = iMax;
        f17805c = new ThreadPoolExecutor(iMax, iMax, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128));
        mMainHandler = new Handler(Looper.getMainLooper());
    }

    public static <T> Future<T> runOnThreadPool(Callable<T> callable) {
        return f17805c.submit(callable);
    }

    public static void runOnThreadPool(Runnable runnable) {
        f17805c.execute(runnable);
    }

    public static void runOnUIThread(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            mMainHandler.post(runnable);
        }
    }

    public static void runOnUIThreadByThreadPool(final Runnable runnable) {
        f17805c.execute(new Runnable() { // from class: com.octopus.ad.utils.ThreadUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ThreadUtils.mMainHandler.post(runnable);
            }
        });
    }
}
