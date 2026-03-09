package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.common.C1294j;
import com.anythink.expressad.exoplayer.C1575f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C1218ak extends AbstractC1249n {

    /* JADX INFO: renamed from: n */
    private int f3772n;

    /* JADX INFO: renamed from: o */
    private int f3773o;

    /* JADX INFO: renamed from: p */
    private int f3774p;

    /* JADX INFO: renamed from: Y */
    private void m2503Y(int i) {
        this.f3773o = i;
    }

    /* JADX INFO: renamed from: Z */
    private void m2504Z(int i) {
        this.f3772n = i;
    }

    /* JADX INFO: renamed from: aa */
    private void m2505aa(int i) {
        this.f3774p = i;
    }

    /* JADX INFO: renamed from: i */
    public static C1218ak m2506i(String str) {
        int i;
        C1218ak c1218ak = new C1218ak();
        if (TextUtils.isEmpty(str)) {
            return c1218ak;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c1218ak.m3374s(jSONObject.optInt("f_t"));
            int iOptInt = jSONObject.optInt("v_c");
            if (iOptInt == 1) {
                iOptInt = 0;
            } else if (iOptInt == 2) {
                iOptInt = 1;
            }
            c1218ak.m3376t(iOptInt);
            c1218ak.m3378u(jSONObject.optInt("s_b_t"));
            if (jSONObject.has("s_b_d")) {
                c1218ak.m3380v(jSONObject.optInt("s_b_d"));
            }
            int iOptInt2 = jSONObject.optInt("e_c_a");
            if (iOptInt2 == 1) {
                iOptInt2 = 0;
            } else if (iOptInt2 == 2) {
                iOptInt2 = 1;
            } else if (iOptInt2 == 3) {
                iOptInt2 = 2;
            }
            c1218ak.m3382w(iOptInt2);
            int iOptInt3 = jSONObject.optInt("ak_cfm");
            if (iOptInt3 == 1) {
                iOptInt3 = 0;
            } else if (iOptInt3 == 2) {
                iOptInt3 = 1;
            }
            c1218ak.m3366o(iOptInt3);
            c1218ak.m3364n(jSONObject.optInt("m_t"));
            int iOptInt4 = jSONObject.optInt("cm");
            if (iOptInt4 == 1) {
                iOptInt4 = 0;
            } else if (iOptInt4 == 2) {
                iOptInt4 = 1;
            }
            c1218ak.f3772n = iOptInt4;
            c1218ak.m3335e(jSONObject.optInt("ipua"));
            c1218ak.m3340f(jSONObject.optInt("clua"));
            c1218ak.m3362m(jSONObject.optInt("dp_cm"));
            c1218ak.f3773o = jSONObject.optInt("l_o_num");
            c1218ak.m3360l(jSONObject.optInt("ld_t"));
            c1218ak.m3388z(jSONObject.optInt("ec_r"));
            c1218ak.m3246A(jSONObject.optInt("ec_s_t"));
            c1218ak.m3248B(jSONObject.optInt("ec_l_t"));
            c1218ak.m3297a(jSONObject.optLong("or_t"));
            c1218ak.m3344g(jSONObject.optInt("rv_fail_reward"));
            c1218ak.m3348h(jSONObject.optInt("cl_sz"));
            c1218ak.m3358k(jSONObject.optInt("si_fit"));
            if (jSONObject.has("at_cl_sw")) {
                c1218ak.m3250C(jSONObject.optInt("at_cl_sw"));
            }
            if (jSONObject.has("at_ct_ti")) {
                c1218ak.m3252D(jSONObject.optInt("at_ct_ti"));
            }
            if (jSONObject.has("int_cl_sw")) {
                c1218ak.m3254E(jSONObject.optInt("int_cl_sw"));
            }
            if (jSONObject.has("int_cl_ti")) {
                c1218ak.m3256F(jSONObject.optInt("int_cl_ti"));
            }
            if (jSONObject.has("sh_ec")) {
                c1218ak.m3258G(jSONObject.optInt("sh_ec"));
            }
            if (jSONObject.has("ap_arpt")) {
                c1218ak.m3260H(jSONObject.optInt("ap_arpt"));
            }
            if (jSONObject.has("ap_pasbl")) {
                c1218ak.m3262I(jSONObject.optInt("ap_pasbl"));
            }
            if (jSONObject.has("inter_type")) {
                c1218ak.m3342f(jSONObject.optString("inter_type"));
            }
            if (jSONObject.has("shk_sw")) {
                c1218ak.m3264J(jSONObject.optInt("shk_sw"));
            }
            if (jSONObject.has("shk_strength_and")) {
                c1218ak.m3266K(jSONObject.optInt("shk_strength_and"));
            }
            if (jSONObject.has("shk_time")) {
                c1218ak.m3331d(jSONObject.optLong("shk_time"));
            }
            if (jSONObject.has("click_cache_time")) {
                c1218ak.m3268L(jSONObject.optInt("click_cache_time"));
            }
            if (jSONObject.has("click_nt_sw")) {
                c1218ak.m3270M(jSONObject.optInt("click_nt_sw"));
            }
            if (jSONObject.has("ft_cl_sz")) {
                c1218ak.m3352i(jSONObject.optInt("ft_cl_sz"));
            } else {
                c1218ak.m3352i(1);
            }
            if (jSONObject.has("sh_cl_itp")) {
                c1218ak.m3355j(jSONObject.optInt("sh_cl_itp"));
            } else {
                c1218ak.m3355j(2);
            }
            c1218ak.m3272N(jSONObject.optInt("shm_t", -1));
            if (jSONObject.has("ready_rate")) {
                c1218ak.m3274O(jSONObject.optInt("ready_rate"));
            } else {
                c1218ak.m3274O(100);
            }
            if (jSONObject.has("rsdl_rate")) {
                c1218ak.m3276P(jSONObject.optInt("rsdl_rate"));
            } else {
                c1218ak.m3276P(0);
            }
            if (jSONObject.has("video_ctn_type")) {
                c1218ak.m3278Q(jSONObject.optInt("video_ctn_type"));
            } else {
                c1218ak.m3278Q(2);
            }
            if (jSONObject.has("preload_offer_html")) {
                c1218ak.m3299a(jSONObject.optInt("preload_offer_html") == 1);
            } else {
                c1218ak.m3299a(true);
            }
            if (jSONObject.has("re_monitor")) {
                c1218ak.m3323b(jSONObject.optInt("re_monitor") == 1);
                i = 0;
            } else {
                i = 0;
                c1218ak.m3323b(false);
            }
            c1218ak.f3774p = jSONObject.optInt(C1294j.f4883aq, i);
            c1218ak.m3328c(jSONObject.optInt("at_cl_img", 2) == 1);
            c1218ak.m3333d(jSONObject.optInt("at_cl_video", 2) == 1);
            c1218ak.m3338e(jSONObject.optInt("at_cl_ec", 2) == 1);
            c1218ak.m3336e(jSONObject.optLong("at_cl_pt", C1575f.f8394a));
            c1218ak.m3341f(jSONObject.optLong("at_cl_pct", C1575f.f8394a));
            c1218ak.m3345g(jSONObject.optLong("at_cl_ec_pt", C1575f.f8394a));
            c1218ak.m3349h(jSONObject.optLong("at_cl_ec_pct", C1575f.f8394a));
            c1218ak.m3353i(jSONObject.optLong("or_img_t", C1575f.f8394a));
            c1218ak.m3282S(jSONObject.optInt("animate_type", -1));
            c1218ak.m3280R(jSONObject.optInt("render_wv_ld", 2));
            c1218ak.m3284T(jSONObject.optInt("cl_invalid_sw", 2));
            c1218ak.m3286U(jSONObject.optInt("stc_sw", 1));
            c1218ak.m3288V(jSONObject.optInt("close_button_m", 0));
            c1218ak.m3290W(jSONObject.optInt("cgf_sw", 1));
            c1218ak.m3356j(jSONObject.optLong("cgf_t", 0L));
            c1218ak.m3346g(jSONObject.optString("cgf_list", ""));
            c1218ak.m3350h(jSONObject.optString("qa_po", ""));
            c1218ak.m3320b(jSONObject.optInt("lp_pop", 2));
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shk_obj");
                if (jSONObjectOptJSONObject != null) {
                    c1218ak.m3296a(jSONObjectOptJSONObject.optInt("shk_type", 1));
                    c1218ak.m3298a(jSONObjectOptJSONObject.optString("shk_icon", ""));
                    c1218ak.m3322b(jSONObjectOptJSONObject.optString("shk_text_l", ""));
                    c1218ak.m3327c(jSONObjectOptJSONObject.optString("shk_text_m", ""));
                    c1218ak.m3332d(jSONObjectOptJSONObject.optString("shk_text_s", ""));
                }
            } catch (Throwable unused) {
            }
            c1218ak.m3386y(jSONObject.optInt("s_c_t", 0));
            c1218ak.m3292X(jSONObject.optInt("v_cls", 1));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return c1218ak;
    }

    /* JADX INFO: renamed from: at */
    public final int m2507at() {
        return this.f3773o;
    }

    /* JADX INFO: renamed from: au */
    public final int m2508au() {
        return this.f3772n;
    }

    /* JADX INFO: renamed from: av */
    public final int m2509av() {
        return this.f3774p;
    }
}
