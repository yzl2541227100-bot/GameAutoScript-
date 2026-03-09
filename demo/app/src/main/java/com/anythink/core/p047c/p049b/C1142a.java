package com.anythink.core.p047c.p049b;

import com.anythink.core.p047c.p048a.C1137a;
import com.anythink.core.p047c.p048a.C1139c;
import com.anythink.core.p047c.p048a.C1140d;
import com.anythink.core.p072d.C1394d;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1142a {

    /* JADX INFO: renamed from: b */
    public C1146e f2859b;

    /* JADX INFO: renamed from: c */
    private final String f2860c = C1142a.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public Map<String, C1139c> f2858a = new ConcurrentHashMap();

    public C1142a(C1146e c1146e) {
        this.f2859b = c1146e;
    }

    /* JADX INFO: renamed from: a */
    private C1140d m1867a(String str, int i, C1394d c1394d) {
        C1139c c1139c = this.f2858a.get(str);
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
            c1139c.m1854a(i2, this.f2859b.m1898a(str, i2, calendar.getTimeInMillis(), iM4881c));
            this.f2858a.put(str, c1139c);
        } else {
            c1139c.m1859c(i);
        }
        return c1139c.m1857b(i2);
    }

    /* JADX INFO: renamed from: a */
    private List<C1137a> m1868a(String str, int i, C1394d c1394d, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (((c1394d.m4880b() * 24) * 60) * 60)) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return this.f2859b.m1898a(str, i, calendar.getTimeInMillis(), i2);
    }

    /* JADX INFO: renamed from: a */
    private void m1869a(String str, C1137a c1137a) {
        C1139c c1139c = this.f2858a.get(str);
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
}
