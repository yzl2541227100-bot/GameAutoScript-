package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.pro.C3380b;
import com.umeng.commonsdk.framework.C3404b;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3418aj;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.proguard.C3466q;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.C3496e;
import com.umeng.commonsdk.statistics.idtracking.C3498g;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import com.umeng.commonsdk.statistics.proto.C3527d;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3484c {

    /* JADX INFO: renamed from: a */
    public static String f19148a = null;

    /* JADX INFO: renamed from: b */
    private static final String f19149b = "EnvelopeManager";

    /* JADX INFO: renamed from: c */
    private static StatTracer f19150c;

    /* JADX INFO: renamed from: d */
    private static ImLatent f19151d;

    /* JADX INFO: renamed from: e */
    private static String f19152e;

    /* JADX INFO: renamed from: g */
    private static boolean f19153g;

    /* JADX INFO: renamed from: f */
    private int f19154f = 0;

    /* JADX INFO: renamed from: a */
    private int m16255a(Context context, Envelope envelope, String str, String str2) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        return C3404b.m15645a(context, str + "&&" + str2 + "_" + System.currentTimeMillis() + "_envelope.log", envelope.toBinary());
    }

    /* JADX INFO: renamed from: a */
    public static long m16256a(Context context) {
        long j = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        JSONObject jSONObjectM16261b = m16261b(context);
        if (jSONObjectM16261b != null && jSONObjectM16261b.toString() != null && jSONObjectM16261b.toString().getBytes() != null) {
            long length = jSONObjectM16261b.toString().getBytes().length;
            if (C3489e.f19173a) {
                Log.i(f19149b, "headerLen size is " + length);
            }
            j -= length;
        }
        if (C3489e.f19173a) {
            Log.i(f19149b, "free size is " + j);
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    private Envelope m16257a(Context context, byte[] bArr) {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int iIntValue = -1;
        try {
            if (!TextUtils.isEmpty(strImprintProperty)) {
                iIntValue = Integer.valueOf(strImprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            C3454e.m15904a(context, e);
        }
        return (iIntValue != 0 && (iIntValue == 1 || f19153g)) ? Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr) : Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m16258a(int i, JSONObject jSONObject) {
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

    /* JADX INFO: renamed from: a */
    private JSONObject m16259a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt("header") != null && (jSONObject.opt("header") instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (next instanceof String) && (str = next) != null && jSONObject2.opt(str) != null) {
                    try {
                        jSONObject3.put(str, jSONObject2.opt(str));
                        if (str.equals(C3380b.f18398i) && (jSONObject2.opt(str) instanceof Integer)) {
                            this.f19154f = ((Integer) jSONObject2.opt(str)).intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m16260a(boolean z) {
        f19153g = z;
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m16261b(Context context) {
        JSONObject jSONObject;
        String str = "2G/3G";
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (TextUtils.isEmpty(f19152e)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3471v.f18978k, DeviceConfig.getAppMD5Signature(context));
                jSONObject2.put(C3471v.f18979l, DeviceConfig.getAppSHA1Key(context));
                jSONObject2.put(C3471v.f18980m, DeviceConfig.getAppHashKey(context));
                jSONObject2.put("app_version", DeviceConfig.getAppVersionName(context));
                jSONObject2.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject2.put(C3471v.f18984q, DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject2.put("cpu", DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (TextUtils.isEmpty(mccmnc)) {
                    jSONObject2.put(C3471v.f18990w, "");
                } else {
                    jSONObject2.put(C3471v.f18990w, mccmnc);
                }
                String subOSName = DeviceConfig.getSubOSName(context);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject2.put(C3471v.f18925F, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(context);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject2.put(C3471v.f18926G, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject2.put(C3471v.f18948ab, deviceType);
                }
                jSONObject2.put("package_name", DeviceConfig.getPackageName(context));
                jSONObject2.put(C3471v.f18983p, "Android");
                jSONObject2.put("device_id", DeviceConfig.getDeviceId(context));
                jSONObject2.put("device_model", Build.MODEL);
                jSONObject2.put(C3471v.f18993z, Build.BOARD);
                jSONObject2.put(C3471v.f18920A, Build.BRAND);
                jSONObject2.put(C3471v.f18921B, Build.TIME);
                jSONObject2.put(C3471v.f18922C, Build.MANUFACTURER);
                jSONObject2.put(C3471v.f18923D, Build.ID);
                jSONObject2.put("device_name", Build.DEVICE);
                jSONObject2.put("os", "Android");
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject2.put(C3471v.f18988u, resolutionArray[1] + Marker.ANY_MARKER + resolutionArray[0]);
                }
                jSONObject2.put("mc", DeviceConfig.getMac(context));
                jSONObject2.put("timezone", DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject2.put(C3471v.f18929J, localeInfo[0]);
                jSONObject2.put("language", localeInfo[1]);
                jSONObject2.put(C3471v.f18930K, DeviceConfig.getNetworkOperatorName(context));
                jSONObject2.put(C3471v.f18981n, DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    str = "wifi";
                } else if (!"2G/3G".equals(networkAccessMode[0])) {
                    str = "unknow";
                }
                jSONObject2.put(C3471v.f18931L, str);
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject2.put(C3471v.f18932M, networkAccessMode[1]);
                }
                jSONObject2.put(C3471v.f18969b, C3491e.f19202a);
                if (!TextUtils.isEmpty(f19148a)) {
                    jSONObject2.put(C3471v.f18970c, f19148a);
                }
                f19152e = jSONObject2.toString();
                jSONObject = jSONObject2;
            } else {
                try {
                    jSONObject = new JSONObject(f19152e);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                jSONObject.put(C3471v.f18933N, sharedPreferences.getInt("successful_request", 0));
                jSONObject.put(C3471v.f18934O, sharedPreferences.getInt(C3471v.f18934O, 0));
                jSONObject.put(C3471v.f18935P, sharedPreferences.getInt("last_request_spent_ms", 0));
            } catch (Exception unused2) {
            }
            jSONObject.put("channel", UMUtils.getChannel(context));
            jSONObject.put("appkey", UMUtils.getAppkey(context));
            try {
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject.put(C3471v.f18946a, deviceToken);
                }
            } catch (Exception e) {
                C3454e.m15904a(context, e);
            }
            try {
                C3466q c3466q = new C3466q(context);
                if (!TextUtils.isEmpty(c3466q.m15990a())) {
                    jSONObject.put(C3471v.f18971d, c3466q.m15990a());
                }
            } catch (Exception e2) {
                C3454e.m15904a(context, e2);
            }
            try {
                String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, C3471v.f18972e, null);
                if (!TextUtils.isEmpty(strImprintProperty)) {
                    jSONObject.put(C3471v.f18972e, strImprintProperty);
                }
            } catch (Exception e3) {
                C3454e.m15904a(context, e3);
            }
            try {
                C3527d c3527dM16399a = C3498g.m16393a(context).m16399a();
                if (c3527dM16399a != null) {
                    jSONObject.put(C3471v.f18936Q, Base64.encodeToString(new C3418aj().m15741a(c3527dM16399a), 0));
                }
            } catch (Exception e4) {
                C3454e.m15904a(context, e4);
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                return new JSONObject().put("header", jSONObject);
            }
        } catch (Throwable th) {
            C3454e.m15904a(context, th);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m16262a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str;
        String string;
        Envelope envelopeM16257a;
        String str2;
        if (C3489e.f19173a && jSONObject != null && jSONObject2 != null) {
            Log.i(f19149b, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f19149b, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        if (context == null || jSONObject2 == null) {
            return m16258a(110, (JSONObject) null);
        }
        try {
            JSONObject jSONObjectM16261b = m16261b(context);
            if (jSONObjectM16261b != null && jSONObject != null) {
                jSONObjectM16261b = m16259a(jSONObjectM16261b, jSONObject);
            }
            if (jSONObjectM16261b != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                        try {
                            jSONObjectM16261b.put(str2, jSONObject2.opt(str2));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (jSONObjectM16261b != null) {
                StringBuilder sb = new StringBuilder();
                if (jSONObjectM16261b.length() > 0) {
                    if (jSONObjectM16261b.has("push")) {
                        String strOptString = jSONObjectM16261b.optJSONObject("header").optString(C3471v.f18961ao);
                        if (!TextUtils.isEmpty("p") && !TextUtils.isEmpty(strOptString)) {
                            sb.append("p");
                            sb.append("==");
                            sb.append(strOptString);
                            sb.append("&=");
                        }
                    }
                    if (jSONObjectM16261b.has("share")) {
                        String strOptString2 = jSONObjectM16261b.optJSONObject("header").optString(C3471v.f18962ap);
                        if (!TextUtils.isEmpty(C3471v.f18958al) && !TextUtils.isEmpty(strOptString2)) {
                            sb.append(C3471v.f18958al);
                            sb.append("==");
                            sb.append(strOptString2);
                            sb.append("&=");
                        }
                    }
                    if (jSONObjectM16261b.has("analytics")) {
                        String str3 = jSONObjectM16261b.has("dplus") ? C3471v.f18956aj : "a";
                        String strOptString3 = jSONObjectM16261b.optJSONObject("header").optString("sdk_version");
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(strOptString3)) {
                            sb.append(str3);
                            sb.append("==");
                            sb.append(strOptString3);
                            sb.append("&=");
                        }
                    }
                    if (jSONObjectM16261b.has("dplus")) {
                        String strOptString4 = jSONObjectM16261b.optJSONObject("header").optString("sdk_version");
                        if (jSONObjectM16261b.has("analytics")) {
                            if (!sb.toString().contains(C3471v.f18956aj) && !TextUtils.isEmpty(C3471v.f18956aj) && !TextUtils.isEmpty(strOptString4)) {
                                sb.append(C3471v.f18956aj);
                                sb.append("==");
                                sb.append(strOptString4);
                                sb.append("&=");
                            }
                        } else if (!TextUtils.isEmpty("d") && !TextUtils.isEmpty(strOptString4)) {
                            sb.append("d");
                            sb.append("==");
                            sb.append(strOptString4);
                            sb.append("&=");
                        }
                    }
                    if (jSONObjectM16261b.has(C3471v.f18953ag)) {
                        String strOptString5 = jSONObjectM16261b.optJSONObject("header").optString(C3471v.f18963aq);
                        if (!TextUtils.isEmpty("i") && !TextUtils.isEmpty(strOptString5)) {
                            sb.append("i");
                            sb.append("==");
                            sb.append(strOptString5);
                            sb.append("&=");
                        }
                    }
                }
                string = sb.toString();
                if (TextUtils.isEmpty(string)) {
                    return m16258a(101, jSONObjectM16261b);
                }
                if (string.endsWith("&=")) {
                    string = string.substring(0, string.length() - 2);
                }
            } else {
                string = null;
            }
            if (jSONObjectM16261b != null) {
                try {
                    C3496e c3496eM16376a = C3496e.m16376a(context);
                    if (c3496eM16376a != null) {
                        c3496eM16376a.m16381a();
                        String strEncodeToString = Base64.encodeToString(new C3418aj().m15741a(c3496eM16376a.m16383b()), 0);
                        if (!TextUtils.isEmpty(strEncodeToString)) {
                            JSONObject jSONObject5 = jSONObjectM16261b.getJSONObject("header");
                            jSONObject5.put(C3471v.f18937R, strEncodeToString);
                            jSONObjectM16261b.put("header", jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (f19150c == null) {
                StatTracer statTracer = StatTracer.getInstance(context);
                f19150c = statTracer;
                f19151d = ImLatent.getService(context, statTracer);
            }
            ImLatent imLatent = f19151d;
            if (imLatent != null && imLatent.shouldStartLatency()) {
                long delayTime = f19151d.getDelayTime();
                long elapsedTime = f19151d.getElapsedTime();
                if (jSONObjectM16261b != null) {
                    try {
                        JSONObject jSONObject6 = new JSONObject();
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put(C3471v.f18968av, elapsedTime / 1000);
                        jSONObject7.put(C3471v.f18967au, delayTime);
                        jSONObject6.put(C3471v.f18966at, jSONObject7);
                        JSONObject jSONObject8 = jSONObjectM16261b.getJSONObject("header");
                        jSONObject8.put(C3471v.f18965as, jSONObject6);
                        jSONObjectM16261b.put("header", jSONObject8);
                    } catch (Exception unused3) {
                    }
                }
            }
            if (jSONObjectM16261b != null && DataHelper.largeThanMaxSize(jSONObjectM16261b.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return m16258a(113, jSONObjectM16261b);
            }
            if (jSONObjectM16261b != null) {
                envelopeM16257a = m16257a(context, jSONObjectM16261b.toString().getBytes());
                if (envelopeM16257a == null) {
                    return m16258a(111, jSONObjectM16261b);
                }
            } else {
                envelopeM16257a = null;
            }
            if (envelopeM16257a != null && DataHelper.largeThanMaxSize(envelopeM16257a.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m16258a(114, jSONObjectM16261b);
            }
            int iM16255a = m16255a(context, envelopeM16257a, string, jSONObjectM16261b != null ? jSONObjectM16261b.optJSONObject("header").optString("app_version") : null);
            if (iM16255a != 0) {
                return m16258a(iM16255a, jSONObjectM16261b);
            }
            if (C3489e.f19173a) {
                Log.i(f19149b, "constructHeader size is " + jSONObjectM16261b.toString().getBytes().length);
            }
            return jSONObjectM16261b;
        } catch (Throwable th) {
            C3454e.m15904a(context, th);
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject9 = new JSONObject();
                    try {
                        jSONObject9.put("header", jSONObject);
                    } catch (JSONException unused4) {
                    } catch (Exception e) {
                        e = e;
                        jSONObject3 = jSONObject9;
                        C3454e.m15904a(context, e);
                        return m16258a(110, jSONObject3);
                    }
                    jSONObject4 = jSONObject2;
                    jSONObject3 = jSONObject9;
                } catch (Exception e2) {
                    e = e2;
                    jSONObject3 = null;
                }
            } else {
                jSONObject4 = jSONObject2;
                jSONObject3 = null;
            }
            if (jSONObject4 != null) {
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e3) {
                        e = e3;
                        C3454e.m15904a(context, e);
                        return m16258a(110, jSONObject3);
                    }
                }
                if (jSONObject4 != null) {
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (next2 != null && (next2 instanceof String) && (str = next2) != null && jSONObject4.opt(str) != null) {
                            try {
                                jSONObject3.put(str, jSONObject4.opt(str));
                            } catch (Exception unused5) {
                            }
                        }
                    }
                }
            }
            return m16258a(110, jSONObject3);
        }
    }
}
