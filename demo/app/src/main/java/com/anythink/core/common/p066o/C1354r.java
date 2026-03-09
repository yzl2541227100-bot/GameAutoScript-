package com.anythink.core.common.p066o;

import androidx.annotation.WorkerThread;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1179c;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1222ao;
import com.anythink.core.common.p055f.C1223ap;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1230aw;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1240e;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p057g.InterfaceC1266d;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.p037a.C1086a;
import com.anythink.core.p037a.C1088c;
import com.anythink.core.p038b.C1111f;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.core.p047c.C1136a;
import com.anythink.core.p047c.C1141b;
import com.anythink.core.p047c.p048a.C1140d;
import com.anythink.core.p072d.C1394d;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1403m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.anythink.core.common.o.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1354r {

    /* JADX INFO: renamed from: a */
    public static Random f5340a = new Random();

    /* JADX INFO: renamed from: b */
    private static final String f5341b = "PlacementPrepareUtils";

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public static final C1223ap m4225a(C1396f c1396f, C1243h c1243h) {
        List<C1229av> listM4227a;
        List<C1229av> listM5174a;
        List<C1229av> listM5181c;
        List<C1229av> listM5182d;
        if (c1396f == null) {
            return null;
        }
        if (c1243h.m3047X()) {
            StringBuilder sb = new StringBuilder("Placement：");
            sb.append(c1243h.m2677ah());
            sb.append("::::SegmentId：");
            sb.append(c1243h.m3040Q());
            sb.append("--adx network mode-----------------------------------------------|");
            listM4227a = new ArrayList<>();
            listM5174a = C1403m.m5175a(c1396f, c1396f.m5044P());
            listM5182d = new ArrayList<>();
            listM5181c = new ArrayList<>();
        } else {
            StringBuilder sb2 = new StringBuilder("Placement：");
            sb2.append(c1243h.m2677ah());
            sb2.append("::::SegmentId：");
            sb2.append(c1243h.m3040Q());
            sb2.append("--dynamic waterfall start-----------------------------------------------|");
            listM4227a = m4227a(c1243h, c1396f, C1403m.m5180b(c1396f));
            StringBuilder sb3 = new StringBuilder("Placement：");
            sb3.append(c1243h.m2677ah());
            sb3.append("::::SegmentId：");
            sb3.append(c1243h.m3040Q());
            sb3.append("--dynamic waterfall end_________________________________________________|");
            listM5174a = C1403m.m5174a(c1396f);
            listM5181c = C1403m.m5181c(c1396f);
            C1136a.m1806a().m1813a(c1243h, listM4227a, c1396f);
            C1136a.m1806a().m1813a(c1243h, listM5181c, c1396f);
            listM5182d = C1403m.m5182d(c1396f);
        }
        C1223ap c1223ap = new C1223ap(c1396f, c1243h, listM4227a.size() + listM5174a.size() + listM5182d.size() + listM5181c.size());
        c1223ap.m2619a(listM4227a);
        c1223ap.m2621b(listM5174a);
        c1223ap.m2623c(listM5182d);
        c1223ap.m2625d(listM5181c);
        m4228a(c1396f, c1223ap.m2622c(), listM4227a);
        m4228a(c1396f, c1223ap.m2622c(), listM5174a);
        m4228a(c1396f, c1223ap.m2622c(), listM5182d);
        m4228a(c1396f, c1223ap.m2622c(), listM5181c);
        return c1223ap;
    }

    /* JADX INFO: renamed from: a */
    public static List<C1229av> m4226a(final C1223ap c1223ap, List<C1229av> list) {
        return C1344h.m4136a(list, new InterfaceC1266d() { // from class: com.anythink.core.common.o.r.1
            @Override // com.anythink.core.common.p057g.InterfaceC1266d
            /* JADX INFO: renamed from: a */
            public final void mo3613a(C1229av c1229av, int i, int i2) {
                c1229av.m2703C(i);
                if (i2 >= 0) {
                    c1229av.m2701B(i2);
                    C1230aw c1230awM1910a = C1148a.m1904a().m1910a(c1223ap.m2622c().m2677ah(), c1229av);
                    if (c1230awM1910a != null) {
                        c1230awM1910a.m2860b(c1229av.m2759al());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static List<C1229av> m4227a(C1243h c1243h, C1396f c1396f, List<C1229av> list) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        if (C1175n.m2059a().m2175v()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c1243h.m2677ah());
            sb3.append(":::In debugger mode, return the origin list.");
            return list;
        }
        C1394d c1394dM5108b = c1396f.m5108b();
        if (c1394dM5108b == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c1243h.m2677ah());
            sb4.append(":::Dynamic Waterfall Strategy is null, return the origin list.");
            return list;
        }
        if (list.size() <= c1394dM5108b.m4884f()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c1243h.m2677ah());
            sb5.append(":::Waterfall's size is lower than dynamicWaterfallStrategy.getPremiumLevel(), return the origin list.");
            return list;
        }
        C1140d c1140dM1861a = C1141b.m1860a().m1861a(c1243h.m2677ah(), c1396f, c1394dM5108b);
        if (c1140dM1861a != null) {
            double d = c1140dM1861a.f2854a;
            if (d > 0.0d) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(c1243h.m2677ah());
                sb6.append(":::RecentLoadedHighPriceInfo:");
                sb6.append(c1140dM1861a.toString());
                double dM4883e = c1394dM5108b.m4883e() * d;
                if (C1344h.m4129a(list.get(0)) <= dM4883e) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(c1243h.m2677ah());
                    sb7.append(":::Waterfall's first price is lower than lastHighestPrice, return the origin list.");
                    return list;
                }
                int size = list.size() - 1;
                int size2 = list.size() - 1;
                HashMap map = new HashMap();
                for (int i = 0; i < list.size(); i++) {
                    double dM4129a = C1344h.m4129a(list.get(i));
                    if (!map.containsKey(String.valueOf(dM4129a))) {
                        map.put(String.valueOf(dM4129a), Integer.valueOf(i));
                    }
                    if (size2 == list.size() - 1) {
                        if (dM4129a == d) {
                            size2 = i - c1394dM5108b.m4884f();
                            sb2 = new StringBuilder();
                            sb2.append(c1243h.m2677ah());
                            str2 = ":::loopPrice == lastHighestPrice Set overLayerIndex to ";
                        } else if (dM4129a < d) {
                            if (i > 0) {
                                size2 = ((Integer) map.get(String.valueOf(C1344h.m4129a(list.get(i - 1))))).intValue() - c1394dM5108b.m4884f();
                                sb2 = new StringBuilder();
                                sb2.append(c1243h.m2677ah());
                                str2 = ":::i - 1 >= 0 : loopPrice < lastHighestPrice Set overLayerIndex to ";
                            } else {
                                size2 = i - c1394dM5108b.m4884f();
                                sb2 = new StringBuilder();
                                sb2.append(c1243h.m2677ah());
                                str2 = ":::loopPrice < lastHighestPrice Set overLayerIndex to ";
                            }
                        }
                        sb2.append(str2);
                        sb2.append(size2);
                    }
                    if (size == list.size() - 1) {
                        if (dM4129a == dM4883e) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(c1243h.m2677ah());
                            sb8.append(":::loopPrice == overflowPrice Set overLayerIndex to ");
                            sb8.append(size2);
                            size = i;
                        } else if (dM4129a < dM4883e) {
                            size = i - 1;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(c1243h.m2677ah());
                            sb9.append(":::loopPrice < overflowPrice Set overLayerIndex to ");
                            sb9.append(size2);
                        }
                    }
                    if (size <= 0 || size2 <= 0) {
                        sb = new StringBuilder();
                        sb.append(c1243h.m2677ah());
                        str = ":::overIndex <= 0 :overflowPriceIndex:";
                        sb.append(str);
                        sb.append(size);
                        sb.append("---overLayerIndex:");
                        sb.append(size2);
                        break;
                    }
                    if (size < list.size() - 1 && size2 < list.size() - 1) {
                        sb = new StringBuilder();
                        sb.append(c1243h.m2677ah());
                        str = ":::overIndex has found :overflowPriceIndex:";
                        sb.append(str);
                        sb.append(size);
                        sb.append("---overLayerIndex:");
                        sb.append(size2);
                        break;
                    }
                }
                int iMin = Math.min(size, size2);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(c1243h.m2677ah());
                sb10.append(":::the first finalIndex: ");
                sb10.append(iMin);
                if (iMin <= 0) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(c1243h.m2677ah());
                    sb11.append(":::finalIndex <= 0 , return the origin list.");
                    return list;
                }
                C1229av c1229av = list.get(iMin);
                double dM4129a2 = C1344h.m4129a(c1229av);
                String strM2842u = c1229av.m2842u();
                Integer num = (Integer) map.get(String.valueOf(dM4129a2));
                if (num != null) {
                    iMin = num.intValue();
                    strM2842u = list.get(iMin).m2842u();
                }
                String str3 = strM2842u;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(c1243h.m2677ah());
                sb12.append(":::after the same price : first finalIndex: ");
                sb12.append(iMin);
                StringBuilder sb13 = new StringBuilder();
                sb13.append(c1243h.m2677ah());
                sb13.append(":::Final Waterfall List: ");
                List<C1229av> listSubList = list.subList(iMin, list.size());
                C1322e.m3883a(c1243h, c1394dM5108b, c1140dM1861a.f2855b, d, str3, dM4129a2);
                return listSubList;
            }
        }
        StringBuilder sb14 = new StringBuilder();
        sb14.append(c1243h.m2677ah());
        sb14.append(":::lastHighestPrice <= 0, return the origin list.");
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0004 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m4228a(com.anythink.core.p072d.C1396f r16, com.anythink.core.common.p055f.C1243h r17, java.util.List<com.anythink.core.common.p055f.C1229av> r18) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p066o.C1354r.m4228a(com.anythink.core.d.f, com.anythink.core.common.f.h, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    private static void m4229a(List<C1229av> list, List<C1229av> list2, C1243h c1243h, List<C1229av> list3) {
        String strM2677ah = c1243h.m2677ah();
        if (list == null || list2 == null) {
            return;
        }
        boolean z = false;
        for (int size = list2.size() - 1; size >= 0; size--) {
            C1229av c1229av = list2.get(size);
            if (c1229av.m2748aa()) {
                list3.add(c1229av);
            }
            if (c1229av.m2828n() != 2) {
                C1230aw c1230awM1910a = C1148a.m1904a().m1910a(strM2677ah, c1229av);
                C1229av c1229av2 = null;
                C1234b c1234bM2975a = c1230awM1910a != null ? c1230awM1910a.m2856a((C1252q) null).m2975a() : null;
                if (c1234bM2975a != null) {
                    c1229av.m2738a(c1234bM2975a.m2904d().getUnitGroupInfo(), 0, 3, 1);
                    StringBuilder sb = new StringBuilder("CacehMotify:Not real time bidding, max price cache:");
                    sb.append(C1344h.m4129a(c1229av));
                    sb.append("\n");
                    sb.append(c1229av.toString());
                    c1229av2 = c1229av;
                }
                if (c1229av2 == null) {
                    try {
                        C1252q c1252qM1712a = C1111f.m1708a().m1712a(strM2677ah, c1229av);
                        if (c1252qM1712a != null && !c1252qM1712a.m3411a()) {
                            c1229av.m2739a(c1252qM1712a, 0, 2, 1);
                            c1229av2 = c1229av;
                        } else if (c1252qM1712a != null) {
                            C1109b.m1674a(c1252qM1712a, new C1260y(1, c1229av, c1243h), true);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (c1229av2 != null) {
                    try {
                        if (c1229av.m2826m() == 7) {
                            z = true;
                        }
                        list2.remove(size);
                        C1344h.m4140a(list, c1229av);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (z) {
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                if (list2.get(size2).m2826m() == 7) {
                    list2.remove(size2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4230a(int i, C1396f c1396f, C1243h c1243h, C1229av c1229av) {
        C1240e c1240eM4571c;
        C1243h c1243hM3045V = c1243h.m3045V();
        String strM2677ah = c1243h.m2677ah();
        C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
        C1222ao.a aVarM1567a = C1086a.m1566a(C1175n.m2059a().m2148f()).m1567a(strM2677ah, c1229av.m2842u(), c1396f.m5090ah());
        int i2 = aVarM1567a != null ? aVarM1567a.f3872e : 0;
        int i3 = aVarM1567a != null ? aVarM1567a.f3871d : 0;
        if (C1086a.m1566a(C1175n.m2059a().m2148f()).m1572a(strM2677ah, c1229av, c1396f.m5090ah())) {
            c1229av.m2801g(-5);
            c1229av.m2808h("Out of Cap");
            C1352p.m4209a(strM2677ah, c1243h, "Out of Cap", c1229av, i2, i3);
            C1322e.m3878a(c1243hM3045V, 2, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
            return true;
        }
        if (C1088c.m1577a().m1581a(strM2677ah, c1229av)) {
            c1229av.m2801g(-6);
            c1229av.m2808h("Out of Pacing");
            C1352p.m4209a(strM2677ah, c1243h, "Out of Pacing", c1229av, i2, i3);
            C1322e.m3878a(c1243hM3045V, 3, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
            return true;
        }
        if (C1179c.m2193a().m2199a(c1229av)) {
            c1229av.m2801g(-6);
            c1229av.m2808h("Request fail in pacing");
            C1352p.m4209a(strM2677ah, c1243h, "Request fail in pacing", c1229av, i2, i3);
            C1322e.m3878a(c1243hM3045V, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
            return true;
        }
        List<String> listM2162m = C1175n.m2059a().m2162m(strM2677ah);
        if (listM2162m != null && listM2162m.contains(c1229av.m2842u())) {
            c1229av.m2801g(-8);
            c1229av.m2808h("Request fail in filter list");
            C1352p.m4210a(strM2677ah, c1243h, "Request fail in filter list", c1229av, i2, i3, listM2162m);
            C1322e.m3878a(c1243hM3045V, 5, ErrorCode.getErrorCode(ErrorCode.filterSourceError, "", "Request fail in filter list"));
            return true;
        }
        List<String> listM2164n = C1175n.m2059a().m2164n(strM2677ah);
        if (listM2164n != null && listM2164n.contains(String.valueOf(c1229av.m2784d()))) {
            c1229av.m2801g(-8);
            c1229av.m2808h("Filter by network firm id.");
            C1352p.m4210a(strM2677ah, c1243h, "Filter by network firm id.", c1229av, i2, i3, listM2164n);
            C1322e.m3878a(c1243hM3045V, 9, ErrorCode.getErrorCode(ErrorCode.networkFirmIdfilterSourceError, "", "Filter by network firm id."));
            return true;
        }
        if (c1229av.m2821k()) {
            if (C1179c.m2193a().m2200b(c1229av)) {
                c1229av.m2801g(-7);
                c1229av.m2808h("Bid fail in pacing");
                C1352p.m4209a(strM2677ah, c1243h, "Bid fail in pacing", c1229av, i2, i3);
                C1322e.m3878a(c1243hM3045V, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                return true;
            }
            if (c1229av.m2729W() != 1 && c1229av.m2826m() == 2 && (c1240eM4571c = C1387u.m4556a().m4571c(strM2677ah)) != null && c1240eM4571c.m2974a(c1229av)) {
                c1229av.m2801g(-7);
                c1229av.m2808h("Can't Load On Showing");
                C1352p.m4209a(strM2677ah, c1243h, "Can't Load On Showing", c1229av, i2, i3);
                C1322e.m3878a(c1243h, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                return true;
            }
        }
        if (C1179c.m2193a().m2198a(i, c1396f, c1229av)) {
            c1229av.m2801g(-8);
            c1229av.m2808h("Error Code Request fail in pacing");
            C1352p.m4209a(strM2677ah, c1243h, "Error Code Request fail in pacing", c1229av, i2, i3);
            C1322e.m3878a(c1243hM3045V, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
            return true;
        }
        if (i == 0 || c1229av.m2746aD() != 1) {
            return false;
        }
        c1229av.m2808h("System splash not allow preload");
        C1352p.m4209a(strM2677ah, c1243h, "System splash not allow preload", c1229av, i2, i3);
        C1322e.m3878a(c1243hM3045V, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m4231b(C1223ap c1223ap, List<C1229av> list) {
        List<C1229av> listM2624d = c1223ap.m2624d();
        List<C1229av> listM2626e = c1223ap.m2626e();
        List<C1229av> listM2627f = c1223ap.m2627f();
        m4229a(listM2624d, listM2626e, c1223ap.m2622c(), list);
        m4229a(listM2624d, listM2627f, c1223ap.m2622c(), list);
    }
}
