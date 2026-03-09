package com.anythink.expressad.atsignalcommon.base;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.base.b */
/* JADX INFO: loaded from: classes.dex */
public class C1450b extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private InterfaceC1449a f6675a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1464e f6676b;

    /* JADX INFO: renamed from: a */
    public final void m5624a(InterfaceC1449a interfaceC1449a) {
        this.f6675a = interfaceC1449a;
    }

    /* JADX INFO: renamed from: a */
    public final void m5625a(InterfaceC1464e interfaceC1464e) {
        this.f6676b = interfaceC1464e;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1449a m5626b() {
        return this.f6675a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC1464e interfaceC1464e = this.f6676b;
        if (interfaceC1464e != null) {
            interfaceC1464e.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        InterfaceC1464e interfaceC1464e = this.f6676b;
        if (interfaceC1464e != null) {
            interfaceC1464e.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC1464e interfaceC1464e = this.f6676b;
        if (interfaceC1464e != null) {
            interfaceC1464e.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC1449a interfaceC1449a = this.f6675a;
        if (interfaceC1449a != null && interfaceC1449a.mo5623a(str)) {
            return true;
        }
        InterfaceC1464e interfaceC1464e = this.f6676b;
        if (interfaceC1464e != null) {
            interfaceC1464e.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
