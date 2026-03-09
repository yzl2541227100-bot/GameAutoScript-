package cn.haorui.sdk.core.p002ad.reward;

import android.content.Context;
import androidx.annotation.NonNull;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.core.C0479a;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.p002ad.BaseFullScreenVideoAdLoader;
import cn.haorui.sdk.platform.p003hr.reward.HRRewardVideoHRAdWrapper;

/* JADX INFO: loaded from: classes.dex */
public class RewardVideoLoader extends BaseFullScreenVideoAdLoader<RewardVideoAdListener> {
    private static final String TAG = "RewardVideoLoader";

    public RewardVideoLoader(@NonNull Context context, @NonNull String str, RewardVideoAdListener rewardVideoAdListener) {
        super(context, str, rewardVideoAdListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.BaseFullScreenVideoAdLoader
    public InterfaceC0508d createAdSailDelegateInternal(NativeAdSlot nativeAdSlot) {
        return new HRRewardVideoHRAdWrapper(this, nativeAdSlot);
    }

    @Override // cn.haorui.sdk.core.loader.AbstractC0497b
    public InterfaceC0508d createDelegate(SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo) {
        return C0479a.m18a(sdkAdInfo.getSdk()).rewardLoader(this, sdkAdInfo, hRAdInfo);
    }
}
