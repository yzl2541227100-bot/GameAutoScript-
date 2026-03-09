package com.anythink.basead.mraid;

import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.basead.p010a.p012b.C0724c;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.res.C1380d;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.mbbanner.p139a.p140a.C1900a;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.basead.mraid.d */
/* JADX INFO: loaded from: classes.dex */
public class C0801d {

    /* JADX INFO: renamed from: a */
    public static String f1093a = "d";

    /* JADX INFO: renamed from: com.anythink.basead.mraid.d$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC1247l f1095b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1096c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f1097d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ a f1098e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ MraidWebView f1099f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f1100g;

        /* JADX INFO: renamed from: com.anythink.basead.mraid.d$1$1 */
        public class C46521 extends C1442b {

            /* JADX INFO: renamed from: a */
            public boolean f1101a = false;

            public C46521() {
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onPageFinished(WebView webView, String str) {
                if (this.f1101a) {
                    return;
                }
                this.f1101a = true;
                if (C1380d.f5563a.equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(", about:blank");
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo190a(C0748f.m310a(C0748f.f733o, C0748f.f711J));
                        return;
                    }
                    return;
                }
                C1900a.m9893a(webView);
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                MraidWebView mraidWebView = mraidWebView;
                if (mraidWebView != null) {
                    C0724c.m195a(str, mraidWebView);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", load success");
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo189a();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                if (this.f1101a) {
                    return;
                }
                this.f1101a = true;
                super.onReceivedError(webView, i, str, str2);
                C0747e c0747eM310a = C0748f.m310a("10000", i + "_" + str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", load failed: ");
                sb.append(c0747eM310a.m309c());
                a aVar = aVar;
                if (aVar != null) {
                    aVar.mo190a(c0747eM310a);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (this.f1101a) {
                    return;
                }
                this.f1101a = true;
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                C0747e c0747eM310a = C0748f.m310a("10000", sslError != null ? sslError.toString() : "onReceivedSslError");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", load failed: ");
                sb.append(c0747eM310a.m309c());
                a aVar = aVar;
                if (aVar != null) {
                    aVar.mo190a(c0747eM310a);
                }
            }
        }

        public AnonymousClass1(AbstractC1247l abstractC1247l, int i, String str, a aVar, MraidWebView mraidWebView, String str2) {
            abstractC1247l = abstractC1247l;
            i = i;
            str = str;
            aVar = aVar;
            mraidWebView = mraidWebView;
            str = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1322e.m3930b(c1248m, abstractC1247l, i);
            String str = C0801d.f1093a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", start load mraid webview");
            C0798a c0798a = new C0798a();
            C0802e c0802e = new C0802e(str);
            c0802e.m5625a(new C1442b() { // from class: com.anythink.basead.mraid.d.1.1

                /* JADX INFO: renamed from: a */
                public boolean f1101a = false;

                public C46521() {
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onPageFinished(WebView webView, String str2) {
                    if (this.f1101a) {
                        return;
                    }
                    this.f1101a = true;
                    if (C1380d.f5563a.equals(str2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(", about:blank");
                        a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo190a(C0748f.m310a(C0748f.f733o, C0748f.f711J));
                            return;
                        }
                        return;
                    }
                    C1900a.m9893a(webView);
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    MraidWebView mraidWebView = mraidWebView;
                    if (mraidWebView != null) {
                        C0724c.m195a(str, mraidWebView);
                    }
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append(str);
                    sb22.append(", load success");
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo189a();
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onReceivedError(WebView webView, int i, String str2, String str22) {
                    if (this.f1101a) {
                        return;
                    }
                    this.f1101a = true;
                    super.onReceivedError(webView, i, str2, str22);
                    C0747e c0747eM310a = C0748f.m310a("10000", i + "_" + str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", load failed: ");
                    sb2.append(c0747eM310a.m309c());
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo190a(c0747eM310a);
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (this.f1101a) {
                        return;
                    }
                    this.f1101a = true;
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    C0747e c0747eM310a = C0748f.m310a("10000", sslError != null ? sslError.toString() : "onReceivedSslError");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", load failed: ");
                    sb2.append(c0747eM310a.m309c());
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo190a(c0747eM310a);
                    }
                }
            });
            mraidWebView.setWebViewClient(c0802e);
            mraidWebView.setObject(c0798a);
            mraidWebView.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.mraid.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo189a();

        /* JADX INFO: renamed from: a */
        void mo190a(C0747e c0747e);
    }

    /* JADX INFO: renamed from: a */
    public static String m662a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        if (!TextUtils.isEmpty(abstractC1247l.m3214m())) {
            return abstractC1247l.m3214m();
        }
        if (TextUtils.isEmpty(abstractC1247l.m3211l())) {
            return "";
        }
        File fileM4529b = C1380d.m4520a(C1175n.m2059a().m2148f()).m4529b(c1248m, abstractC1247l);
        if (fileM4529b == null) {
            Log.e(f1093a, "loadMraidResource: html no exists: ");
            return C1380d.m4520a(C1175n.m2059a().m2148f()).m4525a(abstractC1247l.m3211l(), c1248m, abstractC1247l);
        }
        Log.e(f1093a, "loadMraidResource: html exists: " + fileM4529b.toURI().toString());
        return fileM4529b.toURI().toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m663a(String str, String str2, MraidWebView mraidWebView, a aVar, AbstractC1247l abstractC1247l, C1248m c1248m, int i) {
        if (mraidWebView == null) {
            return;
        }
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.mraid.d.1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1247l f1095b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f1096c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f1097d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ a f1098e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ MraidWebView f1099f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ String f1100g;

            /* JADX INFO: renamed from: com.anythink.basead.mraid.d$1$1 */
            public class C46521 extends C1442b {

                /* JADX INFO: renamed from: a */
                public boolean f1101a = false;

                public C46521() {
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onPageFinished(WebView webView, String str2) {
                    if (this.f1101a) {
                        return;
                    }
                    this.f1101a = true;
                    if (C1380d.f5563a.equals(str2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(", about:blank");
                        a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo190a(C0748f.m310a(C0748f.f733o, C0748f.f711J));
                            return;
                        }
                        return;
                    }
                    C1900a.m9893a(webView);
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    MraidWebView mraidWebView = mraidWebView;
                    if (mraidWebView != null) {
                        C0724c.m195a(str, mraidWebView);
                    }
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append(str);
                    sb22.append(", load success");
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo189a();
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onReceivedError(WebView webView, int i, String str2, String str22) {
                    if (this.f1101a) {
                        return;
                    }
                    this.f1101a = true;
                    super.onReceivedError(webView, i, str2, str22);
                    C0747e c0747eM310a = C0748f.m310a("10000", i + "_" + str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", load failed: ");
                    sb2.append(c0747eM310a.m309c());
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo190a(c0747eM310a);
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (this.f1101a) {
                        return;
                    }
                    this.f1101a = true;
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    C0747e c0747eM310a = C0748f.m310a("10000", sslError != null ? sslError.toString() : "onReceivedSslError");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", load failed: ");
                    sb2.append(c0747eM310a.m309c());
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo190a(c0747eM310a);
                    }
                }
            }

            public AnonymousClass1(AbstractC1247l abstractC1247l2, int i2, String str22, a aVar2, MraidWebView mraidWebView2, String str3) {
                abstractC1247l = abstractC1247l2;
                i = i2;
                str = str22;
                aVar = aVar2;
                mraidWebView = mraidWebView2;
                str = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1322e.m3930b(c1248m, abstractC1247l, i);
                String str3 = C0801d.f1093a;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", start load mraid webview");
                C0798a c0798a = new C0798a();
                C0802e c0802e = new C0802e(str);
                c0802e.m5625a(new C1442b() { // from class: com.anythink.basead.mraid.d.1.1

                    /* JADX INFO: renamed from: a */
                    public boolean f1101a = false;

                    public C46521() {
                    }

                    @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                    public final void onPageFinished(WebView webView, String str22) {
                        if (this.f1101a) {
                            return;
                        }
                        this.f1101a = true;
                        if (C1380d.f5563a.equals(str22)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(", about:blank");
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.mo190a(C0748f.m310a(C0748f.f733o, C0748f.f711J));
                                return;
                            }
                            return;
                        }
                        C1900a.m9893a(webView);
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        MraidWebView mraidWebView2 = mraidWebView;
                        if (mraidWebView2 != null) {
                            C0724c.m195a(str, mraidWebView2);
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(str);
                        sb22.append(", load success");
                        a aVar22 = aVar;
                        if (aVar22 != null) {
                            aVar22.mo189a();
                        }
                    }

                    @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                    public final void onReceivedError(WebView webView, int i2, String str22, String str222) {
                        if (this.f1101a) {
                            return;
                        }
                        this.f1101a = true;
                        super.onReceivedError(webView, i2, str22, str222);
                        C0747e c0747eM310a = C0748f.m310a("10000", i2 + "_" + str22);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(", load failed: ");
                        sb2.append(c0747eM310a.m309c());
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.mo190a(c0747eM310a);
                        }
                    }

                    @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (this.f1101a) {
                            return;
                        }
                        this.f1101a = true;
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                        C0747e c0747eM310a = C0748f.m310a("10000", sslError != null ? sslError.toString() : "onReceivedSslError");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(", load failed: ");
                        sb2.append(c0747eM310a.m309c());
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.mo190a(c0747eM310a);
                        }
                    }
                });
                mraidWebView.setWebViewClient(c0802e);
                mraidWebView.setObject(c0798a);
                mraidWebView.loadUrl(str);
            }
        });
    }
}
