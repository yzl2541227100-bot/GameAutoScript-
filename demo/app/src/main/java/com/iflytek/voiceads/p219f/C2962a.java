package com.iflytek.voiceads.p219f;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.iflytek.voiceads.f.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2962a extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private int f16406a;

    /* JADX INFO: renamed from: b */
    private InterfaceC2964c f16407b;

    public C2962a(InterfaceC2964c interfaceC2964c) {
        this.f16407b = interfaceC2964c;
    }

    /* JADX INFO: renamed from: a */
    private void m13433a(int i) {
        this.f16406a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m13434a() {
        return this.f16406a;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f16407b.mo13437a(str, str2, str3, jsPromptResult);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        m13433a(i);
        this.f16407b.mo13436a(i);
    }
}
