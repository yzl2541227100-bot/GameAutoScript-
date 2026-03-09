package cn.haorui.sdk.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.utils.HRConstants;
import cn.haorui.sdk.core.utils.LocalThreadPools;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.PackConfigUtil;
import cn.haorui.sdk.core.utils.RequestUtil;

/* JADX INFO: loaded from: classes.dex */
public class AdSdk {
    private static final String TAG = "AdSdk";
    private static HRConfig adConfig = null;
    private static Context context = null;
    private static String local_oaid = null;
    private static String oaid = null;
    private static int oaid_errno = -1;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.AdSdk$a */
    public static class C0476a implements InterfaceC0519a {
        /* JADX INFO: renamed from: a */
        public void m17a(String str) {
            String unused = AdSdk.local_oaid = str;
            AdSdk.getSharedPreferences().edit().putString("local_oaid", str).apply();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.AdSdk$b */
    public static class RunnableC0477b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            PackConfigUtil.getConfig(AdSdk.context);
            AdSdk.initUA();
        }
    }

    public static HRConfig adConfig() {
        HRConfig hRConfig = adConfig;
        if (hRConfig != null) {
            return hRConfig;
        }
        throw new RuntimeException("SDK IS NOT INITED");
    }

    public static Context getContext() {
        return context;
    }

    public static String getLocalOaid() {
        if ((TextUtils.isEmpty(local_oaid) || "unknown".equals(local_oaid)) && adConfig().customController() != null) {
            local_oaid = adConfig().customController().getOaid();
        }
        return local_oaid;
    }

    public static String getOaid() {
        if (TextUtils.isEmpty(oaid) && adConfig().customController() != null) {
            oaid = adConfig().customController().getOaid();
        }
        return oaid;
    }

    public static int getOaid_errno() {
        return oaid_errno;
    }

    public static SharedPreferences getSharedPreferences() {
        return context.getApplicationContext().getSharedPreferences("AdSailSdk", 0);
    }

    public static String getVersionName() {
        return "1.4.6.8";
    }

    public static void init(Context context2, @NonNull HRConfig hRConfig) {
        try {
        } catch (Exception e) {
            adConfig = null;
            e.printStackTrace();
            LogUtil.m87e(TAG, "SDK INIT ERROR");
        }
        if (adConfig != null) {
            return;
        }
        if (hRConfig == null) {
            throw new IllegalArgumentException("config is null");
        }
        context = context2.getApplicationContext();
        adConfig = hRConfig;
        C0479a.m18a(HRConstants.PLATFORM_HR).config().init(context2, adConfig.appId(), "");
        LogUtil.m86d(TAG, "hr init start");
        initPackConfig();
        HRConfig hRConfig2 = adConfig;
        if (hRConfig2 == null || !hRConfig2.enableOaid()) {
            local_oaid = "unknown";
        } else {
            initLocalOaid();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void initLocalOaid() {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.AdSdk.initLocalOaid():void");
    }

    private static void initPackConfig() {
        LocalThreadPools.getInstance().execute(new RunnableC0477b());
    }

    public static void initSdkIfNot(@NonNull Context context2, @NonNull SdkAdInfo sdkAdInfo) {
        InterfaceC0492e interfaceC0492eM18a = C0479a.m18a(sdkAdInfo.getSdk());
        if (interfaceC0492eM18a != null) {
            interfaceC0492eM18a.config().init(context2, sdkAdInfo.getApp_id(), sdkAdInfo.getApp_key());
        }
    }

    public static void initUA() {
        try {
            try {
                if (TextUtils.isEmpty(getSharedPreferences().getString("install_time", ""))) {
                    getSharedPreferences().edit().putString("install_time", String.valueOf(System.currentTimeMillis())).apply();
                }
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            RequestUtil.setUserAgent(WebSettings.getDefaultUserAgent(context));
            RequestUtil.setRomVersion(RequestUtil.getRomVersion());
        } catch (Throwable unused) {
        }
    }

    public static void setOaid_errno(int i) {
        oaid_errno = i;
    }
}
