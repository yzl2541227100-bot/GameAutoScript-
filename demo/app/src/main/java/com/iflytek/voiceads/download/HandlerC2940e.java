package com.iflytek.voiceads.download;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.e */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class HandlerC2940e extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2937d f16321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC2940e(C2937d c2937d, Looper looper) {
        super(looper);
        this.f16321a = c2937d;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 0) {
            try {
                this.f16321a.m13358c();
                C2989g.m13555a("IFLY_AD_SDK", "移除广播 end");
            } catch (Exception e) {
                C2989g.m13557b("IFLY_AD_SDK", "移除广播 end");
            }
        }
    }
}
