package com.anythink.core.common.p058h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1244i;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1343g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.o */
/* JADX INFO: loaded from: classes.dex */
public class C1287o extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public static final int f4780a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f4781b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f4782c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f4783d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f4784e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f4785f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f4786g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f4787h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f4788i = 9;

    /* JADX INFO: renamed from: j */
    public static final int f4789j = 10;

    /* JADX INFO: renamed from: k */
    public static final int f4790k = 11;

    /* JADX INFO: renamed from: l */
    public static final int f4791l = 12;

    /* JADX INFO: renamed from: p */
    public static final int f4792p = 13;

    /* JADX INFO: renamed from: q */
    public static final int f4793q = 15;

    /* JADX INFO: renamed from: r */
    public static final int f4794r = 16;

    /* JADX INFO: renamed from: s */
    public static final int f4795s = 18;

    /* JADX INFO: renamed from: t */
    public static final int f4796t = 19;

    /* JADX INFO: renamed from: u */
    public static final int f4797u = 20;

    /* JADX INFO: renamed from: v */
    public static final int f4798v = 21;

    /* JADX INFO: renamed from: x */
    private static final String f4799x = "o";

    /* JADX INFO: renamed from: B */
    private List<C1244i> f4801B;

    /* JADX INFO: renamed from: C */
    private C1244i f4802C;

    /* JADX INFO: renamed from: D */
    private int f4803D;

    /* JADX INFO: renamed from: y */
    private Context f4805y;

    /* JADX INFO: renamed from: w */
    public boolean f4804w = false;

    /* JADX INFO: renamed from: z */
    private String f4806z = C1175n.m2059a().m2165o();

    /* JADX INFO: renamed from: A */
    private String f4800A = C1175n.m2059a().m2167p();

    public C1287o(Context context, int i, List<C1244i> list) {
        this.f4805y = context;
        this.f4803D = i;
        this.f4801B = list;
    }

    /* JADX INFO: renamed from: a */
    private void m3690a(JSONObject jSONObject) {
        if (!this.f4804w || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(C1275c.f4655S, 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return 1;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final Object mo622a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo624a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> mapMo628c = mo628c();
        if (mapMo628c != null) {
            try {
                for (String str : mapMo628c.keySet()) {
                    jSONObject.put(str, mapMo628c.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String string = jSONObject.toString();
        this.f4804w = true;
        String strMo632g = mo632g();
        this.f4804w = false;
        C1386t.m4552a().m4554a(1, mo626b(), string, strMo632g, C1256u.m3442a(1000));
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        C1244i c1244i = this.f4802C;
        if (c1244i != null) {
            return c1244i.f4224b.f3925an;
        }
        C1267h.m3614a();
        return C1267h.m3628j();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
        List<C1244i> list = this.f4801B;
        C1322e.m3922a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), mo626b(), (String) null, String.valueOf(list != null ? list.size() : 1), "0");
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        HashMap map = new HashMap();
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: d */
    public final byte[] mo629d() {
        return AbstractC1268a.m3634b(mo632g());
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: e */
    public final JSONObject mo630e() throws JSONException {
        JSONObject jSONObjectMo630e = super.mo630e();
        JSONObject jSONObjectMo631f = super.mo631f();
        try {
            jSONObjectMo630e.put("app_id", this.f4806z);
            jSONObjectMo630e.put(C1275c.f4654R, this.f4803D);
            Iterator<String> itKeys = jSONObjectMo631f.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectMo630e.put(next, jSONObjectMo631f.opt(next));
            }
            Map<String, Object> mapM2159l = C1175n.m2059a().m2159l();
            if (mapM2159l != null && mapM2159l.size() > 0 && mapM2159l != null) {
                JSONObject jSONObject = new JSONObject();
                for (String str : mapM2159l.keySet()) {
                    Object obj = mapM2159l.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                jSONObjectMo630e.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectMo630e;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    public final String mo632g() {
        JSONObject jSONObject = new JSONObject();
        String strM4028a = C1340d.m4028a(mo630e().toString());
        JSONArray jSONArray = new JSONArray();
        List<C1244i> list = this.f4801B;
        if (list != null) {
            Iterator<C1244i> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo3143a = it.next().mo3143a();
                m3690a(jSONObjectMo3143a);
                jSONArray.put(jSONObjectMo3143a);
            }
        } else {
            C1244i c1244i = this.f4802C;
            if (c1244i != null) {
                JSONObject jSONObjectMo3143a2 = c1244i.mo3143a();
                m3690a(jSONObjectMo3143a2);
                jSONArray.put(jSONObjectMo3143a2);
            }
        }
        String strM4028a2 = C1340d.m4028a(jSONArray.toString());
        String strM4127c = C1343g.m4127c(this.f4800A + "api_ver=1.0&common=" + strM4028a + "&data=" + strM4028a2);
        try {
            jSONObject.put("common", strM4028a);
            jSONObject.put("data", strM4028a2);
            jSONObject.put(C1275c.f4651O, "1.0");
            jSONObject.put("sign", strM4127c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return this.f4806z;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return this.f4805y;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return this.f4800A;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: l */
    public final int mo637l() {
        return 6;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: o */
    public final boolean mo3644o() {
        return true;
    }
}
