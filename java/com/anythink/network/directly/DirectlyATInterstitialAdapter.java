package com.anythink.network.directly;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.p016d.C0765d;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.network.adx.AdxATInterstitialAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DirectlyATInterstitialAdapter extends AdxATInterstitialAdapter {

    /* JADX INFO: renamed from: d */
    private int f14863d = 0;

    public void fixDirectlyInterstitial() {
        AbstractC1247l abstractC1247lM410f;
        C0765d c0765d = this.f14839b;
        if (c0765d == null || (abstractC1247lM410f = c0765d.m410f()) == null) {
            return;
        }
        abstractC1247lM410f.m3197g(this.f14863d == 0 ? 2 : 1);
        AbstractC1217aj abstractC1217aj = (AbstractC1217aj) abstractC1247lM410f;
        if (abstractC1217aj.m2490ai() == 5 && this.f14863d == 0) {
            abstractC1217aj.m2498q(3);
        }
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "Directly";
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        if (map.containsKey("unit_type") && (obj = map.get("unit_type")) != null) {
            this.f14863d = Integer.parseInt(obj.toString());
        }
        super.loadCustomNetworkAd(context, map, map2);
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        fixDirectlyInterstitial();
        super.show(activity);
    }
}
