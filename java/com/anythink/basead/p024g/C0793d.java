package com.anythink.basead.p024g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.C1305l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p058h.C1281i;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0793d extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public String f1047a;

    /* JADX INFO: renamed from: b */
    public String f1048b;

    /* JADX INFO: renamed from: c */
    public String f1049c;

    /* JADX INFO: renamed from: d */
    public int f1050d;

    /* JADX INFO: renamed from: e */
    public int f1051e;

    /* JADX INFO: renamed from: f */
    public int f1052f;

    /* JADX INFO: renamed from: g */
    public int f1053g;

    /* JADX INFO: renamed from: h */
    public String[] f1054h;

    /* JADX INFO: renamed from: i */
    public int f1055i;

    /* JADX INFO: renamed from: j */
    public int f1056j;

    /* JADX INFO: renamed from: k */
    public String f1057k;

    /* JADX INFO: renamed from: l */
    public String f1058l = "OnlineOfferLoader";

    public C0793d(C1248m c1248m, int i, int i2, String[] strArr, String str) {
        this.f1047a = c1248m.f4323d;
        this.f1048b = c1248m.f4321b;
        this.f1049c = c1248m.f4322c;
        this.f1055i = c1248m.f4324e;
        this.f1052f = i;
        this.f1053g = i2;
        this.f1054h = strArr;
        this.f1050d = c1248m.f4327h;
        this.f1051e = c1248m.f4328i;
        this.f1056j = c1248m.f4329j;
        this.f1057k = str;
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
                m3638a(i, C1281i.f4760m, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.mo623a(i, jSONObject);
            }
        } catch (Throwable th) {
            m3638a(i, C1281i.f4761n, obj != null ? obj.toString() : th.getMessage(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj != null ? obj.toString() : "Online Api Service Error."));
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
        C1267h.m3614a();
        return C1267h.m3626h();
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
            jSONObjectMo630e.put("pl_id", this.f1048b);
            jSONObjectMo630e.put(C1801a.f11088bt, C1175n.m2059a().m2151g(this.f1048b));
            jSONObjectMo630e.put("t_g_id", this.f1050d);
            jSONObjectMo630e.put("gro_id", this.f1051e);
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
            jSONObjectMo630e.put(C1275c.f4694ak, C1305l.m3759a().m3762c());
            JSONObject jSONObjectM3679a = C1275c.m3679a(this.f1048b);
            if (jSONObjectM3679a != null) {
                jSONObjectMo630e.put("customs", jSONObjectM3679a);
            }
            C1275c.m3682a(jSONObjectMo630e);
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo632g() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p024g.C0793d.mo632g():java.lang.String");
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
        return 2;
    }
}
