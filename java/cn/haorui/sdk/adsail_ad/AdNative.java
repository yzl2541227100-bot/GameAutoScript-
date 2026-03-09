package cn.haorui.sdk.adsail_ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import cn.haorui.sdk.C0384R;
import cn.haorui.sdk.activity.HRRewardVideoPlayerActivity;
import cn.haorui.sdk.adsail_ad.MediaView;
import cn.haorui.sdk.adsail_ad.banner.BannerAdSlot;
import cn.haorui.sdk.adsail_ad.banner.HRBannerRootView;
import cn.haorui.sdk.adsail_ad.banner.IBannerAdListener;
import cn.haorui.sdk.adsail_ad.interstitial.IInterstitialAdListener;
import cn.haorui.sdk.adsail_ad.interstitial.InterstitialAdSlot;
import cn.haorui.sdk.adsail_ad.interstitial.NativeInterstitialAd;
import cn.haorui.sdk.adsail_ad.nativ.INativeAdListener;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdData;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdDataImpl;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdDataImpl.Builder;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.adsail_ad.nativ.NormalMediaView;
import cn.haorui.sdk.adsail_ad.splash.HRSplashRootView;
import cn.haorui.sdk.adsail_ad.splash.ISplashAdListener;
import cn.haorui.sdk.adsail_ad.splash.SplashAdImpl;
import cn.haorui.sdk.adsail_ad.splash.SplashAdSlot;
import cn.haorui.sdk.adsail_ad.splash.SplashSkipView;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.domain.HttpResponse;
import cn.haorui.sdk.core.exception.C0493a;
import cn.haorui.sdk.core.loader.C0511g;
import cn.haorui.sdk.core.p002ad.BaseFullScreenVideoAdLoader;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener;
import cn.haorui.sdk.core.p002ad.splash.SplashAdLoader;
import cn.haorui.sdk.core.utils.ClickHandler;
import cn.haorui.sdk.core.utils.HttpGetBytesCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MemoryUtil;
import cn.haorui.sdk.core.utils.SdkHandler;
import cn.haorui.sdk.core.view.DownloadView;
import cn.haorui.sdk.core.view.SwipeView;
import cn.haorui.sdk.core.view.gif.GifImageView;
import cn.haorui.sdk.platform.p003hr.banner.HRBannerAd;
import cn.haorui.sdk.platform.p003hr.interstitial.HRHRAdNativeWrapper;
import com.anythink.expressad.exoplayer.C1575f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p285z2.o000;
import p285z2.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public class AdNative {
    private static final int SPLASH_TIMEOUT = 5000;
    private static final String TAG = "AdNative";
    private Context context;
    private int shakeId;

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$1 */
    public class C04181 implements HttpGetBytesCallback {
        public final /* synthetic */ o000 val$aQuery;
        public final /* synthetic */ IBannerAdListener val$adListener;
        public final /* synthetic */ BannerAdSlot val$adSlot;
        public final /* synthetic */ HRBannerRootView val$bannerRoot;
        public final /* synthetic */ GifImageView val$imageView;

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$1$1 */
        public class AnonymousClass1 implements View.OnClickListener {
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (hRBannerRootView.getParent() != null) {
                    ((ViewGroup) hRBannerRootView.getParent()).removeView(hRBannerRootView);
                }
                IBannerAdListener iBannerAdListener = iBannerAdListener;
                if (iBannerAdListener != null) {
                    iBannerAdListener.onADClosed();
                }
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$1$2 */
        public class AnonymousClass2 implements View.OnClickListener {
            public final /* synthetic */ HRBannerAd val$nativeBannerAd;

            public AnonymousClass2(HRBannerAd hRBannerAd) {
                hRBannerAd = hRBannerAd;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bannerAdSlot.getCbc() == 0 && hRBannerAd.getInteractionListener() != null) {
                    hRBannerAd.getInteractionListener().onAdClicked();
                }
                ClickHandler.handleClick(hRBannerAd);
            }
        }

        public C04181(IBannerAdListener iBannerAdListener, BannerAdSlot bannerAdSlot, GifImageView gifImageView, HRBannerRootView hRBannerRootView, o000 o000Var) {
            iBannerAdListener = iBannerAdListener;
            bannerAdSlot = bannerAdSlot;
            gifImageView = gifImageView;
            hRBannerRootView = hRBannerRootView;
            o000Var = o000Var;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
            AdNative.this.sendADError(iBannerAdListener, "图片资源加载错误", C0493a.f86a);
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            byte[] responseBody;
            if (!httpResponse.isSuccessful() || (responseBody = httpResponse.getResponseBody()) == null || responseBody.length <= 0 || responseBody.length >= MemoryUtil.getTraceMemory()) {
                AdNative.this.sendADError(iBannerAdListener, "图片资源加载错误", C0493a.f86a);
                return;
            }
            HRBannerAd hRBannerAd = new HRBannerAd(bannerAdSlot);
            try {
                AdNative.this.showImage(responseBody, gifImageView);
            } catch (Exception e) {
                AdNative.this.sendADError(iBannerAdListener, "图片资源加载错误", C0493a.f86a);
                e.printStackTrace();
            }
            if (iBannerAdListener != null) {
                hRBannerAd.setAdView(hRBannerRootView);
                iBannerAdListener.onADLoaded(hRBannerAd);
            }
            o000Var.o00oO0o(C0384R.id.adsail_banner_close_button).OooOo0o(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.1.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (hRBannerRootView.getParent() != null) {
                        ((ViewGroup) hRBannerRootView.getParent()).removeView(hRBannerRootView);
                    }
                    IBannerAdListener iBannerAdListener = iBannerAdListener;
                    if (iBannerAdListener != null) {
                        iBannerAdListener.onADClosed();
                    }
                }
            });
            o000Var.o00oO0o(C0384R.id.adsail_banner_image).OooOo0o(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.1.2
                public final /* synthetic */ HRBannerAd val$nativeBannerAd;

                public AnonymousClass2(HRBannerAd hRBannerAd2) {
                    hRBannerAd = hRBannerAd2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (bannerAdSlot.getCbc() == 0 && hRBannerAd.getInteractionListener() != null) {
                        hRBannerAd.getInteractionListener().onAdClicked();
                    }
                    ClickHandler.handleClick(hRBannerAd);
                }
            });
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$10 */
    public class C041910 implements HttpGetBytesCallback {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ HRSplashRootView val$adRoot;
        public final /* synthetic */ View val$customSkipButton;
        public final /* synthetic */ GifImageView val$imageView;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public C041910(ISplashAdListener iSplashAdListener, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, View view, GifImageView gifImageView) {
            iSplashAdListener = iSplashAdListener;
            splashAdImpl = splashAdImpl;
            hRSplashRootView = hRSplashRootView;
            view = view;
            gifImageView = gifImageView;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
            AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            if (httpResponse.isSuccessful()) {
                AdNative.this.loadSplashAdOk(splashAdImpl, hRSplashRootView, iSplashAdListener, view);
                byte[] responseBody = httpResponse.getResponseBody();
                if (responseBody != null && responseBody.length > 0 && responseBody.length < MemoryUtil.getTraceMemory()) {
                    if (AdNative.this.isGif(responseBody)) {
                        GifImageView gifImageView = gifImageView;
                        if (gifImageView != null) {
                            gifImageView.setBytes(responseBody);
                            splashAdImpl.setWidth(Integer.valueOf(gifImageView.getGifWidth()));
                            splashAdImpl.setHeight(Integer.valueOf(gifImageView.getGifHeight()));
                            gifImageView.startAnimation();
                        }
                    } else {
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(responseBody, 0, responseBody.length);
                        if (bitmapDecodeByteArray != null) {
                            gifImageView.setImageBitmap(bitmapDecodeByteArray);
                            splashAdImpl.setWidth(Integer.valueOf(bitmapDecodeByteArray.getWidth()));
                            splashAdImpl.setHeight(Integer.valueOf(bitmapDecodeByteArray.getHeight()));
                        }
                    }
                    ISplashAdListener iSplashAdListener = iSplashAdListener;
                    if (iSplashAdListener != null) {
                        iSplashAdListener.onAdReady(splashAdImpl);
                        return;
                    }
                    return;
                }
            }
            AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$11 */
    public class C042011 implements SplashSkipView.OnSkipListener {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ View val$customSkipButton;
        public final /* synthetic */ SplashSkipView val$splashSkipView;

        public C042011(ISplashAdListener iSplashAdListener, SplashSkipView splashSkipView, View view) {
            iSplashAdListener = iSplashAdListener;
            splashSkipView = splashSkipView;
            view = view;
        }

        @Override // cn.haorui.sdk.adsail_ad.splash.SplashSkipView.OnSkipListener
        public void onSkip() {
            LogUtil.m86d(AdNative.TAG, "onSkip: ");
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onADSkip();
                iSplashAdListener.onADClosed();
            }
        }

        @Override // cn.haorui.sdk.adsail_ad.splash.SplashSkipView.OnSkipListener
        public void onTick(long j) {
            View view;
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onADTick(j);
            }
            if (((long) splashSkipView.getTotalTime()) - j <= splashSkipView.getShowTime() || (view = view) == null) {
                return;
            }
            view.setVisibility(0);
        }

        @Override // cn.haorui.sdk.adsail_ad.splash.SplashSkipView.OnSkipListener
        public void onTimeOver() {
            LogUtil.m86d(AdNative.TAG, "onTimeOver: ");
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onADTimeOver();
                iSplashAdListener.onADClosed();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$12 */
    public class ViewOnClickListenerC042112 implements View.OnClickListener {
        public final /* synthetic */ SplashSkipView.OnSkipListener val$onSkipListener;

        public ViewOnClickListenerC042112(SplashSkipView.OnSkipListener onSkipListener) {
            onSkipListener = onSkipListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            onSkipListener.onSkip();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$13 */
    public class ViewOnClickListenerC042213 implements View.OnClickListener {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public ViewOnClickListenerC042213(SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener) {
            splashAdImpl = splashAdImpl;
            iSplashAdListener = iSplashAdListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                splashAdImpl.getInteractionListener().onAdClicked();
            }
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onAdClicked();
            }
            ClickHandler.handleClick(splashAdImpl);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$14 */
    public class ViewOnClickListenerC042314 implements View.OnClickListener {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public ViewOnClickListenerC042314(SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener) {
            splashAdImpl = splashAdImpl;
            iSplashAdListener = iSplashAdListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                splashAdImpl.getInteractionListener().onAdClicked();
            }
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onAdClicked();
            }
            ClickHandler.handleClick(splashAdImpl);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$15 */
    public class C042415 implements C0511g.d {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public C042415(SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener) {
            splashAdImpl = splashAdImpl;
            iSplashAdListener = iSplashAdListener;
        }

        @Override // cn.haorui.sdk.core.loader.C0511g.d
        public void onShake() {
            C0511g.c.f151a.m44a(AdNative.this.shakeId);
            if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                splashAdImpl.getInteractionListener().onAdClicked();
            }
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onAdClicked();
            }
            ClickHandler.handleClick(splashAdImpl);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$16 */
    public class C042516 extends o000O0O0<File> {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ HRSplashRootView val$adRoot;
        public final /* synthetic */ SplashAdSlot val$adSlot;
        public final /* synthetic */ View val$customSkipButton;
        public final /* synthetic */ AtomicBoolean val$isLoadFailed;
        public final /* synthetic */ SplashAdImpl val$nativeAd;
        public final /* synthetic */ boolean val$videoIsMute;

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$16$1 */
        public class AnonymousClass1 implements INativeAdListener {
            public AnonymousClass1() {
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADError(String str, Integer num) {
                if (C042516.this.val$adSlot.getErrorUrl() != null) {
                    HttpUtil.asyncGetErrorReport(C042516.this.val$adSlot.getErrorUrl()[0], num, str);
                }
                C042516 c042516 = C042516.this;
                AdNative.this.sendADError(c042516.val$adListener, str, num);
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADExposure() {
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADLoaded(List<NativeAdData> list) {
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onAdRenderFail(String str, int i) {
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$16$2 */
        public class AnonymousClass2 implements RecyclerAdMediaListener {
            public final /* synthetic */ NormalMediaView val$mediaView;
            public final /* synthetic */ SplashSkipView val$skipView;

            /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$16$2$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    normalMediaView.destroy();
                    View adView = C042516.this.val$nativeAd.getAdView();
                    if (adView != null) {
                        ViewParent parent = adView.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(adView);
                        }
                    }
                }
            }

            public AnonymousClass2(NormalMediaView normalMediaView, SplashSkipView splashSkipView) {
                normalMediaView = normalMediaView;
                splashSkipView = splashSkipView;
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoCompleted() {
                C042516.this.val$nativeAd.setVideoFinish(true);
                if (C042516.this.val$adSlot.getIs_eyes() == 1 && C042516.this.val$nativeAd.getIsAnimFinish()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.16.2.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            normalMediaView.destroy();
                            View adView = C042516.this.val$nativeAd.getAdView();
                            if (adView != null) {
                                ViewParent parent = adView.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(adView);
                                }
                            }
                        }
                    }, 4000L);
                }
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoError() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoLoaded() {
                if (C042516.this.val$isLoadFailed.get()) {
                    return;
                }
                C042516 c042516 = C042516.this;
                if (c042516.val$adListener != null) {
                    c042516.val$nativeAd.setWidth(Integer.valueOf(normalMediaView.getAdSailVideoView().getMediaPlayer().getVideoWidth()));
                    C042516.this.val$nativeAd.setHeight(Integer.valueOf(normalMediaView.getAdSailVideoView().getMediaPlayer().getVideoHeight()));
                    C042516 c0425162 = C042516.this;
                    c0425162.val$adListener.onAdReady(c0425162.val$nativeAd);
                }
                long jMin = Math.min(normalMediaView.getDuration(), AdSdk.adConfig().getSplashShowTime());
                if (C042516.this.val$adSlot.getIs_eyes() != 1) {
                    splashSkipView.setTotalTime((int) jMin);
                }
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoPause() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoResume() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoStart() {
            }
        }

        public C042516(ISplashAdListener iSplashAdListener, SplashAdSlot splashAdSlot, boolean z, HRSplashRootView hRSplashRootView, SplashAdImpl splashAdImpl, View view, AtomicBoolean atomicBoolean) {
            this.val$adListener = iSplashAdListener;
            this.val$adSlot = splashAdSlot;
            this.val$videoIsMute = z;
            this.val$adRoot = hRSplashRootView;
            this.val$nativeAd = splashAdImpl;
            this.val$customSkipButton = view;
            this.val$isLoadFailed = atomicBoolean;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
        @Override // p285z2.o000OO0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void callback(java.lang.String r8, java.io.File r9, p285z2.o000O r10) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.adsail_ad.AdNative.C042516.callback(java.lang.String, java.io.File, z2.o000O):void");
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$17 */
    public class RunnableC042617 implements Runnable {
        public final /* synthetic */ o000O0O0 val$ajaxCallback;

        public RunnableC042617(o000O0O0 o000o0o0) {
            o000o0o0 = o000o0o0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(C1575f.f8394a);
                o000O0O0 o000o0o0 = o000o0o0;
                if (o000o0o0 != null) {
                    o000o0o0.abort();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$18 */
    public class C042718 implements HttpGetBytesCallback {
        public final /* synthetic */ IInterstitialAdListener val$adListener;
        public final /* synthetic */ HRHRAdNativeWrapper val$wrapper;

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$18$1 */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ NativeInterstitialAd val$nativeAd;

            public AnonymousClass1(NativeInterstitialAd nativeInterstitialAd) {
                nativeInterstitialAd = nativeInterstitialAd;
            }

            @Override // java.lang.Runnable
            public void run() {
                iInterstitialAdListener.onADLoaded(nativeInterstitialAd);
            }
        }

        public C042718(IInterstitialAdListener iInterstitialAdListener, HRHRAdNativeWrapper hRHRAdNativeWrapper) {
            iInterstitialAdListener = iInterstitialAdListener;
            hRHRAdNativeWrapper = hRHRAdNativeWrapper;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
            AdNative.this.sendADError(iInterstitialAdListener, "图片资源加载错误", C0493a.f86a);
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            byte[] responseBody;
            if (!httpResponse.isSuccessful() || (responseBody = httpResponse.getResponseBody()) == null || responseBody.length <= 0 || responseBody.length >= MemoryUtil.getTraceMemory()) {
                AdNative.this.sendADError(iInterstitialAdListener, "图片资源加载错误", C0493a.f86a);
            } else {
                SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.18.1
                    public final /* synthetic */ NativeInterstitialAd val$nativeAd;

                    public AnonymousClass1(NativeInterstitialAd nativeInterstitialAd) {
                        nativeInterstitialAd = nativeInterstitialAd;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        iInterstitialAdListener.onADLoaded(nativeInterstitialAd);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$19 */
    public class RunnableC042819 implements Runnable {
        public final /* synthetic */ IInterstitialAdListener val$adListener;
        public final /* synthetic */ NativeInterstitialAd val$nativeAd;

        public RunnableC042819(IInterstitialAdListener iInterstitialAdListener, NativeInterstitialAd nativeInterstitialAd) {
            iInterstitialAdListener = iInterstitialAdListener;
            nativeInterstitialAd = nativeInterstitialAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            iInterstitialAdListener.onADLoaded(nativeInterstitialAd);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$2 */
    public class C04292 implements SplashAdImpl.IAdShowListener {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ SplashAdSlot val$adSlot;
        public final /* synthetic */ boolean val$autoShow;
        public final /* synthetic */ View val$customSkipButton;
        public final /* synthetic */ SplashAdImpl val$nativeAd;
        public final /* synthetic */ cn.haorui.sdk.platform.p003hr.splash.HRHRAdNativeWrapper val$wrapper;

        public C04292(SplashAdSlot splashAdSlot, SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener, boolean z, View view, cn.haorui.sdk.platform.p003hr.splash.HRHRAdNativeWrapper hRHRAdNativeWrapper) {
            splashAdSlot = splashAdSlot;
            splashAdImpl = splashAdImpl;
            iSplashAdListener = iSplashAdListener;
            z = z;
            view = view;
            hRHRAdNativeWrapper = hRHRAdNativeWrapper;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cn.haorui.sdk.adsail_ad.splash.SplashAdImpl.IAdShowListener
        public void onShow() {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(AdNative.this.context);
            HRSplashRootView hRSplashRootView = (HRSplashRootView) layoutInflaterFrom.inflate(C0384R.layout.adsail_splash_ad_layout, (ViewGroup) null);
            o000 o000Var = new o000(hRSplashRootView);
            AdNative.this.handleSplashView(o000Var, hRSplashRootView, splashAdSlot, splashAdImpl, iSplashAdListener);
            splashAdImpl.setAdRoot(hRSplashRootView);
            if (splashAdSlot.getDrawing() == 1) {
                AdNative.this.loadNativeSplash(iSplashAdListener, splashAdSlot, splashAdImpl, (HRSplashRootView) layoutInflaterFrom.inflate(C0384R.layout.adsail_layout_native_splash, (ViewGroup) null), z, view);
                return;
            }
            new DownloadView().handleDownloadView(hRSplashRootView, splashAdSlot);
            if (splashAdSlot.getAdPatternType() == 1 || splashAdSlot.getAdPatternType() == 12 || splashAdSlot.getAdPatternType() == 11 || splashAdSlot.getAdPatternType() == 13) {
                AdNative.this.loadImageSplashAd(iSplashAdListener, splashAdSlot, splashAdImpl, hRSplashRootView, o000Var, z, view);
                return;
            }
            if (splashAdSlot.getAdPatternType() == 2) {
                AdNative.this.loadVideoSplashAd(iSplashAdListener, splashAdSlot, splashAdImpl, hRSplashRootView, o000Var, z, view, ((SplashAdLoader) hRHRAdNativeWrapper.getAdLoader()).getVideoIsMute());
                return;
            }
            LogUtil.m89i(AdNative.TAG, "unsupported type: " + splashAdSlot.getAdPatternType());
            AdNative.this.sendADError(iSplashAdListener, "unsupported type", C0493a.f88c);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$20 */
    public class C043020 implements NormalMediaView.IPreparedListener {
        public final /* synthetic */ ArrayList val$adDatas;
        public final /* synthetic */ INativeAdListener val$adListener;

        public C043020(INativeAdListener iNativeAdListener, ArrayList arrayList) {
            iNativeAdListener = iNativeAdListener;
            arrayList = arrayList;
        }

        @Override // cn.haorui.sdk.adsail_ad.nativ.NormalMediaView.IPreparedListener
        public void onPrepared() {
            INativeAdListener iNativeAdListener = iNativeAdListener;
            if (iNativeAdListener != null) {
                iNativeAdListener.onADLoaded(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$21 */
    public class C043121 implements MediaView.OnVideoLoadedListener {
        public final /* synthetic */ List val$adDatas;
        public final /* synthetic */ INativeAdListener val$adListener;
        public final /* synthetic */ NativeAdSlot val$adSlot;
        public final /* synthetic */ boolean val$showDetail;

        public C043121(NativeAdSlot nativeAdSlot, boolean z, List list, INativeAdListener iNativeAdListener) {
            nativeAdSlot = nativeAdSlot;
            z = z;
            list = list;
            iNativeAdListener = iNativeAdListener;
        }

        @Override // cn.haorui.sdk.adsail_ad.MediaView.OnVideoLoadedListener
        public void onLoaded(MediaView mediaView) {
            NativeAdDataImpl nativeAdDataImplBuild = new NativeAdDataImpl(nativeAdSlot).new Builder().setTitle(nativeAdSlot.getTitle()).setDesc(nativeAdSlot.getDesc()).setAdPatternType(nativeAdSlot.getAdPatternType()).setIconUrl(nativeAdSlot.getIconUrl()).setImgUrls(nativeAdSlot.getImageUrls()).setMediaView(mediaView).setShowDetail(z).build();
            list.add(nativeAdDataImplBuild);
            ((NormalMediaView) mediaView).setMsAd(nativeAdDataImplBuild);
            INativeAdListener iNativeAdListener = iNativeAdListener;
            if (iNativeAdListener != null) {
                iNativeAdListener.onADLoaded(list);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$3 */
    public class C04323 implements HttpGetBytesCallback {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ HRSplashRootView val$adRoot;
        public final /* synthetic */ SplashAdSlot val$adSlot;
        public final /* synthetic */ View val$customSkipButton;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public C04323(ISplashAdListener iSplashAdListener, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, View view, SplashAdSlot splashAdSlot) {
            iSplashAdListener = iSplashAdListener;
            splashAdImpl = splashAdImpl;
            hRSplashRootView = hRSplashRootView;
            view = view;
            splashAdSlot = splashAdSlot;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
            AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            byte[] responseBody;
            if (!httpResponse.isSuccessful() || (responseBody = httpResponse.getResponseBody()) == null || responseBody.length <= 0 || responseBody.length >= MemoryUtil.getTraceMemory()) {
                AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
                return;
            }
            if (AdNative.this.isGif(responseBody)) {
                AdNative.this.loadSplashAdOk(splashAdImpl, hRSplashRootView, iSplashAdListener, view);
                AdNative.this.showLayoutByWidthHeight(responseBody, hRSplashRootView, true, splashAdSlot, splashAdImpl, iSplashAdListener, null);
            } else {
                AdNative.this.loadSplashAdOk(splashAdImpl, hRSplashRootView, iSplashAdListener, view);
                AdNative.this.showLayoutByWidthHeight(responseBody, hRSplashRootView, false, splashAdSlot, splashAdImpl, iSplashAdListener, null);
            }
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onAdReady(splashAdImpl);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$4 */
    public class ViewOnClickListenerC04334 implements View.OnClickListener {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public ViewOnClickListenerC04334(SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener) {
            splashAdImpl = splashAdImpl;
            iSplashAdListener = iSplashAdListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                splashAdImpl.getInteractionListener().onAdClicked();
            }
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onAdClicked();
            }
            ClickHandler.handleClick(splashAdImpl);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$5 */
    public class C04345 extends o000O0O0<File> {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ HRSplashRootView val$adRoot;
        public final /* synthetic */ SplashAdSlot val$adSlot;
        public final /* synthetic */ View val$customSkipButton;
        public final /* synthetic */ AtomicBoolean val$isLoadFailed;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$5$1 */
        public class AnonymousClass1 implements INativeAdListener {
            public AnonymousClass1() {
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADError(String str, Integer num) {
                if (splashAdSlot.getErrorUrl() != null) {
                    HttpUtil.asyncGetErrorReport(splashAdSlot.getErrorUrl()[0], num, str);
                }
                C04345 c04345 = C04345.this;
                AdNative.this.sendADError(iSplashAdListener, str, num);
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADExposure() {
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADLoaded(List<NativeAdData> list) {
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onAdRenderFail(String str, int i) {
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$5$2 */
        public class AnonymousClass2 implements RecyclerAdMediaListener {
            public final /* synthetic */ NormalMediaView val$mediaView;
            public final /* synthetic */ SplashSkipView val$skipView;

            public AnonymousClass2(NormalMediaView normalMediaView, SplashSkipView splashSkipView) {
                normalMediaView = normalMediaView;
                splashSkipView = splashSkipView;
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoCompleted() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoError() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoLoaded() {
                if (atomicBoolean.get()) {
                    return;
                }
                C04345 c04345 = C04345.this;
                AdNative.this.showLayoutByWidthHeight(null, hRSplashRootView, false, splashAdSlot, splashAdImpl, iSplashAdListener, normalMediaView);
                splashAdImpl.setMediaView(normalMediaView);
                C04345 c043452 = C04345.this;
                if (iSplashAdListener != null) {
                    splashAdImpl.setWidth(Integer.valueOf(normalMediaView.getAdSailVideoView().getMediaPlayer().getVideoWidth()));
                    splashAdImpl.setHeight(Integer.valueOf(normalMediaView.getAdSailVideoView().getMediaPlayer().getVideoHeight()));
                }
                C04345 c043453 = C04345.this;
                ISplashAdListener iSplashAdListener = iSplashAdListener;
                if (iSplashAdListener != null) {
                    iSplashAdListener.onAdReady(splashAdImpl);
                }
                splashSkipView.setTotalTime(normalMediaView.getDuration());
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoPause() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoResume() {
            }

            @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
            public void onVideoStart() {
            }
        }

        public C04345(ISplashAdListener iSplashAdListener, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, View view, SplashAdSlot splashAdSlot, AtomicBoolean atomicBoolean) {
            iSplashAdListener = iSplashAdListener;
            splashAdImpl = splashAdImpl;
            hRSplashRootView = hRSplashRootView;
            view = view;
            splashAdSlot = splashAdSlot;
            atomicBoolean = atomicBoolean;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
        @Override // p285z2.o000OO0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void callback(java.lang.String r8, java.io.File r9, p285z2.o000O r10) {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.adsail_ad.AdNative.C04345.callback(java.lang.String, java.io.File, z2.o000O):void");
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$6 */
    public class RunnableC04356 implements Runnable {
        public final /* synthetic */ o000O0O0 val$ajaxCallback;

        public RunnableC04356(o000O0O0 o000o0o0) {
            o000o0o0 = o000o0o0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(C1575f.f8394a);
                o000O0O0 o000o0o0 = o000o0o0;
                if (o000o0o0 != null) {
                    o000o0o0.abort();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$7 */
    public class RunnableC04367 implements Runnable {
        public final /* synthetic */ o000 val$aQuery;
        public final /* synthetic */ HRSplashRootView val$adRoot;
        public final /* synthetic */ RelativeLayout val$msShakeRoot;

        public RunnableC04367(HRSplashRootView hRSplashRootView, RelativeLayout relativeLayout, o000 o000Var) {
            hRSplashRootView = hRSplashRootView;
            relativeLayout = relativeLayout;
            o000Var = o000Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredHeight = hRSplashRootView.getMeasuredHeight();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.bottomMargin = (int) (((double) measuredHeight) * 0.1d);
            relativeLayout.setLayoutParams(layoutParams);
            o000Var.o00oO0o(C0384R.id.adsail_shakeRoot).o000o000(0);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$8 */
    public class ViewOnClickListenerC04378 implements View.OnClickListener {
        public final /* synthetic */ ISplashAdListener val$adListener;
        public final /* synthetic */ SplashAdImpl val$nativeAd;

        public ViewOnClickListenerC04378(SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener) {
            splashAdImpl = splashAdImpl;
            iSplashAdListener = iSplashAdListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                splashAdImpl.getInteractionListener().onAdClicked();
            }
            ISplashAdListener iSplashAdListener = iSplashAdListener;
            if (iSplashAdListener != null) {
                iSplashAdListener.onAdClicked();
            }
            ClickHandler.handleClick(splashAdImpl);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$9 */
    public class RunnableC04389 implements Runnable {
        public final /* synthetic */ o000 val$aQuery;
        public final /* synthetic */ HRSplashRootView val$adRoot;
        public final /* synthetic */ TextView val$msJumpBtn;

        public RunnableC04389(HRSplashRootView hRSplashRootView, TextView textView, o000 o000Var) {
            hRSplashRootView = hRSplashRootView;
            textView = textView;
            o000Var = o000Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredHeight = hRSplashRootView.getMeasuredHeight();
            int measuredWidth = hRSplashRootView.getMeasuredWidth();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.bottomMargin = (int) (((double) measuredHeight) * 0.1d);
            layoutParams.width = (int) (((double) measuredWidth) * 0.99d);
            layoutParams.height = -2;
            textView.setLayoutParams(layoutParams);
            o000Var.o00oO0o(C0384R.id.adsail_jump_btn).o000o000(0);
        }
    }

    public AdNative(@NonNull Context context) {
        this.context = context;
    }

    private byte[] getImageBytes(Context context, int i) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = inputStreamOpenRawResource.read(bArr);
                if (-1 == i2) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void handleSplashView(o000 o000Var, HRSplashRootView hRSplashRootView, SplashAdSlot splashAdSlot, SplashAdImpl splashAdImpl, ISplashAdListener iSplashAdListener) {
        o000 o000VarO00oO0o;
        String clk_area;
        o000 o000VarO00oO0o2;
        String clk_area2;
        GifImageView gifImageView = (GifImageView) hRSplashRootView.findViewById(C0384R.id.adsail_shake_img);
        int i = C0384R.id.adsail_jump_btn;
        TextView textView = (TextView) hRSplashRootView.findViewById(i);
        RelativeLayout relativeLayout = (RelativeLayout) hRSplashRootView.findViewById(C0384R.id.adsail_shakeRoot);
        TextView textView2 = (TextView) hRSplashRootView.findViewById(C0384R.id.adsail_shake_text);
        SwipeView swipeView = (SwipeView) hRSplashRootView.findViewById(C0384R.id.adsail_SwipeViewParent);
        if (swipeView.getVisibility() != 8) {
            swipeView.setVisibility(8);
        }
        if ((splashAdSlot.getAct_type() & 4) == 4 || (splashAdSlot.getAct_type() & 8) == 8) {
            relativeLayout.post(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.7
                public final /* synthetic */ o000 val$aQuery;
                public final /* synthetic */ HRSplashRootView val$adRoot;
                public final /* synthetic */ RelativeLayout val$msShakeRoot;

                public RunnableC04367(HRSplashRootView hRSplashRootView2, RelativeLayout relativeLayout2, o000 o000Var2) {
                    hRSplashRootView = hRSplashRootView2;
                    relativeLayout = relativeLayout2;
                    o000Var = o000Var2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    int measuredHeight = hRSplashRootView.getMeasuredHeight();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams.bottomMargin = (int) (((double) measuredHeight) * 0.1d);
                    relativeLayout.setLayoutParams(layoutParams);
                    o000Var.o00oO0o(C0384R.id.adsail_shakeRoot).o000o000(0);
                }
            });
            if ((splashAdSlot.getAct_type() & 4) != 4 && (splashAdSlot.getAct_type() & 8) == 8) {
                textView2.setText("扭一扭手机");
            }
            if (!TextUtils.isEmpty(splashAdSlot.getClk_area())) {
                o000VarO00oO0o = o000Var2.o00oO0o(C0384R.id.adsail_shake_text_bottom);
                clk_area = splashAdSlot.getClk_area();
            } else if (splashAdSlot.getInteractionType() == 0) {
                o000VarO00oO0o = o000Var2.o00oO0o(C0384R.id.adsail_shake_text_bottom);
                clk_area = "查看详情或跳转第三方应用";
            } else {
                o000VarO00oO0o = o000Var2.o00oO0o(C0384R.id.adsail_shake_text_bottom);
                clk_area = "下载或跳转第三方应用";
            }
            o000VarO00oO0o.o000Oo00(clk_area);
            if ((splashAdSlot.getAct_type() & 2) == 2) {
                textView2.setText(((splashAdSlot.getAct_type() & 4) == 4 || (splashAdSlot.getAct_type() & 8) != 8) ? "摇一摇手机或点击图标" : "扭一扭手机或点击图标");
                gifImageView.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.8
                    public final /* synthetic */ ISplashAdListener val$adListener;
                    public final /* synthetic */ SplashAdImpl val$nativeAd;

                    public ViewOnClickListenerC04378(SplashAdImpl splashAdImpl2, ISplashAdListener iSplashAdListener2) {
                        splashAdImpl = splashAdImpl2;
                        iSplashAdListener = iSplashAdListener2;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                            splashAdImpl.getInteractionListener().onAdClicked();
                        }
                        ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                        if (iSplashAdListener2 != null) {
                            iSplashAdListener2.onAdClicked();
                        }
                        ClickHandler.handleClick(splashAdImpl);
                    }
                });
            }
            showShakeImage(hRSplashRootView2.getContext(), gifImageView);
        } else if ((splashAdSlot.getAct_type() & 2) == 2) {
            relativeLayout2.post(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.9
                public final /* synthetic */ o000 val$aQuery;
                public final /* synthetic */ HRSplashRootView val$adRoot;
                public final /* synthetic */ TextView val$msJumpBtn;

                public RunnableC04389(HRSplashRootView hRSplashRootView2, TextView textView3, o000 o000Var2) {
                    hRSplashRootView = hRSplashRootView2;
                    textView = textView3;
                    o000Var = o000Var2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    int measuredHeight = hRSplashRootView.getMeasuredHeight();
                    int measuredWidth = hRSplashRootView.getMeasuredWidth();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.bottomMargin = (int) (((double) measuredHeight) * 0.1d);
                    layoutParams.width = (int) (((double) measuredWidth) * 0.99d);
                    layoutParams.height = -2;
                    textView.setLayoutParams(layoutParams);
                    o000Var.o00oO0o(C0384R.id.adsail_jump_btn).o000o000(0);
                }
            });
            if (!TextUtils.isEmpty(splashAdSlot.getClk_area())) {
                o000VarO00oO0o2 = o000Var2.o00oO0o(i);
                clk_area2 = splashAdSlot.getClk_area();
            } else if (splashAdSlot.getInteractionType() == 1) {
                o000VarO00oO0o2 = o000Var2.o00oO0o(i);
                clk_area2 = "点击下载或跳转第三方应用";
            } else {
                o000VarO00oO0o2 = o000Var2.o00oO0o(i);
                clk_area2 = "点击查看详情或跳转第三方应用";
            }
            o000VarO00oO0o2.o000Oo00(clk_area2);
        }
        if (!AdSdk.adConfig().showLogo()) {
            o000Var2.o00oO0o(C0384R.id.adsail_img_ad_tag).o000o000(8);
        } else {
            if (TextUtils.isEmpty(splashAdSlot.getFromLogo())) {
                return;
            }
            o000Var2.o00oO0o(C0384R.id.adsail_img_ad_tag).o000000(splashAdSlot.getFromLogo());
        }
    }

    public boolean isGif(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        return new BigInteger(1, bArr2).toString(16).startsWith("47494638");
    }

    public void loadImageSplashAd(ISplashAdListener iSplashAdListener, SplashAdSlot splashAdSlot, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, o000 o000Var, boolean z, View view) {
        GifImageView gifImageView = (GifImageView) hRSplashRootView.findViewById(C0384R.id.adsail_splash_image);
        gifImageView.setVisibility(0);
        hRSplashRootView.findViewById(C0384R.id.adsail_splash_video).setVisibility(8);
        HttpUtil.asyncGetFile(splashAdSlot.getImageUrls()[0], new HttpGetBytesCallback() { // from class: cn.haorui.sdk.adsail_ad.AdNative.10
            public final /* synthetic */ ISplashAdListener val$adListener;
            public final /* synthetic */ HRSplashRootView val$adRoot;
            public final /* synthetic */ View val$customSkipButton;
            public final /* synthetic */ GifImageView val$imageView;
            public final /* synthetic */ SplashAdImpl val$nativeAd;

            public C041910(ISplashAdListener iSplashAdListener2, SplashAdImpl splashAdImpl2, HRSplashRootView hRSplashRootView2, View view2, GifImageView gifImageView2) {
                iSplashAdListener = iSplashAdListener2;
                splashAdImpl = splashAdImpl2;
                hRSplashRootView = hRSplashRootView2;
                view = view2;
                gifImageView = gifImageView2;
            }

            @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
            public void onFailure(@NotNull IOException iOException) {
                AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
            }

            @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
            public void onResponse(HttpResponse<byte[]> httpResponse) {
                if (httpResponse.isSuccessful()) {
                    AdNative.this.loadSplashAdOk(splashAdImpl, hRSplashRootView, iSplashAdListener, view);
                    byte[] responseBody = httpResponse.getResponseBody();
                    if (responseBody != null && responseBody.length > 0 && responseBody.length < MemoryUtil.getTraceMemory()) {
                        if (AdNative.this.isGif(responseBody)) {
                            GifImageView gifImageView2 = gifImageView;
                            if (gifImageView2 != null) {
                                gifImageView2.setBytes(responseBody);
                                splashAdImpl.setWidth(Integer.valueOf(gifImageView.getGifWidth()));
                                splashAdImpl.setHeight(Integer.valueOf(gifImageView.getGifHeight()));
                                gifImageView.startAnimation();
                            }
                        } else {
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(responseBody, 0, responseBody.length);
                            if (bitmapDecodeByteArray != null) {
                                gifImageView.setImageBitmap(bitmapDecodeByteArray);
                                splashAdImpl.setWidth(Integer.valueOf(bitmapDecodeByteArray.getWidth()));
                                splashAdImpl.setHeight(Integer.valueOf(bitmapDecodeByteArray.getHeight()));
                            }
                        }
                        ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                        if (iSplashAdListener2 != null) {
                            iSplashAdListener2.onAdReady(splashAdImpl);
                            return;
                        }
                        return;
                    }
                }
                AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
            }
        });
    }

    public void loadNativeSplash(ISplashAdListener iSplashAdListener, SplashAdSlot splashAdSlot, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, boolean z, View view) {
        splashAdImpl.setAdRoot(hRSplashRootView);
        new DownloadView().handleDownloadView(hRSplashRootView, splashAdSlot);
        o000 o000Var = new o000(hRSplashRootView);
        if (splashAdSlot.getAdPatternType() == 2) {
            loadNativeVideo(iSplashAdListener, splashAdSlot, splashAdImpl, hRSplashRootView, o000Var, view);
        } else {
            HttpUtil.asyncGetFile(splashAdSlot.getImageUrls()[0], new HttpGetBytesCallback() { // from class: cn.haorui.sdk.adsail_ad.AdNative.3
                public final /* synthetic */ ISplashAdListener val$adListener;
                public final /* synthetic */ HRSplashRootView val$adRoot;
                public final /* synthetic */ SplashAdSlot val$adSlot;
                public final /* synthetic */ View val$customSkipButton;
                public final /* synthetic */ SplashAdImpl val$nativeAd;

                public C04323(ISplashAdListener iSplashAdListener2, SplashAdImpl splashAdImpl2, HRSplashRootView hRSplashRootView2, View view2, SplashAdSlot splashAdSlot2) {
                    iSplashAdListener = iSplashAdListener2;
                    splashAdImpl = splashAdImpl2;
                    hRSplashRootView = hRSplashRootView2;
                    view = view2;
                    splashAdSlot = splashAdSlot2;
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onFailure(@NotNull IOException iOException) {
                    AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onResponse(HttpResponse<byte[]> httpResponse) {
                    byte[] responseBody;
                    if (!httpResponse.isSuccessful() || (responseBody = httpResponse.getResponseBody()) == null || responseBody.length <= 0 || responseBody.length >= MemoryUtil.getTraceMemory()) {
                        AdNative.this.sendADError(iSplashAdListener, "图片资源加载错误", C0493a.f86a);
                        return;
                    }
                    if (AdNative.this.isGif(responseBody)) {
                        AdNative.this.loadSplashAdOk(splashAdImpl, hRSplashRootView, iSplashAdListener, view);
                        AdNative.this.showLayoutByWidthHeight(responseBody, hRSplashRootView, true, splashAdSlot, splashAdImpl, iSplashAdListener, null);
                    } else {
                        AdNative.this.loadSplashAdOk(splashAdImpl, hRSplashRootView, iSplashAdListener, view);
                        AdNative.this.showLayoutByWidthHeight(responseBody, hRSplashRootView, false, splashAdSlot, splashAdImpl, iSplashAdListener, null);
                    }
                    ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                    if (iSplashAdListener2 != null) {
                        iSplashAdListener2.onAdReady(splashAdImpl);
                    }
                }
            });
        }
    }

    private void loadNativeVideo(ISplashAdListener iSplashAdListener, SplashAdSlot splashAdSlot, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, o000 o000Var, View view) {
        C04345 c04345 = new o000O0O0<File>() { // from class: cn.haorui.sdk.adsail_ad.AdNative.5
            public final /* synthetic */ ISplashAdListener val$adListener;
            public final /* synthetic */ HRSplashRootView val$adRoot;
            public final /* synthetic */ SplashAdSlot val$adSlot;
            public final /* synthetic */ View val$customSkipButton;
            public final /* synthetic */ AtomicBoolean val$isLoadFailed;
            public final /* synthetic */ SplashAdImpl val$nativeAd;

            /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$5$1 */
            public class AnonymousClass1 implements INativeAdListener {
                public AnonymousClass1() {
                }

                @Override // cn.haorui.sdk.adsail_ad.IAdListener
                public void onADError(String str, Integer num) {
                    if (splashAdSlot.getErrorUrl() != null) {
                        HttpUtil.asyncGetErrorReport(splashAdSlot.getErrorUrl()[0], num, str);
                    }
                    C04345 c04345 = C04345.this;
                    AdNative.this.sendADError(iSplashAdListener, str, num);
                }

                @Override // cn.haorui.sdk.adsail_ad.IAdListener
                public void onADExposure() {
                }

                @Override // cn.haorui.sdk.adsail_ad.IAdListener
                public void onADLoaded(List<NativeAdData> list) {
                }

                @Override // cn.haorui.sdk.adsail_ad.IAdListener
                public void onAdRenderFail(String str, int i) {
                }
            }

            /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$5$2 */
            public class AnonymousClass2 implements RecyclerAdMediaListener {
                public final /* synthetic */ NormalMediaView val$mediaView;
                public final /* synthetic */ SplashSkipView val$skipView;

                public AnonymousClass2(NormalMediaView normalMediaView, SplashSkipView splashSkipView) {
                    normalMediaView = normalMediaView;
                    splashSkipView = splashSkipView;
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoCompleted() {
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoError() {
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoLoaded() {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    C04345 c04345 = C04345.this;
                    AdNative.this.showLayoutByWidthHeight(null, hRSplashRootView, false, splashAdSlot, splashAdImpl, iSplashAdListener, normalMediaView);
                    splashAdImpl.setMediaView(normalMediaView);
                    C04345 c043452 = C04345.this;
                    if (iSplashAdListener != null) {
                        splashAdImpl.setWidth(Integer.valueOf(normalMediaView.getAdSailVideoView().getMediaPlayer().getVideoWidth()));
                        splashAdImpl.setHeight(Integer.valueOf(normalMediaView.getAdSailVideoView().getMediaPlayer().getVideoHeight()));
                    }
                    C04345 c043453 = C04345.this;
                    ISplashAdListener iSplashAdListener = iSplashAdListener;
                    if (iSplashAdListener != null) {
                        iSplashAdListener.onAdReady(splashAdImpl);
                    }
                    splashSkipView.setTotalTime(normalMediaView.getDuration());
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoPause() {
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoResume() {
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoStart() {
                }
            }

            public C04345(ISplashAdListener iSplashAdListener2, SplashAdImpl splashAdImpl2, HRSplashRootView hRSplashRootView2, View view2, SplashAdSlot splashAdSlot2, AtomicBoolean atomicBoolean) {
                iSplashAdListener = iSplashAdListener2;
                splashAdImpl = splashAdImpl2;
                hRSplashRootView = hRSplashRootView2;
                view = view2;
                splashAdSlot = splashAdSlot2;
                atomicBoolean = atomicBoolean;
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
            @Override // p285z2.o000OO0O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void callback(java.lang.String r8, java.io.File r9, p285z2.o000O r10) {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.adsail_ad.AdNative.C04345.callback(java.lang.String, java.io.File, z2.o000O):void");
            }
        };
        new Thread(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.6
            public final /* synthetic */ o000O0O0 val$ajaxCallback;

            public RunnableC04356(o000O0O0 c043452) {
                o000o0o0 = c043452;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(C1575f.f8394a);
                    o000O0O0 o000o0o0 = o000o0o0;
                    if (o000o0o0 != null) {
                        o000o0o0.abort();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        o000Var.OooO0Oo(splashAdSlot2.getVideoUrl(), File.class, 86400000L, c043452);
    }

    public SplashSkipView loadSplashAdOk(SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, ISplashAdListener iSplashAdListener, View view) {
        TextView textView;
        splashAdImpl.setAdView(hRSplashRootView);
        SplashSkipView splashSkipView = (SplashSkipView) hRSplashRootView.findViewById(C0384R.id.adsail_skipView);
        splashSkipView.setShow(!splashAdImpl.getIsHideSkipBtn());
        try {
            splashSkipView.setTotalTime((int) AdSdk.adConfig().getSplashShowTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        C042011 c042011 = new SplashSkipView.OnSkipListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.11
            public final /* synthetic */ ISplashAdListener val$adListener;
            public final /* synthetic */ View val$customSkipButton;
            public final /* synthetic */ SplashSkipView val$splashSkipView;

            public C042011(ISplashAdListener iSplashAdListener2, SplashSkipView splashSkipView2, View view2) {
                iSplashAdListener = iSplashAdListener2;
                splashSkipView = splashSkipView2;
                view = view2;
            }

            @Override // cn.haorui.sdk.adsail_ad.splash.SplashSkipView.OnSkipListener
            public void onSkip() {
                LogUtil.m86d(AdNative.TAG, "onSkip: ");
                ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                if (iSplashAdListener2 != null) {
                    iSplashAdListener2.onADSkip();
                    iSplashAdListener.onADClosed();
                }
            }

            @Override // cn.haorui.sdk.adsail_ad.splash.SplashSkipView.OnSkipListener
            public void onTick(long j) {
                View view2;
                ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                if (iSplashAdListener2 != null) {
                    iSplashAdListener2.onADTick(j);
                }
                if (((long) splashSkipView.getTotalTime()) - j <= splashSkipView.getShowTime() || (view2 = view) == null) {
                    return;
                }
                view2.setVisibility(0);
            }

            @Override // cn.haorui.sdk.adsail_ad.splash.SplashSkipView.OnSkipListener
            public void onTimeOver() {
                LogUtil.m86d(AdNative.TAG, "onTimeOver: ");
                ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                if (iSplashAdListener2 != null) {
                    iSplashAdListener2.onADTimeOver();
                    iSplashAdListener.onADClosed();
                }
            }
        };
        splashSkipView2.setOnSkipListener(c042011);
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.12
                public final /* synthetic */ SplashSkipView.OnSkipListener val$onSkipListener;

                public ViewOnClickListenerC042112(SplashSkipView.OnSkipListener c0420112) {
                    onSkipListener = c0420112;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    onSkipListener.onSkip();
                }
            });
            splashSkipView2.setShow(false);
        }
        if ((splashAdImpl.getAdSlot().getAct_type() & 1) == 1) {
            hRSplashRootView.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.13
                public final /* synthetic */ ISplashAdListener val$adListener;
                public final /* synthetic */ SplashAdImpl val$nativeAd;

                public ViewOnClickListenerC042213(SplashAdImpl splashAdImpl2, ISplashAdListener iSplashAdListener2) {
                    splashAdImpl = splashAdImpl2;
                    iSplashAdListener = iSplashAdListener2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                        splashAdImpl.getInteractionListener().onAdClicked();
                    }
                    ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                    if (iSplashAdListener2 != null) {
                        iSplashAdListener2.onAdClicked();
                    }
                    ClickHandler.handleClick(splashAdImpl);
                }
            });
        }
        if ((splashAdImpl2.getAdSlot().getAct_type() & 2) == 2 && (textView = (TextView) hRSplashRootView.findViewById(C0384R.id.adsail_jump_btn)) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.14
                public final /* synthetic */ ISplashAdListener val$adListener;
                public final /* synthetic */ SplashAdImpl val$nativeAd;

                public ViewOnClickListenerC042314(SplashAdImpl splashAdImpl2, ISplashAdListener iSplashAdListener2) {
                    splashAdImpl = splashAdImpl2;
                    iSplashAdListener = iSplashAdListener2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                        splashAdImpl.getInteractionListener().onAdClicked();
                    }
                    ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                    if (iSplashAdListener2 != null) {
                        iSplashAdListener2.onAdClicked();
                    }
                    ClickHandler.handleClick(splashAdImpl);
                }
            });
        }
        if ((splashAdImpl2.getAdSlot().getAct_type() & 4) == 4 || (splashAdImpl2.getAdSlot().getAct_type() & 8) == 8) {
            int power_index = splashAdImpl2.getAdSlot().getPower_index();
            splashAdImpl2.getAdSlot().getPower_type();
            if (this.shakeId == 0) {
                this.shakeId = C0511g.c.f151a.m49b();
            }
            int i = ((splashAdImpl2.getAdSlot().getAct_type() & 4) == 4 || (splashAdImpl2.getAdSlot().getAct_type() & 8) != 8) ? 1 : 2;
            C0511g.c.f151a.m47a(splashAdImpl2.getAdSlot().getPosId(), splashAdImpl2.getAdSlot().getLoadedTime(), splashAdImpl2.getAdSlot().getDclk());
            C0511g c0511g = C0511g.c.f151a;
            hRSplashRootView.getContext();
            c0511g.m45a(power_index, i, splashAdImpl2.getAdSlot().getPower_delay(), splashAdImpl2.getAdSlot().getPower_count(), this.shakeId, splashAdImpl2.getAdSlot().getEcpm(), new C0511g.d() { // from class: cn.haorui.sdk.adsail_ad.AdNative.15
                public final /* synthetic */ ISplashAdListener val$adListener;
                public final /* synthetic */ SplashAdImpl val$nativeAd;

                public C042415(SplashAdImpl splashAdImpl2, ISplashAdListener iSplashAdListener2) {
                    splashAdImpl = splashAdImpl2;
                    iSplashAdListener = iSplashAdListener2;
                }

                @Override // cn.haorui.sdk.core.loader.C0511g.d
                public void onShake() {
                    C0511g.c.f151a.m44a(AdNative.this.shakeId);
                    if (splashAdImpl.getAdSlot().getCbc() == 0 && splashAdImpl.getInteractionListener() != null) {
                        splashAdImpl.getInteractionListener().onAdClicked();
                    }
                    ISplashAdListener iSplashAdListener2 = iSplashAdListener;
                    if (iSplashAdListener2 != null) {
                        iSplashAdListener2.onAdClicked();
                    }
                    ClickHandler.handleClick(splashAdImpl);
                }
            });
            C0511g.c.f151a.m48a(true);
        }
        splashAdImpl2.setSkipView(splashSkipView2);
        return splashSkipView2;
    }

    public void loadVideoSplashAd(ISplashAdListener iSplashAdListener, SplashAdSlot splashAdSlot, SplashAdImpl splashAdImpl, HRSplashRootView hRSplashRootView, o000 o000Var, boolean z, View view, boolean z3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        hRSplashRootView.setVisibility(4);
        hRSplashRootView.findViewById(C0384R.id.adsail_splash_image).setVisibility(8);
        C042516 c042516 = new C042516(iSplashAdListener, splashAdSlot, z3, hRSplashRootView, splashAdImpl, view, atomicBoolean);
        new Thread(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.17
            public final /* synthetic */ o000O0O0 val$ajaxCallback;

            public RunnableC042617(o000O0O0 c0425162) {
                o000o0o0 = c0425162;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(C1575f.f8394a);
                    o000O0O0 o000o0o0 = o000o0o0;
                    if (o000o0o0 != null) {
                        o000o0o0.abort();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        o000Var.OooO0Oo(splashAdSlot.getVideoUrl(), File.class, 86400000L, c0425162);
    }

    private void loadVideoView(NativeAdSlot nativeAdSlot, INativeAdListener iNativeAdListener, boolean z, boolean z3, boolean z4, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        NormalMediaView normalMediaView = new NormalMediaView(this.context);
        normalMediaView.setAdListener(iNativeAdListener);
        normalMediaView.setOnVideoLoadedListener(new MediaView.OnVideoLoadedListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.21
            public final /* synthetic */ List val$adDatas;
            public final /* synthetic */ INativeAdListener val$adListener;
            public final /* synthetic */ NativeAdSlot val$adSlot;
            public final /* synthetic */ boolean val$showDetail;

            public C043121(NativeAdSlot nativeAdSlot2, boolean z32, List arrayList2, INativeAdListener iNativeAdListener2) {
                nativeAdSlot = nativeAdSlot2;
                z = z32;
                list = arrayList2;
                iNativeAdListener = iNativeAdListener2;
            }

            @Override // cn.haorui.sdk.adsail_ad.MediaView.OnVideoLoadedListener
            public void onLoaded(MediaView mediaView) {
                NativeAdDataImpl nativeAdDataImplBuild = new NativeAdDataImpl(nativeAdSlot).new Builder().setTitle(nativeAdSlot.getTitle()).setDesc(nativeAdSlot.getDesc()).setAdPatternType(nativeAdSlot.getAdPatternType()).setIconUrl(nativeAdSlot.getIconUrl()).setImgUrls(nativeAdSlot.getImageUrls()).setMediaView(mediaView).setShowDetail(z).build();
                list.add(nativeAdDataImplBuild);
                ((NormalMediaView) mediaView).setMsAd(nativeAdDataImplBuild);
                INativeAdListener iNativeAdListener2 = iNativeAdListener;
                if (iNativeAdListener2 != null) {
                    iNativeAdListener2.onADLoaded(list);
                }
            }
        });
        if (nativeAdSlot2.getAdPatternType() == 2) {
            normalMediaView.setVideoCover(nativeAdSlot2.getVideo_cover());
            normalMediaView.setVideoEndCover(nativeAdSlot2.getVideo_endcover());
            normalMediaView.setVideoPath(nativeAdSlot2.getVideoUrl());
            normalMediaView.setRecycler(z);
            if (z) {
                normalMediaView.setConfigWidth(nativeAdSlot2.getWidth());
                normalMediaView.setConfigHeight(nativeAdSlot2.getHeight());
                normalMediaView.setInitMute(true);
                normalMediaView.setFromLogoVisibility(8);
                normalMediaView.setUseTransform(false);
                normalMediaView.setAutoStart(z4);
                normalMediaView.setContainerWidth(f);
                normalMediaView.setContainerHeight(f2);
            } else {
                normalMediaView.setPlayOnce(true);
                normalMediaView.setUseTransform(false);
                if (AdSdk.adConfig().showLogo()) {
                    normalMediaView.setFromLogo(nativeAdSlot2.getFromLogo());
                } else {
                    normalMediaView.setFromLogo(null);
                    normalMediaView.setFromLogoVisibility(8);
                }
            }
        } else if (nativeAdSlot2.getAdPatternType() != 11 && nativeAdSlot2.getAdPatternType() != 12 && nativeAdSlot2.getAdPatternType() != 13) {
            LogUtil.m89i(TAG, "unsupported type: " + nativeAdSlot2.getAdPatternType());
            sendADError(iNativeAdListener2, "不支持的广告类型", C0493a.f88c);
            return;
        }
        normalMediaView.performVideoActions();
    }

    public void sendADError(IAdListener iAdListener, String str, Integer num) {
        if (iAdListener != null) {
            iAdListener.onAdRenderFail(str, num.intValue());
        }
    }

    public void showImage(byte[] bArr, GifImageView gifImageView) {
        if (!isGif(bArr)) {
            gifImageView.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } else if (gifImageView != null) {
            gifImageView.setBytes(bArr);
            gifImageView.startAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0178 A[PHI: r2
  0x0178: PHI (r2v14 android.graphics.Bitmap) = (r2v2 android.graphics.Bitmap), (r2v17 android.graphics.Bitmap) binds: [B:138:0x0176, B:126:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showLayoutByWidthHeight(byte[] r27, android.view.View r28, boolean r29, cn.haorui.sdk.core.p002ad.BaseAdSlot r30, cn.haorui.sdk.adsail_ad.splash.SplashAdImpl r31, cn.haorui.sdk.adsail_ad.splash.ISplashAdListener r32, cn.haorui.sdk.adsail_ad.nativ.NormalMediaView r33) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.adsail_ad.AdNative.showLayoutByWidthHeight(byte[], android.view.View, boolean, cn.haorui.sdk.core.ad.BaseAdSlot, cn.haorui.sdk.adsail_ad.splash.SplashAdImpl, cn.haorui.sdk.adsail_ad.splash.ISplashAdListener, cn.haorui.sdk.adsail_ad.nativ.NormalMediaView):void");
    }

    private void showShakeImage(Context context, GifImageView gifImageView) {
        byte[] imageBytes = getImageBytes(context, C0384R.raw.adsail_new_shake);
        if (imageBytes == null || imageBytes.length <= 0) {
            return;
        }
        gifImageView.setBytes(imageBytes, 1);
        gifImageView.startAnimation();
    }

    public void loadBannerAd(BannerAdSlot bannerAdSlot, IBannerAdListener iBannerAdListener) {
        HRBannerRootView hRBannerRootView = (HRBannerRootView) LayoutInflater.from(this.context).inflate(C0384R.layout.adsail_banner_ad_layout, (ViewGroup) null);
        hRBannerRootView.setAdListener(iBannerAdListener);
        o000 o000Var = new o000(hRBannerRootView);
        new DownloadView().handleDownloadView(hRBannerRootView, bannerAdSlot);
        GifImageView gifImageView = (GifImageView) hRBannerRootView.findViewById(C0384R.id.adsail_banner_image);
        if (bannerAdSlot.getImageUrls() == null || bannerAdSlot.getImageUrls().length == 0) {
            LogUtil.m89i(TAG, "empty srcUrls");
            sendADError(iBannerAdListener, "empty srcUrls", C0493a.f87b);
            return;
        }
        if (bannerAdSlot.getAdPatternType() != 2) {
            if (!AdSdk.adConfig().showLogo()) {
                o000Var.o00oO0o(C0384R.id.adsail_img_ad_tag).o000o000(8);
            } else if (!TextUtils.isEmpty(bannerAdSlot.getFromLogo())) {
                o000Var.o00oO0o(C0384R.id.adsail_img_ad_tag).o000000(bannerAdSlot.getFromLogo());
            }
            HttpUtil.asyncGetFile(bannerAdSlot.getImageUrls()[0], new HttpGetBytesCallback() { // from class: cn.haorui.sdk.adsail_ad.AdNative.1
                public final /* synthetic */ o000 val$aQuery;
                public final /* synthetic */ IBannerAdListener val$adListener;
                public final /* synthetic */ BannerAdSlot val$adSlot;
                public final /* synthetic */ HRBannerRootView val$bannerRoot;
                public final /* synthetic */ GifImageView val$imageView;

                /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$1$1 */
                public class AnonymousClass1 implements View.OnClickListener {
                    public AnonymousClass1() {
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (hRBannerRootView.getParent() != null) {
                            ((ViewGroup) hRBannerRootView.getParent()).removeView(hRBannerRootView);
                        }
                        IBannerAdListener iBannerAdListener = iBannerAdListener;
                        if (iBannerAdListener != null) {
                            iBannerAdListener.onADClosed();
                        }
                    }
                }

                /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$1$2 */
                public class AnonymousClass2 implements View.OnClickListener {
                    public final /* synthetic */ HRBannerAd val$nativeBannerAd;

                    public AnonymousClass2(HRBannerAd hRBannerAd2) {
                        hRBannerAd = hRBannerAd2;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (bannerAdSlot.getCbc() == 0 && hRBannerAd.getInteractionListener() != null) {
                            hRBannerAd.getInteractionListener().onAdClicked();
                        }
                        ClickHandler.handleClick(hRBannerAd);
                    }
                }

                public C04181(IBannerAdListener iBannerAdListener2, BannerAdSlot bannerAdSlot2, GifImageView gifImageView2, HRBannerRootView hRBannerRootView2, o000 o000Var2) {
                    iBannerAdListener = iBannerAdListener2;
                    bannerAdSlot = bannerAdSlot2;
                    gifImageView = gifImageView2;
                    hRBannerRootView = hRBannerRootView2;
                    o000Var = o000Var2;
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onFailure(@NotNull IOException iOException) {
                    AdNative.this.sendADError(iBannerAdListener, "图片资源加载错误", C0493a.f86a);
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onResponse(HttpResponse<byte[]> httpResponse) {
                    byte[] responseBody;
                    if (!httpResponse.isSuccessful() || (responseBody = httpResponse.getResponseBody()) == null || responseBody.length <= 0 || responseBody.length >= MemoryUtil.getTraceMemory()) {
                        AdNative.this.sendADError(iBannerAdListener, "图片资源加载错误", C0493a.f86a);
                        return;
                    }
                    HRBannerAd hRBannerAd2 = new HRBannerAd(bannerAdSlot);
                    try {
                        AdNative.this.showImage(responseBody, gifImageView);
                    } catch (Exception e) {
                        AdNative.this.sendADError(iBannerAdListener, "图片资源加载错误", C0493a.f86a);
                        e.printStackTrace();
                    }
                    if (iBannerAdListener != null) {
                        hRBannerAd2.setAdView(hRBannerRootView);
                        iBannerAdListener.onADLoaded(hRBannerAd2);
                    }
                    o000Var.o00oO0o(C0384R.id.adsail_banner_close_button).OooOo0o(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.1.1
                        public AnonymousClass1() {
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (hRBannerRootView.getParent() != null) {
                                ((ViewGroup) hRBannerRootView.getParent()).removeView(hRBannerRootView);
                            }
                            IBannerAdListener iBannerAdListener2 = iBannerAdListener;
                            if (iBannerAdListener2 != null) {
                                iBannerAdListener2.onADClosed();
                            }
                        }
                    });
                    o000Var.o00oO0o(C0384R.id.adsail_banner_image).OooOo0o(new View.OnClickListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.1.2
                        public final /* synthetic */ HRBannerAd val$nativeBannerAd;

                        public AnonymousClass2(HRBannerAd hRBannerAd22) {
                            hRBannerAd = hRBannerAd22;
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (bannerAdSlot.getCbc() == 0 && hRBannerAd.getInteractionListener() != null) {
                                hRBannerAd.getInteractionListener().onAdClicked();
                            }
                            ClickHandler.handleClick(hRBannerAd);
                        }
                    });
                }
            });
            return;
        }
        LogUtil.m89i(TAG, "unsupported type: " + bannerAdSlot2.getAdPatternType());
        sendADError(iBannerAdListener2, "unsupported type", C0493a.f88c);
    }

    public void loadFullScreenVideoAd(NativeAdSlot nativeAdSlot, INativeAdListener iNativeAdListener, FullScreenVideoAdLoader fullScreenVideoAdLoader) {
        loadRewardVideoAd(nativeAdSlot, iNativeAdListener, fullScreenVideoAdLoader);
    }

    public void loadInterstitialAd(HRHRAdNativeWrapper hRHRAdNativeWrapper, IInterstitialAdListener iInterstitialAdListener) {
        InterstitialAdSlot adSlot = hRHRAdNativeWrapper.getAdSlot();
        if (adSlot.getImageUrls() == null || adSlot.getImageUrls().length == 0) {
            LogUtil.m89i(TAG, "empty srcUrls");
            sendADError(iInterstitialAdListener, "empty srcUrls", C0493a.f87b);
            return;
        }
        if (adSlot.getAdPatternType() != 2) {
            HttpUtil.asyncGetFile(adSlot.getImageUrls()[0], new HttpGetBytesCallback() { // from class: cn.haorui.sdk.adsail_ad.AdNative.18
                public final /* synthetic */ IInterstitialAdListener val$adListener;
                public final /* synthetic */ HRHRAdNativeWrapper val$wrapper;

                /* JADX INFO: renamed from: cn.haorui.sdk.adsail_ad.AdNative$18$1 */
                public class AnonymousClass1 implements Runnable {
                    public final /* synthetic */ NativeInterstitialAd val$nativeAd;

                    public AnonymousClass1(NativeInterstitialAd nativeInterstitialAd) {
                        nativeInterstitialAd = nativeInterstitialAd;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        iInterstitialAdListener.onADLoaded(nativeInterstitialAd);
                    }
                }

                public C042718(IInterstitialAdListener iInterstitialAdListener2, HRHRAdNativeWrapper hRHRAdNativeWrapper2) {
                    iInterstitialAdListener = iInterstitialAdListener2;
                    hRHRAdNativeWrapper = hRHRAdNativeWrapper2;
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onFailure(@NotNull IOException iOException) {
                    AdNative.this.sendADError(iInterstitialAdListener, "图片资源加载错误", C0493a.f86a);
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onResponse(HttpResponse<byte[]> httpResponse) {
                    byte[] responseBody;
                    if (!httpResponse.isSuccessful() || (responseBody = httpResponse.getResponseBody()) == null || responseBody.length <= 0 || responseBody.length >= MemoryUtil.getTraceMemory()) {
                        AdNative.this.sendADError(iInterstitialAdListener, "图片资源加载错误", C0493a.f86a);
                    } else {
                        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.18.1
                            public final /* synthetic */ NativeInterstitialAd val$nativeAd;

                            public AnonymousClass1(NativeInterstitialAd nativeInterstitialAd) {
                                nativeInterstitialAd = nativeInterstitialAd;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                iInterstitialAdListener.onADLoaded(nativeInterstitialAd);
                            }
                        });
                    }
                }
            });
            return;
        }
        if (adSlot.getDrawing() == 1) {
            if (iInterstitialAdListener2 != null) {
                SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.adsail_ad.AdNative.19
                    public final /* synthetic */ IInterstitialAdListener val$adListener;
                    public final /* synthetic */ NativeInterstitialAd val$nativeAd;

                    public RunnableC042819(IInterstitialAdListener iInterstitialAdListener2, NativeInterstitialAd nativeInterstitialAd) {
                        iInterstitialAdListener = iInterstitialAdListener2;
                        nativeInterstitialAd = nativeInterstitialAd;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        iInterstitialAdListener.onADLoaded(nativeInterstitialAd);
                    }
                });
                return;
            }
            return;
        }
        LogUtil.m89i(TAG, "unsupported type: " + adSlot.getAdPatternType());
        sendADError(iInterstitialAdListener2, "不支持广告类型", C0493a.f88c);
    }

    public void loadNativeAd(NativeAdSlot nativeAdSlot, INativeAdListener iNativeAdListener, boolean z, boolean z3, float f, float f2) {
        loadVideoView(nativeAdSlot, iNativeAdListener, true, z, z3, f, f2);
    }

    public void loadPasterAd(NativeAdSlot nativeAdSlot, INativeAdListener iNativeAdListener) {
        loadVideoView(nativeAdSlot, iNativeAdListener, false, false, false, 0.0f, 0.0f);
    }

    public void loadRewardVideoAd(NativeAdSlot nativeAdSlot, INativeAdListener iNativeAdListener, BaseFullScreenVideoAdLoader baseFullScreenVideoAdLoader) {
        NormalMediaView normalMediaView = new NormalMediaView(this.context);
        normalMediaView.setAdListener(iNativeAdListener);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NativeAdDataImpl(nativeAdSlot).new Builder().setTitle(nativeAdSlot.getTitle()).setDesc(nativeAdSlot.getDesc()).setAdPatternType(nativeAdSlot.getAdPatternType()).setIconUrl(nativeAdSlot.getIconUrl()).setImgUrls(nativeAdSlot.getImageUrls()).setMediaView(normalMediaView).setVideoMute(baseFullScreenVideoAdLoader.getVideoIsMute()).build());
        String str = nativeAdSlot.hashCode() + "";
        HRRewardVideoPlayerActivity.setRewardMediaView(str, normalMediaView);
        baseFullScreenVideoAdLoader.addRewardMediaViewLocalId(str);
        if (nativeAdSlot.getAdPatternType() != 2) {
            LogUtil.m89i(TAG, "unsupported type: " + nativeAdSlot.getAdPatternType());
            sendADError(iNativeAdListener, "不支持的广告类型", C0493a.f88c);
            return;
        }
        normalMediaView.setVideoPath(nativeAdSlot.getVideoUrl());
        normalMediaView.setPlayOnce(true);
        normalMediaView.setFromLogoVisibility(8);
        normalMediaView.setUseTransform(false);
        if (baseFullScreenVideoAdLoader.getVideoIsMute()) {
            normalMediaView.mute();
        }
        normalMediaView.setOnPreparedListener(new NormalMediaView.IPreparedListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.20
            public final /* synthetic */ ArrayList val$adDatas;
            public final /* synthetic */ INativeAdListener val$adListener;

            public C043020(INativeAdListener iNativeAdListener2, ArrayList arrayList2) {
                iNativeAdListener = iNativeAdListener2;
                arrayList = arrayList2;
            }

            @Override // cn.haorui.sdk.adsail_ad.nativ.NormalMediaView.IPreparedListener
            public void onPrepared() {
                INativeAdListener iNativeAdListener2 = iNativeAdListener;
                if (iNativeAdListener2 != null) {
                    iNativeAdListener2.onADLoaded(arrayList);
                }
            }
        });
    }

    public void loadSplashAd(SplashAdSlot splashAdSlot, ISplashAdListener iSplashAdListener, cn.haorui.sdk.platform.p003hr.splash.HRHRAdNativeWrapper hRHRAdNativeWrapper, View view, boolean z) {
        SplashAdImpl splashAdImpl = new SplashAdImpl(splashAdSlot, hRHRAdNativeWrapper, z);
        if (splashAdSlot.getImageUrls() == null || splashAdSlot.getImageUrls().length == 0) {
            LogUtil.m89i(TAG, "empty srcUrls");
            sendADError(iSplashAdListener, "图片url为空", C0493a.f87b);
        } else {
            splashAdImpl.setOnAdShowListener(new SplashAdImpl.IAdShowListener() { // from class: cn.haorui.sdk.adsail_ad.AdNative.2
                public final /* synthetic */ ISplashAdListener val$adListener;
                public final /* synthetic */ SplashAdSlot val$adSlot;
                public final /* synthetic */ boolean val$autoShow;
                public final /* synthetic */ View val$customSkipButton;
                public final /* synthetic */ SplashAdImpl val$nativeAd;
                public final /* synthetic */ cn.haorui.sdk.platform.p003hr.splash.HRHRAdNativeWrapper val$wrapper;

                public C04292(SplashAdSlot splashAdSlot2, SplashAdImpl splashAdImpl2, ISplashAdListener iSplashAdListener2, boolean z3, View view2, cn.haorui.sdk.platform.p003hr.splash.HRHRAdNativeWrapper hRHRAdNativeWrapper2) {
                    splashAdSlot = splashAdSlot2;
                    splashAdImpl = splashAdImpl2;
                    iSplashAdListener = iSplashAdListener2;
                    z = z3;
                    view = view2;
                    hRHRAdNativeWrapper = hRHRAdNativeWrapper2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // cn.haorui.sdk.adsail_ad.splash.SplashAdImpl.IAdShowListener
                public void onShow() {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(AdNative.this.context);
                    HRSplashRootView hRSplashRootView = (HRSplashRootView) layoutInflaterFrom.inflate(C0384R.layout.adsail_splash_ad_layout, (ViewGroup) null);
                    o000 o000Var = new o000(hRSplashRootView);
                    AdNative.this.handleSplashView(o000Var, hRSplashRootView, splashAdSlot, splashAdImpl, iSplashAdListener);
                    splashAdImpl.setAdRoot(hRSplashRootView);
                    if (splashAdSlot.getDrawing() == 1) {
                        AdNative.this.loadNativeSplash(iSplashAdListener, splashAdSlot, splashAdImpl, (HRSplashRootView) layoutInflaterFrom.inflate(C0384R.layout.adsail_layout_native_splash, (ViewGroup) null), z, view);
                        return;
                    }
                    new DownloadView().handleDownloadView(hRSplashRootView, splashAdSlot);
                    if (splashAdSlot.getAdPatternType() == 1 || splashAdSlot.getAdPatternType() == 12 || splashAdSlot.getAdPatternType() == 11 || splashAdSlot.getAdPatternType() == 13) {
                        AdNative.this.loadImageSplashAd(iSplashAdListener, splashAdSlot, splashAdImpl, hRSplashRootView, o000Var, z, view);
                        return;
                    }
                    if (splashAdSlot.getAdPatternType() == 2) {
                        AdNative.this.loadVideoSplashAd(iSplashAdListener, splashAdSlot, splashAdImpl, hRSplashRootView, o000Var, z, view, ((SplashAdLoader) hRHRAdNativeWrapper.getAdLoader()).getVideoIsMute());
                        return;
                    }
                    LogUtil.m89i(AdNative.TAG, "unsupported type: " + splashAdSlot.getAdPatternType());
                    AdNative.this.sendADError(iSplashAdListener, "unsupported type", C0493a.f88c);
                }
            });
            if (iSplashAdListener2 != null) {
                iSplashAdListener2.onADLoaded(splashAdImpl2);
            }
        }
    }
}
