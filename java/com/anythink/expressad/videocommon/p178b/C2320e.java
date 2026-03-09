package com.anythink.expressad.videocommon.p178b;

import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C2320e {

    /* JADX INFO: renamed from: a */
    private static final String f14432a = "DownLoadManager";

    /* JADX INFO: renamed from: b */
    private static C2320e f14433b;

    /* JADX INFO: renamed from: c */
    private ThreadPoolExecutor f14434c;

    /* JADX INFO: renamed from: d */
    private boolean f14435d = false;

    /* JADX INFO: renamed from: e */
    private ConcurrentHashMap<String, C2329n> f14436e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    private Map<String, List<Map<String, C2318c>>> f14437f;

    /* JADX INFO: renamed from: g */
    private Map<String, List<C1781c>> f14438g;

    /* JADX INFO: renamed from: h */
    private Map<String, List<C2318c>> f14439h;

    private C2320e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f14434c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static C2320e m11843a() {
        if (f14433b == null) {
            synchronized (C2320e.class) {
                if (f14433b == null) {
                    f14433b = new C2320e();
                }
            }
        }
        return f14433b;
    }

    /* JADX INFO: renamed from: a */
    private C2329n m11844a(String str, C1781c c1781c, int i, InterfaceC2336c interfaceC2336c) {
        if (TextUtils.isEmpty(str) || c1781c == null) {
            return null;
        }
        if (!this.f14436e.containsKey(str)) {
            C2329n c2329n = new C2329n(c1781c, this.f14434c, str, i);
            if (interfaceC2336c != null) {
                c2329n.m11944a(interfaceC2336c);
            }
            this.f14436e.put(str, c2329n);
            return c2329n;
        }
        C2329n c2329n2 = this.f14436e.get(str);
        if (i == 94 || i == 287) {
            c2329n2.m11945a(c1781c.m8818Z(), interfaceC2336c);
        } else {
            c2329n2.m11944a(interfaceC2336c);
        }
        c2329n2.m11943a(c1781c);
        return c2329n2;
    }

    /* JADX INFO: renamed from: a */
    private static void m11845a(C2329n c2329n, String str) {
        try {
            C2340d c2340dM11999a = C2339c.m11994a().m11999a(C1773a.m8548c().m8558f(), str);
            if (c2340dM11999a == null) {
                return;
            }
            if (c2340dM11999a.m12062F() == 2) {
                c2329n.m11950c();
            } else {
                c2329n.m11942a();
            }
        } catch (Exception e) {
            e.getMessage();
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C1486b.m6002a();
                C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), str);
                if (c1489cM6011c == null) {
                    c1489cM6011c = C1489c.m6072d(str);
                }
                if (c1489cM6011c.m6108m() == 2) {
                    c2329n.m11950c();
                } else {
                    c2329n.m11942a();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C2318c m11846b(int i, String str, boolean z) {
        C2329n c2329nM11860c = m11860c(str);
        if (c2329nM11860c != null) {
            return c2329nM11860c.m11947b(i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m11847b(String str, String str2) {
        C2329n c2329nM11860c = m11860c(str);
        if (c2329nM11860c != null) {
            try {
                c2329nM11860c.m11949b(str2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m11848d() {
        ConcurrentHashMap<String, C2329n> concurrentHashMap = this.f14436e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, C2329n>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                C2329n value = it.next().getValue();
                if (value != null) {
                    value.m11948b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private List<Map<String, C2318c>> m11849e(String str) {
        Map<String, List<Map<String, C2318c>>> map = this.f14437f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f14437f.get(str);
    }

    /* JADX INFO: renamed from: f */
    private void m11850f(String str) {
        C2329n c2329nM11860c = m11860c(str);
        if (c2329nM11860c != null) {
            c2329nM11860c.m11951d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2318c m11851a(String str, String str2) {
        C2329n c2329nM11860c = m11860c(str);
        if (c2329nM11860c != null) {
            return c2329nM11860c.m11940a(str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C2329n m11852a(String str, List<C1781c> list, int i, InterfaceC2336c interfaceC2336c) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        if (!this.f14436e.containsKey(str)) {
            C2329n c2329n = new C2329n(list, this.f14434c, str, i);
            if (interfaceC2336c != null) {
                c2329n.m11944a(interfaceC2336c);
            }
            this.f14436e.put(str, c2329n);
            return c2329n;
        }
        C2329n c2329n2 = this.f14436e.get(str);
        if (i == 94 || i == 287) {
            c2329n2.m11945a(list.get(0).m8818Z(), interfaceC2336c);
        } else {
            c2329n2.m11944a(interfaceC2336c);
        }
        c2329n2.m11946a(list);
        return c2329n2;
    }

    /* JADX INFO: renamed from: a */
    public final List<C1781c> m11853a(String str) {
        Map<String, List<C1781c>> map = this.f14438g;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f14438g.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m11854a(boolean z) {
        if (!z) {
            this.f14435d = false;
        } else if (this.f14435d) {
            return;
        }
        ConcurrentHashMap<String, C2329n> concurrentHashMap = this.f14436e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, C2329n>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().m11942a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11855a(int i, String str, boolean z) {
        try {
            C2329n c2329nM11860c = m11860c(str);
            if (c2329nM11860c != null) {
                return c2329nM11860c.m11939a(i, z) != null;
            }
            return false;
        } catch (Exception e) {
            if (!C1404a.f6209a) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11856a(String str, boolean z, int i, boolean z3, int i2, List<C1781c> list) {
        return m11859b(str, z, i, z3, i2, list);
    }

    /* JADX INFO: renamed from: b */
    public final List<C2318c> m11857b(String str) {
        Map<String, List<C2318c>> map = this.f14439h;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f14439h.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m11858b() {
        this.f14435d = false;
        ConcurrentHashMap<String, C2329n> concurrentHashMap = this.f14436e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, C2329n>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                C2329n value = it.next().getValue();
                if (value != null) {
                    value.m11950c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11859b(java.lang.String r9, boolean r10, int r11, boolean r12, int r13, java.util.List<com.anythink.expressad.foundation.p116d.C1781c> r14) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2320e.m11859b(java.lang.String, boolean, int, boolean, int, java.util.List):boolean");
    }

    /* JADX INFO: renamed from: c */
    public final C2329n m11860c(String str) {
        ConcurrentHashMap<String, C2329n> concurrentHashMap = this.f14436e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f14436e.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m11861c() {
        ConcurrentHashMap<String, C2329n> concurrentHashMap = this.f14436e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C2329n> entry : concurrentHashMap.entrySet()) {
                C2329n value = entry.getValue();
                String key = entry.getKey();
                try {
                    C2340d c2340dM11999a = C2339c.m11994a().m11999a(C1773a.m8548c().m8558f(), key);
                    if (c2340dM11999a != null) {
                        if (c2340dM11999a.m12062F() == 2) {
                            value.m11950c();
                        } else {
                            value.m11942a();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            C1486b.m6002a();
                            C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), key);
                            if (c1489cM6011c == null) {
                                c1489cM6011c = C1489c.m6072d(key);
                            }
                            if (c1489cM6011c.m6108m() == 2) {
                                value.m11950c();
                            } else {
                                value.m11942a();
                            }
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11862d(String str) {
        C2329n c2329nM11860c = m11860c(str);
        if (c2329nM11860c != null) {
            c2329nM11860c.m11942a();
        }
    }
}
