package com.anythink.rewardvideo.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.AbstractC1165d;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import com.anythink.rewardvideo.p186a.C2406a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ATRewardVideoAd {
    public WeakReference<Activity> mActivityWef;
    public C2406a mAdLoadManager;
    public C1163b mAdSourceEventListener;
    public Context mContext;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATEventInterface mDownloadListener;
    public ATRewardVideoListener mListener;
    public String mPlacementId;
    public Map<String, Object> mTKExtraMap;
    public final String TAG = getClass().getSimpleName();
    private ATRewardVideoExListener mInterListener = new ATRewardVideoExListener() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1
        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onAgainReward(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.11
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(aTAdInfo, z);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoAd aTRewardVideoAd = ATRewardVideoAd.this;
                    ATRewardVideoListener aTRewardVideoListener = aTRewardVideoAd.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ATRewardVideoExListener aTRewardVideoExListener = (ATRewardVideoExListener) aTRewardVideoListener;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = aTRewardVideoAd.mContext;
                    }
                    aTRewardVideoExListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onReward(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onReward(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onRewardedVideoAdAgainPlayClicked(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.10
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onRewardedVideoAdAgainPlayEnd(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onRewardedVideoAdAgainPlayFailed(final AdError adError, final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.9
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(adError, aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public void onRewardedVideoAdAgainPlayStart(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdClosed(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdClosed(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdFailed(AdError adError) {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdLoaded() {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayClicked(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayClicked(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayEnd(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.13
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayEnd(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayFailed(final AdError adError, final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayFailed(adError, aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayStart(final ATAdInfo aTAdInfo) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.12
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayStart(aTAdInfo);
                    }
                }
            });
        }
    };
    public InterfaceC1162a adLoadListener = new InterfaceC1162a() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.2
        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public void onAdLoadFail(final AdError adError) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdFailed(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public void onAdLoaded() {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdLoaded();
                    }
                }
            });
        }
    };

    public ATRewardVideoAd(Context context, String str) {
        this.mPlacementId = str;
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityWef = new WeakReference<>((Activity) context);
        }
        this.mAdLoadManager = C2406a.m12430a(context, str);
    }

    private void controlShow(Activity activity, String str) {
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3191q, C1169h.n.f3199y, C1169h.n.f3188n, "");
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
            ATRewardVideoListener aTRewardVideoListener = this.mListener;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, C1171j.m2045a((AbstractC1165d) null));
            }
            Log.e(this.TAG, "SDK init error!");
            return;
        }
        if (activity == null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        Activity activity2 = activity;
        if (activity2 == null) {
            Log.e(this.TAG, "RewardedVideo Show Activity is null.");
        }
        this.mAdLoadManager.m12434a(activity2, str, this.mInterListener, this.mDownloadListener, this.mTKExtraMap);
    }

    public static void entryAdScenario(String str, String str2) {
        C1175n.m2059a().m2121a(str, str2, "1", (Map<String, Object>) null);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        C1175n.m2059a().m2121a(str, str2, "1", map);
    }

    private ATAdStatusInfo getAdStatus() {
        if (C1175n.m2059a().m2148f() != null && !TextUtils.isEmpty(C1175n.m2059a().m2165o()) && !TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            return this.mAdLoadManager.m12432a(this.mContext, this.mTKExtraMap);
        }
        Log.e(this.TAG, "SDK init error!");
        return null;
    }

    private Context getRequestContext() {
        WeakReference<Activity> weakReference = this.mActivityWef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity != null ? activity : this.mContext;
    }

    private boolean isPlaceStrategyNeedAutoLoad() {
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.mPlacementId);
        return c1396fM5139a != null && c1396fM5139a.m5088af() == 1;
    }

    private void load(Context context, int i, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1352p.m4215a(this.mPlacementId, C1169h.n.f3191q, C1169h.n.f3197w, C1169h.n.f3188n, "", true);
        this.mAdLoadManager.m12435a(context, i, this.adLoadListener, this.mAdSourceEventListener, this.mTKExtraMap, aTAdxBidFloorInfo);
    }

    public ATAdStatusInfo checkAdStatus() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new ATAdStatusInfo(false, false, null);
        }
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3191q, C1169h.n.f3171A, adStatus.toString(), "");
        return adStatus;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        C2406a c2406a = this.mAdLoadManager;
        if (c2406a != null) {
            return c2406a.m12433a(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean zIsReady = adStatus.isReady();
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3191q, C1169h.n.f3200z, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public void load() {
        load((Context) null);
    }

    public void load(Context context) {
        load(context, null);
    }

    public void load(Context context, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        if (context == null) {
            context = getRequestContext();
        }
        load(context, 0, aTAdxBidFloorInfo);
    }

    public void load(ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        load(null, aTAdxBidFloorInfo);
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    public void setAdListener(ATRewardVideoListener aTRewardVideoListener) {
        this.mListener = aTRewardVideoListener;
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new C1163b();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.m2015a(aTAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        C1387u.m4556a().m4566a(this.mPlacementId, map);
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    public void show(Activity activity) {
        controlShow(activity, "");
    }

    public void show(Activity activity, String str) {
        if (!C1344h.m4150c(str)) {
            str = "";
        }
        controlShow(activity, str);
    }
}
