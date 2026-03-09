package com.anythink.interstitial.p183a;

import android.content.Context;
import com.anythink.core.api.ATCommonImpressionListener;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* JADX INFO: renamed from: com.anythink.interstitial.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2349b implements ATCommonImpressionListener {

    /* JADX INFO: renamed from: a */
    public C2352e f14773a;

    public C2349b(C2352e c2352e) {
        this.f14773a = c2352e;
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdClick() {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onInterstitialAdClicked();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdDismiss() {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onInterstitialAdClose();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdImpression() {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onInterstitialAdShow();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdReward() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdShowFail(String str, String str2) {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onInterstitialAdVideoError(str, str2);
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdVideoPlayEnd() {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onInterstitialAdVideoEnd();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdVideoPlayStart() {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onInterstitialAdVideoStart();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onDeeplinkCallback(boolean z) {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onDeeplinkCallback(z);
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        C2352e c2352e = this.f14773a;
        if (c2352e != null) {
            c2352e.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }
}
