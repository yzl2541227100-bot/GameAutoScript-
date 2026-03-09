package com.iflytek.voiceads.p210d;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.utils.C2989g;
import com.sun.mail.imap.IMAPStore;
import com.tramini.plugin.p261a.p267f.C3341a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.d.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2920a {

    /* JADX INFO: renamed from: A */
    public double f16188A;

    /* JADX INFO: renamed from: B */
    public String f16189B;

    /* JADX INFO: renamed from: C */
    public String f16190C;

    /* JADX INFO: renamed from: D */
    public String f16191D;

    /* JADX INFO: renamed from: E */
    public String f16192E;

    /* JADX INFO: renamed from: F */
    public String f16193F;

    /* JADX INFO: renamed from: G */
    public JSONArray f16194G;

    /* JADX INFO: renamed from: H */
    public JSONObject f16195H;

    /* JADX INFO: renamed from: I */
    public String f16196I;

    /* JADX INFO: renamed from: J */
    public JSONObject f16197J;

    /* JADX INFO: renamed from: K */
    public String f16198K;

    /* JADX INFO: renamed from: L */
    public String f16199L;

    /* JADX INFO: renamed from: M */
    public int f16200M;

    /* JADX INFO: renamed from: N */
    public String f16201N;

    /* JADX INFO: renamed from: a */
    public int f16202a;

    /* JADX INFO: renamed from: b */
    public String f16203b;

    /* JADX INFO: renamed from: c */
    public double f16204c;

    /* JADX INFO: renamed from: d */
    public String f16205d;

    /* JADX INFO: renamed from: e */
    public JSONObject f16206e;

    /* JADX INFO: renamed from: f */
    public JSONObject f16207f;

    /* JADX INFO: renamed from: g */
    public JSONObject f16208g;

    /* JADX INFO: renamed from: h */
    public JSONObject f16209h;

    /* JADX INFO: renamed from: i */
    public JSONObject f16210i;

    /* JADX INFO: renamed from: j */
    public JSONObject f16211j;

    /* JADX INFO: renamed from: k */
    public JSONObject f16212k;

    /* JADX INFO: renamed from: l */
    public String f16213l;

    /* JADX INFO: renamed from: m */
    public String f16214m;

    /* JADX INFO: renamed from: n */
    public JSONObject f16215n;

    /* JADX INFO: renamed from: o */
    public String f16216o;

    /* JADX INFO: renamed from: p */
    public String f16217p;

    /* JADX INFO: renamed from: q */
    public String f16218q;

    /* JADX INFO: renamed from: r */
    public int f16219r;

    /* JADX INFO: renamed from: s */
    public String f16220s;

    /* JADX INFO: renamed from: t */
    public String f16221t;

    /* JADX INFO: renamed from: u */
    public String f16222u;

    /* JADX INFO: renamed from: v */
    public String f16223v;

    /* JADX INFO: renamed from: w */
    public double f16224w;

    /* JADX INFO: renamed from: x */
    public String f16225x;

    /* JADX INFO: renamed from: y */
    public int f16226y;

    /* JADX INFO: renamed from: z */
    public double f16227z;

    /* JADX INFO: renamed from: a */
    public void m13293a() {
        this.f16202a = -1;
        this.f16203b = "";
        this.f16204c = -1.0d;
        this.f16205d = "";
        this.f16206e = null;
        this.f16207f = null;
        this.f16208g = null;
        this.f16209h = null;
        this.f16210i = null;
        this.f16211j = null;
        this.f16212k = null;
        this.f16213l = "";
        this.f16214m = "";
        this.f16215n = null;
        this.f16216o = "";
        this.f16217p = "";
        this.f16218q = "";
        this.f16219r = -1;
        this.f16220s = "";
        this.f16221t = "";
        this.f16222u = "";
        this.f16223v = "";
        this.f16224w = -1.0d;
        this.f16225x = "";
        this.f16226y = -1;
        this.f16227z = -1.0d;
        this.f16188A = -1.0d;
        this.f16189B = "";
        this.f16190C = "";
        this.f16191D = "";
        this.f16192E = "";
        this.f16193F = "";
        this.f16194G = null;
        this.f16195H = null;
        this.f16197J = null;
        this.f16198K = "";
        this.f16199L = "";
        this.f16200M = -1;
        this.f16201N = "";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.iflytek.voiceads.config.AdError */
    /* JADX INFO: renamed from: a */
    public void m13294a(JSONObject jSONObject) throws AdError {
        try {
            m13293a();
            this.f16202a = jSONObject.optInt("template_id");
            this.f16203b = jSONObject.optString("creative_id");
            this.f16204c = jSONObject.optDouble("price");
            this.f16205d = jSONObject.optString("deal_id");
            this.f16206e = jSONObject.optJSONObject(C3341a.f18138b);
            this.f16207f = jSONObject.optJSONObject("img");
            this.f16208g = jSONObject.optJSONObject("img1");
            this.f16209h = jSONObject.optJSONObject("img2");
            this.f16210i = jSONObject.optJSONObject("img3");
            this.f16211j = jSONObject.optJSONObject(C1732o.f9719a);
            this.f16212k = jSONObject.optJSONObject(C1732o.f9732b);
            this.f16213l = jSONObject.optString("title");
            this.f16214m = jSONObject.optString("desc");
            this.f16215n = jSONObject.optJSONObject("icon");
            this.f16216o = jSONObject.optString("content");
            this.f16217p = jSONObject.optString(C1781c.f10234aa);
            this.f16218q = jSONObject.optString(ATAdConst.KEY.APP_NAME);
            this.f16219r = jSONObject.optInt("downloads");
            this.f16220s = jSONObject.optString(C1781c.f10206Y);
            this.f16221t = jSONObject.optString("app_download_url");
            this.f16222u = jSONObject.optString("app_intro_url");
            this.f16223v = jSONObject.optString("app_ver");
            this.f16224w = jSONObject.optDouble(C1781c.f10192K);
            this.f16225x = jSONObject.optString("phone");
            this.f16226y = jSONObject.optInt("likes");
            this.f16227z = jSONObject.optDouble("original_price");
            this.f16188A = jSONObject.optDouble("current_price");
            this.f16189B = jSONObject.optString("sponsored");
            this.f16190C = jSONObject.optString(IMAPStore.ID_ADDRESS);
            this.f16191D = jSONObject.optString("app_id");
            this.f16192E = jSONObject.optString("package_name");
            this.f16193F = jSONObject.optString("brand");
            this.f16194G = jSONObject.optJSONArray("display_labels");
            this.f16195H = jSONObject.optJSONObject("voice_ad_url");
            this.f16196I = jSONObject.optString("close_icon");
            this.f16197J = jSONObject.optJSONObject("monitor");
            this.f16198K = jSONObject.optString("deeplink");
            this.f16199L = jSONObject.optString("landing");
            this.f16200M = jSONObject.optInt("action_type");
            this.f16201N = jSONObject.optString("ad_source_mark");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "parseAdData error:" + e.getMessage());
            throw new AdError(70500);
        }
    }
}
