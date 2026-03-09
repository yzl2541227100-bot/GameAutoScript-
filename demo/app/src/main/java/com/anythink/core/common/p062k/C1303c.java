package com.anythink.core.common.p062k;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import com.anythink.expressad.exoplayer.C1575f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1303c extends AbstractC1268a {

    /* JADX INFO: renamed from: b */
    private Context f4947b;

    /* JADX INFO: renamed from: c */
    private int f4948c;

    /* JADX INFO: renamed from: f */
    private String f4951f;

    /* JADX INFO: renamed from: g */
    private C1243h f4952g;

    /* JADX INFO: renamed from: h */
    private C1396f f4953h;

    /* JADX INFO: renamed from: i */
    private String f4954i;

    /* JADX INFO: renamed from: j */
    private String f4955j;

    /* JADX INFO: renamed from: a */
    public boolean f4946a = false;

    /* JADX INFO: renamed from: d */
    private String f4949d = C1175n.m2059a().m2165o();

    /* JADX INFO: renamed from: e */
    private String f4950e = C1175n.m2059a().m2167p();

    public C1303c(Context context, int i, String str, C1243h c1243h, C1396f c1396f, String str2, String str3) {
        this.f4947b = context;
        this.f4948c = i;
        this.f4952g = c1243h;
        this.f4953h = c1396f;
        this.f4954i = str2;
        this.f4955j = str3;
        this.f4951f = str;
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
        return C1267h.m3627i();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
        try {
            if (ErrorCode.httpStatuException.equals(adError.getCode())) {
                C1322e.m3908a(this.f4954i, this.f4955j, this.f4952g, this.f4953h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else if (this.f4946a) {
                C1322e.m3908a(this.f4954i, this.f4955j, this.f4952g, this.f4953h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else {
                this.f4946a = true;
                C1335b.m3998a().m4008a(new Runnable() { // from class: com.anythink.core.common.k.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1303c c1303c = C1303c.this;
                        c1303c.mo3639a(0, c1303c.f4593m);
                    }
                }, C1575f.f8394a);
            }
        } catch (Throwable unused) {
        }
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
            jSONObjectMo630e.put("app_id", this.f4949d);
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
        String strM4127c = C1343g.m4127c(this.f4950e + "api_ver=2.0&common=" + strM4028a + "&data=" + this.f4951f + "&ss_a=" + this.f4948c);
        try {
            jSONObject.put("common", strM4028a);
            jSONObject.put("ss_a", this.f4948c);
            jSONObject.put("data", this.f4951f);
            jSONObject.put(C1275c.f4651O, C1169h.e.f3118b);
            jSONObject.put("sign", strM4127c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return this.f4949d;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return this.f4947b;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return this.f4950e;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: m */
    public final String mo3642m() {
        return C1169h.e.f3118b;
    }
}
