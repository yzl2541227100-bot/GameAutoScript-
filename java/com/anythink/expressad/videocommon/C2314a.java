package com.anythink.expressad.videocommon;

import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2314a {

    /* JADX INFO: renamed from: a */
    private static final String f14349a = "TemplateWebviewCache";

    /* JADX INFO: renamed from: b */
    private static ConcurrentHashMap<String, a> f14350b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private static ConcurrentHashMap<String, a> f14351c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    private static ConcurrentHashMap<String, a> f14352d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    private static ConcurrentHashMap<String, a> f14353e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    private static ConcurrentHashMap<String, a> f14354f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private static ConcurrentHashMap<String, a> f14355g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    private static ConcurrentHashMap<String, a> f14356h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i */
    private static ConcurrentHashMap<String, a> f14357i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    private static ConcurrentHashMap<String, a> f14358j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    private static ConcurrentHashMap<String, a> f14359k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private WindVaneWebView f14360a;

        /* JADX INFO: renamed from: b */
        private boolean f14361b;

        /* JADX INFO: renamed from: a */
        public final WindVaneWebView m11758a() {
            return this.f14360a;
        }

        /* JADX INFO: renamed from: a */
        public final void m11759a(WindVaneWebView windVaneWebView) {
            this.f14360a = windVaneWebView;
        }

        /* JADX INFO: renamed from: a */
        public final void m11760a(String str) {
            WindVaneWebView windVaneWebView = this.f14360a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m11761a(boolean z) {
            this.f14361b = z;
        }

        /* JADX INFO: renamed from: b */
        public final String m11762b() {
            WindVaneWebView windVaneWebView = this.f14360a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        /* JADX INFO: renamed from: c */
        public final boolean m11763c() {
            return this.f14361b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m11739a(int i, C1781c c1781c) {
        if (c1781c == null) {
            return null;
        }
        try {
            String strM8832aa = c1781c.m8832aa();
            if (i != 94) {
                if (i != 287) {
                    ConcurrentHashMap<String, a> concurrentHashMap = f14350b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return f14350b.get(strM8832aa);
                    }
                } else if (c1781c.m8793A()) {
                    ConcurrentHashMap<String, a> concurrentHashMap2 = f14352d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return f14352d.get(strM8832aa);
                    }
                } else {
                    ConcurrentHashMap<String, a> concurrentHashMap3 = f14355g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f14355g.get(strM8832aa);
                    }
                }
            } else if (c1781c.m8793A()) {
                ConcurrentHashMap<String, a> concurrentHashMap4 = f14351c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return f14351c.get(strM8832aa);
                }
            } else {
                ConcurrentHashMap<String, a> concurrentHashMap5 = f14354f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f14354f.get(strM8832aa);
                }
            }
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static a m11740a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap;
        if (f14356h.containsKey(str)) {
            concurrentHashMap = f14356h;
        } else if (f14357i.containsKey(str)) {
            concurrentHashMap = f14357i;
        } else if (f14358j.containsKey(str)) {
            concurrentHashMap = f14358j;
        } else {
            if (!f14359k.containsKey(str)) {
                return null;
            }
            concurrentHashMap = f14359k;
        }
        return concurrentHashMap.get(str);
    }

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, a> m11741a(int i, boolean z) {
        return i != 94 ? i != 287 ? f14350b : z ? f14352d : f14355g : z ? f14351c : f14354f;
    }

    /* JADX INFO: renamed from: a */
    public static void m11742a() {
        f14356h.clear();
        f14357i.clear();
    }

    /* JADX INFO: renamed from: a */
    public static void m11743a(int i) {
        try {
            if (i == 94) {
                ConcurrentHashMap<String, a> concurrentHashMap = f14351c;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
            } else {
                if (i != 287) {
                    return;
                }
                ConcurrentHashMap<String, a> concurrentHashMap2 = f14352d;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                }
            }
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11744a(int i, String str, a aVar) {
        try {
            if (i == 94) {
                if (f14351c == null) {
                    f14351c = new ConcurrentHashMap<>();
                }
                f14351c.put(str, aVar);
            } else {
                if (i != 287) {
                    return;
                }
                if (f14352d == null) {
                    f14352d = new ConcurrentHashMap<>();
                }
                f14352d.put(str, aVar);
            }
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11745a(String str, a aVar, boolean z, boolean z3) {
        (z ? z3 ? f14357i : f14356h : z3 ? f14359k : f14358j).put(str, aVar);
    }

    /* JADX INFO: renamed from: a */
    private static void m11746a(String str, boolean z, boolean z3) {
        if (z) {
            if (z3) {
                for (Map.Entry<String, a> entry : f14357i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        f14357i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, a> entry2 : f14356h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    f14356h.remove(entry2.getKey());
                }
            }
            return;
        }
        if (z3) {
            for (Map.Entry<String, a> entry3 : f14359k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    f14359k.remove(entry3.getKey());
                }
            }
            return;
        }
        for (Map.Entry<String, a> entry4 : f14358j.entrySet()) {
            if (entry4.getKey().startsWith(str)) {
                f14358j.remove(entry4.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11747b() {
        f14358j.clear();
        f14359k.clear();
    }

    /* JADX INFO: renamed from: b */
    public static void m11748b(int i) {
        try {
            if (i == 94) {
                ConcurrentHashMap<String, a> concurrentHashMap = f14354f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            if (i != 287) {
                ConcurrentHashMap<String, a> concurrentHashMap2 = f14350b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, a> concurrentHashMap3 = f14355g;
            if (concurrentHashMap3 != null) {
                concurrentHashMap3.clear();
            }
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11749b(int i, C1781c c1781c) {
        if (c1781c == null) {
            return;
        }
        try {
            String strM8832aa = c1781c.m8832aa();
            if (i == 94) {
                if (c1781c.m8793A()) {
                    ConcurrentHashMap<String, a> concurrentHashMap = f14351c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(strM8832aa);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, a> concurrentHashMap2 = f14354f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(strM8832aa);
                    return;
                }
                return;
            }
            if (i != 287) {
                ConcurrentHashMap<String, a> concurrentHashMap3 = f14350b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(strM8832aa);
                    return;
                }
                return;
            }
            if (c1781c.m8793A()) {
                ConcurrentHashMap<String, a> concurrentHashMap4 = f14352d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(strM8832aa);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, a> concurrentHashMap5 = f14355g;
            if (concurrentHashMap5 != null) {
                concurrentHashMap5.remove(strM8832aa);
            }
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11750b(int i, String str, a aVar) {
        try {
            if (i == 94) {
                if (f14354f == null) {
                    f14354f = new ConcurrentHashMap<>();
                }
                f14354f.put(str, aVar);
            } else if (i != 287) {
                if (f14350b == null) {
                    f14350b = new ConcurrentHashMap<>();
                }
                f14350b.put(str, aVar);
            } else {
                if (f14355g == null) {
                    f14355g = new ConcurrentHashMap<>();
                }
                f14355g.put(str, aVar);
            }
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11751b(String str) {
        if (f14356h.containsKey(str)) {
            f14356h.remove(str);
        }
        if (f14358j.containsKey(str)) {
            f14358j.remove(str);
        }
        if (f14357i.containsKey(str)) {
            f14357i.remove(str);
        }
        if (f14359k.containsKey(str)) {
            f14359k.remove(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m11752c() {
        f14356h.clear();
    }

    /* JADX INFO: renamed from: c */
    public static void m11753c(String str) {
        if (TextUtils.isEmpty(str)) {
            f14356h.clear();
        } else {
            for (String str2 : f14356h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f14356h.remove(str2);
                }
            }
        }
        f14357i.clear();
    }

    /* JADX INFO: renamed from: d */
    public static void m11754d(String str) {
        for (Map.Entry<String, a> entry : f14356h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f14356h.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11755e(String str) {
        for (Map.Entry<String, a> entry : f14357i.entrySet()) {
            if (entry.getKey().contains(str)) {
                f14357i.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m11756f(String str) {
        for (Map.Entry<String, a> entry : f14358j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f14358j.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m11757g(String str) {
        for (Map.Entry<String, a> entry : f14359k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f14359k.remove(entry.getKey());
            }
        }
    }
}
