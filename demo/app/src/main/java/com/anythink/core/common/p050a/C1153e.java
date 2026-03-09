package com.anythink.core.common.p050a;

import android.text.TextUtils;
import com.anythink.basead.p014b.C0739a;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1219al;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1153e {
    /* JADX INFO: renamed from: a */
    private static C1245j m1963a(String str, JSONObject jSONObject, int i) {
        return m1964a(str, jSONObject, i, false);
    }

    /* JADX INFO: renamed from: a */
    public static C1245j m1964a(String str, JSONObject jSONObject, int i, boolean z) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C1169h.e.f3121e);
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            } else if (!jSONObject.has("seatbid")) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONArray("seatbid").optJSONObject(0);
            C1245j c1245j = new C1245j();
            c1245j.m3149b(str);
            c1245j.m3209k(jSONObjectOptJSONObject2.optString(C1294j.f4872af));
            c1245j.m3213l(jSONObjectOptJSONObject2.optString("c_id"));
            c1245j.m3238x(jSONObjectOptJSONObject2.optString("pkg"));
            c1245j.m3216m(jSONObjectOptJSONObject2.optString("title"));
            c1245j.m3219n(jSONObjectOptJSONObject2.optString("desc"));
            c1245j.m3203i(jSONObjectOptJSONObject2.optInt(C1781c.f10206Y));
            c1245j.m3221o(jSONObjectOptJSONObject2.optString("icon_u"));
            c1245j.m3224q(jSONObjectOptJSONObject2.optString("full_u"));
            c1245j.m3197g(jSONObjectOptJSONObject2.optInt("unit_type"));
            c1245j.m3226r(jSONObjectOptJSONObject2.optString("tp_logo_u"));
            c1245j.m3228s(jSONObjectOptJSONObject2.optString(C0739a.a.f626k));
            c1245j.m3230t(jSONObjectOptJSONObject2.optString("video_u"));
            c1245j.m2495d(jSONObjectOptJSONObject2.optInt("video_l"));
            c1245j.m2472K(jSONObjectOptJSONObject2.optString("video_r"));
            c1245j.m2473L(jSONObjectOptJSONObject2.optString("ec_u"));
            c1245j.m3232u(jSONObjectOptJSONObject2.optString("store_u"));
            c1245j.m3200h(jSONObjectOptJSONObject2.optInt("link_type"));
            c1245j.m3236w(jSONObjectOptJSONObject2.optString("click_u"));
            c1245j.m3234v(jSONObjectOptJSONObject2.optString("deeplink"));
            c1245j.m2498q(jSONObjectOptJSONObject2.optInt("crt_type", 1));
            c1245j.m2474M(jSONObjectOptJSONObject2.optString("img_list"));
            c1245j.m2475N(jSONObjectOptJSONObject2.optString("banner_xhtml"));
            c1245j.m3194f(jSONObjectOptJSONObject2.optInt("offer_firm_id"));
            c1245j.m3207j(jSONObjectOptJSONObject2.optString("jump_url"));
            try {
                String strOptString = jSONObjectOptJSONObject2.optString("sdk_resp");
                if (!TextUtils.isEmpty(strOptString)) {
                    c1245j.m3146a(new JSONObject(strOptString).optString("data"));
                }
            } catch (Throwable unused) {
            }
            c1245j.m2476O(jSONObjectOptJSONObject2.optString(ATAdConst.KEY.APP_NAME));
            c1245j.m3242z(jSONObjectOptJSONObject2.optString("publisher"));
            c1245j.m3158A(jSONObjectOptJSONObject2.optString("app_version"));
            c1245j.m3160B(jSONObjectOptJSONObject2.optString("privacy"));
            c1245j.m3162C(jSONObjectOptJSONObject2.optString("permission"));
            c1245j.m3188c(jSONObjectOptJSONObject2.optString("app_desc"));
            c1245j.m3204i(jSONObjectOptJSONObject2.optString("mtr_ver"));
            c1245j.m2499r(jSONObjectOptJSONObject2.optInt("o_im_cap_sw", 2));
            c1245j.m2500s(jSONObjectOptJSONObject2.optInt("o_cl_cap_sw", 2));
            c1245j.m2501t(jSONObjectOptJSONObject2.optInt("c_im_cap_sw", 2));
            c1245j.m2502u(jSONObjectOptJSONObject2.optInt("c_cl_cap_sw", 2));
            if (i == 67) {
                c1245j.m3145a(2);
            } else {
                c1245j.m3145a(1);
            }
            c1245j.m3186a((AbstractC1249n) C1218ak.m2506i(jSONObjectOptJSONObject2.optString("ctrl")));
            c1245j.m2480a(C1219al.m2510a(jSONObjectOptJSONObject2.optString("tk")));
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject2.optString("nw_info"));
                c1245j.m2467F(jSONObject2.optString("app_id"));
                c1245j.m2468G(jSONObject2.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY));
                c1245j.m2469H(jSONObject2.optString("unit_id"));
            } catch (Throwable unused2) {
            }
            c1245j.m2470I(jSONObjectOptJSONObject2.optString("dsp_id", ""));
            c1245j.m2471J(jSONObjectOptJSONObject2.optString("dsp_oid", ""));
            c1245j.m2496o(jSONObjectOptJSONObject2.optInt(C1781c.f10201T, -1));
            c1245j.m2497p(jSONObjectOptJSONObject2.optInt("install_sw", -1));
            c1245j.m3164D(jSONObjectOptJSONObject2.optString("wv_ctrl"));
            c1245j.m3191e(jSONObjectOptJSONObject2.optInt("adp_type"));
            c1245j.m3195f(jSONObjectOptJSONObject2.optString("offer_html"));
            c1245j.m3198g(jSONObjectOptJSONObject2.optString(C1796r.f10838ab));
            c1245j.m3190d(jSONObjectOptJSONObject2.optString("wx_username"));
            c1245j.m3192e(jSONObjectOptJSONObject2.optString("wx_path"));
            c1245j.m3187c(jSONObjectOptJSONObject2.optInt("o_w"));
            c1245j.m3189d(jSONObjectOptJSONObject2.optInt("o_h"));
            if (z) {
                jSONObjectOptJSONObject2.put(C1245j.f4228c, 1);
            }
            c1245j.m3148b(jSONObjectOptJSONObject2.optInt(C1245j.f4228c));
            return c1245j;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
