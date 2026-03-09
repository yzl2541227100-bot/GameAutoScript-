package com.p188b.p189a.p190a.p195e;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2596w;

/* JADX INFO: renamed from: com.b.a.a.e.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C2471ac implements InterfaceC2596w {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f15252c = true;

    /* JADX INFO: renamed from: a */
    public boolean f15253a;

    /* JADX INFO: renamed from: b */
    public boolean f15254b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2470ab f15255d;

    /* JADX INFO: renamed from: e */
    private final C2579f f15256e = new C2579f();

    public C2471ac(C2470ab c2470ab) {
        this.f15255d = c2470ab;
    }

    /* JADX INFO: renamed from: a */
    private void m12658a(boolean z) {
        C2470ab c2470ab;
        long jMin;
        C2470ab c2470ab2;
        synchronized (this.f15255d) {
            this.f15255d.f15246g.m12982c();
            while (true) {
                try {
                    c2470ab = this.f15255d;
                    if (c2470ab.f15241b > 0 || this.f15254b || this.f15253a || c2470ab.f15247h != null) {
                        break;
                    } else {
                        c2470ab.m12657i();
                    }
                } finally {
                }
            }
            c2470ab.f15246g.m12663b();
            this.f15255d.m12656h();
            jMin = Math.min(this.f15255d.f15241b, this.f15256e.m13006b());
            c2470ab2 = this.f15255d;
            c2470ab2.f15241b -= jMin;
        }
        c2470ab2.f15246g.m12982c();
        try {
            C2470ab c2470ab3 = this.f15255d;
            c2470ab3.f15243d.m12731a(c2470ab3.f15242c, z && jMin == this.f15256e.m13006b(), this.f15256e, jMin);
        } finally {
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return this.f15255d.f15246g;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) {
        if (!f15252c && Thread.holdsLock(this.f15255d)) {
            throw new AssertionError();
        }
        this.f15256e.mo12633a_(c2579f, j);
        while (this.f15256e.m13006b() >= PlaybackStateCompat.ACTION_PREPARE) {
            m12658a(false);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!f15252c && Thread.holdsLock(this.f15255d)) {
            throw new AssertionError();
        }
        synchronized (this.f15255d) {
            if (this.f15253a) {
                return;
            }
            if (!this.f15255d.f15244e.f15254b) {
                if (this.f15256e.m13006b() > 0) {
                    while (this.f15256e.m13006b() > 0) {
                        m12658a(true);
                    }
                } else {
                    C2470ab c2470ab = this.f15255d;
                    c2470ab.f15243d.m12731a(c2470ab.f15242c, true, (C2579f) null, 0L);
                }
            }
            synchronized (this.f15255d) {
                this.f15253a = true;
            }
            this.f15255d.f15243d.f15358p.m12674b();
            this.f15255d.m12655g();
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final void flush() {
        if (!f15252c && Thread.holdsLock(this.f15255d)) {
            throw new AssertionError();
        }
        synchronized (this.f15255d) {
            this.f15255d.m12656h();
        }
        while (this.f15256e.m13006b() > 0) {
            m12658a(false);
            this.f15255d.f15243d.f15358p.m12674b();
        }
    }
}
