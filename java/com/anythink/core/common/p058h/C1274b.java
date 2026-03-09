package com.anythink.core.common.p058h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p066o.C1341e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1274b extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public Context f4630a;

    /* JADX INFO: renamed from: b */
    public int f4631b;

    /* JADX INFO: renamed from: e */
    public List<String> f4634e;

    /* JADX INFO: renamed from: f */
    public int f4635f;

    /* JADX INFO: renamed from: g */
    public boolean f4636g = false;

    /* JADX INFO: renamed from: c */
    public String f4632c = C1175n.m2059a().m2165o();

    /* JADX INFO: renamed from: d */
    public String f4633d = C1175n.m2059a().m2167p();

    public C1274b(Context context, int i, List<String> list) {
        this.f4630a = context;
        this.f4634e = list;
        this.f4631b = list.size();
        this.f4635f = i;
    }

    /* JADX INFO: renamed from: a */
    private static String m3675a(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
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
        return Integer.valueOf(this.f4631b);
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo3639a(int i, InterfaceC1283k interfaceC1283k) {
        if (!TextUtils.isEmpty(mo626b())) {
            super.mo3639a(i, interfaceC1283k);
        } else if (interfaceC1283k != null) {
            interfaceC1283k.onLoadFinish(i, Integer.valueOf(this.f4631b));
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo624a(AdError adError) {
        if (this.f4636g) {
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
            String strMo632g = mo632g();
            C1386t.m4552a().m4554a(1, mo626b(), string, strMo632g, C1256u.m3442a(1001));
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        C1267h.m3614a();
        return C1267h.m3629k();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
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
    public final JSONObject mo630e() {
        JSONObject jSONObjectMo630e = super.mo630e();
        if (jSONObjectMo630e != null) {
            try {
                jSONObjectMo630e.put("app_id", this.f4632c);
                jSONObjectMo630e.put("nw_ver", C1341e.m4071h());
                Map<String, Object> mapM2159l = C1175n.m2059a().m2159l();
                if (mapM2159l != null) {
                    try {
                        if (mapM2159l.size() > 0 && mapM2159l != null) {
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
                }
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f4634e;
                if (list != null && list.size() > 0) {
                    for (String str2 : this.f4634e) {
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(new JSONObject(str2));
                        }
                    }
                }
                jSONObjectMo630e.put("data", jSONArray);
            } catch (Exception unused2) {
            }
        }
        return jSONObjectMo630e;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: f */
    public final JSONObject mo631f() {
        JSONObject jSONObjectMo631f = super.mo631f();
        if (jSONObjectMo631f != null) {
            try {
                jSONObjectMo631f.put(C1275c.f4654R, this.f4635f);
            } catch (Exception unused) {
            }
        }
        return jSONObjectMo631f;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return this.f4632c;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return this.f4630a;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return this.f4633d;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: l */
    public final int mo637l() {
        return 4;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: o */
    public final boolean mo3644o() {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m3676p() {
        this.f4636g = true;
    }
}
