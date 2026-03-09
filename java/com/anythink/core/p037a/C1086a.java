package com.anythink.core.p037a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1191l;
import com.anythink.core.common.p055f.C1222ao;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1086a {

    /* JADX INFO: renamed from: g */
    private static volatile C1086a f2508g;

    /* JADX INFO: renamed from: a */
    public C1191l f2509a;

    /* JADX INFO: renamed from: d */
    public Context f2512d;

    /* JADX INFO: renamed from: f */
    private final String f2514f = getClass().getSimpleName();

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap<String, C1222ao> f2513e = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: b */
    public SimpleDateFormat f2510b = new SimpleDateFormat("yyyyMMdd");

    /* JADX INFO: renamed from: c */
    public SimpleDateFormat f2511c = new SimpleDateFormat("yyyyMMddHH");

    private C1086a(Context context) {
        this.f2509a = C1191l.m2274a(C1182c.m2210a(context));
        this.f2512d = context;
    }

    /* JADX INFO: renamed from: a */
    public static C1086a m1566a(Context context) {
        if (f2508g == null) {
            synchronized (C1086a.class) {
                if (f2508g == null) {
                    f2508g = new C1086a(context);
                }
            }
        }
        return f2508g;
    }

    /* JADX INFO: renamed from: a */
    public final C1222ao.a m1567a(String str, String str2, int i) {
        C1222ao.a aVarM2616a;
        C1222ao c1222aoM1568a = m1568a(str, i);
        if (c1222aoM1568a == null || (aVarM2616a = c1222aoM1568a.m2616a(str2)) == null) {
            return null;
        }
        if (TextUtils.equals(aVarM2616a.f3870c, c1222aoM1568a.f3866g)) {
            if (!TextUtils.equals(aVarM2616a.f3869b, c1222aoM1568a.f3865f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVarM2616a.f3868a);
                sb.append(": AdSourceCap's cache hour is difference, it will reset the hour show count.");
                sb.append(aVarM2616a.f3869b);
                sb.append(" vs ");
                sb.append(c1222aoM1568a.f3865f);
            }
            return aVarM2616a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVarM2616a.f3868a);
        sb2.append(": AdSourceCap's cache date is difference, it will reset the day&hour show count.");
        sb2.append(aVarM2616a.f3870c);
        sb2.append(" vs ");
        sb2.append(c1222aoM1568a.f3866g);
        aVarM2616a.f3870c = c1222aoM1568a.f3866g;
        aVarM2616a.f3871d = 0;
        aVarM2616a.f3869b = c1222aoM1568a.f3865f;
        aVarM2616a.f3872e = 0;
        return aVarM2616a;
    }

    /* JADX INFO: renamed from: a */
    public final C1222ao m1568a(String str, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.f2510b.format(new Date(jCurrentTimeMillis));
        String str3 = this.f2511c.format(new Date(jCurrentTimeMillis));
        C1222ao c1222aoM2278a = this.f2513e.get(str);
        if (c1222aoM2278a != null) {
            if (!TextUtils.equals(c1222aoM2278a.f3866g, str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":PlacementCap's cache date is difference, it will reset the day&hour show count.");
                sb.append(c1222aoM2278a.f3866g);
                sb.append(" vs ");
                sb.append(str2);
                c1222aoM2278a.f3862c = 0;
                c1222aoM2278a.f3866g = str2;
            } else if (!TextUtils.equals(c1222aoM2278a.f3865f, str3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(":PlacementCap's cache hour is difference, it will reset the hour show count.");
                sb2.append(c1222aoM2278a.f3865f);
                sb2.append(" vs ");
                sb2.append(str3);
            }
            c1222aoM2278a.f3863d = 0;
            c1222aoM2278a.f3865f = str3;
        }
        synchronized (C1387u.m4556a().m4560a(str)) {
            if (c1222aoM2278a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(":PlacementCap's cache is null, try to find it in database");
                c1222aoM2278a = this.f2509a.m2278a(str, str2, str3);
                if (c1222aoM2278a == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(":PlacementCap's cache in database is null, try to create the new placemenCap's cache.");
                    c1222aoM2278a = new C1222ao();
                    c1222aoM2278a.f3861b = str;
                    c1222aoM2278a.f3860a = i;
                }
                c1222aoM2278a.f3866g = str2;
                c1222aoM2278a.f3865f = str3;
                this.f2513e.put(str, c1222aoM2278a);
            }
        }
        return c1222aoM2278a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1569a() {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                C1086a c1086a = C1086a.this;
                c1086a.f2509a.m2279a(c1086a.f2510b.format(new Date(System.currentTimeMillis())));
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1570a(String str, String str2, String str3) {
        synchronized (C1387u.m4556a().m4560a(str2)) {
            int i = Integer.parseInt(str);
            C1222ao c1222aoM1568a = m1568a(str2, i);
            C1222ao.a aVarM1567a = m1567a(str2, str3, i);
            if (aVarM1567a == null) {
                aVarM1567a = new C1222ao.a();
                aVarM1567a.f3868a = str3;
                c1222aoM1568a.m2617a(str3, aVarM1567a);
            }
            aVarM1567a.f3870c = c1222aoM1568a.f3866g;
            aVarM1567a.f3869b = c1222aoM1568a.f3865f;
            c1222aoM1568a.f3862c++;
            aVarM1567a.f3871d++;
            c1222aoM1568a.f3863d++;
            aVarM1567a.f3872e++;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1222aoM1568a.f3864e = jCurrentTimeMillis;
            aVarM1567a.f3873f = jCurrentTimeMillis;
            StringBuilder sb = new StringBuilder("Save Show Time, placementId:");
            sb.append(str2);
            sb.append(": ");
            sb.append(c1222aoM1568a.toString());
            StringBuilder sb2 = new StringBuilder("Save Show Time, adsourceId:");
            sb2.append(str3);
            sb2.append(": ");
            sb2.append(aVarM1567a.toString());
            this.f2509a.m2277a(i, str2, aVarM1567a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1571a(C1396f c1396f, String str) {
        if (c1396f == null) {
            return false;
        }
        if (c1396f.m5094al() == -1 && c1396f.m5095am() == -1) {
            return false;
        }
        C1222ao c1222aoM1568a = m1568a(str, c1396f.m5090ah());
        int i = c1222aoM1568a != null ? c1222aoM1568a.f3862c : 0;
        int i2 = c1222aoM1568a != null ? c1222aoM1568a.f3863d : 0;
        if (c1396f.m5094al() == -1 || i < c1396f.m5094al()) {
            return c1396f.m5095am() != -1 && ((long) i2) >= c1396f.m5095am();
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1572a(String str, C1229av c1229av, int i) {
        C1222ao.a aVarM1567a;
        if ((c1229av.m2799g() == -1 && c1229av.m2794f() == -1) || (aVarM1567a = m1567a(str, c1229av.m2842u(), i)) == null) {
            return false;
        }
        if (c1229av.m2799g() == -1 || aVarM1567a.f3872e < c1229av.m2799g()) {
            return c1229av.m2794f() != -1 && aVarM1567a.f3871d >= c1229av.m2794f();
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m1573a(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArrM2280a = this.f2509a.m2280a(i, this.f2510b.format(new Date(jCurrentTimeMillis)), this.f2511c.format(new Date(jCurrentTimeMillis)));
        StringBuilder sb = new StringBuilder("getFormatShowTime: format:");
        sb.append(i);
        sb.append(": dayCount:");
        sb.append(iArrM2280a[0]);
        sb.append("--hourcount:");
        sb.append(iArrM2280a[1]);
        return iArrM2280a;
    }
}
