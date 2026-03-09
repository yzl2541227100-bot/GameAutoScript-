package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class BrowserView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private static final String f11642a = "BrowserView";

    /* JADX INFO: renamed from: b */
    private String f11643b;

    /* JADX INFO: renamed from: c */
    private ProgressBar f11644c;

    /* JADX INFO: renamed from: d */
    private WebView f11645d;

    /* JADX INFO: renamed from: e */
    private ToolBar f11646e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1896a f11647f;

    /* JADX INFO: renamed from: g */
    private C1781c f11648g;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$1 */
    public class ViewOnClickListenerC18921 implements View.OnClickListener {
        public ViewOnClickListenerC18921() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BrowserView.this.f11645d != null) {
                BrowserView.this.f11645d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z = false;
            if (TextUtils.equals(str, "backward")) {
                BrowserView.this.f11646e.getItem("forward").setEnabled(true);
                if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoBack()) {
                    BrowserView.this.f11645d.goBack();
                }
                View item = BrowserView.this.f11646e.getItem("backward");
                if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoBack()) {
                    z = true;
                }
                item.setEnabled(z);
                return;
            }
            if (TextUtils.equals(str, "forward")) {
                BrowserView.this.f11646e.getItem("backward").setEnabled(true);
                if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoForward()) {
                    BrowserView.this.f11645d.goForward();
                }
                View item2 = BrowserView.this.f11646e.getItem("forward");
                if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoForward()) {
                    z = true;
                }
                item2.setEnabled(z);
                return;
            }
            if (!TextUtils.equals(str, "refresh")) {
                if (!TextUtils.equals(str, "exits") || BrowserView.this.f11647f == null) {
                    return;
                }
                BrowserView.this.f11647f.mo5396a();
                return;
            }
            BrowserView.this.f11646e.getItem("backward").setEnabled(BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoBack());
            View item3 = BrowserView.this.f11646e.getItem("forward");
            if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoForward()) {
                z = true;
            }
            item3.setEnabled(z);
            if (BrowserView.this.f11645d != null) {
                BrowserView.this.f11645d.loadUrl(BrowserView.this.f11643b);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$2 */
    public class C18932 extends WebViewClient {
        public C18932() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            BrowserView.this.f11643b = str;
            if (BrowserView.this.f11647f != null) {
                InterfaceC1896a unused = BrowserView.this.f11647f;
            }
            BrowserView.this.f11644c.setVisible(true);
            BrowserView.this.f11644c.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            BrowserView.this.f11646e.getItem("backward").setEnabled(true);
            BrowserView.this.f11646e.getItem("forward").setEnabled(false);
            if (BrowserView.this.f11647f != null) {
                BrowserView.this.f11647f.mo5397a(webView, str);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$3 */
    public class C18943 extends WebChromeClient {

        /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$3$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BrowserView.this.f11644c.setVisible(false);
            }
        }

        public C18943() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.f11644c.setProgressState(7);
                new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BrowserView.this.f11644c.setVisible(false);
                    }
                }, 200L);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$4 */
    public class C18954 extends WebChromeClient {

        /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$4$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BrowserView.this.f11644c.setVisible(false);
            }
        }

        public C18954() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.f11644c.setProgressState(7);
                new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BrowserView.this.f11644c.setVisible(false);
                    }
                }, 200L);
            }
        }
    }

    public static final class DownloadListener implements android.webkit.DownloadListener {
        private C1781c campaignEx;
        private String title;

        public DownloadListener() {
        }

        public DownloadListener(C1781c c1781c) {
            this.campaignEx = c1781c;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$a */
    public interface InterfaceC1896a {
        /* JADX INFO: renamed from: a */
        void mo5396a();

        /* JADX INFO: renamed from: a */
        boolean mo5397a(WebView webView, String str);

        /* JADX INFO: renamed from: b */
        void mo5398b();
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BrowserView(Context context, C1781c c1781c) {
        super(context);
        this.f11648g = c1781c;
        init();
    }

    /* JADX INFO: renamed from: a */
    private void m9880a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f11644c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f11645d == null) {
                this.f11645d = m9881b();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f11645d.setLayoutParams(layoutParams);
        } catch (Throwable unused) {
        }
        this.f11646e = new ToolBar(getContext());
        this.f11646e.setLayoutParams(new LinearLayout.LayoutParams(-1, C1886t.m9834b(getContext(), 40.0f)));
        this.f11646e.setBackgroundColor(-1);
        addView(this.f11644c);
        WebView webView = this.f11645d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f11646e);
    }

    /* JADX INFO: renamed from: b */
    private WebView m9881b() {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (i >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (i >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
            if (i >= 16) {
                try {
                    settings.setAllowUniversalAccessFromFileURLs(false);
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            if (i >= 21) {
                try {
                    settings.setMixedContentMode(1);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            if (i >= 21) {
                try {
                    Method declaredMethod = WebSettings.class.getDeclaredMethod(C1340d.m4030b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(settings, 0);
                } catch (Throwable unused) {
                }
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.FALSE);
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                Method declaredMethod3 = WebSettings.class.getDeclaredMethod(C1340d.m4030b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(settings, Boolean.TRUE);
            } catch (Throwable unused2) {
            }
        } catch (Throwable th3) {
            th3.getMessage();
        }
        webView.setDownloadListener(new DownloadListener(this.f11648g));
        webView.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.2
            public C18932() {
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                BrowserView.this.f11643b = str;
                if (BrowserView.this.f11647f != null) {
                    InterfaceC1896a unused3 = BrowserView.this.f11647f;
                }
                BrowserView.this.f11644c.setVisible(true);
                BrowserView.this.f11644c.setProgressState(5);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                BrowserView.this.f11646e.getItem("backward").setEnabled(true);
                BrowserView.this.f11646e.getItem("forward").setEnabled(false);
                if (BrowserView.this.f11647f != null) {
                    BrowserView.this.f11647f.mo5397a(webView2, str);
                }
                return false;
            }
        });
        webView.setWebChromeClient(C1877k.m9700d() <= 10 ? new WebChromeClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3

            /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$3$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BrowserView.this.f11644c.setVisible(false);
                }
            }

            public C18943() {
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str, String str2, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i2) {
                if (i2 == 100) {
                    BrowserView.this.f11644c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BrowserView.this.f11644c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        } : new WebChromeClient() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4

            /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.BrowserView$4$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BrowserView.this.f11644c.setVisible(false);
                }
            }

            public C18954() {
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i2) {
                if (i2 == 100) {
                    BrowserView.this.f11644c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BrowserView.this.f11644c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        return webView;
    }

    public void destroy() {
        WebView webView = this.f11645d;
        if (webView != null) {
            webView.stopLoading();
            this.f11645d.setWebViewClient(null);
            this.f11645d.destroy();
            removeAllViews();
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f11644c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f11645d == null) {
                this.f11645d = m9881b();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f11645d.setLayoutParams(layoutParams);
        } catch (Throwable unused) {
        }
        this.f11646e = new ToolBar(getContext());
        this.f11646e.setLayoutParams(new LinearLayout.LayoutParams(-1, C1886t.m9834b(getContext(), 40.0f)));
        this.f11646e.setBackgroundColor(-1);
        addView(this.f11644c);
        WebView webView = this.f11645d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f11646e);
        this.f11644c.initResource(true);
        this.f11646e.getItem("backward").setEnabled(false);
        this.f11646e.getItem("forward").setEnabled(false);
        this.f11646e.setOnItemClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.webview.BrowserView.1
            public ViewOnClickListenerC18921() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BrowserView.this.f11645d != null) {
                    BrowserView.this.f11645d.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z = false;
                if (TextUtils.equals(str, "backward")) {
                    BrowserView.this.f11646e.getItem("forward").setEnabled(true);
                    if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoBack()) {
                        BrowserView.this.f11645d.goBack();
                    }
                    View item = BrowserView.this.f11646e.getItem("backward");
                    if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoBack()) {
                        z = true;
                    }
                    item.setEnabled(z);
                    return;
                }
                if (TextUtils.equals(str, "forward")) {
                    BrowserView.this.f11646e.getItem("backward").setEnabled(true);
                    if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoForward()) {
                        BrowserView.this.f11645d.goForward();
                    }
                    View item2 = BrowserView.this.f11646e.getItem("forward");
                    if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoForward()) {
                        z = true;
                    }
                    item2.setEnabled(z);
                    return;
                }
                if (!TextUtils.equals(str, "refresh")) {
                    if (!TextUtils.equals(str, "exits") || BrowserView.this.f11647f == null) {
                        return;
                    }
                    BrowserView.this.f11647f.mo5396a();
                    return;
                }
                BrowserView.this.f11646e.getItem("backward").setEnabled(BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoBack());
                View item3 = BrowserView.this.f11646e.getItem("forward");
                if (BrowserView.this.f11645d != null && BrowserView.this.f11645d.canGoForward()) {
                    z = true;
                }
                item3.setEnabled(z);
                if (BrowserView.this.f11645d != null) {
                    BrowserView.this.f11645d.loadUrl(BrowserView.this.f11643b);
                }
            }
        });
    }

    public void loadUrl(String str) {
        WebView webView = this.f11645d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(InterfaceC1896a interfaceC1896a) {
        this.f11647f = interfaceC1896a;
    }

    public void setWebView(WebView webView) {
        this.f11645d = webView;
    }
}
