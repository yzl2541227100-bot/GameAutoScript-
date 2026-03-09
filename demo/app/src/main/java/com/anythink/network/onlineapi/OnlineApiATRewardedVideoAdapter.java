package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p016d.C0767f;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p021e.InterfaceC0780j;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OnlineApiATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14926a;

    /* JADX INFO: renamed from: b */
    public C0767f f14927b;

    /* JADX INFO: renamed from: c */
    public String f14928c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f14929d;

    /* JADX INFO: renamed from: a */
    private void m12392a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f14928c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 0;
        int i2 = -1;
        if (map.containsKey("v_m") && (obj2 = map.get("v_m")) != null) {
            i = Integer.parseInt(obj2.toString());
        }
        if (map.containsKey("s_c_t") && (obj = map.get("s_c_t")) != null) {
            i2 = Integer.parseInt(obj.toString());
        }
        this.f14926a = (C1248m) map.get(C1169h.p.f3222a);
        C0767f c0767f = new C0767f(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, this.f14926a);
        this.f14927b = c0767f;
        c0767f.m400a(new C0760c.a().m439a(i).m442b(i2).m441a());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0767f c0767f = this.f14927b;
        if (c0767f != null) {
            c0767f.mo319b();
            this.f14927b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14929d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14928c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12392a(context, map);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0767f c0767f = this.f14927b;
        boolean z = c0767f != null && c0767f.m407c();
        if (z && this.f14929d == null) {
            this.f14929d = C0738b.m277a(this.f14927b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12392a(context, map);
        this.f14927b.m402a(new InterfaceC0773c() { // from class: com.anythink.network.onlineapi.OnlineApiATRewardedVideoAdapter.2
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                OnlineApiATRewardedVideoAdapter onlineApiATRewardedVideoAdapter = OnlineApiATRewardedVideoAdapter.this;
                onlineApiATRewardedVideoAdapter.f14929d = C0738b.m277a(onlineApiATRewardedVideoAdapter.f14927b);
                if (OnlineApiATRewardedVideoAdapter.this.mLoadListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (OnlineApiATRewardedVideoAdapter.this.mLoadListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (OnlineApiATRewardedVideoAdapter.this.mLoadListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
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
        this.f14927b.m401a(new InterfaceC0780j() { // from class: com.anythink.network.onlineapi.OnlineApiATRewardedVideoAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClick(C0779i c0779i) {
                C1243h trackingInfo = OnlineApiATRewardedVideoAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.m3019B(c0779i.f979a);
                    trackingInfo.m3021C(c0779i.f980b);
                }
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdShow(C0779i c0779i) {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onDeeplinkCallback(boolean z) {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onRewarded() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onShowFailed(C0747e c0747e) {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(c0747e.m307a(), c0747e.m308b());
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayEnd() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0780j
            public final void onVideoAdPlayStart() {
            }
        });
        C0767f c0767f = this.f14927b;
        if (c0767f != null) {
            c0767f.m468a(activity, map);
        }
    }
}
