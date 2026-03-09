package com.anythink.core.basead.p045ui.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.anythink.core.basead.p045ui.p046a.C1123a;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1360x;

/* JADX INFO: loaded from: classes.dex */
public class BaseWebView extends WebView {

    /* JADX INFO: renamed from: b */
    private static boolean f2771b;

    /* JADX INFO: renamed from: a */
    public boolean f2772a;

    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            getSettings().setAllowFileAccessFromFileURLs(false);
            getSettings().setAllowUniversalAccessFromFileURLs(false);
        }
        C1123a.m1767a(this);
        C1344h.m4138a(this);
        if (f2771b) {
            return;
        }
        Context context2 = getContext();
        if (i == 19) {
            WebView webView = new WebView(context2.getApplicationContext());
            webView.setBackgroundColor(0);
            webView.loadDataWithBaseURL(null, "", "text/html", "UTF-8", null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.type = 2005;
            layoutParams.flags = 16777240;
            layoutParams.format = -2;
            layoutParams.gravity = 8388659;
            ((WindowManager) context2.getSystemService("window")).addView(webView, layoutParams);
        }
        f2771b = true;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: a */
    private void m1771a() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(-1);
    }

    /* JADX INFO: renamed from: a */
    private static void m1772a(Context context) {
        if (Build.VERSION.SDK_INT == 19) {
            WebView webView = new WebView(context.getApplicationContext());
            webView.setBackgroundColor(0);
            webView.loadDataWithBaseURL(null, "", "text/html", "UTF-8", null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.type = 2005;
            layoutParams.flags = 16777240;
            layoutParams.format = -2;
            layoutParams.gravity = 8388659;
            ((WindowManager) context.getSystemService("window")).addView(webView, layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1773b() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            getSettings().setAllowFileAccessFromFileURLs(false);
            getSettings().setAllowUniversalAccessFromFileURLs(false);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f2772a) {
            return;
        }
        this.f2772a = true;
        C1360x.m4265a(this);
        removeAllViews();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CookieManager cookieManager = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setAcceptThirdPartyCookies(this, C1178q.m2182a(getContext()).m2189b());
        }
    }
}
