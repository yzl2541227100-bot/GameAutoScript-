package com.iflytek.voiceads.bridge;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.j */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC2910j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsResult f16164a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C2908h f16165b;

    DialogInterfaceOnClickListenerC2910j(C2908h c2908h, JsResult jsResult) {
        this.f16165b = c2908h;
        this.f16164a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f16165b.f16161a.f16135i) {
            if (i == -1) {
                this.f16164a.confirm();
            } else {
                this.f16164a.cancel();
            }
        }
    }
}
