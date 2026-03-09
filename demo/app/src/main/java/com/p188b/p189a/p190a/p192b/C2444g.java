package com.p188b.p189a.p190a.p192b;

import com.p188b.p189a.C2426a;
import com.p188b.p189a.C2532ai;
import com.p188b.p189a.C2546aw;
import com.p188b.p189a.C2560n;
import com.p188b.p189a.p190a.AbstractC2427a;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p193c.InterfaceC2449c;
import com.p188b.p189a.p190a.p195e.C2468a;
import com.p188b.p189a.p190a.p195e.C2481am;
import com.p188b.p189a.p190a.p195e.EnumC2482b;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;

/* JADX INFO: renamed from: com.b.a.a.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2444g {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f15163b = true;

    /* JADX INFO: renamed from: a */
    public final C2426a f15164a;

    /* JADX INFO: renamed from: c */
    private C2546aw f15165c;

    /* JADX INFO: renamed from: d */
    private final C2560n f15166d;

    /* JADX INFO: renamed from: e */
    private final Object f15167e;

    /* JADX INFO: renamed from: f */
    private final C2443f f15168f;

    /* JADX INFO: renamed from: g */
    private int f15169g;

    /* JADX INFO: renamed from: h */
    private C2440c f15170h;

    /* JADX INFO: renamed from: i */
    private boolean f15171i;

    /* JADX INFO: renamed from: j */
    private boolean f15172j;

    /* JADX INFO: renamed from: k */
    private InterfaceC2449c f15173k;

    public C2444g(C2560n c2560n, C2426a c2426a, Object obj) {
        this.f15166d = c2560n;
        this.f15164a = c2426a;
        this.f15168f = new C2443f(c2426a, m12559f());
        this.f15167e = obj;
    }

    /* JADX INFO: renamed from: a */
    private C2440c m12555a(int i, int i2, int i3, boolean z) throws Throwable {
        C2440c c2440c;
        synchronized (this.f15166d) {
            if (this.f15171i) {
                throw new IllegalStateException("released");
            }
            if (this.f15173k != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f15172j) {
                throw new IOException("Canceled");
            }
            C2440c c2440c2 = this.f15170h;
            if (c2440c2 != null && !c2440c2.f15137a) {
                return c2440c2;
            }
            AbstractC2427a.f15087a.mo12502a(this.f15166d, this.f15164a, this);
            C2440c c2440c3 = this.f15170h;
            if (c2440c3 != null) {
                return c2440c3;
            }
            C2546aw c2546awM12554b = this.f15165c;
            if (c2546awM12554b == null) {
                c2546awM12554b = this.f15168f.m12554b();
            }
            synchronized (this.f15166d) {
                this.f15165c = c2546awM12554b;
                this.f15169g = 0;
                c2440c = new C2440c(this.f15166d, c2546awM12554b);
                m12562a(c2440c);
                if (this.f15172j) {
                    throw new IOException("Canceled");
                }
            }
            c2440c.m12535a(i, i2, i3, z);
            m12559f().m12544b(c2440c.mo12534a());
            Socket socketMo12508b = null;
            synchronized (this.f15166d) {
                AbstractC2427a.f15087a.mo12509b(this.f15166d, c2440c);
                if (c2440c.m12542d()) {
                    socketMo12508b = AbstractC2427a.f15087a.mo12508b(this.f15166d, this.f15164a, this);
                    c2440c = this.f15170h;
                }
            }
            C2446c.m12583a(socketMo12508b);
            return c2440c;
        }
    }

    /* JADX INFO: renamed from: a */
    private C2440c m12556a(int i, int i2, int i3, boolean z, boolean z3) throws Throwable {
        while (true) {
            C2440c c2440cM12555a = m12555a(i, i2, i3, z);
            synchronized (this.f15166d) {
                if (c2440cM12555a.f15138b == 0) {
                    return c2440cM12555a;
                }
                if (c2440cM12555a.m12539a(z3)) {
                    return c2440cM12555a;
                }
                m12568d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0059  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.Socket m12557a(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = com.p188b.p189a.p190a.p192b.C2444g.f15163b
            if (r0 != 0) goto L13
            com.b.a.n r0 = r1.f15166d
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            r0 = 0
            if (r4 == 0) goto L18
            r1.f15173k = r0
        L18:
            r4 = 1
            if (r3 == 0) goto L1d
            r1.f15171i = r4
        L1d:
            com.b.a.a.b.c r3 = r1.f15170h
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L25
            r3.f15137a = r4
        L25:
            com.b.a.a.c.c r2 = r1.f15173k
            if (r2 != 0) goto L5d
            boolean r2 = r1.f15171i
            if (r2 != 0) goto L31
            boolean r2 = r3.f15137a
            if (r2 == 0) goto L5d
        L31:
            r1.m12558c(r3)
            com.b.a.a.b.c r2 = r1.f15170h
            java.util.List<java.lang.ref.Reference<com.b.a.a.b.g>> r2 = r2.f15140d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            com.b.a.a.b.c r2 = r1.f15170h
            long r3 = java.lang.System.nanoTime()
            r2.f15141e = r3
            com.b.a.a.a r2 = com.p188b.p189a.p190a.AbstractC2427a.f15087a
            com.b.a.n r3 = r1.f15166d
            com.b.a.a.b.c r4 = r1.f15170h
            boolean r2 = r2.mo12507a(r3, r4)
            if (r2 == 0) goto L59
            com.b.a.a.b.c r2 = r1.f15170h
            java.net.Socket r2 = r2.m12540b()
            goto L5a
        L59:
            r2 = r0
        L5a:
            r1.f15170h = r0
            r0 = r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p192b.C2444g.m12557a(boolean, boolean, boolean):java.net.Socket");
    }

    /* JADX INFO: renamed from: c */
    private void m12558c(C2440c c2440c) {
        int size = c2440c.f15140d.size();
        for (int i = 0; i < size; i++) {
            if (c2440c.f15140d.get(i).get() == this) {
                c2440c.f15140d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: f */
    private C2441d m12559f() {
        return AbstractC2427a.f15087a.mo12503a(this.f15166d);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2449c m12560a() {
        InterfaceC2449c interfaceC2449c;
        synchronized (this.f15166d) {
            interfaceC2449c = this.f15173k;
        }
        return interfaceC2449c;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2449c m12561a(C2532ai c2532ai, boolean z) {
        try {
            InterfaceC2449c interfaceC2449cM12533a = m12556a(c2532ai.m12837a(), c2532ai.m12839b(), c2532ai.m12840c(), c2532ai.m12854q(), z).m12533a(c2532ai, this);
            synchronized (this.f15166d) {
                this.f15173k = interfaceC2449cM12533a;
            }
            return interfaceC2449cM12533a;
        } catch (IOException e) {
            throw new C2442e(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12562a(C2440c c2440c) {
        if (!f15163b && !Thread.holdsLock(this.f15166d)) {
            throw new AssertionError();
        }
        if (this.f15170h != null) {
            throw new IllegalStateException();
        }
        this.f15170h = c2440c;
        c2440c.f15140d.add(new C2445h(this, this.f15167e));
    }

    /* JADX INFO: renamed from: a */
    public final void m12563a(IOException iOException) {
        boolean z;
        Socket socketM12557a;
        synchronized (this.f15166d) {
            if (iOException instanceof C2481am) {
                EnumC2482b enumC2482b = ((C2481am) iOException).f15285a;
                EnumC2482b enumC2482b2 = EnumC2482b.REFUSED_STREAM;
                if (enumC2482b == enumC2482b2) {
                    this.f15169g++;
                }
                if (enumC2482b == enumC2482b2) {
                    if (this.f15169g > 1) {
                    }
                    z = false;
                    socketM12557a = m12557a(z, false, true);
                }
                this.f15165c = null;
                z = true;
                socketM12557a = m12557a(z, false, true);
            } else {
                C2440c c2440c = this.f15170h;
                if (c2440c != null && (!c2440c.m12542d() || (iOException instanceof C2468a))) {
                    if (this.f15170h.f15138b == 0) {
                        C2546aw c2546aw = this.f15165c;
                        if (c2546aw != null && iOException != null) {
                            this.f15168f.m12552a(c2546aw, iOException);
                        }
                        this.f15165c = null;
                    }
                    z = true;
                    socketM12557a = m12557a(z, false, true);
                }
                z = false;
                socketM12557a = m12557a(z, false, true);
            }
        }
        C2446c.m12583a(socketM12557a);
    }

    /* JADX INFO: renamed from: a */
    public final void m12564a(boolean z, InterfaceC2449c interfaceC2449c) {
        Socket socketM12557a;
        synchronized (this.f15166d) {
            if (interfaceC2449c != null) {
                if (interfaceC2449c == this.f15173k) {
                    if (!z) {
                        this.f15170h.f15138b++;
                    }
                    socketM12557a = m12557a(z, false, true);
                }
            }
            throw new IllegalStateException("expected " + this.f15173k + " but was " + interfaceC2449c);
        }
        C2446c.m12583a(socketM12557a);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C2440c m12565b() {
        return this.f15170h;
    }

    /* JADX INFO: renamed from: b */
    public final Socket m12566b(C2440c c2440c) {
        if (!f15163b && !Thread.holdsLock(this.f15166d)) {
            throw new AssertionError();
        }
        if (this.f15173k != null || this.f15170h.f15140d.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<C2444g> reference = this.f15170h.f15140d.get(0);
        Socket socketM12557a = m12557a(true, false, false);
        this.f15170h = c2440c;
        c2440c.f15140d.add(reference);
        return socketM12557a;
    }

    /* JADX INFO: renamed from: c */
    public final void m12567c() {
        Socket socketM12557a;
        synchronized (this.f15166d) {
            socketM12557a = m12557a(false, true, false);
        }
        C2446c.m12583a(socketM12557a);
    }

    /* JADX INFO: renamed from: d */
    public final void m12568d() {
        Socket socketM12557a;
        synchronized (this.f15166d) {
            socketM12557a = m12557a(true, false, false);
        }
        C2446c.m12583a(socketM12557a);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12569e() {
        return this.f15165c != null || this.f15168f.m12553a();
    }

    public final String toString() {
        C2440c c2440cM12565b = m12565b();
        return c2440cM12565b != null ? c2440cM12565b.toString() : this.f15164a.toString();
    }
}
