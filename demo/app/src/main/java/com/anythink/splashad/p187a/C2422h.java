package com.anythink.splashad.p187a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1240e;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p065n.C1324g;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p066o.p067a.C1332f;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.anythink.splashad.unitgroup.api.CustomSplashEventListener;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.anythink.splashad.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2422h implements CustomSplashEventListener {

    /* JADX INFO: renamed from: a */
    public CustomSplashAdapter f15059a;

    /* JADX INFO: renamed from: b */
    public AbstractC2415a f15060b;

    /* JADX INFO: renamed from: c */
    public long f15061c;

    /* JADX INFO: renamed from: d */
    private Timer f15062d;

    /* JADX INFO: renamed from: e */
    private boolean f15063e = false;

    /* JADX INFO: renamed from: f */
    private int f15064f = 0;

    /* JADX INFO: renamed from: com.anythink.splashad.a.h$1, reason: invalid class name */
    public class AnonymousClass1 extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f15065a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1332f.b f15066b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ATSplashSkipAdListener f15067c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f15068d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f15069e;

        public AnonymousClass1(ViewGroup viewGroup, C1332f.b bVar, ATSplashSkipAdListener aTSplashSkipAdListener, long j, long j2) {
            this.f15065a = viewGroup;
            this.f15066b = bVar;
            this.f15067c = aTSplashSkipAdListener;
            this.f15068d = j;
            this.f15069e = j2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup = this.f15065a;
            if (viewGroup == null || C1360x.m4269a(viewGroup, this.f15066b)) {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.splashad.a.h.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        C2422h c2422h = C2422h.this;
                        long j = c2422h.f15061c;
                        if (j <= 0) {
                            c2422h.m12489a(3);
                            C2422h.this.onSplashAdDismiss();
                        } else {
                            ATSplashSkipAdListener aTSplashSkipAdListener = anonymousClass1.f15067c;
                            if (aTSplashSkipAdListener != null) {
                                aTSplashSkipAdListener.onAdTick(anonymousClass1.f15068d, j);
                            }
                        }
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        C2422h.this.f15061c -= anonymousClass12.f15069e;
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.splashad.a.h$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATSplashSkipAdListener f15072a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f15073b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f15074c;

        public AnonymousClass2(ATSplashSkipAdListener aTSplashSkipAdListener, long j, long j2) {
            this.f15072a = aTSplashSkipAdListener;
            this.f15073b = j;
            this.f15074c = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATSplashSkipAdListener aTSplashSkipAdListener = this.f15072a;
            if (aTSplashSkipAdListener != null) {
                aTSplashSkipAdListener.onAdTick(this.f15073b, C2422h.this.f15061c);
                C2422h.this.f15061c -= this.f15074c;
            }
        }
    }

    public C2422h(CustomSplashAdapter customSplashAdapter, AbstractC2415a abstractC2415a) {
        this.f15059a = customSplashAdapter;
        this.f15060b = abstractC2415a;
    }

    /* JADX INFO: renamed from: a */
    private void m12486a() {
        Timer timer = this.f15062d;
        if (timer != null) {
            timer.cancel();
            this.f15062d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12487a(ATSplashSkipInfo aTSplashSkipInfo) {
        if (this.f15062d == null) {
            long callbackInterval = aTSplashSkipInfo.getCallbackInterval();
            long countDownDuration = aTSplashSkipInfo.getCountDownDuration();
            ViewGroup container = aTSplashSkipInfo.getContainer();
            C1332f.b bVar = new C1332f.b();
            ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
            this.f15061c = countDownDuration;
            Timer timer = new Timer();
            this.f15062d = timer;
            timer.schedule(new AnonymousClass1(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
            C1175n.m2059a().m2135b(new AnonymousClass2(aTSplashSkipAdListener, countDownDuration, callbackInterval));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12488a(String str) {
        C1240e c1240eM4571c;
        if (TextUtils.isEmpty(str) || (c1240eM4571c = C1387u.m4556a().m4571c(str)) == null) {
            return;
        }
        C1387u.m4556a().m4572d(str);
        C1201f.m2340a(C1175n.m2059a().m2148f(), str, "4").m2400c(C1387u.m4556a().m4569b(str, c1240eM4571c.m2973a()));
    }

    /* JADX INFO: renamed from: a */
    public final void m12489a(int i) {
        this.f15064f = i;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDeeplinkCallback(boolean z) {
        AbstractC2415a abstractC2415a = this.f15060b;
        if (abstractC2415a != null) {
            abstractC2415a.onDeeplinkCallback(C1171j.m2045a(this.f15059a), z);
        }
        CustomSplashAdapter customSplashAdapter = this.f15059a;
        if (customSplashAdapter != null) {
            C1352p.m4208a(customSplashAdapter.getTrackingInfo(), C1169h.n.f3183i, z ? C1169h.n.f3186l : C1169h.n.f3187m, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        AbstractC2415a abstractC2415a = this.f15060b;
        if (abstractC2415a != null) {
            abstractC2415a.onDownloadConfirm(context, C1171j.m2045a(this.f15059a), aTNetworkConfirmInfo);
        }
        CustomSplashAdapter customSplashAdapter = this.f15059a;
        if (customSplashAdapter != null) {
            C1352p.m4208a(customSplashAdapter.getTrackingInfo(), C1169h.n.f3184j, C1169h.n.f3186l, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdClicked() {
        CustomSplashAdapter customSplashAdapter = this.f15059a;
        if (customSplashAdapter != null) {
            C1243h trackingInfo = customSplashAdapter.getTrackingInfo();
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(6, trackingInfo);
            C1352p.m4208a(trackingInfo, C1169h.n.f3178d, C1169h.n.f3186l, "");
        }
        AbstractC2415a abstractC2415a = this.f15060b;
        if (abstractC2415a != null) {
            abstractC2415a.onAdClick(C1171j.m2045a(this.f15059a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSplashAdDismiss() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.splashad.p187a.C2422h.onSplashAdDismiss():void");
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShow() {
        C1171j c1171jM2045a = C1171j.m2045a(this.f15059a);
        CustomSplashAdapter customSplashAdapter = this.f15059a;
        if (customSplashAdapter != null) {
            C1243h trackingInfo = customSplashAdapter.getTrackingInfo();
            trackingInfo.m3056a(this.f15059a.getNetworkInfoMap());
            C1320c.m3839a(C1175n.m2059a().m2148f()).m3852a(4, trackingInfo, this.f15059a.getUnitGroupInfo());
            C1352p.m4208a(trackingInfo, C1169h.n.f3177c, C1169h.n.f3186l, "");
            ATSplashSkipInfo splashSkipInfo = this.f15059a.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView() && this.f15059a.isSupportCustomSkipView() && this.f15062d == null) {
                long callbackInterval = splashSkipInfo.getCallbackInterval();
                long countDownDuration = splashSkipInfo.getCountDownDuration();
                ViewGroup container = splashSkipInfo.getContainer();
                C1332f.b bVar = new C1332f.b();
                ATSplashSkipAdListener aTSplashSkipAdListener = splashSkipInfo.getATSplashSkipAdListener();
                this.f15061c = countDownDuration;
                Timer timer = new Timer();
                this.f15062d = timer;
                timer.schedule(new AnonymousClass1(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
                C1175n.m2059a().m2135b(new AnonymousClass2(aTSplashSkipAdListener, countDownDuration, callbackInterval));
            }
            if (trackingInfo != null) {
                C1387u.m4556a().m4563a(trackingInfo.m2677ah(), c1171jM2045a);
            }
        }
        if (this.f15060b != null) {
            if (c1171jM2045a.getNetworkFirmId() == -1) {
                C1324g.m3940a(C1169h.j.f3159e, this.f15059a, null);
            }
            this.f15060b.onAdShow(c1171jM2045a);
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShowFail(AdError adError) {
        CustomSplashAdapter customSplashAdapter = this.f15059a;
        if (customSplashAdapter != null) {
            C1243h trackingInfo = customSplashAdapter.getTrackingInfo();
            C1322e.m3882a(trackingInfo, adError, this.f15059a.getNetworkInfoMap());
            C1352p.m4208a(trackingInfo, C1169h.n.f3185k, C1169h.n.f3187m, adError != null ? adError.getFullErrorInfo() : "");
        }
    }
}
