package com.anythink.interstitial.p183a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.C0770i;
import com.anythink.basead.p021e.C0772b;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p025ui.BaseATActivity;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.basead.p044b.C1121c;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p055f.p056a.C1204b;
import com.anythink.core.common.p055f.p056a.C1205c;
import com.anythink.core.common.p055f.p056a.C1207e;
import com.anythink.core.common.p055f.p056a.InterfaceC1203a;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.anythink.interstitial.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C2348a {

    /* JADX INFO: renamed from: a */
    public static final String f14745a = "a";

    /* JADX INFO: renamed from: g */
    private static Map<String, C2348a> f14746g = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: b */
    private View f14747b;

    /* JADX INFO: renamed from: c */
    private AtomicBoolean f14748c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private Context f14749d;

    /* JADX INFO: renamed from: e */
    private String f14750e;

    /* JADX INFO: renamed from: f */
    private final C1201f f14751f;

    /* JADX INFO: renamed from: com.anythink.interstitial.a.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1234b f14752a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f14753b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14754c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Map f14755d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f14756e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ATEventInterface f14757f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ATInterstitialListener f14758g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ long f14759h;

        /* JADX INFO: renamed from: com.anythink.interstitial.a.a$1$1 */
        public class RunnableC46841 implements Runnable {
            public RunnableC46841() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                C2348a.m12149a(C2348a.this, activity);
            }
        }

        /* JADX INFO: renamed from: com.anythink.interstitial.a.a$1$2 */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CustomInterstitialAdapter f14762a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1243h f14763b;

            public AnonymousClass2(CustomInterstitialAdapter customInterstitialAdapter, C1243h c1243h) {
                customInterstitialAdapter = customInterstitialAdapter;
                c1243h = c1243h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                customInterstitialAdapter.setScenario(str);
                IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                if (iExHandlerM2132b != null) {
                    CustomInterstitialAdapter customInterstitialAdapter = customInterstitialAdapter;
                    customInterstitialAdapter.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customInterstitialAdapter, null, aTEventInterface));
                }
                C2352e c2352e = new C2352e(customInterstitialAdapter, aTInterstitialListener);
                if (customInterstitialAdapter.getMixedFormatAdType() == 0) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    C2348a.m12150a(C2348a.this, activity, c2352e, c1234b.m2905e(), c1243h, str);
                } else {
                    customInterstitialAdapter.internalShow(activity, null, new C2349b(c2352e));
                }
                C1243h trackingInfo = customInterstitialAdapter.getTrackingInfo();
                C1322e.m3916a("4", trackingInfo.m2678ai(), trackingInfo.m2677ah(), trackingInfo.m3026F(), trackingInfo.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                if (i <= 0 || !C2348a.this.f14748c.get()) {
                    return;
                }
                if (C2348a.this.f14747b != null) {
                    ((ViewGroup) C2348a.this.f14747b.getParent()).removeView(C2348a.this.f14747b);
                }
                C2348a.this.f14748c.set(false);
            }
        }

        public AnonymousClass1(C1234b c1234b, Activity activity, String str, Map map, int i, ATEventInterface aTEventInterface, ATInterstitialListener aTInterstitialListener, long j) {
            c1234b = c1234b;
            activity = activity;
            str = str;
            map = map;
            i = i;
            aTEventInterface = aTEventInterface;
            aTInterstitialListener = aTInterstitialListener;
            j = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomInterstitialAdapter customInterstitialAdapter = (CustomInterstitialAdapter) c1234b.m2904d();
            Activity activity = activity;
            if (activity != null) {
                customInterstitialAdapter.refreshActivityContext(activity);
            }
            C1243h trackingInfo = c1234b.m2904d().getTrackingInfo();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (trackingInfo != null) {
                trackingInfo.f4134B = str;
                trackingInfo.m3095h(C1344h.m4135a(trackingInfo.m2678ai(), trackingInfo.m3026F(), jCurrentTimeMillis));
                C1358v.m4252a(C2348a.this.f14749d, trackingInfo);
                C1358v.m4258a((Map<String, Object>) map, trackingInfo);
                C1358v.m4256a(C2348a.this.f14750e, trackingInfo);
            }
            C1148a.m1904a().m1916a(C2348a.this.f14749d, c1234b);
            C1320c.m3839a(C2348a.this.f14749d).m3853a(13, trackingInfo, c1234b.m2904d().getUnitGroupInfo(), jCurrentTimeMillis);
            if (i > 0) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.a.1.1
                    public RunnableC46841() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        C2348a.m12149a(C2348a.this, activity);
                    }
                });
            }
            C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.interstitial.a.a.1.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CustomInterstitialAdapter f14762a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1243h f14763b;

                public AnonymousClass2(CustomInterstitialAdapter customInterstitialAdapter2, C1243h trackingInfo2) {
                    customInterstitialAdapter = customInterstitialAdapter2;
                    c1243h = trackingInfo2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    customInterstitialAdapter.setScenario(str);
                    IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                    if (iExHandlerM2132b != null) {
                        CustomInterstitialAdapter customInterstitialAdapter2 = customInterstitialAdapter;
                        customInterstitialAdapter2.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customInterstitialAdapter2, null, aTEventInterface));
                    }
                    C2352e c2352e = new C2352e(customInterstitialAdapter, aTInterstitialListener);
                    if (customInterstitialAdapter.getMixedFormatAdType() == 0) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        C2348a.m12150a(C2348a.this, activity, c2352e, c1234b.m2905e(), c1243h, str);
                    } else {
                        customInterstitialAdapter.internalShow(activity, null, new C2349b(c2352e));
                    }
                    C1243h trackingInfo2 = customInterstitialAdapter.getTrackingInfo();
                    C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    if (i <= 0 || !C2348a.this.f14748c.get()) {
                        return;
                    }
                    if (C2348a.this.f14747b != null) {
                        ((ViewGroup) C2348a.this.f14747b.getParent()).removeView(C2348a.this.f14747b);
                    }
                    C2348a.this.f14748c.set(false);
                }
            }, i);
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.a$2 */
    public class AnonymousClass2 implements View.OnTouchListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.a$3 */
    public class AnonymousClass3 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference f14766a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f14767b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f14768c;

        public AnonymousClass3(WeakReference weakReference, String str, int i) {
            this.f14766a = weakReference;
            this.f14767b = str;
            this.f14768c = i;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            Log.e(C2348a.f14745a, "load: image load fail:".concat(String.valueOf(str2)));
            ImageView imageView = (ImageView) this.f14766a.get();
            if (!TextUtils.equals(this.f14767b, str) || imageView == null) {
                return;
            }
            imageView.setImageResource(this.f14768c);
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = (ImageView) this.f14766a.get();
            if (!TextUtils.equals(this.f14767b, str) || imageView == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.a$4 */
    public class AnonymousClass4 extends C0772b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2352e f14770a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f14771b;

        public AnonymousClass4(C2352e c2352e, String str) {
            this.f14770a = c2352e;
            this.f14771b = str;
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo458a() {
            C2352e c2352e = this.f14770a;
            if (c2352e != null) {
                c2352e.onInterstitialAdVideoStart();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo459a(C0747e c0747e) {
            C2352e c2352e = this.f14770a;
            if (c2352e != null) {
                c2352e.onInterstitialAdVideoError(c0747e.m307a(), c0747e.m308b());
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo460a(C0779i c0779i) {
            C2352e c2352e = this.f14770a;
            if (c2352e != null) {
                c2352e.onInterstitialAdShow();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo461a(boolean z) {
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: b */
        public final void mo462b() {
            C2352e c2352e = this.f14770a;
            if (c2352e != null) {
                c2352e.onInterstitialAdVideoEnd();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: b */
        public final void mo463b(C0779i c0779i) {
            C2352e c2352e = this.f14770a;
            if (c2352e != null) {
                c2352e.onInterstitialAdClicked();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: c */
        public final void mo464c() {
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: d */
        public final void mo465d() {
            C0772b.m542a().m545b(this.f14771b);
            C2352e c2352e = this.f14770a;
            if (c2352e != null) {
                c2352e.onInterstitialAdClose();
            }
        }
    }

    private C2348a(Context context, String str) {
        this.f14749d = context.getApplicationContext();
        this.f14750e = str;
        this.f14751f = C1201f.m2340a(context, str, "3");
    }

    /* JADX INFO: renamed from: a */
    public static C2348a m12145a(Context context, String str) {
        C2348a c2348a = f14746g.get(str);
        if (c2348a == null) {
            synchronized (C2348a.class) {
                if (c2348a == null) {
                    c2348a = new C2348a(context, str);
                    f14746g.put(str, c2348a);
                }
            }
        }
        return c2348a;
    }

    /* JADX INFO: renamed from: a */
    private static void m12146a() {
    }

    /* JADX INFO: renamed from: a */
    private void m12147a(Activity activity) {
        if (activity == null) {
            return;
        }
        C1391a c1391aM4865b = C1392b.m4845a(this.f14749d).m4865b(C1175n.m2059a().m2165o());
        String strM4771p = c1391aM4865b.m4771p();
        String strM4770o = c1391aM4865b.m4770o();
        if (this.f14747b == null) {
            this.f14747b = LayoutInflater.from(activity.getApplicationContext()).inflate(C1345i.m4154a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
        }
        this.f14747b.setOnTouchListener(new AnonymousClass2());
        ImageView imageView = (ImageView) this.f14747b.findViewById(C1345i.m4154a(activity, "interstitial_iv_loading", "id"));
        TextView textView = (TextView) this.f14747b.findViewById(C1345i.m4154a(activity, "interstitial_tv_loading", "id"));
        int iM4153a = C1345i.m4153a(activity, 30.0f);
        imageView.setMinimumWidth(iM4153a);
        imageView.setMinimumHeight(iM4153a);
        int iM4153a2 = C1345i.m4153a(activity, 90.0f);
        imageView.setMaxWidth(iM4153a2);
        imageView.setMaxHeight(iM4153a2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iM4154a = C1345i.m4154a(activity, "interstitial_loading_default", C1875i.f11528c);
        if (TextUtils.isEmpty(strM4771p)) {
            imageView.setImageResource(iM4154a);
        } else {
            C1378b.m4482a(activity.getApplicationContext()).m4495a(new C1381e(3, strM4771p), new AnonymousClass3(new WeakReference(imageView), strM4771p, iM4154a));
        }
        if (TextUtils.isEmpty(strM4770o)) {
            textView.setText(C1345i.m4154a(activity, "interstitial_text_loading_default", C1875i.f11532g));
        } else {
            textView.setText(strM4770o);
        }
        View view = this.f14747b;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.f14747b.getParent()).removeView(this.f14747b);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.f14747b, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m12148a(Activity activity, C2352e c2352e, BaseAd baseAd, C1243h c1243h, String str) {
        if (baseAd == 0 || !(baseAd instanceof C1207e)) {
            Log.e("anythink", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject");
            if (c2352e != null) {
                c2352e.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail,AdCache return illegal type adObject");
                return;
            }
            return;
        }
        C1204b c1204b = new C1204b((C1207e) baseAd);
        C1205c c1205c = new C1205c((InterfaceC1203a) baseAd, c1243h, Integer.parseInt("3"));
        String strM2341a = C1201f.m2341a(c1205c);
        C0772b.m542a().m544a(strM2341a, new AnonymousClass4(c2352e, strM2341a));
        C0770i.m538a().m540a(strM2341a, baseAd);
        C1121c c1121c = new C1121c();
        c1121c.f2751c = c1204b;
        c1121c.f2752d = strM2341a;
        c1121c.f2749a = 3;
        c1121c.f2756h = c1205c;
        c1121c.f2753e = C1341e.m4068g(activity);
        c1121c.f2750b = str;
        BaseATActivity.m680a(activity, c1121c);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12149a(C2348a c2348a, Activity activity) {
        if (activity != null) {
            C1391a c1391aM4865b = C1392b.m4845a(c2348a.f14749d).m4865b(C1175n.m2059a().m2165o());
            String strM4771p = c1391aM4865b.m4771p();
            String strM4770o = c1391aM4865b.m4770o();
            if (c2348a.f14747b == null) {
                c2348a.f14747b = LayoutInflater.from(activity.getApplicationContext()).inflate(C1345i.m4154a(activity, "interstitial_loading_layout", "layout"), (ViewGroup) null);
            }
            c2348a.f14747b.setOnTouchListener(c2348a.new AnonymousClass2());
            ImageView imageView = (ImageView) c2348a.f14747b.findViewById(C1345i.m4154a(activity, "interstitial_iv_loading", "id"));
            TextView textView = (TextView) c2348a.f14747b.findViewById(C1345i.m4154a(activity, "interstitial_tv_loading", "id"));
            int iM4153a = C1345i.m4153a(activity, 30.0f);
            imageView.setMinimumWidth(iM4153a);
            imageView.setMinimumHeight(iM4153a);
            int iM4153a2 = C1345i.m4153a(activity, 90.0f);
            imageView.setMaxWidth(iM4153a2);
            imageView.setMaxHeight(iM4153a2);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iM4154a = C1345i.m4154a(activity, "interstitial_loading_default", C1875i.f11528c);
            if (TextUtils.isEmpty(strM4771p)) {
                imageView.setImageResource(iM4154a);
            } else {
                C1378b.m4482a(activity.getApplicationContext()).m4495a(new C1381e(3, strM4771p), c2348a.new AnonymousClass3(new WeakReference(imageView), strM4771p, iM4154a));
            }
            if (TextUtils.isEmpty(strM4770o)) {
                textView.setText(C1345i.m4154a(activity, "interstitial_text_loading_default", C1875i.f11532g));
            } else {
                textView.setText(strM4770o);
            }
            View view = c2348a.f14747b;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) c2348a.f14747b.getParent()).removeView(c2348a.f14747b);
            }
            ((ViewGroup) activity.getWindow().getDecorView()).addView(c2348a.f14747b, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12150a(C2348a c2348a, Activity activity, C2352e c2352e, BaseAd baseAd, C1243h c1243h, String str) {
        if (baseAd == 0 || !(baseAd instanceof C1207e)) {
            Log.e("anythink", "showThirdPartyNativeSplash fail,AdCache return illegal type adObject");
            c2352e.onInterstitialAdVideoError("", "showThirdPartyNativeInterstitial fail,AdCache return illegal type adObject");
            return;
        }
        C1204b c1204b = new C1204b((C1207e) baseAd);
        C1205c c1205c = new C1205c((InterfaceC1203a) baseAd, c1243h, Integer.parseInt("3"));
        String strM2341a = C1201f.m2341a(c1205c);
        C0772b.m542a().m544a(strM2341a, c2348a.new AnonymousClass4(c2352e, strM2341a));
        C0770i.m538a().m540a(strM2341a, baseAd);
        C1121c c1121c = new C1121c();
        c1121c.f2751c = c1204b;
        c1121c.f2752d = strM2341a;
        c1121c.f2749a = 3;
        c1121c.f2756h = c1205c;
        c1121c.f2753e = C1341e.m4068g(activity);
        c1121c.f2750b = str;
        BaseATActivity.m680a(activity, c1121c);
    }

    /* JADX INFO: renamed from: b */
    private static void m12152b() {
    }

    /* JADX INFO: renamed from: c */
    private static void m12154c() {
    }

    /* JADX INFO: renamed from: a */
    public final ATAdStatusInfo m12156a(Context context, Map<String, Object> map) {
        return this.f14751f.m2380a(context, map);
    }

    /* JADX INFO: renamed from: a */
    public final List<ATAdInfo> m12157a(Context context) {
        return this.f14751f.m2396b(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12158a(Activity activity, String str, ATInterstitialListener aTInterstitialListener, ATEventInterface aTEventInterface, Map<String, Object> map) {
        if (this.f14748c.get()) {
            StringBuilder sb = new StringBuilder("The placementId(");
            sb.append(this.f14750e);
            sb.append(") is already in the process of being delayed.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1234b c1234bM2381a = this.f14751f.m2381a((Context) activity, false, true, map);
        if (c1234bM2381a == null || !(c1234bM2381a.m2904d() instanceof CustomInterstitialAdapter)) {
            if (this.f14751f.m2394a((ATAdStatusInfo) null)) {
                m12159a(C1175n.m2059a().m2099E(), 7, (InterfaceC1162a) null, (C1163b) null, map, (ATAdxBidFloorInfo) null);
            }
            return;
        }
        this.f14751f.m2388a(c1234bM2381a);
        c1234bM2381a.m2894a(c1234bM2381a.m2902c() + 1);
        int iM2751ad = c1234bM2381a.m2904d().getUnitGroupInfo().m2751ad();
        if (iM2751ad > 0) {
            this.f14748c.set(true);
        }
        C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.interstitial.a.a.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1234b f14752a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Activity f14753b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f14754c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Map f14755d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f14756e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ATEventInterface f14757f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ ATInterstitialListener f14758g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f14759h;

            /* JADX INFO: renamed from: com.anythink.interstitial.a.a$1$1 */
            public class RunnableC46841 implements Runnable {
                public RunnableC46841() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    C2348a.m12149a(C2348a.this, activity);
                }
            }

            /* JADX INFO: renamed from: com.anythink.interstitial.a.a$1$2 */
            public class AnonymousClass2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CustomInterstitialAdapter f14762a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1243h f14763b;

                public AnonymousClass2(CustomInterstitialAdapter customInterstitialAdapter2, C1243h trackingInfo2) {
                    customInterstitialAdapter = customInterstitialAdapter2;
                    c1243h = trackingInfo2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    customInterstitialAdapter.setScenario(str);
                    IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                    if (iExHandlerM2132b != null) {
                        CustomInterstitialAdapter customInterstitialAdapter2 = customInterstitialAdapter;
                        customInterstitialAdapter2.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customInterstitialAdapter2, null, aTEventInterface));
                    }
                    C2352e c2352e = new C2352e(customInterstitialAdapter, aTInterstitialListener);
                    if (customInterstitialAdapter.getMixedFormatAdType() == 0) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        C2348a.m12150a(C2348a.this, activity, c2352e, c1234b.m2905e(), c1243h, str);
                    } else {
                        customInterstitialAdapter.internalShow(activity, null, new C2349b(c2352e));
                    }
                    C1243h trackingInfo2 = customInterstitialAdapter.getTrackingInfo();
                    C1322e.m3916a("4", trackingInfo2.m2678ai(), trackingInfo2.m2677ah(), trackingInfo2.m3026F(), trackingInfo2.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    if (i <= 0 || !C2348a.this.f14748c.get()) {
                        return;
                    }
                    if (C2348a.this.f14747b != null) {
                        ((ViewGroup) C2348a.this.f14747b.getParent()).removeView(C2348a.this.f14747b);
                    }
                    C2348a.this.f14748c.set(false);
                }
            }

            public AnonymousClass1(C1234b c1234bM2381a2, Activity activity2, String str2, Map map2, int iM2751ad2, ATEventInterface aTEventInterface2, ATInterstitialListener aTInterstitialListener2, long jElapsedRealtime2) {
                c1234b = c1234bM2381a2;
                activity = activity2;
                str = str2;
                map = map2;
                i = iM2751ad2;
                aTEventInterface = aTEventInterface2;
                aTInterstitialListener = aTInterstitialListener2;
                j = jElapsedRealtime2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CustomInterstitialAdapter customInterstitialAdapter2 = (CustomInterstitialAdapter) c1234b.m2904d();
                Activity activity2 = activity;
                if (activity2 != null) {
                    customInterstitialAdapter2.refreshActivityContext(activity2);
                }
                C1243h trackingInfo2 = c1234b.m2904d().getTrackingInfo();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (trackingInfo2 != null) {
                    trackingInfo2.f4134B = str;
                    trackingInfo2.m3095h(C1344h.m4135a(trackingInfo2.m2678ai(), trackingInfo2.m3026F(), jCurrentTimeMillis));
                    C1358v.m4252a(C2348a.this.f14749d, trackingInfo2);
                    C1358v.m4258a((Map<String, Object>) map, trackingInfo2);
                    C1358v.m4256a(C2348a.this.f14750e, trackingInfo2);
                }
                C1148a.m1904a().m1916a(C2348a.this.f14749d, c1234b);
                C1320c.m3839a(C2348a.this.f14749d).m3853a(13, trackingInfo2, c1234b.m2904d().getUnitGroupInfo(), jCurrentTimeMillis);
                if (i > 0) {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.a.1.1
                        public RunnableC46841() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            C2348a.m12149a(C2348a.this, activity);
                        }
                    });
                }
                C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.interstitial.a.a.1.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ CustomInterstitialAdapter f14762a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1243h f14763b;

                    public AnonymousClass2(CustomInterstitialAdapter customInterstitialAdapter22, C1243h trackingInfo22) {
                        customInterstitialAdapter = customInterstitialAdapter22;
                        c1243h = trackingInfo22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        customInterstitialAdapter.setScenario(str);
                        IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
                        if (iExHandlerM2132b != null) {
                            CustomInterstitialAdapter customInterstitialAdapter22 = customInterstitialAdapter;
                            customInterstitialAdapter22.setAdDownloadListener(iExHandlerM2132b.createDownloadListener(customInterstitialAdapter22, null, aTEventInterface));
                        }
                        C2352e c2352e = new C2352e(customInterstitialAdapter, aTInterstitialListener);
                        if (customInterstitialAdapter.getMixedFormatAdType() == 0) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            C2348a.m12150a(C2348a.this, activity, c2352e, c1234b.m2905e(), c1243h, str);
                        } else {
                            customInterstitialAdapter.internalShow(activity, null, new C2349b(c2352e));
                        }
                        C1243h trackingInfo22 = customInterstitialAdapter.getTrackingInfo();
                        C1322e.m3916a("4", trackingInfo22.m2678ai(), trackingInfo22.m2677ah(), trackingInfo22.m3026F(), trackingInfo22.m3039P(), 4, SystemClock.elapsedRealtime() - j);
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        if (i <= 0 || !C2348a.this.f14748c.get()) {
                            return;
                        }
                        if (C2348a.this.f14747b != null) {
                            ((ViewGroup) C2348a.this.f14747b.getParent()).removeView(C2348a.this.f14747b);
                        }
                        C2348a.this.f14748c.set(false);
                    }
                }, i);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m12159a(Context context, int i, InterfaceC1162a interfaceC1162a, C1163b c1163b, Map<String, Object> map, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
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
        this.f14751f.m2398b(this.f14749d, "3", this.f14750e, c1257v, interfaceC1162a);
    }
}
