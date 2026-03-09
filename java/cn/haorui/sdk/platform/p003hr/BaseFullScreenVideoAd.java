package cn.haorui.sdk.platform.p003hr;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import cn.haorui.sdk.activity.HRRewardVideoPlayerActivity;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdDataImpl;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.loader.InteractionListener;
import cn.haorui.sdk.core.p002ad.BaseAd;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.IFullScreenMediaListener;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.IFullScreenVideoAd;
import cn.haorui.sdk.core.p002ad.reward.RewardAdMediaListener;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoAd;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoAdListener;
import cn.haorui.sdk.core.utils.AderUtil;
import cn.haorui.sdk.core.utils.ClickHandler;
import cn.haorui.sdk.core.utils.HRConstants;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.ResultBean;

/* JADX INFO: loaded from: classes.dex */
public class BaseFullScreenVideoAd extends BaseAd implements RewardVideoAd, IFullScreenVideoAd {
    private static final String TAG = "RewardVideoAdAdapter";
    public static final String broadcast_on_video_complete = "broadcast_on_video_complete";
    public static final String broadcast_on_video_error = "broadcast_on_video_error";
    public static final String broadcast_on_video_pause = "broadcast_on_video_pause";
    public static final String broadcast_on_video_resume = "broadcast_on_video_resume";
    public static final String broadcast_on_video_start = "broadcast_on_video_start";
    public static final String broadcast_onclick = "broadcast_onclick";
    public static final String broadcast_onclosed = "broadcast_onclosed";
    public static final String broadcast_onreward = "broadcast_onreward";
    private NativeAdSlot adSlot;
    private HRAdLoader adWrapper;
    private InteractionListener apiInteractionListener;
    private RewardAdMediaListener apiRewardAdMediaListener;
    private IFullScreenMediaListener mFullScreenMediaListener;
    private IAdSailAd nativeAd;
    private BroadcastReceiver receiver;
    private volatile boolean receverRegistered;
    private boolean showed;

    public BaseFullScreenVideoAd(@NonNull HRAdLoader hRAdLoader, @NonNull IAdSailAd iAdSailAd, NativeAdSlot nativeAdSlot) {
        super(null, HRConstants.PLATFORM_HR);
        this.receiver = new BroadcastReceiver() { // from class: cn.haorui.sdk.platform.hr.BaseFullScreenVideoAd.1
            /* JADX WARN: Type inference failed for: r2v40, types: [cn.haorui.sdk.core.loader.b] */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (BaseFullScreenVideoAd.broadcast_onclick.equalsIgnoreCase(intent.getAction())) {
                    if (BaseFullScreenVideoAd.this.adSlot != null && BaseFullScreenVideoAd.this.adSlot.getCbc() == 0 && BaseFullScreenVideoAd.this.apiInteractionListener != null) {
                        BaseFullScreenVideoAd.this.apiInteractionListener.onAdClicked();
                    }
                    LogUtil.m87e(BaseFullScreenVideoAd.TAG, BaseFullScreenVideoAd.broadcast_onclick);
                    ClickHandler.handleClick(BaseFullScreenVideoAd.this.nativeAd);
                    ClickHandler.clearShowDialogActivity();
                    return;
                }
                if (BaseFullScreenVideoAd.broadcast_onreward.equalsIgnoreCase(intent.getAction())) {
                    IAdLoadListener loaderListener = BaseFullScreenVideoAd.this.adWrapper.getAdLoader().getLoaderListener();
                    if (loaderListener == null || !(loaderListener instanceof RewardVideoAdListener)) {
                        return;
                    }
                    ((RewardVideoAdListener) loaderListener).onReward(null);
                    return;
                }
                if (BaseFullScreenVideoAd.broadcast_onclosed.equalsIgnoreCase(intent.getAction())) {
                    BaseFullScreenVideoAd.this.onVideoActivityClosed();
                    return;
                }
                if (BaseFullScreenVideoAd.broadcast_on_video_complete.equalsIgnoreCase(intent.getAction())) {
                    if (BaseFullScreenVideoAd.this.apiRewardAdMediaListener != null) {
                        BaseFullScreenVideoAd.this.apiRewardAdMediaListener.onVideoCompleted();
                        return;
                    }
                    return;
                }
                if (BaseFullScreenVideoAd.broadcast_on_video_start.equalsIgnoreCase(intent.getAction())) {
                    if (BaseFullScreenVideoAd.this.apiRewardAdMediaListener != null) {
                        BaseFullScreenVideoAd.this.apiRewardAdMediaListener.onVideoStart();
                    }
                } else if (BaseFullScreenVideoAd.broadcast_on_video_pause.equalsIgnoreCase(intent.getAction())) {
                    if (BaseFullScreenVideoAd.this.apiRewardAdMediaListener != null) {
                        BaseFullScreenVideoAd.this.apiRewardAdMediaListener.onVideoPause();
                    }
                } else if (BaseFullScreenVideoAd.broadcast_on_video_resume.equalsIgnoreCase(intent.getAction())) {
                    if (BaseFullScreenVideoAd.this.apiRewardAdMediaListener != null) {
                        BaseFullScreenVideoAd.this.apiRewardAdMediaListener.onVideoResume();
                    }
                } else {
                    if (!BaseFullScreenVideoAd.broadcast_on_video_error.equalsIgnoreCase(intent.getAction()) || BaseFullScreenVideoAd.this.apiRewardAdMediaListener == null) {
                        return;
                    }
                    BaseFullScreenVideoAd.this.apiRewardAdMediaListener.onVideoError();
                }
            }
        };
        this.adWrapper = hRAdLoader;
        this.nativeAd = iAdSailAd;
        this.adSlot = nativeAdSlot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [cn.haorui.sdk.core.loader.b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [cn.haorui.sdk.core.loader.b] */
    public void onVideoActivityClosed() {
        if (this.receverRegistered) {
            LocalBroadcastManager.getInstance(this.adWrapper.getContext()).unregisterReceiver(this.receiver);
            LogUtil.m86d(TAG, "onVideoActivityClosed: 激励视频广告回收资源");
        }
        if (this.adWrapper.getAdLoader().getLoaderListener() != null) {
            this.adWrapper.getAdLoader().getLoaderListener().onAdClosed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showReward(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.platform.p003hr.BaseFullScreenVideoAd.showReward(android.content.Context):void");
    }

    @Override // cn.haorui.sdk.core.p002ad.reward.RewardVideoAd
    public void destroy() {
        HRRewardVideoPlayerActivity.removeRewardMediaView(this.adSlot.hashCode() + "");
    }

    @Override // cn.haorui.sdk.core.p002ad.BaseAd, cn.haorui.sdk.core.p002ad.IAd
    public ResultBean getData() {
        ResultBean resultBean = new ResultBean();
        resultBean.setCid(this.adSlot.getCid());
        resultBean.setCat(this.adSlot.getCat());
        resultBean.setAderId(this.adSlot.getAder_id());
        resultBean.setFromId(this.adSlot.getFromId());
        resultBean.setReqId(this.adSlot.getReq_id());
        resultBean.setPrice(this.adSlot.getEcpm());
        resultBean.setEcpm(String.valueOf(this.adSlot.getEcpm()));
        resultBean.setS_ext(this.adSlot.getS_ext());
        resultBean.setS_code(this.adSlot.getS_code());
        resultBean.setSdkName(HRConstants.PLATFORM_HR);
        return resultBean;
    }

    public String getDeepLink() {
        if (AderUtil.getIsOperationContent(this.adSlot.getAder_id())) {
            return this.adSlot.getDeep_link();
        }
        return null;
    }

    public String[] getImgUrls() {
        return AderUtil.getIsOperationContent(this.adSlot.getAder_id()) ? this.adSlot.getImageUrls() : new String[0];
    }

    public boolean getIsOperationContent() {
        return AderUtil.getIsOperationContent(this.adSlot.getAder_id());
    }

    @Override // cn.haorui.sdk.core.p002ad.BaseAd, cn.haorui.sdk.core.p002ad.IAd
    public boolean isAdValid() {
        int expire_timestamp = this.adSlot.getExpire_timestamp();
        return SystemClock.uptimeMillis() - this.adSlot.getLoadedTime() < (expire_timestamp <= 0 ? 1740000L : (long) (expire_timestamp * 1000));
    }

    @Override // cn.haorui.sdk.core.p002ad.BaseAd, cn.haorui.sdk.core.p002ad.IAd
    public void setInteractionListener(InteractionListener interactionListener) {
        this.apiInteractionListener = interactionListener;
        this.nativeAd.setInteractionListener(interactionListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.fullscreenvideo.IFullScreenVideoAd
    public void setMediaListener(IFullScreenMediaListener iFullScreenMediaListener) {
        this.mFullScreenMediaListener = iFullScreenMediaListener;
    }

    @Override // cn.haorui.sdk.core.p002ad.reward.RewardVideoAd
    public void setMediaListener(RewardAdMediaListener rewardAdMediaListener) {
        this.apiRewardAdMediaListener = rewardAdMediaListener;
    }

    @Override // cn.haorui.sdk.core.p002ad.reward.RewardVideoAd, cn.haorui.sdk.core.p002ad.fullscreenvideo.IFullScreenVideoAd
    public void showAd() {
        showReward(this.adWrapper.getContext());
    }

    @Override // cn.haorui.sdk.core.p002ad.reward.RewardVideoAd, cn.haorui.sdk.core.p002ad.fullscreenvideo.IFullScreenVideoAd
    public void showAd(Activity activity) {
        IAdSailAd iAdSailAd = this.nativeAd;
        if (iAdSailAd instanceof NativeAdDataImpl) {
            ((NativeAdDataImpl) iAdSailAd).setContext(activity);
        }
        showReward(activity);
    }
}
