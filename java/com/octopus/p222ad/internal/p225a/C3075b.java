package com.octopus.p222ad.internal.p225a;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.video.AdVideoView;
import com.octopus.p222ad.internal.view.AdWebView;
import com.octopus.p222ad.internal.view.InterfaceC3194b;
import com.octopus.p222ad.internal.view.InterfaceC3196d;
import com.octopus.p222ad.internal.view.InterstitialAdViewImpl;

/* JADX INFO: renamed from: com.octopus.ad.internal.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3075b implements AdActivity.InterfaceC3053a {

    /* JADX INFO: renamed from: a */
    private Activity f17024a;

    /* JADX INFO: renamed from: b */
    private AdWebView f17025b;

    /* JADX INFO: renamed from: c */
    private InterfaceC3194b f17026c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f17027d;

    /* JADX INFO: renamed from: e */
    private long f17028e;

    /* JADX INFO: renamed from: f */
    private InterstitialAdViewImpl f17029f;

    public C3075b(Activity activity) {
        this.f17024a = activity;
    }

    /* JADX INFO: renamed from: a */
    private void m14232a(InterstitialAdViewImpl interstitialAdViewImpl) {
        InterfaceC3196d interfaceC3196dPoll;
        FrameLayout frameLayout;
        View view;
        FrameLayout.LayoutParams layoutParams;
        this.f17029f = interstitialAdViewImpl;
        if (interstitialAdViewImpl == null) {
            return;
        }
        interstitialAdViewImpl.setAdImplementation(this);
        this.f17027d.setBackgroundColor(this.f17029f.getBackgroundColor());
        this.f17027d.removeAllViews();
        if (this.f17029f.getParent() != null) {
            ((ViewGroup) this.f17029f.getParent()).removeAllViews();
        }
        while (true) {
            interfaceC3196dPoll = this.f17029f.getAdQueue().poll();
            if (interfaceC3196dPoll == null || (this.f17028e - interfaceC3196dPoll.mo14774a() <= InterstitialAdViewImpl.MAX_AGE && this.f17028e - interfaceC3196dPoll.mo14774a() >= 0)) {
                break;
            } else {
                HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.too_old));
            }
        }
        if (interfaceC3196dPoll == null || !(interfaceC3196dPoll.mo14776c() instanceof AdWebView)) {
            return;
        }
        AdWebView adWebView = (AdWebView) interfaceC3196dPoll.mo14776c();
        this.f17025b = adWebView;
        if (adWebView.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) this.f17025b.getContext()).setBaseContext(this.f17024a);
            AdVideoView adVideoView = this.f17025b.mAdVideoView;
            if (adVideoView != null) {
                ((MutableContextWrapper) adVideoView.getContext()).setBaseContext(this.f17024a);
            }
        }
        if ((this.f17025b.getCreativeWidth() != 1 || this.f17025b.getCreativeHeight() != 1) && this.f17024a.getResources().getConfiguration().orientation != 2) {
            int i = 0;
            try {
                i = this.f17029f.getAdParameters().m14374b().getApplicationInfo().targetSdkVersion;
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i <= 26 || Build.VERSION.SDK_INT != 26) {
                AdActivity.m13813a(this.f17024a, this.f17025b.getOrientation());
            } else {
                Log.d("octopus", "Only fullscreen activities can request orientation");
            }
        }
        this.f17026c = this.f17025b.getRealDisplayable();
        AdWebView adWebView2 = this.f17025b;
        if (adWebView2.mAdVideoView != null) {
            this.f17027d.addView(adWebView2.getRealDisplayable().getView(), new FrameLayout.LayoutParams(-2, -2, 17));
        } else {
            if (this.f17024a.getRequestedOrientation() == 0) {
                frameLayout = this.f17027d;
                view = this.f17025b.getRealDisplayable().getView();
                layoutParams = new FrameLayout.LayoutParams((int) (this.f17025b.getCreativeHeight() * C3120m.m14425a().f17186i), (int) (this.f17025b.getCreativeWidth() * C3120m.m14425a().f17187j), 17);
            } else if (this.f17024a.getRequestedOrientation() == 1) {
                frameLayout = this.f17027d;
                view = this.f17025b.getRealDisplayable().getView();
                layoutParams = new FrameLayout.LayoutParams((int) (this.f17025b.getCreativeWidth() * C3120m.m14425a().f17186i), (int) (this.f17025b.getCreativeHeight() * C3120m.m14425a().f17187j), 17);
            } else {
                frameLayout = this.f17027d;
                view = this.f17025b.getRealDisplayable().getView();
                layoutParams = new FrameLayout.LayoutParams((int) (this.f17025b.getCreativeWidth() * C3120m.m14425a().f17186i), (int) (this.f17025b.getCreativeHeight() * C3120m.m14425a().f17187j), 17);
            }
            frameLayout.addView(view, layoutParams);
        }
        this.f17026c.visible();
    }

    /* JADX INFO: renamed from: h */
    private void m14233h() {
        if (this.f17024a != null) {
            InterstitialAdViewImpl interstitialAdViewImpl = this.f17029f;
            if (interstitialAdViewImpl != null && interstitialAdViewImpl.getAdDispatcher() != null) {
                this.f17029f.getAdDispatcher().mo14241b();
            }
            this.f17024a.finish();
        }
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: a */
    public void mo13817a() {
        Activity activity;
        int i;
        InterstitialAdViewImpl interstitialAdViewImpl = InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE;
        if (interstitialAdViewImpl == null || interstitialAdViewImpl.getAdQueue().peek() == null || !(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getAdQueue().peek().mo14776c() instanceof AdWebView)) {
            return;
        }
        AdWebView adWebView = (AdWebView) InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getAdQueue().peek().mo14776c();
        adWebView.getSettings().setLoadsImagesAutomatically(true);
        if (adWebView.isBackgroundDim()) {
            activity = this.f17024a;
            i = C3063R.style.OctopusDialogStyle;
        } else {
            activity = this.f17024a;
            i = C3063R.style.OctopusDialogStyleTran;
        }
        activity.setTheme(i);
        if (adWebView.isVideoFullScreen()) {
            this.f17024a.setTheme(C3063R.style.OctopusTheme_Transparent);
            this.f17024a.requestWindowFeature(1);
            this.f17024a.getWindow().setFlags(1024, 1024);
        }
        this.f17027d = new FrameLayout(this.f17024a);
        this.f17027d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.f17024a.setContentView(this.f17027d);
        this.f17028e = this.f17024a.getIntent().getLongExtra(InterstitialAdViewImpl.INTENT_KEY_TIME, System.currentTimeMillis());
        m14232a(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE);
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: b */
    public void mo13818b() {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f17029f;
        if (interstitialAdViewImpl == null || interstitialAdViewImpl.getAdDispatcher() == null || this.f17029f.isRewardVideo() || this.f17024a == null) {
            return;
        }
        this.f17029f.getAdDispatcher().mo14241b();
        this.f17024a.finish();
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: c */
    public void mo13819c() {
        AdWebView adWebView = this.f17025b;
        if (adWebView != null) {
            ViewUtil.removeChildFromParent(adWebView);
            this.f17025b.destroy();
            AdVideoView adVideoView = this.f17025b.mAdVideoView;
            if (adVideoView != null) {
                adVideoView.destroy();
            }
        }
        InterstitialAdViewImpl interstitialAdViewImpl = this.f17029f;
        if (interstitialAdViewImpl != null) {
            interstitialAdViewImpl.setAdImplementation(null);
        }
        this.f17024a.finish();
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: d */
    public void mo13820d() {
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: e */
    public void mo13821e() {
        InterstitialAdViewImpl interstitialAdViewImpl = this.f17029f;
        if (interstitialAdViewImpl == null || !interstitialAdViewImpl.shouldDismissOnClick()) {
            return;
        }
        m14233h();
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: f */
    public WebView mo13822f() {
        return this.f17025b;
    }

    /* JADX INFO: renamed from: g */
    public void m14234g() {
        InterfaceC3194b realDisplayable;
        InterfaceC3194b interfaceC3194b;
        FrameLayout frameLayout;
        View view;
        ViewGroup.LayoutParams layoutParams;
        AdWebView adWebView = this.f17025b;
        if (adWebView == null || (realDisplayable = adWebView.getRealDisplayable()) == (interfaceC3194b = this.f17026c)) {
            return;
        }
        this.f17027d.removeView(interfaceC3194b.getView());
        if (realDisplayable instanceof AdVideoView) {
            frameLayout = this.f17027d;
            view = realDisplayable.getView();
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            frameLayout = this.f17027d;
            view = realDisplayable.getView();
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        frameLayout.addView(view, layoutParams);
        this.f17026c = realDisplayable;
        realDisplayable.visible();
    }
}
