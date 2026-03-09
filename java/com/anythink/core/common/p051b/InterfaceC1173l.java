package com.anythink.core.common.p051b;

import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* JADX INFO: renamed from: com.anythink.core.common.b.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1173l {
    void onAdClicked(View view);

    void onAdDislikeButtonClick();

    void onAdImpressed();

    void onAdVideoEnd();

    void onAdVideoProgress(int i);

    void onAdVideoStart();

    void onDeeplinkCallback(boolean z);

    void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}
