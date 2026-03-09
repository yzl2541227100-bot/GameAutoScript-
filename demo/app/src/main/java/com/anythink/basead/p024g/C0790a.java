package com.anythink.basead.p024g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1190k;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p058h.C1281i;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0790a extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public String f1036a;

    /* JADX INFO: renamed from: b */
    public String f1037b;

    /* JADX INFO: renamed from: c */
    public String f1038c;

    /* JADX INFO: renamed from: d */
    public int f1039d;

    /* JADX INFO: renamed from: e */
    public int f1040e;

    /* JADX INFO: renamed from: f */
    public String f1041f;

    /* JADX INFO: renamed from: g */
    public String f1042g;

    public C0790a(C1248m c1248m) {
        this.f1036a = c1248m.f4320a;
        this.f1037b = c1248m.f4323d;
        this.f1038c = c1248m.f4321b;
        this.f1039d = c1248m.f4327h;
        this.f1040e = c1248m.f4328i;
        this.f1041f = c1248m.f4330k;
        this.f1042g = c1248m.f4331l;
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
    public final void mo623a(int i, Object obj) {
        if (obj == null) {
            m3638a(i, C1281i.f4759l, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", ""));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(obj.toString());
            if (TextUtils.isEmpty(jSONObject.optString("data"))) {
                m3638a(i, C1281i.f4760m, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.mo623a(i, jSONObject);
            }
        } catch (Throwable unused) {
            m3638a(i, C1281i.f4761n, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj != null ? obj.toString() : "Adx Service Error."));
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo624a(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        if (!TextUtils.isEmpty(this.f1042g)) {
            return this.f1042g;
        }
        C1267h.m3614a();
        return C1267h.m3624f();
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
        try {
            return mo632g().getBytes("utf-8");
        } catch (Exception unused) {
            return mo632g().getBytes();
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: e */
    public final JSONObject mo630e() {
        JSONObject jSONObjectMo630e = super.mo630e();
        try {
            jSONObjectMo630e.put("app_id", C1175n.m2059a().m2165o());
            jSONObjectMo630e.put("pl_id", this.f1038c);
            jSONObjectMo630e.put(C1801a.f11088bt, C1175n.m2059a().m2151g(this.f1038c));
            jSONObjectMo630e.put("t_g_id", this.f1039d);
            jSONObjectMo630e.put("gro_id", this.f1040e);
            String strM2178y = C1175n.m2059a().m2178y();
            if (!TextUtils.isEmpty(strM2178y)) {
                jSONObjectMo630e.put("sy_id", strM2178y);
            }
            String strM2179z = C1175n.m2059a().m2179z();
            if (TextUtils.isEmpty(strM2179z)) {
                C1175n.m2059a().m2158k(C1175n.m2059a().m2177x());
                strM2179z = C1175n.m2059a().m2177x();
            }
            jSONObjectMo630e.put("bk_id", strM2179z);
            if (C1175n.m2059a().m2132b() != null) {
                jSONObjectMo630e.put("deny", C1341e.m4088p(C1175n.m2059a().m2148f()));
            }
            JSONObject jSONObjectM3679a = C1275c.m3679a(this.f1038c);
            if (jSONObjectM3679a != null) {
                jSONObjectMo630e.put("customs", jSONObjectM3679a);
            }
        } catch (Exception unused) {
        }
        return jSONObjectMo630e;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: f */
    public final JSONObject mo631f() {
        JSONObject jSONObjectMo631f = super.mo631f();
        try {
            if (C1175n.m2059a().m2132b() != null) {
                jSONObjectMo631f.put("btts", C1341e.m4069g());
            }
        } catch (JSONException unused) {
        }
        return jSONObjectMo631f;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    public final String mo632g() {
        HashMap map = new HashMap();
        String strM4028a = C1340d.m4028a(mo630e().toString());
        String strM4028a2 = C1340d.m4028a(mo631f().toString());
        map.put("p", strM4028a);
        map.put(C1275c.f4658V, strM4028a2);
        map.put("request_id", this.f1037b);
        map.put(C1190k.a.f3534c, this.f1036a);
        return new JSONObject(map).toString();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: l */
    public final int mo637l() {
        return 34;
    }
}
