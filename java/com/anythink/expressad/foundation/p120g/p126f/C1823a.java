package com.anythink.expressad.foundation.p120g.p126f;

import android.net.TrafficStats;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1823a {

    /* JADX INFO: renamed from: a */
    private static long f11288a;

    /* JADX INFO: renamed from: b */
    private static long f11289b;

    /* JADX INFO: renamed from: c */
    private static long f11290c;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C1823a f11291a = new C1823a(0);

        private a() {
        }
    }

    private C1823a() {
    }

    public /* synthetic */ C1823a(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C1823a m9484a() {
        return a.f11291a;
    }

    /* JADX INFO: renamed from: b */
    public static long m9485b() {
        return f11289b;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m9486c() {
        if (f11288a == 0) {
            f11288a = SystemClock.elapsedRealtime();
            f11290c = TrafficStats.getTotalRxBytes();
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m9487d() {
        if (f11288a != 0 && f11290c != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f11288a;
            if (jElapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f11290c) * 1000) / jElapsedRealtime;
                        if (totalRxBytes == 0) {
                            f11289b = 1L;
                        } else {
                            f11289b = totalRxBytes;
                        }
                    } else {
                        f11289b = 0L;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m9488e();
        }
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m9488e() {
        f11290c = 0L;
        f11288a = 0L;
    }
}
