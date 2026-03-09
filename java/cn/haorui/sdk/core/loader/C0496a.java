package cn.haorui.sdk.core.loader;

import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.loader.cache.C0499a;
import cn.haorui.sdk.core.loader.cache.InterfaceC0501c;
import cn.haorui.sdk.core.loader.concurrent.ConCurrentManager;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import cn.haorui.sdk.platform.p003hr.HRAdLoader;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.a */
/* JADX INFO: loaded from: classes.dex */
public class C0496a<T, K extends IAdLoadListener<T>> implements IAdLoadListener<T> {
    private static final String TAG = "AdLoadListenerProxy";
    public K listener;
    public InterfaceC0508d loader;

    public C0496a(InterfaceC0508d interfaceC0508d, K k) {
        this.loader = interfaceC0508d;
        this.listener = k;
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdClosed() {
        IAdLoadListener loaderListener;
        LogUtil.m86d(TAG, "send onAdClosed");
        if (this.loader.getCacheAdListener() != null) {
            ConCurrentManager.C0502a c0502a = (ConCurrentManager.C0502a) this.loader.getCacheAdListener();
            if (ConCurrentManager.this.adLoader.getLoaderListener() == null) {
                return;
            } else {
                loaderListener = ConCurrentManager.this.adLoader.getLoaderListener();
            }
        } else {
            loaderListener = this.listener;
            if (loaderListener == null) {
                return;
            }
        }
        loaderListener.onAdClosed();
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdError() {
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdExposure() {
        IAdLoadListener loaderListener;
        LogUtil.m86d(TAG, "send onAdExposure");
        InterfaceC0508d interfaceC0508d = this.loader;
        if (!(interfaceC0508d instanceof HRAdLoader)) {
            HttpUtil.asyncGetWithWebViewUA(interfaceC0508d.getContext(), MacroUtil.replaceExposureMacros(this.loader.getSdkAdInfo().getImp()), new DefaultHttpGetWithNoHandlerCallback());
        }
        if (this.loader.getCacheAdListener() != null) {
            ConCurrentManager.C0502a c0502a = (ConCurrentManager.C0502a) this.loader.getCacheAdListener();
            if (ConCurrentManager.this.adLoader.getLoaderListener() == null) {
                return;
            } else {
                loaderListener = ConCurrentManager.this.adLoader.getLoaderListener();
            }
        } else {
            loaderListener = this.listener;
            if (loaderListener == null) {
                return;
            }
        }
        loaderListener.onAdExposure();
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdLoaded(T t) {
        if (this.loader.getConCurrentListener() != null) {
            this.loader.getConCurrentListener().onAdLoaded(t, this.loader.getTag());
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdPlatformError(AdPlatformError adPlatformError) {
        LogUtil.m86d(TAG, "send onAdPlatformError");
        K k = this.listener;
        if (k != null) {
            k.onAdPlatformError(adPlatformError);
        }
        if (this.loader.getConCurrentListener() != null) {
            this.loader.getConCurrentListener().onAdError(adPlatformError, this.loader.getTag());
        }
        if (this.loader.getCacheAdListener() != null) {
            InterfaceC0501c cacheAdListener = this.loader.getCacheAdListener();
            String message = adPlatformError.getMessage();
            int iIntValue = adPlatformError.getCode().intValue();
            long loadedTime = this.loader.getSdkAdInfo().getLoadedTime();
            ConCurrentManager.C0502a c0502a = (ConCurrentManager.C0502a) cacheAdListener;
            c0502a.getClass();
            LogUtil.m87e("ConCurrentManager", "onAdRenderFail");
            C0499a c0499a = c0502a.f113a;
            if ((c0499a.f109e ? c0499a.f110f : c0499a.f106b.getLoadedTime()) != loadedTime || ConCurrentManager.this.adLoader.getLoaderListener() == null) {
                return;
            }
            ConCurrentManager.this.adLoader.getLoaderListener().onAdRenderFail(message, iIntValue);
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdReady(T t) {
        if (this.loader.getConCurrentListener() != null) {
            this.loader.getConCurrentListener().onRenderSuccess(t, this.loader.getTag());
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdRenderFail(String str, int i) {
        if (this.loader.getConCurrentListener() != null) {
            this.loader.getConCurrentListener().onRenderFail(str, i, this.loader.getTag());
        }
    }
}
