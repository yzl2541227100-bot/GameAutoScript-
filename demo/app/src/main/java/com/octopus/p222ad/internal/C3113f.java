package com.octopus.p222ad.internal;

import android.util.Log;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.NativeAdResponse;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import com.octopus.p222ad.internal.network.InterfaceC3127b;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.internal.view.AdWebView;
import com.octopus.p222ad.internal.view.BannerAdViewImpl;
import com.octopus.p222ad.internal.view.InterfaceC3194b;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.lang.ref.SoftReference;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.octopus.ad.internal.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3113f extends AbstractC3129o {

    /* JADX INFO: renamed from: a */
    private final SoftReference<AdViewImpl> f17130a;

    /* JADX INFO: renamed from: b */
    private AsyncTaskC3126a f17131b;

    /* JADX INFO: renamed from: com.octopus.ad.internal.f$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ServerResponse f17132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdViewImpl f17133b;

        public AnonymousClass1(ServerResponse serverResponse, AdViewImpl adViewImpl) {
            serverResponse = serverResponse;
            adViewImpl = adViewImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            ServerResponse serverResponse = serverResponse;
            if (!(serverResponse != null && serverResponse.containsAds())) {
                HaoboLog.m14615w(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_no_ads));
                adViewImpl.getAdDispatcher().mo14236a(AdRequest.ERROR_CODE_NO_FILL);
                return;
            }
            Log.d("octopus", "getMediaType:" + adViewImpl.getMediaType());
            if (adViewImpl.getMediaType().equals(EnumC3119l.BANNER)) {
                ((BannerAdViewImpl) adViewImpl).resetContainerIfNeeded();
            }
            Log.d("octopus", "handleStandardAds");
            C3113f.this.m14398a(adViewImpl, serverResponse);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.f$2 */
    public class AnonymousClass2 implements InterfaceC3127b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdViewImpl f17135a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdWebView f17136b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ServerResponse f17137c;

        public AnonymousClass2(AdViewImpl adViewImpl, AdWebView adWebView, ServerResponse serverResponse) {
            adViewImpl = adViewImpl;
            adWebView = adWebView;
            serverResponse = serverResponse;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: a */
        public EnumC3119l mo14402a() {
            return adViewImpl.getMediaType();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: b */
        public InterfaceC3194b mo14403b() {
            return (adViewImpl.getMediaType() == EnumC3119l.INTERSTITIAL || adViewImpl.getMediaType() == EnumC3119l.REWARDVIDEO) ? adWebView : adWebView.getRealDisplayable();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: c */
        public NativeAdResponse mo14404c() {
            return null;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: d */
        public String mo14405d() {
            return serverResponse.getAdExtInfo();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: e */
        public int mo14406e() {
            return serverResponse.getPrice();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: f */
        public String mo14407f() {
            return serverResponse.getTagId();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: g */
        public String mo14408g() {
            return serverResponse.getAdId();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: h */
        public void mo14409h() {
            adWebView.destroy();
        }
    }

    public C3113f(AdViewImpl adViewImpl) {
        this.f17130a = new SoftReference<>(adViewImpl);
    }

    /* JADX INFO: renamed from: a */
    public void m14398a(AdViewImpl adViewImpl, ServerResponse serverResponse) {
        try {
            adViewImpl.getAdParameters().m14373a(false);
            AdWebView adWebView = new AdWebView(adViewImpl);
            adWebView.loadAd(serverResponse);
            adViewImpl.createAdLogo(serverResponse.getTextLogInfo(), serverResponse.getLogoInfo());
            if (adViewImpl.getMediaType().equals(EnumC3119l.BANNER)) {
                adViewImpl.addBannerCloseBtn();
                BannerAdViewImpl bannerAdViewImpl = (BannerAdViewImpl) adViewImpl;
                if (bannerAdViewImpl.getExpandsToFitScreenWidth()) {
                    bannerAdViewImpl.expandToFitScreenWidth(serverResponse.getWidth(), serverResponse.getHeight(), adWebView);
                }
            }
            adViewImpl.serverResponse = serverResponse;
            m14399a(new InterfaceC3127b() { // from class: com.octopus.ad.internal.f.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AdViewImpl f17135a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AdWebView f17136b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ServerResponse f17137c;

                public AnonymousClass2(AdViewImpl adViewImpl2, AdWebView adWebView2, ServerResponse serverResponse2) {
                    adViewImpl = adViewImpl2;
                    adWebView = adWebView2;
                    serverResponse = serverResponse2;
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: a */
                public EnumC3119l mo14402a() {
                    return adViewImpl.getMediaType();
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: b */
                public InterfaceC3194b mo14403b() {
                    return (adViewImpl.getMediaType() == EnumC3119l.INTERSTITIAL || adViewImpl.getMediaType() == EnumC3119l.REWARDVIDEO) ? adWebView : adWebView.getRealDisplayable();
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: c */
                public NativeAdResponse mo14404c() {
                    return null;
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: d */
                public String mo14405d() {
                    return serverResponse.getAdExtInfo();
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: e */
                public int mo14406e() {
                    return serverResponse.getPrice();
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: f */
                public String mo14407f() {
                    return serverResponse.getTagId();
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: g */
                public String mo14408g() {
                    return serverResponse.getAdId();
                }

                @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                /* JADX INFO: renamed from: h */
                public void mo14409h() {
                    adWebView.destroy();
                }
            });
        } catch (Exception e) {
            Log.d("octopus", "========Exception=========:" + e);
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Exception initializing the view: " + e.getMessage());
            mo14394a(AdRequest.ERROR_CODE_INTERNAL_ERROR);
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14393a() {
        if (m14401d() == null) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Before execute request manager, you should set ad request!");
            return;
        }
        this.f17131b = new AsyncTaskC3126a(m14401d());
        m14591e();
        try {
            this.f17131b.m14557a(this);
            this.f17131b.executeOnExecutor(C3257h.m14988b().m14989c(), new Void[0]);
            AdViewImpl adViewImpl = this.f17130a.get();
            if (adViewImpl != null) {
                adViewImpl.getAdDispatcher().mo14244e();
            }
        } catch (IllegalStateException e) {
            Log.d("octopus", "ignored:" + e.getMessage());
        } catch (RejectedExecutionException e2) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Concurrent Thread Exception while firing new ad request: " + e2.getMessage());
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14394a(int i) {
        m14592f();
        AdViewImpl adViewImpl = this.f17130a.get();
        if (adViewImpl != null) {
            adViewImpl.getAdDispatcher().mo14236a(i);
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14395a(ServerResponse serverResponse) {
        AdViewImpl adViewImpl = this.f17130a.get();
        if (adViewImpl != null) {
            adViewImpl.getMyHandler().post(new Runnable() { // from class: com.octopus.ad.internal.f.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ServerResponse f17132a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AdViewImpl f17133b;

                public AnonymousClass1(ServerResponse serverResponse2, AdViewImpl adViewImpl2) {
                    serverResponse = serverResponse2;
                    adViewImpl = adViewImpl2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ServerResponse serverResponse2 = serverResponse;
                    if (!(serverResponse2 != null && serverResponse2.containsAds())) {
                        HaoboLog.m14615w(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_no_ads));
                        adViewImpl.getAdDispatcher().mo14236a(AdRequest.ERROR_CODE_NO_FILL);
                        return;
                    }
                    Log.d("octopus", "getMediaType:" + adViewImpl.getMediaType());
                    if (adViewImpl.getMediaType().equals(EnumC3119l.BANNER)) {
                        ((BannerAdViewImpl) adViewImpl).resetContainerIfNeeded();
                    }
                    Log.d("octopus", "handleStandardAds");
                    C3113f.this.m14398a(adViewImpl, serverResponse);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14399a(InterfaceC3127b interfaceC3127b) {
        m14592f();
        AdViewImpl adViewImpl = this.f17130a.get();
        if (adViewImpl != null) {
            adViewImpl.getAdDispatcher().mo14238a(interfaceC3127b);
        } else {
            interfaceC3127b.mo14409h();
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: b */
    public C3111d mo14396b() {
        AdViewImpl adViewImpl = this.f17130a.get();
        if (adViewImpl != null) {
            return adViewImpl.getAdParameters();
        }
        return null;
    }

    @Override // com.octopus.p222ad.internal.AbstractC3129o
    /* JADX INFO: renamed from: c */
    public void mo14400c() {
        AsyncTaskC3126a asyncTaskC3126a = this.f17131b;
        if (asyncTaskC3126a != null) {
            asyncTaskC3126a.cancel(true);
            this.f17131b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public AsyncTaskC3126a.a m14401d() {
        if (this.f17130a.get() != null) {
            return this.f17130a.get().getAdRequest();
        }
        return null;
    }
}
