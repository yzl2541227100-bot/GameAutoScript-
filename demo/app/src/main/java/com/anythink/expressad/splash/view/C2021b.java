package com.anythink.expressad.splash.view;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p073a.p075b.C1410a;
import com.anythink.expressad.p086d.p088b.C1487a;
import com.anythink.expressad.splash.p152d.InterfaceC1988a;
import com.anythink.expressad.splash.p153js.SplashJSBridgeImpl;

/* JADX INFO: renamed from: com.anythink.expressad.splash.view.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2021b extends C1450b {

    /* JADX INFO: renamed from: a */
    public String f12837a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1988a f12838b;

    /* JADX INFO: renamed from: c */
    private final String f12839c = "SplashWebViewClient";

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.b$1 */
    public class AnonymousClass1 implements ValueCallback<String> {
        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: a */
        private static void m10812a() {
        }

        @Override // android.webkit.ValueCallback
        public final /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }
    }

    public C2021b(String str, InterfaceC1988a interfaceC1988a) {
        this.f12837a = str;
        this.f12838b = interfaceC1988a;
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
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.view.b.1
                    public AnonymousClass1() {
                    }

                    /* JADX INFO: renamed from: a */
                    private static void m10812a() {
                    }

                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.base.C1450b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > C1410a.f6300c) {
                C1781c c1781c = ((SplashJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0);
                windVaneWebView.getUrl();
                int i = C1410a.f6299b;
                if (C1410a.m5255a(c1781c)) {
                    return false;
                }
            }
            InterfaceC1988a interfaceC1988a = this.f12838b;
            if (interfaceC1988a == null) {
                return true;
            }
            interfaceC1988a.mo10661b(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
