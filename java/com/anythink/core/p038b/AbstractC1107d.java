package com.anythink.core.p038b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1250o;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p069p.C1370i;
import com.anythink.core.p038b.p040b.InterfaceC1103b;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.core.p072d.C1396f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1107d {

    /* JADX INFO: renamed from: f */
    public C1202a f2638f;

    /* JADX INFO: renamed from: g */
    public boolean f2639g;

    /* JADX INFO: renamed from: a */
    private final String f2637a = getClass().getSimpleName() + ":";

    /* JADX INFO: renamed from: h */
    public AtomicBoolean f2640h = new AtomicBoolean(false);

    public AbstractC1107d(C1202a c1202a) {
        this.f2638f = c1202a;
    }

    /* JADX INFO: renamed from: a */
    private static double m1641a(C1396f c1396f, ATAdConst.CURRENCY currency) {
        if (c1396f == null) {
            return 1.0d;
        }
        if (currency == ATAdConst.CURRENCY.RMB_CENT) {
            return (1.0d / c1396f.m5031C()) * 100.0d;
        }
        if (currency == ATAdConst.CURRENCY.RMB) {
            return 1.0d / c1396f.m5031C();
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1642a(List<C1229av> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C1229av c1229av : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("network_firm_id", c1229av.m2784d());
                jSONObject.put("ad_source_id", c1229av.m2842u());
                jSONObject.put("content", c1229av.m2804h());
                if (!TextUtils.isEmpty(c1229av.m2698A())) {
                    jSONObject.put("error", c1229av.m2698A());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m1643a(C1229av c1229av, String str, long j, int i) {
        c1229av.m2736a(j);
        c1229av.m2734a(0.0d);
        c1229av.m2785d(0.0d);
        c1229av.m2801g(i);
        c1229av.m2779c();
        if (TextUtils.isEmpty(str)) {
            c1229av.m2808h("bid error");
        } else {
            c1229av.m2808h(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m1644b(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (JSONObject jSONObject : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("network_firm_id", 67);
                if (jSONObject.has("unit_ids")) {
                    jSONObject2.put("unit_ids", jSONObject.get("unit_ids"));
                }
                jSONArray.put(jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public final double m1645a(double d, ATAdConst.CURRENCY currency) {
        if (currency == null) {
            return d;
        }
        double dM1641a = m1641a(this.f2638f.f3690n.m2916a(), currency);
        String.valueOf(d);
        String.valueOf(dM1641a);
        double d2 = d * dM1641a;
        String.valueOf(d2);
        return d2;
    }

    /* JADX INFO: renamed from: a */
    public final double m1646a(double d, C1229av c1229av) {
        if (c1229av.m2750ac() == null) {
            return d;
        }
        C1396f c1396fM2916a = this.f2638f.f3690n.m2916a();
        if (c1229av.m2750ac() != ATAdConst.CURRENCY.RMB) {
            if (c1229av.m2750ac() != ATAdConst.CURRENCY.RMB_CENT) {
                return d;
            }
            d /= 100.0d;
        }
        return d * c1396fM2916a.m5031C();
    }

    /* JADX INFO: renamed from: a */
    public final double m1647a(C1229av c1229av) {
        if (c1229av.m2750ac() == null) {
            return 1.0d;
        }
        double dM1641a = m1641a(this.f2638f.f3690n.m2916a(), c1229av.m2750ac());
        StringBuilder sb = new StringBuilder("generateNoticeCurrencyRate () >>> NetworkName: ");
        sb.append(c1229av.m2789e());
        sb.append("|| currenyRata(USD->RMB):");
        sb.append(dM1641a);
        return dM1641a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1604a();

    /* JADX INFO: renamed from: a */
    public final void m1648a(int i, C1250o c1250o, double d, boolean z) {
        if (i != 28) {
            return;
        }
        double d2 = 0.95d;
        JSONObject jSONObjectM5125s = this.f2638f.f3690n.m2916a().m5125s();
        if (jSONObjectM5125s != null) {
            double dOptDouble = jSONObjectM5125s.optDouble(String.valueOf(i));
            if (dOptDouble > 0.0d && dOptDouble <= 1.0d) {
                d2 = dOptDouble;
            }
        }
        double dMax = c1250o.originPrice * d2;
        C1370i c1370i = this.f2638f.f3701y;
        List<C1229av> listM4375a = c1370i != null ? c1370i.m4375a() : null;
        if (listM4375a != null) {
            Iterator<C1229av> it = listM4375a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                double dM4129a = C1344h.m4129a(it.next());
                if (dM4129a < c1250o.originPrice) {
                    dMax = Math.max(dMax, dM4129a);
                    break;
                }
            }
        }
        double dMax2 = Math.max(dMax, d);
        double dRandom = dMax2 + (Math.random() * (c1250o.originPrice - dMax2));
        c1250o.setPrice(dRandom);
        if (z) {
            c1250o.setSortPrice(dRandom);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1605a(InterfaceC1103b interfaceC1103b);

    /* JADX INFO: renamed from: a */
    public abstract void mo1606a(C1229av c1229av, C1250o c1250o, long j);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1649a(com.anythink.core.common.p055f.C1229av r14, com.anythink.core.common.p055f.C1252q r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L3
            return
        L3:
            com.anythink.core.common.f.a r0 = r13.f2638f
            java.lang.String r0 = r0.f3680d
            r15.m3413b(r0)
            com.anythink.core.b.f r0 = com.anythink.core.p038b.C1111f.m1708a()
            com.anythink.core.common.f.a r1 = r13.f2638f
            java.lang.String r1 = r1.f3681e
            com.anythink.core.common.f.q r0 = r0.m1712a(r1, r14)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4e
            boolean r3 = r0.m3411a()
            if (r3 != 0) goto L33
            double r4 = r15.getSortPrice()
            double r6 = r0.getSortPrice()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L2d
            goto L33
        L2d:
            double r3 = r0.getSortPrice()
            r5 = 0
            goto L4c
        L33:
            double r11 = r15.getSortPrice()
            if (r3 == 0) goto L4a
            com.anythink.core.common.f.y r3 = new com.anythink.core.common.f.y
            r6 = 1
            com.anythink.core.common.f.a r4 = r13.f2638f
            com.anythink.core.common.f.h r8 = r4.f3695s
            r5 = r3
            r7 = r14
            r9 = r11
            r5.<init>(r6, r7, r8, r9)
            com.anythink.core.p038b.p042d.C1109b.m1674a(r0, r3, r2)
            goto L52
        L4a:
            r3 = r11
            r5 = 1
        L4c:
            r10 = r3
            goto L54
        L4e:
            double r11 = r15.getSortPrice()
        L52:
            r10 = r11
            r5 = 1
        L54:
            if (r5 == 0) goto La2
            if (r0 == 0) goto L6c
            com.anythink.core.common.f.y r3 = new com.anythink.core.common.f.y     // Catch: java.lang.Throwable -> L68
            r7 = 2
            com.anythink.core.common.f.a r4 = r13.f2638f     // Catch: java.lang.Throwable -> L68
            com.anythink.core.common.f.h r9 = r4.f3695s     // Catch: java.lang.Throwable -> L68
            r6 = r3
            r8 = r14
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L68
            com.anythink.core.p038b.p042d.C1109b.m1674a(r0, r3, r2)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            r0.printStackTrace()
        L6c:
            r0 = 2
            r14.m2739a(r15, r0, r1, r2)
            int r1 = r14.m2717K()
            if (r1 == r0) goto Lbb
            com.anythink.core.b.f r0 = com.anythink.core.p038b.C1111f.m1708a()
            com.anythink.core.common.f.a r1 = r13.f2638f
            java.lang.String r1 = r1.f3681e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.f.q> r0 = r0.f2686a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = r15.f4442k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.put(r2, r15)
            boolean r14 = r14.m2732Z()
            if (r14 == 0) goto La1
            com.anythink.core.common.a.a r14 = com.anythink.core.common.p050a.C1149a.m1921a()
            r14.m1931a(r1, r15)
        La1:
            return
        La2:
            if (r15 == 0) goto Lb8
            com.anythink.core.common.f.y r3 = new com.anythink.core.common.f.y     // Catch: java.lang.Throwable -> Lb4
            r7 = 2
            com.anythink.core.common.f.a r4 = r13.f2638f     // Catch: java.lang.Throwable -> Lb4
            com.anythink.core.common.f.h r9 = r4.f3695s     // Catch: java.lang.Throwable -> Lb4
            r6 = r3
            r8 = r14
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb4
            com.anythink.core.p038b.p042d.C1109b.m1674a(r15, r3, r1)     // Catch: java.lang.Throwable -> Lb4
            goto Lb8
        Lb4:
            r15 = move-exception
            r15.printStackTrace()
        Lb8:
            r14.m2739a(r0, r2, r1, r2)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.AbstractC1107d.m1649a(com.anythink.core.common.f.av, com.anythink.core.common.f.q):void");
    }

    /* JADX INFO: renamed from: a */
    public void mo1650a(boolean z) {
        this.f2639g = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1651a(C1229av c1229av, String str, int i) {
        return m1652a(c1229av, str, i, 0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1652a(C1229av c1229av, String str, int i, int i2) {
        C1252q c1252qM1712a = C1111f.m1708a().m1712a(this.f2638f.f3681e, c1229av);
        if (c1252qM1712a != null && !c1252qM1712a.m3411a()) {
            c1229av.m2739a(c1252qM1712a, 0, i, i2);
            c1229av.m2808h(str);
            return true;
        }
        if (c1252qM1712a != null) {
            try {
                C1243h c1243hM3045V = this.f2638f.f3695s.m3045V();
                c1243hM3045V.m2686x(c1252qM1712a.m3414c());
                C1109b.m1674a(c1252qM1712a, new C1260y(1, c1229av, c1243hM3045V), true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1653c() {
        return this.f2640h.get();
    }
}
