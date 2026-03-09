package com.anythink.core.activity.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class PrivacyPolicyView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: n */
    private static String f2528n = PrivacyPolicyView.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public ViewGroup f2529a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f2530b;

    /* JADX INFO: renamed from: c */
    public LoadingView f2531c;

    /* JADX INFO: renamed from: d */
    public TextView f2532d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2533e;

    /* JADX INFO: renamed from: f */
    public WebView f2534f;

    /* JADX INFO: renamed from: g */
    public CheckBox f2535g;

    /* JADX INFO: renamed from: h */
    public View f2536h;

    /* JADX INFO: renamed from: i */
    public TextView f2537i;

    /* JADX INFO: renamed from: j */
    public boolean f2538j;

    /* JADX INFO: renamed from: k */
    public boolean f2539k;

    /* JADX INFO: renamed from: l */
    public String f2540l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1093a f2541m;

    /* JADX INFO: renamed from: com.anythink.core.activity.component.PrivacyPolicyView$1 */
    public class ViewOnClickListenerC10901 implements View.OnClickListener {
        public ViewOnClickListenerC10901() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                if (privacyPolicyView.f2534f == null || privacyPolicyView.f2539k) {
                    return;
                }
                privacyPolicyView.f2538j = true;
                Log.d(PrivacyPolicyView.f2528n, "reload.......");
                PrivacyPolicyView privacyPolicyView2 = PrivacyPolicyView.this;
                privacyPolicyView2.loadPolicyUrl(privacyPolicyView2.f2540l);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.activity.component.PrivacyPolicyView$2 */
    public class C10912 extends WebViewClient {
        public C10912() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            try {
                Log.d(PrivacyPolicyView.f2528n, "onPageFinished:" + str + "   mIsWebViewloadSuccess:" + PrivacyPolicyView.this.f2538j);
                if (PrivacyPolicyView.this.f2540l.equals(str)) {
                    PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                    if (privacyPolicyView.f2538j) {
                        privacyPolicyView.f2530b.setVisibility(4);
                        PrivacyPolicyView.this.f2529a.setVisibility(0);
                        PrivacyPolicyView.this.f2530b.setVisibility(8);
                        PrivacyPolicyView.this.f2531c.clearAnimation();
                        InterfaceC1093a interfaceC1093a = PrivacyPolicyView.this.f2541m;
                        if (interfaceC1093a != null) {
                            interfaceC1093a.onPageLoadSuccess();
                        }
                    } else {
                        privacyPolicyView.f2530b.setVisibility(0);
                        PrivacyPolicyView.this.f2531c.clearAnimation();
                        PrivacyPolicyView.this.f2532d.setVisibility(0);
                        PrivacyPolicyView.this.f2529a.setVisibility(8);
                        InterfaceC1093a interfaceC1093a2 = PrivacyPolicyView.this.f2541m;
                        if (interfaceC1093a2 != null) {
                            interfaceC1093a2.onPageLoadFail();
                        }
                    }
                    PrivacyPolicyView.this.f2539k = false;
                    super.onPageFinished(webView, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d(PrivacyPolicyView.f2528n, "onPageStarted:".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            PrivacyPolicyView.this.f2538j = false;
            Log.d(PrivacyPolicyView.f2528n, "onPageFinished:" + webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d(PrivacyPolicyView.f2528n, "shouldOverrideUrlLoading:".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            PrivacyPolicyView.m1585a(PrivacyPolicyView.this.getContext(), str);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.activity.component.PrivacyPolicyView$3 */
    public class C10923 extends WebChromeClient {
        public C10923() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("error")) {
                PrivacyPolicyView.this.f2538j = false;
            }
            super.onReceivedTitle(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.activity.component.PrivacyPolicyView$a */
    public interface InterfaceC1093a {
        void onLevelSelect(int i);

        void onPageLoadFail();

        void onPageLoadSuccess();
    }

    public PrivacyPolicyView(Context context) {
        super(context);
        this.f2538j = true;
        this.f2539k = false;
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "privace_policy_layout", "layout"), this);
        this.f2529a = (ViewGroup) findViewById(C1345i.m4154a(getContext(), "policy_content_view", "id"));
        this.f2530b = (LinearLayout) findViewById(C1345i.m4154a(getContext(), "policy_loading_view", "id"));
        this.f2531c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1345i.m4153a(getContext(), 30.0f), C1345i.m4153a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f2531c.setLayoutParams(layoutParams);
        this.f2532d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = C1345i.m4153a(getContext(), 5.0f);
        this.f2532d.setLayoutParams(layoutParams2);
        this.f2532d.setText("Page failed to load, please try again later.");
        this.f2532d.setTextColor(-8947849);
        this.f2532d.setTextSize(1, 12.0f);
        this.f2530b.addView(this.f2531c);
        this.f2530b.addView(this.f2532d);
        this.f2530b.setOnClickListener(new ViewOnClickListenerC10901());
        this.f2533e = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f2534f = webView;
        C1344h.m4138a(webView);
        this.f2533e.addView(this.f2534f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f2534f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f2534f.setWebViewClient(new C10912());
        this.f2534f.setWebChromeClient(new C10923());
        this.f2535g = (CheckBox) findViewById(C1345i.m4154a(getContext(), "policy_check_box", "id"));
        this.f2536h = findViewById(C1345i.m4154a(getContext(), "policy_agree_view", "id"));
        this.f2537i = (TextView) findViewById(C1345i.m4154a(getContext(), "policy_reject_view", "id"));
        this.f2536h.setOnClickListener(this);
        this.f2537i.setOnClickListener(this);
        int iM4153a = C1345i.m4153a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(iM4153a);
        this.f2536h.setBackgroundDrawable(gradientDrawable);
        this.f2537i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1585a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    private void m1586b() {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "privace_policy_layout", "layout"), this);
        this.f2529a = (ViewGroup) findViewById(C1345i.m4154a(getContext(), "policy_content_view", "id"));
        this.f2530b = (LinearLayout) findViewById(C1345i.m4154a(getContext(), "policy_loading_view", "id"));
        this.f2531c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1345i.m4153a(getContext(), 30.0f), C1345i.m4153a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f2531c.setLayoutParams(layoutParams);
        this.f2532d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = C1345i.m4153a(getContext(), 5.0f);
        this.f2532d.setLayoutParams(layoutParams2);
        this.f2532d.setText("Page failed to load, please try again later.");
        this.f2532d.setTextColor(-8947849);
        this.f2532d.setTextSize(1, 12.0f);
        this.f2530b.addView(this.f2531c);
        this.f2530b.addView(this.f2532d);
        this.f2530b.setOnClickListener(new ViewOnClickListenerC10901());
        this.f2533e = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f2534f = webView;
        C1344h.m4138a(webView);
        this.f2533e.addView(this.f2534f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f2534f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f2534f.setWebViewClient(new C10912());
        this.f2534f.setWebChromeClient(new C10923());
        this.f2535g = (CheckBox) findViewById(C1345i.m4154a(getContext(), "policy_check_box", "id"));
        this.f2536h = findViewById(C1345i.m4154a(getContext(), "policy_agree_view", "id"));
        this.f2537i = (TextView) findViewById(C1345i.m4154a(getContext(), "policy_reject_view", "id"));
        this.f2536h.setOnClickListener(this);
        this.f2537i.setOnClickListener(this);
        int iM4153a = C1345i.m4153a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(iM4153a);
        this.f2536h.setBackgroundDrawable(gradientDrawable);
        this.f2537i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    /* JADX INFO: renamed from: b */
    private static void m1587b(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: c */
    private void m1588c() {
        WebSettings settings = this.f2534f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f2534f.setWebViewClient(new C10912());
        this.f2534f.setWebChromeClient(new C10923());
    }

    public void destory() {
        try {
            removeAllViews();
            ViewGroup viewGroup = this.f2529a;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            FrameLayout frameLayout = this.f2533e;
            if (frameLayout != null) {
                frameLayout.removeView(this.f2534f);
                this.f2534f.removeAllViews();
            }
            WebView webView = this.f2534f;
            if (webView != null) {
                webView.clearHistory();
                this.f2534f.clearCache(true);
                this.f2534f.destroy();
                this.f2534f = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void loadPolicyUrl(String str) {
        if (this.f2539k) {
            return;
        }
        this.f2540l = str;
        if (!C1345i.m4159a(getContext())) {
            this.f2538j = false;
            this.f2530b.setVisibility(0);
            this.f2531c.clearAnimation();
            this.f2532d.setVisibility(0);
            this.f2529a.setVisibility(8);
            InterfaceC1093a interfaceC1093a = this.f2541m;
            if (interfaceC1093a != null) {
                interfaceC1093a.onPageLoadFail();
                return;
            }
            return;
        }
        this.f2538j = true;
        this.f2530b.setVisibility(0);
        this.f2531c.clearAnimation();
        this.f2531c.startAnimation();
        this.f2532d.setVisibility(8);
        this.f2539k = true;
        if (this.f2540l.equals(this.f2534f.getUrl())) {
            this.f2534f.reload();
        } else {
            this.f2534f.loadUrl(this.f2540l);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f2536h) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 0);
            view.setTag(0);
            InterfaceC1093a interfaceC1093a = this.f2541m;
            if (interfaceC1093a != null) {
                interfaceC1093a.onLevelSelect(0);
                return;
            }
            return;
        }
        if (view == this.f2537i) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 1);
            view.setTag(1);
            InterfaceC1093a interfaceC1093a2 = this.f2541m;
            if (interfaceC1093a2 != null) {
                interfaceC1093a2.onLevelSelect(1);
            }
        }
    }

    public void setResultCallbackListener(InterfaceC1093a interfaceC1093a) {
        this.f2541m = interfaceC1093a;
    }
}
