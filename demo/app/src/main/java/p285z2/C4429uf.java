package p285z2;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import p285z2.C4196o4;

/* JADX INFO: renamed from: z2.uf */
/* JADX INFO: loaded from: classes2.dex */
public final class C4429uf {
    private static String OooO00o = "";

    private static String OooO(Context context) {
        String line;
        String str = "unknown";
        String strOooO0OO = OooO0OO(context, true);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo")));
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.startsWith("model name")) {
                    line = line.split(":")[1].trim().replaceAll(C4196o4.OooO00o.OooO0Oo, "_");
                    break;
                }
            }
            bufferedReader.close();
            str = line;
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        return strOooO0OO + "[x86]@_@" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String OooO00o() {
        /*
            java.lang.String r0 = ""
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.io.IOException -> L39
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L39
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L39
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.io.IOException -> L39
            r2.<init>(r3)     // Catch: java.io.IOException -> L39
            r1.<init>(r2)     // Catch: java.io.IOException -> L39
            r2 = r0
        L14:
            java.lang.String r3 = r1.readLine()     // Catch: java.io.IOException -> L37
            if (r3 == 0) goto L33
            java.lang.String r4 = "Serial"
            boolean r4 = r3.startsWith(r4)     // Catch: java.io.IOException -> L37
            if (r4 == 0) goto L14
            java.lang.String r4 = ":"
            int r4 = r3.indexOf(r4)     // Catch: java.io.IOException -> L37
            int r4 = r4 + 1
            java.lang.String r2 = r3.substring(r4)     // Catch: java.io.IOException -> L37
            java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L37
            goto L14
        L33:
            r1.close()     // Catch: java.io.IOException -> L37
            goto L3a
        L37:
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 != 0) goto L3d
            r2 = r0
        L3d:
            r1 = 0
        L3e:
            int r3 = r2.length()
            if (r1 >= r3) goto L4f
            char r3 = r2.charAt(r1)
            r4 = 48
            if (r3 != r4) goto L4f
            int r1 = r1 + 1
            goto L3e
        L4f:
            int r3 = r2.length()
            if (r1 != r3) goto L56
            goto L57
        L56:
            r0 = r2
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4429uf.OooO00o():java.lang.String");
    }

    public static String OooO0O0(Context context) {
        String strOooO0oO = OooO0oO(context);
        return (strOooO0oO.endsWith("null") || strOooO0oO.endsWith("unknown")) ? OooO(context) : strOooO0oO;
    }

    private static String OooO0OO(Context context, boolean z) {
        String strValueOf;
        String str;
        String strOooO0o = OooO0o(context);
        String strOooO00o = OooO00o();
        String strOooO0Oo = OooO0Oo();
        if (!z || strOooO0o == null || strOooO0o == "") {
            if (strOooO0o != null && strOooO0o != "") {
                strOooO00o = strOooO0o;
            }
            if (strOooO00o != null && strOooO00o != "") {
                strOooO0Oo = strOooO00o;
            }
        } else if (strOooO0Oo == null || strOooO0Oo == "") {
            strOooO0Oo = strOooO0o;
        } else {
            strOooO0Oo = strOooO0o + "-" + strOooO0Oo;
        }
        if (strOooO0o == "") {
            strValueOf = String.valueOf(strOooO0Oo);
            str = "imei:none-";
        } else {
            strValueOf = String.valueOf(strOooO0Oo);
            str = "imei:";
        }
        return str.concat(strValueOf);
    }

    private static String OooO0Oo() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "cyjhuser");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return "";
        }
    }

    private static String OooO0o(Context context) {
        int phoneType;
        String deviceId;
        String deviceId2;
        StringBuilder sb;
        TelephonyManager telephonyManager;
        int phoneType2 = 0;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            phoneType = telephonyManager.getPhoneType();
        } catch (Exception unused) {
            phoneType = 0;
        }
        try {
            deviceId = telephonyManager.getDeviceId();
        } catch (Exception unused2) {
            deviceId = "";
        }
        try {
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
            phoneType2 = telephonyManager2.getPhoneType();
            deviceId2 = telephonyManager2.getDeviceId();
        } catch (Exception unused3) {
            deviceId2 = "";
        }
        if (phoneType == 1) {
            if (phoneType2 == 2) {
                sb = new StringBuilder();
                sb.append(deviceId);
                sb.append(C1801a.f11059bQ);
                sb.append(deviceId2);
                return sb.toString();
            }
            return deviceId;
        }
        if (phoneType2 != 1) {
            if (phoneType != 2) {
                return "";
            }
            return deviceId;
        }
        if (phoneType != 2) {
            return deviceId2;
        }
        sb = new StringBuilder();
        sb.append(deviceId2);
        sb.append(C1801a.f11059bQ);
        sb.append(deviceId);
        return sb.toString();
    }

    public static boolean OooO0o0(Context context) {
        String strOooO0oO = OooO0oO(context);
        return strOooO0oO.endsWith("null") || strOooO0oO.endsWith("unknown");
    }

    private static String OooO0oO(Context context) {
        String line;
        String str = "unknown";
        String strOooO0OO = OooO0OO(context, false);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo")));
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.startsWith("Hardware")) {
                    line = line.split(":")[1].trim().replaceAll(C4196o4.OooO00o.OooO0Oo, "_");
                    break;
                }
            }
            bufferedReader.close();
            str = line;
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        return strOooO0OO + "[arm]@_@" + str;
    }

    private static String OooO0oo(Context context) {
        return OooO0OO(context, true) + "[x86]@_@model";
    }

    private static String OooOO0(Context context) {
        String str = OooO00o;
        if (str != "") {
            return str;
        }
        String strOooO0oO = OooO0oO(context);
        if (strOooO0oO.endsWith("null") || strOooO0oO.endsWith("unknown")) {
            strOooO0oO = OooO0OO(context, true) + "[x86]@_@model";
        }
        OooO00o = strOooO0oO;
        return strOooO0oO;
    }
}
