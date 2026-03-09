package com.tramini.plugin.p272b;

import android.text.TextUtils;
import com.anythink.core.common.p058h.C1275c;
import com.tramini.plugin.p261a.p265d.C3335c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3366b extends C3365a {

    /* JADX INFO: renamed from: a */
    public static final String f18232a = "b";

    /* JADX INFO: renamed from: b */
    private String f18233b;

    /* JADX INFO: renamed from: c */
    private long f18234c;

    /* JADX INFO: renamed from: d */
    private List f18235d;

    /* JADX INFO: renamed from: e */
    private ConcurrentHashMap<String, C3335c> f18236e;

    /* JADX INFO: renamed from: f */
    private String f18237f;

    /* JADX INFO: renamed from: g */
    private String f18238g;

    /* JADX INFO: renamed from: h */
    private String f18239h;

    /* JADX INFO: renamed from: i */
    private String f18240i;

    /* JADX INFO: renamed from: j */
    private String f18241j;

    /* JADX INFO: renamed from: k */
    private String f18242k;

    /* JADX INFO: renamed from: l */
    private String f18243l;

    /* JADX INFO: renamed from: m */
    private String f18244m;

    /* JADX INFO: renamed from: n */
    private int f18245n;

    /* JADX INFO: renamed from: o */
    private int f18246o;

    /* JADX INFO: renamed from: p */
    private String f18247p;

    /* JADX INFO: renamed from: q */
    private String f18248q;

    /* JADX INFO: renamed from: r */
    private String f18249r;

    /* JADX INFO: renamed from: s */
    private String f18250s;

    /* JADX INFO: renamed from: com.tramini.plugin.b.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static String f18251a = "cached";

        /* JADX INFO: renamed from: b */
        public static String f18252b = "n_cache";

        /* JADX INFO: renamed from: c */
        private static String f18253c = "si";

        /* JADX INFO: renamed from: d */
        private static String f18254d = "scto";

        /* JADX INFO: renamed from: e */
        private static String f18255e = "tf";

        /* JADX INFO: renamed from: f */
        private static String f18256f = "nl";

        /* JADX INFO: renamed from: g */
        private static String f18257g = "t_sw";

        /* JADX INFO: renamed from: h */
        private static String f18258h = "att_sw";

        /* JADX INFO: renamed from: i */
        private static String f18259i = "plst_addr";

        /* JADX INFO: renamed from: j */
        private static String f18260j = "pltk_addr";

        /* JADX INFO: renamed from: k */
        private static String f18261k = "cn_plst_addr";

        /* JADX INFO: renamed from: l */
        private static String f18262l = "cn_pltk_addr";
    }

    /* JADX INFO: renamed from: a */
    public static C3366b m15332a(String str) {
        JSONArray jSONArray;
        int length;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C3366b c3366b = new C3366b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            c3366b.m15329b(jSONObject);
            c3366b.m15330c(jSONObject);
            c3366b.m15331d(jSONObject);
            c3366b.f18233b = jSONObject.isNull(a.f18253c) ? "" : jSONObject.optString(a.f18253c);
            if (jSONObject.isNull(a.f18254d)) {
                c3366b.f18234c = 3600000L;
            } else {
                c3366b.f18234c = jSONObject.optInt(a.f18254d);
            }
            if (jSONObject.isNull(a.f18258h)) {
                c3366b.f18246o = 0;
            } else {
                c3366b.f18246o = jSONObject.optInt(a.f18258h);
            }
            if (!jSONObject.isNull(a.f18259i)) {
                c3366b.f18247p = jSONObject.optString(a.f18259i);
            }
            if (!jSONObject.isNull(a.f18260j)) {
                c3366b.f18248q = jSONObject.optString(a.f18260j);
            }
            if (!jSONObject.isNull(a.f18261k)) {
                c3366b.f18249r = jSONObject.optString(a.f18261k);
            }
            if (!jSONObject.isNull(a.f18262l)) {
                c3366b.f18250s = jSONObject.optString(a.f18262l);
            }
            if (!jSONObject.isNull(a.f18255e)) {
                ConcurrentHashMap<String, C3335c> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(a.f18255e));
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        try {
                            String next = itKeys.next();
                            C3335c c3335c = new C3335c();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
                            c3335c.f18112d = jSONObjectOptJSONObject.optString("pml");
                            c3335c.f18109a = jSONObjectOptJSONObject.optString("uu");
                            c3335c.f18110b = jSONObjectOptJSONObject.optInt("dmin");
                            c3335c.f18111c = jSONObjectOptJSONObject.optInt("dmax");
                            if (jSONObjectOptJSONObject.has("p_s") && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("p_s"))) {
                                c3335c.f18113e = new JSONArray(jSONObjectOptJSONObject.optString("p_s"));
                            }
                            concurrentHashMap.put(next, c3335c);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                c3366b.f18236e = concurrentHashMap;
            }
            if (!jSONObject.isNull(a.f18256f)) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString(a.f18256f));
                c3366b.f18237f = jSONObject3.optString("p1");
                c3366b.f18238g = jSONObject3.optString(C1275c.f4658V);
                c3366b.f18239h = jSONObject3.optString("p3");
                c3366b.f18240i = jSONObject3.optString("p4");
                c3366b.f18241j = jSONObject3.optString("p5");
                c3366b.f18242k = jSONObject3.optString("p6");
                c3366b.f18243l = jSONObject3.optString("p7");
                c3366b.f18244m = jSONObject3.optString("p8");
                if (!jSONObject3.isNull("notifications") && (length = (jSONArray = new JSONArray(jSONObject3.optString("notifications"))).length()) > 0) {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    c3366b.f18235d = arrayList;
                }
            }
            if (jSONObject.isNull(a.f18257g)) {
                c3366b.f18245n = 0;
            } else {
                c3366b.f18245n = jSONObject.optInt(a.f18257g);
            }
            return c3366b;
        } catch (JSONException unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m15333a(int i) {
        this.f18246o = i;
    }

    /* JADX INFO: renamed from: a */
    private void m15334a(long j) {
        this.f18234c = j;
    }

    /* JADX INFO: renamed from: a */
    private void m15335a(List list) {
        this.f18235d = list;
    }

    /* JADX INFO: renamed from: a */
    private void m15336a(ConcurrentHashMap<String, C3335c> concurrentHashMap) {
        this.f18236e = concurrentHashMap;
    }

    /* JADX INFO: renamed from: b */
    private void m15337b(int i) {
        this.f18245n = i;
    }

    /* JADX INFO: renamed from: b */
    private void m15338b(String str) {
        this.f18233b = str;
    }

    /* JADX INFO: renamed from: c */
    private void m15339c(String str) {
        this.f18237f = str;
    }

    /* JADX INFO: renamed from: d */
    private void m15340d(String str) {
        this.f18238g = str;
    }

    /* JADX INFO: renamed from: e */
    private void m15341e(String str) {
        this.f18239h = str;
    }

    /* JADX INFO: renamed from: f */
    private void m15342f(String str) {
        this.f18240i = str;
    }

    /* JADX INFO: renamed from: g */
    private void m15343g(String str) {
        this.f18241j = str;
    }

    /* JADX INFO: renamed from: h */
    private void m15344h(String str) {
        this.f18242k = str;
    }

    /* JADX INFO: renamed from: i */
    private void m15345i(String str) {
        this.f18243l = str;
    }

    /* JADX INFO: renamed from: j */
    private void m15346j(String str) {
        this.f18244m = str;
    }

    /* JADX INFO: renamed from: k */
    private void m15347k(String str) {
        this.f18247p = str;
    }

    /* JADX INFO: renamed from: l */
    private void m15348l(String str) {
        this.f18248q = str;
    }

    /* JADX INFO: renamed from: m */
    private void m15349m(String str) {
        this.f18249r = str;
    }

    /* JADX INFO: renamed from: n */
    private void m15350n(String str) {
        this.f18250s = str;
    }

    /* JADX INFO: renamed from: q */
    private String m15351q() {
        return this.f18242k;
    }

    /* JADX INFO: renamed from: r */
    private String m15352r() {
        return this.f18249r;
    }

    /* JADX INFO: renamed from: s */
    private String m15353s() {
        return this.f18250s;
    }

    /* JADX INFO: renamed from: b */
    public final int m15354b() {
        return this.f18246o;
    }

    /* JADX INFO: renamed from: c */
    public final String m15355c() {
        return this.f18233b;
    }

    /* JADX INFO: renamed from: d */
    public final long m15356d() {
        return this.f18234c;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m15357e() {
        return this.f18235d;
    }

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap<String, C3335c> m15358f() {
        return this.f18236e;
    }

    /* JADX INFO: renamed from: g */
    public final String m15359g() {
        return this.f18237f;
    }

    /* JADX INFO: renamed from: h */
    public final String m15360h() {
        return this.f18238g;
    }

    /* JADX INFO: renamed from: i */
    public final String m15361i() {
        return this.f18239h;
    }

    /* JADX INFO: renamed from: j */
    public final String m15362j() {
        return this.f18240i;
    }

    /* JADX INFO: renamed from: k */
    public final String m15363k() {
        return this.f18241j;
    }

    /* JADX INFO: renamed from: l */
    public final String m15364l() {
        return this.f18243l;
    }

    /* JADX INFO: renamed from: m */
    public final String m15365m() {
        return this.f18244m;
    }

    /* JADX INFO: renamed from: n */
    public final int m15366n() {
        return this.f18245n;
    }

    /* JADX INFO: renamed from: o */
    public final String m15367o() {
        return this.f18247p;
    }

    /* JADX INFO: renamed from: p */
    public final String m15368p() {
        return this.f18248q;
    }
}
