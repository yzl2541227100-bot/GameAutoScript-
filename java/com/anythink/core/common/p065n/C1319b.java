package com.anythink.core.common.p065n;

import android.text.TextUtils;
import com.anythink.core.common.p055f.C1215ah;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1246k;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.n.b */
/* JADX INFO: loaded from: classes.dex */
public class C1319b {

    /* JADX INFO: renamed from: a */
    private static final String f5030a = "b";

    /* JADX INFO: renamed from: b */
    private static volatile C1319b f5031b;

    /* JADX INFO: renamed from: c */
    private long f5032c = 0;

    /* JADX INFO: renamed from: d */
    private long f5033d = 0;

    /* JADX INFO: renamed from: e */
    private final Map<String, Long> f5034e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    private final Map<String, C1215ah> f5035f = new ConcurrentHashMap();

    private C1319b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1319b m3821a() {
        if (f5031b == null) {
            synchronized (C1319b.class) {
                if (f5031b == null) {
                    f5031b = new C1319b();
                }
            }
        }
        return f5031b;
    }

    /* JADX INFO: renamed from: a */
    public static String m3822a(C1248m c1248m) {
        return c1248m.f4323d + "_ " + c1248m.f4322c;
    }

    /* JADX INFO: renamed from: b */
    public static long m3823b(C1243h c1243h) {
        return c1243h.m3058b() - c1243h.m3048a();
    }

    /* JADX INFO: renamed from: b */
    private void m3824b(String str, long j) {
        StringBuilder sb = new StringBuilder("recordOfferLoadStartTime, ");
        sb.append(str);
        sb.append(", timeStamp: ");
        sb.append(j);
        m3832a(str).f3733a = j;
    }

    /* JADX INFO: renamed from: c */
    private void m3825c(String str, long j) {
        StringBuilder sb = new StringBuilder("recordOfferDataEndTime, ");
        sb.append(str);
        sb.append(", timeStamp: ");
        sb.append(j);
        m3832a(str).f3735c = j;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3826c(C1243h c1243h) {
        return c1243h == null || TextUtils.isEmpty(c1243h.m2677ah()) || TextUtils.isEmpty(c1243h.m3129t());
    }

    /* JADX INFO: renamed from: d */
    private void m3827d(String str, long j) {
        StringBuilder sb = new StringBuilder("recordOfferGetImageSizeStartTime, ");
        sb.append(str);
        sb.append(", timeStamp: ");
        sb.append(j);
        m3832a(str).f3736d = j;
    }

    /* JADX INFO: renamed from: d */
    private boolean m3828d(C1243h c1243h) {
        try {
            String strM2679aj = c1243h.m2679aj();
            if (TextUtils.isEmpty(strM2679aj)) {
                return false;
            }
            return strM2679aj.equals("0");
        } catch (Throwable th) {
            getClass().getSimpleName();
            new StringBuilder("handleTrackerInfo() >>> ").append(th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3829e(String str, long j) {
        StringBuilder sb = new StringBuilder("recordOfferGetImageSizeEndTime, ");
        sb.append(str);
        sb.append(", timeStamp: ");
        sb.append(j);
        m3832a(str).f3737e = j;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m3830e(C1243h c1243h) {
        return c1243h.m3039P() == 66;
    }

    /* JADX INFO: renamed from: a */
    public final long m3831a(C1243h c1243h) {
        if (TextUtils.isEmpty(c1243h.m2677ah())) {
            return 0L;
        }
        long jM3048a = c1243h.m3048a();
        Long l = this.f5034e.get(c1243h.m2677ah());
        if (l == null || l.longValue() == 0 || jM3048a == 0) {
            return 0L;
        }
        return jM3048a - l.longValue();
    }

    /* JADX INFO: renamed from: a */
    public final C1215ah m3832a(String str) {
        C1215ah c1215ah = this.f5035f.get(str);
        if (c1215ah == null) {
            synchronized (this.f5035f) {
                if (c1215ah == null) {
                    c1215ah = new C1215ah();
                    this.f5035f.put(str, c1215ah);
                }
            }
        }
        return c1215ah;
    }

    /* JADX INFO: renamed from: a */
    public final void m3833a(int i, C1243h c1243h) {
        if (m3826c(c1243h)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 4) {
            if (i != 6) {
                return;
            }
            c1243h.m3061b(jCurrentTimeMillis);
        } else {
            if (!m3828d(c1243h)) {
                this.f5032c = jCurrentTimeMillis;
            }
            c1243h.m3052a(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3834a(C1246k c1246k, C1243h c1243h) {
        if (m3826c(c1243h)) {
            return;
        }
        String str = c1246k.f4244a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!str.equals("1004634") || m3828d(c1243h)) {
            return;
        }
        this.f5033d = jCurrentTimeMillis;
        this.f5034e.put(c1243h.m2677ah(), Long.valueOf(jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: a */
    public final void m3835a(String str, long j) {
        StringBuilder sb = new StringBuilder("recordOfferLoadEndTime, ");
        sb.append(str);
        sb.append(", timeStamp: ");
        sb.append(j);
        m3832a(str).f3734b = j;
    }

    /* JADX INFO: renamed from: b */
    public final long m3836b() {
        long j = this.f5033d;
        if (j != 0) {
            long j2 = this.f5032c;
            if (j2 != 0) {
                return j2 - j;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m3837b(String str) {
        this.f5035f.remove(str);
    }
}
