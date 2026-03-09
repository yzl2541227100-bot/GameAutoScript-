package com.tramini.plugin.p261a.p266e;

import android.content.Context;
import com.tramini.plugin.p261a.C3322a;
import com.tramini.plugin.p261a.p263b.C3325a;
import com.tramini.plugin.p261a.p263b.C3327c;
import com.tramini.plugin.p261a.p269h.C3359e;
import com.tramini.plugin.p261a.p269h.C3362h;
import com.tramini.plugin.p272b.C3366b;
import com.tramini.plugin.p272b.C3367c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.e.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3339d extends AbstractC3336a {
    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: a */
    public final int mo15184a() {
        return 1;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: a */
    public final Object mo15185a(String str) {
        return str.trim();
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: b */
    public final String mo15188b() {
        C3322a.m15128a();
        return C3322a.m15130b();
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo15189c() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: d */
    public final byte[] mo15190d() {
        try {
            return mo15192f().getBytes("utf-8");
        } catch (Exception unused) {
            return mo15192f().getBytes();
        }
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: e */
    public final JSONObject mo15191e() throws JSONException {
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        Context contextM15159b = C3327c.m15142a().m15159b();
        try {
            jSONObject.put("platform", "1");
            jSONObject.put("os_vn", C3359e.m15307b());
            jSONObject.put("os_vc", C3359e.m15305a());
            jSONObject.put("package_name", C3359e.m15310c(contextM15159b));
            jSONObject.put("app_vn", C3359e.m15308b(contextM15159b));
            jSONObject.put("app_vc", C3359e.m15306a(contextM15159b));
            jSONObject.put("sdk_ver", C3325a.f18054a);
            jSONObject.put("android_id", "");
            if (!C3362h.m15315a(contextM15159b)) {
                str = "0";
            }
            jSONObject.put(AbstractC3336a.f18122i, str);
            C3366b c3366bM15389b = C3367c.m15382a(contextM15159b).m15389b();
            if (c3366bM15389b != null && c3366bM15389b.m15327a() != null) {
                if (c3366bM15389b.m15327a().size() != 0) {
                    jSONObject.put("cached", new JSONObject(c3366bM15389b.m15327a()));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.tramini.plugin.p261a.p266e.AbstractC3336a
    /* JADX INFO: renamed from: g */
    public final boolean mo15193g() {
        return true;
    }
}
