package cn.haorui.sdk.core;

import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.AdType;
import cn.haorui.sdk.core.p002ad.banner.BannerAdLoader;
import cn.haorui.sdk.core.p002ad.draw.DrawAdLoader;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdLoader;
import cn.haorui.sdk.core.p002ad.interstitial.InterstitialAdLoader;
import cn.haorui.sdk.core.p002ad.paster.PasterAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdLoader;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoLoader;
import cn.haorui.sdk.core.p002ad.splash.SplashAdLoader;

/* JADX INFO: renamed from: cn.haorui.sdk.core.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0492e {
    InterfaceC0508d bannerLoader(BannerAdLoader bannerAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0483d config();

    InterfaceC0508d drawLoader(DrawAdLoader drawAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0508d fullScreenVideoLoader(FullScreenVideoAdLoader fullScreenVideoAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0508d interstitialLoader(InterstitialAdLoader interstitialAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0508d pasterLoader(PasterAdLoader pasterAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0508d recyclerLoader(RecyclerAdLoader recyclerAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0508d rewardLoader(RewardVideoLoader rewardVideoLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    InterfaceC0508d splashLoader(SplashAdLoader splashAdLoader, SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    AdType[] support();
}
