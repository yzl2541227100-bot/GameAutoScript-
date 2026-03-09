package p285z2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativeEventListener;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.api.NativeAd;
import com.anythink.splashad.api.ATSplashAd;
import com.anythink.splashad.api.ATSplashAdExtraInfo;
import com.anythink.splashad.api.ATSplashAdListener;
import com.elfin.p203ad.C2711R;
import com.elfin.p203ad.model.yunjing.YunjingNativeAdView;
import com.octopus.p222ad.Octopus;

/* JADX INFO: renamed from: z2.ai */
/* JADX INFO: loaded from: classes2.dex */
public class C3692ai {
    public static final String OooO = "a65517da9564af";
    private static final String OooO0oo = "YunJingAdManager";
    public static final String OooOO0 = "79c5beb4fa44a273013b5196ffd1f13a";
    public static final String OooOO0O = "b65517e46d465a";
    private static C3692ai OooOO0o;
    public String OooO00o = "";
    private ATSplashAd OooO0O0;
    private ATNative OooO0OO;
    private NativeAd OooO0Oo;
    private ATNativeAdView OooO0o;
    private YunjingNativeAdView OooO0o0;
    private View OooO0oO;

    /* JADX INFO: renamed from: z2.ai$OooO00o */
    public class OooO00o implements ATSplashAdListener {
        public final /* synthetic */ InterfaceC4505wh OooO00o;
        public final /* synthetic */ Context OooO0O0;
        public final /* synthetic */ ViewGroup OooO0OO;

        public OooO00o(InterfaceC4505wh interfaceC4505wh, Context context, ViewGroup viewGroup) {
            this.OooO00o = interfaceC4505wh;
            this.OooO0O0 = context;
            this.OooO0OO = viewGroup;
        }

        @Override // com.anythink.splashad.api.ATSplashAdListener
        public void onAdClick(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.splashad.api.ATSplashAdListener
        public void onAdDismiss(ATAdInfo aTAdInfo, ATSplashAdExtraInfo aTSplashAdExtraInfo) {
            InterfaceC4505wh interfaceC4505wh = this.OooO00o;
            if (interfaceC4505wh != null) {
                interfaceC4505wh.OooO0OO(null, null);
            }
        }

        @Override // com.anythink.splashad.api.ATSplashAdListener
        public void onAdLoadTimeout() {
            InterfaceC4505wh interfaceC4505wh = this.OooO00o;
            if (interfaceC4505wh != null) {
                interfaceC4505wh.onAdLoadTimeout();
            }
        }

        @Override // com.anythink.splashad.api.ATSplashAdListener
        public void onAdLoaded(boolean z) {
            if (this.OooO00o != null) {
                Log.d("222", "init onAdLoaded OK:");
                if (C3692ai.this.OooO0O0.isAdReady()) {
                    C3692ai.this.OooO0O0.show((Activity) this.OooO0O0, this.OooO0OO);
                }
            }
        }

        @Override // com.anythink.splashad.api.ATSplashAdListener
        public void onAdShow(ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.splashad.api.ATSplashAdListener
        public void onNoAdError(AdError adError) {
            Log.d(C3692ai.OooO0oo, "onNoAdError code :" + adError.getCode());
            Log.d(C3692ai.OooO0oo, "onNoAdError msg :" + adError.getDesc());
            InterfaceC4505wh interfaceC4505wh = this.OooO00o;
            if (interfaceC4505wh != null) {
                interfaceC4505wh.OooO0Oo(new C4579yh(adError.getCode(), adError.getDesc()));
            }
        }
    }

    /* JADX INFO: renamed from: z2.ai$OooO0O0 */
    public class OooO0O0 implements ATNativeNetworkListener {
        public final /* synthetic */ InterfaceC3766ci OooO00o;
        public final /* synthetic */ Context OooO0O0;
        public final /* synthetic */ ViewGroup OooO0OO;

        public OooO0O0(InterfaceC3766ci interfaceC3766ci, Context context, ViewGroup viewGroup) {
            this.OooO00o = interfaceC3766ci;
            this.OooO0O0 = context;
            this.OooO0OO = viewGroup;
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            InterfaceC3766ci interfaceC3766ci = this.OooO00o;
            if (interfaceC3766ci != null) {
                interfaceC3766ci.OooO0O0(new C4579yh(adError.getCode(), adError.getDesc()));
            }
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            InterfaceC3766ci interfaceC3766ci = this.OooO00o;
            if (interfaceC3766ci != null) {
                interfaceC3766ci.onNativeAdLoaded();
            }
            C3692ai.this.OooOOo(this.OooO0O0, this.OooO0OO, this.OooO00o);
        }
    }

    /* JADX INFO: renamed from: z2.ai$OooO0OO */
    public class OooO0OO implements Runnable {
        public final /* synthetic */ Context OoooOoO;
        public final /* synthetic */ InterfaceC3766ci OoooOoo;

        /* JADX INFO: renamed from: z2.ai$OooO0OO$OooO00o */
        public class OooO00o implements View.OnClickListener {
            public OooO00o() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OooO0OO.this.OoooOoo.OooO00o();
            }
        }

        /* JADX INFO: renamed from: z2.ai$OooO0OO$OooO0O0 */
        public class OooO0O0 implements ATNativeEventListener {
            public OooO0O0() {
            }

            @Override // com.anythink.nativead.api.ATNativeEventListener
            public void onAdClicked(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo) {
                Log.i(C3692ai.OooO0oo, "native ad onAdClicked:\n" + aTAdInfo.toString());
            }

            @Override // com.anythink.nativead.api.ATNativeEventListener
            public void onAdImpressed(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo) {
                Log.i(C3692ai.OooO0oo, "native ad onAdImpressed:\n" + aTAdInfo.toString());
            }

            @Override // com.anythink.nativead.api.ATNativeEventListener
            public void onAdVideoEnd(ATNativeAdView aTNativeAdView) {
                Log.i(C3692ai.OooO0oo, "native ad onAdVideoEnd");
            }

            @Override // com.anythink.nativead.api.ATNativeEventListener
            public void onAdVideoProgress(ATNativeAdView aTNativeAdView, int i) {
                Log.i(C3692ai.OooO0oo, "native ad onAdVideoProgress:" + i);
            }

            @Override // com.anythink.nativead.api.ATNativeEventListener
            public void onAdVideoStart(ATNativeAdView aTNativeAdView) {
                Log.i(C3692ai.OooO0oo, "native ad onAdVideoStart");
            }
        }

        public OooO0OO(Context context, InterfaceC3766ci interfaceC3766ci) {
            this.OoooOoO = context;
            this.OoooOoo = interfaceC3766ci;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3692ai.this.OooO0o == null) {
                C3692ai c3692ai = C3692ai.this;
                c3692ai.OooO0o = (ATNativeAdView) c3692ai.OooO0o0.findViewById(C2711R.id.native_ad_view);
            }
            if (C3692ai.this.OooO0oO == null) {
                C3692ai c3692ai2 = C3692ai.this;
                c3692ai2.OooO0oO = c3692ai2.OooO0o0.findViewById(C2711R.id.native_selfrender_view);
            }
            if (C3692ai.this.OooO0oO == null) {
                Log.d(C3692ai.OooO0oo, "mSelfRenderView is null 1");
                return;
            }
            NativeAd nativeAd = C3692ai.this.OooO0OO.getNativeAd();
            if (nativeAd != null) {
                if (C3692ai.this.OooO0Oo != null) {
                    C3692ai.this.OooO0Oo.destory();
                }
                C3692ai.this.OooO0Oo = nativeAd;
                ATNativePrepareInfo aTNativePrepareInfo = null;
                if (C3692ai.this.OooO0Oo.isNativeExpress()) {
                    C3692ai.this.OooO0Oo.renderAdContainer(C3692ai.this.OooO0o, null);
                } else {
                    aTNativePrepareInfo = new ATNativePrepareInfo();
                    C4542xh.OooO00o(this.OoooOoO, C3692ai.this.OooO0Oo.getAdMaterial(), C3692ai.this.OooO0oO, aTNativePrepareInfo);
                    C3692ai.this.OooO0Oo.renderAdContainer(C3692ai.this.OooO0o, C3692ai.this.OooO0oO);
                }
                C3692ai.this.OooO0Oo.prepare(C3692ai.this.OooO0o, aTNativePrepareInfo);
            }
            ((ImageView) C3692ai.this.OooO0o0.findViewById(C2711R.id.native_ad_close)).setOnClickListener(new OooO00o());
            C3692ai.this.OooO0Oo.setNativeEventListener(new OooO0O0());
        }
    }

    private C3692ai() {
    }

    public static C3692ai OooOO0o() {
        if (OooOO0o == null) {
            synchronized (C3692ai.class) {
                if (OooOO0o == null) {
                    OooOO0o = new C3692ai();
                }
            }
        }
        return OooOO0o;
    }

    public void OooOOo(Context context, ViewGroup viewGroup, InterfaceC3766ci interfaceC3766ci) {
        ATNative aTNative = this.OooO0OO;
        if (aTNative != null && aTNative.checkAdStatus().isReady()) {
            if (this.OooO0o0 == null) {
                YunjingNativeAdView yunjingNativeAdView = new YunjingNativeAdView(context);
                this.OooO0o0 = yunjingNativeAdView;
                viewGroup.addView(yunjingNativeAdView);
            }
            this.OooO0o0.post(new OooO0OO(context, interfaceC3766ci));
        }
    }

    public void OooOO0O(Context context, ViewGroup viewGroup, InterfaceC4505wh interfaceC4505wh) {
        ATSplashAd aTSplashAd = new ATSplashAd(context, OooOO0O, new OooO00o(interfaceC4505wh, context, viewGroup), 10000, this.OooO00o);
        this.OooO0O0 = aTSplashAd;
        aTSplashAd.loadAd();
    }

    public void OooOOO(Context context, ViewGroup viewGroup, InterfaceC3766ci interfaceC3766ci) {
        if (this.OooO0OO == null) {
            this.OooO0OO = new ATNative(context, "b65517e48a23c7", new OooO0O0(interfaceC3766ci, context, viewGroup));
        }
        this.OooO0OO.makeAdRequest();
    }

    public void OooOOO0(Context context) {
        Log.d(OooO0oo, "orid SDK OK:" + Octopus.getOaid(context));
        ATSDK.integrationChecking(context);
        ATSDK.init(context, OooO, OooOO0);
    }

    public void OooOOOO() {
        NativeAd nativeAd = this.OooO0Oo;
        if (nativeAd != null) {
            nativeAd.destory();
            this.OooO0OO.setAdListener(null);
            this.OooO0OO.setAdSourceStatusListener(null);
            this.OooO0o0 = null;
            this.OooO0oO = null;
        }
        ATNativeAdView aTNativeAdView = this.OooO0o;
        if (aTNativeAdView != null) {
            aTNativeAdView.destory();
            this.OooO0o = null;
        }
    }

    public void OooOOOo() {
        NativeAd nativeAd = this.OooO0Oo;
        if (nativeAd != null) {
            nativeAd.onPause();
        }
    }

    public void OooOOo0() {
        NativeAd nativeAd = this.OooO0Oo;
        if (nativeAd != null) {
            nativeAd.onResume();
        }
    }

    public void OooOOoo() {
        ATSplashAd aTSplashAd = this.OooO0O0;
        if (aTSplashAd != null) {
            aTSplashAd.setAdListener(null);
            this.OooO0O0.setAdDownloadListener(null);
            this.OooO0O0.setAdSourceStatusListener(null);
            this.OooO0O0 = null;
        }
    }
}
