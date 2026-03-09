package com.cyjh.mobileanjian.ipc.utils;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class RootUtil {
    private static final String OooO00o = "ROOT_UTIL";

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[PHI: r1
  0x0079: PHI (r1v4 java.lang.Process) = (r1v1 java.lang.Process), (r1v2 java.lang.Process), (r1v5 java.lang.Process) binds: [B:19:0x0072, B:22:0x0077, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<java.lang.String> OooO00o(java.lang.String r5, java.util.ArrayList<java.lang.String> r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.lang.Process r1 = r2.exec(r5)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
        L29:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r4.append(r3)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.lang.String r3 = " 2>&1\n"
            r4.append(r3)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r5.write(r3)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            goto L29
        L4e:
            java.lang.String r6 = "exit\n"
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r5.write(r6)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            r5.flush()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
        L5a:
            java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            if (r5 == 0) goto L64
            r0.add(r5)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            goto L5a
        L64:
            r1.waitFor()     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c java.io.IOException -> L73
            if (r1 == 0) goto L7c
            goto L79
        L6a:
            r5 = move-exception
            goto L7d
        L6c:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L7c
            goto L79
        L73:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L7c
        L79:
            r1.destroy()
        L7c:
            return r0
        L7d:
            if (r1 == 0) goto L82
            r1.destroy()
        L82:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.utils.RootUtil.OooO00o(java.lang.String, java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean OooO0O0() throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.lang.Exception -> L47
            java.lang.String r2 = "xu"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.lang.Exception -> L47
            goto L1a
        Lc:
            r1 = move-exception
            r2 = r1
            r1 = r0
            goto L3e
        L10:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L47
            java.lang.String r2 = "su"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L47
        L1a:
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L48
            java.lang.String r0 = "exit\n"
            r2.writeBytes(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            r2.flush()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            r0 = 1
            r1.waitFor()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            r2.close()     // Catch: java.lang.Exception -> L52
            r1.destroy()     // Catch: java.lang.Exception -> L52
            goto L52
        L36:
            r0 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L3e
        L3b:
            r0 = r2
            goto L48
        L3d:
            r2 = move-exception
        L3e:
            if (r0 == 0) goto L43
            r0.close()     // Catch: java.lang.Exception -> L46
        L43:
            r1.destroy()     // Catch: java.lang.Exception -> L46
        L46:
            throw r2
        L47:
            r1 = r0
        L48:
            r2 = 0
            if (r0 == 0) goto L4e
            r0.close()     // Catch: java.lang.Exception -> L51
        L4e:
            r1.destroy()     // Catch: java.lang.Exception -> L51
        L51:
            r0 = 0
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.utils.RootUtil.OooO0O0():boolean");
    }

    public static boolean isRoot() {
        String str = System.getenv("PATH");
        new ArrayList();
        for (String str2 : str.split(":")) {
            File file = new File(str2, "su");
            if (file.exists() && file.canExecute()) {
                return true;
            }
            File file2 = new File(str2, "xu");
            if (file2.exists() && file2.canExecute()) {
                return true;
            }
        }
        return false;
    }
}
