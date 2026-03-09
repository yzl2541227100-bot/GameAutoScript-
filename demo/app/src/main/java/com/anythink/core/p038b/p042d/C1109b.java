package com.anythink.core.p038b.p042d;

import android.text.TextUtils;
import android.util.Log;
import cn.haorui.sdk.core.HRConfig;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.adx.C1117a;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p050a.C1149a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1237bc;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p058h.C1278f;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p038b.C1111f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1109b {

    /* JADX INFO: renamed from: a */
    public static final String f2642a = "b";

    /* JADX INFO: renamed from: b */
    public static final String f2643b = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: c */
    public static final String f2644c = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: d */
    public static final String f2645d = "${AUCTION_SEAT_ID}";

    /* JADX INFO: renamed from: e */
    public static final String f2646e = "${AUCTION_BID_TO_WIN}";

    /* JADX INFO: renamed from: f */
    public static final String f2647f = "${AUCTION_CURRENCY}";

    /* JADX INFO: renamed from: g */
    public static final String f2648g = "{__BIDDER__}";

    /* JADX INFO: renamed from: h */
    public static final int f2649h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f2650i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f2651j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f2652k = 4;

    /* JADX INFO: renamed from: l */
    public static final String f2653l = "102";

    /* JADX INFO: renamed from: m */
    public static final String f2654m = "103";

    /* JADX INFO: renamed from: n */
    public static final String f2655n = "2";

    /* JADX INFO: renamed from: com.anythink.core.b.d.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f2657b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f2658c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List f2659d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f2660e;

        public AnonymousClass1(long j, int i, List list, int i2) {
            j = j;
            i = i;
            list = list;
            i = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = C1109b.f2642a;
            JSONArray jSONArray = new JSONArray();
            c1243h.m3090g(j);
            c1243h.m3094h(System.currentTimeMillis());
            c1243h.f4213q = i;
            for (int i = 0; i < list.size(); i++) {
                C1229av c1229av = (C1229av) list.get(i);
                if (c1229av.m2826m() != 7 && c1229av.m2821k()) {
                    try {
                        int iM2832p = c1229av.m2832p();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sorttype", iM2832p);
                        jSONObject.put("unit_id", c1229av.m2842u());
                        jSONObject.put("bidresult", c1229av.m2721O());
                        jSONObject.put("bidprice", c1229av.m2718L() ? String.valueOf(c1229av.m2850y()) : "0");
                        jSONObject.put(C1294j.f4881ao, c1229av.m2718L() ? String.valueOf(c1229av.m2754ag()) : "0");
                        jSONObject.put("nw_firm_id", String.valueOf(c1229av.m2784d()));
                        jSONObject.put(C1233az.f4044m, c1229av.m2719M() != null ? c1229av.m2719M().f4438g : null);
                        jSONObject.put("rl_bid_status", c1229av.m2720N());
                        jSONObject.put("errormsg", c1229av.m2698A());
                        int iM2730X = c1229av.m2730X();
                        String strValueOf = String.valueOf(i);
                        if ("4".equals(strValueOf) || "2".equals(strValueOf) || "3".equals(strValueOf)) {
                            if (iM2730X == -1) {
                                try {
                                    iM2730X = Integer.parseInt(strValueOf);
                                } catch (Exception unused) {
                                }
                            }
                            jSONObject.put("ad_type", iM2730X);
                        }
                        jSONObject.put("ads_list_type", c1229av.m2733a());
                        jSONArray.put(jSONObject);
                    } catch (Exception unused2) {
                    }
                }
            }
            c1243h.m2687y(String.valueOf(i));
            c1243h.m3126r(jSONArray.toString());
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(11, c1243h);
        }
    }

    /* JADX INFO: renamed from: a */
    private static double m1666a(C1252q c1252q, double d) {
        double d2 = c1252q.f4443l;
        return d2 > 0.0d ? d * d2 : d;
    }

    /* JADX INFO: renamed from: a */
    private static C1229av m1667a(C1252q c1252q) {
        if (c1252q != null) {
            return c1252q.m3417f();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1668a(ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av, C1243h c1243h, BaseAd... baseAdArr) {
        C1252q c1252qM2719M;
        if (aTBaseAdAdapter == null || c1229av == null || (c1252qM2719M = c1229av.m2719M()) == null) {
            return;
        }
        Map<String, Object> networkInfoMap = (baseAdArr == null || baseAdArr.length <= 0 || baseAdArr[0] == null) ? aTBaseAdAdapter.getNetworkInfoMap() : baseAdArr[0].getNetworkInfoMap();
        C1237bc c1237bc = new C1237bc();
        C1243h c1243hM3045V = c1243h.m3045V();
        c1237bc.m2937a(c1243hM3045V);
        c1237bc.m2939a(networkInfoMap);
        c1237bc.m2936a(c1229av);
        if (c1237bc.m2943c() != 0) {
            c1229av.m2699A(c1237bc.m2943c());
        }
        c1252qM2719M.f4452u = c1237bc;
        if (networkInfoMap != null) {
            Object obj = networkInfoMap.get(ATAdConst.NETWORK_CUSTOM_KEY.WS_ACTION);
            if (obj instanceof C1252q.a) {
                c1252qM2719M.m3410a((C1252q.a) obj);
            }
        }
        if (c1243h.m3039P() == 66 && c1243hM3045V.m3047X()) {
            c1252qM2719M.m3408a(new C1117a(c1252qM2719M, c1229av, c1243hM3045V));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1669a(C1234b c1234b) {
        m1670a(c1234b, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m1670a(C1234b c1234b, boolean z) {
        try {
            C1229av unitGroupInfo = c1234b.m2904d().getUnitGroupInfo();
            C1243h c1243hM2908h = c1234b.m2908h();
            C1252q c1252qM2719M = unitGroupInfo.m2719M();
            if (c1252qM2719M != null) {
                m1674a(c1252qM2719M, new C1260y(z ? 2 : 1, unitGroupInfo, c1243hM2908h), true);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1671a(C1237bc c1237bc) {
        C1322e.m3876a(c1237bc);
    }

    /* JADX INFO: renamed from: a */
    public static void m1672a(C1243h c1243h, List<C1229av> list, long j, int i, int i2) {
        C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.d.b.1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f2657b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f2658c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ List f2659d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f2660e;

            public AnonymousClass1(long j2, int i3, List list2, int i22) {
                j = j2;
                i = i3;
                list = list2;
                i = i22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = C1109b.f2642a;
                JSONArray jSONArray = new JSONArray();
                c1243h.m3090g(j);
                c1243h.m3094h(System.currentTimeMillis());
                c1243h.f4213q = i;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    C1229av c1229av = (C1229av) list.get(i3);
                    if (c1229av.m2826m() != 7 && c1229av.m2821k()) {
                        try {
                            int iM2832p = c1229av.m2832p();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sorttype", iM2832p);
                            jSONObject.put("unit_id", c1229av.m2842u());
                            jSONObject.put("bidresult", c1229av.m2721O());
                            jSONObject.put("bidprice", c1229av.m2718L() ? String.valueOf(c1229av.m2850y()) : "0");
                            jSONObject.put(C1294j.f4881ao, c1229av.m2718L() ? String.valueOf(c1229av.m2754ag()) : "0");
                            jSONObject.put("nw_firm_id", String.valueOf(c1229av.m2784d()));
                            jSONObject.put(C1233az.f4044m, c1229av.m2719M() != null ? c1229av.m2719M().f4438g : null);
                            jSONObject.put("rl_bid_status", c1229av.m2720N());
                            jSONObject.put("errormsg", c1229av.m2698A());
                            int iM2730X = c1229av.m2730X();
                            String strValueOf = String.valueOf(i);
                            if ("4".equals(strValueOf) || "2".equals(strValueOf) || "3".equals(strValueOf)) {
                                if (iM2730X == -1) {
                                    try {
                                        iM2730X = Integer.parseInt(strValueOf);
                                    } catch (Exception unused) {
                                    }
                                }
                                jSONObject.put("ad_type", iM2730X);
                            }
                            jSONObject.put("ads_list_type", c1229av.m2733a());
                            jSONArray.put(jSONObject);
                        } catch (Exception unused2) {
                        }
                    }
                }
                c1243h.m2687y(String.valueOf(i));
                c1243h.m3126r(jSONArray.toString());
                C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(11, c1243h);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m1673a(C1252q c1252q, C1229av c1229av) {
        C1237bc c1237bc;
        if (c1252q == null || c1229av == null || (c1237bc = c1252q.f4452u) == null || c1252q.m3415d()) {
            return;
        }
        double dM4129a = C1344h.m4129a(c1229av);
        double d = c1252q.f4448q;
        double dM2933a = c1237bc.m2933a();
        double d2 = dM2933a > 0.0d ? dM2933a : d;
        double dM1656a = C1108a.m1656a(c1229av);
        double dM1655a = C1108a.m1655a(dM4129a, d2, dM1656a);
        c1237bc.m2934a(dM4129a);
        c1237bc.m2941b(d2);
        c1237bc.m2944c(dM1656a);
        c1237bc.m2946d(dM1655a);
        double dM1666a = m1666a(c1252q, dM4129a);
        double dM1666a2 = m1666a(c1252q, dM1655a);
        boolean zM2965w = c1237bc.m2965w();
        if (c1229av.m2732Z()) {
            C1149a.m1921a().m1930a(c1252q);
        }
        if (zM2965w) {
            String strM1660a = C1108a.m1660a(c1252q, c1237bc, dM1666a, dM1666a2);
            if (TextUtils.isEmpty(strM1660a)) {
                C1322e.m3876a(c1237bc);
            } else if (c1237bc != null) {
                C1278f.m3686a(strM1660a, c1237bc).mo3639a(0, (InterfaceC1283k) null);
            }
            ATBiddingNotice aTBiddingNotice = c1252q.biddingNotice;
            if (aTBiddingNotice != null) {
                try {
                    aTBiddingNotice.notifyBidWin(dM1666a, dM1666a2, new HashMap());
                } catch (Throwable th) {
                    th.printStackTrace();
                    Log.e("anythink", "notifyBidWin: error: " + th.getMessage());
                }
            }
            C1252q.a aVarM3420i = c1252q.m3420i();
            if (aVarM3420i != null) {
                HashMap map = new HashMap();
                map.put(f2646e, Double.valueOf(dM1666a2));
                map.put(f2648g, c1237bc.m2940b());
                aVarM3420i.mo280a(map);
            }
        } else {
            C1322e.m3876a(c1237bc);
        }
        c1252q.m3418g();
    }

    /* JADX INFO: renamed from: a */
    public static void m1674a(C1252q c1252q, C1260y c1260y, boolean z) {
        boolean zM2821k;
        boolean zEquals;
        int i;
        if (c1252q == null) {
            return;
        }
        if (z) {
            C1111f.m1708a().m1715a(c1260y.m3465j(), c1252q);
            if (c1260y.m3459d()) {
                C1149a.m1921a().m1932b(C1175n.m2059a().m2148f(), c1252q.token);
            }
        }
        if (c1252q.m3415d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(f2642a);
            sb.append(" [return] sendLossNotice, win or loss has been sent, do anything!\n bid id: ");
            sb.append(c1252q.token);
            return;
        }
        double sortPrice = c1252q.getSortPrice();
        int iM2784d = c1252q.f4435d;
        C1229av c1229avM3417f = c1252q != null ? c1252q.m3417f() : null;
        boolean z3 = true;
        if (c1229avM3417f != null) {
            sortPrice = C1344h.m4129a(c1229avM3417f);
            iM2784d = c1229avM3417f.m2784d();
            zM2821k = c1229avM3417f.m2821k();
        } else {
            zM2821k = true;
        }
        if (c1260y.m3460e() <= 0.0d || c1260y.m3460e() <= sortPrice) {
            z3 = zM2821k;
        } else {
            sortPrice = c1260y.m3460e();
            iM2784d = c1252q.f4435d;
        }
        double dM3455a = c1260y.m3455a();
        String strM3458c = c1260y.m3458c();
        if (dM3455a > 0.0d) {
            i = -1;
            zEquals = TextUtils.equals("102", strM3458c);
            sortPrice = dM3455a;
        } else {
            zEquals = z3;
            i = iM2784d;
        }
        int iM3461f = c1260y.m3461f();
        double sortPrice2 = c1252q.getSortPrice();
        int i2 = c1252q.f4435d;
        if (sortPrice <= sortPrice2) {
            sortPrice = 0.01d + sortPrice2;
        }
        double d = sortPrice;
        double dM3472q = c1260y.m3472q();
        double dM1654a = C1108a.m1654a(d, dM3472q);
        String strM1664b = strM3458c != null ? strM3458c : C1108a.m1664b(zEquals, iM3461f, i2);
        C1322e.m3899a(c1260y, d, strM1664b, dM3472q, dM1654a, c1252q.originPrice);
        double dM1666a = m1666a(c1252q, dM1654a);
        if (c1260y.m3459d()) {
            C1149a.m1921a().m1930a(c1252q);
        }
        if (c1260y.m3475t() && !strM1664b.equals(HRConfig.GENDER_UNKNOWN)) {
            synchronized (c1252q) {
                ATBiddingNotice aTBiddingNotice = c1252q.biddingNotice;
                if (aTBiddingNotice != null) {
                    HashMap map = new HashMap(3);
                    map.put(ATBiddingNotice.ADN_ID, Integer.valueOf(C1108a.m1657a(zEquals, i, i2)));
                    try {
                        aTBiddingNotice.notifyBidLoss(C1108a.m1662a(zEquals, iM3461f), dM1666a, map);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                    }
                }
            }
            String str = strM1664b;
            String strM1661a = C1108a.m1661a(c1252q, c1260y, i, zEquals, dM1666a, strM1664b);
            if (!TextUtils.isEmpty(strM1661a)) {
                m1676a(strM1661a);
            }
            C1252q.a aVarM3420i = c1252q.m3420i();
            if (aVarM3420i != null) {
                HashMap map2 = new HashMap();
                map2.put(f2643b, Double.valueOf(dM1666a));
                map2.put(f2648g, c1260y.m3457b());
                map2.put(f2644c, str);
                aVarM3420i.mo281b(map2);
            }
        }
        c1252q.m3416e();
        c1252q.m3418g();
    }

    /* JADX INFO: renamed from: a */
    public static void m1675a(C1252q c1252q, boolean z, double d, boolean z3) {
        String strReplace;
        if (c1252q == null) {
            return;
        }
        double d2 = c1252q.f4443l;
        String str = c1252q.f4441j;
        int i = c1252q.f4435d;
        if (d2 > 0.0d) {
            d *= d2;
        }
        if (z) {
            if (TextUtils.isEmpty(str)) {
                str = c1252q.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                strReplace = str.replace(f2643b, C1108a.m1659a(c1252q, d));
                m1676a(strReplace);
            }
        } else {
            String str2 = c1252q.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                strReplace = str2.replace(f2643b, C1108a.m1659a(c1252q, d)).replace(f2644c, C1108a.m1664b(z3, 2, i));
                m1676a(strReplace);
            }
        }
        synchronized (c1252q) {
            ATBiddingNotice aTBiddingNotice = c1252q.biddingNotice;
            if (aTBiddingNotice != null) {
                aTBiddingNotice.notifyBidDisplay(z, d);
                if (z) {
                    c1252q.m3416e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1676a(String str) {
        C1278f.m3685a(str).mo3639a(0, (InterfaceC1283k) null);
    }

    /* JADX INFO: renamed from: a */
    private static void m1677a(String str, C1237bc c1237bc) {
        if (c1237bc == null) {
            return;
        }
        C1278f.m3686a(str, c1237bc).mo3639a(0, (InterfaceC1283k) null);
    }
}
