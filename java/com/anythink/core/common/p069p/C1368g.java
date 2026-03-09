package com.anythink.core.common.p069p;

import android.content.Context;
import com.anythink.core.common.C1193d;
import com.anythink.core.common.C1262g;
import com.anythink.core.common.C1390x;
import com.anythink.core.common.p055f.C1224aq;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1251p;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p038b.C1111f;
import com.anythink.core.p038b.p042d.C1109b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.p.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1368g {

    /* JADX INFO: renamed from: a */
    public static final String f5417a = C1262g.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public final int f5418b;

    /* JADX INFO: renamed from: c */
    public int f5419c;

    /* JADX INFO: renamed from: d */
    public int f5420d;

    /* JADX INFO: renamed from: e */
    public long f5421e;

    /* JADX INFO: renamed from: o */
    public C1233az f5431o;

    /* JADX INFO: renamed from: p */
    public C1224aq f5432p;

    /* JADX INFO: renamed from: q */
    public C1370i f5433q;

    /* JADX INFO: renamed from: r */
    public C1251p f5434r;

    /* JADX INFO: renamed from: s */
    public C1251p f5435s;

    /* JADX INFO: renamed from: t */
    private List<C1229av> f5436t;

    /* JADX INFO: renamed from: k */
    public volatile int f5427k = 0;

    /* JADX INFO: renamed from: l */
    public volatile int f5428l = 0;

    /* JADX INFO: renamed from: m */
    public volatile int f5429m = 0;

    /* JADX INFO: renamed from: n */
    public volatile int f5430n = 0;

    /* JADX INFO: renamed from: f */
    public List<C1229av> f5422f = Collections.synchronizedList(new ArrayList(5));

    /* JADX INFO: renamed from: g */
    public List<C1229av> f5423g = Collections.synchronizedList(new ArrayList(5));

    /* JADX INFO: renamed from: h */
    public List<C1229av> f5424h = Collections.synchronizedList(new ArrayList(2));

    /* JADX INFO: renamed from: i */
    public List<C1367f> f5425i = Collections.synchronizedList(new ArrayList(2));

    /* JADX INFO: renamed from: j */
    public List<C1229av> f5426j = Collections.synchronizedList(new ArrayList(2));

    public C1368g(C1369h c1369h) {
        this.f5419c = 1;
        this.f5422f.addAll(c1369h.f5440d);
        this.f5426j.addAll(c1369h.f5442f);
        this.f5433q = c1369h.f5446j;
        this.f5434r = c1369h.f5448l;
        this.f5435s = c1369h.f5449m;
        this.f5418b = c1369h.f5439c.m2923h();
        this.f5419c = c1369h.f5439c.m2920e();
        this.f5420d = c1369h.f5439c.m2921f();
        this.f5421e = c1369h.f5439c.m2925j();
        List<C1229av> list = c1369h.f5441e;
        if (list != null) {
            this.f5424h.addAll(list);
        }
        this.f5436t = Collections.synchronizedList(new ArrayList(3));
        this.f5431o = c1369h.f5445i;
        this.f5432p = c1369h.f5447k;
    }

    /* JADX INFO: renamed from: A */
    private double m4317A() {
        return m4333a(true);
    }

    /* JADX INFO: renamed from: a */
    public static C1229av m4318a(Map<String, C1366e> map) {
        C1229av c1229av;
        Iterator<Map.Entry<String, C1366e>> it = map.entrySet().iterator();
        C1229av c1229av2 = null;
        if (it != null) {
            while (it.hasNext()) {
                C1366e value = it.next().getValue();
                if (value != null && !value.f5386i && (c1229av = value.f5380c) != null && (c1229av2 == null || C1344h.m4129a(c1229av) > C1344h.m4129a(c1229av2))) {
                    c1229av2 = c1229av;
                }
            }
        }
        return c1229av2;
    }

    /* JADX INFO: renamed from: a */
    public static void m4319a(Context context, String str) {
        C1390x.m4629a(context).m4633a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m4320a(Context context, String str, String str2, C1229av c1229av, C1229av c1229av2) {
        C1233az.a aVar;
        C1233az.a aVar2 = null;
        if (c1229av != null) {
            C1233az.a aVar3 = new C1233az.a(c1229av, c1229av.m2719M());
            aVar = null;
            aVar2 = aVar3;
        } else {
            aVar = c1229av2 != null ? new C1233az.a(c1229av2, c1229av2.m2719M()) : null;
        }
        C1390x.m4629a(context).m4634a(str, str2, aVar2, aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m4321a(C1229av c1229av, C1243h c1243h) {
        if (c1229av != null && c1229av.m2821k() && c1229av.m2717K() == 2) {
            m4322a(c1229av, c1243h.m3045V(), true);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4322a(C1229av c1229av, C1243h c1243h, boolean z) {
        C1252q c1252qM2719M = c1229av.m2719M();
        if (c1252qM2719M != null) {
            C1109b.m1674a(c1252qM2719M, new C1260y(2, c1229av, c1243h), z);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4323a(String str) {
        C1193d.m2290a().m2296b(str);
    }

    /* JADX INFO: renamed from: a */
    private void m4324a(List<C1229av> list, List<C1229av> list2) {
        int iM2753af;
        int size = list2.size();
        int size2 = this.f5436t.size();
        for (int i = 0; i < size; i++) {
            C1229av c1229av = list2.get(i);
            if (c1229av.m2821k() && (iM2753af = c1229av.m2753af()) > 0 && iM2753af <= size2 && C1344h.m4129a(c1229av) < C1344h.m4129a(this.f5436t.get(iM2753af - 1))) {
                list.add(c1229av);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0025  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4325a(com.anythink.core.common.p055f.C1229av r4, com.anythink.core.common.p069p.C1371j r5) {
        /*
            int r0 = r4.m2731Y()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L2c
            int r4 = r4.m2826m()
            if (r4 == r2) goto L25
            r3 = 3
            if (r4 == r3) goto L25
            r3 = 6
            if (r4 == r3) goto L1d
            r3 = 7
            if (r4 == r3) goto L25
            goto L2c
        L1d:
            boolean r4 = r5.f5457g
            if (r4 == 0) goto L22
            goto L2d
        L22:
            r5.f5457g = r2
            goto L2c
        L25:
            boolean r4 = r5.f5456f
            if (r4 == 0) goto L2a
            goto L2d
        L2a:
            r5.f5456f = r2
        L2c:
            r1 = r0
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p069p.C1368g.m4325a(com.anythink.core.common.f.av, com.anythink.core.common.p.j):boolean");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4326a(String str, C1229av c1229av, C1243h c1243h) {
        boolean z = false;
        try {
            if (c1229av.m2821k()) {
                C1252q c1252qM2719M = c1229av.m2719M();
                C1111f.m1708a().m1715a(str, c1252qM2719M);
                if (c1252qM2719M != null && c1252qM2719M.m3411a()) {
                    z = true;
                }
                if (z && c1252qM2719M != null) {
                    C1109b.m1674a(c1252qM2719M, new C1260y(1, c1229av, c1243h), true);
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static String m4327b(List<C1229av> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i).m2784d());
            str = str + sb.toString();
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static double m4328h(C1229av c1229av) {
        C1252q c1252qM2719M;
        double dM4129a = C1344h.m4129a(c1229av);
        return (c1229av.m2748aa() && dM4129a == 10000.0d && (c1252qM2719M = c1229av.m2719M()) != null) ? c1252qM2719M.f4446o : dM4129a;
    }

    /* JADX INFO: renamed from: w */
    private List<C1229av> m4329w() {
        return this.f5422f;
    }

    /* JADX INFO: renamed from: x */
    private List<C1229av> m4330x() {
        return this.f5423g;
    }

    /* JADX INFO: renamed from: y */
    private List<C1229av> m4331y() {
        return this.f5424h;
    }

    /* JADX INFO: renamed from: z */
    private double m4332z() {
        return m4333a(false);
    }

    /* JADX INFO: renamed from: a */
    public final double m4333a(boolean z) {
        synchronized (this.f5436t) {
            int size = this.f5436t.size();
            if (size == 0) {
                return 0.0d;
            }
            int i = this.f5418b - 1;
            int i2 = size - 1;
            if (z && i2 < i) {
                return 0.0d;
            }
            return C1344h.m4129a(this.f5436t.get(Math.min(i, i2)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m4334a(boolean z, long j) {
        if (this.f5424h.size() <= 0) {
            return -1L;
        }
        if (this.f5422f.size() == 0 && z) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final C1370i m4335a() {
        return this.f5433q;
    }

    /* JADX INFO: renamed from: a */
    public final void m4336a(int i) {
        if (this.f5419c == 2 && i == 1) {
            this.f5430n--;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4337a(int i, int i2) {
        this.f5427k += i;
        if (i2 != 2) {
            this.f5428l += i;
        } else {
            this.f5429m += i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4338a(C1229av c1229av) {
        this.f5423g.add(c1229av);
    }

    /* JADX INFO: renamed from: a */
    public final void m4339a(C1229av c1229av, int i) {
        synchronized (this.f5425i) {
            Iterator<C1367f> it = this.f5425i.iterator();
            int i2 = 0;
            while (it.hasNext() && C1344h.m4129a(it.next().f5415a) > C1344h.m4129a(c1229av)) {
                i2++;
            }
            this.f5425i.add(i2, new C1367f(c1229av, i));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4340a(C1243h c1243h) {
        ArrayList arrayList = new ArrayList(5);
        synchronized (this.f5436t) {
            m4324a(arrayList, this.f5436t);
        }
        synchronized (this.f5423g) {
            m4324a(arrayList, this.f5423g);
        }
        Iterator<C1229av> it = arrayList.iterator();
        while (it.hasNext()) {
            m4322a(it.next(), c1243h, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4341a(List<C1229av> list) {
        this.f5423g.addAll(list);
    }

    /* JADX INFO: renamed from: b */
    public final C1229av m4342b(boolean z) {
        C1229av c1229avM3392a;
        if (!z || (c1229avM3392a = this.f5434r.m3392a()) == null) {
            return null;
        }
        if (!c1229avM3392a.m2821k()) {
            new StringBuilder("tryToSendWinNotice(), do not send win, the unitGroupInfo of the max price is not a bidding ad source -- ").append(c1229avM3392a.toString());
            return null;
        }
        if (c1229avM3392a.m2758ak() == 1) {
            return null;
        }
        double dM4129a = C1344h.m4129a(c1229avM3392a);
        synchronized (this.f5423g) {
            for (C1229av c1229av : this.f5423g) {
                if (C1344h.m4129a(c1229av) > dM4129a) {
                    new StringBuilder("tryToSendWinNotice(), do not send win, waiting for -- ").append(c1229av.toString());
                    return null;
                }
            }
            synchronized (this.f5425i) {
                Iterator<C1367f> it = this.f5425i.iterator();
                while (it.hasNext()) {
                    C1229av c1229av2 = it.next().f5415a;
                    if (C1344h.m4129a(c1229av2) > dM4129a) {
                        new StringBuilder("tryToSendWinNotice(), do not send win, waiting for -- ").append(c1229av2.toString());
                        return null;
                    }
                }
                new StringBuilder("tryToSendWinNotice(), need to send win notice: ").append(c1229avM3392a.toString());
                return c1229avM3392a;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1251p m4343b() {
        return this.f5434r;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0020  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.anythink.core.common.p055f.C1229av> m4344b(int r11) {
        /*
            r10 = this;
            r0 = 2
            if (r11 == r0) goto L6
            java.util.List<com.anythink.core.common.f.av> r1 = r10.f5422f
            goto L8
        L6:
            java.util.List<com.anythink.core.common.f.av> r1 = r10.f5424h
        L8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto La1
            int r3 = r1.size()
            if (r3 != 0) goto L17
            goto La1
        L17:
            r3 = 0
            java.lang.Object r4 = r1.get(r3)
            com.anythink.core.common.f.av r4 = (com.anythink.core.common.p055f.C1229av) r4
            if (r11 != r0) goto L25
        L20:
            r2.add(r4)
            goto L98
        L25:
            double r5 = com.anythink.core.common.p066o.C1344h.m4129a(r4)
            r11 = 1
            double r7 = r10.m4333a(r11)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            int r6 = r10.f5419c
            if (r6 != r11) goto L58
            int r0 = r10.f5428l
            int r6 = r10.f5420d
            if (r0 >= r6) goto L40
            r3 = 1
        L40:
            if (r3 == 0) goto L45
            if (r5 == 0) goto L45
            goto L20
        L45:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "getNextRequestList, isLessThenMaxRequestNum: "
            r11.<init>(r0)
            r11.append(r3)
            java.lang.String r0 = ", isExceedCachePrice: "
            r11.append(r0)
            r11.append(r5)
            goto L98
        L58:
            if (r6 != r0) goto L98
            int r11 = r10.f5430n
            if (r11 != 0) goto L8c
            if (r5 == 0) goto L8c
            double r4 = com.anythink.core.common.p066o.C1344h.m4129a(r4)
            int r11 = r1.size()
        L68:
            if (r3 >= r11) goto L7e
            java.lang.Object r0 = r1.get(r3)
            com.anythink.core.common.f.av r0 = (com.anythink.core.common.p055f.C1229av) r0
            double r6 = com.anythink.core.common.p066o.C1344h.m4129a(r0)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L7b
            r2.add(r0)
        L7b:
            int r3 = r3 + 1
            goto L68
        L7e:
            int r11 = r2.size()
            r10.f5430n = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "getNextRequestList: same price, need request num: "
            r11.<init>(r0)
            goto L93
        L8c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "getNextRequestList: The number of ad sources with the same price that did not return results: "
            r11.<init>(r0)
        L93:
            int r0 = r10.f5430n
            r11.append(r0)
        L98:
            int r11 = r2.size()
            if (r11 <= 0) goto La1
            r1.removeAll(r2)
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p069p.C1368g.m4344b(int):java.util.List");
    }

    /* JADX INFO: renamed from: b */
    public final void m4345b(C1229av c1229av) {
        this.f5423g.remove(c1229av);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4346b(C1229av c1229av, int i) {
        List<C1229av> list = i != 2 ? this.f5422f : this.f5424h;
        synchronized (list) {
            C1344h.m4140a(list, c1229av);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4347b(C1243h c1243h) {
        C1229av c1229av;
        synchronized (this.f5422f) {
            for (C1229av c1229av2 : this.f5422f) {
                if (c1229av2 != null && c1229av2.m2821k()) {
                    m4321a(c1229av2, c1243h);
                }
            }
            this.f5422f.clear();
        }
        synchronized (this.f5425i) {
            for (C1367f c1367f : this.f5425i) {
                if (c1367f != null && (c1229av = c1367f.f5415a) != null && c1229av.m2821k()) {
                    m4321a(c1367f.f5415a, c1243h);
                }
            }
            this.f5425i.clear();
        }
        synchronized (this.f5424h) {
            this.f5424h.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4348c() {
        return this.f5422f.size();
    }

    /* JADX INFO: renamed from: c */
    public final void m4349c(C1229av c1229av) {
        C1370i c1370i = this.f5433q;
        if (c1370i != null) {
            c1370i.m4376a(c1229av);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1229av m4350d() {
        if (this.f5422f.size() > 0) {
            return this.f5422f.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m4351d(C1229av c1229av) {
        C1252q c1252qM2719M;
        if (c1229av == null || !c1229av.m2821k() || (c1252qM2719M = c1229av.m2719M()) == null) {
            return;
        }
        c1252qM2719M.m3409a(this.f5434r);
    }

    /* JADX INFO: renamed from: e */
    public final int m4352e() {
        return this.f5423g.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002d  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4353e(com.anythink.core.common.p055f.C1229av r9) {
        /*
            r8 = this;
            com.anythink.core.common.f.p r0 = r8.f5434r
            r1 = 0
            if (r0 == 0) goto L32
            if (r9 != 0) goto L8
            goto L32
        L8:
            com.anythink.core.common.f.av r0 = r0.m3392a()
            r2 = 1
            if (r0 != 0) goto L11
        Lf:
            r1 = 1
            goto L2b
        L11:
            double r3 = com.anythink.core.common.p066o.C1344h.m4129a(r9)
            double r5 = com.anythink.core.common.p066o.C1344h.m4129a(r0)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L1e
            goto Lf
        L1e:
            if (r7 != 0) goto L2b
            int r3 = r9.m2760am()
            int r0 = r0.m2760am()
            if (r3 >= r0) goto L2b
            goto Lf
        L2b:
            if (r1 == 0) goto L32
            com.anythink.core.common.f.p r0 = r8.f5434r
            r0.m3393a(r9)
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p069p.C1368g.m4353e(com.anythink.core.common.f.av):boolean");
    }

    /* JADX INFO: renamed from: f */
    public final int m4354f() {
        return this.f5424h.size();
    }

    /* JADX INFO: renamed from: f */
    public final void m4355f(C1229av c1229av) {
        List<C1229av> list;
        synchronized (this.f5436t) {
            if (this.f5436t.size() == 0) {
                list = this.f5436t;
            } else {
                double dM4129a = C1344h.m4129a(c1229av);
                int i = 0;
                while (true) {
                    if (i >= this.f5436t.size()) {
                        break;
                    }
                    if (dM4129a > C1344h.m4129a(this.f5436t.get(i))) {
                        this.f5436t.add(i, c1229av);
                        break;
                    } else {
                        if (i == this.f5436t.size() - 1) {
                            list = this.f5436t;
                            break;
                        }
                        i++;
                    }
                }
            }
            list.add(c1229av);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1229av m4356g() {
        return this.f5424h.remove(0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4357g(C1229av c1229av) {
        double dM4129a;
        double dM4129a2 = C1344h.m4129a(c1229av);
        double dM4333a = m4333a(true);
        synchronized (this.f5423g) {
            Iterator<C1229av> it = this.f5423g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dM4129a = 0.0d;
                    break;
                }
                C1229av next = it.next();
                dM4129a = C1344h.m4129a(next);
                if (next.m2821k() && dM4129a > C1344h.m4129a(c1229av)) {
                    break;
                }
            }
        }
        return dM4129a2 > Math.max(dM4333a, dM4129a);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4358h() {
        return this.f5424h.size() == 0 && this.f5422f.size() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m4359i() {
        this.f5424h.clear();
    }

    /* JADX INFO: renamed from: j */
    public final C1229av m4360j() {
        C1229av c1229av;
        C1367f c1367f;
        synchronized (this.f5425i) {
            c1229av = (this.f5425i.size() <= 0 || (c1367f = this.f5425i.get(0)) == null) ? null : c1367f.f5415a;
        }
        return c1229av;
    }

    /* JADX INFO: renamed from: k */
    public final int m4361k() {
        return this.f5425i.size();
    }

    /* JADX INFO: renamed from: l */
    public final List<C1367f> m4362l() {
        return this.f5425i;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m4363m() {
        List<C1229av> list = this.f5426j;
        return list == null || list.size() == 0;
    }

    /* JADX INFO: renamed from: n */
    public final List<C1229av> m4364n() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(this.f5426j);
        this.f5426j.clear();
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final int m4365o() {
        return this.f5427k;
    }

    /* JADX INFO: renamed from: p */
    public final int m4366p() {
        return this.f5428l;
    }

    /* JADX INFO: renamed from: q */
    public final int m4367q() {
        return this.f5429m;
    }

    /* JADX INFO: renamed from: r */
    public final C1233az m4368r() {
        return this.f5431o;
    }

    /* JADX INFO: renamed from: s */
    public final C1224aq m4369s() {
        return this.f5432p;
    }

    /* JADX INFO: renamed from: t */
    public final C1251p m4370t() {
        return this.f5435s;
    }

    /* JADX INFO: renamed from: u */
    public final List<C1229av> m4371u() {
        List<C1229av> listM4344b;
        int i = this.f5419c;
        if (i == 1) {
            listM4344b = new ArrayList<>();
            int iMin = Math.min(this.f5420d, this.f5422f.size());
            for (int i2 = 0; i2 < iMin; i2++) {
                listM4344b.add(this.f5422f.get(i2));
            }
        } else {
            listM4344b = i == 2 ? m4344b(1) : null;
        }
        StringBuilder sb = new StringBuilder("startToRequestMediationAd: mRequestNumType: ");
        sb.append(this.f5419c);
        sb.append(", needRequestNum: ");
        sb.append(listM4344b != null ? listM4344b.size() : 0);
        sb.append(", validCacheNum: ");
        sb.append(this.f5418b);
        sb.append(", mWaitingFillTime: ");
        sb.append(this.f5421e);
        if (listM4344b.size() > 0) {
            this.f5422f.removeAll(listM4344b);
        }
        return listM4344b;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4372v() {
        return this.f5422f.size() == 0 && this.f5424h.size() == 0 && this.f5425i.size() == 0 && this.f5423g.size() == 0;
    }
}
