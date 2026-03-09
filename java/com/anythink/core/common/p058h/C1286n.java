package com.anythink.core.common.p058h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p055f.C1256u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1286n extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public C1256u f4778a;

    /* JADX INFO: renamed from: b */
    public boolean f4779b = true;

    public C1286n(C1256u c1256u) {
        this.f4778a = c1256u;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return this.f4778a.f4474b;
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

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        return this.f4778a.f4476d;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        String str = this.f4778a.f4475c;
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return map;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: d */
    public final byte[] mo629d() {
        JSONObject jSONObject;
        String str = this.f4778a.f4475c;
        boolean z = str != null && str.contains("gzip");
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.f4778a.f4477e);
            try {
                if (this.f4779b) {
                    jSONObject.put(C1275c.f4655S, 1);
                }
            } catch (Exception e) {
                e = e;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return z ? jSONObject != null ? AbstractC1268a.m3634b(jSONObject.toString()) : new byte[0] : jSONObject != null ? jSONObject.toString().getBytes() : new byte[0];
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
    /* JADX INFO: renamed from: o */
    public final boolean mo3644o() {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m3688p() {
        this.f4779b = false;
    }

    /* JADX INFO: renamed from: q */
    public final C1256u m3689q() {
        return this.f4778a;
    }
}
