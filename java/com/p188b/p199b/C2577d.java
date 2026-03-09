package com.p188b.p199b;

/* JADX INFO: renamed from: com.b.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2577d extends Thread {
    public C2577d() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        r1.mo12662a();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            java.lang.Class<com.b.b.a> r0 = com.p188b.p199b.C2573a.class
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
            com.b.b.a r1 = com.p188b.p199b.C2573a.m12976e()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L0
        Lb:
            com.b.b.a r2 = com.p188b.p199b.C2573a.m12977f()     // Catch: java.lang.Throwable -> L1b
            if (r1 != r2) goto L16
            com.p188b.p199b.C2573a.m12978g()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r1.mo12662a()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.InterruptedException -> L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p199b.C2577d.run():void");
    }
}
