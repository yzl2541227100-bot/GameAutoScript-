package com.anythink.nativead.api;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1173l;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p065n.C1324g;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.nativead.p184a.C2358b;
import com.anythink.nativead.unitgroup.AbstractC2372a;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class NativeAd {
    private boolean hasSetShowTkDetail;
    private C1234b mAdCacheInfo;
    public AbstractC2372a mBaseNativeAd;
    public DownloadConfirmListener mConfirmListener;
    private Context mContext;
    private ATNativeDislikeListener mDislikeListener;
    public ATEventInterface mEventInterface;
    private boolean mIsDestroyed;
    private ATNativeEventListener mNativeEventListener;
    public ATNativeAdView mNativeView;
    private String mPlacementId;
    private boolean mRecordedImpression;
    private boolean mRecordedShow;
    public ATNativeMaterial nativeMaterial;
    private final String TAG = getClass().getSimpleName();
    private boolean hasCallPrepareApi = false;
    private boolean hasCallPrepareRenderApi = false;
    private boolean hasReportRenderTypeAgent = false;
    public View.OnClickListener mDefaultCloseViewListener = new View.OnClickListener() { // from class: com.anythink.nativead.api.NativeAd.5
        public ViewOnClickListenerC23675() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
            if (abstractC2372a != null) {
                abstractC2372a.notifyAdDislikeClick();
            }
        }
    };
    public boolean isManualImpressionTrack = false;

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$1 */
    public class C23611 implements InterfaceC1173l {
        public C23611() {
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdClicked(View view) {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleClick(nativeAd.mNativeView, view);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdDislikeButtonClick() {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdImpressed() {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleImpression(nativeAd.mNativeView);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdVideoEnd() {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleVideoEnd(nativeAd.mNativeView);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdVideoProgress(int i) {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleVideoProgress(nativeAd.mNativeView, i);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdVideoStart() {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleVideoStart(nativeAd.mNativeView);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onDeeplinkCallback(boolean z) {
            NativeAd nativeAd = NativeAd.this;
            nativeAd.handleDeeplinkCallback(nativeAd.mNativeView, z);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            NativeAd.this.handleDownloadConfirm(context, view, aTNetworkConfirmInfo);
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$10 */
    public class RunnableC236210 implements Runnable {
        public final /* synthetic */ ATNativeAdView val$view;

        public RunnableC236210(ATNativeAdView aTNativeAdView) {
            aTNativeAdView = aTNativeAdView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mNativeEventListener != null) {
                NativeAd.this.mNativeEventListener.onAdVideoStart(aTNativeAdView);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$11 */
    public class RunnableC236311 implements Runnable {
        public final /* synthetic */ ATNativeAdView val$view;

        public RunnableC236311(ATNativeAdView aTNativeAdView) {
            aTNativeAdView = aTNativeAdView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mDislikeListener != null) {
                ATNativeDislikeListener aTNativeDislikeListener = NativeAd.this.mDislikeListener;
                ATNativeAdView aTNativeAdView = aTNativeAdView;
                NativeAd nativeAd = NativeAd.this;
                aTNativeDislikeListener.onAdCloseButtonClick(aTNativeAdView, C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d()));
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$2 */
    public class RunnableC23642 implements Runnable {
        public final /* synthetic */ ATNativeAdView val$view;

        public RunnableC23642(ATNativeAdView aTNativeAdView) {
            aTNativeAdView = aTNativeAdView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mNativeEventListener != null) {
                NativeAd.this.mNativeEventListener.onAdVideoEnd(aTNativeAdView);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$3 */
    public class RunnableC23653 implements Runnable {
        public final /* synthetic */ int val$progress;
        public final /* synthetic */ ATNativeAdView val$view;

        public RunnableC23653(ATNativeAdView aTNativeAdView, int i) {
            aTNativeAdView = aTNativeAdView;
            i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mNativeEventListener != null) {
                NativeAd.this.mNativeEventListener.onAdVideoProgress(aTNativeAdView, i);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$4 */
    public class C23664 implements ImpressionEventListener {
        public C23664() {
        }

        @Override // com.anythink.nativead.api.NativeAd.ImpressionEventListener
        public final void onImpression() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
            C1243h detail = abstractC2372a != null ? abstractC2372a.getDetail() : null;
            if (detail != null && TextUtils.isEmpty(detail.m3129t())) {
                detail.m3095h(C1344h.m4135a(detail.m2678ai(), detail.m3026F(), jCurrentTimeMillis));
            }
            AbstractC2372a abstractC2372a2 = NativeAd.this.mBaseNativeAd;
            if (abstractC2372a2 instanceof CustomNativeAd) {
                ((CustomNativeAd) abstractC2372a2).setShowId(detail.m3129t());
            }
            NativeAd nativeAd = NativeAd.this;
            nativeAd.recordShow(nativeAd.mNativeView);
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$5 */
    public class ViewOnClickListenerC23675 implements View.OnClickListener {
        public ViewOnClickListenerC23675() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
            if (abstractC2372a != null) {
                abstractC2372a.notifyAdDislikeClick();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$6 */
    public class RunnableC23686 implements Runnable {
        public final /* synthetic */ C1243h val$adTrackingInfo;

        public RunnableC23686(C1243h c1243h) {
            c1243h = c1243h;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mIsDestroyed || NativeAd.this.mAdCacheInfo == null) {
                return;
            }
            NativeAd.this.fillShowTrackingInfo(c1243h);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                jCurrentTimeMillis = Long.parseLong(c1243h.m3129t().split("_")[r2.length - 1]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            long j = jCurrentTimeMillis;
            AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
            if (abstractC2372a != null && (abstractC2372a instanceof CustomNativeAd)) {
                ((CustomNativeAd) abstractC2372a).setShowId(c1243h.m3129t());
            }
            C1148a.m1904a().m1916a(NativeAd.this.mContext.getApplicationContext(), NativeAd.this.mAdCacheInfo);
            C1320c.m3839a(NativeAd.this.mContext).m3853a(13, c1243h, NativeAd.this.mAdCacheInfo.m2904d().getUnitGroupInfo(), j);
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$7 */
    public class RunnableC23697 implements Runnable {
        public final /* synthetic */ ATNativeAdView val$view;

        /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$7$1 */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ATAdInfo val$atAdInfo;

            public AnonymousClass1(ATAdInfo aTAdInfo) {
                aTAdInfo = aTAdInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdImpressed(aTNativeAdView, aTAdInfo);
                }
            }
        }

        public RunnableC23697(ATNativeAdView aTNativeAdView) {
            aTNativeAdView = aTNativeAdView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NativeAd.this.mIsDestroyed) {
                return;
            }
            try {
                AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
                if (abstractC2372a != null) {
                    C1243h detail = abstractC2372a.getDetail();
                    detail.m3056a(NativeAd.this.mBaseNativeAd.getNetworkInfoMap());
                    C1352p.m4208a(detail, C1169h.n.f3177c, C1169h.n.f3186l, "");
                    NativeAd.this.fillShowTrackingInfo(detail);
                    NativeAd.this.fillRenderAreaToTrackingInfo(detail, aTNativeAdView);
                    C1320c.m3839a(NativeAd.this.mContext.getApplicationContext()).m3852a(4, detail, NativeAd.this.mAdCacheInfo.m2904d().getUnitGroupInfo());
                    NativeAd nativeAd = NativeAd.this;
                    C1171j c1171jM2044a = C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d());
                    if (c1171jM2044a.getNetworkFirmId() == -1) {
                        C1324g.m3940a(C1169h.j.f3155a, NativeAd.this.mAdCacheInfo.m2904d(), NativeAd.this.mBaseNativeAd);
                    }
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.7.1
                        public final /* synthetic */ ATAdInfo val$atAdInfo;

                        public AnonymousClass1(ATAdInfo c1171jM2044a2) {
                            aTAdInfo = c1171jM2044a2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (NativeAd.this.mNativeEventListener != null) {
                                NativeAd.this.mNativeEventListener.onAdImpressed(aTNativeAdView, aTAdInfo);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
                Log.e("NativeAd", "BaseNativeAd has been destotyed.");
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$8 */
    public class RunnableC23708 implements Runnable {
        public final /* synthetic */ boolean val$isSuccess;
        public final /* synthetic */ ATNativeAdView val$view;

        public RunnableC23708(ATNativeAdView aTNativeAdView, boolean z) {
            aTNativeAdView = aTNativeAdView;
            z = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mNativeEventListener == null || !(NativeAd.this.mNativeEventListener instanceof ATNativeEventExListener)) {
                return;
            }
            ATNativeEventExListener aTNativeEventExListener = (ATNativeEventExListener) NativeAd.this.mNativeEventListener;
            ATNativeAdView aTNativeAdView = aTNativeAdView;
            NativeAd nativeAd = NativeAd.this;
            aTNativeEventExListener.onDeeplinkCallback(aTNativeAdView, C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d()), z);
        }
    }

    /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$9 */
    public class RunnableC23719 implements Runnable {
        public final /* synthetic */ ATNativeAdView val$view;

        public RunnableC23719(ATNativeAdView aTNativeAdView) {
            aTNativeAdView = aTNativeAdView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeAd.this.mNativeEventListener != null) {
                ATNativeEventListener aTNativeEventListener = NativeAd.this.mNativeEventListener;
                ATNativeAdView aTNativeAdView = aTNativeAdView;
                NativeAd nativeAd = NativeAd.this;
                aTNativeEventListener.onAdClicked(aTNativeAdView, C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d()));
            }
        }
    }

    public interface DownloadConfirmListener {
        void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo);
    }

    public interface ImpressionEventListener {
        void onImpression();
    }

    public NativeAd(Context context, String str, C1234b c1234b) {
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mAdCacheInfo = c1234b;
        AbstractC2372a abstractC2372a = (AbstractC2372a) c1234b.m2905e();
        this.mBaseNativeAd = abstractC2372a;
        abstractC2372a.setNativeEventListener(new InterfaceC1173l() { // from class: com.anythink.nativead.api.NativeAd.1
            public C23611() {
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdClicked(View view) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleClick(nativeAd.mNativeView, view);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdDislikeButtonClick() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdImpressed() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleImpression(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdVideoEnd() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoEnd(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdVideoProgress(int i) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoProgress(nativeAd.mNativeView, i);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdVideoStart() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoStart(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onDeeplinkCallback(boolean z) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleDeeplinkCallback(nativeAd.mNativeView, z);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onDownloadConfirmCallback(Context context2, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                NativeAd.this.handleDownloadConfirm(context2, view, aTNetworkConfirmInfo);
            }
        });
        AbstractC2372a abstractC2372a2 = this.mBaseNativeAd;
        if (abstractC2372a2 instanceof CustomNativeAd) {
            this.nativeMaterial = new C2358b((CustomNativeAd) abstractC2372a2);
        }
    }

    private void bindListener() {
        ATNativePrepareInfo nativePrepareInfo;
        View closeView;
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a instanceof CustomNativeAd) {
            CustomNativeAd customNativeAd = (CustomNativeAd) abstractC2372a;
            if (customNativeAd.checkHasCloseViewListener() || (nativePrepareInfo = customNativeAd.getNativePrepareInfo()) == null || (closeView = nativePrepareInfo.getCloseView()) == null) {
                return;
            }
            closeView.setOnClickListener(this.mDefaultCloseViewListener);
        }
    }

    private void checkBindView(ATNativePrepareInfo aTNativePrepareInfo) {
        if (aTNativePrepareInfo == null) {
            return;
        }
        if (aTNativePrepareInfo.getTitleView() == null) {
            printNotSetViewLog("titleView");
        }
        if (aTNativePrepareInfo.getCtaView() == null) {
            printNotSetViewLog("ctaView");
        }
        if (aTNativePrepareInfo.getDescView() == null) {
            printNotSetViewLog("descView");
        }
        if (aTNativePrepareInfo.getIconView() == null) {
            printNotSetViewLog("iconView");
        }
        if (aTNativePrepareInfo.getMainImageView() == null) {
            printNotSetViewLog("mainImageView");
        }
    }

    private void checkToReportRenderErrorAgent(boolean z) {
        C1243h detail;
        try {
            if ((this.mRecordedShow && this.mRecordedImpression) || this.hasReportRenderTypeAgent) {
                return;
            }
            this.hasReportRenderTypeAgent = true;
            AbstractC2372a abstractC2372a = this.mBaseNativeAd;
            if (abstractC2372a == null || (detail = abstractC2372a.getDetail()) == null || detail.m3039P() != 66) {
                return;
            }
            String str = "1";
            String str2 = this.hasCallPrepareRenderApi ? "1" : "2";
            String str3 = this.hasCallPrepareApi ? "1" : "2";
            if (this.mRecordedShow || this.mRecordedImpression) {
                str = !this.mRecordedImpression ? "2" : "";
            }
            String str4 = "0";
            if (z) {
                str = "3";
                str3 = "0";
            } else {
                str4 = str2;
            }
            Map<String, Object> networkInfoMap = this.mBaseNativeAd.getNetworkInfoMap();
            Object obj = networkInfoMap.get("dsp_id");
            Object obj2 = networkInfoMap.get("offer_id");
            C1322e.m3888a(detail, str, str4, str3, obj != null ? obj.toString() : "", obj2 != null ? obj2.toString() : "");
        } catch (Throwable th) {
            new StringBuilder("checkToReportRenderErrorAgent, error: ").append(th.getMessage());
            th.printStackTrace();
        }
    }

    public void fillRenderAreaToTrackingInfo(C1243h c1243h, ATNativeAdView aTNativeAdView) {
        if (c1243h == null || aTNativeAdView == null || c1243h.m3039P() != 66) {
            return;
        }
        c1243h.m3051a(aTNativeAdView.getWidth(), aTNativeAdView.getHeight());
    }

    public synchronized void fillShowTrackingInfo(C1243h c1243h) {
        if (!this.hasSetShowTkDetail) {
            this.hasSetShowTkDetail = true;
            if (c1243h != null) {
                C1358v.m4252a(this.mContext, c1243h);
            }
        }
    }

    private void printNotSetViewLog(String str) {
        Log.w(this.TAG, "The " + str + " is not set, it may cause the ad to not be clicked normally.");
    }

    private void renderViewToWindow(View view) {
        C1352p.m4217b(this.mPlacementId, C1169h.n.f3192r, C1169h.n.f3199y, C1169h.n.f3188n, "");
        ViewGroup customAdContainer = this.mBaseNativeAd.getCustomAdContainer();
        int iHashCode = hashCode();
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (customAdContainer != null) {
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            customAdContainer.addView(view);
        }
        if (customAdContainer != null) {
            view = customAdContainer;
        }
        this.mNativeView.renderView(iHashCode, view, new ImpressionEventListener() { // from class: com.anythink.nativead.api.NativeAd.4
            public C23664() {
            }

            @Override // com.anythink.nativead.api.NativeAd.ImpressionEventListener
            public final void onImpression() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
                C1243h detail = abstractC2372a != null ? abstractC2372a.getDetail() : null;
                if (detail != null && TextUtils.isEmpty(detail.m3129t())) {
                    detail.m3095h(C1344h.m4135a(detail.m2678ai(), detail.m3026F(), jCurrentTimeMillis));
                }
                AbstractC2372a abstractC2372a2 = NativeAd.this.mBaseNativeAd;
                if (abstractC2372a2 instanceof CustomNativeAd) {
                    ((CustomNativeAd) abstractC2372a2).setShowId(detail.m3129t());
                }
                NativeAd nativeAd = NativeAd.this;
                nativeAd.recordShow(nativeAd.mNativeView);
            }
        });
    }

    public synchronized void clear(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        try {
            AbstractC2372a abstractC2372a = this.mBaseNativeAd;
            if (abstractC2372a != null) {
                abstractC2372a.clear(this.mNativeView);
            }
        } catch (Throwable unused) {
        }
        ATNativeAdView aTNativeAdView2 = this.mNativeView;
        if (aTNativeAdView2 != null) {
            aTNativeAdView2.clearImpressionListener(hashCode());
            this.mNativeView = null;
        }
    }

    public synchronized void destory() {
        if (this.mIsDestroyed) {
            return;
        }
        checkToReportRenderErrorAgent(false);
        clear(this.mNativeView);
        this.mIsDestroyed = true;
        this.mNativeEventListener = null;
        this.mDislikeListener = null;
        this.mDefaultCloseViewListener = null;
        this.mNativeView = null;
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a != null) {
            abstractC2372a.setNativePrepareInfo(null);
            this.mBaseNativeAd.destroy();
        }
    }

    public void finalize() throws Throwable {
        checkToReportRenderErrorAgent(false);
        super.finalize();
    }

    public ATAdInfo getAdInfo() {
        return C1171j.m2044a(this.mBaseNativeAd, this.mAdCacheInfo.m2904d());
    }

    public int getAdInteractionType() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) abstractC2372a).getNativeAdInteractionType();
    }

    public ATNativeMaterial getAdMaterial() {
        return this.nativeMaterial;
    }

    @Deprecated
    public ATCustomVideo getCustomVideo() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return null;
        }
        return ((CustomNativeAd) abstractC2372a).getNativeCustomVideo();
    }

    public int getDownloadProgress() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return 0;
        }
        return abstractC2372a.getDownloadProgress();
    }

    public int getDownloadStatus() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return 0;
        }
        return abstractC2372a.getDownloadStatus();
    }

    public int getNativeType() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) abstractC2372a).getNativeType();
    }

    public double getVideoDuration() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return 0.0d;
        }
        return ((CustomNativeAd) abstractC2372a).getVideoDuration();
    }

    public double getVideoProgress() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return 0.0d;
        }
        return ((CustomNativeAd) abstractC2372a).getVideoProgress();
    }

    public synchronized void handleAdDislikeButtonClick(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.11
            public final /* synthetic */ ATNativeAdView val$view;

            public RunnableC236311(ATNativeAdView aTNativeAdView2) {
                aTNativeAdView = aTNativeAdView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mDislikeListener != null) {
                    ATNativeDislikeListener aTNativeDislikeListener = NativeAd.this.mDislikeListener;
                    ATNativeAdView aTNativeAdView2 = aTNativeAdView;
                    NativeAd nativeAd = NativeAd.this;
                    aTNativeDislikeListener.onAdCloseButtonClick(aTNativeAdView2, C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d()));
                }
            }
        });
    }

    public synchronized void handleClick(ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a != null) {
            C1243h detail = abstractC2372a.getDetail();
            C1352p.m4208a(detail, C1169h.n.f3178d, C1169h.n.f3186l, "");
            C1320c.m3839a(this.mContext.getApplicationContext()).m3851a(6, detail);
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.9
            public final /* synthetic */ ATNativeAdView val$view;

            public RunnableC23719(ATNativeAdView aTNativeAdView2) {
                aTNativeAdView = aTNativeAdView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    ATNativeEventListener aTNativeEventListener = NativeAd.this.mNativeEventListener;
                    ATNativeAdView aTNativeAdView2 = aTNativeAdView;
                    NativeAd nativeAd = NativeAd.this;
                    aTNativeEventListener.onAdClicked(aTNativeAdView2, C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d()));
                }
            }
        });
    }

    public synchronized void handleDeeplinkCallback(ATNativeAdView aTNativeAdView, boolean z) {
        if (this.mIsDestroyed) {
            return;
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.8
            public final /* synthetic */ boolean val$isSuccess;
            public final /* synthetic */ ATNativeAdView val$view;

            public RunnableC23708(ATNativeAdView aTNativeAdView2, boolean z3) {
                aTNativeAdView = aTNativeAdView2;
                z = z3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener == null || !(NativeAd.this.mNativeEventListener instanceof ATNativeEventExListener)) {
                    return;
                }
                ATNativeEventExListener aTNativeEventExListener = (ATNativeEventExListener) NativeAd.this.mNativeEventListener;
                ATNativeAdView aTNativeAdView2 = aTNativeAdView;
                NativeAd nativeAd = NativeAd.this;
                aTNativeEventExListener.onDeeplinkCallback(aTNativeAdView2, C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d()), z);
            }
        });
    }

    public synchronized void handleDownloadConfirm(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        AbstractC2372a abstractC2372a;
        if (this.mIsDestroyed) {
            return;
        }
        DownloadConfirmListener downloadConfirmListener = this.mConfirmListener;
        if (downloadConfirmListener != null && (abstractC2372a = this.mBaseNativeAd) != null) {
            if (context == null) {
                context = this.mContext;
            }
            downloadConfirmListener.onDownloadConfirm(context, C1171j.m2044a(abstractC2372a, this.mAdCacheInfo.m2904d()), view, aTNetworkConfirmInfo);
        }
    }

    public synchronized void handleImpression(ATNativeAdView aTNativeAdView) {
        if (!this.mRecordedImpression && !this.mIsDestroyed) {
            this.mRecordedImpression = true;
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.7
                public final /* synthetic */ ATNativeAdView val$view;

                /* JADX INFO: renamed from: com.anythink.nativead.api.NativeAd$7$1 */
                public class AnonymousClass1 implements Runnable {
                    public final /* synthetic */ ATAdInfo val$atAdInfo;

                    public AnonymousClass1(ATAdInfo c1171jM2044a2) {
                        aTAdInfo = c1171jM2044a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (NativeAd.this.mNativeEventListener != null) {
                            NativeAd.this.mNativeEventListener.onAdImpressed(aTNativeAdView, aTAdInfo);
                        }
                    }
                }

                public RunnableC23697(ATNativeAdView aTNativeAdView2) {
                    aTNativeAdView = aTNativeAdView2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (NativeAd.this.mIsDestroyed) {
                        return;
                    }
                    try {
                        AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
                        if (abstractC2372a != null) {
                            C1243h detail = abstractC2372a.getDetail();
                            detail.m3056a(NativeAd.this.mBaseNativeAd.getNetworkInfoMap());
                            C1352p.m4208a(detail, C1169h.n.f3177c, C1169h.n.f3186l, "");
                            NativeAd.this.fillShowTrackingInfo(detail);
                            NativeAd.this.fillRenderAreaToTrackingInfo(detail, aTNativeAdView);
                            C1320c.m3839a(NativeAd.this.mContext.getApplicationContext()).m3852a(4, detail, NativeAd.this.mAdCacheInfo.m2904d().getUnitGroupInfo());
                            NativeAd nativeAd = NativeAd.this;
                            ATAdInfo c1171jM2044a2 = C1171j.m2044a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.m2904d());
                            if (c1171jM2044a2.getNetworkFirmId() == -1) {
                                C1324g.m3940a(C1169h.j.f3155a, NativeAd.this.mAdCacheInfo.m2904d(), NativeAd.this.mBaseNativeAd);
                            }
                            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.7.1
                                public final /* synthetic */ ATAdInfo val$atAdInfo;

                                public AnonymousClass1(ATAdInfo c1171jM2044a22) {
                                    aTAdInfo = c1171jM2044a22;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (NativeAd.this.mNativeEventListener != null) {
                                        NativeAd.this.mNativeEventListener.onAdImpressed(aTNativeAdView, aTAdInfo);
                                    }
                                }
                            });
                        }
                    } catch (Exception unused) {
                        Log.e("NativeAd", "BaseNativeAd has been destotyed.");
                    }
                }
            });
        }
    }

    public synchronized void handleVideoEnd(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a != null) {
            C1243h detail = abstractC2372a.getDetail();
            detail.f4216t = 100;
            C1320c.m3839a(this.mContext.getApplicationContext()).m3851a(9, detail);
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.2
            public final /* synthetic */ ATNativeAdView val$view;

            public RunnableC23642(ATNativeAdView aTNativeAdView2) {
                aTNativeAdView = aTNativeAdView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoEnd(aTNativeAdView);
                }
            }
        });
    }

    public synchronized void handleVideoProgress(ATNativeAdView aTNativeAdView, int i) {
        if (this.mIsDestroyed) {
            return;
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.3
            public final /* synthetic */ int val$progress;
            public final /* synthetic */ ATNativeAdView val$view;

            public RunnableC23653(ATNativeAdView aTNativeAdView2, int i2) {
                aTNativeAdView = aTNativeAdView2;
                i = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoProgress(aTNativeAdView, i);
                }
            }
        });
    }

    public synchronized void handleVideoStart(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a != null) {
            C1243h detail = abstractC2372a.getDetail();
            detail.f4216t = 0;
            C1320c.m3839a(this.mContext.getApplicationContext()).m3851a(8, detail);
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.10
            public final /* synthetic */ ATNativeAdView val$view;

            public RunnableC236210(ATNativeAdView aTNativeAdView2) {
                aTNativeAdView = aTNativeAdView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoStart(aTNativeAdView);
                }
            }
        });
    }

    public boolean isNativeExpress() {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a == null || !(abstractC2372a instanceof CustomNativeAd)) {
            return false;
        }
        return ((CustomNativeAd) abstractC2372a).isNativeExpress();
    }

    public void manualImpressionTrack() {
        if (this.mIsDestroyed) {
            Log.e(this.TAG, "NativeAd had been destroyed.");
            return;
        }
        if (!this.isManualImpressionTrack) {
            if (C1175n.m2059a().m2095A()) {
                Log.e(this.TAG, "Must call \"setManualImpressionTrack(true);\" first.");
                return;
            }
            return;
        }
        ATNativeAdView aTNativeAdView = this.mNativeView;
        C1234b c1234b = this.mAdCacheInfo;
        ATBaseAdAdapter aTBaseAdAdapterM2904d = c1234b != null ? c1234b.m2904d() : null;
        if (aTBaseAdAdapterM2904d != null && aTBaseAdAdapterM2904d.supportImpressionCallback()) {
            if (C1175n.m2059a().m2095A()) {
                Log.e(this.TAG, "This NativeAd don't support tracking impressions manually.");
                return;
            }
            return;
        }
        if (aTNativeAdView == null) {
            if (C1175n.m2059a().m2095A()) {
                Log.e(this.TAG, "NativeAd don't call render.");
                return;
            }
            return;
        }
        if (!aTNativeAdView.isShown()) {
            if (C1175n.m2059a().m2095A()) {
                Log.e(this.TAG, "ATNativeAdView isn't visible.");
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            if (!aTNativeAdView.isAttachedToWindow()) {
                if (C1175n.m2059a().m2095A()) {
                    Log.e(this.TAG, "ATNativeAdView don't attach window.");
                    return;
                }
                return;
            }
        } else if (!aTNativeAdView.isAttachInWindow()) {
            if (C1175n.m2059a().m2095A()) {
                Log.e(this.TAG, "ATNativeAdView don't attach window.");
                return;
            }
            return;
        }
        if (C1175n.m2059a().m2095A()) {
            Log.i(this.TAG, "try to track impression manually.");
        }
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        if (abstractC2372a instanceof CustomNativeAd) {
            ((CustomNativeAd) abstractC2372a).impressionTrack(aTNativeAdView);
        }
    }

    public void onPause() {
        AbstractC2372a abstractC2372a;
        if (this.mIsDestroyed || (abstractC2372a = this.mBaseNativeAd) == null) {
            return;
        }
        abstractC2372a.onPause();
    }

    public void onResume() {
        AbstractC2372a abstractC2372a;
        if (this.mIsDestroyed || (abstractC2372a = this.mBaseNativeAd) == null) {
            return;
        }
        abstractC2372a.onResume();
    }

    public void pauseVideo() {
        AbstractC2372a abstractC2372a;
        if (this.mIsDestroyed || (abstractC2372a = this.mBaseNativeAd) == null) {
            return;
        }
        abstractC2372a.pauseVideo();
    }

    public synchronized void prepare(ATNativeAdView aTNativeAdView, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.mIsDestroyed) {
            return;
        }
        this.hasCallPrepareApi = true;
        if (aTNativeAdView != null) {
            if (aTNativePrepareInfo == null) {
                aTNativePrepareInfo = new ATNativePrepareInfo();
            }
            this.mBaseNativeAd.setNativePrepareInfo(aTNativePrepareInfo);
            this.mBaseNativeAd.prepare(aTNativeAdView, aTNativePrepareInfo);
            bindListener();
            if (!this.mBaseNativeAd.isNativeExpress()) {
                checkBindView(aTNativePrepareInfo);
            }
        }
    }

    public synchronized void recordShow(ATNativeAdView aTNativeAdView) {
        C1201f c1201fM4559a;
        if (!this.mRecordedShow) {
            C1243h detail = this.mBaseNativeAd.getDetail();
            this.mRecordedShow = true;
            if (this.mAdCacheInfo != null && (c1201fM4559a = C1387u.m4556a().m4559a(this.mPlacementId, "0")) != null) {
                c1201fM4559a.m2388a(this.mAdCacheInfo);
            }
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.6
                public final /* synthetic */ C1243h val$adTrackingInfo;

                public RunnableC23686(C1243h detail2) {
                    c1243h = detail2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mIsDestroyed || NativeAd.this.mAdCacheInfo == null) {
                        return;
                    }
                    NativeAd.this.fillShowTrackingInfo(c1243h);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        jCurrentTimeMillis = Long.parseLong(c1243h.m3129t().split("_")[r2.length - 1]);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    long j = jCurrentTimeMillis;
                    AbstractC2372a abstractC2372a = NativeAd.this.mBaseNativeAd;
                    if (abstractC2372a != null && (abstractC2372a instanceof CustomNativeAd)) {
                        ((CustomNativeAd) abstractC2372a).setShowId(c1243h.m3129t());
                    }
                    C1148a.m1904a().m1916a(NativeAd.this.mContext.getApplicationContext(), NativeAd.this.mAdCacheInfo);
                    C1320c.m3839a(NativeAd.this.mContext).m3853a(13, c1243h, NativeAd.this.mAdCacheInfo.m2904d().getUnitGroupInfo(), j);
                }
            });
        }
    }

    public synchronized void renderAdContainer(ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            aTNativeAdView.clear();
        }
        if (aTNativeAdView == null) {
            Log.e("anythink", "renderAdContainer: ATNativeAdView cannot be null for template-rendering ads!");
            return;
        }
        if (isNativeExpress()) {
            AbstractC2372a abstractC2372a = this.mBaseNativeAd;
            if (abstractC2372a != null) {
                view = abstractC2372a.getAdMediaView(aTNativeAdView, Integer.valueOf(aTNativeAdView.getWidth()));
                if (view == null) {
                    Log.e("anythink", "renderAdContainer: getAdMediaView() cannot be null for template-rendering ads!");
                    return;
                }
            } else {
                view = null;
            }
        } else if (view == null) {
            Log.e("anythink", "renderAdContainer: selfRenderView cannot be null for self-rendering ads!");
            checkToReportRenderErrorAgent(true);
            return;
        }
        this.hasCallPrepareRenderApi = true;
        this.mNativeView = aTNativeAdView;
        if (aTNativeAdView != null) {
            aTNativeAdView.attachNativeAd(this);
        }
        if (view != null) {
            view.setVisibility(0);
            renderViewToWindow(view);
        }
    }

    public void resumeVideo() {
        AbstractC2372a abstractC2372a;
        if (this.mIsDestroyed || (abstractC2372a = this.mBaseNativeAd) == null) {
            return;
        }
        abstractC2372a.resumeVideo();
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mEventInterface = aTEventInterface;
        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
        if (iExHandlerM2132b == null) {
            this.mBaseNativeAd.setDownloadListener(null);
            Log.e(this.TAG, "This method is not supported in this version");
        } else if (aTEventInterface != null) {
            this.mBaseNativeAd.setDownloadListener(iExHandlerM2132b.createDownloadListener(this.mAdCacheInfo.m2904d(), this.mBaseNativeAd, aTEventInterface));
        } else {
            this.mBaseNativeAd.setDownloadListener(null);
        }
    }

    public void setDislikeCallbackListener(ATNativeDislikeListener aTNativeDislikeListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mDislikeListener = aTNativeDislikeListener;
    }

    public void setDownloadConfirmListener(DownloadConfirmListener downloadConfirmListener) {
        AbstractC2372a abstractC2372a = this.mBaseNativeAd;
        boolean z = abstractC2372a instanceof CustomNativeAd;
        if (downloadConfirmListener != null) {
            if (z) {
                ((CustomNativeAd) abstractC2372a).registerDownloadConfirmListener();
            }
        } else if (z) {
            ((CustomNativeAd) abstractC2372a).unregeisterDownloadConfirmListener();
        }
        this.mConfirmListener = downloadConfirmListener;
    }

    public void setManualImpressionTrack(boolean z) {
        this.isManualImpressionTrack = z;
    }

    public void setNativeEventListener(ATNativeEventListener aTNativeEventListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mNativeEventListener = aTNativeEventListener;
    }

    public void setVideoMute(boolean z) {
        AbstractC2372a abstractC2372a;
        if (this.mIsDestroyed || (abstractC2372a = this.mBaseNativeAd) == null) {
            return;
        }
        abstractC2372a.setVideoMute(z);
    }
}
