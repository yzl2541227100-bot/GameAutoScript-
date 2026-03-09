package com.anythink.expressad.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.advanced.p079d.C1431c;
import com.anythink.expressad.advanced.p079d.InterfaceC1429a;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p073a.p075b.C1410a;
import com.anythink.expressad.p086d.p088b.C1487a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.view.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1440a extends C1450b {

    /* JADX INFO: renamed from: a */
    public String f6650a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1429a f6651b;

    /* JADX INFO: renamed from: c */
    private final String f6652c = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: d */
    private C1431c f6653d;

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.view.a$1 */
    public class AnonymousClass1 implements ValueCallback<String> {
        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: a */
        private static void m5573a() {
        }

        @Override // android.webkit.ValueCallback
        public final /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }
    }

    public C1440a(String str, InterfaceC1429a interfaceC1429a, C1431c c1431c) {
        this.f6650a = str;
        this.f6651b = interfaceC1429a;
        this.f6653d = c1431c;
    }

    /* JADX INFO: renamed from: a */
    private WebResourceResponse m5570a(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z = false;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && "mb-h5".equals(uri.getScheme())) {
            z = true;
        }
        if (!z || this.f6653d == null) {
            return null;
        }
        String strM5536a = this.f6653d.m5536a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
        try {
            if (TextUtils.isEmpty(strM5536a) || strM5536a.contains("127.0.0.1") || strM5536a.startsWith("http")) {
                return null;
            }
            return new WebResourceResponse(C1732o.f9735e, "utf-8", new FileInputStream(strM5536a));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m5571b(String str) {
        Uri uri;
        return (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || !"mb-h5".equals(uri.getScheme())) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5572a() {
        if (this.f6653d != null) {
            this.f6653d = null;
        }
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
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.view.a.1
                    public AnonymousClass1() {
                    }

                    /* JADX INFO: renamed from: a */
                    private static void m5573a() {
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
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return m5570a(Build.VERSION.SDK_INT >= 21 ? webResourceRequest.getUrl().toString() : "");
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m5570a(str);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.C1450b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > C1410a.f6300c) {
                    C1781c c1781c = ((NativeAdvancedJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0);
                    windVaneWebView.getUrl();
                    int i = C1410a.f6299b;
                    if (C1410a.m5255a(c1781c)) {
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            InterfaceC1429a interfaceC1429a = this.f6651b;
            if (interfaceC1429a == null) {
                return true;
            }
            interfaceC1429a.mo5497a(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
