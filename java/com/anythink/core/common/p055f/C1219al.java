package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1786h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p285z2.sb0;

/* JADX INFO: renamed from: com.anythink.core.common.f.al */
/* JADX INFO: loaded from: classes.dex */
public final class C1219al implements Serializable {

    /* JADX INFO: renamed from: A */
    public String[] f3775A;

    /* JADX INFO: renamed from: B */
    public String[] f3776B;

    /* JADX INFO: renamed from: C */
    public String[] f3777C;

    /* JADX INFO: renamed from: D */
    public String[] f3778D;

    /* JADX INFO: renamed from: E */
    public String[] f3779E;

    /* JADX INFO: renamed from: F */
    public String[] f3780F;

    /* JADX INFO: renamed from: G */
    public Map<Integer, String[]> f3781G;

    /* JADX INFO: renamed from: H */
    public String[] f3782H;

    /* JADX INFO: renamed from: I */
    public String[] f3783I;

    /* JADX INFO: renamed from: J */
    public String f3784J;

    /* JADX INFO: renamed from: K */
    public String f3785K;

    /* JADX INFO: renamed from: L */
    public String f3786L;

    /* JADX INFO: renamed from: M */
    public String f3787M;

    /* JADX INFO: renamed from: N */
    public String f3788N;

    /* JADX INFO: renamed from: O */
    public String f3789O;

    /* JADX INFO: renamed from: P */
    public String f3790P;

    /* JADX INFO: renamed from: Q */
    public String f3791Q;

    /* JADX INFO: renamed from: R */
    public String f3792R;

    /* JADX INFO: renamed from: S */
    public String f3793S;

    /* JADX INFO: renamed from: T */
    public String f3794T;

    /* JADX INFO: renamed from: U */
    public String f3795U;

    /* JADX INFO: renamed from: V */
    public String f3796V;

    /* JADX INFO: renamed from: W */
    public String f3797W;

    /* JADX INFO: renamed from: X */
    public String f3798X;

    /* JADX INFO: renamed from: Y */
    public String f3799Y;

    /* JADX INFO: renamed from: Z */
    public String f3800Z;

    /* JADX INFO: renamed from: a */
    public String f3801a;

    /* JADX INFO: renamed from: aa */
    public String f3802aa;

    /* JADX INFO: renamed from: ab */
    public String f3803ab;

    /* JADX INFO: renamed from: ac */
    public String f3804ac;

    /* JADX INFO: renamed from: ad */
    public String f3805ad;

    /* JADX INFO: renamed from: ae */
    public String f3806ae;

    /* JADX INFO: renamed from: af */
    public String f3807af;

    /* JADX INFO: renamed from: ag */
    public String f3808ag;

    /* JADX INFO: renamed from: ah */
    public String f3809ah;

    /* JADX INFO: renamed from: ai */
    public String f3810ai;

    /* JADX INFO: renamed from: aj */
    public String f3811aj;

    /* JADX INFO: renamed from: ak */
    public String f3812ak;

    /* JADX INFO: renamed from: al */
    public String f3813al;

    /* JADX INFO: renamed from: am */
    public String f3814am;

    /* JADX INFO: renamed from: an */
    public String f3815an;

    /* JADX INFO: renamed from: ao */
    public String f3816ao;

    /* JADX INFO: renamed from: ap */
    public String[] f3817ap;

    /* JADX INFO: renamed from: aq */
    public String f3818aq;

    /* JADX INFO: renamed from: b */
    public String[] f3819b;

    /* JADX INFO: renamed from: c */
    public String[] f3820c;

    /* JADX INFO: renamed from: d */
    public String[] f3821d;

    /* JADX INFO: renamed from: e */
    public String[] f3822e;

    /* JADX INFO: renamed from: f */
    public String[] f3823f;

    /* JADX INFO: renamed from: g */
    public String[] f3824g;

    /* JADX INFO: renamed from: h */
    public String[] f3825h;

    /* JADX INFO: renamed from: i */
    public String[] f3826i;

    /* JADX INFO: renamed from: j */
    public String[] f3827j;

    /* JADX INFO: renamed from: k */
    public String[] f3828k;

    /* JADX INFO: renamed from: l */
    public String[] f3829l;

    /* JADX INFO: renamed from: m */
    public String[] f3830m;

    /* JADX INFO: renamed from: n */
    public String[] f3831n;

    /* JADX INFO: renamed from: o */
    public String[] f3832o;

    /* JADX INFO: renamed from: p */
    public String[] f3833p;

    /* JADX INFO: renamed from: q */
    public String[] f3834q;

    /* JADX INFO: renamed from: r */
    public String[] f3835r;

    /* JADX INFO: renamed from: s */
    public String[] f3836s;

    /* JADX INFO: renamed from: t */
    public String[] f3837t;

    /* JADX INFO: renamed from: u */
    public String[] f3838u;

    /* JADX INFO: renamed from: v */
    public String[] f3839v;

    /* JADX INFO: renamed from: w */
    public String[] f3840w;

    /* JADX INFO: renamed from: x */
    public String[] f3841x;

    /* JADX INFO: renamed from: y */
    public String[] f3842y;

    /* JADX INFO: renamed from: z */
    public String[] f3843z;

    /* JADX INFO: renamed from: a */
    public static final C1219al m2510a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            C1219al c1219al = new C1219al();
            c1219al.f3801a = jSONObject.optString("ks");
            c1219al.f3819b = C1345i.m4164a(jSONObject.optJSONArray("nurl"));
            c1219al.f3820c = C1345i.m4164a(jSONObject.optJSONArray("lurl"));
            c1219al.f3821d = C1345i.m4164a(jSONObject.optJSONArray("imp"));
            c1219al.f3822e = C1345i.m4164a(jSONObject.optJSONArray(C1781c.f10313ca));
            c1219al.f3823f = C1345i.m4164a(jSONObject.optJSONArray("vstart"));
            c1219al.f3824g = C1345i.m4164a(jSONObject.optJSONArray("v25"));
            c1219al.f3825h = C1345i.m4164a(jSONObject.optJSONArray("v50"));
            c1219al.f3826i = C1345i.m4164a(jSONObject.optJSONArray("v75"));
            c1219al.f3827j = C1345i.m4164a(jSONObject.optJSONArray("v100"));
            c1219al.f3828k = C1345i.m4164a(jSONObject.optJSONArray("vpaused"));
            c1219al.f3829l = C1345i.m4164a(jSONObject.optJSONArray("vclick"));
            c1219al.f3830m = C1345i.m4164a(jSONObject.optJSONArray("vmute"));
            c1219al.f3831n = C1345i.m4164a(jSONObject.optJSONArray("vunmute"));
            c1219al.f3832o = C1345i.m4164a(jSONObject.optJSONArray("ec_show"));
            c1219al.f3833p = C1345i.m4164a(jSONObject.optJSONArray("ec_close"));
            c1219al.f3834q = C1345i.m4164a(jSONObject.optJSONArray("apk_dl_star"));
            c1219al.f3835r = C1345i.m4164a(jSONObject.optJSONArray("apk_dl_end"));
            c1219al.f3836s = C1345i.m4164a(jSONObject.optJSONArray(C1786h.f10663cM));
            c1219al.f3837t = C1345i.m4164a(jSONObject.optJSONArray("vresumed"));
            c1219al.f3838u = C1345i.m4164a(jSONObject.optJSONArray("vskip"));
            c1219al.f3839v = C1345i.m4164a(jSONObject.optJSONArray("vfail"));
            c1219al.f3840w = C1345i.m4164a(jSONObject.optJSONArray("apk_start_install"));
            c1219al.f3841x = C1345i.m4164a(jSONObject.optJSONArray("dp_start"));
            c1219al.f3842y = C1345i.m4164a(jSONObject.optJSONArray("dp_succ"));
            c1219al.f3843z = C1345i.m4164a(jSONObject.optJSONArray("app_install"));
            c1219al.f3775A = C1345i.m4164a(jSONObject.optJSONArray("app_uninstall"));
            c1219al.f3776B = C1345i.m4164a(jSONObject.optJSONArray("app_unknow"));
            c1219al.f3778D = C1345i.m4164a(jSONObject.optJSONArray("dp_inst_fail"));
            c1219al.f3777C = C1345i.m4164a(jSONObject.optJSONArray("dp_uninst_fail"));
            c1219al.f3779E = C1345i.m4164a(jSONObject.optJSONArray("vd_succ"));
            c1219al.f3780F = C1345i.m4164a(jSONObject.optJSONArray("vrewarded"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (jSONArrayOptJSONArray != null) {
                c1219al.f3781G = new HashMap();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    int iOptInt = jSONObjectOptJSONObject.optInt("play_sec");
                    c1219al.f3781G.put(Integer.valueOf(iOptInt), C1345i.m4164a(jSONObjectOptJSONObject.optJSONArray(sb0.OooO0OO)));
                }
            }
            c1219al.f3782H = C1345i.m4164a(jSONObject.optJSONArray("load_success"));
            c1219al.f3783I = C1345i.m4164a(jSONObject.optJSONArray("load_fail"));
            c1219al.f3784J = jSONObject.optString("tp_nurl");
            c1219al.f3785K = jSONObject.optString("tp_imp");
            c1219al.f3786L = jSONObject.optString("tp_click");
            c1219al.f3787M = jSONObject.optString("tp_vstart");
            c1219al.f3788N = jSONObject.optString("tp_v25");
            c1219al.f3789O = jSONObject.optString("tp_v50");
            c1219al.f3790P = jSONObject.optString("tp_v75");
            c1219al.f3791Q = jSONObject.optString("tp_v100");
            c1219al.f3792R = jSONObject.optString("tp_vpaused");
            c1219al.f3793S = jSONObject.optString("tp_vclick");
            c1219al.f3794T = jSONObject.optString("tp_vmute");
            c1219al.f3795U = jSONObject.optString("tp_vunmute");
            c1219al.f3796V = jSONObject.optString("tp_ec_show");
            c1219al.f3797W = jSONObject.optString("tp_ec_close");
            c1219al.f3798X = jSONObject.optString("tp_apk_dl_star");
            c1219al.f3799Y = jSONObject.optString("tp_apk_dl_end");
            c1219al.f3800Z = jSONObject.optString("tp_apk_install");
            c1219al.f3802aa = jSONObject.optString("tp_vresumed");
            c1219al.f3803ab = jSONObject.optString("tp_vskip");
            c1219al.f3804ac = jSONObject.optString("tp_vfail");
            c1219al.f3805ad = jSONObject.optString("tp_apk_start_install");
            c1219al.f3806ae = jSONObject.optString("tp_dp_start");
            c1219al.f3807af = jSONObject.optString("tp_dp_succ");
            c1219al.f3808ag = jSONObject.optString("tp_app_install");
            c1219al.f3809ah = jSONObject.optString("tp_app_uninstall");
            c1219al.f3810ai = jSONObject.optString("tp_app_unknow");
            c1219al.f3812ak = jSONObject.optString("tp_dp_inst_fail");
            c1219al.f3811aj = jSONObject.optString("tp_dp_uninst_fail");
            c1219al.f3813al = jSONObject.optString("tp_vd_succ");
            c1219al.f3814am = jSONObject.optString("tp_vrewarded");
            c1219al.f3815an = jSONObject.optString("tp_load_success");
            c1219al.f3816ao = jSONObject.optString("tp_load_fail");
            c1219al.f3817ap = C1345i.m4164a(jSONObject.optJSONArray("vready"));
            c1219al.f3818aq = jSONObject.optString("tp_ready");
            return c1219al;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final String m2511A() {
        return this.f3784J;
    }

    /* JADX INFO: renamed from: B */
    public final String m2512B() {
        return this.f3785K;
    }

    /* JADX INFO: renamed from: C */
    public final String m2513C() {
        return this.f3786L;
    }

    /* JADX INFO: renamed from: D */
    public final String m2514D() {
        return this.f3787M;
    }

    /* JADX INFO: renamed from: E */
    public final String m2515E() {
        return this.f3788N;
    }

    /* JADX INFO: renamed from: F */
    public final String m2516F() {
        return this.f3789O;
    }

    /* JADX INFO: renamed from: G */
    public final String m2517G() {
        return this.f3790P;
    }

    /* JADX INFO: renamed from: H */
    public final String m2518H() {
        return this.f3791Q;
    }

    /* JADX INFO: renamed from: I */
    public final String m2519I() {
        return this.f3792R;
    }

    /* JADX INFO: renamed from: J */
    public final String m2520J() {
        return this.f3793S;
    }

    /* JADX INFO: renamed from: K */
    public final String m2521K() {
        return this.f3794T;
    }

    /* JADX INFO: renamed from: L */
    public final String m2522L() {
        return this.f3795U;
    }

    /* JADX INFO: renamed from: M */
    public final String m2523M() {
        return this.f3796V;
    }

    /* JADX INFO: renamed from: N */
    public final String m2524N() {
        return this.f3797W;
    }

    /* JADX INFO: renamed from: O */
    public final String m2525O() {
        return this.f3798X;
    }

    /* JADX INFO: renamed from: P */
    public final String m2526P() {
        return this.f3799Y;
    }

    /* JADX INFO: renamed from: Q */
    public final String m2527Q() {
        return this.f3800Z;
    }

    /* JADX INFO: renamed from: R */
    public final String[] m2528R() {
        return this.f3837t;
    }

    /* JADX INFO: renamed from: S */
    public final String[] m2529S() {
        return this.f3838u;
    }

    /* JADX INFO: renamed from: T */
    public final String[] m2530T() {
        return this.f3839v;
    }

    /* JADX INFO: renamed from: U */
    public final String[] m2531U() {
        return this.f3840w;
    }

    /* JADX INFO: renamed from: V */
    public final String[] m2532V() {
        return this.f3841x;
    }

    /* JADX INFO: renamed from: W */
    public final String[] m2533W() {
        return this.f3842y;
    }

    /* JADX INFO: renamed from: X */
    public final String[] m2534X() {
        return this.f3843z;
    }

    /* JADX INFO: renamed from: Y */
    public final String[] m2535Y() {
        return this.f3775A;
    }

    /* JADX INFO: renamed from: Z */
    public final String[] m2536Z() {
        return this.f3776B;
    }

    /* JADX INFO: renamed from: a */
    public final void m2537a(String[] strArr) {
        this.f3822e = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String[] m2538a() {
        return this.f3782H;
    }

    /* JADX INFO: renamed from: aa */
    public final String m2539aa() {
        return this.f3802aa;
    }

    /* JADX INFO: renamed from: ab */
    public final String m2540ab() {
        return this.f3803ab;
    }

    /* JADX INFO: renamed from: ac */
    public final String m2541ac() {
        return this.f3804ac;
    }

    /* JADX INFO: renamed from: ad */
    public final String m2542ad() {
        return this.f3805ad;
    }

    /* JADX INFO: renamed from: ae */
    public final String m2543ae() {
        return this.f3806ae;
    }

    /* JADX INFO: renamed from: af */
    public final String m2544af() {
        return this.f3807af;
    }

    /* JADX INFO: renamed from: ag */
    public final String m2545ag() {
        return this.f3808ag;
    }

    /* JADX INFO: renamed from: ah */
    public final String m2546ah() {
        return this.f3809ah;
    }

    /* JADX INFO: renamed from: ai */
    public final String m2547ai() {
        return this.f3810ai;
    }

    /* JADX INFO: renamed from: aj */
    public final String m2548aj() {
        return this.f3811aj;
    }

    /* JADX INFO: renamed from: ak */
    public final String m2549ak() {
        return this.f3812ak;
    }

    /* JADX INFO: renamed from: al */
    public final String m2550al() {
        return this.f3813al;
    }

    /* JADX INFO: renamed from: am */
    public final String m2551am() {
        return this.f3814am;
    }

    /* JADX INFO: renamed from: an */
    public final String m2552an() {
        return this.f3815an;
    }

    /* JADX INFO: renamed from: ao */
    public final String m2553ao() {
        return this.f3816ao;
    }

    /* JADX INFO: renamed from: ap */
    public final String[] m2554ap() {
        return this.f3817ap;
    }

    /* JADX INFO: renamed from: aq */
    public final String m2555aq() {
        return this.f3818aq;
    }

    /* JADX INFO: renamed from: b */
    public final void m2556b(String[] strArr) {
        this.f3834q = strArr;
    }

    /* JADX INFO: renamed from: b */
    public final String[] m2557b() {
        return this.f3783I;
    }

    /* JADX INFO: renamed from: c */
    public final String m2558c() {
        return this.f3801a;
    }

    /* JADX INFO: renamed from: c */
    public final void m2559c(String[] strArr) {
        this.f3835r = strArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m2560d(String[] strArr) {
        this.f3836s = strArr;
    }

    /* JADX INFO: renamed from: d */
    public final String[] m2561d() {
        return this.f3819b;
    }

    /* JADX INFO: renamed from: e */
    public final String[] m2562e() {
        return this.f3820c;
    }

    /* JADX INFO: renamed from: f */
    public final String[] m2563f() {
        return this.f3821d;
    }

    /* JADX INFO: renamed from: g */
    public final String[] m2564g() {
        return this.f3822e;
    }

    /* JADX INFO: renamed from: h */
    public final String[] m2565h() {
        return this.f3823f;
    }

    /* JADX INFO: renamed from: i */
    public final String[] m2566i() {
        return this.f3824g;
    }

    /* JADX INFO: renamed from: j */
    public final String[] m2567j() {
        return this.f3825h;
    }

    /* JADX INFO: renamed from: k */
    public final String[] m2568k() {
        return this.f3826i;
    }

    /* JADX INFO: renamed from: l */
    public final String[] m2569l() {
        return this.f3827j;
    }

    /* JADX INFO: renamed from: m */
    public final String[] m2570m() {
        return this.f3828k;
    }

    /* JADX INFO: renamed from: n */
    public final String[] m2571n() {
        return this.f3829l;
    }

    /* JADX INFO: renamed from: o */
    public final String[] m2572o() {
        return this.f3830m;
    }

    /* JADX INFO: renamed from: p */
    public final String[] m2573p() {
        return this.f3831n;
    }

    /* JADX INFO: renamed from: q */
    public final String[] m2574q() {
        return this.f3832o;
    }

    /* JADX INFO: renamed from: r */
    public final String[] m2575r() {
        return this.f3833p;
    }

    /* JADX INFO: renamed from: s */
    public final String[] m2576s() {
        return this.f3834q;
    }

    /* JADX INFO: renamed from: t */
    public final String[] m2577t() {
        return this.f3835r;
    }

    /* JADX INFO: renamed from: u */
    public final String[] m2578u() {
        return this.f3836s;
    }

    /* JADX INFO: renamed from: v */
    public final String[] m2579v() {
        return this.f3777C;
    }

    /* JADX INFO: renamed from: w */
    public final String[] m2580w() {
        return this.f3778D;
    }

    /* JADX INFO: renamed from: x */
    public final String[] m2581x() {
        return this.f3779E;
    }

    /* JADX INFO: renamed from: y */
    public final String[] m2582y() {
        return this.f3780F;
    }

    /* JADX INFO: renamed from: z */
    public final Map<Integer, String[]> m2583z() {
        return this.f3781G;
    }
}
