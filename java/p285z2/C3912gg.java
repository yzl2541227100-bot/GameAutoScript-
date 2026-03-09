package p285z2;

import android.util.Log;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: z2.gg */
/* JADX INFO: loaded from: classes2.dex */
public final class C3912gg {
    private static final String OooO00o = "CmdUtils";
    private static boolean OooO0O0 = false;
    public static final String OooO0OO = "su";
    public static final String OooO0Oo = "xu";
    public static final String OooO0o0 = "sh";

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|69|62|3|10|71|11|73|12|(4:13|(1:15)(1:76)|68|43)|16|60|17|21|68|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r6.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: IOException -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x0080, blocks: (B:21:0x007c, B:42:0x009f), top: B:69:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:68:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO00o(java.lang.String r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12 java.io.IOException -> L16
            java.lang.String r3 = "su"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12 java.io.IOException -> L16
            goto L20
        Le:
            r6 = move-exception
            r4 = r1
            goto La4
        L12:
            r6 = move-exception
            r4 = r1
            goto L90
        L16:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            java.lang.String r3 = "xu"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
        L20:
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8d
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8d
            java.lang.String r1 = "CmdUtils"
            android.util.Log.i(r1, r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.append(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "\n"
            r1.append(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r3.writeBytes(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r3.flush()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "exit\n"
            r3.writeBytes(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r3.flush()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
        L56:
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            if (r6 == 0) goto L71
            java.lang.String r1 = "result"
            android.util.Log.d(r1, r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.append(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.append(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            goto L56
        L71:
            r2.waitFor()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r3.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r6 = move-exception
            r6.printStackTrace()
        L7c:
            r4.close()     // Catch: java.io.IOException -> L80
            goto La2
        L80:
            r6 = move-exception
            r6.printStackTrace()
            goto La2
        L85:
            r6 = move-exception
            goto L8b
        L87:
            r6 = move-exception
            goto L8f
        L89:
            r6 = move-exception
            r4 = r1
        L8b:
            r1 = r3
            goto La4
        L8d:
            r6 = move-exception
            r4 = r1
        L8f:
            r1 = r3
        L90:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto L9d
            r1.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r6 = move-exception
            r6.printStackTrace()
        L9d:
            if (r4 == 0) goto La2
            r4.close()     // Catch: java.io.IOException -> L80
        La2:
            return r0
        La3:
            r6 = move-exception
        La4:
            if (r1 == 0) goto Lae
            r1.close()     // Catch: java.io.IOException -> Laa
            goto Lae
        Laa:
            r0 = move-exception
            r0.printStackTrace()
        Lae:
            if (r4 == 0) goto Lb8
            r4.close()     // Catch: java.io.IOException -> Lb4
            goto Lb8
        Lb4:
            r0 = move-exception
            r0.printStackTrace()
        Lb8:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3912gg.OooO00o(java.lang.String):java.lang.String");
    }

    private static boolean OooO0O0() {
        String str;
        if (OooO0O0) {
            str = "mHaveRoot = true, have root!";
        } else {
            if (OooO0OO("echo test") != -1) {
                Log.i(OooO00o, "have root!");
                OooO0O0 = true;
                return OooO0O0;
            }
            str = "not root!";
        }
        Log.i(OooO00o, str);
        return OooO0O0;
    }

    private static int OooO0OO(String str) throws Throwable {
        DataOutputStream dataOutputStream = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("su");
                DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                try {
                    Log.i(OooO00o, str);
                    dataOutputStream2.writeBytes(str + "\n");
                    dataOutputStream2.flush();
                    dataOutputStream2.writeBytes("exit\n");
                    dataOutputStream2.flush();
                    processExec.waitFor();
                    int iExitValue = processExec.exitValue();
                    try {
                        dataOutputStream2.close();
                        return iExitValue;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return iExitValue;
                    }
                } catch (Exception e2) {
                    e = e2;
                    dataOutputStream = dataOutputStream2;
                    e.printStackTrace();
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }
}
