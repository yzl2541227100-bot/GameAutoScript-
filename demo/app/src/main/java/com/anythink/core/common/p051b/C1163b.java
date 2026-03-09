package com.anythink.core.common.p051b;

import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p055f.C1243h;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.core.common.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1163b {

    /* JADX INFO: renamed from: a */
    public WeakReference<ATAdSourceStatusListener> f2992a;

    /* JADX INFO: renamed from: com.anythink.core.common.b.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f2993a;

        public AnonymousClass1(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
            if (aTAdSourceStatusListenerM2014a != null) {
                aTAdSourceStatusListenerM2014a.onAdSourceBiddingAttempt(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.b$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f2995a;

        public AnonymousClass2(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
            if (aTAdSourceStatusListenerM2014a != null) {
                aTAdSourceStatusListenerM2014a.onAdSourceBiddingFilled(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.b$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f2997a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdError f2998b;

        public AnonymousClass3(ATAdInfo aTAdInfo, AdError adError) {
            aTAdInfo = aTAdInfo;
            adError = adError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
            if (aTAdSourceStatusListenerM2014a != null) {
                aTAdSourceStatusListenerM2014a.onAdSourceBiddingFail(aTAdInfo, adError);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.b$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f3000a;

        public AnonymousClass4(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
            if (aTAdSourceStatusListenerM2014a != null) {
                aTAdSourceStatusListenerM2014a.onAdSourceAttempt(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.b$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f3002a;

        public AnonymousClass5(ATAdInfo aTAdInfo) {
            aTAdInfo = aTAdInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
            if (aTAdSourceStatusListenerM2014a != null) {
                aTAdSourceStatusListenerM2014a.onAdSourceLoadFilled(aTAdInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.b$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATAdInfo f3004a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdError f3005b;

        public AnonymousClass6(ATAdInfo aTAdInfo, AdError adError) {
            aTAdInfo = aTAdInfo;
            adError = adError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
            if (aTAdSourceStatusListenerM2014a != null) {
                aTAdSourceStatusListenerM2014a.onAdSourceLoadFail(aTAdInfo, adError);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private ATAdSourceStatusListener m2013a() {
        WeakReference<ATAdSourceStatusListener> weakReference = this.f2992a;
        if (weakReference == null) {
            return null;
        }
        ATAdSourceStatusListener aTAdSourceStatusListener = weakReference.get();
        if (aTAdSourceStatusListener == null) {
            Log.e("anythink", "ATAdSourceStatusListener had been released.");
        }
        return aTAdSourceStatusListener;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ATAdSourceStatusListener m2014a(C1163b c1163b) {
        WeakReference<ATAdSourceStatusListener> weakReference = c1163b.f2992a;
        if (weakReference == null) {
            return null;
        }
        ATAdSourceStatusListener aTAdSourceStatusListener = weakReference.get();
        if (aTAdSourceStatusListener == null) {
            Log.e("anythink", "ATAdSourceStatusListener had been released.");
        }
        return aTAdSourceStatusListener;
    }

    /* JADX INFO: renamed from: a */
    public final void m2015a(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (aTAdSourceStatusListener == null) {
            return;
        }
        this.f2992a = new WeakReference<>(aTAdSourceStatusListener);
    }

    /* JADX INFO: renamed from: a */
    public final void m2016a(C1243h c1243h) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.b.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f2993a;

            public AnonymousClass1(ATAdInfo aTAdInfo) {
                aTAdInfo = aTAdInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
                if (aTAdSourceStatusListenerM2014a != null) {
                    aTAdSourceStatusListenerM2014a.onAdSourceBiddingAttempt(aTAdInfo);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m2017a(C1243h c1243h, AdError adError) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.b.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f2997a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AdError f2998b;

            public AnonymousClass3(ATAdInfo aTAdInfo, AdError adError2) {
                aTAdInfo = aTAdInfo;
                adError = adError2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
                if (aTAdSourceStatusListenerM2014a != null) {
                    aTAdSourceStatusListenerM2014a.onAdSourceBiddingFail(aTAdInfo, adError);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m2018b(C1243h c1243h) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.b.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f2995a;

            public AnonymousClass2(ATAdInfo aTAdInfo) {
                aTAdInfo = aTAdInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
                if (aTAdSourceStatusListenerM2014a != null) {
                    aTAdSourceStatusListenerM2014a.onAdSourceBiddingFilled(aTAdInfo);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m2019b(C1243h c1243h, AdError adError) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.b.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f3004a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AdError f3005b;

            public AnonymousClass6(ATAdInfo aTAdInfo, AdError adError2) {
                aTAdInfo = aTAdInfo;
                adError = adError2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
                if (aTAdSourceStatusListenerM2014a != null) {
                    aTAdSourceStatusListenerM2014a.onAdSourceLoadFail(aTAdInfo, adError);
                }
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m2020c(C1243h c1243h) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.b.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f3000a;

            public AnonymousClass4(ATAdInfo aTAdInfo) {
                aTAdInfo = aTAdInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
                if (aTAdSourceStatusListenerM2014a != null) {
                    aTAdSourceStatusListenerM2014a.onAdSourceAttempt(aTAdInfo);
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m2021d(C1243h c1243h) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.b.5

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATAdInfo f3002a;

            public AnonymousClass5(ATAdInfo aTAdInfo) {
                aTAdInfo = aTAdInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ATAdSourceStatusListener aTAdSourceStatusListenerM2014a = C1163b.m2014a(C1163b.this);
                if (aTAdSourceStatusListenerM2014a != null) {
                    aTAdSourceStatusListenerM2014a.onAdSourceLoadFilled(aTAdInfo);
                }
            }
        });
    }
}
