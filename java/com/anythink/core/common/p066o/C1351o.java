package com.anythink.core.common.p066o;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.o.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1351o {

    /* JADX INFO: renamed from: A */
    public static final String f5307A = "it_src";

    /* JADX INFO: renamed from: a */
    public static final String f5308a = "platform";

    /* JADX INFO: renamed from: b */
    public static final String f5309b = "os_vn";

    /* JADX INFO: renamed from: c */
    public static final String f5310c = "os_vc";

    /* JADX INFO: renamed from: d */
    public static final String f5311d = "package_name";

    /* JADX INFO: renamed from: e */
    public static final String f5312e = "app_vn";

    /* JADX INFO: renamed from: f */
    public static final String f5313f = "app_vc";

    /* JADX INFO: renamed from: g */
    public static final String f5314g = "brand";

    /* JADX INFO: renamed from: h */
    public static final String f5315h = "model";

    /* JADX INFO: renamed from: i */
    public static final String f5316i = "screen";

    /* JADX INFO: renamed from: j */
    public static final String f5317j = "network_type";

    /* JADX INFO: renamed from: k */
    public static final String f5318k = "mnc";

    /* JADX INFO: renamed from: l */
    public static final String f5319l = "mcc";

    /* JADX INFO: renamed from: m */
    public static final String f5320m = "language";

    /* JADX INFO: renamed from: n */
    public static final String f5321n = "timezone";

    /* JADX INFO: renamed from: o */
    public static final String f5322o = "sdk_ver";

    /* JADX INFO: renamed from: p */
    public static final String f5323p = "gp_ver";

    /* JADX INFO: renamed from: q */
    public static final String f5324q = "nw_ver";

    /* JADX INFO: renamed from: r */
    public static final String f5325r = "ua";

    /* JADX INFO: renamed from: s */
    public static final String f5326s = "orient";

    /* JADX INFO: renamed from: t */
    public static final String f5327t = "system";

    /* JADX INFO: renamed from: u */
    public static final String f5328u = "android_id";

    /* JADX INFO: renamed from: v */
    public static final String f5329v = "gaid";

    /* JADX INFO: renamed from: w */
    public static final String f5330w = "channel";

    /* JADX INFO: renamed from: x */
    public static final String f5331x = "sub_channel";

    /* JADX INFO: renamed from: y */
    public static final String f5332y = "upid";

    /* JADX INFO: renamed from: z */
    public static final String f5333z = "ps_id";

    /* JADX INFO: renamed from: a */
    public static JSONObject m4205a() {
        JSONObject jSONObjectM4206b = m4206b();
        JSONObject jSONObjectM4207c = m4207c();
        try {
            jSONObjectM4206b.put("app_id", C1175n.m2059a().m2165o());
            Iterator<String> itKeys = jSONObjectM4207c.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM4206b.put(next, jSONObjectM4207c.opt(next));
            }
        } catch (JSONException unused) {
        }
        return jSONObjectM4206b;
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m4206b() {
        JSONObject jSONObject = new JSONObject();
        Context contextM2148f = C1175n.m2059a().m2148f();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", C1341e.m4062e());
            jSONObject.put("os_vc", C1341e.m4059d());
            jSONObject.put("package_name", C1341e.m4080l(contextM2148f));
            jSONObject.put("app_vn", C1341e.m4076j(contextM2148f));
            jSONObject.put("app_vc", C1341e.m4074i(contextM2148f));
            jSONObject.put("brand", C1341e.m4054b());
            jSONObject.put("model", C1341e.m4048a());
            jSONObject.put("screen", C1341e.m4078k(contextM2148f));
            jSONObject.put("network_type", String.valueOf(C1341e.m4083n(contextM2148f)));
            jSONObject.put("mnc", C1341e.m4058c(contextM2148f));
            jSONObject.put("mcc", C1341e.m4055b(contextM2148f));
            jSONObject.put("language", C1341e.m4066f(contextM2148f));
            jSONObject.put("timezone", C1341e.m4057c());
            jSONObject.put("sdk_ver", C1344h.m4131a());
            jSONObject.put("gp_ver", C1341e.m4086o(contextM2148f));
            jSONObject.put("ua", C1341e.m4073i());
            jSONObject.put("orient", C1341e.m4068g(contextM2148f));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(C1175n.m2059a().m2161m())) {
                jSONObject.put("channel", C1175n.m2059a().m2161m());
            }
            if (!TextUtils.isEmpty(C1175n.m2059a().m2163n())) {
                jSONObject.put("sub_channel", C1175n.m2059a().m2163n());
            }
            jSONObject.put("upid", C1175n.m2059a().m2177x());
            jSONObject.put("ps_id", C1175n.m2059a().m2168q());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m4207c() {
        String strM4711H;
        String str;
        Context contextM2148f = C1175n.m2059a().m2148f();
        JSONObject jSONObject = new JSONObject();
        C1391a c1391aM4865b = C1392b.m4845a(contextM2148f).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b != null) {
            try {
                strM4711H = c1391aM4865b.m4711H();
            } catch (Exception unused) {
            }
        } else {
            strM4711H = "";
        }
        boolean z = true;
        if (!TextUtils.isEmpty(strM4711H)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strM4711H);
                if (!jSONObject2.isNull("a")) {
                    if (jSONObject2.optInt("a") != 1) {
                        z = false;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z ? C1341e.m4060d(contextM2148f) : "");
        jSONObject.put("gaid", C1341e.m4065f());
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b != null) {
            iExHandlerM2132b.fillRequestData(jSONObject, c1391aM4865b);
            str = "1";
        } else {
            str = "0";
        }
        jSONObject.put("is_cn_sdk", str);
        String strM4082m = C1341e.m4082m(contextM2148f);
        jSONObject.put("it_src", TextUtils.isEmpty(strM4082m) ? "" : strM4082m);
        return jSONObject;
    }
}
