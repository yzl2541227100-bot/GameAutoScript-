package com.anythink.core.common.p050a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1230aw;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.p038b.C1111f;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.core.p072d.C1396f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1151c {

    /* JADX INFO: renamed from: b */
    private static volatile C1151c f2929b;

    /* JADX INFO: renamed from: a */
    private final String f2930a = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    private Map<String, a> f2931c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.anythink.core.common.a.c$a */
    public class a {

        /* JADX INFO: renamed from: b */
        private C1229av f2933b;

        /* JADX INFO: renamed from: c */
        private ATBaseAdAdapter f2934c;

        /* JADX INFO: renamed from: d */
        private BaseAd f2935d;

        /* JADX INFO: renamed from: e */
        private C1234b f2936e;

        /* JADX INFO: renamed from: f */
        private String f2937f;

        /* JADX INFO: renamed from: g */
        private C1243h f2938g;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        private void m1941a(ATBaseAdAdapter aTBaseAdAdapter) {
            this.f2934c = aTBaseAdAdapter;
        }

        /* JADX INFO: renamed from: a */
        private void m1942a(BaseAd baseAd) {
            this.f2935d = baseAd;
        }

        /* JADX INFO: renamed from: a */
        private void m1943a(C1229av c1229av) {
            this.f2933b = c1229av;
        }

        /* JADX INFO: renamed from: a */
        private void m1944a(C1234b c1234b) {
            this.f2936e = c1234b;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized C1234b m1947a() {
            boolean zInternalIsAdReady;
            String unused = C1151c.this.f2930a;
            StringBuilder sb = new StringBuilder("AdxDefaultInternal generateAdxAdCacheInfo has release:");
            sb.append(this.f2934c == null);
            sb.append(",initTrackingInfo:");
            sb.append(this.f2938g != null);
            if (this.f2934c == null) {
                return null;
            }
            C1243h c1243h = this.f2938g;
            if (c1243h == null) {
                return null;
            }
            if (this.f2936e != null) {
                String unused2 = C1151c.this.f2930a;
                return this.f2936e;
            }
            this.f2935d = null;
            c1243h.m3025E(12);
            if (TextUtils.equals(this.f2938g.m2679aj(), "0")) {
                BaseAd baseAdObject = this.f2934c.getBaseAdObject(C1175n.m2059a().m2148f());
                this.f2935d = baseAdObject;
                zInternalIsAdReady = baseAdObject != null;
            } else {
                zInternalIsAdReady = this.f2934c.internalIsAdReady();
            }
            String unused3 = C1151c.this.f2930a;
            if (zInternalIsAdReady) {
                C1358v.m4250a(this.f2934c, this.f2938g, this.f2933b);
                BaseAd baseAd = this.f2935d;
                if (baseAd != null) {
                    baseAd.setTrackingInfo(this.f2934c.getTrackingInfo().m3045V());
                }
                this.f2933b.m2719M().m3413b(this.f2937f);
                C1109b.m1668a(this.f2934c, this.f2933b, this.f2938g, this.f2935d);
                C1234b c1234b = new C1234b();
                this.f2936e = c1234b;
                c1234b.m2896a(this.f2934c);
                this.f2936e.m2903c(System.currentTimeMillis());
                this.f2936e.m2901b(this.f2933b.m2834q());
                this.f2936e.m2895a(this.f2933b.m2700B());
                this.f2936e.m2898a("3");
                BaseAd baseAd2 = this.f2935d;
                if (baseAd2 != null) {
                    this.f2936e.m2897a(baseAd2);
                }
            }
            return this.f2936e;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m1948a(String str, C1243h c1243h) {
            String unused = C1151c.this.f2930a;
            this.f2937f = str;
            this.f2938g = c1243h;
        }

        /* JADX INFO: renamed from: b */
        public final synchronized void m1949b() {
            String unused = C1151c.this.f2930a;
            StringBuilder sb = new StringBuilder("AdxDefaultInternal generateAdxAdCacheInfo has release:");
            boolean z = true;
            sb.append(this.f2934c == null);
            sb.append(",initTrackingInfo:");
            if (this.f2938g == null) {
                z = false;
            }
            sb.append(z);
            m1947a();
        }

        /* JADX INFO: renamed from: c */
        public final synchronized void m1950c() {
            String unused = C1151c.this.f2930a;
            this.f2934c = null;
            this.f2935d = null;
            this.f2936e = null;
        }

        /* JADX INFO: renamed from: d */
        public final synchronized double m1951d() {
            return C1344h.m4129a(this.f2933b);
        }

        /* JADX INFO: renamed from: e */
        public final C1229av m1952e() {
            return this.f2933b;
        }

        /* JADX INFO: renamed from: f */
        public final C1234b m1953f() {
            return this.f2936e;
        }
    }

    private C1151c() {
    }

    /* JADX INFO: renamed from: a */
    public static C1151c m1933a() {
        if (f2929b == null) {
            synchronized (C1151c.class) {
                if (f2929b == null) {
                    f2929b = new C1151c();
                }
            }
        }
        return f2929b;
    }

    /* JADX INFO: renamed from: a */
    public final a m1935a(Context context, String str, String str2, C1229av c1229av, C1396f c1396f, Map<String, Object> map) {
        if (TextUtils.isEmpty(str) || c1229av == null) {
            return null;
        }
        C1230aw c1230awM1910a = C1148a.m1904a().m1910a(str, c1229av);
        if (c1230awM1910a != null && c1230awM1910a.m2856a((C1252q) null).m2976b() != null) {
            return null;
        }
        a aVar = this.f2931c.get(str);
        if (aVar != null && aVar.f2934c != null) {
            return aVar;
        }
        C1252q c1252qM1712a = C1111f.m1708a().m1712a(str, c1229av);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" getAdDefaultCacheInfo requestId:");
        sb.append(str2);
        sb.append(",bidresult can use:");
        sb.append((c1252qM1712a == null || c1252qM1712a.m3411a()) ? false : true);
        if (c1252qM1712a != null && !c1252qM1712a.m3411a()) {
            c1229av.m2739a(c1252qM1712a, 0, 2, 1);
            ATBaseAdAdapter aTBaseAdAdapterM4174a = C1346j.m4174a(c1229av);
            if (aTBaseAdAdapterM4174a == null) {
                return null;
            }
            boolean zInternalInitNetworkObjectByPlacementId = aTBaseAdAdapterM4174a.internalInitNetworkObjectByPlacementId(context, c1396f.m5057a(str, str2, c1229av), map);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" getAdDefaultCacheInfo Adapter initSuccess:");
            sb2.append(zInternalInitNetworkObjectByPlacementId);
            if (zInternalInitNetworkObjectByPlacementId) {
                a aVar2 = new a();
                aVar2.f2934c = aTBaseAdAdapterM4174a;
                aVar2.f2933b = c1229av;
                this.f2931c.put(str, aVar2);
                return aVar2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C1234b m1936a(String str) {
        a aVar;
        if (TextUtils.isEmpty(str) || (aVar = this.f2931c.get(str)) == null || aVar.f2934c == null || aVar.f2936e == null || !aVar.f2936e.m2910j()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" getValidAdxDefaultCacheInfo return none");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("getValidAdxDefaultCacheInfo return cache,price:");
        sb2.append(aVar.m1951d());
        return aVar.f2936e;
    }

    /* JADX INFO: renamed from: a */
    public final void m1937a(String str, String str2) {
        a aVar;
        if (TextUtils.isEmpty(str) || (aVar = this.f2931c.get(str)) == null || aVar.f2933b == null || !aVar.f2933b.m2842u().equals(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(") tempAdxDefaultCacheInfo.release");
        aVar.m1950c();
    }
}
