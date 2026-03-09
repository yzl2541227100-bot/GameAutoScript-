package com.anythink.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.common.C1288i;
import com.anythink.core.common.p050a.C1151c;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1235ba;
import com.anythink.core.common.p055f.C1240e;
import com.anythink.core.common.p055f.C1242g;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.C1359w;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.p069p.C1363b;
import com.anythink.core.common.p069p.C1365d;
import com.anythink.core.common.p069p.C1366e;
import com.anythink.core.common.p069p.C1367f;
import com.anythink.core.common.p069p.C1368g;
import com.anythink.core.common.p069p.C1369h;
import com.anythink.core.common.p069p.C1371j;
import com.anythink.core.common.p069p.InterfaceC1364c;
import com.anythink.core.p038b.C1101b;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.core.p047c.C1141b;
import com.anythink.core.p072d.C1396f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.g */
/* JADX INFO: loaded from: classes.dex */
public class C1262g {

    /* JADX INFO: renamed from: E */
    public InterfaceRunnableC1313b f4532E;

    /* JADX INFO: renamed from: G */
    public C1368g f4534G;

    /* JADX INFO: renamed from: H */
    public C1151c.a f4535H;

    /* JADX INFO: renamed from: K */
    public C1229av f4538K;

    /* JADX INFO: renamed from: L */
    public double f4539L;

    /* JADX INFO: renamed from: N */
    public C1229av f4541N;

    /* JADX INFO: renamed from: b */
    public WeakReference<Context> f4545b;

    /* JADX INFO: renamed from: c */
    public int f4546c;

    /* JADX INFO: renamed from: e */
    public C1235ba f4548e;

    /* JADX INFO: renamed from: f */
    public String f4549f;

    /* JADX INFO: renamed from: g */
    public String f4550g;

    /* JADX INFO: renamed from: h */
    public Map<String, Object> f4551h;

    /* JADX INFO: renamed from: i */
    public C1243h f4552i;

    /* JADX INFO: renamed from: j */
    public C1257v f4553j;

    /* JADX INFO: renamed from: k */
    public C1163b f4554k;

    /* JADX INFO: renamed from: o */
    public boolean f4558o;

    /* JADX INFO: renamed from: p */
    public boolean f4559p;

    /* JADX INFO: renamed from: s */
    public String f4562s;

    /* JADX INFO: renamed from: u */
    public long f4564u;

    /* JADX INFO: renamed from: v */
    public int f4565v;

    /* JADX INFO: renamed from: w */
    public int f4566w;

    /* JADX INFO: renamed from: z */
    public boolean f4569z;

    /* JADX INFO: renamed from: P */
    private final String f4543P = getClass().getSimpleName();

    /* JADX INFO: renamed from: d */
    public String f4547d = "";

    /* JADX INFO: renamed from: l */
    public boolean f4555l = false;

    /* JADX INFO: renamed from: m */
    public boolean f4556m = false;

    /* JADX INFO: renamed from: n */
    public boolean f4557n = false;

    /* JADX INFO: renamed from: q */
    public boolean f4560q = false;

    /* JADX INFO: renamed from: r */
    public boolean f4561r = false;

    /* JADX INFO: renamed from: x */
    public Object f4567x = new Object();

    /* JADX INFO: renamed from: y */
    public double f4568y = -1.0d;

    /* JADX INFO: renamed from: A */
    public double f4528A = -1.0d;

    /* JADX INFO: renamed from: D */
    public InterfaceRunnableC1313b f4531D = null;

    /* JADX INFO: renamed from: J */
    public InterfaceRunnableC1313b f4537J = new InterfaceRunnableC1313b() { // from class: com.anythink.core.common.g.1
        @Override // java.lang.Runnable
        public final void run() {
            C1335b.m3998a().m4010c(new Runnable() { // from class: com.anythink.core.common.g.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1262g.this.m3587a();
                }
            });
        }
    };

    /* JADX INFO: renamed from: M */
    public boolean f4540M = false;

    /* JADX INFO: renamed from: O */
    public boolean f4542O = false;

    /* JADX INFO: renamed from: a */
    public Context f4544a = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: t */
    public AdError f4563t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");

    /* JADX INFO: renamed from: B */
    public Map<String, C1366e> f4529B = new ConcurrentHashMap();

    /* JADX INFO: renamed from: C */
    public List<C1229av> f4530C = Collections.synchronizedList(new ArrayList(3));

    /* JADX INFO: renamed from: F */
    public C1371j f4533F = new C1371j();

    /* JADX INFO: renamed from: I */
    public List<ATBaseAdAdapter> f4536I = new ArrayList();

    /* JADX INFO: renamed from: com.anythink.core.common.g$2, reason: invalid class name */
    public class AnonymousClass2 implements InterfaceRunnableC1313b {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1262g.this.f4531D = null;
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.g.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1262g.this.m3570j();
                }
            }, 2, true);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.g$3, reason: invalid class name */
    public class AnonymousClass3 implements InterfaceRunnableC1313b {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1262g.this.m3576p();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.g$5, reason: invalid class name */
    public class AnonymousClass5 implements InterfaceC1364c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1229av f4580a;

        public AnonymousClass5(C1229av c1229av) {
            this.f4580a = c1229av;
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3605a(ATBaseAdAdapter aTBaseAdAdapter, String str) {
            C1262g.this.m3590a(aTBaseAdAdapter, str);
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3606a(C1243h c1243h) {
            C1320c.m3839a(C1262g.this.f4544a).m3851a(1, c1243h);
            C1352p.m4208a(c1243h, C1169h.n.f3175a, C1169h.n.f3188n, "");
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3607a(C1243h c1243h, ATBaseAdAdapter aTBaseAdAdapter) {
            C1262g.m3535a(C1262g.this, c1243h);
            if (this.f4580a.m2746aD() == 1) {
                C1262g.m3532a(C1262g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3608a(String str, ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av, C1234b c1234b) {
            C1262g.this.m3543a(str, aTBaseAdAdapter, c1234b.m2905e(), c1229av);
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3609a(String str, ATBaseAdAdapter aTBaseAdAdapter, C1363b c1363b) {
            C1262g.this.m3595a(str, c1363b);
            if (aTBaseAdAdapter == null || aTBaseAdAdapter.getUnitGroupInfo() == null) {
                return;
            }
            aTBaseAdAdapter.getUnitGroupInfo();
            if (this.f4580a.m2746aD() == 1) {
                C1262g.m3554b(C1262g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3610a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
            IATAdFilter iATAdFilterM2166p = C1175n.m2059a().m2166p(C1262g.this.f4550g);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (iATAdFilterM2166p == null || !iATAdFilterM2166p.isAdFilter(C1171j.m2045a(aTBaseAdAdapter), baseAd)) {
                C1262g.this.m3594a(str, aTBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
            } else {
                C1363b c1363b = new C1363b();
                c1363b.f5364a = 8;
                c1363b.f5366c = aTBaseAdAdapter.getTrackingInfo().m3042S();
                c1363b.f5365b = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                c1363b.f5367d = aTBaseAdAdapter.getTrackingInfo();
                c1363b.f5368e = aTBaseAdAdapter.getUnitGroupInfo();
                C1262g.this.m3595a(str, c1363b);
            }
            if (this.f4580a.m2746aD() == 1) {
                C1262g.m3554b(C1262g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.p069p.InterfaceC1364c
        /* JADX INFO: renamed from: a */
        public final void mo3611a(String str, String str2) {
            C1262g.this.m3542a(str);
            if (this.f4580a.m2746aD() == 1) {
                C1262g.this.m3521E();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final int f4586a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f4587b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f4588c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f4589d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f4590e = 5;
    }

    public C1262g(Context context) {
        this.f4545b = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: A */
    private synchronized boolean m3517A() {
        StringBuilder sb = new StringBuilder("hasFinishAllRequest:\n isFinishBidding: ");
        sb.append(this.f4555l);
        sb.append("\n requestWaitingPool: ");
        sb.append(this.f4534G.m4348c());
        sb.append("\n requestingPool: ");
        sb.append(this.f4534G.m4352e());
        sb.append("\n defaultRequestWaitingPool: ");
        sb.append(this.f4534G.m4354f());
        sb.append("\n showCapWaitingPool: ");
        sb.append(this.f4534G.m4361k());
        return this.f4534G.m4372v();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m3518B() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.anythink.core.common.p.g r0 = r1.f4534G     // Catch: java.lang.Throwable -> L16
            int r0 = r0.m4348c()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L14
            com.anythink.core.common.p.g r0 = r1.f4534G     // Catch: java.lang.Throwable -> L16
            int r0 = r0.m4352e()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L14
            r0 = 1
        L12:
            monitor-exit(r1)
            return r0
        L14:
            r0 = 0
            goto L12
        L16:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1262g.m3518B():boolean");
    }

    /* JADX INFO: renamed from: C */
    private void m3519C() {
        if (this.f4537J != null) {
            C1315d.m3806a().mo3801b(this.f4537J);
        }
    }

    /* JADX INFO: renamed from: D */
    private C1234b m3520D() {
        C1151c.a aVar;
        C1234b c1234bM1911a = C1148a.m1904a().m1911a(this.f4544a, this.f4550g);
        return (c1234bM1911a == null && (aVar = this.f4535H) != null) ? aVar.m1947a() : c1234bM1911a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m3521E() {
        if (this.f4536I.size() == 0) {
            return;
        }
        synchronized (this.f4536I) {
            Iterator<ATBaseAdAdapter> it = this.f4536I.iterator();
            while (it.hasNext()) {
                it.next().destory();
            }
            this.f4536I.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3522a(int i, List<C1229av> list, final C1288i.a aVar) {
        boolean z = this.f4538K != null || C1359w.m4261a(this.f4530C);
        C1202a c1202a = new C1202a();
        c1202a.f3678b = this.f4544a;
        c1202a.f3679c = this.f4553j;
        c1202a.f3680d = this.f4549f;
        c1202a.f3681e = this.f4550g;
        c1202a.f3682f = this.f4548e.m2916a().m5090ah();
        c1202a.f3683g = this.f4548e.m2927l();
        c1202a.f3684h = this.f4548e.m2928m();
        C1267h.m3614a();
        c1202a.f3688l = C1267h.m3616a(this.f4548e.m2916a(), z);
        C1267h.m3614a();
        c1202a.f3691o = C1267h.m3615a(this.f4548e.m2916a());
        C1267h.m3614a();
        c1202a.f3692p = C1267h.m3620b(this.f4548e.m2916a());
        c1202a.f3686j = list;
        c1202a.f3690n = this.f4548e;
        c1202a.f3695s = this.f4552i;
        c1202a.f3693q = this.f4551h;
        c1202a.f3698v = this.f4534G.m4368r();
        c1202a.f3699w = this.f4534G.m4369s();
        c1202a.f3700x = this.f4534G.m4370t();
        c1202a.f3689m = z;
        c1202a.f3696t = i;
        c1202a.f3697u = C1344h.m4129a(this.f4541N);
        c1202a.f3701y = this.f4534G.m4335a();
        C1101b c1101b = new C1101b(c1202a);
        c1101b.mo1625a(ATSDK.isNetworkLogDebug());
        c1101b.mo1624a(new C1288i.a() { // from class: com.anythink.core.common.g.8
            @Override // com.anythink.core.common.C1288i.a
            /* JADX INFO: renamed from: a */
            public final void mo2408a(String str) {
                C1288i.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo2408a(str);
                }
            }

            @Override // com.anythink.core.common.C1288i.a
            /* JADX INFO: renamed from: a */
            public final void mo2409a(String str, List<C1229av> list2, List<C1229av> list3, boolean z3) {
                C1288i.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo2409a(str, list2, list3, z3);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m3523a(long j) {
        if (this.f4532E != null) {
            C1315d.m3806a().mo3800a(this.f4532E, j, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3524a(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f4536I) {
            if (aTBaseAdAdapter != null) {
                this.f4536I.add(aTBaseAdAdapter);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3525a(AdError adError) {
        C1317n c1317n;
        C1352p.m4211a("Mediation", "placementId:" + this.f4550g + ";result_callback:fail;loadType:" + this.f4553j.f4483d + ";");
        C1388v.m4576a(this.f4544a).m4580a(this.f4550g, this.f4549f, false);
        C1257v c1257v = this.f4553j;
        if (c1257v == null || (c1317n = c1257v.f4485f) == null) {
            return;
        }
        c1317n.m3815a(2, c1257v, this.f4548e, adError);
        this.f4553j.f4485f = null;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m3526a(C1229av c1229av) {
        this.f4534G.m4345b(c1229av);
    }

    /* JADX INFO: renamed from: a */
    private void m3527a(C1229av c1229av, double d, boolean z) {
        if (c1229av == null) {
            return;
        }
        m3564d(c1229av);
        if (d > this.f4568y) {
            this.f4568y = d;
            if (d != d || !z || !this.f4569z) {
                this.f4569z = !z;
            }
        }
        double dM4129a = C1344h.m4129a(c1229av);
        double d2 = this.f4528A;
        if (d2 == -1.0d || dM4129a < d2) {
            this.f4528A = dM4129a;
        }
        boolean zM4353e = this.f4534G.m4353e(c1229av);
        if (this.f4557n && this.f4556m && zM4353e) {
            C1141b.m1860a().m1865a(this.f4550g, this.f4549f, this.f4548e.m2916a().m5097ao(), this.f4534G.m4343b().m3392a());
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m3528a(C1229av c1229av, int i) {
        this.f4534G.m4346b(c1229av, i);
    }

    /* JADX INFO: renamed from: a */
    private void m3529a(C1243h c1243h) {
        this.f4552i = c1243h;
    }

    /* JADX INFO: renamed from: a */
    private void m3530a(C1243h c1243h, AdError adError) {
        C1163b c1163b = this.f4554k;
        if (c1163b != null) {
            c1163b.m2019b(c1243h, adError);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3532a(C1262g c1262g, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (c1262g.f4536I) {
                if (aTBaseAdAdapter != null) {
                    c1262g.f4536I.add(aTBaseAdAdapter);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3535a(C1262g c1262g, C1243h c1243h) {
        C1163b c1163b = c1262g.f4554k;
        if (c1163b != null) {
            c1163b.m2020c(c1243h);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3536a(C1262g c1262g, C1366e c1366e, C1243h c1243h, C1229av c1229av) {
        C1365d c1365d = new C1365d();
        c1365d.f5369a = c1262g.f4544a;
        c1365d.f5370b = c1262g.f4545b;
        c1365d.f5371c = c1262g.f4549f;
        c1365d.f5372d = c1262g.f4550g;
        c1365d.f5373e = c1262g.f4548e.m2916a();
        c1365d.f5374f = c1262g.f4551h;
        c1365d.f5375g = c1262g.f4565v;
        c1365d.f5376h = c1243h;
        c1365d.f5377i = c1262g.f4534G.m4370t();
        c1366e.m4310a(c1365d);
        c1366e.m4309a(c1262g.new AnonymousClass5(c1229av));
        c1366e.m4307a(c1262g.f4528A);
    }

    /* JADX INFO: renamed from: a */
    private void m3539a(C1366e c1366e) {
        boolean zM4313d = c1366e.m4313d();
        if (zM4313d) {
            this.f4534G.m4337a(-1, c1366e.m4314e());
        }
        m3556b(c1366e);
        m3579s();
        if (this.f4535H != null && this.f4534G.m4343b().m3392a() != this.f4535H.m1952e() && this.f4568y >= this.f4535H.m1951d()) {
            StringBuilder sb = new StringBuilder("checkToRequestNextAdSource release mAdxDefaultCacheInfo,mLoadedMaxPrice:");
            sb.append(this.f4568y);
            sb.append(", mAdxDefaultCacheInfo.getPrice():");
            sb.append(this.f4535H.m1951d());
            this.f4535H.m1950c();
        }
        if (zM4313d) {
            if (this.f4534G.m4365o() == 0 && this.f4534G.m4348c() == 0 && (this.f4560q || this.f4555l)) {
                m3582v();
            }
            new StringBuilder("checkToRequestNextAdSource: try to call next AdSource.||").append(c1366e.m4314e());
            this.f4534G.m4336a(c1366e.m4314e());
            m3544a(this.f4534G.m4344b(c1366e.m4314e()), c1366e.m4314e());
            m3572l();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3540a(C1366e c1366e, ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av, C1243h c1243h, boolean z, BaseAd... baseAdArr) {
        int i;
        c1243h.m3091g(aTBaseAdAdapter.getInternalNetworkPlacementId());
        double dM4129a = c1366e.m4314e() != 2 ? C1344h.m4129a(c1229av) : 0.0d;
        m3527a(c1229av, dM4129a, z);
        C1109b.m1668a(aTBaseAdAdapter, c1229av, c1243h, baseAdArr);
        this.f4534G.m4355f(c1229av);
        double d = this.f4539L;
        if (d <= 0.0d) {
            i = 0;
        } else {
            if (d < dM4129a) {
                c1243h.f4215s = 2;
                C1368g.m4320a(this.f4544a, this.f4550g, this.f4549f, c1229av, null);
            }
            i = 1;
        }
        c1243h.f4215s = i;
        C1368g.m4320a(this.f4544a, this.f4550g, this.f4549f, c1229av, null);
    }

    /* JADX INFO: renamed from: a */
    private void m3541a(C1366e c1366e, C1243h c1243h, C1229av c1229av) {
        C1365d c1365d = new C1365d();
        c1365d.f5369a = this.f4544a;
        c1365d.f5370b = this.f4545b;
        c1365d.f5371c = this.f4549f;
        c1365d.f5372d = this.f4550g;
        c1365d.f5373e = this.f4548e.m2916a();
        c1365d.f5374f = this.f4551h;
        c1365d.f5375g = this.f4565v;
        c1365d.f5376h = c1243h;
        c1365d.f5377i = this.f4534G.m4370t();
        c1366e.m4310a(c1365d);
        c1366e.m4309a(new AnonymousClass5(c1229av));
        c1366e.m4307a(this.f4528A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m3542a(String str) {
        if (this.f4533F.m4382b()) {
            return;
        }
        m3539a(this.f4529B.get(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m3543a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, C1229av c1229av) {
        C1366e c1366eRemove = this.f4529B.remove(str);
        if (c1366eRemove == null) {
            return;
        }
        m3540a(c1366eRemove, aTBaseAdAdapter, c1229av, aTBaseAdAdapter.getTrackingInfo(), true, baseAd);
        new StringBuilder("[Enter] onCacheAdLoaded: ").append(c1229av.toString());
        m3526a(c1229av);
        m3581u();
        m3560c(aTBaseAdAdapter.getTrackingInfo());
        c1229av.m2842u();
        m3539a(c1366eRemove);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m3544a(List<C1229av> list, int i) {
        if (!this.f4533F.m4382b() && !this.f4533F.m4383c() && list != null && list.size() != 0) {
            this.f4534G.m4341a(list);
            new StringBuilder("addAdSourceToRequestingPool:start to request:  requesting size:").append(this.f4534G.m4352e());
            Iterator<C1229av> it = list.iterator();
            while (it.hasNext()) {
                m3551b(it.next(), i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3545a(Map<String, Object> map) {
        this.f4551h = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m3546a(C1243h c1243h, C1229av c1229av, int i, String str) {
        boolean z;
        C1240e c1240eM4571c = C1387u.m4556a().m4571c(this.f4550g);
        if (c1240eM4571c == null || !c1240eM4571c.m2974a(c1229av)) {
            z = false;
        } else {
            C1352p.m4209a(this.f4550g, c1243h, "Can't Load On Showing", c1229av, -1, -1);
            C1322e.m3878a(c1243h, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
            C1387u.m4556a().m4565a(this.f4550g, c1240eM4571c.m2973a(), this.f4549f);
            this.f4534G.m4339a(c1229av, i);
            m3526a(c1229av);
            this.f4534G.m4336a(i);
            this.f4529B.remove(str);
            this.f4534G.m4337a(-1, i);
            m3544a(this.f4534G.m4344b(i), i);
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private void m3548b(long j) {
        C1315d.m3806a().mo3800a(this.f4537J, j, false);
    }

    /* JADX INFO: renamed from: b */
    private void m3549b(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f4536I) {
            if (aTBaseAdAdapter != null) {
                this.f4536I.remove(aTBaseAdAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3550b(C1229av c1229av) {
        this.f4563t.putNetworkErrorMsg(c1229av.m2842u(), c1229av.m2784d(), c1229av.m2789e(), ErrorCode.getErrorCode(ErrorCode.noADError, "", c1229av.m2698A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3551b(final C1229av c1229av, final int i) {
        final C1366e c1366e = new C1366e(c1229av, i);
        final String strM4306a = c1366e.m4306a();
        this.f4529B.put(strM4306a, c1366e);
        this.f4534G.m4337a(1, i);
        C1335b.m3998a().m4010c(new Runnable() { // from class: com.anythink.core.common.g.4
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                synchronized (C1262g.this) {
                    if (C1262g.this.f4533F.m4382b()) {
                        C1262g.this.f4529B.remove(strM4306a);
                        return;
                    }
                    if (C1359w.m4260a(c1229av) && TextUtils.isEmpty(C1387u.m4556a().m4561a(C1262g.this.f4550g, c1229av.m2784d()))) {
                        C1387u.m4556a().m4562a(C1262g.this.f4550g, c1229av.m2784d(), c1229av.m2804h());
                    }
                    boolean zM3557b = C1262g.m3557b(i);
                    C1243h c1243hM3045V = C1262g.this.f4552i.m3045V();
                    if (zM3557b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c1229av.m2784d());
                        string = sb.toString();
                    } else {
                        string = C1262g.this.f4562s;
                    }
                    c1243hM3045V.m3111m(string);
                    C1358v.m4253a(c1243hM3045V, c1229av, C1262g.this.f4565v, true);
                    c1243hM3045V.m3068c(SystemClock.elapsedRealtime() - C1262g.this.f4564u);
                    if (C1262g.this.m3546a(c1243hM3045V, c1229av, i, strM4306a)) {
                        return;
                    }
                    String unused = C1262g.this.f4543P;
                    new StringBuilder("startAdSourceRequest: ").append(c1229av.toString());
                    boolean zM4326a = C1368g.m4326a(C1262g.this.f4550g, c1229av, c1243hM3045V);
                    C1262g.this.f4565v++;
                    if (zM4326a) {
                        C1363b c1363b = new C1363b();
                        c1363b.f5364a = 6;
                        c1363b.f5365b = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                        c1363b.f5366c = 0L;
                        c1363b.f5367d = c1243hM3045V;
                        c1363b.f5368e = c1229av;
                        C1262g.this.m3595a(strM4306a, c1363b);
                        return;
                    }
                    if (c1229av.m2821k()) {
                        C1262g.this.m3564d(c1229av);
                    }
                    int iM2749ab = c1229av.m2749ab();
                    if (iM2749ab > 0) {
                        c1243hM3045V.f4213q = iM2749ab;
                    } else {
                        C1262g c1262g = C1262g.this;
                        if (c1262g.f4556m && c1262g.f4566w < c1262g.f4548e.m2923h()) {
                            iM2749ab = 5;
                            c1243hM3045V.f4213q = iM2749ab;
                        }
                    }
                    C1262g.m3536a(C1262g.this, c1366e, c1243hM3045V, c1229av);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m3552b(C1243h c1243h) {
        C1163b c1163b = this.f4554k;
        if (c1163b != null) {
            c1163b.m2020c(c1243h);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3554b(C1262g c1262g, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (c1262g.f4536I) {
                if (aTBaseAdAdapter != null) {
                    c1262g.f4536I.remove(aTBaseAdAdapter);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3556b(C1366e c1366e) {
        if (c1366e.m4312c() == null || !c1366e.m4312c().booleanValue() || c1366e.m4314e() == 2 || !c1366e.m4312c().booleanValue()) {
            return;
        }
        this.f4566w++;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m3557b(int i) {
        return i == 3 || i == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m3559c(C1229av c1229av) {
        this.f4534G.m4349c(c1229av);
        C1368g.m4320a(this.f4544a, this.f4550g, this.f4549f, null, c1229av);
        this.f4534G.m4351d(c1229av);
    }

    /* JADX INFO: renamed from: c */
    private void m3560c(C1243h c1243h) {
        C1163b c1163b = this.f4554k;
        if (c1163b != null) {
            c1163b.m2021d(c1243h);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3562c(int i) {
        return i == 3 || i == 5;
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m3563d(int i) {
        int iM4366p = i != 2 ? this.f4534G.m4366p() : this.f4534G.m4367q();
        if (iM4366p == 0) {
            StringBuilder sb = new StringBuilder("checkToAddAdSourceToRequestingPool: vail requesting num: ");
            sb.append(iM4366p);
            sb.append(" | requestFrom: ");
            sb.append(i);
            m3544a(this.f4534G.m4344b(i), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m3564d(C1229av c1229av) {
        if (c1229av != null && C1368g.m4328h(c1229av) > C1344h.m4129a(this.f4541N)) {
            this.f4541N = c1229av;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3566e(int i) {
        m3582v();
        if (this.f4540M) {
            return;
        }
        m3568f(i);
    }

    /* JADX INFO: renamed from: f */
    private void m3568f(int i) {
        C1396f c1396fM2916a;
        C1352p.m4211a("Mediation", "placementId:" + this.f4550g + ";result_callback:success;loadType:" + this.f4553j.f4483d + ";");
        C1388v.m4576a(this.f4544a).m4580a(this.f4550g, this.f4549f, true);
        C1257v c1257v = this.f4553j;
        if (c1257v != null && c1257v.f4485f != null) {
            boolean z = false;
            try {
                C1235ba c1235ba = this.f4548e;
                if (c1235ba != null && (c1396fM2916a = c1235ba.m2916a()) != null) {
                    try {
                        C1387u c1387uM4556a = C1387u.m4556a();
                        String str = this.f4550g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f4548e.m2916a().m5090ah());
                        if (c1387uM4556a.m4559a(str, sb.toString()) != null) {
                            C1201f.m2352a(c1396fM2916a, this.f4552i);
                            C1201f.m2362b(c1396fM2916a, this.f4552i);
                        }
                    } catch (C1242g e) {
                        C1257v c1257v2 = this.f4553j;
                        c1257v2.f4485f.m3815a(1, c1257v2, this.f4548e, e.f4117a);
                        z = true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!z) {
                C1257v c1257v3 = this.f4553j;
                c1257v3.f4485f.m3814a(this.f4569z ? 1 : 2, c1257v3, this.f4548e, i);
            }
            this.f4553j.f4485f = null;
        }
        C1141b.m1860a().m1865a(this.f4550g, this.f4549f, this.f4548e.m2916a().m5097ao(), this.f4534G.m4343b().m3392a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public synchronized void m3570j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4550g);
        sb.append(":filled timeup to check cache.");
        C1234b c1234bM3520D = m3520D();
        this.f4561r = true;
        if (this.f4557n || c1234bM3520D == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f4550g);
            sb2.append(":filled timeup to check no cache, do nothing.");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f4550g);
            sb3.append(":filled timeup to check cache exist.");
            C1229av unitGroupInfo = c1234bM3520D.m2904d() != null ? c1234bM3520D.m2904d().getUnitGroupInfo() : null;
            m3527a(unitGroupInfo, C1344h.m4129a(unitGroupInfo), true);
            m3589a(9);
        }
    }

    /* JADX INFO: renamed from: k */
    private synchronized void m3571k() {
        if (this.f4558o) {
            this.f4534G.m4347b(this.f4552i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public synchronized void m3572l() {
        double dM4333a = this.f4534G.m4333a(false);
        double dM3580t = m3580t();
        new StringBuilder("checkWaterfallStatus: vail requesting num: ").append(this.f4534G.m4365o());
        new StringBuilder("checkWaterfallStatus:isFinishBidding:").append(this.f4555l);
        new StringBuilder("checkWaterfallStatus:currentCacheNum >= mStrategy.getCachedOffersNum():").append(this.f4566w >= this.f4548e.m2923h());
        new StringBuilder("checkWaterfallStatus:getCacheLowestPrice() > getWaitingResponseMaxPrice():").append(dM4333a > dM3580t);
        new StringBuilder("checkWaterfallStatus:requestHasShow:").append(this.f4533F.m4383c());
        new StringBuilder("checkWaterfallStatus:hasLongTimeout:").append(this.f4533F.m4382b());
        if ((this.f4555l && this.f4566w >= this.f4548e.m2923h() && dM4333a >= dM3580t) || this.f4533F.m4383c() || this.f4533F.m4382b()) {
            this.f4558o = true;
            m3571k();
            if (this.f4534G.m4365o() == 0) {
                C1368g.m4319a(this.f4544a, this.f4550g);
                C1368g.m4323a(this.f4550g);
                m3578r();
            }
        }
        m3577q();
        if (this.f4558o || m3517A()) {
            m3578r();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m3573m() {
        if (this.f4535H != null) {
            C1243h c1243hM3045V = this.f4552i.m3045V();
            C1358v.m4253a(c1243hM3045V, this.f4535H.m1952e(), 0, true);
            this.f4535H.m1948a(this.f4549f, c1243hM3045V);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m3574n() {
        if (this.f4548e.m2925j() < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4550g);
            sb.append(": no filled count down.");
        } else {
            this.f4531D = new AnonymousClass2();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f4550g);
            sb2.append(": start filled count down.mWaterfallSetting.getWaitWaterfaillFillTime():");
            sb2.append(this.f4548e.m2925j());
            C1315d.m3806a().mo3800a(this.f4531D, this.f4548e.m2925j(), false);
        }
    }

    /* JADX INFO: renamed from: o */
    private InterfaceRunnableC1313b m3575o() {
        return new AnonymousClass3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public synchronized void m3576p() {
        if (!this.f4557n && this.f4534G.m4354f() > 0) {
            this.f4532E = null;
            C1229av c1229avM4356g = this.f4534G.m4356g();
            new StringBuilder("handleDefaultAdSourceRequest: startLoadDefaultAdSource:").append(c1229avM4356g.toString());
            this.f4534G.m4338a(c1229avM4356g);
            StringBuilder sb = new StringBuilder("handleDefaultAdSourceRequest:start to request: waiting size:");
            sb.append(this.f4534G.m4354f());
            sb.append("; requesting size:");
            sb.append(this.f4534G.m4367q());
            m3551b(c1229avM4356g, 2);
        }
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m3577q() {
        C1252q c1252qM2719M;
        if (!this.f4533F.m4387g() && this.f4533F.m4385e()) {
            if (this.f4533F.m4382b()) {
                return;
            }
            if (this.f4552i.m3047X()) {
                new StringBuilder("tryToSendWinNotice(), in adx network mode, do nothing: ").append(this.f4550g);
                return;
            }
            C1229av c1229avM4342b = this.f4534G.m4342b(this.f4555l);
            if (c1229avM4342b != null && (c1252qM2719M = c1229avM4342b.m2719M()) != null) {
                this.f4533F.m4388h();
                new StringBuilder("tryToSendWinNotice(), send win notice: ").append(c1229avM4342b.toString());
                C1109b.m1673a(c1252qM2719M, c1229avM4342b);
            }
            return;
        }
        StringBuilder sb = new StringBuilder("tryToSendWinNotice(), mHasSendWinNotice: ");
        sb.append(this.f4533F.m4387g());
        sb.append(", mHasHBAdSource: ");
        sb.append(this.f4533F.m4385e());
    }

    /* JADX INFO: renamed from: r */
    private synchronized void m3578r() {
        if (!this.f4533F.m4385e()) {
            new StringBuilder("tryToSendLossNotice(), mHasHBAdSource: ").append(this.f4533F.m4385e());
        } else {
            if (this.f4533F.m4382b()) {
                return;
            }
            this.f4534G.m4340a(this.f4552i.m3045V());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public synchronized void m3579s() {
        boolean z;
        double dM3580t = m3580t();
        double d = this.f4568y;
        if (d >= 0.0d) {
            if (((this.f4555l || this.f4560q) && d >= dM3580t) || this.f4561r) {
                if (!this.f4557n) {
                    m3589a(-1);
                }
                m3583w();
            }
        } else if (this.f4555l) {
            if (this.f4532E == null || !m3518B()) {
                z = false;
            } else {
                C1315d.m3806a().mo3801b(this.f4532E);
                this.f4532E.run();
                this.f4532E = null;
                z = true;
            }
            if (z) {
                return;
            }
            if (m3517A() && !this.f4557n) {
                m3586z();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private double m3580t() {
        C1229av c1229avM4318a;
        if (this.f4548e.m2926k() == 2) {
            synchronized (this.f4529B) {
                c1229avM4318a = C1368g.m4318a(this.f4529B);
            }
        } else {
            c1229avM4318a = null;
        }
        return Math.max(Math.max(C1344h.m4129a(this.f4534G.m4350d()), C1344h.m4129a(this.f4534G.m4360j())), C1344h.m4129a(c1229avM4318a));
    }

    /* JADX INFO: renamed from: u */
    private synchronized void m3581u() {
        this.f4534G.m4359i();
        if (this.f4532E != null) {
            C1315d.m3806a().mo3801b(this.f4532E);
            this.f4532E = null;
        }
    }

    /* JADX INFO: renamed from: v */
    private synchronized boolean m3582v() {
        if (this.f4534G.m4363m()) {
            return false;
        }
        if (this.f4533F.m4383c()) {
            return false;
        }
        this.f4533F.m4386f();
        this.f4542O = true;
        m3522a(8, this.f4534G.m4364n(), new C1288i.a() { // from class: com.anythink.core.common.g.6
            @Override // com.anythink.core.common.C1288i.a
            /* JADX INFO: renamed from: a */
            public final void mo2408a(String str) {
            }

            @Override // com.anythink.core.common.C1288i.a
            /* JADX INFO: renamed from: a */
            public final void mo2409a(String str, List<C1229av> list, List<C1229av> list2, boolean z) {
                for (C1229av c1229av : list) {
                    C1262g.this.m3559c(c1229av);
                    c1229av.m2849x(8);
                    C1262g.this.f4534G.m4338a(c1229av);
                    C1262g.this.m3551b(c1229av, 3);
                }
                if (list2 != null) {
                    Iterator<C1229av> it = list2.iterator();
                    while (it.hasNext()) {
                        C1262g.this.m3550b(it.next());
                    }
                }
                C1262g c1262g = C1262g.this;
                c1262g.f4542O = false;
                c1262g.m3579s();
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: w */
    private synchronized void m3583w() {
        if (this.f4555l) {
            if (this.f4533F.m4383c()) {
                return;
            }
            List<C1229av> list = this.f4530C;
            if (list != null && list.size() != 0) {
                if (this.f4559p) {
                    return;
                }
                this.f4559p = true;
                m3522a(7, this.f4530C, new C1288i.a() { // from class: com.anythink.core.common.g.7
                    @Override // com.anythink.core.common.C1288i.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2408a(String str) {
                    }

                    @Override // com.anythink.core.common.C1288i.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2409a(String str, List<C1229av> list2, List<C1229av> list3, boolean z) {
                        if (C1262g.this.f4533F.m4383c()) {
                            String unused = C1262g.this.f4543P;
                            for (C1229av c1229av : list2) {
                                C1262g.this.f4534G.m4351d(c1229av);
                                C1368g.m4321a(c1229av, C1262g.this.f4552i);
                            }
                            return;
                        }
                        C1262g c1262g = C1262g.this;
                        if (c1262g.f4566w < c1262g.f4548e.m2923h()) {
                            String unused2 = C1262g.this.f4543P;
                            C1262g.this.m3596a(list2, (List<C1229av>) null, (List<C1229av>) null);
                            C1262g.this.m3572l();
                            return;
                        }
                        String unused3 = C1262g.this.f4543P;
                        double dM4333a = C1262g.this.f4534G.m4333a(false);
                        int size = list2.size();
                        ArrayList<C1229av> arrayList = new ArrayList(size);
                        ArrayList arrayList2 = new ArrayList(size);
                        for (int i = 0; i < size; i++) {
                            C1229av c1229av2 = list2.get(i);
                            C1262g.this.f4534G.m4351d(c1229av2);
                            if (C1344h.m4129a(c1229av2) > dM4333a) {
                                arrayList.add(c1229av2);
                            } else {
                                arrayList2.add(c1229av2);
                            }
                        }
                        for (C1229av c1229av3 : arrayList) {
                            C1262g.this.m3559c(c1229av3);
                            c1229av3.m2849x(7);
                            C1262g.this.f4534G.m4338a(c1229av3);
                            C1262g.this.m3551b(c1229av3, 5);
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1368g.m4321a((C1229av) it.next(), C1262g.this.f4552i);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m3584x() {
        if (this.f4532E == null || !m3518B()) {
            return false;
        }
        C1315d.m3806a().mo3801b(this.f4532E);
        this.f4532E.run();
        this.f4532E = null;
        return true;
    }

    /* JADX INFO: renamed from: y */
    private void m3585y() {
        C1317n c1317n;
        this.f4557n = true;
        this.f4556m = false;
        if (this.f4537J != null) {
            C1315d.m3806a().mo3801b(this.f4537J);
        }
        C1322e.m3881a(this.f4552i.m3045V(), this.f4563t);
        if (!this.f4540M) {
            AdError adError = this.f4563t;
            C1352p.m4211a("Mediation", "placementId:" + this.f4550g + ";result_callback:fail;loadType:" + this.f4553j.f4483d + ";");
            C1388v.m4576a(this.f4544a).m4580a(this.f4550g, this.f4549f, false);
            C1257v c1257v = this.f4553j;
            if (c1257v != null && (c1317n = c1257v.f4485f) != null) {
                c1317n.m3815a(2, c1257v, this.f4548e, adError);
                this.f4553j.f4485f = null;
            }
        }
        m3601f();
    }

    /* JADX INFO: renamed from: z */
    private void m3586z() {
        C1234b c1234bM3520D = m3520D();
        if (c1234bM3520D != null) {
            C1229av unitGroupInfo = c1234bM3520D.m2904d() != null ? c1234bM3520D.m2904d().getUnitGroupInfo() : null;
            m3527a(unitGroupInfo, C1344h.m4129a(unitGroupInfo), true);
            m3589a(9);
        } else {
            if (m3582v()) {
                return;
            }
            m3585y();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3587a() {
        ConcurrentHashMap concurrentHashMap;
        this.f4533F.m4381a();
        synchronized (this.f4529B) {
            concurrentHashMap = new ConcurrentHashMap(this.f4529B);
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C1366e c1366e = (C1366e) ((Map.Entry) it.next()).getValue();
            if (c1366e != null) {
                c1366e.m4311b();
            }
        }
        if (!this.f4557n) {
            this.f4557n = true;
            m3586z();
        }
        m3572l();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3588a(double d, C1229av c1229av) {
        m3521E();
        if (!this.f4533F.m4387g() && c1229av != null && c1229av.m2821k()) {
            this.f4533F.m4388h();
        }
        if (d > this.f4539L) {
            this.f4539L = d;
        }
        int iM5090ah = this.f4548e.m2916a().m5090ah();
        if (iM5090ah == 0 || iM5090ah == 2) {
            return;
        }
        this.f4533F.m4384d();
        C1387u c1387uM4556a = C1387u.m4556a();
        String str = this.f4550g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4548e.m2916a().m5090ah());
        C1201f c1201fM4559a = c1387uM4556a.m4559a(str, sb.toString());
        if (c1201fM4559a != null) {
            c1201fM4559a.m2392a(this.f4549f);
        } else {
            C1322e.m3913a("AdManage is null--notifyimpression", "Id:" + this.f4550g + "--format:" + this.f4548e.m2916a().m5090ah(), C1175n.m2059a().m2168q());
        }
        if (!this.f4557n) {
            m3589a(10);
        }
        m3572l();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3589a(int r7) {
        /*
            r6 = this;
            r6.m3581u()
            com.anythink.core.common.m.b r0 = r6.f4531D
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f4550g
            r0.append(r1)
            java.lang.String r1 = ":remove filled countdown."
            r0.append(r1)
            com.anythink.core.common.m.a r0 = com.anythink.core.common.p064m.C1315d.m3806a()
            com.anythink.core.common.m.b r1 = r6.f4531D
            r0.mo3801b(r1)
            r0 = 0
            r6.f4531D = r0
        L22:
            com.anythink.core.common.a.c$a r0 = r6.f4535H
            r1 = 1
            if (r0 == 0) goto L6b
            com.anythink.core.common.f.av r0 = r0.m1952e()
            com.anythink.core.common.p.g r2 = r6.f4534G
            com.anythink.core.common.f.p r2 = r2.m4343b()
            com.anythink.core.common.f.av r2 = r2.m3392a()
            if (r0 == r2) goto L43
            com.anythink.core.common.a.c$a r0 = r6.f4535H
            double r2 = r0.m1951d()
            double r4 = r6.f4568y
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6b
        L43:
            com.anythink.core.common.a.c$a r0 = r6.f4535H
            r0.m1949b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.f4550g
            r0.append(r2)
            java.lang.String r2 = ":set adx default cache from loadedReason:"
            r0.append(r2)
            r0.append(r7)
            com.anythink.core.common.a.c$a r7 = r6.f4535H
            com.anythink.core.common.f.av r7 = r7.m1952e()
            com.anythink.core.common.a.c$a r0 = r6.f4535H
            double r2 = r0.m1951d()
            r6.m3527a(r7, r2, r1)
            r7 = 11
        L6b:
            r0 = 5
            if (r7 == r0) goto L73
            switch(r7) {
                case 9: goto L73;
                case 10: goto L73;
                case 11: goto L73;
                default: goto L71;
            }
        L71:
            r0 = 0
            goto L74
        L73:
            r0 = 1
        L74:
            r6.f4557n = r1
            r6.f4556m = r1
            com.anythink.core.common.m.b r2 = r6.f4537J
            if (r2 == 0) goto L85
            com.anythink.core.common.m.a r2 = com.anythink.core.common.p064m.C1315d.m3806a()
            com.anythink.core.common.m.b r3 = r6.f4537J
            r2.mo3801b(r3)
        L85:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f4564u
            long r2 = r2 - r4
            com.anythink.core.common.f.h r4 = r6.f4552i
            com.anythink.core.common.f.h r4 = r4.m3045V()
            r4.m3064b(r1)
            r4.m3086f(r2)
            if (r0 == 0) goto L9d
            r4.m3025E(r7)
        L9d:
            android.content.Context r0 = r6.f4544a
            com.anythink.core.common.n.c r0 = com.anythink.core.common.p065n.C1320c.m3839a(r0)
            r1 = 12
            r0.m3851a(r1, r4)
            android.content.Context r0 = r6.f4544a
            java.lang.String r1 = r6.f4550g
            com.anythink.core.common.p069p.C1368g.m4319a(r0, r1)
            java.lang.String r0 = r6.f4550g
            com.anythink.core.common.p069p.C1368g.m4323a(r0)
            r6.m3566e(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1262g.m3589a(int):void");
    }

    /* JADX INFO: renamed from: a */
    public final void m3590a(ATBaseAdAdapter aTBaseAdAdapter, String str) {
        if (aTBaseAdAdapter != null) {
            str.hashCode();
            if (str.equals("0")) {
                aTBaseAdAdapter.setRequestNum(aTBaseAdAdapter.getUnitGroupInfo().m2838s());
            } else if (str.equals("4")) {
                aTBaseAdAdapter.setFetchAdTimeout(this.f4553j.f4487h);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3591a(C1163b c1163b) {
        this.f4554k = c1163b;
    }

    /* JADX INFO: renamed from: a */
    public final void m3592a(C1257v c1257v) {
        this.f4553j = c1257v;
    }

    /* JADX INFO: renamed from: a */
    public final void m3593a(C1369h c1369h) {
        this.f4534G = new C1368g(c1369h);
        this.f4555l = c1369h.f5443g;
        this.f4549f = c1369h.f5438b;
        this.f4550g = c1369h.f5437a;
        this.f4548e = c1369h.f5439c;
        this.f4546c = c1369h.f5444h;
        this.f4562s = C1368g.m4327b(c1369h.f5440d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000a, B:9:0x0016, B:11:0x0048, B:13:0x0052, B:14:0x0055), top: B:20:0x0003 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m3594a(java.lang.String r11, com.anythink.core.api.ATBaseAdAdapter r12, java.util.List<? extends com.anythink.core.api.BaseAd> r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            if (r12 == 0) goto La
            com.anythink.core.common.f.h r0 = r12.getTrackingInfo()     // Catch: java.lang.Throwable -> L83
            r0.m3026F()     // Catch: java.lang.Throwable -> L83
        La:
            java.util.Map<java.lang.String, com.anythink.core.common.p.e> r0 = r10.f4529B     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.remove(r11)     // Catch: java.lang.Throwable -> L83
            com.anythink.core.common.p.e r0 = (com.anythink.core.common.p069p.C1366e) r0     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L16
            monitor-exit(r10)
            return
        L16:
            com.anythink.core.common.f.h r8 = r12.getTrackingInfo()     // Catch: java.lang.Throwable -> L83
            com.anythink.core.common.f.av r9 = r12.getUnitGroupInfo()     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "[Enter] onAdLoaded(): "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Throwable -> L83
            r1.append(r2)     // Catch: java.lang.Throwable -> L83
            r10.m3526a(r9)     // Catch: java.lang.Throwable -> L83
            r10.m3581u()     // Catch: java.lang.Throwable -> L83
            r6 = 0
            r1 = 0
            com.anythink.core.api.BaseAd[] r7 = new com.anythink.core.api.BaseAd[r1]     // Catch: java.lang.Throwable -> L83
            r1 = r10
            r2 = r0
            r3 = r12
            r4 = r9
            r5 = r8
            r1.m3540a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L83
            long r1 = r9.m2702C()     // Catch: java.lang.Throwable -> L83
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L55
            long r1 = r8.m3041R()     // Catch: java.lang.Throwable -> L83
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L55
            com.anythink.core.common.p065n.C1322e.m3877a(r8)     // Catch: java.lang.Throwable -> L83
        L55:
            com.anythink.core.common.f.h r1 = r12.getTrackingInfo()     // Catch: java.lang.Throwable -> L83
            r10.m3560c(r1)     // Catch: java.lang.Throwable -> L83
            android.content.Context r1 = r10.f4544a     // Catch: java.lang.Throwable -> L83
            com.anythink.core.common.n.c r1 = com.anythink.core.common.p065n.C1320c.m3839a(r1)     // Catch: java.lang.Throwable -> L83
            r2 = 2
            r1.m3851a(r2, r8)     // Catch: java.lang.Throwable -> L83
            long r5 = r9.m2834q()     // Catch: java.lang.Throwable -> L83
            com.anythink.core.common.a r1 = com.anythink.core.common.C1148a.m1904a()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r10.f4550g     // Catch: java.lang.Throwable -> L83
            r3 = r12
            r4 = r13
            r1.m1915a(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = com.anythink.core.common.p051b.C1169h.n.f3176b     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = com.anythink.core.common.p051b.C1169h.n.f3186l     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = ""
            com.anythink.core.common.p066o.C1352p.m4208a(r8, r1, r2, r3)     // Catch: java.lang.Throwable -> L83
            r10.m3539a(r0)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r10)
            return
        L83:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1262g.m3594a(java.lang.String, com.anythink.core.api.ATBaseAdAdapter, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3595a(String str, C1363b c1363b) {
        C1163b c1163b;
        C1243h c1243h = c1363b.f5367d;
        C1229av c1229av = c1363b.f5368e;
        AdError adError = c1363b.f5365b;
        long j = c1363b.f5366c;
        String strM3026F = c1243h.m3026F();
        C1366e c1366eRemove = this.f4529B.remove(str);
        if (c1366eRemove == null) {
            return;
        }
        new StringBuilder("[Enter] onAdError(): ").append(c1229av.toString());
        m3526a(c1229av);
        this.f4563t.putNetworkErrorMsg(strM3026F, c1243h.m3039P(), c1243h.m2674ae(), adError);
        C1322e.m3879a(c1243h, c1363b.f5364a, adError, j);
        if (j > 0 && (c1163b = this.f4554k) != null) {
            c1163b.m2019b(c1243h, adError);
        }
        C1352p.m4208a(c1243h, C1169h.n.f3176b, C1169h.n.f3187m, adError.printStackTrace());
        m3539a(c1366eRemove);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:5:0x0005, B:6:0x0009, B:8:0x000f, B:12:0x001e, B:14:0x0025, B:17:0x002d, B:39:0x00a3, B:40:0x00a7, B:42:0x00ad, B:43:0x00bb, B:20:0x0049, B:35:0x007b, B:37:0x0092, B:38:0x0094, B:24:0x0063, B:45:0x00bd), top: B:49:0x0005 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3596a(java.util.List<com.anythink.core.common.p055f.C1229av> r12, java.util.List<com.anythink.core.common.p055f.C1229av> r13, java.util.List<com.anythink.core.common.p055f.C1229av> r14) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4567x
            monitor-enter(r0)
            if (r13 == 0) goto L1c
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L19
        L9:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.f.av r1 = (com.anythink.core.common.p055f.C1229av) r1     // Catch: java.lang.Throwable -> L19
            r11.m3550b(r1)     // Catch: java.lang.Throwable -> L19
            goto L9
        L19:
            r12 = move-exception
            goto Lbf
        L1c:
            if (r14 == 0) goto L23
            java.util.List<com.anythink.core.common.f.av> r13 = r11.f4530C     // Catch: java.lang.Throwable -> L19
            r13.addAll(r14)     // Catch: java.lang.Throwable -> L19
        L23:
            if (r12 == 0) goto Lbd
            int r13 = r12.size()     // Catch: java.lang.Throwable -> L19
            if (r13 != 0) goto L2d
            goto Lbd
        L2d:
            com.anythink.core.common.p.j r13 = r11.f4533F     // Catch: java.lang.Throwable -> L19
            r13.m4386f()     // Catch: java.lang.Throwable -> L19
            r13 = 0
            java.lang.Object r14 = r12.get(r13)     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.f.av r14 = (com.anythink.core.common.p055f.C1229av) r14     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.p.j r1 = r11.f4533F     // Catch: java.lang.Throwable -> L19
            boolean r1 = com.anythink.core.common.p069p.C1368g.m4325a(r14, r1)     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.p.g r2 = r11.f4534G     // Catch: java.lang.Throwable -> L19
            boolean r2 = r2.m4357g(r14)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L49
            if (r2 == 0) goto La3
        L49:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "isAdvanceRequest: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L19
            r3.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = ", cutInLine: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L19
            r3.append(r2)     // Catch: java.lang.Throwable -> L19
            boolean r3 = r11.f4557n     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L63
            java.lang.String r3 = "1"
        L61:
            r9 = r3
            goto L6d
        L63:
            boolean r3 = r11.f4556m     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L6a
            java.lang.String r3 = "2"
            goto L61
        L6a:
            java.lang.String r3 = "3"
            goto L61
        L6d:
            java.lang.String r3 = "1"
            if (r1 == 0) goto L75
            java.lang.String r1 = "1"
        L73:
            r10 = r1
            goto L7b
        L75:
            if (r2 == 0) goto L7a
            java.lang.String r1 = "2"
            goto L73
        L7a:
            r10 = r3
        L7b:
            com.anythink.core.common.f.h r4 = r11.f4552i     // Catch: java.lang.Throwable -> L19
            int r5 = r14.m2784d()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r14.m2842u()     // Catch: java.lang.Throwable -> L19
            double r7 = com.anythink.core.common.p066o.C1344h.m4129a(r14)     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.p065n.C1322e.m3880a(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L19
            boolean r1 = r14.m2748aa()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L94
            r11.f4538K = r14     // Catch: java.lang.Throwable -> L19
        L94:
            r11.m3559c(r14)     // Catch: java.lang.Throwable -> L19
            r12.remove(r13)     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.p.g r13 = r11.f4534G     // Catch: java.lang.Throwable -> L19
            r13.m4338a(r14)     // Catch: java.lang.Throwable -> L19
            r13 = 3
            r11.m3551b(r14, r13)     // Catch: java.lang.Throwable -> L19
        La3:
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L19
        La7:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L19
            if (r13 == 0) goto Lbb
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L19
            com.anythink.core.common.f.av r13 = (com.anythink.core.common.p055f.C1229av) r13     // Catch: java.lang.Throwable -> L19
            r11.m3559c(r13)     // Catch: java.lang.Throwable -> L19
            r14 = 1
            r11.m3528a(r13, r14)     // Catch: java.lang.Throwable -> L19
            goto La7
        Lbb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        Lbf:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1262g.m3596a(java.util.List, java.util.List, java.util.List):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m3597b() {
        long jM4334a = this.f4534G.m4334a(this.f4555l, this.f4548e.m2916a().m5030B());
        if (jM4334a > -1) {
            this.f4532E = new AnonymousClass3();
        }
        this.f4564u = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4550g);
        sb.append(": start waterfall.");
        C1315d.m3806a().mo3800a(this.f4537J, this.f4548e.m2924i(), false);
        if (this.f4534G.m4358h() && this.f4555l) {
            m3582v();
        }
        m3544a(this.f4534G.m4371u(), 1);
        if (this.f4532E != null) {
            C1315d.m3806a().mo3800a(this.f4532E, jM4334a, false);
        }
        if (this.f4535H != null) {
            C1243h c1243hM3045V = this.f4552i.m3045V();
            C1358v.m4253a(c1243hM3045V, this.f4535H.m1952e(), 0, true);
            this.f4535H.m1948a(this.f4549f, c1243hM3045V);
        }
        if (this.f4548e.m2925j() < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f4550g);
            sb2.append(": no filled count down.");
        } else {
            this.f4531D = new AnonymousClass2();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f4550g);
            sb3.append(": start filled count down.mWaterfallSetting.getWaitWaterfaillFillTime():");
            sb3.append(this.f4548e.m2925j());
            C1315d.m3806a().mo3800a(this.f4531D, this.f4548e.m2925j(), false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3598c() {
        if (this.f4557n) {
            return true;
        }
        return this.f4555l && this.f4534G.m4348c() == 0 && this.f4534G.m4365o() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m3599d() {
        this.f4560q = true;
        m3579s();
    }

    /* JADX INFO: renamed from: e */
    public final void m3600e() {
        synchronized (this.f4567x) {
            this.f4555l = true;
            this.f4560q = true;
            m3579s();
            m3572l();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3601f() {
        this.f4540M = true;
        C1387u c1387uM4556a = C1387u.m4556a();
        String str = this.f4550g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4548e.m2916a().m5090ah());
        C1201f c1201fM4559a = c1387uM4556a.m4559a(str, sb.toString());
        if (c1201fM4559a != null) {
            c1201fM4559a.m2392a(this.f4549f);
            return;
        }
        C1322e.m3913a("AdManage is null--notifycancel", "Id:" + this.f4550g + "--format:" + this.f4548e.m2916a().m5090ah(), C1175n.m2059a().m2168q());
    }

    /* JADX INFO: renamed from: g */
    public final void m3602g() {
        List<C1367f> listM4362l = this.f4534G.m4362l();
        synchronized (listM4362l) {
            if (listM4362l.size() > 0) {
                C1229av c1229avM4315a = listM4362l.remove(0).m4315a();
                if (!this.f4557n || this.f4566w < this.f4548e.m2923h() || C1344h.m4129a(c1229avM4315a) > this.f4568y) {
                    this.f4534G.m4338a(c1229avM4315a);
                    m3551b(c1229avM4315a, 4);
                }
            }
            if (listM4362l.size() > 0) {
                for (C1367f c1367f : listM4362l) {
                    C1229av c1229avM4315a2 = c1367f.m4315a();
                    if (!this.f4557n || this.f4566w < this.f4548e.m2923h() || C1344h.m4129a(c1229avM4315a2) > this.f4568y) {
                        int iM4316b = c1367f.m4316b();
                        if (iM4316b == 1) {
                            m3528a(c1229avM4315a2, 1);
                        } else if (iM4316b == 2) {
                            m3528a(c1229avM4315a2, 2);
                        } else if (iM4316b == 3) {
                            this.f4534G.m4338a(c1229avM4315a2);
                            m3551b(c1229avM4315a2, 3);
                        }
                        m3563d(iM4316b);
                    }
                }
            }
            listM4362l.clear();
        }
        m3572l();
    }

    /* JADX INFO: renamed from: h */
    public final C1151c.a m3603h() {
        return this.f4535H;
    }

    /* JADX INFO: renamed from: i */
    public final C1396f m3604i() {
        return this.f4548e.m2916a();
    }
}
