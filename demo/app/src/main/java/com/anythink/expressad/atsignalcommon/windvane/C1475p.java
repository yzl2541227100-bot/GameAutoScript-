package com.anythink.expressad.atsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1475p extends C1450b {

    /* JADX INFO: renamed from: a */
    public static final String f6802a = "WindVaneWebViewClient";

    /* JADX INFO: renamed from: c */
    public static final int f6803c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f6804d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f6805e = "mmusdk_cache";

    /* JADX INFO: renamed from: f */
    public static final String f6806f = "1";

    /* JADX INFO: renamed from: g */
    public static boolean f6807g = true;

    /* JADX INFO: renamed from: b */
    public String f6808b;

    /* JADX INFO: renamed from: h */
    private int f6809h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1464e f6810i;

    public C1475p() {
        this.f6808b = null;
        this.f6809h = 0;
    }

    private C1475p(int i) {
        this.f6808b = null;
        this.f6809h = 0;
        this.f6809h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.webkit.WebResourceResponse m5715a(java.lang.String r5) {
        /*
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5d
            boolean r1 = com.anythink.expressad.atsignalcommon.windvane.C1473n.m5711d(r5)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5d
            com.anythink.expressad.foundation.b.a r1 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Throwable -> L5d
            android.content.Context r1 = r1.m8557e()     // Catch: java.lang.Throwable -> L5d
            com.anythink.expressad.foundation.g.d.b r1 = com.anythink.expressad.foundation.p120g.p124d.C1818b.m9427a(r1)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = com.anythink.expressad.foundation.p138h.C1886t.m9829a(r5)     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L44
            java.lang.String r2 = com.anythink.expressad.foundation.p138h.C1885s.m9804a(r5)     // Catch: java.lang.Throwable -> L5d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            android.graphics.Bitmap r4 = r1.m9441a(r5)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L33
            android.graphics.Bitmap r1 = r1.m9441a(r5)     // Catch: java.lang.Throwable -> L5d
            goto L45
        L33:
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L44
            android.graphics.Bitmap r2 = com.anythink.expressad.foundation.p120g.p124d.C1817a.m9423a(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L44
            r1.m9442a(r5, r2)     // Catch: java.lang.Throwable -> L5d
            r1 = r2
            goto L45
        L44:
            r1 = r0
        L45:
            if (r1 == 0) goto L5d
            boolean r2 = r1.isRecycled()     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L5d
            android.webkit.WebResourceResponse r2 = new android.webkit.WebResourceResponse     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = com.anythink.expressad.atsignalcommon.windvane.C1473n.m5712e(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "utf-8"
            java.io.InputStream r1 = com.anythink.expressad.foundation.p120g.p124d.C1817a.m9425a(r1)     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r5, r3, r1)     // Catch: java.lang.Throwable -> L5d
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.atsignalcommon.windvane.C1475p.m5715a(java.lang.String):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: renamed from: a */
    private static String m5716a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private void m5717b(InterfaceC1464e interfaceC1464e) {
        this.f6810i = interfaceC1464e;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f6808b = str;
        InterfaceC1464e interfaceC1464e = this.f6810i;
        if (interfaceC1464e != null) {
            interfaceC1464e.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseM5715a = m5715a(str);
        return webResourceResponseM5715a != null ? webResourceResponseM5715a : super.shouldInterceptRequest(webView, str);
    }
}
