package cn.haorui.sdk.platform.p003hr.fullscreenvideo;

import androidx.annotation.NonNull;
import cn.haorui.sdk.adsail_ad.AdNative;
import cn.haorui.sdk.adsail_ad.nativ.INativeAdListener;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdListener;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdLoader;
import cn.haorui.sdk.platform.p003hr.HRAdLoader;
import cn.haorui.sdk.platform.p003hr.reward.AdListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class HRFullScreenVideoHRAdWrapper extends HRAdLoader<NativeAdSlot, FullScreenVideoAdLoader, FullScreenVideoAdListener> {
    private static final String TAG = "AdSailFullScreenVideoAdWrapper";
    private INativeAdListener adListener;
    private AdNative adNative;

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.fullscreenvideo.HRFullScreenVideoHRAdWrapper$1 */
    public class C06221 extends AdListenerAdapter {
        public C06221(HRAdLoader hRAdLoader, IAdLoadListener iAdLoadListener, NativeAdSlot nativeAdSlot) {
            super(hRAdLoader, iAdLoadListener, nativeAdSlot);
        }

        @Override // cn.haorui.sdk.platform.p003hr.reward.AdListenerAdapter
        public String[] getResponUrl() {
            return ((NativeAdSlot) HRFullScreenVideoHRAdWrapper.this.adSlot).getResponUrl();
        }
    }

    public HRFullScreenVideoHRAdWrapper(@NonNull FullScreenVideoAdLoader fullScreenVideoAdLoader, @NonNull NativeAdSlot nativeAdSlot) {
        super(fullScreenVideoAdLoader, nativeAdSlot);
        this.adNative = new AdNative(fullScreenVideoAdLoader.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [cn.haorui.sdk.core.loader.IAdLoadListener] */
    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public void loadAd() {
        if (getLoaderListener() != 0) {
            ((FullScreenVideoAdListener) getLoaderListener()).onAdLoaded(null);
        }
        C06221 c06221 = new AdListenerAdapter(this, getLoaderListener(), (NativeAdSlot) this.adSlot) { // from class: cn.haorui.sdk.platform.hr.fullscreenvideo.HRFullScreenVideoHRAdWrapper.1
            public C06221(HRAdLoader this, IAdLoadListener iAdLoadListener, NativeAdSlot nativeAdSlot) {
                super(this, iAdLoadListener, nativeAdSlot);
            }

            @Override // cn.haorui.sdk.platform.p003hr.reward.AdListenerAdapter
            public String[] getResponUrl() {
                return ((NativeAdSlot) HRFullScreenVideoHRAdWrapper.this.adSlot).getResponUrl();
            }
        };
        this.adListener = c06221;
        this.adNative.loadFullScreenVideoAd((NativeAdSlot) this.adSlot, c06221, (FullScreenVideoAdLoader) getAdLoader());
    }
}
