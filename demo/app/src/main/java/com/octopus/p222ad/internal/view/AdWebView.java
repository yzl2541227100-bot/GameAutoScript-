package com.octopus.p222ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.EnumC3116i;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.p225a.C3074a;
import com.octopus.p222ad.internal.utilities.HTTPGet;
import com.octopus.p222ad.internal.utilities.HTTPResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import com.octopus.p222ad.internal.video.AdVideoView;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.internal.view.C3197e;
import com.octopus.p222ad.p224b.C3070c;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.p258b.C3252c;
import java.util.HashMap;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class AdWebView extends WebView implements InterfaceC3194b {

    /* JADX INFO: renamed from: A */
    private boolean f17631A;

    /* JADX INFO: renamed from: B */
    private boolean f17632B;

    /* JADX INFO: renamed from: C */
    private boolean f17633C;

    /* JADX INFO: renamed from: D */
    private boolean f17634D;

    /* JADX INFO: renamed from: E */
    private boolean f17635E;

    /* JADX INFO: renamed from: F */
    private int f17636F;

    /* JADX INFO: renamed from: G */
    private int f17637G;

    /* JADX INFO: renamed from: H */
    private long f17638H;

    /* JADX INFO: renamed from: I */
    private float f17639I;

    /* JADX INFO: renamed from: J */
    private float f17640J;

    /* JADX INFO: renamed from: K */
    private boolean f17641K;

    /* JADX INFO: renamed from: L */
    private final Runnable f17642L;

    /* JADX INFO: renamed from: a */
    public boolean f17643a;

    /* JADX INFO: renamed from: ad */
    public ServerResponse f17644ad;
    public AdViewImpl adViewImpl;

    /* JADX INFO: renamed from: b */
    public String f17645b;

    /* JADX INFO: renamed from: c */
    private boolean f17646c;

    /* JADX INFO: renamed from: d */
    private boolean f17647d;

    /* JADX INFO: renamed from: e */
    private C3197e f17648e;

    /* JADX INFO: renamed from: f */
    private int f17649f;

    /* JADX INFO: renamed from: g */
    private int f17650g;
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: h */
    private boolean f17651h;

    /* JADX INFO: renamed from: i */
    private int f17652i;

    /* JADX INFO: renamed from: j */
    private int f17653j;

    /* JADX INFO: renamed from: k */
    private int f17654k;

    /* JADX INFO: renamed from: l */
    private int f17655l;

    /* JADX INFO: renamed from: m */
    private int f17656m;
    public AdVideoView mAdVideoView;

    /* JADX INFO: renamed from: n */
    private boolean f17657n;

    /* JADX INFO: renamed from: o */
    private boolean f17658o;

    /* JADX INFO: renamed from: p */
    private Handler f17659p;

    /* JADX INFO: renamed from: q */
    private boolean f17660q;

    /* JADX INFO: renamed from: r */
    private int f17661r;

    /* JADX INFO: renamed from: s */
    private ProgressDialog f17662s;

    /* JADX INFO: renamed from: t */
    private boolean f17663t;

    /* JADX INFO: renamed from: u */
    private boolean f17664u;

    /* JADX INFO: renamed from: v */
    private int f17665v;

    /* JADX INFO: renamed from: w */
    private int f17666w;

    /* JADX INFO: renamed from: x */
    private int f17667x;

    /* JADX INFO: renamed from: y */
    private boolean f17668y;

    /* JADX INFO: renamed from: z */
    private boolean f17669z;

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$1 */
    public class AsyncTaskC31761 extends HTTPGet {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f17670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC31761(boolean z, String str) {
            super(z);
            str = str;
        }

        @Override // com.octopus.p222ad.internal.utilities.HTTPGet
        public String getUrl() {
            return str;
        }

        @Override // com.octopus.p222ad.internal.utilities.HTTPGet, android.os.AsyncTask
        public void onPostExecute(HTTPResponse hTTPResponse) {
            if (hTTPResponse.getSucceeded()) {
                AdWebView.this.loadDataWithBaseURL(C3120m.m14425a().m14443i(), AdWebView.this.m14725f(AdWebView.this.m14724e(AdWebView.this.m14720d(hTTPResponse.getResponseBody()))), "text/html", "UTF-8", null);
                AdWebView.this.fireMRAIDEnabled();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$2 */
    public class DialogInterfaceOnCancelListenerC31772 implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WebView f17672a;

        public DialogInterfaceOnCancelListenerC31772(WebView webView) {
            webView = webView;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            webView.stopLoading();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$3 */
    public class RunnableC31783 implements Runnable {
        public RunnableC31783() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdWebView.this.adViewImpl.getAdDispatcher().mo14235a();
            AdWebView adWebView = AdWebView.this;
            ServerResponse serverResponse = adWebView.f17644ad;
            if (serverResponse != null) {
                serverResponse.handleView(adWebView, adWebView.adViewImpl.getAdParameters().m14369a());
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$4 */
    public class C31794 implements InterfaceC3182b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3197e f17675a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f17676b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdActivity.EnumC3054b f17677c;

        public C31794(C3197e c3197e, boolean z, AdActivity.EnumC3054b enumC3054b) {
            c3197e = c3197e;
            z = z;
            enumC3054b = enumC3054b;
        }

        @Override // com.octopus.p222ad.internal.view.AdWebView.InterfaceC3182b
        /* JADX INFO: renamed from: a */
        public void mo14751a() {
            C3197e c3197e = c3197e;
            if (c3197e == null || c3197e.m14802c() == null) {
                return;
            }
            AdWebView.this.m14741a(c3197e.m14802c(), z, enumC3054b);
            AdViewImpl.setMRAIDFullscreenListener(null);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$5 */
    public class RunnableC31805 implements Runnable {
        public RunnableC31805() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdWebView.this.f17660q) {
                return;
            }
            AdWebView.this.m14749f();
            AdWebView.this.f17659p.postDelayed(this, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$a */
    public class C3181a extends WebViewClient {
        private C3181a() {
        }

        public /* synthetic */ C3181a(AdWebView adWebView, AsyncTaskC31761 asyncTaskC31761) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (str.startsWith("http")) {
                try {
                    WebView.HitTestResult hitTestResult = AdWebView.this.getHitTestResult();
                    if (hitTestResult == null || hitTestResult.getExtra() == null) {
                        return;
                    }
                    if (hitTestResult.getExtra().equals(str)) {
                        int type = hitTestResult.getType();
                        if (type == 1 || type == 6 || type == 7 || type == 8) {
                            AdWebView.this.m14744b(str);
                            webView.stopLoading();
                            AdWebView.this.m14745c();
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            AdWebView adWebView = AdWebView.this;
            if (adWebView.f17644ad.mMediaType == EnumC3119l.SPLASH) {
                adWebView.visible();
            }
            if (AdWebView.this.f17651h) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript("javascript:window.mraid.util.pageFinished()", null);
            } else {
                webView.loadUrl("javascript:window.mraid.util.pageFinished()");
            }
            if (AdWebView.this.f17647d) {
                C3197e c3197e = AdWebView.this.f17648e;
                AdWebView adWebView2 = AdWebView.this;
                c3197e.m14795a(adWebView2, adWebView2.f17645b);
                AdWebView.this.m14732i();
            }
            AdWebView.this.f17651h = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            HaoboLog.m14615w(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.webview_received_error, i, str, str2));
            AdViewImpl adViewImpl = AdWebView.this.adViewImpl;
            if (adViewImpl == null || adViewImpl.getAdDispatcher() == null) {
                return;
            }
            AdWebView.this.adViewImpl.getAdDispatcher().mo14236a(2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            AdWebView.this.m14729h();
            HaoboLog.m14615w(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.webclient_error, sslError.getPrimaryError(), sslError.toString()));
            AdViewImpl adViewImpl = AdWebView.this.adViewImpl;
            if (adViewImpl == null || adViewImpl.getAdDispatcher() == null) {
                return;
            }
            AdWebView.this.adViewImpl.getAdDispatcher().mo14236a(2);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r13, java.lang.String r14) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.AdWebView.C3181a.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$b */
    public interface InterfaceC3182b {
        /* JADX INFO: renamed from: a */
        void mo14751a();
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$c */
    public class C3183c extends WebView {

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdWebView$c$1 */
        public class AnonymousClass1 extends WebViewClient {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdWebView f17682a;

            /* JADX INFO: renamed from: c */
            private boolean f17684c = false;

            public AnonymousClass1(AdWebView adWebView) {
                adWebView = adWebView;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                HaoboLog.m14613v(HaoboLog.browserLogTag, "Opening URL: " + str);
                ViewUtil.removeChildFromParent(C3183c.this);
                if (AdWebView.this.f17662s != null && AdWebView.this.f17662s.isShowing()) {
                    AdWebView.this.f17662s.dismiss();
                }
                if (this.f17684c) {
                    this.f17684c = false;
                    C3183c.this.destroy();
                    AdWebView.this.m14737k();
                } else {
                    C3183c.this.setVisibility(0);
                    C3183c c3183c = C3183c.this;
                    AdWebView.this.m14709a(c3183c);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                HaoboLog.m14613v(HaoboLog.browserLogTag, "Redirecting to URL: " + str);
                boolean zM14731h = AdWebView.this.m14731h(str);
                this.f17684c = zM14731h;
                if (zM14731h && AdWebView.this.f17662s != null && AdWebView.this.f17662s.isShowing()) {
                    AdWebView.this.f17662s.dismiss();
                }
                return this.f17684c;
            }
        }

        @SuppressLint({"SetJavaScriptEnabled"})
        public C3183c(Context context) {
            super(new MutableContextWrapper(context));
            WebviewUtil.setWebViewSettings(this);
            setWebViewClient(new WebViewClient() { // from class: com.octopus.ad.internal.view.AdWebView.c.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AdWebView f17682a;

                /* JADX INFO: renamed from: c */
                private boolean f17684c = false;

                public AnonymousClass1(AdWebView adWebView) {
                    adWebView = adWebView;
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    HaoboLog.m14613v(HaoboLog.browserLogTag, "Opening URL: " + str);
                    ViewUtil.removeChildFromParent(C3183c.this);
                    if (AdWebView.this.f17662s != null && AdWebView.this.f17662s.isShowing()) {
                        AdWebView.this.f17662s.dismiss();
                    }
                    if (this.f17684c) {
                        this.f17684c = false;
                        C3183c.this.destroy();
                        AdWebView.this.m14737k();
                    } else {
                        C3183c.this.setVisibility(0);
                        C3183c c3183c = C3183c.this;
                        AdWebView.this.m14709a(c3183c);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    HaoboLog.m14613v(HaoboLog.browserLogTag, "Redirecting to URL: " + str);
                    boolean zM14731h = AdWebView.this.m14731h(str);
                    this.f17684c = zM14731h;
                    if (zM14731h && AdWebView.this.f17662s != null && AdWebView.this.f17662s.isShowing()) {
                        AdWebView.this.f17662s.dismiss();
                    }
                    return this.f17684c;
                }
            });
        }
    }

    public AdWebView(AdViewImpl adViewImpl) {
        super(new MutableContextWrapper(adViewImpl.getContext()));
        this.f17646c = false;
        this.f17644ad = null;
        this.mAdVideoView = null;
        this.f17643a = false;
        this.f17657n = false;
        this.f17658o = false;
        this.f17659p = new Handler();
        this.f17660q = false;
        this.f17663t = false;
        this.f17664u = false;
        this.f17667x = -1;
        this.f17668y = false;
        this.f17669z = false;
        this.f17631A = false;
        this.f17632B = false;
        this.f17633C = false;
        this.f17634D = false;
        this.f17635E = false;
        this.f17636F = 0;
        this.f17637G = 0;
        this.f17642L = new Runnable() { // from class: com.octopus.ad.internal.view.AdWebView.5
            public RunnableC31805() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AdWebView.this.f17660q) {
                    return;
                }
                AdWebView.this.m14749f();
                AdWebView.this.f17659p.postDelayed(this, 1000L);
            }
        };
        setBackgroundColor(0);
        this.adViewImpl = adViewImpl;
        this.f17645b = C3197e.f17752a[C3197e.b.STARTING_DEFAULT.ordinal()];
        m14739a();
        m14743b();
        setVisibility(4);
        this.adViewImpl.setAdWebView(this);
    }

    /* JADX INFO: renamed from: a */
    private static float m14705a(float f) {
        return f / C3120m.m14425a().m14449o().density;
    }

    /* JADX INFO: renamed from: a */
    private static float m14706a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return m14705a((float) Math.sqrt((f5 * f5) + (f6 * f6)));
    }

    /* JADX INFO: renamed from: a */
    private void m14708a(int i, int i2) {
        if (i == 0 && i2 == 0) {
            WebviewUtil.onResume(this);
            this.f17658o = true;
            if (this.f17647d && this.f17651h) {
                m14732i();
            }
        } else {
            WebviewUtil.onPause(this);
            this.f17658o = false;
            m14735j();
        }
        C3197e c3197e = this.f17648e;
        if (c3197e != null) {
            c3197e.m14800b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14709a(WebView webView) {
        Class clsM13811a = AdActivity.m13811a();
        Intent intent = new Intent(this.adViewImpl.getContext(), (Class<?>) clsM13811a);
        intent.setFlags(268435456);
        intent.putExtra("ACTIVITY_TYPE", "BROWSER");
        C3074a.f17016a.add(webView);
        if (this.adViewImpl.getBrowserStyle() != null) {
            String str = "" + super.hashCode();
            intent.putExtra("bridgeid", str);
            AdViewImpl.C3174c.f17630a.add(new Pair<>(str, this.adViewImpl.getBrowserStyle()));
        }
        try {
            this.adViewImpl.getContext().startActivity(intent);
            m14737k();
        } catch (ActivityNotFoundException unused) {
            HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a.getName()));
            C3074a.f17016a.remove();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14710a(FrameLayout.LayoutParams layoutParams) {
        AdViewImpl adViewImpl = this.adViewImpl;
        if ((adViewImpl instanceof BannerAdViewImpl) && ((BannerAdViewImpl) adViewImpl).getResizeAdToFitContainer()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        }
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    private void m14712a(HashMap map) {
        if (!map.isEmpty() && map.containsKey(ServerResponse.EXTRAS_KEY_MRAID)) {
            this.f17647d = ((Boolean) map.get(ServerResponse.EXTRAS_KEY_MRAID)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: d */
    public String m14720d(String str) {
        if (StringUtil.isEmpty(str)) {
            return str;
        }
        str.trim();
        if (str.startsWith("<html>")) {
            return str;
        }
        return "<html><body style='padding:0;margin:0;'>" + str + "</body></html>";
    }

    /* JADX INFO: renamed from: e */
    public String m14724e(String str) {
        if (StringUtil.isEmpty(str)) {
            return str;
        }
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder("<html><head><script>");
        if (resources != null && StringUtil.appendLocalStr(sb, StringUtil.octopusJSStr) && StringUtil.appendLocalStr(sb, StringUtil.octopusStr) && StringUtil.appendLocalStr(sb, StringUtil.mraidjsStr)) {
            sb.append("</script></head>");
            return str.replaceFirst("<html>", Matcher.quoteReplacement(sb.toString()));
        }
        HaoboLog.m14609e(HaoboLog.baseLogTag, "Error reading SDK's raw resources.");
        return str;
    }

    /* JADX INFO: renamed from: f */
    public String m14725f(String str) {
        return !StringUtil.isEmpty(str) ? str.replaceFirst("<head>", Matcher.quoteReplacement(new StringBuilder("<head><link rel=\"icon\" href=\"data:;base64,=\"><meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=no\"/>").toString())) : str;
    }

    /* JADX INFO: renamed from: g */
    private boolean m14728g(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            this.adViewImpl.getContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.opening_url_failed, str));
            if (this.f17647d) {
                Toast.makeText(this.adViewImpl.getContext(), C3063R.string.action_cant_be_completed, 0).show();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m14729h() {
        this.f17646c = true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14731h(String str) {
        String strM14971a = C3252c.m14971a("aHR0cDovL2Fib3V0OmJsYW5r");
        if (!str.contains("://play.google.com") && (str.startsWith("http") || str.startsWith(strM14971a))) {
            return false;
        }
        HaoboLog.m14611i(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.opening_app_store));
        return m14728g(str);
    }

    /* JADX INFO: renamed from: i */
    public void m14732i() {
        if (this.f17658o) {
            this.f17660q = false;
            this.f17659p.removeCallbacks(this.f17642L);
            this.f17659p.post(this.f17642L);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m14735j() {
        this.f17660q = true;
        this.f17659p.removeCallbacks(this.f17642L);
    }

    /* JADX INFO: renamed from: k */
    public void m14737k() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl == null || !(adViewImpl instanceof InterstitialAdViewImpl)) {
            return;
        }
        ((InterstitialAdViewImpl) adViewImpl).m14773g();
    }

    private void setCreativeHeight(int i) {
        this.f17655l = i;
    }

    private void setCreativeWidth(int i) {
        this.f17654k = i;
    }

    public boolean IsVideoWifiOnly() {
        return this.f17634D;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: a */
    public void m14739a() {
        C3120m.m14425a().m14437c(getSettings().getUserAgentString());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setEnableSmoothTransition(true);
        getSettings().setLightTouchEnabled(false);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setLoadsImagesAutomatically(true);
        getSettings().setSavePassword(false);
        getSettings().setSupportZoom(false);
        getSettings().setUseWideViewPort(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 21) {
            getSettings().setMixedContentMode(0);
        }
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        if (i >= 11 && i < 19) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        if (i >= 16) {
            getSettings().setAllowFileAccessFromFileURLs(false);
            getSettings().setAllowUniversalAccessFromFileURLs(false);
        }
        if (i >= 21) {
            CookieManager cookieManager = CookieManager.getInstance();
            if (cookieManager != null) {
                cookieManager.setAcceptThirdPartyCookies(this, true);
            } else {
                HaoboLog.m14607d(HaoboLog.baseLogTag, "Failed to set Webview to accept 3rd party cookie");
            }
        }
        setHorizontalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        if (this.f17631A) {
            setBackgroundColor(0);
        }
        setScrollBarStyle(0);
    }

    /* JADX INFO: renamed from: a */
    public void m14740a(int i, int i2, boolean z, C3197e c3197e, boolean z3, AdActivity.EnumC3054b enumC3054b) {
        int i3 = i;
        int i4 = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getLayoutParams());
        if (!this.f17648e.f17755d) {
            this.f17649f = layoutParams.width;
            this.f17650g = layoutParams.height;
        }
        if (i4 == -1 && i3 == -1 && this.adViewImpl != null) {
            this.f17643a = true;
        }
        if (i4 != -1) {
            i4 = (int) (((double) (i4 * displayMetrics.density)) + 0.5d);
        }
        int i5 = i4;
        if (i3 != -1) {
            i3 = (int) (((double) (i3 * displayMetrics.density)) + 0.5d);
        }
        int i6 = i3;
        layoutParams.height = i5;
        layoutParams.width = i6;
        layoutParams.gravity = 17;
        C31794 c31794 = null;
        if (this.f17643a) {
            c31794 = new InterfaceC3182b() { // from class: com.octopus.ad.internal.view.AdWebView.4

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C3197e f17675a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f17676b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AdActivity.EnumC3054b f17677c;

                public C31794(C3197e c3197e2, boolean z32, AdActivity.EnumC3054b enumC3054b2) {
                    c3197e = c3197e2;
                    z = z32;
                    enumC3054b = enumC3054b2;
                }

                @Override // com.octopus.p222ad.internal.view.AdWebView.InterfaceC3182b
                /* JADX INFO: renamed from: a */
                public void mo14751a() {
                    C3197e c3197e2 = c3197e;
                    if (c3197e2 == null || c3197e2.m14802c() == null) {
                        return;
                    }
                    AdWebView.this.m14741a(c3197e.m14802c(), z, enumC3054b);
                    AdViewImpl.setMRAIDFullscreenListener(null);
                }
            };
        }
        C31794 c317942 = c31794;
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.m14687a(i6, i5, z, c3197e2, c317942);
            this.adViewImpl.mo14698f();
        }
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void m14741a(Activity activity, boolean z, AdActivity.EnumC3054b enumC3054b) {
        AdActivity.EnumC3054b enumC3054b2 = AdActivity.EnumC3054b.none;
        if (enumC3054b != enumC3054b2) {
            AdActivity.m13814a(activity, enumC3054b);
        }
        if (z) {
            AdActivity.m13815b(activity);
        } else if (enumC3054b == enumC3054b2) {
            AdActivity.m13812a(activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14742a(String str) {
        new HTTPGet(false) { // from class: com.octopus.ad.internal.view.AdWebView.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f17670a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsyncTaskC31761(boolean z, String str2) {
                super(z);
                str = str2;
            }

            @Override // com.octopus.p222ad.internal.utilities.HTTPGet
            public String getUrl() {
                return str;
            }

            @Override // com.octopus.p222ad.internal.utilities.HTTPGet, android.os.AsyncTask
            public void onPostExecute(HTTPResponse hTTPResponse) {
                if (hTTPResponse.getSucceeded()) {
                    AdWebView.this.loadDataWithBaseURL(C3120m.m14425a().m14443i(), AdWebView.this.m14725f(AdWebView.this.m14724e(AdWebView.this.m14720d(hTTPResponse.getResponseBody()))), "text/html", "UTF-8", null);
                    AdWebView.this.fireMRAIDEnabled();
                }
            }
        }.execute(new Void[0]);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: b */
    public void m14743b() {
        this.f17648e = new C3197e(this);
        setWebChromeClient(new C3200h(this));
        setWebViewClient(new C3181a());
    }

    /* JADX INFO: renamed from: b */
    public void m14744b(String str) {
        if (this.adViewImpl.getOpensNativeBrowser()) {
            HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.opening_native));
            m14728g(str);
            m14737k();
            return;
        }
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.opening_inapp));
        if (m14731h(str)) {
            return;
        }
        try {
            if (this.adViewImpl.getLoadsInBackground()) {
                C3183c c3183c = new C3183c(getContext());
                c3183c.loadUrl(str);
                c3183c.setVisibility(8);
                this.adViewImpl.addView(c3183c);
                if (this.adViewImpl.getShowLoadingIndicator()) {
                    ProgressDialog progressDialog = new ProgressDialog(getContextFromMutableContext());
                    this.f17662s = progressDialog;
                    progressDialog.setCancelable(true);
                    this.f17662s.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.octopus.ad.internal.view.AdWebView.2

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ WebView f17672a;

                        public DialogInterfaceOnCancelListenerC31772(WebView c3183c2) {
                            webView = c3183c2;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
                            webView.stopLoading();
                        }
                    });
                    this.f17662s.setMessage(getContext().getResources().getString(C3063R.string.loading));
                    this.f17662s.setProgressStyle(0);
                    this.f17662s.show();
                }
            } else {
                WebView webView = new WebView(new MutableContextWrapper(getContext()));
                WebviewUtil.setWebViewSettings(webView);
                webView.loadUrl(str);
                m14709a(webView);
            }
        } catch (Exception e) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Exception initializing the redirect webview: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14745c() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.mo14698f();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14746c(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
        } else {
            loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14747d() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.m14695c();
        }
    }

    @Override // android.webkit.WebView, com.octopus.p222ad.internal.view.InterfaceC3194b
    public void destroy() {
        setVisibility(4);
        ViewUtil.removeChildFromParent(this);
        super.destroy();
        removeAllViews();
        m14735j();
    }

    /* JADX INFO: renamed from: e */
    public void mo14748e() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.m14686a(this.f17649f, this.f17650g, this.f17648e);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14749f() {
        if (getContextFromMutableContext() instanceof Activity) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            boolean z = false;
            int i = iArr[0];
            int width = iArr[0] + getWidth();
            int i2 = iArr[1];
            int height = iArr[1] + getHeight();
            int[] screenSizeAsPixels = ViewUtil.getScreenSizeAsPixels((Activity) getContextFromMutableContext());
            if (width > 0 && i < screenSizeAsPixels[0] && height > 0 && i2 < screenSizeAsPixels[1]) {
                z = true;
            }
            this.f17657n = z;
            C3197e c3197e = this.f17648e;
            if (c3197e != null) {
                c3197e.m14800b();
                this.f17648e.m14792a(i, i2, getWidth(), getHeight());
                this.f17648e.m14791a(getContext().getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public boolean failed() {
        return this.f17646c;
    }

    public void fireMRAIDEnabled() {
        if (this.f17647d) {
            return;
        }
        this.f17647d = true;
        if (this.f17651h) {
            this.f17648e.m14795a(this, this.f17645b);
            m14732i();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m14750g() {
        return this.f17657n && this.f17658o;
    }

    public HashMap<String, Object> getAdExtras() {
        ServerResponse serverResponse = this.f17644ad;
        if (serverResponse == null) {
            return null;
        }
        return serverResponse.getExtras();
    }

    public int getAutoCloseTime() {
        return this.f17666w;
    }

    public Context getContextFromMutableContext() {
        return getContext() instanceof MutableContextWrapper ? ((MutableContextWrapper) getContext()).getBaseContext() : getContext();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public int getCreativeHeight() {
        return this.f17655l;
    }

    public int getCreativeLeft() {
        return this.f17652i;
    }

    public int getCreativeTop() {
        return this.f17653j;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public int getCreativeWidth() {
        return this.f17654k;
    }

    public C3197e getMRAIDImplementation() {
        return this.f17648e;
    }

    public int getOrientation() {
        return this.f17661r;
    }

    public InterfaceC3194b getRealDisplayable() {
        AdVideoView adVideoView;
        return (!this.f17633C || (adVideoView = this.mAdVideoView) == null) ? this : adVideoView;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public int getRefreshInterval() {
        return this.f17656m;
    }

    public int getShowCloseBtnTime() {
        return this.f17665v;
    }

    public boolean getUserInteraction() {
        return this.f17664u;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public View getView() {
        return this;
    }

    public void handleClickView(MotionEvent motionEvent, long j, long j2, int i) {
        AdWebView adWebView;
        String str;
        String str2;
        String str3;
        String str4;
        String strValueOf;
        String strValueOf2;
        boolean z;
        String strM14369a;
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl == null || adViewImpl.getAdDispatcher() == null) {
            return;
        }
        this.f17636F++;
        this.adViewImpl.getAdDispatcher().mo14243d();
        this.f17644ad.setOpenInNativeBrowser(this.adViewImpl.getOpensNativeBrowser());
        ServerResponse serverResponse = this.f17644ad;
        if (motionEvent == null) {
            strValueOf = String.valueOf(j);
            strValueOf2 = String.valueOf(j2);
            z = this.f17635E;
            strM14369a = this.adViewImpl.getAdParameters().m14369a();
            str = "100";
            str2 = "200";
            str3 = "105";
            str4 = "206";
            adWebView = this;
        } else {
            String str5 = motionEvent.getX() + "";
            String str6 = motionEvent.getY() + "";
            String str7 = motionEvent.getRawX() + "";
            String str8 = motionEvent.getRawY() + "";
            String strValueOf3 = String.valueOf(j);
            String strValueOf4 = String.valueOf(j2);
            adWebView = this;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            strValueOf = strValueOf3;
            strValueOf2 = strValueOf4;
            z = this.f17635E;
            strM14369a = this.adViewImpl.getAdParameters().m14369a();
        }
        serverResponse.handleClick(adWebView, str, str2, str3, str4, strValueOf, strValueOf2, z, strM14369a, i);
        this.f17635E = true;
    }

    public void handleClickView(C3070c c3070c, long j, long j2, int i, int i2) {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl == null || adViewImpl.getAdDispatcher() == null || this.adViewImpl.isRewardVideo()) {
            return;
        }
        this.f17636F++;
        this.adViewImpl.getAdDispatcher().mo14243d();
        this.f17644ad.setOpenInNativeBrowser(this.adViewImpl.getOpensNativeBrowser());
        this.f17644ad.handleClick(this, c3070c, String.valueOf(j), String.valueOf(j2), this.f17635E, this.adViewImpl.getAdParameters().m14369a(), i, i2);
        this.f17635E = true;
    }

    public boolean isAutoPlay() {
        return this.f17668y;
    }

    public boolean isBackgroundDim() {
        return this.f17632B;
    }

    public boolean isMRAIDUseCustomClose() {
        return this.f17663t;
    }

    public boolean isMuted() {
        return this.f17669z;
    }

    public boolean isVideoFullScreen() {
        return this.f17631A;
    }

    public void loadAd(ServerResponse serverResponse) {
        int i;
        if (serverResponse == null) {
            return;
        }
        this.f17644ad = serverResponse;
        setCreativeHeight(serverResponse.getHeight());
        setCreativeWidth(serverResponse.getWidth());
        setCreativeLeft(serverResponse.getLeft());
        setCreativeTop(serverResponse.getTop());
        setRefreshInterval(serverResponse.getRefreshInterval());
        if (serverResponse.isManualClose()) {
            this.f17665v = serverResponse.getMinTimer();
        } else {
            this.f17665v = -1;
        }
        if (!serverResponse.isAutoClose() || serverResponse.getMaxTimer() == 0) {
            this.f17666w = -1;
        } else {
            this.f17666w = serverResponse.getMaxTimer();
        }
        if (this.f17665v == -1 && this.f17666w == -1 && serverResponse.getAdType() != C3072e.a.ADP_IVIDEO) {
            this.f17665v = 0;
        } else {
            int i2 = this.f17665v;
            if (i2 != -1 && (i = this.f17666w) != -1 && i2 > i) {
                this.f17665v = i;
            }
        }
        this.f17668y = serverResponse.isAutoPlay();
        this.f17669z = serverResponse.isMuted();
        this.f17631A = serverResponse.isFullScreen();
        this.f17632B = serverResponse.isBackgroundDim();
        this.f17661r = serverResponse.getAdOrientation();
        this.f17634D = serverResponse.isWifiOnly();
        this.f17667x = -1;
        setInitialScale((int) ((C3120m.m14425a().m14448n() * 100.0f) + 0.5f));
        loadAdAt(0);
    }

    public boolean loadAdAt(int i) {
        int creativeHeight;
        int creativeWidth;
        FrameLayout.LayoutParams layoutParams;
        ServerResponse serverResponse = this.f17644ad;
        if (serverResponse != null && this.f17667x != i) {
            if (!serverResponse.getCreatives().isEmpty() && this.f17644ad.getCreatives().size() > i) {
                Pair<EnumC3116i, String> pair = this.f17644ad.getCreatives().get(i);
                if (StringUtil.isEmpty((String) pair.second)) {
                    m14729h();
                    return false;
                }
                if (pair.first == EnumC3116i.VIDEO) {
                    if (this.mAdVideoView == null) {
                        this.mAdVideoView = new AdVideoView(this);
                    }
                    this.mAdVideoView.transferAd(this, (String) pair.second);
                    this.f17633C = true;
                    String strM14971a = C3252c.m14971a("aHR0cDovL2Fib3V0OmJsYW5r");
                    if (!TextUtils.isEmpty(strM14971a)) {
                        loadUrl(strM14971a);
                    }
                } else {
                    HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.webview_loading, (String) pair.second));
                    m14712a(this.f17644ad.getExtras());
                    String strM14725f = m14725f(m14724e(m14720d((String) pair.second)));
                    float fM14446l = C3120m.m14425a().m14446l();
                    float fM14447m = C3120m.m14425a().m14447m();
                    float fM14448n = C3120m.m14425a().m14448n();
                    if (getCreativeWidth() == -1 && getCreativeHeight() == -1) {
                        creativeWidth = -1;
                        creativeHeight = -1;
                    } else {
                        creativeHeight = (int) ((getCreativeHeight() * fM14448n) + 0.5f);
                        creativeWidth = (int) ((getCreativeWidth() * fM14448n) + 0.5f);
                    }
                    if (getCreativeLeft() == 0 && getCreativeTop() == 0) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(creativeWidth, creativeHeight, 17);
                        EnumC3119l enumC3119l = this.f17644ad.mMediaType;
                        if (enumC3119l == EnumC3119l.SPLASH) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
                            setLayoutParams(layoutParams);
                            loadDataWithBaseURL(C3120m.m14425a().m14443i(), strM14725f, "text/html", "UTF-8", null);
                            this.f17633C = false;
                        } else {
                            if (enumC3119l == EnumC3119l.BANNER) {
                                layoutParams2 = new FrameLayout.LayoutParams(-2, -1, 17);
                            }
                            m14710a(layoutParams2);
                            loadDataWithBaseURL(C3120m.m14425a().m14443i(), strM14725f, "text/html", "UTF-8", null);
                            this.f17633C = false;
                        }
                    } else {
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(creativeWidth, creativeHeight, 8388659);
                        layoutParams3.setMargins((int) ((getCreativeLeft() * fM14446l) + 0.5f), (int) ((getCreativeTop() * fM14447m) + 0.5f), 0, 0);
                        if (this.f17644ad.mMediaType == EnumC3119l.SPLASH) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
                            setLayoutParams(layoutParams);
                            loadDataWithBaseURL(C3120m.m14425a().m14443i(), strM14725f, "text/html", "UTF-8", null);
                            this.f17633C = false;
                        } else {
                            m14710a(layoutParams3);
                            loadDataWithBaseURL(C3120m.m14425a().m14443i(), strM14725f, "text/html", "UTF-8", null);
                            this.f17633C = false;
                        }
                    }
                }
                this.f17667x = i;
                return true;
            }
            m14729h();
        }
        return false;
    }

    public boolean loadAdBy(int i) {
        return loadAdAt(this.f17667x + i);
    }

    public void onAdShow() {
        Handler handler = this.f17659p;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.octopus.ad.internal.view.AdWebView.3
                public RunnableC31783() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdWebView.this.adViewImpl.getAdDispatcher().mo14235a();
                    AdWebView adWebView = AdWebView.this;
                    ServerResponse serverResponse = adWebView.f17644ad;
                    if (serverResponse != null) {
                        serverResponse.handleView(adWebView, adWebView.adViewImpl.getAdParameters().m14369a());
                    }
                }
            }, 50L);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m14749f();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void onDestroy() {
        destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProgressDialog progressDialog = this.f17662s;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f17662s.dismiss();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f17664u = true;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                z = (action == 2 && this.f17641K && m14706a(this.f17639I, this.f17640J, motionEvent.getX(), motionEvent.getY()) > 15.0f) ? false : true;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.f17638H;
                if (jCurrentTimeMillis - j < 1000 && this.f17641K) {
                    handleClickView(motionEvent, j, jCurrentTimeMillis, this.f17637G);
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f17638H = System.currentTimeMillis();
        this.f17639I = motionEvent.getX();
        this.f17640J = motionEvent.getY();
        this.f17641K = z;
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m14708a(getWindowVisibility(), i);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m14708a(i, getVisibility());
    }

    public void resize(int i, int i2, int i3, int i4, C3197e.a aVar, boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getLayoutParams());
        C3197e c3197e = this.f17648e;
        if (!c3197e.f17755d) {
            this.f17649f = layoutParams.width;
            this.f17650g = layoutParams.height;
        }
        float f = displayMetrics.density;
        int i5 = (int) (((double) (i2 * f)) + 0.5d);
        int i6 = (int) (((double) (i * f)) + 0.5d);
        layoutParams.height = i5;
        layoutParams.width = i6;
        layoutParams.gravity = 17;
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.m14685a(i6, i5, i3, i4, aVar, z, c3197e);
        }
        AdViewImpl adViewImpl2 = this.adViewImpl;
        if (adViewImpl2 != null) {
            adViewImpl2.mo14698f();
        }
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        super.scrollTo(0, 0);
    }

    public void setCreativeLeft(int i) {
        this.f17652i = i;
    }

    public void setCreativeTop(int i) {
        this.f17653j = i;
    }

    public void setMRAIDUseCustomClose(boolean z) {
        this.f17663t = z;
    }

    public void setOpt(int i) {
        this.f17637G = i;
    }

    public void setRefreshInterval(int i) {
        this.f17656m = i;
    }

    public boolean shouldDisplayButton() {
        if (this.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO) {
            if (this.f17644ad.getCreatives().get(this.f17667x).first == EnumC3116i.VIDEO) {
                return true;
            }
        } else if (this.f17667x == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void visible() {
        AdViewImpl adViewImpl;
        setVisibility(0);
        this.adViewImpl.showAdLogo(this);
        if (EnumC3119l.BANNER.equals(this.adViewImpl.getMediaType())) {
            AdViewImpl adViewImpl2 = this.adViewImpl;
            adViewImpl2.showBannerCloseBtn(adViewImpl2);
        }
        if (shouldDisplayButton() && (adViewImpl = this.adViewImpl) != null) {
            if (adViewImpl.getMediaType() == EnumC3119l.INTERSTITIAL) {
                this.adViewImpl.addInterstitialCloseButton(getShowCloseBtnTime(), getAutoCloseTime(), this, this.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO);
            } else {
                this.adViewImpl.isLoadToShow(this);
            }
        }
        AdViewImpl adViewImpl3 = this.adViewImpl;
        if (adViewImpl3 == null || adViewImpl3.getAdDispatcher() == null || this.adViewImpl.getMediaType() != EnumC3119l.INTERSTITIAL) {
            return;
        }
        onAdShow();
    }
}
