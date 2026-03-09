package com.octopus.p222ad.utils.p258b;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.i */
/* JADX INFO: loaded from: classes2.dex */
public class ThreadFactoryC3258i implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f17898a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    private final ThreadGroup f17899b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f17900c = new AtomicInteger(1);

    /* JADX INFO: renamed from: d */
    private final String f17901d;

    /* JADX INFO: renamed from: e */
    private final int f17902e;

    public ThreadFactoryC3258i(int i, String str) {
        StringBuilder sb;
        this.f17902e = i;
        SecurityManager securityManager = System.getSecurityManager();
        this.f17899b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        if (TextUtils.isEmpty(str)) {
            sb = new StringBuilder();
            str = "Octopus-adsdk-background-";
        } else {
            sb = new StringBuilder();
        }
        sb.append(str);
        sb.append(f17898a.getAndIncrement());
        sb.append("-thread-");
        this.f17901d = sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031 A[PHI: r0
  0x0031: PHI (r0v4 int) = (r0v2 int), (r0v3 int) binds: [B:6:0x002f, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.ThreadFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Thread newThread(java.lang.Runnable r8) {
        /*
            r7 = this;
            java.lang.Thread r6 = new java.lang.Thread
            java.lang.ThreadGroup r1 = r7.f17899b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r7.f17901d
            r0.append(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17900c
            int r2 = r2.getAndIncrement()
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4)
            boolean r8 = r6.isDaemon()
            if (r8 == 0) goto L2c
            r8 = 0
            r6.setDaemon(r8)
        L2c:
            int r8 = r7.f17902e
            r0 = 1
            if (r8 != r0) goto L35
        L31:
            r6.setPriority(r0)
            goto L40
        L35:
            int r8 = r6.getPriority()
            r0 = 5
            if (r8 == r0) goto L31
            r8 = 3
            r6.setPriority(r8)
        L40:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.utils.p258b.ThreadFactoryC3258i.newThread(java.lang.Runnable):java.lang.Thread");
    }
}
