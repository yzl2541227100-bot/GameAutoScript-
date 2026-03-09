package com.octopus.p222ad;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.internal.view.InterstitialAdViewImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class RewardVideoAd implements IBidding, IRewardVideoAd {

    /* JADX INFO: renamed from: a */
    private final InterstitialAdViewImpl f16681a;

    @RequiresPermission("android.permission.INTERNET")
    public RewardVideoAd(Context context, String str, RewardVideoAdListener rewardVideoAdListener) {
        InterstitialAdViewImpl interstitialAdViewImpl = new InterstitialAdViewImpl(context, true, false);
        this.f16681a = interstitialAdViewImpl;
        interstitialAdViewImpl.setAdSlotId(str);
        interstitialAdViewImpl.setRewardVideoAdListener(rewardVideoAdListener);
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public void destroy() {
        this.f16681a.destroy();
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public int getPrice() {
        return this.f16681a.getPrice();
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public String getTagId() {
        return this.f16681a.getTagId();
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public boolean isLoaded() {
        return this.f16681a.isLoaded();
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        this.f16681a.loadAd(new AdRequest.Builder().build().impl());
    }

    public void openAdInNativeBrowser(boolean z) {
        this.f16681a.openAdInNativeBrowser(z);
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public void pause() {
        this.f16681a.activityOnPause();
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public void resume() {
        this.f16681a.activityOnResume();
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f16681a;
        if (interstitialAdViewImpl == null) {
            return;
        }
        interstitialAdViewImpl.sendLossNotice(i, str, str2);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f16681a;
        if (interstitialAdViewImpl == null) {
            return;
        }
        interstitialAdViewImpl.sendWinNotice(i);
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public void setAdSlotId(String str) {
        this.f16681a.setAdSlotId(str);
    }

    public void setChannel(String str) {
        this.f16681a.setChannel(str);
    }

    public void setRequestId(String str) {
        this.f16681a.setRequestId(str);
    }

    public void setTag(String str) {
        this.f16681a.setTag(str);
    }

    @Override // com.octopus.p222ad.IRewardVideoAd
    public void show(Activity activity) {
        if (isLoaded()) {
            this.f16681a.show(activity);
        }
    }
}
