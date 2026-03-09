package com.iflytek.voiceads.bridge;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC2904d implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f16153a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DSBridgeWebView f16154b;

    RunnableC2904d(DSBridgeWebView dSBridgeWebView, String str) {
        this.f16154b = dSBridgeWebView;
        this.f16153a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16154b.m13259c(this.f16153a);
    }
}
