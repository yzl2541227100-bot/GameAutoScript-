package cn.haorui.sdk.core.p002ad.splash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.haorui.sdk.core.loader.C0496a;
import cn.haorui.sdk.core.loader.InterfaceC0508d;

/* JADX INFO: loaded from: classes.dex */
public class SplashAdListenerProxy extends C0496a<ISplashAd, SplashAdListener> implements SplashAdListener {
    public SplashAdListenerProxy(@NonNull InterfaceC0508d interfaceC0508d, @Nullable SplashAdListener splashAdListener) {
        super(interfaceC0508d, splashAdListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.SplashAdListener
    public void onAdPresent(ISplashAd iSplashAd) {
        K k = this.listener;
        if (k != 0) {
            ((SplashAdListener) k).onAdPresent(iSplashAd);
        }
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.SplashAdListener
    public void onAdSkip(ISplashAd iSplashAd) {
        K k = this.listener;
        if (k != 0) {
            ((SplashAdListener) k).onAdSkip(iSplashAd);
        }
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.SplashAdListener
    public void onAdTick(long j) {
        K k = this.listener;
        if (k != 0) {
            ((SplashAdListener) k).onAdTick(j);
        }
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.SplashAdListener
    public void onAdTimeOver(ISplashAd iSplashAd) {
        K k = this.listener;
        if (k != 0) {
            ((SplashAdListener) k).onAdTimeOver(iSplashAd);
        }
    }
}
