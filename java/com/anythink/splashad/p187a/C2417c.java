package com.anythink.splashad.p187a;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.C0770i;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.ThirdPartySplashATView;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATMediationRequestInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1262g;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1173l;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p055f.p056a.C1204b;
import com.anythink.core.common.p055f.p056a.C1205c;
import com.anythink.core.common.p055f.p056a.C1207e;
import com.anythink.core.common.p055f.p056a.InterfaceC1203a;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.splashad.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C2417c {

    /* JADX INFO: renamed from: e */
    private static Map<String, C2417c> f15011e = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: a */
    private final C2419e f15012a;

    /* JADX INFO: renamed from: b */
    private Context f15013b;

    /* JADX INFO: renamed from: c */
    private String f15014c;

    /* JADX INFO: renamed from: d */
    private C1201f f15015d;

    /* JADX INFO: renamed from: com.anythink.splashad.a.c$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1234b f15016a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f15017b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f15018c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Map f15019d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ATEventInterface f15020e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ATSplashSkipInfo f15021f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewGroup f15022g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ AbstractC2415a f15023h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ long f15024i;

        /* JADX INFO: renamed from: com.anythink.splashad.a.c$1$1 */
        public class RunnableC46881 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CustomSplashAdapter f15026a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1243h f15027b;

            /* JADX INFO: renamed from: com.anythink.splashad.a.c$1$1$1 */
            public class ViewOnClickListenerC46891 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C2422h f15029a;

                public ViewOnClickListenerC46891(C2422h c2422h) {
                    c2422h = c2422h;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2422h c2422h = c2422h;
                    if (c2422h != null) {
                        c2422h.m12489a(2);
                        c2422h.onSplashAdDismiss();
                    }
                }
            }

            public RunnableC46881(CustomSplashAdapter customSplashAdapter, C1243h c1243h) {
                customSplashAdapter = customSplashAdapter;
                c1243h = c1243h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                if (iExHandlerM2132b != null) {
                    CustomSplashAdapter customSplashAdapter = customSplashAdapter;
                    customSplashAdapter.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customSplashAdapter, null, aTEventInterface));
                }
                ATSplashSkipInfo aTSplashSkipInfo = aTSplashSkipInfo;
                boolean z = aTSplashSkipInfo != null && aTSplashSkipInfo.canUseCustomSkipView();
                boolean zIsSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                if (z && zIsSupportCustomSkipView) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    aTSplashSkipInfo.setContainer(viewGroup);
                    customSplashAdapter.setSplashSkipInfo(aTSplashSkipInfo);
                }
                C2422h c2422h = new C2422h(customSplashAdapter, abstractC2415a);
                if (customSplashAdapter.getMixedFormatAdType() == 0) {
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    C2417c.m12463a(C2417c.this, activity, viewGroup, c2422h, z, c1234b.m2905e(), c1243h);
                } else {
                    CustomSplashAdapter customSplashAdapter2 = customSplashAdapter;
                    AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                    customSplashAdapter2.internalShow(activity, viewGroup, new C2421g(c2422h));
                }
                C1243h trackingInfo = customSplashAdapter.getTrackingInfo();
                C1322e.m3916a("4", trackingInfo.m2678ai(), trackingInfo.m2677ah(), trackingInfo.m3026F(), trackingInfo.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                if (!z) {
                    if (aTSplashSkipInfo != null) {
                        Log.e("anythink", "This AdSource does't support 'Custom SkipView' or 'SkipView' is null.");
                    }
                } else {
                    ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
                    if (aTSplashSkipAdListener != null) {
                        aTSplashSkipAdListener.isSupportCustomSkipView(zIsSupportCustomSkipView);
                    }
                    if (zIsSupportCustomSkipView) {
                        aTSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.splashad.a.c.1.1.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ C2422h f15029a;

                            public ViewOnClickListenerC46891(C2422h c2422h2) {
                                c2422h = c2422h2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2422h c2422h2 = c2422h;
                                if (c2422h2 != null) {
                                    c2422h2.m12489a(2);
                                    c2422h.onSplashAdDismiss();
                                }
                            }
                        });
                    }
                }
            }
        }

        public AnonymousClass1(C1234b c1234b, Activity activity, String str, Map map, ATEventInterface aTEventInterface, ATSplashSkipInfo aTSplashSkipInfo, ViewGroup viewGroup, AbstractC2415a abstractC2415a, long j) {
            c1234b = c1234b;
            activity = activity;
            str = str;
            map = map;
            aTEventInterface = aTEventInterface;
            aTSplashSkipInfo = aTSplashSkipInfo;
            viewGroup = viewGroup;
            abstractC2415a = abstractC2415a;
            j = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomSplashAdapter customSplashAdapter = (CustomSplashAdapter) c1234b.m2904d();
            Activity activity = activity;
            if (activity != null) {
                customSplashAdapter.refreshActivityContext(activity);
            }
            C1243h trackingInfo = c1234b.m2904d().getTrackingInfo();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (trackingInfo != null) {
                trackingInfo.f4134B = str;
                trackingInfo.m3095h(C1344h.m4135a(trackingInfo.m2678ai(), trackingInfo.m3026F(), jCurrentTimeMillis));
                C1358v.m4252a(C2417c.this.f15013b, trackingInfo);
                C1358v.m4258a((Map<String, Object>) map, trackingInfo);
                C1358v.m4256a(C2417c.this.f15014c, trackingInfo);
            }
            C1148a.m1904a().m1916a(C2417c.this.f15013b, c1234b);
            C1320c.m3839a(C2417c.this.f15013b).m3853a(13, trackingInfo, customSplashAdapter.getUnitGroupInfo(), jCurrentTimeMillis);
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.a.c.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CustomSplashAdapter f15026a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1243h f15027b;

                /* JADX INFO: renamed from: com.anythink.splashad.a.c$1$1$1 */
                public class ViewOnClickListenerC46891 implements View.OnClickListener {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C2422h f15029a;

                    public ViewOnClickListenerC46891(C2422h c2422h2) {
                        c2422h = c2422h2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2422h c2422h2 = c2422h;
                        if (c2422h2 != null) {
                            c2422h2.m12489a(2);
                            c2422h.onSplashAdDismiss();
                        }
                    }
                }

                public RunnableC46881(CustomSplashAdapter customSplashAdapter2, C1243h trackingInfo2) {
                    customSplashAdapter = customSplashAdapter2;
                    c1243h = trackingInfo2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                    if (iExHandlerM2132b != null) {
                        CustomSplashAdapter customSplashAdapter2 = customSplashAdapter;
                        customSplashAdapter2.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customSplashAdapter2, null, aTEventInterface));
                    }
                    ATSplashSkipInfo aTSplashSkipInfo = aTSplashSkipInfo;
                    boolean z = aTSplashSkipInfo != null && aTSplashSkipInfo.canUseCustomSkipView();
                    boolean zIsSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                    if (z && zIsSupportCustomSkipView) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        aTSplashSkipInfo.setContainer(viewGroup);
                        customSplashAdapter.setSplashSkipInfo(aTSplashSkipInfo);
                    }
                    C2422h c2422h2 = new C2422h(customSplashAdapter, abstractC2415a);
                    if (customSplashAdapter.getMixedFormatAdType() == 0) {
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        C2417c.m12463a(C2417c.this, activity, viewGroup, c2422h2, z, c1234b.m2905e(), c1243h);
                    } else {
                        CustomSplashAdapter customSplashAdapter22 = customSplashAdapter;
                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                        customSplashAdapter22.internalShow(activity, viewGroup, new C2421g(c2422h2));
                    }
                    C1243h trackingInfo2 = customSplashAdapter.getTrackingInfo();
                    C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                    if (!z) {
                        if (aTSplashSkipInfo != null) {
                            Log.e("anythink", "This AdSource does't support 'Custom SkipView' or 'SkipView' is null.");
                        }
                    } else {
                        ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
                        if (aTSplashSkipAdListener != null) {
                            aTSplashSkipAdListener.isSupportCustomSkipView(zIsSupportCustomSkipView);
                        }
                        if (zIsSupportCustomSkipView) {
                            aTSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.splashad.a.c.1.1.1

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ C2422h f15029a;

                                public ViewOnClickListenerC46891(C2422h c2422h22) {
                                    c2422h = c2422h22;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C2422h c2422h22 = c2422h;
                                    if (c2422h22 != null) {
                                        c2422h22.m12489a(2);
                                        c2422h.onSplashAdDismiss();
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.splashad.a.c$2 */
    public class AnonymousClass2 implements InterfaceC1173l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f15031a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2422h f15032b;

        public AnonymousClass2(boolean[] zArr, C2422h c2422h) {
            this.f15031a = zArr;
            this.f15032b = c2422h;
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdClicked(View view) {
            this.f15032b.onSplashAdClicked();
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdDislikeButtonClick() {
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdImpressed() {
            boolean[] zArr = this.f15031a;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            this.f15032b.onSplashAdShow();
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdVideoEnd() {
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdVideoProgress(int i) {
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onAdVideoStart() {
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onDeeplinkCallback(boolean z) {
            this.f15032b.onDeeplinkCallback(z);
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1173l
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            this.f15032b.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }

    /* JADX INFO: renamed from: com.anythink.splashad.a.c$3 */
    public class AnonymousClass3 implements InterfaceC0771a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2422h f15034a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseAd f15035b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f15036c;

        public AnonymousClass3(C2422h c2422h, BaseAd baseAd, ViewGroup viewGroup) {
            this.f15034a = c2422h;
            this.f15035b = baseAd;
            this.f15036c = viewGroup;
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClick(C0779i c0779i) {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdClosed() {
            this.f15034a.onSplashAdDismiss();
            BaseAd baseAd = this.f15035b;
            if (baseAd != null) {
                baseAd.clear(this.f15036c);
                this.f15035b.destroy();
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onAdShow(C0779i c0779i) {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onDeeplinkCallback(boolean z) {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0771a
        public final void onShowFailed(C0747e c0747e) {
        }
    }

    private C2417c(Context context, String str) {
        this.f15013b = context.getApplicationContext();
        this.f15014c = str;
        C1201f c1201fM2340a = C1201f.m2340a(context, str, "4");
        this.f15015d = c1201fM2340a;
        c1201fM2340a.m2390a(new C2418d());
        C2419e c2419e = new C2419e();
        this.f15012a = c2419e;
        this.f15015d.m2391a(c2419e);
    }

    /* JADX INFO: renamed from: a */
    public static C2417c m12461a(Context context, String str) {
        C2417c c2417c = f15011e.get(str);
        if (c2417c == null) {
            synchronized (C2417c.class) {
                if (c2417c == null) {
                    c2417c = new C2417c(context, str);
                    f15011e.put(str, c2417c);
                }
            }
        }
        return c2417c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m12462a(Activity activity, ViewGroup viewGroup, C2422h c2422h, boolean z, BaseAd baseAd, C1243h c1243h) {
        if (baseAd == 0 || !(baseAd instanceof C1207e)) {
            Log.e("anythink", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject");
            if (c2422h != null) {
                c2422h.m12489a(99);
                c2422h.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject"));
                c2422h.onSplashAdDismiss();
                return;
            }
            return;
        }
        C1204b c1204b = new C1204b((C1207e) baseAd);
        C1205c c1205c = new C1205c((InterfaceC1203a) baseAd, c1243h, Integer.parseInt("4"));
        String strM2341a = C1201f.m2341a(c1205c);
        baseAd.setNativeEventListener(new AnonymousClass2(new boolean[]{false}, c2422h));
        C0770i.m538a().m540a(strM2341a, baseAd);
        ThirdPartySplashATView thirdPartySplashATView = new ThirdPartySplashATView(activity.getApplicationContext(), c1205c, c1204b, new AnonymousClass3(c2422h, baseAd, viewGroup), strM2341a);
        thirdPartySplashATView.setDontCountDown(z);
        ViewGroup customAdContainer = baseAd != 0 ? baseAd.getCustomAdContainer() : null;
        if (customAdContainer != null) {
            C1360x.m4265a(customAdContainer);
            customAdContainer.addView(thirdPartySplashATView);
        } else {
            customAdContainer = thirdPartySplashATView;
        }
        thirdPartySplashATView.registerNativeClickListener(viewGroup);
        viewGroup.addView(customAdContainer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12463a(C2417c c2417c, Activity activity, ViewGroup viewGroup, C2422h c2422h, boolean z, BaseAd baseAd, C1243h c1243h) {
        if (baseAd == 0 || !(baseAd instanceof C1207e)) {
            Log.e("anythink", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject");
            c2422h.m12489a(99);
            c2422h.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject"));
            c2422h.onSplashAdDismiss();
            return;
        }
        C1204b c1204b = new C1204b((C1207e) baseAd);
        C1205c c1205c = new C1205c((InterfaceC1203a) baseAd, c1243h, Integer.parseInt("4"));
        String strM2341a = C1201f.m2341a(c1205c);
        baseAd.setNativeEventListener(c2417c.new AnonymousClass2(new boolean[]{false}, c2422h));
        C0770i.m538a().m540a(strM2341a, baseAd);
        ThirdPartySplashATView thirdPartySplashATView = new ThirdPartySplashATView(activity.getApplicationContext(), c1205c, c1204b, c2417c.new AnonymousClass3(c2422h, baseAd, viewGroup), strM2341a);
        thirdPartySplashATView.setDontCountDown(z);
        ViewGroup customAdContainer = baseAd != 0 ? baseAd.getCustomAdContainer() : null;
        if (customAdContainer != null) {
            C1360x.m4265a(customAdContainer);
            customAdContainer.addView(thirdPartySplashATView);
        } else {
            customAdContainer = thirdPartySplashATView;
        }
        thirdPartySplashATView.registerNativeClickListener(viewGroup);
        viewGroup.addView(customAdContainer);
    }

    /* JADX INFO: renamed from: a */
    public final ATAdStatusInfo m12465a(Context context, Map<String, Object> map) {
        return this.f15015d.m2380a(context, map);
    }

    /* JADX INFO: renamed from: a */
    public final C1262g m12466a(String str) {
        return this.f15015d.m2395b(str);
    }

    /* JADX INFO: renamed from: a */
    public final List<ATAdInfo> m12467a(Context context) {
        return this.f15015d.m2396b(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12468a(Activity activity, ViewGroup viewGroup, AbstractC2415a abstractC2415a, ATEventInterface aTEventInterface, ATSplashSkipInfo aTSplashSkipInfo, String str, Map<String, Object> map) {
        C2420f c2420f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1234b c1234bM2381a = this.f15015d.m2381a((Context) activity, false, true, map);
        if (c1234bM2381a == null) {
            Log.e("anythink", "Splash No Cache.");
            return;
        }
        if (c1234bM2381a != null && (c1234bM2381a.m2904d() instanceof CustomSplashAdapter)) {
            this.f15015d.m2388a(c1234bM2381a);
            c1234bM2381a.m2894a(c1234bM2381a.m2902c() + 1);
            C2419e c2419e = this.f15012a;
            if (c2419e != null && (c2420f = c2419e.f15038a) != null && c2420f.f15042d == c1234bM2381a) {
                c2420f.f15042d = null;
            }
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.splashad.a.c.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1234b f15016a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Activity f15017b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f15018c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Map f15019d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ATEventInterface f15020e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ATSplashSkipInfo f15021f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ViewGroup f15022g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ AbstractC2415a f15023h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f15024i;

                /* JADX INFO: renamed from: com.anythink.splashad.a.c$1$1 */
                public class RunnableC46881 implements Runnable {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ CustomSplashAdapter f15026a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1243h f15027b;

                    /* JADX INFO: renamed from: com.anythink.splashad.a.c$1$1$1 */
                    public class ViewOnClickListenerC46891 implements View.OnClickListener {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ C2422h f15029a;

                        public ViewOnClickListenerC46891(C2422h c2422h22) {
                            c2422h = c2422h22;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2422h c2422h22 = c2422h;
                            if (c2422h22 != null) {
                                c2422h22.m12489a(2);
                                c2422h.onSplashAdDismiss();
                            }
                        }
                    }

                    public RunnableC46881(CustomSplashAdapter customSplashAdapter2, C1243h trackingInfo2) {
                        customSplashAdapter = customSplashAdapter2;
                        c1243h = trackingInfo2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                        if (iExHandlerM2132b != null) {
                            CustomSplashAdapter customSplashAdapter2 = customSplashAdapter;
                            customSplashAdapter2.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customSplashAdapter2, null, aTEventInterface));
                        }
                        ATSplashSkipInfo aTSplashSkipInfo = aTSplashSkipInfo;
                        boolean z = aTSplashSkipInfo != null && aTSplashSkipInfo.canUseCustomSkipView();
                        boolean zIsSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                        if (z && zIsSupportCustomSkipView) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            aTSplashSkipInfo.setContainer(viewGroup);
                            customSplashAdapter.setSplashSkipInfo(aTSplashSkipInfo);
                        }
                        C2422h c2422h22 = new C2422h(customSplashAdapter, abstractC2415a);
                        if (customSplashAdapter.getMixedFormatAdType() == 0) {
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            C2417c.m12463a(C2417c.this, activity, viewGroup, c2422h22, z, c1234b.m2905e(), c1243h);
                        } else {
                            CustomSplashAdapter customSplashAdapter22 = customSplashAdapter;
                            AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                            customSplashAdapter22.internalShow(activity, viewGroup, new C2421g(c2422h22));
                        }
                        C1243h trackingInfo2 = customSplashAdapter.getTrackingInfo();
                        C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                        if (!z) {
                            if (aTSplashSkipInfo != null) {
                                Log.e("anythink", "This AdSource does't support 'Custom SkipView' or 'SkipView' is null.");
                            }
                        } else {
                            ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
                            if (aTSplashSkipAdListener != null) {
                                aTSplashSkipAdListener.isSupportCustomSkipView(zIsSupportCustomSkipView);
                            }
                            if (zIsSupportCustomSkipView) {
                                aTSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.splashad.a.c.1.1.1

                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ C2422h f15029a;

                                    public ViewOnClickListenerC46891(C2422h c2422h222) {
                                        c2422h = c2422h222;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C2422h c2422h222 = c2422h;
                                        if (c2422h222 != null) {
                                            c2422h222.m12489a(2);
                                            c2422h.onSplashAdDismiss();
                                        }
                                    }
                                });
                            }
                        }
                    }
                }

                public AnonymousClass1(C1234b c1234bM2381a2, Activity activity2, String str2, Map map2, ATEventInterface aTEventInterface2, ATSplashSkipInfo aTSplashSkipInfo2, ViewGroup viewGroup2, AbstractC2415a abstractC2415a2, long jElapsedRealtime2) {
                    c1234b = c1234bM2381a2;
                    activity = activity2;
                    str = str2;
                    map = map2;
                    aTEventInterface = aTEventInterface2;
                    aTSplashSkipInfo = aTSplashSkipInfo2;
                    viewGroup = viewGroup2;
                    abstractC2415a = abstractC2415a2;
                    j = jElapsedRealtime2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CustomSplashAdapter customSplashAdapter2 = (CustomSplashAdapter) c1234b.m2904d();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customSplashAdapter2.refreshActivityContext(activity2);
                    }
                    C1243h trackingInfo2 = c1234b.m2904d().getTrackingInfo();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (trackingInfo2 != null) {
                        trackingInfo2.f4134B = str;
                        trackingInfo2.m3095h(C1344h.m4135a(trackingInfo2.m2678ai(), trackingInfo2.m3026F(), jCurrentTimeMillis));
                        C1358v.m4252a(C2417c.this.f15013b, trackingInfo2);
                        C1358v.m4258a((Map<String, Object>) map, trackingInfo2);
                        C1358v.m4256a(C2417c.this.f15014c, trackingInfo2);
                    }
                    C1148a.m1904a().m1916a(C2417c.this.f15013b, c1234b);
                    C1320c.m3839a(C2417c.this.f15013b).m3853a(13, trackingInfo2, customSplashAdapter2.getUnitGroupInfo(), jCurrentTimeMillis);
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.a.c.1.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ CustomSplashAdapter f15026a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1243h f15027b;

                        /* JADX INFO: renamed from: com.anythink.splashad.a.c$1$1$1 */
                        public class ViewOnClickListenerC46891 implements View.OnClickListener {

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ C2422h f15029a;

                            public ViewOnClickListenerC46891(C2422h c2422h222) {
                                c2422h = c2422h222;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2422h c2422h222 = c2422h;
                                if (c2422h222 != null) {
                                    c2422h222.m12489a(2);
                                    c2422h.onSplashAdDismiss();
                                }
                            }
                        }

                        public RunnableC46881(CustomSplashAdapter customSplashAdapter22, C1243h trackingInfo22) {
                            customSplashAdapter = customSplashAdapter22;
                            c1243h = trackingInfo22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                            if (iExHandlerM2132b != null) {
                                CustomSplashAdapter customSplashAdapter22 = customSplashAdapter;
                                customSplashAdapter22.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customSplashAdapter22, null, aTEventInterface));
                            }
                            ATSplashSkipInfo aTSplashSkipInfo2 = aTSplashSkipInfo;
                            boolean z = aTSplashSkipInfo2 != null && aTSplashSkipInfo2.canUseCustomSkipView();
                            boolean zIsSupportCustomSkipView = customSplashAdapter.isSupportCustomSkipView();
                            if (z && zIsSupportCustomSkipView) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                aTSplashSkipInfo.setContainer(viewGroup);
                                customSplashAdapter.setSplashSkipInfo(aTSplashSkipInfo);
                            }
                            C2422h c2422h222 = new C2422h(customSplashAdapter, abstractC2415a);
                            if (customSplashAdapter.getMixedFormatAdType() == 0) {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                C2417c.m12463a(C2417c.this, activity, viewGroup, c2422h222, z, c1234b.m2905e(), c1243h);
                            } else {
                                CustomSplashAdapter customSplashAdapter222 = customSplashAdapter;
                                AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                customSplashAdapter222.internalShow(activity, viewGroup, new C2421g(c2422h222));
                            }
                            C1243h trackingInfo22 = customSplashAdapter.getTrackingInfo();
                            C1322e.m3916a("4", trackingInfo22.m2678ai(), trackingInfo22.m2677ah(), trackingInfo22.m3026F(), trackingInfo22.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                            if (!z) {
                                if (aTSplashSkipInfo != null) {
                                    Log.e("anythink", "This AdSource does't support 'Custom SkipView' or 'SkipView' is null.");
                                }
                            } else {
                                ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
                                if (aTSplashSkipAdListener != null) {
                                    aTSplashSkipAdListener.isSupportCustomSkipView(zIsSupportCustomSkipView);
                                }
                                if (zIsSupportCustomSkipView) {
                                    aTSplashSkipInfo.getSkipView().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.splashad.a.c.1.1.1

                                        /* JADX INFO: renamed from: a */
                                        public final /* synthetic */ C2422h f15029a;

                                        public ViewOnClickListenerC46891(C2422h c2422h2222) {
                                            c2422h = c2422h2222;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            C2422h c2422h2222 = c2422h;
                                            if (c2422h2222 != null) {
                                                c2422h2222.m12489a(2);
                                                c2422h.onSplashAdDismiss();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12469a(Context context, ATMediationRequestInfo aTMediationRequestInfo, String str, AbstractC2416b abstractC2416b, int i, boolean z, int i2, C1163b c1163b, Map<String, Object> map, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1257v c1257v = new C1257v();
        c1257v.m3446a(context);
        c1257v.f4481b = aTMediationRequestInfo;
        c1257v.f4482c = str;
        c1257v.f4487h = i;
        c1257v.f4489j = z;
        c1257v.f4483d = i2;
        c1257v.f4484e = c1163b;
        if (map != null) {
            try {
                c1257v.f4486g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        c1257v.f4491l = aTAdxBidFloorInfo;
        C1201f c1201f = this.f15015d;
        if (c1201f != null) {
            c1201f.m2398b(this.f15013b, "4", this.f15014c, c1257v, abstractC2416b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12470a(ATAdStatusInfo aTAdStatusInfo) {
        return this.f15015d.m2394a(aTAdStatusInfo);
    }

    /* JADX INFO: renamed from: b */
    public final C1234b m12471b(Context context, Map<String, Object> map) {
        return this.f15015d.m2381a(context, false, false, map);
    }
}
