package com.iflytek.voiceads.download.p212b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.download.p215c.InterfaceC2934a;
import com.iflytek.voiceads.download.p216d.C2938a;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.b.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2929b implements InterfaceC2927a {

    /* JADX INFO: renamed from: a */
    private Handler f16255a = new HandlerC2931c(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private InterfaceC2934a f16256b;

    public C2929b(InterfaceC2934a interfaceC2934a) {
        this.f16256b = interfaceC2934a;
    }

    @Override // com.iflytek.voiceads.download.p212b.InterfaceC2927a
    /* JADX INFO: renamed from: a */
    public void mo13315a(C2938a c2938a) {
        if (c2938a == null) {
            return;
        }
        Message messageObtainMessage = this.f16255a.obtainMessage(c2938a.m13387h());
        messageObtainMessage.obj = c2938a;
        messageObtainMessage.sendToTarget();
        if (c2938a.m13386g() == 4) {
            this.f16256b.mo13330a(c2938a);
        }
    }
}
