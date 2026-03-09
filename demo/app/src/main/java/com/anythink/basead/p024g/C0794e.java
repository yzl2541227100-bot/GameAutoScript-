package com.anythink.basead.p024g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p010a.C0717a;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1385s;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p066o.C1341e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.g.e */
/* JADX INFO: loaded from: classes.dex */
public class C0794e extends AbstractC1268a {

    /* JADX INFO: renamed from: f */
    private static String f1059f = "e";

    /* JADX INFO: renamed from: a */
    public int f1060a;

    /* JADX INFO: renamed from: b */
    public String f1061b;

    /* JADX INFO: renamed from: c */
    public AbstractC1217aj f1062c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f1063d;

    /* JADX INFO: renamed from: e */
    public boolean f1064e = false;

    public C0794e(int i, String str, AbstractC1217aj abstractC1217aj, Map<String, Object> map) {
        this.f1060a = i;
        this.f1061b = str;
        this.f1062c = abstractC1217aj;
        this.f1063d = map;
    }

    /* JADX INFO: renamed from: p */
    private void m639p() {
        String string;
        try {
            string = new JSONObject(mo628c()).toString();
        } catch (Throwable unused) {
            string = new JSONObject().toString();
        }
        C1385s.m4541a().m4550a(this.f4595o, string, this.f1062c.m2478Z());
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return 2;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final Object mo622a(Object obj) {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo624a(AdError adError) {
    }

    /* JADX INFO: renamed from: a */
    public final void m640a(boolean z) {
        this.f1064e = z;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        if (this.f1063d != null && !TextUtils.isEmpty(this.f1061b)) {
            try {
                for (Map.Entry<String, Object> entry : this.f1063d.entrySet()) {
                    String key = entry.getKey();
                    this.f1061b = this.f1061b.replaceAll("\\{" + key + "\\}", (String) entry.getValue());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f1061b;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo641b(int i) {
        String string;
        if (this.f1064e) {
            new StringBuilder("handleErrorStatusCode, start to check, url: ").append(this.f1061b);
            C1385s.m4541a();
            if (C1385s.m4546a(i)) {
                try {
                    string = new JSONObject(mo628c()).toString();
                } catch (Throwable unused) {
                    string = new JSONObject().toString();
                }
                C1385s.m4541a().m4550a(this.f4595o, string, this.f1062c.m2478Z());
            }
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        if (this.f1062c == null) {
            return null;
        }
        HashMap map = new HashMap();
        AbstractC1249n abstractC1249nM3220o = this.f1062c.m3220o();
        if (abstractC1249nM3220o != null && C0717a.m128a(this.f1060a, abstractC1249nM3220o)) {
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
        return new byte[0];
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    public final String mo632g() {
        return "";
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
