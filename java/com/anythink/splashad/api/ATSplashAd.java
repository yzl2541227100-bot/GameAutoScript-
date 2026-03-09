package com.anythink.splashad.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATMediationRequestInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1262g;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p050a.C1151c;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.splashad.p187a.AbstractC2415a;
import com.anythink.splashad.p187a.AbstractC2416b;
import com.anythink.splashad.p187a.C2417c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ATSplashAd {
    public final int DEFAULT_SPLASH_TIMEOUT_TIME;
    public final String TAG;
    public WeakReference<Activity> mActivityWeakRef;
    public C2417c mAdLoadManager;
    public C1163b mAdSourceEventListener;
    public Context mContext;
    public String mDefaultAdSourceConfig;
    public ATMediationRequestInfo mDefaultRequestInfo;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATEventInterface mDownloadListener;
    public int mFetchAdTimeout;
    public ATSplashAdListener mListener;
    public String mPlacementId;
    public Map<String, Object> mTKExtraMap;

    /* JADX INFO: renamed from: com.anythink.splashad.api.ATSplashAd$1 */
    public class RunnableC24231 implements Runnable {
        public final /* synthetic */ ATAdxBidFloorInfo val$adxBidFloorInfo;
        public final /* synthetic */ Map val$finalTkExtraMap;
        public final /* synthetic */ int val$loadType;

        /* JADX INFO: renamed from: com.anythink.splashad.api.ATSplashAd$1$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractC2416b {
            public boolean hasCacheWhenTimeout = false;
            public final /* synthetic */ int val$finalTimeout;

            public AnonymousClass1(int i) {
                this.val$finalTimeout = i;
            }

            @Override // com.anythink.splashad.p187a.AbstractC2416b
            public void onAdLoaded(String str, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.1.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                        if (aTSplashAdListener != null) {
                            aTSplashAdListener.onAdLoaded(!anonymousClass1.hasCacheWhenTimeout && z);
                        }
                    }
                });
            }

            @Override // com.anythink.splashad.p187a.AbstractC2416b
            public void onNoAdError(String str, final AdError adError) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.1.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                        if (aTSplashAdListener != null) {
                            aTSplashAdListener.onNoAdError(adError);
                        }
                    }
                });
            }

            @Override // com.anythink.splashad.p187a.AbstractC2416b
            public void onTimeout(final String str) {
                int i;
                final C1262g c1262gM12466a = ATSplashAd.this.mAdLoadManager.m12466a(str);
                C1151c.a aVarM3603h = c1262gM12466a != null ? c1262gM12466a.m3603h() : null;
                new StringBuilder("onTimeout,hasAdxDefaultCache:").append(aVarM3603h != null);
                if (aVarM3603h != null) {
                    aVarM3603h.m1949b();
                }
                RunnableC24231 runnableC24231 = RunnableC24231.this;
                ATSplashAd aTSplashAd = ATSplashAd.this;
                C1234b c1234bM12471b = aTSplashAd.mAdLoadManager.m12471b(aTSplashAd.mContext, runnableC24231.val$finalTkExtraMap);
                if (c1234bM12471b != null) {
                    this.hasCacheWhenTimeout = true;
                    if (c1262gM12466a != null) {
                        if (aVarM3603h == null || aVarM3603h.m1953f() != c1234bM12471b) {
                            StringBuilder sb = new StringBuilder("has cache when timeout: ");
                            sb.append(ATSplashAd.this.mPlacementId);
                            sb.append(",type:2");
                            i = 9;
                        } else {
                            StringBuilder sb2 = new StringBuilder("has cache when timeout: ");
                            sb2.append(ATSplashAd.this.mPlacementId);
                            sb2.append(",type:1");
                            i = 11;
                        }
                        c1262gM12466a.m3589a(i);
                        C1322e.m3911a(ATSplashAd.this.mPlacementId, str, c1262gM12466a.m3604i(), "1", c1234bM12471b, this.val$finalTimeout);
                        return;
                    }
                }
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.1.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = ATSplashAd.this.mPlacementId;
                        String str3 = str;
                        C1262g c1262g = c1262gM12466a;
                        C1322e.m3911a(str2, str3, c1262g != null ? c1262g.m3604i() : null, "2", (C1234b) null, AnonymousClass1.this.val$finalTimeout);
                        ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                        if (aTSplashAdListener != null) {
                            aTSplashAdListener.onAdLoadTimeout();
                        }
                    }
                });
            }
        }

        public RunnableC24231(int i, Map map, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
            this.val$loadType = i;
            this.val$finalTkExtraMap = map;
            this.val$adxBidFloorInfo = aTAdxBidFloorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iM4729Z;
            boolean z;
            ATSplashAd aTSplashAd = ATSplashAd.this;
            int i = aTSplashAd.mFetchAdTimeout;
            if (i <= 0) {
                C1391a c1391aM4865b = C1392b.m4845a(aTSplashAd.mContext).m4865b(C1175n.m2059a().m2165o());
                iM4729Z = c1391aM4865b.m4729Z() == 0 ? 5000 : (int) c1391aM4865b.m4729Z();
                z = false;
            } else {
                iM4729Z = i;
                z = true;
            }
            WeakReference<Activity> weakReference = ATSplashAd.this.mActivityWeakRef;
            AnonymousClass1 anonymousClass1 = null;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (this.val$loadType == 0) {
                anonymousClass1 = new AnonymousClass1(iM4729Z);
                anonymousClass1.startCountDown(iM4729Z);
            }
            AnonymousClass1 anonymousClass12 = anonymousClass1;
            ATSplashAd aTSplashAd2 = ATSplashAd.this;
            C2417c c2417c = aTSplashAd2.mAdLoadManager;
            if (activity == null) {
                activity = aTSplashAd2.mContext;
            }
            c2417c.m12469a(activity, aTSplashAd2.mDefaultRequestInfo, aTSplashAd2.mDefaultAdSourceConfig, anonymousClass12, iM4729Z, z, this.val$loadType, aTSplashAd2.mAdSourceEventListener, this.val$finalTkExtraMap, this.val$adxBidFloorInfo);
        }
    }

    @Deprecated
    public ATSplashAd(Context context, String str, ATMediationRequestInfo aTMediationRequestInfo, ATSplashAdListener aTSplashAdListener) {
        this(context, str, aTMediationRequestInfo, aTSplashAdListener, 0);
    }

    @Deprecated
    public ATSplashAd(Context context, String str, ATMediationRequestInfo aTMediationRequestInfo, ATSplashAdListener aTSplashAdListener, int i) {
        this.TAG = getClass().getSimpleName();
        this.DEFAULT_SPLASH_TIMEOUT_TIME = 5000;
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mListener = aTSplashAdListener;
        this.mDefaultRequestInfo = aTMediationRequestInfo;
        this.mFetchAdTimeout = i;
        if (context instanceof Activity) {
            this.mActivityWeakRef = new WeakReference<>((Activity) context);
        }
        ATMediationRequestInfo aTMediationRequestInfo2 = this.mDefaultRequestInfo;
        if (aTMediationRequestInfo2 != null) {
            aTMediationRequestInfo2.setFormat("4");
        }
        this.mAdLoadManager = C2417c.m12461a(context, str);
    }

    public ATSplashAd(Context context, String str, ATSplashAdListener aTSplashAdListener) {
        this(context, str, aTSplashAdListener, 0, "");
    }

    public ATSplashAd(Context context, String str, ATSplashAdListener aTSplashAdListener, int i, String str2) {
        this.TAG = getClass().getSimpleName();
        this.DEFAULT_SPLASH_TIMEOUT_TIME = 5000;
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mListener = aTSplashAdListener;
        this.mDefaultAdSourceConfig = str2;
        this.mFetchAdTimeout = i;
        if (context instanceof Activity) {
            this.mActivityWeakRef = new WeakReference<>((Activity) context);
        }
        ATMediationRequestInfo aTMediationRequestInfo = this.mDefaultRequestInfo;
        if (aTMediationRequestInfo != null) {
            aTMediationRequestInfo.setFormat("4");
        }
        this.mAdLoadManager = C2417c.m12461a(context, str);
    }

    public ATSplashAd(Context context, String str, ATSplashAdListener aTSplashAdListener, String str2) {
        this(context, str, aTSplashAdListener, 0, str2);
    }

    public static void entryAdScenario(String str, String str2) {
        C1175n.m2059a().m2121a(str, str2, "4", (Map<String, Object>) null);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        C1175n.m2059a().m2121a(str, str2, "4", map);
    }

    private ATAdStatusInfo getAdStatus() {
        if (C1175n.m2059a().m2148f() != null && !TextUtils.isEmpty(C1175n.m2059a().m2165o()) && !TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            return this.mAdLoadManager.m12465a(this.mContext, this.mTKExtraMap);
        }
        Log.e(this.TAG, "SDK init error!");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd(int i, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1352p.m4215a(this.mPlacementId, C1169h.n.f3193s, C1169h.n.f3197w, C1169h.n.f3188n, "", true);
        C1335b.m3998a().m4005a(new RunnableC24231(i, this.mTKExtraMap != null ? new HashMap(this.mTKExtraMap) : new HashMap(), aTAdxBidFloorInfo));
    }

    public ATAdStatusInfo checkAdStatus() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new ATAdStatusInfo(false, false, null);
        }
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3193s, C1169h.n.f3171A, adStatus.toString(), "");
        return adStatus;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        C2417c c2417c = this.mAdLoadManager;
        if (c2417c != null) {
            return c2417c.m12467a(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean zIsReady = adStatus.isReady();
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3193s, C1169h.n.f3200z, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        loadAd(0, aTAdxBidFloorInfo);
    }

    @Deprecated
    public void onDestory() {
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    public void setAdListener(ATSplashAdListener aTSplashAdListener) {
        this.mListener = aTSplashAdListener;
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

    public void show(Activity activity, ViewGroup viewGroup) {
        show(activity, viewGroup, null, "");
    }

    public void show(Activity activity, ViewGroup viewGroup, ATSplashSkipInfo aTSplashSkipInfo) {
        show(activity, viewGroup, aTSplashSkipInfo, "");
    }

    public void show(Activity activity, ViewGroup viewGroup, ATSplashSkipInfo aTSplashSkipInfo, String str) {
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3193s, C1169h.n.f3199y, C1169h.n.f3188n, "");
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            Log.e(this.TAG, "SDK init error!");
            return;
        }
        if (activity == null) {
            Log.e(this.TAG, "Splash Activity is null.");
        }
        if (viewGroup == null) {
            Log.e(this.TAG, "Splash Container is null.");
        } else {
            this.mAdLoadManager.m12468a(activity, viewGroup, new AbstractC2415a() { // from class: com.anythink.splashad.api.ATSplashAd.2
                @Override // com.anythink.splashad.p187a.AbstractC2415a
                public void onAdClick(final ATAdInfo aTAdInfo) {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener != null) {
                                aTSplashAdListener.onAdClick(aTAdInfo);
                            }
                        }
                    });
                }

                @Override // com.anythink.splashad.p187a.AbstractC2415a
                public void onAdDismiss(final ATAdInfo aTAdInfo, final ATSplashAdExtraInfo aTSplashAdExtraInfo) {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener != null) {
                                aTSplashAdListener.onAdDismiss(aTAdInfo, aTSplashAdExtraInfo);
                            }
                        }
                    });
                }

                @Override // com.anythink.splashad.p187a.AbstractC2415a
                public void onAdShow(final ATAdInfo aTAdInfo) {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener != null) {
                                aTSplashAdListener.onAdShow(aTAdInfo);
                            }
                        }
                    });
                    if (ATSplashAd.this.mAdLoadManager.m12470a((ATAdStatusInfo) null)) {
                        ATSplashAd.this.loadAd(6, null);
                    }
                }

                @Override // com.anythink.splashad.p187a.AbstractC2415a
                public void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z) {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener == null || !(aTSplashAdListener instanceof ATSplashExListener)) {
                                return;
                            }
                            ((ATSplashExListener) aTSplashAdListener).onDeeplinkCallback(aTAdInfo, z);
                        }
                    });
                }

                @Override // com.anythink.splashad.p187a.AbstractC2415a
                public void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAd aTSplashAd = ATSplashAd.this;
                            ATSplashAdListener aTSplashAdListener = aTSplashAd.mListener;
                            if (aTSplashAdListener == null || !(aTSplashAdListener instanceof ATSplashExListener)) {
                                return;
                            }
                            ATSplashExListener aTSplashExListener = (ATSplashExListener) aTSplashAdListener;
                            Context context2 = context;
                            if (context2 == null) {
                                context2 = aTSplashAd.mContext;
                            }
                            aTSplashExListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                        }
                    });
                }
            }, this.mDownloadListener, aTSplashSkipInfo, str, this.mTKExtraMap);
        }
    }

    public void show(Activity activity, ViewGroup viewGroup, String str) {
        if (!C1344h.m4150c(str)) {
            str = "";
        }
        show(activity, viewGroup, null, str);
    }
}
