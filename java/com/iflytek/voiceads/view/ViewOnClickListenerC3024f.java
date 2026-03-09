package com.iflytek.voiceads.view;

import android.view.View;

/* JADX INFO: renamed from: com.iflytek.voiceads.view.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class ViewOnClickListenerC3024f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterstitialAdView f16617a;

    ViewOnClickListenerC3024f(InterstitialAdView interstitialAdView) {
        this.f16617a = interstitialAdView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f16617a.f16586k.onAdDestroy();
        this.f16617a.f16585j.onAdClose();
    }
}
