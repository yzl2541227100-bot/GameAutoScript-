package com.iflytek.voiceads.bridge;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class DSBridgeWebView extends WebView {

    /* JADX INFO: renamed from: c */
    private static boolean f16127c = false;

    /* JADX INFO: renamed from: a */
    Map<Integer, InterfaceC2914n> f16128a;

    /* JADX INFO: renamed from: b */
    public WebViewClient f16129b;

    /* JADX INFO: renamed from: d */
    private Map<String, Object> f16130d;

    /* JADX INFO: renamed from: e */
    private String f16131e;

    /* JADX INFO: renamed from: f */
    private int f16132f;

    /* JADX INFO: renamed from: g */
    private WebChromeClient f16133g;

    /* JADX INFO: renamed from: h */
    private InterfaceC2915o f16134h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f16135i;

    /* JADX INFO: renamed from: j */
    private InterfaceC2900c f16136j;

    /* JADX INFO: renamed from: k */
    private ArrayList<C2898a> f16137k;

    /* JADX INFO: renamed from: l */
    private C2899b f16138l;

    /* JADX INFO: renamed from: m */
    private Handler f16139m;

    /* JADX INFO: renamed from: n */
    private WebChromeClient f16140n;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.iflytek.voiceads.bridge.DSBridgeWebView$a */
    static class C2898a {

        /* JADX INFO: renamed from: a */
        private String f16141a;

        /* JADX INFO: renamed from: b */
        private int f16142b;

        /* JADX INFO: renamed from: c */
        private String f16143c;

        C2898a(String str, int i, Object[] objArr) {
            this.f16141a = new JSONArray((Collection) Arrays.asList(objArr == null ? new Object[0] : objArr)).toString();
            this.f16142b = i;
            this.f16143c = str;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("method", this.f16143c);
                jSONObject.put("callbackId", this.f16142b);
                jSONObject.put("data", this.f16141a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.iflytek.voiceads.bridge.DSBridgeWebView$b */
    class C2899b {
        private C2899b() {
        }

        /* synthetic */ C2899b(DSBridgeWebView dSBridgeWebView, C2903c c2903c) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private void m13270a(String str) {
            if (DSBridgeWebView.f16127c) {
                DSBridgeWebView.this.m13267a(String.format("alert('%s')", "DEBUG ERR MSG:\\n" + str.replaceAll("\\'", "\\\\'")));
            }
        }

        /* JADX INFO: renamed from: a */
        public String m13271a(String str, String str2) throws NoSuchMethodException {
            Method method;
            boolean z;
            String string;
            String[] strArrM13255b = DSBridgeWebView.this.m13255b(str.trim());
            String str3 = strArrM13255b[1];
            Object obj = DSBridgeWebView.this.f16130d.get(strArrM13255b[0]);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", -1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (obj == null) {
                m13270a("Js bridge  called, but can't find a corresponded JavascriptInterface object , please check your code!");
                return jSONObject.toString();
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                String string2 = jSONObject2.has("_dscbstub") ? jSONObject2.getString("_dscbstub") : null;
                Object obj2 = jSONObject2.has("data") ? jSONObject2.get("data") : null;
                Class<?> cls = obj.getClass();
                try {
                    method = cls.getMethod(str3, Object.class, InterfaceC2901a.class);
                    z = true;
                } catch (Exception e2) {
                    try {
                        method = cls.getMethod(str3, Object.class);
                        z = false;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        method = null;
                        z = false;
                    }
                }
                if (method == null) {
                    m13270a("Not find method \"" + str3 + "\" implementation! please check if the  signature or namespace of the method is right ");
                    return jSONObject.toString();
                }
                if (Build.VERSION.SDK_INT >= 17 && ((JavascriptInterface) method.getAnnotation(JavascriptInterface.class)) == null) {
                    m13270a("Method " + str3 + " is not invoked, since  it is not declared with JavascriptInterface annotation! ");
                    return jSONObject.toString();
                }
                method.setAccessible(true);
                try {
                    if (z) {
                        method.invoke(obj, obj2, new C2913m(this, string2));
                        string = jSONObject.toString();
                    } else {
                        Object objInvoke = method.invoke(obj, obj2);
                        jSONObject.put("code", 0);
                        jSONObject.put("data", objInvoke);
                        string = jSONObject.toString();
                    }
                    return string;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    m13270a(String.format("Call failed：The parameter of \"%s\" in Java is invalid.", str3));
                    return jSONObject.toString();
                }
            } catch (JSONException e5) {
                m13270a(String.format("The argument of \"%s\" must be a JSON object string!", str3));
                e5.printStackTrace();
                return jSONObject.toString();
            }
        }
    }

    /* JADX INFO: renamed from: com.iflytek.voiceads.bridge.DSBridgeWebView$c */
    public interface InterfaceC2900c {
    }

    public DSBridgeWebView(Context context) {
        super(context);
        this.f16130d = new HashMap();
        this.f16132f = 0;
        this.f16135i = true;
        this.f16136j = null;
        this.f16138l = new C2899b(this, null);
        this.f16139m = new Handler(Looper.getMainLooper());
        this.f16128a = new HashMap();
        this.f16140n = new C2908h(this);
        this.f16129b = new C2912l(this);
        m13251b();
    }

    public DSBridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16130d = new HashMap();
        this.f16132f = 0;
        this.f16135i = true;
        this.f16136j = null;
        this.f16138l = new C2899b(this, null);
        this.f16139m = new Handler(Looper.getMainLooper());
        this.f16128a = new HashMap();
        this.f16140n = new C2908h(this);
        this.f16129b = new C2912l(this);
        m13251b();
    }

    /* JADX INFO: renamed from: a */
    private void m13245a(C2898a c2898a) {
        m13267a(String.format("window._handleMessageFromNative(%s)", c2898a.toString()));
    }

    /* JADX INFO: renamed from: a */
    private void m13248a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f16139m.post(runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13251b() {
        this.f16131e = getContext().getFilesDir().getAbsolutePath() + "/webcache";
        WebSettings settings = getSettings();
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            settings.setMixedContentMode(0);
        }
        settings.setUserAgentString(settings.getUserAgentString() + " iflytek_webview");
        settings.setAllowFileAccess(false);
        settings.setAppCacheEnabled(false);
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCachePath(this.f16131e);
        settings.setUseWideViewPort(true);
        super.setWebChromeClient(this.f16140n);
        super.setWebViewClient(this.f16129b);
        m13257c();
        if (Build.VERSION.SDK_INT > 16) {
            super.addJavascriptInterface(this.f16138l, "_dsbridge");
        } else {
            settings.setUserAgentString(settings.getUserAgentString() + " _dsbridge");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String[] m13255b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = "";
        if (iLastIndexOf != -1) {
            strSubstring = str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        }
        return new String[]{strSubstring, str};
    }

    /* JADX INFO: renamed from: c */
    private void m13257c() {
        m13266a(new C2903c(this), "_dsb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m13259c(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            super.evaluateJavascript(str, null);
        } else {
            super.loadUrl("javascript:" + str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13264a(InterfaceC2915o interfaceC2915o) {
        this.f16134h = interfaceC2915o;
    }

    /* JADX INFO: renamed from: a */
    public void m13265a(File file) {
        if (!file.exists()) {
            C2989g.m13557b("IFLY_AD_SDK", "delete file no exists " + file.getAbsolutePath());
            return;
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m13265a(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: a */
    public void m13266a(Object obj, String str) {
        if (str == null) {
            str = "";
        }
        if (obj != null) {
            this.f16130d.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13267a(String str) {
        m13248a(new RunnableC2904d(this, str));
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T> void m13268a(String str, Object[] objArr, InterfaceC2914n<T> interfaceC2914n) {
        int i = this.f16132f + 1;
        this.f16132f = i;
        C2898a c2898a = new C2898a(str, i, objArr);
        if (interfaceC2914n != null) {
            this.f16128a.put(Integer.valueOf(c2898a.f16142b), interfaceC2914n);
        }
        if (this.f16137k != null) {
            this.f16137k.add(c2898a);
        } else {
            m13245a(c2898a);
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        super.clearCache(z);
        CookieManager.getInstance().removeAllCookie();
        Context context = getContext();
        try {
            context.deleteDatabase("webview.db");
            context.deleteDatabase("webviewCache.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File(this.f16131e);
        File file2 = new File(context.getCacheDir().getAbsolutePath() + "/webviewCache");
        if (file2.exists()) {
            m13265a(file2);
        }
        if (file.exists()) {
            m13265a(file);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        m13248a(new RunnableC2905e(this, str));
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        m13248a(new RunnableC2906f(this, str, map));
    }

    @Override // android.webkit.WebView
    public void reload() {
        m13248a(new RunnableC2907g(this));
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f16133g = webChromeClient;
    }
}
