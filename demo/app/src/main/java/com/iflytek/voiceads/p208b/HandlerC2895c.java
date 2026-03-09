package com.iflytek.voiceads.p208b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.iflytek.voiceads.b.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class HandlerC2895c extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2893a f16122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC2895c(C2893a c2893a, Looper looper) {
        super(looper);
        this.f16122a = c2893a;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f16122a.f16119e.mo13233a((Bitmap) message.obj);
                break;
        }
    }
}
