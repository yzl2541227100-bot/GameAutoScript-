package com.iflytek.voiceads.download;

import android.content.DialogInterface;
import com.iflytek.voiceads.download.C2937d;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.j */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class DialogInterfaceOnClickListenerC2946j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2937d.a f16331a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C2937d f16332b;

    DialogInterfaceOnClickListenerC2946j(C2937d c2937d, C2937d.a aVar) {
        this.f16332b = c2937d;
        this.f16331a = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f16331a.mo13369a();
        if (this.f16332b.f16285f != null) {
            this.f16332b.f16285f.onConfirm();
            this.f16332b.f16285f = null;
        }
    }
}
