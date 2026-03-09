package com.anythink.core.common.p065n;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.AbstractC1311m;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1193d;
import com.anythink.core.common.C1197e;
import com.anythink.core.common.C1361p;
import com.anythink.core.common.C1372q;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1244i;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p058h.C1287o;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p058h.p059a.AbstractC1271c;
import com.anythink.core.common.p058h.p059a.C1273e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.core.p047c.C1136a;
import com.anythink.core.p047c.C1141b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.anythink.core.common.n.c */
/* JADX INFO: loaded from: classes.dex */
public class C1320c extends AbstractC1311m<C1244i> {

    /* JADX INFO: renamed from: g */
    private static volatile C1320c f5036g;

    /* JADX INFO: renamed from: com.anythink.core.common.n.c$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5037a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC1228au f5038b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1229av f5039c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f5040d;

        public AnonymousClass1(int i, AbstractC1228au abstractC1228au, C1229av c1229av, long j) {
            i = i;
            abstractC1228au = abstractC1228au;
            c1229av = c1229av;
            j = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1244i c1244iM3838a = C1320c.m3838a(C1320c.this, i, abstractC1228au, c1229av, j);
            if (c1244iM3838a == null) {
                return;
            }
            C1320c.super.m3797a(c1244iM3838a, C1320c.m3846b(i, abstractC1228au));
        }
    }

    private C1320c(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1244i m3838a(C1320c c1320c, int i, AbstractC1228au abstractC1228au, C1229av c1229av, long j) {
        C1243h c1243h;
        String strM2677ah;
        C1396f c1396fM5139a;
        List<String> listM5038J;
        List<C1234b> listM1914a;
        C1252q c1252qM2719M;
        if (i == 13) {
            C1252q c1252qM2719M2 = c1229av != null ? c1229av.m2719M() : null;
            if (c1252qM2719M2 != null) {
                C1109b.m1673a(c1252qM2719M2, c1229av);
            }
        }
        if (i == 4) {
            C1252q c1252qM2719M3 = c1229av != null ? c1229av.m2719M() : null;
            if (c1252qM2719M3 != null) {
                C1109b.m1675a(c1252qM2719M3, true, c1252qM2719M3.getSortPrice(), true);
            }
            if ((abstractC1228au instanceof C1243h) && (c1396fM5139a = C1398h.m5135a(c1320c.f5002d).m5139a((strM2677ah = (c1243h = (C1243h) abstractC1228au).m2677ah()))) != null && (listM5038J = c1396fM5139a.m5038J()) != null && listM5038J.size() != 0 && (listM1914a = C1148a.m1904a().m1914a(strM2677ah)) != null) {
                for (C1234b c1234b : listM1914a) {
                    if (c1234b != null && c1234b.m2902c() == 0) {
                        C1243h c1243hM2908h = c1234b.m2908h();
                        C1229av unitGroupInfo = c1234b.m2904d().getUnitGroupInfo();
                        if (listM5038J.contains(String.valueOf(unitGroupInfo.m2784d())) && !TextUtils.equals(c1243h.m3124r(), c1243hM2908h.m3124r()) && (c1252qM2719M = unitGroupInfo.m2719M()) != null) {
                            C1109b.m1675a(c1252qM2719M, false, C1344h.m4129a(c1229av), c1243h.m3022D() == 1);
                        }
                    }
                }
            }
        }
        if (i == 4) {
            if (abstractC1228au instanceof C1243h) {
                if (c1229av != null) {
                    C1243h c1243h2 = (C1243h) abstractC1228au;
                    C1136a.m1806a().m1812a(c1243h2, c1229av);
                    if (c1229av.m2718L() && c1229av.m2765ar() > 0.0d) {
                        c1243h2.m3059b(c1229av.m2765ar());
                    }
                }
                C1243h c1243h3 = (C1243h) abstractC1228au;
                if (c1243h3.m3088g() == 2) {
                    C1389w.m4583a().m4624a(abstractC1228au.m2677ah());
                }
                C1193d.m2290a().m2295a(abstractC1228au.m2677ah(), abstractC1228au.m2678ai(), c1243h3.m3026F());
            }
            C1141b.m1860a().m1864a(abstractC1228au, c1229av);
        }
        if (i == 6 && (abstractC1228au instanceof C1243h)) {
            C1193d.m2290a().m2297b(abstractC1228au.m2677ah(), abstractC1228au.m2678ai(), ((C1243h) abstractC1228au).m3026F());
        }
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        C1244i c1244i = new C1244i();
        c1244i.f4223a = i;
        c1244i.f4224b = abstractC1228au;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        c1244i.f4225c = j;
        C1372q.m4390a(C1175n.m2059a().m2148f()).m4393a(i, c1244i, c1391aM4865b);
        if (4 == i && (abstractC1228au instanceof C1243h)) {
            C1361p.m4272a();
            C1361p.m4273a((C1243h) abstractC1228au);
        }
        if (m3843a(i, abstractC1228au, c1391aM4865b)) {
            return null;
        }
        return c1244i;
    }

    /* JADX INFO: renamed from: a */
    public static C1320c m3839a(Context context) {
        if (f5036g == null) {
            synchronized (C1320c.class) {
                if (f5036g == null) {
                    f5036g = new C1320c(context);
                }
            }
        }
        return f5036g;
    }

    /* JADX INFO: renamed from: a */
    private static void m3840a(int i, C1229av c1229av) {
        if (i == 13) {
            C1252q c1252qM2719M = c1229av != null ? c1229av.m2719M() : null;
            if (c1252qM2719M != null) {
                C1109b.m1673a(c1252qM2719M, c1229av);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3841a(C1243h c1243h, C1229av c1229av) {
        List<String> listM5038J;
        List<C1234b> listM1914a;
        C1252q c1252qM2719M;
        String strM2677ah = c1243h.m2677ah();
        C1396f c1396fM5139a = C1398h.m5135a(this.f5002d).m5139a(strM2677ah);
        if (c1396fM5139a == null || (listM5038J = c1396fM5139a.m5038J()) == null || listM5038J.size() == 0 || (listM1914a = C1148a.m1904a().m1914a(strM2677ah)) == null) {
            return;
        }
        for (C1234b c1234b : listM1914a) {
            if (c1234b != null && c1234b.m2902c() == 0) {
                C1243h c1243hM2908h = c1234b.m2908h();
                C1229av unitGroupInfo = c1234b.m2904d().getUnitGroupInfo();
                if (listM5038J.contains(String.valueOf(unitGroupInfo.m2784d())) && !TextUtils.equals(c1243h.m3124r(), c1243hM2908h.m3124r()) && (c1252qM2719M = unitGroupInfo.m2719M()) != null) {
                    C1109b.m1675a(c1252qM2719M, false, C1344h.m4129a(c1229av), c1243h.m3022D() == 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3843a(int i, AbstractC1228au abstractC1228au, C1391a c1391a) {
        if (C1175n.m2059a().m2175v()) {
            return true;
        }
        String strM4748ao = c1391a.m4748ao();
        if (!TextUtils.isEmpty(strM4748ao) && (abstractC1228au instanceof C1243h)) {
            try {
                JSONArray jSONArray = new JSONArray(strM4748ao);
                int length = jSONArray.length();
                String strValueOf = String.valueOf(((C1243h) abstractC1228au).m3039P());
                for (int i2 = 0; i2 < length; i2++) {
                    if (TextUtils.equals(strValueOf, jSONArray.optString(i2))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Map<String, String> mapM4746am = c1391a.m4746am();
        if (mapM4746am != null && mapM4746am.containsKey(String.valueOf(i))) {
            String str = mapM4746am.get(String.valueOf(i));
            if (!TextUtils.isEmpty(str) && str.contains(abstractC1228au.m2679aj())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00b4  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.anythink.core.common.p055f.C1244i m3844b(int r16, com.anythink.core.common.p055f.AbstractC1228au r17, com.anythink.core.common.p055f.C1229av r18, long r19) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1320c.m3844b(int, com.anythink.core.common.f.au, com.anythink.core.common.f.av, long):com.anythink.core.common.f.i");
    }

    /* JADX INFO: renamed from: b */
    private void m3845b(int i, AbstractC1228au abstractC1228au, C1229av c1229av) {
        C1243h c1243h;
        String strM2677ah;
        C1396f c1396fM5139a;
        List<String> listM5038J;
        List<C1234b> listM1914a;
        C1252q c1252qM2719M;
        if (i == 4) {
            C1252q c1252qM2719M2 = c1229av != null ? c1229av.m2719M() : null;
            if (c1252qM2719M2 != null) {
                C1109b.m1675a(c1252qM2719M2, true, c1252qM2719M2.getSortPrice(), true);
            }
            if (!(abstractC1228au instanceof C1243h) || (c1396fM5139a = C1398h.m5135a(this.f5002d).m5139a((strM2677ah = (c1243h = (C1243h) abstractC1228au).m2677ah()))) == null || (listM5038J = c1396fM5139a.m5038J()) == null || listM5038J.size() == 0 || (listM1914a = C1148a.m1904a().m1914a(strM2677ah)) == null) {
                return;
            }
            for (C1234b c1234b : listM1914a) {
                if (c1234b != null && c1234b.m2902c() == 0) {
                    C1243h c1243hM2908h = c1234b.m2908h();
                    C1229av unitGroupInfo = c1234b.m2904d().getUnitGroupInfo();
                    if (listM5038J.contains(String.valueOf(unitGroupInfo.m2784d())) && !TextUtils.equals(c1243h.m3124r(), c1243hM2908h.m3124r()) && (c1252qM2719M = unitGroupInfo.m2719M()) != null) {
                        C1109b.m1675a(c1252qM2719M, false, C1344h.m4129a(c1229av), c1243h.m3022D() == 1);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m3846b(int i, AbstractC1228au abstractC1228au) {
        Map<String, String> mapM4731a;
        if (abstractC1228au instanceof C1243h) {
            C1243h c1243h = (C1243h) abstractC1228au;
            if (c1243h.m3039P() == 67) {
                return true;
            }
            if (c1243h.m3039P() != 0 && !TextUtils.isEmpty(abstractC1228au.m2679aj()) && (mapM4731a = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()).m4731a(i)) != null) {
                if (mapM4731a.containsKey("0")) {
                    String str = mapM4731a.get("0");
                    return !TextUtils.isEmpty(str) && str.contains(abstractC1228au.m2679aj());
                }
                if (mapM4731a.containsKey(String.valueOf(c1243h.m3039P()))) {
                    String str2 = mapM4731a.get(String.valueOf(c1243h.m3039P()));
                    if (!TextUtils.isEmpty(str2) && str2.contains(abstractC1228au.m2679aj())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static void m3847c(int i, AbstractC1228au abstractC1228au, C1229av c1229av) {
        if (i == 4) {
            if (abstractC1228au instanceof C1243h) {
                if (c1229av != null) {
                    C1243h c1243h = (C1243h) abstractC1228au;
                    C1136a.m1806a().m1812a(c1243h, c1229av);
                    if (c1229av.m2718L() && c1229av.m2765ar() > 0.0d) {
                        c1243h.m3059b(c1229av.m2765ar());
                    }
                }
                C1243h c1243h2 = (C1243h) abstractC1228au;
                if (c1243h2.m3088g() == 2) {
                    C1389w.m4583a().m4624a(abstractC1228au.m2677ah());
                }
                C1193d.m2290a().m2295a(abstractC1228au.m2677ah(), abstractC1228au.m2678ai(), c1243h2.m3026F());
            }
            C1141b.m1860a().m1864a(abstractC1228au, c1229av);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3848c(int i, AbstractC1228au abstractC1228au) {
        Map<String, String> mapM4731a;
        if (!(abstractC1228au instanceof C1243h)) {
            return false;
        }
        C1243h c1243h = (C1243h) abstractC1228au;
        if (c1243h.m3039P() == 67) {
            return true;
        }
        if (c1243h.m3039P() != 0 && !TextUtils.isEmpty(abstractC1228au.m2679aj()) && (mapM4731a = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()).m4731a(i)) != null) {
            if (mapM4731a.containsKey("0")) {
                String str = mapM4731a.get("0");
                return !TextUtils.isEmpty(str) && str.contains(abstractC1228au.m2679aj());
            }
            if (mapM4731a.containsKey(String.valueOf(c1243h.m3039P()))) {
                String str2 = mapM4731a.get(String.valueOf(c1243h.m3039P()));
                if (!TextUtils.isEmpty(str2) && str2.contains(abstractC1228au.m2679aj())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static void m3849d(int i, AbstractC1228au abstractC1228au) {
        if (4 == i && (abstractC1228au instanceof C1243h)) {
            C1361p.m4272a();
            C1361p.m4273a((C1243h) abstractC1228au);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m3850e(int i, AbstractC1228au abstractC1228au) {
        if (abstractC1228au instanceof C1243h) {
            if (i == 4) {
                ((C1243h) abstractC1228au).m3103k();
            } else if (i == 6) {
                ((C1243h) abstractC1228au).m3106l();
            } else if (i == 10) {
                C1197e.m2307a(abstractC1228au.m2666Y(), C1197e.f3574c, (C1243h) abstractC1228au);
            } else if (i == 21) {
                C1175n.m2059a().m2105K();
            }
            C1319b.m3821a().m3833a(i, (C1243h) abstractC1228au);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3851a(int i, AbstractC1228au abstractC1228au) {
        m3853a(i, abstractC1228au, null, -1L);
    }

    /* JADX INFO: renamed from: a */
    public final void m3852a(int i, AbstractC1228au abstractC1228au, C1229av c1229av) {
        m3853a(i, abstractC1228au, c1229av, -1L);
    }

    /* JADX INFO: renamed from: a */
    public final void m3853a(int i, AbstractC1228au abstractC1228au, C1229av c1229av, long j) {
        if (abstractC1228au == null) {
            return;
        }
        synchronized (abstractC1228au) {
            m3850e(i, abstractC1228au);
        }
        this.f5003e.post(new Runnable() { // from class: com.anythink.core.common.n.c.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f5037a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1228au f5038b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C1229av f5039c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f5040d;

            public AnonymousClass1(int i2, AbstractC1228au abstractC1228au2, C1229av c1229av2, long j2) {
                i = i2;
                abstractC1228au = abstractC1228au2;
                c1229av = c1229av2;
                j = j2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1244i c1244iM3838a = C1320c.m3838a(C1320c.this, i, abstractC1228au, c1229av, j);
                if (c1244iM3838a == null) {
                    return;
                }
                C1320c.super.m3797a(c1244iM3838a, C1320c.m3846b(i, abstractC1228au));
            }
        });
    }

    @Override // com.anythink.core.common.AbstractC1311m
    /* JADX INFO: renamed from: a */
    public final void mo3798a(List<C1244i> list) {
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b == null) {
            new C1287o(this.f5002d, 0, list).mo3639a(0, (InterfaceC1283k) null);
            return;
        }
        int iM4778w = c1391aM4865b.m4778w();
        if (iM4778w == 1) {
            C1273e c1273e = new C1273e(list);
            c1273e.m3656a(1, c1391aM4865b.m4777v());
            c1273e.m3657a((AbstractC1271c.a) null);
        } else {
            if (iM4778w != 2) {
                new C1287o(this.f5002d, c1391aM4865b.m4778w(), list).mo3639a(0, (InterfaceC1283k) null);
                return;
            }
            new C1287o(this.f5002d, c1391aM4865b.m4778w(), list).mo3639a(0, (InterfaceC1283k) null);
            C1273e c1273e2 = new C1273e(list);
            c1273e2.m3656a(2, c1391aM4865b.m4777v());
            c1273e2.m3657a((AbstractC1271c.a) null);
        }
    }
}
