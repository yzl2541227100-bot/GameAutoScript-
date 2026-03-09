package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.anythink.china.common.C1082d;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.p123c.C1812b;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import java.io.File;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1884r {

    /* JADX INFO: renamed from: a */
    public static boolean f11598a = false;

    /* JADX INFO: renamed from: b */
    public static String f11599b = "";

    /* JADX INFO: renamed from: c */
    public static char[] f11600c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* JADX INFO: renamed from: d */
    private static final String f11601d = "common-exception";

    /* JADX INFO: renamed from: e */
    private static final String f11602e = "SameSDCardTool";

    /* JADX INFO: renamed from: f */
    private static boolean f11603f = false;

    /* JADX INFO: renamed from: g */
    private static int f11604g = -1;

    /* JADX INFO: renamed from: h */
    private static int f11605h = -1;

    /* JADX INFO: renamed from: i */
    private static int f11606i = -1;

    /* JADX INFO: renamed from: j */
    private static int f11607j = -1;

    /* JADX INFO: renamed from: k */
    private static String f11608k;

    /* JADX INFO: renamed from: a */
    private static File m9785a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    /* JADX INFO: renamed from: a */
    public static String m9786a() {
        return f11608k;
    }

    /* JADX INFO: renamed from: a */
    public static void m9787a(Context context) {
        if (f11603f) {
            return;
        }
        try {
            try {
                f11599b = context.getFilesDir().getAbsolutePath() + File.separator;
                if (context.getPackageManager().checkPermission(C1082d.f2502b, context.getPackageName()) == 0) {
                    f11598a = true;
                } else {
                    f11598a = false;
                }
                m9789b(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            f11599b = context.getFilesDir().getAbsolutePath() + File.separator;
            m9789b(context);
        }
        f11603f = true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9788a(long j) {
        return m9795e() > j;
    }

    /* JADX INFO: renamed from: b */
    private static void m9789b(Context context) {
        String strM9791c = m9791c(context);
        f11608k = strM9791c;
        C1814d.m9405a(new C1812b(strM9791c));
        C1814d.m9403a().m9408b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9790b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0063 A[PHI: r0
  0x0063: PHI (r0v4 java.io.File) = (r0v3 java.io.File), (r0v6 java.io.File) binds: [B:39:0x0015, B:46:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m9791c(android.content.Context r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 18
            if (r0 < r2) goto L12
            java.io.File r0 = r7.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            java.io.File r0 = m9785a(r0)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r0 = r1
        L13:
            boolean r2 = com.anythink.expressad.foundation.p138h.C1884r.f11598a
            if (r2 == 0) goto L63
            if (r0 != 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r3 = "Android"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = "data"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r7.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.File r0 = m9785a(r2)
        L52:
            long r2 = m9795e()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L5f
            r2 = 1
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 != 0) goto L63
            goto L64
        L63:
            r1 = r0
        L64:
            if (r1 == 0) goto L6c
            boolean r0 = r1.exists()
            if (r0 != 0) goto L74
        L6c:
            java.io.File r7 = r7.getFilesDir()
            java.io.File r1 = r7.getAbsoluteFile()
        L74:
            java.lang.String r7 = r1.getAbsolutePath()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1884r.m9791c(android.content.Context):java.lang.String");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m9792c() {
        return f11598a;
    }

    /* JADX INFO: renamed from: d */
    private static int m9793d() {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            long jLongValue = ((Long) C1888v.m9864b(contextM8557e, "freeExternalSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f11605h == -1) {
                f11605h = Long.valueOf((m9795e() / 1000) / 1000).intValue();
                C1888v.m9861a(contextM8557e, "freeExternalSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f11605h;
    }

    /* JADX INFO: renamed from: d */
    private static long m9794d(Context context) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            StatFs statFs = new StatFs(absolutePath);
            statFs.restat(absolutePath);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    private static long m9795e() {
        if (m9790b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m9796f() {
        return m9795e() > 31457280;
    }

    /* JADX INFO: renamed from: g */
    private static int m9797g() {
        if (f11604g == -1) {
            try {
                f11604g = new Long((m9798h() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return f11604g;
    }

    /* JADX INFO: renamed from: h */
    private static long m9798h() {
        if (m9790b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: i */
    private static int m9799i() {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            long jLongValue = ((Long) C1888v.m9864b(contextM8557e, "TotalDataSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f11606i == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f11606i = Long.valueOf(((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1000) / 1000).intValue();
                C1888v.m9861a(contextM8557e, "TotalDataSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f11606i;
    }

    /* JADX INFO: renamed from: j */
    private static int m9800j() {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            long jLongValue = ((Long) C1888v.m9864b(contextM8557e, "FreeDataSize", 0L)).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue > 1800000 || f11607j == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f11607j = Long.valueOf(((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1000) / 1000).intValue();
                C1888v.m9861a(contextM8557e, "FreeDataSize", Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return f11607j;
    }

    /* JADX INFO: renamed from: k */
    private static long m9801k() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* JADX INFO: renamed from: l */
    private static long m9802l() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }
}
