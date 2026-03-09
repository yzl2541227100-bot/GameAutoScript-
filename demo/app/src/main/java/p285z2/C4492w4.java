package p285z2;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: z2.w4 */
/* JADX INFO: loaded from: classes.dex */
public class C4492w4 {
    private static final String OooO = "ro.miui.ui.version.name";
    private static final String OooO00o = "Rom";
    public static final String OooO0O0 = "MIUI";
    public static final String OooO0OO = "EMUI";
    public static final String OooO0Oo = "FLYME";
    public static final String OooO0o = "SMARTISAN";
    public static final String OooO0o0 = "OPPO";
    public static final String OooO0oO = "VIVO";
    public static final String OooO0oo = "QIKU";
    private static final String OooOO0 = "ro.build.version.emui";
    private static final String OooOO0O = "ro.build.version.opporom";
    private static final String OooOO0o = "ro.smartisan.version";
    private static String OooOOO = null;
    private static final String OooOOO0 = "ro.vivo.os.version";
    private static String OooOOOO;

    public static boolean OooO() {
        return OooO00o(OooO0O0);
    }

    public static boolean OooO00o(String str) throws Throwable {
        String upperCase;
        String str2 = OooOOO;
        if (str2 != null) {
            return str2.equals(str);
        }
        String strOooO0Oo = OooO0Oo(OooO);
        OooOOOO = strOooO0Oo;
        if (TextUtils.isEmpty(strOooO0Oo)) {
            String strOooO0Oo2 = OooO0Oo(OooOO0);
            OooOOOO = strOooO0Oo2;
            if (TextUtils.isEmpty(strOooO0Oo2)) {
                String strOooO0Oo3 = OooO0Oo(OooOO0O);
                OooOOOO = strOooO0Oo3;
                if (TextUtils.isEmpty(strOooO0Oo3)) {
                    String strOooO0Oo4 = OooO0Oo(OooOOO0);
                    OooOOOO = strOooO0Oo4;
                    if (TextUtils.isEmpty(strOooO0Oo4)) {
                        String strOooO0Oo5 = OooO0Oo(OooOO0o);
                        OooOOOO = strOooO0Oo5;
                        if (TextUtils.isEmpty(strOooO0Oo5)) {
                            String str3 = Build.DISPLAY;
                            OooOOOO = str3;
                            if (str3.toUpperCase().contains(OooO0Oo)) {
                                OooOOO = OooO0Oo;
                                return OooOOO.equals(str);
                            }
                            OooOOOO = "unknown";
                            upperCase = Build.MANUFACTURER.toUpperCase();
                        } else {
                            upperCase = OooO0o;
                        }
                    } else {
                        upperCase = "VIVO";
                    }
                } else {
                    upperCase = "OPPO";
                }
            } else {
                upperCase = OooO0OO;
            }
        } else {
            upperCase = OooO0O0;
        }
        OooOOO = upperCase;
        return OooOOO.equals(str);
    }

    public static String OooO0O0() throws Throwable {
        if (OooOOO == null) {
            OooO00o("");
        }
        return OooOOO;
    }

    public static String OooO0OO() throws Throwable {
        String strOooO0Oo = OooO0Oo(OooO);
        OooOOOO = strOooO0Oo;
        if (!TextUtils.isEmpty(strOooO0Oo)) {
            return OooO0O0;
        }
        String strOooO0Oo2 = OooO0Oo(OooOO0);
        OooOOOO = strOooO0Oo2;
        if (!TextUtils.isEmpty(strOooO0Oo2)) {
            return OooO0OO;
        }
        String strOooO0Oo3 = OooO0Oo(OooOO0O);
        OooOOOO = strOooO0Oo3;
        if (!TextUtils.isEmpty(strOooO0Oo3)) {
            return "OPPO";
        }
        String strOooO0Oo4 = OooO0Oo(OooOOO0);
        OooOOOO = strOooO0Oo4;
        if (!TextUtils.isEmpty(strOooO0Oo4)) {
            return "VIVO";
        }
        String strOooO0Oo5 = OooO0Oo(OooOO0o);
        OooOOOO = strOooO0Oo5;
        if (!TextUtils.isEmpty(strOooO0Oo5)) {
            return OooO0o;
        }
        String str = Build.DISPLAY;
        OooOOOO = str;
        if (str.toUpperCase().contains(OooO0Oo)) {
            return OooO0Oo;
        }
        OooOOOO = "unknown";
        String upperCase = Build.MANUFACTURER.toUpperCase();
        return TextUtils.isEmpty(upperCase) ? String.valueOf(0) : upperCase;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0062: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:24:0x0062 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO0Oo(java.lang.String r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r2.append(r6)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r1 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L61
            r2.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L61
            r2.close()     // Catch: java.io.IOException -> L35
            goto L39
        L35:
            r6 = move-exception
            r6.printStackTrace()
        L39:
            return r1
        L3a:
            r1 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L63
        L3e:
            r1 = move-exception
            r2 = r0
        L40:
            java.lang.String r3 = "Rom"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = "Unable to read prop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L61
            r4.append(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L61
            android.util.Log.e(r3, r6, r1)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r6 = move-exception
            r6.printStackTrace()
        L60:
            return r0
        L61:
            r6 = move-exception
            r0 = r2
        L63:
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r0 = move-exception
            r0.printStackTrace()
        L6d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4492w4.OooO0Oo(java.lang.String):java.lang.String");
    }

    public static boolean OooO0o() {
        return OooO00o(OooO0oo) || OooO00o("360");
    }

    public static String OooO0o0() throws Throwable {
        if (OooOOOO == null) {
            OooO00o("");
        }
        return OooOOOO;
    }

    public static boolean OooO0oO() {
        return OooO00o(OooO0OO);
    }

    public static boolean OooO0oo() {
        return OooO00o(OooO0Oo);
    }

    public static boolean OooOO0() {
        return OooO00o("OPPO");
    }

    public static boolean OooOO0O() {
        return OooO00o(OooO0o);
    }

    public static boolean OooOO0o() {
        return OooO00o("VIVO");
    }
}
