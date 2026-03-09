package p285z2;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: z2.t4 */
/* JADX INFO: loaded from: classes.dex */
public class C4381t4 {
    private static final int OooO = 17;
    private static ConnectivityManager OooO00o = null;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 2;
    public static final int OooO0oO = -1;
    private static final int OooO0oo = 16;
    private static final int OooOO0 = 18;
    private static final int OooOO0O = 1;

    private C4381t4() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean OooO(Context context) {
        NetworkInfo networkInfoOooO00o = OooO00o(context);
        return networkInfoOooO00o != null && networkInfoOooO00o.isAvailable() && networkInfoOooO00o.getSubtype() == 13;
    }

    private static NetworkInfo OooO00o(Context context) {
        if (OooO00o == null) {
            OooO00o = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return OooO00o.getActiveNetworkInfo();
    }

    public static boolean OooO0O0(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0OO(android.content.Context r3) {
        /*
            android.net.NetworkInfo r3 = OooO00o(r3)
            r0 = 5
            r1 = 1
            if (r3 == 0) goto L49
            boolean r2 = r3.isAvailable()
            if (r2 == 0) goto L49
            int r2 = r3.getType()
            if (r2 != r1) goto L16
            r0 = 1
            goto L4a
        L16:
            int r1 = r3.getType()
            if (r1 != 0) goto L4a
            int r1 = r3.getSubtype()
            r2 = 3
            switch(r1) {
                case 1: goto L46;
                case 2: goto L46;
                case 3: goto L44;
                case 4: goto L46;
                case 5: goto L44;
                case 6: goto L44;
                case 7: goto L46;
                case 8: goto L44;
                case 9: goto L44;
                case 10: goto L44;
                case 11: goto L46;
                case 12: goto L44;
                case 13: goto L41;
                case 14: goto L44;
                case 15: goto L44;
                case 16: goto L46;
                case 17: goto L44;
                case 18: goto L41;
                default: goto L24;
            }
        L24:
            java.lang.String r3 = r3.getSubtypeName()
            java.lang.String r1 = "TD-SCDMA"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "WCDMA"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "CDMA2000"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 == 0) goto L4a
            goto L44
        L41:
            r3 = 4
            r0 = 4
            goto L4a
        L44:
            r0 = 3
            goto L4a
        L46:
            r3 = 2
            r0 = 2
            goto L4a
        L49:
            r0 = -1
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4381t4.OooO0OO(android.content.Context):int");
    }

    public static int OooO0Oo(Context context) {
        int iOooO0OO = OooO0OO(context);
        if (iOooO0OO == -1) {
            return 5;
        }
        int i = 1;
        if (iOooO0OO != 1) {
            i = 2;
            if (iOooO0OO != 2) {
                i = 3;
                if (iOooO0OO != 3) {
                    i = 4;
                    if (iOooO0OO != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static String OooO0o(Context context) {
        TelephonyManager telephonyManagerOooO0oo = OooO0oo(context);
        if (telephonyManagerOooO0oo != null) {
            return telephonyManagerOooO0oo.getNetworkOperatorName();
        }
        return null;
    }

    public static String OooO0o0(Context context) {
        int iOooO0OO = OooO0OO(context);
        return iOooO0OO != -1 ? iOooO0OO != 1 ? iOooO0OO != 2 ? iOooO0OO != 3 ? iOooO0OO != 4 ? "unknow" : "4g" : "3g" : "2g" : "wf" : "ethernet";
    }

    public static int OooO0oO(Context context) {
        TelephonyManager telephonyManagerOooO0oo = OooO0oo(context);
        if (telephonyManagerOooO0oo != null) {
            return telephonyManagerOooO0oo.getPhoneType();
        }
        return -1;
    }

    public static TelephonyManager OooO0oo(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static boolean OooOO0(Context context) {
        NetworkInfo networkInfoOooO00o = OooO00o(context);
        return networkInfoOooO00o != null && networkInfoOooO00o.isAvailable();
    }

    public static boolean OooOO0O(Context context) {
        NetworkInfo networkInfoOooO00o = OooO00o(context);
        return networkInfoOooO00o != null && networkInfoOooO00o.isConnected();
    }

    public static boolean OooOO0o(Context context) {
        NetworkInfo networkInfoOooO00o = OooO00o(context);
        return networkInfoOooO00o != null && networkInfoOooO00o.getType() == 1;
    }

    public static void OooOOO0(Context context) {
        context.startActivity(Build.VERSION.SDK_INT > 10 ? new Intent("android.settings.SETTINGS") : new Intent("android.settings.WIRELESS_SETTINGS"));
    }
}
