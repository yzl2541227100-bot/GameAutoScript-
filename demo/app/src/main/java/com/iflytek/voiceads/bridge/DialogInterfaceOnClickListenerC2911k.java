package com.iflytek.voiceads.bridge;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.k */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC2911k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsPromptResult f16166a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ EditText f16167b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C2908h f16168c;

    DialogInterfaceOnClickListenerC2911k(C2908h c2908h, JsPromptResult jsPromptResult, EditText editText) {
        this.f16168c = c2908h;
        this.f16166a = jsPromptResult;
        this.f16167b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f16168c.f16161a.f16135i) {
            if (i == -1) {
                this.f16166a.confirm(this.f16167b.getText().toString());
            } else {
                this.f16166a.cancel();
            }
        }
    }
}
