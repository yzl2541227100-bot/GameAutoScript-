package com.iflytek.voiceads.bridge;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.i */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC2909i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsResult f16162a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C2908h f16163b;

    DialogInterfaceOnClickListenerC2909i(C2908h c2908h, JsResult jsResult) {
        this.f16163b = c2908h;
        this.f16162a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f16163b.f16161a.f16135i) {
            this.f16162a.confirm();
        }
    }
}
