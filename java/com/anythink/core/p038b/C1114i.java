package com.anythink.core.p038b;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1346j;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.b.i */
/* JADX INFO: loaded from: classes.dex */
public class C1114i {

    /* JADX INFO: renamed from: a */
    public static String f2696a = "i";

    /* JADX INFO: renamed from: b */
    public C1202a f2697b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f2698c;

    /* JADX INFO: renamed from: d */
    public a f2699d;

    /* JADX INFO: renamed from: com.anythink.core.b.i$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATBaseAdAdapter f2700a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1229av f2701b;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av) {
            this.f2700a = aTBaseAdAdapter;
            this.f2701b = c1229av;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1114i.m1723a(C1114i.this, this.f2700a, this.f2701b);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.i$2 */
    public class AnonymousClass2 implements ATBidRequestInfoListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1229av f2703a;

        public AnonymousClass2(C1229av c1229av) {
            this.f2703a = c1229av;
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onFailed(String str) {
            a aVar = C1114i.this.f2699d;
            if (aVar != null) {
                aVar.mo1707a(str, this.f2703a);
            }
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onSuccess(ATBidRequestInfo aTBidRequestInfo) {
            C1114i.m1724a(C1114i.this, this.f2703a, aTBidRequestInfo);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.i$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATBidRequestInfo f2705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1229av f2706b;

        public AnonymousClass3(ATBidRequestInfo aTBidRequestInfo, C1229av c1229av) {
            this.f2705a = aTBidRequestInfo;
            this.f2706b = c1229av;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject requestJSONObject;
            ATAdxBidFloorInfo aTAdxBidFloorInfo;
            try {
                ATBidRequestInfo aTBidRequestInfo = this.f2705a;
                if (aTBidRequestInfo != null && (requestJSONObject = aTBidRequestInfo.toRequestJSONObject()) != null) {
                    ATBidRequestInfo.fillBaseCommonParams(requestJSONObject, String.valueOf(C1114i.this.f2697b.f3682f), C1114i.this.f2697b.f3690n.m2916a(), this.f2706b);
                    if (this.f2706b.m2826m() == 3) {
                        try {
                            requestJSONObject.put("unit_id", this.f2706b.m2842u());
                            requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, C1175n.m2059a().m2157k());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (C1114i.this.f2697b.f3702z == 1) {
                            requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                        }
                        if (C1114i.this.f2697b.f3695s.m3047X() && (aTAdxBidFloorInfo = C1114i.this.f2697b.f3676A) != null) {
                            double bidFloor = aTAdxBidFloorInfo.getBidFloor();
                            ATAdConst.CURRENCY currency = aTAdxBidFloorInfo.getCurrency();
                            if (currency == null) {
                                currency = ATAdConst.CURRENCY.USD;
                            }
                            double dM5031C = C1114i.this.f2697b.f3690n.m2916a().m5031C();
                            if (currency != ATAdConst.CURRENCY.RMB) {
                                if (currency == ATAdConst.CURRENCY.RMB_CENT) {
                                    bidFloor /= 100.0d;
                                    bidFloor *= dM5031C;
                                }
                                requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.C_BID_FLOOR, bidFloor);
                            } else {
                                bidFloor *= dM5031C;
                                requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.C_BID_FLOOR, bidFloor);
                            }
                        }
                    }
                    a aVar = C1114i.this.f2699d;
                    if (aVar != null) {
                        aVar.mo1706a(this.f2706b, requestJSONObject);
                        return;
                    }
                    return;
                }
                a aVar2 = C1114i.this.f2699d;
                if (aVar2 != null) {
                    aVar2.mo1707a(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE, this.f2706b);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                a aVar3 = C1114i.this.f2699d;
                if (aVar3 != null) {
                    aVar3.mo1707a(th2.getMessage(), this.f2706b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.b.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1705a(C1229av c1229av, ATBaseAdAdapter aTBaseAdAdapter);

        /* JADX INFO: renamed from: a */
        void mo1706a(C1229av c1229av, JSONObject jSONObject);

        /* JADX INFO: renamed from: a */
        void mo1707a(String str, C1229av c1229av);
    }

    public C1114i(C1202a c1202a) {
        this.f2697b = c1202a;
        this.f2698c = c1202a.f3693q;
    }

    /* JADX INFO: renamed from: a */
    private void m1722a(ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av) {
        try {
            C1396f c1396fM2916a = this.f2697b.f3690n.m2916a();
            C1202a c1202a = this.f2697b;
            Map<String, Object> mapM5057a = c1396fM2916a.m5057a(c1202a.f3681e, c1202a.f3680d, c1229av);
            C1243h c1243hM3045V = this.f2697b.f3695s.m3045V();
            C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
            C1344h.m4141a(mapM5057a, c1243hM3045V);
            aTBaseAdAdapter.getBidRequestInfo(this.f2697b.f3678b, mapM5057a, this.f2698c, new AnonymousClass2(c1229av));
            a aVar = this.f2699d;
            if (aVar != null) {
                aVar.mo1705a(c1229av, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar2 = this.f2699d;
            if (aVar2 != null) {
                aVar2.mo1707a(th.getMessage(), c1229av);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1723a(C1114i c1114i, ATBaseAdAdapter aTBaseAdAdapter, C1229av c1229av) {
        try {
            C1396f c1396fM2916a = c1114i.f2697b.f3690n.m2916a();
            C1202a c1202a = c1114i.f2697b;
            Map<String, Object> mapM5057a = c1396fM2916a.m5057a(c1202a.f3681e, c1202a.f3680d, c1229av);
            C1243h c1243hM3045V = c1114i.f2697b.f3695s.m3045V();
            C1358v.m4253a(c1243hM3045V, c1229av, 0, false);
            C1344h.m4141a(mapM5057a, c1243hM3045V);
            aTBaseAdAdapter.getBidRequestInfo(c1114i.f2697b.f3678b, mapM5057a, c1114i.f2698c, c1114i.new AnonymousClass2(c1229av));
            a aVar = c1114i.f2699d;
            if (aVar != null) {
                aVar.mo1705a(c1229av, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar2 = c1114i.f2699d;
            if (aVar2 != null) {
                aVar2.mo1707a(th.getMessage(), c1229av);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1724a(C1114i c1114i, C1229av c1229av, ATBidRequestInfo aTBidRequestInfo) {
        C1335b.m3998a().m4005a(c1114i.new AnonymousClass3(aTBidRequestInfo, c1229av));
    }

    /* JADX INFO: renamed from: a */
    private void m1725a(C1229av c1229av, ATBidRequestInfo aTBidRequestInfo) {
        C1335b.m3998a().m4005a(new AnonymousClass3(aTBidRequestInfo, c1229av));
    }

    /* JADX INFO: renamed from: a */
    private void m1726a(C1229av c1229av, a aVar) {
        this.f2699d = aVar;
        ATBaseAdAdapter aTBaseAdAdapterM4174a = C1346j.m4174a(c1229av);
        if (aTBaseAdAdapterM4174a == null) {
            aVar.mo1707a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE, c1229av);
        } else {
            C1335b.m3998a().m4005a(new AnonymousClass1(aTBaseAdAdapterM4174a, c1229av));
        }
    }
}
