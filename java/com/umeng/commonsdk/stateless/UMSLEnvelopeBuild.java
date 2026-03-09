package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3418aj;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.proguard.C3466q;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.statistics.C3491e;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.C3496e;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class UMSLEnvelopeBuild {
    private static final String TAG = "UMSLEnvelopeBuild";
    private static String cacheSystemheader;
    private static boolean isEncryptEnabled;
    public static Context mContext;
    public static String module;

    private synchronized C3478c constructEnvelope(Context context, byte[] bArr) {
        String appkey;
        String appkey2;
        C3478c c3478cM16222b;
        int iIntValue = -1;
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "slcodex", null);
        C3489e.m16329a("walle", "[stateless] build envelope, codexStr is " + strImprintProperty);
        try {
            if (!TextUtils.isEmpty(strImprintProperty)) {
                iIntValue = Integer.valueOf(strImprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            C3454e.m15904a(context, e);
        }
        if (iIntValue == 0) {
            C3489e.m16329a("walle", "[stateless] build envelope, codexValue is 0");
            appkey = UMUtils.getAppkey(context);
        } else {
            if (iIntValue == 1) {
                C3489e.m16329a("walle", "[stateless] build envelope, codexValue is 1");
                appkey2 = UMUtils.getAppkey(context);
            } else if (isEncryptEnabled) {
                C3489e.m16329a("walle", "[stateless] build envelope, isEncryptEnabled is true");
                appkey2 = UMUtils.getAppkey(context);
            } else {
                C3489e.m16329a("walle", "[stateless] build envelope, isEncryptEnabled is false");
                appkey = UMUtils.getAppkey(context);
            }
            c3478cM16222b = C3478c.m16222b(context, appkey2, bArr);
        }
        c3478cM16222b = C3478c.m16220a(context, appkey, bArr);
        return c3478cM16222b;
    }

    private synchronized JSONObject makeErrorResult(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public static void setEncryptEnabled(boolean z) {
        isEncryptEnabled = z;
    }

    public synchronized JSONObject buildSLBaseHeader(Context context) {
        JSONObject jSONObject;
        String str;
        String str2;
        C3489e.m16329a("walle", "[stateless] begin build hader, thread is " + Thread.currentThread());
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (TextUtils.isEmpty(cacheSystemheader)) {
                jSONObject = new JSONObject();
                jSONObject.put(C3471v.f18978k, DeviceConfig.getAppMD5Signature(applicationContext));
                jSONObject.put(C3471v.f18979l, DeviceConfig.getAppSHA1Key(applicationContext));
                jSONObject.put(C3471v.f18980m, DeviceConfig.getAppHashKey(applicationContext));
                jSONObject.put("app_version", DeviceConfig.getAppVersionName(applicationContext));
                jSONObject.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(applicationContext)));
                jSONObject.put(C3471v.f18984q, DeviceConfig.getDeviceIdUmengMD5(applicationContext));
                jSONObject.put("cpu", DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(applicationContext);
                if (TextUtils.isEmpty(mccmnc)) {
                    jSONObject.put(C3471v.f18990w, "");
                } else {
                    jSONObject.put(C3471v.f18990w, mccmnc);
                }
                String subOSName = DeviceConfig.getSubOSName(applicationContext);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject.put(C3471v.f18925F, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(applicationContext);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject.put(C3471v.f18926G, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(applicationContext);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject.put(C3471v.f18948ab, deviceType);
                }
                jSONObject.put("package_name", DeviceConfig.getPackageName(applicationContext));
                jSONObject.put(C3471v.f18983p, "Android");
                jSONObject.put("device_id", DeviceConfig.getDeviceId(applicationContext));
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(C3471v.f18993z, Build.BOARD);
                jSONObject.put(C3471v.f18920A, Build.BRAND);
                jSONObject.put(C3471v.f18921B, Build.TIME);
                jSONObject.put(C3471v.f18922C, Build.MANUFACTURER);
                jSONObject.put(C3471v.f18923D, Build.ID);
                jSONObject.put("device_name", Build.DEVICE);
                jSONObject.put("os", "Android");
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                int[] resolutionArray = DeviceConfig.getResolutionArray(applicationContext);
                if (resolutionArray != null) {
                    jSONObject.put(C3471v.f18988u, resolutionArray[1] + Marker.ANY_MARKER + resolutionArray[0]);
                }
                jSONObject.put("mc", DeviceConfig.getMac(applicationContext));
                jSONObject.put("timezone", DeviceConfig.getTimeZone(applicationContext));
                String[] localeInfo = DeviceConfig.getLocaleInfo(applicationContext);
                jSONObject.put(C3471v.f18929J, localeInfo[0]);
                jSONObject.put("language", localeInfo[1]);
                jSONObject.put(C3471v.f18930K, DeviceConfig.getNetworkOperatorName(applicationContext));
                jSONObject.put(C3471v.f18981n, DeviceConfig.getAppName(applicationContext));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(applicationContext);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    str = C3471v.f18931L;
                    str2 = "wifi";
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    str = C3471v.f18931L;
                    str2 = "2G/3G";
                } else {
                    str = C3471v.f18931L;
                    str2 = "unknow";
                }
                jSONObject.put(str, str2);
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject.put(C3471v.f18932M, networkAccessMode[1]);
                }
                jSONObject.put(C3471v.f18969b, C3491e.f19202a);
                if (!TextUtils.isEmpty(module)) {
                    jSONObject.put(C3471v.f18970c, module);
                }
                cacheSystemheader = jSONObject.toString();
            } else {
                try {
                    jSONObject = new JSONObject(cacheSystemheader);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put("channel", UMUtils.getChannel(applicationContext));
            jSONObject.put("appkey", UMUtils.getAppkey(applicationContext));
            try {
                C3466q c3466q = new C3466q(applicationContext);
                if (!TextUtils.isEmpty(c3466q.m15990a())) {
                    jSONObject.put(C3471v.f18971d, c3466q.m15990a());
                }
            } catch (Exception unused2) {
            }
            try {
                String strImprintProperty = UMEnvelopeBuild.imprintProperty(applicationContext, C3471v.f18972e, null);
                if (!TextUtils.isEmpty(strImprintProperty)) {
                    jSONObject.put(C3471v.f18972e, strImprintProperty);
                }
            } catch (Exception unused3) {
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                C3489e.m16329a("walle", "[stateless] build header end , header is " + jSONObject.toString() + ", thread is " + Thread.currentThread());
                return jSONObject2.put("header", jSONObject);
            }
        } catch (Throwable th) {
            C3454e.m15904a(applicationContext, th);
        }
        C3489e.m16329a("walle", "[stateless] build header end , header is null !!! thread is " + Thread.currentThread());
        return null;
    }

    public synchronized JSONObject buildSLEnvelope(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        C3478c c3478cConstructEnvelope;
        String str2;
        C3489e.m16329a("walle", "[stateless] build envelope, heade is " + jSONObject.toString());
        C3489e.m16329a("walle", "[stateless] build envelope, body is " + jSONObject2.toString());
        C3489e.m16329a("walle", "[stateless] build envelope, thread is " + Thread.currentThread());
        if (context == null || jSONObject == null || jSONObject2 == null || str == null) {
            C3489e.m16329a("walle", "[stateless] build envelope, context is null or header is null or body is null");
            return makeErrorResult(110, null);
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (jSONObject != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                        try {
                            jSONObject.put(str2, jSONObject2.opt(str2));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (jSONObject != null) {
                try {
                    C3496e c3496eM16376a = C3496e.m16376a(applicationContext);
                    if (c3496eM16376a != null) {
                        c3496eM16376a.m16381a();
                        String strEncodeToString = Base64.encodeToString(new C3418aj().m15741a(c3496eM16376a.m16383b()), 0);
                        if (!TextUtils.isEmpty(strEncodeToString)) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                            jSONObject3.put(C3471v.f18937R, strEncodeToString);
                            jSONObject.put("header", jSONObject3);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject != null && C3481f.m16243a(jSONObject.toString().getBytes().length, C3476a.f19053a)) {
                C3489e.m16329a("walle", "[stateless] build envelope, json overstep!!!! size is " + jSONObject.toString().getBytes().length);
                return makeErrorResult(113, jSONObject);
            }
            C3489e.m16329a("walle", "[stateless] build envelope, json size is " + jSONObject.toString().getBytes().length);
            if (jSONObject != null) {
                c3478cConstructEnvelope = constructEnvelope(applicationContext, jSONObject.toString().getBytes());
                if (c3478cConstructEnvelope == null) {
                    C3489e.m16329a("walle", "[stateless] build envelope, envelope is null !!!!");
                    return makeErrorResult(111, jSONObject);
                }
            } else {
                c3478cConstructEnvelope = null;
            }
            if (c3478cConstructEnvelope != null && C3481f.m16243a(c3478cConstructEnvelope.m16227b().length, C3476a.f19054b)) {
                C3489e.m16329a("walle", "[stateless] build envelope, envelope overstep!!!! size is " + c3478cConstructEnvelope.m16227b().length);
                return makeErrorResult(114, jSONObject);
            }
            if (!C3481f.m16244a(applicationContext, Base64.encodeToString(str.getBytes(), 0), Base64.encodeToString((str + "_" + System.currentTimeMillis()).getBytes(), 0), c3478cConstructEnvelope.m16227b())) {
                C3489e.m16329a("walle", "[stateless] build envelope, save fail ----->>>>>");
                return makeErrorResult(101, jSONObject);
            }
            C3489e.m16329a("walle", "[stateless] build envelope, save ok ----->>>>>");
            C3489e.m16329a("walle", "[stateless] envelope file size is " + jSONObject.toString().getBytes().length);
            new C3479d(applicationContext);
            C3479d.m16233b(273);
            C3489e.m16329a("walle", "[stateless] build envelope end, thread is " + Thread.currentThread());
            return jSONObject;
        } catch (Throwable th) {
            C3454e.m15904a(context, th);
            C3489e.m16329a("walle", "build envelope end, thread is " + Thread.currentThread());
            return makeErrorResult(110, null);
        }
    }
}
