package com.anythink.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p178b.C2325j;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkAlertWebview extends AnythinkH5EndCardView {

    /* JADX INFO: renamed from: A */
    private String f13474A;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkAlertWebview$1 */
    public class C21131 extends C1442b {
        public C21131() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C1469j.m5701a();
            C1469j.m5703a(webView, "onJSBridgeConnected", "");
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
            if (anythinkAlertWebview.f13588w) {
                return;
            }
            anythinkAlertWebview.f13588w = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
            if (anythinkAlertWebview.f13588w) {
                return;
            }
            anythinkAlertWebview.f13587v = i == 1;
        }
    }

    public AnythinkAlertWebview(Context context) {
        super(context);
    }

    public AnythinkAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    /* JADX INFO: renamed from: a */
    public final String mo11313a() {
        if (TextUtils.isEmpty(this.f13589x)) {
            return "";
        }
        C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13589x, false);
        String strM12003J = C2340d.m12003J();
        this.f13474A = strM12003J;
        return !TextUtils.isEmpty(strM12003J) ? C2324i.m11867a().m11883c(this.f13474A) : "";
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    /* JADX INFO: renamed from: b */
    public final RelativeLayout.LayoutParams mo11314b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        String strMo11313a = mo11313a();
        if (!this.f13482f || this.f13478b == null || TextUtils.isEmpty(strMo11313a)) {
            this.f13481e.mo10950a(101, "");
            return;
        }
        BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f13478b);
        downloadListener.setTitle(this.f13478b.m10148bb());
        this.f13584s.setDownloadListener(downloadListener);
        this.f13584s.setCampaignId(this.f13478b.m10146aZ());
        setCloseVisible(8);
        this.f13584s.setApiManagerJSFactory(c2309b);
        this.f13584s.setWebViewListener(new C1442b() { // from class: com.anythink.expressad.video.module.AnythinkAlertWebview.1
            public C21131() {
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                C1469j.m5701a();
                C1469j.m5703a(webView, "onJSBridgeConnected", "");
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                if (anythinkAlertWebview.f13588w) {
                    return;
                }
                anythinkAlertWebview.f13588w = true;
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void readyState(WebView webView, int i) {
                super.readyState(webView, i);
                AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                if (anythinkAlertWebview.f13588w) {
                    return;
                }
                anythinkAlertWebview.f13587v = i == 1;
            }
        });
        setHtmlSource(C2325j.m11884a().m11889b(strMo11313a));
        this.f13587v = false;
        if (TextUtils.isEmpty(this.f13586u)) {
            this.f13584s.loadUrl(strMo11313a);
        } else {
            this.f13584s.loadDataWithBaseURL(strMo11313a, this.f13586u, "text/html", "UTF-8", null);
        }
        this.f13584s.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2311h
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f13582q;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
    }
}
