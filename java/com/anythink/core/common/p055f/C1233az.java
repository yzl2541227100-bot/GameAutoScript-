package com.anythink.core.common.p055f;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.az */
/* JADX INFO: loaded from: classes.dex */
public final class C1233az {

    /* JADX INFO: renamed from: e */
    public static final String f4036e = "reqId";

    /* JADX INFO: renamed from: f */
    public static final String f4037f = "reqDatetime";

    /* JADX INFO: renamed from: g */
    public static final String f4038g = "fillOffers";

    /* JADX INFO: renamed from: h */
    public static final String f4039h = "bidResps";

    /* JADX INFO: renamed from: i */
    public static final String f4040i = "adSourceId";

    /* JADX INFO: renamed from: j */
    public static final String f4041j = "price";

    /* JADX INFO: renamed from: k */
    public static final String f4042k = "networkFirmId";

    /* JADX INFO: renamed from: l */
    public static final String f4043l = "demandType";

    /* JADX INFO: renamed from: m */
    public static final String f4044m = "tp_bid_id";

    /* JADX INFO: renamed from: a */
    public String f4045a;

    /* JADX INFO: renamed from: b */
    public long f4046b;

    /* JADX INFO: renamed from: c */
    public List<a> f4047c = new ArrayList(3);

    /* JADX INFO: renamed from: d */
    public List<a> f4048d = new ArrayList(3);

    /* JADX INFO: renamed from: com.anythink.core.common.f.az$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f4050a;

        /* JADX INFO: renamed from: b */
        public String f4051b;

        /* JADX INFO: renamed from: c */
        public int f4052c;

        /* JADX INFO: renamed from: d */
        public double f4053d;

        /* JADX INFO: renamed from: e */
        public String f4054e;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(com.anythink.core.common.p055f.C1229av r6, com.anythink.core.common.p055f.C1252q r7) {
            /*
                r5 = this;
                r5.<init>()
                java.lang.String r0 = r6.m2842u()
                r5.f4051b = r0
                if (r7 == 0) goto L10
                double r0 = r7.getPrice()
                goto L14
            L10:
                double r0 = r6.m2850y()
            L14:
                r5.f4053d = r0
                int r0 = r6.m2784d()
                r5.f4052c = r0
                int r0 = r6.m2826m()
                r1 = 1
                r2 = 2
                if (r0 == 0) goto L3f
                if (r0 == r1) goto L3c
                r3 = 3
                if (r0 == r2) goto L39
                r4 = 4
                if (r0 == r3) goto L36
                if (r0 == r4) goto L3c
                r3 = 7
                if (r0 == r3) goto L3c
                r3 = 8
                if (r0 == r3) goto L3f
                goto L41
            L36:
                r5.f4050a = r4
                goto L41
            L39:
                r5.f4050a = r3
                goto L41
            L3c:
                r5.f4050a = r2
                goto L41
            L3f:
                r5.f4050a = r1
            L41:
                r0 = 35
                int r6 = r6.m2784d()
                if (r0 != r6) goto L4b
                r5.f4050a = r2
            L4b:
                if (r7 == 0) goto L50
                java.lang.String r6 = r7.f4438g
                goto L52
            L50:
                java.lang.String r6 = ""
            L52:
                r5.f4054e = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p055f.C1233az.a.<init>(com.anythink.core.common.f.av, com.anythink.core.common.f.q):void");
        }

        /* JADX INFO: renamed from: a */
        public final synchronized JSONObject m2887a() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C1233az.f4040i, this.f4051b);
                jSONObject.put("price", this.f4053d);
                jSONObject.put("networkFirmId", this.f4052c);
                jSONObject.put(C1233az.f4043l, this.f4050a);
                jSONObject.put(C1233az.f4044m, this.f4054e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1233az m2871a(String str) {
        C1233az c1233az = new C1233az();
        try {
            JSONObject jSONObject = new JSONObject(str);
            c1233az.m2885b(jSONObject.getString("reqId"));
            c1233az.m2881a(jSONObject.getLong(f4037f));
            c1233az.m2872a(c1233az.m2876c(jSONObject.getString(f4038g)));
            c1233az.m2874b(c1233az.m2876c(jSONObject.getString(f4039h)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return c1233az;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2872a(List<a> list) {
        this.f4047c = list;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2873a(List<a> list, a aVar) {
        if (aVar != null) {
            if (list.size() == 0) {
                list.add(aVar);
                return;
            }
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    i = -1;
                    break;
                } else if (aVar.f4053d > list.get(i).f4053d) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                list.add(i, aVar);
                return;
            }
            list.add(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m2874b(List<a> list) {
        this.f4048d = list;
    }

    /* JADX INFO: renamed from: c */
    private synchronized long m2875c() {
        return this.f4046b;
    }

    /* JADX INFO: renamed from: c */
    private synchronized List<a> m2876c(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    a aVar = new a();
                    JSONObject jSONObject = new JSONObject(jSONArray.optString(i));
                    aVar.f4051b = jSONObject.getString(f4040i);
                    aVar.f4053d = jSONObject.getDouble("price");
                    aVar.f4052c = jSONObject.getInt("networkFirmId");
                    aVar.f4050a = jSONObject.getInt(f4043l);
                    if (jSONObject.has(f4044m)) {
                        aVar.f4054e = jSONObject.getString(f4044m);
                    }
                    arrayList.add(aVar);
                }
                Collections.sort(arrayList, new Comparator<a>() { // from class: com.anythink.core.common.f.az.1
                    /* JADX INFO: renamed from: a */
                    private static int m2886a(a aVar2, a aVar3) {
                        double d = aVar2.f4053d;
                        double d2 = aVar3.f4053d;
                        if (d > d2) {
                            return -1;
                        }
                        return d == d2 ? 0 : 1;
                    }

                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(a aVar2, a aVar3) {
                        double d = aVar2.f4053d;
                        double d2 = aVar3.f4053d;
                        if (d > d2) {
                            return -1;
                        }
                        return d == d2 ? 0 : 1;
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private synchronized JSONArray m2877c(List<a> list) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().m2887a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    private synchronized JSONArray m2878d() {
        return m2877c(this.f4047c);
    }

    /* JADX INFO: renamed from: e */
    private synchronized JSONArray m2879e() {
        return m2877c(this.f4048d);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized JSONObject m2880a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("reqId", this.f4045a);
            jSONObject.put(f4037f, this.f4046b);
            jSONObject.put(f4038g, m2878d());
            jSONObject.put(f4039h, m2879e());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2881a(long j) {
        this.f4046b = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2882a(a aVar) {
        m2873a(this.f4047c, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m2883b() {
        return this.f4045a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2884b(a aVar) {
        m2873a(this.f4048d, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2885b(String str) {
        this.f4045a = str;
    }
}
