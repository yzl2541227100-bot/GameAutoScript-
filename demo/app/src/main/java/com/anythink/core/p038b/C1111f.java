package com.anythink.core.p038b;

import android.text.TextUtils;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.p050a.C1149a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1252q;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.anythink.core.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1111f {

    /* JADX INFO: renamed from: e */
    private static C1111f f2685e;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, Integer> f2687b;

    /* JADX INFO: renamed from: f */
    private MediationBidManager f2690f;

    /* JADX INFO: renamed from: d */
    private final String f2689d = C1111f.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, C1252q> f2686a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public List<Integer> f2688c = new CopyOnWriteArrayList();

    private C1111f() {
    }

    /* JADX INFO: renamed from: a */
    public static C1111f m1708a() {
        if (f2685e == null) {
            f2685e = new C1111f();
        }
        return f2685e;
    }

    /* JADX INFO: renamed from: a */
    private void m1709a(String str) {
        if (this.f2687b == null) {
            this.f2687b = new ConcurrentHashMap<>();
        }
        this.f2687b.put(str + "_c2sfirstStatus", 1);
    }

    /* JADX INFO: renamed from: a */
    private void m1710a(String str, C1229av c1229av, C1252q c1252q) {
        this.f2686a.put(str + c1252q.f4442k, c1252q);
        if (c1229av.m2732Z()) {
            C1149a.m1921a().m1931a(str, c1252q);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m1711b(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f2687b;
        if (concurrentHashMap == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_c2sfirstStatus");
        return concurrentHashMap.get(sb.toString()) == null;
    }

    /* JADX INFO: renamed from: a */
    public final C1252q m1712a(String str, C1229av c1229av) {
        C1252q c1252qM1928a = this.f2686a.get(str + c1229av.m2842u());
        if (c1229av.m2732Z() && c1252qM1928a == null) {
            c1252qM1928a = C1149a.m1921a().m1928a(str, c1229av.m2842u());
            if (c1252qM1928a != null) {
                new StringBuilder("CacehMotify: getCache:: Adx/Direcyly Bidding Cache is exist, it will get it from DB:\n").append(c1229av.toString());
                this.f2686a.put(str + c1229av.m2842u(), c1252qM1928a);
            } else {
                new StringBuilder("CacehMotify: getCache:: Adx/Direcyly Bidding Cache is not exist:\n").append(c1229av.toString());
            }
        }
        return c1252qM1928a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1713a(int i) {
        synchronized (this.f2688c) {
            if (!this.f2688c.contains(Integer.valueOf(i))) {
                this.f2688c.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1714a(MediationBidManager mediationBidManager) {
        this.f2690f = mediationBidManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m1715a(String str, C1252q c1252q) {
        if (c1252q == null) {
            return;
        }
        C1252q c1252q2 = this.f2686a.get(str + c1252q.f4442k);
        if (c1252q2 == null || !TextUtils.equals(c1252q.token, c1252q2.token)) {
            return;
        }
        this.f2686a.remove(str + c1252q.f4442k);
    }

    /* JADX INFO: renamed from: b */
    public final MediationBidManager m1716b() {
        return this.f2690f;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1717b(int i) {
        boolean z;
        synchronized (this.f2688c) {
            z = !this.f2688c.contains(Integer.valueOf(i));
        }
        return z;
    }
}
