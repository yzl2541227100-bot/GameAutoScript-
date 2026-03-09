package com.iflytek.voiceads.bridge;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.l */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2912l extends WebViewClient {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DSBridgeWebView f16169a;

    C2912l(DSBridgeWebView dSBridgeWebView) {
        this.f16169a = dSBridgeWebView;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f16169a.f16134h != null) {
            this.f16169a.f16134h.mo13278b();
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f16169a.f16134h != null) {
            this.f16169a.f16134h.mo13275a();
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f16169a.f16134h != null) {
            this.f16169a.f16134h.mo13276a(i, str);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError.getPrimaryError() == 5) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f16169a.f16134h != null ? this.f16169a.f16134h.mo13277a(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }
}
