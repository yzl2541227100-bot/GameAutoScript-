package com.anythink.core.common;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.ATSharedPlacementConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1238c;
import com.anythink.core.common.p063l.C1306a;
import com.anythink.core.common.p063l.C1307b;
import com.anythink.core.common.p063l.C1309d;
import com.anythink.core.common.p063l.C1310e;
import com.anythink.core.common.p063l.InterfaceC1308c;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.anythink.core.common.w */
/* JADX INFO: loaded from: classes.dex */
public class C1389w {

    /* JADX INFO: renamed from: a */
    public static final String f5630a = "w";

    /* JADX INFO: renamed from: v */
    private static volatile C1389w f5631v;

    /* JADX INFO: renamed from: d */
    private volatile Handler f5634d;

    /* JADX INFO: renamed from: e */
    private C1309d f5635e;

    /* JADX INFO: renamed from: f */
    private List<C1310e> f5636f;

    /* JADX INFO: renamed from: j */
    private Map<String, C1307b> f5640j;

    /* JADX INFO: renamed from: k */
    private Map<String, a> f5641k;

    /* JADX INFO: renamed from: l */
    private int f5642l;

    /* JADX INFO: renamed from: m */
    private ATSharedPlacementConfig f5643m;

    /* JADX INFO: renamed from: n */
    private List<C1310e> f5644n;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f5633c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    private final int f5645o = 0;

    /* JADX INFO: renamed from: p */
    private final int f5646p = 1;

    /* JADX INFO: renamed from: q */
    private final int f5647q = 2;

    /* JADX INFO: renamed from: r */
    private final int f5648r = 3;

    /* JADX INFO: renamed from: s */
    private int f5649s = 0;

    /* JADX INFO: renamed from: t */
    private long f5650t = -1;

    /* JADX INFO: renamed from: u */
    private final int f5651u = 30000;

    /* JADX INFO: renamed from: b */
    private Context f5632b = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: g */
    private final Map<String, C1310e> f5637g = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: i */
    private final Set<String> f5639i = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: h */
    private Set<String> f5638h = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: com.anythink.core.common.w$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1309d f5652a;

        public AnonymousClass1(C1309d c1309d) {
            c1309d = c1309d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1389w.this.m4610d();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.w$2 */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1175n.m2059a().m2175v()) {
                String str = C1389w.f5630a;
                C1389w.this.f5633c.set(false);
                C1389w.m4608d(C1389w.this);
            } else if (C1389w.this.f5644n != null && C1389w.this.f5644n.size() != 0) {
                C1389w.this.m4614e();
            } else {
                String str2 = C1389w.f5630a;
                C1389w.m4608d(C1389w.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.w$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5655a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1310e f5656b;

        public AnonymousClass3(String str, C1310e c1310e) {
            str = str;
            c1310e = c1310e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C1389w.this) {
                String str = C1389w.f5630a;
                new StringBuilder("placementLoadResultEntry, preloadWhenSameFormat: ").append(str);
                C1389w c1389w = C1389w.this;
                C1310e c1310e = c1310e;
                c1389w.m4602b(c1310e.f4995b, String.valueOf(c1310e.f4994a));
                C1389w.this.m4587a(c1310e, 12);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.w$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5658a;

        public AnonymousClass4(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C1389w.this) {
                if (C1389w.this.m4628c(str)) {
                    String str = C1389w.f5630a;
                    C1389w.this.m4587a((C1310e) C1389w.this.f5637g.get(str), 6);
                } else {
                    String str2 = C1389w.f5630a;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.w$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5660a;

        public AnonymousClass5(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C1389w.this) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (!C1389w.this.f5639i.contains(str)) {
                    String str = C1389w.f5630a;
                    StringBuilder sb = new StringBuilder("checkToStartScheduleLoadTask, preload not completed yet: ");
                    sb.append(str);
                    sb.append(", do nothing");
                    return;
                }
                if (C1389w.this.f5641k == null || C1389w.this.f5641k.get(str) == null) {
                    String str2 = C1389w.f5630a;
                    C1389w.this.m4612d(str);
                } else {
                    String str3 = C1389w.f5630a;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.w$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1310e f5662a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5663b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1307b f5664c;

        /* JADX INFO: renamed from: com.anythink.core.common.w$6$1 */
        public class AnonymousClass1 implements InterfaceC1308c {

            /* JADX INFO: renamed from: com.anythink.core.common.w$6$1$1 */
            public class RunnableC46691 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f5667a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1310e f5668b;

                public RunnableC46691(String str, C1310e c1310e) {
                    str = str;
                    c1310e = c1310e;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1389w.this.m4593a(str, c1310e);
                }
            }

            /* JADX INFO: renamed from: com.anythink.core.common.w$6$1$2 */
            public class AnonymousClass2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f5670a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1310e f5671b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AdError f5672c;

                public AnonymousClass2(String str, C1310e c1310e, AdError adError) {
                    str = str;
                    c1310e = c1310e;
                    adError = adError;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1389w.this.m4594a(str, c1310e, adError);
                }
            }

            /* JADX INFO: renamed from: com.anythink.core.common.w$6$1$3 */
            public class AnonymousClass3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f5674a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1310e f5675b;

                public AnonymousClass3(String str, C1310e c1310e) {
                    str = str;
                    c1310e = c1310e;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1389w.this.m4601b(str, c1310e);
                }
            }

            public AnonymousClass1() {
            }

            @Override // com.anythink.core.common.p063l.InterfaceC1308c
            /* JADX INFO: renamed from: a */
            public final void mo3785a(String str, C1310e c1310e) {
                synchronized (C1389w.this) {
                    C1389w.this.m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.6.1.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ String f5667a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1310e f5668b;

                        public RunnableC46691(String str2, C1310e c1310e2) {
                            str = str2;
                            c1310e = c1310e2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1389w.this.m4593a(str, c1310e);
                        }
                    });
                }
            }

            @Override // com.anythink.core.common.p063l.InterfaceC1308c
            /* JADX INFO: renamed from: a */
            public final void mo3786a(String str, C1310e c1310e, AdError adError) {
                synchronized (C1389w.this) {
                    C1389w.this.m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.6.1.2

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ String f5670a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1310e f5671b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ AdError f5672c;

                        public AnonymousClass2(String str2, C1310e c1310e2, AdError adError2) {
                            str = str2;
                            c1310e = c1310e2;
                            adError = adError2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1389w.this.m4594a(str, c1310e, adError);
                        }
                    });
                }
            }

            @Override // com.anythink.core.common.p063l.InterfaceC1308c
            /* JADX INFO: renamed from: b */
            public final void mo3787b(String str, C1310e c1310e) {
                synchronized (C1389w.this) {
                    C1389w.this.m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.6.1.3

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ String f5674a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1310e f5675b;

                        public AnonymousClass3(String str2, C1310e c1310e2) {
                            str = str2;
                            c1310e = c1310e2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1389w.this.m4601b(str, c1310e);
                        }
                    });
                }
            }
        }

        public AnonymousClass6(C1310e c1310e, int i, C1307b c1307b) {
            this.f5662a = c1310e;
            this.f5663b = i;
            this.f5664c = c1307b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1306a c1306a = new C1306a(this.f5662a, this.f5663b);
            if (this.f5663b == 10) {
                c1306a.m3765a();
                c1306a.m3766a(C1389w.this.f5635e.m3791c());
            }
            c1306a.m3767a(new InterfaceC1308c() { // from class: com.anythink.core.common.w.6.1

                /* JADX INFO: renamed from: com.anythink.core.common.w$6$1$1 */
                public class RunnableC46691 implements Runnable {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ String f5667a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1310e f5668b;

                    public RunnableC46691(String str2, C1310e c1310e2) {
                        str = str2;
                        c1310e = c1310e2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1389w.this.m4593a(str, c1310e);
                    }
                }

                /* JADX INFO: renamed from: com.anythink.core.common.w$6$1$2 */
                public class AnonymousClass2 implements Runnable {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ String f5670a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1310e f5671b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ AdError f5672c;

                    public AnonymousClass2(String str2, C1310e c1310e2, AdError adError2) {
                        str = str2;
                        c1310e = c1310e2;
                        adError = adError2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1389w.this.m4594a(str, c1310e, adError);
                    }
                }

                /* JADX INFO: renamed from: com.anythink.core.common.w$6$1$3 */
                public class AnonymousClass3 implements Runnable {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ String f5674a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1310e f5675b;

                    public AnonymousClass3(String str2, C1310e c1310e2) {
                        str = str2;
                        c1310e = c1310e2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1389w.this.m4601b(str, c1310e);
                    }
                }

                public AnonymousClass1() {
                }

                @Override // com.anythink.core.common.p063l.InterfaceC1308c
                /* JADX INFO: renamed from: a */
                public final void mo3785a(String str2, C1310e c1310e2) {
                    synchronized (C1389w.this) {
                        C1389w.this.m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.6.1.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ String f5667a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C1310e f5668b;

                            public RunnableC46691(String str22, C1310e c1310e22) {
                                str = str22;
                                c1310e = c1310e22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C1389w.this.m4593a(str, c1310e);
                            }
                        });
                    }
                }

                @Override // com.anythink.core.common.p063l.InterfaceC1308c
                /* JADX INFO: renamed from: a */
                public final void mo3786a(String str2, C1310e c1310e2, AdError adError2) {
                    synchronized (C1389w.this) {
                        C1389w.this.m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.6.1.2

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ String f5670a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C1310e f5671b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ AdError f5672c;

                            public AnonymousClass2(String str22, C1310e c1310e22, AdError adError22) {
                                str = str22;
                                c1310e = c1310e22;
                                adError = adError22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C1389w.this.m4594a(str, c1310e, adError);
                            }
                        });
                    }
                }

                @Override // com.anythink.core.common.p063l.InterfaceC1308c
                /* JADX INFO: renamed from: b */
                public final void mo3787b(String str2, C1310e c1310e2) {
                    synchronized (C1389w.this) {
                        C1389w.this.m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.6.1.3

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ String f5674a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C1310e f5675b;

                            public AnonymousClass3(String str22, C1310e c1310e22) {
                                str = str22;
                                c1310e = c1310e22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C1389w.this.m4601b(str, c1310e);
                            }
                        });
                    }
                }
            });
            this.f5664c.m3780a(c1306a);
            this.f5664c.m3782c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.w$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public String f5677a;

        public a(String str) {
            this.f5677a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C1389w.this) {
                if (C1389w.this.m4628c(this.f5677a)) {
                    C1389w.this.m4587a((C1310e) C1389w.this.f5637g.get(this.f5677a), 11);
                }
            }
        }
    }

    private C1389w() {
    }

    /* JADX INFO: renamed from: a */
    public static C1201f m4582a(String str, String str2) {
        return C1387u.m4556a().m4559a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static C1389w m4583a() {
        if (f5631v == null) {
            synchronized (C1389w.class) {
                if (f5631v == null) {
                    f5631v = new C1389w();
                }
            }
        }
        return f5631v;
    }

    /* JADX INFO: renamed from: a */
    private List<C1310e> m4584a(List<C1310e> list) {
        ArrayList arrayList = new ArrayList(3);
        int iMin = Math.min(this.f5635e.m3790b(), list.size());
        for (int i = 0; i < iMin; i++) {
            arrayList.add(list.get(i));
            new StringBuilder("getNeedRequestList, ").append(list.get(i).toString());
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m4586a(C1307b c1307b) {
        this.f5639i.add(c1307b.m3784e());
        if (c1307b.m3783d() == 10 && c1307b.m3781b()) {
            this.f5642l--;
            new StringBuilder("checkToRequestNextAd, current requestingCount: ").append(this.f5642l);
            int iM3790b = this.f5635e.m3790b();
            if (this.f5642l >= iM3790b) {
                StringBuilder sb = new StringBuilder("checkToRequestNextAd, requestingCount>parallelReqNum, requestingCount: ");
                sb.append(this.f5642l);
                sb.append(", parallelReqNum: ");
                sb.append(iM3790b);
                return;
            }
            if (this.f5644n.size() > 0) {
                C1310e c1310eRemove = this.f5644n.remove(0);
                new StringBuilder("checkToRequestNextAd, next ad: ").append(c1310eRemove.toString());
                m4587a(c1310eRemove, 10);
            } else if (this.f5642l == 0) {
                this.f5649s = 3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4587a(C1310e c1310e, int i) {
        if (c1310e == null) {
            Log.e(f5630a, "loadSharedPlacement: sharedPlaceInfo = null");
            return;
        }
        StringBuilder sb = new StringBuilder("loadSharedPlacement, loadType: ");
        sb.append(i);
        sb.append(", ");
        sb.append(c1310e.toString());
        m4615e(c1310e.f4995b);
        if (i == 10 || i == 12) {
            if (i == 10) {
                this.f5642l++;
                StringBuilder sb2 = new StringBuilder("loadSharedPlacement, requestingCount: ");
                sb2.append(this.f5642l);
                sb2.append(", loadType: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(c1310e.toString());
            }
            this.f5638h.add(c1310e.f4995b);
        }
        C1307b c1307b = new C1307b(c1310e.f4995b);
        if (this.f5640j == null) {
            this.f5640j = new ConcurrentHashMap();
        }
        this.f5640j.put(c1307b.m3779a(), c1307b);
        C1335b.m3998a().m4007a((Runnable) new AnonymousClass6(c1310e, i, c1307b), 2, true);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4593a(String str, C1310e c1310e) {
        List<ATAdInfo> listM2384a;
        new StringBuilder("onAdLoaded, ").append(c1310e.toString());
        C1307b c1307bRemove = this.f5640j.remove(str);
        if (c1307bRemove == null) {
            return;
        }
        new StringBuilder("isNeedToScheduleLoadTask, ").append(c1310e.toString());
        String str2 = c1310e.f4995b;
        C1201f c1201fM4582a = m4628c(str2) ? m4582a(str2, String.valueOf(c1310e.f4994a)) : null;
        boolean z = false;
        if (c1201fM4582a != null) {
            int i = c1310e.f4997d;
            double d = c1310e.f4998e;
            if (i > 0 && (listM2384a = c1201fM4582a.m2384a(this.f5632b)) != null && listM2384a.size() < i) {
                StringBuilder sb = new StringBuilder("isNeedToScheduleLoadTask, need to schedule load task because cache num not meet. current ad cache size: ");
                sb.append(listM2384a.size());
                sb.append("\n");
                sb.append(c1310e.toString());
                z = true;
            }
            if (z) {
                z = true;
            } else if (d > 0.0d) {
                C1234b c1234bM2382a = c1201fM4582a.m2382a(this.f5632b, false, false, (Map<String, Object>) new HashMap(), (C1238c) null);
                if (c1234bM2382a != null && c1234bM2382a.m2913m() < d) {
                    StringBuilder sb2 = new StringBuilder("isNeedToScheduleLoadTask, need to schedule load task because cache price not meet. current ad cache price: ");
                    sb2.append(c1234bM2382a.m2913m());
                    sb2.append("\n");
                    sb2.append(c1310e.toString());
                    z = true;
                }
            }
        }
        new StringBuilder("isNeedToScheduleLoadTask, commonAdManagerForSharedPlacement = null, ").append(c1310e.toString());
        if (z) {
            m4612d(c1307bRemove.m3784e());
        }
        m4586a(c1307bRemove);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4594a(String str, C1310e c1310e, AdError adError) {
        StringBuilder sb = new StringBuilder("onAdError, ");
        sb.append(c1310e.toString());
        sb.append(", \n");
        sb.append(adError.getFullErrorInfo());
        C1307b c1307bRemove = this.f5640j.remove(str);
        if (c1307bRemove == null) {
            return;
        }
        m4612d(c1307bRemove.m3784e());
        m4586a(c1307bRemove);
    }

    /* JADX INFO: renamed from: a */
    private boolean m4595a(C1310e c1310e) {
        List<ATAdInfo> listM2384a;
        new StringBuilder("isNeedToScheduleLoadTask, ").append(c1310e.toString());
        String str = c1310e.f4995b;
        C1201f c1201fM4582a = m4628c(str) ? m4582a(str, String.valueOf(c1310e.f4994a)) : null;
        boolean z = false;
        if (c1201fM4582a == null) {
            new StringBuilder("isNeedToScheduleLoadTask, commonAdManagerForSharedPlacement = null, ").append(c1310e.toString());
            return false;
        }
        int i = c1310e.f4997d;
        double d = c1310e.f4998e;
        if (i > 0 && (listM2384a = c1201fM4582a.m2384a(this.f5632b)) != null && listM2384a.size() < i) {
            StringBuilder sb = new StringBuilder("isNeedToScheduleLoadTask, need to schedule load task because cache num not meet. current ad cache size: ");
            sb.append(listM2384a.size());
            sb.append("\n");
            sb.append(c1310e.toString());
            z = true;
        }
        if (z) {
            return true;
        }
        if (d > 0.0d) {
            C1234b c1234bM2382a = c1201fM4582a.m2382a(this.f5632b, false, false, (Map<String, Object>) new HashMap(), (C1238c) null);
            if (c1234bM2382a != null && c1234bM2382a.m2913m() < d) {
                StringBuilder sb2 = new StringBuilder("isNeedToScheduleLoadTask, need to schedule load task because cache price not meet. current ad cache price: ");
                sb2.append(c1234bM2382a.m2913m());
                sb2.append("\n");
                sb2.append(c1310e.toString());
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m4596b(C1309d c1309d) {
        this.f5635e = c1309d;
        synchronized (this.f5637g) {
            this.f5637g.clear();
            this.f5637g.putAll(c1309d.m3793e());
        }
        this.f5636f = c1309d.m3794f();
    }

    /* JADX INFO: renamed from: b */
    private void m4597b(C1310e c1310e) {
        m4587a(c1310e, 10);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m4601b(String str, C1310e c1310e) {
        new StringBuilder("onAdLoadTimeout, ").append(c1310e.toString());
        C1307b c1307b = this.f5640j.get(str);
        if (c1307b == null) {
            return;
        }
        m4586a(c1307b);
    }

    /* JADX INFO: renamed from: b */
    public void m4602b(String str, String str2) {
        StringBuilder sb = new StringBuilder("prepare, shared placement id: ");
        sb.append(str);
        sb.append(", setAutoLoadStatus to false");
        C1387u.m4556a().m4567a(str, false);
        m4607c(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public Handler m4603c() {
        if (this.f5634d == null) {
            synchronized (C1389w.class) {
                if (this.f5634d == null) {
                    this.f5634d = C1335b.m3998a().m4003a(15);
                }
            }
        }
        return this.f5634d;
    }

    /* JADX INFO: renamed from: c */
    private void m4605c(C1310e c1310e) {
        m4587a(c1310e, 12);
    }

    /* JADX INFO: renamed from: c */
    private void m4607c(String str, String str2) {
        Map<String, Object> nativeLocalExtra;
        if (this.f5643m == null) {
            return;
        }
        nativeLocalExtra = null;
        str2.hashCode();
        switch (str2) {
            case "0":
                nativeLocalExtra = this.f5643m.getNativeLocalExtra();
                break;
            case "1":
                nativeLocalExtra = this.f5643m.getRewardVideoLocalExtra();
                break;
            case "2":
                nativeLocalExtra = this.f5643m.getBannerLocalExtra();
                break;
            case "3":
                nativeLocalExtra = this.f5643m.getInterstitialLocalExtra();
                break;
            case "4":
                nativeLocalExtra = this.f5643m.getSplashLocalExtra();
                break;
        }
        StringBuilder sb = new StringBuilder("prepare, shared placement id: ");
        sb.append(str);
        sb.append(", putPlacementLocalSettingMap: ");
        sb.append(nativeLocalExtra != null ? nativeLocalExtra.toString() : "null");
        C1387u.m4556a().m4566a(str, nativeLocalExtra);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m4608d(C1389w c1389w) {
        c1389w.f5649s = 3;
        return 3;
    }

    /* JADX INFO: renamed from: d */
    private C1201f m4609d(String str, String str2) {
        if (m4628c(str)) {
            return m4582a(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m4610d() {
        if (this.f5649s == 0) {
            this.f5649s = 1;
            this.f5644n = Collections.synchronizedList(new ArrayList());
            for (C1310e c1310e : this.f5636f) {
                if (this.f5638h.contains(c1310e.f4995b)) {
                    new StringBuilder("handleSharedPlacement, no need to preload: ").append(c1310e.f4995b);
                } else {
                    this.f5644n.add(c1310e);
                    m4602b(c1310e.f4995b, String.valueOf(c1310e.f4994a));
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f5650t;
            m4603c().postDelayed(new Runnable() { // from class: com.anythink.core.common.w.2
                public AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (C1175n.m2059a().m2175v()) {
                        String str = C1389w.f5630a;
                        C1389w.this.f5633c.set(false);
                        C1389w.m4608d(C1389w.this);
                    } else if (C1389w.this.f5644n != null && C1389w.this.f5644n.size() != 0) {
                        C1389w.this.m4614e();
                    } else {
                        String str2 = C1389w.f5630a;
                        C1389w.m4608d(C1389w.this);
                    }
                }
            }, jElapsedRealtime < j ? j - SystemClock.elapsedRealtime() : 0L);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator<C1310e> it = this.f5636f.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f4995b);
        }
        Set<String> set = this.f5638h;
        if (set != null) {
            arrayList2.addAll(set);
        }
        if (arrayList2.size() > 0) {
            arrayList2.removeAll(arrayList);
        }
        Set<String> set2 = this.f5638h;
        if (set2 != null) {
            arrayList.removeAll(set2);
        }
        if (arrayList.size() > 0) {
            this.f5644n = Collections.synchronizedList(new ArrayList());
            for (String str : arrayList) {
                C1310e c1310e2 = this.f5637g.get(str);
                m4602b(c1310e2.f4995b, String.valueOf(c1310e2.f4994a));
                if (this.f5649s == 3) {
                    StringBuilder sb = new StringBuilder("handleSharedPlacement, find open placement id: ");
                    sb.append(str);
                    sb.append(", start load");
                    m4587a(c1310e2, 10);
                } else {
                    new StringBuilder("handleSharedPlacement, update waiting list: ").append(c1310e2.toString());
                    this.f5644n.add(c1310e2);
                }
            }
        }
        if (arrayList2.size() > 0) {
            for (String str2 : arrayList2) {
                m4615e(str2);
                this.f5638h.remove(str2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m4611d(C1310e c1310e) {
        m4587a(c1310e, 6);
    }

    /* JADX INFO: renamed from: d */
    public void m4612d(String str) {
        if (!m4628c(str)) {
            StringBuilder sb = new StringBuilder("startScheduleLoadTask, placementId: ");
            sb.append(str);
            sb.append(", not valid shared placement, do nothing");
            return;
        }
        C1310e c1310e = this.f5637g.get(str);
        if (c1310e == null) {
            Log.e(f5630a, "startScheduleLoadTask: sharedPlaceInfo = null");
            return;
        }
        if (this.f5641k == null) {
            this.f5641k = new ConcurrentHashMap(5);
        }
        int i = c1310e.f4996c;
        if (i < 30000) {
            i = 30000;
        }
        StringBuilder sb2 = new StringBuilder("startScheduleLoadTask, placementId: ");
        sb2.append(str);
        sb2.append(", start schedule load task, requestInterval: ");
        sb2.append(i);
        sb2.append(", originRequestInterval: ");
        sb2.append(c1310e.f4996c);
        a aVar = new a(str);
        this.f5641k.put(str, aVar);
        m4603c().postDelayed(aVar, i);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m4614e() {
        this.f5649s = 2;
        List<C1310e> list = this.f5644n;
        ArrayList arrayList = new ArrayList(3);
        int iMin = Math.min(this.f5635e.m3790b(), list.size());
        for (int i = 0; i < iMin; i++) {
            arrayList.add(list.get(i));
            new StringBuilder("getNeedRequestList, ").append(list.get(i).toString());
        }
        list.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4587a((C1310e) it.next(), 10);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m4615e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, a> map = this.f5641k;
        if (map == null) {
            StringBuilder sb = new StringBuilder("stopScheduleLoadTask, placementId: ");
            sb.append(str);
            sb.append(", timer is not on, do nothing");
            return;
        }
        a aVarRemove = map.remove(str);
        if (aVarRemove == null) {
            StringBuilder sb2 = new StringBuilder("stopScheduleLoadTask, placementId: ");
            sb2.append(str);
            sb2.append(", timer is not on, do nothing");
        } else {
            StringBuilder sb3 = new StringBuilder("stopScheduleLoadTask, placementId: ");
            sb3.append(str);
            sb3.append(", stop timer");
            m4603c().removeCallbacks(aVarRemove);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4621a(ATSharedPlacementConfig aTSharedPlacementConfig) {
        if (aTSharedPlacementConfig == null) {
            if (ATSDK.isNetworkLogDebug()) {
                Log.i("anythink", "setSharedPlacementConfig: null");
            }
            return;
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i("anythink", "setSharedPlacementConfig: " + aTSharedPlacementConfig.toString());
        }
        this.f5643m = aTSharedPlacementConfig;
        List<C1310e> list = this.f5636f;
        if (list != null) {
            for (C1310e c1310e : list) {
                m4607c(c1310e.f4995b, String.valueOf(c1310e.f4994a));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4622a(C1309d c1309d) {
        if (C1175n.m2059a().m2175v()) {
            this.f5633c.set(false);
            return;
        }
        this.f5633c.set(c1309d.m3794f().size() != 0);
        m4596b(c1309d);
        if (this.f5649s == 0) {
            if (this.f5650t == -1) {
                this.f5650t = SystemClock.elapsedRealtime() + c1309d.m3789a();
                StringBuilder sb = new StringBuilder("sharedPlacementEntry, delay time: ");
                sb.append(c1309d.m3789a());
                sb.append(", timestamp when preloading started: ");
                sb.append(this.f5650t);
            }
            if (!this.f5633c.get()) {
                return;
            }
        }
        if (c1309d.m3792d() == 2) {
            return;
        }
        m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1309d f5652a;

            public AnonymousClass1(C1309d c1309d2) {
                c1309d = c1309d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1389w.this.m4610d();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4623a(C1309d c1309d, String str) {
        if (this.f5635e == null) {
            m4596b(c1309d);
        }
        C1310e c1310e = this.f5637g.get(str);
        if (c1310e == null) {
            return;
        }
        if (!this.f5638h.contains(str)) {
            this.f5638h.add(str);
            m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f5655a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1310e f5656b;

                public AnonymousClass3(String str2, C1310e c1310e2) {
                    str = str2;
                    c1310e = c1310e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (C1389w.this) {
                        String str2 = C1389w.f5630a;
                        new StringBuilder("placementLoadResultEntry, preloadWhenSameFormat: ").append(str);
                        C1389w c1389w = C1389w.this;
                        C1310e c1310e2 = c1310e;
                        c1389w.m4602b(c1310e2.f4995b, String.valueOf(c1310e2.f4994a));
                        C1389w.this.m4587a(c1310e, 12);
                    }
                }
            });
        } else {
            StringBuilder sb = new StringBuilder("placementLoadResultEntry, sharedPlacementId: ");
            sb.append(str2);
            sb.append(", has preload, do nothing");
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4624a(String str) {
        m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5658a;

            public AnonymousClass4(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1389w.this) {
                    if (C1389w.this.m4628c(str)) {
                        String str2 = C1389w.f5630a;
                        C1389w.this.m4587a((C1310e) C1389w.this.f5637g.get(str), 6);
                    } else {
                        String str22 = C1389w.f5630a;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4625a(C1396f c1396f) {
        if (c1396f == null) {
            return false;
        }
        if (!ATAdxSetting.getInstance().isAdxNetworkMode(c1396f.m5056a())) {
            return m4628c(c1396f.m5118l());
        }
        new StringBuilder("isBindSharedPlacement, this placement is in adx network mode: ").append(c1396f.m5056a());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4626b(String str) {
        m4603c().post(new Runnable() { // from class: com.anythink.core.common.w.5

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5660a;

            public AnonymousClass5(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1389w.this) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (!C1389w.this.f5639i.contains(str)) {
                        String str2 = C1389w.f5630a;
                        StringBuilder sb = new StringBuilder("checkToStartScheduleLoadTask, preload not completed yet: ");
                        sb.append(str);
                        sb.append(", do nothing");
                        return;
                    }
                    if (C1389w.this.f5641k == null || C1389w.this.f5641k.get(str) == null) {
                        String str22 = C1389w.f5630a;
                        C1389w.this.m4612d(str);
                    } else {
                        String str3 = C1389w.f5630a;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4627b() {
        return this.f5633c.get();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4628c(String str) {
        try {
            if (!this.f5633c.get() || C1175n.m2059a().m2175v() || TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f5637g.containsKey(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
