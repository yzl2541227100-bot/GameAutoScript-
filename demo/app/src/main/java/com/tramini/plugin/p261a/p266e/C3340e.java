package com.tramini.plugin.p261a.p266e;

import android.content.Context;
import com.tramini.plugin.p261a.C3322a;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p261a.p269h.C3357c;
import com.tramini.plugin.p261a.p269h.C3360f;
import com.tramini.plugin.p272b.C3367c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.e.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3340e extends AbstractC3336a {

    /* JADX INFO: renamed from: p */
    public static final int f18132p = 10001;

    /* JADX INFO: renamed from: q */
    private Context f18133q;

    /* JADX INFO: renamed from: r */
    private String f18134r;

    /* JADX INFO: renamed from: s */
    private JSONObject f18135s;

    /* JADX INFO: renamed from: t */
    private JSONObject f18136t;

    public C3340e(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f18133q = context;
        this.f18134r = str;
        this.f18135s = jSONObject;
        this.f18136t = jSONObject2;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: a */
    public final int mo15184a() {
        return 1;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: a */
    public final Object mo15185a(String str) {
        return str.trim();
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: b */
    public final String mo15188b() {
        C3335c c3335c = C3367c.m15382a(this.f18133q).m15389b().m15358f().get(this.f18134r);
        C3322a.m15128a();
        return c3335c != null ? c3335c.f18109a : C3322a.m15131c();
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo15189c() {
        HashMap map = new HashMap();
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: d */
    public final byte[] mo15190d() {
        return AbstractC3336a.m15183b(mo15192f());
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: e */
    public final JSONObject mo15191e() {
        JSONObject jSONObject = this.f18135s;
        return jSONObject == null ? super.mo15191e() : jSONObject;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: f */
    public final String mo15192f() {
        JSONObject jSONObject = new JSONObject();
        String strM15301b = C3357c.m15301b(mo15191e().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f18136t);
        String strM15301b2 = C3357c.m15301b(jSONArray.toString());
        String strM15311a = C3360f.m15311a("d_version=1.0&dt=" + strM15301b2 + "&cm=" + strM15301b);
        try {
            jSONObject.put("cm", strM15301b);
            jSONObject.put("dt", strM15301b2);
            jSONObject.put("d_version", "1.0");
            jSONObject.put("d_sign", strM15311a);
            jSONObject.put("pl_c", "5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: g */
    public final boolean mo15193g() {
        return false;
    }
}
