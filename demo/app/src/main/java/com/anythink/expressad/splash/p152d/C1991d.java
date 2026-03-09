package com.anythink.expressad.splash.p152d;

import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1930e;
import com.anythink.expressad.splash.p150b.InterfaceC1982d;
import com.umeng.commonsdk.amap.UMAmapConfig;

/* JADX INFO: renamed from: com.anythink.expressad.splash.d.d */
/* JADX INFO: loaded from: classes.dex */
public class C1991d implements InterfaceC1982d {

    /* JADX INFO: renamed from: a */
    private static final String f12660a = "SplashShowListenerImpl";

    /* JADX INFO: renamed from: b */
    private InterfaceC1930e f12661b;

    /* JADX INFO: renamed from: c */
    private C1781c f12662c;

    /* JADX INFO: renamed from: d */
    private boolean f12663d;

    /* JADX INFO: renamed from: e */
    private C1990c f12664e;

    /* JADX INFO: renamed from: f */
    private Runnable f12665f = new Runnable() { // from class: com.anythink.expressad.splash.d.d.1
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1991d.this.mo10544a("show timeout!");
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.splash.d.d$1 */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1991d.this.mo10544a("show timeout!");
        }
    }

    public C1991d(C1990c c1990c, InterfaceC1930e interfaceC1930e, double d, C1781c c1781c) {
        this.f12664e = c1990c;
        this.f12661b = interfaceC1930e;
        this.f12662c = c1781c;
        this.f12663d = m10718a(d, c1781c);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x002c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m10718a(double r10, com.anythink.expressad.foundation.p116d.C1781c r12) {
        /*
            r0 = 0
            com.anythink.expressad.foundation.b.a r1 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = r1.m8558f()     // Catch: java.lang.Exception -> L8b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8b
            r2 = 0
            if (r1 != 0) goto L2c
            com.anythink.expressad.p086d.C1486b.m6002a()     // Catch: java.lang.Exception -> L8b
            com.anythink.expressad.d.a r1 = com.anythink.expressad.p086d.C1486b.m6007b()     // Catch: java.lang.Exception -> L8b
            if (r1 == 0) goto L2c
            long r2 = r1.m5969l()     // Catch: java.lang.Exception -> L8b
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r6 = r1.m5981x()     // Catch: java.lang.Exception -> L8b
            long r4 = r4 * r6
            r8 = r2
            r2 = r4
            r4 = r8
            goto L2d
        L2c:
            r4 = r2
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = "cbp : "
            r1.<init>(r6)     // Catch: java.lang.Exception -> L8b
            r1.append(r10)     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = " plct : "
            r1.append(r6)     // Catch: java.lang.Exception -> L8b
            r1.append(r2)     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = " plctb : "
            r1.append(r6)     // Catch: java.lang.Exception -> L8b
            r1.append(r4)     // Catch: java.lang.Exception -> L8b
            r1 = 1
            if (r12 == 0) goto L57
            boolean r2 = r12.m8825a(r2, r4)     // Catch: java.lang.Exception -> L8b
            if (r2 == 0) goto L54
            r12.m8870e(r1)     // Catch: java.lang.Exception -> L8b
            return r1
        L54:
            r12.m8870e(r0)     // Catch: java.lang.Exception -> L8b
        L57:
            if (r12 == 0) goto L8b
            boolean r12 = r12.m8793A()     // Catch: java.lang.Exception -> L8b
            if (r12 != 0) goto L8b
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 != 0) goto L66
            return r0
        L66:
            java.util.Random r12 = new java.util.Random     // Catch: java.lang.Exception -> L8b
            r12.<init>()     // Catch: java.lang.Exception -> L8b
            double r2 = r12.nextDouble()     // Catch: java.lang.Exception -> L8b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8b
            java.lang.String r4 = "hit : "
            r12.<init>(r4)     // Catch: java.lang.Exception -> L8b
            r12.append(r2)     // Catch: java.lang.Exception -> L8b
            java.lang.String r4 = " "
            r12.append(r4)     // Catch: java.lang.Exception -> L8b
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 <= 0) goto L84
            r10 = 1
            goto L85
        L84:
            r10 = 0
        L85:
            r12.append(r10)     // Catch: java.lang.Exception -> L8b
            if (r4 <= 0) goto L8b
            return r1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.p152d.C1991d.m10718a(double, com.anythink.expressad.foundation.d.c):boolean");
    }

    /* JADX INFO: renamed from: d */
    private static void m10719d() {
    }

    /* JADX INFO: renamed from: e */
    private static void m10720e() {
    }

    /* JADX INFO: renamed from: f */
    private void m10721f() {
        if (this.f12661b != null) {
            this.f12661b = null;
        }
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1982d
    /* JADX INFO: renamed from: a */
    public final void mo10541a() {
        if (this.f12665f != null) {
            C1175n.m2059a().m2144d(this.f12665f);
        }
        C1990c c1990c = this.f12664e;
        if (c1990c != null) {
            c1990c.f12625a = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=");
        stringBuffer.append(this.f12664e.m10713c());
        stringBuffer.append("&allow_skip=");
        stringBuffer.append(this.f12664e.m10714d() ? 1 : 0);
        stringBuffer.append("&countdown=");
        stringBuffer.append(this.f12664e.m10715e());
        stringBuffer.append("&");
        InterfaceC1930e interfaceC1930e = this.f12661b;
        if (interfaceC1930e == null || this.f12663d) {
            return;
        }
        interfaceC1930e.mo474a();
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1982d
    /* JADX INFO: renamed from: a */
    public final void mo10542a(int i) {
        InterfaceC1930e interfaceC1930e = this.f12661b;
        if (interfaceC1930e != null) {
            interfaceC1930e.mo475a(i);
        }
        C1990c c1990c = this.f12664e;
        if (c1990c != null) {
            c1990c.f12625a = false;
        }
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1982d
    /* JADX INFO: renamed from: a */
    public final void mo10543a(C1781c c1781c) {
        InterfaceC1930e interfaceC1930e = this.f12661b;
        if (interfaceC1930e == null || this.f12663d) {
            return;
        }
        interfaceC1930e.mo476a(c1781c);
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1982d
    /* JADX INFO: renamed from: a */
    public final void mo10544a(String str) {
        C1990c c1990c = this.f12664e;
        if (c1990c != null) {
            c1990c.f12625a = false;
        }
        InterfaceC1930e interfaceC1930e = this.f12661b;
        if (interfaceC1930e != null) {
            interfaceC1930e.mo477a(str);
        }
    }

    @Override // com.anythink.expressad.splash.p150b.InterfaceC1982d
    /* JADX INFO: renamed from: b */
    public final void mo10545b() {
    }

    /* JADX INFO: renamed from: c */
    public final void m10722c() {
        C1175n.m2059a().m2118a(this.f12665f, UMAmapConfig.AMAP_CACHE_WRITE_TIME);
    }
}
