package com.p188b.p189a.p190a.p195e;

import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2596w;
import com.p188b.p199b.InterfaceC2597x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.a.a.e.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C2470ab {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ boolean f15239i = true;

    /* JADX INFO: renamed from: b */
    public long f15241b;

    /* JADX INFO: renamed from: c */
    public final int f15242c;

    /* JADX INFO: renamed from: d */
    public final C2490j f15243d;

    /* JADX INFO: renamed from: e */
    public final C2471ac f15244e;

    /* JADX INFO: renamed from: j */
    private final List<C2483c> f15248j;

    /* JADX INFO: renamed from: k */
    private List<C2483c> f15249k;

    /* JADX INFO: renamed from: l */
    private boolean f15250l;

    /* JADX INFO: renamed from: m */
    private final C2472ad f15251m;

    /* JADX INFO: renamed from: a */
    public long f15240a = 0;

    /* JADX INFO: renamed from: f */
    public final C2473ae f15245f = new C2473ae(this);

    /* JADX INFO: renamed from: g */
    public final C2473ae f15246g = new C2473ae(this);

    /* JADX INFO: renamed from: h */
    public EnumC2482b f15247h = null;

    public C2470ab(int i, C2490j c2490j, boolean z, boolean z3, List<C2483c> list) {
        Objects.requireNonNull(c2490j, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f15242c = i;
        this.f15243d = c2490j;
        this.f15241b = c2490j.f15355m.m12696d();
        C2472ad c2472ad = new C2472ad(this, c2490j.f15354l.m12696d());
        this.f15251m = c2472ad;
        C2471ac c2471ac = new C2471ac(this);
        this.f15244e = c2471ac;
        c2472ad.f15259b = z3;
        c2471ac.f15254b = z;
        this.f15248j = list;
    }

    /* JADX INFO: renamed from: d */
    private boolean m12642d(EnumC2482b enumC2482b) {
        if (!f15239i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.f15247h != null) {
                return false;
            }
            if (this.f15251m.f15259b && this.f15244e.f15254b) {
                return false;
            }
            this.f15247h = enumC2482b;
            notifyAll();
            this.f15243d.m12733b(this.f15242c);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12643a(long j) {
        this.f15241b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12644a(EnumC2482b enumC2482b) {
        if (m12642d(enumC2482b)) {
            this.f15243d.m12735b(this.f15242c, enumC2482b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12645a(InterfaceC2581h interfaceC2581h, int i) throws EOFException {
        if (!f15239i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f15251m.m12660a(interfaceC2581h, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m12646a(List<C2483c> list) {
        boolean zM12647a;
        if (!f15239i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            zM12647a = true;
            this.f15250l = true;
            if (this.f15249k == null) {
                this.f15249k = list;
                zM12647a = m12647a();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f15249k);
                arrayList.add(null);
                arrayList.addAll(list);
                this.f15249k = arrayList;
            }
        }
        if (zM12647a) {
            return;
        }
        this.f15243d.m12733b(this.f15242c);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m12647a() {
        if (this.f15247h != null) {
            return false;
        }
        C2472ad c2472ad = this.f15251m;
        if (c2472ad.f15259b || c2472ad.f15258a) {
            C2471ac c2471ac = this.f15244e;
            if (c2471ac.f15254b || c2471ac.f15253a) {
                if (this.f15250l) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m12648b(EnumC2482b enumC2482b) {
        if (m12642d(enumC2482b)) {
            this.f15243d.m12727a(this.f15242c, enumC2482b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12649b() {
        return this.f15243d.f15344b == ((this.f15242c & 1) == 1);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized List<C2483c> m12650c() {
        List<C2483c> list;
        if (!m12649b()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.f15245f.m12982c();
        while (this.f15249k == null && this.f15247h == null) {
            try {
                m12657i();
            } catch (Throwable th) {
                this.f15245f.m12663b();
                throw th;
            }
        }
        this.f15245f.m12663b();
        list = this.f15249k;
        if (list == null) {
            throw new C2481am(this.f15247h);
        }
        this.f15249k = null;
        return list;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m12651c(EnumC2482b enumC2482b) {
        if (this.f15247h == null) {
            this.f15247h = enumC2482b;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2597x m12652d() {
        return this.f15251m;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC2596w m12653e() {
        synchronized (this) {
            if (!this.f15250l && !m12649b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f15244e;
    }

    /* JADX INFO: renamed from: f */
    public final void m12654f() {
        boolean zM12647a;
        if (!f15239i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f15251m.f15259b = true;
            zM12647a = m12647a();
            notifyAll();
        }
        if (zM12647a) {
            return;
        }
        this.f15243d.m12733b(this.f15242c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12655g() {
        /*
            r2 = this;
            boolean r0 = com.p188b.p189a.p190a.p195e.C2470ab.f15239i
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            monitor-enter(r2)
            com.b.a.a.e.ad r0 = r2.f15251m     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.f15259b     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L28
            boolean r0 = r0.f15258a     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L28
            com.b.a.a.e.ac r0 = r2.f15244e     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.f15254b     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L26
            boolean r0 = r0.f15253a     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            boolean r1 = r2.m12647a()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L36
            com.b.a.a.e.b r0 = com.p188b.p189a.p190a.p195e.EnumC2482b.CANCEL
            r2.m12644a(r0)
            return
        L36:
            if (r1 != 0) goto L3f
            com.b.a.a.e.j r0 = r2.f15243d
            int r1 = r2.f15242c
            r0.m12733b(r1)
        L3f:
            return
        L40:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p195e.C2470ab.m12655g():void");
    }

    /* JADX INFO: renamed from: h */
    public final void m12656h() throws IOException {
        C2471ac c2471ac = this.f15244e;
        if (c2471ac.f15253a) {
            throw new IOException("stream closed");
        }
        if (c2471ac.f15254b) {
            throw new IOException("stream finished");
        }
        if (this.f15247h != null) {
            throw new C2481am(this.f15247h);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12657i() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
