package com.anythink.expressad.splash.p151c;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.splash.p153js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.p153js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.splash.c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1987e {

    /* JADX INFO: renamed from: a */
    private static final String f12599a = "WebViewRenderManager";

    /* JADX INFO: renamed from: b */
    private boolean f12600b;

    /* JADX INFO: renamed from: c */
    private boolean f12601c;

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.e$1 */
    public class AnonymousClass1 extends C1442b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f12602a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATSplashView f12603b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1781c f12604c;

        public AnonymousClass1(b bVar, ATSplashView aTSplashView, C1781c c1781c) {
            bVar = bVar;
            aTSplashView = aTSplashView;
            c1781c = c1781c;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            b bVar = bVar;
            if (bVar != null) {
                bVar.mo10607a();
            }
            C1987e.m10663a(C1987e.this);
            if (!c1781c.m8908s()) {
                aTSplashView.setH5Ready(true);
            }
            SplashJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            b bVar = bVar;
            if (bVar != null) {
                bVar.mo10609a(str);
            }
            C1987e.this.m10666a();
            aTSplashView.setH5Ready(false);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            b bVar = bVar;
            if (bVar != null) {
                bVar.mo10609a(sslError.toString());
            }
            C1987e.this.m10666a();
            aTSplashView.setH5Ready(false);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            b bVar = bVar;
            if (bVar != null) {
                bVar.mo10608a(i);
            }
            if (i == 1) {
                C1987e.this.f12600b = true;
                aTSplashView.setH5Ready(true);
            } else {
                C1987e.this.f12600b = false;
                aTSplashView.setH5Ready(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C1987e f12606a = new C1987e((byte) 0);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo10607a();

        /* JADX INFO: renamed from: a */
        void mo10608a(int i);

        /* JADX INFO: renamed from: a */
        void mo10609a(String str);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.e$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private String f12607a;

        /* JADX INFO: renamed from: b */
        private String f12608b;

        /* JADX INFO: renamed from: c */
        private C1781c f12609c;

        /* JADX INFO: renamed from: d */
        private String f12610d;

        /* JADX INFO: renamed from: e */
        private boolean f12611e;

        /* JADX INFO: renamed from: f */
        private int f12612f;

        /* JADX INFO: renamed from: g */
        private boolean f12613g;

        /* JADX INFO: renamed from: g */
        private boolean m10669g() {
            return this.f12613g;
        }

        /* JADX INFO: renamed from: a */
        public final String m10670a() {
            return this.f12610d;
        }

        /* JADX INFO: renamed from: a */
        public final void m10671a(int i) {
            this.f12612f = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m10672a(C1781c c1781c) {
            this.f12609c = c1781c;
        }

        /* JADX INFO: renamed from: a */
        public final void m10673a(String str) {
            this.f12610d = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m10674a(boolean z) {
            this.f12613g = z;
        }

        /* JADX INFO: renamed from: b */
        public final String m10675b() {
            return this.f12607a;
        }

        /* JADX INFO: renamed from: b */
        public final void m10676b(String str) {
            this.f12607a = str;
        }

        /* JADX INFO: renamed from: b */
        public final void m10677b(boolean z) {
            this.f12611e = z;
        }

        /* JADX INFO: renamed from: c */
        public final String m10678c() {
            return this.f12608b;
        }

        /* JADX INFO: renamed from: c */
        public final void m10679c(String str) {
            this.f12608b = str;
        }

        /* JADX INFO: renamed from: d */
        public final C1781c m10680d() {
            return this.f12609c;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m10681e() {
            return this.f12611e;
        }

        /* JADX INFO: renamed from: f */
        public final int m10682f() {
            return this.f12612f;
        }
    }

    private C1987e() {
        this.f12600b = false;
        this.f12601c = false;
    }

    public /* synthetic */ C1987e(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10663a(C1987e c1987e) {
        c1987e.f12601c = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static C1987e m10665b() {
        return a.f12606a;
    }

    /* JADX INFO: renamed from: a */
    public final void m10666a() {
        this.f12600b = false;
        this.f12601c = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m10667a(ATSplashView aTSplashView, c cVar, b bVar) {
        if (aTSplashView != null) {
            String strM10678c = cVar.m10678c();
            String strM10675b = cVar.m10675b();
            C1781c c1781cM10680d = cVar.m10680d();
            String strM10670a = cVar.m10670a();
            boolean zM10681e = cVar.m10681e();
            int iM10682f = cVar.m10682f();
            ATSplashWebview splashWebview = aTSplashView.getSplashWebview();
            if (splashWebview == null) {
                return;
            }
            SplashJSBridgeImpl splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), strM10675b, strM10678c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1781cM10680d);
            splashJSBridgeImpl.setCampaignList(arrayList);
            splashJSBridgeImpl.setAllowSkip(zM10681e ? 1 : 0);
            splashJSBridgeImpl.setCountdownS(iM10682f);
            aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
            String strM8832aa = TextUtils.isEmpty(c1781cM10680d.m8818Z()) ? c1781cM10680d.m8832aa() : c1781cM10680d.m8818Z();
            String requestId = splashWebview.getRequestId();
            StringBuilder sb = new StringBuilder("CampaignEx RequestId = ");
            sb.append(strM8832aa);
            sb.append(" WebView RequestId = ");
            sb.append(requestId);
            if (!TextUtils.isEmpty(requestId) && requestId.equals(strM8832aa) && (this.f12600b || this.f12601c)) {
                aTSplashView.setH5Ready(true);
                if (bVar != null) {
                    bVar.mo10608a(1);
                    return;
                }
                return;
            }
            m10666a();
            splashWebview.setRequestId(strM8832aa);
            System.currentTimeMillis();
            splashWebview.setWebViewListener(new C1442b() { // from class: com.anythink.expressad.splash.c.e.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ b f12602a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ATSplashView f12603b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C1781c f12604c;

                public AnonymousClass1(b bVar2, ATSplashView aTSplashView2, C1781c c1781cM10680d2) {
                    bVar = bVar2;
                    aTSplashView = aTSplashView2;
                    c1781c = c1781cM10680d2;
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo10607a();
                    }
                    C1987e.m10663a(C1987e.this);
                    if (!c1781c.m8908s()) {
                        aTSplashView.setH5Ready(true);
                    }
                    SplashJsUtils.fireOnJSBridgeConnected(webView);
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo10609a(str);
                    }
                    C1987e.this.m10666a();
                    aTSplashView.setH5Ready(false);
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo10609a(sslError.toString());
                    }
                    C1987e.this.m10666a();
                    aTSplashView.setH5Ready(false);
                }

                @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
                public final void readyState(WebView webView, int i) {
                    super.readyState(webView, i);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.mo10608a(i);
                    }
                    if (i == 1) {
                        C1987e.this.f12600b = true;
                        aTSplashView.setH5Ready(true);
                    } else {
                        C1987e.this.f12600b = false;
                        aTSplashView.setH5Ready(false);
                    }
                }
            });
            if (splashWebview.isDestroyed()) {
                aTSplashView2.setH5Ready(false);
            } else {
                splashWebview.loadUrl(strM10670a);
            }
        }
    }
}
