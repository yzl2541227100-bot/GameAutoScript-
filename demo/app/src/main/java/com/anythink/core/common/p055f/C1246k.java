package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1166e;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.p072d.C1396f;
import com.anythink.expressad.foundation.p116d.C1781c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1246k extends AbstractC1259x {

    /* JADX INFO: renamed from: A */
    public String f4235A;

    /* JADX INFO: renamed from: B */
    public String f4236B;

    /* JADX INFO: renamed from: C */
    public String f4237C;

    /* JADX INFO: renamed from: D */
    public String f4238D;

    /* JADX INFO: renamed from: E */
    public JSONObject f4239E;

    /* JADX INFO: renamed from: F */
    public String f4240F;

    /* JADX INFO: renamed from: G */
    public int f4241G = -1;

    /* JADX INFO: renamed from: H */
    public int f4242H = -1;

    /* JADX INFO: renamed from: I */
    public int f4243I = -1;

    /* JADX INFO: renamed from: a */
    public String f4244a;

    /* JADX INFO: renamed from: b */
    public String f4245b;

    /* JADX INFO: renamed from: c */
    public String f4246c;

    /* JADX INFO: renamed from: d */
    public String f4247d;

    /* JADX INFO: renamed from: e */
    public String f4248e;

    /* JADX INFO: renamed from: f */
    public String f4249f;

    /* JADX INFO: renamed from: g */
    public String f4250g;

    /* JADX INFO: renamed from: h */
    public String f4251h;

    /* JADX INFO: renamed from: i */
    public String f4252i;

    /* JADX INFO: renamed from: j */
    public String f4253j;

    /* JADX INFO: renamed from: k */
    public String f4254k;

    /* JADX INFO: renamed from: l */
    public String f4255l;

    /* JADX INFO: renamed from: m */
    public String f4256m;

    /* JADX INFO: renamed from: n */
    public String f4257n;

    /* JADX INFO: renamed from: o */
    public String f4258o;

    /* JADX INFO: renamed from: p */
    public String f4259p;

    /* JADX INFO: renamed from: q */
    public String f4260q;

    /* JADX INFO: renamed from: r */
    public String f4261r;

    /* JADX INFO: renamed from: s */
    public String f4262s;

    /* JADX INFO: renamed from: t */
    public String f4263t;

    /* JADX INFO: renamed from: u */
    public String f4264u;

    /* JADX INFO: renamed from: v */
    public String f4265v;

    /* JADX INFO: renamed from: w */
    public String f4266w;

    /* JADX INFO: renamed from: x */
    public String f4267x;

    /* JADX INFO: renamed from: y */
    public String f4268y;

    /* JADX INFO: renamed from: z */
    public String f4269z;

    private C1246k() {
    }

    public C1246k(String str, String str2) {
        this.f4235A = str;
        this.f4236B = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C1246k m3152a(String str) {
        C1246k c1246k = new C1246k();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("key")) {
                    c1246k.f4244a = jSONObject.optString("key", "");
                }
                if (jSONObject.has("requestid")) {
                    c1246k.f4245b = jSONObject.optString("requestid", "");
                }
                if (jSONObject.has("unitid")) {
                    c1246k.f4247d = jSONObject.optString("unitid", "");
                }
                if (jSONObject.has(C1166e.f3017c)) {
                    c1246k.f4248e = jSONObject.optString(C1166e.f3017c, "");
                }
                if (jSONObject.has("sessionid")) {
                    c1246k.f4249f = jSONObject.optString("sessionid", "");
                }
                if (jSONObject.has("groupid")) {
                    c1246k.f4250g = jSONObject.optString("groupid", "");
                }
                if (jSONObject.has("unitgroupid")) {
                    c1246k.f4251h = jSONObject.optString("unitgroupid", "");
                }
                if (jSONObject.has(C1781c.f10340o)) {
                    c1246k.f4252i = jSONObject.optString(C1781c.f10340o, "");
                }
                if (jSONObject.has("asid")) {
                    c1246k.f4253j = jSONObject.optString("asid", "");
                }
                if (jSONObject.has("refresh")) {
                    c1246k.f4254k = jSONObject.optString("refresh", "");
                }
                if (jSONObject.has(C1275c.f4683aT)) {
                    c1246k.f4243I = jSONObject.optInt(C1275c.f4683aT, 0);
                }
                if (jSONObject.has("traffic_group_id")) {
                    c1246k.f4255l = jSONObject.optString("traffic_group_id", "");
                }
                if (jSONObject.has("msg")) {
                    c1246k.f4256m = jSONObject.optString("msg", "");
                }
                if (jSONObject.has("msg1")) {
                    c1246k.f4257n = jSONObject.optString("msg1", "");
                }
                if (jSONObject.has("msg2")) {
                    c1246k.f4258o = jSONObject.optString("msg2", "");
                }
                if (jSONObject.has("msg3")) {
                    c1246k.f4259p = jSONObject.optString("msg3", "");
                }
                if (jSONObject.has("msg4")) {
                    c1246k.f4260q = jSONObject.optString("msg4", "");
                }
                if (jSONObject.has("msg5")) {
                    c1246k.f4261r = jSONObject.optString("msg5", "");
                }
                if (jSONObject.has("msg6")) {
                    c1246k.f4262s = jSONObject.optString("msg6", "");
                }
                if (jSONObject.has("msg7")) {
                    c1246k.f4263t = jSONObject.optString("msg7", "");
                }
                if (jSONObject.has("msg8")) {
                    c1246k.f4264u = jSONObject.optString("msg8", "");
                }
                if (jSONObject.has("msg9")) {
                    c1246k.f4265v = jSONObject.optString("msg9", "");
                }
                if (jSONObject.has("msg10")) {
                    c1246k.f4266w = jSONObject.optString("msg10", "");
                }
                if (jSONObject.has("msg11")) {
                    c1246k.f4267x = jSONObject.optString("msg11", "");
                }
                if (jSONObject.has("msg12")) {
                    c1246k.f4268y = jSONObject.optString("msg12", "");
                }
                if (jSONObject.has("msg13")) {
                    c1246k.f4269z = jSONObject.optString("msg13", "");
                }
                if (jSONObject.has(C1396f.a.f6031T)) {
                    c1246k.f4237C = jSONObject.optString(C1396f.a.f6031T, "");
                }
                if (jSONObject.has(C1275c.f4691ah)) {
                    c1246k.f4238D = jSONObject.optString(C1275c.f4691ah, "");
                }
                if (jSONObject.has(C1396f.a.f6065aa)) {
                    c1246k.f4239E = jSONObject.optJSONObject(C1396f.a.f6065aa);
                }
                c1246k.f4240F = jSONObject.optString("real_p", "");
                c1246k.f4241G = jSONObject.optInt("real_g", -1);
                c1246k.f4242H = jSONObject.optInt("real_t", -1);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return c1246k;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1259x
    /* JADX INFO: renamed from: a */
    public final JSONObject mo3143a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f4244a);
            jSONObject.put("requestid", this.f4245b);
            jSONObject.put("unitid", this.f4247d);
            jSONObject.put(C1166e.f3017c, this.f4248e);
            jSONObject.put("sessionid", this.f4249f);
            jSONObject.put("groupid", this.f4250g);
            jSONObject.put("unitgroupid", this.f4251h);
            jSONObject.put(C1781c.f10340o, this.f4252i);
            jSONObject.put("asid", this.f4253j);
            jSONObject.put("refresh", this.f4254k);
            int i = this.f4243I;
            if (i != -1) {
                jSONObject.put(C1275c.f4683aT, i);
            }
            jSONObject.put("traffic_group_id", this.f4255l);
            jSONObject.put("msg", this.f4256m);
            jSONObject.put("msg1", this.f4257n);
            jSONObject.put("msg2", this.f4258o);
            jSONObject.put("msg3", this.f4259p);
            jSONObject.put("msg4", this.f4260q);
            jSONObject.put("msg5", this.f4261r);
            jSONObject.put("msg6", this.f4262s);
            jSONObject.put("msg7", this.f4263t);
            jSONObject.put("msg8", this.f4264u);
            jSONObject.put("msg9", this.f4265v);
            jSONObject.put("msg10", this.f4266w);
            jSONObject.put("msg11", this.f4267x);
            jSONObject.put("msg12", this.f4268y);
            jSONObject.put("msg13", this.f4269z);
            jSONObject.put(C1396f.a.f6031T, this.f4237C);
            jSONObject.put(C1275c.f4691ah, this.f4238D);
            JSONObject jSONObject2 = this.f4239E;
            if (jSONObject2 != null) {
                jSONObject.put(C1396f.a.f6065aa, jSONObject2);
            }
            jSONObject.put("real_p", this.f4240F);
            int i2 = this.f4241G;
            if (i2 != -1) {
                jSONObject.put("real_g", i2);
            }
            int i3 = this.f4242H;
            if (i3 != -1) {
                jSONObject.put("real_t", i3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
