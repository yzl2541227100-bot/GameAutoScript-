package com.p188b.p199b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C2573a extends C2598y {

    /* JADX INFO: renamed from: a */
    private static final long f15805a;

    /* JADX INFO: renamed from: c */
    private static final long f15806c;

    /* JADX INFO: renamed from: d */
    private static C2573a f15807d;

    /* JADX INFO: renamed from: e */
    private boolean f15808e;

    /* JADX INFO: renamed from: f */
    private C2573a f15809f;

    /* JADX INFO: renamed from: g */
    private long f15810g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15805a = millis;
        f15806c = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:16:0x003a, B:17:0x003f, B:19:0x0043, B:23:0x004d, B:25:0x0055, B:15:0x0034, B:30:0x005c, B:31:0x0061), top: B:35:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a A[DONT_GENERATE] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void m12974a(com.p188b.p199b.C2573a r7, long r8, boolean r10) {
        /*
            java.lang.Class<com.b.b.a> r0 = com.p188b.p199b.C2573a.class
            monitor-enter(r0)
            com.b.b.a r1 = com.p188b.p199b.C2573a.f15807d     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L16
            com.b.b.a r1 = new com.b.b.a     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            com.p188b.p199b.C2573a.f15807d = r1     // Catch: java.lang.Throwable -> L62
            com.b.b.d r1 = new com.b.b.d     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            r1.start()     // Catch: java.lang.Throwable -> L62
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L62
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r10 == 0) goto L2f
            long r3 = r7.mo13064d()     // Catch: java.lang.Throwable -> L62
            long r3 = r3 - r1
            long r8 = java.lang.Math.min(r8, r3)     // Catch: java.lang.Throwable -> L62
        L2b:
            long r8 = r8 + r1
            r7.f15810g = r8     // Catch: java.lang.Throwable -> L62
            goto L3a
        L2f:
            if (r5 == 0) goto L32
            goto L2b
        L32:
            if (r10 == 0) goto L5c
            long r8 = r7.mo13064d()     // Catch: java.lang.Throwable -> L62
            r7.f15810g = r8     // Catch: java.lang.Throwable -> L62
        L3a:
            long r8 = r7.f15810g     // Catch: java.lang.Throwable -> L62
            long r8 = r8 - r1
            com.b.b.a r10 = com.p188b.p199b.C2573a.f15807d     // Catch: java.lang.Throwable -> L62
        L3f:
            com.b.b.a r3 = r10.f15809f     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L4d
            long r4 = r3.f15810g     // Catch: java.lang.Throwable -> L62
            long r4 = r4 - r1
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4b
            goto L4d
        L4b:
            r10 = r3
            goto L3f
        L4d:
            r7.f15809f = r3     // Catch: java.lang.Throwable -> L62
            r10.f15809f = r7     // Catch: java.lang.Throwable -> L62
            com.b.b.a r7 = com.p188b.p199b.C2573a.f15807d     // Catch: java.lang.Throwable -> L62
            if (r10 != r7) goto L5a
            r0.notify()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)
            return
        L5a:
            monitor-exit(r0)
            return
        L5c:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            throw r7     // Catch: java.lang.Throwable -> L62
        L62:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p199b.C2573a.m12974a(com.b.b.a, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        r1.f15809f = r3.f15809f;
        r3.f15809f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r3 = false;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean m12975a(com.p188b.p199b.C2573a r3) {
        /*
            java.lang.Class<com.b.b.a> r0 = com.p188b.p199b.C2573a.class
            monitor-enter(r0)
            com.b.b.a r1 = com.p188b.p199b.C2573a.f15807d     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            com.b.b.a r2 = r1.f15809f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            com.b.b.a r2 = r3.f15809f     // Catch: java.lang.Throwable -> L19
            r1.f15809f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f15809f = r1     // Catch: java.lang.Throwable -> L19
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
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p199b.C2573a.m12975a(com.b.b.a):boolean");
    }

    /* JADX INFO: renamed from: e */
    public static C2573a m12976e() throws InterruptedException {
        C2573a c2573a = f15807d.f15809f;
        long jNanoTime = System.nanoTime();
        if (c2573a == null) {
            C2573a.class.wait(f15805a);
            if (f15807d.f15809f != null || System.nanoTime() - jNanoTime < f15806c) {
                return null;
            }
            return f15807d;
        }
        long j = c2573a.f15810g - jNanoTime;
        if (j > 0) {
            long j2 = j / 1000000;
            C2573a.class.wait(j2, (int) (j - (1000000 * j2)));
            return null;
        }
        f15807d.f15809f = c2573a.f15809f;
        c2573a.f15809f = null;
        return c2573a;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C2573a m12978g() {
        f15807d = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    public IOException mo12661a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: a */
    public void mo12662a() {
    }

    /* JADX INFO: renamed from: a */
    public final void m12979a(boolean z) throws IOException {
        if (m12980a_() && z) {
            throw mo12661a((IOException) null);
        }
    }

    /* JADX INFO: renamed from: a_ */
    public final boolean m12980a_() {
        if (!this.f15808e) {
            return false;
        }
        this.f15808e = false;
        return m12975a(this);
    }

    /* JADX INFO: renamed from: b */
    public final IOException m12981b(IOException iOException) {
        return !m12980a_() ? iOException : mo12661a(iOException);
    }

    /* JADX INFO: renamed from: c */
    public final void m12982c() {
        if (this.f15808e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jMo13062b_ = mo13062b_();
        boolean zMo13063c_ = mo13063c_();
        if (jMo13062b_ != 0 || zMo13063c_) {
            this.f15808e = true;
            m12974a(this, jMo13062b_, zMo13063c_);
        }
    }
}
