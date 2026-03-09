package com.anythink.core.basead.p045ui.p046a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anythink.core.api.IExHandler;
import com.anythink.core.basead.p045ui.web.C1133a;
import com.anythink.core.basead.p045ui.web.InterfaceC1134b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.anythink.core.basead.ui.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1123a {
    /* JADX INFO: renamed from: a */
    private static void m1764a() {
        CookieManager cookieManager = CookieManager.getInstance();
        if (C1178q.m2182a(C1175n.m2059a().m2148f()).m2189b()) {
            cookieManager.setAcceptCookie(true);
            CookieManager.setAcceptFileSchemeCookies(true);
            return;
        }
        cookieManager.setAcceptCookie(false);
        CookieManager.setAcceptFileSchemeCookies(false);
        if (Build.VERSION.SDK_INT < 21) {
            cookieManager.removeSessionCookie();
            cookieManager.removeAllCookie();
        } else {
            cookieManager.removeSessionCookies(null);
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1765a(Context context) {
        CookieSyncManager.createInstance(context);
        CookieSyncManager.getInstance().startSync();
    }

    /* JADX INFO: renamed from: a */
    public static void m1766a(Context context, final String str, final GeolocationPermissions.Callback callback) {
        try {
            IExHandler iExHandlerM2132b = C1175n.m2059a().m2132b();
            if (iExHandlerM2132b != null) {
                if (iExHandlerM2132b.onGeolocationPermissionsShowPrompt(str, callback)) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context, C1345i.m4154a(context, "system_dialog", C1875i.f11530e));
                builder.setMessage(context.getString(C1345i.m4154a(context, "location_ask_title", C1875i.f11532g))).setCancelable(true).setPositiveButton(context.getString(C1345i.m4154a(context, "location_allow", C1875i.f11532g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.a.a.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        GeolocationPermissions.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.invoke(str, true, false);
                        }
                    }
                }).setNegativeButton(context.getString(C1345i.m4154a(context, "location_deny", C1875i.f11532g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.a.a.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        GeolocationPermissions.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.invoke(str, false, false);
                        }
                    }
                });
                builder.create().show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1767a(WebView webView) {
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.core.basead.ui.a.a.1
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsBeforeUnload(WebView webView2, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                jsPromptResult.confirm();
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m1768a(WebView webView, Context context, InterfaceC1134b interfaceC1134b) {
        int i = Build.VERSION.SDK_INT;
        WebSettings settings = webView.getSettings();
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.requestFocus();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 21) {
            try {
                settings.setMixedContentMode(1);
            } catch (Throwable th) {
                th.printStackTrace();
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
        if (i >= 11) {
            try {
                Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.FALSE);
            } catch (Exception unused2) {
            }
        }
        settings.setDatabaseEnabled(true);
        String path = context.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        webView.setWebViewClient(new C1133a(interfaceC1134b));
    }

    /* JADX INFO: renamed from: a */
    public static void m1769a(WebView webView, boolean z) {
        if (z) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    /* JADX INFO: renamed from: b */
    private static void m1770b(WebView webView) {
        CookieManager cookieManager = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setAcceptThirdPartyCookies(webView, C1178q.m2182a(webView.getContext()).m2189b());
        }
    }
}
