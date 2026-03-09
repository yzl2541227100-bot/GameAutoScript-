package com.anythink.expressad.exoplayer;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1767x {

    /* JADX INFO: renamed from: a */
    private final b f10089a;

    /* JADX INFO: renamed from: b */
    private final a f10090b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1499ae f10091c;

    /* JADX INFO: renamed from: d */
    private int f10092d;

    /* JADX INFO: renamed from: e */
    private Object f10093e;

    /* JADX INFO: renamed from: f */
    private Handler f10094f;

    /* JADX INFO: renamed from: g */
    private int f10095g;

    /* JADX INFO: renamed from: h */
    private long f10096h = C1500b.f7455b;

    /* JADX INFO: renamed from: i */
    private boolean f10097i = true;

    /* JADX INFO: renamed from: j */
    private boolean f10098j;

    /* JADX INFO: renamed from: k */
    private boolean f10099k;

    /* JADX INFO: renamed from: l */
    private boolean f10100l;

    /* JADX INFO: renamed from: m */
    private boolean f10101m;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.x$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7989a(C1767x c1767x);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.x$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo6125a(int i, Object obj);
    }

    public C1767x(a aVar, b bVar, AbstractC1499ae abstractC1499ae, int i, Handler handler) {
        this.f10090b = aVar;
        this.f10089a = bVar;
        this.f10091c = abstractC1499ae;
        this.f10094f = handler;
        this.f10095g = i;
    }

    /* JADX INFO: renamed from: a */
    private C1767x m8508a(int i, long j) {
        C1711a.m8012b(!this.f10098j);
        C1711a.m8010a(j != C1500b.f7455b);
        if (i < 0 || (!this.f10091c.m6365a() && i >= this.f10091c.mo6366b())) {
            throw new C1755o(this.f10091c, i, j);
        }
        this.f10095g = i;
        this.f10096h = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1767x m8509a(long j) {
        C1711a.m8012b(!this.f10098j);
        this.f10096h = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1767x m8510a(Handler handler) {
        C1711a.m8012b(!this.f10098j);
        this.f10094f = handler;
        return this;
    }

    /* JADX INFO: renamed from: b */
    private C1767x m8511b(boolean z) {
        C1711a.m8012b(!this.f10098j);
        this.f10097i = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    private synchronized C1767x m8512l() {
        C1711a.m8012b(this.f10098j);
        this.f10101m = true;
        m8516a(false);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae m8513a() {
        return this.f10091c;
    }

    /* JADX INFO: renamed from: a */
    public final C1767x m8514a(int i) {
        C1711a.m8012b(!this.f10098j);
        this.f10092d = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1767x m8515a(@Nullable Object obj) {
        C1711a.m8012b(!this.f10098j);
        this.f10093e = obj;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8516a(boolean z) {
        this.f10099k = z | this.f10099k;
        this.f10100l = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final b m8517b() {
        return this.f10089a;
    }

    /* JADX INFO: renamed from: c */
    public final int m8518c() {
        return this.f10092d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m8519d() {
        return this.f10093e;
    }

    /* JADX INFO: renamed from: e */
    public final Handler m8520e() {
        return this.f10094f;
    }

    /* JADX INFO: renamed from: f */
    public final long m8521f() {
        return this.f10096h;
    }

    /* JADX INFO: renamed from: g */
    public final int m8522g() {
        return this.f10095g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8523h() {
        return this.f10097i;
    }

    /* JADX INFO: renamed from: i */
    public final C1767x m8524i() {
        C1711a.m8012b(!this.f10098j);
        if (this.f10096h == C1500b.f7455b) {
            C1711a.m8010a(this.f10097i);
        }
        this.f10098j = true;
        this.f10090b.mo7989a(this);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m8525j() {
        return this.f10101m;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m8526k() {
        boolean z;
        C1711a.m8012b(this.f10098j);
        C1711a.m8012b(this.f10094f.getLooper().getThread() != Thread.currentThread());
        long jElapsedRealtime = 500;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() + 500;
        while (true) {
            z = this.f10100l;
            if (z || jElapsedRealtime <= 0) {
                break;
            }
            wait(jElapsedRealtime);
            jElapsedRealtime = jElapsedRealtime2 - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery time out");
        }
        return this.f10099k;
    }
}
