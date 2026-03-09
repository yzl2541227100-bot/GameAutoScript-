package p285z2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class f00 extends d10 {
    private static final long OooO;
    private static final int OooO0oo = 65536;
    private static final long OooOO0;

    @Nullable
    public static f00 OooOO0O;

    @Nullable
    private f00 OooO0o;
    private boolean OooO0o0;
    private long OooO0oO;

    public class OooO00o implements b10 {
        public final /* synthetic */ b10 OoooOoO;

        public OooO00o(b10 b10Var) {
            this.OoooOoO = b10Var;
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            f10.OooO0O0(h00Var.OoooOoo, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                z00 z00Var = h00Var.OoooOoO;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (z00Var.OooO0OO - z00Var.OooO0O0);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    z00Var = z00Var.OooO0o;
                }
                f00.this.OooOOO0();
                try {
                    try {
                        this.OoooOoO.OooOooO(h00Var, j2);
                        j -= j2;
                        f00.this.OooOOOO(true);
                    } catch (IOException e) {
                        throw f00.this.OooOOO(e);
                    }
                } catch (Throwable th) {
                    f00.this.OooOOOO(false);
                    throw th;
                }
            }
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            f00.this.OooOOO0();
            try {
                try {
                    this.OoooOoO.close();
                    f00.this.OooOOOO(true);
                } catch (IOException e) {
                    throw f00.this.OooOOO(e);
                }
            } catch (Throwable th) {
                f00.this.OooOOOO(false);
                throw th;
            }
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
            f00.this.OooOOO0();
            try {
                try {
                    this.OoooOoO.flush();
                    f00.this.OooOOOO(true);
                } catch (IOException e) {
                    throw f00.this.OooOOO(e);
                }
            } catch (Throwable th) {
                f00.this.OooOOOO(false);
                throw th;
            }
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return f00.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.OoooOoO + ")";
        }
    }

    public class OooO0O0 implements c10 {
        public final /* synthetic */ c10 OoooOoO;

        public OooO0O0(c10 c10Var) {
            this.OoooOoO = c10Var;
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.OoooOoO.close();
                    f00.this.OooOOOO(true);
                } catch (IOException e) {
                    throw f00.this.OooOOO(e);
                }
            } catch (Throwable th) {
                f00.this.OooOOOO(false);
                throw th;
            }
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            f00.this.OooOOO0();
            try {
                try {
                    long j2 = this.OoooOoO.read(h00Var, j);
                    f00.this.OooOOOO(true);
                    return j2;
                } catch (IOException e) {
                    throw f00.this.OooOOO(e);
                }
            } catch (Throwable th) {
                f00.this.OooOOOO(false);
                throw th;
            }
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return f00.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.OoooOoO + ")";
        }
    }

    public static final class OooO0OO extends Thread {
        public OooO0OO() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0015, code lost:
        
            r1.OooOo0O();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<z2.f00> r0 = p285z2.f00.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                z2.f00 r1 = p285z2.f00.OooOO0O()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                z2.f00 r2 = p285z2.f00.OooOO0O     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                p285z2.f00.OooOO0O = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.OooOo0O()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: z2.f00.OooO0OO.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        OooO = millis;
        OooOO0 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static f00 OooOO0O() throws InterruptedException {
        f00 f00Var = OooOO0O.OooO0o;
        long jNanoTime = System.nanoTime();
        if (f00Var == null) {
            f00.class.wait(OooO);
            if (OooOO0O.OooO0o != null || System.nanoTime() - jNanoTime < OooOO0) {
                return null;
            }
            return OooOO0O;
        }
        long jOooOOo = f00Var.OooOOo(jNanoTime);
        if (jOooOOo > 0) {
            long j = jOooOOo / 1000000;
            f00.class.wait(j, (int) (jOooOOo - (1000000 * j)));
            return null;
        }
        OooOO0O.OooO0o = f00Var.OooO0o;
        f00Var.OooO0o = null;
        return f00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x000b, code lost:
    
        r1.OooO0o = r3.OooO0o;
        r3.OooO0o = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0012, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean OooOO0o(p285z2.f00 r3) {
        /*
            java.lang.Class<z2.f00> r0 = p285z2.f00.class
            monitor-enter(r0)
            z2.f00 r1 = p285z2.f00.OooOO0O     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            z2.f00 r2 = r1.OooO0o     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            z2.f00 r2 = r3.OooO0o     // Catch: java.lang.Throwable -> L19
            r1.OooO0o = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.OooO0o = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.f00.OooOO0o(z2.f00):boolean");
    }

    private long OooOOo(long j) {
        return this.OooO0oO - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x005a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:40:0x0003, B:42:0x0007, B:43:0x0016, B:46:0x0022, B:47:0x002b, B:52:0x003a, B:53:0x0040, B:55:0x0044, B:58:0x004d, B:59:0x0050, B:61:0x005a, B:51:0x0034, B:64:0x005f, B:65:0x0064), top: B:69:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void OooOOoo(p285z2.f00 r6, long r7, boolean r9) {
        /*
            java.lang.Class<z2.f00> r0 = p285z2.f00.class
            monitor-enter(r0)
            z2.f00 r1 = p285z2.f00.OooOO0O     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
            z2.f00 r1 = new z2.f00     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            p285z2.f00.OooOO0O = r1     // Catch: java.lang.Throwable -> L65
            z2.f00$OooO0OO r1 = new z2.f00$OooO0OO     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r1.start()     // Catch: java.lang.Throwable -> L65
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L65
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.OooO0Oo()     // Catch: java.lang.Throwable -> L65
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L65
        L2b:
            long r7 = r7 + r1
            r6.OooO0oO = r7     // Catch: java.lang.Throwable -> L65
            goto L3a
        L2f:
            if (r5 == 0) goto L32
            goto L2b
        L32:
            if (r9 == 0) goto L5f
            long r7 = r6.OooO0Oo()     // Catch: java.lang.Throwable -> L65
            r6.OooO0oO = r7     // Catch: java.lang.Throwable -> L65
        L3a:
            long r7 = r6.OooOOo(r1)     // Catch: java.lang.Throwable -> L65
            z2.f00 r9 = p285z2.f00.OooOO0O     // Catch: java.lang.Throwable -> L65
        L40:
            z2.f00 r3 = r9.OooO0o     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L50
            long r3 = r3.OooOOo(r1)     // Catch: java.lang.Throwable -> L65
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L50
        L4d:
            z2.f00 r9 = r9.OooO0o     // Catch: java.lang.Throwable -> L65
            goto L40
        L50:
            z2.f00 r7 = r9.OooO0o     // Catch: java.lang.Throwable -> L65
            r6.OooO0o = r7     // Catch: java.lang.Throwable -> L65
            r9.OooO0o = r6     // Catch: java.lang.Throwable -> L65
            z2.f00 r6 = p285z2.f00.OooOO0O     // Catch: java.lang.Throwable -> L65
            if (r9 != r6) goto L5d
            r0.notify()     // Catch: java.lang.Throwable -> L65
        L5d:
            monitor-exit(r0)
            return
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.f00.OooOOoo(z2.f00, long, boolean):void");
    }

    public final IOException OooOOO(IOException iOException) throws IOException {
        return !OooOOOo() ? iOException : OooOOo0(iOException);
    }

    public final void OooOOO0() {
        if (this.OooO0o0) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jOooO = OooO();
        boolean zOooO0o = OooO0o();
        if (jOooO != 0 || zOooO0o) {
            this.OooO0o0 = true;
            OooOOoo(this, jOooO, zOooO0o);
        }
    }

    public final void OooOOOO(boolean z) throws IOException {
        if (OooOOOo() && z) {
            throw OooOOo0(null);
        }
    }

    public final boolean OooOOOo() {
        if (!this.OooO0o0) {
            return false;
        }
        this.OooO0o0 = false;
        return OooOO0o(this);
    }

    public IOException OooOOo0(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final c10 OooOo0(c10 c10Var) {
        return new OooO0O0(c10Var);
    }

    public final b10 OooOo00(b10 b10Var) {
        return new OooO00o(b10Var);
    }

    public void OooOo0O() {
    }
}
