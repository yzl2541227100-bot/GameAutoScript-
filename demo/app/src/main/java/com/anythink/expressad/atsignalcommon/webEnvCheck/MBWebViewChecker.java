package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class MBWebViewChecker {

    /* JADX INFO: renamed from: a */
    private static volatile Boolean f6734a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f6735b;

    /* JADX INFO: renamed from: c */
    private static Boolean f6736c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m5671b(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
        } catch (Exception unused) {
            webView = null;
        }
        return webView != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isWebViewAvailable(final android.content.Context r4) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6736c = r0
            r1 = 1
            if (r0 == 0) goto L55
            boolean r2 = r0.booleanValue()
            if (r2 != 0) goto Le
            goto L55
        Le:
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r2 != r3) goto L36
            java.lang.Boolean r1 = com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a
            if (r1 != 0) goto L29
            boolean r4 = m5671b(r4)     // Catch: java.lang.Exception -> L27
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L27
            com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a = r4     // Catch: java.lang.Exception -> L27
            goto L29
        L27:
            com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a = r0
        L29:
            java.lang.Boolean r4 = com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a
            if (r4 != 0) goto L2f
            com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a = r0
        L2f:
            java.lang.Boolean r4 = com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a
            boolean r4 = r4.booleanValue()
            return r4
        L36:
            java.lang.Boolean r0 = com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a
            if (r0 != 0) goto L51
            android.os.Handler r0 = com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6735b
            if (r0 != 0) goto L51
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6735b = r0
            com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker$1 r2 = new com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker$1
            r2.<init>()
            r0.post(r2)
        L51:
            java.lang.Boolean r4 = com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.f6734a
            if (r4 != 0) goto L2f
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.isWebViewAvailable(android.content.Context):boolean");
    }
}
