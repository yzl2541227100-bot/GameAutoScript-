package com.anythink.core.p072d;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.res.C1380d;
import com.anythink.core.p072d.C1391a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C1393c {

    /* JADX INFO: renamed from: a */
    private JSONObject f5857a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f5858b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f5859c;

    /* JADX INFO: renamed from: d */
    public final String f5860d = C1393c.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    private Map<String, String> f5861e;

    /* JADX INFO: renamed from: a */
    private JSONObject m4869a() {
        return this.f5857a;
    }

    /* JADX INFO: renamed from: b */
    private Map<String, String> m4870b() {
        return this.f5858b;
    }

    /* JADX INFO: renamed from: c */
    private Map<String, String> m4871c() {
        return this.f5859c;
    }

    /* JADX INFO: renamed from: a */
    public final void m4872a(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("cached");
        Map<String, String> mapM4874av = m4874av();
        if (!TextUtils.isEmpty(strOptString) && this.f5857a != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString2 = jSONObject2.optString(next);
                    String str2 = mapM4874av.get(next);
                    jSONObject.put(next, this.f5857a.opt(next));
                    if (!TextUtils.equals(strOptString2, str2)) {
                        C1322e.m3919a(str, TextUtils.isEmpty(str) ? "1" : "2", next, strOptString2, str2);
                        jSONObject2.put(next, str2);
                    }
                }
                jSONObject.put("cached", jSONObject2.toString());
            } catch (Throwable unused) {
            }
        }
        if (this instanceof C1391a) {
            try {
                if (!TextUtils.isEmpty(((C1391a) this).m4759e()) && ((C1391a) this).m4763h() != null && ((C1391a) this).m4763h().size() > 0 && !TextUtils.equals(((C1391a) this).m4759e(), jSONObject.optString(C1391a.a.f5819h, ""))) {
                    Iterator<String> it = ((C1391a) this).m4763h().iterator();
                    while (it.hasNext()) {
                        C1380d.m4520a(C1175n.m2059a().m2148f()).m4527a(C1343g.m4123a(it.next()));
                    }
                }
                if (!TextUtils.isEmpty(((C1391a) this).m4761f()) && ((C1391a) this).m4765j() != null && ((C1391a) this).m4765j().size() > 0 && !TextUtils.equals(((C1391a) this).m4761f(), jSONObject.optString(C1391a.a.f5820i, ""))) {
                    Iterator<String> it2 = ((C1391a) this).m4765j().iterator();
                    while (it2.hasNext()) {
                        C1380d.m4520a(C1175n.m2059a().m2148f()).m4527a(C1343g.m4123a(it2.next()));
                    }
                }
                if (TextUtils.isEmpty(((C1391a) this).m4762g()) || ((C1391a) this).m4764i() == null || ((C1391a) this).m4764i().size() <= 0 || TextUtils.equals(((C1391a) this).m4762g(), jSONObject.optString(C1391a.a.f5821j, ""))) {
                    return;
                }
                Iterator<String> it3 = ((C1391a) this).m4764i().iterator();
                while (it3.hasNext()) {
                    C1380d.m4520a(C1175n.m2059a().m2148f()).m4527a(C1343g.m4123a(it3.next()));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: au */
    public final boolean m4873au() {
        Map<String, String> map = this.f5859c;
        return map == null || map.size() == 0;
    }

    /* JADX INFO: renamed from: av */
    public final synchronized Map<String, String> m4874av() {
        if (this.f5861e == null) {
            HashMap map = new HashMap();
            this.f5861e = map;
            Map<String, String> map2 = this.f5858b;
            if (map2 != null) {
                map.putAll(map2);
            }
            Map<String, String> map3 = this.f5859c;
            if (map3 != null) {
                this.f5861e.putAll(map3);
            }
        }
        return this.f5861e;
    }

    /* JADX INFO: renamed from: b */
    public final void m4875b(JSONObject jSONObject) {
        this.f5857a = jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final void m4876c(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("cached");
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
        this.f5858b = map;
    }

    /* JADX INFO: renamed from: d */
    public final void m4877d(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(C1275c.f4698ao);
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
        this.f5859c = map;
    }
}
