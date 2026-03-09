package com.iflytek.voiceads.view;

import android.webkit.WebView;
import com.iflytek.voiceads.p219f.InterfaceC2965d;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.view.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C3022d implements InterfaceC2965d {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AdView f16615a;

    C3022d(AdView adView) {
        this.f16615a = adView;
    }

    @Override // com.iflytek.voiceads.p219f.InterfaceC2965d
    /* JADX INFO: renamed from: a */
    public void mo13438a() {
        C2989g.m13555a("IFLY_AD_SDK", "onPageStarted");
        this.f16615a.f16587l.m13731a(this.f16615a.f16587l.obtainMessage(4), 15000);
    }

    @Override // com.iflytek.voiceads.p219f.InterfaceC2965d
    /* JADX INFO: renamed from: a */
    public void mo13439a(int i, String str) {
        C2989g.m13555a("IFLY_AD_SDK", "WebViewClientCallback onLoadError");
        this.f16615a.f16587l.m13730a(5, 71006);
    }

    @Override // com.iflytek.voiceads.p219f.InterfaceC2965d
    /* JADX INFO: renamed from: a */
    public void mo13440a(WebView webView, String str) {
        C2989g.m13555a("IFLY_AD_SDK", "shouldOverrideUrlLoading： height:" + this.f16615a.getContentHeight() + ", progress:" + this.f16615a.f16579d.m13434a());
        this.f16615a.m13705a(str);
    }

    @Override // com.iflytek.voiceads.p219f.InterfaceC2965d
    /* JADX INFO: renamed from: b */
    public void mo13441b() {
        C2989g.m13555a("IFLY_AD_SDK", "onPageFinished： height:" + this.f16615a.getContentHeight() + ", progress:" + this.f16615a.f16579d.m13434a());
        this.f16615a.m13722m();
    }
}
