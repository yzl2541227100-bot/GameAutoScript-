package com.anythink.basead.p024g;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p058h.AbstractC1268a;
import com.anythink.core.common.p065n.C1322e;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0791b extends AbstractC1268a {

    /* JADX INFO: renamed from: a */
    public String f1043a;

    /* JADX INFO: renamed from: b */
    public JSONObject f1044b;

    public C0791b(int i, C1261z c1261z, String str) {
        String strM3504aa = "";
        try {
            switch (i) {
                case 1:
                    strM3504aa = c1261z.m3504aa();
                    break;
                case 2:
                    strM3504aa = c1261z.m3505ab();
                    break;
                case 3:
                    strM3504aa = c1261z.m3506ac();
                    break;
                case 4:
                    strM3504aa = c1261z.m3507ad();
                    break;
                case 5:
                    strM3504aa = c1261z.m3508ae();
                    break;
                case 6:
                    strM3504aa = c1261z.m3509af();
                    break;
                case 7:
                    strM3504aa = c1261z.m3510ag();
                    break;
                case 8:
                    strM3504aa = c1261z.m3511ah();
                    break;
                case 9:
                    strM3504aa = c1261z.m3512ai();
                    break;
            }
            Uri uri = Uri.parse(c1261z.m3496S(strM3504aa));
            this.f1043a = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
            this.f1044b = new JSONObject();
            for (String str2 : uri.getQueryParameterNames()) {
                this.f1044b.put(str2, URLEncoder.encode(uri.getQueryParameter(str2)));
            }
            this.f1044b.put("req_id", str);
        } catch (Exception e) {
            e.printStackTrace();
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
        JSONObject jSONObject2 = this.f1044b;
        String string2 = jSONObject2 != null ? jSONObject2.toString() : "";
        C1386t.m4552a().m4554a(1, mo626b(), string, string2, C1256u.m3442a(1000));
        C1322e.m3922a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f1043a, "", "1", "");
    }

    /* JADX INFO: renamed from: a */
    public final void m638a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f1044b.put("scenario", str);
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
        return this.f1043a;
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
        JSONObject jSONObject = this.f1044b;
        if (jSONObject == null) {
            return new byte[0];
        }
        try {
            jSONObject.put("t", String.valueOf(System.currentTimeMillis()));
        } catch (Exception unused) {
        }
        return AbstractC1268a.m3634b(this.f1044b.toString());
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
