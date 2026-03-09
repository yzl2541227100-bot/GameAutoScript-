package com.anythink.core.common.p066o.p068b;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.anythink.core.common.o.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1334a {

    /* JADX INFO: renamed from: a */
    private static final String f5169a = "TaskBusinessThreads";

    /* JADX INFO: renamed from: b */
    private final ExecutorService f5170b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f5171c;

    /* JADX INFO: renamed from: d */
    private final ExecutorService f5172d;

    /* JADX INFO: renamed from: e */
    private volatile ExecutorService f5173e;

    /* JADX INFO: renamed from: f */
    private volatile ExecutorService f5174f;

    /* JADX INFO: renamed from: g */
    private final ConcurrentHashMap<String, Handler> f5175g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.anythink.core.common.o.b.a$a */
    public class a implements RejectedExecutionHandler {
        private a() {
        }

        public /* synthetic */ a(C1334a c1334a, byte b) {
            this();
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            new StringBuilder("rejectedExecution() >>> called. executor: ").append(threadPoolExecutor);
            C1334a.this.f5170b.execute(runnable);
        }
    }

    public C1334a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f5170b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, new SynchronousQueue(), new ThreadFactoryC1336c());
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int i = iAvailableProcessors + 1;
        int i2 = iAvailableProcessors * 2;
        StringBuilder sb = new StringBuilder("create limit thread pool: corePoolSize = ");
        sb.append(i);
        sb.append(" maxPoolSize = ");
        sb.append(i2);
        byte b = 0;
        this.f5171c = new ThreadPoolExecutor(i, i2, 60L, timeUnit, new LinkedBlockingQueue(100), new ThreadFactoryC1336c(), new a(this, b));
        this.f5172d = new ThreadPoolExecutor(0, 5, 60L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC1336c(), new a(this, b));
    }

    /* JADX INFO: renamed from: a */
    private Handler m3989a(String str) {
        return m3993b(str);
    }

    /* JADX INFO: renamed from: a */
    private static void m3991a() {
    }

    /* JADX INFO: renamed from: a */
    private void m3992a(AbstractRunnableC1337d abstractRunnableC1337d, String str) {
        Handler handlerM3993b = m3993b(str);
        if (handlerM3993b != null) {
            handlerM3993b.post(abstractRunnableC1337d);
        }
    }

    /* JADX INFO: renamed from: b */
    private Handler m3993b(String str) {
        Handler handler;
        Handler handler2 = this.f5175g.get(str);
        if (handler2 == null) {
            synchronized (C1334a.class) {
                try {
                    HandlerThread handlerThread = new HandlerThread(str);
                    handlerThread.setPriority(5);
                    handlerThread.start();
                    StringBuilder sb = new StringBuilder("create handler thread: curThreadId = ");
                    sb.append(Thread.currentThread().getId());
                    sb.append(" curThreadName = ");
                    sb.append(Thread.currentThread().getName());
                    handler = new Handler(handlerThread.getLooper());
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.f5175g.put(str, handler);
                    handler2 = handler;
                } catch (Throwable th2) {
                    th = th2;
                    handler2 = handler;
                    new StringBuilder("getHandler failed: ").append(th.getMessage());
                }
            }
        }
        return handler2;
    }

    /* JADX INFO: renamed from: b */
    public static String m3994b(int i) {
        String strConcat = "default_thread_".concat(String.valueOf(i));
        switch (i) {
            case 1:
                strConcat = "single_pool";
                break;
            case 2:
                strConcat = "normal_pool";
                break;
            case 3:
                strConcat = "handler_tcp_log";
                break;
            case 4:
                strConcat = "image_poll";
                break;
            case 5:
                strConcat = "single_pool_preload_task";
                break;
            case 6:
                strConcat = "normal_pool_network_request";
                break;
            case 7:
                strConcat = "limit_pool_sdk_init";
                break;
            case 8:
                strConcat = "handler_agent_event";
                break;
            case 9:
                strConcat = "handler_agent_tk";
                break;
            case 10:
                strConcat = "normal_pool_http_request";
                break;
            case 11:
                strConcat = "handler_placement_statistics";
                break;
            case 12:
                strConcat = "handler_timeout";
                break;
            case 13:
                strConcat = "limit_pool_on_sub_thread";
                break;
            case 14:
                strConcat = "handler_application_lifecycle";
                break;
            case 15:
                strConcat = "handler_shared_placement";
                break;
            case 16:
                strConcat = "single_pool_save_request_failed_info";
                break;
        }
        return String.format("%s_type_%s", "anythink", strConcat);
    }

    /* JADX INFO: renamed from: b */
    private static void m3995b() {
    }

    /* JADX INFO: renamed from: a */
    public final Handler m3996a(int i) {
        return m3993b(m3994b(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3997a(com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d r10, int r11) {
        /*
            r9 = this;
            java.lang.Class<com.anythink.core.common.o.b.a> r0 = com.anythink.core.common.p066o.p068b.C1334a.class
            java.lang.String r1 = m3994b(r11)
            r10.m4015a(r1)
            r2 = 1
            if (r11 == r2) goto L63
            r2 = 13
            if (r11 == r2) goto L60
            r2 = 16
            if (r11 == r2) goto L37
            r2 = 3
            if (r11 == r2) goto L2d
            r2 = 4
            if (r11 == r2) goto L2a
            r2 = 5
            if (r11 == r2) goto L63
            r0 = 7
            if (r11 == r0) goto L60
            r0 = 8
            if (r11 == r0) goto L2d
            java.util.concurrent.ExecutorService r11 = r9.f5170b
        L26:
            r11.execute(r10)
            return
        L2a:
            java.util.concurrent.ExecutorService r11 = r9.f5172d
            goto L26
        L2d:
            android.os.Handler r11 = r9.m3993b(r1)
            if (r11 == 0) goto L36
            r11.post(r10)
        L36:
            return
        L37:
            java.util.concurrent.ExecutorService r11 = r9.f5174f
            if (r11 != 0) goto L5d
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r11 = r9.f5174f     // Catch: java.lang.Throwable -> L5a
            if (r11 != 0) goto L58
            java.util.concurrent.ThreadPoolExecutor r11 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L5a
            r2 = 0
            r3 = 1
            r4 = 30
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L5a
            r7.<init>()     // Catch: java.lang.Throwable -> L5a
            com.anythink.core.common.o.b.c r8 = new com.anythink.core.common.o.b.c     // Catch: java.lang.Throwable -> L5a
            r8.<init>()     // Catch: java.lang.Throwable -> L5a
            r1 = r11
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a
            r9.f5174f = r11     // Catch: java.lang.Throwable -> L5a
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L5a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L5d:
            java.util.concurrent.ExecutorService r11 = r9.f5174f
            goto L26
        L60:
            java.util.concurrent.ExecutorService r11 = r9.f5171c
            goto L26
        L63:
            java.util.concurrent.ExecutorService r11 = r9.f5173e
            if (r11 != 0) goto L89
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r11 = r9.f5173e     // Catch: java.lang.Throwable -> L86
            if (r11 != 0) goto L84
            java.util.concurrent.ThreadPoolExecutor r11 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L86
            r2 = 0
            r3 = 1
            r4 = 60
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            com.anythink.core.common.o.b.c r8 = new com.anythink.core.common.o.b.c     // Catch: java.lang.Throwable -> L86
            r8.<init>()     // Catch: java.lang.Throwable -> L86
            r1 = r11
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L86
            r9.f5173e = r11     // Catch: java.lang.Throwable -> L86
        L84:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            goto L89
        L86:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L89:
            java.util.concurrent.ExecutorService r11 = r9.f5173e
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p066o.p068b.C1334a.m3997a(com.anythink.core.common.o.b.d, int):void");
    }
}
