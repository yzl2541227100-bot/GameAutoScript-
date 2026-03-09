package com.anythink.expressad.videocommon.p181e;

import android.text.TextUtils;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.videocommon.p179c.C2333c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2337a {

    /* JADX INFO: renamed from: a */
    public static final int f14512a = 1000;

    /* JADX INFO: renamed from: b */
    public static final int f14513b = 1000;

    /* JADX INFO: renamed from: c */
    private Map<String, Integer> f14514c;

    /* JADX INFO: renamed from: d */
    private Map<String, C2333c> f14515d;

    /* JADX INFO: renamed from: e */
    private long f14516e;

    /* JADX INFO: renamed from: f */
    private long f14517f;

    /* JADX INFO: renamed from: g */
    private long f14518g;

    /* JADX INFO: renamed from: h */
    private long f14519h;

    /* JADX INFO: renamed from: i */
    private long f14520i;

    /* JADX INFO: renamed from: j */
    private long f14521j;

    /* JADX INFO: renamed from: a */
    private static C2337a m11975a(String str) {
        C2337a c2337a;
        C2337a c2337a2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                c2337a = new C2337a();
            } catch (Exception e) {
                e = e;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C2338b.f14548a);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            map.put(next, (TextUtils.isEmpty(next) || iOptInt != 0) ? Integer.valueOf(iOptInt) : 1000);
                        }
                    }
                    c2337a.f14514c = map;
                }
                c2337a.f14515d = C2333c.m11966a(jSONObject.optJSONArray("reward"));
                c2337a.f14516e = jSONObject.optLong("getpf", 43200L);
                c2337a.f14517f = jSONObject.optLong(C2338b.f14612x, 5400L);
                c2337a.f14518g = jSONObject.optLong("plct", C1485b.f6968P);
                c2337a.f14519h = jSONObject.optLong("dlct", C1485b.f6968P);
                c2337a.f14520i = jSONObject.optLong(C2338b.f14522A, 5L);
                c2337a.f14521j = jSONObject.optLong("current_time");
                return c2337a;
            } catch (Exception e2) {
                e = e2;
                c2337a2 = c2337a;
                e.printStackTrace();
                return c2337a2;
            }
        }
        return c2337a2;
    }

    /* JADX INFO: renamed from: a */
    private void m11976a(long j) {
        this.f14521j = j;
    }

    /* JADX INFO: renamed from: l */
    private long m11977l() {
        return this.f14516e * 1000;
    }

    /* JADX INFO: renamed from: m */
    private long m11978m() {
        return this.f14517f * 1000;
    }

    /* JADX INFO: renamed from: n */
    private long m11979n() {
        return this.f14521j;
    }

    /* JADX INFO: renamed from: o */
    private static C2337a m11980o() {
        C2337a c2337a = new C2337a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new C2333c("Virtual Item", 1));
        c2337a.f14514c = map;
        c2337a.f14515d = map2;
        c2337a.f14516e = 43200L;
        c2337a.f14517f = 5400L;
        c2337a.f14518g = C1485b.f6968P;
        c2337a.f14519h = C1485b.f6968P;
        c2337a.f14520i = 5L;
        return c2337a;
    }

    /* JADX INFO: renamed from: a */
    public final void m11981a() {
        this.f14516e = 43200L;
    }

    /* JADX INFO: renamed from: a */
    public final void m11982a(Map<String, Integer> map) {
        this.f14514c = map;
    }

    /* JADX INFO: renamed from: b */
    public final void m11983b() {
        this.f14517f = 5400L;
    }

    /* JADX INFO: renamed from: b */
    public final void m11984b(Map<String, C2333c> map) {
        this.f14515d = map;
    }

    /* JADX INFO: renamed from: c */
    public final long m11985c() {
        return this.f14518g * 1000;
    }

    /* JADX INFO: renamed from: d */
    public final void m11986d() {
        this.f14518g = C1485b.f6968P;
    }

    /* JADX INFO: renamed from: e */
    public final long m11987e() {
        return this.f14519h;
    }

    /* JADX INFO: renamed from: f */
    public final void m11988f() {
        this.f14519h = C1485b.f6968P;
    }

    /* JADX INFO: renamed from: g */
    public final long m11989g() {
        return this.f14520i;
    }

    /* JADX INFO: renamed from: h */
    public final void m11990h() {
        this.f14520i = 5L;
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, Integer> m11991i() {
        if (this.f14514c == null) {
            HashMap map = new HashMap();
            this.f14514c = map;
            map.put("1", 1000);
            this.f14514c.put("9", 1000);
            this.f14514c.put("8", 1000);
        }
        return this.f14514c;
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, C2333c> m11992j() {
        return this.f14515d;
    }

    /* JADX INFO: renamed from: k */
    public final JSONObject m11993k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f14514c;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f14514c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(C2338b.f14548a, jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, C2333c> map2 = this.f14515d;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, C2333c> entry2 : this.f14515d.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        C2333c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.m11969a());
                            jSONObject3.put("amount", value.m11972b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f14516e);
            jSONObject.put(C2338b.f14612x, this.f14517f);
            jSONObject.put("plct", this.f14518g);
            jSONObject.put("dlct", this.f14519h);
            jSONObject.put(C2338b.f14522A, this.f14520i);
            jSONObject.put("current_time", this.f14521j);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
