package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p021e.InterfaceC0780j;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.basead.p022f.C0786d;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.C1373r;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferATInterstitialAdapter extends CustomInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14878a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f14879b;

    /* JADX INFO: renamed from: d */
    private C0786d f14881d;

    /* JADX INFO: renamed from: c */
    private String f14880c = "";

    /* JADX INFO: renamed from: e */
    private boolean f14882e = false;

    /* JADX INFO: renamed from: a */
    private void m12298a(Context context) {
        this.f14881d = new C0786d(context, this.f14878a, this.f14880c, this.f14882e);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0786d c0786d = this.f14881d;
        if (c0786d != null) {
            c0786d.m586a((InterfaceC0780j) null);
            this.f14881d = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14879b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14880c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return C1344h.m4131a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14880c = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14878a = (C1248m) map.get(C1169h.p.f3222a);
        }
        if (map.containsKey(C1373r.f5468b)) {
            this.f14882e = ((Boolean) map.get(C1373r.f5468b)).booleanValue();
        }
        m12298a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0786d c0786d = this.f14881d;
        boolean z = c0786d != null && c0786d.mo562a();
        if (z && this.f14879b == null) {
            this.f14879b = C0738b.m278a(this.f14881d);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14880c = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14878a = (C1248m) map.get(C1169h.p.f3222a);
        }
        m12298a(context);
        this.f14881d.mo561a(new InterfaceC0773c() { // from class: com.anythink.network.myoffer.MyOfferATInterstitialAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                MyOfferATInterstitialAdapter myOfferATInterstitialAdapter = MyOfferATInterstitialAdapter.this;
                myOfferATInterstitialAdapter.f14879b = C0738b.m278a(myOfferATInterstitialAdapter.f14881d);
                if (MyOfferATInterstitialAdapter.this.mLoadListener != null) {
                    MyOfferATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (MyOfferATInterstitialAdapter.this.mLoadListener != null) {
                    MyOfferATInterstitialAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            HashMap map = new HashMap(1);
            int iM4068g = C1341e.m4068g(activity);
            map.put(AbstractC0785c.f994h, this.f14878a.f4323d);
            map.put("extra_scenario", this.mScenario);
            map.put(AbstractC0785c.f996j, Integer.valueOf(iM4068g));
            this.f14881d.m586a(new InterfaceC0780j() { // from class: com.anythink.network.myoffer.MyOfferATInterstitialAdapter.2
                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdClick(C0779i c0779i) {
                    C1243h trackingInfo = MyOfferATInterstitialAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.m3019B(c0779i.f979a);
                        trackingInfo.m3021C(c0779i.f980b);
                    }
                    if (MyOfferATInterstitialAdapter.this.mImpressListener != null) {
                        MyOfferATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdClosed() {
                    if (MyOfferATInterstitialAdapter.this.mImpressListener != null) {
                        MyOfferATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdShow(C0779i c0779i) {
                    if (MyOfferATInterstitialAdapter.this.mImpressListener != null) {
                        MyOfferATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onDeeplinkCallback(boolean z) {
                }

                @Override // com.anythink.basead.p021e.InterfaceC0780j
                public final void onRewarded() {
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onShowFailed(C0747e c0747e) {
                    if (MyOfferATInterstitialAdapter.this.mImpressListener != null) {
                        MyOfferATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoError(c0747e.m307a(), c0747e.m308b());
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0780j
                public final void onVideoAdPlayEnd() {
                    if (MyOfferATInterstitialAdapter.this.mImpressListener != null) {
                        MyOfferATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoEnd();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0780j
                public final void onVideoAdPlayStart() {
                    if (MyOfferATInterstitialAdapter.this.mImpressListener != null) {
                        MyOfferATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoStart();
                    }
                }
            });
            this.f14881d.mo560a(activity, map);
        }
    }
}
