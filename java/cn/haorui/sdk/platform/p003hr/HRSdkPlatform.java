package cn.haorui.sdk.platform.p003hr;

import cn.haorui.sdk.core.AbstractC0482c;
import cn.haorui.sdk.core.InterfaceC0483d;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.AdType;
import cn.haorui.sdk.core.p002ad.banner.BannerAdLoader;
import cn.haorui.sdk.core.p002ad.interstitial.InterstitialAdLoader;
import cn.haorui.sdk.core.p002ad.paster.PasterAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdLoader;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoLoader;
import cn.haorui.sdk.core.p002ad.splash.SplashAdLoader;

/* JADX INFO: loaded from: classes.dex */
public class HRSdkPlatform extends AbstractC0482c {
    @Override // cn.haorui.sdk.core.AbstractC0482c, cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d bannerLoader(BannerAdLoader bannerAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.AbstractC0482c
    public InterfaceC0483d createConfig() {
        return new HRInitConfig();
    }

    @Override // cn.haorui.sdk.core.AbstractC0482c, cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d interstitialLoader(InterstitialAdLoader interstitialAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.AbstractC0482c, cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d pasterLoader(PasterAdLoader pasterAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.AbstractC0482c, cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d recyclerLoader(RecyclerAdLoader recyclerAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.AbstractC0482c, cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d rewardLoader(RewardVideoLoader rewardVideoLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.AbstractC0482c, cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d splashLoader(SplashAdLoader splashAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public AdType[] support() {
        return new AdType[]{AdType.FEED, AdType.FEED_PRE_RENDER, AdType.FEED_MIX, AdType.BANNER, AdType.SPLASH, AdType.INTERSTITIAL, AdType.PASTER, AdType.REWARD, AdType.FULL_SCREEN_VIDEO, AdType.DRAW};
    }
}
