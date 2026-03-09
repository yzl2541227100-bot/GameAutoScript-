package com.anythink.core.p047c.p049b;

import android.text.TextUtils;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1237bc;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p047c.p048a.C1137a;
import com.anythink.core.p047c.p048a.C1138b;
import com.anythink.core.p047c.p048a.C1139c;
import com.anythink.core.p047c.p048a.C1140d;
import com.anythink.core.p072d.C1394d;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.c.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1145d implements InterfaceC1143b {

    /* JADX INFO: renamed from: b */
    private static final String f2872b = "PlacementStatisticRecord";

    /* JADX INFO: renamed from: a */
    public C1142a f2873a;

    /* JADX INFO: renamed from: c */
    private final C1398h f2874c = C1398h.m5135a(C1175n.m2059a().m2148f());

    /* JADX INFO: renamed from: d */
    private final C1146e f2875d;

    /* JADX INFO: renamed from: e */
    private final C1147f f2876e;

    /* JADX INFO: renamed from: f */
    private final ConcurrentHashMap<String, C1138b> f2877f;

    /* JADX INFO: renamed from: g */
    private final ConcurrentHashMap<String, Boolean> f2878g;

    public C1145d() {
        C1146e c1146eM1896c = C1146e.m1896c();
        this.f2875d = c1146eM1896c;
        this.f2876e = new C1147f(c1146eM1896c);
        this.f2877f = new ConcurrentHashMap<>();
        this.f2878g = new ConcurrentHashMap<>();
        this.f2873a = new C1142a(c1146eM1896c);
    }

    /* JADX INFO: renamed from: a */
    private double m1880a(String str, JSONArray jSONArray) {
        C1138b c1138bM1891c = m1891c(str);
        if (!c1138bM1891c.m1847e()) {
            c1138bM1891c.m1849g();
            return c1138bM1891c.m1849g();
        }
        if (jSONArray == null) {
            return -1.0d;
        }
        try {
            if (jSONArray.length() > 0) {
                return jSONArray.getJSONObject(0).getDouble(C1294j.f4841F);
            }
            return -1.0d;
        } catch (Exception e) {
            e.getMessage();
            return -1.0d;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1882a(C1137a c1137a) {
        c1137a.toString();
        String strM1834j = c1137a.m1834j();
        C1138b c1138bM1891c = m1891c(strM1834j);
        C1146e c1146e = this.f2875d;
        if (c1146e != null) {
            c1146e.m1899a(c1137a);
        }
        if (c1137a.m1835k() == 4) {
            m1883a(strM1834j, c1138bM1891c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1883a(java.lang.String r11, com.anythink.core.p047c.p048a.C1138b r12) {
        /*
            r10 = this;
            if (r12 != 0) goto L3
            return
        L3:
            double[][] r0 = r12.m1848f()
            if (r0 == 0) goto L56
            boolean r1 = r12.m1847e()
            if (r1 == 0) goto L13
            r10.m1893e(r11)
            return
        L13:
            double[] r12 = r10.m1890b(r11, r12)
            r1 = 0
            r2 = r12[r1]
            r4 = 1
            r5 = r12[r4]
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 != 0) goto L22
            return
        L22:
            r12 = 0
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 <= 0) goto L2e
            double[] r2 = m1884a(r0, r2)
            goto L2f
        L2e:
            r2 = r12
        L2f:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L37
            double[] r12 = m1884a(r0, r5)
        L37:
            if (r2 != 0) goto L3e
            if (r12 == 0) goto L3c
        L3b:
            r1 = 1
        L3c:
            r4 = r1
            goto L51
        L3e:
            if (r12 == 0) goto L51
            r5 = r2[r1]
            r7 = r12[r1]
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L3b
            r5 = r2[r4]
            r2 = r12[r4]
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            goto L3b
        L51:
            if (r4 == 0) goto L56
            r10.m1893e(r11)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p047c.p049b.C1145d.m1883a(java.lang.String, com.anythink.core.c.a.b):void");
    }

    /* JADX INFO: renamed from: a */
    private static double[] m1884a(double[][] dArr, double d) {
        for (double[] dArr2 : dArr) {
            if (dArr2.length == 2) {
                double d2 = dArr2[0];
                double d3 = dArr2[1];
                if (d >= d2 && d <= d3) {
                    return dArr2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static C1137a m1885b(AbstractC1228au abstractC1228au, C1229av c1229av) {
        C1137a c1137a = new C1137a();
        if (abstractC1228au != null) {
            c1137a.m1819a(abstractC1228au.m2678ai());
            c1137a.m1829e(abstractC1228au.m2677ah());
            if (abstractC1228au instanceof C1243h) {
                c1137a.m1817a(((C1243h) abstractC1228au).m3040Q());
            }
        }
        if (c1229av != null) {
            c1137a.m1822b(c1229av.m2842u());
            C1252q c1252qM2719M = c1229av.m2719M();
            if (c1252qM2719M != null) {
                C1237bc c1237bc = c1252qM2719M.f4452u;
                c1137a.m1825c(c1237bc != null ? c1237bc.m2947e() : "");
            }
            c1137a.m1816a(c1229av.m2765ar() > 0.0d ? c1229av.m2765ar() : c1229av.m2850y());
            c1137a.m1821b(c1229av.m2784d());
        }
        c1137a.m1827d(C1175n.m2059a().m2168q());
        c1137a.m1818a(System.currentTimeMillis());
        c1137a.m1824c(4);
        return c1137a;
    }

    /* JADX INFO: renamed from: b */
    private static C1137a m1886b(String str, String str2, int i, C1229av c1229av) {
        C1137a c1137a = new C1137a();
        if (c1229av != null) {
            c1137a.m1822b(c1229av.m2842u());
            C1252q c1252qM2719M = c1229av.m2719M();
            if (c1252qM2719M != null) {
                C1237bc c1237bc = c1252qM2719M.f4452u;
                c1137a.m1825c(c1237bc != null ? c1237bc.m2947e() : "");
            }
            c1137a.m1816a(c1229av.m2850y());
            c1137a.m1821b(c1229av.m2784d());
        }
        c1137a.m1819a(str);
        c1137a.m1827d(C1175n.m2059a().m2168q());
        c1137a.m1818a(System.currentTimeMillis());
        c1137a.m1829e(str2);
        c1137a.m1824c(10);
        c1137a.m1817a(i);
        return c1137a;
    }

    /* JADX INFO: renamed from: b */
    private JSONArray m1888b(int i, String str, int i2) {
        List<C1137a> listMo1871a = mo1871a(i, str, i2);
        if (listMo1871a == null || listMo1871a.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C1137a> it = listMo1871a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m1833i());
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1889b(java.lang.String r5, int r6) {
        /*
            r4 = this;
            com.anythink.core.c.a.b r0 = r4.m1891c(r5)
            boolean r1 = r0.m1844c()
            if (r1 != 0) goto L13
            boolean r1 = r0.m1850h()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = r4.f2878g
            java.lang.Object r2 = r2.get(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L29
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = r3.equals(r2)
            if (r1 != 0) goto L2e
            if (r2 == 0) goto L2e
            goto L2b
        L29:
            if (r1 != 0) goto L2e
        L2b:
            r4.m1892d(r5)
        L2e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = r4.f2878g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2.put(r5, r3)
            r5 = 4
            if (r6 != r5) goto L3f
            boolean r5 = r0.m1844c()
            return r5
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p047c.p049b.C1145d.m1889b(java.lang.String, int):boolean");
    }

    /* JADX INFO: renamed from: b */
    private double[] m1890b(String str, C1138b c1138b) {
        if (c1138b == null || c1138b.m1847e()) {
            return new double[]{-1.0d, -1.0d};
        }
        double dM1903a = this.f2876e.m1903a(c1138b.m1845d(), str);
        double dM1849g = c1138b.m1849g();
        if (dM1849g != dM1903a) {
            c1138b.m1838a(dM1903a);
            this.f2877f.put(str, c1138b);
            C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3070u, str, String.valueOf(dM1903a));
        }
        return new double[]{dM1903a, dM1849g};
    }

    /* JADX INFO: renamed from: c */
    private C1138b m1891c(String str) {
        C1396f c1396fM5146b = this.f2874c.m5146b(str);
        C1138b c1138b = this.f2877f.get(str);
        if (c1138b == null) {
            c1138b = new C1138b();
            String strM4239b = C1355s.m4239b(C1175n.m2059a().m2148f(), C1169h.f3070u, str, "");
            if (!TextUtils.isEmpty(strM4239b)) {
                try {
                    c1138b.m1838a(Double.parseDouble(strM4239b));
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            this.f2877f.put(str, c1138b);
        }
        if (c1396fM5146b != null) {
            c1138b.m1839a(c1396fM5146b.m5072aN());
            c1138b.m1840a(c1396fM5146b.m5075aQ());
            c1138b.m1841b(c1396fM5146b.m5074aP());
            c1138b.m1843c(c1396fM5146b.m5077aS());
            c1138b.m1846d(c1396fM5146b.m5108b() != null ? 1 : 2);
        }
        return c1138b;
    }

    /* JADX INFO: renamed from: d */
    private void m1892d(final String str) {
        C1335b.m3998a().m4009b(new Runnable() { // from class: com.anythink.core.c.b.d.1
            @Override // java.lang.Runnable
            public final void run() {
                C1145d.this.f2877f.remove(str);
                C1145d.this.f2875d.m1900a(str);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m1893e(String str) {
        C1175n c1175nM2059a = C1175n.m2059a();
        this.f2874c.m5143a(this.f2874c.m5150e(str), c1175nM2059a.m2165o(), c1175nM2059a.m2167p(), str, null, null, 2, true);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final C1140d mo1870a(String str, int i, C1394d c1394d) {
        C1142a c1142a = this.f2873a;
        C1139c c1139c = c1142a.f2858a.get(str);
        int i2 = c1394d.m4879a() == 1 ? i : -1;
        if (c1139c == null || !c1139c.m1858b(c1394d) || c1139c.m1853a(i2) == null) {
            StringBuilder sb = new StringBuilder("getRecentHighestLoadedPrice::startegy has been changed::segmentId:");
            sb.append(i2);
            sb.append(":::start to query SQL.");
            c1139c = new C1139c();
            c1139c.m1856a(c1394d);
            int iM4881c = c1394d.m4881c();
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (((c1394d.m4880b() * 24) * 60) * 60)) * 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            c1139c.m1854a(i2, c1142a.f2859b.m1898a(str, i2, calendar.getTimeInMillis(), iM4881c));
            c1142a.f2858a.put(str, c1139c);
        } else {
            c1139c.m1859c(i);
        }
        return c1139c.m1857b(i2);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final List<C1137a> mo1871a(int i, String str, int i2) {
        C1146e c1146e = this.f2875d;
        if (c1146e != null) {
            return c1146e.m1897a(i, str, i2);
        }
        return null;
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo1872a(String str) {
        return mo1873a(str, 0);
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo1873a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1138b c1138bM1891c = m1891c(str);
        if (c1138bM1891c.m1842b()) {
            return mo1874a(str, i, c1138bM1891c.m1837a());
        }
        return null;
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final JSONObject mo1874a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 4) {
                JSONArray jSONArrayM1888b = m1888b(4, str, i2);
                if (jSONArrayM1888b != null) {
                    jSONObject.put("imp", jSONArrayM1888b);
                }
            } else if (i == 10) {
                JSONArray jSONArrayM1888b2 = m1888b(10, str, i2);
                if (jSONArrayM1888b2 != null) {
                    jSONObject.put("fill", jSONArrayM1888b2);
                }
            } else {
                JSONArray jSONArrayM1888b3 = m1888b(10, str, i2);
                if (jSONArrayM1888b3 != null) {
                    jSONObject.put("fill", jSONArrayM1888b3);
                }
                JSONArray jSONArrayM1888b4 = m1888b(4, str, i2);
                if (jSONArrayM1888b4 != null) {
                    jSONObject.put("imp", jSONArrayM1888b4);
                }
                jSONObject.put("def_ecpm", String.valueOf(m1880a(str, jSONArrayM1888b4)));
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final void mo1875a(AbstractC1228au abstractC1228au, C1229av c1229av) {
        if (abstractC1228au == null || c1229av == null) {
            return;
        }
        String strM2677ah = abstractC1228au.m2677ah();
        if (!TextUtils.isEmpty(strM2677ah) && m1889b(strM2677ah, 4)) {
            C1137a c1137a = new C1137a();
            if (abstractC1228au != null) {
                c1137a.m1819a(abstractC1228au.m2678ai());
                c1137a.m1829e(abstractC1228au.m2677ah());
                if (abstractC1228au instanceof C1243h) {
                    c1137a.m1817a(((C1243h) abstractC1228au).m3040Q());
                }
            }
            if (c1229av != null) {
                c1137a.m1822b(c1229av.m2842u());
                C1252q c1252qM2719M = c1229av.m2719M();
                if (c1252qM2719M != null) {
                    C1237bc c1237bc = c1252qM2719M.f4452u;
                    c1137a.m1825c(c1237bc != null ? c1237bc.m2947e() : "");
                }
                c1137a.m1816a(c1229av.m2765ar() > 0.0d ? c1229av.m2765ar() : c1229av.m2850y());
                c1137a.m1821b(c1229av.m2784d());
            }
            c1137a.m1827d(C1175n.m2059a().m2168q());
            c1137a.m1818a(System.currentTimeMillis());
            c1137a.m1824c(4);
            m1882a(c1137a);
        }
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: a */
    public final void mo1876a(String str, String str2, int i, C1229av c1229av) {
        if (!TextUtils.isEmpty(str) && m1889b(str, 10)) {
            C1137a c1137a = new C1137a();
            if (c1229av != null) {
                c1137a.m1822b(c1229av.m2842u());
                C1252q c1252qM2719M = c1229av.m2719M();
                if (c1252qM2719M != null) {
                    C1237bc c1237bc = c1252qM2719M.f4452u;
                    c1137a.m1825c(c1237bc != null ? c1237bc.m2947e() : "");
                }
                c1137a.m1816a(c1229av.m2850y());
                c1137a.m1821b(c1229av.m2784d());
            }
            c1137a.m1819a(str2);
            c1137a.m1827d(C1175n.m2059a().m2168q());
            c1137a.m1818a(System.currentTimeMillis());
            c1137a.m1829e(str);
            c1137a.m1824c(10);
            c1137a.m1817a(i);
            if (c1229av != null) {
                C1139c c1139c = this.f2873a.f2858a.get(str);
                StringBuilder sb = new StringBuilder("insertOrUpdateLoadedUnitGroupInfo::placementId:");
                sb.append(str);
                sb.append("segmentId:");
                sb.append(c1137a.m1815a());
                sb.append(":::");
                sb.append(c1137a);
                if (c1139c != null) {
                    c1139c.m1855a(c1137a);
                }
            }
            m1882a(c1137a);
        }
    }

    @Override // com.anythink.core.p047c.p049b.InterfaceC1143b
    /* JADX INFO: renamed from: b */
    public final void mo1877b(String str) {
        m1890b(str, m1891c(str));
    }
}
