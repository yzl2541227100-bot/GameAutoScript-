package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p022f.C0789g;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferATSplashAdapter extends CustomSplashAdapter {

    /* JADX INFO: renamed from: a */
    public String f14896a;

    /* JADX INFO: renamed from: b */
    public C0789g f14897b;

    /* JADX INFO: renamed from: c */
    public C1248m f14898c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f14899d;

    /* JADX INFO: renamed from: com.anythink.network.myoffer.MyOfferATSplashAdapter$2 */
    public class C23942 implements InterfaceC0771a {
        public C23942() {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClick(C0779i c0779i) {
            C1243h trackingInfo = MyOfferATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.m3019B(c0779i.f979a);
                trackingInfo.m3021C(c0779i.f980b);
            }
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClosed() {
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdShow(C0779i c0779i) {
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onDeeplinkCallback(boolean z) {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onShowFailed(C0747e c0747e) {
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, c0747e.m307a(), c0747e.m308b()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12334a(Context context) {
        C0789g c0789g = new C0789g(context, this.f14898c, this.f14896a);
        this.f14897b = c0789g;
        c0789g.m618a(new C23942());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0789g c0789g = this.f14897b;
        if (c0789g != null) {
            c0789g.m620f();
            this.f14897b = null;
        }
        this.f14898c = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14899d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14896a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return C1344h.m4131a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0789g c0789g = this.f14897b;
        boolean z = c0789g != null && c0789g.mo562a();
        if (z && this.f14899d == null) {
            this.f14899d = C0738b.m278a(this.f14897b);
        }
        return z;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14896a = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14898c = (C1248m) map.get(C1169h.p.f3222a);
        }
        C0789g c0789g = new C0789g(context, this.f14898c, this.f14896a);
        this.f14897b = c0789g;
        c0789g.m618a(new C23942());
        this.f14897b.mo561a(new InterfaceC0773c() { // from class: com.anythink.network.myoffer.MyOfferATSplashAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                if (MyOfferATSplashAdapter.this.mLoadListener != null) {
                    MyOfferATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (MyOfferATSplashAdapter.this.mLoadListener != null) {
                    MyOfferATSplashAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f14897b != null) {
            if (isCustomSkipView()) {
                this.f14897b.m619b();
            }
            this.f14897b.m617a(viewGroup);
        }
    }
}
