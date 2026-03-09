package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0753a;
import com.anythink.basead.p016d.C0760c;
import com.anythink.basead.p021e.AbstractC0775e;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AdxATBannerAdapter extends CustomBannerAdapter {

    /* JADX INFO: renamed from: a */
    public C1248m f14828a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f14829b;

    /* JADX INFO: renamed from: c */
    private C0753a f14830c;

    /* JADX INFO: renamed from: d */
    private View f14831d;

    /* JADX INFO: renamed from: a */
    private void m12190a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        Object obj2;
        int i = 0;
        int i2 = (!map.containsKey("close_button") || (obj2 = map.get("close_button")) == null) ? 0 : Integer.parseInt(obj2.toString());
        String string = (!map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) || (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) == null) ? AbstractC1249n.f4336a : obj.toString();
        if (map2 != null && map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
            try {
                i = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        this.f14828a = c1248m;
        C0753a c0753a = new C0753a(context, AbstractC0756b.b.ADX_OFFER_REQUEST_TYPE, c1248m);
        this.f14830c = c0753a;
        c0753a.m400a(new C0760c.a().m444c(i2).m443b(string).m448g(i).m441a());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f14831d = null;
        C0753a c0753a = this.f14830c;
        if (c0753a != null) {
            c0753a.m401a((InterfaceC0771a) null);
            this.f14830c.mo319b();
            this.f14830c = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        C0753a c0753a = this.f14830c;
        if (c0753a != null && this.f14829b == null) {
            this.f14829b = C0738b.m277a(c0753a);
        }
        return this.f14831d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, c1248m != null ? c1248m.f4321b : "");
        adxBidRequestInfo.fillBannerData(map);
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f14829b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        C1248m c1248m = this.f14828a;
        return c1248m != null ? c1248m.f4321b : "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12190a(context, map, map2);
        C0753a c0753a = this.f14830c;
        if (c0753a == null) {
            return true;
        }
        c0753a.m401a(new AbstractC0775e(c0753a.m410f(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.2
            @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClick(C0779i c0779i) {
                super.onAdClick(c0779i);
                if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                    AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdClosed() {
                if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                    AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
                }
            }

            @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
            public final void onAdShow(C0779i c0779i) {
                super.onAdShow(c0779i);
                if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                    AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onDeeplinkCallback(boolean z) {
                if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                    AdxATBannerAdapter.this.mImpressionEventListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0771a
            public final void onShowFailed(C0747e c0747e) {
            }
        });
        this.f14830c.m399a(new AbstractC0756b.a() { // from class: com.anythink.network.adx.AdxATBannerAdapter.3
            @Override // com.anythink.basead.p016d.AbstractC0756b.a
            public final void onAdCacheLoaded() {
                AdxATBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.anythink.network.adx.AdxATBannerAdapter.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                        adxATBannerAdapter.f14831d = adxATBannerAdapter.f14830c.m318a();
                    }
                });
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12190a(context, map, map2);
        this.f14830c.m402a(new InterfaceC0773c() { // from class: com.anythink.network.adx.AdxATBannerAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.f14830c == null || AdxATBannerAdapter.this.mLoadListener == null) {
                    return;
                }
                AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                adxATBannerAdapter.f14829b = C0738b.m277a(adxATBannerAdapter.f14830c);
                AdxATBannerAdapter.this.f14830c.m401a(new AbstractC0775e(AdxATBannerAdapter.this.f14830c.m410f(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.1.1
                    @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
                    public final void onAdClick(C0779i c0779i) {
                        super.onAdClick(c0779i);
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.p021e.InterfaceC0771a
                    public final void onAdClosed() {
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.p021e.AbstractC0775e, com.anythink.basead.p021e.InterfaceC0771a
                    public final void onAdShow(C0779i c0779i) {
                        super.onAdShow(c0779i);
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.p021e.InterfaceC0771a
                    public final void onDeeplinkCallback(boolean z) {
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onDeeplinkCallback(z);
                        }
                    }

                    @Override // com.anythink.basead.p021e.InterfaceC0771a
                    public final void onShowFailed(C0747e c0747e) {
                    }
                });
                AdxATBannerAdapter adxATBannerAdapter2 = AdxATBannerAdapter.this;
                adxATBannerAdapter2.f14831d = adxATBannerAdapter2.f14830c.m318a();
                if (AdxATBannerAdapter.this.f14831d != null) {
                    AdxATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                } else {
                    AdxATBannerAdapter.this.mLoadListener.onAdLoadError("", "Adx bannerView = null");
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
                if (AdxATBannerAdapter.this.mLoadListener != null) {
                    AdxATBannerAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (AdxATBannerAdapter.this.mLoadListener != null) {
                    AdxATBannerAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }
}
