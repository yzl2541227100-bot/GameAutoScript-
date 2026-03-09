package p285z2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: z2.ub */
/* JADX INFO: loaded from: classes.dex */
public class C4425ub {
    public static boolean OooO00o(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }

    public static boolean OooO0O0(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().getState() == NetworkInfo.State.CONNECTED) || ((TelephonyManager) context.getSystemService("phone")).getNetworkType() == 3;
    }
}
