package com.anythink.expressad.exoplayer.p107k;

import com.anythink.expressad.exoplayer.C1500b;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C1714ac {

    /* JADX INFO: renamed from: a */
    public static final long f9617a = Long.MAX_VALUE;

    /* JADX INFO: renamed from: b */
    private static final long f9618b = 8589934592L;

    /* JADX INFO: renamed from: c */
    private long f9619c;

    /* JADX INFO: renamed from: d */
    private long f9620d;

    /* JADX INFO: renamed from: e */
    private volatile long f9621e = C1500b.f7455b;

    public C1714ac(long j) {
        m8031c(j);
    }

    /* JADX INFO: renamed from: b */
    private long m8029b() {
        return this.f9619c;
    }

    /* JADX INFO: renamed from: c */
    private long m8030c() {
        if (this.f9621e != C1500b.f7455b) {
            return this.f9621e + this.f9620d;
        }
        long j = this.f9619c;
        return j != Long.MAX_VALUE ? j : C1500b.f7455b;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m8031c(long j) {
        C1711a.m8012b(this.f9621e == C1500b.f7455b);
        this.f9619c = j;
    }

    /* JADX INFO: renamed from: d */
    private static long m8032d(long j) {
        return (j * 1000000) / 90000;
    }

    /* JADX INFO: renamed from: d */
    private void m8033d() {
        this.f9621e = C1500b.f7455b;
    }

    /* JADX INFO: renamed from: e */
    private static long m8034e(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m8035e() {
        while (this.f9621e == C1500b.f7455b) {
            wait();
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m8036a() {
        if (this.f9619c == Long.MAX_VALUE) {
            return 0L;
        }
        return this.f9621e == C1500b.f7455b ? C1500b.f7455b : this.f9620d;
    }

    /* JADX INFO: renamed from: a */
    public final long m8037a(long j) {
        if (j == C1500b.f7455b) {
            return C1500b.f7455b;
        }
        if (this.f9621e != C1500b.f7455b) {
            long j2 = (this.f9621e * 90000) / 1000000;
            long j3 = (4294967296L + j2) / f9618b;
            long j4 = ((j3 - 1) * f9618b) + j;
            j += j3 * f9618b;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return m8038b((j * 1000000) / 90000);
    }

    /* JADX INFO: renamed from: b */
    public final long m8038b(long j) {
        if (j == C1500b.f7455b) {
            return C1500b.f7455b;
        }
        if (this.f9621e != C1500b.f7455b) {
            this.f9621e = j;
        } else {
            long j2 = this.f9619c;
            if (j2 != Long.MAX_VALUE) {
                this.f9620d = j2 - j;
            }
            synchronized (this) {
                this.f9621e = j;
                notifyAll();
            }
        }
        return j + this.f9620d;
    }
}
