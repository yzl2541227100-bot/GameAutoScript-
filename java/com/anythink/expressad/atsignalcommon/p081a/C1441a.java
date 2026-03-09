package com.anythink.expressad.atsignalcommon.p081a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1441a implements InterfaceC1462c {

    /* JADX INFO: renamed from: a */
    public static final String f6655a = "RVWindVaneWebView";

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
    /* JADX INFO: renamed from: a */
    public String mo5574a(String str) {
        return MessageFormatter.DELIM_STR;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
    /* JADX INFO: renamed from: a */
    public void mo5575a(Object obj) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
    /* JADX INFO: renamed from: a */
    public void mo5576a(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
    /* JADX INFO: renamed from: a */
    public void mo5577a(String str, int i, int i2) {
    }

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
