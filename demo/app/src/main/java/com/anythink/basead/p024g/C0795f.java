package com.anythink.basead.p024g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p010a.C0717a;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0795f extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public String f1065a;

    /* JADX INFO: renamed from: b */
    public JSONObject f1066b;

    /* JADX INFO: renamed from: c */
    public int f1067c;

    /* JADX INFO: renamed from: d */
    public String f1068d;

    /* JADX INFO: renamed from: e */
    public AbstractC1217aj f1069e;

    /* JADX INFO: renamed from: f */
    public Map<String, Object> f1070f;

    public C0795f(int i, AbstractC1217aj abstractC1217aj, String str, Map<String, Object> map) {
        this.f1067c = i;
        this.f1069e = abstractC1217aj;
        this.f1070f = map;
        this.f1068d = str;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return 1;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final Object mo622a(Object obj) {
        return null;
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
        JSONObject jSONObject2 = this.f1066b;
        String string2 = jSONObject2 != null ? jSONObject2.toString() : "";
        C1386t.m4552a().m4554a(1, mo626b(), string, string2, C1256u.m3442a(1000));
        C1322e.m3922a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f1065a, "", "1", "");
    }

    /* JADX INFO: renamed from: a */
    public final void m642a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f1066b.put("scenario", str);
        } catch (Exception e) {
            e.printStackTrace();
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
        try {
            if (!TextUtils.isEmpty(this.f1068d)) {
                this.f1066b = new JSONObject(this.f1068d);
                for (Map.Entry<String, Object> entry : this.f1070f.entrySet()) {
                    this.f1066b.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C1267h.m3614a();
        String strM3625g = C1267h.m3625g();
        this.f1065a = strM3625g;
        return strM3625g;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        AbstractC1249n abstractC1249nM3220o;
        HashMap map = new HashMap();
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        AbstractC1217aj abstractC1217aj = this.f1069e;
        if (abstractC1217aj != null && (abstractC1249nM3220o = abstractC1217aj.m3220o()) != null && C0717a.m128a(this.f1067c, abstractC1249nM3220o)) {
            String strM4073i = C1341e.m4073i();
            if (!TextUtils.isEmpty(strM4073i)) {
                map.put("User-Agent", strM4073i);
            }
        }
        return map;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: d */
    public final byte[] mo629d() {
        return AbstractC1268a.m3634b(this.f1066b.toString());
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
}
