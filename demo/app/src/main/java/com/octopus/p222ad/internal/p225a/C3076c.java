package com.octopus.p222ad.internal.p225a;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.internal.view.AdWebView;
import com.octopus.p222ad.internal.view.C3197e;

/* JADX INFO: renamed from: com.octopus.ad.internal.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3076c implements AdActivity.InterfaceC3053a {

    /* JADX INFO: renamed from: a */
    private Activity f17030a;

    /* JADX INFO: renamed from: b */
    private AdWebView f17031b;

    /* JADX INFO: renamed from: c */
    private C3197e f17032c = null;

    public C3076c(Activity activity) {
        this.f17030a = activity;
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: a */
    public void mo13817a() {
        if (AdViewImpl.getMRAIDFullscreenContainer() == null || AdViewImpl.getMRAIDFullscreenImplementation() == null) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Launched MRAID Fullscreen activity with invalid properties");
            this.f17030a.finish();
            return;
        }
        ViewUtil.removeChildFromParent(AdViewImpl.getMRAIDFullscreenContainer());
        this.f17030a.setContentView(AdViewImpl.getMRAIDFullscreenContainer());
        if (AdViewImpl.getMRAIDFullscreenContainer().getChildAt(0) instanceof AdWebView) {
            this.f17031b = (AdWebView) AdViewImpl.getMRAIDFullscreenContainer().getChildAt(0);
        }
        if (this.f17031b.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) this.f17031b.getContext()).setBaseContext(this.f17030a);
        }
        C3197e mRAIDFullscreenImplementation = AdViewImpl.getMRAIDFullscreenImplementation();
        this.f17032c = mRAIDFullscreenImplementation;
        mRAIDFullscreenImplementation.m14793a(this.f17030a);
        if (AdViewImpl.getMRAIDFullscreenListener() != null) {
            AdViewImpl.getMRAIDFullscreenListener().mo14751a();
        }
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: b */
    public void mo13818b() {
        C3197e c3197e = this.f17032c;
        if (c3197e != null) {
            c3197e.m14793a((Activity) null);
            this.f17032c.m14790a();
        }
        this.f17032c = null;
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: c */
    public void mo13819c() {
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: d */
    public void mo13820d() {
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: e */
    public void mo13821e() {
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: f */
    public WebView mo13822f() {
        return this.f17031b;
    }
}
