package com.anythink.china.common.p036c;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.anythink.china.common.C1082d;
import com.anythink.china.common.p033a.C1072e;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.io.File;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.china.common.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1081b {

    /* JADX INFO: renamed from: a */
    private static final String f2500a = "anythink_myoffer_download";

    /* JADX INFO: renamed from: a */
    public static String m1543a() {
        File file = null;
        if (m1553e() == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                File externalFilesDir = m1553e().getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(UUID.randomUUID());
                    File file2 = new File(externalFilesDir, sb.toString());
                    if (file2.exists()) {
                        file2.delete();
                    }
                    if (file2.mkdirs()) {
                        file2.delete();
                        file = externalFilesDir.getAbsoluteFile();
                    }
                    if (file != null) {
                        file = new File(file, f2500a);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (file == null) {
            file = new File(m1553e().getFilesDir().getAbsoluteFile() + File.separator + f2500a);
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public static String m1544a(long j, long j2, C1072e.a aVar) {
        try {
            return j + C1801a.f11059bQ + j2 + C1801a.f11059bQ + aVar.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0055 A[Catch: IOException -> 0x0051, TryCatch #6 {IOException -> 0x0051, blocks: (B:102:0x004d, B:106:0x0055, B:108:0x005a), top: B:131:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x005a A[Catch: IOException -> 0x0051, TRY_LEAVE, TryCatch #6 {IOException -> 0x0051, blocks: (B:102:0x004d, B:106:0x0055, B:108:0x005a), top: B:131:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006d A[Catch: IOException -> 0x0069, TryCatch #0 {IOException -> 0x0069, blocks: (B:114:0x0065, B:118:0x006d, B:120:0x0072), top: B:124:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0072 A[Catch: IOException -> 0x0069, TRY_LEAVE, TryCatch #0 {IOException -> 0x0069, blocks: (B:114:0x0065, B:118:0x006d, B:120:0x0072), top: B:124:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStreamReader] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m1545a(java.io.File r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5.exists()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L43
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3a
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L32
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L32
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L62
            r3.close()     // Catch: java.io.IOException -> L27
            r5.close()     // Catch: java.io.IOException -> L27
            r2.close()     // Catch: java.io.IOException -> L27
            goto L2b
        L27:
            r5 = move-exception
            r5.printStackTrace()
        L2b:
            return r0
        L2c:
            r0 = move-exception
            goto L48
        L2e:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L63
        L32:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L48
        L37:
            r5 = move-exception
            r3 = r0
            goto L40
        L3a:
            r5 = move-exception
            r3 = r0
            goto L46
        L3d:
            r5 = move-exception
            r2 = r0
            r3 = r2
        L40:
            r0 = r5
            r5 = r3
            goto L63
        L43:
            r5 = move-exception
            r2 = r0
            r3 = r2
        L46:
            r0 = r5
            r5 = r3
        L48:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L51
            goto L53
        L51:
            r5 = move-exception
            goto L5e
        L53:
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.io.IOException -> L51
        L58:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L51
            goto L61
        L5e:
            r5.printStackTrace()
        L61:
            return r1
        L62:
            r0 = move-exception
        L63:
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.io.IOException -> L69
            goto L6b
        L69:
            r5 = move-exception
            goto L76
        L6b:
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.io.IOException -> L69
        L70:
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.io.IOException -> L69
            goto L79
        L76:
            r5.printStackTrace()
        L79:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.china.common.p036c.C1081b.m1545a(java.io.File):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public static String m1546a(String str) {
        String strM1543a = m1543a();
        if (strM1543a == null) {
            return null;
        }
        return strM1543a + File.separator + C1343g.m4123a(str);
    }

    /* JADX INFO: renamed from: b */
    private static File m1547b(File file) {
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

    /* JADX INFO: renamed from: b */
    private static String m1548b(String str) {
        return C1343g.m4123a(str);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1549b() {
        return m1550c() > 104857600;
    }

    /* JADX INFO: renamed from: c */
    private static long m1550c() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Error unused) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    private static String[] m1551c(String str) {
        return str.split("\\|");
    }

    /* JADX INFO: renamed from: d */
    private static long m1552d() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Error unused) {
            return 0L;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Context m1553e() {
        try {
            return C1175n.m2059a().m2148f().getApplicationContext();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m1554f() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: g */
    private static boolean m1555g() {
        Context contextM1553e = m1553e();
        if (contextM1553e == null) {
            return false;
        }
        try {
            return contextM1553e.getPackageManager().checkPermission(C1082d.f2502b, contextM1553e.getPackageName()) == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
