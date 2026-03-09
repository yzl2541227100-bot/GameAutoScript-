package com.p188b.p189a;

/* JADX INFO: renamed from: com.b.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2561o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2560n f15761a;

    public RunnableC2561o(C2560n c2560n) {
        this.f15761a = c2560n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            long jM12936a = this.f15761a.m12936a(System.nanoTime());
            if (jM12936a == -1) {
                return;
            }
            if (jM12936a > 0) {
                long j = jM12936a / 1000000;
                long j2 = jM12936a - (1000000 * j);
                synchronized (this.f15761a) {
                    try {
                        this.f15761a.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
