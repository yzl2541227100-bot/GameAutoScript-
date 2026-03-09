package com.anythink.core.p047c;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1136a {

    /* JADX INFO: renamed from: e */
    private static volatile C1136a f2822e;

    /* JADX INFO: renamed from: a */
    public final String f2823a = C1136a.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private final String f2824b = "sv_request_id";

    /* JADX INFO: renamed from: c */
    private final String f2825c = "sv_price";

    /* JADX INFO: renamed from: d */
    private Map<String, LinkedList<a>> f2826d = new HashMap();

    /* JADX INFO: renamed from: com.anythink.core.c.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2827a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinkedList f2828b;

        public AnonymousClass1(String str, LinkedList linkedList) {
            this.f2827a = str;
            this.f2828b = linkedList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String string;
            if (TextUtils.isEmpty(this.f2827a) || this.f2828b == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (a aVar : this.f2828b) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sv_request_id", aVar.f2830a);
                    jSONObject.put("sv_price", aVar.f2831b);
                    jSONArray.put(jSONObject);
                }
                string = jSONArray.toString();
            } catch (Throwable unused) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3048M, this.f2827a, string);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.c.a$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public String f2830a;

        /* JADX INFO: renamed from: b */
        public double f2831b;

        public a(String str, double d) {
            this.f2830a = str;
            this.f2831b = d;
        }
    }

    private C1136a() {
    }

    /* JADX INFO: renamed from: a */
    private double m1805a(String str, int i) {
        LinkedList<a> linkedListM1807a = m1807a(str);
        StringBuilder sb = new StringBuilder("getAverageImpPrice valueList:");
        sb.append(linkedListM1807a == null ? "null" : linkedListM1807a.toString());
        sb.append(",proverCount:");
        sb.append(i);
        if (linkedListM1807a == null || linkedListM1807a.size() == 0 || i == 0) {
            return -1.0d;
        }
        double d = 0.0d;
        List<a> listSubList = linkedListM1807a.subList(0, Math.min(i, linkedListM1807a.size()));
        Iterator<a> it = listSubList.iterator();
        while (it.hasNext()) {
            d += it.next().f2831b;
        }
        return d / ((double) listSubList.size());
    }

    /* JADX INFO: renamed from: a */
    public static C1136a m1806a() {
        if (f2822e == null) {
            synchronized (C1141b.class) {
                if (f2822e == null) {
                    f2822e = new C1136a();
                }
            }
        }
        return f2822e;
    }

    /* JADX INFO: renamed from: a */
    private synchronized LinkedList<a> m1807a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedList<a> linkedListM1810b = this.f2826d.get(str);
        if (linkedListM1810b == null) {
            linkedListM1810b = m1810b(str);
            if (linkedListM1810b == null) {
                linkedListM1810b = new LinkedList<>();
            }
            this.f2826d.put(str, linkedListM1810b);
        }
        return linkedListM1810b;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m1808a(String str, String str2, double d, int i) {
        LinkedList<a> linkedListM1807a = m1807a(str);
        StringBuilder sb = new StringBuilder("putProverPriceInfo before list:");
        sb.append(linkedListM1807a == null ? "null" : linkedListM1807a.toString());
        sb.append(",cur impPrice:");
        sb.append(d);
        sb.append(",maxRecordListSize:");
        sb.append(i);
        if (linkedListM1807a == null) {
            return;
        }
        if (i == 0) {
            linkedListM1807a.clear();
        } else {
            if (linkedListM1807a.size() >= i - 1) {
                int size = (linkedListM1807a.size() - i) + 1;
                for (int i2 = 0; i2 < size; i2++) {
                    linkedListM1807a.removeLast();
                }
            }
            if (linkedListM1807a.size() < i) {
                linkedListM1807a.addFirst(new a(str2, d));
            }
        }
        new StringBuilder("putProverPriceInfo after list:").append(linkedListM1807a.toString());
        C1335b.m3998a().m4005a(new AnonymousClass1(str, linkedListM1807a));
    }

    /* JADX INFO: renamed from: a */
    private void m1809a(String str, LinkedList<a> linkedList) {
        C1335b.m3998a().m4005a(new AnonymousClass1(str, linkedList));
    }

    /* JADX INFO: renamed from: b */
    private LinkedList<a> m1810b(String str) {
        try {
            String strM4239b = C1355s.m4239b(C1175n.m2059a().m2148f(), C1169h.f3048M, str, "");
            if (TextUtils.isEmpty(strM4239b)) {
                return null;
            }
            LinkedList<a> linkedList = new LinkedList<>();
            try {
                JSONArray jSONArray = new JSONArray(strM4239b);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        linkedList.add(new a(jSONObjectOptJSONObject.optString("sv_request_id"), jSONObjectOptJSONObject.optDouble("sv_price", 0.0d)));
                    }
                }
            } catch (Throwable unused) {
            }
            return linkedList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private String m1811c(String str) {
        LinkedList<a> linkedListM1807a = m1807a(str);
        if (linkedListM1807a.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (a aVar : linkedListM1807a) {
                    jSONObject.put(aVar.f2830a, aVar.f2831b);
                }
                return jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final void m1812a(C1243h c1243h, C1229av c1229av) {
        C1396f c1396fM5146b;
        if (c1243h == null || c1229av == null || (c1396fM5146b = C1398h.m5135a(C1175n.m2059a().m2148f()).m5146b(c1243h.m2677ah())) == null || c1229av.m2762ao() != 1) {
            return;
        }
        double d = -1.0d;
        try {
            if (c1229av.m2784d() == 2) {
                Map<String, Object> mapM3083f = c1243h.m3083f();
                new StringBuilder("generateImpPrice step1：extInfoMap:").append(mapM3083f == null ? "null" : mapM3083f.toString());
                if (mapM3083f == null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c1229av.m2784d());
                        String string = sb.toString();
                        String strM2842u = c1229av.m2842u();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c1229av.m2754ag());
                        C1322e.m3884a(c1243h, c1396fM5146b, string, strM2842u, sb2.toString(), m1805a(c1229av.m2842u(), c1396fM5146b.m5117k()) > 0.0d ? 2 : 1);
                    } catch (Throwable unused) {
                        return;
                    }
                }
                if (mapM3083f != null && mapM3083f.containsKey("value_micros")) {
                    d = Double.parseDouble(mapM3083f.get("value_micros").toString()) / 1000.0d;
                }
            }
            if (d > 0.0d) {
                c1229av.m2790e(d);
                m1808a(c1229av.m2842u(), c1243h.m2678ai(), d, c1396fM5146b.m5117k());
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1813a(C1243h c1243h, List<C1229av> list, C1396f c1396f) {
        ListIterator<C1229av> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C1229av next = listIterator.next();
            if (next.m2762ao() == 1) {
                int iM5117k = c1396f.m5117k();
                double dM1805a = m1805a(next.m2842u(), iM5117k);
                StringBuilder sb = new StringBuilder("syncProverbPrice adSourceId:");
                sb.append(next.m2842u());
                sb.append(",calPreverbCacheNum:");
                sb.append(iM5117k);
                sb.append(",averageValue:");
                sb.append(dM1805a);
                if (dM1805a > 0.0d) {
                    next.m2764aq();
                    next.m2734a(dM1805a);
                    next.m2785d(dM1805a);
                    next.m2775b(c1243h.m3115o() * dM1805a);
                    next.m2813i("estimated");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(next.m2784d());
                    C1322e.m3885a(c1243h, c1396f, sb2.toString(), next.m2842u(), String.valueOf(dM1805a), String.valueOf(iM5117k), m1811c(next.m2842u()));
                }
            }
        }
    }
}
