package com.anythink.core.common.p058h.p059a;

import com.anythink.core.common.C1386t;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1244i;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1343g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1273e extends AbstractC1271c {

    /* JADX INFO: renamed from: a */
    public List<C1244i> f4627a;

    /* JADX INFO: renamed from: b */
    public boolean f4628b;

    /* JADX INFO: renamed from: c */
    private final String f4629c = C1273e.class.getSimpleName();

    public C1273e(List<C1244i> list) {
        this.f4627a = list;
    }

    /* JADX INFO: renamed from: a */
    private String m3674a(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM3658h = super.m3658h();
        JSONObject jSONObjectM3659i = super.m3659i();
        try {
            jSONObjectM3658h.put("app_id", C1175n.m2059a().m2165o());
            jSONObjectM3658h.put(C1275c.f4654R, this.f4612i);
            jSONObjectM3658h.put(C1275c.f4656T, this.f4613j);
            Iterator<String> itKeys = jSONObjectM3659i.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM3658h.put(next, jSONObjectM3659i.opt(next));
            }
            Map<String, Object> mapM2159l = C1175n.m2059a().m2159l();
            if (mapM2159l != null && mapM2159l.size() > 0 && mapM2159l != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : mapM2159l.keySet()) {
                    Object obj = mapM2159l.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj.toString());
                    }
                }
                jSONObjectM3658h.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        String strM4028a = C1340d.m4028a(jSONObjectM3658h.toString());
        JSONArray jSONArray = new JSONArray();
        List<C1244i> list = this.f4627a;
        if (list != null) {
            Iterator<C1244i> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo3143a = it.next().mo3143a();
                if (z && jSONObjectMo3143a != null) {
                    try {
                        jSONObjectMo3143a.put(C1275c.f4655S, 1);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                jSONArray.put(jSONObjectMo3143a);
            }
        }
        String strM4028a2 = C1340d.m4028a(jSONArray.toString());
        String strM4127c = C1343g.m4127c(C1175n.m2059a().m2167p() + "api_ver=1.0&common=" + strM4028a + "&data=" + strM4028a2);
        try {
            jSONObject.put("common", strM4028a);
            jSONObject.put("data", strM4028a2);
            jSONObject.put(C1275c.f4651O, "1.0");
            jSONObject.put("sign", strM4127c);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: a */
    public final void mo3648a(String str, String str2, String str3, int i) {
        if (this.f4628b) {
            return;
        }
        String str4 = str3 + ":" + i;
        List<C1244i> list = this.f4627a;
        C1322e.m3922a("tk", str, str2, str4, (String) null, String.valueOf(list != null ? list.size() : 0), "1");
        C1386t.m4552a().m4554a(3, "", "", m3674a(true), C1256u.m3442a(1000));
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: c */
    public final int mo3650c() {
        return 1;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: d */
    public final int mo3651d() {
        return 3;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: e */
    public final byte[] mo3652e() {
        List<C1244i> list = this.f4627a;
        return (list == null || list.size() <= 0) ? new byte[0] : AbstractC1271c.m3655a(m3674a(false));
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: f */
    public final boolean mo3653f() {
        return this.f4628b;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: g */
    public final int mo3654g() {
        return 6;
    }
}
