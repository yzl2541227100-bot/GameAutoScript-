package com.iflytek.voiceads.request;

import com.iflytek.voiceads.listener.DialogListener;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2977d implements DialogListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IFLYBrowser f16441a;

    C2977d(IFLYBrowser iFLYBrowser) {
        this.f16441a = iFLYBrowser;
    }

    public void onCancel() {
        this.f16441a.finish();
    }

    public void onConfirm() {
        this.f16441a.finish();
    }
}
