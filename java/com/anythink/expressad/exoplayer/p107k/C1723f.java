package com.anythink.expressad.exoplayer.p107k;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1723f {

    /* JADX INFO: renamed from: a */
    private boolean f9660a;

    /* JADX INFO: renamed from: a */
    private synchronized boolean m8155a(long j) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        while (true) {
            z = this.f9660a;
            if (z || jElapsedRealtime >= j2) {
                break;
            }
            wait(j2 - jElapsedRealtime);
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m8156a() {
        if (this.f9660a) {
            return false;
        }
        this.f9660a = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m8157b() {
        boolean z;
        z = this.f9660a;
        this.f9660a = false;
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8158c() {
        while (!this.f9660a) {
            wait();
        }
    }
}
