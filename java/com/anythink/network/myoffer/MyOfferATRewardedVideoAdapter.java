package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p021e.InterfaceC0780j;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.basead.p022f.C0788f;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.C1373r;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14889a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f14890b;

    /* JADX INFO: renamed from: d */
    private C0788f f14892d;

    /* JADX INFO: renamed from: c */
    private String f14891c = "";

    /* JADX INFO: renamed from: e */
    private boolean f14893e = false;

    /* JADX INFO: renamed from: a */
    private void m12316a(Context context) {
        this.f14892d = new C0788f(context, this.f14889a, this.f14891c, this.f14893e);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0788f c0788f = this.f14892d;
        if (c0788f != null) {
            c0788f.m616a((InterfaceC0780j) null);
            this.f14892d = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14890b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14891c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return C1344h.m4131a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14891c = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14889a = (C1248m) map.get(C1169h.p.f3222a);
        }
        if (map.containsKey(C1373r.f5468b)) {
            this.f14893e = ((Boolean) map.get(C1373r.f5468b)).booleanValue();
        }
        m12316a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0788f c0788f = this.f14892d;
        boolean z = c0788f != null && c0788f.mo562a();
        if (z && this.f14890b == null) {
            this.f14890b = C0738b.m278a(this.f14892d);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14891c = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14889a = (C1248m) map.get(C1169h.p.f3222a);
        }
        m12316a(context);
        this.f14892d.mo561a(new InterfaceC0773c() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                MyOfferATRewardedVideoAdapter myOfferATRewardedVideoAdapter = MyOfferATRewardedVideoAdapter.this;
                myOfferATRewardedVideoAdapter.f14890b = C0738b.m278a(myOfferATRewardedVideoAdapter.f14892d);
                if (MyOfferATRewardedVideoAdapter.this.mLoadListener != null) {
                    MyOfferATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (MyOfferATRewardedVideoAdapter.this.mLoadListener != null) {
                    MyOfferATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        int iM4068g = C1341e.m4068g(activity);
        if (isAdReady()) {
            HashMap map = new HashMap(1);
            map.put(AbstractC0785c.f994h, this.f14889a.f4323d);
            map.put("extra_scenario", this.mScenario);
            map.put(AbstractC0785c.f996j, Integer.valueOf(iM4068g));
            this.f14892d.m616a(new InterfaceC0780j() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.2
                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdClick(C0779i c0779i) {
                    C1243h trackingInfo = MyOfferATRewardedVideoAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.m3019B(c0779i.f979a);
                        trackingInfo.m3021C(c0779i.f980b);
                    }
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdClosed() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdShow(C0779i c0779i) {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onDeeplinkCallback(boolean z) {
                }

                @Override // com.anythink.basead.p021e.InterfaceC0780j
                public final void onRewarded() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onReward();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onShowFailed(C0747e c0747e) {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(c0747e.m307a(), c0747e.m308b());
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0780j
                public final void onVideoAdPlayEnd() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0780j
                public final void onVideoAdPlayStart() {
                }
            });
            this.f14892d.mo560a(activity, map);
        }
    }
}
