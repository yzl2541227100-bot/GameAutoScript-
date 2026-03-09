package com.anythink.rewardvideo.p186a;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.rewardvideo.api.ATRewardVideoAutoEventListener;
import com.anythink.rewardvideo.api.ATRewardVideoExListener;

/* JADX INFO: renamed from: com.anythink.rewardvideo.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2407b implements ATRewardVideoExListener {

    /* JADX INFO: renamed from: a */
    public ATRewardVideoAutoEventListener f14953a;

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14954a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f14955b;

        public AnonymousClass1(ATAdInfo aTAdInfo, boolean z) {
            aTAdInfo = aTAdInfo;
            z = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onDeeplinkCallback(aTAdInfo, z);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$10 */
    public class AnonymousClass10 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14957a;

        public AnonymousClass10(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayClicked(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$11 */
    public class AnonymousClass11 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14959a;

        public AnonymousClass11(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onAgainReward(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$12 */
    public class AnonymousClass12 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14961a;

        public AnonymousClass12(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayStart(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$13 */
    public class AnonymousClass13 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14963a;

        public AnonymousClass13(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayEnd(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdError f14965a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATAdInfo f14966b;

        public AnonymousClass2(AdError adError, ATAdInfo aTAdInfo) {
            adError = adError;
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(adError, aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14968a;

        public AnonymousClass3(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdClosed(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14970a;

        public AnonymousClass4(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayClicked(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14972a;

        public AnonymousClass5(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onReward(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f14974a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATAdInfo f14975b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ATNetworkConfirmInfo f14976c;

        public AnonymousClass6(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            context = context;
            aTAdInfo = aTAdInfo;
            aTNetworkConfirmInfo = aTNetworkConfirmInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onDownloadConfirm(context, aTAdInfo, aTNetworkConfirmInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$7 */
    public class AnonymousClass7 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14978a;

        public AnonymousClass7(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayStart(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$8 */
    public class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14980a;

        public AnonymousClass8(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayEnd(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.rewardvideo.a.b$9 */
    public class AnonymousClass9 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdError f14982a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATAdInfo f14983b;

        public AnonymousClass9(AdError adError, ATAdInfo aTAdInfo) {
            adError = adError;
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayFailed(adError, aTAdInfo);
            }
        }
    }

    public C2407b(ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        this.f14953a = aTRewardVideoAutoEventListener;
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onAgainReward(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.11

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14959a;

            public AnonymousClass11(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onAgainReward(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14954a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f14955b;

            public AnonymousClass1(ATAdInfo aTAdInfo2, boolean z3) {
                aTAdInfo = aTAdInfo2;
                z = z3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onDeeplinkCallback(aTAdInfo, z);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f14974a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ATAdInfo f14975b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ATNetworkConfirmInfo f14976c;

            public AnonymousClass6(Context context2, ATAdInfo aTAdInfo2, ATNetworkConfirmInfo aTNetworkConfirmInfo2) {
                context = context2;
                aTAdInfo = aTAdInfo2;
                aTNetworkConfirmInfo = aTNetworkConfirmInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onDownloadConfirm(context, aTAdInfo, aTNetworkConfirmInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onReward(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.5

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14972a;

            public AnonymousClass5(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onReward(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayClicked(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.10

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14957a;

            public AnonymousClass10(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayClicked(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayEnd(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.8

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14980a;

            public AnonymousClass8(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayEnd(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayFailed(AdError adError, ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.9

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdError f14982a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ATAdInfo f14983b;

            public AnonymousClass9(AdError adError2, ATAdInfo aTAdInfo2) {
                adError = adError2;
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayFailed(adError, aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
    public final void onRewardedVideoAdAgainPlayStart(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.7

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14978a;

            public AnonymousClass7(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdAgainPlayStart(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdClosed(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14968a;

            public AnonymousClass3(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdClosed(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdFailed(AdError adError) {
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdLoaded() {
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayClicked(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14970a;

            public AnonymousClass4(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayClicked(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayEnd(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.13

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14963a;

            public AnonymousClass13(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayEnd(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayFailed(AdError adError, ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdError f14965a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ATAdInfo f14966b;

            public AnonymousClass2(AdError adError2, ATAdInfo aTAdInfo2) {
                adError = adError2;
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(adError, aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
    public final void onRewardedVideoAdPlayStart(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.rewardvideo.a.b.12

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14961a;

            public AnonymousClass12(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener = C2407b.this.f14953a;
                if (aTRewardVideoAutoEventListener != null) {
                    aTRewardVideoAutoEventListener.onRewardedVideoAdPlayStart(aTAdInfo);
                }
            }
        });
    }
}
