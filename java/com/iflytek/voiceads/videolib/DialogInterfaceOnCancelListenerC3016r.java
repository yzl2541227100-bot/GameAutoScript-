package com.iflytek.voiceads.videolib;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.r */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnCancelListenerC3016r implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JZVPStandard f16574a;

    DialogInterfaceOnCancelListenerC3016r(JZVPStandard jZVPStandard) {
        this.f16574a = jZVPStandard;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
    }
}
