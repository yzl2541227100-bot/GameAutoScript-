package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p016d.C0767f;
import com.anythink.basead.p021e.AbstractC0776f;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AdxATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14852a;

    /* JADX INFO: renamed from: b */
    public C0767f f14853b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f14854c;

    /* JADX INFO: renamed from: a */
    private void m12237a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        int i = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int i2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        this.f14852a = (C1248m) map.get(C1169h.p.f3222a);
        C0767f c0767f = new C0767f(context, AbstractC0756b.b.ADX_OFFER_REQUEST_TYPE, this.f14852a);
        this.f14853b = c0767f;
        c0767f.m400a(new C0760c.a().m439a(i).m442b(i2).m441a());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0767f c0767f = this.f14853b;
        if (c0767f != null) {
            c0767f.mo319b();
            this.f14853b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        C0767f c0767f = this.f14853b;
        if (c0767f != null) {
            return c0767f.m411g();
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, ((C1248m) map.get(C1169h.p.f3222a)).f4321b);
        adxBidRequestInfo.fillAdAcceptType();
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14854c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        C1248m c1248m = this.f14852a;
        return c1248m != null ? c1248m.f4321b : "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12237a(context, map);
        C0767f c0767f = this.f14853b;
        if (c0767f == null || c0767f.m407c()) {
            return true;
        }
        this.f14853b.m408d();
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0767f c0767f = this.f14853b;
        boolean z = c0767f != null && c0767f.m407c();
        if (z && this.f14854c == null) {
            this.f14854c = C0738b.m277a(this.f14853b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12237a(context, map);
        this.f14853b.m402a(new InterfaceC0773c() { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.2
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                AdxATRewardedVideoAdapter adxATRewardedVideoAdapter = AdxATRewardedVideoAdapter.this;
                adxATRewardedVideoAdapter.f14854c = C0738b.m277a(adxATRewardedVideoAdapter.f14853b);
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        int iM4068g = C1341e.m4068g(activity);
        HashMap map = new HashMap(1);
        map.put("extra_scenario", this.mScenario);
        map.put(AbstractC0785c.f996j, Integer.valueOf(iM4068g));
        C0767f c0767f = this.f14853b;
        c0767f.m401a(new AbstractC0776f(c0767f.m410f(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.1
            @Override // com.anythink.basead.p021e.AbstractC0776f, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClick(C0779i c0779i) {
                super.onAdClick(c0779i);
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.p021e.AbstractC0776f, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdShow(C0779i c0779i) {
                super.onAdShow(c0779i);
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onDeeplinkCallback(boolean z) {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onRewarded() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onShowFailed(C0747e c0747e) {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(c0747e.m307a(), c0747e.m308b());
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayEnd() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayStart() {
            }
        });
        C0767f c0767f2 = this.f14853b;
        if (c0767f2 != null) {
            c0767f2.m468a(activity, map);
        }
    }
}
