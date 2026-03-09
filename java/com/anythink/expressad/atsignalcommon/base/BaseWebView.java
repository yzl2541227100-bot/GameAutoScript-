package com.anythink.expressad.atsignalcommon.base;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1340d;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BaseWebView extends WebView {

    /* JADX INFO: renamed from: a */
    private View.OnTouchListener f6671a;

    /* JADX INFO: renamed from: b */
    private View.OnTouchListener f6672b;

    /* JADX INFO: renamed from: e */
    public Context f6673e;
    public long lastTouchTime;
    public C1450b mWebViewClient;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.base.BaseWebView$1 */
    public class ViewOnTouchListenerC14481 implements View.OnTouchListener {
        public ViewOnTouchListenerC14481() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                BaseWebView.this.lastTouchTime = System.currentTimeMillis();
            }
            if (BaseWebView.this.f6672b != null) {
                return BaseWebView.this.f6672b.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f6671a = new View.OnTouchListener() { // from class: com.anythink.expressad.atsignalcommon.base.BaseWebView.1
            public ViewOnTouchListenerC14481() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f6672b != null) {
                    return BaseWebView.this.f6672b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f6673e = context;
        mo5622a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f6671a = new View.OnTouchListener() { // from class: com.anythink.expressad.atsignalcommon.base.BaseWebView.1
            public ViewOnTouchListenerC14481() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f6672b != null) {
                    return BaseWebView.this.f6672b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f6673e = context;
        mo5622a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastTouchTime = 0L;
        this.f6671a = new View.OnTouchListener() { // from class: com.anythink.expressad.atsignalcommon.base.BaseWebView.1
            public ViewOnTouchListenerC14481() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f6672b != null) {
                    return BaseWebView.this.f6672b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f6673e = context;
        mo5622a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0010  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String mo648a(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L33
            java.lang.String r0 = "../"
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == 0) goto L12
        L10:
            r1 = 1
            goto L33
        L12:
            java.lang.String r0 = "file"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L33
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.lang.String r0 = r0.getPath()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L10
            java.lang.String r3 = com.anythink.expressad.foundation.p138h.C1884r.m9786a()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L33
            goto L10
        L33:
            if (r1 == 0) goto L46
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "illegal URL: "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "anythink_express"
            android.util.Log.e(r0, r5)
            java.lang.String r5 = "about:blank"
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.atsignalcommon.base.BaseWebView.mo648a(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public void mo5622a() {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        if (this.mWebViewClient == null) {
            C1450b c1450b = new C1450b();
            this.mWebViewClient = c1450b;
            setWebViewClient(c1450b);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
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
                th.printStackTrace();
            }
        }
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            try {
                settings.setAllowUniversalAccessFromFileURLs(false);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (i >= 21) {
            try {
                settings.setMixedContentMode(1);
            } catch (Exception e) {
                e.printStackTrace();
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
        String path = this.f6673e.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Exception unused2) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(C1340d.m4030b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused3) {
        }
        super.setOnTouchListener(this.f6671a);
    }

    public C1450b getBaseWebViewClient() {
        return this.mWebViewClient;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super.loadDataWithBaseURL(mo648a(str), str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(mo648a(str));
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(mo648a(str), map);
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(InterfaceC1449a interfaceC1449a) {
        C1450b c1450b = this.mWebViewClient;
        if (c1450b != null) {
            c1450b.m5624a(interfaceC1449a);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6672b = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C1450b) {
            this.mWebViewClient = (C1450b) webViewClient;
        }
    }
}
