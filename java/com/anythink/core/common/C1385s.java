package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1188i;
import com.anythink.core.common.p055f.C1211ad;
import com.anythink.core.common.p058h.C1281i;
import com.anythink.core.common.p058h.C1285m;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.expressad.p086d.C1486b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.s */
/* JADX INFO: loaded from: classes.dex */
public class C1385s {

    /* JADX INFO: renamed from: a */
    public static final String f5595a = "s";

    /* JADX INFO: renamed from: b */
    private static volatile C1385s f5596b;

    /* JADX INFO: renamed from: c */
    private Map<String, C1211ad> f5597c;

    /* JADX INFO: renamed from: d */
    private List<C1211ad> f5598d;

    /* JADX INFO: renamed from: f */
    private final int f5600f = 5;

    /* JADX INFO: renamed from: g */
    private final int f5601g = C1486b.f7228b;

    /* JADX INFO: renamed from: e */
    private List<String> f5599e = Collections.synchronizedList(new ArrayList(8));

    /* JADX INFO: renamed from: com.anythink.core.common.s$1 */
    public class AnonymousClass1 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1211ad f5602a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f5603b;

        public AnonymousClass1(C1211ad c1211ad, boolean z) {
            c1211ad = c1211ad;
            z = z;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            synchronized (C1385s.this) {
                C1385s.this.f5599e.remove(c1211ad.f3718a);
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            String str2 = C1385s.f5595a;
            new StringBuilder("resendNoticeUrl:  send notice failed: ").append(c1211ad.m2433a());
            synchronized (C1385s.this) {
                C1385s.this.f5599e.remove(c1211ad.f3718a);
                if (!z) {
                    C1385s.this.m4547b(c1211ad);
                }
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            String str = C1385s.f5595a;
            new StringBuilder("resendNoticeUrl:  send notice success: ").append(c1211ad.m2433a());
            synchronized (C1385s.this) {
                C1385s.this.f5599e.remove(c1211ad.f3718a);
                if (z) {
                    C1385s.this.m4543a(c1211ad);
                }
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    private C1385s() {
    }

    /* JADX INFO: renamed from: a */
    public static C1385s m4541a() {
        if (f5596b == null) {
            synchronized (C1385s.class) {
                if (f5596b == null) {
                    f5596b = new C1385s();
                }
            }
        }
        return f5596b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4543a(C1211ad c1211ad) {
        new StringBuilder("delete: ").append(c1211ad.m2433a());
        this.f5597c.remove(c1211ad.f3718a);
        this.f5598d.remove(c1211ad);
        C1188i.m2248a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2252b(c1211ad);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m4544a(C1211ad c1211ad, boolean z) {
        if (System.currentTimeMillis() > c1211ad.f3723f) {
            new StringBuilder("resendNoticeUrl: do nothing because offer is out date: ").append(c1211ad.m2433a());
            this.f5599e.remove(c1211ad.f3718a);
            if (z) {
                m4543a(c1211ad);
            }
            return;
        }
        if (this.f5599e.contains(c1211ad.f3718a)) {
            new StringBuilder("resendNoticeUrl: do nothing because it is loading... ").append(c1211ad.m2433a());
            return;
        }
        this.f5599e.add(c1211ad.f3718a);
        if (z) {
            int i = c1211ad.f3724g + 1;
            c1211ad.f3724g = i;
            if (i >= 5) {
                new StringBuilder("resendNoticeUrl: The number of retries is greater than or equal to the maximum number of retries, start deleting and continue: ").append(c1211ad.m2433a());
                m4543a(c1211ad);
            } else {
                m4547b(c1211ad);
            }
        } else {
            int i2 = c1211ad.f3724g + 1;
            c1211ad.f3724g = i2;
            if (i2 >= 5) {
                new StringBuilder("resendNoticeUrl: The number of retries is greater than or equal to the maximum number of retries, start deleting and continue: ").append(c1211ad.m2433a());
                this.f5599e.remove(c1211ad.f3718a);
                return;
            }
        }
        new StringBuilder("resendNoticeUrl: start to send notice: ").append(c1211ad.m2433a());
        new C1285m(c1211ad).mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.common.s.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1211ad f5602a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f5603b;

            public AnonymousClass1(C1211ad c1211ad2, boolean z3) {
                c1211ad = c1211ad2;
                z = z3;
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadCanceled(int i3) {
                synchronized (C1385s.this) {
                    C1385s.this.f5599e.remove(c1211ad.f3718a);
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadError(int i3, String str, AdError adError) {
                String str2 = C1385s.f5595a;
                new StringBuilder("resendNoticeUrl:  send notice failed: ").append(c1211ad.m2433a());
                synchronized (C1385s.this) {
                    C1385s.this.f5599e.remove(c1211ad.f3718a);
                    if (!z) {
                        C1385s.this.m4547b(c1211ad);
                    }
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadFinish(int i3, Object obj) {
                String str = C1385s.f5595a;
                new StringBuilder("resendNoticeUrl:  send notice success: ").append(c1211ad.m2433a());
                synchronized (C1385s.this) {
                    C1385s.this.f5599e.remove(c1211ad.f3718a);
                    if (z) {
                        C1385s.this.m4543a(c1211ad);
                    }
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadStart(int i3) {
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4546a(int i) {
        boolean z;
        switch (i) {
            case C1281i.f4751d /* -1003 */:
            case C1281i.f4750c /* -1002 */:
            case C1281i.f4749b /* -1001 */:
            case -1000:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z || ((i < -99 || i >= 200) && i < 400)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m4547b(C1211ad c1211ad) {
        if (TextUtils.isEmpty(c1211ad.f3718a)) {
            c1211ad.f3722e = System.currentTimeMillis();
            String strM4123a = C1343g.m4123a(c1211ad.f3721d + c1211ad.f3722e);
            c1211ad.f3718a = strM4123a;
            this.f5597c.put(strM4123a, c1211ad);
            this.f5598d.add(c1211ad);
        }
        new StringBuilder("insertOrUpdate: ").append(c1211ad.m2433a());
        C1188i.m2248a(C1182c.m2210a(C1175n.m2059a().m2148f())).m2251a(c1211ad);
        if (this.f5598d.size() > 500) {
            C1211ad c1211ad2 = this.f5598d.get(0);
            new StringBuilder("insertOrUpdate,  exceeded the maximum number of records, start to delete: ").append(c1211ad.m2433a());
            this.f5599e.remove(c1211ad.f3718a);
            m4543a(c1211ad2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x002e A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:36:0x002a, B:38:0x002e, B:39:0x0035, B:41:0x0039, B:35:0x0027, B:28:0x0001, B:30:0x0005, B:32:0x0009), top: B:47:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {, blocks: (B:36:0x002a, B:38:0x002e, B:39:0x0035, B:41:0x0039, B:35:0x0027, B:28:0x0001, B:30:0x0005, B:32:0x0009), top: B:47:0x0001, inners: #1 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m4549c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.anythink.core.common.f.ad> r0 = r2.f5597c     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2a
            java.util.List<com.anythink.core.common.f.ad> r0 = r2.f5598d     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2a
            com.anythink.core.common.b.n r0 = com.anythink.core.common.p051b.C1175n.m2059a()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r0.m2148f()     // Catch: java.lang.Throwable -> L26
            com.anythink.core.common.c.c r0 = com.anythink.core.common.p052c.C1182c.m2210a(r0)     // Catch: java.lang.Throwable -> L26
            com.anythink.core.common.c.i r0 = com.anythink.core.common.p052c.C1188i.m2248a(r0)     // Catch: java.lang.Throwable -> L26
            com.anythink.core.common.c.i$a r0 = r0.m2253c()     // Catch: java.lang.Throwable -> L26
            java.util.Map<java.lang.String, com.anythink.core.common.f.ad> r1 = r0.f3510b     // Catch: java.lang.Throwable -> L26
            r2.f5597c = r1     // Catch: java.lang.Throwable -> L26
            java.util.List<com.anythink.core.common.f.ad> r0 = r0.f3509a     // Catch: java.lang.Throwable -> L26
            r2.f5598d = r0     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L46
        L2a:
            java.util.Map<java.lang.String, com.anythink.core.common.f.ad> r0 = r2.f5597c     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L35
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            r2.f5597c = r0     // Catch: java.lang.Throwable -> L46
        L35:
            java.util.List<com.anythink.core.common.f.ad> r0 = r2.f5598d     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L44
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            java.util.List r0 = java.util.Collections.synchronizedList(r0)     // Catch: java.lang.Throwable -> L46
            r2.f5598d = r0     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r2)
            return
        L46:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1385s.m4549c():void");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4550a(String str, String str2, long j) {
        C1211ad c1211ad = new C1211ad();
        c1211ad.f3719b = 2;
        c1211ad.f3721d = str;
        c1211ad.f3720c = str2;
        c1211ad.f3723f = j;
        new StringBuilder("reSendNow: ").append(c1211ad.m2433a());
        m4544a(c1211ad, false);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4551b() {
        try {
            m4549c();
            List<C1211ad> listSynchronizedList = Collections.synchronizedList(new ArrayList(this.f5598d));
            if (listSynchronizedList != null && listSynchronizedList.size() > 0) {
                for (C1211ad c1211ad : listSynchronizedList) {
                    new StringBuilder("tryToReSendNoticeUrl: ").append(c1211ad.m2433a());
                    m4544a(c1211ad, true);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
