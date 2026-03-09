package com.anythink.expressad.foundation.p120g.p121a;

import android.text.TextUtils;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p125e.C1822a;
import com.anythink.expressad.foundation.p138h.C1889w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C1807f {

    /* JADX INFO: renamed from: a */
    public static final String f11177a = "native";

    /* JADX INFO: renamed from: b */
    public static final String f11178b = "reward";

    /* JADX INFO: renamed from: c */
    public static final String f11179c = "interactive";

    /* JADX INFO: renamed from: d */
    public static final String f11180d = "interstitial";

    /* JADX INFO: renamed from: e */
    public static final String f11181e = "banner";

    /* JADX INFO: renamed from: f */
    public static final String f11182f = "splash";

    /* JADX INFO: renamed from: g */
    public static final String f11183g = "h5_native";

    /* JADX INFO: renamed from: h */
    public static Map<String, Long> f11184h = new HashMap();

    /* JADX INFO: renamed from: i */
    public static Map<String, List<C1822a>> f11185i = new HashMap();

    /* JADX INFO: renamed from: j */
    public static Map<String, List<C1822a>> f11186j = new HashMap();

    /* JADX INFO: renamed from: k */
    public static Map<String, List<C1822a>> f11187k = new HashMap();

    /* JADX INFO: renamed from: l */
    public static Map<String, List<C1822a>> f11188l = new HashMap();

    /* JADX INFO: renamed from: m */
    public static Map<String, List<C1822a>> f11189m = new HashMap();

    /* JADX INFO: renamed from: n */
    public static Map<String, List<C1822a>> f11190n = new HashMap();

    /* JADX INFO: renamed from: o */
    public static Map<String, List<C1822a>> f11191o = new HashMap();

    /* JADX INFO: renamed from: p */
    public static Map<String, List<C1822a>> f11192p = new HashMap();

    /* JADX INFO: renamed from: q */
    private static final String f11193q = "f";

    /* JADX INFO: renamed from: a */
    private static String m9395a(String str, String str2) {
        Map<String, List<C1822a>> mapM9399b;
        List<C1822a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            mapM9399b = null;
            if (f11186j.containsKey(str)) {
                mapM9399b = f11186j;
            } else if (f11187k.containsKey(str)) {
                mapM9399b = f11187k;
            } else if (f11188l.containsKey(str)) {
                mapM9399b = f11188l;
            } else if (f11189m.containsKey(str)) {
                mapM9399b = f11189m;
            } else if (f11190n.containsKey(str)) {
                mapM9399b = f11190n;
            } else if (f11191o.containsKey(str)) {
                mapM9399b = f11191o;
            } else if (f11192p.containsKey(str)) {
                mapM9399b = f11192p;
            }
        } else {
            mapM9399b = m9399b(str2);
        }
        if (mapM9399b != null) {
            try {
                if (C1889w.m9868b(str) && mapM9399b.containsKey(str) && (list = mapM9399b.get(str)) != null && list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", list.get(i).m9481a());
                        jSONObject.put("rid", list.get(i).m9482b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, List<C1822a>> m9396a(String str) {
        if (f11186j.containsKey(str)) {
            return f11186j;
        }
        if (f11187k.containsKey(str)) {
            return f11187k;
        }
        if (f11188l.containsKey(str)) {
            return f11188l;
        }
        if (f11189m.containsKey(str)) {
            return f11189m;
        }
        if (f11190n.containsKey(str)) {
            return f11190n;
        }
        if (f11191o.containsKey(str)) {
            return f11191o;
        }
        if (f11192p.containsKey(str)) {
            return f11192p;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m9397a(String str, C1781c c1781c, String str2) {
        Map<String, List<C1822a>> mapM9399b = m9399b(str2);
        if (c1781c == null || mapM9399b == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(c1781c.m10146aZ())) {
                return;
            }
            C1822a c1822a = new C1822a(c1781c.m10146aZ(), c1781c.m8818Z());
            if (!mapM9399b.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1822a);
                mapM9399b.put(str, arrayList);
                return;
            }
            List<C1822a> list = mapM9399b.get(str);
            if (list != null && list.size() == 20) {
                list.remove(0);
            }
            if (list != null) {
                list.add(c1822a);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m9398a(Map... mapArr) {
        try {
            for (Map map : mapArr) {
                if (map != null) {
                    map.clear();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private static Map<String, List<C1822a>> m9399b(String str) {
        str.hashCode();
        switch (str) {
            case "banner":
                return f11190n;
            case "native":
                return f11186j;
            case "reward":
                return f11187k;
            case "splash":
                return f11191o;
            case "h5_native":
                return f11192p;
            case "interstitial":
                return f11189m;
            case "interactive":
                return f11188l;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m9400b(String str, C1781c c1781c, String str2) {
        Map<String, List<C1822a>> mapM9399b = m9399b(str2);
        if (c1781c == null || mapM9399b == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(c1781c.m10146aZ())) {
                return;
            }
            C1822a c1822a = new C1822a(c1781c.m10146aZ(), c1781c.m8818Z());
            if (!mapM9399b.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1822a);
                mapM9399b.put(str, arrayList);
            } else {
                List<C1822a> list = mapM9399b.get(str);
                if (list != null) {
                    list.add(c1822a);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
