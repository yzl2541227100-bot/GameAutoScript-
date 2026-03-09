package com.anythink.core.p038b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1250o;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p038b.C1114i;
import com.anythink.core.p038b.C1114i.AnonymousClass1;
import com.anythink.core.p038b.p040b.InterfaceC1103b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110e extends AbstractC1107d {

    /* JADX INFO: renamed from: i */
    public static final double f2661i = 10000.0d;

    /* JADX INFO: renamed from: j */
    public final String f2662j;

    /* JADX INFO: renamed from: k */
    public final List<JSONObject> f2663k;

    /* JADX INFO: renamed from: l */
    public List<C1229av> f2664l;

    /* JADX INFO: renamed from: m */
    public List<C1229av> f2665m;

    /* JADX INFO: renamed from: n */
    public String f2666n;

    /* JADX INFO: renamed from: o */
    public String f2667o;

    /* JADX INFO: renamed from: p */
    public String f2668p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1103b f2669q;

    /* JADX INFO: renamed from: r */
    public long f2670r;

    /* JADX INFO: renamed from: s */
    public AtomicBoolean f2671s;

    /* JADX INFO: renamed from: t */
    public AtomicBoolean f2672t;

    /* JADX INFO: renamed from: u */
    public ConcurrentHashMap<String, C1229av> f2673u;

    /* JADX INFO: renamed from: v */
    public ConcurrentHashMap<String, C1229av> f2674v;

    /* JADX INFO: renamed from: w */
    public ConcurrentHashMap<String, C1229av> f2675w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap<String, C1229av> f2676x;

    /* JADX INFO: renamed from: y */
    public InterfaceRunnableC1313b f2677y;

    public AbstractC1110e(C1202a c1202a) {
        super(c1202a);
        this.f2662j = getClass().getSimpleName() + ":";
        this.f2663k = new ArrayList();
        this.f2664l = new ArrayList();
        this.f2665m = new ArrayList();
        this.f2671s = new AtomicBoolean(false);
        this.f2672t = new AtomicBoolean(false);
        this.f2673u = new ConcurrentHashMap<>();
        this.f2674v = new ConcurrentHashMap<>();
        this.f2675w = new ConcurrentHashMap<>();
        this.f2676x = new ConcurrentHashMap<>();
        this.f2677y = new InterfaceRunnableC1313b() { // from class: com.anythink.core.b.e.1
            @Override // java.lang.Runnable
            public final void run() {
                C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.e.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1110e.this.m1696g();
                    }
                });
            }
        };
        List<C1229av> list = c1202a.f3686j;
        if (list != null && list.size() > 0) {
            for (C1229av c1229av : c1202a.f3686j) {
                if (c1229av != null) {
                    this.f2673u.put(c1229av.m2842u(), c1229av);
                    this.f2675w.put(c1229av.m2842u(), c1229av);
                }
            }
        }
        List<C1229av> list2 = c1202a.f3687k;
        if (list2 != null && list2.size() > 0) {
            for (C1229av c1229av2 : c1202a.f3687k) {
                this.f2674v.put(c1229av2.m2842u(), c1229av2);
                this.f2676x.put(c1229av2.m2842u(), c1229av2);
            }
        }
        JSONObject jSONObject = c1202a.f3694r;
        if (jSONObject != null) {
            this.f2663k.add(jSONObject);
        }
        this.f2666n = c1202a.f3680d;
        this.f2667o = c1202a.f3681e;
        this.f2668p = mo1638b();
    }

    /* JADX INFO: renamed from: a */
    private static List<C1252q> m1678a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(C1252q.m3404a(jSONArrayOptJSONArray.optString(i)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m1679a(long j) {
        C1315d.m3806a().mo3800a(this.f2677y, j, false);
    }

    /* JADX INFO: renamed from: a */
    private void m1680a(long j, int i, String str, Map<String, C1229av> map) {
        for (C1229av c1229av : map.values()) {
            if (m1651a(c1229av, str, i)) {
                this.f2665m.add(c1229av);
            } else {
                m1694b(c1229av, str, j, i);
            }
        }
        map.clear();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1683a(AbstractC1110e abstractC1110e, C1229av c1229av) {
        int iM2784d = c1229av.m2784d();
        C1322e.m3875a(c1229av, abstractC1110e.f2638f, c1229av.m2724R(), true, C1111f.m1708a().m1717b(iM2784d));
        C1111f.m1708a().m1713a(iM2784d);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1685a(AbstractC1110e abstractC1110e, String str, C1229av c1229av) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int iM2784d = c1229av.m2784d();
        C1322e.m3875a(c1229av, abstractC1110e.f2638f, c1229av.m2724R(), false, C1111f.m1708a().m1717b(iM2784d));
        C1111f.m1708a().m1713a(iM2784d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:11:0x002c, B:12:0x003a, B:15:0x0044, B:17:0x004c, B:25:0x005d, B:26:0x0062), top: B:38:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m1687a(com.anythink.core.p038b.AbstractC1110e r6, org.json.JSONObject r7, com.anythink.core.common.p055f.C1229av r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f2662j
            r0.append(r1)
            java.lang.String r1 = "handleBidTokenResult"
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.f.av> r0 = r6.f2675w
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L26
            r6.m1695f()
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f2672t
            boolean r0 = r0.get()
            if (r0 != 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            monitor-enter(r6)
            if (r7 == 0) goto L3a
            if (r8 == 0) goto L3a
            java.util.List<org.json.JSONObject> r3 = r6.f2663k     // Catch: java.lang.Throwable -> L7e
            r3.add(r7)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.f.av> r7 = r6.f2676x     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r8.m2842u()     // Catch: java.lang.Throwable -> L7e
            r7.put(r3, r8)     // Catch: java.lang.Throwable -> L7e
        L3a:
            java.util.List<org.json.JSONObject> r7 = r6.f2663k     // Catch: java.lang.Throwable -> L7e
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L7e
            if (r7 <= 0) goto L5a
            if (r0 != 0) goto L5b
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f2671s     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L7e
            if (r7 == 0) goto L56
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f2672t     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L7e
            if (r7 != 0) goto L56
            r7 = 1
            goto L57
        L56:
            r7 = 0
        L57:
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r1 == 0) goto L64
            long r7 = r6.f2670r     // Catch: java.lang.Throwable -> L7e
            r6.m1692b(r7)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            return
        L64:
            monitor-exit(r6)
            java.util.List<com.anythink.core.common.f.av> r7 = r6.f2664l
            int r7 = r7.size()
            if (r7 <= 0) goto L7d
            boolean r7 = r6.m1702m()
            if (r7 == 0) goto L7d
            r1 = 0
            r2 = 0
            java.lang.String r4 = ""
            r5 = 0
            r0 = r6
            r0.m1689a(r1, r2, r4, r5)
        L7d:
            return
        L7e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.AbstractC1110e.m1687a(com.anythink.core.b.e, org.json.JSONObject, com.anythink.core.common.f.av):void");
    }

    /* JADX INFO: renamed from: a */
    private void m1688a(String str, C1229av c1229av) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int iM2784d = c1229av.m2784d();
        C1322e.m3875a(c1229av, this.f2638f, c1229av.m2724R(), false, C1111f.m1708a().m1717b(iM2784d));
        C1111f.m1708a().m1713a(iM2784d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m1689a(List<C1252q> list, long j, String str, Map<String, C1229av> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2662j);
        sb.append("handleResult: ");
        if (list != null && list.size() > 0) {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                C1252q c1252q = list.get(i);
                this.f2673u.remove(c1252q.f4442k);
                C1229av c1229avRemove = map.remove(c1252q.f4442k);
                if (this.f2674v.containsKey(c1252q.f4442k)) {
                    c1229avRemove = this.f2674v.remove(c1252q.f4442k);
                    this.f2674v.clear();
                }
                C1229av c1229av = c1229avRemove;
                if (c1229av != null) {
                    if (c1252q.isSuccessWithUseType()) {
                        int i2 = i + 1;
                        m1648a(c1229av.m2784d(), c1252q, i2 < list.size() ? list.get(i2).getSortPrice() : 0.0d, c1252q.isSamePrice());
                    }
                    mo1606a(c1229av, c1252q, j);
                }
            }
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (str2 != null) {
                    this.f2673u.remove(str2);
                }
                if (this.f2674v.containsKey(str2)) {
                    this.f2674v.clear();
                }
            }
        }
        if (map != null) {
            m1680a(j, -4, TextUtils.isEmpty(str) ? "No Response error." : "No Response error." + str, map);
        }
        if (this.f2665m.size() >= 2) {
            Collections.sort(this.f2665m);
        }
        m1701l();
        m1700k();
        m1699j();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:11:0x002c, B:12:0x003a, B:15:0x0044, B:17:0x004c, B:25:0x005d, B:26:0x0062), top: B:38:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1690a(org.json.JSONObject r7, com.anythink.core.common.p055f.C1229av r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f2662j
            r0.append(r1)
            java.lang.String r1 = "handleBidTokenResult"
            r0.append(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.f.av> r0 = r6.f2675w
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L26
            r6.m1695f()
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f2672t
            boolean r0 = r0.get()
            if (r0 != 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            monitor-enter(r6)
            if (r7 == 0) goto L3a
            if (r8 == 0) goto L3a
            java.util.List<org.json.JSONObject> r3 = r6.f2663k     // Catch: java.lang.Throwable -> L7e
            r3.add(r7)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.f.av> r7 = r6.f2676x     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r8.m2842u()     // Catch: java.lang.Throwable -> L7e
            r7.put(r3, r8)     // Catch: java.lang.Throwable -> L7e
        L3a:
            java.util.List<org.json.JSONObject> r7 = r6.f2663k     // Catch: java.lang.Throwable -> L7e
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L7e
            if (r7 <= 0) goto L5a
            if (r0 != 0) goto L5b
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f2671s     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L7e
            if (r7 == 0) goto L56
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f2672t     // Catch: java.lang.Throwable -> L7e
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L7e
            if (r7 != 0) goto L56
            r7 = 1
            goto L57
        L56:
            r7 = 0
        L57:
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r1 == 0) goto L64
            long r7 = r6.f2670r     // Catch: java.lang.Throwable -> L7e
            r6.m1692b(r7)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            return
        L64:
            monitor-exit(r6)
            java.util.List<com.anythink.core.common.f.av> r7 = r6.f2664l
            int r7 = r7.size()
            if (r7 <= 0) goto L7d
            boolean r7 = r6.m1702m()
            if (r7 == 0) goto L7d
            r1 = 0
            r2 = 0
            java.lang.String r4 = ""
            r5 = 0
            r0 = r6
            r0.m1689a(r1, r2, r4, r5)
        L7d:
            return
        L7e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.AbstractC1110e.m1690a(org.json.JSONObject, com.anythink.core.common.f.av):void");
    }

    /* JADX INFO: renamed from: b */
    private static /* synthetic */ List m1691b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(C1252q.m3404a(jSONArrayOptJSONArray.optString(i)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public synchronized void m1692b(final long j) {
        if (this.f2672t.get()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2662j);
            sb.append("beginRequestBidInfo, in bid requesting, do nothing.");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2662j);
        sb2.append("beginRequestBidInfo");
        ArrayList arrayList = new ArrayList();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        mo1637a(arrayList, concurrentHashMap);
        this.f2672t.set(true);
        mo1636a(arrayList, new InterfaceC1283k() { // from class: com.anythink.core.b.e.3
            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadCanceled(int i) {
                synchronized (AbstractC1110e.this) {
                    AbstractC1110e.this.f2672t.set(false);
                    AbstractC1110e.this.m1703d();
                    AbstractC1110e.this.m1689a((List<C1252q>) null, SystemClock.elapsedRealtime() - j, "onLoadCanceled.", (Map<String, C1229av>) concurrentHashMap);
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadError(int i, String str, AdError adError) {
                synchronized (AbstractC1110e.this) {
                    AbstractC1110e.this.f2672t.set(false);
                    AbstractC1110e.this.m1703d();
                    AbstractC1110e.this.m1689a((List<C1252q>) null, SystemClock.elapsedRealtime() - j, adError != null ? adError.getPlatformMSG() : "", (Map<String, C1229av>) concurrentHashMap);
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadFinish(int i, Object obj) {
                synchronized (AbstractC1110e.this) {
                    AbstractC1110e.this.f2672t.set(false);
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                    ArrayList arrayList2 = new ArrayList();
                    if (obj instanceof JSONObject) {
                        JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("data");
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList2.add(C1252q.m3404a(jSONArrayOptJSONArray.optString(i2)));
                        }
                    }
                    AbstractC1110e.this.m1689a(arrayList2, jElapsedRealtime, (String) null, (Map<String, C1229av>) concurrentHashMap);
                    AbstractC1110e.this.m1703d();
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadStart(int i) {
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m1693b(C1229av c1229av) {
        int iM2784d = c1229av.m2784d();
        C1322e.m3875a(c1229av, this.f2638f, c1229av.m2724R(), true, C1111f.m1708a().m1717b(iM2784d));
        C1111f.m1708a().m1713a(iM2784d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public synchronized void m1694b(C1229av c1229av, String str, long j, int i) {
        long jM2724R = 0;
        if (j > 0) {
            try {
                jM2724R = c1229av.m2724R() + j;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1107d.m1643a(c1229av, str, jM2724R, i);
        this.f2664l.add(c1229av);
    }

    /* JADX INFO: renamed from: f */
    private void m1695f() {
        C1315d.m3806a().mo3801b(this.f2677y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public synchronized void m1696g() {
        if (this.f2640h.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2662j);
        sb.append("get token short timeout.");
        this.f2671s.set(true);
        if (this.f2663k.size() > 0) {
            m1692b(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m1697h() {
        return this.f2671s.get() && !this.f2672t.get();
    }

    /* JADX INFO: renamed from: i */
    private synchronized void m1698i() {
        if (!this.f2640h.get()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2662j);
            sb.append("finishCallback: ");
            this.f2640h.set(true);
            m1695f();
            this.f2675w.clear();
            m1680a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f2673u);
            m1680a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f2674v);
            m1701l();
            m1700k();
            m1699j();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m1699j() {
        InterfaceC1103b interfaceC1103b;
        if ((this.f2665m.size() > 0 || this.f2664l.size() > 0) && (interfaceC1103b = this.f2669q) != null) {
            interfaceC1103b.mo1628a(this.f2665m, this.f2664l);
        }
        this.f2665m.clear();
        this.f2664l.clear();
    }

    /* JADX INFO: renamed from: k */
    private synchronized void m1700k() {
        if (m1702m()) {
            this.f2640h.set(true);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m1701l() {
        if (ATSDK.isNetworkLogDebug()) {
            if (this.f2665m.size() > 0 || this.f2664l.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("S2S HeadBidding Success List", AbstractC1107d.m1642a(this.f2665m));
                    jSONObject.put("S2S HeadBidding Fail List", AbstractC1107d.m1642a(this.f2664l));
                } catch (Exception unused) {
                }
                C1352p.m4216a(C1352p.f5334a, jSONObject.toString(), false);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m1702m() {
        return this.f2673u.size() == 0 && this.f2674v.size() == 0 && this.f2675w.size() == 0;
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1604a() {
        m1698i();
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1605a(InterfaceC1103b interfaceC1103b) {
        List<C1229av> list;
        this.f2670r = SystemClock.elapsedRealtime();
        this.f2669q = interfaceC1103b;
        if (ATSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PlacementId", this.f2638f.f3681e);
                if (this.f2638f.f3695s.m3047X()) {
                    jSONObject.put("isAdxNetworkMode", true);
                }
                jSONObject.put("S2S Start HeadBidding List", AbstractC1107d.m1642a(this.f2638f.f3686j));
                jSONObject.put("S2S Start HeadBidding List(Directly)", AbstractC1107d.m1644b(this.f2663k));
            } catch (Exception unused) {
            }
            C1352p.m4216a(C1352p.f5334a, jSONObject.toString(), false);
        }
        if (this.f2638f.f3686j.size() == 0 && (list = this.f2638f.f3687k) != null && list.size() > 0) {
            m1692b(this.f2670r);
            return;
        }
        long jM2930o = this.f2638f.f3690n.m2930o();
        if (jM2930o <= 0) {
            jM2930o = 500;
        }
        C1315d.m3806a().mo3800a(this.f2677y, jM2930o, false);
        Iterator<Map.Entry<String, C1229av>> it = this.f2673u.entrySet().iterator();
        while (it.hasNext()) {
            C1229av value = it.next().getValue();
            C1114i c1114i = new C1114i(this.f2638f);
            C1114i.a aVar = new C1114i.a() { // from class: com.anythink.core.b.e.2
                @Override // com.anythink.core.p038b.C1114i.a
                /* JADX INFO: renamed from: a */
                public final void mo1705a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
                    InterfaceC1103b interfaceC1103b2 = AbstractC1110e.this.f2669q;
                    if (interfaceC1103b2 != null) {
                        interfaceC1103b2.mo1627a(c1229av, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.p038b.C1114i.a
                /* JADX INFO: renamed from: a */
                public final void mo1706a(C1229av c1229av, JSONObject jSONObject2) {
                    if (AbstractC1110e.this.f2640h.get()) {
                        return;
                    }
                    c1229av.m2819k(SystemClock.elapsedRealtime() - AbstractC1110e.this.f2670r);
                    AbstractC1110e.this.f2675w.remove(c1229av.m2842u());
                    AbstractC1110e.m1683a(AbstractC1110e.this, c1229av);
                    if (!AbstractC1110e.this.f2671s.get() || (AbstractC1110e.this.f2671s.get() && AbstractC1110e.this.f2638f.f3690n.m2922g())) {
                        AbstractC1110e.m1687a(AbstractC1110e.this, jSONObject2, c1229av);
                    } else {
                        mo1707a(ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE, c1229av);
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.anythink.core.p038b.C1114i.a
                /* JADX INFO: renamed from: a */
                public final void mo1707a(String str, C1229av c1229av) {
                    AbstractC1110e abstractC1110e;
                    if (AbstractC1110e.this.f2640h.get()) {
                        return;
                    }
                    c1229av.m2819k(SystemClock.elapsedRealtime() - AbstractC1110e.this.f2670r);
                    if (str == null) {
                        str = "";
                    }
                    AbstractC1110e.this.f2675w.remove(c1229av.m2842u());
                    AbstractC1110e.this.f2673u.remove(c1229av.m2842u());
                    AbstractC1110e.m1685a(AbstractC1110e.this, str, c1229av);
                    str.hashCode();
                    byte b = -1;
                    switch (str.hashCode()) {
                        case -1295842379:
                            if (str.equals(ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
                                b = 0;
                            }
                            break;
                        case -49992206:
                            if (str.equals(ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE)) {
                                b = 1;
                            }
                            break;
                        case 56988620:
                            if (str.equals(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE)) {
                                b = 2;
                            }
                            break;
                        case 204511524:
                            if (str.equals(ATBidRequestInfo.INIT_ERROR_TYPE)) {
                                b = 3;
                            }
                            break;
                        case 1316982070:
                            if (str.equals(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE)) {
                                b = 4;
                            }
                            break;
                        case 1956498070:
                            if (str.equals(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE)) {
                                b = 5;
                            }
                            break;
                    }
                    int i = -9;
                    switch (b) {
                        case 0:
                        case 3:
                        case 4:
                        case 5:
                            abstractC1110e = AbstractC1110e.this;
                            break;
                        case 1:
                        case 2:
                            abstractC1110e = AbstractC1110e.this;
                            i = -2;
                            break;
                        default:
                            abstractC1110e = AbstractC1110e.this;
                            str = "Unknown error: ".concat(String.valueOf(str));
                            break;
                    }
                    abstractC1110e.m1694b(c1229av, str, 0L, i);
                    AbstractC1110e.m1687a(AbstractC1110e.this, (JSONObject) null, (C1229av) null);
                }
            };
            c1114i.f2699d = aVar;
            ATBaseAdAdapter aTBaseAdAdapterM4174a = C1346j.m4174a(value);
            if (aTBaseAdAdapterM4174a == null) {
                aVar.mo1707a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE, value);
            } else {
                C1335b.m3998a().m4005a(c1114i.new AnonymousClass1(aTBaseAdAdapterM4174a, value));
            }
        }
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public void mo1606a(C1229av c1229av, C1250o c1250o, long j) {
        String str;
        int i;
        if (c1250o instanceof C1252q) {
            C1252q c1252q = (C1252q) c1250o;
            if (c1252q.isSuccessWithUseType()) {
                c1229av.m2736a(j > 0 ? c1229av.m2724R() + j : 0L);
                this.f2665m.add(c1229av);
                c1252q.f4437f = ((c1229av.m2826m() == 3 || c1229av.m2826m() == 7) ? c1252q.f4436e : c1229av.m2830o()) + System.currentTimeMillis();
                m1649a(c1229av, c1252q);
                return;
            }
            int i2 = 0;
            if (c1252q.useType == 2) {
                c1229av.m2722P();
                str = "filter by s2s bid max count";
                i2 = 1;
                i = 0;
            } else {
                str = "errorCode:[" + c1252q.f4432a + "],errorMsg:[" + c1252q.errorMsg + "]";
                i = -1;
            }
            if (m1652a(c1229av, str, i, i2)) {
                this.f2665m.add(c1229av);
            } else {
                m1694b(c1229av, str, j, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1636a(List<JSONObject> list, InterfaceC1283k interfaceC1283k);

    /* JADX INFO: renamed from: a */
    public synchronized void mo1637a(List<JSONObject> list, Map<String, C1229av> map) {
        list.addAll(this.f2663k);
        this.f2663k.clear();
        map.putAll(this.f2676x);
        this.f2676x.clear();
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1650a(boolean z) {
        this.f2639g = z;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo1638b();

    /* JADX INFO: renamed from: d */
    public final synchronized void m1703d() {
        if (m1704e()) {
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (AbstractC1110e.this) {
                        if (AbstractC1110e.this.m1704e()) {
                            AbstractC1110e.this.m1692b(SystemClock.elapsedRealtime());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1704e() {
        return !this.f2672t.get() && this.f2663k.size() > 0;
    }
}
