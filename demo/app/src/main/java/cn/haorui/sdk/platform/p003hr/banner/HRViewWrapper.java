package cn.haorui.sdk.platform.p003hr.banner;

import androidx.annotation.NonNull;
import cn.haorui.sdk.adsail_ad.AdNative;
import cn.haorui.sdk.adsail_ad.banner.BannerAdSlot;
import cn.haorui.sdk.core.p002ad.banner.BannerAdListener;
import cn.haorui.sdk.core.p002ad.banner.BannerAdLoader;
import cn.haorui.sdk.platform.p003hr.HRAdLoader;

/* JADX INFO: loaded from: classes.dex */
public class HRViewWrapper extends HRAdLoader<BannerAdSlot, BannerAdLoader, BannerAdListener> {
    private static final String TAG = "AdSailViewWrapper";
    private AdNative adNative;

    public HRViewWrapper(@NonNull BannerAdLoader bannerAdLoader, @NonNull BannerAdSlot bannerAdSlot) {
        super(bannerAdLoader, bannerAdSlot);
        this.adNative = new AdNative(bannerAdLoader.getContext());
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public void loadAd() {
        ((BannerAdListener) getLoaderListener()).onAdLoaded(new HRBannerAd((BannerAdSlot) this.adSlot));
        this.adNative.loadBannerAd((BannerAdSlot) this.adSlot, new BannerAdListenerAdapter(this, (BannerAdListener) getLoaderListener()));
    }
}
