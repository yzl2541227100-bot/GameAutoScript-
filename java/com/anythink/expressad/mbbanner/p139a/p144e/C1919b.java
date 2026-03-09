package com.anythink.expressad.mbbanner.p139a.p144e;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p120g.p125e.C1822a;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C1919b {

    /* JADX INFO: renamed from: a */
    private static final String f11860a = "b";

    /* JADX INFO: renamed from: a */
    public static C1781c m10066a(String str, C1781c c1781c) {
        if (TextUtils.isEmpty(str)) {
            return c1781c;
        }
        if (TextUtils.isEmpty(str) && c1781c == null) {
            return null;
        }
        if (str.contains("notice")) {
            try {
                JSONObject jSONObjectM8671a = C1781c.m8671a(c1781c);
                JSONObject jSONObject = new JSONObject(str);
                try {
                    if (!jSONObject.has(C1781c.f10196O)) {
                        jSONObjectM8671a.put(C1781c.f10196O, "");
                    }
                } catch (Exception unused) {
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectM8671a.put(next, jSONObject.getString(next));
                }
                C1781c c1781cM8703b = C1781c.m8703b(jSONObjectM8671a);
                String strOptString = jSONObjectM8671a.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    c1781cM8703b.m8891l(strOptString);
                }
                return c1781cM8703b;
            } catch (JSONException e) {
                e.printStackTrace();
                return c1781c;
            }
        }
        try {
            JSONObject jSONObjectM8671a2 = C1781c.m8671a(c1781c);
            C1781c c1781cM8703b2 = C1781c.m8703b(jSONObjectM8671a2);
            if (c1781cM8703b2 == null) {
                c1781cM8703b2 = c1781c;
            }
            if (!TextUtils.isEmpty(str)) {
                String strOptString2 = jSONObjectM8671a2.optString("unitId");
                if (!TextUtils.isEmpty(strOptString2)) {
                    c1781cM8703b2.m8891l(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(C1801a.f11116ce);
                if (jSONObjectOptJSONObject != null) {
                    String.valueOf(C1886t.m9834b(C1175n.m2059a().m2148f(), Integer.valueOf(jSONObjectOptJSONObject.getString(C1801a.f11114cc)).intValue()));
                    String.valueOf(C1886t.m9834b(C1175n.m2059a().m2148f(), Integer.valueOf(jSONObjectOptJSONObject.getString(C1801a.f11115cd)).intValue()));
                }
                c1781cM8703b2.m8902p(c1781cM8703b2.m8835ad());
                String strM8839ah = c1781cM8703b2.m8839ah();
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    StringBuilder sb = new StringBuilder();
                    while (itKeys2.hasNext()) {
                        sb.append("&");
                        String next2 = itKeys2.next();
                        String strOptString3 = jSONObjectOptJSONObject.optString(next2);
                        if (C1801a.f11114cc.equals(next2) || C1801a.f11115cd.equals(next2)) {
                            strOptString3 = String.valueOf(C1886t.m9834b(C1175n.m2059a().m2148f(), Integer.valueOf(strOptString3).intValue()));
                        }
                        sb.append(next2);
                        sb.append("=");
                        sb.append(strOptString3);
                    }
                    c1781cM8703b2.m8904q(strM8839ah + ((Object) sb));
                }
            }
            return c1781cM8703b2;
        } catch (Throwable unused2) {
            return c1781c;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m10067a(String str) {
        List<C1822a> list;
        try {
            Map<String, List<C1822a>> map = C1807f.f11185i;
            if (map == null || !C1889w.m9868b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                C1822a c1822a = list.get(i);
                jSONObject.put("cid", c1822a.m9481a());
                jSONObject.put("crid", c1822a.m9483c());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized List<C1822a> m10068a(List<C1822a> list, List<C1781c> list2) {
        if (list2 != null) {
            if (list2.size() > 0) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                for (C1781c c1781c : list2) {
                    if (c1781c != null) {
                        C1822a c1822a = new C1822a(c1781c.m10146aZ(), c1781c.m8905r());
                        if (list.size() >= 20) {
                            list.remove(0);
                        }
                        list.add(c1822a);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    public static void m10069a() {
    }

    /* JADX INFO: renamed from: a */
    private static void m10070a(String str, List<C1781c> list) {
        Map<String, List<C1822a>> map = C1807f.f11185i;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (C1889w.m9868b(str)) {
            map.put(str, m10068a(map.containsKey(str) ? map.get(str) : new ArrayList<>(), list));
        }
        C1807f.f11185i = map;
    }

    /* JADX INFO: renamed from: b */
    private static String m10071b() {
        return "";
    }

    /* JADX INFO: renamed from: c */
    private static String m10072c() {
        return "";
    }
}
