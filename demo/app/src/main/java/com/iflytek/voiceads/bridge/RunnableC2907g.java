package com.iflytek.voiceads.bridge;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC2907g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DSBridgeWebView f16160a;

    RunnableC2907g(DSBridgeWebView dSBridgeWebView) {
        this.f16160a = dSBridgeWebView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16160a.f16137k = new ArrayList();
        super/*android.webkit.WebView*/.reload();
    }
}
