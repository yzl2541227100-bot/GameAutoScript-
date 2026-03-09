package cn.haorui.sdk.core.webview;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: cn.haorui.sdk.core.webview.c */
/* JADX INFO: loaded from: classes.dex */
public class C0596c extends WebViewClient {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f350b = 0;

    /* JADX INFO: renamed from: a */
    public Context f351a;

    public C0596c(Context context) {
        this.f351a = context;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("http")) {
            return false;
        }
        try {
            Intent uri = Intent.parseUri(str, 0);
            if (uri.resolveActivity(this.f351a.getPackageManager()) == null) {
                return true;
            }
            uri.setFlags(268435456);
            this.f351a.startActivity(uri);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
