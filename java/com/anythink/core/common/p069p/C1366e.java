package com.anythink.core.common.p069p;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1179c;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p055f.C1222ao;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1230aw;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1241f;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p060i.C1293e;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1333b;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.C1359w;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p037a.C1086a;
import com.anythink.core.p038b.p041c.C1106a;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.core.p072d.C1396f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.p.e */
/* JADX INFO: loaded from: classes.dex */
public class C1366e {

    /* JADX INFO: renamed from: a */
    public static final String f5378a = "e";

    /* JADX INFO: renamed from: b */
    public String f5379b;

    /* JADX INFO: renamed from: c */
    public C1229av f5380c;

    /* JADX INFO: renamed from: d */
    public C1243h f5381d;

    /* JADX INFO: renamed from: e */
    public String f5382e;

    /* JADX INFO: renamed from: f */
    public int f5383f;

    /* JADX INFO: renamed from: g */
    public ATBaseAdAdapter f5384g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1364c f5385h;

    /* JADX INFO: renamed from: i */
    public boolean f5386i;

    /* JADX INFO: renamed from: j */
    public boolean f5387j;

    /* JADX INFO: renamed from: k */
    public long f5388k;

    /* JADX INFO: renamed from: l */
    public long f5389l;

    /* JADX INFO: renamed from: m */
    public InterfaceRunnableC1313b f5390m;

    /* JADX INFO: renamed from: n */
    public InterfaceRunnableC1313b f5391n;

    /* JADX INFO: renamed from: o */
    public C1365d f5392o;

    /* JADX INFO: renamed from: p */
    public Boolean f5393p;

    /* JADX INFO: renamed from: q */
    public int f5394q;

    /* JADX INFO: renamed from: r */
    public String f5395r;

    /* JADX INFO: renamed from: s */
    public boolean f5396s;

    /* JADX INFO: renamed from: com.anythink.core.common.p.e$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATBaseAdAdapter f5397a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5398b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1229av f5399c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Map f5400d;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, String str, C1229av c1229av, Map map) {
            this.f5397a = aTBaseAdAdapter;
            this.f5398b = str;
            this.f5399c = c1229av;
            this.f5400d = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC1364c interfaceC1364c = C1366e.this.f5385h;
            if (interfaceC1364c != null) {
                interfaceC1364c.mo3605a(this.f5397a, this.f5398b);
            }
            Context contextM4276a = C1366e.m4276a(C1366e.this);
            if (contextM4276a == null) {
                if (C1366e.this.f5385h != null) {
                    C1363b c1363b = new C1363b();
                    c1363b.f5364a = 0;
                    c1363b.f5366c = SystemClock.elapsedRealtime() - C1366e.this.f5388k;
                    c1363b.f5365b = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    C1366e.this.m4308a(this.f5397a, c1363b);
                    return;
                }
                return;
            }
            C1366e.m4283a(C1366e.this, contextM4276a, this.f5399c, this.f5397a);
            try {
                Map<String, Object> mapM4286b = C1366e.m4286b(C1366e.this);
                C1366e.this.f5384g = this.f5397a;
                C1293e.m3713a().m3720c();
                ATBaseAdAdapter aTBaseAdAdapter = this.f5397a;
                Map<String, Object> map = this.f5400d;
                C1366e c1366e = C1366e.this;
                aTBaseAdAdapter.internalLoad(contextM4276a, map, mapM4286b, new C1362a(c1366e.f5381d, c1366e.f5382e, this.f5400d, new a(c1366e, c1366e, this.f5397a, (byte) 0)));
                C1243h trackingInfo = this.f5397a.getTrackingInfo();
                trackingInfo.m3091g(this.f5397a.getInternalNetworkPlacementId());
                InterfaceC1364c interfaceC1364c2 = C1366e.this.f5385h;
                if (interfaceC1364c2 != null) {
                    interfaceC1364c2.mo3607a(trackingInfo, this.f5397a);
                }
            } catch (Throwable th) {
                C1363b c1363b2 = new C1363b();
                c1363b2.f5364a = 0;
                c1363b2.f5366c = SystemClock.elapsedRealtime() - C1366e.this.f5388k;
                c1363b2.f5365b = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                C1366e.this.m4308a(this.f5397a, c1363b2);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.p.e$2 */
    public class AnonymousClass2 implements InterfaceRunnableC1313b {

        /* JADX INFO: renamed from: com.anythink.core.common.p.e$2$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1366e.this.m4297l();
            }
        }

        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.common.p.e.2.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1366e.this.m4297l();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.p.e$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATBaseAdAdapter f5404a;

        public AnonymousClass3(ATBaseAdAdapter aTBaseAdAdapter) {
            aTBaseAdAdapter = aTBaseAdAdapter;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ATBaseAdAdapter aTBaseAdAdapter = aTBaseAdAdapter;
                if (aTBaseAdAdapter != null) {
                    aTBaseAdAdapter.internalDestory();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.p.e$a */
    public class a implements ATCustomLoadListener {

        /* JADX INFO: renamed from: a */
        public ATBaseAdAdapter f5406a;

        /* JADX INFO: renamed from: b */
        public C1366e f5407b;

        /* JADX INFO: renamed from: com.anythink.core.common.p.e$a$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (a.this) {
                    a aVar = a.this;
                    C1366e c1366e = aVar.f5407b;
                    if (c1366e != null && aVar.f5406a != null) {
                        c1366e.m4300o();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.anythink.core.common.p.e$a$2 */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BaseAd[] f5410a;

            public AnonymousClass2(BaseAd[] baseAdArr) {
                baseAdArr = baseAdArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATBaseAdAdapter aTBaseAdAdapter;
                synchronized (a.this) {
                    a aVar = a.this;
                    C1366e c1366e = aVar.f5407b;
                    if (c1366e != null && (aTBaseAdAdapter = aVar.f5406a) != null) {
                        c1366e.m4282a(aTBaseAdAdapter, baseAdArr);
                        a aVar2 = a.this;
                        aVar2.f5407b = null;
                        aVar2.f5406a = null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.anythink.core.common.p.e$a$3 */
        public class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5412a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5413b;

            public AnonymousClass3(String str, String str2) {
                str = str;
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (a.this) {
                    a aVar = a.this;
                    if (aVar.f5407b != null && aVar.f5406a != null) {
                        C1363b c1363b = new C1363b();
                        c1363b.f5364a = 0;
                        c1363b.f5365b = ErrorCode.getErrorCode(ErrorCode.noADError, str, str);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        a aVar2 = a.this;
                        c1363b.f5366c = jElapsedRealtime - C1366e.this.f5388k;
                        aVar2.f5407b.m4308a(aVar2.f5406a, c1363b);
                        a aVar3 = a.this;
                        aVar3.f5407b = null;
                        aVar3.f5406a = null;
                    }
                }
            }
        }

        private a(C1366e c1366e, ATBaseAdAdapter aTBaseAdAdapter) {
            this.f5407b = c1366e;
            this.f5406a = aTBaseAdAdapter;
        }

        public /* synthetic */ a(C1366e c1366e, C1366e c1366e2, ATBaseAdAdapter aTBaseAdAdapter, byte b) {
            this(c1366e2, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(BaseAd... baseAdArr) {
            C1293e.m3713a().m3721d();
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.common.p.e.a.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BaseAd[] f5410a;

                public AnonymousClass2(BaseAd[] baseAdArr2) {
                    baseAdArr = baseAdArr2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ATBaseAdAdapter aTBaseAdAdapter;
                    synchronized (a.this) {
                        a aVar = a.this;
                        C1366e c1366e = aVar.f5407b;
                        if (c1366e != null && (aTBaseAdAdapter = aVar.f5406a) != null) {
                            c1366e.m4282a(aTBaseAdAdapter, baseAdArr);
                            a aVar2 = a.this;
                            aVar2.f5407b = null;
                            aVar2.f5406a = null;
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
            C1366e.m4289d(C1366e.this);
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.common.p.e.a.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        a aVar = a.this;
                        C1366e c1366e = aVar.f5407b;
                        if (c1366e != null && aVar.f5406a != null) {
                            c1366e.m4300o();
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(String str, String str2) {
            C1293e.m3713a().m3721d();
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.common.p.e.a.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f5412a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f5413b;

                public AnonymousClass3(String str3, String str22) {
                    str = str3;
                    str = str22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        a aVar = a.this;
                        if (aVar.f5407b != null && aVar.f5406a != null) {
                            C1363b c1363b = new C1363b();
                            c1363b.f5364a = 0;
                            c1363b.f5365b = ErrorCode.getErrorCode(ErrorCode.noADError, str, str);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            a aVar2 = a.this;
                            c1363b.f5366c = jElapsedRealtime - C1366e.this.f5388k;
                            aVar2.f5407b.m4308a(aVar2.f5406a, c1363b);
                            a aVar3 = a.this;
                            aVar3.f5407b = null;
                            aVar3.f5406a = null;
                        }
                    }
                }
            });
        }
    }

    public C1366e(C1229av c1229av, int i) {
        this.f5380c = c1229av;
        this.f5394q = i;
        this.f5382e = c1229av.m2842u();
        this.f5395r = this.f5382e + "_" + hashCode();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Context m4276a(C1366e c1366e) {
        Context contextM2099E = c1366e.f5392o.f5370b.get();
        if (!(contextM2099E instanceof Activity)) {
            contextM2099E = C1175n.m2059a().m2099E();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f5378a, "requestContext = ".concat(String.valueOf(contextM2099E)));
        }
        return contextM2099E;
    }

    /* JADX INFO: renamed from: a */
    private void m4277a(long j) {
        if (j == -1) {
            return;
        }
        this.f5391n = m4298m();
        C1315d.m3806a().mo3800a(this.f5391n, j, false);
    }

    /* JADX INFO: renamed from: a */
    private void m4278a(Context context, C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
        if (C1391a.m4657at()) {
            C1178q c1178qM2182a = C1178q.m2182a(C1175n.m2059a().m2148f());
            try {
                if (c1178qM2182a.m2191c(c1229av.m2784d()) || !aTBaseAdAdapter.internalSetUserDataConsent(context, c1178qM2182a.m2190c(), ATSDK.isEUTraffic(this.f5392o.f5369a))) {
                    return;
                }
                c1178qM2182a.m2188b(c1229av.m2784d());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4279a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f5384g = aTBaseAdAdapter;
    }

    /* JADX INFO: renamed from: a */
    private void m4280a(ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av) {
        Map<String, Object> mapM4293h = m4293h();
        String strValueOf = String.valueOf(this.f5392o.f5373e.m5090ah());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, strValueOf, c1229av, mapM4293h);
        if (TextUtils.equals(strValueOf, "2")) {
            C1175n.m2059a().m2135b(anonymousClass1);
        } else {
            C1335b.m3998a().m4010c(anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m4281a(ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av, C1234b c1234b) {
        if (m4296k()) {
            return;
        }
        m4291f();
        m4292g();
        this.f5384g = null;
        this.f5393p = Boolean.TRUE;
        if (this.f5386i) {
            this.f5381d.f4214r = 1;
        }
        InterfaceC1364c interfaceC1364c = this.f5385h;
        if (interfaceC1364c != null) {
            interfaceC1364c.mo3608a(this.f5395r, aTBaseAdAdapter, c1229av, c1234b);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4282a(ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
        if (m4296k()) {
            return;
        }
        C1229av unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        this.f5381d.m3086f((SystemClock.elapsedRealtime() - this.f5388k) + (unitGroupInfo.m2826m() == 2 ? unitGroupInfo.m2822l() : 0L));
        m4291f();
        m4292g();
        this.f5384g = null;
        this.f5393p = Boolean.TRUE;
        if (this.f5386i) {
            this.f5381d.f4214r = 1;
        }
        InterfaceC1364c interfaceC1364c = this.f5385h;
        if (interfaceC1364c != null) {
            interfaceC1364c.mo3610a(this.f5395r, aTBaseAdAdapter, baseAdArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4283a(C1366e c1366e, Context context, C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
        if (C1391a.m4657at()) {
            C1178q c1178qM2182a = C1178q.m2182a(C1175n.m2059a().m2148f());
            try {
                if (c1178qM2182a.m2191c(c1229av.m2784d()) || !aTBaseAdAdapter.internalSetUserDataConsent(context, c1178qM2182a.m2190c(), ATSDK.isEUTraffic(c1366e.f5392o.f5369a))) {
                    return;
                }
                c1178qM2182a.m2188b(c1229av.m2784d());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Map m4286b(C1366e c1366e) {
        Object obj;
        Map<String, Object> map = c1366e.f5392o.f5374f;
        if (map == null) {
            return new HashMap(2);
        }
        if (c1366e.f5380c.m2784d() != 2 || (obj = map.get("admob_content_urls")) == null || !(obj instanceof List)) {
            return map;
        }
        C1322e.m3903a(c1366e.f5379b, c1366e.f5381d, "admob_content_urls", obj);
        return map;
    }

    /* JADX INFO: renamed from: b */
    private void m4287b(long j) {
        if (j == -1) {
            return;
        }
        this.f5390m = m4298m();
        C1315d.m3806a().mo3800a(this.f5390m, j, false);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4289d(C1366e c1366e) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - c1366e.f5388k;
        c1366e.f5389l = jElapsedRealtime;
        C1243h c1243h = c1366e.f5381d;
        if (c1243h != null) {
            c1243h.m3081e(jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4291f() {
        if (this.f5390m != null) {
            C1315d.m3806a().mo3801b(this.f5390m);
            this.f5390m = null;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m4292g() {
        if (this.f5391n != null) {
            C1315d.m3806a().mo3801b(this.f5391n);
            this.f5391n = null;
        }
    }

    /* JADX INFO: renamed from: h */
    private Map<String, Object> m4293h() {
        String str;
        int iM2762ao;
        C1365d c1365d = this.f5392o;
        C1396f c1396f = c1365d.f5373e;
        String str2 = c1365d.f5371c;
        if (c1396f == null) {
            return new HashMap();
        }
        Map<String, Object> mapM5057a = c1396f.m5057a(this.f5379b, str2, this.f5380c);
        int iM2784d = this.f5380c.m2784d();
        if (iM2784d == 2) {
            C1391a c1391aM4865b = C1392b.m4845a(this.f5392o.f5369a).m4865b(C1175n.m2059a().m2165o());
            if (c1391aM4865b != null) {
                mapM5057a.put(C1169h.p.f3233l, Boolean.valueOf(c1391aM4865b.m4767l() == 1));
            }
            if (c1396f.m5110d() == 1) {
                str = C1169h.p.f3236o;
                iM2762ao = c1396f.m5110d();
            } else {
                str = C1169h.p.f3236o;
                iM2762ao = this.f5380c.m2762ao();
            }
            mapM5057a.put(str, Integer.valueOf(iM2762ao));
        } else if (iM2784d == 6) {
            JSONObject jSONObjectM4137a = C1344h.m4137a(this.f5392o.f5369a, str2, this.f5379b, c1396f.m5090ah(), this.f5383f);
            if (c1396f.m5066aH() == 1) {
                mapM5057a.put("tp_info", jSONObjectM4137a.toString());
            }
        } else if (iM2784d == 22) {
            C1333b.m3988a(c1396f, mapM5057a, this.f5380c, this.f5392o.f5377i);
        }
        if (C1359w.m4260a(this.f5380c) && this.f5392o.f5373e.m5061aC() == 1) {
            C1222ao c1222aoM1568a = C1086a.m1566a(this.f5392o.f5369a).m1568a(this.f5379b, this.f5392o.f5373e.m5090ah());
            mapM5057a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_LOAD_SEQ, Integer.valueOf(c1222aoM1568a != null ? c1222aoM1568a.f3862c : 0));
            synchronized (C1387u.m4556a().m4560a(this.f5379b)) {
                String strM4561a = C1387u.m4556a().m4561a(this.f5379b, this.f5380c.m2784d());
                if (!TextUtils.isEmpty(strM4561a)) {
                    mapM5057a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.CONTENT, strM4561a);
                }
            }
        }
        return mapM5057a;
    }

    /* JADX INFO: renamed from: i */
    private Map<String, Object> m4294i() {
        Object obj;
        Map<String, Object> map = this.f5392o.f5374f;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.f5380c.m2784d() != 2 || (obj = map.get("admob_content_urls")) == null || !(obj instanceof List)) {
            return map;
        }
        C1322e.m3903a(this.f5379b, this.f5381d, "admob_content_urls", obj);
        return map;
    }

    /* JADX INFO: renamed from: j */
    private Context m4295j() {
        Context contextM2099E = this.f5392o.f5370b.get();
        if (!(contextM2099E instanceof Activity)) {
            contextM2099E = C1175n.m2059a().m2099E();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f5378a, "requestContext = ".concat(String.valueOf(contextM2099E)));
        }
        return contextM2099E;
    }

    /* JADX INFO: renamed from: k */
    private boolean m4296k() {
        return !this.f5396s || this.f5387j || m4302q();
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m4297l() {
        if (m4296k()) {
            return;
        }
        this.f5386i = true;
        new StringBuilder("network short timeout: ").append(this.f5382e);
        InterfaceC1364c interfaceC1364c = this.f5385h;
        if (interfaceC1364c != null) {
            interfaceC1364c.mo3611a(this.f5395r, this.f5382e);
        }
    }

    /* JADX INFO: renamed from: m */
    private InterfaceRunnableC1313b m4298m() {
        return new InterfaceRunnableC1313b() { // from class: com.anythink.core.common.p.e.2

            /* JADX INFO: renamed from: com.anythink.core.common.p.e$2$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1366e.this.m4297l();
                }
            }

            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.common.p.e.2.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1366e.this.m4297l();
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: n */
    private void m4299n() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5388k;
        this.f5389l = jElapsedRealtime;
        C1243h c1243h = this.f5381d;
        if (c1243h != null) {
            c1243h.m3081e(jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m4300o() {
        m4291f();
    }

    /* JADX INFO: renamed from: p */
    private void m4301p() {
        this.f5384g = null;
    }

    /* JADX INFO: renamed from: q */
    private boolean m4302q() {
        return this.f5393p != null;
    }

    /* JADX INFO: renamed from: r */
    private long m4303r() {
        return this.f5388k;
    }

    /* JADX INFO: renamed from: s */
    private boolean m4304s() {
        return this.f5386i;
    }

    /* JADX INFO: renamed from: t */
    private C1229av m4305t() {
        return this.f5380c;
    }

    /* JADX INFO: renamed from: a */
    public final String m4306a() {
        return this.f5395r;
    }

    /* JADX INFO: renamed from: a */
    public final void m4307a(double d) {
        C1234b c1234bM2979e;
        boolean z;
        BaseAd baseAdM1640b;
        ATBaseAdAdapter aTBaseAdAdapterM4174a;
        boolean z3;
        String str;
        this.f5396s = true;
        if (this.f5380c.m2821k() && this.f5380c.m2719M() != null && !TextUtils.isEmpty(this.f5392o.f5371c)) {
            this.f5380c.m2719M().m3413b(this.f5392o.f5371c);
        }
        C1230aw c1230awM1910a = C1148a.m1904a().m1910a(this.f5379b, this.f5380c);
        if (c1230awM1910a != null) {
            C1241f c1241fM2856a = c1230awM1910a.m2856a(this.f5380c.m2719M());
            int iM2978d = c1241fM2856a.m2978d();
            if (this.f5380c.m2814j() == 1) {
                c1234bM2979e = c1241fM2856a.m2979e();
                if (c1234bM2979e != null) {
                    new StringBuilder("CacheCheck:: Bidding Offer Cache exist：").append(this.f5380c.toString());
                    z = true;
                }
                z = false;
            } else {
                C1234b c1234bM2975a = c1241fM2856a.m2975a();
                if (c1241fM2856a.m2977c() && c1234bM2975a != null) {
                    if (C1344h.m4129a(this.f5380c) <= d) {
                        StringBuilder sb = new StringBuilder("CacheCheck:: upstatus = 1, Normal Offer price < loadedMinPrice ：");
                        sb.append(d);
                        sb.append(", AdSource:");
                        sb.append(this.f5380c.toString());
                    } else if (iM2978d >= this.f5380c.m2761an()) {
                        new StringBuilder("CacheCheck:: upstatus = 1, cache size > setting size, AdSource:").append(this.f5380c.toString());
                    }
                    c1234bM2979e = c1234bM2975a;
                    z = true;
                }
                c1234bM2979e = c1234bM2975a;
                z = false;
            }
            StringBuilder sb2 = new StringBuilder("CacheCheck:: Offer Cache exist, need to real request status:");
            sb2.append(!z);
            sb2.append(", current cache size:");
            sb2.append(iM2978d);
            sb2.append("\n");
            sb2.append(this.f5380c.toString());
        } else {
            new StringBuilder("CacheCheck:: Offer Cache not exist, need to real request status:true, current cache size:0\n").append(this.f5380c.toString());
            c1234bM2979e = null;
            z = false;
        }
        if (z) {
            InterfaceC1364c interfaceC1364c = this.f5385h;
            if (interfaceC1364c != null) {
                interfaceC1364c.mo3607a(c1234bM2979e.m2904d().getTrackingInfo(), c1234bM2979e.m2904d());
            }
            new StringBuilder("CacheCheck:: Callback by cached：").append(this.f5380c.toString());
            m4281a(c1234bM2979e.m2904d(), this.f5380c, c1234bM2979e);
            return;
        }
        new StringBuilder("CacheCheck:: Start real request：").append(this.f5380c.toString());
        C1252q c1252qM2719M = this.f5380c.m2719M();
        if (c1252qM2719M == null || !c1252qM2719M.f4450s) {
            baseAdM1640b = null;
            aTBaseAdAdapterM4174a = null;
            z3 = false;
        } else {
            C1106a c1106a = c1252qM2719M.f4449r;
            if (c1106a != null) {
                aTBaseAdAdapterM4174a = c1106a.m1639a();
                baseAdM1640b = c1106a.m1640b();
            } else {
                baseAdM1640b = null;
                aTBaseAdAdapterM4174a = null;
            }
            c1252qM2719M.f4449r = null;
            z3 = true;
        }
        if (aTBaseAdAdapterM4174a == null && !z3) {
            aTBaseAdAdapterM4174a = C1346j.m4174a(this.f5380c);
        }
        ATBaseAdAdapter aTBaseAdAdapter = aTBaseAdAdapterM4174a;
        if (aTBaseAdAdapter == null) {
            if (this.f5385h != null) {
                C1363b c1363b = new C1363b();
                c1363b.f5364a = 0;
                c1363b.f5366c = z3 ? this.f5380c.m2822l() : 0L;
                String str2 = z3 ? ErrorCode.c2sBiddingCacheError : ErrorCode.adapterNotExistError;
                if (z3) {
                    str = "";
                } else {
                    str = this.f5380c.m2809i() + " does not exist!";
                }
                c1363b.f5365b = ErrorCode.getErrorCode(str2, "", str);
                m4308a((ATBaseAdAdapter) null, c1363b);
                return;
            }
            return;
        }
        try {
            C1341e.m4050a(this.f5380c.m2784d(), aTBaseAdAdapter.getInternalNetworkSDKVersion());
        } catch (Throwable unused) {
        }
        C1243h c1243hM4250a = C1358v.m4250a(aTBaseAdAdapter, this.f5381d, this.f5380c);
        this.f5381d = c1243hM4250a;
        InterfaceC1364c interfaceC1364c2 = this.f5385h;
        if (interfaceC1364c2 != null) {
            interfaceC1364c2.mo3606a(c1243hM4250a);
        }
        long jM2702C = this.f5380c.m2702C();
        if (jM2702C != -1) {
            this.f5390m = m4298m();
            C1315d.m3806a().mo3800a(this.f5390m, jM2702C, false);
        }
        long jM2836r = this.f5380c.m2836r();
        if (jM2836r != -1) {
            this.f5391n = m4298m();
            C1315d.m3806a().mo3800a(this.f5391n, jM2836r, false);
        }
        this.f5388k = SystemClock.elapsedRealtime();
        Context context = this.f5392o.f5370b.get();
        if (context != null && (context instanceof Activity)) {
            aTBaseAdAdapter.refreshActivityContext((Activity) context);
        }
        if (z3) {
            InterfaceC1364c interfaceC1364c3 = this.f5385h;
            if (interfaceC1364c3 != null) {
                interfaceC1364c3.mo3607a(this.f5381d, aTBaseAdAdapter);
            }
            if (baseAdM1640b != null) {
                m4282a(aTBaseAdAdapter, baseAdM1640b);
                return;
            } else {
                m4282a(aTBaseAdAdapter, new BaseAd[0]);
                return;
            }
        }
        C1229av c1229av = this.f5380c;
        Map<String, Object> mapM4293h = m4293h();
        String strValueOf = String.valueOf(this.f5392o.f5373e.m5090ah());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, strValueOf, c1229av, mapM4293h);
        if (TextUtils.equals(strValueOf, "2")) {
            C1175n.m2059a().m2135b(anonymousClass1);
        } else {
            C1335b.m3998a().m4010c(anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4308a(ATBaseAdAdapter aTBaseAdAdapter, C1363b c1363b) {
        if (m4296k()) {
            return;
        }
        m4291f();
        m4292g();
        if (aTBaseAdAdapter != null) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.p.e.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ATBaseAdAdapter f5404a;

                public AnonymousClass3(ATBaseAdAdapter aTBaseAdAdapter2) {
                    aTBaseAdAdapter = aTBaseAdAdapter2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ATBaseAdAdapter aTBaseAdAdapter2 = aTBaseAdAdapter;
                        if (aTBaseAdAdapter2 != null) {
                            aTBaseAdAdapter2.internalDestory();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
        this.f5384g = null;
        this.f5393p = Boolean.FALSE;
        boolean z = this.f5387j;
        if (z) {
            this.f5381d.f4214r = 2;
        } else if (this.f5386i) {
            this.f5381d.f4214r = 1;
        }
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1179c.m2193a().m2196a(this.f5382e, jCurrentTimeMillis);
            C1179c.m2193a().m2197a(this.f5382e, jCurrentTimeMillis, c1363b.f5365b);
        }
        c1363b.f5367d = this.f5381d;
        c1363b.f5368e = this.f5380c;
        InterfaceC1364c interfaceC1364c = this.f5385h;
        if (interfaceC1364c != null) {
            interfaceC1364c.mo3609a(this.f5395r, aTBaseAdAdapter2, c1363b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4309a(InterfaceC1364c interfaceC1364c) {
        this.f5385h = interfaceC1364c;
    }

    /* JADX INFO: renamed from: a */
    public final void m4310a(C1365d c1365d) {
        this.f5392o = c1365d;
        this.f5379b = c1365d.f5372d;
        this.f5381d = c1365d.f5376h;
        this.f5383f = c1365d.f5375g;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4311b() {
        if (m4296k()) {
            return;
        }
        this.f5393p = Boolean.FALSE;
        this.f5387j = true;
        C1363b c1363b = new C1363b();
        c1363b.f5364a = 0;
        c1363b.f5366c = SystemClock.elapsedRealtime() - this.f5388k;
        c1363b.f5365b = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        m4308a(this.f5384g, c1363b);
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m4312c() {
        return this.f5393p;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4313d() {
        return (m4302q() && this.f5386i) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final int m4314e() {
        return this.f5394q;
    }
}
