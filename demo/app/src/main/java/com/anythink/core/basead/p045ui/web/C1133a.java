package com.anythink.core.basead.p045ui.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.anythink.core.basead.p043a.C1116a;
import com.anythink.core.common.p055f.C1236bb;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.res.C1380d;

/* JADX INFO: renamed from: com.anythink.core.basead.ui.web.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1133a extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private InterfaceC1134b f2818a;

    public C1133a(InterfaceC1134b interfaceC1134b) {
        this.f2818a = interfaceC1134b;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC1134b interfaceC1134b = this.f2818a;
        if (interfaceC1134b != null) {
            interfaceC1134b.onWebPageFinish(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1134b interfaceC1134b = this.f2818a;
        if (interfaceC1134b != null) {
            interfaceC1134b.onWebPageStart(webView, str);
            WebProgressBarView webProgressBarView = this.f2818a.getWebProgressBarView();
            if (webProgressBarView != null) {
                webProgressBarView.setVisibility(0);
                webProgressBarView.setProgress(0);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        InterfaceC1134b interfaceC1134b = this.f2818a;
        if (interfaceC1134b != null) {
            interfaceC1134b.onWebPageLoadError(webView, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(26)
    public final boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        InterfaceC1134b interfaceC1134b = this.f2818a;
        if (interfaceC1134b == null) {
            return true;
        }
        interfaceC1134b.onWebFinish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && !C1380d.f5563a.equals(str)) {
            InterfaceC1134b interfaceC1134b = this.f2818a;
            if (interfaceC1134b != null) {
                interfaceC1134b.recordRedirectUrl(str);
            }
            C1236bb c1236bbM1727a = C1116a.m1727a(webView.getContext(), str);
            if (c1236bbM1727a.f4089m) {
                InterfaceC1134b interfaceC1134b2 = this.f2818a;
                if (interfaceC1134b2 != null) {
                    interfaceC1134b2.callbackClickResult(c1236bbM1727a);
                }
                return true;
            }
            InterfaceC1134b interfaceC1134b3 = this.f2818a;
            if (interfaceC1134b3 != null) {
                interfaceC1134b3.callbackClickResult(c1236bbM1727a);
            }
            C1236bb c1236bbM1728a = C1116a.m1728a(str);
            InterfaceC1134b interfaceC1134b4 = this.f2818a;
            if (interfaceC1134b4 != null) {
                interfaceC1134b4.callbackClickResult(c1236bbM1728a);
            }
            if (!TextUtils.equals(c1236bbM1728a.f4091o, str)) {
                webView.loadUrl(c1236bbM1728a.f4091o);
                return true;
            }
            if (!C1345i.m4173d(str)) {
                return true;
            }
        }
        return false;
    }
}
