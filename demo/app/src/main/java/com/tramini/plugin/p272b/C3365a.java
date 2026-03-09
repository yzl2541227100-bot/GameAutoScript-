package com.tramini.plugin.p272b;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p262a.C3323a;
import com.tramini.plugin.p272b.C3366b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3365a {

    /* JADX INFO: renamed from: a */
    private JSONObject f18228a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f18229b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f18230c;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f18231d;

    /* JADX INFO: renamed from: b */
    private JSONObject m15324b() {
        return this.f18228a;
    }

    /* JADX INFO: renamed from: c */
    private Map<String, String> m15325c() {
        return this.f18229b;
    }

    /* JADX INFO: renamed from: d */
    private Map<String, String> m15326d() {
        return this.f18230c;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Map<String, String> m15327a() {
        if (this.f18231d == null) {
            HashMap map = new HashMap();
            this.f18231d = map;
            Map<String, String> map2 = this.f18229b;
            if (map2 != null) {
                map.putAll(map2);
            }
            Map<String, String> map3 = this.f18230c;
            if (map3 != null) {
                this.f18231d.putAll(map3);
            }
        }
        return this.f18231d;
    }

    /* JADX INFO: renamed from: a */
    public final void m15328a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(C3366b.a.f18251a);
        Map<String, String> mapM15327a = m15327a();
        if (TextUtils.isEmpty(strOptString) || this.f18228a == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString2 = jSONObject2.optString(next);
                String str = mapM15327a.get(next);
                jSONObject.put(next, this.f18228a.opt(next));
                if (!TextUtils.equals(strOptString2, str)) {
                    C3323a.m15132a(next, strOptString2, str);
                    jSONObject2.put(next, str);
                }
            }
            jSONObject.put(C3366b.a.f18251a, jSONObject2.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15329b(JSONObject jSONObject) {
        this.f18228a = jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final void m15330c(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(C3366b.a.f18251a);
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f18229b = map;
    }

    /* JADX INFO: renamed from: d */
    public final void m15331d(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(C3366b.a.f18252b);
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f18230c = map;
    }
}
