package com.octopus.p222ad.internal.p226b;

import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.l */
/* JADX INFO: loaded from: classes2.dex */
public class C3104l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3107o f17086a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3082a f17087b;

    /* JADX INFO: renamed from: f */
    private volatile Thread f17091f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f17092g;

    /* JADX INFO: renamed from: c */
    private final Object f17088c = new Object();

    /* JADX INFO: renamed from: d */
    private final Object f17089d = new Object();

    /* JADX INFO: renamed from: h */
    private volatile int f17093h = -1;

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f17090e = new AtomicInteger();

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.l$a */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104l.this.m14339e();
        }
    }

    public C3104l(InterfaceC3107o interfaceC3107o, InterfaceC3082a interfaceC3082a) {
        this.f17086a = (InterfaceC3107o) C3103k.m14329a(interfaceC3107o);
        this.f17087b = (InterfaceC3082a) C3103k.m14329a(interfaceC3082a);
    }

    /* JADX INFO: renamed from: b */
    private void m14335b() throws C3105m {
        int i = this.f17090e.get();
        if (i < 1) {
            return;
        }
        this.f17090e.set(0);
        throw new C3105m("Error reading source " + i + " times");
    }

    /* JADX INFO: renamed from: b */
    private void m14336b(long j, long j2) {
        m14346a(j, j2);
        synchronized (this.f17088c) {
            this.f17088c.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m14337c() throws C3105m {
        boolean z = (this.f17091f == null || this.f17091f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.f17092g && !this.f17087b.mo14251d() && !z) {
            this.f17091f = new Thread(new a(), "Source reader for " + this.f17086a);
            this.f17091f.start();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m14338d() throws C3105m {
        synchronized (this.f17088c) {
            try {
                try {
                    this.f17088c.wait(1000L);
                } catch (InterruptedException e) {
                    throw new C3105m("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m14339e() {
        Throwable th;
        int iMo14316a;
        int iMo14246a = 0;
        try {
            iMo14246a = this.f17087b.mo14246a();
            this.f17086a.mo14318a(iMo14246a);
            iMo14316a = this.f17086a.mo14316a();
        } catch (Throwable th2) {
            th = th2;
            iMo14316a = -1;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int iMo14317a = this.f17086a.mo14317a(bArr);
                if (iMo14317a == -1) {
                    m14341g();
                    m14340f();
                    break;
                }
                synchronized (this.f17089d) {
                    if (m14342h()) {
                        return;
                    } else {
                        this.f17087b.mo14248a(bArr, iMo14317a);
                    }
                }
                iMo14246a += iMo14317a;
                m14336b(iMo14246a, iMo14316a);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                this.f17090e.incrementAndGet();
                m14347a(th);
            } finally {
                m14343i();
                m14336b(iMo14246a, iMo14316a);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m14340f() {
        this.f17093h = 100;
        mo14284a(this.f17093h);
    }

    /* JADX INFO: renamed from: g */
    private void m14341g() throws C3105m {
        synchronized (this.f17089d) {
            if (!m14342h() && this.f17087b.mo14246a() == this.f17086a.mo14316a()) {
                this.f17087b.mo14250c();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m14342h() {
        return Thread.currentThread().isInterrupted() || this.f17092g;
    }

    /* JADX INFO: renamed from: i */
    private void m14343i() {
        try {
            this.f17086a.mo14319b();
        } catch (C3105m e) {
            m14347a(new C3105m("Error closing source " + this.f17086a, e));
        }
    }

    /* JADX INFO: renamed from: a */
    public int m14344a(byte[] bArr, long j, int i) throws C3105m {
        C3106n.m14351a(bArr, j, i);
        while (!this.f17087b.mo14251d() && this.f17087b.mo14246a() < ((long) i) + j && !this.f17092g) {
            m14337c();
            m14338d();
            m14335b();
        }
        int iMo14247a = this.f17087b.mo14247a(bArr, j, i);
        if (this.f17087b.mo14251d() && this.f17093h != 100) {
            this.f17093h = 100;
            mo14284a(100);
        }
        return iMo14247a;
    }

    /* JADX INFO: renamed from: a */
    public void m14345a() {
        synchronized (this.f17089d) {
            HaoboLog.m14607d(HaoboLog.proxyCacheLogTag, "Shutdown proxy for " + this.f17086a);
            try {
                this.f17092g = true;
                if (this.f17091f != null) {
                    this.f17091f.interrupt();
                }
                this.f17087b.mo14249b();
            } catch (C3105m e) {
                m14347a(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo14284a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public void m14346a(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j * 100) / j2);
        boolean z = i != this.f17093h;
        if ((j2 >= 0) && z) {
            mo14284a(i);
        }
        this.f17093h = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m14347a(Throwable th) {
        if (th instanceof C3101i) {
            HaoboLog.m14607d(HaoboLog.proxyCacheLogTag, "ProxyCache is interrupted");
        } else {
            HaoboLog.m14610e(HaoboLog.proxyCacheLogTag, "ProxyCache error", th);
        }
    }
}
