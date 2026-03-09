package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0753a;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OnlineApiATBannerAdapter extends CustomBannerAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14909a;

    /* JADX INFO: renamed from: b */
    public String f14910b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f14911c;

    /* JADX INFO: renamed from: d */
    private C0753a f14912d;

    /* JADX INFO: renamed from: e */
    private View f14913e;

    /* JADX INFO: renamed from: com.anythink.network.onlineapi.OnlineApiATBannerAdapter$2 */
    public class C23972 implements InterfaceC0771a {
        public C23972() {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClick(C0779i c0779i) {
            C1243h trackingInfo = OnlineApiATBannerAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.m3019B(c0779i.f979a);
                trackingInfo.m3021C(c0779i.f980b);
            }
            if (OnlineApiATBannerAdapter.this.mImpressionEventListener != null) {
                OnlineApiATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClosed() {
            if (OnlineApiATBannerAdapter.this.mImpressionEventListener != null) {
                OnlineApiATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdShow(C0779i c0779i) {
            if (OnlineApiATBannerAdapter.this.mImpressionEventListener != null) {
                OnlineApiATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onDeeplinkCallback(boolean z) {
            if (OnlineApiATBannerAdapter.this.mImpressionEventListener != null) {
                OnlineApiATBannerAdapter.this.mImpressionEventListener.onDeeplinkCallback(z);
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onShowFailed(C0747e c0747e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12353a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f14910b = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 0;
        if (map.containsKey("close_button") && (obj2 = map.get("close_button")) != null) {
            i = Integer.parseInt(obj2.toString());
        }
        String string = (!map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) || (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) == null) ? AbstractC1249n.f4336a : obj.toString();
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        this.f14909a = c1248m;
        C0753a c0753a = new C0753a(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, c1248m);
        this.f14912d = c0753a;
        c0753a.m400a(new C0760c.a().m444c(i).m443b(string).m441a());
        this.f14912d.m401a(new C23972());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f14913e = null;
        C0753a c0753a = this.f14912d;
        if (c0753a != null) {
            c0753a.m401a((InterfaceC0771a) null);
            this.f14912d.mo319b();
            this.f14912d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        C0753a c0753a;
        if (this.f14913e == null && (c0753a = this.f14912d) != null && c0753a.m407c()) {
            this.f14913e = this.f14912d.m318a();
        }
        if (this.f14911c == null) {
            this.f14911c = C0738b.m277a(this.f14912d);
        }
        return this.f14913e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14911c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14910b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        Object obj2;
        this.f14910b = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 0;
        if (map.containsKey("close_button") && (obj2 = map.get("close_button")) != null) {
            i = Integer.parseInt(obj2.toString());
        }
        String string = (!map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) || (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) == null) ? AbstractC1249n.f4336a : obj.toString();
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        this.f14909a = c1248m;
        C0753a c0753a = new C0753a(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, c1248m);
        this.f14912d = c0753a;
        c0753a.m400a(new C0760c.a().m444c(i).m443b(string).m441a());
        this.f14912d.m401a(new C23972());
        this.f14912d.m402a(new InterfaceC0773c() { // from class: com.anythink.network.onlineapi.OnlineApiATBannerAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                OnlineApiATBannerAdapter onlineApiATBannerAdapter = OnlineApiATBannerAdapter.this;
                onlineApiATBannerAdapter.f14913e = onlineApiATBannerAdapter.f14912d.m318a();
                if (OnlineApiATBannerAdapter.this.mLoadListener != null) {
                    if (OnlineApiATBannerAdapter.this.f14913e != null) {
                        OnlineApiATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        OnlineApiATBannerAdapter.this.mLoadListener.onAdLoadError("", "Online bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (OnlineApiATBannerAdapter.this.mLoadListener != null) {
                    OnlineApiATBannerAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (OnlineApiATBannerAdapter.this.mLoadListener != null) {
                    OnlineApiATBannerAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }
}
