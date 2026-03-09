package com.octopus.p222ad.internal.p225a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.internal.view.C3200h;
import com.octopus.p222ad.utils.p258b.C3255f;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.octopus.ad.internal.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3074a implements AdActivity.InterfaceC3053a {

    /* JADX INFO: renamed from: a */
    public static LinkedList<WebView> f17016a = new LinkedList<>();

    /* JADX INFO: renamed from: b */
    private final Activity f17017b;

    /* JADX INFO: renamed from: c */
    private WebView f17018c;

    public C3074a(Activity activity) {
        this.f17017b = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14229a(String str) {
        Uri uri = StringUtil.isEmpty(str) ? null : Uri.parse(str);
        if (uri == null) {
            HaoboLog.m14615w(HaoboLog.browserLogTag, HaoboLog.getString(C3063R.string.opening_url_failed, str));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        try {
            this.f17017b.startActivity(intent);
            mo13819c();
            m14231g();
        } catch (Exception unused) {
            HaoboLog.m14615w(HaoboLog.browserLogTag, HaoboLog.getString(C3063R.string.opening_url_failed, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m14231g() {
        Activity activity = this.f17017b;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    @SuppressLint({"SetJavaScriptEnabled", "NewApi"})
    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public void mo13817a() {
        this.f17017b.setTheme(C3063R.style.OctopusTheme);
        this.f17017b.setContentView(C3063R.layout.oct_activity_in_app_browser);
        WebView webViewPoll = f17016a.poll();
        this.f17018c = webViewPoll;
        if (webViewPoll == null || webViewPoll.getSettings() == null) {
            m14231g();
            return;
        }
        if (this.f17018c.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) this.f17018c.getContext()).setBaseContext(this.f17017b);
        }
        WebView webView = (WebView) this.f17017b.findViewById(C3063R.id.web_view);
        webView.getSettings().setSavePassword(false);
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(webView);
        viewGroup.removeView(webView);
        ViewUtil.removeChildFromParent(this.f17018c);
        this.f17018c.setLayoutParams(layoutParams);
        this.f17018c.getSettings().setUseWideViewPort(true);
        this.f17018c.getSettings().setLoadWithOverviewMode(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 19) {
            this.f17018c.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f17018c.removeJavascriptInterface("accessibility");
            this.f17018c.removeJavascriptInterface("accessibilityTraversal");
        }
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        viewGroup.addView(this.f17018c, iIndexOfChild);
        final ProgressBar progressBar = (ProgressBar) this.f17017b.findViewById(C3063R.id.progress_bar);
        String stringExtra = this.f17017b.getIntent().getStringExtra("bridgeid");
        if (stringExtra != null) {
            for (Pair<String, AdViewImpl.C3174c> pair : AdViewImpl.C3174c.f17630a) {
                if (((String) pair.first).equals(stringExtra)) {
                    AdViewImpl.C3174c.f17630a.remove(pair);
                }
            }
        }
        this.f17018c.setDownloadListener(new DownloadListener() { // from class: com.octopus.ad.internal.a.a.1
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                C3074a.this.f17018c.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                C3074a.this.m14231g();
            }
        });
        this.f17018c.setWebViewClient(new WebViewClient() { // from class: com.octopus.ad.internal.a.a.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
                if (cookieSyncManager != null) {
                    cookieSyncManager.sync();
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                HaoboLog.m14613v(HaoboLog.browserLogTag, HaoboLog.getString(C3063R.string.opening_url, str));
                if (str.startsWith("http")) {
                    return false;
                }
                C3074a.this.m14229a(str);
                return true;
            }
        });
        this.f17018c.setWebChromeClient(new C3200h(this.f17017b) { // from class: com.octopus.ad.internal.a.a.3
            @Override // com.octopus.p222ad.internal.view.C3193a, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                HaoboLog.m14615w(HaoboLog.browserLogTag, HaoboLog.getString(C3063R.string.console_message, consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId()));
                return true;
            }

            @Override // com.octopus.p222ad.internal.view.C3193a, android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                HaoboLog.m14615w(HaoboLog.browserLogTag, HaoboLog.getString(C3063R.string.js_alert, str2, str));
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i2) {
                if (i2 < 100 && progressBar.getVisibility() == 8) {
                    progressBar.setVisibility(0);
                }
                progressBar.setProgress(i2);
                if (i2 == 100) {
                    progressBar.setVisibility(8);
                }
            }

            @Override // com.octopus.p222ad.internal.view.C3200h, android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
                if (view instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    if (frameLayout.getFocusedChild() instanceof VideoView) {
                        VideoView videoView = (VideoView) frameLayout.getFocusedChild();
                        frameLayout.removeView(videoView);
                        ((Activity) C3074a.this.f17018c.getContext()).setContentView(videoView);
                        videoView.start();
                    }
                }
            }
        });
        ((ImageView) this.f17017b.findViewById(C3063R.id.close_iv)).setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.a.a.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3074a.this.m14231g();
            }
        });
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: b */
    public void mo13818b() {
        C3255f.m14981a("octopus", "...........................backPressed...........................");
        if (!this.f17018c.canGoBack()) {
            m14231g();
        } else {
            this.f17018c.goBack();
            C3255f.m14981a("octopus", " mWebView.goBack()");
        }
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: c */
    public void mo13819c() {
        WebView webView = this.f17018c;
        if (webView == null) {
            return;
        }
        ViewUtil.removeChildFromParent(webView);
        this.f17018c.destroy();
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: d */
    public void mo13820d() {
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: e */
    public void mo13821e() {
    }

    @Override // com.octopus.p222ad.AdActivity.InterfaceC3053a
    /* JADX INFO: renamed from: f */
    public WebView mo13822f() {
        return this.f17018c;
    }
}
