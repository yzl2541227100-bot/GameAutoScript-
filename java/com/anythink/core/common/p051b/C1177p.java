package com.anythink.core.common.p051b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATCustomLoadListenerExt;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p055f.p056a.C1207e;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1177p implements ATCustomLoadListenerExt {

    /* JADX INFO: renamed from: a */
    public ATCustomLoadListener f3432a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f3433b;

    /* JADX INFO: renamed from: c */
    public int f3434c;

    public C1177p(ATCustomLoadListener aTCustomLoadListener, Map<String, Object> map, int i) {
        this.f3434c = -1;
        this.f3432a = aTCustomLoadListener;
        this.f3433b = map;
        this.f3434c = i;
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdCacheLoaded(BaseAd... baseAdArr) {
        if (this.f3434c != 0) {
            ATCustomLoadListener aTCustomLoadListener = this.f3432a;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                return;
            }
            return;
        }
        if (baseAdArr.length <= 0) {
            ATCustomLoadListener aTCustomLoadListener2 = this.f3432a;
            if (aTCustomLoadListener2 != null) {
                aTCustomLoadListener2.onAdLoadError("10011", "load fail with no adObject");
                return;
            }
            return;
        }
        final BaseAd baseAd = baseAdArr[0];
        if (TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            this.f3432a.onAdCacheLoaded(new C1207e(baseAd, this.f3433b));
        } else {
            C1378b.m4482a(C1175n.m2059a().m2148f()).m4494a(new C1381e(2, baseAd.getMainImageUrl()), 0, 0, new C1378b.a() { // from class: com.anythink.core.common.b.p.1
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                    ATCustomLoadListener aTCustomLoadListener3 = C1177p.this.f3432a;
                    if (aTCustomLoadListener3 != null) {
                        aTCustomLoadListener3.onAdLoadError("10011", "load image fail:".concat(String.valueOf(str2)));
                    }
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    C1177p c1177p;
                    ATCustomLoadListener aTCustomLoadListener3;
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || (aTCustomLoadListener3 = (c1177p = C1177p.this).f3432a) == null) {
                        return;
                    }
                    aTCustomLoadListener3.onAdCacheLoaded(new C1207e(baseAd, c1177p.f3433b));
                }
            });
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.f3432a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListenerExt
    public final void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        ATCustomLoadListener aTCustomLoadListener = this.f3432a;
        if (aTCustomLoadListener instanceof ATCustomLoadListenerExt) {
            ((ATCustomLoadListenerExt) aTCustomLoadListener).onAdDataLoadedWithAds(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.f3432a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
