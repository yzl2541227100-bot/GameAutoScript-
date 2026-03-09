package com.anythink.core.p038b;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1288i;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1230aw;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1241f;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p066o.AbstractC1326a;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p038b.p040b.InterfaceC1103b;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1101b extends AbstractC1326a implements C1288i.b {

    /* JADX INFO: renamed from: a */
    public static final String f2599a = "b";

    /* JADX INFO: renamed from: b */
    public Map<String, C1243h> f2600b = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: c */
    public InterfaceRunnableC1313b f2601c = new InterfaceRunnableC1313b() { // from class: com.anythink.core.b.b.1

        /* JADX INFO: renamed from: com.anythink.core.b.b$1$1 */
        public class RunnableC46621 implements Runnable {
            public RunnableC46621() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1101b.this.m1622c();
            }
        }

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.b.1.1
                public RunnableC46621() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1101b.this.m1622c();
                }
            });
        }
    };

    /* JADX INFO: renamed from: d */
    private String f2602d;

    /* JADX INFO: renamed from: e */
    private C1288i.a f2603e;

    /* JADX INFO: renamed from: f */
    private String f2604f;

    /* JADX INFO: renamed from: g */
    private long f2605g;

    /* JADX INFO: renamed from: h */
    private boolean f2606h;

    /* JADX INFO: renamed from: i */
    private C1202a f2607i;

    /* JADX INFO: renamed from: j */
    private Map<Integer, AbstractC1107d> f2608j;

    /* JADX INFO: renamed from: k */
    private long f2609k;

    /* JADX INFO: renamed from: com.anythink.core.b.b$1 */
    public class AnonymousClass1 implements InterfaceRunnableC1313b {

        /* JADX INFO: renamed from: com.anythink.core.b.b$1$1 */
        public class RunnableC46621 implements Runnable {
            public RunnableC46621() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1101b.this.m1622c();
            }
        }

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.b.1.1
                public RunnableC46621() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1101b.this.m1622c();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.b$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1107d f2612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Integer f2613b;

        /* JADX INFO: renamed from: com.anythink.core.b.b$2$1 */
        public class AnonymousClass1 implements InterfaceC1103b {
            public AnonymousClass1() {
            }

            @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
            /* JADX INFO: renamed from: a */
            public final void mo1627a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
                C1101b.m1611a(C1101b.this, c1229av, aTBaseAdAdapter);
            }

            @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
            /* JADX INFO: renamed from: a */
            public final void mo1628a(List<C1229av> list, List<C1229av> list2) {
                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                C1101b.this.m1619b(num, list, list2);
            }
        }

        public AnonymousClass2(AbstractC1107d abstractC1107d, Integer num) {
            abstractC1107d = abstractC1107d;
            num = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1107d abstractC1107d = abstractC1107d;
            if (abstractC1107d != null) {
                abstractC1107d.mo1650a(C1101b.this.f2606h);
                abstractC1107d.mo1605a(new InterfaceC1103b() { // from class: com.anythink.core.b.b.2.1
                    public AnonymousClass1() {
                    }

                    @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
                    /* JADX INFO: renamed from: a */
                    public final void mo1627a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
                        C1101b.m1611a(C1101b.this, c1229av, aTBaseAdAdapter);
                    }

                    @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
                    /* JADX INFO: renamed from: a */
                    public final void mo1628a(List<C1229av> list, List<C1229av> list2) {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        C1101b.this.m1619b(num, list, list2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.b$3 */
    public class AnonymousClass3 implements Comparator<C1229av> {
        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: a */
        private static int m1629a(C1229av c1229av, C1229av c1229av2) {
            double dM4129a = C1344h.m4129a(c1229av);
            double dM4129a2 = C1344h.m4129a(c1229av2);
            if (dM4129a > dM4129a2) {
                return -1;
            }
            return dM4129a == dM4129a2 ? 0 : 1;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C1229av c1229av, C1229av c1229av2) {
            double dM4129a = C1344h.m4129a(c1229av);
            double dM4129a2 = C1344h.m4129a(c1229av2);
            if (dM4129a > dM4129a2) {
                return -1;
            }
            return dM4129a == dM4129a2 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.b$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1243h f2617a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1229av f2618b;

        public AnonymousClass4(C1243h c1243h, C1229av c1229av) {
            this.f2617a = c1243h;
            this.f2618b = c1229av;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1101b.this.f2607i.f3679c.f4484e != null) {
                if (this.f2617a != null) {
                    C1101b.this.f2607i.f3679c.f4484e.m2017a(this.f2617a, ErrorCode.getErrorCode(ErrorCode.adSourceBidError, "", this.f2618b.m2698A()));
                }
                C1101b.this.f2600b.remove(this.f2618b.m2842u());
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.b$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1243h f2620a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1229av f2621b;

        public AnonymousClass5(C1243h c1243h, C1229av c1229av) {
            this.f2620a = c1243h;
            this.f2621b = c1229av;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1101b.this.f2607i.f3679c.f4484e != null) {
                C1243h c1243h = this.f2620a;
                if (c1243h != null) {
                    C1358v.m4253a(c1243h, this.f2621b, 0, false);
                    C1101b.this.f2607i.f3679c.f4484e.m2018b(this.f2620a);
                }
                C1101b.this.f2600b.remove(this.f2621b.m2842u());
            }
        }
    }

    public C1101b(C1202a c1202a) {
        this.f2607i = c1202a;
        this.f2602d = c1202a.f3681e;
        this.f2604f = c1202a.f3680d;
        this.f2605g = c1202a.f3683g;
        List<C1229av> list = c1202a.f3686j;
        int size = list.size();
        List<C1229av> listM4375a = c1202a.f3701y.m4375a();
        if (listM4375a.size() > 0) {
            this.f2607i.f3702z = listM4375a.size() + size;
        } else {
            this.f2607i.f3702z = size;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        for (int i = 0; i < size; i++) {
            C1229av c1229av = list.get(i);
            if (c1229av.m2826m() == 1 || c1229av.m2826m() == 3) {
                arrayList.add(c1229av);
            } else if (c1229av.m2826m() == 2) {
                arrayList3 = arrayList3 == null ? new ArrayList(size) : arrayList3;
                arrayList3.add(c1229av);
            } else if (c1229av.m2826m() == 5) {
                arrayList4 = arrayList4 == null ? new ArrayList(size) : arrayList4;
                arrayList4.add(c1229av);
            } else if (c1229av.m2826m() == 6) {
                arrayList5 = arrayList5 == null ? new ArrayList(size) : arrayList5;
                arrayList5.add(c1229av);
            } else if (c1229av.m2826m() == 7) {
                arrayList2.add(c1229av);
            }
        }
        this.f2608j = new HashMap(5);
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            this.f2608j.put(1, new C1105c(c1202a.m2412a(arrayList, arrayList2), list));
        }
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.f2608j.put(2, new C1098a(c1202a.m2411a(arrayList3)));
        }
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.f2608j.put(5, new C1113h(c1202a.m2413b(arrayList4)));
        }
        if (arrayList5 == null || arrayList5.size() <= 0) {
            return;
        }
        this.f2608j.put(6, new C1112g(c1202a.m2414c(arrayList5)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1611a(C1101b c1101b, C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
        if (c1229av.m2826m() == 7 || aTBaseAdAdapter == null) {
            return;
        }
        try {
            C1202a c1202a = c1101b.f2607i;
            if (c1202a.f3679c.f4484e != null) {
                C1243h c1243hM3045V = c1202a.f3695s.m3045V();
                C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
                c1243hM3045V.m3091g(aTBaseAdAdapter.getInternalNetworkPlacementId());
                c1101b.f2600b.put(c1229av.m2842u(), c1243hM3045V);
                c1243hM3045V.m3084f(0.0d);
                c1243hM3045V.m3066c(0.0d);
                c1243hM3045V.m3073d(0.0d);
                c1101b.f2607i.f3679c.f4484e.m2016a(c1243hM3045V);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1613a(C1229av c1229av) {
        C1243h c1243h = this.f2600b.get(c1229av.m2842u());
        if (c1243h != null) {
            C1335b.m3998a().m4005a(new AnonymousClass4(c1243h, c1229av));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1614a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
        if (c1229av.m2826m() == 7 || aTBaseAdAdapter == null) {
            return;
        }
        try {
            C1202a c1202a = this.f2607i;
            if (c1202a.f3679c.f4484e != null) {
                C1243h c1243hM3045V = c1202a.f3695s.m3045V();
                C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
                c1243hM3045V.m3091g(aTBaseAdAdapter.getInternalNetworkPlacementId());
                this.f2600b.put(c1229av.m2842u(), c1243hM3045V);
                c1243hM3045V.m3084f(0.0d);
                c1243hM3045V.m3066c(0.0d);
                c1243hM3045V.m3073d(0.0d);
                this.f2607i.f3679c.f4484e.m2016a(c1243hM3045V);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00e7 A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:75:0x0001, B:77:0x000b, B:79:0x0011, B:80:0x0016, B:82:0x0020, B:85:0x0031, B:88:0x0039, B:92:0x0043, B:96:0x0057, B:98:0x0076, B:99:0x0082, B:100:0x0085, B:104:0x008d, B:117:0x0107, B:108:0x00ca, B:110:0x00d9, B:112:0x00e3, B:114:0x00ea, B:116:0x00fb, B:113:0x00e7, B:118:0x010a, B:119:0x010d, B:121:0x0113, B:122:0x011b, B:124:0x0132, B:126:0x0139), top: B:135:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fb A[Catch: all -> 0x013e, TryCatch #1 {, blocks: (B:75:0x0001, B:77:0x000b, B:79:0x0011, B:80:0x0016, B:82:0x0020, B:85:0x0031, B:88:0x0039, B:92:0x0043, B:96:0x0057, B:98:0x0076, B:99:0x0082, B:100:0x0085, B:104:0x008d, B:117:0x0107, B:108:0x00ca, B:110:0x00d9, B:112:0x00e3, B:114:0x00ea, B:116:0x00fb, B:113:0x00e7, B:118:0x010a, B:119:0x010d, B:121:0x0113, B:122:0x011b, B:124:0x0132, B:126:0x0139), top: B:135:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0107 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m1615a(java.lang.Integer r13, java.util.List<com.anythink.core.common.p055f.C1229av> r14, java.util.List<com.anythink.core.common.p055f.C1229av> r15) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.C1101b.m1615a(java.lang.Integer, java.util.List, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    private void m1616a(String str, C1229av c1229av, boolean z) {
        C1234b c1234b;
        int iM2978d;
        if (c1229av.m2828n() == 2) {
            C1230aw c1230awM1910a = C1148a.m1904a().m1910a(str, c1229av);
            C1252q c1252qM2719M = c1229av.m2719M();
            if (c1230awM1910a != null) {
                C1241f c1241fM2856a = c1230awM1910a.m2856a((C1252q) null);
                C1234b c1234bM2976b = c1241fM2856a.m2976b();
                iM2978d = c1241fM2856a.m2978d();
                c1234b = c1234bM2976b;
            } else {
                c1234b = null;
                iM2978d = 0;
            }
            StringBuilder sb = new StringBuilder("CacehMotify: Bidding Offer Cache exist, need to compare with cache status:");
            sb.append(c1234b != null && iM2978d >= c1229av.m2761an());
            sb.append(", current cache size:");
            sb.append(iM2978d);
            sb.append("\n");
            sb.append(c1229av.toString());
            if (c1234b != null && iM2978d >= c1229av.m2761an()) {
                try {
                    double dM4129a = C1344h.m4129a(c1229av);
                    double dM4129a2 = C1344h.m4129a(c1234b.m2904d().getUnitGroupInfo());
                    if (dM4129a > dM4129a2) {
                        c1229av.m2738a(c1229av, 2, c1229av.m2832p(), 1);
                        return;
                    }
                    try {
                        C1229av unitGroupInfo = c1234b.m2904d().getUnitGroupInfo();
                        String str2 = unitGroupInfo.m2719M() != null ? unitGroupInfo.m2719M().token : "";
                        if (c1252qM2719M != null && !TextUtils.equals(c1252qM2719M.token, str2)) {
                            try {
                                C1109b.m1674a(c1252qM2719M, new C1260y(2, c1229av, this.f2607i.f3695s, dM4129a2), true);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    th.printStackTrace();
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    c1229av.m2738a(c1234b.m2904d().getUnitGroupInfo(), 1, c1229av.m2832p(), z ? 1 : 0);
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m1617a(Integer num) {
        AbstractC1107d abstractC1107d = this.f2608j.get(num);
        if (abstractC1107d != null && abstractC1107d.m1653c()) {
            this.f2608j.remove(num);
        }
        if (this.f2608j.size() != 0) {
            return false;
        }
        m3957a();
        C1315d.m3806a().mo3801b(this.f2601c);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m1618b(C1229av c1229av) {
        C1243h c1243h = this.f2600b.get(c1229av.m2842u());
        if (c1243h != null) {
            C1335b.m3998a().m4005a(new AnonymousClass5(c1243h, c1229av));
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m1619b(Integer num, List<C1229av> list, List<C1229av> list2) {
        m1615a(num, list, list2);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m1622c() {
        try {
            C1288i.a aVar = this.f2603e;
            if (aVar != null) {
                aVar.mo2408a(this.f2604f);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1623d() {
        long j = this.f2607i.f3685i;
        if (j <= 0) {
            j = C1659a.f9130f;
        }
        C1315d.m3806a().mo3800a(this.f2601c, j, false);
    }

    @Override // com.anythink.core.common.C1288i.b
    /* JADX INFO: renamed from: a */
    public final void mo1624a(C1288i.a aVar) {
        this.f2603e = aVar;
        super.m3958a(this.f2605g);
        long j = this.f2607i.f3685i;
        if (j <= 0) {
            j = C1659a.f9130f;
        }
        C1315d.m3806a().mo3800a(this.f2601c, j, false);
        this.f2609k = System.currentTimeMillis();
        for (Map.Entry entry : new HashMap(this.f2608j).entrySet()) {
            Integer num = (Integer) entry.getKey();
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.b.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC1107d f2612a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Integer f2613b;

                /* JADX INFO: renamed from: com.anythink.core.b.b$2$1 */
                public class AnonymousClass1 implements InterfaceC1103b {
                    public AnonymousClass1() {
                    }

                    @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
                    /* JADX INFO: renamed from: a */
                    public final void mo1627a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
                        C1101b.m1611a(C1101b.this, c1229av, aTBaseAdAdapter);
                    }

                    @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
                    /* JADX INFO: renamed from: a */
                    public final void mo1628a(List<C1229av> list, List<C1229av> list2) {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        C1101b.this.m1619b(num, list, list2);
                    }
                }

                public AnonymousClass2(AbstractC1107d abstractC1107d, Integer num2) {
                    abstractC1107d = abstractC1107d;
                    num = num2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1107d abstractC1107d = abstractC1107d;
                    if (abstractC1107d != null) {
                        abstractC1107d.mo1650a(C1101b.this.f2606h);
                        abstractC1107d.mo1605a(new InterfaceC1103b() { // from class: com.anythink.core.b.b.2.1
                            public AnonymousClass1() {
                            }

                            @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
                            /* JADX INFO: renamed from: a */
                            public final void mo1627a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
                                C1101b.m1611a(C1101b.this, c1229av, aTBaseAdAdapter);
                            }

                            @Override // com.anythink.core.p038b.p040b.InterfaceC1103b
                            /* JADX INFO: renamed from: a */
                            public final void mo1628a(List<C1229av> list, List<C1229av> list2) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                C1101b.this.m1619b(num, list, list2);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.anythink.core.common.C1288i.b
    /* JADX INFO: renamed from: a */
    public final void mo1625a(boolean z) {
        this.f2606h = z;
    }

    @Override // com.anythink.core.common.p066o.AbstractC1326a
    /* JADX INFO: renamed from: b */
    public final synchronized void mo1626b() {
        Iterator it = new HashMap(this.f2608j).entrySet().iterator();
        while (it.hasNext()) {
            AbstractC1107d abstractC1107d = (AbstractC1107d) ((Map.Entry) it.next()).getValue();
            if (abstractC1107d != null) {
                abstractC1107d.mo1604a();
            }
        }
    }
}
