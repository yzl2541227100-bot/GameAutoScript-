package com.anythink.expressad.splash.p148a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1232ay;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.videocommon.p181e.C2338b;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.anythink.expressad.splash.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1976a {

    /* JADX INFO: renamed from: d */
    public String f12468d;

    /* JADX INFO: renamed from: e */
    public String f12469e;

    /* JADX INFO: renamed from: g */
    public String f12471g;

    /* JADX INFO: renamed from: h */
    public String f12472h;

    /* JADX INFO: renamed from: i */
    public String f12473i;

    /* JADX INFO: renamed from: j */
    public String f12474j;

    /* JADX INFO: renamed from: k */
    public String f12475k;

    /* JADX INFO: renamed from: l */
    public String f12476l;

    /* JADX INFO: renamed from: m */
    public String f12477m;

    /* JADX INFO: renamed from: n */
    public String f12478n;

    /* JADX INFO: renamed from: o */
    public String f12479o;

    /* JADX INFO: renamed from: p */
    public String f12480p;

    /* JADX INFO: renamed from: c */
    public String f12467c = C3902g6.OooO0O0;

    /* JADX INFO: renamed from: a */
    public String f12465a = C1877k.m9697b();

    /* JADX INFO: renamed from: b */
    public String f12466b = C1877k.m9699c();

    /* JADX INFO: renamed from: f */
    public String f12470f = C1341e.m4065f();

    public C1976a(Context context) {
        String strFillCDataParam;
        this.f12469e = C1341e.m4060d(context);
        int iM9690a = C1877k.m9690a();
        this.f12472h = String.valueOf(iM9690a);
        this.f12473i = C1877k.m9692a(context, iM9690a);
        this.f12474j = C1341e.m4073i();
        this.f12475k = C1773a.m8548c().m8559g();
        this.f12476l = C1773a.m8548c().m8558f();
        this.f12477m = String.valueOf(C1886t.m9847f(context));
        this.f12478n = String.valueOf(C1886t.m9845e(context));
        this.f12480p = String.valueOf(C1886t.m9841c(context));
        this.f12479o = context.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b != null) {
            strFillCDataParam = iExHandlerM2132b.fillCDataParam("at_device1|||at_device2|||at_device3");
            strFillCDataParam.replace("at_device1", "").replace("at_device2", "").replace("at_device3", "");
        } else {
            strFillCDataParam = "";
        }
        if (TextUtils.isEmpty(strFillCDataParam)) {
            this.f12468d = "";
            this.f12471g = "";
        } else {
            String[] strArrSplit = strFillCDataParam.split("\\|\\|\\|");
            try {
                this.f12468d = strArrSplit[0];
            } catch (Throwable unused) {
            }
            try {
                this.f12471g = strArrSplit[2];
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m10482a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f12465a);
            jSONObject.put("system_version", this.f12466b);
            jSONObject.put("network_type", this.f12472h);
            jSONObject.put("network_type_str", this.f12473i);
            jSONObject.put("device_ua", this.f12474j);
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
            jSONObject.put("plantform", this.f12467c);
            jSONObject.put(C1340d.m4030b("ZGV2aWNlX2ltZWk="), this.f12468d);
            jSONObject.put("android_id", this.f12469e);
            jSONObject.put("google_ad_id", this.f12470f);
            jSONObject.put("oaid", this.f12471g);
            jSONObject.put("appkey", this.f12475k);
            jSONObject.put(C2338b.f14609u, this.f12476l);
            jSONObject.put("screen_width", this.f12477m);
            jSONObject.put("screen_height", this.f12478n);
            jSONObject.put("orientation", this.f12479o);
            jSONObject.put("scale", this.f12480p);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
