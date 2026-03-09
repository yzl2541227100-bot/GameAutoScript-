package com.anythink.expressad.video.p154bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.expressad.atsignalcommon.base.C1451c;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.p081a.C1441a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkBTWebView extends BTBaseView implements IMraidJSBridge {

    /* JADX INFO: renamed from: s */
    private static final String f13070s = "portrait";

    /* JADX INFO: renamed from: t */
    private static final String f13071t = "landscape";

    /* JADX INFO: renamed from: A */
    private C2202j f13072A;

    /* JADX INFO: renamed from: B */
    private WebView f13073B;

    /* JADX INFO: renamed from: p */
    private String f13074p;

    /* JADX INFO: renamed from: q */
    private String f13075q;

    /* JADX INFO: renamed from: r */
    private String f13076r;

    /* JADX INFO: renamed from: u */
    private boolean f13077u;

    /* JADX INFO: renamed from: v */
    private ImageView f13078v;

    /* JADX INFO: renamed from: w */
    private boolean f13079w;

    /* JADX INFO: renamed from: x */
    private C2340d f13080x;

    /* JADX INFO: renamed from: y */
    private List<C1781c> f13081y;

    /* JADX INFO: renamed from: z */
    private WindVaneWebView f13082z;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTWebView$1 */
    public class C20541 extends C1441a {
        public C20541() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
        /* JADX INFO: renamed from: a */
        public final void mo5575a(Object obj) {
            super.mo5575a(obj);
            try {
                String strMo11574i = AnythinkBTWebView.this.f13072A != null ? AnythinkBTWebView.this.f13072A.mo11574i() : "";
                C1469j.m5701a().mo5673a(obj, TextUtils.isEmpty(strMo11574i) ? "" : Base64.encodeToString(strMo11574i.getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (AnythinkBTWebView.this.f13073B != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                    jSONObject.put("code", BTBaseView.f13087n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", AnythinkBTWebView.this.f13093d);
                    jSONObject2.put(C1796r.f10844ah, 1);
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C2024c.m10829a();
                    C2024c.m10831a(AnythinkBTWebView.this.f13073B, e.getMessage());
                    e.getMessage();
                }
            }
            C1469j.m5701a();
            C1469j.m5702a(AnythinkBTWebView.this.f13082z);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (AnythinkBTWebView.this.f13073B != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                    jSONObject.put("code", BTBaseView.f13087n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", AnythinkBTWebView.this.f13093d);
                    jSONObject2.put(C1796r.f10844ah, 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C2024c.m10829a();
                    C2024c.m10831a(AnythinkBTWebView.this.f13073B, e.getMessage());
                    e.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (AnythinkBTWebView.this.f13073B != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                    jSONObject.put("code", BTBaseView.f13087n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", AnythinkBTWebView.this.f13093d);
                    jSONObject2.put(C1796r.f10844ah, 2);
                    jSONObject2.put("error", sslError.toString());
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C2024c.m10829a();
                    C2024c.m10831a(AnythinkBTWebView.this.f13073B, e.getMessage());
                    e.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTWebView$2 */
    public class ViewOnClickListenerC20552 implements View.OnClickListener {
        public ViewOnClickListenerC20552() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (AnythinkBTWebView.this.f13073B != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f13087n);
                    jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    C2024c.m10829a();
                    C2024c.m10832a(AnythinkBTWebView.this.f13073B, "onClicked", AnythinkBTWebView.this.f13093d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTWebView$3 */
    public class ViewOnClickListenerC20563 implements View.OnClickListener {
        public ViewOnClickListenerC20563() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkBTWebView.this.close();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTWebView$4 */
    public class RunnableC20574 implements Runnable {
        public RunnableC20574() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (AnythinkBTWebView.this.f13082z != null) {
                    AnythinkBTWebView.this.f13082z.clearWebView();
                    AnythinkBTWebView.this.f13082z.release();
                }
                AnythinkBTWebView.this.f13074p = null;
                AnythinkBTWebView.this.f13075q = null;
                AnythinkBTWebView.this.f13076r = null;
                if (AnythinkBTWebView.this.f13073B != null) {
                    AnythinkBTWebView.this.f13073B = null;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public AnythinkBTWebView(Context context) {
        super(context);
        this.f13077u = false;
        this.f13079w = false;
    }

    public AnythinkBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13077u = false;
        this.f13079w = false;
    }

    /* JADX INFO: renamed from: a */
    private void m11036a(C1451c c1451c) {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(c1451c);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11039b() {
        try {
            getMraidCampaign();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f13082z != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f13087n);
                jSONObject2.put("id", this.f13093d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f13082z, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C2024c.m10829a();
                C2024c.m10832a((WebView) this.f13082z, "broadcast", this.f13093d);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        WebView webView = this.f13073B;
        if (webView != null) {
            BTBaseView.m11042a(webView, "onPlayerCloseBtnClicked", this.f13093d);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z) {
    }

    public List<C1781c> getCampaigns() {
        return this.f13081y;
    }

    public String getFilePath() {
        return this.f13075q;
    }

    public String getFileURL() {
        return this.f13074p;
    }

    public String getHtml() {
        return this.f13076r;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public C1781c getMraidCampaign() {
        return this.f13091b;
    }

    public C2340d getRewardUnitSetting() {
        return this.f13080x;
    }

    public WindVaneWebView getWebView() {
        return this.f13082z;
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f13082z = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f13082z.setVisibility(0);
        C2202j c2202j = new C2202j(null, this.f13091b, this.f13081y);
        this.f13072A = c2202j;
        c2202j.mo11556a(this.f13092c);
        this.f13082z.setObject(this.f13072A);
        this.f13082z.setMraidObject(this);
        this.f13082z.setWebViewListener(new C1441a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.1
            public C20541() {
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
            /* JADX INFO: renamed from: a */
            public final void mo5575a(Object obj) {
                super.mo5575a(obj);
                try {
                    String strMo11574i = AnythinkBTWebView.this.f13072A != null ? AnythinkBTWebView.this.f13072A.mo11574i() : "";
                    C1469j.m5701a().mo5673a(obj, TextUtils.isEmpty(strMo11574i) ? "" : Base64.encodeToString(strMo11574i.getBytes(), 2));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (AnythinkBTWebView.this.f13073B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                        jSONObject.put("code", BTBaseView.f13087n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f13093d);
                        jSONObject2.put(C1796r.f10844ah, 1);
                        jSONObject.put("data", jSONObject2);
                        C1469j.m5701a();
                        C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C2024c.m10829a();
                        C2024c.m10831a(AnythinkBTWebView.this.f13073B, e.getMessage());
                        e.getMessage();
                    }
                }
                C1469j.m5701a();
                C1469j.m5702a(AnythinkBTWebView.this.f13082z);
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (AnythinkBTWebView.this.f13073B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                        jSONObject.put("code", BTBaseView.f13087n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f13093d);
                        jSONObject2.put(C1796r.f10844ah, 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        C1469j.m5701a();
                        C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C2024c.m10829a();
                        C2024c.m10831a(AnythinkBTWebView.this.f13073B, e.getMessage());
                        e.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                if (AnythinkBTWebView.this.f13073B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                        jSONObject.put("code", BTBaseView.f13087n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", AnythinkBTWebView.this.f13093d);
                        jSONObject2.put(C1796r.f10844ah, 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        C1469j.m5701a();
                        C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C2024c.m10829a();
                        C2024c.m10831a(AnythinkBTWebView.this.f13073B, e.getMessage());
                        e.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void readyState(WebView webView, int i) {
                super.readyState(webView, i);
            }
        });
        addView(this.f13082z, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.2
            public ViewOnClickListenerC20552() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (AnythinkBTWebView.this.f13073B != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f13087n);
                        jSONObject.put("id", AnythinkBTWebView.this.f13093d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        C1469j.m5701a();
                        C1469j.m5703a(AnythinkBTWebView.this.f13073B, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        C2024c.m10829a();
                        C2024c.m10832a(AnythinkBTWebView.this.f13073B, "onClicked", AnythinkBTWebView.this.f13093d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f13078v = imageView;
            imageView.setImageResource(findDrawable("anythink_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f13078v.setLayoutParams(layoutParams);
            this.f13078v.setVisibility(this.f13077u ? 4 : 8);
            C1781c c1781c = this.f13091b;
            if (c1781c != null && c1781c.m8800H()) {
                this.f13078v.setVisibility(4);
            }
            this.f13078v.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.3
                public ViewOnClickListenerC20563() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTWebView.this.close();
                }
            });
            addView(this.f13078v);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView != null) {
            BTBaseView.m11042a(windVaneWebView, str, this.f13093d);
        }
    }

    public void onBackPressed() {
        if (this.f13082z != null) {
            C2024c.m10829a();
            C2024c.m10832a((WebView) this.f13082z, "onSystemBackPressed", this.f13093d);
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f13082z != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("orientation", configuration.orientation == 2 ? f13071t : f13070s);
                jSONObject.put("instanceId", this.f13093d);
                String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f13082z, "orientation", strEncodeToString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void onDestory() {
        if (this.f13079w) {
            return;
        }
        this.f13079w = true;
        try {
            if (this.f13082z != null) {
                C2024c.m10829a();
                C2024c.m10832a((WebView) this.f13082z, "onSystemDestory", this.f13093d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTWebView.4
                public RunnableC20574() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (AnythinkBTWebView.this.f13082z != null) {
                            AnythinkBTWebView.this.f13082z.clearWebView();
                            AnythinkBTWebView.this.f13082z.release();
                        }
                        AnythinkBTWebView.this.f13074p = null;
                        AnythinkBTWebView.this.f13075q = null;
                        AnythinkBTWebView.this.f13076r = null;
                        if (AnythinkBTWebView.this.f13073B != null) {
                            AnythinkBTWebView.this.f13073B = null;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        try {
            String strM8835ad = this.f13091b.m8835ad();
            if (!TextUtils.isEmpty(str)) {
                this.f13091b.m8902p(str);
                try {
                    getMraidCampaign();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            new C1405a(getContext(), this.f13092c);
            this.f13091b.m8902p(strM8835ad);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f13074p)) {
            this.f13082z.loadUrl(this.f13074p);
        } else if (!TextUtils.isEmpty(this.f13075q)) {
            this.f13082z.loadUrl(this.f13075q);
        } else {
            if (TextUtils.isEmpty(this.f13076r)) {
                return;
            }
            this.f13082z.loadDataWithBaseURL("", this.f13076r, "text/html", "UTF-8", null);
        }
    }

    public void setCampaigns(List<C1781c> list) {
        this.f13081y = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f13073B = webView;
    }

    public void setFilePath(String str) {
        this.f13075q = str;
    }

    public void setFileURL(String str) {
        this.f13074p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains("play.google.com");
        setWebviewClickable(!zContains);
        if (zContains) {
            C1451c c1451c = new C1451c();
            WindVaneWebView windVaneWebView = this.f13082z;
            if (windVaneWebView != null) {
                windVaneWebView.setFilter(c1451c);
            }
        }
    }

    public void setHtml(String str) {
        this.f13076r = str;
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void setRewardUnitSetting(C2340d c2340d) {
        this.f13080x = c2340d;
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z) {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
        try {
            this.f13078v.setVisibility(z ? 4 : 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.f13082z.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.f13082z.goForward();
        return true;
    }

    public void webviewLoad(int i) {
        if (this.f13072A == null) {
            this.f13072A = new C2202j(null, this.f13091b, this.f13081y);
        }
        C1781c c1781c = this.f13091b;
        if (c1781c != null) {
            this.f13072A.m11611a(c1781c);
        } else {
            List<C1781c> list = this.f13081y;
            if (list != null && list.size() > 0) {
                this.f13072A.m11612a(this.f13081y);
                if (this.f13081y.size() == 1) {
                    this.f13072A.m11611a(this.f13081y.get(0));
                }
            }
        }
        C2340d c2340d = this.f13080x;
        if (c2340d != null) {
            this.f13072A.mo11555a(c2340d);
        }
        this.f13072A.mo11556a(this.f13092c);
        this.f13072A.m11614c(this.f13093d);
        if (i == 1) {
            this.f13072A.m11618q();
        }
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.f13072A);
        }
        C1781c c1781c2 = this.f13091b;
        if (c1781c2 != null && c1781c2.m8800H()) {
            this.f13078v.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f13082z;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }
}
