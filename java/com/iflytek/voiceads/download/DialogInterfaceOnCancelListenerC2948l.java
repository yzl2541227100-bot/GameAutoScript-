package com.iflytek.voiceads.download;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.l */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnCancelListenerC2948l implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2937d f16334a;

    DialogInterfaceOnCancelListenerC2948l(C2937d c2937d) {
        this.f16334a = c2937d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
    }
}
