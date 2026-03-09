package mobi.oneway.export.p283g;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.reactivex.annotations.SchedulerSupport;
import java.lang.reflect.Method;
import mobi.oneway.export.p274a.C3582b;

/* JADX INFO: renamed from: mobi.oneway.export.g.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3634f {

    /* JADX INFO: renamed from: mobi.oneway.export.g.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19790a;

        static {
            int[] iArr = new int[a.values().length];
            f19790a = iArr;
            try {
                iArr[a.MAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19790a[a.SSID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19790a[a.BSSID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: mobi.oneway.export.g.f$a */
    public enum a {
        MAC,
        SSID,
        BSSID
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static String m16929a() {
        String imei;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C3582b.m16650a().getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 26) {
                imei = TextUtils.isEmpty(telephonyManager.getImei()) ? "" : telephonyManager.getImei();
            } else {
                Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getImei", new Class[0]);
                declaredMethod.setAccessible(true);
                imei = (String) declaredMethod.invoke(telephonyManager, new Object[0]);
            }
            return TextUtils.isEmpty(imei) ? "" : imei;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m16930a(String str) {
        return str == null ? "" : (str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    /* JADX INFO: renamed from: a */
    private static String m16931a(a aVar) {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) C3582b.m16650a().getApplicationContext().getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return "";
        }
        int i = AnonymousClass1.f19790a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : connectionInfo.getBSSID() : m16930a(connectionInfo.getSSID()) : connectionInfo.getMacAddress();
    }

    /* JADX INFO: renamed from: b */
    public static String m16932b() {
        try {
            return C3582b.m16650a().getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m16933c() {
        try {
            return C3582b.m16650a().getPackageManager().getPackageInfo(m16932b(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m16934d() {
        String str = System.getProperty("http.agent") + " AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Mobile Safari/537.36 ";
        return TextUtils.isEmpty(str) ? "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Mobile Safari/537.36 OneWaySDK" : str;
    }

    /* JADX INFO: renamed from: e */
    public static String m16935e() {
        try {
            return Settings.Secure.getString(C3582b.m16650a().getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m16936f() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) C3582b.m16650a().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return SchedulerSupport.NONE;
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? SchedulerSupport.NONE : "wifi" : "moblie";
    }

    /* JADX INFO: renamed from: g */
    public static int m16937g() {
        try {
            if (m16936f().equals("wifi")) {
                return 99;
            }
            return ((TelephonyManager) C3582b.m16650a().getSystemService("phone")).getNetworkType();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m16938h() {
        return m16931a(a.SSID);
    }

    /* JADX INFO: renamed from: i */
    public static String m16939i() {
        return m16931a(a.BSSID);
    }

    /* JADX INFO: renamed from: j */
    public static String m16940j() {
        try {
            return ((TelephonyManager) C3582b.m16650a().getSystemService("phone")).getSimOperator();
        } catch (Exception e) {
            e.printStackTrace();
            return SchedulerSupport.NONE;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m16941k() {
        try {
            return ((TelephonyManager) C3582b.m16650a().getApplicationContext().getSystemService("phone")).getSimSerialNumber();
        } catch (Exception e) {
            e.printStackTrace();
            return SchedulerSupport.NONE;
        }
    }
}
