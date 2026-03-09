package com.iflytek.voiceads.download.p212b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.download.p211a.InterfaceC2924a;
import com.iflytek.voiceads.download.p216d.C2938a;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.b.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class HandlerC2931c extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2929b f16263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC2931c(C2929b c2929b, Looper looper) {
        super(looper);
        this.f16263a = c2929b;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        C2938a c2938a = (C2938a) message.obj;
        if (c2938a == null || c2938a.m13385f() == null) {
            return;
        }
        InterfaceC2924a interfaceC2924aM13385f = c2938a.m13385f();
        switch (c2938a.m13386g()) {
            case 1:
                interfaceC2924aM13385f.mo13311a(c2938a.m13387h());
                break;
            case 2:
                interfaceC2924aM13385f.mo13312a(c2938a.m13384e(), c2938a.m13383d(), c2938a.m13387h());
                break;
            case 4:
                interfaceC2924aM13385f.mo13314b(c2938a.m13387h());
                break;
            case 5:
                interfaceC2924aM13385f.mo13313a(c2938a.m13370a(), c2938a.m13387h());
                break;
        }
    }
}
