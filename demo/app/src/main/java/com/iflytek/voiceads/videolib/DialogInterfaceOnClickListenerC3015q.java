package com.iflytek.voiceads.videolib;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.q */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC3015q implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JZVPStandard f16573a;

    DialogInterfaceOnClickListenerC3015q(JZVPStandard jZVPStandard) {
        this.f16573a = jZVPStandard;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
