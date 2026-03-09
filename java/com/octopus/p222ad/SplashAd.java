package com.octopus.p222ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresPermission;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.internal.view.BannerAdViewImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class SplashAd implements AdLifeControl, IBidding {

    /* JADX INFO: renamed from: a */
    private final BannerAdViewImpl f16682a;

    @RequiresPermission("android.permission.INTERNET")
    public SplashAd(Context context, String str, ViewGroup viewGroup, SplashAdListener splashAdListener) {
        viewGroup.setPadding(0, 0, 0, 0);
        BannerAdViewImpl bannerAdViewImpl = new BannerAdViewImpl(context, viewGroup, (View) null);
        this.f16682a = bannerAdViewImpl;
        bannerAdViewImpl.setSplashAdListener(splashAdListener);
        bannerAdViewImpl.setAdSlotId(str);
        bannerAdViewImpl.loadAd(new AdRequest.Builder().build().impl());
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void cancel() {
        BannerAdViewImpl bannerAdViewImpl = this.f16682a;
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
        return this.f16682a.getAdSlotId();
    }

    public int getPrice() {
        BannerAdViewImpl bannerAdViewImpl = this.f16682a;
        if (bannerAdViewImpl == null) {
            return 0;
        }
        return bannerAdViewImpl.getPrice();
    }

    public String getTagId() {
        BannerAdViewImpl bannerAdViewImpl = this.f16682a;
        if (bannerAdViewImpl == null) {
            return null;
        }
        return bannerAdViewImpl.getTagId();
    }

    public boolean isLoaded() {
        return this.f16682a.isLoaded();
    }

    public boolean isLoading() {
        return this.f16682a.isLoading();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onCreateLifeCycle() {
        this.f16682a.onCreateLifeCycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onDestroyLifeCycle() {
        BannerAdViewImpl bannerAdViewImpl = this.f16682a;
        if (bannerAdViewImpl != null) {
            bannerAdViewImpl.onDestroyLifeCycle();
        }
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onPauseLifeCycle() {
        this.f16682a.onPauseLifeCycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onRestartLifeCycle() {
        this.f16682a.onRestartLifeCycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onResumeLifeCycle() {
        this.f16682a.onResumeLifeCycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStartLifeCycle() {
        this.f16682a.onStartLifeCycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStopLifeCycle() {
        this.f16682a.onStopLifeCycle();
    }

    public void openAdInNativeBrowser(boolean z) {
        this.f16682a.openAdInNativeBrowser(z);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        BannerAdViewImpl bannerAdViewImpl = this.f16682a;
        if (bannerAdViewImpl == null) {
            return;
        }
        bannerAdViewImpl.sendLossNotice(i, str, str2);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        BannerAdViewImpl bannerAdViewImpl = this.f16682a;
        if (bannerAdViewImpl == null) {
            return;
        }
        bannerAdViewImpl.sendWinNotice(i);
    }

    public void setAdSlotId(String str) {
        this.f16682a.setAdSlotId(str);
    }

    public void setChannel(String str) {
        this.f16682a.setChannel(str);
    }

    public void setRequestId(String str) {
        this.f16682a.setRequestId(str);
    }

    public void setTag(String str) {
        this.f16682a.setTag(str);
    }

    public void showAd() {
        this.f16682a.showAd();
    }
}
