package com.anythink.core.common.p063l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.l.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1309d {

    /* JADX INFO: renamed from: a */
    public long f4988a = 30000;

    /* JADX INFO: renamed from: b */
    public int f4989b = 1;

    /* JADX INFO: renamed from: c */
    public long f4990c = 30000;

    /* JADX INFO: renamed from: d */
    public int f4991d = 1;

    /* JADX INFO: renamed from: e */
    public List<C1310e> f4992e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    public Map<String, C1310e> f4993f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static C1309d m3788a(JSONObject jSONObject) {
        C1309d c1309d = new C1309d();
        if (jSONObject == null) {
            return c1309d;
        }
        c1309d.f4988a = jSONObject.optLong("pre_load_time", 30000L);
        c1309d.f4989b = jSONObject.optInt("pre_load_num", 1);
        c1309d.f4990c = jSONObject.optLong("pre_load_timeout", 30000L);
        c1309d.f4991d = jSONObject.optInt("pre_load_mode", 1);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("formats");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        C1310e c1310e = new C1310e();
                        c1310e.f4994a = jSONObjectOptJSONObject.optInt("format");
                        c1310e.f4995b = jSONObjectOptJSONObject.optString("pl_id", "");
                        c1310e.f4996c = jSONObjectOptJSONObject.optInt("req_pacing");
                        c1310e.f4997d = jSONObjectOptJSONObject.optInt("ad_cache", 1);
                        c1310e.f4998e = jSONObjectOptJSONObject.optDouble("ad_ecpm", -1.0d);
                        c1309d.f4992e.add(c1310e);
                        c1309d.f4993f.put(c1310e.f4995b, c1310e);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return c1309d;
    }

    /* JADX INFO: renamed from: a */
    public final long m3789a() {
        return this.f4988a;
    }

    /* JADX INFO: renamed from: b */
    public final int m3790b() {
        return this.f4989b;
    }

    /* JADX INFO: renamed from: c */
    public final long m3791c() {
        return this.f4990c;
    }

    /* JADX INFO: renamed from: d */
    public final int m3792d() {
        return this.f4991d;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, C1310e> m3793e() {
        return this.f4993f;
    }

    /* JADX INFO: renamed from: f */
    public final List<C1310e> m3794f() {
        return this.f4992e;
    }
}
