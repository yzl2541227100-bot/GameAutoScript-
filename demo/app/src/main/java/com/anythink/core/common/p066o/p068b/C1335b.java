package com.anythink.core.common.p066o.p068b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.anythink.core.common.o.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1335b {

    /* JADX INFO: renamed from: a */
    public static final int f5177a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f5178b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f5179c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f5180d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f5181e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f5182f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f5183g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f5184h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f5185i = 9;

    /* JADX INFO: renamed from: j */
    public static final int f5186j = 10;

    /* JADX INFO: renamed from: k */
    public static final int f5187k = 11;

    /* JADX INFO: renamed from: l */
    public static final int f5188l = 12;

    /* JADX INFO: renamed from: m */
    public static final int f5189m = 13;

    /* JADX INFO: renamed from: n */
    public static final int f5190n = 14;

    /* JADX INFO: renamed from: o */
    public static final int f5191o = 15;

    /* JADX INFO: renamed from: p */
    public static final int f5192p = 16;

    /* JADX INFO: renamed from: q */
    private static volatile C1335b f5193q;

    /* JADX INFO: renamed from: r */
    private final C1334a f5194r = new C1334a();

    private C1335b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1335b m3998a() {
        if (f5193q == null) {
            synchronized (C1335b.class) {
                if (f5193q == null) {
                    f5193q = new C1335b();
                }
            }
        }
        return f5193q;
    }

    /* JADX INFO: renamed from: a */
    private void m3999a(final Runnable runnable, final long j, int i) {
        if (runnable != null) {
            AbstractRunnableC1337d abstractRunnableC1337d = new AbstractRunnableC1337d() { // from class: com.anythink.core.common.o.b.b.1
                @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
                /* JADX INFO: renamed from: a */
                public final void mo1492a() {
                    long j2 = j;
                    if (j2 > 0) {
                        try {
                            Thread.sleep(j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                    new StringBuilder("thread-").append(m4016b());
                    runnable.run();
                }
            };
            abstractRunnableC1337d.m4014a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            m4004a(abstractRunnableC1337d, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4000b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: c */
    private static void m4001c() {
    }

    /* JADX INFO: renamed from: d */
    private void m4002d(Runnable runnable) {
        m4006a(runnable, 13);
    }

    /* JADX INFO: renamed from: a */
    public final Handler m4003a(int i) {
        return this.f5194r.m3996a(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m4004a(AbstractRunnableC1337d abstractRunnableC1337d, int i) {
        try {
            this.f5194r.m3997a(abstractRunnableC1337d, i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4005a(Runnable runnable) {
        m4007a(runnable, 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m4006a(Runnable runnable, int i) {
        if (m4000b()) {
            m4007a(runnable, i, true);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4007a(Runnable runnable, int i, boolean z) {
        if (z) {
            m3999a(runnable, 0L, i);
        } else if (m4000b()) {
            m3999a(runnable, 0L, i);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4008a(Runnable runnable, long j) {
        m3999a(runnable, j, 2);
    }

    /* JADX INFO: renamed from: b */
    public final void m4009b(Runnable runnable) {
        m4007a(runnable, 13, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m4010c(final Runnable runnable) {
        if (TextUtils.equals(Thread.currentThread().getName(), C1334a.m3994b(6))) {
            runnable.run();
        } else if (runnable != null) {
            AbstractRunnableC1337d abstractRunnableC1337d = new AbstractRunnableC1337d() { // from class: com.anythink.core.common.o.b.b.2
                @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
                /* JADX INFO: renamed from: a */
                public final void mo1492a() {
                    runnable.run();
                }
            };
            abstractRunnableC1337d.m4014a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            m4004a(abstractRunnableC1337d, 6);
        }
    }
}
