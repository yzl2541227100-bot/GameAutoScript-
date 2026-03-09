package com.anythink.rewardvideo.p186a;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.p051b.AbstractC1165d;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.rewardvideo.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C2406a {

    /* JADX INFO: renamed from: a */
    public static final String f14938a = "a";

    /* JADX INFO: renamed from: e */
    private static Map<String, C2406a> f14939e = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: b */
    private Context f14940b;

    /* JADX INFO: renamed from: c */
    private String f14941c;

    /* JADX INFO: renamed from: d */
    private final C1201f f14942d;

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1234b f14943a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f14944b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f14945c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Activity f14946d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ATEventInterface f14947e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ATRewardVideoListener f14948f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ long f14949g;

        /* JADX INFO: renamed from: com.anythink.rewardvideo.a.a$1$1 */
        public class RunnableC46861 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CustomRewardVideoAdapter f14951a;

            public RunnableC46861(CustomRewardVideoAdapter customRewardVideoAdapter) {
                customRewardVideoAdapter = customRewardVideoAdapter;
            }

            @Override // java.lang.Runnable
            public final void run() {
                customRewardVideoAdapter.setScenario(str);
                IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                if (iExHandlerM2132b != null) {
                    CustomRewardVideoAdapter customRewardVideoAdapter = customRewardVideoAdapter;
                    customRewardVideoAdapter.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customRewardVideoAdapter, null, aTEventInterface));
                }
                CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                customRewardVideoAdapter2.internalShow(activity, new C2409d(customRewardVideoAdapter2, C1175n.m2059a().m2096B(), aTRewardVideoListener));
                C1243h trackingInfo = customRewardVideoAdapter.getTrackingInfo();
                C1322e.m3916a("4", trackingInfo.m2678ai(), trackingInfo.m2677ah(), trackingInfo.m3026F(), trackingInfo.m3039P(), 4, SystemClock.elapsedRealtime() - j);
            }
        }

        public AnonymousClass1(C1234b c1234b, String str, Map map, Activity activity, ATEventInterface aTEventInterface, ATRewardVideoListener aTRewardVideoListener, long j) {
            c1234b = c1234b;
            str = str;
            map = map;
            activity = activity;
            aTEventInterface = aTEventInterface;
            aTRewardVideoListener = aTRewardVideoListener;
            j = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1243h trackingInfo = c1234b.m2904d().getTrackingInfo();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (trackingInfo != null) {
                trackingInfo.f4134B = str;
                trackingInfo.m3095h(C1344h.m4135a(trackingInfo.m2678ai(), trackingInfo.m3026F(), jCurrentTimeMillis));
                C1358v.m4252a(C2406a.this.f14940b, trackingInfo);
                C1358v.m4258a((Map<String, Object>) map, trackingInfo);
                C1358v.m4256a(C2406a.this.f14941c, trackingInfo);
            }
            C1148a.m1904a().m1916a(C2406a.this.f14940b, c1234b);
            C1320c.m3839a(C2406a.this.f14940b).m3853a(13, trackingInfo, c1234b.m2904d().getUnitGroupInfo(), jCurrentTimeMillis);
            CustomRewardVideoAdapter customRewardVideoAdapter = (CustomRewardVideoAdapter) c1234b.m2904d();
            Activity activity = activity;
            if (activity != null) {
                customRewardVideoAdapter.refreshActivityContext(activity);
            }
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CustomRewardVideoAdapter f14951a;

                public RunnableC46861(CustomRewardVideoAdapter customRewardVideoAdapter2) {
                    customRewardVideoAdapter = customRewardVideoAdapter2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    customRewardVideoAdapter.setScenario(str);
                    IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                    if (iExHandlerM2132b != null) {
                        CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                        customRewardVideoAdapter2.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customRewardVideoAdapter2, null, aTEventInterface));
                    }
                    CustomRewardVideoAdapter customRewardVideoAdapter22 = customRewardVideoAdapter;
                    customRewardVideoAdapter22.internalShow(activity, new C2409d(customRewardVideoAdapter22, C1175n.m2059a().m2096B(), aTRewardVideoListener));
                    C1243h trackingInfo2 = customRewardVideoAdapter.getTrackingInfo();
                    C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                }
            });
        }
    }

    private C2406a(Context context, String str) {
        this.f14940b = context.getApplicationContext();
        this.f14941c = str;
        this.f14942d = C1201f.m2340a(context, str, "1");
    }

    /* JADX INFO: renamed from: a */
    public static C2406a m12430a(Context context, String str) {
        C2406a c2406a = f14939e.get(str);
        if (c2406a == null) {
            synchronized (C2406a.class) {
                if (c2406a == null) {
                    c2406a = new C2406a(context, str);
                    f14939e.put(str, c2406a);
                }
            }
        }
        return c2406a;
    }

    /* JADX INFO: renamed from: a */
    public final ATAdStatusInfo m12432a(Context context, Map<String, Object> map) {
        return this.f14942d.m2380a(context, map);
    }

    /* JADX INFO: renamed from: a */
    public final List<ATAdInfo> m12433a(Context context) {
        return this.f14942d.m2396b(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12434a(Activity activity, String str, ATRewardVideoListener aTRewardVideoListener, ATEventInterface aTEventInterface, Map<String, Object> map) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1234b c1234bM2381a = this.f14942d.m2381a((Context) activity, false, true, map);
        if (c1234bM2381a != null && (c1234bM2381a.m2904d() instanceof CustomRewardVideoAdapter)) {
            this.f14942d.m2388a(c1234bM2381a);
            c1234bM2381a.m2894a(c1234bM2381a.m2902c() + 1);
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1234b f14943a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f14944b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Map f14945c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Activity f14946d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ATEventInterface f14947e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ATRewardVideoListener f14948f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ long f14949g;

                /* JADX INFO: renamed from: com.anythink.rewardvideo.a.a$1$1 */
                public class RunnableC46861 implements Runnable {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ CustomRewardVideoAdapter f14951a;

                    public RunnableC46861(CustomRewardVideoAdapter customRewardVideoAdapter2) {
                        customRewardVideoAdapter = customRewardVideoAdapter2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        customRewardVideoAdapter.setScenario(str);
                        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                        if (iExHandlerM2132b != null) {
                            CustomRewardVideoAdapter customRewardVideoAdapter2 = customRewardVideoAdapter;
                            customRewardVideoAdapter2.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customRewardVideoAdapter2, null, aTEventInterface));
                        }
                        CustomRewardVideoAdapter customRewardVideoAdapter22 = customRewardVideoAdapter;
                        customRewardVideoAdapter22.internalShow(activity, new C2409d(customRewardVideoAdapter22, C1175n.m2059a().m2096B(), aTRewardVideoListener));
                        C1243h trackingInfo2 = customRewardVideoAdapter.getTrackingInfo();
                        C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                    }
                }

                public AnonymousClass1(C1234b c1234bM2381a2, String str2, Map map2, Activity activity2, ATEventInterface aTEventInterface2, ATRewardVideoListener aTRewardVideoListener2, long jElapsedRealtime2) {
                    c1234b = c1234bM2381a2;
                    str = str2;
                    map = map2;
                    activity = activity2;
                    aTEventInterface = aTEventInterface2;
                    aTRewardVideoListener = aTRewardVideoListener2;
                    j = jElapsedRealtime2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1243h trackingInfo = c1234b.m2904d().getTrackingInfo();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (trackingInfo != null) {
                        trackingInfo.f4134B = str;
                        trackingInfo.m3095h(C1344h.m4135a(trackingInfo.m2678ai(), trackingInfo.m3026F(), jCurrentTimeMillis));
                        C1358v.m4252a(C2406a.this.f14940b, trackingInfo);
                        C1358v.m4258a((Map<String, Object>) map, trackingInfo);
                        C1358v.m4256a(C2406a.this.f14941c, trackingInfo);
                    }
                    C1148a.m1904a().m1916a(C2406a.this.f14940b, c1234b);
                    C1320c.m3839a(C2406a.this.f14940b).m3853a(13, trackingInfo, c1234b.m2904d().getUnitGroupInfo(), jCurrentTimeMillis);
                    CustomRewardVideoAdapter customRewardVideoAdapter2 = (CustomRewardVideoAdapter) c1234b.m2904d();
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        customRewardVideoAdapter2.refreshActivityContext(activity2);
                    }
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.a.1.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ CustomRewardVideoAdapter f14951a;

                        public RunnableC46861(CustomRewardVideoAdapter customRewardVideoAdapter22) {
                            customRewardVideoAdapter = customRewardVideoAdapter22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            customRewardVideoAdapter.setScenario(str);
                            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                            if (iExHandlerM2132b != null) {
                                CustomRewardVideoAdapter customRewardVideoAdapter22 = customRewardVideoAdapter;
                                customRewardVideoAdapter22.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customRewardVideoAdapter22, null, aTEventInterface));
                            }
                            CustomRewardVideoAdapter customRewardVideoAdapter222 = customRewardVideoAdapter;
                            customRewardVideoAdapter222.internalShow(activity, new C2409d(customRewardVideoAdapter222, C1175n.m2059a().m2096B(), aTRewardVideoListener));
                            C1243h trackingInfo2 = customRewardVideoAdapter.getTrackingInfo();
                            C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                        }
                    });
                }
            });
        } else {
            if (this.f14942d.m2394a((ATAdStatusInfo) null)) {
                m12435a(C1175n.m2059a().m2099E(), 7, null, null, map2, null);
            }
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, "", "No Cache.");
            if (aTRewardVideoListener2 != null) {
                aTRewardVideoListener2.onRewardedVideoAdPlayFailed(errorCode, C1171j.m2045a((AbstractC1165d) null));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12435a(Context context, int i, InterfaceC1162a interfaceC1162a, C1163b c1163b, Map<String, Object> map, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        C1257v c1257v = new C1257v();
        c1257v.m3446a(context);
        c1257v.f4483d = i;
        c1257v.f4484e = c1163b;
        if (map != null) {
            try {
                c1257v.f4486g = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        c1257v.f4491l = aTAdxBidFloorInfo;
        this.f14942d.m2398b(this.f14940b, "1", this.f14941c, c1257v, interfaceC1162a);
    }
}
