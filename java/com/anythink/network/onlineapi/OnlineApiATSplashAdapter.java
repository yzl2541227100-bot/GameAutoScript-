package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p016d.C0768g;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OnlineApiATSplashAdapter extends CustomSplashAdapter {

    /* JADX INFO: renamed from: a */
    public C0768g f14932a;

    /* JADX INFO: renamed from: b */
    public C1248m f14933b;

    /* JADX INFO: renamed from: c */
    public String f14934c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f14935d;

    /* JADX INFO: renamed from: com.anythink.network.onlineapi.OnlineApiATSplashAdapter$2 */
    public class C24042 implements InterfaceC0771a {
        public C24042() {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClick(C0779i c0779i) {
            C1243h trackingInfo = OnlineApiATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.m3019B(c0779i.f979a);
                trackingInfo.m3021C(c0779i.f980b);
            }
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClosed() {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdShow(C0779i c0779i) {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onDeeplinkCallback(boolean z) {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z);
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onShowFailed(C0747e c0747e) {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, c0747e.m307a(), c0747e.m308b()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12413a(Context context, Map<String, Object> map) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        this.f14934c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i2 = 5;
        int i3 = 1;
        int i4 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        if (map.containsKey(C1485b.f7175dk) && (obj2 = map.get(C1485b.f7175dk)) != null) {
            i2 = Integer.parseInt(obj2.toString()) * 1000;
        }
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (i = Integer.parseInt(obj.toString())) != 0) {
            i3 = i == 1 ? 0 : i;
        }
        this.f14933b = (C1248m) map.get(C1169h.p.f3222a);
        C0768g c0768g = new C0768g(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, this.f14933b);
        this.f14932a = c0768g;
        c0768g.m400a(new C0760c.a().m445d(i4).m446e(i2).m447f(i3).m441a());
        this.f14932a.m401a(new C24042());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0768g c0768g = this.f14932a;
        if (c0768g != null) {
            c0768g.mo319b();
            this.f14932a = null;
        }
        this.f14933b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14935d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14934c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0768g c0768g = this.f14932a;
        boolean z = c0768g != null && c0768g.m407c();
        if (z && this.f14935d == null) {
            this.f14935d = C0738b.m277a(this.f14932a);
        }
        return z;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        this.f14934c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i2 = 5;
        int i3 = 1;
        int i4 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        if (map.containsKey(C1485b.f7175dk) && (obj2 = map.get(C1485b.f7175dk)) != null) {
            i2 = Integer.parseInt(obj2.toString()) * 1000;
        }
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (i = Integer.parseInt(obj.toString())) != 0) {
            i3 = i == 1 ? 0 : i;
        }
        this.f14933b = (C1248m) map.get(C1169h.p.f3222a);
        C0768g c0768g = new C0768g(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, this.f14933b);
        this.f14932a = c0768g;
        c0768g.m400a(new C0760c.a().m445d(i4).m446e(i2).m447f(i3).m441a());
        this.f14932a.m401a(new C24042());
        this.f14932a.m402a(new InterfaceC0773c() { // from class: com.anythink.network.onlineapi.OnlineApiATSplashAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                OnlineApiATSplashAdapter onlineApiATSplashAdapter = OnlineApiATSplashAdapter.this;
                onlineApiATSplashAdapter.f14935d = C0738b.m277a(onlineApiATSplashAdapter.f14932a);
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f14932a != null) {
            if (isCustomSkipView()) {
                this.f14932a.m471a();
            }
            this.f14932a.m472a(viewGroup);
        }
    }
}
