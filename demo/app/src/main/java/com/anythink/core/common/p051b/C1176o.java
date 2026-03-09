package com.anythink.core.common.p051b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.ATBiddingListener;
import com.anythink.core.api.ATBiddingListenerExt;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p055f.p056a.C1207e;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.b.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1176o implements ATBiddingListenerExt {

    /* JADX INFO: renamed from: a */
    private ATBiddingListener f3426a;

    /* JADX INFO: renamed from: b */
    private Map<String, Object> f3427b;

    /* JADX INFO: renamed from: c */
    private int f3428c;

    public C1176o(ATBiddingListener aTBiddingListener, Map<String, Object> map, int i) {
        this.f3428c = -1;
        this.f3426a = aTBiddingListener;
        this.f3427b = map;
        this.f3428c = i;
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
        ATBiddingListener aTBiddingListener = this.f3426a;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBidResult(aTBiddingResult);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public final void onC2SBiddingResultWithCache(final ATBiddingResult aTBiddingResult, final BaseAd baseAd) {
        if (this.f3428c != 0 || !aTBiddingResult.isSuccessWithUseType()) {
            ATBiddingListener aTBiddingListener = this.f3426a;
            if (aTBiddingListener != null) {
                aTBiddingListener.onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
                return;
            }
            return;
        }
        if (baseAd == null) {
            ATBiddingListener aTBiddingListener2 = this.f3426a;
            if (aTBiddingListener2 != null) {
                aTBiddingListener2.onC2SBiddingResultWithCache(ATBiddingResult.fail("load fail with no adObject"), null);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            C1378b.m4482a(C1175n.m2059a().m2148f()).m4494a(new C1381e(2, baseAd.getMainImageUrl()), 0, 0, new C1378b.a() { // from class: com.anythink.core.common.b.o.1
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                    if (C1176o.this.f3426a != null) {
                        C1176o.this.f3426a.onC2SBiddingResultWithCache(ATBiddingResult.fail("load image failed: ".concat(String.valueOf(str2))), null);
                    }
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || C1176o.this.f3426a == null) {
                        return;
                    }
                    C1176o.this.f3426a.onC2SBiddingResultWithCache(aTBiddingResult, new C1207e(baseAd, C1176o.this.f3427b));
                }
            });
            return;
        }
        ATBiddingListener aTBiddingListener3 = this.f3426a;
        if (aTBiddingListener3 != null) {
            aTBiddingListener3.onC2SBiddingResultWithCache(aTBiddingResult, new C1207e(baseAd, this.f3427b));
        }
    }

    @Override // com.anythink.core.api.ATBiddingListenerExt
    public final void onC2SBiddingResultWithData(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        ATBiddingListener aTBiddingListener = this.f3426a;
        if (aTBiddingListener instanceof ATBiddingListenerExt) {
            ((ATBiddingListenerExt) aTBiddingListener).onC2SBiddingResultWithData(aTBiddingResult, baseAd);
        }
    }
}
