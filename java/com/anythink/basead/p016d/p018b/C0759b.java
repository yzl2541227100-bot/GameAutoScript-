package com.anythink.basead.p016d.p018b;

import com.anythink.basead.p014b.C0739a;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1216ai;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1219al;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.d.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0759b {

    /* JADX INFO: renamed from: a */
    public static final String f878a = "sdk_updatetime";

    /* JADX INFO: renamed from: a */
    public static final C1216ai m426a(C1248m c1248m, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C1169h.e.f3121e);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONArray("offers").optJSONObject(0);
            C1216ai c1216ai = new C1216ai();
            c1216ai.m2452a(c1248m.f4325f);
            c1216ai.m3209k(jSONObjectOptJSONObject2.optString(C1294j.f4872af));
            c1216ai.m3213l(jSONObjectOptJSONObject2.optString("c_id"));
            c1216ai.m3238x(jSONObjectOptJSONObject2.optString("pkg"));
            c1216ai.m3216m(jSONObjectOptJSONObject2.optString("title"));
            c1216ai.m3219n(jSONObjectOptJSONObject2.optString("desc"));
            c1216ai.m3203i(jSONObjectOptJSONObject2.optInt(C1781c.f10206Y));
            c1216ai.m3221o(jSONObjectOptJSONObject2.optString("icon_u"));
            c1216ai.m3224q(jSONObjectOptJSONObject2.optString("full_u"));
            c1216ai.m3197g(jSONObjectOptJSONObject2.optInt("unit_type"));
            c1216ai.m3226r(jSONObjectOptJSONObject2.optString("tp_logo_u"));
            c1216ai.m3228s(jSONObjectOptJSONObject2.optString(C0739a.a.f626k));
            c1216ai.m3230t(jSONObjectOptJSONObject2.optString("video_u"));
            c1216ai.m2495d(jSONObjectOptJSONObject2.optInt("video_l"));
            c1216ai.m2472K(jSONObjectOptJSONObject2.optString("video_r"));
            c1216ai.m2473L(jSONObjectOptJSONObject2.optString("ec_u"));
            c1216ai.m3232u(jSONObjectOptJSONObject2.optString("store_u"));
            c1216ai.m3200h(jSONObjectOptJSONObject2.optInt("link_type"));
            c1216ai.m3236w(jSONObjectOptJSONObject2.optString("click_u"));
            c1216ai.m3234v(jSONObjectOptJSONObject2.optString("deeplink"));
            c1216ai.m2454b(jSONObjectOptJSONObject2.optInt("r_target"));
            c1216ai.m2479a(jSONObjectOptJSONObject2.optLong("expire"));
            c1216ai.m3240y(jSONObjectOptJSONObject2.optString("ad_logo_title"));
            c1216ai.m2498q(jSONObjectOptJSONObject2.optInt("crt_type", 1));
            c1216ai.m2474M(jSONObjectOptJSONObject2.optString("img_list"));
            c1216ai.m2475N(jSONObjectOptJSONObject2.optString("banner_xhtml"));
            c1216ai.m2493b(jSONObject.optLong(f878a));
            c1216ai.m3194f(jSONObjectOptJSONObject2.optInt("offer_firm_id"));
            c1216ai.m3207j(jSONObjectOptJSONObject2.optString("jump_url"));
            c1216ai.m2476O(jSONObjectOptJSONObject2.optString(ATAdConst.KEY.APP_NAME));
            c1216ai.m3242z(jSONObjectOptJSONObject2.optString("publisher"));
            c1216ai.m3158A(jSONObjectOptJSONObject2.optString("app_version"));
            c1216ai.m3160B(jSONObjectOptJSONObject2.optString("privacy"));
            c1216ai.m3162C(jSONObjectOptJSONObject2.optString("permission"));
            c1216ai.m3188c(jSONObjectOptJSONObject2.optString("app_desc"));
            c1216ai.m3164D(jSONObjectOptJSONObject2.optString("wv_ctrl"));
            c1216ai.m3186a((AbstractC1249n) C1218ak.m2506i(jSONObjectOptJSONObject2.optString("ctrl")));
            c1216ai.m2480a(C1219al.m2510a(jSONObjectOptJSONObject2.optString("tk")));
            c1216ai.m3191e(jSONObjectOptJSONObject2.optInt("adp_type"));
            c1216ai.m3195f(jSONObjectOptJSONObject2.optString("offer_html"));
            c1216ai.m3198g(jSONObjectOptJSONObject2.optString(C1796r.f10838ab));
            c1216ai.m3190d(jSONObjectOptJSONObject2.optString("wx_username"));
            c1216ai.m3192e(jSONObjectOptJSONObject2.optString("wx_path"));
            c1216ai.m3187c(jSONObjectOptJSONObject2.optInt("o_w"));
            c1216ai.m3189d(jSONObjectOptJSONObject2.optInt("o_h"));
            return c1216ai;
        } catch (Throwable unused) {
            return null;
        }
    }
}
