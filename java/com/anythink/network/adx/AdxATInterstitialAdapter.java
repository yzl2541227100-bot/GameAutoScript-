package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p016d.C0765d;
import com.anythink.basead.p021e.AbstractC0776f;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AdxATInterstitialAdapter extends CustomInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14838a;

    /* JADX INFO: renamed from: b */
    public C0765d f14839b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f14840c;

    /* JADX INFO: renamed from: a */
    private void m12216a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = (!map.containsKey("v_m") || (obj3 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj3.toString());
        int i2 = (!map.containsKey("s_c_t") || (obj2 = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj2.toString());
        this.f14838a = (C1248m) map.get(C1169h.p.f3222a);
        this.f14839b = new C0765d(context, AbstractC0756b.b.ADX_OFFER_REQUEST_TYPE, this.f14838a);
        this.f14839b.m400a(new C0760c.a().m440a((!map.containsKey("inter_type") || (obj = map.get("inter_type")) == null) ? "1" : obj.toString()).m439a(i).m442b(i2).m441a());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0765d c0765d = this.f14839b;
        if (c0765d != null) {
            c0765d.mo319b();
            this.f14839b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        C0765d c0765d = this.f14839b;
        if (c0765d != null) {
            return c0765d.m411g();
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, c1248m != null ? c1248m.f4321b : "");
        adxBidRequestInfo.fillInterstitial(map);
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14840c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        C1248m c1248m = this.f14838a;
        return c1248m != null ? c1248m.f4321b : "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12216a(context, map);
        C0765d c0765d = this.f14839b;
        if (c0765d == null || c0765d.m407c()) {
            return true;
        }
        this.f14839b.m408d();
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0765d c0765d = this.f14839b;
        boolean z = c0765d != null && c0765d.m407c();
        if (z && this.f14840c == null) {
            this.f14840c = C0738b.m277a(this.f14839b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12216a(context, map);
        this.f14839b.m402a(new InterfaceC0773c() { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.2
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                AdxATInterstitialAdapter adxATInterstitialAdapter = AdxATInterstitialAdapter.this;
                adxATInterstitialAdapter.f14840c = C0738b.m277a(adxATInterstitialAdapter.f14839b);
                if (AdxATInterstitialAdapter.this.mLoadListener != null) {
                    AdxATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (AdxATInterstitialAdapter.this.mLoadListener != null) {
                    AdxATInterstitialAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (AdxATInterstitialAdapter.this.mLoadListener != null) {
                    AdxATInterstitialAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        int iM4068g = C1341e.m4068g(activity);
        HashMap map = new HashMap(1);
        map.put("extra_scenario", this.mScenario);
        map.put(AbstractC0785c.f996j, Integer.valueOf(iM4068g));
        C0765d c0765d = this.f14839b;
        c0765d.m401a(new AbstractC0776f(c0765d.m410f(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.1
            @Override // com.anythink.basead.p021e.AbstractC0776f, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClick(C0779i c0779i) {
                super.onAdClick(c0779i);
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.p021e.AbstractC0776f, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdShow(C0779i c0779i) {
                super.onAdShow(c0779i);
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onDeeplinkCallback(boolean z) {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onRewarded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onShowFailed(C0747e c0747e) {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoError(c0747e.m307a(), c0747e.m308b());
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayEnd() {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayStart() {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoStart();
                }
            }
        });
        C0765d c0765d2 = this.f14839b;
        if (c0765d2 != null) {
            c0765d2.m457a(activity, map);
        }
    }
}
