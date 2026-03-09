package com.anythink.basead.mraid;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import com.anythink.expressad.p086d.p088b.C1487a;

/* JADX INFO: renamed from: com.anythink.basead.mraid.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0802e extends C1450b {

    /* JADX INFO: renamed from: a */
    public final String f1103a = C0802e.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public String f1104b;

    /* JADX INFO: renamed from: c */
    public AbstractC0799b f1105c;

    public C0802e(String str) {
        this.f1104b = str;
    }

    /* JADX INFO: renamed from: a */
    private void m664a(AbstractC0799b abstractC0799b) {
        this.f1105c = abstractC0799b;
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
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() { // from class: com.anythink.basead.mraid.e.1
                    /* JADX INFO: renamed from: a */
                    private static void m665a() {
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
        AbstractC0799b abstractC0799b;
        try {
            if (!TextUtils.equals(str, this.f1104b) && (abstractC0799b = this.f1105c) != null) {
                abstractC0799b.open(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
