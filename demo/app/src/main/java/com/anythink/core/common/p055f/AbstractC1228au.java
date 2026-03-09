package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.p072d.C1396f;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import io.reactivex.annotations.SchedulerSupport;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.au */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1228au {

    /* JADX INFO: renamed from: N */
    public static final String f3898N = "ofm_tid_key";

    /* JADX INFO: renamed from: O */
    public static final int f3899O = 1;

    /* JADX INFO: renamed from: P */
    public static final int f3900P = 2;

    /* JADX INFO: renamed from: Q */
    public static final int f3901Q = 3;

    /* JADX INFO: renamed from: R */
    public static final int f3902R = 4;

    /* JADX INFO: renamed from: S */
    public static final int f3903S = 5;

    /* JADX INFO: renamed from: T */
    public static final int f3904T = 6;

    /* JADX INFO: renamed from: U */
    public static final int f3905U = 7;

    /* JADX INFO: renamed from: V */
    public static final int f3906V = 8;

    /* JADX INFO: renamed from: W */
    public static final int f3907W = 10;

    /* JADX INFO: renamed from: X */
    public static final int f3908X = 0;

    /* JADX INFO: renamed from: Y */
    public static final int f3909Y = 1;

    /* JADX INFO: renamed from: Z */
    public static final int f3910Z = 2;

    /* JADX INFO: renamed from: aa */
    public static final int f3911aa = 3;

    /* JADX INFO: renamed from: ab */
    public static final int f3912ab = 4;

    /* JADX INFO: renamed from: ac */
    public static final int f3913ac = 5;

    /* JADX INFO: renamed from: ad */
    public static final int f3914ad = 8;

    /* JADX INFO: renamed from: ae */
    public static final String f3915ae = "0";

    /* JADX INFO: renamed from: af */
    public static final String f3916af = "1";

    /* JADX INFO: renamed from: ag */
    public static final String f3917ag = "2";

    /* JADX INFO: renamed from: ah */
    public static final String f3918ah = "3";

    /* JADX INFO: renamed from: ai */
    public static final String f3919ai = "4";

    /* JADX INFO: renamed from: a */
    private String f3920a;

    /* JADX INFO: renamed from: aj */
    public String f3921aj;

    /* JADX INFO: renamed from: ak */
    public String f3922ak;

    /* JADX INFO: renamed from: al */
    public String f3923al;

    /* JADX INFO: renamed from: am */
    public String f3924am;

    /* JADX INFO: renamed from: an */
    public String f3925an;

    /* JADX INFO: renamed from: ao */
    public int f3926ao;

    /* JADX INFO: renamed from: ap */
    public int f3927ap;

    /* JADX INFO: renamed from: aq */
    public String f3928aq;

    /* JADX INFO: renamed from: ar */
    public int f3929ar;

    /* JADX INFO: renamed from: as */
    public int f3930as;

    /* JADX INFO: renamed from: at */
    public int f3931at;

    /* JADX INFO: renamed from: au */
    public int f3932au = -1;

    /* JADX INFO: renamed from: b */
    private String f3933b;

    /* JADX INFO: renamed from: c */
    private int f3934c;

    /* JADX INFO: renamed from: d */
    private JSONObject f3935d;

    /* JADX INFO: renamed from: e */
    private int f3936e;

    /* JADX INFO: renamed from: f */
    private Object f3937f;

    /* JADX INFO: renamed from: a */
    private JSONObject m2651a() {
        return this.f3935d;
    }

    /* JADX INFO: renamed from: a */
    private void m2652a(int i) {
        this.f3926ao = i;
    }

    /* JADX INFO: renamed from: a */
    private void m2653a(String str) {
        this.f3925an = str;
    }

    /* JADX INFO: renamed from: b */
    private int m2654b() {
        return this.f3931at;
    }

    /* JADX INFO: renamed from: b */
    private void m2655b(int i) {
        this.f3927ap = i;
    }

    /* JADX INFO: renamed from: c */
    private int m2656c() {
        return this.f3929ar;
    }

    /* JADX INFO: renamed from: d */
    private String m2657d() {
        return this.f3925an;
    }

    /* JADX INFO: renamed from: e */
    private int m2658e() {
        return this.f3926ao;
    }

    /* JADX INFO: renamed from: f */
    private int m2659f() {
        return this.f3927ap;
    }

    /* JADX INFO: renamed from: F */
    public JSONObject mo2660F(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i);
            jSONObject.put("pl_id", this.f3921aj);
            jSONObject.put("req_id", this.f3922ak);
            if (!TextUtils.isEmpty(this.f3923al)) {
                jSONObject.put("format", Integer.parseInt(this.f3923al));
            }
            jSONObject.put("ps_id", C1175n.m2059a().m2168q());
            String strM2151g = C1175n.m2059a().m2151g(this.f3921aj);
            if (!TextUtils.isEmpty(strM2151g)) {
                jSONObject.put("sessionid", strM2151g);
            }
            int i2 = this.f3932au;
            if (i2 != -1) {
                jSONObject.put("traffic_group_id", i2);
            }
            if (this.f3931at == 1) {
                jSONObject.put("ofm_tid", this.f3930as);
                jSONObject.put("ofm_system", this.f3929ar);
                jSONObject.put(C1275c.f4649M, this.f3931at);
            }
            jSONObject.put("asid", this.f3924am);
            jSONObject.put(C1396f.a.f6031T, this.f3920a);
            jSONObject.put(C1275c.f4691ah, this.f3933b);
            JSONObject jSONObject2 = this.f3935d;
            if (jSONObject2 != null) {
                jSONObject.put(C1396f.a.f6065aa, jSONObject2);
            }
            jSONObject.put("wf2_mode", this.f3936e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: J */
    public final void m2661J(int i) {
        this.f3936e = i;
    }

    /* JADX INFO: renamed from: K */
    public final void m2662K(int i) {
        this.f3934c = i;
    }

    /* JADX INFO: renamed from: L */
    public final void m2663L(int i) {
        this.f3931at = i;
    }

    /* JADX INFO: renamed from: M */
    public final void m2664M(int i) {
        this.f3930as = i;
    }

    /* JADX INFO: renamed from: N */
    public final void m2665N(int i) {
        this.f3932au = i;
    }

    /* JADX INFO: renamed from: Y */
    public final Object m2666Y() {
        return this.f3937f;
    }

    /* JADX INFO: renamed from: Z */
    public final int m2667Z() {
        return this.f3934c;
    }

    /* JADX INFO: renamed from: a */
    public final void m2668a(Object obj) {
        this.f3937f = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2669a(JSONObject jSONObject) {
        this.f3935d = jSONObject;
    }

    /* JADX INFO: renamed from: aa */
    public final String m2670aa() {
        return this.f3920a;
    }

    /* JADX INFO: renamed from: ab */
    public final String m2671ab() {
        return this.f3933b;
    }

    /* JADX INFO: renamed from: ac */
    public final void m2672ac() {
        this.f3929ar = 1;
    }

    /* JADX INFO: renamed from: ad */
    public final int m2673ad() {
        return this.f3930as;
    }

    /* JADX INFO: renamed from: ae */
    public final String m2674ae() {
        return this.f3928aq;
    }

    /* JADX INFO: renamed from: af */
    public final int m2675af() {
        return this.f3932au;
    }

    /* JADX INFO: renamed from: ag */
    public final String m2676ag() {
        return this.f3924am;
    }

    /* JADX INFO: renamed from: ah */
    public final String m2677ah() {
        return this.f3921aj;
    }

    /* JADX INFO: renamed from: ai */
    public final String m2678ai() {
        return this.f3922ak;
    }

    /* JADX INFO: renamed from: aj */
    public final String m2679aj() {
        return this.f3923al;
    }

    /* JADX INFO: renamed from: ak */
    public final String m2680ak() {
        String str = this.f3923al;
        str.hashCode();
        switch (str) {
            case "0":
                return C1807f.f11177a;
            case "1":
                return "reward";
            case "2":
                return C1807f.f11181e;
            case "3":
                return "inter";
            case "4":
                return C1807f.f11182f;
            default:
                return SchedulerSupport.NONE;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2681s(String str) {
        this.f3920a = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m2682t(String str) {
        this.f3933b = str;
    }

    /* JADX INFO: renamed from: u */
    public final void m2683u(String str) {
        this.f3928aq = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m2684v(String str) {
        this.f3924am = str;
    }

    /* JADX INFO: renamed from: w */
    public final void m2685w(String str) {
        this.f3921aj = str;
    }

    /* JADX INFO: renamed from: x */
    public final void m2686x(String str) {
        this.f3922ak = str;
    }

    /* JADX INFO: renamed from: y */
    public final void m2687y(String str) {
        this.f3923al = str;
    }
}
