package com.anythink.core.p038b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1250o;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p066o.C1333b;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p038b.p040b.AbstractC1104c;
import com.anythink.core.p038b.p040b.C1102a;
import com.anythink.core.p038b.p040b.InterfaceC1103b;
import com.anythink.core.p038b.p041c.C1106a;
import com.anythink.core.p038b.p042d.C1109b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1098a extends AbstractC1107d {

    /* JADX INFO: renamed from: a */
    public static final String f2545a = "a";

    /* JADX INFO: renamed from: b */
    private List<C1229av> f2546b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1103b f2547c;

    /* JADX INFO: renamed from: d */
    private long f2548d;

    public C1098a(C1202a c1202a) {
        super(c1202a);
        this.f2546b = Collections.synchronizedList(new ArrayList(this.f2638f.f3686j));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m1594a(ATBiddingResult aTBiddingResult) {
        if (aTBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(aTBiddingResult.errorMsg, ATBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }

    /* JADX INFO: renamed from: a */
    private static ATBiddingResult m1595a(String str) {
        return ATBiddingResult.fail(str);
    }

    /* JADX INFO: renamed from: a */
    private C1252q m1596a(C1229av c1229av, C1250o c1250o, long j, C1106a c1106a) {
        c1229av.m2736a(j);
        c1229av.m2737a(c1250o.currency);
        double dM1646a = m1646a(c1250o.getSortPrice(), c1229av);
        boolean zIsSamePrice = c1250o.isSamePrice();
        double dM1646a2 = zIsSamePrice ? dM1646a : m1646a(c1250o.getPrice(), c1229av);
        if (dM1646a <= 0.0d) {
            Log.w(C1352p.f5334a, "NetworkName:" + c1229av.m2789e() + ",AdSourceId:" + c1229av.m2842u() + " c2s sort price return 0,please check network placement c2s config");
            dM1646a = C1344h.m4129a(c1229av);
        }
        double d = dM1646a;
        if (dM1646a2 <= 0.0d) {
            Log.w(C1352p.f5334a, "NetworkName:" + c1229av.m2789e() + ",AdSourceId:" + c1229av.m2842u() + " c2s real price return 0,please check network placement c2s config");
            dM1646a2 = C1344h.m4129a(c1229av);
        }
        C1252q c1252q = new C1252q(c1250o.isSuccessWithUseType(), d, dM1646a2, c1250o.token, c1250o.winNoticeUrl, c1250o.loseNoticeUrl, c1250o.displayNoticeUrl, "");
        c1252q.f4443l = m1647a(c1229av);
        c1252q.setBiddingNotice(c1250o.biddingNotice);
        c1252q.f4437f = c1229av.m2830o() + System.currentTimeMillis();
        c1252q.f4436e = c1229av.m2830o();
        c1252q.f4442k = c1229av.m2842u();
        c1252q.f4435d = c1229av.m2784d();
        c1252q.f4449r = c1106a;
        c1252q.f4450s = c1106a != null;
        m1648a(c1229av.m2784d(), c1252q, 0.0d, zIsSamePrice);
        return c1252q;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m1597a(ATBiddingResult aTBiddingResult, C1229av c1229av) {
        m1601a(false, aTBiddingResult, c1229av, -1, (C1106a) null);
    }

    /* JADX INFO: renamed from: a */
    private void m1599a(C1229av c1229av, C1250o c1250o, long j, int i, C1106a c1106a) {
        m1602a(c1229av, c1250o, j, i, c1106a, false);
    }

    /* JADX INFO: renamed from: a */
    private void m1600a(C1252q c1252q, C1229av c1229av, double d) {
        C1109b.m1674a(c1252q, new C1260y(2, c1229av, this.f2638f.f3695s, d), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m1601a(boolean r13, com.anythink.core.api.ATBiddingResult r14, com.anythink.core.common.p055f.C1229av r15, int r16, com.anythink.core.p038b.p041c.C1106a r17) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.C1098a.m1601a(boolean, com.anythink.core.api.ATBiddingResult, com.anythink.core.common.f.av, int, com.anythink.core.b.c.a):void");
    }

    /* JADX INFO: renamed from: a */
    private boolean m1602a(C1229av c1229av, C1250o c1250o, long j, int i, C1106a c1106a, boolean z) {
        C1252q c1252qM1596a;
        double price;
        boolean zIsSuccessWithUseType = c1250o.isSuccessWithUseType();
        if (zIsSuccessWithUseType || z) {
            c1252qM1596a = m1596a(c1229av, c1250o, j, c1106a);
            price = c1252qM1596a.getPrice();
        } else {
            c1252qM1596a = null;
            price = 0.0d;
        }
        if (!zIsSuccessWithUseType || z) {
            if (z) {
                AbstractC1107d.m1643a(c1229av, ATBidRequestInfo.LESS_THAN_BID_FLOOR_TYPE, j, -11);
                c1229av.m2734a(price);
                c1229av.m2785d(price);
                m1600a(c1252qM1596a, c1229av, c1229av.m2752ae());
            } else {
                AbstractC1107d.m1643a(c1229av, c1250o.errorMsg, j, i);
            }
            String str = C1169h.n.f3187m;
            C1202a c1202a = this.f2638f;
            C1352p.m4212a(str, c1202a.f3681e, C1344h.m4152d(String.valueOf(c1202a.f3682f)), c1229av);
            return false;
        }
        StringBuilder sb = new StringBuilder("C2S Bidding Success: , AdSourceId:");
        sb.append(c1229av.m2842u());
        sb.append(", NetworkFirmId:");
        sb.append(c1229av.m2784d());
        sb.append(" | price:");
        sb.append(c1250o.getPrice());
        sb.append(" | sortPrice:");
        sb.append(c1250o.getSortPrice());
        sb.append(" | currency:");
        sb.append(c1250o.currency.toString());
        m1649a(c1229av, c1252qM1596a);
        String str2 = C1169h.n.f3186l;
        C1202a c1202a2 = this.f2638f;
        C1352p.m4212a(str2, c1202a2.f3681e, C1344h.m4152d(String.valueOf(c1202a2.f3682f)), c1229av);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static int m1603b(ATBiddingResult aTBiddingResult) {
        if (aTBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(aTBiddingResult.errorMsg, ATBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final synchronized void mo1604a() {
        if (!this.f2640h.get()) {
            this.f2640h.set(true);
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            for (C1229av c1229av : this.f2546b) {
                if (m1651a(c1229av, "bid timeout", -3)) {
                    arrayList.add(c1229av);
                } else {
                    m1599a(c1229av, ATBiddingResult.fail("bid timeout!"), SystemClock.elapsedRealtime() - this.f2548d, -3, (C1106a) null);
                    arrayList2.add(c1229av);
                }
            }
            this.f2546b.clear();
            InterfaceC1103b interfaceC1103b = this.f2547c;
            if (interfaceC1103b != null) {
                interfaceC1103b.mo1628a(arrayList, arrayList2);
            }
            this.f2547c = null;
        }
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1605a(InterfaceC1103b interfaceC1103b) {
        this.f2547c = interfaceC1103b;
        List<C1229av> list = this.f2638f.f3686j;
        int size = list.size();
        this.f2548d = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            final C1229av c1229av = list.get(i);
            ATBaseAdAdapter aTBaseAdAdapterM4174a = C1346j.m4174a(c1229av);
            if (aTBaseAdAdapterM4174a == null) {
                m1601a(false, ATBiddingResult.fail(c1229av.m2809i() + " not exist!"), c1229av, -9, (C1106a) null);
            } else {
                try {
                    AbstractC1104c abstractC1104c = new AbstractC1104c(aTBaseAdAdapterM4174a) { // from class: com.anythink.core.b.a.1
                        /* JADX INFO: renamed from: a */
                        private void m1607a(final ATBiddingResult aTBiddingResult, final C1106a c1106a) {
                            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.b.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1098a.this.m1601a(aTBiddingResult.isSuccessWithUseType(), aTBiddingResult, c1229av, C1098a.m1594a(aTBiddingResult), c1106a);
                                }
                            });
                        }

                        @Override // com.anythink.core.api.ATBiddingListener
                        public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
                            ATBaseAdAdapter aTBaseAdAdapter = this.f2629c;
                            if (aTBaseAdAdapter != null) {
                                aTBaseAdAdapter.releaseLoadResource();
                            }
                            m1607a(aTBiddingResult, null);
                        }

                        @Override // com.anythink.core.api.ATBiddingListener
                        public final void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
                            ATBaseAdAdapter aTBaseAdAdapter = this.f2629c;
                            if (aTBaseAdAdapter != null) {
                                aTBaseAdAdapter.releaseLoadResource();
                            }
                            m1607a(aTBiddingResult, new C1106a(this.f2629c, baseAd));
                        }
                    };
                    new StringBuilder("start c2s bid request: ").append(aTBaseAdAdapterM4174a.getInternalNetworkName());
                    C1396f c1396fM5139a = C1398h.m5135a(this.f2638f.f3678b).m5139a(this.f2638f.f3681e);
                    C1202a c1202a = this.f2638f;
                    Map<String, Object> mapM5057a = c1396fM5139a.m5057a(c1202a.f3681e, c1202a.f3680d, c1229av);
                    try {
                        double dM2752ae = c1229av.m2752ae();
                        if (dM2752ae > 0.0d) {
                            mapM5057a.put("bid_floor", Double.valueOf(dM2752ae * m1647a(c1229av)));
                        }
                    } catch (Throwable th) {
                        Log.w(C1352p.f5334a, "C2S startBidRequest with exception:" + th.getMessage());
                    }
                    C1243h c1243hM3045V = this.f2638f.f3695s.m3045V();
                    C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
                    C1344h.m4141a(mapM5057a, c1243hM3045V);
                    C1202a c1202a2 = this.f2638f;
                    if (c1202a2.f3696t == 8) {
                        double d = c1202a2.f3697u;
                        mapM5057a.put(C1169h.p.f3231j, d < 0.0d ? "0" : Double.valueOf(d));
                    }
                    if (c1229av.m2784d() == 22) {
                        C1333b.m3988a(c1396fM5139a, mapM5057a, c1229av, this.f2638f.f3700x);
                    }
                    C1257v c1257v = this.f2638f.f3679c;
                    Context contextM3445a = c1257v != null ? c1257v.m3445a() : null;
                    if (contextM3445a == null) {
                        contextM3445a = this.f2638f.f3678b;
                    }
                    boolean zInternalStartBiddingRequest = aTBaseAdAdapterM4174a.internalStartBiddingRequest(contextM3445a, mapM5057a, this.f2638f.f3693q, new C1102a(this.f2638f.f3695s, c1229av.m2842u(), mapM5057a, abstractC1104c));
                    interfaceC1103b.mo1627a(c1229av, aTBaseAdAdapterM4174a);
                    if (!zInternalStartBiddingRequest) {
                        m1597a(ATBiddingResult.fail("This network don't support head bidding in current TopOn's version."), c1229av);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    m1597a(ATBiddingResult.fail(th2.getMessage()), c1229av);
                }
            }
        }
    }

    @Override // com.anythink.core.p038b.AbstractC1107d
    /* JADX INFO: renamed from: a */
    public final void mo1606a(C1229av c1229av, C1250o c1250o, long j) {
        m1599a(c1229av, c1250o, j, -1, (C1106a) null);
    }
}
