package com.anythink.expressad.p073a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.github.kevinsawicki.http.HttpRequest;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.anythink.expressad.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C1415g {

    /* JADX INFO: renamed from: a */
    public static long f6356a = 0;

    /* JADX INFO: renamed from: d */
    private static final String f6357d = "g";

    /* JADX INFO: renamed from: p */
    private static final int f6358p = 1;

    /* JADX INFO: renamed from: q */
    private static final int f6359q = 2;

    /* JADX INFO: renamed from: r */
    private static final int f6360r = 0;

    /* JADX INFO: renamed from: b */
    public boolean f6361b;

    /* JADX INFO: renamed from: c */
    public boolean f6362c;

    /* JADX INFO: renamed from: e */
    private int f6363e;

    /* JADX INFO: renamed from: f */
    private int f6364f;

    /* JADX INFO: renamed from: h */
    private C1483a f6366h;

    /* JADX INFO: renamed from: i */
    private a f6367i;

    /* JADX INFO: renamed from: j */
    private String f6368j;

    /* JADX INFO: renamed from: k */
    private String f6369k;

    /* JADX INFO: renamed from: l */
    private WebView f6370l;

    /* JADX INFO: renamed from: m */
    private boolean f6371m;

    /* JADX INFO: renamed from: n */
    private String f6372n;

    /* JADX INFO: renamed from: o */
    private int f6373o;

    /* JADX INFO: renamed from: t */
    private boolean f6375t;

    /* JADX INFO: renamed from: s */
    private boolean f6374s = false;

    /* JADX INFO: renamed from: u */
    private final Runnable f6376u = new Runnable() { // from class: com.anythink.expressad.a.g.4
        @Override // java.lang.Runnable
        public final void run() {
            C1415g.m5341n(C1415g.this);
            C1415g.this.f6373o = 1;
            String unused = C1415g.f6357d;
            StringBuilder sb = new StringBuilder("js timeout!timeout limit:");
            sb.append(C1415g.this.f6364f);
            sb.append("ms");
            C1415g.m5343p(C1415g.this);
        }
    };

    /* JADX INFO: renamed from: v */
    private final Runnable f6377v = new Runnable() { // from class: com.anythink.expressad.a.g.5
        @Override // java.lang.Runnable
        public final void run() {
            C1415g.m5341n(C1415g.this);
            C1415g.this.f6373o = 2;
            String unused = C1415g.f6357d;
            StringBuilder sb = new StringBuilder("http timeout!timeout limit:");
            sb.append(C1415g.this.f6363e);
            sb.append("ms");
            C1415g.m5343p(C1415g.this);
        }
    };

    /* JADX INFO: renamed from: g */
    private Handler f6365g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.anythink.expressad.a.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5348a(String str, String str2);

        /* JADX INFO: renamed from: a */
        void mo5349a(String str, String str2, String str3);

        /* JADX INFO: renamed from: a */
        boolean mo5350a();

        /* JADX INFO: renamed from: a */
        boolean mo5351a(String str);

        /* JADX INFO: renamed from: b */
        boolean mo5352b(String str);
    }

    public C1415g(boolean z) {
        long jM5975r;
        this.f6363e = 15000;
        this.f6364f = 3000;
        C1486b.m6002a();
        C1773a.m8548c().m8558f();
        C1483a c1483aM6007b = C1486b.m6007b();
        this.f6366h = c1483aM6007b;
        if (c1483aM6007b == null) {
            C1486b.m6002a();
            this.f6366h = C1486b.m6010c();
        }
        this.f6371m = this.f6366h.m5979v();
        if (z) {
            this.f6363e = (int) this.f6366h.m5974q();
            jM5975r = this.f6366h.m5974q();
        } else {
            this.f6363e = (int) this.f6366h.m5975r();
            jM5975r = this.f6366h.m5975r();
        }
        this.f6364f = (int) jM5975r;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: a */
    private void m5316a(Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f6370l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f6370l.getSettings().setCacheMode(2);
        this.f6370l.getSettings().setLoadsImagesAutomatically(false);
        this.f6370l.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.a.g.2
            /* JADX INFO: renamed from: a */
            private boolean m5347a() {
                C1415g c1415g = C1415g.this;
                return c1415g.f6361b || c1415g.f6362c;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                StringBuilder sb;
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (C1415g.this.f6375t) {
                        C1415g.this.f6373o = 0;
                        C1415g.m5323c(C1415g.this);
                        return;
                    }
                    C1415g.this.f6362c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        C1415g.this.f6361b = true;
                    }
                    synchronized (C1415g.f6357d) {
                        String str4 = "load page-start:";
                        C1415g c1415g = C1415g.this;
                        if (c1415g.f6361b || c1415g.f6362c) {
                            str4 = "load page-start:(redirect)";
                        }
                        if (URLUtil.isHttpsUrl(str3)) {
                            String unused = C1415g.f6357d;
                            sb = new StringBuilder();
                            sb.append(str4);
                        } else {
                            String unused2 = C1415g.f6357d;
                            sb = new StringBuilder();
                            sb.append(str4);
                        }
                        sb.append(str3);
                        C1415g.this.f6368j = str3;
                        if (C1415g.this.f6367i == null || !C1415g.this.f6367i.mo5351a(str3)) {
                            C1415g.m5329f(C1415g.this);
                        } else {
                            C1415g.m5327e(C1415g.this);
                            C1415g.m5323c(C1415g.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str3, String str4) {
                String unused = C1415g.f6357d;
                StringBuilder sb = new StringBuilder("onReceivedError: errno = ");
                sb.append(i);
                sb.append(", url: ");
                sb.append(webView2.getUrl());
                sb.append(",\n onReceivedError:, description: ");
                sb.append(str3);
                sb.append(", failingUrl: ");
                sb.append(str4);
                synchronized (C1415g.f6357d) {
                    C1415g.m5327e(C1415g.this);
                    C1415g.this.m5328f();
                    C1415g.m5323c(C1415g.this);
                }
                if (C1415g.this.f6367i != null) {
                    C1415g.this.f6367i.mo5349a(webView2.getUrl(), str3, C1415g.this.f6372n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    String unused = C1415g.f6357d;
                    new StringBuilder("onReceivedSslError IS_SP_CBT_CF:").append(C1404a.f6230q);
                    if (C1404a.f6230q && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    TextUtils.isEmpty(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (C1415g.f6357d) {
                    String unused = C1415g.f6357d;
                    C1415g c1415g = C1415g.this;
                    c1415g.f6362c = true;
                    c1415g.m5337j();
                    if (C1415g.this.f6375t) {
                        C1415g.this.m5332h();
                        C1415g.m5323c(C1415g.this);
                        return true;
                    }
                    C1415g.this.f6368j = str3;
                    if (C1415g.this.f6367i != null && C1415g.this.f6367i.mo5352b(str3)) {
                        C1415g.m5327e(C1415g.this);
                        C1415g.this.m5332h();
                        C1415g.m5323c(C1415g.this);
                        return true;
                    }
                    if (C1415g.this.f6371m) {
                        HashMap map = new HashMap();
                        if (C1415g.this.f6370l.getUrl() != null) {
                            map.put(HttpRequest.HEADER_REFERER, C1415g.this.f6370l.getUrl());
                        }
                        C1415g.this.f6370l.loadUrl(str3, map);
                    } else {
                        C1415g.this.f6370l.loadUrl(str3);
                    }
                    return true;
                }
            }
        });
        this.f6370l.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.a.g.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    try {
                        String unused = C1415g.f6357d;
                        new StringBuilder("LoadPage-State Complete:").append(webView2.getUrl());
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!C1415g.this.f6375t) {
                            C1415g c1415g = C1415g.this;
                            if (!c1415g.f6362c) {
                                C1415g.m5340m(c1415g);
                            }
                        }
                        if (C1415g.this.f6367i != null) {
                            a aVar = C1415g.this.f6367i;
                            webView2.getUrl();
                            aVar.mo5350a();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5318a(String str, String str2, Context context, String str3) {
        try {
            m5316a(context, str, str2);
            if (!TextUtils.isEmpty(this.f6369k)) {
                this.f6370l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f6364f = 2000;
                this.f6363e = 2000;
                this.f6370l.loadDataWithBaseURL(str3, this.f6369k, "*/*", "utf-8", str3);
                return;
            }
            if (!this.f6371m) {
                this.f6370l.loadUrl(str3);
                return;
            }
            HashMap map = new HashMap();
            if (this.f6370l.getUrl() != null) {
                map.put(HttpRequest.HEADER_REFERER, this.f6370l.getUrl());
            }
            this.f6370l.loadUrl(str3, map);
        } catch (Throwable th) {
            try {
                a aVar = this.f6367i;
                if (aVar != null) {
                    aVar.mo5349a(this.f6368j, th.getMessage(), this.f6372n);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5319a(final String str, final String str2, final String str3, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m5318a(str2, str3, context, this.f6368j);
        } else {
            this.f6365g.post(new Runnable() { // from class: com.anythink.expressad.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1415g c1415g = C1415g.this;
                    c1415g.m5318a(str2, str3, context, c1415g.f6368j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5320b() {
        synchronized (f6357d) {
            try {
                m5328f();
                a aVar = this.f6367i;
                if (aVar != null) {
                    aVar.mo5348a(this.f6368j, this.f6372n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5322c() {
        synchronized (f6357d) {
            try {
                m5328f();
                this.f6370l.destroy();
                a aVar = this.f6367i;
                if (aVar != null) {
                    aVar.mo5348a(this.f6368j, this.f6372n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5323c(C1415g c1415g) {
        synchronized (f6357d) {
            try {
                c1415g.m5328f();
                a aVar = c1415g.f6367i;
                if (aVar != null) {
                    aVar.mo5348a(c1415g.f6368j, c1415g.f6372n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m5325d() {
        m5332h();
        this.f6365g.postDelayed(this.f6377v, this.f6363e);
    }

    /* JADX INFO: renamed from: e */
    private void m5326e() {
        m5337j();
        this.f6365g.postDelayed(this.f6376u, this.f6364f);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m5327e(C1415g c1415g) {
        c1415g.f6375t = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m5328f() {
        m5337j();
        m5332h();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5329f(C1415g c1415g) {
        c1415g.m5332h();
        c1415g.f6365g.postDelayed(c1415g.f6377v, c1415g.f6363e);
    }

    /* JADX INFO: renamed from: g */
    private void m5330g() {
        this.f6365g.postDelayed(this.f6377v, this.f6363e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m5332h() {
        this.f6365g.removeCallbacks(this.f6377v);
    }

    /* JADX INFO: renamed from: i */
    private void m5334i() {
        this.f6365g.postDelayed(this.f6376u, this.f6364f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m5337j() {
        this.f6365g.removeCallbacks(this.f6376u);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m5340m(C1415g c1415g) {
        c1415g.m5337j();
        c1415g.f6365g.postDelayed(c1415g.f6376u, c1415g.f6364f);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m5341n(C1415g c1415g) {
        c1415g.f6374s = true;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5343p(C1415g c1415g) {
        synchronized (f6357d) {
            try {
                c1415g.m5328f();
                c1415g.f6370l.destroy();
                a aVar = c1415g.f6367i;
                if (aVar != null) {
                    aVar.mo5348a(c1415g.f6368j, c1415g.f6372n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5345a(String str, String str2, String str3, Context context, String str4, a aVar) {
        Objects.requireNonNull(aVar, "OverrideUrlLoadingListener can not be null");
        this.f6368j = str4;
        this.f6367i = aVar;
        m5319a(str, str2, str3, context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5346a(String str, String str2, String str3, Context context, String str4, String str5, a aVar) {
        Objects.requireNonNull(aVar, "OverrideUrlLoadingListener can not be null");
        this.f6369k = str5;
        this.f6368j = str4;
        this.f6367i = aVar;
        m5319a(str, str2, str3, context);
    }
}
