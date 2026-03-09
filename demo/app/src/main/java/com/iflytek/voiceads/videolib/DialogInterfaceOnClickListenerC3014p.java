package com.iflytek.voiceads.videolib;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.p */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC3014p implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JZVPStandard f16572a;

    DialogInterfaceOnClickListenerC3014p(JZVPStandard jZVPStandard) {
        this.f16572a = jZVPStandard;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f16572a.m13621k();
    }
}
