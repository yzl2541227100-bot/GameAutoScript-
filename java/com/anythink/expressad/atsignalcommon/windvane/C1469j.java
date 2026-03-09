package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.base.C1453e;
import com.didi.virtualapk.core.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1469j implements InterfaceC1461b {

    /* JADX INFO: renamed from: a */
    private static C1469j f6783a = new C1469j();

    private C1469j() {
    }

    /* JADX INFO: renamed from: a */
    public static C1469j m5701a() {
        return f6783a;
    }

    /* JADX INFO: renamed from: a */
    public static void m5702a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", BuildConfig.VERSION_NAME);
            m5703a(webView, C1453e.f6687j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
            m5703a(webView, C1453e.f6687j, "");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5703a(WebView webView, String str, String str2) {
        String str3 = TextUtils.isEmpty(str2) ? String.format("javascript:window.WindVane.fireEvent('%s', '');", str) : String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, C1473n.m5710c(str2));
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestroyed()) {
                return;
            }
            try {
                webView.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5704b(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", BuildConfig.VERSION_NAME);
            m5703a(webView, "onJSBridgeConnected", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            m5703a(webView, "onJSBridgeConnected", "");
        } catch (Throwable unused2) {
            m5703a(webView, "onJSBridgeConnected", "");
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1461b
    /* JADX INFO: renamed from: a */
    public final void mo5673a(Object obj, String str) {
        if (obj instanceof C1460a) {
            C1460a c1460a = (C1460a) obj;
            String str2 = TextUtils.isEmpty(str) ? String.format("javascript:window.WindVane.onSuccess(%s,'');", c1460a.f6763g) : String.format("javascript:window.WindVane.onSuccess(%s,'%s');", c1460a.f6763g, C1473n.m5710c(str));
            WindVaneWebView windVaneWebView = c1460a.f6757a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                c1460a.f6757a.loadUrl(str2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1461b
    /* JADX INFO: renamed from: a */
    public final void mo5674a(Object obj, String str, String str2) {
        if (obj instanceof C1460a) {
            C1460a c1460a = (C1460a) obj;
            String str3 = TextUtils.isEmpty(str2) ? String.format("javascript:window.WindVane.fireEvent('%s', '');", str) : String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, C1473n.m5710c(str2));
            WindVaneWebView windVaneWebView = c1460a.f6757a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                c1460a.f6757a.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1461b
    /* JADX INFO: renamed from: b */
    public final void mo5675b(Object obj, String str) {
        if (obj instanceof C1460a) {
            C1460a c1460a = (C1460a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", c1460a.f6763g);
            } else {
                str = C1473n.m5710c(str);
            }
            String str2 = String.format("javascript:window.WindVane.onFailure(%s,'%s');", c1460a.f6763g, str);
            WindVaneWebView windVaneWebView = c1460a.f6757a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                c1460a.f6757a.loadUrl(str2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
