package cn.haorui.sdk.adsail_ad.splash;

import cn.haorui.sdk.core.p002ad.AdSlot;
import cn.haorui.sdk.platform.p003hr.IAdSailAd;

/* JADX INFO: loaded from: classes.dex */
public interface NativeSplashAd extends IAdSailAd {
    @Override // cn.haorui.sdk.platform.p003hr.IAdSailAd
    AdSlot getAdSlot();

    @Override // cn.haorui.sdk.platform.p003hr.IAdSailAd
    int getInteractionType();
}
