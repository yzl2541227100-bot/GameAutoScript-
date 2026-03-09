package com.anythink.core.common.p066o;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.anythink.china.common.C1082d;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.core.common.o.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1348l {
    /* JADX INFO: renamed from: a */
    public static long m4189a(String str) {
        long jM4197c = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        try {
            jM4197c = file.isDirectory() ? m4197c(file) : m4194b(file);
        } catch (Throwable unused) {
        }
        return jM4197c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[PHI: r0
  0x0057: PHI (r0v4 java.io.File) = (r0v3 java.io.File), (r0v3 java.io.File), (r0v7 java.io.File) binds: [B:10:0x0015, B:12:0x001b, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File m4190a(android.content.Context r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 18
            if (r0 < r2) goto L14
            java.io.File r0 = r7.getExternalFilesDir(r1)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L14
            java.io.File r0 = m4191a(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L15
            return r0
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L57
            boolean r2 = m4196b(r7)
            if (r2 == 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = r7.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.File r0 = m4191a(r2)
            long r2 = m4193b()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L53
            r2 = 1
            goto L54
        L53:
            r2 = 0
        L54:
            if (r2 != 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            if (r1 != 0) goto L6b
            java.io.File r7 = r7.getFilesDir()
            java.io.File r7 = r7.getAbsoluteFile()
            java.lang.String r7 = r7.getAbsolutePath()
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p066o.C1348l.m4190a(android.content.Context):java.io.File");
    }

    /* JADX INFO: renamed from: a */
    private static File m4191a(File file) {
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
    private static boolean m4192a() {
        return m4193b() > 31457280;
    }

    /* JADX INFO: renamed from: b */
    private static long m4193b() {
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

    /* JADX INFO: renamed from: b */
    private static long m4194b(File file) throws Throwable {
        long jAvailable = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return jAvailable;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (Exception e4) {
                e = e4;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return jAvailable;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m4195b(String str) {
        return C1343g.m4123a(str);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m4196b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().checkPermission(C1082d.f2502b, context.getPackageName()) == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m4197c(File file) {
        File[] fileArrListFiles = file.listFiles();
        long jM4197c = 0;
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                jM4197c += fileArrListFiles[i].isDirectory() ? m4197c(fileArrListFiles[i]) : m4194b(fileArrListFiles[i]);
            }
        }
        return jM4197c;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m4198c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
