package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.foundation.webview.BrowserView;

/* JADX INFO: loaded from: classes.dex */
public class DomainATCommonActivity extends Activity {

    /* JADX INFO: renamed from: b */
    private static final String f6425b = "ATCommonActivity";

    /* JADX INFO: renamed from: c */
    private C1781c f6427c;

    /* JADX INFO: renamed from: d */
    private BrowserView f6428d;

    /* JADX INFO: renamed from: a */
    public String f6426a = "";

    /* JADX INFO: renamed from: e */
    private BrowserView.InterfaceC1896a f6429e = new BrowserView.InterfaceC1896a() { // from class: com.anythink.expressad.activity.DomainATCommonActivity.1
        @Override // com.anythink.expressad.foundation.webview.BrowserView.InterfaceC1896a
        /* JADX INFO: renamed from: a */
        public final void mo5396a() {
            DomainATCommonActivity.this.finish();
        }

        @Override // com.anythink.expressad.foundation.webview.BrowserView.InterfaceC1896a
        /* JADX INFO: renamed from: a */
        public final boolean mo5397a(WebView webView, String str) {
            if (C1885s.a.m9813a(str) && C1885s.a.m9812a(DomainATCommonActivity.this, str, null)) {
                DomainATCommonActivity.this.finish();
            }
            return DomainATCommonActivity.this.m5394a(webView, str);
        }

        @Override // com.anythink.expressad.foundation.webview.BrowserView.InterfaceC1896a
        /* JADX INFO: renamed from: b */
        public final void mo5398b() {
        }
    };

    /* JADX INFO: renamed from: a */
    private void m5393a() {
        String stringExtra = getIntent().getStringExtra(C1781c.f10246am);
        this.f6426a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f6427c = (C1781c) getIntent().getSerializableExtra("mvcommon");
        BrowserView browserView = new BrowserView(this, this.f6427c);
        this.f6428d = browserView;
        browserView.setListener(this.f6429e);
        this.f6428d.loadUrl(this.f6426a);
        BrowserView browserView2 = this.f6428d;
        if (browserView2 != null) {
            setContentView(browserView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m5394a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        boolean z = true;
        if (!(uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getScheme().equals("intent")) {
            Intent uri2 = Intent.parseUri(str, 1);
            try {
                str2 = uri2.getPackage();
            } catch (Throwable th2) {
                th2.getMessage();
            }
            if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                uri2.addCategory("android.intent.category.BROWSABLE");
                uri2.setComponent(null);
                if (Build.VERSION.SDK_INT >= 15) {
                    uri2.setSelector(null);
                }
                uri2.setFlags(268435456);
                startActivityForResult(uri2, 0);
                finish();
                return true;
            }
            try {
                String stringExtra = uri2.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                        z = false;
                    }
                    if (z) {
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                th3.getMessage();
            }
            th.getMessage();
            return false;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (C1773a.m8548c().m8557e() == null) {
            C1773a.m8548c().m8550a(getApplicationContext());
        }
        String stringExtra = getIntent().getStringExtra(C1781c.f10246am);
        this.f6426a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f6427c = (C1781c) getIntent().getSerializableExtra("mvcommon");
        BrowserView browserView = new BrowserView(this, this.f6427c);
        this.f6428d = browserView;
        browserView.setListener(this.f6429e);
        this.f6428d.loadUrl(this.f6426a);
        BrowserView browserView2 = this.f6428d;
        if (browserView2 != null) {
            setContentView(browserView2);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BrowserView browserView = this.f6428d;
        if (browserView != null) {
            browserView.destroy();
        }
    }
}
