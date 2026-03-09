package com.anythink.core.common.p058h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p055f.C1211ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1285m extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public C1211ad f4777a;

    public C1285m(C1211ad c1211ad) {
        this.f4777a = c1211ad;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return this.f4777a.f3719b;
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
        return i >= 200 && i < 300;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        return this.f4777a.f3721d;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        String str = this.f4777a.f3720c;
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
        return new byte[0];
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
}
