package cn.haorui.sdk.platform.p003hr;

import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.AbstractC0497b;
import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.p002ad.AdSlot;
import cn.haorui.sdk.platform.BasePlatformLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract class HRAdLoader<T extends AdSlot, Loader extends AbstractC0497b, LoaderListener extends IAdLoadListener> extends BasePlatformLoader<Loader, LoaderListener> {
    public T adSlot;

    public HRAdLoader(Loader loader, T t) {
        super(loader, new SdkAdInfo());
        this.adSlot = t;
    }

    @Override // cn.haorui.sdk.platform.BasePlatformLoader, cn.haorui.sdk.core.loader.IAdLoader
    public void destroy() {
    }

    public T getAdSlot() {
        return this.adSlot;
    }
}
