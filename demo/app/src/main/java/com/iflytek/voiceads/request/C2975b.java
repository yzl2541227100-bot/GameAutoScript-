package com.iflytek.voiceads.request;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.iflytek.voiceads.bridge.InterfaceC2915o;
import com.iflytek.voiceads.param.C2968c;
import com.iflytek.voiceads.utils.C2984b;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2975b implements InterfaceC2915o {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IFLYBrowser f16439a;

    C2975b(IFLYBrowser iFLYBrowser) {
        this.f16439a = iFLYBrowser;
    }

    @Override // com.iflytek.voiceads.bridge.InterfaceC2915o
    /* JADX INFO: renamed from: a */
    public void mo13275a() {
    }

    @Override // com.iflytek.voiceads.bridge.InterfaceC2915o
    /* JADX INFO: renamed from: a */
    public void mo13276a(int i, String str) {
    }

    @Override // com.iflytek.voiceads.bridge.InterfaceC2915o
    /* JADX INFO: renamed from: a */
    public boolean mo13277a(WebView webView, String str) {
        C2989g.m13555a("IFLY_AD_SDK", "IFLYBrowser shouldOverrideUrlLoading:" + str);
        if (!C2984b.m13536a(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!C2984b.m13533a(this.f16439a.getApplicationContext(), intent)) {
            C2992j.m13571b(C2968c.f16415b + "type=H5NotInstall&sid=" + this.f16439a.f16428h);
            return true;
        }
        try {
            intent.addFlags(32768);
            intent.addFlags(268435456);
            this.f16439a.startActivity(intent);
            C2992j.m13571b(C2968c.f16415b + "type=H5DeepLink&sid=" + this.f16439a.f16428h);
            return true;
        } catch (Exception e) {
            C2992j.m13571b(C2968c.f16415b + "type=H5DeepFail&sid=" + this.f16439a.f16428h);
            C2989g.m13557b("IFLY_AD_SDK", e.getMessage());
            return true;
        }
    }

    @Override // com.iflytek.voiceads.bridge.InterfaceC2915o
    /* JADX INFO: renamed from: b */
    public void mo13278b() {
    }
}
