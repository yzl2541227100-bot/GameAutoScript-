package com.anythink.expressad.advanced.p078c;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import cn.haorui.sdk.adsail_ad.view.scaleImage.ImageSource;
import com.anythink.expressad.advanced.p076a.C1420a;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1428c {

    /* JADX INFO: renamed from: a */
    private static String f6535a = "ResManager";

    /* JADX INFO: renamed from: b */
    private static int f6536b = 1;

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.c$1 */
    public class AnonymousClass1 extends C1442b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATNativeAdvancedView f6538b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ a f6539c;

        public AnonymousClass1(ATNativeAdvancedView aTNativeAdvancedView, a aVar) {
            aTNativeAdvancedView = aTNativeAdvancedView;
            aVar = aVar;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!c1781c.m8908s()) {
                C1420a.m5400a(c1781c.m8818Z());
                aTNativeAdvancedView.setH5Ready(true);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            aTNativeAdvancedView.setH5Ready(false);
            a aVar = aVar;
            if (aVar != null) {
                aVar.mo5513b();
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            aTNativeAdvancedView.setH5Ready(false);
            a aVar = aVar;
            if (aVar != null) {
                aVar.mo5513b();
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            if (i == 1) {
                C1420a.m5400a(c1781c.m8818Z());
                aTNativeAdvancedView.setH5Ready(true);
            } else {
                aTNativeAdvancedView.setH5Ready(false);
            }
            a aVar = aVar;
            if (aVar != null) {
                aVar.mo5512a();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.c$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6541b;

        public AnonymousClass2(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            aTNativeAdvancedWebview.loadUrl(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5512a();

        /* JADX INFO: renamed from: b */
        void mo5513b();
    }

    /* JADX INFO: renamed from: a */
    private static C1781c m5506a(C1781c c1781c) {
        if (!TextUtils.isEmpty(c1781c.m8862c()) || (!TextUtils.isEmpty(c1781c.m8866d()) && c1781c.m8866d().contains("<MBTPLMARK>"))) {
            c1781c.m8824a(true);
            c1781c.m8861b(false);
        } else {
            c1781c.m8824a(false);
            c1781c.m8861b(true);
        }
        return c1781c;
    }

    /* JADX INFO: renamed from: a */
    private static String m5507a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return ImageSource.FILE_SCHEME + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5508a(ATNativeAdvancedView aTNativeAdvancedView, String str, C1781c c1781c, String str2, String str3, int i) {
        m5509a(aTNativeAdvancedView, str, c1781c, str2, str3, i, null);
    }

    /* JADX INFO: renamed from: a */
    private static void m5509a(ATNativeAdvancedView aTNativeAdvancedView, String str, C1781c c1781c, String str2, String str3, int i, a aVar) {
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(i);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        ATNativeAdvancedWebview advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview();
        System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new C1442b() { // from class: com.anythink.expressad.advanced.c.c.1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ATNativeAdvancedView f6538b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ a f6539c;

            public AnonymousClass1(ATNativeAdvancedView aTNativeAdvancedView2, a aVar2) {
                aTNativeAdvancedView = aTNativeAdvancedView2;
                aVar = aVar2;
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onPageFinished(WebView webView, String str4) {
                super.onPageFinished(webView, str4);
                if (!c1781c.m8908s()) {
                    C1420a.m5400a(c1781c.m8818Z());
                    aTNativeAdvancedView.setH5Ready(true);
                }
                NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedError(WebView webView, int i2, String str4, String str22) {
                super.onReceivedError(webView, i2, str4, str22);
                aTNativeAdvancedView.setH5Ready(false);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo5513b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                aTNativeAdvancedView.setH5Ready(false);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo5513b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
            public final void readyState(WebView webView, int i2) {
                super.readyState(webView, i2);
                if (i2 == 1) {
                    C1420a.m5400a(c1781c.m8818Z());
                    aTNativeAdvancedView.setH5Ready(true);
                } else {
                    aTNativeAdvancedView.setH5Ready(false);
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo5512a();
                }
            }
        });
        if (advancedNativeWebview.isDestroyed()) {
            aTNativeAdvancedView2.setH5Ready(false);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.advanced.c.c.2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f6541b;

                public AnonymousClass2(String str4) {
                    str = str4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aTNativeAdvancedWebview.loadUrl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5510a(ATNativeAdvancedView aTNativeAdvancedView, C1781c c1781c) {
        if (aTNativeAdvancedView == null) {
            return false;
        }
        boolean zIsVideoReady = TextUtils.isEmpty(c1781c.m8811S()) ? true : aTNativeAdvancedView.isVideoReady();
        if (zIsVideoReady && !TextUtils.isEmpty(c1781c.m8862c())) {
            zIsVideoReady = C1420a.m5401b(c1781c.m8818Z());
            StringBuilder sb = new StringBuilder("======isReady getAdZip:");
            sb.append(zIsVideoReady);
            sb.append("---requestId:");
            sb.append(c1781c.m8818Z());
        }
        if (zIsVideoReady && TextUtils.isEmpty(c1781c.m8862c()) && !TextUtils.isEmpty(c1781c.m8866d())) {
            zIsVideoReady = C1420a.m5401b(c1781c.m8818Z());
        }
        boolean z = (TextUtils.isEmpty(c1781c.m8862c()) && TextUtils.isEmpty(c1781c.m8866d())) ? false : zIsVideoReady;
        return (!z || TextUtils.isEmpty(c1781c.m8801I())) ? z : aTNativeAdvancedView.isEndCardReady();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e0  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5511a(com.anythink.expressad.advanced.view.ATNativeAdvancedView r12, com.anythink.expressad.foundation.p116d.C1781c r13, java.lang.String r14, java.lang.String r15, int r16, com.anythink.expressad.advanced.p078c.C1428c.a r17) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.advanced.p078c.C1428c.m5511a(com.anythink.expressad.advanced.view.ATNativeAdvancedView, com.anythink.expressad.foundation.d.c, java.lang.String, java.lang.String, int, com.anythink.expressad.advanced.c.c$a):boolean");
    }
}
