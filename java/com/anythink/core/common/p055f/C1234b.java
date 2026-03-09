package com.anythink.core.common.p055f;

import android.os.Looper;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1344h;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.common.f.b */
/* JADX INFO: loaded from: classes.dex */
public class C1234b implements Comparable<C1234b> {

    /* JADX INFO: renamed from: b */
    private int f4056b;

    /* JADX INFO: renamed from: c */
    private long f4057c;

    /* JADX INFO: renamed from: d */
    private ATBaseAdAdapter f4058d;

    /* JADX INFO: renamed from: e */
    private BaseAd f4059e;

    /* JADX INFO: renamed from: f */
    private int f4060f;

    /* JADX INFO: renamed from: g */
    private long f4061g;

    /* JADX INFO: renamed from: h */
    private int f4062h;

    /* JADX INFO: renamed from: i */
    private long f4063i;

    /* JADX INFO: renamed from: j */
    private boolean f4064j;

    /* JADX INFO: renamed from: a */
    private String f4055a = getClass().getSimpleName();

    /* JADX INFO: renamed from: k */
    private String f4065k = "1";

    /* JADX INFO: renamed from: d */
    private int m2891d(C1234b c1234b) {
        C1229av unitGroupInfo = this.f4058d.getUnitGroupInfo();
        C1229av unitGroupInfo2 = c1234b.f4058d.getUnitGroupInfo();
        if (C1344h.m4129a(unitGroupInfo) > C1344h.m4129a(unitGroupInfo2)) {
            return -1;
        }
        if (C1344h.m4129a(unitGroupInfo) != C1344h.m4129a(unitGroupInfo2)) {
            return 1;
        }
        int i = unitGroupInfo.f4006n;
        int i2 = unitGroupInfo2.f4006n;
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        if (m2900b() < c1234b.m2900b()) {
            return -1;
        }
        return m2900b() != c1234b.m2900b() ? 1 : 0;
    }

    /* JADX INFO: renamed from: o */
    private long m2892o() {
        return this.f4061g;
    }

    /* JADX INFO: renamed from: p */
    private long m2893p() {
        return this.f4057c;
    }

    /* JADX INFO: renamed from: a */
    public final void m2894a(int i) {
        this.f4060f = i;
        if (i > 0) {
            this.f4062h = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2895a(long j) {
        this.f4063i = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m2896a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f4058d = aTBaseAdAdapter;
    }

    /* JADX INFO: renamed from: a */
    public final void m2897a(BaseAd baseAd) {
        this.f4059e = baseAd;
    }

    /* JADX INFO: renamed from: a */
    public final void m2898a(String str) {
        this.f4065k = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2899a() {
        return this.f4062h == 1 && System.currentTimeMillis() - this.f4057c < this.f4063i;
    }

    /* JADX INFO: renamed from: b */
    public final long m2900b() {
        return this.f4057c + this.f4063i;
    }

    /* JADX INFO: renamed from: b */
    public final void m2901b(long j) {
        this.f4061g = j;
    }

    /* JADX INFO: renamed from: c */
    public final int m2902c() {
        return this.f4060f;
    }

    /* JADX INFO: renamed from: c */
    public final void m2903c(long j) {
        this.f4062h = 1;
        this.f4057c = j;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(C1234b c1234b) {
        C1234b c1234b2 = c1234b;
        C1229av unitGroupInfo = this.f4058d.getUnitGroupInfo();
        C1229av unitGroupInfo2 = c1234b2.f4058d.getUnitGroupInfo();
        if (C1344h.m4129a(unitGroupInfo) > C1344h.m4129a(unitGroupInfo2)) {
            return -1;
        }
        if (C1344h.m4129a(unitGroupInfo) != C1344h.m4129a(unitGroupInfo2)) {
            return 1;
        }
        int i = unitGroupInfo.f4006n;
        int i2 = unitGroupInfo2.f4006n;
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        if (m2900b() < c1234b2.m2900b()) {
            return -1;
        }
        return m2900b() != c1234b2.m2900b() ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final ATBaseAdAdapter m2904d() {
        return this.f4058d;
    }

    /* JADX INFO: renamed from: e */
    public final BaseAd m2905e() {
        return this.f4059e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2906f() {
        try {
            if (this.f4064j || this.f4060f > 0) {
                return false;
            }
            if (this.f4058d != null && this.f4059e != null) {
                return true;
            }
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
            } catch (Throwable unused) {
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.f4058d;
            if (aTBaseAdAdapter != null) {
                return aTBaseAdAdapter.internalIsAdReady();
            }
        } catch (Exception e) {
            Log.e("AdCacheInfo", "isNetworkAdReady()  >>> " + e.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2907g() {
        return this.f4064j;
    }

    /* JADX INFO: renamed from: h */
    public final C1243h m2908h() {
        BaseAd baseAd = this.f4059e;
        return baseAd != null ? baseAd.getDetail() : this.f4058d.getTrackingInfo();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2909i() {
        return this.f4057c + this.f4061g > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2910j() {
        return m2909i() && m2906f();
    }

    /* JADX INFO: renamed from: k */
    public final String m2911k() {
        return this.f4065k;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m2912l() {
        if (this.f4064j) {
            return;
        }
        this.f4064j = true;
        if (this.f4060f <= 0) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.f.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (C1234b.this.f4060f <= 0) {
                            if (C1234b.this.f4058d != null) {
                                C1234b.this.f4058d.internalDestory();
                            }
                            if (C1234b.this.f4059e != null) {
                                C1234b.this.f4059e.destroy();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final double m2913m() {
        return C1344h.m4129a(this.f4058d.getUnitGroupInfo());
    }

    /* JADX INFO: renamed from: n */
    public final ATAdInfo m2914n() {
        BaseAd baseAd = this.f4059e;
        ATBaseAdAdapter aTBaseAdAdapter = this.f4058d;
        if (baseAd != null) {
            return C1171j.m2044a(baseAd, aTBaseAdAdapter);
        }
        if (aTBaseAdAdapter != null) {
            return C1171j.m2045a(aTBaseAdAdapter);
        }
        return null;
    }

    public String toString() {
        return "AdCacheInfo{UnitGroupInfo:" + this.f4058d.getUnitGroupInfo().toString() + ", showTime=" + this.f4060f + ", cacheTime=" + this.f4061g + ", upStatus=" + this.f4062h + ", upStatusOutDateTime=" + (this.f4057c + this.f4063i) + ", hasDestroy=" + this.f4064j + MessageFormatter.DELIM_STOP;
    }
}
