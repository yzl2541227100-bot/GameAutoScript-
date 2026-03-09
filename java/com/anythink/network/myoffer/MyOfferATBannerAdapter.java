package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p022f.C0784b;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.C1373r;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1344h;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferATBannerAdapter extends CustomBannerAdapter {

    /* JADX INFO: renamed from: a */
    public String f14870a;

    /* JADX INFO: renamed from: b */
    public C1248m f14871b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f14872c;

    /* JADX INFO: renamed from: d */
    private C0784b f14873d;

    /* JADX INFO: renamed from: e */
    private View f14874e;

    /* JADX INFO: renamed from: f */
    private boolean f14875f = false;

    /* JADX INFO: renamed from: a */
    private void m12284a(Context context) {
        C0784b c0784b = new C0784b(context, this.f14871b, this.f14870a, this.f14875f);
        this.f14873d = c0784b;
        c0784b.m579a(new InterfaceC0771a() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.2
            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClick(C0779i c0779i) {
                C1243h trackingInfo = MyOfferATBannerAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.m3019B(c0779i.f979a);
                    trackingInfo.m3021C(c0779i.f980b);
                }
                if (MyOfferATBannerAdapter.this.mImpressionEventListener != null) {
                    MyOfferATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                if (MyOfferATBannerAdapter.this.mImpressionEventListener != null) {
                    MyOfferATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdShow(C0779i c0779i) {
                if (MyOfferATBannerAdapter.this.mImpressionEventListener != null) {
                    MyOfferATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onDeeplinkCallback(boolean z) {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onShowFailed(C0747e c0747e) {
            }
        });
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f14874e = null;
        C0784b c0784b = this.f14873d;
        if (c0784b != null) {
            c0784b.m579a((InterfaceC0771a) null);
            this.f14873d.mo581c();
            this.f14873d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        C0784b c0784b;
        if (this.f14874e == null && (c0784b = this.f14873d) != null && c0784b.mo562a()) {
            this.f14874e = this.f14873d.m580b();
            if (this.f14872c == null) {
                this.f14872c = C0738b.m278a(this.f14873d);
            }
        }
        return this.f14874e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14872c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14870a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return C1344h.m4131a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14870a = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14871b = (C1248m) map.get(C1169h.p.f3222a);
        }
        if (map.containsKey(C1373r.f5468b)) {
            this.f14875f = ((Boolean) map.get(C1373r.f5468b)).booleanValue();
        }
        m12284a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14870a = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14871b = (C1248m) map.get(C1169h.p.f3222a);
        }
        m12284a(context);
        this.f14873d.mo561a(new InterfaceC0773c() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                MyOfferATBannerAdapter myOfferATBannerAdapter = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter.f14874e = myOfferATBannerAdapter.f14873d.m580b();
                MyOfferATBannerAdapter myOfferATBannerAdapter2 = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter2.f14872c = C0738b.m278a(myOfferATBannerAdapter2.f14873d);
                if (MyOfferATBannerAdapter.this.mLoadListener != null) {
                    if (MyOfferATBannerAdapter.this.f14874e != null) {
                        MyOfferATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        MyOfferATBannerAdapter.this.mLoadListener.onAdLoadError("", "MyOffer bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (MyOfferATBannerAdapter.this.mLoadListener != null) {
                    MyOfferATBannerAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }
}
