package com.tramini.plugin.p261a.p269h.p271b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.b.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3354a {

    /* JADX INFO: renamed from: a */
    private static C3354a f18205a;

    /* JADX INFO: renamed from: b */
    private final ExecutorService f18206b = new ThreadPoolExecutor(0, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.tramini.plugin.a.h.b.a.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("tramini_plugin");
            return threadNewThread;
        }
    });

    /* JADX INFO: renamed from: a */
    public static C3354a m15289a() {
        if (f18205a == null) {
            f18205a = new C3354a();
        }
        return f18205a;
    }

    /* JADX INFO: renamed from: a */
    public final void m15290a(AbstractRunnableC3355b abstractRunnableC3355b) {
        ExecutorService executorService = this.f18206b;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f18206b.execute(abstractRunnableC3355b);
    }

    /* JADX INFO: renamed from: a */
    public final void m15291a(Runnable runnable) {
        m15292a(runnable, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m15292a(final Runnable runnable, final long j) {
        if (runnable != null) {
            AbstractRunnableC3355b abstractRunnableC3355b = new AbstractRunnableC3355b() { // from class: com.tramini.plugin.a.h.b.a.2
                @Override // com.tramini.plugin.p261a.p269h.p271b.AbstractRunnableC3355b
                /* JADX INFO: renamed from: a */
                public final void mo15197a() {
                    try {
                        long j2 = j;
                        if (j2 > 0) {
                            Thread.sleep(j2);
                        }
                    } catch (InterruptedException unused) {
                    }
                    runnable.run();
                }
            };
            abstractRunnableC3355b.m15294a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            m15290a(abstractRunnableC3355b);
        }
    }
}
