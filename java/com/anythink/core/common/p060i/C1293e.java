package com.anythink.core.common.p060i;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.p072d.C1391a;
import com.anythink.expressad.exoplayer.C1575f;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.anythink.core.common.i.e */
/* JADX INFO: loaded from: classes.dex */
public class C1293e {

    /* JADX INFO: renamed from: d */
    private static C1293e f4823d;

    /* JADX INFO: renamed from: b */
    public long f4825b;

    /* JADX INFO: renamed from: f */
    private Context f4828f;

    /* JADX INFO: renamed from: g */
    private ActivityManager f4829g;

    /* JADX INFO: renamed from: h */
    private C1292d f4830h;

    /* JADX INFO: renamed from: j */
    private boolean f4832j;

    /* JADX INFO: renamed from: k */
    private volatile Integer f4833k;

    /* JADX INFO: renamed from: l */
    private volatile Integer f4834l;

    /* JADX INFO: renamed from: m */
    private volatile Long f4835m;

    /* JADX INFO: renamed from: e */
    private boolean f4827e = false;

    /* JADX INFO: renamed from: i */
    private final File f4831i = Environment.getDataDirectory();

    /* JADX INFO: renamed from: a */
    public final long f4824a = C1575f.f8394a;

    /* JADX INFO: renamed from: c */
    public AtomicInteger f4826c = new AtomicInteger();

    private C1293e() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        this.f4828f = contextM2148f;
        this.f4829g = (ActivityManager) contextM2148f.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f4830h = new C1292d();
    }

    /* JADX INFO: renamed from: a */
    public static C1293e m3713a() {
        if (f4823d == null) {
            synchronized (C1293e.class) {
                if (f4823d == null) {
                    f4823d = new C1293e();
                }
            }
        }
        return f4823d;
    }

    /* JADX INFO: renamed from: i */
    private void m3714i() {
        C1292d c1292d = this.f4830h;
        Context context = this.f4828f;
        ActivityManager activityManager = this.f4829g;
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationContext().getApplicationInfo().flags & 1048576) == 1048576) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        c1292d.f4818d = memoryClass;
        if (C1175n.m2059a().m2141c("t_mem")) {
            return;
        }
        if (this.f4833k == null) {
            this.f4833k = Integer.valueOf(C1355s.m4238b(this.f4828f, C1169h.f3065p, C1169h.f3045J, -1));
        }
        if (this.f4833k.intValue() <= 0) {
            this.f4833k = Integer.valueOf(C1290b.m3692a());
            C1355s.m4235a(this.f4828f, C1169h.f3065p, C1169h.f3045J, this.f4833k.intValue());
        }
        this.f4830h.f4815a = this.f4833k.intValue();
    }

    /* JADX INFO: renamed from: j */
    private void m3715j() {
        if (C1175n.m2059a().m2141c("c_num")) {
            return;
        }
        if (this.f4834l == null) {
            this.f4834l = Integer.valueOf(C1355s.m4238b(this.f4828f, C1169h.f3065p, C1169h.f3046K, -1));
        }
        if (this.f4834l.intValue() <= 0) {
            this.f4834l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
            C1355s.m4235a(this.f4828f, C1169h.f3065p, C1169h.f3046K, this.f4834l.intValue());
        }
        this.f4830h.f4819e = this.f4834l.intValue();
    }

    /* JADX INFO: renamed from: k */
    private void m3716k() {
        if (C1175n.m2059a().m2141c("t_store")) {
            return;
        }
        if (this.f4835m == null) {
            this.f4835m = C1355s.m4232a(this.f4828f, C1169h.f3065p, C1169h.f3047L, (Long) (-1L));
        }
        if (this.f4835m.longValue() <= 0) {
            try {
                StatFs statFs = new StatFs(this.f4831i.getPath());
                this.f4835m = Long.valueOf(((Build.VERSION.SDK_INT >= 18 ? statFs.getBlockCountLong() : statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576);
            } catch (Throwable unused) {
            }
            C1355s.m4236a(this.f4828f, C1169h.f3065p, C1169h.f3047L, this.f4835m.longValue());
        }
        this.f4830h.f4820f = this.f4835m.longValue();
    }

    /* JADX INFO: renamed from: l */
    private long m3717l() {
        try {
            StatFs statFs = new StatFs(this.f4831i.getPath());
            return ((Build.VERSION.SDK_INT >= 18 ? statFs.getAvailableBlocksLong() : statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3718a(C1391a c1391a) {
        this.f4827e = c1391a.m4756c();
        synchronized (this) {
            if (!this.f4832j) {
                C1292d c1292d = this.f4830h;
                Context context = this.f4828f;
                ActivityManager activityManager = this.f4829g;
                int memoryClass = activityManager.getMemoryClass();
                if ((context.getApplicationContext().getApplicationInfo().flags & 1048576) == 1048576) {
                    memoryClass = activityManager.getLargeMemoryClass();
                }
                c1292d.f4818d = memoryClass;
                if (!C1175n.m2059a().m2141c("t_mem")) {
                    if (this.f4833k == null) {
                        this.f4833k = Integer.valueOf(C1355s.m4238b(this.f4828f, C1169h.f3065p, C1169h.f3045J, -1));
                    }
                    if (this.f4833k.intValue() <= 0) {
                        this.f4833k = Integer.valueOf(C1290b.m3692a());
                        C1355s.m4235a(this.f4828f, C1169h.f3065p, C1169h.f3045J, this.f4833k.intValue());
                    }
                    this.f4830h.f4815a = this.f4833k.intValue();
                }
                if (!C1175n.m2059a().m2141c("c_num")) {
                    if (this.f4834l == null) {
                        this.f4834l = Integer.valueOf(C1355s.m4238b(this.f4828f, C1169h.f3065p, C1169h.f3046K, -1));
                    }
                    if (this.f4834l.intValue() <= 0) {
                        this.f4834l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                        C1355s.m4235a(this.f4828f, C1169h.f3065p, C1169h.f3046K, this.f4834l.intValue());
                    }
                    this.f4830h.f4819e = this.f4834l.intValue();
                }
                if (!C1175n.m2059a().m2141c("t_store")) {
                    if (this.f4835m == null) {
                        this.f4835m = C1355s.m4232a(this.f4828f, C1169h.f3065p, C1169h.f3047L, (Long) (-1L));
                    }
                    if (this.f4835m.longValue() <= 0) {
                        try {
                            StatFs statFs = new StatFs(this.f4831i.getPath());
                            this.f4835m = Long.valueOf(((Build.VERSION.SDK_INT >= 18 ? statFs.getBlockCountLong() : statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576);
                        } catch (Throwable unused) {
                        }
                        C1355s.m4236a(this.f4828f, C1169h.f3065p, C1169h.f3047L, this.f4835m.longValue());
                    }
                    this.f4830h.f4820f = this.f4835m.longValue();
                }
                this.f4832j = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1292d m3719b() {
        if (!this.f4827e) {
            return null;
        }
        if (SystemClock.elapsedRealtime() - this.f4825b <= C1575f.f8394a) {
            return this.f4830h;
        }
        this.f4825b = SystemClock.elapsedRealtime();
        this.f4830h.f4822h = C1289a.m3691a();
        this.f4830h.f4816b = C1290b.m3696b();
        this.f4830h.f4821g = m3717l();
        this.f4830h.f4817c = C1290b.m3694a(this.f4829g);
        return this.f4830h;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3720c() {
        this.f4826c.incrementAndGet();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3721d() {
        this.f4826c.decrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized int m3722e() {
        return this.f4826c.get();
    }

    /* JADX INFO: renamed from: f */
    public final int m3723f() {
        if (C1175n.m2059a().m2141c("t_mem")) {
            return 0;
        }
        if (this.f4833k == null) {
            this.f4833k = Integer.valueOf(C1355s.m4238b(this.f4828f, C1169h.f3065p, C1169h.f3045J, -1));
        }
        if (this.f4833k.intValue() > 0) {
            return this.f4833k.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m3724g() {
        if (C1175n.m2059a().m2141c("c_num")) {
            return 0;
        }
        if (this.f4834l == null) {
            this.f4834l = Integer.valueOf(C1355s.m4238b(this.f4828f, C1169h.f3065p, C1169h.f3046K, -1));
        }
        if (this.f4834l.intValue() > 0) {
            return this.f4834l.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final long m3725h() {
        if (C1175n.m2059a().m2141c("t_store")) {
            return 0L;
        }
        if (this.f4835m == null) {
            this.f4835m = C1355s.m4232a(this.f4828f, C1169h.f3065p, C1169h.f3047L, (Long) (-1L));
        }
        if (this.f4835m.longValue() > 0) {
            return this.f4835m.longValue();
        }
        return 0L;
    }
}
