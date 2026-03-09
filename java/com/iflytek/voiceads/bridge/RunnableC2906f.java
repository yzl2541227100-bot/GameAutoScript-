package com.iflytek.voiceads.bridge;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC2906f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f16157a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f16158b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ DSBridgeWebView f16159c;

    RunnableC2906f(DSBridgeWebView dSBridgeWebView, String str, Map map) {
        this.f16159c = dSBridgeWebView;
        this.f16157a = str;
        this.f16158b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f16157a != null && this.f16157a.startsWith("javascript:")) {
            super/*android.webkit.WebView*/.loadUrl(this.f16157a, this.f16158b);
            return;
        }
        this.f16159c.f16137k = new ArrayList();
        super/*android.webkit.WebView*/.loadUrl(this.f16157a, this.f16158b);
    }
}
