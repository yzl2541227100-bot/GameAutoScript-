package cn.haorui.sdk.core.p002ad.splash;

import android.view.ViewGroup;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.BaseAd;

/* JADX INFO: loaded from: classes.dex */
public abstract class SplashAd extends BaseAd implements ISplashAd {
    public ViewGroup adContainer;
    public ISplashDownloadDialogListener downloadDialogListener;
    private ISplashFinishingTouchListener finishingTouchListener;
    public Integer height;
    private boolean isFinishingTouch;
    public Integer width;

    public SplashAd(InterfaceC0508d interfaceC0508d, String str) {
        super(interfaceC0508d, str);
    }

    public Integer getHeight() {
        return this.height;
    }

    public boolean getIsFinishingTouch() {
        return this.isFinishingTouch;
    }

    public ISplashFinishingTouchListener getSplashFinishingTouchListener() {
        return this.finishingTouchListener;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setAdContainer(ViewGroup viewGroup) {
        this.adContainer = viewGroup;
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.ISplashAd
    public void setDownloadDialogListener(ISplashDownloadDialogListener iSplashDownloadDialogListener) {
        this.downloadDialogListener = iSplashDownloadDialogListener;
    }

    public void setHeight(Integer num) {
        this.height = num;
    }

    public void setIsFinishingTouch(boolean z) {
        this.isFinishingTouch = z;
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.ISplashAd
    public void setSplashFinishingTouchListener(ISplashFinishingTouchListener iSplashFinishingTouchListener) {
        this.finishingTouchListener = iSplashFinishingTouchListener;
    }

    public void setWidth(Integer num) {
        this.width = num;
    }

    @Override // cn.haorui.sdk.core.p002ad.splash.ISplashAd
    public void splashAnimationFinish() {
    }
}
