package cn.haorui.sdk.platform.p003hr.reward;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.haorui.sdk.adsail_ad.nativ.INativeAdListener;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdData;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoAdListener;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import cn.haorui.sdk.core.utils.RecordUtil;
import cn.haorui.sdk.platform.p003hr.BaseFullScreenVideoAd;
import cn.haorui.sdk.platform.p003hr.HRAdLoader;
import cn.haorui.sdk.platform.p003hr.HRPlatformError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdListenerAdapter implements INativeAdListener {
    private static final String TAG = "AdListenerAdapter";

    /* JADX INFO: renamed from: ad */
    private BaseFullScreenVideoAd f352ad;
    private NativeAdSlot adSlot;
    private HRAdLoader adWrapper;
    private IAdLoadListener apiAdListener;
    private boolean hasExposed;

    public AdListenerAdapter(@NonNull HRAdLoader hRAdLoader, IAdLoadListener iAdLoadListener, NativeAdSlot nativeAdSlot) {
        this.adWrapper = hRAdLoader;
        this.apiAdListener = iAdLoadListener;
        this.adSlot = nativeAdSlot;
    }

    public abstract String[] getResponUrl();

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onADError(String str, Integer num) {
        if (this.adWrapper.getAdSlot().getErrorUrl() != null) {
            HttpUtil.asyncGetErrorReport(this.adWrapper.getAdSlot().getErrorUrl()[0], num, str);
        }
        new HRPlatformError(str, num).post(this.apiAdListener);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cn.haorui.sdk.core.loader.b] */
    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onADExposure() {
        if (this.hasExposed) {
            return;
        }
        RecordUtil.saveAction(this.adWrapper.getAdLoader().getPosId(), 3);
        String[] monitorUrl = this.adWrapper.getAdSlot().getMonitorUrl();
        if (monitorUrl != null) {
            LogUtil.m86d(TAG, "send onAdExposure");
            for (String str : monitorUrl) {
                if (!TextUtils.isEmpty(str)) {
                    HttpUtil.asyncGetWithWebViewUA(this.adWrapper.getContext(), MacroUtil.replaceExposureMacros(str), new DefaultHttpGetWithNoHandlerCallback());
                }
            }
        }
        IAdLoadListener iAdLoadListener = this.apiAdListener;
        if (iAdLoadListener != null) {
            iAdLoadListener.onAdExposure();
        }
        this.hasExposed = true;
    }

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onADLoaded(List<NativeAdData> list) {
        if (this.apiAdListener == null || list == null || list.isEmpty()) {
            return;
        }
        BaseFullScreenVideoAd baseFullScreenVideoAd = new BaseFullScreenVideoAd(this.adWrapper, list.get(0), this.adSlot);
        this.f352ad = baseFullScreenVideoAd;
        this.apiAdListener.onAdReady(baseFullScreenVideoAd);
        IAdLoadListener iAdLoadListener = this.apiAdListener;
        if (iAdLoadListener instanceof RewardVideoAdListener) {
            ((RewardVideoAdListener) iAdLoadListener).onVideoCached();
        }
    }

    @Override // cn.haorui.sdk.adsail_ad.IAdListener
    public void onAdRenderFail(String str, int i) {
        if (this.adWrapper.getAdSlot().getErrorUrl() != null) {
            HttpUtil.asyncGetErrorReport(this.adWrapper.getAdSlot().getErrorUrl()[0], Integer.valueOf(i), str);
        }
        BaseFullScreenVideoAd baseFullScreenVideoAd = this.f352ad;
        if (baseFullScreenVideoAd != null) {
            baseFullScreenVideoAd.destroy();
        }
        IAdLoadListener iAdLoadListener = this.apiAdListener;
        if (iAdLoadListener != null) {
            iAdLoadListener.onAdPlatformError(new HRPlatformError(str, Integer.valueOf(i)));
            this.apiAdListener.onAdRenderFail(str, i);
        }
    }
}
