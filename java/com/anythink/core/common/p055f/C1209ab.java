package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.exoplayer.C1575f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1209ab extends AbstractC1249n {

    /* JADX INFO: renamed from: n */
    public int f3712n;

    /* JADX INFO: renamed from: Y */
    private void m2430Y(int i) {
        this.f3712n = i;
    }

    /* JADX INFO: renamed from: i */
    public static C1209ab m2431i(String str) {
        C1209ab c1209ab = new C1209ab();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c1209ab.m3374s(jSONObject.optInt("f_t"));
                c1209ab.m3376t(jSONObject.optInt("v_c"));
                c1209ab.m3378u(jSONObject.optInt("s_b_t"));
                c1209ab.m3382w(jSONObject.optInt("e_c_a"));
                c1209ab.m3384x(jSONObject.optInt("v_m"));
                c1209ab.m3386y(jSONObject.optInt("s_c_t"));
                c1209ab.m3364n(jSONObject.optInt("m_t"));
                c1209ab.m3326c(jSONObject.optLong("o_c_t"));
                c1209ab.m3366o(jSONObject.optInt("ak_cfm"));
                c1209ab.m3321b(jSONObject.optLong("ctdown_time"));
                c1209ab.m3368p(jSONObject.optInt("sk_able"));
                c1209ab.m3370q(jSONObject.optInt("orient"));
                c1209ab.m3337e(jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE));
                c1209ab.m3372r(jSONObject.optInt("cl_btn"));
                c1209ab.m3388z(jSONObject.optInt("ec_r"));
                c1209ab.m3246A(jSONObject.optInt("ec_s_t"));
                c1209ab.m3248B(jSONObject.optInt("ec_l_t"));
                c1209ab.m3342f(jSONObject.optString("inter_type"));
                c1209ab.f3712n = jSONObject.optInt("spl_type");
                c1209ab.m3297a(jSONObject.optLong("or_t"));
                c1209ab.m3344g(jSONObject.optInt("rv_fail_reward"));
                c1209ab.m3348h(jSONObject.optInt("cl_sz"));
                c1209ab.m3358k(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    c1209ab.m3250C(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    c1209ab.m3252D(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    c1209ab.m3254E(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    c1209ab.m3256F(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    c1209ab.m3258G(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ipua")) {
                    c1209ab.m3335e(jSONObject.optInt("ipua"));
                }
                if (jSONObject.has("clua")) {
                    c1209ab.m3340f(jSONObject.optInt("clua"));
                }
                if (jSONObject.has("ap_arpt")) {
                    c1209ab.m3260H(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    c1209ab.m3262I(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("shk_sw")) {
                    c1209ab.m3264J(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    c1209ab.m3266K(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    c1209ab.m3331d(jSONObject.optLong("shk_time"));
                }
                if (jSONObject.has("click_cache_time")) {
                    c1209ab.m3268L(jSONObject.optInt("click_cache_time"));
                } else {
                    c1209ab.m3268L(3600000);
                }
                boolean z = true;
                if (jSONObject.has("click_nt_sw")) {
                    c1209ab.m3270M(jSONObject.optInt("click_nt_sw"));
                } else {
                    c1209ab.m3270M(1);
                }
                if (jSONObject.has("ft_cl_sz")) {
                    c1209ab.m3352i(jSONObject.optInt("ft_cl_sz"));
                } else {
                    c1209ab.m3352i(1);
                }
                if (jSONObject.has("sh_cl_itp")) {
                    c1209ab.m3355j(jSONObject.optInt("sh_cl_itp"));
                } else {
                    c1209ab.m3355j(2);
                }
                c1209ab.m3272N(jSONObject.optInt("shm_t", -1));
                if (jSONObject.has("ready_rate")) {
                    c1209ab.m3274O(jSONObject.optInt("ready_rate"));
                } else {
                    c1209ab.m3274O(100);
                }
                if (jSONObject.has("rsdl_rate")) {
                    c1209ab.m3276P(jSONObject.optInt("rsdl_rate"));
                } else {
                    c1209ab.m3276P(0);
                }
                if (jSONObject.has("video_ctn_type")) {
                    c1209ab.m3278Q(jSONObject.optInt("video_ctn_type"));
                } else {
                    c1209ab.m3278Q(2);
                }
                c1209ab.m3328c(jSONObject.optInt("at_cl_img", 2) == 1);
                c1209ab.m3333d(jSONObject.optInt("at_cl_video", 2) == 1);
                if (jSONObject.optInt("at_cl_ec", 2) != 1) {
                    z = false;
                }
                c1209ab.m3338e(z);
                c1209ab.m3336e(jSONObject.optLong("at_cl_pt", C1575f.f8394a));
                c1209ab.m3341f(jSONObject.optLong("at_cl_pct", C1575f.f8394a));
                c1209ab.m3345g(jSONObject.optLong("at_cl_ec_pt", C1575f.f8394a));
                c1209ab.m3349h(jSONObject.optLong("at_cl_ec_pct", C1575f.f8394a));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return c1209ab;
    }

    /* JADX INFO: renamed from: at */
    public final int m2432at() {
        return this.f3712n;
    }
}
