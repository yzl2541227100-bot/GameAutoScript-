package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p016d.C0765d;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p021e.InterfaceC0780j;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OnlineApiATInterstitialAdapter extends CustomInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14916a;

    /* JADX INFO: renamed from: b */
    public C0765d f14917b;

    /* JADX INFO: renamed from: c */
    public String f14918c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f14919d;

    /* JADX INFO: renamed from: a */
    private void m12371a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f14918c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 0;
        int i2 = -1;
        if (map.containsKey("v_m") && (obj2 = map.get("v_m")) != null) {
            i = Integer.parseInt(obj2.toString());
        }
        if (map.containsKey("s_c_t") && (obj = map.get("s_c_t")) != null) {
            i2 = Integer.parseInt(obj.toString());
        }
        this.f14916a = (C1248m) map.get(C1169h.p.f3222a);
        C0765d c0765d = new C0765d(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, this.f14916a);
        this.f14917b = c0765d;
        c0765d.m400a(new C0760c.a().m439a(i).m442b(i2).m441a());
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_type");
        if (TextUtils.isEmpty(stringFromMap)) {
            return;
        }
        this.f14917b.m405a(stringFromMap);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0765d c0765d = this.f14917b;
        if (c0765d != null) {
            c0765d.mo319b();
            this.f14917b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14919d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14918c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12371a(context, map);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0765d c0765d = this.f14917b;
        boolean z = c0765d != null && c0765d.m407c();
        if (z && this.f14919d == null) {
            this.f14919d = C0738b.m277a(this.f14917b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12371a(context, map);
        this.f14917b.m402a(new InterfaceC0773c() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.2
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                OnlineApiATInterstitialAdapter onlineApiATInterstitialAdapter = OnlineApiATInterstitialAdapter.this;
                onlineApiATInterstitialAdapter.f14919d = C0738b.m277a(onlineApiATInterstitialAdapter.f14917b);
                if (OnlineApiATInterstitialAdapter.this.mLoadListener != null) {
                    OnlineApiATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (OnlineApiATInterstitialAdapter.this.mLoadListener != null) {
                    OnlineApiATInterstitialAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (OnlineApiATInterstitialAdapter.this.mLoadListener != null) {
                    OnlineApiATInterstitialAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
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
        this.f14917b.m401a(new InterfaceC0780j() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClick(C0779i c0779i) {
                C1243h trackingInfo = OnlineApiATInterstitialAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.m3019B(c0779i.f979a);
                    trackingInfo.m3021C(c0779i.f980b);
                }
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdShow(C0779i c0779i) {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onDeeplinkCallback(boolean z) {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onRewarded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onShowFailed(C0747e c0747e) {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoError(c0747e.m307a(), c0747e.m308b());
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayEnd() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayStart() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoStart();
                }
            }
        });
        C0765d c0765d = this.f14917b;
        if (c0765d != null) {
            c0765d.m457a(activity, map);
        }
    }
}
