package com.anythink.expressad.foundation.p116d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p138h.C1876j;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.out.C1935j;
import com.anythink.expressad.p073a.C1411c;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.h */
/* JADX INFO: loaded from: classes.dex */
public class C1786h extends C1935j implements InterfaceC1491b, Serializable {

    /* JADX INFO: renamed from: cA */
    public static final String f10651cA = "adv_id";

    /* JADX INFO: renamed from: cB */
    public static final String f10652cB = "ttc_type";

    /* JADX INFO: renamed from: cC */
    public static final String f10653cC = "ttc_ct2";

    /* JADX INFO: renamed from: cD */
    public static final String f10654cD = "gh_id";

    /* JADX INFO: renamed from: cE */
    public static final String f10655cE = "gh_path";

    /* JADX INFO: renamed from: cF */
    public static final String f10656cF = "bind_id";

    /* JADX INFO: renamed from: cG */
    public static final String f10657cG = "mark";

    /* JADX INFO: renamed from: cH */
    public static final String f10658cH = "isPost";

    /* JADX INFO: renamed from: cI */
    public static final int f10659cI = 604800;

    /* JADX INFO: renamed from: cJ */
    public static final int f10660cJ = 1800;

    /* JADX INFO: renamed from: cK */
    public static final String f10661cK = "apk_download_start";

    /* JADX INFO: renamed from: cL */
    public static final String f10662cL = "apk_download_end";

    /* JADX INFO: renamed from: cM */
    public static final String f10663cM = "apk_install";

    /* JADX INFO: renamed from: cN */
    public static final String f10664cN = "loopback";

    /* JADX INFO: renamed from: cO */
    public static final String f10665cO = "domain";

    /* JADX INFO: renamed from: cP */
    public static final String f10666cP = "key";

    /* JADX INFO: renamed from: cQ */
    public static final String f10667cQ = "value";

    /* JADX INFO: renamed from: co */
    public static final String f10668co = C1786h.class.getSimpleName();

    /* JADX INFO: renamed from: cp */
    public static final String f10669cp = "apk_alt";

    /* JADX INFO: renamed from: cq */
    public static final String f10670cq = "disableApkAlt";

    /* JADX INFO: renamed from: cr */
    public static final String f10671cr = "apk_info";

    /* JADX INFO: renamed from: cs */
    public static final String f10672cs = "ntbarpt";

    /* JADX INFO: renamed from: ct */
    public static final String f10673ct = "ntbarpasbl";

    /* JADX INFO: renamed from: cu */
    public static final String f10674cu = "atat_type";

    /* JADX INFO: renamed from: cv */
    public static final String f10675cv = "akdlui";

    /* JADX INFO: renamed from: cw */
    public static final String f10676cw = "ttc";

    /* JADX INFO: renamed from: cx */
    public static final String f10677cx = "ttc_ct";

    /* JADX INFO: renamed from: cy */
    public static final String f10678cy = "ttc_pe";

    /* JADX INFO: renamed from: cz */
    public static final String f10679cz = "ttc_po";

    /* JADX INFO: renamed from: l */
    private static final long f10680l = 1;

    /* JADX INFO: renamed from: d */
    private C1779a f10684d;

    /* JADX INFO: renamed from: i */
    private String f10689i;

    /* JADX INFO: renamed from: j */
    private String f10690j;

    /* JADX INFO: renamed from: k */
    private String f10691k;

    /* JADX INFO: renamed from: n */
    private int f10693n;

    /* JADX INFO: renamed from: o */
    private String f10694o;

    /* JADX INFO: renamed from: p */
    private int f10695p;

    /* JADX INFO: renamed from: q */
    private Map<String, String> f10696q;

    /* JADX INFO: renamed from: r */
    private String f10697r;

    /* JADX INFO: renamed from: s */
    private String f10698s;

    /* JADX INFO: renamed from: t */
    private int f10699t;

    /* JADX INFO: renamed from: u */
    private int f10700u;

    /* JADX INFO: renamed from: v */
    private C1411c.b f10701v;

    /* JADX INFO: renamed from: a */
    private int f10681a = 0;

    /* JADX INFO: renamed from: b */
    private int f10682b = 0;

    /* JADX INFO: renamed from: c */
    private String f10683c = "";

    /* JADX INFO: renamed from: e */
    private int f10685e = 0;

    /* JADX INFO: renamed from: f */
    private int f10686f = 0;

    /* JADX INFO: renamed from: g */
    private int f10687g = 0;

    /* JADX INFO: renamed from: h */
    private String f10688h = "";

    /* JADX INFO: renamed from: m */
    private boolean f10692m = false;

    /* JADX INFO: renamed from: a */
    public static C1781c m9079a(JSONObject jSONObject, C1781c c1781c) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((C1786h) c1781c).f10692m = jSONObject.optBoolean(f10676cw);
            ((C1786h) c1781c).f10693n = jSONObject.optInt(f10677cx, 604800);
            ((C1786h) c1781c).f10698s = jSONObject.optString(f10651cA);
            ((C1786h) c1781c).f10699t = jSONObject.optInt("ttc_type", 3);
            ((C1786h) c1781c).f10700u = jSONObject.optInt(f10653cC, 1800);
            c1781c.m10143a(System.currentTimeMillis());
            c1781c.m8895m(jSONObject.optString(C1782d.f10551f));
            c1781c.m8898n(jSONObject.optString(C1782d.f10556k));
            ((C1786h) c1781c).f10694o = jSONObject.optString(f10657cG);
            ((C1786h) c1781c).f10695p = jSONObject.optInt(f10658cH);
            try {
                if (jSONObject.has(f10664cN)) {
                    String strOptString = jSONObject.optString(f10664cN);
                    if (!TextUtils.isEmpty(strOptString)) {
                        ((C1786h) c1781c).f10697r = strOptString;
                        ((C1786h) c1781c).f10696q = m9102h(strOptString);
                    }
                }
            } catch (Exception unused) {
            }
            String strOptString2 = jSONObject.optString(f10654cD);
            if (!TextUtils.isEmpty(strOptString2)) {
                ((C1786h) c1781c).f10689i = strOptString2;
                String strOptString3 = jSONObject.optString(f10655cE);
                if (!TextUtils.isEmpty(strOptString3)) {
                    ((C1786h) c1781c).f10690j = C1876j.m9688b(strOptString3);
                }
                ((C1786h) c1781c).f10691k = jSONObject.optString(f10656cF);
            }
            ((C1786h) c1781c).f10681a = jSONObject.optInt(f10669cp, 0);
            ((C1786h) c1781c).f10682b = jSONObject.optInt(f10670cq, 0);
            ((C1786h) c1781c).f10684d = C1779a.m8588a(jSONObject.optString(f10671cr));
            ((C1786h) c1781c).f10686f = jSONObject.optInt(f10673ct, 0);
            ((C1786h) c1781c).f10685e = jSONObject.optInt(f10672cs, 0);
            ((C1786h) c1781c).f10687g = jSONObject.optInt(f10674cu, 0);
            ((C1786h) c1781c).f10688h = jSONObject.optString(f10675cv, "");
            return c1781c;
        } catch (Exception e) {
            e.printStackTrace();
            new StringBuilder("parse campaign json exception: ").append(e.getLocalizedMessage());
            return c1781c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9080a(C1782d c1782d, C1781c c1781c, String str) {
        if (c1782d != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap<String, String> mapM9019a = c1782d.m9019a();
                if (mapM9019a != null) {
                    mapM9019a.entrySet().iterator();
                    for (Map.Entry<String, String> entry : mapM9019a.entrySet()) {
                        String key = entry.getKey();
                        str = str.replaceAll("\\{" + key + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> mapM8916z = c1781c.m8916z();
                if (mapM8916z != null) {
                    mapM8916z.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : mapM8916z.entrySet()) {
                        String key2 = entry2.getKey();
                        str = str.replaceAll("\\{" + key2 + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> mapM9020b = c1782d.m9020b();
                if (mapM9020b != null) {
                    for (Map.Entry<String, String> entry3 : mapM9020b.entrySet()) {
                        String key3 = entry3.getKey();
                        str = str.replaceAll("\\{" + key3 + "\\}", entry3.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(c1782d.m9023e(), "utf-8"));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), "=");
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m9081a() {
        return this.f10696q;
    }

    /* JADX INFO: renamed from: a */
    private void m9082a(int i) {
        this.f10682b = i;
    }

    /* JADX INFO: renamed from: a */
    private void m9083a(C1779a c1779a) {
        this.f10684d = c1779a;
    }

    /* JADX INFO: renamed from: a */
    private void m9084a(String str) {
        this.f10688h = str;
    }

    /* JADX INFO: renamed from: a */
    private void m9085a(Map<String, String> map) {
        this.f10696q = map;
    }

    /* JADX INFO: renamed from: a */
    private void m9086a(boolean z) {
        this.f10692m = z;
    }

    /* JADX INFO: renamed from: b */
    public static C1781c m9087b(JSONObject jSONObject, C1781c c1781c) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((C1786h) c1781c).f10692m = jSONObject.optBoolean(f10676cw);
            ((C1786h) c1781c).f10693n = jSONObject.optInt(f10677cx, 604800);
            ((C1786h) c1781c).f10698s = jSONObject.optString(f10651cA);
            ((C1786h) c1781c).f10699t = jSONObject.optInt("ttc_type", 3);
            ((C1786h) c1781c).f10700u = jSONObject.optInt(f10653cC, 1800);
            ((C1786h) c1781c).f10694o = jSONObject.optString(f10657cG);
            ((C1786h) c1781c).f10695p = jSONObject.optInt(f10658cH);
            try {
                if (jSONObject.has(f10664cN)) {
                    String strOptString = jSONObject.optString(f10664cN);
                    if (!TextUtils.isEmpty(strOptString)) {
                        ((C1786h) c1781c).f10697r = strOptString;
                        ((C1786h) c1781c).f10696q = m9102h(strOptString);
                    }
                }
            } catch (Exception unused) {
            }
            String strOptString2 = jSONObject.optString(f10654cD);
            if (!TextUtils.isEmpty(strOptString2)) {
                ((C1786h) c1781c).f10689i = strOptString2;
                String strOptString3 = jSONObject.optString(f10655cE);
                if (!TextUtils.isEmpty(strOptString3)) {
                    ((C1786h) c1781c).f10690j = C1876j.m9688b(strOptString3);
                }
                ((C1786h) c1781c).f10691k = jSONObject.optString(f10656cF);
            }
            c1781c.m8871e(jSONObject.optString("cam_html"));
            c1781c.m8860b(jSONObject.optString("cam_html"));
            ((C1786h) c1781c).f10681a = jSONObject.optInt(f10669cp, 0);
            ((C1786h) c1781c).f10682b = jSONObject.optInt(f10670cq, 0);
            ((C1786h) c1781c).f10684d = C1779a.m8588a(jSONObject.optString(f10671cr));
            ((C1786h) c1781c).f10686f = jSONObject.optInt(f10673ct, 0);
            ((C1786h) c1781c).f10685e = jSONObject.optInt(f10672cs, 0);
            ((C1786h) c1781c).f10687g = jSONObject.optInt(f10674cu, 0);
            ((C1786h) c1781c).f10688h = jSONObject.optString(f10675cv, "");
            return c1781c;
        } catch (Exception e) {
            e.printStackTrace();
            new StringBuilder("parse campaign json exception: ").append(e.getLocalizedMessage());
            return c1781c;
        }
    }

    /* JADX INFO: renamed from: b */
    private String m9088b() {
        return this.f10697r;
    }

    /* JADX INFO: renamed from: b */
    private void m9089b(int i) {
        this.f10681a = i;
    }

    /* JADX INFO: renamed from: b */
    private void m9090b(String str) {
        this.f10689i = str;
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m9091c(JSONObject jSONObject, C1781c c1781c) throws JSONException {
        if (c1781c == null) {
            return jSONObject;
        }
        jSONObject.put(f10676cw, ((C1786h) c1781c).f10692m);
        jSONObject.put(f10677cx, ((C1786h) c1781c).f10693n);
        jSONObject.put(f10651cA, ((C1786h) c1781c).f10698s);
        jSONObject.put("ttc_type", ((C1786h) c1781c).f10699t);
        jSONObject.put(f10653cC, ((C1786h) c1781c).f10700u);
        jSONObject.put(f10654cD, ((C1786h) c1781c).f10689i);
        jSONObject.put(f10655cE, C1876j.m9686a(((C1786h) c1781c).f10690j));
        jSONObject.put(f10656cF, ((C1786h) c1781c).f10691k);
        jSONObject.put(f10669cp, ((C1786h) c1781c).f10681a);
        jSONObject.put(f10670cq, ((C1786h) c1781c).f10682b);
        C1779a c1779a = ((C1786h) c1781c).f10684d;
        if (c1779a != null) {
            jSONObject.put(f10671cr, c1779a.m8612g());
        }
        jSONObject.put(f10657cG, ((C1786h) c1781c).f10694o);
        jSONObject.put(f10658cH, ((C1786h) c1781c).f10695p);
        jSONObject.put(C1781c.f10288bc, c1781c.m8914x());
        jSONObject.put(f10673ct, ((C1786h) c1781c).f10686f);
        jSONObject.put(f10672cs, ((C1786h) c1781c).f10685e);
        jSONObject.put(f10674cu, ((C1786h) c1781c).f10687g);
        jSONObject.put(f10675cv, ((C1786h) c1781c).f10688h);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private void m9092c(int i) {
        this.f10685e = i;
    }

    /* JADX INFO: renamed from: c */
    private void m9093c(String str) {
        this.f10690j = str;
    }

    /* JADX INFO: renamed from: d */
    private void m9094d(int i) {
        this.f10686f = i;
    }

    /* JADX INFO: renamed from: d */
    private void m9095d(String str) {
        this.f10691k = str;
    }

    /* JADX INFO: renamed from: e */
    private void m9096e(int i) {
        this.f10687g = i;
    }

    /* JADX INFO: renamed from: e */
    private void m9097e(String str) {
        this.f10697r = str;
    }

    /* JADX INFO: renamed from: f */
    private void m9098f(int i) {
        this.f10695p = i;
    }

    /* JADX INFO: renamed from: f */
    private void m9099f(String str) {
        this.f10694o = str;
    }

    /* JADX INFO: renamed from: g */
    private void m9100g(int i) {
        this.f10700u = i;
    }

    /* JADX INFO: renamed from: g */
    private void m9101g(String str) {
        this.f10698s = str;
    }

    /* JADX INFO: renamed from: h */
    private static Map<String, String> m9102h(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                map.put("domain", jSONObject.getString("domain"));
                map.put("key", jSONObject.getString("key"));
                map.put("value", jSONObject.getString("value"));
            } catch (Throwable unused) {
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m9103h(int i) {
        this.f10699t = i;
    }

    /* JADX INFO: renamed from: i */
    private void m9104i(int i) {
        this.f10693n = i;
    }

    /* JADX INFO: renamed from: a */
    public void mo8821a(C1411c.b bVar) {
        this.f10701v = bVar;
    }

    /* JADX INFO: renamed from: aG */
    public final C1779a m9105aG() {
        return this.f10684d;
    }

    /* JADX INFO: renamed from: aH */
    public final int m9106aH() {
        return this.f10682b;
    }

    /* JADX INFO: renamed from: aI */
    public final int m9107aI() {
        return this.f10681a;
    }

    /* JADX INFO: renamed from: aJ */
    public final int m9108aJ() {
        return this.f10685e;
    }

    /* JADX INFO: renamed from: aK */
    public final int m9109aK() {
        return this.f10686f;
    }

    /* JADX INFO: renamed from: aL */
    public final int m9110aL() {
        return this.f10687g;
    }

    /* JADX INFO: renamed from: aM */
    public final String m9111aM() {
        return this.f10688h;
    }

    /* JADX INFO: renamed from: aN */
    public final String m9112aN() {
        return this.f10689i;
    }

    /* JADX INFO: renamed from: aO */
    public final String m9113aO() {
        return this.f10690j;
    }

    @Deprecated
    /* JADX INFO: renamed from: aP */
    public final String m9114aP() {
        return this.f10691k;
    }

    /* JADX INFO: renamed from: aQ */
    public final String m9115aQ() {
        return this.f10694o;
    }

    /* JADX INFO: renamed from: aR */
    public final int m9116aR() {
        return this.f10695p;
    }

    /* JADX INFO: renamed from: aS */
    public final int m9117aS() {
        return this.f10700u;
    }

    /* JADX INFO: renamed from: aT */
    public final int m9118aT() {
        return this.f10699t;
    }

    /* JADX INFO: renamed from: aU */
    public final String m9119aU() {
        return this.f10698s;
    }

    /* JADX INFO: renamed from: aV */
    public final int m9120aV() {
        return this.f10693n;
    }

    /* JADX INFO: renamed from: aW */
    public final boolean m9121aW() {
        return this.f10692m;
    }

    /* JADX INFO: renamed from: aj */
    public C1411c.b mo8841aj() {
        return this.f10701v;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9122b(C1781c c1781c) {
        boolean z = this.f10681a == 1 && c1781c.m8809Q() == 3 && ((C1786h) c1781c).f10682b != 1;
        if (!z) {
            return z;
        }
        try {
            return C1886t.m9827a(C1175n.m2059a().m2148f(), m10147ba()) ? false : z;
        } catch (Throwable th) {
            th.getMessage();
            return z;
        }
    }

    /* JADX INFO: renamed from: u */
    public final String m9123u(String str) {
        Map<String, String> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f10696q) == null || map.size() <= 0) {
                return str;
            }
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            String str2 = map.get("domain");
            if (TextUtils.isEmpty(host) || !host.contains(str2)) {
                return str;
            }
            String str3 = map.get("key");
            String str4 = map.get("value");
            if (!str.contains(str3) && TextUtils.isEmpty(uri.getQueryParameter(str3)) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                return str + "&" + str3 + "=" + str4;
            }
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return str;
            }
            return str.replace(str3 + "=" + (TextUtils.isEmpty(uri.getQueryParameter(str3)) ? "" : uri.getQueryParameter(str3)), str3 + "=" + str4);
        } catch (Throwable unused) {
            return str;
        }
    }
}
