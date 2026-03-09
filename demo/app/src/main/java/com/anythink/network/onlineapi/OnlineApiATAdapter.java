package com.anythink.network.onlineapi;

import android.content.Context;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p016d.C0766e;
import com.anythink.basead.p016d.C0769h;
import com.anythink.basead.p021e.InterfaceC0774d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OnlineApiATAdapter extends CustomNativeAdapter {

    /* JADX INFO: renamed from: a */
    public C0766e f14902a;

    /* JADX INFO: renamed from: b */
    public C1248m f14903b;

    /* JADX INFO: renamed from: c */
    public String f14904c;

    /* JADX INFO: renamed from: a */
    private void m12347a(Context context, Map<String, Object> map) {
        this.f14904c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        this.f14903b = c1248m;
        this.f14902a = new C0766e(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, c1248m, false);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        if (this.f14902a != null) {
            this.f14902a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14904c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i2;
        this.f14904c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        C1248m c1248m = (C1248m) map.get(C1169h.p.f3222a);
        this.f14903b = c1248m;
        this.f14902a = new C0766e(context, AbstractC0756b.b.ONLINE_API_OFFER_REQUEST_TYPE, c1248m, false);
        int iMin = -1;
        if (map2 != null) {
            try {
                i = Integer.parseInt(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
            } catch (Throwable unused) {
                i = -1;
            }
            try {
                i2 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
                iMin = i;
            } catch (Throwable unused2) {
                iMin = i;
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        final int i3 = context.getResources().getDisplayMetrics().widthPixels;
        final int i4 = context.getResources().getDisplayMetrics().heightPixels;
        if (iMin <= 0) {
            iMin = Math.min(i3, i4);
        }
        if (i2 <= 0) {
            i2 = (iMin * 3) / 4;
        }
        if (iMin <= i3) {
            i3 = iMin;
        }
        if (i2 <= i4) {
            i4 = i2;
        }
        final Context applicationContext = context.getApplicationContext();
        this.f14902a.m467a(new InterfaceC0774d() { // from class: com.anythink.network.onlineapi.OnlineApiATAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0774d
            public final void onNativeAdLoadError(C0747e c0747e) {
                if (OnlineApiATAdapter.this.mLoadListener != null) {
                    OnlineApiATAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0774d
            public final void onNativeAdLoaded(C0769h... c0769hArr) {
                OnlineApiATNativeAd[] onlineApiATNativeAdArr = new OnlineApiATNativeAd[c0769hArr.length];
                for (int i5 = 0; i5 < c0769hArr.length; i5++) {
                    c0769hArr[i5].m500a(i3, i4);
                    onlineApiATNativeAdArr[i5] = new OnlineApiATNativeAd(applicationContext, c0769hArr[i5]);
                }
                if (OnlineApiATAdapter.this.mLoadListener != null) {
                    OnlineApiATAdapter.this.mLoadListener.onAdCacheLoaded(onlineApiATNativeAdArr);
                }
            }
        });
    }
}
