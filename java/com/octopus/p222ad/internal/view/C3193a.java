package com.octopus.p222ad.internal.view;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.utilities.HaoboLog;

/* JADX INFO: renamed from: com.octopus.ad.internal.view.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3193a extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        HaoboLog.m14613v(HaoboLog.jsLogTag, HaoboLog.getString(C3063R.string.console_message, consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId()));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        HaoboLog.m14613v(HaoboLog.jsLogTag, HaoboLog.getString(C3063R.string.js_alert, str2, str));
        jsResult.confirm();
        return true;
    }
}
