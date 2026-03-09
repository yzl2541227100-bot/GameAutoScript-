package p285z2;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.internal.connection.RouteException;
import p285z2.C4152my;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.ny */
/* JADX INFO: loaded from: classes2.dex */
public final class C4189ny {
    public static final /* synthetic */ boolean OooOOOO = false;
    private int OooO;
    public final C4187nw OooO00o;
    private C4152my.OooO00o OooO0O0;
    private C4373sx OooO0OO;
    private final C4557xw OooO0Oo;
    public final AbstractC3855ex OooO0o;
    public final InterfaceC4335rw OooO0o0;
    private final Object OooO0oO;
    private final C4152my OooO0oo;
    private C4078ky OooOO0;
    private boolean OooOO0O;
    private boolean OooOO0o;
    private InterfaceC4300qy OooOOO;
    private boolean OooOOO0;

    /* JADX INFO: renamed from: z2.ny$OooO00o */
    public static final class OooO00o extends WeakReference<C4189ny> {
        public final Object OooO00o;

        public OooO00o(C4189ny c4189ny, Object obj) {
            super(c4189ny);
            this.OooO00o = obj;
        }
    }

    public C4189ny(C4557xw c4557xw, C4187nw c4187nw, InterfaceC4335rw interfaceC4335rw, AbstractC3855ex abstractC3855ex, Object obj) {
        this.OooO0Oo = c4557xw;
        this.OooO00o = c4187nw;
        this.OooO0o0 = interfaceC4335rw;
        this.OooO0o = abstractC3855ex;
        this.OooO0oo = new C4152my(c4187nw, OooOOOo(), interfaceC4335rw, abstractC3855ex);
        this.OooO0oO = obj;
    }

    private C4078ky OooO0o(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C4078ky c4078ky;
        Socket socketOooOOO;
        C4078ky c4078ky2;
        Socket socketOooO0o;
        C4373sx c4373sxOooO0OO;
        boolean z3;
        boolean z4;
        C4152my.OooO00o oooO00o;
        synchronized (this.OooO0Oo) {
            if (this.OooOO0o) {
                throw new IllegalStateException("released");
            }
            if (this.OooOOO != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.OooOOO0) {
                throw new IOException("Canceled");
            }
            c4078ky = this.OooOO0;
            socketOooOOO = OooOOO();
            c4078ky2 = this.OooOO0;
            socketOooO0o = null;
            if (c4078ky2 != null) {
                c4078ky = null;
            } else {
                c4078ky2 = null;
            }
            if (!this.OooOO0O) {
                c4078ky = null;
            }
            if (c4078ky2 == null) {
                AbstractC4484vx.OooO00o.OooO0oo(this.OooO0Oo, this.OooO00o, this, null);
                C4078ky c4078ky3 = this.OooOO0;
                if (c4078ky3 != null) {
                    c4078ky2 = c4078ky3;
                    z3 = true;
                    c4373sxOooO0OO = null;
                } else {
                    c4373sxOooO0OO = this.OooO0OO;
                }
            } else {
                c4373sxOooO0OO = null;
            }
            z3 = false;
        }
        C4558xx.OooO(socketOooOOO);
        if (c4078ky != null) {
            this.OooO0o.OooO0oo(this.OooO0o0, c4078ky);
        }
        if (z3) {
            this.OooO0o.OooO0oO(this.OooO0o0, c4078ky2);
        }
        if (c4078ky2 != null) {
            return c4078ky2;
        }
        if (c4373sxOooO0OO != null || ((oooO00o = this.OooO0O0) != null && oooO00o.OooO0O0())) {
            z4 = false;
        } else {
            this.OooO0O0 = this.OooO0oo.OooO0o0();
            z4 = true;
        }
        synchronized (this.OooO0Oo) {
            if (this.OooOOO0) {
                throw new IOException("Canceled");
            }
            if (z4) {
                List<C4373sx> listOooO00o = this.OooO0O0.OooO00o();
                int size = listOooO00o.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    C4373sx c4373sx = listOooO00o.get(i5);
                    AbstractC4484vx.OooO00o.OooO0oo(this.OooO0Oo, this.OooO00o, this, c4373sx);
                    C4078ky c4078ky4 = this.OooOO0;
                    if (c4078ky4 != null) {
                        this.OooO0OO = c4373sx;
                        c4078ky2 = c4078ky4;
                        z3 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (!z3) {
                if (c4373sxOooO0OO == null) {
                    c4373sxOooO0OO = this.OooO0O0.OooO0OO();
                }
                this.OooO0OO = c4373sxOooO0OO;
                this.OooO = 0;
                c4078ky2 = new C4078ky(this.OooO0Oo, c4373sxOooO0OO);
                OooO00o(c4078ky2, false);
            }
        }
        if (!z3) {
            c4078ky2.OooO0oo(i, i2, i3, i4, z, this.OooO0o0, this.OooO0o);
            OooOOOo().OooO00o(c4078ky2.OooO0O0());
            synchronized (this.OooO0Oo) {
                this.OooOO0O = true;
                AbstractC4484vx.OooO00o.OooOO0o(this.OooO0Oo, c4078ky2);
                if (c4078ky2.OooOOo0()) {
                    socketOooO0o = AbstractC4484vx.OooO00o.OooO0o(this.OooO0Oo, this.OooO00o, this);
                    c4078ky2 = this.OooOO0;
                }
            }
            C4558xx.OooO(socketOooO0o);
        }
        this.OooO0o.OooO0oO(this.OooO0o0, c4078ky2);
        return c4078ky2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.Socket OooO0o0(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L5
            r1.OooOOO = r0
        L5:
            r4 = 1
            if (r3 == 0) goto La
            r1.OooOO0o = r4
        La:
            z2.ky r3 = r1.OooOO0
            if (r3 == 0) goto L4a
            if (r2 == 0) goto L12
            r3.OooOO0O = r4
        L12:
            z2.qy r2 = r1.OooOOO
            if (r2 != 0) goto L4a
            boolean r2 = r1.OooOO0o
            if (r2 != 0) goto L1e
            boolean r2 = r3.OooOO0O
            if (r2 == 0) goto L4a
        L1e:
            r1.OooOO0o(r3)
            z2.ky r2 = r1.OooOO0
            java.util.List<java.lang.ref.Reference<z2.ny>> r2 = r2.OooOOO
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L46
            z2.ky r2 = r1.OooOO0
            long r3 = java.lang.System.nanoTime()
            r2.OooOOOO = r3
            z2.vx r2 = p285z2.AbstractC4484vx.OooO00o
            z2.xw r3 = r1.OooO0Oo
            z2.ky r4 = r1.OooOO0
            boolean r2 = r2.OooO0o0(r3, r4)
            if (r2 == 0) goto L46
            z2.ky r2 = r1.OooOO0
            java.net.Socket r2 = r2.OooO0Oo()
            goto L47
        L46:
            r2 = r0
        L47:
            r1.OooOO0 = r0
            r0 = r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4189ny.OooO0o0(boolean, boolean, boolean):java.net.Socket");
    }

    private C4078ky OooO0oO(int i, int i2, int i3, int i4, boolean z, boolean z3) throws Throwable {
        while (true) {
            C4078ky c4078kyOooO0o = OooO0o(i, i2, i3, i4, z);
            synchronized (this.OooO0Oo) {
                if (c4078kyOooO0o.OooOO0o == 0) {
                    return c4078kyOooO0o;
                }
                if (c4078kyOooO0o.OooOOOo(z3)) {
                    return c4078kyOooO0o;
                }
                OooOO0();
            }
        }
    }

    private void OooOO0o(C4078ky c4078ky) {
        int size = c4078ky.OooOOO.size();
        for (int i = 0; i < size; i++) {
            if (c4078ky.OooOOO.get(i).get() == this) {
                c4078ky.OooOOO.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket OooOOO() {
        C4078ky c4078ky = this.OooOO0;
        if (c4078ky == null || !c4078ky.OooOO0O) {
            return null;
        }
        return OooO0o0(false, false, true);
    }

    private C4115ly OooOOOo() {
        return AbstractC4484vx.OooO00o.OooOOO0(this.OooO0Oo);
    }

    public InterfaceC4300qy OooO(C4151mx c4151mx, InterfaceC4040jx.OooO00o oooO00o, boolean z) {
        try {
            InterfaceC4300qy interfaceC4300qyOooOOo = OooO0oO(oooO00o.OooO0oo(), oooO00o.OooO0O0(), oooO00o.OooO0OO(), c4151mx.OooOo0o(), c4151mx.OooOoo(), z).OooOOo(c4151mx, oooO00o, this);
            synchronized (this.OooO0Oo) {
                this.OooOOO = interfaceC4300qyOooOOo;
            }
            return interfaceC4300qyOooOOo;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    public void OooO00o(C4078ky c4078ky, boolean z) {
        if (this.OooOO0 != null) {
            throw new IllegalStateException();
        }
        this.OooOO0 = c4078ky;
        this.OooOO0O = z;
        c4078ky.OooOOO.add(new OooO00o(this, this.OooO0oO));
    }

    public void OooO0O0() {
        InterfaceC4300qy interfaceC4300qy;
        C4078ky c4078ky;
        synchronized (this.OooO0Oo) {
            this.OooOOO0 = true;
            interfaceC4300qy = this.OooOOO;
            c4078ky = this.OooOO0;
        }
        if (interfaceC4300qy != null) {
            interfaceC4300qy.cancel();
        } else if (c4078ky != null) {
            c4078ky.OooO0oO();
        }
    }

    public InterfaceC4300qy OooO0OO() {
        InterfaceC4300qy interfaceC4300qy;
        synchronized (this.OooO0Oo) {
            interfaceC4300qy = this.OooOOO;
        }
        return interfaceC4300qy;
    }

    public synchronized C4078ky OooO0Oo() {
        return this.OooOO0;
    }

    public boolean OooO0oo() {
        C4152my.OooO00o oooO00o;
        return this.OooO0OO != null || ((oooO00o = this.OooO0O0) != null && oooO00o.OooO0O0()) || this.OooO0oo.OooO0OO();
    }

    public void OooOO0() {
        C4078ky c4078ky;
        Socket socketOooO0o0;
        synchronized (this.OooO0Oo) {
            c4078ky = this.OooOO0;
            socketOooO0o0 = OooO0o0(true, false, false);
            if (this.OooOO0 != null) {
                c4078ky = null;
            }
        }
        C4558xx.OooO(socketOooO0o0);
        if (c4078ky != null) {
            this.OooO0o.OooO0oo(this.OooO0o0, c4078ky);
        }
    }

    public void OooOO0O() {
        C4078ky c4078ky;
        Socket socketOooO0o0;
        synchronized (this.OooO0Oo) {
            c4078ky = this.OooOO0;
            socketOooO0o0 = OooO0o0(false, true, false);
            if (this.OooOO0 != null) {
                c4078ky = null;
            }
        }
        C4558xx.OooO(socketOooO0o0);
        if (c4078ky != null) {
            AbstractC4484vx.OooO00o.OooOOOo(this.OooO0o0, null);
            this.OooO0o.OooO0oo(this.OooO0o0, c4078ky);
            this.OooO0o.OooO00o(this.OooO0o0);
        }
    }

    public Socket OooOOO0(C4078ky c4078ky) {
        if (this.OooOOO != null || this.OooOO0.OooOOO.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<C4189ny> reference = this.OooOO0.OooOOO.get(0);
        Socket socketOooO0o0 = OooO0o0(true, false, false);
        this.OooOO0 = c4078ky;
        c4078ky.OooOOO.add(reference);
        return socketOooO0o0;
    }

    public C4373sx OooOOOO() {
        return this.OooO0OO;
    }

    public void OooOOo(boolean z, InterfaceC4300qy interfaceC4300qy, long j, IOException iOException) {
        C4078ky c4078ky;
        Socket socketOooO0o0;
        boolean z3;
        this.OooO0o.OooOOOo(this.OooO0o0, j);
        synchronized (this.OooO0Oo) {
            if (interfaceC4300qy != null) {
                if (interfaceC4300qy == this.OooOOO) {
                    if (!z) {
                        this.OooOO0.OooOO0o++;
                    }
                    c4078ky = this.OooOO0;
                    socketOooO0o0 = OooO0o0(z, false, true);
                    if (this.OooOO0 != null) {
                        c4078ky = null;
                    }
                    z3 = this.OooOO0o;
                }
            }
            throw new IllegalStateException("expected " + this.OooOOO + " but was " + interfaceC4300qy);
        }
        C4558xx.OooO(socketOooO0o0);
        if (c4078ky != null) {
            this.OooO0o.OooO0oo(this.OooO0o0, c4078ky);
        }
        if (iOException != null) {
            this.OooO0o.OooO0O0(this.OooO0o0, AbstractC4484vx.OooO00o.OooOOOo(this.OooO0o0, iOException));
        } else if (z3) {
            AbstractC4484vx.OooO00o.OooOOOo(this.OooO0o0, null);
            this.OooO0o.OooO00o(this.OooO0o0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x001c, code lost:
    
        if (r7 != okhttp3.internal.http2.ErrorCode.CANCEL) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004e A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:49:0x0003, B:51:0x000a, B:53:0x0012, B:58:0x001e, B:73:0x0044, B:75:0x004e, B:79:0x0054, B:56:0x001a, B:59:0x0021, B:61:0x0025, B:63:0x002b, B:65:0x002f, B:67:0x0035, B:70:0x003b), top: B:87:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooOOo0(java.io.IOException r7) {
        /*
            r6 = this;
            z2.xw r0 = r6.OooO0Oo
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L62
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L21
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch: java.lang.Throwable -> L62
            okhttp3.internal.http2.ErrorCode r7 = r7.errorCode     // Catch: java.lang.Throwable -> L62
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L62
            if (r7 != r1) goto L1a
            int r7 = r6.OooO     // Catch: java.lang.Throwable -> L62
            int r7 = r7 + r4
            r6.OooO = r7     // Catch: java.lang.Throwable -> L62
            if (r7 <= r4) goto L43
            goto L1e
        L1a:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L62
            if (r7 == r1) goto L43
        L1e:
            r6.OooO0OO = r3     // Catch: java.lang.Throwable -> L62
            goto L41
        L21:
            z2.ky r1 = r6.OooOO0     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L43
            boolean r1 = r1.OooOOo0()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L2f
            boolean r1 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L43
        L2f:
            z2.ky r1 = r6.OooOO0     // Catch: java.lang.Throwable -> L62
            int r1 = r1.OooOO0o     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L41
            z2.sx r1 = r6.OooO0OO     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L1e
            if (r7 == 0) goto L1e
            z2.my r5 = r6.OooO0oo     // Catch: java.lang.Throwable -> L62
            r5.OooO00o(r1, r7)     // Catch: java.lang.Throwable -> L62
            goto L1e
        L41:
            r7 = 1
            goto L44
        L43:
            r7 = 0
        L44:
            z2.ky r1 = r6.OooOO0     // Catch: java.lang.Throwable -> L62
            java.net.Socket r7 = r6.OooO0o0(r7, r2, r4)     // Catch: java.lang.Throwable -> L62
            z2.ky r2 = r6.OooOO0     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L54
            boolean r2 = r6.OooOO0O     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L53
            goto L54
        L53:
            r3 = r1
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            p285z2.C4558xx.OooO(r7)
            if (r3 == 0) goto L61
            z2.ex r7 = r6.OooO0o
            z2.rw r0 = r6.OooO0o0
            r7.OooO0oo(r0, r3)
        L61:
            return
        L62:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4189ny.OooOOo0(java.io.IOException):void");
    }

    public String toString() {
        C4078ky c4078kyOooO0Oo = OooO0Oo();
        return c4078kyOooO0Oo != null ? c4078kyOooO0Oo.toString() : this.OooO00o.toString();
    }
}
