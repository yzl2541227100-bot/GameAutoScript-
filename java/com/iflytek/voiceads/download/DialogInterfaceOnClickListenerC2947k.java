package com.iflytek.voiceads.download;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.k */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC2947k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2937d f16333a;

    DialogInterfaceOnClickListenerC2947k(C2937d c2937d) {
        this.f16333a = c2937d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f16333a.f16285f != null) {
            this.f16333a.f16285f.onCancel();
            this.f16333a.f16285f = null;
        }
    }
}
