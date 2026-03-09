package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.C0738b;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0766e;
import com.anythink.basead.p016d.C0769h;
import com.anythink.basead.p021e.InterfaceC0774d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AdxATAdapter extends CustomNativeAdapter {

    /* JADX INFO: renamed from: a */
    public C0766e f14818a;

    /* JADX INFO: renamed from: b */
    public C1248m f14819b;

    /* JADX INFO: renamed from: c */
    public boolean f14820c;

    /* JADX INFO: renamed from: d */
    public boolean f14821d;

    /* JADX INFO: renamed from: e */
    public String f14822e;

    /* JADX INFO: renamed from: f */
    public int f14823f;

    /* JADX INFO: renamed from: g */
    public int f14824g;

    /* JADX INFO: renamed from: h */
    private boolean f14825h;

    /* JADX INFO: renamed from: a */
    private void m12182a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int intFromMap;
        this.f14825h = TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"));
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        this.f14819b = c1248m;
        this.f14818a = new C0766e(context, AbstractC0756b.b.ADX_OFFER_REQUEST_TYPE, c1248m, this.f14825h);
        this.f14820c = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, "close_button", "0"));
        this.f14821d = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, "v_m", "0"));
        this.f14822e = ATInitMediation.getStringFromMap(map, "video_autoplay", "1");
        int iMin = -1;
        if (map2 != null) {
            iMin = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_WIDTH);
            intFromMap = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_HEIGHT);
        } else {
            intFromMap = -1;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        if (iMin <= 0) {
            iMin = Math.min(i, i2);
        }
        if (intFromMap <= 0) {
            intFromMap = (iMin * 3) / 4;
        }
        if (iMin <= i) {
            i = iMin;
        }
        if (intFromMap <= i2) {
            i2 = intFromMap;
        }
        this.f14823f = i;
        this.f14824g = i2;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        if (this.f14818a != null) {
            this.f14818a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        C0766e c0766e = this.f14818a;
        if (c0766e == null || !c0766e.m407c()) {
            return null;
        }
        C0769h c0769hM466a = this.f14818a.m466a();
        c0769hM466a.m500a(this.f14823f, this.f14824g);
        c0769hM466a.m507a(this.f14821d);
        c0769hM466a.m506a(this.f14822e);
        AdxATNativeAd adxATNativeAd = new AdxATNativeAd(context.getApplicationContext(), c0769hM466a, this.f14825h, this.f14820c);
        adxATNativeAd.setNetworkInfoMap(C0738b.m279a(this.f14818a.m410f()));
        return adxATNativeAd;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, c1248m != null ? c1248m.f4321b : "");
        boolean zEquals = TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"));
        this.f14825h = zEquals;
        if (zEquals) {
            adxBidRequestInfo.fillAdAcceptType();
        }
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        C1248m c1248m = this.f14819b;
        return c1248m != null ? c1248m.f4321b : "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12182a(context, map, map2);
        C0766e c0766e = this.f14818a;
        if (c0766e == null || c0766e.m407c()) {
            return true;
        }
        this.f14818a.m408d();
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        m12182a(context, map, map2);
        this.f14818a.m467a(new InterfaceC0774d() { // from class: com.anythink.network.adx.AdxATAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0774d
            public final void onNativeAdLoadError(C0747e c0747e) {
                if (AdxATAdapter.this.mLoadListener != null) {
                    AdxATAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0774d
            public final void onNativeAdLoaded(C0769h... c0769hArr) {
                AdxATNativeAd[] adxATNativeAdArr = new AdxATNativeAd[c0769hArr.length];
                for (int i = 0; i < c0769hArr.length; i++) {
                    C0769h c0769h = c0769hArr[i];
                    AdxATAdapter adxATAdapter = AdxATAdapter.this;
                    c0769h.m500a(adxATAdapter.f14823f, adxATAdapter.f14824g);
                    c0769h.m507a(AdxATAdapter.this.f14821d);
                    c0769h.m506a(AdxATAdapter.this.f14822e);
                    adxATNativeAdArr[i] = new AdxATNativeAd(context.getApplicationContext(), c0769h, AdxATAdapter.this.f14825h, AdxATAdapter.this.f14820c);
                }
                if (AdxATAdapter.this.mLoadListener != null) {
                    AdxATAdapter.this.mLoadListener.onAdCacheLoaded(adxATNativeAdArr);
                }
            }
        });
    }
}
