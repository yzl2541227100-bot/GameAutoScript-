package com.octopus.p222ad;

/* JADX INFO: loaded from: classes2.dex */
public interface InterstitialAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i);

    void onAdLoaded();

    void onAdShown();
}
