package com.anythink.core.basead.p045ui.web;

import android.webkit.WebView;
import com.anythink.core.common.p055f.C1236bb;

/* JADX INFO: renamed from: com.anythink.core.basead.ui.web.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1134b {
    void callbackClickResult(C1236bb c1236bb);

    WebProgressBarView getWebProgressBarView();

    void onWebFinish();

    void onWebPageFinish(WebView webView, String str);

    void onWebPageLoadError(WebView webView, String str);

    void onWebPageStart(WebView webView, String str);

    void recordRedirectUrl(String str);
}
