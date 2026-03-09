package com.anythink.core.common.p066o;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1251p;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.videocommon.p181e.C2338b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.o.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1352p {

    /* JADX INFO: renamed from: a */
    public static final String f5334a = "anythink_bidding";

    /* JADX INFO: renamed from: a */
    public static void m4208a(C1243h c1243h, String str, String str2, String str3) {
        if (!ATSDK.isNetworkLogDebug() || c1243h == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int iM3039P = c1243h.m3039P();
            if (iM3039P == 66) {
                jSONObject.put("isAdxNetworkMode", c1243h.m3047X());
            }
            if (c1243h.m3088g() == 2) {
                jSONObject.put(CallMraidJS.f6709a, "shared placement");
            }
            if (c1243h.m3027G() != 0) {
                jSONObject.put("defaultAdSourceType", c1243h.m3027G());
            }
            jSONObject.put(C2338b.f14610v, c1243h.m2677ah());
            jSONObject.put("adType", c1243h.m2680ak());
            jSONObject.put("mixedFormatAdType", c1243h.m3043T());
            jSONObject.put(NativeAdvancedJsUtils.f6629p, str);
            jSONObject.put("refresh", c1243h.m3037N());
            jSONObject.put(C1796r.f10844ah, str2);
            jSONObject.put("segmentId", c1243h.m3040Q());
            jSONObject.put(C1233az.f4040i, c1243h.m3026F());
            jSONObject.put(RequestParameters.POSITION, c1243h.m3029H());
            jSONObject.put("networkType", iM3039P);
            jSONObject.put("networkName", c1243h.m2674ae());
            jSONObject.put("networkVersion", c1243h.f4217u);
            jSONObject.put("networkUnit", c1243h.m3038O());
            if (c1243h.m3022D() == 1) {
                String strM4132a = C1344h.m4132a(c1243h.m3096i());
                if (TextUtils.isEmpty(strM4132a)) {
                    jSONObject.put(C1251p.f4418f, 1);
                } else {
                    jSONObject.put(C1251p.f4418f, "1 (" + strM4132a + ")");
                }
            } else {
                jSONObject.put(C1251p.f4418f, 0);
            }
            jSONObject.put("msg", str3);
            jSONObject.put("hourly_frequency", c1243h.m3033J());
            jSONObject.put("daily_frequency", c1243h.m3034K());
            jSONObject.put("network_list", c1243h.m3035L());
            jSONObject.put("request_network_num", c1243h.m3036M());
            jSONObject.put("handle_class", c1243h.m3121q());
        } catch (Throwable unused) {
        }
        m4211a("network", jSONObject.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m4209a(String str, C1243h c1243h, String str2, C1229av c1229av, int i, int i2) {
        m4210a(str, c1243h, str2, c1229av, i, i2, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m4210a(String str, C1243h c1243h, String str2, C1229av c1229av, int i, int i2, List<String> list) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C1796r.f10839ac, str2);
                jSONObject.put(C2338b.f14610v, str);
                jSONObject.put("adtype", c1243h.m2680ak());
                jSONObject.put("adsourceId", c1229av.m2842u());
                jSONObject.put("networkFirmId", c1229av.m2784d());
                jSONObject.put("content", c1243h.m3038O());
                jSONObject.put("hourly_frequency", i);
                jSONObject.put("hourly_limit", c1229av.m2799g());
                jSONObject.put("daily_frequency", i2);
                jSONObject.put("daily_limit", c1229av.m2794f());
                jSONObject.put("pacing_limit", c1229av.m2840t());
                jSONObject.put("request_fail_interval", c1229av.m2712H());
                jSONObject.put("filter_source_ids", list != null ? list : "");
                m4216a("anythink_network", jSONObject.toString(), true);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4211a(String str, String str2) {
        if (ATSDK.isNetworkLogDebug()) {
            m4216a("anythink_".concat(String.valueOf(str)), str2, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4212a(String str, String str2, String str3, C1229av c1229av) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6629p, C1169h.n.f3172B);
                jSONObject.put(C1796r.f10844ah, str);
                jSONObject.put(C2338b.f14610v, str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("adsourceId", c1229av.m2842u());
                jSONObject.put("networkFirmId", c1229av.m2784d());
                jSONObject.put("content", c1229av.m2804h());
                jSONObject.put("msg", c1229av.m2698A());
                m4216a(f5334a, jSONObject.toString(), TextUtils.equals(C1169h.n.f3187m, str));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4213a(String str, String str2, String str3, String str4) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6629p, C1169h.n.f3173C);
                jSONObject.put(C1796r.f10844ah, str);
                jSONObject.put(C2338b.f14610v, str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("errorMsg", str4);
                m4216a("anythink_network", jSONObject.toString(), TextUtils.equals(C1169h.n.f3187m, str));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4214a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (ATSDK.isNetworkLogDebug()) {
            str2.hashCode();
            switch (str2) {
                case "0":
                    str6 = C1169h.n.f3192r;
                    break;
                case "1":
                    str6 = C1169h.n.f3191q;
                    break;
                case "2":
                    str6 = C1169h.n.f3189o;
                    break;
                case "3":
                    str6 = C1169h.n.f3190p;
                    break;
                case "4":
                    str6 = C1169h.n.f3193s;
                    break;
                default:
                    str6 = "";
                    break;
            }
            m4215a(str, str6, str3, str4, str5, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4215a(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            boolean r0 = com.anythink.core.api.ATSDK.isNetworkLogDebug()
            if (r0 == 0) goto Lbc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbc
            r0.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = "placementId"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = "adtype"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = "api"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = "result"
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = "reason"
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = ""
            if (r7 == 0) goto L9b
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r4 != 0) goto L95
            com.anythink.core.common.u r4 = com.anythink.core.common.C1387u.m4556a()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map r2 = r4.m4570b(r2)     // Catch: java.lang.Throwable -> Lbc
            int r4 = r2.size()     // Catch: java.lang.Throwable -> Lbc
            if (r4 <= 0) goto L95
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbc
            r4 = r3
        L45:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L81
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r6.<init>()     // Catch: java.lang.Throwable -> Lbc
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = "key="
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r4 = r5.getKey()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lbc
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = ",value="
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r4 = r5.getValue()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lbc
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = ";"
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lbc
            goto L45
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = "["
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lbc
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = "]"
            r2.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbc
            goto L96
        L95:
            r2 = r3
        L96:
            java.lang.String r4 = "extra"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> Lbc
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = "anythink_network"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lbc
            com.anythink.core.common.b.n r4 = com.anythink.core.common.p051b.C1175n.m2059a()     // Catch: java.lang.Throwable -> Lbc
            boolean r4 = r4.m2175v()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lae
            java.lang.String r3 = "(DebuggerMode)"
        Lae:
            r2.append(r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> Lbc
            android.util.Log.i(r2, r3)     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p066o.C1352p.m4215a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX INFO: renamed from: a */
    public static void m4216a(String str, String str2, boolean z) {
        String property = System.getProperty("line.separator");
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith("[")) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        String str3 = "╔═══════════════════════════════════════════════════════════════════════════════════════";
        for (String str4 : str2.split(property)) {
            str3 = (str3 + "\n") + "║ " + str4;
        }
        String str5 = str3 + "\n╚═══════════════════════════════════════════════════════════════════════════════════════";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C1175n.m2059a().m2175v() ? "(DebuggerMode)" : "");
            Log.e(sb.toString(), " \n".concat(String.valueOf(str5)));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(C1175n.m2059a().m2175v() ? "(DebuggerMode)" : "");
        Log.i(sb2.toString(), " \n".concat(String.valueOf(str5)));
    }

    /* JADX INFO: renamed from: b */
    public static void m4217b(String str, String str2, String str3, String str4, String str5) {
        m4215a(str, str2, str3, str4, str5, false);
    }
}
