package com.anythink.china.common.p033a.p034a;

import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.anythink.china.common.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1068a {

    /* JADX INFO: renamed from: a */
    public static final int f2430a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f2431b = 2;

    /* JADX INFO: renamed from: c */
    private static C1068a f2432c;

    /* JADX INFO: renamed from: d */
    private ExecutorService f2433d;

    /* JADX INFO: renamed from: com.anythink.china.common.a.a.a$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractRunnableC1337d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f2434a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f2435b;

        public AnonymousClass1(Runnable runnable) {
            this.f2435b = runnable;
        }

        @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
        /* JADX INFO: renamed from: a */
        public final void mo1492a() {
            try {
                Thread.sleep(this.f2434a);
            } catch (InterruptedException unused) {
            }
            new StringBuilder("thread-").append(m4016b());
            this.f2435b.run();
        }
    }

    public C1068a() {
        this.f2433d = null;
        this.f2433d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: a */
    public static C1068a m1493a() {
        if (f2432c == null) {
            f2432c = new C1068a();
        }
        return f2432c;
    }

    /* JADX INFO: renamed from: a */
    private static void m1494a(C1068a c1068a) {
        f2432c = c1068a;
    }

    /* JADX INFO: renamed from: a */
    private void m1495a(Runnable runnable) {
        if (runnable != null) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(runnable);
            anonymousClass1.m4014a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            m1499a((AbstractRunnableC1337d) anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1496b() {
        this.f2433d.shutdown();
    }

    /* JADX INFO: renamed from: b */
    private void m1497b(AbstractRunnableC1337d abstractRunnableC1337d) {
        m1499a(abstractRunnableC1337d);
    }

    /* JADX INFO: renamed from: b */
    private void m1498b(Runnable runnable) {
        if (runnable != null) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(runnable);
            anonymousClass1.m4014a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            m1499a((AbstractRunnableC1337d) anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1499a(AbstractRunnableC1337d abstractRunnableC1337d) {
        this.f2433d.execute(abstractRunnableC1337d);
    }
}
