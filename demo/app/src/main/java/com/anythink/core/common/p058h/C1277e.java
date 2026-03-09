package com.anythink.core.common.p058h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1267h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1343g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1277e extends AbstractC1268a {
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
        return C1267h.m3623e();
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
            jSONObjectMo630e.put("curr_ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObjectMo630e;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    public final String mo632g() {
        HashMap map = new HashMap();
        String strM4028a = C1340d.m4028a(mo630e().toString());
        map.put(C1275c.f4651O, "1.0");
        map.put("p", strM4028a);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(map.get(str));
        }
        try {
            map.put("sign", URLEncoder.encode(C1343g.m4127c(C1175n.m2059a().m2167p() + sb.toString()), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new JSONObject(map).toString();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return C1175n.m2059a().m2165o();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return C1175n.m2059a().m2167p();
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: n */
    public final boolean mo3643n() {
        return true;
    }
}
