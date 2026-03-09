package com.iflytek.voiceads.p218e;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.iflytek.voiceads.p210d.C2920a;
import com.iflytek.voiceads.utils.C2989g;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2960g {

    /* JADX INFO: renamed from: a */
    public String f16366a;

    /* JADX INFO: renamed from: b */
    public int f16367b;

    /* JADX INFO: renamed from: c */
    public int f16368c;

    /* JADX INFO: renamed from: d */
    public int f16369d;

    /* JADX INFO: renamed from: e */
    public int f16370e;

    /* JADX INFO: renamed from: f */
    public int f16371f;

    /* JADX INFO: renamed from: g */
    public long f16372g;

    /* JADX INFO: renamed from: h */
    public JSONObject f16373h;

    /* JADX INFO: renamed from: i */
    public JSONArray f16374i;

    /* JADX INFO: renamed from: j */
    public JSONArray f16375j;

    /* JADX INFO: renamed from: k */
    public JSONArray f16376k;

    /* JADX INFO: renamed from: l */
    public JSONArray f16377l;

    /* JADX INFO: renamed from: m */
    public JSONArray f16378m;

    /* JADX INFO: renamed from: n */
    public JSONArray f16379n;

    /* JADX INFO: renamed from: o */
    public JSONArray f16380o;

    /* JADX INFO: renamed from: p */
    public JSONArray f16381p;

    /* JADX INFO: renamed from: q */
    public JSONArray f16382q;

    /* JADX INFO: renamed from: r */
    public JSONArray f16383r;

    /* JADX INFO: renamed from: s */
    public JSONArray f16384s;

    /* JADX INFO: renamed from: t */
    public JSONArray f16385t;

    /* JADX INFO: renamed from: u */
    public JSONArray f16386u;

    /* JADX INFO: renamed from: v */
    public JSONArray f16387v;

    /* JADX INFO: renamed from: w */
    public JSONArray f16388w;

    /* JADX INFO: renamed from: x */
    public JSONArray f16389x;

    public C2960g(C2920a c2920a) {
        try {
            this.f16366a = c2920a.f16211j.optString(C1781c.f10246am);
            this.f16367b = c2920a.f16211j.optInt("duration");
            this.f16368c = c2920a.f16211j.optInt("width");
            this.f16369d = c2920a.f16211j.optInt("height");
            this.f16370e = c2920a.f16211j.optInt("format");
            this.f16371f = c2920a.f16211j.optInt("bitrate");
            this.f16372g = c2920a.f16211j.optLong("end_time");
            this.f16373h = c2920a.f16207f;
            JSONObject jSONObject = c2920a.f16197J;
            this.f16374i = jSONObject.optJSONArray("start_urls");
            this.f16375j = jSONObject.optJSONArray("first_quartile_urls");
            this.f16376k = jSONObject.optJSONArray("mid_point_urls");
            this.f16377l = jSONObject.optJSONArray("third_quartile_urls");
            this.f16378m = jSONObject.optJSONArray("complete_urls");
            this.f16379n = jSONObject.optJSONArray("pause_urls");
            this.f16380o = jSONObject.optJSONArray("resume_urls");
            this.f16381p = jSONObject.optJSONArray("skip_urls");
            this.f16382q = jSONObject.optJSONArray("mute_urls");
            this.f16383r = jSONObject.optJSONArray("unmute_urls");
            this.f16384s = jSONObject.optJSONArray("replay_urls");
            this.f16385t = jSONObject.optJSONArray("close_linear_urls");
            this.f16386u = jSONObject.optJSONArray("fullscreen_urls");
            this.f16387v = jSONObject.optJSONArray("exit_fullscreen_urls");
            this.f16388w = jSONObject.optJSONArray("up_scroll_urls");
            this.f16389x = jSONObject.optJSONArray("down_scroll_urls");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "VideoAdSelected Invalid response data!");
        }
    }
}
