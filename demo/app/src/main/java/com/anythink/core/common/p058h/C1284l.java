package com.anythink.core.common.p058h;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.C1305l;
import com.anythink.core.common.C1373r;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1220am;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.p047c.C1141b;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.github.kevinsawicki.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.l */
/* JADX INFO: loaded from: classes.dex */
public class C1284l extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public static final String f4762a = "sdk_custom";

    /* JADX INFO: renamed from: d */
    private static final String f4763d = "l";

    /* JADX INFO: renamed from: b */
    public long f4764b;

    /* JADX INFO: renamed from: c */
    public long f4765c;

    /* JADX INFO: renamed from: e */
    private String f4766e;

    /* JADX INFO: renamed from: f */
    private String f4767f;

    /* JADX INFO: renamed from: g */
    private String f4768g;

    /* JADX INFO: renamed from: h */
    private Context f4769h;

    /* JADX INFO: renamed from: i */
    private String f4770i;

    /* JADX INFO: renamed from: j */
    private String f4771j;

    /* JADX INFO: renamed from: k */
    private String f4772k;

    /* JADX INFO: renamed from: l */
    private Map<String, Object> f4773l;

    /* JADX INFO: renamed from: p */
    private Map<String, Object> f4774p;

    /* JADX INFO: renamed from: q */
    private Map<String, String> f4775q;

    /* JADX INFO: renamed from: r */
    private int f4776r;

    public C1284l(Context context, C1220am c1220am) {
        if (c1220am != null) {
            this.f4770i = c1220am.m2590a();
            this.f4771j = c1220am.m2593b();
            this.f4769h = context;
            this.f4768g = c1220am.m2594c();
            this.f4766e = C1175n.m2059a().m2168q();
            this.f4767f = C1175n.m2059a().m2151g(this.f4768g);
            this.f4772k = c1220am.m2595d();
            this.f4773l = c1220am.m2596e();
            this.f4774p = c1220am.m2597f();
            this.f4776r = c1220am.m2598g();
            this.f4775q = c1220am.m2599h();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3687a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectM1862a = C1141b.m1860a().m1862a(this.f4768g);
        if (jSONObjectM1862a != null) {
            jSONObject.put(C1275c.f4700aq, jSONObjectM1862a);
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
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (this.f4773l != null) {
                jSONObject.put(f4762a, new JSONObject(this.f4773l));
            }
            C1322e.m3907a("placement", this.f4768g, this.f4764b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f4765c);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo3639a(int i, InterfaceC1283k interfaceC1283k) {
        this.f4764b = System.currentTimeMillis();
        this.f4765c = SystemClock.elapsedRealtime();
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
        return C1267h.m3621c();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
        C1322e.m3922a("placement", adError.getPlatformCode(), adError.getPlatformMSG(), mo626b(), this.f4768g, "", "");
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
    public final JSONObject mo630e() {
        Object obj;
        JSONObject jSONObjectMo630e = super.mo630e();
        try {
            jSONObjectMo630e.put("app_id", this.f4770i);
            jSONObjectMo630e.put("pl_id", this.f4768g);
            jSONObjectMo630e.put(C1801a.f11088bt, this.f4767f);
            jSONObjectMo630e.put("nw_ver", C1341e.m4071h());
            jSONObjectMo630e.put("exclude_myofferid", C1373r.m4395a().m4396a(this.f4769h));
            if (C1175n.m2059a().m2157k() != null) {
                jSONObjectMo630e.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, C1175n.m2059a().m2157k());
            }
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
            JSONObject jSONObjectM3680a = C1275c.m3680a(this.f4773l);
            if (jSONObjectM3680a != null) {
                jSONObjectMo630e.put("custom", jSONObjectM3680a);
            }
            if (C1175n.m2059a().m2132b() != null) {
                jSONObjectMo630e.put("deny", C1341e.m4088p(C1175n.m2059a().m2148f()));
            }
            if (C1175n.m2059a().m2175v()) {
                C1175n.m2059a().m2176w().fillRequestParam(jSONObjectMo630e);
            }
            jSONObjectMo630e.put(C1275c.f4694ak, C1305l.m3759a().m3762c());
            Map<String, Object> map = this.f4774p;
            if (map != null && (obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                jSONObjectMo630e.put(C1275c.f4691ah, obj.toString());
            }
            Map<String, String> map2 = this.f4775q;
            if (map2 != null && map2.size() != 0) {
                try {
                    jSONObjectMo630e.put("cached", new JSONObject(this.f4775q));
                } catch (Throwable unused) {
                }
            }
            jSONObjectMo630e.put(C1275c.f4699ap, this.f4776r);
            JSONObject jSONObjectM1862a = C1141b.m1860a().m1862a(this.f4768g);
            if (jSONObjectM1862a != null) {
                jSONObjectMo630e.put(C1275c.f4700aq, jSONObjectM1862a);
            }
            if (C1389w.m4583a().m4628c(this.f4768g)) {
                jSONObjectMo630e.put(C1275c.f4701ar, 2);
            } else {
                jSONObjectMo630e.put(C1275c.f4701ar, 1);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.f4768g)) {
                jSONObjectMo630e.put(C1275c.f4683aT, 1);
            }
        } catch (JSONException unused2) {
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
        return this.f4770i;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return this.f4769h;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return this.f4771j;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: l */
    public final int mo637l() {
        return 63;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: n */
    public final boolean mo3643n() {
        return true;
    }
}
