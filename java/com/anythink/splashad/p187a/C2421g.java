package com.anythink.splashad.p187a;

import android.content.Context;
import com.anythink.core.api.ATCommonImpressionListener;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.ErrorCode;

/* JADX INFO: renamed from: com.anythink.splashad.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2421g implements ATCommonImpressionListener {

    /* JADX INFO: renamed from: a */
    public C2422h f15058a;

    public C2421g(C2422h c2422h) {
        this.f15058a = c2422h;
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdClick() {
        C2422h c2422h = this.f15058a;
        if (c2422h != null) {
            c2422h.onSplashAdClicked();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdDismiss() {
        C2422h c2422h = this.f15058a;
        if (c2422h != null) {
            c2422h.onSplashAdDismiss();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdImpression() {
        C2422h c2422h = this.f15058a;
        if (c2422h != null) {
            c2422h.onSplashAdShow();
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdReward() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdShowFail(String str, String str2) {
        C2422h c2422h = this.f15058a;
        if (c2422h != null) {
            c2422h.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2));
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdVideoPlayEnd() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onAdVideoPlayStart() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onDeeplinkCallback(boolean z) {
        C2422h c2422h = this.f15058a;
        if (c2422h != null) {
            c2422h.onDeeplinkCallback(z);
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        C2422h c2422h = this.f15058a;
        if (c2422h != null) {
            c2422h.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }
}
