package com.anythink.core.common.p064m;

import android.os.SystemClock;
import com.anythink.core.common.p051b.C1175n;

/* JADX INFO: renamed from: com.anythink.core.common.m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1314c {

    /* JADX INFO: renamed from: a */
    public long f5006a;

    /* JADX INFO: renamed from: b */
    public long f5007b;

    /* JADX INFO: renamed from: c */
    public Runnable f5008c;

    /* JADX INFO: renamed from: d */
    public boolean f5009d;

    /* JADX INFO: renamed from: e */
    public boolean f5010e;

    /* JADX INFO: renamed from: f */
    public InterfaceRunnableC1313b f5011f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1312a f5012g;

    /* JADX INFO: renamed from: com.anythink.core.common.m.c$1 */
    public class AnonymousClass1 implements InterfaceRunnableC1313b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1314c c1314c = C1314c.this;
            c1314c.f5009d = false;
            c1314c.f5007b = -1L;
            if (c1314c.f5010e) {
                C1175n.m2059a().m2135b(C1314c.this.f5008c);
            } else {
                C1175n.m2059a();
                C1175n.m2076c(C1314c.this.f5008c);
            }
        }
    }

    public C1314c(long j, Runnable runnable) {
        this.f5009d = false;
        this.f5010e = true;
        this.f5012g = C1315d.m3806a();
        this.f5011f = new InterfaceRunnableC1313b() { // from class: com.anythink.core.common.m.c.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1314c c1314c = C1314c.this;
                c1314c.f5009d = false;
                c1314c.f5007b = -1L;
                if (c1314c.f5010e) {
                    C1175n.m2059a().m2135b(C1314c.this.f5008c);
                } else {
                    C1175n.m2059a();
                    C1175n.m2076c(C1314c.this.f5008c);
                }
            }
        };
        this.f5007b = j;
        this.f5008c = runnable;
    }

    public C1314c(long j, Runnable runnable, byte b) {
        this(j, runnable);
        this.f5010e = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3802a() {
        if (this.f5007b >= 0 && !this.f5009d) {
            this.f5009d = true;
            this.f5006a = SystemClock.elapsedRealtime();
            this.f5012g.mo3800a(this.f5011f, this.f5007b, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3803b() {
        if (this.f5009d) {
            this.f5009d = false;
            this.f5007b -= SystemClock.elapsedRealtime() - this.f5006a;
            this.f5012g.mo3801b(this.f5011f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3804c() {
        this.f5009d = false;
        this.f5012g.mo3801b(this.f5011f);
        this.f5007b = -1L;
    }
}
