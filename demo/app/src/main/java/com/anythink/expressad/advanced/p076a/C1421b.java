package com.anythink.expressad.advanced.p076a;

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

/* JADX INFO: renamed from: com.anythink.expressad.advanced.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1421b {

    /* JADX INFO: renamed from: d */
    public String f6435d;

    /* JADX INFO: renamed from: e */
    public String f6436e;

    /* JADX INFO: renamed from: g */
    public String f6438g;

    /* JADX INFO: renamed from: h */
    public String f6439h;

    /* JADX INFO: renamed from: i */
    public String f6440i;

    /* JADX INFO: renamed from: j */
    public String f6441j;

    /* JADX INFO: renamed from: k */
    public String f6442k;

    /* JADX INFO: renamed from: l */
    public String f6443l;

    /* JADX INFO: renamed from: m */
    public String f6444m;

    /* JADX INFO: renamed from: n */
    public String f6445n;

    /* JADX INFO: renamed from: o */
    public String f6446o;

    /* JADX INFO: renamed from: p */
    public String f6447p;

    /* JADX INFO: renamed from: c */
    public String f6434c = C3902g6.OooO0O0;

    /* JADX INFO: renamed from: a */
    public String f6432a = C1877k.m9697b();

    /* JADX INFO: renamed from: b */
    public String f6433b = C1877k.m9699c();

    /* JADX INFO: renamed from: f */
    public String f6437f = C1341e.m4065f();

    public C1421b(Context context) {
        String strFillCDataParam;
        this.f6436e = C1341e.m4060d(context);
        int iM9690a = C1877k.m9690a();
        this.f6439h = String.valueOf(iM9690a);
        this.f6440i = C1877k.m9692a(context, iM9690a);
        this.f6441j = C1341e.m4073i();
        this.f6442k = C1773a.m8548c().m8559g();
        this.f6443l = C1773a.m8548c().m8558f();
        this.f6444m = String.valueOf(C1886t.m9847f(context));
        this.f6445n = String.valueOf(C1886t.m9845e(context));
        this.f6447p = String.valueOf(C1886t.m9841c(context));
        this.f6446o = context.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b != null) {
            strFillCDataParam = iExHandlerM2132b.fillCDataParam("at_device1|||at_device2|||at_device3");
            strFillCDataParam.replace("at_device1", "").replace("at_device2", "").replace("at_device3", "");
        } else {
            strFillCDataParam = "";
        }
        if (TextUtils.isEmpty(strFillCDataParam)) {
            this.f6435d = "";
            this.f6438g = "";
        } else {
            String[] strArrSplit = strFillCDataParam.split("\\|\\|\\|");
            try {
                this.f6435d = strArrSplit[0];
            } catch (Throwable unused) {
            }
            try {
                this.f6438g = strArrSplit[2];
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m5403a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f6432a);
            jSONObject.put("system_version", this.f6433b);
            jSONObject.put("network_type", this.f6439h);
            jSONObject.put("network_type_str", this.f6440i);
            jSONObject.put("device_ua", this.f6441j);
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
            jSONObject.put("plantform", this.f6434c);
            jSONObject.put(C1340d.m4030b("ZGV2aWNlX2ltZWk="), this.f6435d);
            jSONObject.put("android_id", this.f6436e);
            jSONObject.put("google_ad_id", this.f6437f);
            jSONObject.put("oaid", this.f6438g);
            jSONObject.put("appkey", this.f6442k);
            jSONObject.put(C2338b.f14609u, this.f6443l);
            jSONObject.put("screen_width", this.f6444m);
            jSONObject.put("screen_height", this.f6445n);
            jSONObject.put("orientation", this.f6446o);
            jSONObject.put("scale", this.f6447p);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
