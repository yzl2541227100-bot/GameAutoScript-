package com.anythink.banner.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.banner.p008a.C0704a;
import com.anythink.banner.p008a.C0705b;
import com.anythink.banner.p008a.InterfaceC0706c;
import com.anythink.banner.p008a.InterfaceC0707d;
import com.anythink.banner.p009b.C0715a;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.p025ui.ThirdPartyBannerATView;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1324g;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p067a.AbstractC1327a;
import com.anythink.core.common.p066o.p067a.C1329c;
import com.anythink.core.common.p066o.p067a.C1332f;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ATBannerView extends FrameLayout implements InterfaceC0706c {
    private final String TAG;
    public InterfaceC1162a adLoadListener;
    private ATAdxBidFloorInfo adxBidFloorInfo;
    private boolean canRenderBanner;
    public boolean hasTouchWindow;
    public C1329c impressionTracker;
    private C0704a mAdLoadManager;
    public C1163b mAdSourceEventListener;
    private C0715a mBannerRefreshTimer;
    public CustomBannerAdapter mCustomBannerAd;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATEventInterface mDownloadListener;
    private InterfaceC0707d mInnerBannerListener;
    public boolean mIsRefresh;
    private View mLastShowBannerView;
    private ATBannerListener mListener;
    private String mPlacementId;
    private String mScenario;
    public Map<String, Object> mTKExtraMap;
    public C1332f.b visibilityChecker;

    public ATBannerView(Context context) {
        super(context);
        this.TAG = ATBannerView.class.getSimpleName();
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new InterfaceC0707d() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(C1171j.m2045a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(C1171j.m2045a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(C1171j.m2045a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(C1171j.m2045a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, C1171j.m2045a(customBannerAdapter), z);
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, C1171j.m2045a(customBannerAdapter), aTNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new InterfaceC1162a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public void onAdLoadFail(final AdError adError) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !ATBannerView.this.canRenderBanner) {
                            return;
                        }
                        ATBannerView aTBannerView = ATBannerView.this;
                        boolean z = aTBannerView.mIsRefresh;
                        ATBannerListener aTBannerListener = aTBannerView.mListener;
                        if (z) {
                            aTBannerListener.onBannerAutoRefreshFail(adError);
                        } else {
                            aTBannerListener.onBannerFailed(adError);
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager == null || !ATBannerView.this.isInView() || ATBannerView.this.mBannerRefreshTimer.m123a()) {
                    return;
                }
                String unused = ATBannerView.this.TAG;
                ATBannerView.this.mBannerRefreshTimer.m124b();
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public void onAdLoaded() {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new C0715a(this);
    }

    public ATBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = ATBannerView.class.getSimpleName();
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new InterfaceC0707d() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(C1171j.m2045a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(C1171j.m2045a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(C1171j.m2045a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(C1171j.m2045a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, C1171j.m2045a(customBannerAdapter), z);
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, C1171j.m2045a(customBannerAdapter), aTNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new InterfaceC1162a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public void onAdLoadFail(final AdError adError) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !ATBannerView.this.canRenderBanner) {
                            return;
                        }
                        ATBannerView aTBannerView = ATBannerView.this;
                        boolean z = aTBannerView.mIsRefresh;
                        ATBannerListener aTBannerListener = aTBannerView.mListener;
                        if (z) {
                            aTBannerListener.onBannerAutoRefreshFail(adError);
                        } else {
                            aTBannerListener.onBannerFailed(adError);
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager == null || !ATBannerView.this.isInView() || ATBannerView.this.mBannerRefreshTimer.m123a()) {
                    return;
                }
                String unused = ATBannerView.this.TAG;
                ATBannerView.this.mBannerRefreshTimer.m124b();
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public void onAdLoaded() {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new C0715a(this);
    }

    public ATBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = ATBannerView.class.getSimpleName();
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new InterfaceC0707d() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(C1171j.m2045a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(C1171j.m2045a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(C1171j.m2045a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(C1171j.m2045a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, C1171j.m2045a(customBannerAdapter), z);
                    }
                });
            }

            @Override // com.anythink.banner.p008a.InterfaceC0707d
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, C1171j.m2045a(customBannerAdapter), aTNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new InterfaceC1162a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public void onAdLoadFail(final AdError adError) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !ATBannerView.this.canRenderBanner) {
                            return;
                        }
                        ATBannerView aTBannerView = ATBannerView.this;
                        boolean z = aTBannerView.mIsRefresh;
                        ATBannerListener aTBannerListener = aTBannerView.mListener;
                        if (z) {
                            aTBannerListener.onBannerAutoRefreshFail(adError);
                        } else {
                            aTBannerListener.onBannerFailed(adError);
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager == null || !ATBannerView.this.isInView() || ATBannerView.this.mBannerRefreshTimer.m123a()) {
                    return;
                }
                String unused = ATBannerView.this.TAG;
                ATBannerView.this.mBannerRefreshTimer.m124b();
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1162a
            public void onAdLoaded() {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new C0715a(this);
    }

    private boolean checkVisibilityPercent() {
        if (this.visibilityChecker == null) {
            this.visibilityChecker = new C1332f.b();
        }
        if (getParent() != null) {
            return this.visibilityChecker.m3987a((View) getParent(), this, 80, 0);
        }
        return false;
    }

    public static void entryAdScenario(String str, String str2) {
        entryAdScenario(str, str2, null);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        C1175n.m2059a().m2121a(str, str2, "2", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1234b getBannerCache() {
        return this.mAdLoadManager.m116b(getContext(), this.mTKExtraMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInView() {
        if (this.hasTouchWindow && isShown()) {
            return this.mCustomBannerAd == null || checkVisibilityPercent();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRefreshOpen() {
        C1396f c1396fM5139a = C1398h.m5135a(getContext().getApplicationContext()).m5139a(this.mPlacementId);
        return c1396fM5139a != null && c1396fM5139a.m5088af() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd(int i) {
        C1352p.m4215a(this.mPlacementId, C1169h.n.f3189o, C1169h.n.f3197w, C1169h.n.f3188n, "", true);
        this.mIsRefresh = i == 1;
        if (i == 0) {
            this.canRenderBanner = true;
        }
        C0704a c0704a = this.mAdLoadManager;
        if (c0704a != null) {
            c0704a.m113a(getContext(), i, this.adLoadListener, this.mAdSourceEventListener, this.mTKExtraMap, this.adxBidFloorInfo);
        } else {
            this.adLoadListener.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerImpression(final Context context, final ATBaseAdAdapter aTBaseAdAdapter, final boolean z) {
        final C1243h trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.6
            @Override // java.lang.Runnable
            public void run() {
                trackingInfo.m3056a(aTBaseAdAdapter.getNetworkInfoMap());
                C1352p.m4208a(trackingInfo, C1169h.n.f3177c, C1169h.n.f3186l, "");
                C1320c.m3839a(context).m3852a(4, trackingInfo, aTBaseAdAdapter.getUnitGroupInfo());
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            C1171j c1171jM2045a = C1171j.m2045a(aTBaseAdAdapter);
                            if (c1171jM2045a.getNetworkFirmId() == -1) {
                                C1324g.m3940a(C1169h.j.f3157c, aTBaseAdAdapter, null);
                            }
                            RunnableC07136 runnableC07136 = RunnableC07136.this;
                            if (aTBaseAdAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(c1171jM2045a);
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(c1171jM2045a);
                            }
                        }
                    }
                });
            }
        }, 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerShow(final Context context, final C1234b c1234b, final boolean z) {
        final ATBaseAdAdapter aTBaseAdAdapterM2904d = c1234b.m2904d();
        final C1243h trackingInfo = aTBaseAdAdapterM2904d.getTrackingInfo();
        trackingInfo.m2677ah();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (trackingInfo != null && TextUtils.isEmpty(trackingInfo.m3129t())) {
            trackingInfo.m3095h(C1344h.m4135a(trackingInfo.m2678ai(), trackingInfo.m3026F(), jCurrentTimeMillis));
        }
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (trackingInfo != null) {
                    C1358v.m4252a(ATBannerView.this.getContext(), trackingInfo);
                    C1148a.m1904a().m1916a(context.getApplicationContext(), c1234b);
                    C1320c.m3839a(context).m3853a(13, trackingInfo, aTBaseAdAdapterM2904d.getUnitGroupInfo(), jCurrentTimeMillis);
                    if (aTBaseAdAdapterM2904d.supportImpressionCallback()) {
                        return;
                    }
                    ATBannerView.this.notifyBannerImpression(context, aTBaseAdAdapterM2904d, z);
                }
            }
        }, 2, true);
    }

    private void registerDelayShow(View view, final Context context, final C1234b c1234b, CustomBannerAdapter customBannerAdapter, final boolean z) {
        if (view == null) {
            view = this;
        }
        C1329c c1329c = this.impressionTracker;
        if (c1329c != null) {
            c1329c.m3964a(view, new AbstractC1327a() { // from class: com.anythink.banner.api.ATBannerView.3
                @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
                public final int getImpressionMinPercentageViewed() {
                    return 50;
                }

                @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
                public final int getImpressionMinTimeViewed() {
                    return 0;
                }

                @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
                public final void recordImpression(View view2) {
                    ATBannerView.this.notifyBannerShow(context, c1234b, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBannerView(final C1234b c1234b, boolean z) {
        boolean z3;
        CustomBannerAdapter customBannerAdapter = (c1234b == null || !(c1234b.m2904d() instanceof CustomBannerAdapter)) ? null : (CustomBannerAdapter) c1234b.m2904d();
        CustomBannerAdapter customBannerAdapter2 = this.mCustomBannerAd;
        if (customBannerAdapter2 == null || customBannerAdapter2.getUnitGroupInfo() == null) {
            z3 = false;
        } else {
            z3 = customBannerAdapter2.getUnitGroupInfo().m2784d() == 11;
        }
        if (customBannerAdapter != null) {
            if (customBannerAdapter2 != null && !z3) {
                customBannerAdapter2.internalDestory();
            }
            View view = this.mLastShowBannerView;
            if (view instanceof ThirdPartyBannerATView) {
                ((ThirdPartyBannerATView) view).destroy();
                this.mLastShowBannerView = null;
            }
            View viewM110a = this.mAdLoadManager.m110a(getContext().getApplicationContext(), c1234b, customBannerAdapter, new C0705b(this.mInnerBannerListener, customBannerAdapter, z));
            if (viewM110a instanceof ThirdPartyBannerATView) {
                this.mLastShowBannerView = viewM110a;
            }
            if (viewM110a != null && viewM110a.getParent() != null && viewM110a.getParent() != this) {
                ((ViewGroup) viewM110a.getParent()).removeView(viewM110a);
            }
            this.mCustomBannerAd = customBannerAdapter;
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.7
                @Override // java.lang.Runnable
                public final void run() {
                    C1148a.m1904a().m1917a(c1234b);
                }
            }, 2, true);
            if (viewM110a != null) {
                C1243h trackingInfo = this.mCustomBannerAd.getTrackingInfo();
                trackingInfo.f4134B = this.mScenario;
                C1358v.m4258a(this.mTKExtraMap, trackingInfo);
                C1358v.m4256a(this.mPlacementId, trackingInfo);
                if (isInView()) {
                    notifyBannerShow(getContext().getApplicationContext(), c1234b, z);
                } else {
                    registerDelayShow(viewM110a, getContext().getApplicationContext(), c1234b, customBannerAdapter, z);
                }
                IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                if (iExHandlerM2132b != null) {
                    customBannerAdapter.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customBannerAdapter, null, this.mDownloadListener));
                }
                removeAllViews();
                int i = viewM110a.getLayoutParams() != null ? viewM110a.getLayoutParams().width : 0;
                if (i == 0) {
                    i = -2;
                }
                int i2 = viewM110a.getLayoutParams() != null ? viewM110a.getLayoutParams().height : 0;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2 > 0 ? i2 : -2);
                layoutParams.gravity = 17;
                viewM110a.setLayoutParams(layoutParams);
                if (viewM110a.getParent() instanceof ViewGroup) {
                    ((ViewGroup) viewM110a.getParent()).removeView(viewM110a);
                }
                addView(viewM110a, layoutParams);
            } else {
                Log.e(this.TAG, "Network's banner view = null. Did you call destroy()?");
            }
            this.mAdLoadManager.m114a(c1234b);
            this.mBannerRefreshTimer.m121a(this.mCustomBannerAd);
            this.mBannerRefreshTimer.m124b();
            if (customBannerAdapter2 != null && z3) {
                customBannerAdapter2.internalDestory();
            }
            if (isRefreshOpen()) {
                loadAd(1);
            }
        }
    }

    public ATAdStatusInfo checkAdStatus() {
        if (C1175n.m2059a().m2148f() == null || TextUtils.isEmpty(C1175n.m2059a().m2165o()) || TextUtils.isEmpty(C1175n.m2059a().m2167p())) {
            Log.e(this.TAG, "SDK init error!");
            return new ATAdStatusInfo(false, false, null);
        }
        C0704a c0704a = this.mAdLoadManager;
        if (c0704a == null) {
            Log.e(this.TAG, "PlacementId is empty!");
            return new ATAdStatusInfo(false, false, null);
        }
        ATAdStatusInfo aTAdStatusInfoM111a = c0704a.m111a(getContext(), this.mTKExtraMap);
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3189o, C1169h.n.f3171A, aTAdStatusInfoM111a.toString(), "");
        return aTAdStatusInfoM111a;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        C0704a c0704a = this.mAdLoadManager;
        if (c0704a != null) {
            return c0704a.m112a(getContext());
        }
        return null;
    }

    public void controlShow() {
        if (this.mAdLoadManager == null) {
            return;
        }
        final boolean z = this.mIsRefresh;
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ATBannerView.this.mAdLoadManager) {
                    if (!ATBannerView.this.canRenderBanner) {
                        String unused = ATBannerView.this.TAG;
                        return;
                    }
                    final C1234b bannerCache = ATBannerView.this.getBannerCache();
                    boolean z3 = false;
                    if (bannerCache != null) {
                        if (ATBannerView.this.isInView()) {
                            bannerCache.m2894a(bannerCache.m2902c() + 1);
                            ATBannerView.this.canRenderBanner = false;
                            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.4.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RunnableC07114 runnableC07114 = RunnableC07114.this;
                                    ATBannerView.this.renderBannerView(bannerCache, z);
                                }
                            });
                        } else {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (aTBannerView.hasTouchWindow && aTBannerView.isShown()) {
                                z3 = true;
                            }
                            String unused2 = ATBannerView.this.TAG;
                        }
                    } else if (ATBannerView.this.isRefreshOpen() && ATBannerView.this.mAdLoadManager != null && !ATBannerView.this.mAdLoadManager.m115a()) {
                        ATBannerView.this.loadAd(1);
                        ATBannerView aTBannerView2 = ATBannerView.this;
                        if (aTBannerView2.hasTouchWindow && aTBannerView2.isShown()) {
                            z3 = true;
                        }
                    }
                    if (z3 && ATBannerView.this.mBannerRefreshTimer != null) {
                        ATBannerView.this.mBannerRefreshTimer.m124b();
                    }
                }
            }
        }, 2, true);
    }

    public void destroy() {
        removeAllViews();
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        if (customBannerAdapter != null) {
            customBannerAdapter.internalDestory();
        }
        C0715a c0715a = this.mBannerRefreshTimer;
        if (c0715a != null) {
            c0715a.m125c();
        }
        C1329c c1329c = this.impressionTracker;
        if (c1329c != null) {
            c1329c.m3962a();
        }
        if (this.mAdLoadManager != null) {
            C0704a.m109a(this.mPlacementId);
        }
        View view = this.mLastShowBannerView;
        if (view instanceof ThirdPartyBannerATView) {
            ((ThirdPartyBannerATView) view).destroy();
            this.mLastShowBannerView = null;
        }
    }

    public void loadAd() {
        loadAd(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.hasTouchWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hasTouchWindow = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            controlShow();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            controlShow();
        }
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        IExHandler iExHandlerM2132b;
        this.mDownloadListener = aTEventInterface;
        if (this.mCustomBannerAd == null || (iExHandlerM2132b = C1175n.m2059a().m2132b()) == null) {
            return;
        }
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        customBannerAdapter.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customBannerAdapter, null, this.mDownloadListener));
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new C1163b();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.m2015a(aTAdSourceStatusListener);
    }

    public void setAdxBidFloorInfo(ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        this.adxBidFloorInfo = aTAdxBidFloorInfo;
    }

    public void setBannerAdListener(ATBannerListener aTBannerListener) {
        this.mListener = aTBannerListener;
    }

    public void setLocalExtra(Map<String, Object> map) {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
        } else {
            C1387u.m4556a().m4566a(this.mPlacementId, map);
        }
    }

    public void setPlacementId(String str) {
        this.mAdLoadManager = C0704a.m108a(getContext(), str);
        this.mPlacementId = str;
        this.mBannerRefreshTimer.m122a(str);
        if (this.impressionTracker == null) {
            getContext();
            this.impressionTracker = new C1329c(50);
        }
    }

    public void setScenario(String str) {
        if (C1344h.m4150c(str)) {
            this.mScenario = str;
        }
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    @Override // com.anythink.banner.p008a.InterfaceC0706c
    public void timeUpRefreshView() {
        this.canRenderBanner = true;
        controlShow();
    }
}
