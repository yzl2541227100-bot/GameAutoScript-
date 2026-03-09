package com.anythink.core.common.p055f;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.p066o.C1345i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.f.an */
/* JADX INFO: loaded from: classes.dex */
public final class C1221an {

    /* JADX INFO: renamed from: b */
    private Map<String, Object> f3853b;

    /* JADX INFO: renamed from: c */
    private C1240e f3854c;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f3855d;

    /* JADX INFO: renamed from: f */
    private boolean f3857f;

    /* JADX INFO: renamed from: h */
    private Map<String, String> f3859h;

    /* JADX INFO: renamed from: g */
    private String f3858g = "";

    /* JADX INFO: renamed from: a */
    public final Object f3852a = new Object();

    /* JADX INFO: renamed from: e */
    private Map<String, C1201f> f3856e = new ConcurrentHashMap(1);

    /* JADX INFO: renamed from: a */
    public final C1201f m2600a(String str) {
        return this.f3856e.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final Object m2601a() {
        return this.f3852a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2602a(ATAdInfo aTAdInfo) {
        if (aTAdInfo != null) {
            this.f3854c = new C1240e(aTAdInfo.getAdsourceId(), aTAdInfo.getShowId(), aTAdInfo.getNetworkFirmId());
        } else {
            this.f3854c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2603a(String str, C1201f c1201f) {
        this.f3856e.put(str, c1201f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2604a(String str, Object obj) {
        if (this.f3853b == null) {
            this.f3853b = new ConcurrentHashMap(2);
        }
        this.f3853b.put(str, obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m2605a(String str, String str2) {
        synchronized (this) {
            if (this.f3855d == null) {
                this.f3855d = new ConcurrentHashMap(2);
            }
        }
        this.f3855d.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2606a(Map<String, Object> map) {
        this.f3853b = map;
    }

    /* JADX INFO: renamed from: a */
    public final void m2607a(boolean z) {
        this.f3857f = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m2608a(Object[] objArr) {
        this.f3858g = C1345i.m4155a(objArr);
    }

    /* JADX INFO: renamed from: b */
    public final String m2609b(String str) {
        Map<String, String> map = this.f3855d;
        return map == null ? "" : map.remove(str);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m2610b() {
        return this.f3853b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2611b(String str, String str2) {
        if (this.f3859h == null) {
            this.f3859h = new ConcurrentHashMap(2);
        }
        this.f3859h.put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final C1240e m2612c() {
        return this.f3854c;
    }

    /* JADX INFO: renamed from: c */
    public final String m2613c(String str) {
        Map<String, String> map = this.f3859h;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2614d() {
        return this.f3857f;
    }

    /* JADX INFO: renamed from: e */
    public final String m2615e() {
        return this.f3858g;
    }
}
