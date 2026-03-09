package com.anythink.interstitial.p183a;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.interstitial.api.ATInterstitialAutoEventListener;
import com.anythink.interstitial.api.ATInterstitialExListener;

/* JADX INFO: renamed from: com.anythink.interstitial.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2351d implements ATInterstitialExListener {

    /* JADX INFO: renamed from: a */
    public ATInterstitialAutoEventListener f14784a;

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14785a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f14786b;

        public AnonymousClass1(ATAdInfo aTAdInfo, boolean z) {
            aTAdInfo = aTAdInfo;
            z = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onDeeplinkCallback(aTAdInfo, z);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f14788a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATAdInfo f14789b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ATNetworkConfirmInfo f14790c;

        public AnonymousClass2(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            context = context;
            aTAdInfo = aTAdInfo;
            aTNetworkConfirmInfo = aTNetworkConfirmInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                Context contextM2099E = context;
                if (contextM2099E == null) {
                    contextM2099E = C1175n.m2059a().m2099E();
                }
                aTInterstitialAutoEventListener.onDownloadConfirm(contextM2099E, aTAdInfo, aTNetworkConfirmInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14792a;

        public AnonymousClass3(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onInterstitialAdVideoStart(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14794a;

        public AnonymousClass4(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onInterstitialAdVideoEnd(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdError f14796a;

        public AnonymousClass5(AdError adError) {
            adError = adError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onInterstitialAdVideoError(adError);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14798a;

        public AnonymousClass6(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onInterstitialAdClose(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$7 */
    public class AnonymousClass7 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14800a;

        public AnonymousClass7(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onInterstitialAdClicked(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.interstitial.a.d$8 */
    public class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f14802a;

        public AnonymousClass8(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
            if (aTInterstitialAutoEventListener != null) {
                aTInterstitialAutoEventListener.onInterstitialAdShow(aTAdInfo);
            }
        }
    }

    public C2351d(ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        this.f14784a = aTInterstitialAutoEventListener;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14785a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f14786b;

            public AnonymousClass1(ATAdInfo aTAdInfo2, boolean z3) {
                aTAdInfo = aTAdInfo2;
                z = z3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onDeeplinkCallback(aTAdInfo, z);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f14788a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ATAdInfo f14789b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ATNetworkConfirmInfo f14790c;

            public AnonymousClass2(Context context2, ATAdInfo aTAdInfo2, ATNetworkConfirmInfo aTNetworkConfirmInfo2) {
                context = context2;
                aTAdInfo = aTAdInfo2;
                aTNetworkConfirmInfo = aTNetworkConfirmInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    Context contextM2099E = context;
                    if (contextM2099E == null) {
                        contextM2099E = C1175n.m2059a().m2099E();
                    }
                    aTInterstitialAutoEventListener.onDownloadConfirm(contextM2099E, aTAdInfo, aTNetworkConfirmInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.7

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14800a;

            public AnonymousClass7(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdClicked(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14798a;

            public AnonymousClass6(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdClose(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoaded() {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.8

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14802a;

            public AnonymousClass8(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdShow(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14794a;

            public AnonymousClass4(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdVideoEnd(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoError(AdError adError) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.5

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdError f14796a;

            public AnonymousClass5(AdError adError2) {
                adError = adError2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdVideoError(adError);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.interstitial.a.d.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f14792a;

            public AnonymousClass3(ATAdInfo aTAdInfo2) {
                aTAdInfo = aTAdInfo2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = C2351d.this.f14784a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdVideoStart(aTAdInfo);
                }
            }
        });
    }
}
