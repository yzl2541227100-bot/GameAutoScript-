package com.anythink.core.api;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p054e.C1199b;
import com.anythink.core.common.p058h.C1277e;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p066o.C1344h;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ATSDK {
    private static boolean HAS_INIT = false;
    public static final int NONPERSONALIZED = 1;
    public static final int PERSONALIZED = 0;
    public static final int UNKNOWN = 2;

    /* JADX INFO: renamed from: com.anythink.core.api.ATSDK$1 */
    public class RunnableC10951 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            C1386t.m4552a().m4555b();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.api.ATSDK$2 */
    public class C10962 implements InterfaceC1283k {
        public C10962() {
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            aTAreaCallback.onErrorCallback("Request cancel");
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            aTAreaCallback.onErrorCallback(adError.printStackTrace());
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            try {
                if (!(obj instanceof JSONObject)) {
                    aTAreaCallback.onErrorCallback("There is no result.");
                    return;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.has("area")) {
                    aTAreaCallback.onErrorCallback("There is no result.");
                } else {
                    aTAreaCallback.onResultCallback(jSONObject.optString("area"));
                }
            } catch (Throwable unused) {
                aTAreaCallback.onErrorCallback("Internal error");
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    private ATSDK() {
    }

    public static void addCustomAdapterConfig(String str, ATCustomAdapterConfig aTCustomAdapterConfig) {
        C1175n.m2059a().m2120a(str, aTCustomAdapterConfig);
    }

    public static void checkIsEuTraffic(Context context, NetTrafficeCallback netTrafficeCallback) {
        C1178q.m2182a(context).m2187a(netTrafficeCallback);
    }

    public static void deniedUploadDeviceInfo(String... strArr) {
        C1175n.m2059a().m2128a(strArr);
    }

    public static void getArea(ATAreaCallback aTAreaCallback) {
        if (aTAreaCallback == null) {
            return;
        }
        new C1277e().mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.api.ATSDK.2
            public C10962() {
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadCanceled(int i) {
                aTAreaCallback.onErrorCallback("Request cancel");
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadError(int i, String str, AdError adError) {
                aTAreaCallback.onErrorCallback(adError.printStackTrace());
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadFinish(int i, Object obj) {
                try {
                    if (!(obj instanceof JSONObject)) {
                        aTAreaCallback.onErrorCallback("There is no result.");
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.has("area")) {
                        aTAreaCallback.onErrorCallback("There is no result.");
                    } else {
                        aTAreaCallback.onResultCallback(jSONObject.optString("area"));
                    }
                } catch (Throwable unused) {
                    aTAreaCallback.onErrorCallback("Internal error");
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadStart(int i) {
            }
        });
    }

    public static int getGDPRDataLevel(Context context) {
        return C1178q.m2182a(context).m2184a();
    }

    public static int getPersionalizedAdStatus() {
        return C1175n.m2059a().m2142d();
    }

    public static String getSDKVersionName() {
        return C1344h.m4131a();
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, null);
    }

    public static void init(Context context, String str, String str2, ATNetworkConfig aTNetworkConfig) {
        init(context, str, str2, aTNetworkConfig, null);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, ATNetworkConfig aTNetworkConfig, ATSDKInitListener aTSDKInitListener) {
        try {
            if (context == null) {
                if (aTSDKInitListener != null) {
                    aTSDKInitListener.onFail("init: Context is null!");
                }
                Log.e("anythink", "init: Context is null!");
            } else {
                C1175n.m2059a().m2115a(context, str, str2, aTNetworkConfig);
                if (aTSDKInitListener != null) {
                    aTSDKInitListener.onSuccess();
                }
                C1175n.m2059a();
                C1175n.m2066a(new Runnable() { // from class: com.anythink.core.api.ATSDK.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1386t.m4552a().m4555b();
                    }
                });
            }
        } catch (Error | Exception unused) {
        }
    }

    public static void initCustomMap(Map<String, Object> map) {
        C1175n.m2059a().m2126a(map);
    }

    public static void initPlacementCustomMap(String str, Map<String, Object> map) {
        C1175n.m2059a().m2123a(str, map);
    }

    public static void integrationChecking(Context context) {
        C1175n.m2059a().m2134b(context);
    }

    public static boolean isCnSDK() {
        return C1175n.m2059a().m2132b() != null;
    }

    public static boolean isEUTraffic(Context context) {
        return C1178q.m2182a(context).m2192d();
    }

    public static boolean isNetworkLogDebug() {
        return C1175n.m2059a().m2095A();
    }

    public static void setATAdFilter(String[] strArr, IATAdFilter iATAdFilter) {
        C1175n.m2059a().m2129a(strArr, iATAdFilter);
    }

    public static void setATPrivacyConfig(ATPrivacyConfig aTPrivacyConfig) {
        C1175n.m2059a().m2117a(aTPrivacyConfig);
    }

    public static void setAdLogoVisible(boolean z) {
        C1175n.m2059a().m2140c(z);
    }

    public static void setBundleName(String str) {
        C1175n.m2059a().m2171r(str);
    }

    public static void setChannel(String str) {
        if (C1344h.m4142a(str)) {
            C1175n.m2059a().m2146e(str);
        }
    }

    public static void setDebuggerConfig(Context context, String str, ATDebuggerConfig aTDebuggerConfig) {
        C1175n.m2059a().m2113a(context, str, aTDebuggerConfig);
    }

    public static void setExcludePackageList(List<String> list) {
        C1175n.m2059a().m2125a(list);
    }

    public static void setFilterAdSourceIdList(String str, List<String> list) {
        C1175n.m2059a().m2122a(str, list);
    }

    public static void setFilterNetworkFirmIdList(String str, List<String> list) {
        C1175n.m2059a().m2136b(str, list);
    }

    public static void setGDPRUploadDataLevel(Context context, int i) {
        if (context == null) {
            Log.e("anythink", "setGDPRUploadDataLevel: context should not be null");
        } else if (i == 0 || i == 1) {
            C1178q.m2182a(context).m2185a(i);
        } else {
            Log.e("anythink", "GDPR level setting error!!! Level must be PERSONALIZED or NONPERSONALIZED.");
        }
    }

    public static void setInitType(int i) {
        C1175n.m2059a().m2133b(i);
    }

    public static void setLocalStrategyAssetPath(Context context, String str) {
        C1175n.m2059a();
        C1175n.m2061a(context, str);
    }

    public static void setLocation(Location location) {
        C1175n.m2059a().m2116a(location);
    }

    public static void setNetworkLogDebug(boolean z) {
        C1175n.m2059a().m2137b(z);
    }

    public static void setPersonalizedAdStatus(int i) {
        C1175n.m2059a().m2109a(i);
    }

    public static void setSharedPlacementConfig(ATSharedPlacementConfig aTSharedPlacementConfig) {
        C1175n.m2059a();
        C1175n.m2062a(aTSharedPlacementConfig);
    }

    public static void setSubChannel(String str) {
        if (C1344h.m4147b(str)) {
            C1175n.m2059a().m2149f(str);
        }
    }

    public static void setSupportDomainCountry(String... strArr) {
        C1199b.f3592a = strArr;
    }

    public static void setSystemDevFragmentType(String str) {
        C1175n.m2059a().m2169q(str);
    }

    public static void setUseHTTP(boolean z) {
        C1175n.m2059a().m2145d(z);
    }

    public static void setWXAppId(String str) {
        C1175n.m2059a().m2119a(str);
    }

    public static void setWXStatus(boolean z) {
        C1175n.m2059a().m2127a(z);
    }

    public static void showGdprAuth(Context context) {
        C1178q.m2182a(context).m2186a(context, null);
    }

    public static void showGdprAuth(Context context, ATGDPRAuthCallback aTGDPRAuthCallback) {
        C1178q.m2182a(context).m2186a(context, aTGDPRAuthCallback);
    }

    public static void testModeDeviceInfo(Context context, DeviceInfoCallback deviceInfoCallback) {
        C1175n.m2059a().m2112a(context, deviceInfoCallback);
    }
}
