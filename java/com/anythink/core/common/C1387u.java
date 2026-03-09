package com.anythink.core.common;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.common.p055f.C1221an;
import com.anythink.core.common.p055f.C1240e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.u */
/* JADX INFO: loaded from: classes.dex */
public class C1387u {

    /* JADX INFO: renamed from: a */
    private static volatile C1387u f5619a;

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, C1221an> f5620b = new ConcurrentHashMap<>(4);

    private C1387u() {
    }

    /* JADX INFO: renamed from: a */
    public static C1387u m4556a() {
        if (f5619a == null) {
            synchronized (C1387u.class) {
                if (f5619a == null) {
                    f5619a = new C1387u();
                }
            }
        }
        return f5619a;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m4557a(String str, String str2, Object obj) {
        m4558g(str).m2604a(str2, obj);
    }

    /* JADX INFO: renamed from: g */
    private synchronized C1221an m4558g(String str) {
        C1221an c1221an;
        c1221an = this.f5620b.get(str);
        if (c1221an == null) {
            c1221an = new C1221an();
            this.f5620b.put(str, c1221an);
        }
        return c1221an;
    }

    /* JADX INFO: renamed from: a */
    public final C1201f m4559a(String str, String str2) {
        return m4558g(str).m2600a(str2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m4560a(String str) {
        return m4558g(str).m2601a();
    }

    /* JADX INFO: renamed from: a */
    public final String m4561a(String str, int i) {
        return m4558g(str).m2613c(String.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m4562a(String str, int i, String str2) {
        m4558g(str).m2611b(String.valueOf(i), str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m4563a(String str, ATAdInfo aTAdInfo) {
        m4558g(str).m2602a(aTAdInfo);
    }

    /* JADX INFO: renamed from: a */
    public final void m4564a(String str, String str2, C1201f c1201f) {
        m4558g(str).m2603a(str2, c1201f);
    }

    /* JADX INFO: renamed from: a */
    public final void m4565a(String str, String str2, String str3) {
        m4558g(str).m2605a(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4566a(String str, Map<String, Object> map) {
        ConcurrentHashMap concurrentHashMap = null;
        if (map != null) {
            try {
                concurrentHashMap = new ConcurrentHashMap(map);
            } catch (Throwable unused) {
            }
        }
        m4558g(str).m2606a(concurrentHashMap);
    }

    /* JADX INFO: renamed from: a */
    public final void m4567a(String str, boolean z) {
        m4558g(str).m2607a(z);
    }

    /* JADX INFO: renamed from: a */
    public final void m4568a(String str, Object[] objArr) {
        m4558g(str).m2608a(objArr);
    }

    /* JADX INFO: renamed from: b */
    public final String m4569b(String str, String str2) {
        return m4558g(str).m2609b(str2);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Map<String, Object> m4570b(String str) {
        HashMap map;
        map = new HashMap(2);
        Map<String, Object> mapM2610b = m4558g(str).m2610b();
        if (mapM2610b != null) {
            map.putAll(mapM2610b);
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final C1240e m4571c(String str) {
        return m4558g(str).m2612c();
    }

    /* JADX INFO: renamed from: d */
    public final void m4572d(String str) {
        m4558g(str).m2602a((ATAdInfo) null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4573e(String str) {
        return m4558g(str).m2614d();
    }

    /* JADX INFO: renamed from: f */
    public final String m4574f(String str) {
        return m4558g(str).m2615e();
    }
}
