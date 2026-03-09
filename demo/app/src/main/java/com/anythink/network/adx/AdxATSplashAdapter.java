package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p016d.C0768g;
import com.anythink.basead.p021e.AbstractC0775e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AdxATSplashAdapter extends CustomSplashAdapter {

    /* JADX INFO: renamed from: a */
    public C0768g f14857a;

    /* JADX INFO: renamed from: b */
    public C1248m f14858b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f14859c;

    /* JADX INFO: renamed from: a */
    private void m12258a(Context context, Map<String, Object> map) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        int i2 = 1;
        int i3 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int i4 = (!map.containsKey(C1485b.f7175dk) || (obj2 = map.get(C1485b.f7175dk)) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (i = Integer.parseInt(obj.toString())) != 0) {
            i2 = i == 1 ? 0 : i;
        }
        this.f14858b = (C1248m) map.get(C1169h.p.f3222a);
        C0768g c0768g = new C0768g(context, AbstractC0756b.b.ADX_OFFER_REQUEST_TYPE, this.f14858b);
        this.f14857a = c0768g;
        c0768g.m400a(new C0760c.a().m445d(i3).m446e(i4).m447f(i2).m441a());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m12272o(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0768g c0768g = this.f14857a;
        if (c0768g != null) {
            c0768g.mo319b();
            this.f14857a = null;
        }
        this.f14858b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        C0768g c0768g = this.f14857a;
        if (c0768g != null) {
            return c0768g.m411g();
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, c1248m != null ? c1248m.f4321b : "");
        adxBidRequestInfo.fillSplashData();
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14859c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        C1248m c1248m = this.f14858b;
        return c1248m != null ? c1248m.f4321b : "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12258a(context, map);
        C0768g c0768g = this.f14857a;
        if (c0768g == null || c0768g.m407c()) {
            return true;
        }
        this.f14857a.m408d();
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        C0768g c0768g = this.f14857a;
        boolean z = c0768g != null && c0768g.m407c();
        if (z && this.f14859c == null) {
            this.f14859c = C0738b.m277a(this.f14857a);
        }
        return z;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        C0768g c0768g = this.f14857a;
        return c0768g != null && c0768g.m473h();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12258a(context, map);
        this.f14857a.m402a(new InterfaceC0773c() { // from class: com.anythink.network.adx.AdxATSplashAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                AdxATSplashAdapter adxATSplashAdapter = AdxATSplashAdapter.this;
                adxATSplashAdapter.f14859c = C0738b.m277a(adxATSplashAdapter.f14857a);
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        C0768g c0768g = this.f14857a;
        if (c0768g != null) {
            c0768g.m401a(new AbstractC0775e(c0768g.m410f(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATSplashAdapter.2
                @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdClick(C0779i c0779i) {
                    super.onAdClick(c0779i);
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdClosed() {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                    }
                }

                @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
                public final void onAdShow(C0779i c0779i) {
                    super.onAdShow(c0779i);
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShow();
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onDeeplinkCallback(boolean z) {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z);
                    }
                }

                @Override // com.anythink.basead.p021e.InterfaceC0771a
                public final void onShowFailed(C0747e c0747e) {
                    AdxATSplashAdapter.m12272o(AdxATSplashAdapter.this);
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, c0747e.m307a(), c0747e.m308b()));
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                    }
                }
            });
            if (isCustomSkipView()) {
                this.f14857a.m471a();
            }
            this.f14857a.m472a(viewGroup);
        }
    }
}
