package com.anythink.core.p038b;

import android.os.SystemClock;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1250o;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.p038b.p040b.InterfaceC1103b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1113h extends AbstractC1107d {

    /* JADX INFO: renamed from: a */
    private String f2691a;

    /* JADX INFO: renamed from: b */
    private long f2692b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1103b f2693c;

    public C1113h(C1202a c1202a) {
        super(c1202a);
        this.f2691a = "IH Bidding";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m1719a(List<C1229av> list, int i) {
        if (this.f2640h.get()) {
            return;
        }
        this.f2640h.set(true);
        List<C1229av> arrayList = list == null ? new ArrayList<>() : list;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2692b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C1229av> it = this.f2638f.f3686j.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C1229av next = it.next();
            Iterator<C1229av> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1229av next2 = it2.next();
                if (next.m2842u().equals(next2.m2842u())) {
                    next2.m2736a(jElapsedRealtime);
                    next2.m2801g(0);
                    C1252q c1252q = new C1252q(true, next2.m2850y(), next2.m2852z(), "", "", "", "");
                    c1252q.f4437f = next2.m2830o() + System.currentTimeMillis();
                    c1252q.f4436e = next2.m2830o();
                    m1649a(next2, c1252q);
                    z = true;
                    break;
                }
            }
            if (!z) {
                if (MediationBidManager.NO_BID_TOKEN_ERROR.equals(next.m2698A())) {
                    m1721b(next, "No Bid Info.", 0L, -2);
                } else {
                    m1721b(next, "No Bid Info.", jElapsedRealtime, i);
                }
                if (m1651a(next, "No Bid Info.", i)) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
        }
        if (ATSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("IH Bidding Success List", AbstractC1107d.m1642a(arrayList));
                jSONObject.put("IH Bidding Fail List", AbstractC1107d.m1642a(arrayList2));
            } catch (Exception unused) {
            }
            C1352p.m4216a(this.f2691a, jSONObject.toString(), false);
        }
        this.f2640h.set(true);
        InterfaceC1103b interfaceC1103b = this.f2693c;
        if (interfaceC1103b != null) {
            interfaceC1103b.mo1628a(arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1720b(C1229av c1229av) {
        C1252q c1252q = new C1252q(true, c1229av.m2850y(), c1229av.m2852z(), "", "", "", "");
        c1252q.f4437f = c1229av.m2830o() + System.currentTimeMillis();
        c1252q.f4436e = c1229av.m2830o();
        m1649a(c1229av, c1252q);
    }

    /* JADX INFO: renamed from: b */
    private static void m1721b(C1229av c1229av, String str, long j, int i) {
        AbstractC1107d.m1643a(c1229av, str, j, i);
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1604a() {
        m1719a((List<C1229av>) null, -3);
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1605a(final InterfaceC1103b interfaceC1103b) {
        this.f2693c = interfaceC1103b;
        this.f2692b = SystemClock.elapsedRealtime();
        List<C1229av> list = this.f2638f.f3686j;
        if (ATSDK.isNetworkLogDebug()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Start IH Bidding List", AbstractC1107d.m1642a(list));
            } catch (Exception unused) {
            }
            C1352p.m4216a(C1352p.f5334a, jSONObject.toString(), false);
        }
        if (C1111f.m1708a().m1716b() == null) {
            Iterator<C1229av> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ATBaseAdAdapter aTBaseAdAdapterM4174a = C1346j.m4174a(it.next());
                if (aTBaseAdAdapterM4174a != null) {
                    MediationBidManager bidManager = aTBaseAdAdapterM4174a.getBidManager();
                    if (bidManager != null) {
                        C1111f.m1708a().m1714a(bidManager);
                    }
                }
            }
        }
        MediationBidManager mediationBidManagerM1716b = C1111f.m1708a().m1716b();
        if (mediationBidManagerM1716b == null) {
            Log.i(C1352p.f5334a, "No BidManager.");
            m1719a((List<C1229av>) null, -9);
        } else {
            mediationBidManagerM1716b.setBidRequestUrl(this.f2638f.f3691o);
            mediationBidManagerM1716b.startBid(this.f2638f, new MediationBidManager.BidListener() { // from class: com.anythink.core.b.h.1
                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidFail(String str) {
                }

                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidStart(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter) {
                    InterfaceC1103b interfaceC1103b2 = interfaceC1103b;
                    if (interfaceC1103b2 != null) {
                        interfaceC1103b2.mo1627a(c1229av, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.api.MediationBidManager.BidListener
                public final void onBidSuccess(List<C1229av> list2) {
                    C1113h.this.m1719a(list2, -1);
                }
            });
        }
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1606a(C1229av c1229av, C1250o c1250o, long j) {
    }
}
