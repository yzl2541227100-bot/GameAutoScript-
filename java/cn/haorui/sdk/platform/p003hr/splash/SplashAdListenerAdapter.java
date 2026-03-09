package cn.haorui.sdk.platform.p003hr.splash;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import cn.haorui.sdk.adsail_ad.splash.ISplashAdListener;
import cn.haorui.sdk.adsail_ad.splash.NativeSplashAd;
import cn.haorui.sdk.adsail_ad.splash.SplashAdImpl;
import cn.haorui.sdk.core.loader.C0511g;
import cn.haorui.sdk.core.p002ad.splash.ISplashFinishingTouchListener;
import cn.haorui.sdk.core.p002ad.splash.SplashAdListener;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import cn.haorui.sdk.core.utils.RecordUtil;
import cn.haorui.sdk.core.utils.SdkHandler;
import cn.haorui.sdk.core.view.TouchAdContainer;
import cn.haorui.sdk.core.view.TouchPositionListener;
import cn.haorui.sdk.platform.p003hr.HRPlatformError;

/* JADX INFO: loaded from: classes.dex */
public class SplashAdListenerAdapter implements ISplashAdListener {
    private static final String TAG = "SplashAdListenerAdapter";
    private HRSplashAd HRSplashAd;
    private View adView;
    private HRHRAdNativeWrapper adWrapper;
    private boolean autoShow;
    private boolean hasExposed;
    private boolean isViewClicked;
    private SplashAdListener splashAdListener;

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$1 */
    public class RunnableC06421 implements Runnable {

        /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$1$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SplashAdListenerAdapter.this.splashAdListener != null) {
                    SplashAdListenerAdapter.this.splashAdListener.onAdPresent(SplashAdListenerAdapter.this.HRSplashAd);
                    SplashAdListenerAdapter.this.splashAdListener.onAdExposure();
                }
            }
        }

        public RunnableC06421() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecordUtil.saveAction(SplashAdListenerAdapter.this.adWrapper.getAdSlot().getPosId(), 3);
            String[] monitorUrl = SplashAdListenerAdapter.this.adWrapper.getAdSlot().getMonitorUrl();
            if (monitorUrl != null) {
                LogUtil.m86d(SplashAdListenerAdapter.TAG, "send onADExposure");
                for (String str : monitorUrl) {
                    if (!TextUtils.isEmpty(str)) {
                        HttpUtil.asyncGetWithWebViewUA(SplashAdListenerAdapter.this.adWrapper.getContext(), MacroUtil.replaceExposureMacros(MacroUtil.doReplaceUrl(str, SplashAdListenerAdapter.this.adView.getWidth(), SplashAdListenerAdapter.this.adView.getHeight())), new DefaultHttpGetWithNoHandlerCallback());
                    }
                }
            }
            SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.1.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SplashAdListenerAdapter.this.splashAdListener != null) {
                        SplashAdListenerAdapter.this.splashAdListener.onAdPresent(SplashAdListenerAdapter.this.HRSplashAd);
                        SplashAdListenerAdapter.this.splashAdListener.onAdExposure();
                    }
                }
            });
            SplashAdListenerAdapter.this.hasExposed = true;
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$2 */
    public class RunnableC06432 implements Runnable {
        public RunnableC06432() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashAdListenerAdapter.this.splashAdListener != null) {
                SplashAdListenerAdapter.this.splashAdListener.onAdClosed();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$3 */
    public class RunnableC06443 implements Runnable {
        public RunnableC06443() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashAdListenerAdapter.this.splashAdListener != null) {
                SplashAdListenerAdapter.this.splashAdListener.onAdSkip(SplashAdListenerAdapter.this.HRSplashAd);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$4 */
    public class RunnableC06454 implements Runnable {
        public RunnableC06454() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ISplashFinishingTouchListener splashFinishingTouchListener;
            if (SplashAdListenerAdapter.this.splashAdListener != null) {
                SplashAdListenerAdapter.this.splashAdListener.onAdTimeOver(SplashAdListenerAdapter.this.HRSplashAd);
            }
            if (SplashAdListenerAdapter.this.HRSplashAd.getSplashFinishingTouchListener() != null) {
                boolean z = false;
                if (SplashAdListenerAdapter.this.isViewClicked) {
                    splashFinishingTouchListener = SplashAdListenerAdapter.this.HRSplashAd.getSplashFinishingTouchListener();
                } else {
                    splashFinishingTouchListener = SplashAdListenerAdapter.this.HRSplashAd.getSplashFinishingTouchListener();
                    if (SplashAdListenerAdapter.this.adWrapper.getAdSlot().getIs_eyes() == 1) {
                        z = true;
                    }
                }
                splashFinishingTouchListener.isSupportSplashClickEye(z);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$5 */
    public class RunnableC06465 implements Runnable {
        public final /* synthetic */ Integer val$i;
        public final /* synthetic */ String val$s;

        public RunnableC06465(String str, Integer num) {
            str = str;
            num = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.m87e(SplashAdListenerAdapter.TAG, "onADError, msg: " + str + ", code: " + num);
            if (SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl() != null) {
                String str = SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl()[0];
                Integer num = num;
                HttpUtil.asyncGetErrorReport(str, Integer.valueOf(num != null ? num.intValue() : 0), str);
            }
            new HRPlatformError(str, num).post(SplashAdListenerAdapter.this.splashAdListener);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$6 */
    public class RunnableC06476 implements Runnable {
        public final /* synthetic */ int val$code;
        public final /* synthetic */ String val$msg;

        public RunnableC06476(int i, String str) {
            i = i;
            str = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl() != null) {
                HttpUtil.asyncGetErrorReport(SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl()[0], Integer.valueOf(i), str);
            }
            if (SplashAdListenerAdapter.this.splashAdListener != null) {
                SplashAdListenerAdapter.this.splashAdListener.onAdPlatformError(new HRPlatformError(str, Integer.valueOf(i)));
                SplashAdListenerAdapter.this.splashAdListener.onAdRenderFail(str, i);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$7 */
    public class RunnableC06487 implements Runnable {
        public final /* synthetic */ long val$leftMilliseconds;

        public RunnableC06487(long j) {
            j = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashAdListenerAdapter.this.splashAdListener != null) {
                SplashAdListenerAdapter.this.splashAdListener.onAdTick(j);
            }
        }
    }

    public SplashAdListenerAdapter(HRHRAdNativeWrapper hRHRAdNativeWrapper, @NonNull SplashAdListener splashAdListener, boolean z) {
        this.adWrapper = hRHRAdNativeWrapper;
        this.splashAdListener = splashAdListener;
        this.autoShow = z;
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public boolean isHasExposed() {
        return this.hasExposed;
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public void onADClosed() {
        C0511g.c.f151a.m43a();
        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.2
            public RunnableC06432() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SplashAdListenerAdapter.this.splashAdListener != null) {
                    SplashAdListenerAdapter.this.splashAdListener.onAdClosed();
                }
            }
        });
    }

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onADError(String str, Integer num) {
        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.5
            public final /* synthetic */ Integer val$i;
            public final /* synthetic */ String val$s;

            public RunnableC06465(String str2, Integer num2) {
                str = str2;
                num = num2;
            }

            @Override // java.lang.Runnable
            public void run() {
                LogUtil.m87e(SplashAdListenerAdapter.TAG, "onADError, msg: " + str + ", code: " + num);
                if (SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl() != null) {
                    String str2 = SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl()[0];
                    Integer num2 = num;
                    HttpUtil.asyncGetErrorReport(str2, Integer.valueOf(num2 != null ? num2.intValue() : 0), str);
                }
                new HRPlatformError(str, num).post(SplashAdListenerAdapter.this.splashAdListener);
            }
        });
    }

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onADExposure() {
        View view;
        if (this.hasExposed || (view = this.adView) == null) {
            return;
        }
        view.post(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.1

            /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter$1$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SplashAdListenerAdapter.this.splashAdListener != null) {
                        SplashAdListenerAdapter.this.splashAdListener.onAdPresent(SplashAdListenerAdapter.this.HRSplashAd);
                        SplashAdListenerAdapter.this.splashAdListener.onAdExposure();
                    }
                }
            }

            public RunnableC06421() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RecordUtil.saveAction(SplashAdListenerAdapter.this.adWrapper.getAdSlot().getPosId(), 3);
                String[] monitorUrl = SplashAdListenerAdapter.this.adWrapper.getAdSlot().getMonitorUrl();
                if (monitorUrl != null) {
                    LogUtil.m86d(SplashAdListenerAdapter.TAG, "send onADExposure");
                    for (String str : monitorUrl) {
                        if (!TextUtils.isEmpty(str)) {
                            HttpUtil.asyncGetWithWebViewUA(SplashAdListenerAdapter.this.adWrapper.getContext(), MacroUtil.replaceExposureMacros(MacroUtil.doReplaceUrl(str, SplashAdListenerAdapter.this.adView.getWidth(), SplashAdListenerAdapter.this.adView.getHeight())), new DefaultHttpGetWithNoHandlerCallback());
                        }
                    }
                }
                SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.1.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (SplashAdListenerAdapter.this.splashAdListener != null) {
                            SplashAdListenerAdapter.this.splashAdListener.onAdPresent(SplashAdListenerAdapter.this.HRSplashAd);
                            SplashAdListenerAdapter.this.splashAdListener.onAdExposure();
                        }
                    }
                });
                SplashAdListenerAdapter.this.hasExposed = true;
            }
        });
    }

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onADLoaded(NativeSplashAd nativeSplashAd) {
        HRSplashAd hRSplashAd = new HRSplashAd(nativeSplashAd, this.adWrapper, this, this.autoShow);
        this.HRSplashAd = hRSplashAd;
        SplashAdListener splashAdListener = this.splashAdListener;
        if (splashAdListener != null) {
            splashAdListener.onAdReady(hRSplashAd);
        }
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public void onADSkip() {
        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.3
            public RunnableC06443() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SplashAdListenerAdapter.this.splashAdListener != null) {
                    SplashAdListenerAdapter.this.splashAdListener.onAdSkip(SplashAdListenerAdapter.this.HRSplashAd);
                }
            }
        });
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public void onADTick(long j) {
        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.7
            public final /* synthetic */ long val$leftMilliseconds;

            public RunnableC06487(long j2) {
                j = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SplashAdListenerAdapter.this.splashAdListener != null) {
                    SplashAdListenerAdapter.this.splashAdListener.onAdTick(j);
                }
            }
        });
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public void onADTimeOver() {
        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.4
            public RunnableC06454() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ISplashFinishingTouchListener splashFinishingTouchListener;
                if (SplashAdListenerAdapter.this.splashAdListener != null) {
                    SplashAdListenerAdapter.this.splashAdListener.onAdTimeOver(SplashAdListenerAdapter.this.HRSplashAd);
                }
                if (SplashAdListenerAdapter.this.HRSplashAd.getSplashFinishingTouchListener() != null) {
                    boolean z = false;
                    if (SplashAdListenerAdapter.this.isViewClicked) {
                        splashFinishingTouchListener = SplashAdListenerAdapter.this.HRSplashAd.getSplashFinishingTouchListener();
                    } else {
                        splashFinishingTouchListener = SplashAdListenerAdapter.this.HRSplashAd.getSplashFinishingTouchListener();
                        if (SplashAdListenerAdapter.this.adWrapper.getAdSlot().getIs_eyes() == 1) {
                            z = true;
                        }
                    }
                    splashFinishingTouchListener.isSupportSplashClickEye(z);
                }
            }
        });
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public void onAdClicked() {
        this.isViewClicked = true;
    }

    @Override // cn.haorui.sdk.adsail_ad.splash.ISplashAdListener
    public void onAdReady(SplashAdImpl splashAdImpl) {
        View adView = splashAdImpl.getAdView();
        this.adView = adView;
        if (adView != null) {
            ViewGroup viewGroup = (ViewGroup) adView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.adView);
            }
            TouchAdContainer touchAdContainer = new TouchAdContainer(this.adView.getContext());
            touchAdContainer.setTouchPositionListener(new TouchPositionListener(splashAdImpl));
            touchAdContainer.addView(this.adView);
            if (viewGroup != null) {
                viewGroup.addView(touchAdContainer);
            }
            this.adView = touchAdContainer;
            splashAdImpl.setAdView(touchAdContainer);
            HRSplashAd hRSplashAd = this.HRSplashAd;
            if (hRSplashAd != null) {
                hRSplashAd.setAdView(this.adView);
            }
        }
        splashAdImpl.showAdReal();
        onADExposure();
    }

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onAdRenderFail(String str, int i) {
        SdkHandler.getInstance().runOnUiThread(new Runnable() { // from class: cn.haorui.sdk.platform.hr.splash.SplashAdListenerAdapter.6
            public final /* synthetic */ int val$code;
            public final /* synthetic */ String val$msg;

            public RunnableC06476(int i2, String str2) {
                i = i2;
                str = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl() != null) {
                    HttpUtil.asyncGetErrorReport(SplashAdListenerAdapter.this.adWrapper.getAdSlot().getErrorUrl()[0], Integer.valueOf(i), str);
                }
                if (SplashAdListenerAdapter.this.splashAdListener != null) {
                    SplashAdListenerAdapter.this.splashAdListener.onAdPlatformError(new HRPlatformError(str, Integer.valueOf(i)));
                    SplashAdListenerAdapter.this.splashAdListener.onAdRenderFail(str, i);
                }
            }
        });
    }
}
