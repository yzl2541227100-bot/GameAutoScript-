package com.octopus.p222ad;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.internal.view.InterstitialAdViewImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class InterstitialAd implements AdLifeControl, IBidding {

    /* JADX INFO: renamed from: a */
    private final InterstitialAdViewImpl f16670a;

    @RequiresPermission("android.permission.INTERNET")
    public InterstitialAd(Context context, String str, InterstitialAdListener interstitialAdListener) {
        InterstitialAdViewImpl interstitialAdViewImpl = new InterstitialAdViewImpl(context, false, false);
        this.f16670a = interstitialAdViewImpl;
        interstitialAdViewImpl.setAdSlotId(str);
        interstitialAdViewImpl.setInterstitialAdListener(interstitialAdListener);
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void cancel() {
        this.f16670a.cancel();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void destroy() {
        onDestroyLifeCycle();
        cancel();
    }

    public String getAdSlotId() {
        return this.f16670a.getAdSlotId();
    }

    public int getPrice() {
        return this.f16670a.getPrice();
    }

    public String getTagId() {
        return this.f16670a.getTagId();
    }

    public boolean isLoaded() {
        return this.f16670a.isLoaded();
    }

    public boolean isLoading() {
        return this.f16670a.isLoading();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        this.f16670a.loadAd(new AdRequest.Builder().build().impl());
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(AdRequest adRequest) {
        this.f16670a.loadAd(adRequest.impl());
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onDestroyLifeCycle() {
        this.f16670a.onDestroyLifeCycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onResumeLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStopLifeCycle() {
    }

    public void openAdInNativeBrowser(boolean z) {
        this.f16670a.setOpensNativeBrowser(z);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f16670a;
        if (interstitialAdViewImpl == null) {
            return;
        }
        interstitialAdViewImpl.sendLossNotice(i, str, str2);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f16670a;
        if (interstitialAdViewImpl == null) {
            return;
        }
        interstitialAdViewImpl.sendWinNotice(i);
    }

    public void setChannel(String str) {
        this.f16670a.setChannel(str);
    }

    public void setRequestId(String str) {
        this.f16670a.setRequestId(str);
    }

    public void setTag(String str) {
        this.f16670a.setTag(str);
    }

    public void show(Activity activity) {
        this.f16670a.show(activity);
    }
}
