package com.octopus.p222ad;

import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.internal.animation.TransitionDirection;
import com.octopus.p222ad.internal.animation.TransitionType;
import com.octopus.p222ad.internal.view.BannerAdViewImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerAd implements AdLifeControl, IBidding {

    /* JADX INFO: renamed from: a */
    private final BannerAdViewImpl f16652a;

    @RequiresPermission("android.permission.INTERNET")
    public BannerAd(Context context, String str, BannerAdListener bannerAdListener) {
        BannerAdViewImpl bannerAdViewImpl = new BannerAdViewImpl(context);
        this.f16652a = bannerAdViewImpl;
        bannerAdViewImpl.setBannerAdListener(bannerAdListener);
        bannerAdViewImpl.setAdSlotId(str);
        setTransitionType(TransitionType.MOVEIN);
        setTransitionDirection(TransitionDirection.LEFT);
        setTransitionDuration(600);
        setAutoRefresh(true);
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void cancel() {
        BannerAdViewImpl bannerAdViewImpl = this.f16652a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.cancel();
        }
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void destroy() {
        onDestroyLifeCycle();
        cancel();
    }

    public String getAdSlotId() {
        return this.f16652a.getAdSlotId();
    }

    public int getPrice() {
        BannerAdViewImpl bannerAdViewImpl = this.f16652a;
        if (bannerAdViewImpl == null) {
            return 0;
        }
        return bannerAdViewImpl.getPrice();
    }

    public String getTagId() {
        BannerAdViewImpl bannerAdViewImpl = this.f16652a;
        if (bannerAdViewImpl == null) {
            return null;
        }
        return bannerAdViewImpl.getTagId();
    }

    public boolean isLoaded() {
        return this.f16652a.isLoaded();
    }

    public boolean isLoading() {
        return this.f16652a.isLoading();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        this.f16652a.loadAd(new AdRequest.Builder().build().impl());
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onDestroyLifeCycle() {
        BannerAdViewImpl bannerAdViewImpl = this.f16652a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.onDestroyLifeCycle();
        }
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
        this.f16652a.openAdInNativeBrowser(z);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        BannerAdViewImpl bannerAdViewImpl = this.f16652a;
        if (bannerAdViewImpl == null) {
            return;
        }
        bannerAdViewImpl.sendLossNotice(i, str, str2);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        BannerAdViewImpl bannerAdViewImpl = this.f16652a;
        if (bannerAdViewImpl == null) {
            return;
        }
        bannerAdViewImpl.sendWinNotice(i);
    }

    public void setAdSlotId(String str) {
        this.f16652a.setAdSlotId(str);
    }

    public void setAutoRefresh(boolean z) {
        this.f16652a.setAutoRefresh(z);
    }

    public void setChannel(String str) {
        this.f16652a.setChannel(str);
    }

    public void setRequestId(String str) {
        this.f16652a.setRequestId(str);
    }

    public void setTag(String str) {
        this.f16652a.setTag(str);
    }

    public void setTransitionDirection(TransitionDirection transitionDirection) {
        this.f16652a.setTransitionDirection(transitionDirection);
    }

    public void setTransitionDuration(int i) {
        this.f16652a.setTransitionDuration(i);
    }

    public void setTransitionType(TransitionType transitionType) {
        this.f16652a.setTransitionType(transitionType);
    }
}
