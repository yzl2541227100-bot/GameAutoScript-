package com.anythink.network.myoffer;

import android.content.Context;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p022f.C0787e;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.C1373r;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferATAdapter extends CustomNativeAdapter {

    /* JADX INFO: renamed from: a */
    public C0787e f14864a;

    /* JADX INFO: renamed from: b */
    public C1248m f14865b;

    /* JADX INFO: renamed from: c */
    private String f14866c = "";

    /* JADX INFO: renamed from: d */
    private boolean f14867d = false;

    /* JADX INFO: renamed from: a */
    private void m12278a(Context context) {
        this.f14864a = new C0787e(context, this.f14865b, this.f14866c, this.f14867d);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        C0787e c0787e = this.f14864a;
        if (c0787e != null) {
            c0787e.m602a((InterfaceC0771a) null);
            this.f14864a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        C0787e c0787e = this.f14864a;
        if (c0787e == null || !c0787e.mo562a()) {
            return null;
        }
        return new MyOfferATNativeAd(context, this.f14864a);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f14866c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return C1344h.m4131a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14866c = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14865b = (C1248m) map.get(C1169h.p.f3222a);
        }
        if (map.containsKey(C1373r.f5468b)) {
            this.f14867d = ((Boolean) map.get(C1373r.f5468b)).booleanValue();
        }
        this.f14864a = new C0787e(context, this.f14865b, this.f14866c, this.f14867d);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f14866c = map.get("my_oid").toString();
        }
        if (map.containsKey(C1169h.p.f3222a)) {
            this.f14865b = (C1248m) map.get(C1169h.p.f3222a);
        }
        this.f14864a = new C0787e(context, this.f14865b, this.f14866c, this.f14867d);
        final Context applicationContext = context.getApplicationContext();
        this.f14864a.mo561a(new InterfaceC0773c() { // from class: com.anythink.network.myoffer.MyOfferATAdapter.1
            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                if (MyOfferATAdapter.this.mLoadListener != null) {
                    MyOfferATAdapter.this.mLoadListener.onAdCacheLoaded(new MyOfferATNativeAd(applicationContext, MyOfferATAdapter.this.f14864a));
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                if (MyOfferATAdapter.this.mLoadListener != null) {
                    MyOfferATAdapter.this.mLoadListener.onAdLoadError(c0747e.m307a(), c0747e.m308b());
                }
            }
        });
    }
}
