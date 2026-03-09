package com.iflytek.voiceads.p210d;

import android.content.Context;
import com.anythink.core.common.p052c.C1190k;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.utils.C2985c;
import com.iflytek.voiceads.utils.C2989g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.d.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2921b {

    /* JADX INFO: renamed from: a */
    public int f16228a;

    /* JADX INFO: renamed from: b */
    public String f16229b;

    /* JADX INFO: renamed from: c */
    public String f16230c;

    /* JADX INFO: renamed from: d */
    public String f16231d;

    /* JADX INFO: renamed from: e */
    public String f16232e;

    /* JADX INFO: renamed from: f */
    public C2920a f16233f;

    /* JADX INFO: renamed from: g */
    public boolean f16234g;

    /* JADX INFO: renamed from: h */
    public JSONObject f16235h;

    /* JADX INFO: renamed from: i */
    public Context f16236i;

    public C2921b(Context context) {
        this.f16236i = context;
    }

    /* JADX INFO: renamed from: a */
    public void m13295a() {
        this.f16228a = -1;
        this.f16229b = "";
        this.f16230c = "";
        this.f16231d = "";
        this.f16232e = "";
        this.f16233f = null;
        this.f16234g = false;
        this.f16235h = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.iflytek.voiceads.config.AdError */
    /* JADX INFO: renamed from: a */
    public void m13296a(String str) throws AdError {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C2989g.m13555a("IFLY_AD_SDK", "response:" + jSONObject.toString());
            m13295a();
            this.f16228a = jSONObject.optInt("rc");
            this.f16229b = jSONObject.optString("id");
            this.f16230c = jSONObject.optString(C1190k.a.f3534c);
            this.f16231d = jSONObject.optString("info");
            this.f16232e = jSONObject.optString("cur");
            if (this.f16228a == 70200) {
                this.f16233f = new C2920a();
                this.f16233f.m13294a(jSONObject.optJSONArray(C1782d.f10553h).getJSONObject(0));
            }
            if (jSONObject.has("extra_data_toggle")) {
                this.f16234g = jSONObject.optBoolean("extra_data_toggle");
                C2985c.m13543a(this.f16236i, "dataToggle", this.f16234g);
            }
            if (jSONObject.has("ext")) {
                this.f16235h = jSONObject.optJSONObject("ext");
            }
            C2985c.m13542a(this.f16236i, "sessionID", this.f16230c);
        } catch (JSONException e) {
            C2989g.m13557b("IFLY_AD_SDK", "Invalid response data!");
            throw new AdError(70500);
        }
    }
}
