package com.anythink.expressad.videocommon.p178b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.videocommon.p178b.C2325j;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2329n {

    /* JADX INFO: renamed from: c */
    private static final String f14481c = "UnitCacheCtroller";

    /* JADX INFO: renamed from: f */
    private InterfaceC2336c f14486f;

    /* JADX INFO: renamed from: g */
    private ConcurrentHashMap<String, InterfaceC2336c> f14487g;

    /* JADX INFO: renamed from: k */
    private ExecutorService f14491k;

    /* JADX INFO: renamed from: m */
    private String f14493m;

    /* JADX INFO: renamed from: n */
    private C2340d f14494n;

    /* JADX INFO: renamed from: p */
    private int f14496p;

    /* JADX INFO: renamed from: q */
    private C1489c f14497q;

    /* JADX INFO: renamed from: d */
    private List<C1781c> f14484d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private boolean f14485e = true;

    /* JADX INFO: renamed from: h */
    private InterfaceC2321f f14488h = new InterfaceC2321f() { // from class: com.anythink.expressad.videocommon.b.n.1
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.p178b.InterfaceC2321f
        /* JADX INFO: renamed from: a */
        public final void mo11838a(long j, int i) {
            if (i == 5 || i == 4) {
                C2329n.m11920a(C2329n.this);
                C2329n.this.m11942a();
            }
            if (i == 2) {
                C2329n.m11920a(C2329n.this);
            }
        }
    };

    /* JADX INFO: renamed from: i */
    private CopyOnWriteArrayList<Map<String, C2318c>> f14489i = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: l */
    private long f14492l = C1485b.f6968P;

    /* JADX INFO: renamed from: o */
    private int f14495o = 2;

    /* JADX INFO: renamed from: a */
    public C1489c f14482a = null;

    /* JADX INFO: renamed from: b */
    public C1489c f14483b = null;

    /* JADX INFO: renamed from: j */
    private Context f14490j = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.n$1 */
    public class AnonymousClass1 implements InterfaceC2321f {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.p178b.InterfaceC2321f
        /* JADX INFO: renamed from: a */
        public final void mo11838a(long j, int i) {
            if (i == 5 || i == 4) {
                C2329n.m11920a(C2329n.this);
                C2329n.this.m11942a();
            }
            if (i == 2) {
                C2329n.m11920a(C2329n.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.n$2 */
    public class AnonymousClass2 implements InterfaceC2336c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f14499a;

        public AnonymousClass2(C1781c c1781c) {
            c1781c = c1781c;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5460a(String str) {
            InterfaceC2336c interfaceC2336c;
            if (C2329n.this.f14486f != null) {
                C2329n.this.f14486f.mo5460a(str);
            }
            if (C2329n.this.f14487g == null || C2329n.this.f14487g.size() <= 0 || c1781c == null || (interfaceC2336c = (InterfaceC2336c) C2329n.this.f14487g.get(c1781c.m8818Z())) == null) {
                return;
            }
            interfaceC2336c.mo5460a(str);
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5461a(String str, String str2) {
            InterfaceC2336c interfaceC2336c;
            C1781c c1781c = c1781c;
            if (c1781c == null || c1781c.m8827aB() == null || c1781c.m8827aB().size() <= 0 || !c1781c.m8827aB().contains(0)) {
                if (C2329n.this.f14486f != null) {
                    C2329n.this.f14486f.mo5461a(str, str2);
                }
                if (C2329n.this.f14487g == null || C2329n.this.f14487g.size() <= 0 || c1781c == null || (interfaceC2336c = (InterfaceC2336c) C2329n.this.f14487g.get(c1781c.m8818Z())) == null) {
                    return;
                }
                interfaceC2336c.mo5461a(str, str2);
            }
        }
    }

    public C2329n(C1781c c1781c, ExecutorService executorService, String str, int i) {
        this.f14496p = 1;
        List<C1781c> list = this.f14484d;
        if (list != null && c1781c != null) {
            list.add(c1781c);
        }
        this.f14491k = executorService;
        this.f14493m = str;
        this.f14496p = i;
        m11932c(this.f14484d);
    }

    public C2329n(List<C1781c> list, ExecutorService executorService, String str, int i) {
        this.f14496p = 1;
        List<C1781c> list2 = this.f14484d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f14491k = executorService;
        this.f14493m = str;
        this.f14496p = i;
        m11932c(this.f14484d);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x000f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0011 A[Catch: all -> 0x000b, TRY_ENTER, TryCatch #0 {, blocks: (B:30:0x0006, B:37:0x0011, B:39:0x0019, B:41:0x0021), top: B:46:0x0006 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void m11917a(com.anythink.expressad.videocommon.p178b.C2318c r4) {
        /*
            java.lang.Class<com.anythink.expressad.videocommon.b.n> r0 = com.anythink.expressad.videocommon.p178b.C2329n.class
            monitor-enter(r0)
            r1 = 0
            if (r4 == 0) goto Ld
            com.anythink.expressad.foundation.d.c r1 = r4.m11833n()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r4 = move-exception
            goto L2a
        Ld:
            if (r1 != 0) goto L11
            monitor-exit(r0)
            return
        L11:
            int r2 = r1.m8913w()     // Catch: java.lang.Throwable -> Lb
            r3 = 94
            if (r2 == r3) goto L21
            int r1 = r1.m8913w()     // Catch: java.lang.Throwable -> Lb
            r2 = 287(0x11f, float:4.02E-43)
            if (r1 != r2) goto L28
        L21:
            java.lang.String r1 = m11930c(r4)     // Catch: java.lang.Throwable -> Lb
            r4.m11814a(r1)     // Catch: java.lang.Throwable -> Lb
        L28:
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2329n.m11917a(com.anythink.expressad.videocommon.b.c):void");
    }

    /* JADX INFO: renamed from: a */
    private boolean m11918a(C1781c c1781c, String str) {
        if (!TextUtils.isEmpty(c1781c.m8849ar()) || TextUtils.isEmpty(str)) {
            return true;
        }
        return C2327l.m11891a().m11909d(this.f14493m + "_" + c1781c.m8818Z() + "_" + str);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11919a(C2318c c2318c, int i) {
        long jM11835p = c2318c.m11835p();
        long jM11825f = c2318c.m11825f();
        if (TextUtils.isEmpty(c2318c.m11809a())) {
            return true;
        }
        if (i == 0) {
            if (c2318c.m11833n() == null || TextUtils.isEmpty(c2318c.m11833n().m8811S())) {
                return false;
            }
            m11917a(c2318c);
            return true;
        }
        if (jM11825f <= 0 || jM11835p * 100 < jM11825f * ((long) i)) {
            return false;
        }
        m11917a(c2318c);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11920a(C2329n c2329n) {
        c2329n.f14485e = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11921a(String str, C1781c c1781c) {
        try {
            if (c1781c.m8827aB() != null && c1781c.m8827aB().size() > 0 && c1781c.m8827aB().contains(2)) {
                return true;
            }
            if ((!c1781c.m8886j() || C1886t.m9848f(str)) && !C1889w.m9867a(str)) {
                return m11928b(str, c1781c);
            }
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11922a(CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList) {
        try {
            for (Map<String, C2318c> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, C2318c>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().m11830k() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m11923b(C1781c c1781c) {
        if (c1781c != null) {
            return c1781c.m8846ao() != -1 ? c1781c.m8846ao() : m11934d(c1781c);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private static synchronized String m11925b(C2318c c2318c) {
        return m11930c(c2318c);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m11926b(C1781c c1781c, String str) {
        if (c1781c.m8886j()) {
            return true;
        }
        if ((c1781c.m8827aB() == null || c1781c.m8827aB().size() <= 0 || !c1781c.m8827aB().contains(1)) && !TextUtils.isEmpty(str) && c1781c.m8853av() == 0) {
            new StringBuilder("check template download state:").append(C2324i.m11867a().m11883c(str));
            if (C2324i.m11867a().m11883c(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m11927b(C2318c c2318c, int i) {
        return m11919a(c2318c, i);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m11928b(String str, C1781c c1781c) {
        if (c1781c.m8800H() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (c1781c.m8853av() != 1 || m11933c(c1781c)) {
            return (c1781c.m8827aB() != null && c1781c.m8827aB().size() > 0 && c1781c.m8827aB().contains(2)) || C1889w.m9868b(C2324i.m11867a().m11883c(str)) || C1889w.m9868b(C2325j.a.f14466a.m11889b(str));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0091  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m11929b(java.util.List<com.anythink.expressad.foundation.p116d.C1781c> r10) {
        /*
            java.util.Iterator r10 = r10.iterator()
            r0 = 1
            r1 = 0
            r2 = 1
        L7:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r10.next()
            com.anythink.expressad.foundation.d.c r3 = (com.anythink.expressad.foundation.p116d.C1781c) r3
            java.lang.String r4 = r3.m8801I()
            java.lang.String r5 = r3.m8811S()
            java.lang.String r6 = r3.m10151be()
            java.lang.String r7 = r3.m10150bd()
            if (r3 == 0) goto L34
            com.anythink.expressad.foundation.d.c$c r8 = r3.m8805M()
            if (r8 == 0) goto L34
            com.anythink.expressad.foundation.d.c$c r8 = r3.m8805M()
            java.lang.String r8 = r8.m8957e()
            goto L36
        L34:
            java.lang.String r8 = ""
        L36:
            r3.m8805M()
            if (r2 == 0) goto L51
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L51
            java.lang.String r9 = "cmpt=1"
            boolean r9 = r8.contains(r9)
            if (r9 != 0) goto L51
            boolean r8 = m11926b(r3, r8)
            if (r8 != 0) goto L51
        L4f:
            r2 = 0
            goto L7
        L51:
            boolean r8 = r3.m8886j()
            boolean r9 = com.anythink.expressad.foundation.p138h.C1886t.m9848f(r4)
            if (r8 == 0) goto L60
            if (r9 == 0) goto L5e
            goto L60
        L5e:
            r8 = 0
            goto L61
        L60:
            r8 = 1
        L61:
            if (r2 == 0) goto L6c
            if (r8 == 0) goto L6c
            boolean r3 = m11928b(r4, r3)
            if (r3 != 0) goto L6c
            goto L4f
        L6c:
            if (r2 == 0) goto L91
            boolean r3 = com.anythink.expressad.foundation.p138h.C1889w.m9867a(r5)
            if (r3 != 0) goto L91
            com.anythink.expressad.videocommon.p178b.C2316a.m11773a()
            java.lang.String r3 = com.anythink.expressad.videocommon.p178b.C2316a.m11774a(r5)
            boolean r4 = com.anythink.expressad.foundation.p138h.C1889w.m9867a(r3)
            if (r4 != 0) goto L4f
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            long r3 = r4.length()
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 > 0) goto L91
            goto L4f
        L91:
            if (r2 == 0) goto Laa
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto Laa
            java.lang.String r3 = com.anythink.expressad.foundation.p138h.C1885s.m9804a(r6)
            android.graphics.Bitmap r3 = com.anythink.expressad.foundation.p120g.p124d.C1817a.m9423a(r3)
            if (r3 == 0) goto La9
            boolean r3 = r3.isRecycled()
            if (r3 == 0) goto Laa
        La9:
            r2 = 0
        Laa:
            if (r2 == 0) goto L7
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L7
            java.lang.String r3 = com.anythink.expressad.foundation.p138h.C1885s.m9804a(r7)
            android.graphics.Bitmap r3 = com.anythink.expressad.foundation.p120g.p124d.C1817a.m9423a(r3)
            if (r3 == 0) goto L4f
            boolean r3 = r3.isRecycled()
            if (r3 == 0) goto L7
            goto L4f
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2329n.m11929b(java.util.List):boolean");
    }

    /* JADX INFO: renamed from: c */
    private static synchronized String m11930c(C2318c c2318c) {
        if (c2318c == null) {
            return "";
        }
        String strM8811S = c2318c.m11833n().m8811S();
        try {
            if (c2318c.m11830k() == 5) {
                String strM11823e = c2318c.m11823e();
                if (!C1889w.m9867a(strM11823e)) {
                    if (new File(strM11823e).length() > 0) {
                        strM8811S = strM11823e;
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return strM8811S;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11932c(java.util.List<com.anythink.expressad.foundation.p116d.C1781c> r13) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2329n.m11932c(java.util.List):void");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m11933c(C1781c c1781c) {
        if (c1781c == null) {
            return false;
        }
        try {
            return c1781c.m8802J() == 2;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private int m11934d(C1781c c1781c) {
        try {
            if (c1781c.m8913w() == 298) {
                if (this.f14483b == null) {
                    C1486b.m6002a();
                    this.f14483b = C1486b.m6003a(C1773a.m8548c().m8558f(), this.f14493m);
                }
                return this.f14483b.m6101f();
            }
            if (c1781c.m8913w() == 42) {
                return m11938h();
            }
            if (this.f14494n == null) {
                this.f14494n = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f14493m, false);
            }
            return this.f14494n.m12104v();
        } catch (Throwable th) {
            th.getMessage();
            return 100;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m11935e() {
        CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList = this.f14489i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    while (i < this.f14489i.size()) {
                        Map<String, C2318c> map = this.f14489i.get(i);
                        Iterator<Map.Entry<String, C2318c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            C2318c value = it.next().getValue();
                            if (value != null) {
                                if (jCurrentTimeMillis - value.m11819c() > this.f14492l * 1000 && value.m11830k() == 1) {
                                    value.m11829j();
                                    value.m11810a(this.f14495o);
                                    this.f14489i.remove(map);
                                    i--;
                                }
                                if (value.m11830k() != 1 && value.m11830k() != 5 && value.m11830k() != 0) {
                                    this.f14489i.remove(map);
                                    i--;
                                }
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m11936f() {
        CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList = this.f14489i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.f14489i.size()) {
                        Map<String, C2318c> map = this.f14489i.get(i);
                        Iterator<Map.Entry<String, C2318c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            C2318c value = it.next().getValue();
                            if (value != null && value.m11833n() != null && value.m11818b() && value.m11822d()) {
                                value.m11834o();
                                this.f14489i.remove(map);
                                i--;
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m11937g() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    private int m11938h() {
        try {
            C1489c c1489c = this.f14482a;
            if (c1489c != null) {
                return c1489c.m6101f();
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:361:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x010c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.expressad.videocommon.p178b.C2318c m11939a(int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2329n.m11939a(int, boolean):com.anythink.expressad.videocommon.b.c");
    }

    /* JADX INFO: renamed from: a */
    public final C2318c m11940a(String str) {
        CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList = this.f14489i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
            } catch (Throwable unused) {
            }
            for (Map<String, C2318c> map : this.f14489i) {
                if (map != null && map.containsKey(str)) {
                    return map.get(str);
                }
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x0114 A[Catch: all -> 0x01c4, Exception -> 0x01c6, TryCatch #1 {Exception -> 0x01c6, blocks: (B:157:0x000e, B:158:0x0013, B:160:0x001b, B:161:0x002b, B:163:0x0031, B:165:0x003f, B:168:0x0047, B:169:0x0050, B:171:0x0056, B:174:0x0060, B:176:0x006a, B:178:0x0074, B:180:0x0082, B:185:0x0096, B:190:0x00a4, B:188:0x009e, B:191:0x00bc, B:193:0x00c8, B:195:0x00ce, B:196:0x00d6, B:198:0x00df, B:200:0x00e7, B:202:0x00ed, B:204:0x00f3, B:206:0x00f9, B:207:0x00fe, B:209:0x0104, B:210:0x0109, B:213:0x0114, B:215:0x0123, B:217:0x0129, B:219:0x0137, B:220:0x013c, B:226:0x0146, B:228:0x0151, B:230:0x015f, B:255:0x01ae, B:239:0x0171, B:241:0x0177, B:243:0x017b, B:245:0x0185, B:247:0x018b, B:248:0x0197, B:249:0x019b, B:251:0x01a5, B:254:0x01ac), top: B:269:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x019b A[Catch: all -> 0x01c4, Exception -> 0x01c6, TryCatch #1 {Exception -> 0x01c6, blocks: (B:157:0x000e, B:158:0x0013, B:160:0x001b, B:161:0x002b, B:163:0x0031, B:165:0x003f, B:168:0x0047, B:169:0x0050, B:171:0x0056, B:174:0x0060, B:176:0x006a, B:178:0x0074, B:180:0x0082, B:185:0x0096, B:190:0x00a4, B:188:0x009e, B:191:0x00bc, B:193:0x00c8, B:195:0x00ce, B:196:0x00d6, B:198:0x00df, B:200:0x00e7, B:202:0x00ed, B:204:0x00f3, B:206:0x00f9, B:207:0x00fe, B:209:0x0104, B:210:0x0109, B:213:0x0114, B:215:0x0123, B:217:0x0129, B:219:0x0137, B:220:0x013c, B:226:0x0146, B:228:0x0151, B:230:0x015f, B:255:0x01ae, B:239:0x0171, B:241:0x0177, B:243:0x017b, B:245:0x0185, B:247:0x018b, B:248:0x0197, B:249:0x019b, B:251:0x01a5, B:254:0x01ac), top: B:269:0x000e, outer: #0 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.anythink.expressad.videocommon.p178b.C2318c> m11941a(boolean r22, java.util.List<com.anythink.expressad.foundation.p116d.C1781c> r23) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2329n.m11941a(boolean, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b4 A[Catch: all -> 0x0198, TryCatch #0 {, blocks: (B:139:0x000a, B:141:0x0013, B:142:0x0015, B:143:0x001b, B:145:0x0021, B:147:0x0029, B:148:0x0031, B:150:0x0037, B:152:0x0045, B:154:0x004b, B:156:0x0051, B:157:0x0053, B:159:0x006b, B:161:0x006f, B:162:0x0077, B:163:0x007b, B:169:0x008f, B:171:0x0093, B:172:0x00a6, B:174:0x00aa, B:176:0x00b0, B:178:0x00b4, B:180:0x00b8, B:181:0x00cb, B:183:0x00cf, B:195:0x00fd, B:197:0x0102, B:199:0x0108, B:201:0x012f, B:203:0x0133, B:206:0x013b, B:207:0x0142, B:209:0x0146, B:211:0x014c, B:214:0x015c, B:222:0x016e, B:224:0x0172, B:226:0x017d, B:229:0x0183, B:230:0x0188, B:235:0x0192, B:184:0x00d4, B:186:0x00d8, B:190:0x00ed, B:191:0x00f3, B:193:0x00f7, B:236:0x0196), top: B:242:0x000a }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11942a() {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p178b.C2329n.m11942a():void");
    }

    /* JADX INFO: renamed from: a */
    public final void m11943a(C1781c c1781c) {
        List<C1781c> list = this.f14484d;
        if (list != null && c1781c != null) {
            list.add(c1781c);
        }
        m11932c(this.f14484d);
    }

    /* JADX INFO: renamed from: a */
    public final void m11944a(InterfaceC2336c interfaceC2336c) {
        this.f14486f = interfaceC2336c;
    }

    /* JADX INFO: renamed from: a */
    public final void m11945a(String str, InterfaceC2336c interfaceC2336c) {
        if (this.f14487g == null) {
            this.f14487g = new ConcurrentHashMap<>();
        }
        this.f14487g.put(str, interfaceC2336c);
    }

    /* JADX INFO: renamed from: a */
    public final void m11946a(List<C1781c> list) {
        List<C1781c> list2 = this.f14484d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        m11932c(this.f14484d);
    }

    /* JADX INFO: renamed from: b */
    public final C2318c m11947b(int i, boolean z) {
        try {
            return m11939a(i, z);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11948b() {
        int iM11830k;
        try {
            CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList = this.f14489i;
            if (copyOnWriteArrayList != null) {
                synchronized (copyOnWriteArrayList) {
                    for (Map<String, C2318c> map : this.f14489i) {
                        if (map != null) {
                            Iterator<Map.Entry<String, C2318c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                C2318c value = it.next().getValue();
                                if (value != null && (iM11830k = value.m11830k()) != 1 && iM11830k != 5) {
                                    if (C1877k.m9690a() != 9 && this.f14495o == 2) {
                                        return;
                                    }
                                    if (iM11830k == 2 || iM11830k == 0) {
                                        value.m11827h();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11949b(String str) {
        CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList;
        try {
            synchronized (this.f14489i) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f14489i) != null && copyOnWriteArrayList.size() > 0) {
                    for (Map<String, C2318c> map : this.f14489i) {
                        if (map != null) {
                            for (Map.Entry<String, C2318c> entry : map.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.f14489i.remove(map);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11950c() {
        CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList = this.f14489i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    for (Map<String, C2318c> map : this.f14489i) {
                        if (map != null) {
                            Iterator<Map.Entry<String, C2318c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                C2318c value = it.next().getValue();
                                if (value != null && value.m11830k() == 1) {
                                    value.m11829j();
                                    this.f14489i.remove(map);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11951d() {
        CopyOnWriteArrayList<Map<String, C2318c>> copyOnWriteArrayList = this.f14489i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    for (Map<String, C2318c> map : this.f14489i) {
                        if (map == null) {
                            return;
                        }
                        Iterator<Map.Entry<String, C2318c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            C2318c value = it.next().getValue();
                            if (value != null) {
                                value.m11834o();
                            }
                        }
                    }
                    this.f14489i.clear();
                }
            } catch (Throwable unused) {
            }
        }
        List<C1781c> list = this.f14484d;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f14484d.clear();
    }
}
