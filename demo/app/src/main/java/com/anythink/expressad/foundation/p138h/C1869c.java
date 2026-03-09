package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.C1325o;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1232ay;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.videocommon.p181e.C2338b;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.c */
/* JADX INFO: loaded from: classes.dex */
public class C1869c {

    /* JADX INFO: renamed from: y */
    private static final String f11497y = "portrait";

    /* JADX INFO: renamed from: z */
    private static final String f11498z = "landscape";

    /* JADX INFO: renamed from: d */
    public String f11502d;

    /* JADX INFO: renamed from: e */
    public String f11503e;

    /* JADX INFO: renamed from: g */
    public String f11505g;

    /* JADX INFO: renamed from: h */
    public String f11506h;

    /* JADX INFO: renamed from: i */
    public String f11507i;

    /* JADX INFO: renamed from: j */
    public String f11508j;

    /* JADX INFO: renamed from: k */
    public String f11509k;

    /* JADX INFO: renamed from: l */
    public String f11510l;

    /* JADX INFO: renamed from: m */
    public String f11511m;

    /* JADX INFO: renamed from: n */
    public String f11512n;

    /* JADX INFO: renamed from: o */
    public String f11513o;

    /* JADX INFO: renamed from: p */
    public String f11514p;

    /* JADX INFO: renamed from: q */
    public String f11515q;

    /* JADX INFO: renamed from: r */
    public String f11516r;

    /* JADX INFO: renamed from: s */
    public String f11517s;

    /* JADX INFO: renamed from: t */
    public String f11518t;

    /* JADX INFO: renamed from: u */
    public String f11519u;

    /* JADX INFO: renamed from: v */
    public int f11520v;

    /* JADX INFO: renamed from: w */
    public String f11521w;

    /* JADX INFO: renamed from: x */
    public JSONObject f11522x;

    /* JADX INFO: renamed from: c */
    public String f11501c = C3902g6.OooO0O0;

    /* JADX INFO: renamed from: a */
    public String f11499a = C1877k.m9697b();

    /* JADX INFO: renamed from: b */
    public String f11500b = C1877k.m9699c();

    /* JADX INFO: renamed from: f */
    public String f11504f = C1341e.m4065f();

    public C1869c(Context context) {
        this.f11502d = C1341e.m4060d(context);
        int iM9690a = C1877k.m9690a();
        this.f11505g = String.valueOf(iM9690a);
        this.f11506h = C1877k.m9692a(context, iM9690a);
        this.f11507i = C1341e.m4073i();
        this.f11508j = C1773a.m8548c().m8559g();
        this.f11509k = C1773a.m8548c().m8558f();
        this.f11510l = String.valueOf(C1886t.m9847f(context));
        this.f11511m = String.valueOf(C1886t.m9845e(context));
        this.f11516r = String.valueOf(C1886t.m9841c(context));
        this.f11517s = C1773a.m8548c().m8562j().toString();
        this.f11519u = C1341e.m4054b();
        this.f11520v = C1325o.m3942a().m3952c();
        this.f11512n = context.getResources().getConfiguration().orientation == 2 ? f11498z : f11497y;
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        String[] strArrSplit = (iExHandlerM2132b != null ? iExHandlerM2132b.fillCDataParam("at_device1|||at_device12|||at_device3") : "|||").split("\\|\\|\\|");
        if (strArrSplit != null) {
            this.f11503e = strArrSplit.length > 0 ? strArrSplit[0] : "";
            this.f11521w = strArrSplit.length > 1 ? strArrSplit[1] : "";
            this.f11515q = strArrSplit.length > 2 ? strArrSplit[2] : "";
        }
        this.f11513o = C1801a.f11126co;
        this.f11514p = C1801a.f11127cp;
        this.f11518t = C1877k.m9703e();
        this.f11522x = m9676b();
    }

    /* JADX INFO: renamed from: b */
    private JSONObject m9676b() {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C1877k.m9710i());
            jSONObject.put("cid", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1877k.m9704f());
            jSONObject.put("dmt", sb2.toString());
            jSONObject.put("dmf", C1877k.m9706g());
            jSONObject.put(C1485b.f7188dx, C1877k.m9708h());
            jSONObject.put(C1340d.m4030b("aW1laQ=="), this.f11503e);
            jSONObject.put(C1340d.m4030b("bWFj"), this.f11521w);
            jSONObject.put("oaid", this.f11515q);
            jSONObject.put("android_id", this.f11502d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject mo9675a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f11499a);
            jSONObject.put("system_version", this.f11500b);
            jSONObject.put("network_type", this.f11505g);
            jSONObject.put("network_type_str", this.f11506h);
            jSONObject.put("device_ua", this.f11507i);
            C1232ay c1232ayM2104J = C1175n.m2059a().m2104J();
            if (c1232ayM2104J != null) {
                jSONObject.put("has_wx", c1232ayM2104J.m2863a());
                jSONObject.put("integrated_wx", c1232ayM2104J.m2865b());
                StringBuilder sb = new StringBuilder();
                sb.append(c1232ayM2104J.m2867c());
                jSONObject.put("opensdk_ver", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c1232ayM2104J.m2869d());
                jSONObject.put("wx_api_ver", sb2.toString());
            }
            jSONObject.put("brand", this.f11519u);
            jSONObject.put("plantform", this.f11501c);
            jSONObject.put(C1340d.m4030b("ZGV2aWNlX2ltZWk="), this.f11503e);
            jSONObject.put("android_id", this.f11502d);
            jSONObject.put("google_ad_id", this.f11504f);
            jSONObject.put("oaid", this.f11515q);
            jSONObject.put("appkey", this.f11508j);
            jSONObject.put(C2338b.f14609u, this.f11509k);
            jSONObject.put("screen_width", this.f11510l);
            jSONObject.put("screen_height", this.f11511m);
            jSONObject.put("orientation", this.f11512n);
            jSONObject.put("scale", this.f11516r);
            jSONObject.put("b", this.f11513o);
            jSONObject.put("c", this.f11514p);
            jSONObject.put("web_env", this.f11517s);
            jSONObject.put("f", this.f11518t);
            jSONObject.put("misk_spt", this.f11520v);
            jSONObject.put("dvi", C1876j.m9686a(this.f11522x.toString()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
