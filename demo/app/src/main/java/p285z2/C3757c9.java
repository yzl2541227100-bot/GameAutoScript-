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

/* JADX INFO: renamed from: z2.c9 */
/* JADX INFO: loaded from: classes.dex */
public class C3757c9 {
    private static String OooO00o(Context context) {
        String line;
        String str = "unknown";
        String strOooO0oO = OooO0oO(context, false);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo")));
            while (true) {
                line = bufferedReader.readLine();
                if (line != null) {
                    if (line.startsWith("Hardware")) {
                        line = line.split(":")[1].trim().replaceAll(C4196o4.OooO00o.OooO0Oo, "_");
                        break;
                    }
                } else {
                    break;
                }
            }
            bufferedReader.close();
            str = line;
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        return strOooO0oO + "-" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String OooO0O0() {
        /*
            java.lang.String r0 = ""
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.io.IOException -> L3a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L3a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3a
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.io.IOException -> L3a
            r2.<init>(r3)     // Catch: java.io.IOException -> L3a
            r1.<init>(r2)     // Catch: java.io.IOException -> L3a
            r2 = r0
        L14:
            java.lang.String r3 = r1.readLine()     // Catch: java.io.IOException -> L38
            if (r3 == 0) goto L34
            java.lang.String r4 = "Serial"
            boolean r4 = r3.startsWith(r4)     // Catch: java.io.IOException -> L38
            if (r4 != 0) goto L23
            goto L14
        L23:
            java.lang.String r4 = ":"
            int r4 = r3.indexOf(r4)     // Catch: java.io.IOException -> L38
            int r4 = r4 + 1
            java.lang.String r2 = r3.substring(r4)     // Catch: java.io.IOException -> L38
            java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L38
            goto L14
        L34:
            r1.close()     // Catch: java.io.IOException -> L38
            goto L3b
        L38:
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 != 0) goto L3e
            r2 = r0
        L3e:
            r1 = 0
        L3f:
            int r3 = r2.length()
            if (r1 >= r3) goto L51
            char r3 = r2.charAt(r1)
            r4 = 48
            if (r3 == r4) goto L4e
            goto L51
        L4e:
            int r1 = r1 + 1
            goto L3f
        L51:
            int r3 = r2.length()
            if (r1 != r3) goto L58
            goto L59
        L58:
            r0 = r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3757c9.OooO0O0():java.lang.String");
    }

    private static String OooO0OO(Context context) {
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
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone2");
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

    private static String OooO0Oo(Context context) {
        String strOooO0oO = OooO0oO(context, true);
        String line = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo")));
            while (true) {
                line = bufferedReader.readLine();
                if (line != null) {
                    if (line.startsWith("model name")) {
                        line = line.split(":")[1].trim().replaceAll(C4196o4.OooO00o.OooO0Oo, "_");
                        break;
                    }
                } else {
                    break;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        if (line == null) {
            return strOooO0oO;
        }
        return strOooO0oO + "-" + line;
    }

    public static String OooO0o(Context context) {
        return System.getProperty("os.arch").indexOf("arm") != -1 ? OooO00o(context) : OooO0Oo(context);
    }

    private static String OooO0o0() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "cyjhuser");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return "";
        }
    }

    private static String OooO0oO(Context context, boolean z) {
        StringBuilder sb;
        String str;
        String strOooO0OO = OooO0OO(context);
        String strOooO0O0 = OooO0O0();
        String strOooO0o0 = OooO0o0();
        if (!z || strOooO0OO == null || strOooO0OO == "") {
            if (strOooO0OO != null && strOooO0OO != "") {
                strOooO0O0 = strOooO0OO;
            }
            if (strOooO0O0 != null && strOooO0O0 != "") {
                strOooO0o0 = strOooO0O0;
            }
        } else if (strOooO0o0 == null || strOooO0o0 == "") {
            strOooO0o0 = strOooO0OO;
        } else {
            strOooO0o0 = strOooO0OO + "-" + strOooO0o0;
        }
        if (strOooO0OO == "") {
            sb = new StringBuilder();
            str = "imei:none-";
        } else {
            sb = new StringBuilder();
            str = "imei:";
        }
        sb.append(str);
        sb.append(strOooO0o0);
        return sb.toString();
    }
}
