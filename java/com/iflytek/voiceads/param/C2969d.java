package com.iflytek.voiceads.param;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anythink.china.common.C1082d;
import com.iflytek.voiceads.utils.C2986d;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2990h;
import com.iflytek.voiceads.utils.C2991i;
import com.iflytek.voiceads.utils.C2993k;
import com.umeng.commonsdk.proguard.C3471v;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.param.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2969d {

    /* JADX INFO: renamed from: a */
    private static String f16416a;

    /* JADX INFO: renamed from: a */
    public static long m13457a() {
        return System.currentTimeMillis() / 1000;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m13458a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3471v.f18948ab, m13465e(context));
            jSONObject.put("os", m13459b());
            jSONObject.put("osv", m13462c());
            jSONObject.put("adid", m13469g(context));
            jSONObject.put("adid_md5", C2986d.m13546a(m13469g(context)));
            jSONObject.put("imei", m13470h(context));
            jSONObject.put("imei_md5", C2986d.m13546a(m13470h(context)));
            jSONObject.put("mac", C2990h.m13559a(context));
            jSONObject.put("mac_md5", C2986d.m13546a(C2990h.m13559a(context)));
            jSONObject.put("density", m13472j(context));
            jSONObject.put(C3471v.f18930K, m13473k(context));
            jSONObject.put("net", m13474l(context));
            jSONObject.put("ip", m13464d());
            jSONObject.put("ua", m13460b(context));
            jSONObject.put("dvw", m13461c(context));
            jSONObject.put("dvh", m13463d(context));
            jSONObject.put("orientation", m13476n(context));
            jSONObject.put("make", m13466e());
            jSONObject.put("model", m13467f());
            jSONObject.put("lan", m13477o(context));
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "get device:" + e.getMessage());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    private static int m13459b() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m13460b(Context context) {
        if (TextUtils.isEmpty(f16416a)) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    f16416a = WebSettings.getDefaultUserAgent(context);
                } else {
                    f16416a = new WebView(context).getSettings().getUserAgentString();
                }
            } catch (Exception e) {
                f16416a = "";
            }
        }
        return f16416a;
    }

    /* JADX INFO: renamed from: c */
    public static int m13461c(Context context) {
        return m13475m(context).widthPixels;
    }

    /* JADX INFO: renamed from: c */
    private static String m13462c() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: d */
    public static int m13463d(Context context) {
        return m13475m(context).heightPixels;
    }

    /* JADX INFO: renamed from: d */
    private static String m13464d() {
        return C2993k.m13572a();
    }

    /* JADX INFO: renamed from: e */
    private static int m13465e(Context context) {
        String strM13460b = m13460b(context);
        if (TextUtils.isEmpty(strM13460b)) {
            return -1;
        }
        return (!(strM13460b.contains("Mobile") && strM13460b.contains("Android")) && strM13460b.contains("Android") && m13468f(context)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    private static String m13466e() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: f */
    private static String m13467f() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m13468f(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: renamed from: g */
    private static String m13469g(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getAndroidID:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m13470h(Context context) {
        String deviceId;
        Exception e;
        if (!C2991i.m13568b(context, C1082d.f2501a)) {
            return "";
        }
        String deviceId2 = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            deviceId2 = telephonyManager.getDeviceId();
            if (!TextUtils.isEmpty(deviceId2)) {
                return deviceId2;
            }
            deviceId = Build.VERSION.SDK_INT >= 23 ? telephonyManager.getDeviceId(0) : deviceId2;
            try {
                return TextUtils.isEmpty(deviceId) ? m13471i(context) : deviceId;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            deviceId = deviceId2;
            e = e3;
        }
        C2989g.m13557b("IFLY_AD_SDK", "get IMEI:" + e.getMessage());
        return deviceId;
    }

    /* JADX INFO: renamed from: i */
    private static String m13471i(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            return telephonyManager.getClass().getDeclaredMethod("getImei", Integer.TYPE).invoke(telephonyManager, 1).toString();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "Get invoke imei:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    private static int m13472j(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    /* JADX INFO: renamed from: k */
    private static int m13473k(Context context) {
        try {
            String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            if (!TextUtils.isEmpty(networkOperatorName)) {
                if (networkOperatorName.contains("46000") || networkOperatorName.contains("46002") || networkOperatorName.contains("46004") || networkOperatorName.contains("46007")) {
                    return 1;
                }
                if (networkOperatorName.contains("46001") || networkOperatorName.contains("46006") || networkOperatorName.contains("46009")) {
                    return 2;
                }
                if (!networkOperatorName.contains("46003") && !networkOperatorName.contains("46005")) {
                    if (!networkOperatorName.contains("46011")) {
                        return 0;
                    }
                }
                return 3;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "Get carrier failed:" + e.getMessage());
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    private static int m13474l(Context context) {
        if (!C2991i.m13566a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        String strM13576c = C2993k.m13576c(context);
        if (strM13576c.contains("wifi")) {
            return 2;
        }
        if (strM13576c.contains("2g")) {
            return 4;
        }
        if (strM13576c.contains("3g")) {
            return 5;
        }
        return strM13576c.contains("4g") ? 6 : 0;
    }

    /* JADX INFO: renamed from: m */
    private static DisplayMetrics m13475m(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 17) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* JADX INFO: renamed from: n */
    private static int m13476n(Context context) {
        return 0;
    }

    /* JADX INFO: renamed from: o */
    private static String m13477o(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale != null ? locale.getLanguage() + "-" + locale.getCountry() : "";
    }
}
