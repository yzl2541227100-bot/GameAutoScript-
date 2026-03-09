package com.anythink.basead.p024g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p066o.C1341e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0792c extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public String f1045a;

    /* JADX INFO: renamed from: b */
    public boolean f1046b;

    public C0792c(String str, String str2, boolean z) {
        this.f1046b = false;
        this.f1046b = z;
        this.f1045a = str.replaceAll("\\{req_id\\}", str2 == null ? "" : str2);
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

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        return this.f1045a;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        if (!this.f1046b) {
            return null;
        }
        HashMap map = new HashMap();
        String strM4073i = C1341e.m4073i();
        if (!TextUtils.isEmpty(strM4073i)) {
            map.put("User-Agent", strM4073i);
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
