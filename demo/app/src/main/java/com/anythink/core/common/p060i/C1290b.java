package com.anythink.core.common.p060i;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: com.anythink.core.common.i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1290b {
    /* JADX INFO: renamed from: a */
    public static int m3692a() {
        return m3693a(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004a A[EXC_TOP_SPLITTER, PHI: r3
  0x004a: PHI (r3v3 java.io.FileReader) = (r3v2 java.io.FileReader), (r3v4 java.io.FileReader) binds: [B:20:0x0048, B:28:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m3693a(int r8) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "L3Byb2MvbWVtaW5mbw=="
            java.lang.String r2 = com.anythink.core.common.p066o.C1340d.m4030b(r2)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L4e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4f
            r4 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4f
            java.lang.String r1 = ""
            r4 = 0
        L17:
            if (r4 >= r8) goto L20
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            int r4 = r4 + 1
            goto L17
        L20:
            java.lang.String r8 = "\\s+"
            java.lang.String[] r8 = r1.split(r8)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r1 = 1
            r8 = r8[r1]     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            long r4 = r8.longValue()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r6 = 1024(0x400, double:5.06E-321)
            long r4 = r4 / r6
            int r8 = (int) r4
            r2.close()     // Catch: java.io.IOException -> L38
        L38:
            r3.close()     // Catch: java.io.IOException -> L3b
        L3b:
            return r8
        L3c:
            r1 = r2
            goto L41
        L3e:
            r1 = r2
            goto L4f
        L40:
            r3 = r1
        L41:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L47
            goto L48
        L47:
        L48:
            if (r3 == 0) goto L59
        L4a:
            r3.close()     // Catch: java.io.IOException -> L59
            goto L59
        L4e:
            r3 = r1
        L4f:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.io.IOException -> L55
            goto L56
        L55:
        L56:
            if (r3 == 0) goto L59
            goto L4a
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p060i.C1290b.m3693a(int):int");
    }

    /* JADX INFO: renamed from: a */
    public static int m3694a(ActivityManager activityManager) {
        try {
            activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
            return (int) ((Runtime.getRuntime().totalMemory() / 1024) / 1024);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m3695a(Context context, ActivityManager activityManager) {
        return (context.getApplicationContext().getApplicationInfo().flags & 1048576) == 1048576 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
    }

    /* JADX INFO: renamed from: b */
    public static int m3696b() {
        return m3693a(3);
    }
}
