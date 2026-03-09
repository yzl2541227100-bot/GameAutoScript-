package com.iflytek.voiceads.request;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2976c extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IFLYBrowser f16440a;

    C2976c(IFLYBrowser iFLYBrowser) {
        this.f16440a = iFLYBrowser;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.grant(permissionRequest.getResources());
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        if (i != 100) {
            this.f16440a.f16426f.setVisibility(0);
            this.f16440a.f16426f.setProgress(i);
        } else if (this.f16440a.f16426f != null) {
            this.f16440a.f16426f.setVisibility(8);
        }
    }
}
