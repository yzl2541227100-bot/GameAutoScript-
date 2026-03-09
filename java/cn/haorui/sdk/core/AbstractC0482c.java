package cn.haorui.sdk.core;

import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.banner.BannerAdLoader;
import cn.haorui.sdk.core.p002ad.draw.DrawAdLoader;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdLoader;
import cn.haorui.sdk.core.p002ad.interstitial.InterstitialAdLoader;
import cn.haorui.sdk.core.p002ad.paster.PasterAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdLoader;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoLoader;
import cn.haorui.sdk.core.p002ad.splash.SplashAdLoader;

/* JADX INFO: renamed from: cn.haorui.sdk.core.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0482c implements InterfaceC0492e {
    public InterfaceC0483d config;

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public abstract InterfaceC0508d bannerLoader(BannerAdLoader bannerAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0483d config() {
        if (this.config == null) {
            this.config = createConfig();
        }
        return this.config;
    }

    public abstract InterfaceC0483d createConfig();

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d drawLoader(DrawAdLoader drawAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public InterfaceC0508d fullScreenVideoLoader(FullScreenVideoAdLoader fullScreenVideoAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return null;
    }

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public abstract InterfaceC0508d interstitialLoader(InterstitialAdLoader interstitialAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public abstract InterfaceC0508d pasterLoader(PasterAdLoader pasterAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public abstract InterfaceC0508d recyclerLoader(RecyclerAdLoader recyclerAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public abstract InterfaceC0508d rewardLoader(RewardVideoLoader rewardVideoLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    @Override // cn.haorui.sdk.core.InterfaceC0492e
    public abstract InterfaceC0508d splashLoader(SplashAdLoader splashAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);
}
