package com.umeng.commonsdk.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import androidx.appcompat.widget.ActivityChooserModel;
import com.umeng.commonsdk.framework.C3405c;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.proguard.C3459j;
import com.umeng.commonsdk.proguard.C3467r;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.idtracking.C3496e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3453d {
    /* JADX INFO: renamed from: a */
    public static JSONObject m15881a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("f", C3459j.m15924c());
            jSONObject.put("t", C3459j.m15928d());
            jSONObject.put("ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m15882a(Context context) {
        C3489e.m16329a("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            try {
                if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                    UMWorkDispatch.sendEvent(context, C3408a.f18657e, C3435b.m15851a(context).m15852a(), null);
                }
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15883a(Context context, JSONObject jSONObject) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getApplicationContext().getPackageManager()) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m15884a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
        m15884a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
        m15884a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
        m15884a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
        m15884a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
    }

    /* JADX INFO: renamed from: a */
    private static void m15884a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, z ? 1 : 0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m15885b() {
        int i = Build.VERSION.SDK_INT;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_bl", Build.BOOTLOADER);
            if (i >= 14) {
                jSONObject.put("a_rv", Build.getRadioVersion());
            }
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            int i2 = 0;
            if (i >= 21) {
                JSONArray jSONArray = new JSONArray();
                int i3 = 0;
                while (true) {
                    String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    jSONArray.put(strArr[i3]);
                    i3++;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("a_s32", jSONArray);
                }
            }
            if (i >= 21) {
                JSONArray jSONArray2 = new JSONArray();
                int i4 = 0;
                while (true) {
                    String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                    if (i4 >= strArr2.length) {
                        break;
                    }
                    jSONArray2.put(strArr2[i4]);
                    i4++;
                }
                if (jSONArray2.length() > 0) {
                    jSONObject.put("a_s64", jSONArray2);
                }
            }
            if (i >= 21) {
                JSONArray jSONArray3 = new JSONArray();
                while (true) {
                    String[] strArr3 = Build.SUPPORTED_ABIS;
                    if (i2 >= strArr3.length) {
                        break;
                    }
                    jSONArray3.put(strArr3[i2]);
                    i2++;
                }
                if (jSONArray3.length() > 0) {
                    jSONObject.put("a_sa", jSONArray3);
                }
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", "unknown");
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            if (i >= 23) {
                jSONObject.put("a_bos", Build.VERSION.BASE_OS);
                jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
                jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            }
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m15886b(Context context) {
        if (context != null) {
            try {
                C3489e.m16329a("walle", "[internal] begin by not stateful--->>>");
                context = context.getApplicationContext();
                UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                JSONObject jSONObjectBuildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(context);
                if (jSONObjectBuildSLBaseHeader != null && jSONObjectBuildSLBaseHeader.has("header")) {
                    try {
                        JSONObject jSONObject = (JSONObject) jSONObjectBuildSLBaseHeader.opt("header");
                        if (jSONObject != null) {
                            jSONObject.put(C3471v.f18963aq, C3408a.f18656d);
                        }
                    } catch (Exception unused) {
                    }
                }
                C3489e.m16329a("walle", "[internal] header is " + jSONObjectBuildSLBaseHeader.toString());
                JSONObject jSONObjectM15888c = m15888c(context);
                C3489e.m16329a("walle", "[internal] body is " + jSONObjectM15888c.toString());
                C3489e.m16329a("walle", uMSLEnvelopeBuild.buildSLEnvelope(context, jSONObjectBuildSLBaseHeader, jSONObjectM15888c, C3408a.f18653a).toString());
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m15887b(Context context, JSONObject jSONObject) {
        if (context != null) {
            String strM16029a = C3469t.m16029a(context);
            if (TextUtils.isEmpty(strM16029a)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strM16029a);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2.has(C3469t.f18911d)) {
                    jSONObject.put(C3469t.f18911d, jSONObject2.opt(C3469t.f18911d));
                }
                if (jSONObject2.has(C3469t.f18910c)) {
                    jSONObject.put(C3469t.f18910c, jSONObject2.opt(C3469t.f18910c));
                }
                if (jSONObject2.has(C3469t.f18909b)) {
                    jSONObject.put(C3469t.f18909b, jSONObject2.opt(C3469t.f18909b));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m15888c(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                try {
                    JSONArray jSONArrayM15900o = m15900o(applicationContext);
                    if (jSONArrayM15900o != null && jSONArrayM15900o.length() > 0) {
                        jSONObject2.put("run_server", jSONArrayM15900o);
                    }
                } catch (Exception e) {
                    C3454e.m15904a(applicationContext, e);
                }
                try {
                    String strM15941k = C3459j.m15941k(applicationContext);
                    if (!TextUtils.isEmpty(strM15941k)) {
                        jSONObject2.put("imsi", strM15941k);
                    }
                } catch (Exception e2) {
                    C3454e.m15904a(applicationContext, e2);
                }
                try {
                    String strM15942l = C3459j.m15942l(applicationContext);
                    if (!TextUtils.isEmpty(strM15942l)) {
                        jSONObject2.put("meid", strM15942l);
                    }
                } catch (Exception e3) {
                    C3454e.m15904a(applicationContext, e3);
                }
                try {
                    jSONObject.put(C3405c.f18619d, jSONObject2);
                } catch (JSONException e4) {
                    C3454e.m15904a(applicationContext, e4);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m15889d(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                JSONArray jSONArrayM15900o = m15900o(applicationContext);
                if (jSONArrayM15900o != null && jSONArrayM15900o.length() > 0) {
                    jSONObject2.put("rs", jSONArrayM15900o);
                }
            } catch (Exception e) {
                C3454e.m15904a(applicationContext, e);
            }
            try {
                JSONArray jSONArrayM15901p = m15901p(applicationContext);
                if (jSONArrayM15901p != null && jSONArrayM15901p.length() > 0) {
                    jSONObject2.put("bstn", jSONArrayM15901p);
                }
            } catch (Exception e2) {
                C3454e.m15904a(applicationContext, e2);
            }
            try {
                JSONArray jSONArrayM15902q = m15902q(applicationContext);
                if (jSONArrayM15902q != null && jSONArrayM15902q.length() > 0) {
                    jSONObject2.put("by", jSONArrayM15902q);
                }
            } catch (Exception e3) {
                C3454e.m15904a(applicationContext, e3);
            }
            try {
                m15883a(applicationContext, jSONObject2);
            } catch (Exception e4) {
                C3454e.m15904a(applicationContext, e4);
            }
            try {
                m15887b(applicationContext, jSONObject2);
            } catch (Exception e5) {
                C3454e.m15904a(applicationContext, e5);
            }
            try {
                JSONObject jSONObjectM15881a = m15881a();
                if (jSONObjectM15881a != null && jSONObjectM15881a.length() > 0) {
                    jSONObject2.put("sd", jSONObjectM15881a);
                }
            } catch (Exception e6) {
                C3454e.m15904a(applicationContext, e6);
            }
            try {
                JSONObject jSONObjectM15885b = m15885b();
                if (jSONObjectM15885b != null && jSONObjectM15885b.length() > 0) {
                    jSONObject2.put("build", jSONObjectM15885b);
                }
            } catch (Exception e7) {
                C3454e.m15904a(applicationContext, e7);
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArrayM15891f = m15891f(applicationContext);
                if (jSONArrayM15891f != null && jSONArrayM15891f.length() > 0) {
                    try {
                        jSONObject3.put("a_sr", jSONArrayM15891f);
                    } catch (JSONException unused) {
                    }
                }
                JSONArray jSONArrayM16006c = C3467r.m16006c(applicationContext);
                if (jSONArrayM16006c != null && jSONArrayM16006c.length() > 0) {
                    try {
                        jSONObject3.put("stat", jSONArrayM16006c);
                    } catch (JSONException unused2) {
                    }
                }
                jSONObject2.put("sr", jSONObject3);
            } catch (Exception e8) {
                C3454e.m15904a(applicationContext, e8);
            }
            try {
                JSONObject jSONObjectM15892g = m15892g(applicationContext);
                if (jSONObjectM15892g != null && jSONObjectM15892g.length() > 0) {
                    jSONObject2.put("scr", jSONObjectM15892g);
                }
            } catch (Exception e9) {
                C3454e.m15904a(applicationContext, e9);
            }
            try {
                JSONObject jSONObjectM15893h = m15893h(applicationContext);
                if (jSONObjectM15893h != null && jSONObjectM15893h.length() > 0) {
                    jSONObject2.put("sinfo", jSONObjectM15893h);
                }
            } catch (Exception e10) {
                C3454e.m15904a(applicationContext, e10);
            }
            try {
                JSONObject jSONObject4 = new JSONObject();
                JSONArray jSONArrayM15932e = C3459j.m15932e(applicationContext);
                if (jSONArrayM15932e != null && jSONArrayM15932e.length() > 0) {
                    try {
                        jSONObject4.put("wl", jSONArrayM15932e);
                    } catch (JSONException unused3) {
                    }
                }
                JSONArray jSONArrayM15894i = m15894i(applicationContext);
                if (jSONArrayM15894i != null && jSONArrayM15894i.length() > 0) {
                    try {
                        jSONObject4.put("a_wls", jSONArrayM15894i);
                    } catch (JSONException unused4) {
                    }
                }
                jSONObject2.put("winfo", jSONObject4);
            } catch (Exception e11) {
                C3454e.m15904a(applicationContext, e11);
            }
            try {
                JSONArray jSONArrayM15895j = m15895j(applicationContext);
                if (jSONArrayM15895j != null && jSONArrayM15895j.length() > 0) {
                    jSONObject2.put("input", jSONArrayM15895j);
                }
            } catch (Exception e12) {
                C3454e.m15904a(applicationContext, e12);
            }
            try {
                JSONObject jSONObjectM15945o = C3459j.m15945o(applicationContext);
                if (jSONObjectM15945o != null && jSONObjectM15945o.length() > 0) {
                    jSONObject2.put("bt", jSONObjectM15945o);
                }
            } catch (Exception e13) {
                C3454e.m15904a(applicationContext, e13);
            }
            try {
                JSONArray jSONArrayM15896k = m15896k(applicationContext);
                if (jSONArrayM15896k != null && jSONArrayM15896k.length() > 0) {
                    jSONObject2.put("cam", jSONArrayM15896k);
                }
            } catch (Exception e14) {
                C3454e.m15904a(applicationContext, e14);
            }
            try {
                JSONArray jSONArrayM15897l = m15897l(applicationContext);
                if (jSONArrayM15897l != null && jSONArrayM15897l.length() > 0) {
                    jSONObject2.put("appls", jSONArrayM15897l);
                }
            } catch (Exception e15) {
                C3454e.m15904a(applicationContext, e15);
            }
            try {
                JSONObject jSONObjectM15898m = m15898m(applicationContext);
                if (jSONObjectM15898m != null && jSONObjectM15898m.length() > 0) {
                    jSONObject2.put("mem", jSONObjectM15898m);
                }
            } catch (Exception e16) {
                C3454e.m15904a(applicationContext, e16);
            }
            try {
                JSONObject jSONObjectM15899n = m15899n(applicationContext);
                if (jSONObjectM15899n != null && jSONObjectM15899n.length() > 0) {
                    jSONObject2.put("lbs", jSONObjectM15899n);
                }
            } catch (Exception e17) {
                C3454e.m15904a(applicationContext, e17);
            }
            try {
                jSONObject.put(C3471v.f18953ag, jSONObject2);
            } catch (JSONException e18) {
                C3454e.m15904a(applicationContext, e18);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static String m15890e(Context context) {
        try {
            C3496e c3496eM16376a = C3496e.m16376a(context);
            if (c3496eM16376a == null) {
                return null;
            }
            c3496eM16376a.m16381a();
            String strEncodeToString = Base64.encodeToString(new C3418aj().m15741a(c3496eM16376a.m16383b()), 0);
            if (TextUtils.isEmpty(strEncodeToString)) {
                return null;
            }
            return strEncodeToString;
        } catch (Exception e) {
            C3454e.m15904a(context, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static JSONArray m15891f(Context context) {
        if (context != null) {
            return C3468s.m16027g(context.getApplicationContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static JSONObject m15892g(Context context) {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", C3459j.m15937h(context));
                jSONObject.put("a_nav_h", C3459j.m15939i(context));
                if (context.getResources() != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
                    jSONObject.put("a_den", displayMetrics.density);
                    jSONObject.put("a_dpi", displayMetrics.densityDpi);
                }
            } catch (Exception e) {
                C3454e.m15904a(context, e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m15893h(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", C3459j.m15918a(applicationContext, packageName));
                jSONObject.put("a_alut", C3459j.m15921b(applicationContext, packageName));
                jSONObject.put("a_c", C3459j.m15926c(applicationContext, packageName));
                jSONObject.put("a_uid", C3459j.m15927d(applicationContext, packageName));
                if (C3459j.m15920a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("a_ua", C3459j.m15949s(applicationContext));
                jSONObject.put("tf", C3459j.m15922b());
                jSONObject.put("s_fs", C3459j.m15917a(applicationContext));
                jSONObject.put("a_meid", C3459j.m15942l(applicationContext));
                jSONObject.put("a_imsi", C3459j.m15941k(applicationContext));
                jSONObject.put("st", C3459j.m15933f());
                String strM16021b = C3468s.m16021b(applicationContext);
                if (!TextUtils.isEmpty(strM16021b)) {
                    try {
                        jSONObject.put("a_iccid", strM16021b);
                    } catch (Exception unused) {
                    }
                }
                String strM16023c = C3468s.m16023c(applicationContext);
                if (!TextUtils.isEmpty(strM16023c)) {
                    try {
                        jSONObject.put("a_simei", strM16023c);
                    } catch (Exception unused2) {
                    }
                }
                jSONObject.put("hn", C3459j.m15936g());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e) {
                C3454e.m15904a(applicationContext, e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public static JSONArray m15894i(Context context) {
        Context applicationContext;
        List<ScanResult> listM15923b;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM15923b = C3459j.m15923b((applicationContext = context.getApplicationContext()))) != null && listM15923b.size() > 0) {
            for (ScanResult scanResult : listM15923b) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_bssid", scanResult.BSSID);
                    jSONObject.put("a_ssid", scanResult.BSSID);
                    jSONObject.put("a_cap", scanResult.capabilities);
                    jSONObject.put("a_fcy", scanResult.frequency);
                    jSONObject.put("ts", System.currentTimeMillis());
                    if (Build.VERSION.SDK_INT >= 23) {
                        jSONObject.put("a_c0", scanResult.centerFreq0);
                        jSONObject.put("a_c1", scanResult.centerFreq1);
                        jSONObject.put("a_cw", scanResult.channelWidth);
                        if (scanResult.is80211mcResponder()) {
                            jSONObject.put("a_is80211", 1);
                        } else {
                            jSONObject.put("a_is80211", 0);
                        }
                        if (scanResult.isPasspointNetwork()) {
                            jSONObject.put("a_isppn", 1);
                        } else {
                            jSONObject.put("a_isppn", 0);
                        }
                        jSONObject.put("a_ofn", scanResult.operatorFriendlyName);
                        jSONObject.put("a_vn", scanResult.venueName);
                    }
                    jSONObject.put("a_dc", scanResult.describeContents());
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    C3454e.m15904a(applicationContext, e);
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: j */
    public static JSONArray m15895j(Context context) {
        Context applicationContext;
        List<InputMethodInfo> listM15943m;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM15943m = C3459j.m15943m((applicationContext = context.getApplicationContext()))) != null) {
            for (InputMethodInfo inputMethodInfo : listM15943m) {
                try {
                    CharSequence charSequenceLoadLabel = inputMethodInfo.loadLabel(applicationContext.getPackageManager());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_la", charSequenceLoadLabel);
                    jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    C3454e.m15904a(applicationContext, e);
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: k */
    public static JSONArray m15896k(Context context) {
        Context applicationContext;
        List<C3467r.a> listM16010e;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM16010e = C3467r.m16010e((applicationContext = context.getApplicationContext()))) != null && !listM16010e.isEmpty()) {
            for (C3467r.a aVar : listM16010e) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_w", aVar.f18902a);
                        jSONObject.put("a_h", aVar.f18903b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        C3454e.m15904a(applicationContext, e);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: l */
    public static JSONArray m15897l(Context context) {
        Context applicationContext;
        List<C3459j.a> listM15946p;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM15946p = C3459j.m15946p((applicationContext = context.getApplicationContext()))) != null && !listM15946p.isEmpty()) {
            for (C3459j.a aVar : listM15946p) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", aVar.f18823a);
                        jSONObject.put("a_la", aVar.f18824b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        C3454e.m15904a(applicationContext, e);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m15898m(Context context) {
        Context applicationContext;
        ActivityManager.MemoryInfo memoryInfoM15947q;
        JSONObject jSONObject = new JSONObject();
        if (context != null && (memoryInfoM15947q = C3459j.m15947q((applicationContext = context.getApplicationContext()))) != null) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    jSONObject.put("t", memoryInfoM15947q.totalMem);
                }
                jSONObject.put("f", memoryInfoM15947q.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e) {
                C3454e.m15904a(applicationContext, e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: n */
    private static JSONObject m15899n(Context context) {
        if (context != null) {
            return C3457h.m15915b(context.getApplicationContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private static JSONArray m15900o(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray = null;
        jSONArray = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
                return null;
            }
            int i = 0;
            while (i < runningServices.size()) {
                if (runningServices.get(i) != null && runningServices.get(i).service != null && runningServices.get(i).service.getClassName() != null && runningServices.get(i).service.getPackageName() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sn", runningServices.get(i).service.getClassName().toString());
                        jSONObject.put("pn", runningServices.get(i).service.getPackageName().toString());
                        jSONArray = jSONArray;
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                i++;
                jSONArray = jSONArray;
            }
            if (jSONArray == null) {
                return jSONArray;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject2.put("ls", jSONArray);
            } catch (JSONException unused2) {
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("sers", jSONObject2);
            } catch (JSONException unused3) {
            }
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2.put(jSONObject3);
                return jSONArray2;
            } catch (Throwable th) {
                th = th;
                jSONArray = jSONArray2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        C3454e.m15904a(context, th);
        return jSONArray;
    }

    /* JADX INFO: renamed from: p */
    private static JSONArray m15901p(Context context) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectM16024d = C3468s.m16024d(context);
        if (jSONObjectM16024d != null) {
            try {
                String strM16025e = C3468s.m16025e(context);
                if (!TextUtils.isEmpty(strM16025e)) {
                    jSONObjectM16024d.put("sig", strM16025e);
                }
                jSONArray.put(jSONObjectM16024d);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: q */
    private static JSONArray m15902q(Context context) {
        JSONArray jSONArray = new JSONArray();
        String strM16026f = C3468s.m16026f(context);
        if (!TextUtils.isEmpty(strM16026f)) {
            try {
                jSONArray.put(new JSONObject(strM16026f));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: r */
    private static JSONArray m15903r(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String strM16019a = C3468s.m16019a(applicationContext);
            JSONObject jSONObject = null;
            if (!TextUtils.isEmpty(strM16019a)) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(C3471v.f18939T, strM16019a);
                    } catch (Exception unused) {
                    }
                    jSONObject = jSONObject2;
                } catch (Exception unused2) {
                }
            }
            String strM16021b = C3468s.m16021b(applicationContext);
            if (!TextUtils.isEmpty(strM16021b)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused3) {
                    }
                }
                jSONObject.put(C3471v.f18940U, strM16021b);
            }
            String strM16023c = C3468s.m16023c(applicationContext);
            if (!TextUtils.isEmpty(strM16023c)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused4) {
                    }
                }
                jSONObject.put(C3471v.f18941V, strM16023c);
            }
            JSONObject jSONObjectM16024d = C3468s.m16024d(applicationContext);
            if (jSONObjectM16024d != null) {
                try {
                    String strM16025e = C3468s.m16025e(applicationContext);
                    if (!TextUtils.isEmpty(strM16025e)) {
                        jSONObjectM16024d.put("signalscale", strM16025e);
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put(C3471v.f18943X, jSONObjectM16024d);
                } catch (Exception unused5) {
                }
            }
            String strM16026f = C3468s.m16026f(applicationContext);
            if (!TextUtils.isEmpty(strM16026f)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused6) {
                    }
                }
                jSONObject.put("battery", new JSONObject(strM16026f));
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
