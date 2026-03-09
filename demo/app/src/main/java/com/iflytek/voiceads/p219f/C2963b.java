package com.iflytek.voiceads.p219f;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.f.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2963b extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private boolean f16408a = false;

    /* JADX INFO: renamed from: b */
    private boolean f16409b = false;

    /* JADX INFO: renamed from: c */
    private boolean f16410c = false;

    /* JADX INFO: renamed from: d */
    private InterfaceC2965d f16411d;

    public C2963b(InterfaceC2965d interfaceC2965d) {
        this.f16411d = interfaceC2965d;
    }

    /* JADX INFO: renamed from: a */
    public void m13435a(boolean z) {
        this.f16410c = z;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        C2989g.m13555a("IFLY_AD_SDK", "onPageFinished:" + this.f16409b);
        if (!this.f16409b) {
            this.f16408a = true;
        }
        if (!this.f16408a || this.f16409b) {
            this.f16409b = false;
        } else {
            this.f16411d.mo13441b();
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        m13435a(false);
        this.f16408a = false;
        this.f16409b = false;
        this.f16411d.mo13438a();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f16411d.mo13439a(i, str);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError.getPrimaryError() == 5) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
            this.f16411d.mo13439a(-1, sslError.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C2989g.m13555a("IFLY_AD_SDK", "shouldOverrideUrlLoading:" + this.f16410c + this.f16408a);
        if (this.f16410c) {
            m13435a(false);
            this.f16411d.mo13440a(webView, str);
        } else {
            if (!this.f16408a) {
                this.f16409b = true;
            }
            this.f16408a = false;
            webView.loadUrl(str);
            C2989g.m13555a("IFLY_AD_SDK", "shouldOverrideUrlLoading click=false");
        }
        return true;
    }
}
