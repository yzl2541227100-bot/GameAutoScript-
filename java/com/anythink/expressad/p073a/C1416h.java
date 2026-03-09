package com.anythink.expressad.p073a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p120g.p135g.C1863c;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.p073a.C1411c;
import com.anythink.expressad.p073a.C1414f;
import com.anythink.expressad.p073a.C1415g;
import com.anythink.expressad.p085c.C1481a;
import com.anythink.expressad.p085c.InterfaceC1482b;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.anythink.expressad.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1416h extends C1412d implements AbstractRunnableC1861a.b {

    /* JADX INFO: renamed from: a */
    public static final int f6389a = 1;

    /* JADX INFO: renamed from: i */
    public static final int f6390i = 2;

    /* JADX INFO: renamed from: j */
    private static final String f6391j = "302";

    /* JADX INFO: renamed from: m */
    private InterfaceC1413e f6394m;

    /* JADX INFO: renamed from: n */
    private C1411c.b f6395n;

    /* JADX INFO: renamed from: p */
    private boolean f6397p;

    /* JADX INFO: renamed from: q */
    private Context f6398q;

    /* JADX INFO: renamed from: r */
    private C1863c f6399r;

    /* JADX INFO: renamed from: s */
    private C1414f.a f6400s;

    /* JADX INFO: renamed from: k */
    private boolean f6392k = false;

    /* JADX INFO: renamed from: l */
    private long f6393l = 0;

    /* JADX INFO: renamed from: o */
    private boolean f6396o = true;

    /* JADX INFO: renamed from: t */
    private Handler f6401t = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: u */
    private boolean f6402u = true;

    /* JADX INFO: renamed from: com.anythink.expressad.a.h$a */
    public class a extends AbstractRunnableC1861a {

        /* JADX INFO: renamed from: h */
        private static final int f6404h = 10;

        /* JADX INFO: renamed from: f */
        private final Context f6407f;

        /* JADX INFO: renamed from: g */
        private String f6408g;

        /* JADX INFO: renamed from: i */
        private String f6409i;

        /* JADX INFO: renamed from: j */
        private String f6410j;

        /* JADX INFO: renamed from: k */
        private String f6411k;

        /* JADX INFO: renamed from: l */
        private InterfaceC1482b f6412l;

        /* JADX INFO: renamed from: m */
        private C1781c f6413m;

        /* JADX INFO: renamed from: n */
        private boolean f6414n;

        /* JADX INFO: renamed from: o */
        private boolean f6415o;

        /* JADX INFO: renamed from: p */
        private int f6416p;

        /* JADX INFO: renamed from: e */
        private final Semaphore f6406e = new Semaphore(0);

        /* JADX INFO: renamed from: q */
        private C1415g.a f6417q = new C1415g.a() { // from class: com.anythink.expressad.a.h.a.1
            /* JADX INFO: renamed from: b */
            private void m5381b() {
                synchronized (C1416h.this) {
                    C1416h.this.f6395n.m5278a(true);
                    a.m5368a(a.this);
                }
            }

            @Override // com.anythink.expressad.p073a.C1415g.a
            /* JADX INFO: renamed from: a */
            public final void mo5348a(String str, String str2) {
                a.this.m5373a(str);
                C1416h.this.f6395n.m5285c(str2);
                a.m5369a(a.this, true, false);
                m5381b();
            }

            @Override // com.anythink.expressad.p073a.C1415g.a
            /* JADX INFO: renamed from: a */
            public final void mo5349a(String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    C1416h.this.f6395n.m5281b(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    C1416h.this.f6395n.m5285c(str3);
                }
                a.this.m5373a(str);
                a.m5369a(a.this, true, false);
                m5381b();
            }

            @Override // com.anythink.expressad.p073a.C1415g.a
            /* JADX INFO: renamed from: a */
            public final boolean mo5350a() {
                a.m5369a(a.this, false, false);
                return false;
            }

            @Override // com.anythink.expressad.p073a.C1415g.a
            /* JADX INFO: renamed from: a */
            public final boolean mo5351a(String str) {
                boolean zM5373a = a.this.m5373a(str);
                a.m5369a(a.this, false, true);
                if (zM5373a) {
                    m5381b();
                }
                return zM5373a;
            }

            @Override // com.anythink.expressad.p073a.C1415g.a
            /* JADX INFO: renamed from: b */
            public final boolean mo5352b(String str) {
                boolean zM5373a = a.this.m5373a(str);
                a.m5369a(a.this, false, true);
                if (zM5373a) {
                    a.m5369a(a.this, true, true);
                    m5381b();
                }
                return zM5373a;
            }
        };

        public a(Context context, String str, String str2, String str3, String str4, InterfaceC1482b interfaceC1482b, C1781c c1781c, boolean z, boolean z3, int i) {
            this.f6407f = context;
            this.f6408g = str;
            this.f6409i = str2;
            this.f6410j = str3;
            this.f6411k = str4;
            this.f6412l = interfaceC1482b;
            this.f6413m = c1781c;
            this.f6414n = z;
            this.f6415o = z3;
            this.f6416p = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0219 A[EDGE_INSN: B:103:0x0219->B:94:0x0219 BREAK  A[LOOP:0: B:20:0x0055->B:80:0x01c5], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.anythink.expressad.p073a.C1411c.b m5367a(java.lang.String r16, boolean r17, boolean r18, com.anythink.expressad.foundation.p116d.C1781c r19, int r20) {
            /*
                Method dump skipped, instruction units count: 538
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.C1416h.a.m5367a(java.lang.String, boolean, boolean, com.anythink.expressad.foundation.d.c, int):com.anythink.expressad.a.c$b");
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m5368a(a aVar) {
            aVar.f6406e.release();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m5369a(a aVar, boolean z, boolean z3) {
            int i = (C1416h.this.f6393l > 0L ? 1 : (C1416h.this.f6393l == 0L ? 0 : -1));
            C1416h.this.f6393l = System.currentTimeMillis();
            if (!z) {
                if (aVar.f6412l != null) {
                    int i2 = C1481a.f6816b;
                    return;
                }
                return;
            }
            InterfaceC1482b interfaceC1482b = aVar.f6412l;
            if (z3) {
                if (interfaceC1482b == null || C1416h.this.f6392k) {
                    return;
                }
            } else if (interfaceC1482b == null || C1416h.this.f6392k) {
                return;
            }
            C1416h.m5362f(C1416h.this);
            int i3 = C1481a.f6816b;
        }

        /* JADX INFO: renamed from: a */
        private void m5370a(boolean z, boolean z3) {
            int i = (C1416h.this.f6393l > 0L ? 1 : (C1416h.this.f6393l == 0L ? 0 : -1));
            C1416h.this.f6393l = System.currentTimeMillis();
            if (!z) {
                if (this.f6412l != null) {
                    int i2 = C1481a.f6816b;
                    return;
                }
                return;
            }
            InterfaceC1482b interfaceC1482b = this.f6412l;
            if (z3) {
                if (interfaceC1482b == null || C1416h.this.f6392k) {
                    return;
                }
            } else if (interfaceC1482b == null || C1416h.this.f6392k) {
                return;
            }
            C1416h.m5362f(C1416h.this);
            int i3 = C1481a.f6816b;
        }

        /* JADX INFO: renamed from: a */
        private static boolean m5371a(int i) {
            return i == 200;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public boolean m5373a(String str) {
            C1781c c1781c = this.f6413m;
            if (c1781c != null) {
                c1781c.m8809Q();
            }
            if (C1885s.a.m9813a(str)) {
                C1416h.this.f6395n.m5284c(1);
            } else {
                if (!m5379e(str)) {
                    C1416h.this.f6395n.m5284c(2);
                    C1416h.this.f6395n.m5289e(str);
                    return false;
                }
                C1416h.this.f6395n.m5284c(3);
            }
            C1416h.this.f6395n.m5289e(str);
            C1416h.this.f6395n.m5282b(true);
            return true;
        }

        /* JADX INFO: renamed from: b */
        private static boolean m5374b(int i) {
            return i == 301 || i == 302 || i == 307;
        }

        /* JADX INFO: renamed from: b */
        private static boolean m5375b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: renamed from: c */
        private static boolean m5376c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: renamed from: d */
        private void m5377d() {
            this.f6406e.acquireUninterruptibly();
        }

        /* JADX INFO: renamed from: d */
        private static boolean m5378d(String str) {
            return C1885s.a.m9813a(str);
        }

        /* JADX INFO: renamed from: e */
        private static boolean m5379e(String str) {
            return !TextUtils.isEmpty(str) && str.toLowerCase().contains("apk");
        }

        /* JADX INFO: renamed from: h */
        private void m5380h() {
            this.f6406e.release();
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: a */
        public final void mo5269a() {
            if (C1416h.this.f6394m != null) {
                InterfaceC1413e unused = C1416h.this.f6394m;
            }
            C1416h.this.f6395n = new C1411c.b();
            C1416h.this.f6395n.m5289e(this.f6408g);
            C1416h.this.f6395n = m5367a(this.f6408g, this.f6414n, this.f6415o, this.f6413m, this.f6416p);
            if (!TextUtils.isEmpty(C1416h.this.f6395n.m5288e())) {
                C1416h.this.f6395n.m5278a(true);
            }
            if (C1416h.this.f6396o && C1416h.this.f6395n.m5291g()) {
                if (C1416h.this.f6400s != null) {
                    C1416h.this.f6395n.m5276a(C1416h.this.f6400s.f6353f);
                }
                if (!m5379e(C1416h.this.f6395n.m5294j()) && !C1885s.a.m9813a(C1416h.this.f6395n.m5294j()) && 200 == C1416h.this.f6400s.f6353f && !TextUtils.isEmpty(C1416h.this.f6395n.m5290f()) && !C1416h.this.f6395n.m5290f().contains(C1801a.f11063bU)) {
                    C1416h.this.f6395n.m5280b(2);
                    if (TextUtils.isEmpty(C1416h.this.f6395n.m5290f())) {
                        try {
                            new C1415g(C1416h.this.f6402u).m5345a(this.f6409i, this.f6410j, this.f6411k, this.f6407f, C1416h.this.f6395n.m5294j(), this.f6417q);
                        } catch (Exception unused2) {
                        }
                    } else {
                        Log.e(C1416h.f6391j, "startWebViewHtmlParser");
                        new C1415g(C1416h.this.f6402u).m5346a(this.f6409i, this.f6410j, this.f6411k, this.f6407f, C1416h.this.f6395n.m5294j(), C1416h.this.f6395n.m5290f(), this.f6417q);
                    }
                    this.f6406e.acquireUninterruptibly();
                    return;
                }
                if (this.f6412l != null) {
                    C1416h.this.f6395n.m5294j();
                    int i = C1481a.f6815a;
                }
                if (C1416h.this.f6400s != null) {
                    C1416h.this.f6395n.m5280b(1);
                    C1416h.this.f6395n.m5281b(C1416h.this.f6400s.f6355h);
                    C1416h.this.f6395n.m5276a(C1416h.this.f6400s.f6353f);
                    C1416h.this.f6395n.m5277a(C1416h.this.f6400s.m5311a());
                    C1416h.this.f6395n.m5285c(C1416h.this.f6400s.f6354g);
                }
                m5373a(C1416h.this.f6395n.m5294j());
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: b */
        public final void mo5270b() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: c */
        public final void mo5271c() {
        }
    }

    public C1416h(Context context) {
        this.f6398q = context;
        this.f6399r = new C1863c(context, 2);
    }

    /* JADX INFO: renamed from: a */
    private boolean m5356a() {
        return this.f6396o;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m5362f(C1416h c1416h) {
        c1416h.f6392k = true;
        return true;
    }

    @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a.b
    /* JADX INFO: renamed from: a */
    public final void mo5268a(AbstractRunnableC1861a.a aVar) {
        if (aVar == AbstractRunnableC1861a.a.FINISH && this.f6396o) {
            this.f6401t.post(new Runnable() { // from class: com.anythink.expressad.a.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1416h.this.f6394m != null) {
                        if (C1416h.this.f6395n.m5291g()) {
                            InterfaceC1413e unused = C1416h.this.f6394m;
                            C1411c.b unused2 = C1416h.this.f6395n;
                        } else {
                            InterfaceC1413e unused3 = C1416h.this.f6394m;
                            C1411c.b unused4 = C1416h.this.f6395n;
                            C1416h.this.f6395n.m5292h();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5366a(String str, InterfaceC1413e interfaceC1413e, boolean z, String str2, String str3, String str4, InterfaceC1482b interfaceC1482b, C1781c c1781c, boolean z3, boolean z4, int i) {
        this.f6394m = interfaceC1413e;
        this.f6397p = z;
        this.f6399r.m9654a(new a(this.f6398q, str, str2, str3, str4, interfaceC1482b, c1781c, z3, z4, i), this);
    }

    @Override // com.anythink.expressad.p073a.C1412d
    /* JADX INFO: renamed from: b */
    public final void mo5267b() {
        this.f6396o = false;
    }
}
