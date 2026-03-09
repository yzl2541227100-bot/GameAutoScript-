package com.anythink.expressad.atsignalcommon.p081a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C1442b implements InterfaceC1464e {

    /* JADX INFO: renamed from: d */
    public static final String f6656d = "WindVaneWebView";

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void loadingResourceStatus(WebView webView, int i) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void onPageFinished(WebView webView, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void onProgressChanged(WebView webView, int i) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public void readyState(WebView webView, int i) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return true;
    }
}
