package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.o */
/* JADX INFO: loaded from: classes.dex */
public class C1474o extends WebChromeClient {

    /* JADX INFO: renamed from: b */
    private static final String f6799b = "H5_ENTRY";

    /* JADX INFO: renamed from: a */
    public WindVaneWebView f6800a;

    /* JADX INFO: renamed from: c */
    private InterfaceC1464e f6801c;

    public C1474o(WindVaneWebView windVaneWebView) {
        this.f6800a = windVaneWebView;
    }

    /* JADX INFO: renamed from: a */
    public final void m5714a(InterfaceC1464e interfaceC1464e) {
        this.f6801c = interfaceC1464e;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        InterfaceC1463d signalCommunication = this.f6800a.getSignalCommunication();
        if (signalCommunication != null && consoleMessage != null) {
            String strMessage = consoleMessage.message();
            if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith("mv://")) {
                return false;
            }
            StringBuilder sb = new StringBuilder("onConsoleMessage: message.length() = ");
            sb.append(strMessage.length());
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(strMessage);
            if (strMessage.contains("wv_hybrid:") && signalCommunication.mo5679a("wv_hybrid:")) {
                signalCommunication.mo5682c(strMessage.substring(0, strMessage.lastIndexOf(C4196o4.OooO00o.OooO0Oo) + 1));
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        new StringBuilder().append(str2);
        InterfaceC1463d signalCommunication = this.f6800a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.mo5679a(str3)) {
            return false;
        }
        signalCommunication.mo5682c(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InterfaceC1464e interfaceC1464e = this.f6801c;
        if (interfaceC1464e != null) {
            interfaceC1464e.onProgressChanged(webView, i);
        }
    }
}
