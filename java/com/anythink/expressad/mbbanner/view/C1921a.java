package com.anythink.expressad.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.base.BaseWebView;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a;
import com.anythink.expressad.p073a.p075b.C1410a;
import com.anythink.expressad.p086d.p088b.C1487a;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.view.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1921a extends C1450b {

    /* JADX INFO: renamed from: a */
    public String f11885a;

    /* JADX INFO: renamed from: b */
    public List<C1781c> f11886b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1908a f11887c;

    /* JADX INFO: renamed from: d */
    private final String f11888d = "BannerWebViewClient";

    public C1921a(String str, List<C1781c> list, InterfaceC1908a interfaceC1908a) {
        this.f11885a = str;
        this.f11886b = list;
        this.f11887c = interfaceC1908a;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb = new StringBuilder("javascript:");
            C1487a.m6018a();
            sb.append(C1487a.m6022b());
            if (Build.VERSION.SDK_INT <= 19) {
                webView.loadUrl(sb.toString());
            } else {
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.view.a.1
                    /* JADX INFO: renamed from: a */
                    private static void m10108a() {
                    }

                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.C1450b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > C1410a.f6300c) {
                C1781c c1781c = this.f11886b.get(0);
                baseWebView.getUrl();
                int i = C1410a.f6299b;
                if (C1410a.m5255a(c1781c)) {
                    return false;
                }
            }
            if (this.f11886b.size() > 1) {
                C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            InterfaceC1908a interfaceC1908a = this.f11887c;
            if (interfaceC1908a != null) {
                interfaceC1908a.mo9956a(false, str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
