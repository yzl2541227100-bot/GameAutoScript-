package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1251p;
import com.anythink.core.common.p066o.C1355s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.d */
/* JADX INFO: loaded from: classes.dex */
public class C1193d {

    /* JADX INFO: renamed from: a */
    private static final String f3563a = "d";

    /* JADX INFO: renamed from: e */
    private static volatile C1193d f3564e;

    /* JADX INFO: renamed from: b */
    private Context f3565b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C1251p> f3566c = new ConcurrentHashMap(8);

    /* JADX INFO: renamed from: d */
    private Map<String, String> f3567d;

    private C1193d() {
    }

    /* JADX INFO: renamed from: a */
    public static C1193d m2290a() {
        if (f3564e == null) {
            synchronized (C1193d.class) {
                if (f3564e == null) {
                    f3564e = new C1193d();
                }
            }
        }
        return f3564e;
    }

    /* JADX INFO: renamed from: a */
    public final C1251p m2291a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1251p c1251pRemove = this.f3566c.remove(str);
        StringBuilder sb = new StringBuilder("popBiddingRecorder, placementId: ");
        sb.append(str);
        sb.append(", lastBiddingRecorder: ");
        sb.append(c1251pRemove);
        if (c1251pRemove != null) {
            C1355s.m4234a(this.f3565b, C1169h.f3049N, str);
        }
        return c1251pRemove;
    }

    /* JADX INFO: renamed from: a */
    public final void m2292a(Context context) {
        C1251p c1251pM3390a;
        this.f3565b = context;
        try {
            Map<String, ?> mapM4233a = C1355s.m4233a(context, C1169h.f3049N);
            if (mapM4233a != null) {
                for (Map.Entry<String, ?> entry : mapM4233a.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if ((value instanceof String) && (c1251pM3390a = C1251p.m3390a((String) value)) != null) {
                        this.f3566c.put(key, c1251pM3390a);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2293a(String str, C1251p c1251p) {
        StringBuilder sb = new StringBuilder("putBiddingRecorder, placementId: ");
        sb.append(str);
        sb.append(", currentBiddingRecorder: ");
        sb.append(c1251p);
        this.f3566c.put(str, c1251p);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2294a(String str, String str2) {
        if (this.f3567d == null) {
            this.f3567d = new ConcurrentHashMap();
        }
        this.f3567d.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2295a(String str, String str2, String str3) {
        C1229av c1229avM3392a;
        C1251p c1251p = this.f3566c.get(str);
        if (c1251p == null || (c1229avM3392a = c1251p.m3392a()) == null || !TextUtils.equals(c1229avM3392a.m2842u(), str3) || !TextUtils.equals(c1251p.m3394b(), str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("markShowStatus, placementId: ");
        sb.append(str);
        sb.append(", requestId: ");
        sb.append(str2);
        sb.append(", adSourceId: ");
        sb.append(str3);
        c1251p.m3395c();
        m2296b(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m2296b(String str) {
        try {
            C1251p c1251p = this.f3566c.get(str);
            if (c1251p != null) {
                C1355s.m4237a(this.f3565b, C1169h.f3049N, str, c1251p.m3399g().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2297b(String str, String str2, String str3) {
        C1229av c1229avM3392a;
        C1251p c1251p = this.f3566c.get(str);
        if (c1251p == null || (c1229avM3392a = c1251p.m3392a()) == null || !TextUtils.equals(c1229avM3392a.m2842u(), str3) || !TextUtils.equals(c1251p.m3394b(), str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("markClickStatus, placementId: ");
        sb.append(str);
        sb.append(", requestId: ");
        sb.append(str2);
        sb.append(", adSourceId: ");
        sb.append(str3);
        c1251p.m3396d();
        m2296b(str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m2298c(String str) {
        Map<String, String> map = this.f3567d;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }
}
