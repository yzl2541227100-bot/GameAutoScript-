package com.anythink.core.common.p058h;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.C1305l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import com.github.kevinsawicki.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.d */
/* JADX INFO: loaded from: classes.dex */
public class C1276d extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public static final String f4735a = "custom";

    /* JADX INFO: renamed from: f */
    private static final String f4736f = "d";

    /* JADX INFO: renamed from: b */
    public long f4737b;

    /* JADX INFO: renamed from: c */
    public long f4738c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f4739d = C1175n.m2059a().m2159l();

    /* JADX INFO: renamed from: e */
    public Map<String, String> f4740e;

    /* JADX INFO: renamed from: g */
    private String f4741g;

    /* JADX INFO: renamed from: h */
    private String f4742h;

    /* JADX INFO: renamed from: i */
    private Context f4743i;

    public C1276d(Context context, String str, String str2, Map<String, String> map) {
        this.f4741g = str;
        this.f4742h = str2;
        this.f4743i = context;
        this.f4740e = map;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return 1;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final Object mo622a(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (this.f4739d != null) {
                jSONObject.put("custom", new JSONObject(this.f4739d));
            }
        } catch (Exception unused) {
        }
        C1322e.m3907a("app", (String) null, this.f4737b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f4738c);
        return obj;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo3639a(int i, InterfaceC1283k interfaceC1283k) {
        this.f4737b = System.currentTimeMillis();
        this.f4738c = SystemClock.elapsedRealtime();
        super.mo3639a(i, interfaceC1283k);
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
        return C1267h.m3619b();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
        C1322e.m3922a("app", adError.getPlatformCode(), adError.getPlatformMSG(), mo626b(), "", "", "");
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        HashMap map = new HashMap();
        map.put(HttpRequest.HEADER_ACCEPT_ENCODING, "gzip");
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
    public final JSONObject mo630e() throws JSONException {
        JSONObject jSONObjectMo630e = super.mo630e();
        try {
            jSONObjectMo630e.put("app_id", this.f4741g);
            jSONObjectMo630e.put("nw_ver", C1341e.m4071h());
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
            JSONObject jSONObjectM3677a = C1275c.m3677a();
            if (jSONObjectM3677a != null) {
                jSONObjectMo630e.put("custom", jSONObjectM3677a);
            }
            if (C1175n.m2059a().m2132b() != null) {
                jSONObjectMo630e.put("deny", C1341e.m4088p(C1175n.m2059a().m2148f()));
            }
            if (C1175n.m2059a().m2175v()) {
                jSONObjectMo630e.put("is_test", 1);
            }
            jSONObjectMo630e.put(C1275c.f4694ak, C1305l.m3759a().m3762c());
            C1305l.m3759a();
            jSONObjectMo630e.put("pil_offset", C1305l.m3760b());
            Map<String, String> map = this.f4740e;
            if (map != null) {
                if (map.size() != 0) {
                    jSONObjectMo630e.put("cached", new JSONObject(this.f4740e));
                }
            }
        } catch (Throwable unused) {
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
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return this.f4741g;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return this.f4743i;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return this.f4742h;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: l */
    public int mo637l() {
        return 59;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: n */
    public final boolean mo3643n() {
        return true;
    }
}
