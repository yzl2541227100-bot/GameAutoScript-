package com.anythink.core.common.p066o;

import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1251p;
import com.anythink.core.p038b.p042d.C1108a;
import com.anythink.core.p072d.C1396f;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.o.b */
/* JADX INFO: loaded from: classes.dex */
public class C1333b {

    /* JADX INFO: renamed from: a */
    private static final String f5168a = "b";

    /* JADX INFO: renamed from: a */
    public static void m3988a(C1396f c1396f, Map<String, Object> map, C1229av c1229av, C1251p c1251p) {
        double d;
        boolean z;
        if (c1251p == null) {
            return;
        }
        double dM3400h = c1251p.m3400h();
        double d2 = 0.0d;
        if (dM3400h < 0.0d) {
            return;
        }
        int iM3401i = c1251p.m3401i();
        boolean zM3402j = c1251p.m3402j();
        List<Integer> listM5111e = c1396f.m5111e();
        if (listM5111e == null) {
            return;
        }
        boolean zM2821k = c1229av.m2821k();
        int i = 2;
        if (iM3401i != 22) {
            double dM1663b = C1108a.m1663b(c1229av);
            double dM1654a = C1108a.m1654a(dM3400h, dM1663b);
            if (!(zM2821k && listM5111e.contains(4)) && (zM2821k || !listM5111e.contains(2))) {
                d2 = dM1663b;
                d = dM1654a;
                i = 5;
                z = false;
            } else {
                d2 = dM1663b;
                d = dM1654a;
                i = 5;
                z = true;
            }
        } else if (!(zM2821k && listM5111e.contains(3)) && (zM2821k || !listM5111e.contains(1))) {
            d = dM3400h;
            z = false;
        } else {
            d = dM3400h;
            z = true;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("fillBiddingWinnerParams, no need to transfer bidding info,  \n last winner is baidu: ");
            sb.append(iM3401i == 22);
            sb.append(" \n current ad is bidding type: ");
            sb.append(zM2821k);
            sb.append(" \n baiduRequestBidTypeList: ");
            sb.append(listM5111e.toString());
            return;
        }
        double d3 = d;
        int iM5031C = (int) ((d / c1396f.m5031C()) * 100.0d);
        int i2 = zM3402j ? 3 : 1;
        boolean zM3397e = c1251p.m3397e();
        StringBuilder sb2 = new StringBuilder("fillBiddingWinnerParams, need to transfer bidding info, current unitGroupInfo: ");
        sb2.append(c1229av);
        sb2.append(" \n last winner is baidu: ");
        sb2.append(iM3401i == 22);
        sb2.append(" \n current ad is bidding type: ");
        sb2.append(zM2821k);
        sb2.append(" \n baiduRequestBidTypeList: ");
        sb2.append(listM5111e.toString());
        sb2.append(" --> \n pr rate: ");
        sb2.append(d2);
        sb2.append(" \n origin winner price: ");
        sb2.append(dM3400h);
        sb2.append(" \n pr winner price: ");
        sb2.append(d3);
        sb2.append(" \n A: ");
        sb2.append(i);
        sb2.append(" \n B: ");
        sb2.append(iM5031C);
        sb2.append(" \n C: ");
        sb2.append(i2);
        sb2.append(" \n S: ");
        sb2.append(zM3397e ? 1 : 0);
        map.put(C1169h.p.f3238q, Integer.valueOf(i));
        map.put(C1169h.p.f3239r, Integer.valueOf(iM5031C));
        map.put(C1169h.p.f3240s, Integer.valueOf(i2));
        map.put(C1169h.p.f3241t, Integer.valueOf(zM3397e ? 1 : 0));
    }
}
