package com.iflytek.voiceads.bridge;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.e */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC2905e implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f16155a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DSBridgeWebView f16156b;

    RunnableC2905e(DSBridgeWebView dSBridgeWebView, String str) {
        this.f16156b = dSBridgeWebView;
        this.f16155a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f16155a != null && this.f16155a.startsWith("javascript:")) {
            super/*android.webkit.WebView*/.loadUrl(this.f16155a);
            return;
        }
        this.f16156b.f16137k = new ArrayList();
        super/*android.webkit.WebView*/.loadUrl(this.f16155a);
    }
}
