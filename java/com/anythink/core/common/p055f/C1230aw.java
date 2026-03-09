package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.common.p066o.C1344h;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.f.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C1230aw {

    /* JADX INFO: renamed from: c */
    private String f4021c;

    /* JADX INFO: renamed from: a */
    private final String f4019a = "anythink_" + C1230aw.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private int f4020b = 1;

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, C1225ar> f4022d = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: com.anythink.core.common.f.aw$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo2861a(C1225ar c1225ar);
    }

    public C1230aw(String str, String str2) {
        this.f4021c = str + "_" + str2;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2854a() {
        if (this.f4022d.entrySet() == null) {
            return;
        }
        if (this.f4022d.size() < this.f4020b) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4021c);
            sb.append(":removeCacheOverLimit::No need to clean over size cache");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4021c);
        sb2.append(":removeCacheOverLimit::try to clean over size cache start.....................");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f4021c);
        sb3.append(":removeCacheOverLimit::Current Cache Map:");
        sb3.append(this.f4022d.size());
        final C1225ar[] c1225arArr = new C1225ar[1];
        m2855a(new a() { // from class: com.anythink.core.common.f.aw.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
            @Override // com.anythink.core.common.p055f.C1230aw.a
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean mo2861a(com.anythink.core.common.p055f.C1225ar r9) {
                /*
                    r8 = this;
                    com.anythink.core.common.f.ar[] r0 = r2
                    r1 = 0
                    r2 = r0[r1]
                    r3 = 1
                    if (r2 != 0) goto Lc
                    r0[r1] = r9
                La:
                    r0 = 1
                    goto L3f
                Lc:
                    double r4 = r9.m2640e()
                    com.anythink.core.common.f.ar[] r0 = r2
                    r0 = r0[r1]
                    double r6 = r0.m2640e()
                    int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r0 >= 0) goto L1d
                L1c:
                    goto La
                L1d:
                    double r4 = r9.m2640e()
                    com.anythink.core.common.f.ar[] r0 = r2
                    r0 = r0[r1]
                    double r6 = r0.m2640e()
                    int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r0 != 0) goto L3e
                    long r4 = r9.m2641f()
                    com.anythink.core.common.f.ar[] r0 = r2
                    r0 = r0[r1]
                    long r6 = r0.m2641f()
                    int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r0 >= 0) goto L3e
                    goto L1c
                L3e:
                    r0 = 0
                L3f:
                    if (r0 == 0) goto L45
                    com.anythink.core.common.f.ar[] r0 = r2
                    r0[r1] = r9
                L45:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p055f.C1230aw.AnonymousClass1.mo2861a(com.anythink.core.common.f.ar):boolean");
            }
        });
        if (this.f4022d.size() < this.f4020b) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f4021c);
            sb4.append(":removeCacheOverLimit::No need to clean over size cache: check again,current size:");
            sb4.append(this.f4022d.size());
        } else if (c1225arArr[0] != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f4021c);
            sb5.append(":removeCacheOverLimit::Final to remove&&destory cache RequestId:");
            sb5.append(c1225arArr[0].m2634a());
            this.f4022d.remove(c1225arArr[0].m2634a());
            c1225arArr[0].m2642g();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f4021c);
        sb6.append(":removeCacheOverLimit::try to clean over size cache end.....................");
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2855a(a aVar) {
        ConcurrentHashMap<String, C1225ar> concurrentHashMap = this.f4022d;
        if (concurrentHashMap == null) {
            return;
        }
        Set<Map.Entry<String, C1225ar>> setEntrySet = concurrentHashMap.entrySet();
        if (setEntrySet == null) {
            return;
        }
        for (Map.Entry<String, C1225ar> entry : setEntrySet) {
            C1225ar value = entry.getValue();
            C1234b c1234bM2638c = value.m2638c();
            boolean z = false;
            if (value == null || c1234bM2638c == null || !c1234bM2638c.m2910j()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f4021c);
                sb.append(":traverseVailRequestCacheEntry:RequestId:");
                sb.append(entry.getKey());
                sb.append(" :: Cache is not vail.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f4021c);
                sb2.append(":traverseVailRequestCacheEntry:RequestId:");
                sb2.append(entry.getKey());
                sb2.append(" :: traverseAdCache price::");
                sb2.append(value.m2640e());
                sb2.append("\n");
                sb2.append(c1234bM2638c);
                z = true;
                entry.getKey();
                aVar.mo2861a(value);
            }
            if (value == null || !z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f4021c);
                sb3.append(":traverseVailRequestCacheEntry:RequestId:");
                sb3.append(entry.getKey());
                sb3.append(" :: remove requestCacheEntry.");
                this.f4022d.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1241f m2856a(final C1252q c1252q) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4021c);
        sb.append(":try to getAdSourceCacheStatus start------------------------------------------------|");
        final C1241f c1241f = new C1241f();
        final ArrayList arrayList = new ArrayList(3);
        c1241f.f4114a = arrayList;
        m2855a(new a() { // from class: com.anythink.core.common.f.aw.2
            @Override // com.anythink.core.common.p055f.C1230aw.a
            /* JADX INFO: renamed from: a */
            public final boolean mo2861a(C1225ar c1225ar) {
                C1252q c1252q2;
                if (!c1241f.f4116c && c1225ar.m2639d()) {
                    c1241f.f4116c = true;
                }
                C1234b c1234bM2638c = c1225ar.m2638c();
                if (c1234bM2638c != null) {
                    if (arrayList.size() == 0) {
                        arrayList.add(c1234bM2638c);
                        C1252q c1252qM2719M = c1234bM2638c.m2904d().getUnitGroupInfo().m2719M();
                        c1252q2 = c1252q;
                        if (c1252q2 != null && c1252qM2719M != null && TextUtils.equals(c1252q2.token, c1252qM2719M.token)) {
                            c1241f.f4115b = c1234bM2638c;
                        }
                    } else {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            if (C1344h.m4129a(c1234bM2638c.m2904d().getUnitGroupInfo()) > C1344h.m4129a(((C1234b) arrayList.get(i)).m2904d().getUnitGroupInfo())) {
                                arrayList.add(i, c1234bM2638c);
                                break;
                            }
                            if (i == arrayList.size() - 1) {
                                break;
                            }
                            i++;
                        }
                        C1252q c1252qM2719M2 = c1234bM2638c.m2904d().getUnitGroupInfo().m2719M();
                        c1252q2 = c1252q;
                        if (c1252q2 != null) {
                            c1241f.f4115b = c1234bM2638c;
                        }
                    }
                }
                return true;
            }
        });
        return c1241f;
    }

    /* JADX INFO: renamed from: a */
    public final void m2857a(int i) {
        if (i <= 0) {
            return;
        }
        this.f4020b = i;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2858a(C1234b c1234b) {
        if (this.f4022d == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4021c);
        sb.append(":try to removeAdCache start.....................");
        if (c1234b != null) {
            C1225ar c1225ar = this.f4022d.get(c1234b.m2908h().m2678ai());
            if (c1225ar != null) {
                c1225ar.m2636a(c1234b);
                if (c1225ar.m2637b() == 0) {
                    this.f4022d.remove(c1225ar.m2634a());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f4021c);
                    sb2.append(":remove requestCacheEntry:");
                    sb2.append(c1225ar.m2634a());
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f4021c);
        sb3.append(":try to removeAdCache end.....................");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2859a(String str, C1225ar c1225ar) {
        m2854a();
        this.f4022d.put(str, c1225ar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2860b(final int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4021c);
        sb.append(":try to refreshSamePriceIndex start.....................");
        m2855a(new a() { // from class: com.anythink.core.common.f.aw.3
            @Override // com.anythink.core.common.p055f.C1230aw.a
            /* JADX INFO: renamed from: a */
            public final boolean mo2861a(C1225ar c1225ar) {
                c1225ar.m2635a(i);
                return true;
            }
        });
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4021c);
        sb2.append(":try to refreshSamePriceIndex end.....................");
    }
}
