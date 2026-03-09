package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.basead.C1118b;
import com.anythink.core.common.p050a.C1149a;
import com.anythink.core.common.p050a.C1151c;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1225ar;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1230aw;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1238c;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p037a.C1086a;
import com.anythink.core.p037a.C1088c;
import com.anythink.core.p038b.C1111f;
import com.anythink.core.p072d.C1396f;
import com.anythink.expressad.foundation.p116d.C1796r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.a */
/* JADX INFO: loaded from: classes.dex */
public class C1148a {

    /* JADX INFO: renamed from: a */
    private static volatile C1148a f2905a;

    /* JADX INFO: renamed from: b */
    private final String f2906b = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, List<C1234b>> f2907c = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, C1230aw> f2908d = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: com.anythink.core.common.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f2909a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1243h f2910b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1234b f2911c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ATBaseAdAdapter f2912d;

        public AnonymousClass1(Context context, C1243h c1243h, C1234b c1234b, ATBaseAdAdapter aTBaseAdAdapter) {
            context = context;
            c1243h = c1243h;
            c1234b = c1234b;
            aTBaseAdAdapter = aTBaseAdAdapter;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1086a.m1566a(context).m1570a(c1243h.m2679aj(), c1243h.m2677ah(), c1243h.m3026F());
            C1088c.m1577a();
            C1088c.m1578a(c1243h.m2677ah());
            C1088c.m1577a().m1580a(c1243h.m2677ah(), c1243h.m3026F());
            C1148a.this.m1917a(c1234b);
            C1148a.this.m1919b(c1234b);
            MediationBidManager mediationBidManagerM1716b = C1111f.m1708a().m1716b();
            if (mediationBidManagerM1716b != null) {
                mediationBidManagerM1716b.notifyWinnerDisplay(c1243h.m2677ah(), aTBaseAdAdapter.getUnitGroupInfo());
            }
        }
    }

    private C1148a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1148a m1904a() {
        if (f2905a == null) {
            synchronized (C1148a.class) {
                if (f2905a == null) {
                    f2905a = new C1148a();
                }
            }
        }
        return f2905a;
    }

    /* JADX INFO: renamed from: a */
    private static String m1905a(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: a */
    private static void m1906a(ATBaseAdAdapter aTBaseAdAdapter, String str, String str2, C1396f c1396f, C1229av c1229av, Map<String, Object> map) {
        Map<String, Object> mapM4570b = C1387u.m4556a().m4570b(str2);
        int[] iArr = {0};
        if (mapM4570b.containsKey(AbstractC1228au.f3898N)) {
            try {
                iArr[0] = ((Integer) mapM4570b.get(AbstractC1228au.f3898N)).intValue();
            } catch (Throwable unused) {
            }
        }
        C1243h c1243hM4251a = C1358v.m4251a(str, str2, c1396f, 0, iArr[0], map, null);
        C1358v.m4253a(c1243hM4251a, c1229av, 0, true);
        C1358v.m4250a(aTBaseAdAdapter, c1243hM4251a, c1229av);
        c1243hM4251a.f4213q = 3;
        c1243hM4251a.m3091g(aTBaseAdAdapter.getInternalNetworkPlacementId());
        aTBaseAdAdapter.setRefresh(false);
    }

    /* JADX INFO: renamed from: a */
    private void m1907a(String str, List<C1234b> list) {
        synchronized (C1387u.m4556a().m4560a(str)) {
            List<C1234b> arrayList = this.f2907c.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f2907c.put(str, arrayList);
            }
            if (arrayList.size() == 0) {
                arrayList.addAll(list);
            } else {
                C1229av unitGroupInfo = list.get(0).m2904d().getUnitGroupInfo();
                double dM4129a = C1344h.m4129a(unitGroupInfo);
                for (int i = 0; i < arrayList.size(); i++) {
                    C1229av unitGroupInfo2 = arrayList.get(i).m2904d().getUnitGroupInfo();
                    double dM4129a2 = C1344h.m4129a(unitGroupInfo2);
                    if (dM4129a <= dM4129a2 && (dM4129a != dM4129a2 || unitGroupInfo.m2759al() >= unitGroupInfo2.m2759al())) {
                        if (i == arrayList.size() - 1) {
                            arrayList.addAll(list);
                            break;
                        }
                    }
                    arrayList.addAll(i, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1908a(JSONArray jSONArray, int i, String str, int i2, String str2, boolean z, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("priority", i);
            jSONObject.put("unit_id", str);
            jSONObject.put("nw_firm_id", i2);
            jSONObject.put("nw_ver", str2);
            jSONObject.put(C1796r.f10844ah, z ? 1 : 0);
            if (i3 != -1) {
                jSONObject.put(C1796r.f10839ac, i3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jSONArray.put(jSONObject);
    }

    /* JADX INFO: renamed from: b */
    private static void m1909b(String str, C1229av c1229av) {
        if (c1229av == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("Clean own ad cache :");
        sb.append(c1229av.m2842u());
        sb.append("|||");
        sb.append(c1229av.m2826m());
        sb.append("|||");
        sb.append(c1229av.m2784d());
        int iM2826m = c1229av.m2826m();
        if (iM2826m != 3) {
            if (iM2826m == 4) {
                C1118b.m1736a();
                Context contextM2148f = C1175n.m2059a().m2148f();
                C1118b.m1736a();
                C1118b.m1741b(contextM2148f, C1118b.m1739a(str, c1229av.m2842u(), c1229av.m2784d()));
                return;
            }
            if (iM2826m != 7) {
                return;
            }
        }
        C1252q c1252qM2719M = c1229av.m2719M();
        C1151c.m1933a().m1937a(str, c1229av.m2842u());
        if (c1252qM2719M == null || TextUtils.isEmpty(c1252qM2719M.token)) {
            return;
        }
        C1149a.m1921a().m1932b(C1175n.m2059a().m2148f(), c1252qM2719M.token);
    }

    /* JADX INFO: renamed from: a */
    public final C1230aw m1910a(String str, C1229av c1229av) {
        return this.f2908d.get(m1905a(str, c1229av.m2842u()));
    }

    /* JADX INFO: renamed from: a */
    public final C1234b m1911a(Context context, String str) {
        synchronized (C1387u.m4556a().m4560a(str)) {
            List<C1234b> listM1913a = m1913a(context, str, false, false, false, (Map<String, Object>) null, (C1238c) null);
            if (listM1913a == null || listM1913a.size() <= 0) {
                return null;
            }
            return listM1913a.get(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1234b m1912a(Context context, String str, boolean z, boolean z3, Map<String, Object> map, C1238c c1238c) {
        synchronized (C1387u.m4556a().m4560a(str)) {
            List<C1234b> listM1913a = m1913a(context, str, z, z3, false, map, c1238c);
            if (listM1913a == null || listM1913a.size() <= 0) {
                return null;
            }
            return listM1913a.get(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x02ac A[Catch: all -> 0x0444, TRY_LEAVE, TryCatch #1 {, blocks: (B:210:0x0013, B:212:0x0027, B:214:0x0029, B:216:0x0046, B:217:0x004a, B:219:0x0050, B:221:0x0059, B:222:0x005d, B:226:0x007b, B:228:0x0081, B:229:0x0098, B:233:0x00a9, B:235:0x00b3, B:236:0x00ca, B:240:0x00e0, B:242:0x0114, B:245:0x013d, B:247:0x0159, B:250:0x0164, B:252:0x016a, B:254:0x0174, B:255:0x0190, B:248:0x015d, B:257:0x0192, B:260:0x019e, B:262:0x01c8, B:264:0x01d1, B:265:0x01d4, B:267:0x01dc, B:271:0x01ec, B:275:0x01fb, B:278:0x01ff, B:280:0x0204, B:281:0x0229, B:283:0x022b, B:290:0x023f, B:292:0x025d, B:294:0x0263, B:298:0x026d, B:301:0x0275, B:303:0x0286, B:304:0x028a, B:306:0x0290, B:308:0x029c, B:313:0x02ac, B:362:0x03e0, B:365:0x03e8, B:370:0x0416, B:372:0x0432, B:373:0x0442, B:356:0x03d3, B:286:0x0234), top: B:383:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03d5  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.anythink.core.common.p055f.C1234b> m1913a(android.content.Context r29, java.lang.String r30, boolean r31, boolean r32, boolean r33, java.util.Map<java.lang.String, java.lang.Object> r34, com.anythink.core.common.p055f.C1238c r35) {
        /*
            Method dump skipped, instruction units count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1148a.m1913a(android.content.Context, java.lang.String, boolean, boolean, boolean, java.util.Map, com.anythink.core.common.f.c):java.util.List");
    }

    /* JADX INFO: renamed from: a */
    public final List<C1234b> m1914a(String str) {
        List<C1234b> list = this.f2907c.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        Object objM4560a = C1387u.m4556a().m4560a(str);
        ArrayList arrayList = new ArrayList();
        synchronized (objM4560a) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List<C1234b> m1915a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list, long j) {
        C1225ar c1225ar;
        C1229av unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        C1243h trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        String strM1905a = m1905a(str, aTBaseAdAdapter.getUnitGroupInfo().m2842u());
        C1230aw c1230aw = this.f2908d.get(strM1905a);
        if (c1230aw == null) {
            c1230aw = new C1230aw(str, unitGroupInfo.m2842u());
            this.f2908d.put(strM1905a, c1230aw);
        }
        c1230aw.m2857a(unitGroupInfo.m2761an());
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() <= 0) {
            C1234b c1234b = new C1234b();
            c1234b.m2896a(aTBaseAdAdapter);
            c1234b.m2903c(System.currentTimeMillis());
            c1234b.m2901b(j);
            c1234b.m2895a(unitGroupInfo.m2700B());
            arrayList.add(c1234b);
            c1225ar = new C1225ar(trackingInfo.m2678ai(), arrayList);
        } else {
            for (BaseAd baseAd : list) {
                baseAd.setTrackingInfo(aTBaseAdAdapter.getTrackingInfo().m3045V());
                C1234b c1234b2 = new C1234b();
                c1234b2.m2896a(aTBaseAdAdapter);
                c1234b2.m2897a(baseAd);
                c1234b2.m2903c(System.currentTimeMillis());
                c1234b2.m2901b(j);
                c1234b2.m2895a(unitGroupInfo.m2700B());
                arrayList.add(c1234b2);
            }
            c1225ar = new C1225ar(trackingInfo.m2678ai(), arrayList);
        }
        c1230aw.m2859a(trackingInfo.m2678ai(), c1225ar);
        if (arrayList.size() == 0) {
            return arrayList;
        }
        m1907a(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m1916a(Context context, C1234b c1234b) {
        ATBaseAdAdapter aTBaseAdAdapterM2904d = c1234b.m2904d();
        C1243h c1243hM2908h = c1234b.m2908h();
        C1229av unitGroupInfo = aTBaseAdAdapterM2904d != null ? aTBaseAdAdapterM2904d.getUnitGroupInfo() : null;
        if (c1243hM2908h != null) {
            C1201f c1201fM4559a = C1387u.m4556a().m4559a(c1243hM2908h.m2677ah(), c1243hM2908h.m2679aj());
            if (c1201fM4559a != null) {
                c1201fM4559a.m2393a(c1243hM2908h.m2678ai(), unitGroupInfo != null ? C1344h.m4129a(unitGroupInfo) : 0.0d, unitGroupInfo);
            } else {
                C1322e.m3913a("AdManage is null--Show", "Id:" + c1243hM2908h.m2677ah() + "--format:" + c1243hM2908h.m2679aj() + "--adsource:" + c1243hM2908h.m3026F(), C1175n.m2059a().m2168q());
            }
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.a.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f2909a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1243h f2910b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C1234b f2911c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ATBaseAdAdapter f2912d;

                public AnonymousClass1(Context context2, C1243h c1243hM2908h2, C1234b c1234b2, ATBaseAdAdapter aTBaseAdAdapterM2904d2) {
                    context = context2;
                    c1243h = c1243hM2908h2;
                    c1234b = c1234b2;
                    aTBaseAdAdapter = aTBaseAdAdapterM2904d2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1086a.m1566a(context).m1570a(c1243h.m2679aj(), c1243h.m2677ah(), c1243h.m3026F());
                    C1088c.m1577a();
                    C1088c.m1578a(c1243h.m2677ah());
                    C1088c.m1577a().m1580a(c1243h.m2677ah(), c1243h.m3026F());
                    C1148a.this.m1917a(c1234b);
                    C1148a.this.m1919b(c1234b);
                    MediationBidManager mediationBidManagerM1716b = C1111f.m1708a().m1716b();
                    if (mediationBidManagerM1716b != null) {
                        mediationBidManagerM1716b.notifyWinnerDisplay(c1243h.m2677ah(), aTBaseAdAdapter.getUnitGroupInfo());
                    }
                }
            }, 2, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1917a(C1234b c1234b) {
        if (c1234b == null) {
            return;
        }
        C1243h c1243hM2908h = c1234b.m2908h();
        m1909b(c1243hM2908h.m2677ah(), c1234b.m2904d().getUnitGroupInfo());
        C1230aw c1230aw = this.f2908d.get(m1905a(c1243hM2908h.m2677ah(), c1243hM2908h.m3026F()));
        if (c1230aw == null) {
            return;
        }
        c1230aw.m2858a(c1234b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1918a(String str, C1229av c1229av, String str2) {
        synchronized (C1387u.m4556a().m4560a(str)) {
            List<C1234b> list = this.f2907c.get(str);
            if (list != null) {
                for (C1234b c1234b : list) {
                    if (TextUtils.equals(c1234b.m2908h().m3026F(), c1229av.m2842u()) && TextUtils.equals(c1234b.m2908h().m2678ai(), str2)) {
                        m1917a(c1234b);
                        m1919b(c1234b);
                        c1234b.m2912l();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1919b(C1234b c1234b) {
        if (c1234b == null) {
            return;
        }
        String strM2677ah = c1234b.m2908h().m2677ah();
        synchronized (C1387u.m4556a().m4560a(strM2677ah)) {
            List<C1234b> list = this.f2907c.get(strM2677ah);
            if (list != null) {
                list.remove(c1234b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1920b(String str) {
        synchronized (C1387u.m4556a().m4560a(str)) {
            List<C1234b> list = this.f2907c.get(str);
            if (list != null) {
                Collections.sort(list);
            }
        }
    }
}
