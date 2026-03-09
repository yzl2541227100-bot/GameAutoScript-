package cn.haorui.sdk.core.download;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: cn.haorui.sdk.core.download.g */
/* JADX INFO: loaded from: classes.dex */
public class C0490g {

    /* JADX INFO: renamed from: b */
    public static final TimeUnit f83b = TimeUnit.HOURS;

    /* JADX INFO: renamed from: c */
    public static final BlockingQueue<Runnable> f84c = new LinkedBlockingQueue(8);

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f85a;

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor m29a() {
        if (this.f85a == null) {
            synchronized (C0490g.class) {
                if (this.f85a == null) {
                    this.f85a = new ThreadPoolExecutor(3, 5, 1L, f83b, f84c, Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
                }
            }
        }
        return this.f85a;
    }
}
