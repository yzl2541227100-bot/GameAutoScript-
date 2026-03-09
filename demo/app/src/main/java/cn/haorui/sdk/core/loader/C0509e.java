package cn.haorui.sdk.core.loader;

import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.p002ad.banner.BannerAdListener;
import cn.haorui.sdk.core.p002ad.banner.BannerAdListenerProxy;
import cn.haorui.sdk.core.p002ad.draw.DrawAdListener;
import cn.haorui.sdk.core.p002ad.draw.DrawAdListenerProxy;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdListener;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdListenerProxy;
import cn.haorui.sdk.core.p002ad.image.ImageAdListener;
import cn.haorui.sdk.core.p002ad.image.ImageAdListenerProxy;
import cn.haorui.sdk.core.p002ad.interstitial.InterstitialAdListener;
import cn.haorui.sdk.core.p002ad.interstitial.InterstitialAdListenerProxy;
import cn.haorui.sdk.core.p002ad.media.NativeMediaAdListener;
import cn.haorui.sdk.core.p002ad.media.NativeMediaAdListenerProxy;
import cn.haorui.sdk.core.p002ad.paster.PasterAdListener;
import cn.haorui.sdk.core.p002ad.paster.PasterAdListenerProxy;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdListener;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdListenerProxy;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoAdListener;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoAdListenerProxy;
import cn.haorui.sdk.core.p002ad.splash.SplashAdListener;
import cn.haorui.sdk.core.p002ad.splash.SplashAdListenerProxy;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.e */
/* JADX INFO: loaded from: classes.dex */
public class C0509e {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0520b f122a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <T> T m41a(InterfaceC0508d interfaceC0508d, IAdLoadListener iAdLoadListener) {
        return iAdLoadListener instanceof RecyclerAdListener ? (T) new RecyclerAdListenerProxy(interfaceC0508d, (RecyclerAdListener) iAdLoadListener) : iAdLoadListener instanceof BannerAdListener ? (T) new BannerAdListenerProxy(interfaceC0508d, (BannerAdListener) iAdLoadListener) : iAdLoadListener instanceof SplashAdListener ? (T) new SplashAdListenerProxy(interfaceC0508d, (SplashAdListener) iAdLoadListener) : iAdLoadListener instanceof RewardVideoAdListener ? (T) new RewardVideoAdListenerProxy(interfaceC0508d, (RewardVideoAdListener) iAdLoadListener) : iAdLoadListener instanceof InterstitialAdListener ? (T) new InterstitialAdListenerProxy(interfaceC0508d, (InterstitialAdListener) iAdLoadListener) : iAdLoadListener instanceof NativeMediaAdListener ? (T) new NativeMediaAdListenerProxy(interfaceC0508d, (NativeMediaAdListener) iAdLoadListener) : iAdLoadListener instanceof ImageAdListener ? (T) new ImageAdListenerProxy(interfaceC0508d, (ImageAdListener) iAdLoadListener) : iAdLoadListener instanceof DrawAdListener ? (T) new DrawAdListenerProxy(interfaceC0508d, (DrawAdListener) iAdLoadListener) : iAdLoadListener instanceof PasterAdListener ? (T) new PasterAdListenerProxy(interfaceC0508d, (PasterAdListener) iAdLoadListener) : iAdLoadListener instanceof FullScreenVideoAdListener ? (T) new FullScreenVideoAdListenerProxy(interfaceC0508d, (FullScreenVideoAdListener) iAdLoadListener) : iAdLoadListener;
    }

    /* JADX INFO: renamed from: a */
    public static String m42a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            String str4 = "System property invoke error: " + e;
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }
}
