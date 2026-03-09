package com.anythink.china.common;

import android.os.SystemClock;
import com.anythink.china.api.ATAppDownloadListener;
import com.anythink.china.api.CustomAdapterDownloadListener;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.C1372q;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1244i;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1392b;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.china.common.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1079c implements CustomAdapterDownloadListener {

    /* JADX INFO: renamed from: a */
    public ATBaseAdAdapter f2488a;

    /* JADX INFO: renamed from: b */
    public BaseAd f2489b;

    /* JADX INFO: renamed from: c */
    public ATAdInfo f2490c;

    /* JADX INFO: renamed from: d */
    public WeakReference<ATAppDownloadListener> f2491d;

    /* JADX INFO: renamed from: e */
    public long f2492e;

    /* JADX INFO: renamed from: f */
    public boolean f2493f;

    /* JADX INFO: renamed from: g */
    public boolean f2494g;

    public C1079c(ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, ATEventInterface aTEventInterface) {
        this.f2488a = aTBaseAdAdapter;
        this.f2489b = baseAd;
        if (aTEventInterface == null || !(aTEventInterface instanceof ATAppDownloadListener)) {
            return;
        }
        this.f2491d = new WeakReference<>((ATAppDownloadListener) aTEventInterface);
    }

    /* JADX INFO: renamed from: a */
    private void m1536a() {
        BaseAd baseAd = this.f2489b;
        this.f2490c = baseAd != null ? C1171j.m2044a(baseAd, this.f2488a) : C1171j.m2045a(this.f2488a);
    }

    /* JADX INFO: renamed from: a */
    private void m1537a(final int i, final long j, final String str) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.common.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1244i c1244i = new C1244i();
                    C1079c c1079c = C1079c.this;
                    BaseAd baseAd = c1079c.f2489b;
                    c1244i.f4224b = baseAd != null ? baseAd.getDetail() : c1079c.f2488a.getTrackingInfo();
                    c1244i.f4223a = i;
                    c1244i.f4225c = System.currentTimeMillis();
                    AbstractC1228au abstractC1228au = c1244i.f4224b;
                    if (abstractC1228au instanceof C1243h) {
                        ((C1243h) abstractC1228au).m3062b(str);
                        ((C1243h) c1244i.f4224b).m3075d(j);
                    }
                    C1372q.m4390a(C1175n.m2059a().m2148f()).m4393a(i, c1244i, C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()));
                } catch (Throwable unused) {
                }
            }
        }, 2, true);
    }

    @Override // com.anythink.china.api.CustomAdapterDownloadListener
    public final void onDownloadFail(long j, long j2, String str, String str2) {
        if (this.f2490c == null) {
            m1536a();
        }
        WeakReference<ATAppDownloadListener> weakReference = this.f2491d;
        ATAppDownloadListener aTAppDownloadListener = weakReference != null ? weakReference.get() : null;
        if (aTAppDownloadListener != null) {
            aTAppDownloadListener.onDownloadFail(this.f2490c, j, j2, str, str2);
        }
    }

    @Override // com.anythink.china.api.CustomAdapterDownloadListener
    public final void onDownloadFinish(long j, String str, String str2) {
        if (this.f2490c == null) {
            m1536a();
        }
        if (this.f2492e != 0 && !this.f2494g) {
            this.f2494g = true;
            m1537a(19, SystemClock.elapsedRealtime() - this.f2492e, str2);
        }
        WeakReference<ATAppDownloadListener> weakReference = this.f2491d;
        ATAppDownloadListener aTAppDownloadListener = weakReference != null ? weakReference.get() : null;
        if (aTAppDownloadListener != null) {
            aTAppDownloadListener.onDownloadFinish(this.f2490c, j, str, str2);
        }
    }

    @Override // com.anythink.china.api.CustomAdapterDownloadListener
    public final void onDownloadPause(long j, long j2, String str, String str2) {
        if (this.f2490c == null) {
            m1536a();
        }
        WeakReference<ATAppDownloadListener> weakReference = this.f2491d;
        ATAppDownloadListener aTAppDownloadListener = weakReference != null ? weakReference.get() : null;
        if (aTAppDownloadListener != null) {
            aTAppDownloadListener.onDownloadPause(this.f2490c, j, j2, str, str2);
        }
    }

    @Override // com.anythink.china.api.CustomAdapterDownloadListener
    public final void onDownloadStart(long j, long j2, String str, String str2) {
        if (this.f2490c == null) {
            m1536a();
        }
        this.f2492e = SystemClock.elapsedRealtime();
        m1537a(18, 0L, str2);
        WeakReference<ATAppDownloadListener> weakReference = this.f2491d;
        ATAppDownloadListener aTAppDownloadListener = weakReference != null ? weakReference.get() : null;
        if (aTAppDownloadListener != null) {
            aTAppDownloadListener.onDownloadStart(this.f2490c, j, j2, str, str2);
        }
    }

    @Override // com.anythink.china.api.CustomAdapterDownloadListener
    public final void onDownloadUpdate(long j, long j2, String str, String str2) {
        if (this.f2490c == null) {
            m1536a();
        }
        WeakReference<ATAppDownloadListener> weakReference = this.f2491d;
        ATAppDownloadListener aTAppDownloadListener = weakReference != null ? weakReference.get() : null;
        if (aTAppDownloadListener != null) {
            aTAppDownloadListener.onDownloadUpdate(this.f2490c, j, j2, str, str2);
        }
    }

    @Override // com.anythink.china.api.CustomAdapterDownloadListener
    public final void onInstalled(String str, String str2) {
        if (this.f2490c == null) {
            m1536a();
        }
        if (!this.f2493f) {
            this.f2493f = true;
            m1537a(20, 0L, str2);
        }
        WeakReference<ATAppDownloadListener> weakReference = this.f2491d;
        ATAppDownloadListener aTAppDownloadListener = weakReference != null ? weakReference.get() : null;
        if (aTAppDownloadListener != null) {
            aTAppDownloadListener.onInstalled(this.f2490c, str, str2);
        }
    }
}
