package com.p188b.p189a.p190a.p195e;

import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2597x;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C2472ad implements InterfaceC2597x {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f15257c = true;

    /* JADX INFO: renamed from: a */
    public boolean f15258a;

    /* JADX INFO: renamed from: b */
    public boolean f15259b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2470ab f15260d;

    /* JADX INFO: renamed from: e */
    private final C2579f f15261e = new C2579f();

    /* JADX INFO: renamed from: f */
    private final C2579f f15262f = new C2579f();

    /* JADX INFO: renamed from: g */
    private final long f15263g;

    public C2472ad(C2470ab c2470ab, long j) {
        this.f15260d = c2470ab;
        this.f15263g = j;
    }

    /* JADX INFO: renamed from: b */
    private void m12659b() {
        this.f15260d.f15245f.m12982c();
        while (this.f15262f.m13006b() == 0 && !this.f15259b && !this.f15258a) {
            try {
                C2470ab c2470ab = this.f15260d;
                if (c2470ab.f15247h != null) {
                    break;
                } else {
                    c2470ab.m12657i();
                }
            } finally {
                this.f15260d.f15245f.m12663b();
            }
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        synchronized (this.f15260d) {
            m12659b();
            if (this.f15258a) {
                throw new IOException("stream closed");
            }
            if (this.f15260d.f15247h != null) {
                throw new C2481am(this.f15260d.f15247h);
            }
            if (this.f15262f.m13006b() == 0) {
                return -1L;
            }
            C2579f c2579f2 = this.f15262f;
            long jMo12513a = c2579f2.mo12513a(c2579f, Math.min(j, c2579f2.m13006b()));
            C2470ab c2470ab = this.f15260d;
            long j2 = c2470ab.f15240a + jMo12513a;
            c2470ab.f15240a = j2;
            if (j2 >= c2470ab.f15243d.f15354l.m12696d() / 2) {
                C2470ab c2470ab2 = this.f15260d;
                c2470ab2.f15243d.m12726a(c2470ab2.f15242c, c2470ab2.f15240a);
                this.f15260d.f15240a = 0L;
            }
            synchronized (this.f15260d.f15243d) {
                C2490j c2490j = this.f15260d.f15243d;
                long j3 = c2490j.f15352j + jMo12513a;
                c2490j.f15352j = j3;
                if (j3 >= c2490j.f15354l.m12696d() / 2) {
                    C2490j c2490j2 = this.f15260d.f15243d;
                    c2490j2.m12726a(0, c2490j2.f15352j);
                    this.f15260d.f15243d.f15352j = 0L;
                }
            }
            return jMo12513a;
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15260d.f15245f;
    }

    /* JADX INFO: renamed from: a */
    public final void m12660a(InterfaceC2581h interfaceC2581h, long j) throws EOFException {
        boolean z;
        boolean z3;
        boolean z4;
        if (!f15257c && Thread.holdsLock(this.f15260d)) {
            throw new AssertionError();
        }
        while (j > 0) {
            synchronized (this.f15260d) {
                z = this.f15259b;
                z3 = true;
                z4 = this.f15262f.m13006b() + j > this.f15263g;
            }
            if (z4) {
                interfaceC2581h.mo13023f(j);
                this.f15260d.m12648b(EnumC2482b.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                interfaceC2581h.mo13023f(j);
                return;
            }
            long jMo12513a = interfaceC2581h.mo12513a(this.f15261e, j);
            if (jMo12513a == -1) {
                throw new EOFException();
            }
            j -= jMo12513a;
            synchronized (this.f15260d) {
                if (this.f15262f.m13006b() != 0) {
                    z3 = false;
                }
                this.f15262f.m12995a(this.f15261e);
                if (z3) {
                    this.f15260d.notifyAll();
                }
            }
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15260d) {
            this.f15258a = true;
            this.f15262f.m13038o();
            this.f15260d.notifyAll();
        }
        this.f15260d.m12655g();
    }
}
